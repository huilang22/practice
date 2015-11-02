/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeObjectData.java
 * Definition File: Customer/AccountCode.xml
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
  
/** AccountCodeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountCodeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountCodeObjectKeyData Key = null;
  /** CMF_ACCOUNT_CODES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "AccountCodeObjectData";
  /** Default constructor */
  public AccountCodeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountCodeObjectData (AccountCodeObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountCodeObjectKeyData (other.Key);
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
  }

  /** get the Key for this object
   * @return AccountCodeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountCodeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountCodeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcgTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingId", "setAcgTrackingId");
    }
    if (this.Key == null) this.Key = new AccountCodeObjectKeyData ();
    this.Key.AcgTrackingId = value;
    this.Key._AcgTrackingIdSet = true;
  }
  /** get the value of the field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return Integer the value
   */
  public Integer getAcgTrackingId () {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingId;
  }
  /** Change the field to not being actively set: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   */
  public void unsetAcgTrackingId () {
    if (this.Key == null) return;
    this.Key._AcgTrackingIdSet = false;
  }
  /** See if the field is actively set: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingId () {
    if (this.Key == null) return false;
    return this.Key._AcgTrackingIdSet;
  }

  /** Retrieves the AcgTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcgTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingId field
   */
   public String getAcgTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcgTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcgTrackingId field from a formatted string
   *
   * @param _value the AcgTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcgTrackingId field
   */
   public void setAcgTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcgTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdFromFormattedString");
   }

  /** set the fields value: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcgTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingIdServ", "setAcgTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AccountCodeObjectKeyData ();
    this.Key.AcgTrackingIdServ = value;
    this.Key._AcgTrackingIdServSet = true;
  }
  /** get the value of the field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getAcgTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.AcgTrackingIdServ;
  }
  /** Change the field to not being actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   */
  public void unsetAcgTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._AcgTrackingIdServSet = false;
  }
  /** See if the field is actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._AcgTrackingIdServSet;
  }

  /** Retrieves the AcgTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcgTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdServ field
   */
   public String getAcgTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getAcgTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcgTrackingIdServ field from a formatted string
   *
   * @param _value the AcgTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcgTrackingIdServ field
   */
   public void setAcgTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcgTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdServFromFormattedString");
   }

  /** set the fields value: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountCode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCode", "setAccountCode");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountCode", "setAccountCode");
    }
    if (this.Key == null) this.Key = new AccountCodeObjectKeyData ();
    this.Key.AccountCode = value;
    this.Key._AccountCodeSet = true;
  }
  /** get the value of the field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return String the value
   */
  public String getAccountCode () {
    if (this.Key == null) return null;
    return this.Key.AccountCode;
  }
  /** Change the field to not being actively set: AccountCode (CMF_ACCOUNT_CODES.account_code)
   */
  public void unsetAccountCode () {
    if (this.Key == null) return;
    this.Key._AccountCodeSet = false;
  }
  /** See if the field is actively set: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCode () {
    if (this.Key == null) return false;
    return this.Key._AccountCodeSet;
  }

  /** Retrieves the AccountCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCode field
   */
   public String getAccountCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeAsFormattedString");
       return fmtMgr.formatString(this.getAccountCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCode field from a formatted string
   *
   * @param _value the AccountCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCode field
   */
   public void setAccountCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCodeFromFormattedString");
   }

  /** set the fields value: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayValue") 
  public void setDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayValue", "setDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayValue", "setDisplayValue");
    }
    this.DisplayValue = value;
    this._DisplayValueSet = true;
  }

  /** Retrieves the DisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValue field
   */
   public String getDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayValue field from a formatted string
   *
   * @param _value the DisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayValue field
   */
   public void setDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFromFormattedString");
   }

  /** get the value of the field: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (CMF_ACCOUNT_CODES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return AccountCodeObjectHelper.toMap(this, null).toString();
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
  /** CMF_ACCOUNT_CODES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
