/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalAccountBalancesObjectKeyData.java
 * Definition File: Admin/GlobalAccountBalances.xml
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

/** GlobalAccountBalancesObject's Key Data class. */
public class GlobalAccountBalancesObjectKeyData  extends BaseObjectData
{
  /** GLOBAL_ACCOUNT_BALANCES.balance_tracking_id field */
  public    Integer BalanceTrackingId  = null;
  protected boolean _BalanceTrackingIdSet = false;
  private String _objName = "GlobalAccountBalancesObjectKeyData";
  /** default constructor */
  public GlobalAccountBalancesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GlobalAccountBalancesObjectKeyData (GlobalAccountBalancesObjectKeyData other)
  {
    if (other == null) return;
    this.BalanceTrackingId = other.BalanceTrackingId;
    this._BalanceTrackingIdSet = other._BalanceTrackingIdSet;
  }
  /** set the fields value: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
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

  /** get the value of the field: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return Integer the value
   */
  public Integer getBalanceTrackingId () {
    return this.BalanceTrackingId;
  }
  /** Change the field to not being actively set: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   */
  public void unsetBalanceTrackingId () {
    this._BalanceTrackingIdSet = false;
  }
  /** See if the field is actively set: BalanceTrackingId (GLOBAL_ACCOUNT_BALANCES.balance_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceTrackingId () {
    return this._BalanceTrackingIdSet;
  }
  public String toString() {
    return GlobalAccountBalancesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GLOBAL_ACCOUNT_BALANCES.balance_tracking_id field */
    if(!nonNullOnly || (BalanceTrackingId != null))  _BalanceTrackingIdSet = flag;
  }
}
