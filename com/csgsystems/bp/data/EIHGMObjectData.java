/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EIHGMObjectData.java
 * Definition File: Catalog/ExternalIdHqGroupsMap.xml
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
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** EIHGMObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class EIHGMObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public EIHGMObjectKeyData Key = null;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_id field */
  public    Integer GroupId  = null;
  protected boolean _GroupIdSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv field */
  public    Integer GroupIdServ  = null;
  protected boolean _GroupIdServSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose field */
  public    Integer GroupPurpose  = null;
  protected boolean _GroupPurposeSet = false;
  private String _objName = "EIHGMObjectData";
  /** Default constructor */
  public EIHGMObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public EIHGMObjectData (EIHGMObjectData other)
  {

    if (other == null) return;
    this.Key = new EIHGMObjectKeyData (other.Key);
    this.GroupId = other.GroupId;
    this._GroupIdSet = other._GroupIdSet;
    this.GroupIdServ = other.GroupIdServ;
    this._GroupIdServSet = other._GroupIdServSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.GroupPurpose = other.GroupPurpose;
    this._GroupPurposeSet = other._GroupPurposeSet;
  }

  /** get the Key for this object
   * @return EIHGMObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public EIHGMObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (EIHGMObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalId", "setExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalId", "setExternalId");
    }
    if (this.Key == null) this.Key = new EIHGMObjectKeyData ();
    this.Key.ExternalId = value;
    this.Key._ExternalIdSet = true;
  }
  /** get the value of the field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return String the value
   */
  public String getExternalId () {
    if (this.Key == null) return null;
    return this.Key.ExternalId;
  }
  /** Change the field to not being actively set: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   */
  public void unsetExternalId () {
    if (this.Key == null) return;
    this.Key._ExternalIdSet = false;
  }
  /** See if the field is actively set: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalId () {
    if (this.Key == null) return false;
    return this.Key._ExternalIdSet;
  }

  /** Retrieves the ExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalId field
   */
   public String getExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalId field from a formatted string
   *
   * @param _value the ExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalId field
   */
   public void setExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFromFormattedString");
   }

  /** set the fields value: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalIdType", "setExternalIdType");
    }
    if (this.Key == null) this.Key = new EIHGMObjectKeyData ();
    this.Key.ExternalIdType = value;
    this.Key._ExternalIdTypeSet = true;
  }
  /** get the value of the field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getExternalIdType () {
    if (this.Key == null) return null;
    return this.Key.ExternalIdType;
  }
  /** Change the field to not being actively set: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   */
  public void unsetExternalIdType () {
    if (this.Key == null) return;
    this.Key._ExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalIdType () {
    if (this.Key == null) return false;
    return this.Key._ExternalIdTypeSet;
  }

  /** Retrieves the ExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdType field
   */
   public String getExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalIdType field from a formatted string
   *
   * @param _value the ExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalIdType field
   */
   public void setExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFromFormattedString");
   }

  /** set the fields value: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    if (this.Key == null) this.Key = new EIHGMObjectKeyData ();
    this.Key.ActiveDate = value;
    this.Key._ActiveDateSet = true;
  }
  /** get the value of the field: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    if (this.Key == null) return null;
    return this.Key.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   */
  public void unsetActiveDate () {
    if (this.Key == null) return;
    this.Key._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    if (this.Key == null) return false;
    return this.Key._ActiveDateSet;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
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

  /** get the value of the field: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    return this.GroupId;
  }
  /** Change the field to not being actively set: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   */
  public void unsetGroupId () {
    this._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (EXTERNAL_ID_HQ_GROUPS_MAP.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    return this._GroupIdSet;
  }
  /** set the fields value: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
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

  /** get the value of the field: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    return this.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   */
  public void unsetGroupIdServ () {
    this._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    return this._GroupIdServSet;
  }
  /** set the fields value: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GroupPurpose") 
  public void setGroupPurpose (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupPurpose", "setGroupPurpose");
    }
    this.GroupPurpose = value;
    this._GroupPurposeSet = true;
  }

  /** Retrieves the GroupPurpose field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GroupPurpose field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GroupPurpose field
   */
   public String getGroupPurposeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupPurposeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGroupPurposeAsFormattedString");
       return fmtMgr.formatNumber(this.getGroupPurpose(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupPurpose");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGroupPurposeAsFormattedString");
       throw x;
     }
   }
  /** Sets the GroupPurpose field from a formatted string
   *
   * @param _value the GroupPurpose field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GroupPurpose field
   */
   public void setGroupPurposeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGroupPurposeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGroupPurpose(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GroupPurpose");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGroupPurposeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGroupPurposeFromFormattedString");
   }

  /** get the value of the field: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return Integer the value
   */
  public Integer getGroupPurpose () {
    return this.GroupPurpose;
  }
  /** Change the field to not being actively set: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   */
  public void unsetGroupPurpose () {
    this._GroupPurposeSet = false;
  }
  /** See if the field is actively set: GroupPurpose (EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupPurpose () {
    return this._GroupPurposeSet;
  }
  public String toString() {
    return EIHGMObjectHelper.toMap(this, null).toString();
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
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_id field */
    if(!nonNullOnly || (GroupId != null))  _GroupIdSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_id_serv field */
    if(!nonNullOnly || (GroupIdServ != null))  _GroupIdServSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.group_purpose field */
    if(!nonNullOnly || (GroupPurpose != null))  _GroupPurposeSet = flag;
  }
}
