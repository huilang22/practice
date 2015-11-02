/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusInfoObjectKeyData.java
 * Definition File: Catalog/VoucherStatusInfo.xml
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

/** VoucherStatusInfoObject's Key Data class. */
public class VoucherStatusInfoObjectKeyData  extends BaseObjectData
{
  /** VOUCHER_STATUS_INFO.voucher_id field */
  public    String VoucherId  = null;
  protected boolean _VoucherIdSet = false;
  private String _objName = "VoucherStatusInfoObjectKeyData";
  /** default constructor */
  public VoucherStatusInfoObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public VoucherStatusInfoObjectKeyData (VoucherStatusInfoObjectKeyData other)
  {
    if (other == null) return;
    this.VoucherId = other.VoucherId;
    this._VoucherIdSet = other._VoucherIdSet;
  }
  /** set the fields value: VoucherId (VOUCHER_STATUS_INFO.voucher_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VoucherId") 
  public void setVoucherId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherId", "setVoucherId");
    }
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherId", "setVoucherId");
    }
    this.VoucherId = value;
    this._VoucherIdSet = true;
  }

  /** Retrieves the VoucherId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherId field
   */
   public String getVoucherIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherIdAsFormattedString");
       return fmtMgr.formatString(this.getVoucherId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherId field from a formatted string
   *
   * @param _value the VoucherId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherId field
   */
   public void setVoucherIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherIdFromFormattedString");
   }

  /** get the value of the field: VoucherId (VOUCHER_STATUS_INFO.voucher_id)
   * @return String the value
   */
  public String getVoucherId () {
    return this.VoucherId;
  }
  /** Change the field to not being actively set: VoucherId (VOUCHER_STATUS_INFO.voucher_id)
   */
  public void unsetVoucherId () {
    this._VoucherIdSet = false;
  }
  /** See if the field is actively set: VoucherId (VOUCHER_STATUS_INFO.voucher_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherId () {
    return this._VoucherIdSet;
  }
  public String toString() {
    return VoucherStatusInfoObjectKeyHelper.toMap(this, null).toString();
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
    
  /** VOUCHER_STATUS_INFO.voucher_id field */
    if(!nonNullOnly || (VoucherId != null))  _VoucherIdSet = flag;
  }
}
