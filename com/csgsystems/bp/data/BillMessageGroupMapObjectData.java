/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectData.java
 * Definition File: Admin/BillMessageGroupMap.xml
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
  
/** BillMessageGroupMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillMessageGroupMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BillMessageGroupMapObjectKeyData Key = null;
  /** BILL_MESSAGE_GROUPS.msg_trigger_id field */
  public    Integer MsgTriggerId  = null;
  protected boolean _MsgTriggerIdSet = false;
  /** BILL_MESSAGE_GROUPS.active_dt field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** BILL_MESSAGE_GROUPS.inactive_dt field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** BILL_MESSAGE_GROUPS.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "BillMessageGroupMapObjectData";
  /** Default constructor */
  public BillMessageGroupMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillMessageGroupMapObjectData (BillMessageGroupMapObjectData other)
  {

    if (other == null) return;
    this.Key = new BillMessageGroupMapObjectKeyData (other.Key);
    this.MsgTriggerId = other.MsgTriggerId;
    this._MsgTriggerIdSet = other._MsgTriggerIdSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return BillMessageGroupMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BillMessageGroupMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BillMessageGroupMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgGrpId", "setMsgGrpId");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.MsgGrpId = value;
    this.Key._MsgGrpIdSet = true;
  }
  /** get the value of the field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return Integer the value
   */
  public Integer getMsgGrpId () {
    if (this.Key == null) return null;
    return this.Key.MsgGrpId;
  }
  /** Change the field to not being actively set: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   */
  public void unsetMsgGrpId () {
    if (this.Key == null) return;
    this.Key._MsgGrpIdSet = false;
  }
  /** See if the field is actively set: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgGrpId () {
    if (this.Key == null) return false;
    return this.Key._MsgGrpIdSet;
  }

  /** Retrieves the MsgGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpId field
   */
   public String getMsgGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgGrpId field from a formatted string
   *
   * @param _value the MsgGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgGrpId field
   */
   public void setMsgGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFromFormattedString");
   }

  /** set the fields value: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMessageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageId", "setMessageId");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.MessageId = value;
    this.Key._MessageIdSet = true;
  }
  /** get the value of the field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return Integer the value
   */
  public Integer getMessageId () {
    if (this.Key == null) return null;
    return this.Key.MessageId;
  }
  /** Change the field to not being actively set: MessageId (BILL_MESSAGE_GROUPS.message_id)
   */
  public void unsetMessageId () {
    if (this.Key == null) return;
    this.Key._MessageIdSet = false;
  }
  /** See if the field is actively set: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageId () {
    if (this.Key == null) return false;
    return this.Key._MessageIdSet;
  }

  /** Retrieves the MessageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MessageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageId field
   */
   public String getMessageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMessageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MessageId field from a formatted string
   *
   * @param _value the MessageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MessageId field
   */
   public void setMessageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMessageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageIdFromFormattedString");
   }

  /** set the fields value: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgSequenceNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgSequenceNum", "setMsgSequenceNum");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.MsgSequenceNum = value;
    this.Key._MsgSequenceNumSet = true;
  }
  /** get the value of the field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return Integer the value
   */
  public Integer getMsgSequenceNum () {
    if (this.Key == null) return null;
    return this.Key.MsgSequenceNum;
  }
  /** Change the field to not being actively set: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   */
  public void unsetMsgSequenceNum () {
    if (this.Key == null) return;
    this.Key._MsgSequenceNumSet = false;
  }
  /** See if the field is actively set: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgSequenceNum () {
    if (this.Key == null) return false;
    return this.Key._MsgSequenceNumSet;
  }

  /** Retrieves the MsgSequenceNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgSequenceNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgSequenceNum field
   */
   public String getMsgSequenceNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgSequenceNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgSequenceNumAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgSequenceNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgSequenceNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgSequenceNum field from a formatted string
   *
   * @param _value the MsgSequenceNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgSequenceNum field
   */
   public void setMsgSequenceNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgSequenceNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgSequenceNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgSequenceNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgSequenceNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgSequenceNumFromFormattedString");
   }

  /** set the fields value: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGeoKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GeoKey", "setGeoKey");
    }
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GeoKey", "setGeoKey");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.GeoKey = value;
    this.Key._GeoKeySet = true;
  }
  /** get the value of the field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return String the value
   */
  public String getGeoKey () {
    if (this.Key == null) return null;
    return this.Key.GeoKey;
  }
  /** Change the field to not being actively set: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   */
  public void unsetGeoKey () {
    if (this.Key == null) return;
    this.Key._GeoKeySet = false;
  }
  /** See if the field is actively set: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeoKey () {
    if (this.Key == null) return false;
    return this.Key._GeoKeySet;
  }

  /** Retrieves the GeoKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GeoKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GeoKey field
   */
   public String getGeoKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeoKeyAsFormattedString");
       return fmtMgr.formatString(this.getGeoKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeoKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the GeoKey field from a formatted string
   *
   * @param _value the GeoKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GeoKey field
   */
   public void setGeoKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeoKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeoKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GeoKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeoKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeoKeyFromFormattedString");
   }

  /** set the fields value: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.MktCode = value;
    this.Key._MktCodeSet = true;
  }
  /** get the value of the field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Change the field to not being actively set: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   */
  public void unsetMktCode () {
    if (this.Key == null) return;
    this.Key._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    if (this.Key == null) return false;
    return this.Key._MktCodeSet;
  }

  /** Retrieves the MktCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MktCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCode field
   */
   public String getMktCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getMktCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MktCode field from a formatted string
   *
   * @param _value the MktCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MktCode field
   */
   public void setMktCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMktCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFromFormattedString");
   }

  /** set the fields value: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceCenterId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceCenterId", "setServiceCenterId");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.ServiceCenterId = value;
    this.Key._ServiceCenterIdSet = true;
  }
  /** get the value of the field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return Integer the value
   */
  public Integer getServiceCenterId () {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterId;
  }
  /** Change the field to not being actively set: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   */
  public void unsetServiceCenterId () {
    if (this.Key == null) return;
    this.Key._ServiceCenterIdSet = false;
  }
  /** See if the field is actively set: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterId () {
    if (this.Key == null) return false;
    return this.Key._ServiceCenterIdSet;
  }

  /** Retrieves the ServiceCenterId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceCenterId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterId field
   */
   public String getServiceCenterIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceCenterId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceCenterId field from a formatted string
   *
   * @param _value the ServiceCenterId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceCenterId field
   */
   public void setServiceCenterIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceCenterId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterIdFromFormattedString");
   }

  /** set the fields value: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgForeignKey (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgForeignKey", "setMsgForeignKey");
    }
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyData ();
    this.Key.MsgForeignKey = value;
    this.Key._MsgForeignKeySet = true;
  }
  /** get the value of the field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return Integer the value
   */
  public Integer getMsgForeignKey () {
    if (this.Key == null) return null;
    return this.Key.MsgForeignKey;
  }
  /** Change the field to not being actively set: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   */
  public void unsetMsgForeignKey () {
    if (this.Key == null) return;
    this.Key._MsgForeignKeySet = false;
  }
  /** See if the field is actively set: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgForeignKey () {
    if (this.Key == null) return false;
    return this.Key._MsgForeignKeySet;
  }

  /** Retrieves the MsgForeignKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgForeignKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgForeignKey field
   */
   public String getMsgForeignKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgForeignKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgForeignKeyAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgForeignKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgForeignKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgForeignKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgForeignKey field from a formatted string
   *
   * @param _value the MsgForeignKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgForeignKey field
   */
   public void setMsgForeignKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgForeignKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgForeignKey(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgForeignKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgForeignKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgForeignKeyFromFormattedString");
   }

  /** set the fields value: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgTriggerId") 
  public void setMsgTriggerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgTriggerId", "setMsgTriggerId");
    }
    this.MsgTriggerId = value;
    this._MsgTriggerIdSet = true;
  }

  /** Retrieves the MsgTriggerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgTriggerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgTriggerId field
   */
   public String getMsgTriggerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgTriggerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgTriggerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgTriggerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgTriggerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgTriggerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgTriggerId field from a formatted string
   *
   * @param _value the MsgTriggerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgTriggerId field
   */
   public void setMsgTriggerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgTriggerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgTriggerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgTriggerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgTriggerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgTriggerIdFromFormattedString");
   }

  /** get the value of the field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return Integer the value
   */
  public Integer getMsgTriggerId () {
    return this.MsgTriggerId;
  }
  /** Change the field to not being actively set: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   */
  public void unsetMsgTriggerId () {
    this._MsgTriggerIdSet = false;
  }
  /** See if the field is actively set: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgTriggerId () {
    return this._MsgTriggerIdSet;
  }
  /** set the fields value: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDate") 
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    this.ActiveDate = value;
    this._ActiveDateSet = true;
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

  /** get the value of the field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
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

  /** get the value of the field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return BillMessageGroupMapObjectHelper.toMap(this, null).toString();
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
  /** BILL_MESSAGE_GROUPS.msg_trigger_id field */
    if(!nonNullOnly || (MsgTriggerId != null))  _MsgTriggerIdSet = flag;
  /** BILL_MESSAGE_GROUPS.active_dt field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** BILL_MESSAGE_GROUPS.inactive_dt field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** BILL_MESSAGE_GROUPS.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
