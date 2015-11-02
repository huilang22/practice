/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GEObjectData.java
 * Definition File: Admin/GenericEnumeration.xml
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
  
/** GEObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class GEObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public GEObjectKeyData Key = null;
  /** GENERIC_ENUMERATION_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** GENERIC_ENUMERATION_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** GENERIC_ENUMERATION_REF.sort_index field */
  public    Integer SortIndex  = null;
  protected boolean _SortIndexSet = false;
  /** GENERIC_ENUMERATION_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** GENERIC_ENUMERATION_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** GENERIC_ENUMERATION_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "GEObjectData";
  /** Default constructor */
  public GEObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public GEObjectData (GEObjectData other)
  {

    if (other == null) return;
    this.Key = new GEObjectKeyData (other.Key);
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.SortIndex = other.SortIndex;
    this._SortIndexSet = other._SortIndexSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
  }

  /** get the Key for this object
   * @return GEObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public GEObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (GEObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEnumerationKey (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EnumerationKey", "setEnumerationKey");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EnumerationKey", "setEnumerationKey");
    }
    if (this.Key == null) this.Key = new GEObjectKeyData ();
    this.Key.EnumerationKey = value;
    this.Key._EnumerationKeySet = true;
  }
  /** get the value of the field: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return String the value
   */
  public String getEnumerationKey () {
    if (this.Key == null) return null;
    return this.Key.EnumerationKey;
  }
  /** Change the field to not being actively set: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   */
  public void unsetEnumerationKey () {
    if (this.Key == null) return;
    this.Key._EnumerationKeySet = false;
  }
  /** See if the field is actively set: EnumerationKey (GENERIC_ENUMERATION_VALUES.enumeration_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetEnumerationKey () {
    if (this.Key == null) return false;
    return this.Key._EnumerationKeySet;
  }

  /** Retrieves the EnumerationKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EnumerationKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EnumerationKey field
   */
   public String getEnumerationKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEnumerationKeyAsFormattedString");
       return fmtMgr.formatString(this.getEnumerationKey());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEnumerationKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the EnumerationKey field from a formatted string
   *
   * @param _value the EnumerationKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EnumerationKey field
   */
   public void setEnumerationKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEnumerationKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEnumerationKey(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EnumerationKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEnumerationKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEnumerationKeyFromFormattedString");
   }

  /** set the fields value: Value (GENERIC_ENUMERATION_VALUES.value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Value", "setValue");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Value", "setValue");
    }
    if (this.Key == null) this.Key = new GEObjectKeyData ();
    this.Key.Value = value;
    this.Key._ValueSet = true;
  }
  /** get the value of the field: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return String the value
   */
  public String getValue () {
    if (this.Key == null) return null;
    return this.Key.Value;
  }
  /** Change the field to not being actively set: Value (GENERIC_ENUMERATION_VALUES.value)
   */
  public void unsetValue () {
    if (this.Key == null) return;
    this.Key._ValueSet = false;
  }
  /** See if the field is actively set: Value (GENERIC_ENUMERATION_VALUES.value)
   * @return boolean whether the field is actively set
   */
  public boolean issetValue () {
    if (this.Key == null) return false;
    return this.Key._ValueSet;
  }

  /** Retrieves the Value field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Value field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Value field
   */
   public String getValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValueAsFormattedString");
       return fmtMgr.formatString(this.getValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Value");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the Value field from a formatted string
   *
   * @param _value the Value field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Value field
   */
   public void setValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Value");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValueFromFormattedString");
   }

  /** set the fields value: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new GEObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (GENERIC_ENUMERATION_VALUES.language_code)
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

  /** set the fields value: IsDefault (GENERIC_ENUMERATION_REF.is_default)
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

  /** get the value of the field: IsDefault (GENERIC_ENUMERATION_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (GENERIC_ENUMERATION_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (GENERIC_ENUMERATION_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (GENERIC_ENUMERATION_REF.is_internal)
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

  /** get the value of the field: IsInternal (GENERIC_ENUMERATION_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (GENERIC_ENUMERATION_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (GENERIC_ENUMERATION_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: SortIndex (GENERIC_ENUMERATION_REF.sort_index)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SortIndex") 
  public void setSortIndex (Integer value) throws ServiceException
  {
    this.SortIndex = value;
    this._SortIndexSet = true;
  }

  /** Retrieves the SortIndex field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SortIndex field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SortIndex field
   */
   public String getSortIndexAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSortIndexAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSortIndexAsFormattedString");
       return fmtMgr.formatNumber(this.getSortIndex(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SortIndex");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSortIndexAsFormattedString");
       throw x;
     }
   }
  /** Sets the SortIndex field from a formatted string
   *
   * @param _value the SortIndex field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SortIndex field
   */
   public void setSortIndexFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSortIndexFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSortIndex(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SortIndex");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSortIndexFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSortIndexFromFormattedString");
   }

  /** get the value of the field: SortIndex (GENERIC_ENUMERATION_REF.sort_index)
   * @return Integer the value
   */
  public Integer getSortIndex () {
    return this.SortIndex;
  }
  /** Change the field to not being actively set: SortIndex (GENERIC_ENUMERATION_REF.sort_index)
   */
  public void unsetSortIndex () {
    this._SortIndexSet = false;
  }
  /** See if the field is actively set: SortIndex (GENERIC_ENUMERATION_REF.sort_index)
   * @return boolean whether the field is actively set
   */
  public boolean issetSortIndex () {
    return this._SortIndexSet;
  }
  /** set the fields value: ConfigTagId (GENERIC_ENUMERATION_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (GENERIC_ENUMERATION_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (GENERIC_ENUMERATION_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (GENERIC_ENUMERATION_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (GENERIC_ENUMERATION_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (GENERIC_ENUMERATION_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (GENERIC_ENUMERATION_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (GENERIC_ENUMERATION_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (GENERIC_ENUMERATION_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (GENERIC_ENUMERATION_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (GENERIC_ENUMERATION_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (GENERIC_ENUMERATION_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return GEObjectHelper.toMap(this, null).toString();
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
  /** GENERIC_ENUMERATION_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** GENERIC_ENUMERATION_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** GENERIC_ENUMERATION_REF.sort_index field */
    if(!nonNullOnly || (SortIndex != null))  _SortIndexSet = flag;
  /** GENERIC_ENUMERATION_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** GENERIC_ENUMERATION_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** GENERIC_ENUMERATION_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}