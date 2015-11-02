/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupMemberObjectKeyData.java
 * Definition File: Customer/GroupMember.xml
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

/** GroupMemberObject's Key Data class. */
public class GroupMemberObjectKeyData  extends BaseObjectData
{
  /** GROUP_MEMBER.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** GROUP_MEMBER.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** GROUP_MEMBER.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** GROUP_MEMBER.group_no field */
  public    Integer GroupNo  = null;
  protected boolean _GroupNoSet = false;
  /** GROUP_MEMBER.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  private String _objName = "GroupMemberObjectKeyData";
  /** default constructor */
  public GroupMemberObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GroupMemberObjectKeyData (GroupMemberObjectKeyData other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.GroupNo = other.GroupNo;
    this._GroupNoSet = other._GroupNoSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
  }
  /** set the fields value: AccountInternalId (GROUP_MEMBER.account_no)
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

  /** get the value of the field: AccountInternalId (GROUP_MEMBER.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (GROUP_MEMBER.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (GROUP_MEMBER.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (GROUP_MEMBER.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (GROUP_MEMBER.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (GROUP_MEMBER.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (GROUP_MEMBER.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (GROUP_MEMBER.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (GROUP_MEMBER.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (GROUP_MEMBER.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (GROUP_MEMBER.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: GroupNo (GROUP_MEMBER.group_no)
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

  /** get the value of the field: GroupNo (GROUP_MEMBER.group_no)
   * @return Integer the value
   */
  public Integer getGroupNo () {
    return this.GroupNo;
  }
  /** Change the field to not being actively set: GroupNo (GROUP_MEMBER.group_no)
   */
  public void unsetGroupNo () {
    this._GroupNoSet = false;
  }
  /** See if the field is actively set: GroupNo (GROUP_MEMBER.group_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupNo () {
    return this._GroupNoSet;
  }
  /** set the fields value: ActiveDt (GROUP_MEMBER.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDt (GROUP_MEMBER.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (GROUP_MEMBER.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (GROUP_MEMBER.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  public String toString() {
    return GroupMemberObjectKeyHelper.toMap(this, null).toString();
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
    
  /** GROUP_MEMBER.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** GROUP_MEMBER.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** GROUP_MEMBER.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** GROUP_MEMBER.group_no field */
    if(!nonNullOnly || (GroupNo != null))  _GroupNoSet = flag;
  /** GROUP_MEMBER.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  }
}
