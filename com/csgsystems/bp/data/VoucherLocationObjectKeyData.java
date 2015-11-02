/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectKeyData.java
 * Definition File: Catalog/VoucherLocation.xml
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

/** VoucherLocationObject's Key Data class. */
public class VoucherLocationObjectKeyData  extends BaseObjectData
{
  /** VOUCHER_LOCATION.location_code field */
  public    BigInteger LocationCode  = null;
  protected boolean _LocationCodeSet = false;
  private String _objName = "VoucherLocationObjectKeyData";
  /** default constructor */
  public VoucherLocationObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public VoucherLocationObjectKeyData (VoucherLocationObjectKeyData other)
  {
    if (other == null) return;
    this.LocationCode = other.LocationCode;
    this._LocationCodeSet = other._LocationCodeSet;
  }
  /** set the fields value: LocationCode (VOUCHER_LOCATION.location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LocationCode") 
  public void setLocationCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LocationCode", "setLocationCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LocationCode", "setLocationCode");
    }
    this.LocationCode = value;
    this._LocationCodeSet = true;
  }

  /** Retrieves the LocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCode field
   */
   public String getLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LocationCode field from a formatted string
   *
   * @param _value the LocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LocationCode field
   */
   public void setLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLocationCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFromFormattedString");
   }

  /** get the value of the field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return BigInteger the value
   */
  public BigInteger getLocationCode () {
    return this.LocationCode;
  }
  /** Change the field to not being actively set: LocationCode (VOUCHER_LOCATION.location_code)
   */
  public void unsetLocationCode () {
    this._LocationCodeSet = false;
  }
  /** See if the field is actively set: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLocationCode () {
    return this._LocationCodeSet;
  }
  public String toString() {
    return VoucherLocationObjectKeyHelper.toMap(this, null).toString();
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
    
  /** VOUCHER_LOCATION.location_code field */
    if(!nonNullOnly || (LocationCode != null))  _LocationCodeSet = flag;
  }
}
