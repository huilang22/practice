/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupAmountObjectKeyData.java
 * Definition File: Admin/CsrGroupAmount.xml
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

/** CsrGroupAmountObject's Key Data class. */
public class CsrGroupAmountObjectKeyData  extends BaseObjectData
{
  /** GROUP_AMOUNT.group_name field */
  public    String GroupName  = null;
  protected boolean _GroupNameSet = false;
  /** GROUP_AMOUNT.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** GROUP_AMOUNT.module_name field */
  public    Integer ModuleName  = null;
  protected boolean _ModuleNameSet = false;
  private String _objName = "CsrGroupAmountObjectKeyData";
  /** default constructor */
  public CsrGroupAmountObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CsrGroupAmountObjectKeyData (CsrGroupAmountObjectKeyData other)
  {
    if (other == null) return;
    this.GroupName = other.GroupName;
    this._GroupNameSet = other._GroupNameSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.ModuleName = other.ModuleName;
    this._ModuleNameSet = other._ModuleNameSet;
  }
  /** set the fields value: GroupName (GROUP_AMOUNT.group_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupName") 
  public void setGroupName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupName", "setGroupName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GroupName", "setGroupName");
    }
    this.GroupName = value;
    this._GroupNameSet = true;
  }

  /** Retrieves the GroupName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupName field
   */
   public String getGroupNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupNameAsFormattedString");
       return fmtMgr.formatString(this.getGroupName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupName field from a formatted string
   *
   * @param _value the GroupName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupName field
   */
   public void setGroupNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupNameFromFormattedString");
   }

  /** get the value of the field: GroupName (GROUP_AMOUNT.group_name)
   * @return String the value
   */
  public String getGroupName () {
    return this.GroupName;
  }
  /** Change the field to not being actively set: GroupName (GROUP_AMOUNT.group_name)
   */
  public void unsetGroupName () {
    this._GroupNameSet = false;
  }
  /** See if the field is actively set: GroupName (GROUP_AMOUNT.group_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupName () {
    return this._GroupNameSet;
  }
  /** set the fields value: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (GROUP_AMOUNT.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (GROUP_AMOUNT.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: ModuleName (GROUP_AMOUNT.module_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModuleName") 
  public void setModuleName (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ModuleName", "setModuleName");
    }
    this.ModuleName = value;
    this._ModuleNameSet = true;
  }

  /** Retrieves the ModuleName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ModuleName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ModuleName field
   */
   public String getModuleNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleNameAsFormattedString");
       return fmtMgr.formatNumber(this.getModuleName(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModuleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ModuleName field from a formatted string
   *
   * @param _value the ModuleName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ModuleName field
   */
   public void setModuleNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModuleName(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModuleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleNameFromFormattedString");
   }

  /** get the value of the field: ModuleName (GROUP_AMOUNT.module_name)
   * @return Integer the value
   */
  public Integer getModuleName () {
    return this.ModuleName;
  }
  /** Change the field to not being actively set: ModuleName (GROUP_AMOUNT.module_name)
   */
  public void unsetModuleName () {
    this._ModuleNameSet = false;
  }
  /** See if the field is actively set: ModuleName (GROUP_AMOUNT.module_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetModuleName () {
    return this._ModuleNameSet;
  }
  public String toString() {
    return CsrGroupAmountObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GROUP_AMOUNT.group_name field */
    if(!nonNullOnly || (GroupName != null))  _GroupNameSet = flag;
  /** GROUP_AMOUNT.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** GROUP_AMOUNT.module_name field */
    if(!nonNullOnly || (ModuleName != null))  _ModuleNameSet = flag;
  }
}
