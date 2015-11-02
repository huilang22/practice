/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectKeyData.java
 * Definition File: Customer/AbiAutoPayCmfMap.xml
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

/** AbiAutoPayCmfMapObject's Key Data class. */
public class AbiAutoPayCmfMapObjectKeyData  extends BaseObjectData
{
  /** ABI_AUTO_PAY_CMF_MAP.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** ABI_AUTO_PAY_CMF_MAP.pay_off_method field */
  public    Integer PayOffMethod  = null;
  protected boolean _PayOffMethodSet = false;
  /** ABI_AUTO_PAY_CMF_MAP.charge_type_code field */
  public    Integer ChargeTypeCode  = null;
  protected boolean _ChargeTypeCodeSet = false;
  private String _objName = "AbiAutoPayCmfMapObjectKeyData";
  /** default constructor */
  public AbiAutoPayCmfMapObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AbiAutoPayCmfMapObjectKeyData (AbiAutoPayCmfMapObjectKeyData other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.PayOffMethod = other.PayOffMethod;
    this._PayOffMethodSet = other._PayOffMethodSet;
    this.ChargeTypeCode = other.ChargeTypeCode;
    this._ChargeTypeCodeSet = other._ChargeTypeCodeSet;
  }
  /** set the fields value: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayOffMethod") 
  public void setPayOffMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayOffMethod", "setPayOffMethod");
    }
    this.PayOffMethod = value;
    this._PayOffMethodSet = true;
  }

  /** Retrieves the PayOffMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayOffMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayOffMethod field
   */
   public String getPayOffMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayOffMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayOffMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getPayOffMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayOffMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayOffMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayOffMethod field from a formatted string
   *
   * @param _value the PayOffMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayOffMethod field
   */
   public void setPayOffMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayOffMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayOffMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayOffMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayOffMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayOffMethodFromFormattedString");
   }

  /** get the value of the field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return Integer the value
   */
  public Integer getPayOffMethod () {
    return this.PayOffMethod;
  }
  /** Change the field to not being actively set: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   */
  public void unsetPayOffMethod () {
    this._PayOffMethodSet = false;
  }
  /** See if the field is actively set: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayOffMethod () {
    return this._PayOffMethodSet;
  }
  /** set the fields value: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChargeTypeCode") 
  public void setChargeTypeCode (Integer value) throws ServiceException
  {
    this.ChargeTypeCode = value;
    this._ChargeTypeCodeSet = true;
  }

  /** Retrieves the ChargeTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChargeTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChargeTypeCode field
   */
   public String getChargeTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChargeTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getChargeTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChargeTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChargeTypeCode field from a formatted string
   *
   * @param _value the ChargeTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChargeTypeCode field
   */
   public void setChargeTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChargeTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChargeTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChargeTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChargeTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChargeTypeCodeFromFormattedString");
   }

  /** get the value of the field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return Integer the value
   */
  public Integer getChargeTypeCode () {
    return this.ChargeTypeCode;
  }
  /** Change the field to not being actively set: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   */
  public void unsetChargeTypeCode () {
    this._ChargeTypeCodeSet = false;
  }
  /** See if the field is actively set: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeTypeCode () {
    return this._ChargeTypeCodeSet;
  }
  public String toString() {
    return AbiAutoPayCmfMapObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ABI_AUTO_PAY_CMF_MAP.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** ABI_AUTO_PAY_CMF_MAP.pay_off_method field */
    if(!nonNullOnly || (PayOffMethod != null))  _PayOffMethodSet = flag;
  /** ABI_AUTO_PAY_CMF_MAP.charge_type_code field */
    if(!nonNullOnly || (ChargeTypeCode != null))  _ChargeTypeCodeSet = flag;
  }
}
