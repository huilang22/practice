/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectKeyData.java
 * Definition File: Admin/SecurityAci.xml
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

/** SecurityAciObject's Key Data class. */
public class SecurityAciObjectKeyData  extends BaseObjectData
{
  /** SEC_ACI.aci_id field */
  public    BigInteger AciId  = null;
  protected boolean _AciIdSet = false;
  private String _objName = "SecurityAciObjectKeyData";
  /** default constructor */
  public SecurityAciObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SecurityAciObjectKeyData (SecurityAciObjectKeyData other)
  {
    if (other == null) return;
    this.AciId = other.AciId;
    this._AciIdSet = other._AciIdSet;
  }
  /** set the fields value: AciId (SEC_ACI.aci_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AciId") 
  public void setAciId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AciId", "setAciId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AciId", "setAciId");
    }
    this.AciId = value;
    this._AciIdSet = true;
  }

  /** Retrieves the AciId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AciId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AciId field
   */
   public String getAciIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAciIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAciId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAciIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AciId field from a formatted string
   *
   * @param _value the AciId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AciId field
   */
   public void setAciIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAciIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAciId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AciId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAciIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAciIdFromFormattedString");
   }

  /** get the value of the field: AciId (SEC_ACI.aci_id)
   * @return BigInteger the value
   */
  public BigInteger getAciId () {
    return this.AciId;
  }
  /** Change the field to not being actively set: AciId (SEC_ACI.aci_id)
   */
  public void unsetAciId () {
    this._AciIdSet = false;
  }
  /** See if the field is actively set: AciId (SEC_ACI.aci_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAciId () {
    return this._AciIdSet;
  }
  public String toString() {
    return SecurityAciObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SEC_ACI.aci_id field */
    if(!nonNullOnly || (AciId != null))  _AciIdSet = flag;
  }
}
