/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupObjectKeyData.java
 * Definition File: Customer/Group.xml
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

/** GroupObject's Key Data class. */
public class GroupObjectKeyData  extends BaseObjectData
{
  /** GROUPS.group_no field */
  public    Integer GroupNo  = null;
  protected boolean _GroupNoSet = false;
  private String _objName = "GroupObjectKeyData";
  /** default constructor */
  public GroupObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GroupObjectKeyData (GroupObjectKeyData other)
  {
    if (other == null) return;
    this.GroupNo = other.GroupNo;
    this._GroupNoSet = other._GroupNoSet;
  }
  /** set the fields value: GroupNo (GROUPS.group_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupNo") 
  public void setGroupNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupNo", "setGroupNo");
    }
    this.GroupNo = value;
    this._GroupNoSet = true;
  }

  /** Retrieves the GroupNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupNo field
   */
   public String getGroupNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupNoAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupNo field from a formatted string
   *
   * @param _value the GroupNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupNo field
   */
   public void setGroupNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupNoFromFormattedString");
   }

  /** get the value of the field: GroupNo (GROUPS.group_no)
   * @return Integer the value
   */
  public Integer getGroupNo () {
    return this.GroupNo;
  }
  /** Change the field to not being actively set: GroupNo (GROUPS.group_no)
   */
  public void unsetGroupNo () {
    this._GroupNoSet = false;
  }
  /** See if the field is actively set: GroupNo (GROUPS.group_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupNo () {
    return this._GroupNoSet;
  }
  public String toString() {
    return GroupObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GROUPS.group_no field */
    if(!nonNullOnly || (GroupNo != null))  _GroupNoSet = flag;
  }
}
