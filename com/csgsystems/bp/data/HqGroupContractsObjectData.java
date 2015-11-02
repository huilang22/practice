/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupContractsObjectData.java
 * Definition File: Catalog/HqGroupContracts.xml
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
  
/** HqGroupContractsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class HqGroupContractsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public HqGroupContractsObjectKeyData Key = null;
  /** HQ_GROUP_CONTRACTS.group_id field */
  public    Integer GroupId  = null;
  protected boolean _GroupIdSet = false;
  /** HQ_GROUP_CONTRACTS.group_id_serv field */
  public    Integer GroupIdServ  = null;
  protected boolean _GroupIdServSet = false;
  /** HQ_GROUP_CONTRACTS.contract_type field */
  public    Integer ContractType  = null;
  protected boolean _ContractTypeSet = false;
  /** HQ_GROUP_CONTRACTS.start_dt field */
  public    Date StartDt  = null;
  protected boolean _StartDtSet = false;
  /** HQ_GROUP_CONTRACTS.end_dt field */
  public    Date EndDt  = null;
  protected boolean _EndDtSet = false;
  /** HQ_GROUP_CONTRACTS.contract_level field */
  public    Integer ContractLevel  = null;
  protected boolean _ContractLevelSet = false;
  /** HQ_GROUP_CONTRACTS.server_id field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_account_no field */
  public    Integer CntrctParentAccountNo  = null;
  protected boolean _CntrctParentAccountNoSet = false;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no field */
  public    Integer CntrctParentSubscrNo  = null;
  protected boolean _CntrctParentSubscrNoSet = false;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets field */
  public    Integer CntrctParentSubscrNoResets  = null;
  protected boolean _CntrctParentSubscrNoResetsSet = false;
  private String _objName = "HqGroupContractsObjectData";
  /** Default constructor */
  public HqGroupContractsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public HqGroupContractsObjectData (HqGroupContractsObjectData other)
  {

    if (other == null) return;
    this.Key = new HqGroupContractsObjectKeyData (other.Key);
    this.GroupId = other.GroupId;
    this._GroupIdSet = other._GroupIdSet;
    this.GroupIdServ = other.GroupIdServ;
    this._GroupIdServSet = other._GroupIdServSet;
    this.ContractType = other.ContractType;
    this._ContractTypeSet = other._ContractTypeSet;
    this.StartDt = other.StartDt;
    this._StartDtSet = other._StartDtSet;
    this.EndDt = other.EndDt;
    this._EndDtSet = other._EndDtSet;
    this.ContractLevel = other.ContractLevel;
    this._ContractLevelSet = other._ContractLevelSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.CntrctParentAccountNo = other.CntrctParentAccountNo;
    this._CntrctParentAccountNoSet = other._CntrctParentAccountNoSet;
    this.CntrctParentSubscrNo = other.CntrctParentSubscrNo;
    this._CntrctParentSubscrNoSet = other._CntrctParentSubscrNoSet;
    this.CntrctParentSubscrNoResets = other.CntrctParentSubscrNoResets;
    this._CntrctParentSubscrNoResetsSet = other._CntrctParentSubscrNoResetsSet;
  }

  /** get the Key for this object
   * @return HqGroupContractsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public HqGroupContractsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (HqGroupContractsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (HQ_GROUP_CONTRACTS.tracking_id)
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

  /** set the fields value: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new HqGroupContractsObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (HQ_GROUP_CONTRACTS.tracking_id_serv)
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

  /** set the fields value: GroupId (HQ_GROUP_CONTRACTS.group_id)
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

  /** get the value of the field: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @return Integer the value
   */
  public Integer getGroupId () {
    return this.GroupId;
  }
  /** Change the field to not being actively set: GroupId (HQ_GROUP_CONTRACTS.group_id)
   */
  public void unsetGroupId () {
    this._GroupIdSet = false;
  }
  /** See if the field is actively set: GroupId (HQ_GROUP_CONTRACTS.group_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupId () {
    return this._GroupIdSet;
  }
  /** set the fields value: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
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

  /** get the value of the field: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @return Integer the value
   */
  public Integer getGroupIdServ () {
    return this.GroupIdServ;
  }
  /** Change the field to not being actively set: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   */
  public void unsetGroupIdServ () {
    this._GroupIdServSet = false;
  }
  /** See if the field is actively set: GroupIdServ (HQ_GROUP_CONTRACTS.group_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetGroupIdServ () {
    return this._GroupIdServSet;
  }
  /** set the fields value: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractType") 
  public void setContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractType", "setContractType");
    }
    this.ContractType = value;
    this._ContractTypeSet = true;
  }

  /** Retrieves the ContractType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractType field
   */
   public String getContractTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getContractType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractType field from a formatted string
   *
   * @param _value the ContractType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractType field
   */
   public void setContractTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFromFormattedString");
   }

  /** get the value of the field: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return Integer the value
   */
  public Integer getContractType () {
    return this.ContractType;
  }
  /** Change the field to not being actively set: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   */
  public void unsetContractType () {
    this._ContractTypeSet = false;
  }
  /** See if the field is actively set: ContractType (HQ_GROUP_CONTRACTS.contract_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractType () {
    return this._ContractTypeSet;
  }
  /** set the fields value: StartDt (HQ_GROUP_CONTRACTS.start_dt)
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

  /** get the value of the field: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @return Date the value
   */
  public Date getStartDt () {
    return this.StartDt;
  }
  /** Change the field to not being actively set: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   */
  public void unsetStartDt () {
    this._StartDtSet = false;
  }
  /** See if the field is actively set: StartDt (HQ_GROUP_CONTRACTS.start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartDt () {
    return this._StartDtSet;
  }
  /** set the fields value: EndDt (HQ_GROUP_CONTRACTS.end_dt)
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

  /** get the value of the field: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @return Date the value
   */
  public Date getEndDt () {
    return this.EndDt;
  }
  /** Change the field to not being actively set: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   */
  public void unsetEndDt () {
    this._EndDtSet = false;
  }
  /** See if the field is actively set: EndDt (HQ_GROUP_CONTRACTS.end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndDt () {
    return this._EndDtSet;
  }
  /** set the fields value: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractLevel") 
  public void setContractLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractLevel", "setContractLevel");
    }
    this.ContractLevel = value;
    this._ContractLevelSet = true;
  }

  /** Retrieves the ContractLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractLevel field
   */
   public String getContractLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getContractLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractLevel field from a formatted string
   *
   * @param _value the ContractLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractLevel field
   */
   public void setContractLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractLevelFromFormattedString");
   }

  /** get the value of the field: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return Integer the value
   */
  public Integer getContractLevel () {
    return this.ContractLevel;
  }
  /** Change the field to not being actively set: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   */
  public void unsetContractLevel () {
    this._ContractLevelSet = false;
  }
  /** See if the field is actively set: ContractLevel (HQ_GROUP_CONTRACTS.contract_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractLevel () {
    return this._ContractLevelSet;
  }
  /** set the fields value: ServerId (HQ_GROUP_CONTRACTS.server_id)
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

  /** get the value of the field: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId (HQ_GROUP_CONTRACTS.server_id)
   */
  public void unsetServerId () {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (HQ_GROUP_CONTRACTS.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    return this._ServerIdSet;
  }
  /** set the fields value: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CntrctParentAccountNo") 
  public void setCntrctParentAccountNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CntrctParentAccountNo", "setCntrctParentAccountNo");
    }
    this.CntrctParentAccountNo = value;
    this._CntrctParentAccountNoSet = true;
  }

  /** Retrieves the CntrctParentAccountNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CntrctParentAccountNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentAccountNo field
   */
   public String getCntrctParentAccountNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentAccountNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentAccountNoAsFormattedString");
       return fmtMgr.formatNumber(this.getCntrctParentAccountNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentAccountNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the CntrctParentAccountNo field from a formatted string
   *
   * @param _value the CntrctParentAccountNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CntrctParentAccountNo field
   */
   public void setCntrctParentAccountNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentAccountNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCntrctParentAccountNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentAccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentAccountNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentAccountNoFromFormattedString");
   }

  /** get the value of the field: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return Integer the value
   */
  public Integer getCntrctParentAccountNo () {
    return this.CntrctParentAccountNo;
  }
  /** Change the field to not being actively set: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   */
  public void unsetCntrctParentAccountNo () {
    this._CntrctParentAccountNoSet = false;
  }
  /** See if the field is actively set: CntrctParentAccountNo (HQ_GROUP_CONTRACTS.cntrct_parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetCntrctParentAccountNo () {
    return this._CntrctParentAccountNoSet;
  }
  /** set the fields value: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CntrctParentSubscrNo") 
  public void setCntrctParentSubscrNo (Integer value) throws ServiceException
  {
    this.CntrctParentSubscrNo = value;
    this._CntrctParentSubscrNoSet = true;
  }

  /** Retrieves the CntrctParentSubscrNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CntrctParentSubscrNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentSubscrNo field
   */
   public String getCntrctParentSubscrNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentSubscrNoAsFormattedString");
       return fmtMgr.formatNumber(this.getCntrctParentSubscrNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentSubscrNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the CntrctParentSubscrNo field from a formatted string
   *
   * @param _value the CntrctParentSubscrNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CntrctParentSubscrNo field
   */
   public void setCntrctParentSubscrNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCntrctParentSubscrNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentSubscrNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentSubscrNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentSubscrNoFromFormattedString");
   }

  /** get the value of the field: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return Integer the value
   */
  public Integer getCntrctParentSubscrNo () {
    return this.CntrctParentSubscrNo;
  }
  /** Change the field to not being actively set: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   */
  public void unsetCntrctParentSubscrNo () {
    this._CntrctParentSubscrNoSet = false;
  }
  /** See if the field is actively set: CntrctParentSubscrNo (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetCntrctParentSubscrNo () {
    return this._CntrctParentSubscrNoSet;
  }
  /** set the fields value: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CntrctParentSubscrNoResets") 
  public void setCntrctParentSubscrNoResets (Integer value) throws ServiceException
  {
    this.CntrctParentSubscrNoResets = value;
    this._CntrctParentSubscrNoResetsSet = true;
  }

  /** Retrieves the CntrctParentSubscrNoResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CntrctParentSubscrNoResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CntrctParentSubscrNoResets field
   */
   public String getCntrctParentSubscrNoResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCntrctParentSubscrNoResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getCntrctParentSubscrNoResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCntrctParentSubscrNoResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the CntrctParentSubscrNoResets field from a formatted string
   *
   * @param _value the CntrctParentSubscrNoResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CntrctParentSubscrNoResets field
   */
   public void setCntrctParentSubscrNoResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCntrctParentSubscrNoResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCntrctParentSubscrNoResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CntrctParentSubscrNoResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCntrctParentSubscrNoResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCntrctParentSubscrNoResetsFromFormattedString");
   }

  /** get the value of the field: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return Integer the value
   */
  public Integer getCntrctParentSubscrNoResets () {
    return this.CntrctParentSubscrNoResets;
  }
  /** Change the field to not being actively set: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   */
  public void unsetCntrctParentSubscrNoResets () {
    this._CntrctParentSubscrNoResetsSet = false;
  }
  /** See if the field is actively set: CntrctParentSubscrNoResets (HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetCntrctParentSubscrNoResets () {
    return this._CntrctParentSubscrNoResetsSet;
  }
  public String toString() {
    return HqGroupContractsObjectHelper.toMap(this, null).toString();
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
  /** HQ_GROUP_CONTRACTS.group_id field */
    if(!nonNullOnly || (GroupId != null))  _GroupIdSet = flag;
  /** HQ_GROUP_CONTRACTS.group_id_serv field */
    if(!nonNullOnly || (GroupIdServ != null))  _GroupIdServSet = flag;
  /** HQ_GROUP_CONTRACTS.contract_type field */
    if(!nonNullOnly || (ContractType != null))  _ContractTypeSet = flag;
  /** HQ_GROUP_CONTRACTS.start_dt field */
    if(!nonNullOnly || (StartDt != null))  _StartDtSet = flag;
  /** HQ_GROUP_CONTRACTS.end_dt field */
    if(!nonNullOnly || (EndDt != null))  _EndDtSet = flag;
  /** HQ_GROUP_CONTRACTS.contract_level field */
    if(!nonNullOnly || (ContractLevel != null))  _ContractLevelSet = flag;
  /** HQ_GROUP_CONTRACTS.server_id field */
    if(!nonNullOnly || (ServerId != null))  _ServerIdSet = flag;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_account_no field */
    if(!nonNullOnly || (CntrctParentAccountNo != null))  _CntrctParentAccountNoSet = flag;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no field */
    if(!nonNullOnly || (CntrctParentSubscrNo != null))  _CntrctParentSubscrNoSet = flag;
  /** HQ_GROUP_CONTRACTS.cntrct_parent_subscr_no_resets field */
    if(!nonNullOnly || (CntrctParentSubscrNoResets != null))  _CntrctParentSubscrNoResetsSet = flag;
  }
}
