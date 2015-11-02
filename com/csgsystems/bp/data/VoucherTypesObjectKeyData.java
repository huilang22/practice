/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectKeyData.java
 * Definition File: Catalog/VoucherTypes.xml
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

/** VoucherTypesObject's Key Data class. */
public class VoucherTypesObjectKeyData  extends BaseObjectData
{
  /** VOUCHER_TYPES.voucher_type_id field */
  public    BigInteger VoucherTypeId  = null;
  protected boolean _VoucherTypeIdSet = false;
  private String _objName = "VoucherTypesObjectKeyData";
  /** default constructor */
  public VoucherTypesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public VoucherTypesObjectKeyData (VoucherTypesObjectKeyData other)
  {
    if (other == null) return;
    this.VoucherTypeId = other.VoucherTypeId;
    this._VoucherTypeIdSet = other._VoucherTypeIdSet;
  }
  /** set the fields value: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VoucherTypeId") 
  public void setVoucherTypeId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VoucherTypeId", "setVoucherTypeId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "VoucherTypeId", "setVoucherTypeId");
    }
    this.VoucherTypeId = value;
    this._VoucherTypeIdSet = true;
  }

  /** Retrieves the VoucherTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VoucherTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VoucherTypeId field
   */
   public String getVoucherTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVoucherTypeIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getVoucherTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVoucherTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VoucherTypeId field from a formatted string
   *
   * @param _value the VoucherTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VoucherTypeId field
   */
   public void setVoucherTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVoucherTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVoucherTypeId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VoucherTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVoucherTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVoucherTypeIdFromFormattedString");
   }

  /** get the value of the field: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return BigInteger the value
   */
  public BigInteger getVoucherTypeId () {
    return this.VoucherTypeId;
  }
  /** Change the field to not being actively set: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   */
  public void unsetVoucherTypeId () {
    this._VoucherTypeIdSet = false;
  }
  /** See if the field is actively set: VoucherTypeId (VOUCHER_TYPES.voucher_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetVoucherTypeId () {
    return this._VoucherTypeIdSet;
  }
  public String toString() {
    return VoucherTypesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** VOUCHER_TYPES.voucher_type_id field */
    if(!nonNullOnly || (VoucherTypeId != null))  _VoucherTypeIdSet = flag;
  }
}
