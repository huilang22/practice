/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectKeyData.java
 * Definition File: Admin/SecurityResource.xml
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

/** SecurityResourceObject's Key Data class. */
public class SecurityResourceObjectKeyData  extends BaseObjectData
{
  /** SEC_FX_RESOURCE.res_id field */
  public    BigInteger ResId  = null;
  protected boolean _ResIdSet = false;
  private String _objName = "SecurityResourceObjectKeyData";
  /** default constructor */
  public SecurityResourceObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SecurityResourceObjectKeyData (SecurityResourceObjectKeyData other)
  {
    if (other == null) return;
    this.ResId = other.ResId;
    this._ResIdSet = other._ResIdSet;
  }
  /** set the fields value: ResId (SEC_FX_RESOURCE.res_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResId") 
  public void setResId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ResId", "setResId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResId", "setResId");
    }
    this.ResId = value;
    this._ResIdSet = true;
  }

  /** Retrieves the ResId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResId field
   */
   public String getResIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getResId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResId field from a formatted string
   *
   * @param _value the ResId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResId field
   */
   public void setResIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResIdFromFormattedString");
   }

  /** get the value of the field: ResId (SEC_FX_RESOURCE.res_id)
   * @return BigInteger the value
   */
  public BigInteger getResId () {
    return this.ResId;
  }
  /** Change the field to not being actively set: ResId (SEC_FX_RESOURCE.res_id)
   */
  public void unsetResId () {
    this._ResIdSet = false;
  }
  /** See if the field is actively set: ResId (SEC_FX_RESOURCE.res_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetResId () {
    return this._ResIdSet;
  }
  public String toString() {
    return SecurityResourceObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SEC_FX_RESOURCE.res_id field */
    if(!nonNullOnly || (ResId != null))  _ResIdSet = flag;
  }
}
