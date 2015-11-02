/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalancesObjectKeyData.java
 * Definition File: Customer/AccountBalances.xml
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

/** AccountBalancesObject's Key Data class. */
public class AccountBalancesObjectKeyData  extends BaseObjectData
{
  /** ACCOUNT_BALANCES.balance_tracking_id field */
  public    Integer BalanceTrackingId  = null;
  protected boolean _BalanceTrackingIdSet = false;
  /** ACCOUNT_BALANCES.balance_tracking_id_serv field */
  public    Integer BalanceTrackingIdServ  = null;
  protected boolean _BalanceTrackingIdServSet = false;
  private String _objName = "AccountBalancesObjectKeyData";
  /** default constructor */
  public AccountBalancesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AccountBalancesObjectKeyData (AccountBalancesObjectKeyData other)
  {
    if (other == null) return;
    this.BalanceTrackingId = other.BalanceTrackingId;
    this._BalanceTrackingIdSet = other._BalanceTrackingIdSet;
    this.BalanceTrackingIdServ = other.BalanceTrackingIdServ;
    this._BalanceTrackingIdServSet = other._BalanceTrackingIdServSet;
  }
  /** set the fields value: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceTrackingId") 
  public void setBalanceTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceTrackingId", "setBalanceTrackingId");
    }
    this.BalanceTrackingId = value;
    this._BalanceTrackingIdSet = true;
  }

  /** Retrieves the BalanceTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingId field
   */
   public String getBalanceTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceTrackingId field from a formatted string
   *
   * @param _value the BalanceTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceTrackingId field
   */
   public void setBalanceTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdFromFormattedString");
   }

  /** get the value of the field: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return Integer the value
   */
  public Integer getBalanceTrackingId () {
    return this.BalanceTrackingId;
  }
  /** Change the field to not being actively set: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   */
  public void unsetBalanceTrackingId () {
    this._BalanceTrackingIdSet = false;
  }
  /** See if the field is actively set: BalanceTrackingId (ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceTrackingId () {
    return this._BalanceTrackingIdSet;
  }
  /** set the fields value: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceTrackingIdServ") 
  public void setBalanceTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceTrackingIdServ", "setBalanceTrackingIdServ");
    }
    this.BalanceTrackingIdServ = value;
    this._BalanceTrackingIdServSet = true;
  }

  /** Retrieves the BalanceTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceTrackingIdServ field
   */
   public String getBalanceTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceTrackingIdServ field from a formatted string
   *
   * @param _value the BalanceTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceTrackingIdServ field
   */
   public void setBalanceTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceTrackingIdServFromFormattedString");
   }

  /** get the value of the field: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBalanceTrackingIdServ () {
    return this.BalanceTrackingIdServ;
  }
  /** Change the field to not being actively set: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   */
  public void unsetBalanceTrackingIdServ () {
    this._BalanceTrackingIdServSet = false;
  }
  /** See if the field is actively set: BalanceTrackingIdServ (ACCOUNT_BALANCES.balance_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceTrackingIdServ () {
    return this._BalanceTrackingIdServSet;
  }
  public String toString() {
    return AccountBalancesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ACCOUNT_BALANCES.balance_tracking_id field */
    if(!nonNullOnly || (BalanceTrackingId != null))  _BalanceTrackingIdSet = flag;
  /** ACCOUNT_BALANCES.balance_tracking_id_serv field */
    if(!nonNullOnly || (BalanceTrackingIdServ != null))  _BalanceTrackingIdServSet = flag;
  }
}
