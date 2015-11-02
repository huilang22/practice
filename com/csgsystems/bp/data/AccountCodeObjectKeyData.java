/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeObjectKeyData.java
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

/** AccountCodeObject's Key Data class. */
public class AccountCodeObjectKeyData  extends BaseObjectData
{
  /** CMF_ACCOUNT_CODES.acg_tracking_id field */
  public    Integer AcgTrackingId  = null;
  protected boolean _AcgTrackingIdSet = false;
  /** CMF_ACCOUNT_CODES.acg_tracking_id_serv field */
  public    Integer AcgTrackingIdServ  = null;
  protected boolean _AcgTrackingIdServSet = false;
  /** CMF_ACCOUNT_CODES.account_code field */
  public    String AccountCode  = null;
  protected boolean _AccountCodeSet = false;
  private String _objName = "AccountCodeObjectKeyData";
  /** default constructor */
  public AccountCodeObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AccountCodeObjectKeyData (AccountCodeObjectKeyData other)
  {
    if (other == null) return;
    this.AcgTrackingId = other.AcgTrackingId;
    this._AcgTrackingIdSet = other._AcgTrackingIdSet;
    this.AcgTrackingIdServ = other.AcgTrackingIdServ;
    this._AcgTrackingIdServSet = other._AcgTrackingIdServSet;
    this.AccountCode = other.AccountCode;
    this._AccountCodeSet = other._AccountCodeSet;
  }
  /** set the fields value: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcgTrackingId") 
  public void setAcgTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingId", "setAcgTrackingId");
    }
    this.AcgTrackingId = value;
    this._AcgTrackingIdSet = true;
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

  /** get the value of the field: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return Integer the value
   */
  public Integer getAcgTrackingId () {
    return this.AcgTrackingId;
  }
  /** Change the field to not being actively set: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   */
  public void unsetAcgTrackingId () {
    this._AcgTrackingIdSet = false;
  }
  /** See if the field is actively set: AcgTrackingId (CMF_ACCOUNT_CODES.acg_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingId () {
    return this._AcgTrackingIdSet;
  }
  /** set the fields value: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcgTrackingIdServ") 
  public void setAcgTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingIdServ", "setAcgTrackingIdServ");
    }
    this.AcgTrackingIdServ = value;
    this._AcgTrackingIdServSet = true;
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

  /** get the value of the field: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getAcgTrackingIdServ () {
    return this.AcgTrackingIdServ;
  }
  /** Change the field to not being actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   */
  public void unsetAcgTrackingIdServ () {
    this._AcgTrackingIdServSet = false;
  }
  /** See if the field is actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODES.acg_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingIdServ () {
    return this._AcgTrackingIdServSet;
  }
  /** set the fields value: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCode") 
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
    this.AccountCode = value;
    this._AccountCodeSet = true;
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

  /** get the value of the field: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return String the value
   */
  public String getAccountCode () {
    return this.AccountCode;
  }
  /** Change the field to not being actively set: AccountCode (CMF_ACCOUNT_CODES.account_code)
   */
  public void unsetAccountCode () {
    this._AccountCodeSet = false;
  }
  /** See if the field is actively set: AccountCode (CMF_ACCOUNT_CODES.account_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCode () {
    return this._AccountCodeSet;
  }
  public String toString() {
    return AccountCodeObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CMF_ACCOUNT_CODES.acg_tracking_id field */
    if(!nonNullOnly || (AcgTrackingId != null))  _AcgTrackingIdSet = flag;
  /** CMF_ACCOUNT_CODES.acg_tracking_id_serv field */
    if(!nonNullOnly || (AcgTrackingIdServ != null))  _AcgTrackingIdServSet = flag;
  /** CMF_ACCOUNT_CODES.account_code field */
    if(!nonNullOnly || (AccountCode != null))  _AccountCodeSet = flag;
  }
}
