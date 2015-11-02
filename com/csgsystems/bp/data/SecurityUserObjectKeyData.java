/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectKeyData.java
 * Definition File: Admin/SecurityUser.xml
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

/** SecurityUserObject's Key Data class. */
public class SecurityUserObjectKeyData  extends BaseObjectData
{
  /** SEC_FX_USER.usr_id field */
  public    BigInteger UsrId  = null;
  protected boolean _UsrIdSet = false;
  private String _objName = "SecurityUserObjectKeyData";
  /** default constructor */
  public SecurityUserObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SecurityUserObjectKeyData (SecurityUserObjectKeyData other)
  {
    if (other == null) return;
    this.UsrId = other.UsrId;
    this._UsrIdSet = other._UsrIdSet;
  }
  /** set the fields value: UsrId (SEC_FX_USER.usr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsrId") 
  public void setUsrId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsrId", "setUsrId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UsrId", "setUsrId");
    }
    this.UsrId = value;
    this._UsrIdSet = true;
  }

  /** Retrieves the UsrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsrId field
   */
   public String getUsrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsrIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUsrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsrId field from a formatted string
   *
   * @param _value the UsrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsrId field
   */
   public void setUsrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsrId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsrIdFromFormattedString");
   }

  /** get the value of the field: UsrId (SEC_FX_USER.usr_id)
   * @return BigInteger the value
   */
  public BigInteger getUsrId () {
    return this.UsrId;
  }
  /** Change the field to not being actively set: UsrId (SEC_FX_USER.usr_id)
   */
  public void unsetUsrId () {
    this._UsrIdSet = false;
  }
  /** See if the field is actively set: UsrId (SEC_FX_USER.usr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsrId () {
    return this._UsrIdSet;
  }
  public String toString() {
    return SecurityUserObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SEC_FX_USER.usr_id field */
    if(!nonNullOnly || (UsrId != null))  _UsrIdSet = flag;
  }
}
