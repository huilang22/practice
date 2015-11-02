/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractObjectKeyData.java
 * Definition File: Customer/GlobalContract.xml
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

/** GlobalContractObject's Key Data class. */
public class GlobalContractObjectKeyData  extends BaseObjectData
{
  /** CUSTOMER_CONTRACT_VIEW.view_id field */
  public    BigInteger ViewId  = null;
  protected boolean _ViewIdSet = false;
  private String _objName = "GlobalContractObjectKeyData";
  /** default constructor */
  public GlobalContractObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GlobalContractObjectKeyData (GlobalContractObjectKeyData other)
  {
    if (other == null) return;
    this.ViewId = other.ViewId;
    this._ViewIdSet = other._ViewIdSet;
  }
  /** set the fields value: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewId") 
  public void setViewId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewId", "setViewId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ViewId", "setViewId");
    }
    this.ViewId = value;
    this._ViewIdSet = true;
  }

  /** Retrieves the ViewId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewId field
   */
   public String getViewIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getViewId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewId field from a formatted string
   *
   * @param _value the ViewId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewId field
   */
   public void setViewIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewIdFromFormattedString");
   }

  /** get the value of the field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return BigInteger the value
   */
  public BigInteger getViewId () {
    return this.ViewId;
  }
  /** Change the field to not being actively set: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   */
  public void unsetViewId () {
    this._ViewIdSet = false;
  }
  /** See if the field is actively set: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewId () {
    return this._ViewIdSet;
  }
  public String toString() {
    return GlobalContractObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CUSTOMER_CONTRACT_VIEW.view_id field */
    if(!nonNullOnly || (ViewId != null))  _ViewIdSet = flag;
  }
}