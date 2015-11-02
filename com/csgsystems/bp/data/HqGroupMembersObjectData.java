/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupMembersObjectData.java
 * Definition File: Catalog/HqGroupMembers.xml
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
  
/** HqGroupMembersObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqGroupMembersObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqGroupMembersObjectKeyData Key = null;
  /** EXTERNAL_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** EXTERNAL_ID_EQUIP_MAP.external_id field */
  public    String ServiceExternalId  = null;
  protected boolean _ServiceExternalIdSet = false;
  /** EXTERNAL_ID_EQUIP_MAP.external_id_type field */
  public    Integer ServiceExternalIdType  = null;
  protected boolean _ServiceExternalIdTypeSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id field */
  public    String ExternalId  = null;
  protected boolean _ExternalIdSet = false;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type field */
  public    Integer ExternalIdType  = null;
  protected boolean _ExternalIdTypeSet = false;
  /** HQ_GROUP_MEMBERS.group_id field */
  public    Integer GroupId  = null;
  protected boolean _GroupIdSet = false;
  /** HQ_GROUP_MEMBERS.group_id_serv field */
  public    Integer GroupIdServ  = null;
  protected boolean _GroupIdServSet = false;
  /** HQ_GROUP_MEMBERS.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** HQ_GROUP_MEMBERS.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** HQ_GROUP_MEMBERS.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** HQ_GROUP_MEMBERS.start_dt field */
  public    Date StartDt  = null;
  protected boolean _StartDtSet = false;
  /** HQ_GROUP_MEMBERS.end_dt field */
  public    Date EndDt  = null;
  protected boolean _EndDtSet = false;
  /** HQ_GROUP_MEMBERS.connect_reason field */
  public    Integer ConnectReason  = null;
  protected boolean _ConnectReasonSet = false;
  /** HQ_GROUP_MEMBERS.disconnect_reason field */
  public    Integer DisconnectReason  = null;
  protected boolean _DisconnectReasonSet = false;
  /** HQ_GROUP_MEMBERS.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** HQ_GROUP_MEMBERS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** HQ_GROUP_MEMBERS.proportion field */
  public    Integer Proportion  = null;
  protected boolean _ProportionSet = false;
  /** HQ_GROUP_MEMBERS.participation field */
  public    Integer Participation  = null;
  protected boolean _ParticipationSet = false;
  /** HQ_GROUP_MEMBERS.server_id field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  private String _objName = "HqGroupMembersObjectData";
  /** Default constructor */
  public HqGroupMembersObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqGroupMembersObjectData (HqGroupMembersObjectData other)
  {

    if (other == null) return;
    this.Key = new HqGroupMembersObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.ServiceExternalId = other.ServiceExternalId;
    this._ServiceExternalIdSet = other._ServiceExternalIdSet;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this._ServiceExternalIdTypeSet = other._ServiceExternalIdTypeSet;
    this.ExternalId = other.ExternalId;
    this._ExternalIdSet = other._ExternalIdSet;
    this.ExternalIdType = other.ExternalIdType;
    this._ExternalIdTypeSet = other._ExternalIdTypeSet;
    this.GroupId = other.GroupId;
    this._GroupIdSet = other._GroupIdSet;
    this.GroupIdServ = other.GroupIdServ;
    this._GroupIdServSet = other._GroupIdServSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.StartDt = other.StartDt;
    this._StartDtSet = other._StartDtSet;
    this.EndDt = other.EndDt;
    this._EndDtSet = other._EndDtSet;
    this.ConnectReason = other.ConnectReason;
    this._ConnectReasonSet = other._ConnectReasonSet;
    this.DisconnectReason = other.DisconnectReason;
    this._DisconnectReasonSet = other._DisconnectReasonSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.Proportion = other.Proportion;
    this._ProportionSet = other._ProportionSet;
    this.Participation = other.Participation;
    this._ParticipationSet = other._ParticipationSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
  }

  /** get the Key for this object
   * @return HqGroupMembersObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqGroupMembersObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqGroupMembersObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_GROUP_MEMBERS.tracking_id)
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

  /** set the fields value: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupMembersObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_GROUP_MEMBERS.tracking_id_serv)
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

  /** set the fields value: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalId") 
  public void setServiceExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    this.ServiceExternalId = value;
    this._ServiceExternalIdSet = true;
  }

  /** Retrieves the ServiceExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalId field
   */
   public String getServiceExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalId field from a formatted string
   *
   * @param _value the ServiceExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalId field
   */
   public void setServiceExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return String the value
   */
  public String getServiceExternalId () {
    return this.ServiceExternalId;
  }
  /** Change the field to not being actively set: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   */
  public void unsetServiceExternalId () {
    this._ServiceExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalId () {
    return this._ServiceExternalIdSet;
  }
  /** set the fields value: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalIdType") 
  public void setServiceExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalIdType", "setServiceExternalIdType");
    }
    this.ServiceExternalIdType = value;
    this._ServiceExternalIdTypeSet = true;
  }

  /** Retrieves the ServiceExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdType field
   */
   public String getServiceExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalIdType field from a formatted string
   *
   * @param _value the ServiceExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalIdType field
   */
   public void setServiceExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getServiceExternalIdType () {
    return this.ServiceExternalIdType;
  }
  /** Change the field to not being actively set: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   */
  public void unsetServiceExternalIdType () {
    this._ServiceExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalIdType () {
    return this._ServiceExternalIdTypeSet;
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
  /** set the fields value: GroupId (HQ_GROUP_MEMBERS.group_id)
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

  /** get the value of the field: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    return this.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUP_MEMBERS.group_id)
   */
  public void unsetGroupId () {
    this._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUP_MEMBERS.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    return this._GroupIdSet;
  }
  /** set the fields value: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
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

  /** get the value of the field: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    return this.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   */
  public void unsetGroupIdServ () {
    this._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUP_MEMBERS.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    return this._GroupIdServSet;
  }
  /** set the fields value: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
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

  /** get the value of the field: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (HQ_GROUP_MEMBERS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
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

  /** get the value of the field: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (HQ_GROUP_MEMBERS.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
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

  /** get the value of the field: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (HQ_GROUP_MEMBERS.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartDt") 
  public void setStartDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StartDt", "setStartDt");
    }
    this.StartDt = value;
    this._StartDtSet = true;
  }

  /** Retrieves the StartDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
   public String getStartDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedString");
       return fmtMgr.formatDate(this.getStartDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartDt field from a formatted string
   *
   * @param _value the StartDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
   public void setStartDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFromFormattedString");
   }

  /**
   * Retrieves the StartDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
  public String getStartDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStartDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDt field value from a formatted date/time string
   *
   * @param _value the StartDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
  public void setStartDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStartDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return Date the value
   */
  public Date getStartDt () {
    return this.StartDt;
  }
  /** Change the field to not being actively set: StartDt (HQ_GROUP_MEMBERS.start_dt)
   */
  public void unsetStartDt () {
    this._StartDtSet = false;
  }
  /** See if the field is actively set: StartDt (HQ_GROUP_MEMBERS.start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartDt () {
    return this._StartDtSet;
  }
  /** set the fields value: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EndDt") 
  public void setEndDt (Date value) throws ServiceException
  {
    this.EndDt = value;
    this._EndDtSet = true;
  }

  /** Retrieves the EndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
   public String getEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the EndDt field from a formatted string
   *
   * @param _value the EndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
   public void setEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFromFormattedString");
   }

  /**
   * Retrieves the EndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
  public String getEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDt field value from a formatted date/time string
   *
   * @param _value the EndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
  public void setEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return Date the value
   */
  public Date getEndDt () {
    return this.EndDt;
  }
  /** Change the field to not being actively set: EndDt (HQ_GROUP_MEMBERS.end_dt)
   */
  public void unsetEndDt () {
    this._EndDtSet = false;
  }
  /** See if the field is actively set: EndDt (HQ_GROUP_MEMBERS.end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndDt () {
    return this._EndDtSet;
  }
  /** set the fields value: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConnectReason") 
  public void setConnectReason (Integer value) throws ServiceException
  {
    this.ConnectReason = value;
    this._ConnectReasonSet = true;
  }

  /** Retrieves the ConnectReason field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConnectReason field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConnectReason field
   */
   public String getConnectReasonAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConnectReasonAsFormattedString");
       return fmtMgr.formatNumber(this.getConnectReason(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConnectReasonAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConnectReason field from a formatted string
   *
   * @param _value the ConnectReason field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConnectReason field
   */
   public void setConnectReasonFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConnectReasonFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConnectReason(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConnectReasonFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConnectReasonFromFormattedString");
   }

  /** get the value of the field: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return Integer the value
   */
  public Integer getConnectReason () {
    return this.ConnectReason;
  }
  /** Change the field to not being actively set: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   */
  public void unsetConnectReason () {
    this._ConnectReasonSet = false;
  }
  /** See if the field is actively set: ConnectReason (HQ_GROUP_MEMBERS.connect_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetConnectReason () {
    return this._ConnectReasonSet;
  }
  /** set the fields value: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisconnectReason") 
  public void setDisconnectReason (Integer value) throws ServiceException
  {
    this.DisconnectReason = value;
    this._DisconnectReasonSet = true;
  }

  /** Retrieves the DisconnectReason field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisconnectReason field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisconnectReason field
   */
   public String getDisconnectReasonAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisconnectReasonAsFormattedString");
       return fmtMgr.formatNumber(this.getDisconnectReason(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisconnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisconnectReasonAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisconnectReason field from a formatted string
   *
   * @param _value the DisconnectReason field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisconnectReason field
   */
   public void setDisconnectReasonFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisconnectReasonFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisconnectReason(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisconnectReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisconnectReasonFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisconnectReasonFromFormattedString");
   }

  /** get the value of the field: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return Integer the value
   */
  public Integer getDisconnectReason () {
    return this.DisconnectReason;
  }
  /** Change the field to not being actively set: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   */
  public void unsetDisconnectReason () {
    this._DisconnectReasonSet = false;
  }
  /** See if the field is actively set: DisconnectReason (HQ_GROUP_MEMBERS.disconnect_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisconnectReason () {
    return this._DisconnectReasonSet;
  }
  /** set the fields value: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
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

  /** get the value of the field: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (HQ_GROUP_MEMBERS.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (HQ_GROUP_MEMBERS.chg_who)
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

  /** get the value of the field: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (HQ_GROUP_MEMBERS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Proportion") 
  public void setProportion (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Proportion", "setProportion");
    }
    this.Proportion = value;
    this._ProportionSet = true;
  }

  /** Retrieves the Proportion field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Proportion field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Proportion field
   */
   public String getProportionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProportionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProportionAsFormattedString");
       return fmtMgr.formatNumber(this.getProportion(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Proportion");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProportionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Proportion field from a formatted string
   *
   * @param _value the Proportion field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Proportion field
   */
   public void setProportionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProportionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProportion(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Proportion");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProportionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProportionFromFormattedString");
   }

  /** get the value of the field: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return Integer the value
   */
  public Integer getProportion () {
    return this.Proportion;
  }
  /** Change the field to not being actively set: Proportion (HQ_GROUP_MEMBERS.proportion)
   */
  public void unsetProportion () {
    this._ProportionSet = false;
  }
  /** See if the field is actively set: Proportion (HQ_GROUP_MEMBERS.proportion)
   * @return boolean whether the field is actively set
   */
  public boolean issetProportion () {
    return this._ProportionSet;
  }
  /** set the fields value: Participation (HQ_GROUP_MEMBERS.participation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Participation") 
  public void setParticipation (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Participation", "setParticipation");
    }
    this.Participation = value;
    this._ParticipationSet = true;
  }

  /** Retrieves the Participation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Participation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Participation field
   */
   public String getParticipationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParticipationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParticipationAsFormattedString");
       return fmtMgr.formatNumber(this.getParticipation(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Participation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParticipationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Participation field from a formatted string
   *
   * @param _value the Participation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Participation field
   */
   public void setParticipationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParticipationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParticipation(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Participation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParticipationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParticipationFromFormattedString");
   }

  /** get the value of the field: Participation (HQ_GROUP_MEMBERS.participation)
   * @return Integer the value
   */
  public Integer getParticipation () {
    return this.Participation;
  }
  /** Change the field to not being actively set: Participation (HQ_GROUP_MEMBERS.participation)
   */
  public void unsetParticipation () {
    this._ParticipationSet = false;
  }
  /** See if the field is actively set: Participation (HQ_GROUP_MEMBERS.participation)
   * @return boolean whether the field is actively set
   */
  public boolean issetParticipation () {
    return this._ParticipationSet;
  }
  /** set the fields value: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerId") 
  public void setServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerId", "setServerId");
    }
    this.ServerId = value;
    this._ServerIdSet = true;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** get the value of the field: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId (HQ_GROUP_MEMBERS.server_id)
   */
  public void unsetServerId () {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (HQ_GROUP_MEMBERS.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    return this._ServerIdSet;
  }
  public String toString() {
    return HqGroupMembersObjectHelper.toMap(this, null).toString();
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
  /** EXTERNAL_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP.external_id field */
    if(!nonNullOnly || (ServiceExternalId != null))  _ServiceExternalIdSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP.external_id_type field */
    if(!nonNullOnly || (ServiceExternalIdType != null))  _ServiceExternalIdTypeSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id field */
    if(!nonNullOnly || (ExternalId != null))  _ExternalIdSet = flag;
  /** EXTERNAL_ID_HQ_GROUPS_MAP.external_id_type field */
    if(!nonNullOnly || (ExternalIdType != null))  _ExternalIdTypeSet = flag;
  /** HQ_GROUP_MEMBERS.group_id field */
    if(!nonNullOnly || (GroupId != null))  _GroupIdSet = flag;
  /** HQ_GROUP_MEMBERS.group_id_serv field */
    if(!nonNullOnly || (GroupIdServ != null))  _GroupIdServSet = flag;
  /** HQ_GROUP_MEMBERS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** HQ_GROUP_MEMBERS.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** HQ_GROUP_MEMBERS.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** HQ_GROUP_MEMBERS.start_dt field */
    if(!nonNullOnly || (StartDt != null))  _StartDtSet = flag;
  /** HQ_GROUP_MEMBERS.end_dt field */
    if(!nonNullOnly || (EndDt != null))  _EndDtSet = flag;
  /** HQ_GROUP_MEMBERS.connect_reason field */
    if(!nonNullOnly || (ConnectReason != null))  _ConnectReasonSet = flag;
  /** HQ_GROUP_MEMBERS.disconnect_reason field */
    if(!nonNullOnly || (DisconnectReason != null))  _DisconnectReasonSet = flag;
  /** HQ_GROUP_MEMBERS.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** HQ_GROUP_MEMBERS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** HQ_GROUP_MEMBERS.proportion field */
    if(!nonNullOnly || (Proportion != null))  _ProportionSet = flag;
  /** HQ_GROUP_MEMBERS.participation field */
    if(!nonNullOnly || (Participation != null))  _ParticipationSet = flag;
  /** HQ_GROUP_MEMBERS.server_id field */
    if(!nonNullOnly || (ServerId != null))  _ServerIdSet = flag;
  }
}
