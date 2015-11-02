/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupsObjectKeyData.java
 * Definition File: Catalog/HqGroups.xml
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

/** HqGroupsObject's Key Data class. */
public class HqGroupsObjectKeyData  extends BaseObjectData
{
  /** HQ_GROUPS.group_id field */
  public    Integer GroupId  = null;
  protected boolean _GroupIdSet = false;
  /** HQ_GROUPS.group_id_serv field */
  public    Integer GroupIdServ  = null;
  protected boolean _GroupIdServSet = false;
  private String _objName = "HqGroupsObjectKeyData";
  /** default constructor */
  public HqGroupsObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public HqGroupsObjectKeyData (HqGroupsObjectKeyData other)
  {
    if (other == null) return;
    this.GroupId = other.GroupId;
    this._GroupIdSet = other._GroupIdSet;
    this.GroupIdServ = other.GroupIdServ;
    this._GroupIdServSet = other._GroupIdServSet;
  }
  /** set the fields value: GroupId (HQ_GROUPS.group_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupId") 
  public void setGroupId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupId", "setGroupId");
    }
    this.GroupId = value;
    this._GroupIdSet = true;
  }

  /** Retrieves the GroupId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupId field
   */
   public String getGroupIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupId field from a formatted string
   *
   * @param _value the GroupId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupId field
   */
   public void setGroupIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdFromFormattedString");
   }

  /** get the value of the field: GroupId (HQ_GROUPS.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    return this.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUPS.group_id)
   */
  public void unsetGroupId () {
    this._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUPS.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    return this._GroupIdSet;
  }
  /** set the fields value: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupIdServ") 
  public void setGroupIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupIdServ", "setGroupIdServ");
    }
    this.GroupIdServ = value;
    this._GroupIdServSet = true;
  }

  /** Retrieves the GroupIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupIdServ field
   */
   public String getGroupIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupIdServ field from a formatted string
   *
   * @param _value the GroupIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupIdServ field
   */
   public void setGroupIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupIdServFromFormattedString");
   }

  /** get the value of the field: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    return this.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUPS.group_id_serv)
   */
  public void unsetGroupIdServ () {
    this._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    return this._GroupIdServSet;
  }
  public String toString() {
    return HqGroupsObjectKeyHelper.toMap(this, null).toString();
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
    
  /** HQ_GROUPS.group_id field */
    if(!nonNullOnly || (GroupId != null))  _GroupIdSet = flag;
  /** HQ_GROUPS.group_id_serv field */
    if(!nonNullOnly || (GroupIdServ != null))  _GroupIdServSet = flag;
  }
}
