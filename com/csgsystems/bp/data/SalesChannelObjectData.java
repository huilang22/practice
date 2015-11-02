/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SalesChannelObjectData.java
 * Definition File: Admin/SalesChannel.xml
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
  
/** SalesChannelObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class SalesChannelObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public SalesChannelObjectKeyData Key = null;
  /** SALES_CHANNEL_REF.sc_name field */
  public    String ScName  = null;
  protected boolean _ScNameSet = false;
  /** SALES_CHANNEL_REF.sc_number field */
  public    String ScNumber  = null;
  protected boolean _ScNumberSet = false;
  /** SALES_CHANNEL_REF.sc_contact_name_pre field */
  public    String ScContactNamePre  = null;
  protected boolean _ScContactNamePreSet = false;
  /** SALES_CHANNEL_REF.sc_contact_fname field */
  public    String ScContactFname  = null;
  protected boolean _ScContactFnameSet = false;
  /** SALES_CHANNEL_REF.sc_contact_minit field */
  public    String ScContactMinit  = null;
  protected boolean _ScContactMinitSet = false;
  /** SALES_CHANNEL_REF.sc_contact_lname field */
  public    String ScContactLname  = null;
  protected boolean _ScContactLnameSet = false;
  /** SALES_CHANNEL_REF.sc_contact_name_gen field */
  public    String ScContactNameGen  = null;
  protected boolean _ScContactNameGenSet = false;
  /** SALES_CHANNEL_REF.sc_address1 field */
  public    String ScAddress1  = null;
  protected boolean _ScAddress1Set = false;
  /** SALES_CHANNEL_REF.sc_address2 field */
  public    String ScAddress2  = null;
  protected boolean _ScAddress2Set = false;
  /** SALES_CHANNEL_REF.sc_address3 field */
  public    String ScAddress3  = null;
  protected boolean _ScAddress3Set = false;
  /** SALES_CHANNEL_REF.sc_city field */
  public    String ScCity  = null;
  protected boolean _ScCitySet = false;
  /** SALES_CHANNEL_REF.sc_state field */
  public    String ScState  = null;
  protected boolean _ScStateSet = false;
  /** SALES_CHANNEL_REF.sc_zip_code field */
  public    String ScZipCode  = null;
  protected boolean _ScZipCodeSet = false;
  /** SALES_CHANNEL_REF.sc_country_code field */
  public    Integer ScCountryCode  = null;
  protected boolean _ScCountryCodeSet = false;
  /** SALES_CHANNEL_REF.sc_phone field */
  public    String ScPhone  = null;
  protected boolean _ScPhoneSet = false;
  /** SALES_CHANNEL_REF.parent_sales_channel_id field */
  public    Integer ParentSalesChannelId  = null;
  protected boolean _ParentSalesChannelIdSet = false;
  /** SALES_CHANNEL_REF.commission_id field */
  public    Integer CommissionId  = null;
  protected boolean _CommissionIdSet = false;
  /** SALES_CHANNEL_REF.dealer_pin field */
  public    String DealerPin  = null;
  protected boolean _DealerPinSet = false;
  /** SALES_CHANNEL_REF.security_word field */
  public    String SecurityWord  = null;
  protected boolean _SecurityWordSet = false;
  /** SALES_CHANNEL_REF.status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** SALES_CHANNEL_REF.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** SALES_CHANNEL_REF.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** SALES_CHANNEL_REF.num_threshold field */
  public    Integer NumThreshold  = null;
  protected boolean _NumThresholdSet = false;
  /** SALES_CHANNEL_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** SALES_CHANNEL_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** SALES_CHANNEL_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** SALES_CHANNEL_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** SALES_CHANNEL_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "SalesChannelObjectData";
  /** Default constructor */
  public SalesChannelObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public SalesChannelObjectData (SalesChannelObjectData other)
  {

    if (other == null) return;
    this.Key = new SalesChannelObjectKeyData (other.Key);
    this.ScName = other.ScName;
    this._ScNameSet = other._ScNameSet;
    this.ScNumber = other.ScNumber;
    this._ScNumberSet = other._ScNumberSet;
    this.ScContactNamePre = other.ScContactNamePre;
    this._ScContactNamePreSet = other._ScContactNamePreSet;
    this.ScContactFname = other.ScContactFname;
    this._ScContactFnameSet = other._ScContactFnameSet;
    this.ScContactMinit = other.ScContactMinit;
    this._ScContactMinitSet = other._ScContactMinitSet;
    this.ScContactLname = other.ScContactLname;
    this._ScContactLnameSet = other._ScContactLnameSet;
    this.ScContactNameGen = other.ScContactNameGen;
    this._ScContactNameGenSet = other._ScContactNameGenSet;
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
    this.ScZipCode = other.ScZipCode;
    this._ScZipCodeSet = other._ScZipCodeSet;
    this.ScCountryCode = other.ScCountryCode;
    this._ScCountryCodeSet = other._ScCountryCodeSet;
    this.ScPhone = other.ScPhone;
    this._ScPhoneSet = other._ScPhoneSet;
    this.ParentSalesChannelId = other.ParentSalesChannelId;
    this._ParentSalesChannelIdSet = other._ParentSalesChannelIdSet;
    this.CommissionId = other.CommissionId;
    this._CommissionIdSet = other._CommissionIdSet;
    this.DealerPin = other.DealerPin;
    this._DealerPinSet = other._DealerPinSet;
    this.SecurityWord = other.SecurityWord;
    this._SecurityWordSet = other._SecurityWordSet;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.NumThreshold = other.NumThreshold;
    this._NumThresholdSet = other._NumThresholdSet;
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
   * @return SalesChannelObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public SalesChannelObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (SalesChannelObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSalesChannelId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SalesChannelId", "setSalesChannelId");
    }
    if (this.Key == null) this.Key = new SalesChannelObjectKeyData ();
    this.Key.SalesChannelId = value;
    this.Key._SalesChannelIdSet = true;
  }
  /** get the value of the field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return Integer the value
   */
  public Integer getSalesChannelId () {
    if (this.Key == null) return null;
    return this.Key.SalesChannelId;
  }
  /** Change the field to not being actively set: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   */
  public void unsetSalesChannelId () {
    if (this.Key == null) return;
    this.Key._SalesChannelIdSet = false;
  }
  /** See if the field is actively set: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSalesChannelId () {
    if (this.Key == null) return false;
    return this.Key._SalesChannelIdSet;
  }

  /** Retrieves the SalesChannelId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SalesChannelId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelId field
   */
   public String getSalesChannelIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSalesChannelId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SalesChannelId field from a formatted string
   *
   * @param _value the SalesChannelId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SalesChannelId field
   */
   public void setSalesChannelIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSalesChannelId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new SalesChannelObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (SALES_CHANNEL_VALUES.language_code)
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

  /** set the fields value: ScName (SALES_CHANNEL_REF.sc_name)
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
    if (value != null && !DataHelper.validLength (value, 32))
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

  /** get the value of the field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return String the value
   */
  public String getScName () {
    return this.ScName;
  }
  /** Change the field to not being actively set: ScName (SALES_CHANNEL_REF.sc_name)
   */
  public void unsetScName () {
    this._ScNameSet = false;
  }
  /** See if the field is actively set: ScName (SALES_CHANNEL_REF.sc_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetScName () {
    return this._ScNameSet;
  }
  /** set the fields value: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScNumber") 
  public void setScNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScNumber", "setScNumber");
    }
    this.ScNumber = value;
    this._ScNumberSet = true;
  }

  /** Retrieves the ScNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScNumber field
   */
   public String getScNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScNumberAsFormattedString");
       return fmtMgr.formatString(this.getScNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScNumber field from a formatted string
   *
   * @param _value the ScNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScNumber field
   */
   public void setScNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScNumberFromFormattedString");
   }

  /** get the value of the field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return String the value
   */
  public String getScNumber () {
    return this.ScNumber;
  }
  /** Change the field to not being actively set: ScNumber (SALES_CHANNEL_REF.sc_number)
   */
  public void unsetScNumber () {
    this._ScNumberSet = false;
  }
  /** See if the field is actively set: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetScNumber () {
    return this._ScNumberSet;
  }
  /** set the fields value: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactNamePre") 
  public void setScContactNamePre (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScContactNamePre", "setScContactNamePre");
    }
    this.ScContactNamePre = value;
    this._ScContactNamePreSet = true;
  }

  /** Retrieves the ScContactNamePre field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScContactNamePre field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactNamePre field
   */
   public String getScContactNamePreAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNamePreAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactNamePreAsFormattedString");
       return fmtMgr.formatString(this.getScContactNamePre());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactNamePreAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScContactNamePre field from a formatted string
   *
   * @param _value the ScContactNamePre field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScContactNamePre field
   */
   public void setScContactNamePreFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNamePreFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScContactNamePre(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactNamePreFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactNamePreFromFormattedString");
   }

  /** get the value of the field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return String the value
   */
  public String getScContactNamePre () {
    return this.ScContactNamePre;
  }
  /** Change the field to not being actively set: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   */
  public void unsetScContactNamePre () {
    this._ScContactNamePreSet = false;
  }
  /** See if the field is actively set: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactNamePre () {
    return this._ScContactNamePreSet;
  }
  /** set the fields value: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactFname") 
  public void setScContactFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
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

  /** get the value of the field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return String the value
   */
  public String getScContactFname () {
    return this.ScContactFname;
  }
  /** Change the field to not being actively set: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   */
  public void unsetScContactFname () {
    this._ScContactFnameSet = false;
  }
  /** See if the field is actively set: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactFname () {
    return this._ScContactFnameSet;
  }
  /** set the fields value: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
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

  /** get the value of the field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return String the value
   */
  public String getScContactMinit () {
    return this.ScContactMinit;
  }
  /** Change the field to not being actively set: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   */
  public void unsetScContactMinit () {
    this._ScContactMinitSet = false;
  }
  /** See if the field is actively set: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactMinit () {
    return this._ScContactMinitSet;
  }
  /** set the fields value: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactLname") 
  public void setScContactLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
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

  /** get the value of the field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return String the value
   */
  public String getScContactLname () {
    return this.ScContactLname;
  }
  /** Change the field to not being actively set: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   */
  public void unsetScContactLname () {
    this._ScContactLnameSet = false;
  }
  /** See if the field is actively set: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactLname () {
    return this._ScContactLnameSet;
  }
  /** set the fields value: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScContactNameGen") 
  public void setScContactNameGen (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScContactNameGen", "setScContactNameGen");
    }
    this.ScContactNameGen = value;
    this._ScContactNameGenSet = true;
  }

  /** Retrieves the ScContactNameGen field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScContactNameGen field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactNameGen field
   */
   public String getScContactNameGenAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNameGenAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactNameGenAsFormattedString");
       return fmtMgr.formatString(this.getScContactNameGen());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactNameGen");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactNameGenAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScContactNameGen field from a formatted string
   *
   * @param _value the ScContactNameGen field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScContactNameGen field
   */
   public void setScContactNameGenFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNameGenFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScContactNameGen(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScContactNameGen");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactNameGenFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactNameGenFromFormattedString");
   }

  /** get the value of the field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return String the value
   */
  public String getScContactNameGen () {
    return this.ScContactNameGen;
  }
  /** Change the field to not being actively set: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   */
  public void unsetScContactNameGen () {
    this._ScContactNameGenSet = false;
  }
  /** See if the field is actively set: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return boolean whether the field is actively set
   */
  public boolean issetScContactNameGen () {
    return this._ScContactNameGenSet;
  }
  /** set the fields value: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
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

  /** get the value of the field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return String the value
   */
  public String getScAddress1 () {
    return this.ScAddress1;
  }
  /** Change the field to not being actively set: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   */
  public void unsetScAddress1 () {
    this._ScAddress1Set = false;
  }
  /** See if the field is actively set: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress1 () {
    return this._ScAddress1Set;
  }
  /** set the fields value: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
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

  /** get the value of the field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return String the value
   */
  public String getScAddress2 () {
    return this.ScAddress2;
  }
  /** Change the field to not being actively set: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   */
  public void unsetScAddress2 () {
    this._ScAddress2Set = false;
  }
  /** See if the field is actively set: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress2 () {
    return this._ScAddress2Set;
  }
  /** set the fields value: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
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

  /** get the value of the field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return String the value
   */
  public String getScAddress3 () {
    return this.ScAddress3;
  }
  /** Change the field to not being actively set: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   */
  public void unsetScAddress3 () {
    this._ScAddress3Set = false;
  }
  /** See if the field is actively set: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetScAddress3 () {
    return this._ScAddress3Set;
  }
  /** set the fields value: ScCity (SALES_CHANNEL_REF.sc_city)
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

  /** get the value of the field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return String the value
   */
  public String getScCity () {
    return this.ScCity;
  }
  /** Change the field to not being actively set: ScCity (SALES_CHANNEL_REF.sc_city)
   */
  public void unsetScCity () {
    this._ScCitySet = false;
  }
  /** See if the field is actively set: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetScCity () {
    return this._ScCitySet;
  }
  /** set the fields value: ScState (SALES_CHANNEL_REF.sc_state)
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

  /** get the value of the field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return String the value
   */
  public String getScState () {
    return this.ScState;
  }
  /** Change the field to not being actively set: ScState (SALES_CHANNEL_REF.sc_state)
   */
  public void unsetScState () {
    this._ScStateSet = false;
  }
  /** See if the field is actively set: ScState (SALES_CHANNEL_REF.sc_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetScState () {
    return this._ScStateSet;
  }
  /** set the fields value: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ScZipCode") 
  public void setScZipCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ScZipCode", "setScZipCode");
    }
    this.ScZipCode = value;
    this._ScZipCodeSet = true;
  }

  /** Retrieves the ScZipCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ScZipCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScZipCode field
   */
   public String getScZipCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScZipCodeAsFormattedString");
       return fmtMgr.formatString(this.getScZipCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScZipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getScZipCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ScZipCode field from a formatted string
   *
   * @param _value the ScZipCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ScZipCode field
   */
   public void setScZipCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setScZipCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ScZipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setScZipCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScZipCodeFromFormattedString");
   }

  /** get the value of the field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return String the value
   */
  public String getScZipCode () {
    return this.ScZipCode;
  }
  /** Change the field to not being actively set: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   */
  public void unsetScZipCode () {
    this._ScZipCodeSet = false;
  }
  /** See if the field is actively set: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetScZipCode () {
    return this._ScZipCodeSet;
  }
  /** set the fields value: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
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

  /** get the value of the field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return Integer the value
   */
  public Integer getScCountryCode () {
    return this.ScCountryCode;
  }
  /** Change the field to not being actively set: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   */
  public void unsetScCountryCode () {
    this._ScCountryCodeSet = false;
  }
  /** See if the field is actively set: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetScCountryCode () {
    return this._ScCountryCodeSet;
  }
  /** set the fields value: ScPhone (SALES_CHANNEL_REF.sc_phone)
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

  /** get the value of the field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return String the value
   */
  public String getScPhone () {
    return this.ScPhone;
  }
  /** Change the field to not being actively set: ScPhone (SALES_CHANNEL_REF.sc_phone)
   */
  public void unsetScPhone () {
    this._ScPhoneSet = false;
  }
  /** See if the field is actively set: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetScPhone () {
    return this._ScPhoneSet;
  }
  /** set the fields value: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentSalesChannelId") 
  public void setParentSalesChannelId (Integer value) throws ServiceException
  {
    this.ParentSalesChannelId = value;
    this._ParentSalesChannelIdSet = true;
  }

  /** Retrieves the ParentSalesChannelId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentSalesChannelId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentSalesChannelId field
   */
   public String getParentSalesChannelIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentSalesChannelIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentSalesChannelIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentSalesChannelId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentSalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentSalesChannelIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentSalesChannelId field from a formatted string
   *
   * @param _value the ParentSalesChannelId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentSalesChannelId field
   */
   public void setParentSalesChannelIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentSalesChannelIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentSalesChannelId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentSalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentSalesChannelIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentSalesChannelIdFromFormattedString");
   }

  /** get the value of the field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return Integer the value
   */
  public Integer getParentSalesChannelId () {
    return this.ParentSalesChannelId;
  }
  /** Change the field to not being actively set: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   */
  public void unsetParentSalesChannelId () {
    this._ParentSalesChannelIdSet = false;
  }
  /** See if the field is actively set: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentSalesChannelId () {
    return this._ParentSalesChannelIdSet;
  }
  /** set the fields value: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommissionId") 
  public void setCommissionId (Integer value) throws ServiceException
  {
    this.CommissionId = value;
    this._CommissionIdSet = true;
  }

  /** Retrieves the CommissionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommissionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommissionId field
   */
   public String getCommissionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommissionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommissionIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCommissionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommissionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommissionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommissionId field from a formatted string
   *
   * @param _value the CommissionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommissionId field
   */
   public void setCommissionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommissionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommissionId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommissionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommissionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommissionIdFromFormattedString");
   }

  /** get the value of the field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return Integer the value
   */
  public Integer getCommissionId () {
    return this.CommissionId;
  }
  /** Change the field to not being actively set: CommissionId (SALES_CHANNEL_REF.commission_id)
   */
  public void unsetCommissionId () {
    this._CommissionIdSet = false;
  }
  /** See if the field is actively set: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommissionId () {
    return this._CommissionIdSet;
  }
  /** set the fields value: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DealerPin") 
  public void setDealerPin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DealerPin", "setDealerPin");
    }
    this.DealerPin = value;
    this._DealerPinSet = true;
  }

  /** Retrieves the DealerPin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DealerPin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DealerPin field
   */
   public String getDealerPinAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDealerPinAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDealerPinAsFormattedString");
       return fmtMgr.formatString(this.getDealerPin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DealerPin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDealerPinAsFormattedString");
       throw x;
     }
   }
  /** Sets the DealerPin field from a formatted string
   *
   * @param _value the DealerPin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DealerPin field
   */
   public void setDealerPinFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDealerPinFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDealerPin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DealerPin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDealerPinFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDealerPinFromFormattedString");
   }

  /** get the value of the field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return String the value
   */
  public String getDealerPin () {
    return this.DealerPin;
  }
  /** Change the field to not being actively set: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   */
  public void unsetDealerPin () {
    this._DealerPinSet = false;
  }
  /** See if the field is actively set: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return boolean whether the field is actively set
   */
  public boolean issetDealerPin () {
    return this._DealerPinSet;
  }
  /** set the fields value: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SecurityWord") 
  public void setSecurityWord (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SecurityWord", "setSecurityWord");
    }
    this.SecurityWord = value;
    this._SecurityWordSet = true;
  }

  /** Retrieves the SecurityWord field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SecurityWord field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecurityWord field
   */
   public String getSecurityWordAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityWordAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityWordAsFormattedString");
       return fmtMgr.formatString(this.getSecurityWord());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecurityWord");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecurityWordAsFormattedString");
       throw x;
     }
   }
  /** Sets the SecurityWord field from a formatted string
   *
   * @param _value the SecurityWord field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecurityWord field
   */
   public void setSecurityWordFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityWordFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSecurityWord(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecurityWord");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecurityWordFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecurityWordFromFormattedString");
   }

  /** get the value of the field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return String the value
   */
  public String getSecurityWord () {
    return this.SecurityWord;
  }
  /** Change the field to not being actively set: SecurityWord (SALES_CHANNEL_REF.security_word)
   */
  public void unsetSecurityWord () {
    this._SecurityWordSet = false;
  }
  /** See if the field is actively set: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return boolean whether the field is actively set
   */
  public boolean issetSecurityWord () {
    return this._SecurityWordSet;
  }
  /** set the fields value: Status (SALES_CHANNEL_REF.status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Status") 
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** get the value of the field: Status (SALES_CHANNEL_REF.status)
   * @return Integer the value
   */
  public Integer getStatus () {
    return this.Status;
  }
  /** Change the field to not being actively set: Status (SALES_CHANNEL_REF.status)
   */
  public void unsetStatus () {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status (SALES_CHANNEL_REF.status)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus () {
    return this._StatusSet;
  }
  /** set the fields value: DateActive (SALES_CHANNEL_REF.date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateActive") 
  public void setDateActive (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateActive", "setDateActive");
    }
    this.DateActive = value;
    this._DateActiveSet = true;
  }

  /** Retrieves the DateActive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateActive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
   public String getDateActiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateActive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateActive field from a formatted string
   *
   * @param _value the DateActive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
   public void setDateActiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateActive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFromFormattedString");
   }

  /**
   * Retrieves the DateActive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
  public String getDateActiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateActive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActive field value from a formatted date/time string
   *
   * @param _value the DateActive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
  public void setDateActiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateActive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateActive (SALES_CHANNEL_REF.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (SALES_CHANNEL_REF.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (SALES_CHANNEL_REF.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateInactive") 
  public void setDateInactive (Date value) throws ServiceException
  {
    this.DateInactive = value;
    this._DateInactiveSet = true;
  }

  /** Retrieves the DateInactive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateInactive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
   public String getDateInactiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateInactive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateInactive field from a formatted string
   *
   * @param _value the DateInactive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
   public void setDateInactiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateInactive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFromFormattedString");
   }

  /**
   * Retrieves the DateInactive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
  public String getDateInactiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateInactive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactive field value from a formatted date/time string
   *
   * @param _value the DateInactive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
  public void setDateInactiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateInactive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (SALES_CHANNEL_REF.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NumThreshold") 
  public void setNumThreshold (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NumThreshold", "setNumThreshold");
    }
    this.NumThreshold = value;
    this._NumThresholdSet = true;
  }

  /** Retrieves the NumThreshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NumThreshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumThreshold field
   */
   public String getNumThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumThresholdAsFormattedString");
       return fmtMgr.formatNumber(this.getNumThreshold(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the NumThreshold field from a formatted string
   *
   * @param _value the NumThreshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NumThreshold field
   */
   public void setNumThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNumThreshold(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumThresholdFromFormattedString");
   }

  /** get the value of the field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return Integer the value
   */
  public Integer getNumThreshold () {
    return this.NumThreshold;
  }
  /** Change the field to not being actively set: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   */
  public void unsetNumThreshold () {
    this._NumThresholdSet = false;
  }
  /** See if the field is actively set: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetNumThreshold () {
    return this._NumThresholdSet;
  }
  /** set the fields value: IsDefault (SALES_CHANNEL_REF.is_default)
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

  /** get the value of the field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (SALES_CHANNEL_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (SALES_CHANNEL_REF.is_internal)
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

  /** get the value of the field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (SALES_CHANNEL_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (SALES_CHANNEL_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return SalesChannelObjectHelper.toMap(this, null).toString();
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
  /** SALES_CHANNEL_REF.sc_name field */
    if(!nonNullOnly || (ScName != null))  _ScNameSet = flag;
  /** SALES_CHANNEL_REF.sc_number field */
    if(!nonNullOnly || (ScNumber != null))  _ScNumberSet = flag;
  /** SALES_CHANNEL_REF.sc_contact_name_pre field */
    if(!nonNullOnly || (ScContactNamePre != null))  _ScContactNamePreSet = flag;
  /** SALES_CHANNEL_REF.sc_contact_fname field */
    if(!nonNullOnly || (ScContactFname != null))  _ScContactFnameSet = flag;
  /** SALES_CHANNEL_REF.sc_contact_minit field */
    if(!nonNullOnly || (ScContactMinit != null))  _ScContactMinitSet = flag;
  /** SALES_CHANNEL_REF.sc_contact_lname field */
    if(!nonNullOnly || (ScContactLname != null))  _ScContactLnameSet = flag;
  /** SALES_CHANNEL_REF.sc_contact_name_gen field */
    if(!nonNullOnly || (ScContactNameGen != null))  _ScContactNameGenSet = flag;
  /** SALES_CHANNEL_REF.sc_address1 field */
    if(!nonNullOnly || (ScAddress1 != null))  _ScAddress1Set = flag;
  /** SALES_CHANNEL_REF.sc_address2 field */
    if(!nonNullOnly || (ScAddress2 != null))  _ScAddress2Set = flag;
  /** SALES_CHANNEL_REF.sc_address3 field */
    if(!nonNullOnly || (ScAddress3 != null))  _ScAddress3Set = flag;
  /** SALES_CHANNEL_REF.sc_city field */
    if(!nonNullOnly || (ScCity != null))  _ScCitySet = flag;
  /** SALES_CHANNEL_REF.sc_state field */
    if(!nonNullOnly || (ScState != null))  _ScStateSet = flag;
  /** SALES_CHANNEL_REF.sc_zip_code field */
    if(!nonNullOnly || (ScZipCode != null))  _ScZipCodeSet = flag;
  /** SALES_CHANNEL_REF.sc_country_code field */
    if(!nonNullOnly || (ScCountryCode != null))  _ScCountryCodeSet = flag;
  /** SALES_CHANNEL_REF.sc_phone field */
    if(!nonNullOnly || (ScPhone != null))  _ScPhoneSet = flag;
  /** SALES_CHANNEL_REF.parent_sales_channel_id field */
    if(!nonNullOnly || (ParentSalesChannelId != null))  _ParentSalesChannelIdSet = flag;
  /** SALES_CHANNEL_REF.commission_id field */
    if(!nonNullOnly || (CommissionId != null))  _CommissionIdSet = flag;
  /** SALES_CHANNEL_REF.dealer_pin field */
    if(!nonNullOnly || (DealerPin != null))  _DealerPinSet = flag;
  /** SALES_CHANNEL_REF.security_word field */
    if(!nonNullOnly || (SecurityWord != null))  _SecurityWordSet = flag;
  /** SALES_CHANNEL_REF.status field */
    if(!nonNullOnly || (Status != null))  _StatusSet = flag;
  /** SALES_CHANNEL_REF.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** SALES_CHANNEL_REF.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** SALES_CHANNEL_REF.num_threshold field */
    if(!nonNullOnly || (NumThreshold != null))  _NumThresholdSet = flag;
  /** SALES_CHANNEL_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** SALES_CHANNEL_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** SALES_CHANNEL_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** SALES_CHANNEL_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** SALES_CHANNEL_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
