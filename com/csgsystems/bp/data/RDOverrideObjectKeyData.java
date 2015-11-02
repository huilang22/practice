/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RDOverrideObjectKeyData.java
 * Definition File: Customer/OverrideDiscountRate.xml
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

/** RDOverrideObject's Key Data class. */
public class RDOverrideObjectKeyData  extends BaseObjectData
{
  /** RATE_DISCOUNT_OVERRIDES.override_tracking_id field */
  public    Integer OverrideTrackingId  = null;
  protected boolean _OverrideTrackingIdSet = false;
  /** RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv field */
  public    Integer OverrideTrackingIdServ  = null;
  protected boolean _OverrideTrackingIdServSet = false;
  private String _objName = "RDOverrideObjectKeyData";
  /** default constructor */
  public RDOverrideObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public RDOverrideObjectKeyData (RDOverrideObjectKeyData other)
  {
    if (other == null) return;
    this.OverrideTrackingId = other.OverrideTrackingId;
    this._OverrideTrackingIdSet = other._OverrideTrackingIdSet;
    this.OverrideTrackingIdServ = other.OverrideTrackingIdServ;
    this._OverrideTrackingIdServSet = other._OverrideTrackingIdServSet;
  }
  /** set the fields value: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideTrackingId") 
  public void setOverrideTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideTrackingId", "setOverrideTrackingId");
    }
    this.OverrideTrackingId = value;
    this._OverrideTrackingIdSet = true;
  }

  /** Retrieves the OverrideTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingId field
   */
   public String getOverrideTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideTrackingId field from a formatted string
   *
   * @param _value the OverrideTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideTrackingId field
   */
   public void setOverrideTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdFromFormattedString");
   }

  /** get the value of the field: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return Integer the value
   */
  public Integer getOverrideTrackingId () {
    return this.OverrideTrackingId;
  }
  /** Change the field to not being actively set: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   */
  public void unsetOverrideTrackingId () {
    this._OverrideTrackingIdSet = false;
  }
  /** See if the field is actively set: OverrideTrackingId (RATE_DISCOUNT_OVERRIDES.override_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideTrackingId () {
    return this._OverrideTrackingIdSet;
  }
  /** set the fields value: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideTrackingIdServ") 
  public void setOverrideTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideTrackingIdServ", "setOverrideTrackingIdServ");
    }
    this.OverrideTrackingIdServ = value;
    this._OverrideTrackingIdServSet = true;
  }

  /** Retrieves the OverrideTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideTrackingIdServ field
   */
   public String getOverrideTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOverrideTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideTrackingIdServ field from a formatted string
   *
   * @param _value the OverrideTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideTrackingIdServ field
   */
   public void setOverrideTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideTrackingIdServFromFormattedString");
   }

  /** get the value of the field: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOverrideTrackingIdServ () {
    return this.OverrideTrackingIdServ;
  }
  /** Change the field to not being actively set: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   */
  public void unsetOverrideTrackingIdServ () {
    this._OverrideTrackingIdServSet = false;
  }
  /** See if the field is actively set: OverrideTrackingIdServ (RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideTrackingIdServ () {
    return this._OverrideTrackingIdServSet;
  }
  public String toString() {
    return RDOverrideObjectKeyHelper.toMap(this, null).toString();
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
    
  /** RATE_DISCOUNT_OVERRIDES.override_tracking_id field */
    if(!nonNullOnly || (OverrideTrackingId != null))  _OverrideTrackingIdSet = flag;
  /** RATE_DISCOUNT_OVERRIDES.override_tracking_id_serv field */
    if(!nonNullOnly || (OverrideTrackingIdServ != null))  _OverrideTrackingIdServSet = flag;
  }
}
