/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectData.java
 * Definition File: Admin/ServiceCenterType.xml
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
  
/** ServiceCenterTypeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ServiceCenterTypeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ServiceCenterTypeObjectKeyData Key = null;
  /** SERVICE_CENTERS.sc_name field */
  public    String ScName  = null;
  protected boolean _ScNameSet = false;
  /** SERVICE_CENTERS.sc_contact_fname field */
  public    String ScContactFname  = null;
  protected boolean _ScContactFnameSet = false;
  /** SERVICE_CENTERS.sc_contact_minit field */
  public    String ScContactMinit  = null;
  protected boolean _ScContactMinitSet = false;
  /** SERVICE_CENTERS.sc_contact_lname field */
  public    String ScContactLname  = null;
  protected boolean _ScContactLnameSet = false;
  /** SERVICE_CENTERS.sc_address1 field */
  public    String ScAddress1  = null;
  protected boolean _ScAddress1Set = false;
  /** SERVICE_CENTERS.sc_address2 field */
  public    String ScAddress2  = null;
  protected boolean _ScAddress2Set = false;
  /** SERVICE_CENTERS.sc_address3 field */
  public    String ScAddress3  = null;
  protected boolean _ScAddress3Set = false;
  /** SERVICE_CENTERS.sc_city field */
  public    String ScCity  = null;
  protected boolean _ScCitySet = false;
  /** SERVICE_CENTERS.sc_state field */
  public    String ScState  = null;
  protected boolean _ScStateSet = false;
  /** SERVICE_CENTERS.sc_zip field */
  public    String ScZip  = null;
  protected boolean _ScZipSet = false;
  /** SERVICE_CENTERS.sc_country_code field */
  public    Integer ScCountryCode  = null;
  protected boolean _ScCountryCodeSet = false;
  /** SERVICE_CENTERS.sc_county field */
  public    String ScCounty  = null;
  protected boolean _ScCountySet = false;
  /** SERVICE_CENTERS.sc_phone field */
  public    String ScPhone  = null;
  protected boolean _ScPhoneSet = false;
  /** SERVICE_CENTERS.tele_msg field */
  public    String TeleMsg  = null;
  protected boolean _TeleMsgSet = false;
  /** SERVICE_CENTERS.fax_msg field */
  public    String FaxMsg  = null;
  protected boolean _FaxMsgSet = false;
  /** SERVICE_CENTERS.email_msg field */
  public    String EmailMsg  = null;
  protected boolean _EmailMsgSet = false;
  /** SERVICE_CENTERS.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** SERVICE_CENTERS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** SERVICE_CENTERS.printer_device_id field */
  public    String PrinterDeviceId  = null;
  protected boolean _PrinterDeviceIdSet = false;
  /** SERVICE_CENTER_TYPE_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** SERVICE_CENTER_TYPE_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** SERVICE_CENTER_TYPE_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** SERVICE_CENTER_TYPE_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** SERVICE_CENTER_TYPE_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "ServiceCenterTypeObjectData";
  /** Default constructor */
  public ServiceCenterTypeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ServiceCenterTypeObjectData (ServiceCenterTypeObjectData other)
  {

    if (other == null) return;
    this.Key = new ServiceCenterTypeObjectKeyData (other.Key);
    this.ScName = other.ScName;
    this._ScNameSet = other._ScNameSet;
    this.ScContactFname = other.ScContactFname;
    this._ScContactFnameSet = other._ScContactFnameSet;
    this.ScContactMinit = other.ScContactMinit;
    this._ScContactMinitSet = other._ScContactMinitSet;
    this.ScContactLname = other.ScContactLname;
    this._ScContactLnameSet = other._ScContactLnameSet;
    this.ScAddress1 = other.ScAddress1;
    this._ScAddress1Set = other._ScAddress1Set;
    this.ScAddress2 = other.ScAddress2;
    this._ScAddress2Set = other._ScAddress2Set;
    this.ScAddress3 = other.ScAddress3;
    this._ScAddress3Set = other._ScAddress3Set;
    this.ScCity = other.ScCity;
    this._ScCitySet = other._ScCitySet;
    this.ScState = other.ScState;
    this._ScStateSet = other._ScStateSet;
    this.ScZip = other.ScZip;
    this._ScZipSet = other._ScZipSet;
    this.ScCountryCode = other.ScCountryCode;
    this._ScCountryCodeSet = other._ScCountryCodeSet;
    this.ScCounty = other.ScCounty;
    this._ScCountySet = other._ScCountySet;
    this.ScPhone = other.ScPhone;
    this._ScPhoneSet = other._ScPhoneSet;
    this.TeleMsg = other.TeleMsg;
    this._TeleMsgSet = other._TeleMsgSet;
    this.FaxMsg = other.FaxMsg;
    this._FaxMsgSet = other._FaxMsgSet;
    this.EmailMsg = other.EmailMsg;
    this._EmailMsgSet = other._EmailMsgSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.PrinterDeviceId = other.PrinterDeviceId;
    this._PrinterDeviceIdSet = other._PrinterDeviceIdSet;
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
  }

  /** get the Key for this object
   * @return ServiceCenterTypeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ServiceCenterTypeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ServiceCenterTypeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceCenterId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceCenterId", "setServiceCenterId");
    }
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyData ();
    this.Key.ServiceCenterId = value;
    this.Key._ServiceCenterIdSet = true;
  }
  /** get the value of the field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return Integer the value
   */
  public Integer getServiceCenterId () {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterId;
  }
  /** Change the field to not being actively set: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   */
  public void unsetServiceCenterId () {
    if (this.Key == null) return;
    this.Key._ServiceCenterIdSet = false;
  }
  /** See if the field is actively set: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
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

  /** set the fields value: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceCenterType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceCenterType", "setServiceCenterType");
    }
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyData ();
    this.Key.ServiceCenterType = value;
    this.Key._ServiceCenterTypeSet = true;
  }
  /** get the value of the field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return Integer the value
   */
  public Integer getServiceCenterType () {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterType;
  }
  /** Change the field to not being actively set: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   */
  public void unsetServiceCenterType () {
    if (this.Key == null) return;
    this.Key._ServiceCenterTypeSet = false;
  }
  /** See if the field is actively set: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterType () {
    if (this.Key == null) return false;
    return this.Key._ServiceCenterTypeSet;
  }

  /** Retrieves the ServiceCenterType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceCenterType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterType field
   */
   public String getServiceCenterTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceCenterType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceCenterType field from a formatted string
   *
   * @param _value the ServiceCenterType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceCenterType field
   */
   public void setServiceCenterTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceCenterType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterTypeFromFormattedString");
   }

  /** set the fields value: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._LanguageCodeSet;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /** set the fields value: ScName (SERVICE_CENTERS.sc_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScName") 
  public void setScName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ScName", "setScName");
    }
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScName", "setScName");
    }
    this.ScName = value;
    this._ScNameSet = true;
  }

  /** Retrieves the ScName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScName field
   */
   public String getScNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScNameAsFormattedString");
       return fmtMgr.formatString(this.getScName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScName field from a formatted string
   *
   * @param _value the ScName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScName field
   */
   public void setScNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScNameFromFormattedString");
   }

  /** get the value of the field: ScName (SERVICE_CENTERS.sc_name)
   * @return String the value
   */
  public String getScName () {
    return this.ScName;
  }
  /** Change the field to not being actively set: ScName (SERVICE_CENTERS.sc_name)
   */
  public void unsetScName () {
    this._ScNameSet = false;
  }
  /** See if the field is actively set: ScName (SERVICE_CENTERS.sc_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetScName () {
    return this._ScNameSet;
  }
  /** set the fields value: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactFname") 
  public void setScContactFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 19))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScContactFname", "setScContactFname");
    }
    this.ScContactFname = value;
    this._ScContactFnameSet = true;
  }

  /** Retrieves the ScContactFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScContactFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactFname field
   */
   public String getScContactFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactFnameAsFormattedString");
       return fmtMgr.formatString(this.getScContactFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScContactFname field from a formatted string
   *
   * @param _value the ScContactFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScContactFname field
   */
   public void setScContactFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScContactFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactFnameFromFormattedString");
   }

  /** get the value of the field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return String the value
   */
  public String getScContactFname () {
    return this.ScContactFname;
  }
  /** Change the field to not being actively set: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   */
  public void unsetScContactFname () {
    this._ScContactFnameSet = false;
  }
  /** See if the field is actively set: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactFname () {
    return this._ScContactFnameSet;
  }
  /** set the fields value: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactMinit") 
  public void setScContactMinit (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScContactMinit", "setScContactMinit");
    }
    this.ScContactMinit = value;
    this._ScContactMinitSet = true;
  }

  /** Retrieves the ScContactMinit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScContactMinit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactMinit field
   */
   public String getScContactMinitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactMinitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactMinitAsFormattedString");
       return fmtMgr.formatString(this.getScContactMinit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactMinitAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScContactMinit field from a formatted string
   *
   * @param _value the ScContactMinit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScContactMinit field
   */
   public void setScContactMinitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactMinitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScContactMinit(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactMinitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactMinitFromFormattedString");
   }

  /** get the value of the field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return String the value
   */
  public String getScContactMinit () {
    return this.ScContactMinit;
  }
  /** Change the field to not being actively set: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   */
  public void unsetScContactMinit () {
    this._ScContactMinitSet = false;
  }
  /** See if the field is actively set: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactMinit () {
    return this._ScContactMinitSet;
  }
  /** set the fields value: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactLname") 
  public void setScContactLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScContactLname", "setScContactLname");
    }
    this.ScContactLname = value;
    this._ScContactLnameSet = true;
  }

  /** Retrieves the ScContactLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScContactLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactLname field
   */
   public String getScContactLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactLnameAsFormattedString");
       return fmtMgr.formatString(this.getScContactLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScContactLname field from a formatted string
   *
   * @param _value the ScContactLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScContactLname field
   */
   public void setScContactLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScContactLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactLnameFromFormattedString");
   }

  /** get the value of the field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return String the value
   */
  public String getScContactLname () {
    return this.ScContactLname;
  }
  /** Change the field to not being actively set: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   */
  public void unsetScContactLname () {
    this._ScContactLnameSet = false;
  }
  /** See if the field is actively set: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactLname () {
    return this._ScContactLnameSet;
  }
  /** set the fields value: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScAddress1") 
  public void setScAddress1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScAddress1", "setScAddress1");
    }
    this.ScAddress1 = value;
    this._ScAddress1Set = true;
  }

  /** Retrieves the ScAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress1 field
   */
   public String getScAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress1AsFormattedString");
       return fmtMgr.formatString(this.getScAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the ScAddress1 field from a formatted string
   *
   * @param _value the ScAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScAddress1 field
   */
   public void setScAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress1FromFormattedString");
   }

  /** get the value of the field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return String the value
   */
  public String getScAddress1 () {
    return this.ScAddress1;
  }
  /** Change the field to not being actively set: ScAddress1 (SERVICE_CENTERS.sc_address1)
   */
  public void unsetScAddress1 () {
    this._ScAddress1Set = false;
  }
  /** See if the field is actively set: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress1 () {
    return this._ScAddress1Set;
  }
  /** set the fields value: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScAddress2") 
  public void setScAddress2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScAddress2", "setScAddress2");
    }
    this.ScAddress2 = value;
    this._ScAddress2Set = true;
  }

  /** Retrieves the ScAddress2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScAddress2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress2 field
   */
   public String getScAddress2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress2AsFormattedString");
       return fmtMgr.formatString(this.getScAddress2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress2AsFormattedString");
       throw x;
     }
   }
  /** Sets the ScAddress2 field from a formatted string
   *
   * @param _value the ScAddress2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScAddress2 field
   */
   public void setScAddress2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScAddress2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress2FromFormattedString");
   }

  /** get the value of the field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return String the value
   */
  public String getScAddress2 () {
    return this.ScAddress2;
  }
  /** Change the field to not being actively set: ScAddress2 (SERVICE_CENTERS.sc_address2)
   */
  public void unsetScAddress2 () {
    this._ScAddress2Set = false;
  }
  /** See if the field is actively set: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress2 () {
    return this._ScAddress2Set;
  }
  /** set the fields value: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScAddress3") 
  public void setScAddress3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScAddress3", "setScAddress3");
    }
    this.ScAddress3 = value;
    this._ScAddress3Set = true;
  }

  /** Retrieves the ScAddress3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScAddress3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress3 field
   */
   public String getScAddress3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress3AsFormattedString");
       return fmtMgr.formatString(this.getScAddress3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress3AsFormattedString");
       throw x;
     }
   }
  /** Sets the ScAddress3 field from a formatted string
   *
   * @param _value the ScAddress3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScAddress3 field
   */
   public void setScAddress3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScAddress3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress3FromFormattedString");
   }

  /** get the value of the field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return String the value
   */
  public String getScAddress3 () {
    return this.ScAddress3;
  }
  /** Change the field to not being actively set: ScAddress3 (SERVICE_CENTERS.sc_address3)
   */
  public void unsetScAddress3 () {
    this._ScAddress3Set = false;
  }
  /** See if the field is actively set: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress3 () {
    return this._ScAddress3Set;
  }
  /** set the fields value: ScCity (SERVICE_CENTERS.sc_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScCity") 
  public void setScCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScCity", "setScCity");
    }
    this.ScCity = value;
    this._ScCitySet = true;
  }

  /** Retrieves the ScCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCity field
   */
   public String getScCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCityAsFormattedString");
       return fmtMgr.formatString(this.getScCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScCity field from a formatted string
   *
   * @param _value the ScCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScCity field
   */
   public void setScCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCityFromFormattedString");
   }

  /** get the value of the field: ScCity (SERVICE_CENTERS.sc_city)
   * @return String the value
   */
  public String getScCity () {
    return this.ScCity;
  }
  /** Change the field to not being actively set: ScCity (SERVICE_CENTERS.sc_city)
   */
  public void unsetScCity () {
    this._ScCitySet = false;
  }
  /** See if the field is actively set: ScCity (SERVICE_CENTERS.sc_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetScCity () {
    return this._ScCitySet;
  }
  /** set the fields value: ScState (SERVICE_CENTERS.sc_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScState") 
  public void setScState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScState", "setScState");
    }
    this.ScState = value;
    this._ScStateSet = true;
  }

  /** Retrieves the ScState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScState field
   */
   public String getScStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScStateAsFormattedString");
       return fmtMgr.formatString(this.getScState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScState field from a formatted string
   *
   * @param _value the ScState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScState field
   */
   public void setScStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScStateFromFormattedString");
   }

  /** get the value of the field: ScState (SERVICE_CENTERS.sc_state)
   * @return String the value
   */
  public String getScState () {
    return this.ScState;
  }
  /** Change the field to not being actively set: ScState (SERVICE_CENTERS.sc_state)
   */
  public void unsetScState () {
    this._ScStateSet = false;
  }
  /** See if the field is actively set: ScState (SERVICE_CENTERS.sc_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetScState () {
    return this._ScStateSet;
  }
  /** set the fields value: ScZip (SERVICE_CENTERS.sc_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScZip") 
  public void setScZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScZip", "setScZip");
    }
    this.ScZip = value;
    this._ScZipSet = true;
  }

  /** Retrieves the ScZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScZip field
   */
   public String getScZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScZipAsFormattedString");
       return fmtMgr.formatString(this.getScZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScZip field from a formatted string
   *
   * @param _value the ScZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScZip field
   */
   public void setScZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScZipFromFormattedString");
   }

  /** get the value of the field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return String the value
   */
  public String getScZip () {
    return this.ScZip;
  }
  /** Change the field to not being actively set: ScZip (SERVICE_CENTERS.sc_zip)
   */
  public void unsetScZip () {
    this._ScZipSet = false;
  }
  /** See if the field is actively set: ScZip (SERVICE_CENTERS.sc_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetScZip () {
    return this._ScZipSet;
  }
  /** set the fields value: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScCountryCode") 
  public void setScCountryCode (Integer value) throws ServiceException
  {
    this.ScCountryCode = value;
    this._ScCountryCodeSet = true;
  }

  /** Retrieves the ScCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCountryCode field
   */
   public String getScCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getScCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScCountryCode field from a formatted string
   *
   * @param _value the ScCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScCountryCode field
   */
   public void setScCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCountryCodeFromFormattedString");
   }

  /** get the value of the field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @return Integer the value
   */
  public Integer getScCountryCode () {
    return this.ScCountryCode;
  }
  /** Change the field to not being actively set: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   */
  public void unsetScCountryCode () {
    this._ScCountryCodeSet = false;
  }
  /** See if the field is actively set: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetScCountryCode () {
    return this._ScCountryCodeSet;
  }
  /** set the fields value: ScCounty (SERVICE_CENTERS.sc_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScCounty") 
  public void setScCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScCounty", "setScCounty");
    }
    this.ScCounty = value;
    this._ScCountySet = true;
  }

  /** Retrieves the ScCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCounty field
   */
   public String getScCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCountyAsFormattedString");
       return fmtMgr.formatString(this.getScCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScCounty field from a formatted string
   *
   * @param _value the ScCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScCounty field
   */
   public void setScCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCountyFromFormattedString");
   }

  /** get the value of the field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return String the value
   */
  public String getScCounty () {
    return this.ScCounty;
  }
  /** Change the field to not being actively set: ScCounty (SERVICE_CENTERS.sc_county)
   */
  public void unsetScCounty () {
    this._ScCountySet = false;
  }
  /** See if the field is actively set: ScCounty (SERVICE_CENTERS.sc_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetScCounty () {
    return this._ScCountySet;
  }
  /** set the fields value: ScPhone (SERVICE_CENTERS.sc_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScPhone") 
  public void setScPhone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScPhone", "setScPhone");
    }
    this.ScPhone = value;
    this._ScPhoneSet = true;
  }

  /** Retrieves the ScPhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScPhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScPhone field
   */
   public String getScPhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScPhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScPhoneAsFormattedString");
       return fmtMgr.formatString(this.getScPhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScPhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScPhone field from a formatted string
   *
   * @param _value the ScPhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScPhone field
   */
   public void setScPhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScPhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScPhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScPhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScPhoneFromFormattedString");
   }

  /** get the value of the field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return String the value
   */
  public String getScPhone () {
    return this.ScPhone;
  }
  /** Change the field to not being actively set: ScPhone (SERVICE_CENTERS.sc_phone)
   */
  public void unsetScPhone () {
    this._ScPhoneSet = false;
  }
  /** See if the field is actively set: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetScPhone () {
    return this._ScPhoneSet;
  }
  /** set the fields value: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TeleMsg") 
  public void setTeleMsg (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 120))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TeleMsg", "setTeleMsg");
    }
    this.TeleMsg = value;
    this._TeleMsgSet = true;
  }

  /** Retrieves the TeleMsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TeleMsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TeleMsg field
   */
   public String getTeleMsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTeleMsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTeleMsgAsFormattedString");
       return fmtMgr.formatString(this.getTeleMsg());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TeleMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTeleMsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the TeleMsg field from a formatted string
   *
   * @param _value the TeleMsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TeleMsg field
   */
   public void setTeleMsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTeleMsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTeleMsg(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TeleMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTeleMsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTeleMsgFromFormattedString");
   }

  /** get the value of the field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return String the value
   */
  public String getTeleMsg () {
    return this.TeleMsg;
  }
  /** Change the field to not being actively set: TeleMsg (SERVICE_CENTERS.tele_msg)
   */
  public void unsetTeleMsg () {
    this._TeleMsgSet = false;
  }
  /** See if the field is actively set: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return boolean whether the field is actively set
   */
  public boolean issetTeleMsg () {
    return this._TeleMsgSet;
  }
  /** set the fields value: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FaxMsg") 
  public void setFaxMsg (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FaxMsg", "setFaxMsg");
    }
    this.FaxMsg = value;
    this._FaxMsgSet = true;
  }

  /** Retrieves the FaxMsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FaxMsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FaxMsg field
   */
   public String getFaxMsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFaxMsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFaxMsgAsFormattedString");
       return fmtMgr.formatString(this.getFaxMsg());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FaxMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFaxMsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the FaxMsg field from a formatted string
   *
   * @param _value the FaxMsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FaxMsg field
   */
   public void setFaxMsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFaxMsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFaxMsg(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FaxMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFaxMsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFaxMsgFromFormattedString");
   }

  /** get the value of the field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return String the value
   */
  public String getFaxMsg () {
    return this.FaxMsg;
  }
  /** Change the field to not being actively set: FaxMsg (SERVICE_CENTERS.fax_msg)
   */
  public void unsetFaxMsg () {
    this._FaxMsgSet = false;
  }
  /** See if the field is actively set: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return boolean whether the field is actively set
   */
  public boolean issetFaxMsg () {
    return this._FaxMsgSet;
  }
  /** set the fields value: EmailMsg (SERVICE_CENTERS.email_msg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmailMsg") 
  public void setEmailMsg (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EmailMsg", "setEmailMsg");
    }
    this.EmailMsg = value;
    this._EmailMsgSet = true;
  }

  /** Retrieves the EmailMsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmailMsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmailMsg field
   */
   public String getEmailMsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmailMsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmailMsgAsFormattedString");
       return fmtMgr.formatString(this.getEmailMsg());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmailMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmailMsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmailMsg field from a formatted string
   *
   * @param _value the EmailMsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmailMsg field
   */
   public void setEmailMsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmailMsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmailMsg(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmailMsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmailMsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmailMsgFromFormattedString");
   }

  /** get the value of the field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return String the value
   */
  public String getEmailMsg () {
    return this.EmailMsg;
  }
  /** Change the field to not being actively set: EmailMsg (SERVICE_CENTERS.email_msg)
   */
  public void unsetEmailMsg () {
    this._EmailMsgSet = false;
  }
  /** See if the field is actively set: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmailMsg () {
    return this._EmailMsgSet;
  }
  /** set the fields value: ChgDate (SERVICE_CENTERS.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (SERVICE_CENTERS.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (SERVICE_CENTERS.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (SERVICE_CENTERS.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ChgWho (SERVICE_CENTERS.chg_who)
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

  /** get the value of the field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (SERVICE_CENTERS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (SERVICE_CENTERS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrinterDeviceId") 
  public void setPrinterDeviceId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrinterDeviceId", "setPrinterDeviceId");
    }
    this.PrinterDeviceId = value;
    this._PrinterDeviceIdSet = true;
  }

  /** Retrieves the PrinterDeviceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrinterDeviceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrinterDeviceId field
   */
   public String getPrinterDeviceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrinterDeviceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrinterDeviceIdAsFormattedString");
       return fmtMgr.formatString(this.getPrinterDeviceId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrinterDeviceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrinterDeviceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrinterDeviceId field from a formatted string
   *
   * @param _value the PrinterDeviceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrinterDeviceId field
   */
   public void setPrinterDeviceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrinterDeviceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrinterDeviceId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrinterDeviceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrinterDeviceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrinterDeviceIdFromFormattedString");
   }

  /** get the value of the field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return String the value
   */
  public String getPrinterDeviceId () {
    return this.PrinterDeviceId;
  }
  /** Change the field to not being actively set: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   */
  public void unsetPrinterDeviceId () {
    this._PrinterDeviceIdSet = false;
  }
  /** See if the field is actively set: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrinterDeviceId () {
    return this._PrinterDeviceIdSet;
  }
  /** set the fields value: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDefault") 
  public void setIsDefault (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDefault", "setIsDefault");
    }
    this.IsDefault = value;
    this._IsDefaultSet = true;
  }

  /** Retrieves the IsDefault field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDefault field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefault field
   */
   public String getIsDefaultAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDefault());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDefault field from a formatted string
   *
   * @param _value the IsDefault field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDefault field
   */
   public void setIsDefaultFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDefault(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDefault");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFromFormattedString");
   }

  /** get the value of the field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsInternal") 
  public void setIsInternal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsInternal", "setIsInternal");
    }
    this.IsInternal = value;
    this._IsInternalSet = true;
  }

  /** Retrieves the IsInternal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsInternal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternal field
   */
   public String getIsInternalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsInternal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsInternal field from a formatted string
   *
   * @param _value the IsInternal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsInternal field
   */
   public void setIsInternalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsInternal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFromFormattedString");
   }

  /** get the value of the field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ShortDisplay") 
  public void setShortDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ShortDisplay", "setShortDisplay");
    }
    this.ShortDisplay = value;
    this._ShortDisplaySet = true;
  }

  /** Retrieves the ShortDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShortDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplay field
   */
   public String getShortDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayAsFormattedString");
       return fmtMgr.formatString(this.getShortDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShortDisplay field from a formatted string
   *
   * @param _value the ShortDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShortDisplay field
   */
   public void setShortDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShortDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFromFormattedString");
   }

  /** get the value of the field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayValue") 
  public void setDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayValue", "setDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayValue", "setDisplayValue");
    }
    this.DisplayValue = value;
    this._DisplayValueSet = true;
  }

  /** Retrieves the DisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValue field
   */
   public String getDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayValue field from a formatted string
   *
   * @param _value the DisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayValue field
   */
   public void setDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFromFormattedString");
   }

  /** get the value of the field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return ServiceCenterTypeObjectHelper.toMap(this, null).toString();
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
  /** SERVICE_CENTERS.sc_name field */
    if(!nonNullOnly || (ScName != null))  _ScNameSet = flag;
  /** SERVICE_CENTERS.sc_contact_fname field */
    if(!nonNullOnly || (ScContactFname != null))  _ScContactFnameSet = flag;
  /** SERVICE_CENTERS.sc_contact_minit field */
    if(!nonNullOnly || (ScContactMinit != null))  _ScContactMinitSet = flag;
  /** SERVICE_CENTERS.sc_contact_lname field */
    if(!nonNullOnly || (ScContactLname != null))  _ScContactLnameSet = flag;
  /** SERVICE_CENTERS.sc_address1 field */
    if(!nonNullOnly || (ScAddress1 != null))  _ScAddress1Set = flag;
  /** SERVICE_CENTERS.sc_address2 field */
    if(!nonNullOnly || (ScAddress2 != null))  _ScAddress2Set = flag;
  /** SERVICE_CENTERS.sc_address3 field */
    if(!nonNullOnly || (ScAddress3 != null))  _ScAddress3Set = flag;
  /** SERVICE_CENTERS.sc_city field */
    if(!nonNullOnly || (ScCity != null))  _ScCitySet = flag;
  /** SERVICE_CENTERS.sc_state field */
    if(!nonNullOnly || (ScState != null))  _ScStateSet = flag;
  /** SERVICE_CENTERS.sc_zip field */
    if(!nonNullOnly || (ScZip != null))  _ScZipSet = flag;
  /** SERVICE_CENTERS.sc_country_code field */
    if(!nonNullOnly || (ScCountryCode != null))  _ScCountryCodeSet = flag;
  /** SERVICE_CENTERS.sc_county field */
    if(!nonNullOnly || (ScCounty != null))  _ScCountySet = flag;
  /** SERVICE_CENTERS.sc_phone field */
    if(!nonNullOnly || (ScPhone != null))  _ScPhoneSet = flag;
  /** SERVICE_CENTERS.tele_msg field */
    if(!nonNullOnly || (TeleMsg != null))  _TeleMsgSet = flag;
  /** SERVICE_CENTERS.fax_msg field */
    if(!nonNullOnly || (FaxMsg != null))  _FaxMsgSet = flag;
  /** SERVICE_CENTERS.email_msg field */
    if(!nonNullOnly || (EmailMsg != null))  _EmailMsgSet = flag;
  /** SERVICE_CENTERS.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** SERVICE_CENTERS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** SERVICE_CENTERS.printer_device_id field */
    if(!nonNullOnly || (PrinterDeviceId != null))  _PrinterDeviceIdSet = flag;
  /** SERVICE_CENTER_TYPE_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** SERVICE_CENTER_TYPE_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** SERVICE_CENTER_TYPE_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** SERVICE_CENTER_TYPE_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** SERVICE_CENTER_TYPE_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
