/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupUsageRedirectMapObjectData.java
 * Definition File: Catalog/HqgroupUsageRedirectMap.xml
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
  
/** HqGroupUsageRedirectMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqGroupUsageRedirectMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqGroupUsageRedirectMapObjectKeyData Key = null;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id field */
  public    String ExternalId  = null;
  protected boolean _ExternalIdSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type field */
  public    Integer ExternalIdType  = null;
  protected boolean _ExternalIdTypeSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.group_id field */
  public    Integer GroupId  = null;
  protected boolean _GroupIdSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv field */
  public    Integer GroupIdServ  = null;
  protected boolean _GroupIdServSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group field */
  public    Integer UsageRedirectGroup  = null;
  protected boolean _UsageRedirectGroupSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no field */
  public    Integer BalanceAccountInternalId  = null;
  protected boolean _BalanceAccountInternalIdSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.order_level field */
  public    Integer OrderLevel  = null;
  protected boolean _OrderLevelSet = false;
  private String _objName = "HqGroupUsageRedirectMapObjectData";
  /** Default constructor */
  public HqGroupUsageRedirectMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqGroupUsageRedirectMapObjectData (HqGroupUsageRedirectMapObjectData other)
  {

    if (other == null) return;
    this.Key = new HqGroupUsageRedirectMapObjectKeyData (other.Key);
    this.ExternalId = other.ExternalId;
    this._ExternalIdSet = other._ExternalIdSet;
    this.ExternalIdType = other.ExternalIdType;
    this._ExternalIdTypeSet = other._ExternalIdTypeSet;
    this.GroupId = other.GroupId;
    this._GroupIdSet = other._GroupIdSet;
    this.GroupIdServ = other.GroupIdServ;
    this._GroupIdServSet = other._GroupIdServSet;
    this.UsageRedirectGroup = other.UsageRedirectGroup;
    this._UsageRedirectGroupSet = other._UsageRedirectGroupSet;
    this.BalanceAccountInternalId = other.BalanceAccountInternalId;
    this._BalanceAccountInternalIdSet = other._BalanceAccountInternalIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.OrderLevel = other.OrderLevel;
    this._OrderLevelSet = other._OrderLevelSet;
  }

  /** get the Key for this object
   * @return HqGroupUsageRedirectMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqGroupUsageRedirectMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqGroupUsageRedirectMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupUsageRedirectMapObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
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
  /** set the fields value: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
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

  /** get the value of the field: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    return this.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   */
  public void unsetGroupId () {
    this._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUP_USAGE_REDIRECT_MAP.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    return this._GroupIdSet;
  }
  /** set the fields value: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
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

  /** get the value of the field: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    return this.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   */
  public void unsetGroupIdServ () {
    this._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    return this._GroupIdServSet;
  }
  /** set the fields value: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsageRedirectGroup") 
  public void setUsageRedirectGroup (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsageRedirectGroup", "setUsageRedirectGroup");
    }
    this.UsageRedirectGroup = value;
    this._UsageRedirectGroupSet = true;
  }

  /** Retrieves the UsageRedirectGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsageRedirectGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsageRedirectGroup field
   */
   public String getUsageRedirectGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageRedirectGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageRedirectGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getUsageRedirectGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageRedirectGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsageRedirectGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsageRedirectGroup field from a formatted string
   *
   * @param _value the UsageRedirectGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsageRedirectGroup field
   */
   public void setUsageRedirectGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageRedirectGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsageRedirectGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageRedirectGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsageRedirectGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsageRedirectGroupFromFormattedString");
   }

  /** get the value of the field: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return Integer the value
   */
  public Integer getUsageRedirectGroup () {
    return this.UsageRedirectGroup;
  }
  /** Change the field to not being actively set: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   */
  public void unsetUsageRedirectGroup () {
    this._UsageRedirectGroupSet = false;
  }
  /** See if the field is actively set: UsageRedirectGroup (HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsageRedirectGroup () {
    return this._UsageRedirectGroupSet;
  }
  /** set the fields value: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BalanceAccountInternalId") 
  public void setBalanceAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BalanceAccountInternalId", "setBalanceAccountInternalId");
    }
    this.BalanceAccountInternalId = value;
    this._BalanceAccountInternalIdSet = true;
  }

  /** Retrieves the BalanceAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BalanceAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BalanceAccountInternalId field
   */
   public String getBalanceAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBalanceAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBalanceAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BalanceAccountInternalId field from a formatted string
   *
   * @param _value the BalanceAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BalanceAccountInternalId field
   */
   public void setBalanceAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBalanceAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBalanceAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BalanceAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBalanceAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return Integer the value
   */
  public Integer getBalanceAccountInternalId () {
    return this.BalanceAccountInternalId;
  }
  /** Change the field to not being actively set: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   */
  public void unsetBalanceAccountInternalId () {
    this._BalanceAccountInternalIdSet = false;
  }
  /** See if the field is actively set: BalanceAccountInternalId (HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBalanceAccountInternalId () {
    return this._BalanceAccountInternalIdSet;
  }
  /** set the fields value: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
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

  /** get the value of the field: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
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

  /** get the value of the field: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrderLevel") 
  public void setOrderLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrderLevel", "setOrderLevel");
    }
    this.OrderLevel = value;
    this._OrderLevelSet = true;
  }

  /** Retrieves the OrderLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrderLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrderLevel field
   */
   public String getOrderLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrderLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getOrderLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrderLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrderLevel field from a formatted string
   *
   * @param _value the OrderLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrderLevel field
   */
   public void setOrderLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrderLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrderLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrderLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrderLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrderLevelFromFormattedString");
   }

  /** get the value of the field: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return Integer the value
   */
  public Integer getOrderLevel () {
    return this.OrderLevel;
  }
  /** Change the field to not being actively set: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   */
  public void unsetOrderLevel () {
    this._OrderLevelSet = false;
  }
  /** See if the field is actively set: OrderLevel (HQ_GROUP_USAGE_REDIRECT_MAP.order_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrderLevel () {
    return this._OrderLevelSet;
  }
  public String toString() {
    return HqGroupUsageRedirectMapObjectHelper.toMap(this, null).toString();
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
  /** HQ_GROUP_USAGE_REDIRECT_MAP.group_id field */
    if(!nonNullOnly || (GroupId != null))  _GroupIdSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.group_id_serv field */
    if(!nonNullOnly || (GroupIdServ != null))  _GroupIdServSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.usage_redirect_group field */
    if(!nonNullOnly || (UsageRedirectGroup != null))  _UsageRedirectGroupSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.balance_account_no field */
    if(!nonNullOnly || (BalanceAccountInternalId != null))  _BalanceAccountInternalIdSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** HQ_GROUP_USAGE_REDIRECT_MAP.order_level field */
    if(!nonNullOnly || (OrderLevel != null))  _OrderLevelSet = flag;
  }
}
