/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectKeyData.java
 * Definition File: Admin/Csr.xml
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

/** CsrObject's Key Data class. */
public class CsrObjectKeyData  extends BaseObjectData
{
  /** CSR_INFORMATION.user_name field */
  public    String UserName  = null;
  protected boolean _UserNameSet = false;
  private String _objName = "CsrObjectKeyData";
  /** default constructor */
  public CsrObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CsrObjectKeyData (CsrObjectKeyData other)
  {
    if (other == null) return;
    this.UserName = other.UserName;
    this._UserNameSet = other._UserNameSet;
  }
  /** set the fields value: UserName (CSR_INFORMATION.user_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UserName") 
  public void setUserName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UserName", "setUserName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UserName", "setUserName");
    }
    this.UserName = value;
    this._UserNameSet = true;
  }

  /** Retrieves the UserName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UserName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserName field
   */
   public String getUserNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserNameAsFormattedString");
       return fmtMgr.formatString(this.getUserName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UserName field from a formatted string
   *
   * @param _value the UserName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UserName field
   */
   public void setUserNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUserName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserNameFromFormattedString");
   }

  /** get the value of the field: UserName (CSR_INFORMATION.user_name)
   * @return String the value
   */
  public String getUserName () {
    return this.UserName;
  }
  /** Change the field to not being actively set: UserName (CSR_INFORMATION.user_name)
   */
  public void unsetUserName () {
    this._UserNameSet = false;
  }
  /** See if the field is actively set: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetUserName () {
    return this._UserNameSet;
  }
  public String toString() {
    return CsrObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CSR_INFORMATION.user_name field */
    if(!nonNullOnly || (UserName != null))  _UserNameSet = flag;
  }
}
