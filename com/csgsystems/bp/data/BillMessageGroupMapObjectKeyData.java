/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectKeyData.java
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

/** BillMessageGroupMapObject's Key Data class. */
public class BillMessageGroupMapObjectKeyData  extends BaseObjectData
{
  /** BILL_MESSAGE_GROUPS.msg_grp_id field */
  public    Integer MsgGrpId  = null;
  protected boolean _MsgGrpIdSet = false;
  /** BILL_MESSAGE_GROUPS.message_id field */
  public    Integer MessageId  = null;
  protected boolean _MessageIdSet = false;
  /** BILL_MESSAGE_GROUPS.msg_sequence_num field */
  public    Integer MsgSequenceNum  = null;
  protected boolean _MsgSequenceNumSet = false;
  /** BILL_MESSAGE_GROUPS.geo_key field */
  public    String GeoKey  = null;
  protected boolean _GeoKeySet = false;
  /** BILL_MESSAGE_GROUPS.mkt_code field */
  public    Integer MktCode  = null;
  protected boolean _MktCodeSet = false;
  /** BILL_MESSAGE_GROUPS.service_center_id field */
  public    Integer ServiceCenterId  = null;
  protected boolean _ServiceCenterIdSet = false;
  /** BILL_MESSAGE_GROUPS.msg_foreign_key field */
  public    Integer MsgForeignKey  = null;
  protected boolean _MsgForeignKeySet = false;
  private String _objName = "BillMessageGroupMapObjectKeyData";
  /** default constructor */
  public BillMessageGroupMapObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public BillMessageGroupMapObjectKeyData (BillMessageGroupMapObjectKeyData other)
  {
    if (other == null) return;
    this.MsgGrpId = other.MsgGrpId;
    this._MsgGrpIdSet = other._MsgGrpIdSet;
    this.MessageId = other.MessageId;
    this._MessageIdSet = other._MessageIdSet;
    this.MsgSequenceNum = other.MsgSequenceNum;
    this._MsgSequenceNumSet = other._MsgSequenceNumSet;
    this.GeoKey = other.GeoKey;
    this._GeoKeySet = other._GeoKeySet;
    this.MktCode = other.MktCode;
    this._MktCodeSet = other._MktCodeSet;
    this.ServiceCenterId = other.ServiceCenterId;
    this._ServiceCenterIdSet = other._ServiceCenterIdSet;
    this.MsgForeignKey = other.MsgForeignKey;
    this._MsgForeignKeySet = other._MsgForeignKeySet;
  }
  /** set the fields value: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgGrpId") 
  public void setMsgGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgGrpId", "setMsgGrpId");
    }
    this.MsgGrpId = value;
    this._MsgGrpIdSet = true;
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

  /** get the value of the field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return Integer the value
   */
  public Integer getMsgGrpId () {
    return this.MsgGrpId;
  }
  /** Change the field to not being actively set: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   */
  public void unsetMsgGrpId () {
    this._MsgGrpIdSet = false;
  }
  /** See if the field is actively set: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgGrpId () {
    return this._MsgGrpIdSet;
  }
  /** set the fields value: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MessageId") 
  public void setMessageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageId", "setMessageId");
    }
    this.MessageId = value;
    this._MessageIdSet = true;
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

  /** get the value of the field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return Integer the value
   */
  public Integer getMessageId () {
    return this.MessageId;
  }
  /** Change the field to not being actively set: MessageId (BILL_MESSAGE_GROUPS.message_id)
   */
  public void unsetMessageId () {
    this._MessageIdSet = false;
  }
  /** See if the field is actively set: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageId () {
    return this._MessageIdSet;
  }
  /** set the fields value: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgSequenceNum") 
  public void setMsgSequenceNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgSequenceNum", "setMsgSequenceNum");
    }
    this.MsgSequenceNum = value;
    this._MsgSequenceNumSet = true;
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

  /** get the value of the field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return Integer the value
   */
  public Integer getMsgSequenceNum () {
    return this.MsgSequenceNum;
  }
  /** Change the field to not being actively set: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   */
  public void unsetMsgSequenceNum () {
    this._MsgSequenceNumSet = false;
  }
  /** See if the field is actively set: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgSequenceNum () {
    return this._MsgSequenceNumSet;
  }
  /** set the fields value: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GeoKey") 
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
    this.GeoKey = value;
    this._GeoKeySet = true;
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

  /** get the value of the field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return String the value
   */
  public String getGeoKey () {
    return this.GeoKey;
  }
  /** Change the field to not being actively set: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   */
  public void unsetGeoKey () {
    this._GeoKeySet = false;
  }
  /** See if the field is actively set: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeoKey () {
    return this._GeoKeySet;
  }
  /** set the fields value: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MktCode") 
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    this.MktCode = value;
    this._MktCodeSet = true;
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

  /** get the value of the field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    return this.MktCode;
  }
  /** Change the field to not being actively set: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   */
  public void unsetMktCode () {
    this._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    return this._MktCodeSet;
  }
  /** set the fields value: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceCenterId") 
  public void setServiceCenterId (Integer value) throws ServiceException
  {
    this.ServiceCenterId = value;
    this._ServiceCenterIdSet = true;
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

  /** get the value of the field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return Integer the value
   */
  public Integer getServiceCenterId () {
    return this.ServiceCenterId;
  }
  /** Change the field to not being actively set: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   */
  public void unsetServiceCenterId () {
    this._ServiceCenterIdSet = false;
  }
  /** See if the field is actively set: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterId () {
    return this._ServiceCenterIdSet;
  }
  /** set the fields value: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgForeignKey") 
  public void setMsgForeignKey (Integer value) throws ServiceException
  {
    this.MsgForeignKey = value;
    this._MsgForeignKeySet = true;
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

  /** get the value of the field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return Integer the value
   */
  public Integer getMsgForeignKey () {
    return this.MsgForeignKey;
  }
  /** Change the field to not being actively set: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   */
  public void unsetMsgForeignKey () {
    this._MsgForeignKeySet = false;
  }
  /** See if the field is actively set: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgForeignKey () {
    return this._MsgForeignKeySet;
  }
  public String toString() {
    return BillMessageGroupMapObjectKeyHelper.toMap(this, null).toString();
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
    
  /** BILL_MESSAGE_GROUPS.msg_grp_id field */
    if(!nonNullOnly || (MsgGrpId != null))  _MsgGrpIdSet = flag;
  /** BILL_MESSAGE_GROUPS.message_id field */
    if(!nonNullOnly || (MessageId != null))  _MessageIdSet = flag;
  /** BILL_MESSAGE_GROUPS.msg_sequence_num field */
    if(!nonNullOnly || (MsgSequenceNum != null))  _MsgSequenceNumSet = flag;
  /** BILL_MESSAGE_GROUPS.geo_key field */
    if(!nonNullOnly || (GeoKey != null))  _GeoKeySet = flag;
  /** BILL_MESSAGE_GROUPS.mkt_code field */
    if(!nonNullOnly || (MktCode != null))  _MktCodeSet = flag;
  /** BILL_MESSAGE_GROUPS.service_center_id field */
    if(!nonNullOnly || (ServiceCenterId != null))  _ServiceCenterIdSet = flag;
  /** BILL_MESSAGE_GROUPS.msg_foreign_key field */
    if(!nonNullOnly || (MsgForeignKey != null))  _MsgForeignKeySet = flag;
  }
}
