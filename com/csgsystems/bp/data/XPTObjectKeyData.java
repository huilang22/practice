/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPTObjectKeyData.java
 * Definition File: Admin/ExtendedDataParamType.xml
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

/** XPTObject's Key Data class. */
public class XPTObjectKeyData  extends BaseObjectData
{
  /** PARAM_DEF.param_id field */
  public    Integer ParamId  = null;
  protected boolean _ParamIdSet = false;
  private String _objName = "XPTObjectKeyData";
  /** default constructor */
  public XPTObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public XPTObjectKeyData (XPTObjectKeyData other)
  {
    if (other == null) return;
    this.ParamId = other.ParamId;
    this._ParamIdSet = other._ParamIdSet;
  }
  /** set the fields value: ParamId (PARAM_DEF.param_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamId") 
  public void setParamId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamId", "setParamId");
    }
    this.ParamId = value;
    this._ParamIdSet = true;
  }

  /** Retrieves the ParamId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamId field
   */
   public String getParamIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParamId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamId field from a formatted string
   *
   * @param _value the ParamId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamId field
   */
   public void setParamIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamIdFromFormattedString");
   }

  /** get the value of the field: ParamId (PARAM_DEF.param_id)
   * @return Integer the value
   */
  public Integer getParamId () {
    return this.ParamId;
  }
  /** Change the field to not being actively set: ParamId (PARAM_DEF.param_id)
   */
  public void unsetParamId () {
    this._ParamIdSet = false;
  }
  /** See if the field is actively set: ParamId (PARAM_DEF.param_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamId () {
    return this._ParamIdSet;
  }
  public String toString() {
    return XPTObjectKeyHelper.toMap(this, null).toString();
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
    
  /** PARAM_DEF.param_id field */
    if(!nonNullOnly || (ParamId != null))  _ParamIdSet = flag;
  }
}
