/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefinancePlanObjectKeyData.java
 * Definition File: Customer/RefinancePlan.xml
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

/** RefinancePlanObject's Key Data class. */
public class RefinancePlanObjectKeyData  extends BaseObjectData
{
  /** REFINANCE_PLAN.refinance_plan_id field */
  public    Integer RefinancePlanId  = null;
  protected boolean _RefinancePlanIdSet = false;
  /** REFINANCE_PLAN.refinance_plan_id_serv field */
  public    Integer RefinancePlanIdServ  = null;
  protected boolean _RefinancePlanIdServSet = false;
  /** REFINANCE_PLAN.adj_tracking_id field */
  public    Integer AdjTrackingId  = null;
  protected boolean _AdjTrackingIdSet = false;
  /** REFINANCE_PLAN.adj_tracking_id_serv field */
  public    Integer AdjTrackingIdServ  = null;
  protected boolean _AdjTrackingIdServSet = false;
  private String _objName = "RefinancePlanObjectKeyData";
  /** default constructor */
  public RefinancePlanObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public RefinancePlanObjectKeyData (RefinancePlanObjectKeyData other)
  {
    if (other == null) return;
    this.RefinancePlanId = other.RefinancePlanId;
    this._RefinancePlanIdSet = other._RefinancePlanIdSet;
    this.RefinancePlanIdServ = other.RefinancePlanIdServ;
    this._RefinancePlanIdServSet = other._RefinancePlanIdServSet;
    this.AdjTrackingId = other.AdjTrackingId;
    this._AdjTrackingIdSet = other._AdjTrackingIdSet;
    this.AdjTrackingIdServ = other.AdjTrackingIdServ;
    this._AdjTrackingIdServSet = other._AdjTrackingIdServSet;
  }
  /** set the fields value: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefinancePlanId") 
  public void setRefinancePlanId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RefinancePlanId", "setRefinancePlanId");
    }
    this.RefinancePlanId = value;
    this._RefinancePlanIdSet = true;
  }

  /** Retrieves the RefinancePlanId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefinancePlanId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefinancePlanId field
   */
   public String getRefinancePlanIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanIdAsFormattedString");
       return fmtMgr.formatNumber(this.getRefinancePlanId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefinancePlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefinancePlanIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefinancePlanId field from a formatted string
   *
   * @param _value the RefinancePlanId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefinancePlanId field
   */
   public void setRefinancePlanIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefinancePlanId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefinancePlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefinancePlanIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefinancePlanIdFromFormattedString");
   }

  /** get the value of the field: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return Integer the value
   */
  public Integer getRefinancePlanId () {
    return this.RefinancePlanId;
  }
  /** Change the field to not being actively set: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   */
  public void unsetRefinancePlanId () {
    this._RefinancePlanIdSet = false;
  }
  /** See if the field is actively set: RefinancePlanId (REFINANCE_PLAN.refinance_plan_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefinancePlanId () {
    return this._RefinancePlanIdSet;
  }
  /** set the fields value: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefinancePlanIdServ") 
  public void setRefinancePlanIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RefinancePlanIdServ", "setRefinancePlanIdServ");
    }
    this.RefinancePlanIdServ = value;
    this._RefinancePlanIdServSet = true;
  }

  /** Retrieves the RefinancePlanIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefinancePlanIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefinancePlanIdServ field
   */
   public String getRefinancePlanIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefinancePlanIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getRefinancePlanIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefinancePlanIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefinancePlanIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefinancePlanIdServ field from a formatted string
   *
   * @param _value the RefinancePlanIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefinancePlanIdServ field
   */
   public void setRefinancePlanIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefinancePlanIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefinancePlanIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefinancePlanIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefinancePlanIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefinancePlanIdServFromFormattedString");
   }

  /** get the value of the field: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return Integer the value
   */
  public Integer getRefinancePlanIdServ () {
    return this.RefinancePlanIdServ;
  }
  /** Change the field to not being actively set: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   */
  public void unsetRefinancePlanIdServ () {
    this._RefinancePlanIdServSet = false;
  }
  /** See if the field is actively set: RefinancePlanIdServ (REFINANCE_PLAN.refinance_plan_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefinancePlanIdServ () {
    return this._RefinancePlanIdServSet;
  }
  /** set the fields value: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AdjTrackingId") 
  public void setAdjTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjTrackingId", "setAdjTrackingId");
    }
    this.AdjTrackingId = value;
    this._AdjTrackingIdSet = true;
  }

  /** Retrieves the AdjTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTrackingId field
   */
   public String getAdjTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjTrackingId field from a formatted string
   *
   * @param _value the AdjTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjTrackingId field
   */
   public void setAdjTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTrackingIdFromFormattedString");
   }

  /** get the value of the field: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return Integer the value
   */
  public Integer getAdjTrackingId () {
    return this.AdjTrackingId;
  }
  /** Change the field to not being actively set: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   */
  public void unsetAdjTrackingId () {
    this._AdjTrackingIdSet = false;
  }
  /** See if the field is actively set: AdjTrackingId (REFINANCE_PLAN.adj_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjTrackingId () {
    return this._AdjTrackingIdSet;
  }
  /** set the fields value: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AdjTrackingIdServ") 
  public void setAdjTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjTrackingIdServ", "setAdjTrackingIdServ");
    }
    this.AdjTrackingIdServ = value;
    this._AdjTrackingIdServSet = true;
  }

  /** Retrieves the AdjTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTrackingIdServ field
   */
   public String getAdjTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjTrackingIdServ field from a formatted string
   *
   * @param _value the AdjTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjTrackingIdServ field
   */
   public void setAdjTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTrackingIdServFromFormattedString");
   }

  /** get the value of the field: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getAdjTrackingIdServ () {
    return this.AdjTrackingIdServ;
  }
  /** Change the field to not being actively set: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   */
  public void unsetAdjTrackingIdServ () {
    this._AdjTrackingIdServSet = false;
  }
  /** See if the field is actively set: AdjTrackingIdServ (REFINANCE_PLAN.adj_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjTrackingIdServ () {
    return this._AdjTrackingIdServSet;
  }
  public String toString() {
    return RefinancePlanObjectKeyHelper.toMap(this, null).toString();
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
    
  /** REFINANCE_PLAN.refinance_plan_id field */
    if(!nonNullOnly || (RefinancePlanId != null))  _RefinancePlanIdSet = flag;
  /** REFINANCE_PLAN.refinance_plan_id_serv field */
    if(!nonNullOnly || (RefinancePlanIdServ != null))  _RefinancePlanIdServSet = flag;
  /** REFINANCE_PLAN.adj_tracking_id field */
    if(!nonNullOnly || (AdjTrackingId != null))  _AdjTrackingIdSet = flag;
  /** REFINANCE_PLAN.adj_tracking_id_serv field */
    if(!nonNullOnly || (AdjTrackingIdServ != null))  _AdjTrackingIdServSet = flag;
  }
}
