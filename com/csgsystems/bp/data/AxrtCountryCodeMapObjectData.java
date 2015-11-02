/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCountryCodeMapObjectData.java
 * Definition File: Admin/AxrtCountryCodeMap.xml
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
  
/** AxrtCountryCodeMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AxrtCountryCodeMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AxrtCountryCodeMapObjectKeyData Key = null;
  /** COUNTRY_CODE_REF.tax_identifier field */
  public    Integer TaxIdentifier  = null;
  protected boolean _TaxIdentifierSet = false;
  /** COUNTRY_CODE_REF.default_currency_code field */
  public    Integer DefaultCurrencyCode  = null;
  protected boolean _DefaultCurrencyCodeSet = false;
  /** COUNTRY_CODE_REF.iso_code field */
  public    String IsoCode  = null;
  protected boolean _IsoCodeSet = false;
  /** COUNTRY_CODE_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** COUNTRY_CODE_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** COUNTRY_CODE_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** COUNTRY_CODE_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** COUNTRY_CODE_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "AxrtCountryCodeMapObjectData";
  /** Default constructor */
  public AxrtCountryCodeMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AxrtCountryCodeMapObjectData (AxrtCountryCodeMapObjectData other)
  {

    if (other == null) return;
    this.Key = new AxrtCountryCodeMapObjectKeyData (other.Key);
    this.TaxIdentifier = other.TaxIdentifier;
    this._TaxIdentifierSet = other._TaxIdentifierSet;
    this.DefaultCurrencyCode = other.DefaultCurrencyCode;
    this._DefaultCurrencyCodeSet = other._DefaultCurrencyCodeSet;
    this.IsoCode = other.IsoCode;
    this._IsoCodeSet = other._IsoCodeSet;
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
   * @return AxrtCountryCodeMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AxrtCountryCodeMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AxrtCountryCodeMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: CountryCode (COUNTRY_CODE_VALUES.country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCountryCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountryCode", "setCountryCode");
    }
    if (this.Key == null) this.Key = new AxrtCountryCodeMapObjectKeyData ();
    this.Key.CountryCode = value;
    this.Key._CountryCodeSet = true;
  }
  /** get the value of the field: CountryCode (COUNTRY_CODE_VALUES.country_code)
   * @return Integer the value
   */
  public Integer getCountryCode () {
    if (this.Key == null) return null;
    return this.Key.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode (COUNTRY_CODE_VALUES.country_code)
   */
  public void unsetCountryCode () {
    if (this.Key == null) return;
    this.Key._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode (COUNTRY_CODE_VALUES.country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode () {
    if (this.Key == null) return false;
    return this.Key._CountryCodeSet;
  }

  /** Retrieves the CountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCode field
   */
   public String getCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCode field from a formatted string
   *
   * @param _value the CountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCode field
   */
   public void setCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeFromFormattedString");
   }

  /** set the fields value: LanguageCode (COUNTRY_CODE_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new AxrtCountryCodeMapObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (COUNTRY_CODE_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (COUNTRY_CODE_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (COUNTRY_CODE_VALUES.language_code)
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

  /** set the fields value: TaxIdentifier (COUNTRY_CODE_REF.tax_identifier)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxIdentifier") 
  public void setTaxIdentifier (Integer value) throws ServiceException
  {
    this.TaxIdentifier = value;
    this._TaxIdentifierSet = true;
  }

  /** Retrieves the TaxIdentifier field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxIdentifier field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxIdentifier field
   */
   public String getTaxIdentifierAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxIdentifierAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxIdentifierAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxIdentifier(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxIdentifier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxIdentifierAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxIdentifier field from a formatted string
   *
   * @param _value the TaxIdentifier field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxIdentifier field
   */
   public void setTaxIdentifierFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxIdentifierFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxIdentifier(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxIdentifier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxIdentifierFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxIdentifierFromFormattedString");
   }

  /** get the value of the field: TaxIdentifier (COUNTRY_CODE_REF.tax_identifier)
   * @return Integer the value
   */
  public Integer getTaxIdentifier () {
    return this.TaxIdentifier;
  }
  /** Change the field to not being actively set: TaxIdentifier (COUNTRY_CODE_REF.tax_identifier)
   */
  public void unsetTaxIdentifier () {
    this._TaxIdentifierSet = false;
  }
  /** See if the field is actively set: TaxIdentifier (COUNTRY_CODE_REF.tax_identifier)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxIdentifier () {
    return this._TaxIdentifierSet;
  }
  /** set the fields value: DefaultCurrencyCode (COUNTRY_CODE_REF.default_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DefaultCurrencyCode") 
  public void setDefaultCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DefaultCurrencyCode", "setDefaultCurrencyCode");
    }
    this.DefaultCurrencyCode = value;
    this._DefaultCurrencyCodeSet = true;
  }

  /** Retrieves the DefaultCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DefaultCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefaultCurrencyCode field
   */
   public String getDefaultCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefaultCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDefaultCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefaultCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DefaultCurrencyCode field from a formatted string
   *
   * @param _value the DefaultCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DefaultCurrencyCode field
   */
   public void setDefaultCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDefaultCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefaultCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefaultCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: DefaultCurrencyCode (COUNTRY_CODE_REF.default_currency_code)
   * @return Integer the value
   */
  public Integer getDefaultCurrencyCode () {
    return this.DefaultCurrencyCode;
  }
  /** Change the field to not being actively set: DefaultCurrencyCode (COUNTRY_CODE_REF.default_currency_code)
   */
  public void unsetDefaultCurrencyCode () {
    this._DefaultCurrencyCodeSet = false;
  }
  /** See if the field is actively set: DefaultCurrencyCode (COUNTRY_CODE_REF.default_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDefaultCurrencyCode () {
    return this._DefaultCurrencyCodeSet;
  }
  /** set the fields value: IsoCode (COUNTRY_CODE_REF.iso_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsoCode") 
  public void setIsoCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 2))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "IsoCode", "setIsoCode");
    }
    this.IsoCode = value;
    this._IsoCodeSet = true;
  }

  /** Retrieves the IsoCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsoCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsoCode field
   */
   public String getIsoCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsoCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsoCodeAsFormattedString");
       return fmtMgr.formatString(this.getIsoCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsoCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsoCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsoCode field from a formatted string
   *
   * @param _value the IsoCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsoCode field
   */
   public void setIsoCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsoCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsoCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsoCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsoCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsoCodeFromFormattedString");
   }

  /** get the value of the field: IsoCode (COUNTRY_CODE_REF.iso_code)
   * @return String the value
   */
  public String getIsoCode () {
    return this.IsoCode;
  }
  /** Change the field to not being actively set: IsoCode (COUNTRY_CODE_REF.iso_code)
   */
  public void unsetIsoCode () {
    this._IsoCodeSet = false;
  }
  /** See if the field is actively set: IsoCode (COUNTRY_CODE_REF.iso_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsoCode () {
    return this._IsoCodeSet;
  }
  /** set the fields value: IsDefault (COUNTRY_CODE_REF.is_default)
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

  /** get the value of the field: IsDefault (COUNTRY_CODE_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (COUNTRY_CODE_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (COUNTRY_CODE_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (COUNTRY_CODE_REF.is_internal)
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

  /** get the value of the field: IsInternal (COUNTRY_CODE_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (COUNTRY_CODE_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (COUNTRY_CODE_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (COUNTRY_CODE_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (COUNTRY_CODE_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (COUNTRY_CODE_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (COUNTRY_CODE_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (COUNTRY_CODE_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (COUNTRY_CODE_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (COUNTRY_CODE_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (COUNTRY_CODE_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (COUNTRY_CODE_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (COUNTRY_CODE_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (COUNTRY_CODE_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (COUNTRY_CODE_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return AxrtCountryCodeMapObjectHelper.toMap(this, null).toString();
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
  /** COUNTRY_CODE_REF.tax_identifier field */
    if(!nonNullOnly || (TaxIdentifier != null))  _TaxIdentifierSet = flag;
  /** COUNTRY_CODE_REF.default_currency_code field */
    if(!nonNullOnly || (DefaultCurrencyCode != null))  _DefaultCurrencyCodeSet = flag;
  /** COUNTRY_CODE_REF.iso_code field */
    if(!nonNullOnly || (IsoCode != null))  _IsoCodeSet = flag;
  /** COUNTRY_CODE_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** COUNTRY_CODE_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** COUNTRY_CODE_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** COUNTRY_CODE_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** COUNTRY_CODE_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
