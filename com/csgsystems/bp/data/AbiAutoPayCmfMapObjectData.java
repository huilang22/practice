/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectData.java
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
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** AbiAutoPayCmfMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AbiAutoPayCmfMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AbiAutoPayCmfMapObjectKeyData Key = null;
  /** ABI_AUTO_PAY_CMF_MAP.lob_id field */
  public    BigInteger LobId  = null;
  protected boolean _LobIdSet = false;
  private String _objName = "AbiAutoPayCmfMapObjectData";
  /** Default constructor */
  public AbiAutoPayCmfMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AbiAutoPayCmfMapObjectData (AbiAutoPayCmfMapObjectData other)
  {

    if (other == null) return;
    this.Key = new AbiAutoPayCmfMapObjectKeyData (other.Key);
    this.LobId = other.LobId;
    this._LobIdSet = other._LobIdSet;
  }

  /** get the Key for this object
   * @return AbiAutoPayCmfMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AbiAutoPayCmfMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AbiAutoPayCmfMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (ABI_AUTO_PAY_CMF_MAP.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountInternalIdSet;
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

  /** set the fields value: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPayOffMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PayOffMethod", "setPayOffMethod");
    }
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyData ();
    this.Key.PayOffMethod = value;
    this.Key._PayOffMethodSet = true;
  }
  /** get the value of the field: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return Integer the value
   */
  public Integer getPayOffMethod () {
    if (this.Key == null) return null;
    return this.Key.PayOffMethod;
  }
  /** Change the field to not being actively set: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   */
  public void unsetPayOffMethod () {
    if (this.Key == null) return;
    this.Key._PayOffMethodSet = false;
  }
  /** See if the field is actively set: PayOffMethod (ABI_AUTO_PAY_CMF_MAP.pay_off_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayOffMethod () {
    if (this.Key == null) return false;
    return this.Key._PayOffMethodSet;
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

  /** set the fields value: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setChargeTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChargeTypeCode", "setChargeTypeCode");
    }
    if (this.Key == null) this.Key = new AbiAutoPayCmfMapObjectKeyData ();
    this.Key.ChargeTypeCode = value;
    this.Key._ChargeTypeCodeSet = true;
  }
  /** get the value of the field: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return Integer the value
   */
  public Integer getChargeTypeCode () {
    if (this.Key == null) return null;
    return this.Key.ChargeTypeCode;
  }
  /** Change the field to not being actively set: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   */
  public void unsetChargeTypeCode () {
    if (this.Key == null) return;
    this.Key._ChargeTypeCodeSet = false;
  }
  /** See if the field is actively set: ChargeTypeCode (ABI_AUTO_PAY_CMF_MAP.charge_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetChargeTypeCode () {
    if (this.Key == null) return false;
    return this.Key._ChargeTypeCodeSet;
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

  /** set the fields value: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LobId") 
  public void setLobId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LobId", "setLobId");
    }
    this.LobId = value;
    this._LobIdSet = true;
  }

  /** Retrieves the LobId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LobId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobId field
   */
   public String getLobIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLobId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LobId field from a formatted string
   *
   * @param _value the LobId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LobId field
   */
   public void setLobIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLobId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFromFormattedString");
   }

  /** get the value of the field: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return BigInteger the value
   */
  public BigInteger getLobId () {
    return this.LobId;
  }
  /** Change the field to not being actively set: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   */
  public void unsetLobId () {
    this._LobIdSet = false;
  }
  /** See if the field is actively set: LobId (ABI_AUTO_PAY_CMF_MAP.lob_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLobId () {
    return this._LobIdSet;
  }
  public String toString() {
    return AbiAutoPayCmfMapObjectHelper.toMap(this, null).toString();
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
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** ABI_AUTO_PAY_CMF_MAP.lob_id field */
    if(!nonNullOnly || (LobId != null))  _LobIdSet = flag;
  }
}
