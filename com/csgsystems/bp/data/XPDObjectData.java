/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPDObjectData.java
 * Definition File: Admin/ExtendedDataParam.xml
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
  
/** XPDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class XPDObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public XPDObjectKeyData Key = null;
  /** PARAM_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** PARAM_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  /** PARAM_VALUES.validation_rules_desc field */
  public    String ValidationRulesDesc  = null;
  protected boolean _ValidationRulesDescSet = false;
  /** PARAM_DEF.param_name field */
  public    String ParamName  = null;
  protected boolean _ParamNameSet = false;
  /** PARAM_DEF.param_datatype field */
  public    Integer ParamDatatype  = null;
  protected boolean _ParamDatatypeSet = false;
  /** PARAM_DEF.assoc_enumeration_id field */
  public    Integer AssocEnumerationId  = null;
  protected boolean _AssocEnumerationIdSet = false;
  /** PARAM_DEF.is_addressable field */
  public    Boolean IsAddressable  = null;
  protected boolean _IsAddressableSet = false;
  /** PARAM_DEF.param_external_id field */
  public    String ParamExternalId  = null;
  protected boolean _ParamExternalIdSet = false;
  /** PARAM_DEF.validation_rules field */
  public    String ValidationRules  = null;
  protected boolean _ValidationRulesSet = false;
  /** PARAM_DEF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "XPDObjectData";
  /** Default constructor */
  public XPDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public XPDObjectData (XPDObjectData other)
  {

    if (other == null) return;
    this.Key = new XPDObjectKeyData (other.Key);
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
    this.ValidationRulesDesc = other.ValidationRulesDesc;
    this._ValidationRulesDescSet = other._ValidationRulesDescSet;
    this.ParamName = other.ParamName;
    this._ParamNameSet = other._ParamNameSet;
    this.ParamDatatype = other.ParamDatatype;
    this._ParamDatatypeSet = other._ParamDatatypeSet;
    this.AssocEnumerationId = other.AssocEnumerationId;
    this._AssocEnumerationIdSet = other._AssocEnumerationIdSet;
    this.IsAddressable = other.IsAddressable;
    this._IsAddressableSet = other._IsAddressableSet;
    this.ParamExternalId = other.ParamExternalId;
    this._ParamExternalIdSet = other._ParamExternalIdSet;
    this.ValidationRules = other.ValidationRules;
    this._ValidationRulesSet = other._ValidationRulesSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return XPDObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public XPDObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (XPDObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ParamId (PARAM_DEF.param_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParamId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamId", "setParamId");
    }
    if (this.Key == null) this.Key = new XPDObjectKeyData ();
    this.Key.ParamId = value;
    this.Key._ParamIdSet = true;
  }
  /** get the value of the field: ParamId (PARAM_DEF.param_id)
   * @return Integer the value
   */
  public Integer getParamId () {
    if (this.Key == null) return null;
    return this.Key.ParamId;
  }
  /** Change the field to not being actively set: ParamId (PARAM_DEF.param_id)
   */
  public void unsetParamId () {
    if (this.Key == null) return;
    this.Key._ParamIdSet = false;
  }
  /** See if the field is actively set: ParamId (PARAM_DEF.param_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamId () {
    if (this.Key == null) return false;
    return this.Key._ParamIdSet;
  }

  /** Retrieves the ParamId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamId field
   */
   public String getParamIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParamId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamId field from a formatted string
   *
   * @param _value the ParamId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamId field
   */
   public void setParamIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (PARAM_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new XPDObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (PARAM_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (PARAM_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (PARAM_VALUES.language_code)
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

  /** set the fields value: ShortDisplay (PARAM_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (PARAM_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (PARAM_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (PARAM_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (PARAM_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (PARAM_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (PARAM_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (PARAM_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  /** set the fields value: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ValidationRulesDesc") 
  public void setValidationRulesDesc (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ValidationRulesDesc", "setValidationRulesDesc");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ValidationRulesDesc", "setValidationRulesDesc");
    }
    this.ValidationRulesDesc = value;
    this._ValidationRulesDescSet = true;
  }

  /** Retrieves the ValidationRulesDesc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ValidationRulesDesc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ValidationRulesDesc field
   */
   public String getValidationRulesDescAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesDescAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValidationRulesDescAsFormattedString");
       return fmtMgr.formatString(this.getValidationRulesDesc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ValidationRulesDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getValidationRulesDescAsFormattedString");
       throw x;
     }
   }
  /** Sets the ValidationRulesDesc field from a formatted string
   *
   * @param _value the ValidationRulesDesc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ValidationRulesDesc field
   */
   public void setValidationRulesDescFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesDescFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setValidationRulesDesc(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ValidationRulesDesc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setValidationRulesDescFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValidationRulesDescFromFormattedString");
   }

  /** get the value of the field: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return String the value
   */
  public String getValidationRulesDesc () {
    return this.ValidationRulesDesc;
  }
  /** Change the field to not being actively set: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   */
  public void unsetValidationRulesDesc () {
    this._ValidationRulesDescSet = false;
  }
  /** See if the field is actively set: ValidationRulesDesc (PARAM_VALUES.validation_rules_desc)
   * @return boolean whether the field is actively set
   */
  public boolean issetValidationRulesDesc () {
    return this._ValidationRulesDescSet;
  }
  /** set the fields value: ParamName (PARAM_DEF.param_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamName") 
  public void setParamName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamName", "setParamName");
    }
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParamName", "setParamName");
    }
    this.ParamName = value;
    this._ParamNameSet = true;
  }

  /** Retrieves the ParamName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamName field
   */
   public String getParamNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamNameAsFormattedString");
       return fmtMgr.formatString(this.getParamName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamName field from a formatted string
   *
   * @param _value the ParamName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamName field
   */
   public void setParamNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamNameFromFormattedString");
   }

  /** get the value of the field: ParamName (PARAM_DEF.param_name)
   * @return String the value
   */
  public String getParamName () {
    return this.ParamName;
  }
  /** Change the field to not being actively set: ParamName (PARAM_DEF.param_name)
   */
  public void unsetParamName () {
    this._ParamNameSet = false;
  }
  /** See if the field is actively set: ParamName (PARAM_DEF.param_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamName () {
    return this._ParamNameSet;
  }
  /** set the fields value: ParamDatatype (PARAM_DEF.param_datatype)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamDatatype") 
  public void setParamDatatype (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParamDatatype", "setParamDatatype");
    }
    this.ParamDatatype = value;
    this._ParamDatatypeSet = true;
  }

  /** Retrieves the ParamDatatype field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamDatatype field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamDatatype field
   */
   public String getParamDatatypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamDatatypeAsFormattedString");
       return fmtMgr.formatNumber(this.getParamDatatype(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamDatatype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamDatatypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamDatatype field from a formatted string
   *
   * @param _value the ParamDatatype field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamDatatype field
   */
   public void setParamDatatypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamDatatypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamDatatype(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamDatatype");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamDatatypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamDatatypeFromFormattedString");
   }

  /** get the value of the field: ParamDatatype (PARAM_DEF.param_datatype)
   * @return Integer the value
   */
  public Integer getParamDatatype () {
    return this.ParamDatatype;
  }
  /** Change the field to not being actively set: ParamDatatype (PARAM_DEF.param_datatype)
   */
  public void unsetParamDatatype () {
    this._ParamDatatypeSet = false;
  }
  /** See if the field is actively set: ParamDatatype (PARAM_DEF.param_datatype)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamDatatype () {
    return this._ParamDatatypeSet;
  }
  /** set the fields value: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AssocEnumerationId") 
  public void setAssocEnumerationId (Integer value) throws ServiceException
  {
    this.AssocEnumerationId = value;
    this._AssocEnumerationIdSet = true;
  }

  /** Retrieves the AssocEnumerationId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AssocEnumerationId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AssocEnumerationId field
   */
   public String getAssocEnumerationIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssocEnumerationIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAssocEnumerationIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAssocEnumerationId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssocEnumerationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAssocEnumerationIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AssocEnumerationId field from a formatted string
   *
   * @param _value the AssocEnumerationId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AssocEnumerationId field
   */
   public void setAssocEnumerationIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAssocEnumerationIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAssocEnumerationId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AssocEnumerationId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAssocEnumerationIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAssocEnumerationIdFromFormattedString");
   }

  /** get the value of the field: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return Integer the value
   */
  public Integer getAssocEnumerationId () {
    return this.AssocEnumerationId;
  }
  /** Change the field to not being actively set: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   */
  public void unsetAssocEnumerationId () {
    this._AssocEnumerationIdSet = false;
  }
  /** See if the field is actively set: AssocEnumerationId (PARAM_DEF.assoc_enumeration_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAssocEnumerationId () {
    return this._AssocEnumerationIdSet;
  }
  /** set the fields value: IsAddressable (PARAM_DEF.is_addressable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsAddressable") 
  public void setIsAddressable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsAddressable", "setIsAddressable");
    }
    this.IsAddressable = value;
    this._IsAddressableSet = true;
  }

  /** Retrieves the IsAddressable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsAddressable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsAddressable field
   */
   public String getIsAddressableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAddressableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsAddressableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsAddressable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsAddressable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsAddressableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsAddressable field from a formatted string
   *
   * @param _value the IsAddressable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsAddressable field
   */
   public void setIsAddressableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAddressableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsAddressable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsAddressable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsAddressableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsAddressableFromFormattedString");
   }

  /** get the value of the field: IsAddressable (PARAM_DEF.is_addressable)
   * @return Boolean the value
   */
  public Boolean getIsAddressable () {
    return this.IsAddressable;
  }
  /** Change the field to not being actively set: IsAddressable (PARAM_DEF.is_addressable)
   */
  public void unsetIsAddressable () {
    this._IsAddressableSet = false;
  }
  /** See if the field is actively set: IsAddressable (PARAM_DEF.is_addressable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsAddressable () {
    return this._IsAddressableSet;
  }
  /** set the fields value: ParamExternalId (PARAM_DEF.param_external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParamExternalId") 
  public void setParamExternalId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParamExternalId", "setParamExternalId");
    }
    this.ParamExternalId = value;
    this._ParamExternalIdSet = true;
  }

  /** Retrieves the ParamExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParamExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParamExternalId field
   */
   public String getParamExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParamExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getParamExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParamExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParamExternalId field from a formatted string
   *
   * @param _value the ParamExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParamExternalId field
   */
   public void setParamExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParamExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParamExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParamExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParamExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParamExternalIdFromFormattedString");
   }

  /** get the value of the field: ParamExternalId (PARAM_DEF.param_external_id)
   * @return String the value
   */
  public String getParamExternalId () {
    return this.ParamExternalId;
  }
  /** Change the field to not being actively set: ParamExternalId (PARAM_DEF.param_external_id)
   */
  public void unsetParamExternalId () {
    this._ParamExternalIdSet = false;
  }
  /** See if the field is actively set: ParamExternalId (PARAM_DEF.param_external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParamExternalId () {
    return this._ParamExternalIdSet;
  }
  /** set the fields value: ValidationRules (PARAM_DEF.validation_rules)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ValidationRules") 
  public void setValidationRules (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 2000))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ValidationRules", "setValidationRules");
    }
    this.ValidationRules = value;
    this._ValidationRulesSet = true;
  }

  /** Retrieves the ValidationRules field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ValidationRules field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ValidationRules field
   */
   public String getValidationRulesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getValidationRulesAsFormattedString");
       return fmtMgr.formatString(this.getValidationRules());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ValidationRules");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getValidationRulesAsFormattedString");
       throw x;
     }
   }
  /** Sets the ValidationRules field from a formatted string
   *
   * @param _value the ValidationRules field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ValidationRules field
   */
   public void setValidationRulesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getValidationRulesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setValidationRules(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ValidationRules");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setValidationRulesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setValidationRulesFromFormattedString");
   }

  /** get the value of the field: ValidationRules (PARAM_DEF.validation_rules)
   * @return String the value
   */
  public String getValidationRules () {
    return this.ValidationRules;
  }
  /** Change the field to not being actively set: ValidationRules (PARAM_DEF.validation_rules)
   */
  public void unsetValidationRules () {
    this._ValidationRulesSet = false;
  }
  /** See if the field is actively set: ValidationRules (PARAM_DEF.validation_rules)
   * @return boolean whether the field is actively set
   */
  public boolean issetValidationRules () {
    return this._ValidationRulesSet;
  }
  /** set the fields value: ConfigTagId (PARAM_DEF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (PARAM_DEF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (PARAM_DEF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return XPDObjectHelper.toMap(this, null).toString();
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
  /** PARAM_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** PARAM_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  /** PARAM_VALUES.validation_rules_desc field */
    if(!nonNullOnly || (ValidationRulesDesc != null))  _ValidationRulesDescSet = flag;
  /** PARAM_DEF.param_name field */
    if(!nonNullOnly || (ParamName != null))  _ParamNameSet = flag;
  /** PARAM_DEF.param_datatype field */
    if(!nonNullOnly || (ParamDatatype != null))  _ParamDatatypeSet = flag;
  /** PARAM_DEF.assoc_enumeration_id field */
    if(!nonNullOnly || (AssocEnumerationId != null))  _AssocEnumerationIdSet = flag;
  /** PARAM_DEF.is_addressable field */
    if(!nonNullOnly || (IsAddressable != null))  _IsAddressableSet = flag;
  /** PARAM_DEF.param_external_id field */
    if(!nonNullOnly || (ParamExternalId != null))  _ParamExternalIdSet = flag;
  /** PARAM_DEF.validation_rules field */
    if(!nonNullOnly || (ValidationRules != null))  _ValidationRulesSet = flag;
  /** PARAM_DEF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
