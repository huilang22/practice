/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupsObjectData.java
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
  
/** HqGroupsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqGroupsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqGroupsObjectKeyData Key = null;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id field */
  public    String ExternalId  = null;
  protected boolean _ExternalIdSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type field */
  public    Integer ExternalIdType  = null;
  protected boolean _ExternalIdTypeSet = false;
  /** HQ_GROUPS.owning_account_no field */
  public    Integer OwningAccountInternalId  = null;
  protected boolean _OwningAccountInternalIdSet = false;
  /** HQ_GROUPS.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** HQ_GROUPS.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** HQ_GROUPS.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** HQ_GROUPS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** HQ_GROUPS.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** HQ_GROUPS.next_bill_date field */
  public    Date NextBillDate  = null;
  protected boolean _NextBillDateSet = false;
  /** HQ_GROUPS.prev_cutoff_date field */
  public    Date PrevCutoffDate  = null;
  protected boolean _PrevCutoffDateSet = false;
  /** HQ_GROUPS.priority field */
  public    Integer Priority  = null;
  protected boolean _PrioritySet = false;
  /** HQ_GROUPS.group_purpose field */
  public    Integer GroupPurpose  = null;
  protected boolean _GroupPurposeSet = false;
  private String _objName = "HqGroupsObjectData";
  /** Default constructor */
  public HqGroupsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqGroupsObjectData (HqGroupsObjectData other)
  {

    if (other == null) return;
    this.Key = new HqGroupsObjectKeyData (other.Key);
    this.ExternalId = other.ExternalId;
    this._ExternalIdSet = other._ExternalIdSet;
    this.ExternalIdType = other.ExternalIdType;
    this._ExternalIdTypeSet = other._ExternalIdTypeSet;
    this.OwningAccountInternalId = other.OwningAccountInternalId;
    this._OwningAccountInternalIdSet = other._OwningAccountInternalIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.NextBillDate = other.NextBillDate;
    this._NextBillDateSet = other._NextBillDateSet;
    this.PrevCutoffDate = other.PrevCutoffDate;
    this._PrevCutoffDateSet = other._PrevCutoffDateSet;
    this.Priority = other.Priority;
    this._PrioritySet = other._PrioritySet;
    this.GroupPurpose = other.GroupPurpose;
    this._GroupPurposeSet = other._GroupPurposeSet;
  }

  /** get the Key for this object
   * @return HqGroupsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqGroupsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqGroupsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: GroupId (HQ_GROUPS.group_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGroupId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupId", "setGroupId");
    }
    if (this.Key == null) this.Key = new HqGroupsObjectKeyData ();
    this.Key.GroupId = value;
    this.Key._GroupIdSet = true;
  }
  /** get the value of the field: GroupId (HQ_GROUPS.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    if (this.Key == null) return null;
    return this.Key.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUPS.group_id)
   */
  public void unsetGroupId () {
    if (this.Key == null) return;
    this.Key._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUPS.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    if (this.Key == null) return false;
    return this.Key._GroupIdSet;
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

  /** set the fields value: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGroupIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GroupIdServ", "setGroupIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupsObjectKeyData ();
    this.Key.GroupIdServ = value;
    this.Key._GroupIdServSet = true;
  }
  /** get the value of the field: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    if (this.Key == null) return null;
    return this.Key.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUPS.group_id_serv)
   */
  public void unsetGroupIdServ () {
    if (this.Key == null) return;
    this.Key._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUPS.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    if (this.Key == null) return false;
    return this.Key._GroupIdServSet;
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

  /** set the fields value: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalId") 
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
    this.ExternalId = value;
    this._ExternalIdSet = true;
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

  /** get the value of the field: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return String the value
   */
  public String getExternalId () {
    return this.ExternalId;
  }
  /** Change the field to not being actively set: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   */
  public void unsetExternalId () {
    this._ExternalIdSet = false;
  }
  /** See if the field is actively set: ExternalId (EXTERNAL_ID_HQ_GROUPS_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalId () {
    return this._ExternalIdSet;
  }
  /** set the fields value: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalIdType") 
  public void setExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalIdType", "setExternalIdType");
    }
    this.ExternalIdType = value;
    this._ExternalIdTypeSet = true;
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

  /** get the value of the field: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getExternalIdType () {
    return this.ExternalIdType;
  }
  /** Change the field to not being actively set: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   */
  public void unsetExternalIdType () {
    this._ExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ExternalIdType (EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalIdType () {
    return this._ExternalIdTypeSet;
  }
  /** set the fields value: OwningAccountInternalId (HQ_GROUPS.owning_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwningAccountInternalId") 
  public void setOwningAccountInternalId (Integer value) throws ServiceException
  {
    this.OwningAccountInternalId = value;
    this._OwningAccountInternalIdSet = true;
  }

  /** Retrieves the OwningAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwningAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwningAccountInternalId field
   */
   public String getOwningAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOwningAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwningAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwningAccountInternalId field from a formatted string
   *
   * @param _value the OwningAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwningAccountInternalId field
   */
   public void setOwningAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwningAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwningAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwningAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwningAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwningAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: OwningAccountInternalId (HQ_GROUPS.owning_account_no)
   * @return Integer the value
   */
  public Integer getOwningAccountInternalId () {
    return this.OwningAccountInternalId;
  }
  /** Change the field to not being actively set: OwningAccountInternalId (HQ_GROUPS.owning_account_no)
   */
  public void unsetOwningAccountInternalId () {
    this._OwningAccountInternalIdSet = false;
  }
  /** See if the field is actively set: OwningAccountInternalId (HQ_GROUPS.owning_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwningAccountInternalId () {
    return this._OwningAccountInternalIdSet;
  }
  /** set the fields value: ActiveDt (HQ_GROUPS.active_dt)
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

  /** get the value of the field: ActiveDt (HQ_GROUPS.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (HQ_GROUPS.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (HQ_GROUPS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (HQ_GROUPS.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
    this.InactiveDt = value;
    this._InactiveDtSet = true;
  }

  /** Retrieves the InactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
   public String getInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDt field from a formatted string
   *
   * @param _value the InactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
   public void setInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the InactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
  public String getInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDt field value from a formatted date/time string
   *
   * @param _value the InactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
  public void setInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDt (HQ_GROUPS.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (HQ_GROUPS.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (HQ_GROUPS.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: ChgDt (HQ_GROUPS.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (HQ_GROUPS.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (HQ_GROUPS.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (HQ_GROUPS.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (HQ_GROUPS.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (HQ_GROUPS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (HQ_GROUPS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (HQ_GROUPS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: BillPeriod (HQ_GROUPS.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillPeriod", "setBillPeriod");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    this.BillPeriod = value;
    this._BillPeriodSet = true;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /** get the value of the field: BillPeriod (HQ_GROUPS.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (HQ_GROUPS.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (HQ_GROUPS.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: NextBillDate (HQ_GROUPS.next_bill_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NextBillDate") 
  public void setNextBillDate (Date value) throws ServiceException
  {
    this.NextBillDate = value;
    this._NextBillDateSet = true;
  }

  /** Retrieves the NextBillDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NextBillDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDate field
   */
   public String getNextBillDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateAsFormattedString");
       return fmtMgr.formatDate(this.getNextBillDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the NextBillDate field from a formatted string
   *
   * @param _value the NextBillDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextBillDate field
   */
   public void setNextBillDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNextBillDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NextBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextBillDateFromFormattedString");
   }

  /**
   * Retrieves the NextBillDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextBillDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextBillDate field
   */
  public String getNextBillDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getNextBillDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextBillDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextBillDate field value from a formatted date/time string
   *
   * @param _value the NextBillDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NextBillDate field
   */
  public void setNextBillDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextBillDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setNextBillDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextBillDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: NextBillDate (HQ_GROUPS.next_bill_date)
   * @return Date the value
   */
  public Date getNextBillDate () {
    return this.NextBillDate;
  }
  /** Change the field to not being actively set: NextBillDate (HQ_GROUPS.next_bill_date)
   */
  public void unsetNextBillDate () {
    this._NextBillDateSet = false;
  }
  /** See if the field is actively set: NextBillDate (HQ_GROUPS.next_bill_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetNextBillDate () {
    return this._NextBillDateSet;
  }
  /** set the fields value: PrevCutoffDate (HQ_GROUPS.prev_cutoff_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrevCutoffDate") 
  public void setPrevCutoffDate (Date value) throws ServiceException
  {
    this.PrevCutoffDate = value;
    this._PrevCutoffDateSet = true;
  }

  /** Retrieves the PrevCutoffDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
   public String getPrevCutoffDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrevCutoffDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevCutoffDate field from a formatted string
   *
   * @param _value the PrevCutoffDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
   public void setPrevCutoffDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevCutoffDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevCutoffDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevCutoffDateFromFormattedString");
   }

  /**
   * Retrieves the PrevCutoffDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevCutoffDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevCutoffDate field
   */
  public String getPrevCutoffDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrevCutoffDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevCutoffDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevCutoffDate field value from a formatted date/time string
   *
   * @param _value the PrevCutoffDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevCutoffDate field
   */
  public void setPrevCutoffDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrevCutoffDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevCutoffDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevCutoffDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PrevCutoffDate (HQ_GROUPS.prev_cutoff_date)
   * @return Date the value
   */
  public Date getPrevCutoffDate () {
    return this.PrevCutoffDate;
  }
  /** Change the field to not being actively set: PrevCutoffDate (HQ_GROUPS.prev_cutoff_date)
   */
  public void unsetPrevCutoffDate () {
    this._PrevCutoffDateSet = false;
  }
  /** See if the field is actively set: PrevCutoffDate (HQ_GROUPS.prev_cutoff_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevCutoffDate () {
    return this._PrevCutoffDateSet;
  }
  /** set the fields value: Priority (HQ_GROUPS.priority)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Priority") 
  public void setPriority (Integer value) throws ServiceException
  {
    this.Priority = value;
    this._PrioritySet = true;
  }

  /** Retrieves the Priority field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Priority field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Priority field
   */
   public String getPriorityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPriorityAsFormattedString");
       return fmtMgr.formatNumber(this.getPriority(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPriorityAsFormattedString");
       throw x;
     }
   }
  /** Sets the Priority field from a formatted string
   *
   * @param _value the Priority field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Priority field
   */
   public void setPriorityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPriorityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPriority(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Priority");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPriorityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPriorityFromFormattedString");
   }

  /** get the value of the field: Priority (HQ_GROUPS.priority)
   * @return Integer the value
   */
  public Integer getPriority () {
    return this.Priority;
  }
  /** Change the field to not being actively set: Priority (HQ_GROUPS.priority)
   */
  public void unsetPriority () {
    this._PrioritySet = false;
  }
  /** See if the field is actively set: Priority (HQ_GROUPS.priority)
   * @return boolean whether the field is actively set
   */
  public boolean issetPriority () {
    return this._PrioritySet;
  }
  /** set the fields value: GroupPurpose (HQ_GROUPS.group_purpose)
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

  /** get the value of the field: GroupPurpose (HQ_GROUPS.group_purpose)
   * @return Integer the value
   */
  public Integer getGroupPurpose () {
    return this.GroupPurpose;
  }
  /** Change the field to not being actively set: GroupPurpose (HQ_GROUPS.group_purpose)
   */
  public void unsetGroupPurpose () {
    this._GroupPurposeSet = false;
  }
  /** See if the field is actively set: GroupPurpose (HQ_GROUPS.group_purpose)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupPurpose () {
    return this._GroupPurposeSet;
  }
  public String toString() {
    return HqGroupsObjectHelper.toMap(this, null).toString();
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
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id field */
    if(!nonNullOnly || (ExternalId != null))  _ExternalIdSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type field */
    if(!nonNullOnly || (ExternalIdType != null))  _ExternalIdTypeSet = flag;
  /** HQ_GROUPS.owning_account_no field */
    if(!nonNullOnly || (OwningAccountInternalId != null))  _OwningAccountInternalIdSet = flag;
  /** HQ_GROUPS.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** HQ_GROUPS.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** HQ_GROUPS.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** HQ_GROUPS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** HQ_GROUPS.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** HQ_GROUPS.next_bill_date field */
    if(!nonNullOnly || (NextBillDate != null))  _NextBillDateSet = flag;
  /** HQ_GROUPS.prev_cutoff_date field */
    if(!nonNullOnly || (PrevCutoffDate != null))  _PrevCutoffDateSet = flag;
  /** HQ_GROUPS.priority field */
    if(!nonNullOnly || (Priority != null))  _PrioritySet = flag;
  /** HQ_GROUPS.group_purpose field */
    if(!nonNullOnly || (GroupPurpose != null))  _GroupPurposeSet = flag;
  }
}
