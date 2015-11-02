/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupLocateObjectKeyData.java
 * Definition File: Catalog/GroupLocate.xml
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

/** GroupLocateObject's Key Data class. */
public class GroupLocateObjectKeyData  extends BaseObjectData
{
  /** EXTERNAL_ID_GROUP_MAP.external_id field */
  public    String GroupExternalId  = null;
  protected boolean _GroupExternalIdSet = false;
  /** EXTERNAL_ID_GROUP_MAP.external_id_type field */
  public    Integer GroupExternalIdType  = null;
  protected boolean _GroupExternalIdTypeSet = false;
  private String _objName = "GroupLocateObjectKeyData";
  /** default constructor */
  public GroupLocateObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public GroupLocateObjectKeyData (GroupLocateObjectKeyData other)
  {
    if (other == null) return;
    this.GroupExternalId = other.GroupExternalId;
    this._GroupExternalIdSet = other._GroupExternalIdSet;
    this.GroupExternalIdType = other.GroupExternalIdType;
    this._GroupExternalIdTypeSet = other._GroupExternalIdTypeSet;
  }
  /** set the fields value: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupExternalId") 
  public void setGroupExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupExternalId", "setGroupExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GroupExternalId", "setGroupExternalId");
    }
    this.GroupExternalId = value;
    this._GroupExternalIdSet = true;
  }

  /** Retrieves the GroupExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupExternalId field
   */
   public String getGroupExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getGroupExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupExternalId field from a formatted string
   *
   * @param _value the GroupExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupExternalId field
   */
   public void setGroupExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupExternalIdFromFormattedString");
   }

  /** get the value of the field: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return String the value
   */
  public String getGroupExternalId () {
    return this.GroupExternalId;
  }
  /** Change the field to not being actively set: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   */
  public void unsetGroupExternalId () {
    this._GroupExternalIdSet = false;
  }
  /** See if the field is actively set: GroupExternalId (EXTERNAL_ID_GROUP_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupExternalId () {
    return this._GroupExternalIdSet;
  }
  /** set the fields value: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupExternalIdType") 
  public void setGroupExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupExternalIdType", "setGroupExternalIdType");
    }
    this.GroupExternalIdType = value;
    this._GroupExternalIdTypeSet = true;
  }

  /** Retrieves the GroupExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupExternalIdType field
   */
   public String getGroupExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupExternalIdType field from a formatted string
   *
   * @param _value the GroupExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupExternalIdType field
   */
   public void setGroupExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getGroupExternalIdType () {
    return this.GroupExternalIdType;
  }
  /** Change the field to not being actively set: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   */
  public void unsetGroupExternalIdType () {
    this._GroupExternalIdTypeSet = false;
  }
  /** See if the field is actively set: GroupExternalIdType (EXTERNAL_ID_GROUP_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupExternalIdType () {
    return this._GroupExternalIdTypeSet;
  }
  public String toString() {
    return GroupLocateObjectKeyHelper.toMap(this, null).toString();
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
    
  /** EXTERNAL_ID_GROUP_MAP.external_id field */
    if(!nonNullOnly || (GroupExternalId != null))  _GroupExternalIdSet = flag;
  /** EXTERNAL_ID_GROUP_MAP.external_id_type field */
    if(!nonNullOnly || (GroupExternalIdType != null))  _GroupExternalIdTypeSet = flag;
  }
}
