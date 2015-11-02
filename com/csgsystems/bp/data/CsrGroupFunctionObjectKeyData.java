/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupFunctionObjectKeyData.java
 * Definition File: Admin/CsrGroupFunction.xml
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

/** CsrGroupFunctionObject's Key Data class. */
public class CsrGroupFunctionObjectKeyData  extends BaseObjectData
{
  /** GROUP_FUNCTION.group_name field */
  public    String GroupName  = null;
  protected boolean _GroupNameSet = false;
  /** GROUP_FUNCTION.module_name field */
  public    String ModuleName  = null;
  protected boolean _ModuleNameSet = false;
  private String _objName = "CsrGroupFunctionObjectKeyData";
  /** default constructor */
  public CsrGroupFunctionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CsrGroupFunctionObjectKeyData (CsrGroupFunctionObjectKeyData other)
  {
    if (other == null) return;
    this.GroupName = other.GroupName;
    this._GroupNameSet = other._GroupNameSet;
    this.ModuleName = other.ModuleName;
    this._ModuleNameSet = other._ModuleNameSet;
  }
  /** set the fields value: GroupName (GROUP_FUNCTION.group_name)
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

  /** get the value of the field: GroupName (GROUP_FUNCTION.group_name)
   * @return String the value
   */
  public String getGroupName () {
    return this.GroupName;
  }
  /** Change the field to not being actively set: GroupName (GROUP_FUNCTION.group_name)
   */
  public void unsetGroupName () {
    this._GroupNameSet = false;
  }
  /** See if the field is actively set: GroupName (GROUP_FUNCTION.group_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupName () {
    return this._GroupNameSet;
  }
  /** set the fields value: ModuleName (GROUP_FUNCTION.module_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ModuleName") 
  public void setModuleName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ModuleName", "setModuleName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ModuleName", "setModuleName");
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
       return fmtMgr.formatString(this.getModuleName());
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
       this.setModuleName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ModuleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleNameFromFormattedString");
   }

  /** get the value of the field: ModuleName (GROUP_FUNCTION.module_name)
   * @return String the value
   */
  public String getModuleName () {
    return this.ModuleName;
  }
  /** Change the field to not being actively set: ModuleName (GROUP_FUNCTION.module_name)
   */
  public void unsetModuleName () {
    this._ModuleNameSet = false;
  }
  /** See if the field is actively set: ModuleName (GROUP_FUNCTION.module_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetModuleName () {
    return this._ModuleNameSet;
  }
  public String toString() {
    return CsrGroupFunctionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GROUP_FUNCTION.group_name field */
    if(!nonNullOnly || (GroupName != null))  _GroupNameSet = flag;
  /** GROUP_FUNCTION.module_name field */
    if(!nonNullOnly || (ModuleName != null))  _ModuleNameSet = flag;
  }
}
