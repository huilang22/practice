/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeGroupObjectKeyData.java
 * Definition File: Customer/AccountCodeGroup.xml
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

/** AccountCodeGroupObject's Key Data class. */
public class AccountCodeGroupObjectKeyData  extends BaseObjectData
{
  /** CMF_ACCOUNT_CODE_GROUPS.account_code_group field */
  public    String AccountCodeGroup  = null;
  protected boolean _AccountCodeGroupSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  private String _objName = "AccountCodeGroupObjectKeyData";
  /** default constructor */
  public AccountCodeGroupObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AccountCodeGroupObjectKeyData (AccountCodeGroupObjectKeyData other)
  {
    if (other == null) return;
    this.AccountCodeGroup = other.AccountCodeGroup;
    this._AccountCodeGroupSet = other._AccountCodeGroupSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
  }
  /** set the fields value: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCodeGroup") 
  public void setAccountCodeGroup (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCodeGroup", "setAccountCodeGroup");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountCodeGroup", "setAccountCodeGroup");
    }
    this.AccountCodeGroup = value;
    this._AccountCodeGroupSet = true;
  }

  /** Retrieves the AccountCodeGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCodeGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCodeGroup field
   */
   public String getAccountCodeGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupAsFormattedString");
       return fmtMgr.formatString(this.getAccountCodeGroup());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCodeGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCodeGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCodeGroup field from a formatted string
   *
   * @param _value the AccountCodeGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCodeGroup field
   */
   public void setAccountCodeGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCodeGroup(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCodeGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCodeGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCodeGroupFromFormattedString");
   }

  /** get the value of the field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return String the value
   */
  public String getAccountCodeGroup () {
    return this.AccountCodeGroup;
  }
  /** Change the field to not being actively set: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   */
  public void unsetAccountCodeGroup () {
    this._AccountCodeGroupSet = false;
  }
  /** See if the field is actively set: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCodeGroup () {
    return this._AccountCodeGroupSet;
  }
  /** set the fields value: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
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

  /** get the value of the field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  public String toString() {
    return AccountCodeGroupObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CMF_ACCOUNT_CODE_GROUPS.account_code_group field */
    if(!nonNullOnly || (AccountCodeGroup != null))  _AccountCodeGroupSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  }
}
