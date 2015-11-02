/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectData.java
 * Definition File: Customer/ClearingHouseContacts.xml
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
  
/** ClearingHouseContactsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ClearingHouseContactsObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ClearingHouseContactsObjectKeyData Key = null;
  /** CLEARING_HOUSE_CONTACTS.clearing_house_id field */
  public    String ClearingHouseId  = null;
  protected boolean _ClearingHouseIdSet = false;
  /** CLEARING_HOUSE_CONTACTS.module field */
  public    String Module  = null;
  protected boolean _ModuleSet = false;
  /** CLEARING_HOUSE_CONTACTS.is_send field */
  public    Integer IsSend  = null;
  protected boolean _IsSendSet = false;
  /** CLEARING_HOUSE_CONTACTS.ch_format_type field */
  public    Integer ChFormatType  = null;
  protected boolean _ChFormatTypeSet = false;
  /** CLEARING_HOUSE_CONTACTS.credit_trans_type field */
  public    Integer CreditTransType  = null;
  protected boolean _CreditTransTypeSet = false;
  /** CLEARING_HOUSE_CONTACTS.debit_trans_type field */
  public    Integer DebitTransType  = null;
  protected boolean _DebitTransTypeSet = false;
  /** CLEARING_HOUSE_CONTACTS.allow_auto_post field */
  public    Boolean AllowAutoPost  = null;
  protected boolean _AllowAutoPostSet = false;
  /** CLEARING_HOUSE_CONTACTS.auto_post_delay field */
  public    Integer AutoPostDelay  = null;
  protected boolean _AutoPostDelaySet = false;
  /** CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay field */
  public    Integer ChgbResubmitDelay  = null;
  protected boolean _ChgbResubmitDelaySet = false;
  /** CLEARING_HOUSE_CONTACTS.collection_delay field */
  public    Integer CollectionDelay  = null;
  protected boolean _CollectionDelaySet = false;
  /** CLEARING_HOUSE_CONTACTS.suppress_prenotes field */
  public    Boolean SuppressPrenotes  = null;
  protected boolean _SuppressPrenotesSet = false;
  /** CLEARING_HOUSE_CONTACTS.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "ClearingHouseContactsObjectData";
  /** Default constructor */
  public ClearingHouseContactsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ClearingHouseContactsObjectData (ClearingHouseContactsObjectData other)
  {

    if (other == null) return;
    this.Key = new ClearingHouseContactsObjectKeyData (other.Key);
    this.ClearingHouseId = other.ClearingHouseId;
    this._ClearingHouseIdSet = other._ClearingHouseIdSet;
    this.Module = other.Module;
    this._ModuleSet = other._ModuleSet;
    this.IsSend = other.IsSend;
    this._IsSendSet = other._IsSendSet;
    this.ChFormatType = other.ChFormatType;
    this._ChFormatTypeSet = other._ChFormatTypeSet;
    this.CreditTransType = other.CreditTransType;
    this._CreditTransTypeSet = other._CreditTransTypeSet;
    this.DebitTransType = other.DebitTransType;
    this._DebitTransTypeSet = other._DebitTransTypeSet;
    this.AllowAutoPost = other.AllowAutoPost;
    this._AllowAutoPostSet = other._AllowAutoPostSet;
    this.AutoPostDelay = other.AutoPostDelay;
    this._AutoPostDelaySet = other._AutoPostDelaySet;
    this.ChgbResubmitDelay = other.ChgbResubmitDelay;
    this._ChgbResubmitDelaySet = other._ChgbResubmitDelaySet;
    this.CollectionDelay = other.CollectionDelay;
    this._CollectionDelaySet = other._CollectionDelaySet;
    this.SuppressPrenotes = other.SuppressPrenotes;
    this._SuppressPrenotesSet = other._SuppressPrenotesSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return ClearingHouseContactsObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ClearingHouseContactsObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ClearingHouseContactsObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setExtContactId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExtContactId", "setExtContactId");
    }
    if (this.Key == null) this.Key = new ClearingHouseContactsObjectKeyData ();
    this.Key.ExtContactId = value;
    this.Key._ExtContactIdSet = true;
  }
  /** get the value of the field: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return Integer the value
   */
  public Integer getExtContactId () {
    if (this.Key == null) return null;
    return this.Key.ExtContactId;
  }
  /** Change the field to not being actively set: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   */
  public void unsetExtContactId () {
    if (this.Key == null) return;
    this.Key._ExtContactIdSet = false;
  }
  /** See if the field is actively set: ExtContactId (CLEARING_HOUSE_CONTACTS.ext_contact_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExtContactId () {
    if (this.Key == null) return false;
    return this.Key._ExtContactIdSet;
  }

  /** Retrieves the ExtContactId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExtContactId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtContactId field
   */
   public String getExtContactIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtContactIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtContactIdAsFormattedString");
       return fmtMgr.formatNumber(this.getExtContactId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtContactIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExtContactId field from a formatted string
   *
   * @param _value the ExtContactId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExtContactId field
   */
   public void setExtContactIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtContactIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExtContactId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtContactIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtContactIdFromFormattedString");
   }

  /** set the fields value: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClearingHouseId") 
  public void setClearingHouseId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    this.ClearingHouseId = value;
    this._ClearingHouseIdSet = true;
  }

  /** Retrieves the ClearingHouseId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ClearingHouseId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClearingHouseId field
   */
   public String getClearingHouseIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdAsFormattedString");
       return fmtMgr.formatString(this.getClearingHouseId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ClearingHouseId field from a formatted string
   *
   * @param _value the ClearingHouseId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClearingHouseId field
   */
   public void setClearingHouseIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setClearingHouseId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFromFormattedString");
   }

  /** get the value of the field: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return String the value
   */
  public String getClearingHouseId () {
    return this.ClearingHouseId;
  }
  /** Change the field to not being actively set: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   */
  public void unsetClearingHouseId () {
    this._ClearingHouseIdSet = false;
  }
  /** See if the field is actively set: ClearingHouseId (CLEARING_HOUSE_CONTACTS.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetClearingHouseId () {
    return this._ClearingHouseIdSet;
  }
  /** set the fields value: Module (CLEARING_HOUSE_CONTACTS.module)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Module") 
  public void setModule (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Module", "setModule");
    }
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Module", "setModule");
    }
    this.Module = value;
    this._ModuleSet = true;
  }

  /** Retrieves the Module field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Module field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Module field
   */
   public String getModuleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getModuleAsFormattedString");
       return fmtMgr.formatString(this.getModule());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Module");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getModuleAsFormattedString");
       throw x;
     }
   }
  /** Sets the Module field from a formatted string
   *
   * @param _value the Module field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Module field
   */
   public void setModuleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getModuleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setModule(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Module");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setModuleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setModuleFromFormattedString");
   }

  /** get the value of the field: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return String the value
   */
  public String getModule () {
    return this.Module;
  }
  /** Change the field to not being actively set: Module (CLEARING_HOUSE_CONTACTS.module)
   */
  public void unsetModule () {
    this._ModuleSet = false;
  }
  /** See if the field is actively set: Module (CLEARING_HOUSE_CONTACTS.module)
   * @return boolean whether the field is actively set
   */
  public boolean issetModule () {
    return this._ModuleSet;
  }
  /** set the fields value: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsSend") 
  public void setIsSend (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsSend", "setIsSend");
    }
    this.IsSend = value;
    this._IsSendSet = true;
  }

  /** Retrieves the IsSend field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsSend field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSend field
   */
   public String getIsSendAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSendAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSendAsFormattedString");
       return fmtMgr.formatNumber(this.getIsSend(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSendAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsSend field from a formatted string
   *
   * @param _value the IsSend field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsSend field
   */
   public void setIsSendFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSendFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsSend(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSend");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSendFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSendFromFormattedString");
   }

  /** get the value of the field: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return Integer the value
   */
  public Integer getIsSend () {
    return this.IsSend;
  }
  /** Change the field to not being actively set: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   */
  public void unsetIsSend () {
    this._IsSendSet = false;
  }
  /** See if the field is actively set: IsSend (CLEARING_HOUSE_CONTACTS.is_send)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsSend () {
    return this._IsSendSet;
  }
  /** set the fields value: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChFormatType") 
  public void setChFormatType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChFormatType", "setChFormatType");
    }
    this.ChFormatType = value;
    this._ChFormatTypeSet = true;
  }

  /** Retrieves the ChFormatType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChFormatType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChFormatType field
   */
   public String getChFormatTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChFormatTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChFormatTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getChFormatType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChFormatType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChFormatTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChFormatType field from a formatted string
   *
   * @param _value the ChFormatType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChFormatType field
   */
   public void setChFormatTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChFormatTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChFormatType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChFormatType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChFormatTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChFormatTypeFromFormattedString");
   }

  /** get the value of the field: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return Integer the value
   */
  public Integer getChFormatType () {
    return this.ChFormatType;
  }
  /** Change the field to not being actively set: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   */
  public void unsetChFormatType () {
    this._ChFormatTypeSet = false;
  }
  /** See if the field is actively set: ChFormatType (CLEARING_HOUSE_CONTACTS.ch_format_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetChFormatType () {
    return this._ChFormatTypeSet;
  }
  /** set the fields value: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreditTransType") 
  public void setCreditTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreditTransType", "setCreditTransType");
    }
    this.CreditTransType = value;
    this._CreditTransTypeSet = true;
  }

  /** Retrieves the CreditTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreditTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreditTransType field
   */
   public String getCreditTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreditTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCreditTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreditTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreditTransType field from a formatted string
   *
   * @param _value the CreditTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreditTransType field
   */
   public void setCreditTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreditTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreditTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreditTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreditTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreditTransTypeFromFormattedString");
   }

  /** get the value of the field: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return Integer the value
   */
  public Integer getCreditTransType () {
    return this.CreditTransType;
  }
  /** Change the field to not being actively set: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   */
  public void unsetCreditTransType () {
    this._CreditTransTypeSet = false;
  }
  /** See if the field is actively set: CreditTransType (CLEARING_HOUSE_CONTACTS.credit_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreditTransType () {
    return this._CreditTransTypeSet;
  }
  /** set the fields value: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DebitTransType") 
  public void setDebitTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DebitTransType", "setDebitTransType");
    }
    this.DebitTransType = value;
    this._DebitTransTypeSet = true;
  }

  /** Retrieves the DebitTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DebitTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DebitTransType field
   */
   public String getDebitTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDebitTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDebitTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDebitTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DebitTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDebitTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DebitTransType field from a formatted string
   *
   * @param _value the DebitTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DebitTransType field
   */
   public void setDebitTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDebitTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDebitTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DebitTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDebitTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDebitTransTypeFromFormattedString");
   }

  /** get the value of the field: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return Integer the value
   */
  public Integer getDebitTransType () {
    return this.DebitTransType;
  }
  /** Change the field to not being actively set: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   */
  public void unsetDebitTransType () {
    this._DebitTransTypeSet = false;
  }
  /** See if the field is actively set: DebitTransType (CLEARING_HOUSE_CONTACTS.debit_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDebitTransType () {
    return this._DebitTransTypeSet;
  }
  /** set the fields value: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AllowAutoPost") 
  public void setAllowAutoPost (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AllowAutoPost", "setAllowAutoPost");
    }
    this.AllowAutoPost = value;
    this._AllowAutoPostSet = true;
  }

  /** Retrieves the AllowAutoPost field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AllowAutoPost field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAutoPost field
   */
   public String getAllowAutoPostAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutoPostAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAutoPostAsFormattedString");
       return fmtMgr.formatBoolean(this.getAllowAutoPost());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAutoPost");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAutoPostAsFormattedString");
       throw x;
     }
   }
  /** Sets the AllowAutoPost field from a formatted string
   *
   * @param _value the AllowAutoPost field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AllowAutoPost field
   */
   public void setAllowAutoPostFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutoPostFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAllowAutoPost(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AllowAutoPost");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAutoPostFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAutoPostFromFormattedString");
   }

  /** get the value of the field: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return Boolean the value
   */
  public Boolean getAllowAutoPost () {
    return this.AllowAutoPost;
  }
  /** Change the field to not being actively set: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   */
  public void unsetAllowAutoPost () {
    this._AllowAutoPostSet = false;
  }
  /** See if the field is actively set: AllowAutoPost (CLEARING_HOUSE_CONTACTS.allow_auto_post)
   * @return boolean whether the field is actively set
   */
  public boolean issetAllowAutoPost () {
    return this._AllowAutoPostSet;
  }
  /** set the fields value: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AutoPostDelay") 
  public void setAutoPostDelay (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AutoPostDelay", "setAutoPostDelay");
    }
    this.AutoPostDelay = value;
    this._AutoPostDelaySet = true;
  }

  /** Retrieves the AutoPostDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AutoPostDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AutoPostDelay field
   */
   public String getAutoPostDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoPostDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAutoPostDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getAutoPostDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AutoPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAutoPostDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the AutoPostDelay field from a formatted string
   *
   * @param _value the AutoPostDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AutoPostDelay field
   */
   public void setAutoPostDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAutoPostDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAutoPostDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AutoPostDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAutoPostDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAutoPostDelayFromFormattedString");
   }

  /** get the value of the field: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return Integer the value
   */
  public Integer getAutoPostDelay () {
    return this.AutoPostDelay;
  }
  /** Change the field to not being actively set: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   */
  public void unsetAutoPostDelay () {
    this._AutoPostDelaySet = false;
  }
  /** See if the field is actively set: AutoPostDelay (CLEARING_HOUSE_CONTACTS.auto_post_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetAutoPostDelay () {
    return this._AutoPostDelaySet;
  }
  /** set the fields value: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgbResubmitDelay") 
  public void setChgbResubmitDelay (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgbResubmitDelay", "setChgbResubmitDelay");
    }
    this.ChgbResubmitDelay = value;
    this._ChgbResubmitDelaySet = true;
  }

  /** Retrieves the ChgbResubmitDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgbResubmitDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgbResubmitDelay field
   */
   public String getChgbResubmitDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgbResubmitDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgbResubmitDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getChgbResubmitDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgbResubmitDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgbResubmitDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgbResubmitDelay field from a formatted string
   *
   * @param _value the ChgbResubmitDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgbResubmitDelay field
   */
   public void setChgbResubmitDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgbResubmitDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgbResubmitDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgbResubmitDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgbResubmitDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgbResubmitDelayFromFormattedString");
   }

  /** get the value of the field: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return Integer the value
   */
  public Integer getChgbResubmitDelay () {
    return this.ChgbResubmitDelay;
  }
  /** Change the field to not being actively set: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   */
  public void unsetChgbResubmitDelay () {
    this._ChgbResubmitDelaySet = false;
  }
  /** See if the field is actively set: ChgbResubmitDelay (CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgbResubmitDelay () {
    return this._ChgbResubmitDelaySet;
  }
  /** set the fields value: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionDelay") 
  public void setCollectionDelay (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CollectionDelay", "setCollectionDelay");
    }
    this.CollectionDelay = value;
    this._CollectionDelaySet = true;
  }

  /** Retrieves the CollectionDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionDelay field
   */
   public String getCollectionDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getCollectionDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionDelay field from a formatted string
   *
   * @param _value the CollectionDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionDelay field
   */
   public void setCollectionDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionDelayFromFormattedString");
   }

  /** get the value of the field: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return Integer the value
   */
  public Integer getCollectionDelay () {
    return this.CollectionDelay;
  }
  /** Change the field to not being actively set: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   */
  public void unsetCollectionDelay () {
    this._CollectionDelaySet = false;
  }
  /** See if the field is actively set: CollectionDelay (CLEARING_HOUSE_CONTACTS.collection_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionDelay () {
    return this._CollectionDelaySet;
  }
  /** set the fields value: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SuppressPrenotes") 
  public void setSuppressPrenotes (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SuppressPrenotes", "setSuppressPrenotes");
    }
    this.SuppressPrenotes = value;
    this._SuppressPrenotesSet = true;
  }

  /** Retrieves the SuppressPrenotes field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SuppressPrenotes field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SuppressPrenotes field
   */
   public String getSuppressPrenotesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSuppressPrenotesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSuppressPrenotesAsFormattedString");
       return fmtMgr.formatBoolean(this.getSuppressPrenotes());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SuppressPrenotes");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSuppressPrenotesAsFormattedString");
       throw x;
     }
   }
  /** Sets the SuppressPrenotes field from a formatted string
   *
   * @param _value the SuppressPrenotes field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SuppressPrenotes field
   */
   public void setSuppressPrenotesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSuppressPrenotesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSuppressPrenotes(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SuppressPrenotes");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSuppressPrenotesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSuppressPrenotesFromFormattedString");
   }

  /** get the value of the field: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return Boolean the value
   */
  public Boolean getSuppressPrenotes () {
    return this.SuppressPrenotes;
  }
  /** Change the field to not being actively set: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   */
  public void unsetSuppressPrenotes () {
    this._SuppressPrenotesSet = false;
  }
  /** See if the field is actively set: SuppressPrenotes (CLEARING_HOUSE_CONTACTS.suppress_prenotes)
   * @return boolean whether the field is actively set
   */
  public boolean issetSuppressPrenotes () {
    return this._SuppressPrenotesSet;
  }
  /** set the fields value: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
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

  /** get the value of the field: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (CLEARING_HOUSE_CONTACTS.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return ClearingHouseContactsObjectHelper.toMap(this, null).toString();
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
  /** CLEARING_HOUSE_CONTACTS.clearing_house_id field */
    if(!nonNullOnly || (ClearingHouseId != null))  _ClearingHouseIdSet = flag;
  /** CLEARING_HOUSE_CONTACTS.module field */
    if(!nonNullOnly || (Module != null))  _ModuleSet = flag;
  /** CLEARING_HOUSE_CONTACTS.is_send field */
    if(!nonNullOnly || (IsSend != null))  _IsSendSet = flag;
  /** CLEARING_HOUSE_CONTACTS.ch_format_type field */
    if(!nonNullOnly || (ChFormatType != null))  _ChFormatTypeSet = flag;
  /** CLEARING_HOUSE_CONTACTS.credit_trans_type field */
    if(!nonNullOnly || (CreditTransType != null))  _CreditTransTypeSet = flag;
  /** CLEARING_HOUSE_CONTACTS.debit_trans_type field */
    if(!nonNullOnly || (DebitTransType != null))  _DebitTransTypeSet = flag;
  /** CLEARING_HOUSE_CONTACTS.allow_auto_post field */
    if(!nonNullOnly || (AllowAutoPost != null))  _AllowAutoPostSet = flag;
  /** CLEARING_HOUSE_CONTACTS.auto_post_delay field */
    if(!nonNullOnly || (AutoPostDelay != null))  _AutoPostDelaySet = flag;
  /** CLEARING_HOUSE_CONTACTS.chgb_resubmit_delay field */
    if(!nonNullOnly || (ChgbResubmitDelay != null))  _ChgbResubmitDelaySet = flag;
  /** CLEARING_HOUSE_CONTACTS.collection_delay field */
    if(!nonNullOnly || (CollectionDelay != null))  _CollectionDelaySet = flag;
  /** CLEARING_HOUSE_CONTACTS.suppress_prenotes field */
    if(!nonNullOnly || (SuppressPrenotes != null))  _SuppressPrenotesSet = flag;
  /** CLEARING_HOUSE_CONTACTS.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
