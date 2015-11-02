/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectKeyData.java
 * Definition File: Catalog/VoucherStatusMovement.xml
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

/** VoucherStatusMovementObject's Key Data class. */
public class VoucherStatusMovementObjectKeyData  extends BaseObjectData
{
  /** VOUCHER_STATUS_MOVEMENT.state_from field */
  public    BigInteger StateFrom  = null;
  protected boolean _StateFromSet = false;
  private String _objName = "VoucherStatusMovementObjectKeyData";
  /** default constructor */
  public VoucherStatusMovementObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public VoucherStatusMovementObjectKeyData (VoucherStatusMovementObjectKeyData other)
  {
    if (other == null) return;
    this.StateFrom = other.StateFrom;
    this._StateFromSet = other._StateFromSet;
  }
  /** set the fields value: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateFrom") 
  public void setStateFrom (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateFrom", "setStateFrom");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateFrom", "setStateFrom");
    }
    this.StateFrom = value;
    this._StateFromSet = true;
  }

  /** Retrieves the StateFrom field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateFrom field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateFrom field
   */
   public String getStateFromAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateFromAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateFrom(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateFrom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateFromAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateFrom field from a formatted string
   *
   * @param _value the StateFrom field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateFrom field
   */
   public void setStateFromFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateFrom(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateFrom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFromFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFromFromFormattedString");
   }

  /** get the value of the field: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return BigInteger the value
   */
  public BigInteger getStateFrom () {
    return this.StateFrom;
  }
  /** Change the field to not being actively set: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   */
  public void unsetStateFrom () {
    this._StateFromSet = false;
  }
  /** See if the field is actively set: StateFrom (VOUCHER_STATUS_MOVEMENT.state_from)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateFrom () {
    return this._StateFromSet;
  }
  public String toString() {
    return VoucherStatusMovementObjectKeyHelper.toMap(this, null).toString();
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
    
  /** VOUCHER_STATUS_MOVEMENT.state_from field */
    if(!nonNullOnly || (StateFrom != null))  _StateFromSet = flag;
  }
}
