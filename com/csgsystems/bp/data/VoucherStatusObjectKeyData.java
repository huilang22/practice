/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusObjectKeyData.java
 * Definition File: Catalog/VoucherStatus.xml
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

/** VoucherStatusObject's Key Data class. */
public class VoucherStatusObjectKeyData  extends BaseObjectData
{
  /** VOUCHER_STATUS.status field */
  public    BigInteger Status  = null;
  protected boolean _StatusSet = false;
  private String _objName = "VoucherStatusObjectKeyData";
  /** default constructor */
  public VoucherStatusObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public VoucherStatusObjectKeyData (VoucherStatusObjectKeyData other)
  {
    if (other == null) return;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
  }
  /** set the fields value: Status (VOUCHER_STATUS.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (VOUCHER_STATUS.status)
   * @return BigInteger the value
   */
  public BigInteger getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (VOUCHER_STATUS.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (VOUCHER_STATUS.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  public String toString() {
    return VoucherStatusObjectKeyHelper.toMap(this, null).toString();
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
    
  /** VOUCHER_STATUS.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  }
}
