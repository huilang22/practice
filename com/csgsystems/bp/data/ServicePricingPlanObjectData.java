/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServicePricingPlanObjectData.java
 * Definition File: Admin/ServicePricingPlan.xml
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
  
/** ServicePricingPlanObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ServicePricingPlanObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ServicePricingPlanObjectKeyData Key = null;
  /** EMF_CONFIG_ID_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** EMF_CONFIG_ID_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  /** EMF_CONFIG_ID_VALUES.format_display field */
  public    String FormatDisplay  = null;
  protected boolean _FormatDisplaySet = false;
  /** EMF_CONFIG_ID_REF.default_external_id_type field */
  public    Integer DefaultExternalIdType  = null;
  protected boolean _DefaultExternalIdTypeSet = false;
  /** EMF_CONFIG_ID_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** EMF_CONFIG_ID_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** EMF_CONFIG_ID_REF.is_serviceability_applicable field */
  public    Boolean IsServiceabilityApplicable  = null;
  protected boolean _IsServiceabilityApplicableSet = false;
  /** EMF_CONFIG_ID_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** EMF_CONFIGURATION.emf_type field */
  public    Integer EmfType  = null;
  protected boolean _EmfTypeSet = false;
  /** EMF_CONFIGURATION.equip_type_code field */
  public    Integer EquipTypeCode  = null;
  protected boolean _EquipTypeCodeSet = false;
  /** EMF_CONFIGURATION.equip_class_code field */
  public    Integer EquipClassCode  = null;
  protected boolean _EquipClassCodeSet = false;
  /** EMF_CONFIGURATION.class_of_service_code field */
  public    Integer ClassOfServiceCode  = null;
  protected boolean _ClassOfServiceCodeSet = false;
  /** EMF_CONFIGURATION.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** EMF_CONFIGURATION.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** EMF_CONFIGURATION.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** EMF_CONFIGURATION.emf_book_id field */
  public    Integer EmfBookId  = null;
  protected boolean _EmfBookIdSet = false;
  /** EMF_CONFIGURATION.industry_type field */
  public    Integer IndustryType  = null;
  protected boolean _IndustryTypeSet = false;
  /** INDUSTRY_TYPE_REF.use_address_server field */
  public    Boolean UseAddressServer  = null;
  protected boolean _UseAddressServerSet = false;
  /** INDUSTRY_TYPE_REF.is_e911_required field */
  public    Boolean IsE911Required  = null;
  protected boolean _IsE911RequiredSet = false;
  /** INDUSTRY_TYPE_REF.is_lidb_required field */
  public    Boolean IsLidbRequired  = null;
  protected boolean _IsLidbRequiredSet = false;
  /** INDUSTRY_TYPE_REF.is_pic_required field */
  public    Boolean IsPicRequired  = null;
  protected boolean _IsPicRequiredSet = false;
  /** INDUSTRY_TYPE_REF.is_dadl_used field */
  public    Boolean IsDadlUsed  = null;
  protected boolean _IsDadlUsedSet = false;
  /** INDUSTRY_TYPE_REF.is_calling_card_used field */
  public    Boolean IsCallingCardUsed  = null;
  protected boolean _IsCallingCardUsedSet = false;
  private String _objName = "ServicePricingPlanObjectData";
  /** Default constructor */
  public ServicePricingPlanObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ServicePricingPlanObjectData (ServicePricingPlanObjectData other)
  {

    if (other == null) return;
    this.Key = new ServicePricingPlanObjectKeyData (other.Key);
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
    this.FormatDisplay = other.FormatDisplay;
    this._FormatDisplaySet = other._FormatDisplaySet;
    this.DefaultExternalIdType = other.DefaultExternalIdType;
    this._DefaultExternalIdTypeSet = other._DefaultExternalIdTypeSet;
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.IsServiceabilityApplicable = other.IsServiceabilityApplicable;
    this._IsServiceabilityApplicableSet = other._IsServiceabilityApplicableSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.EmfType = other.EmfType;
    this._EmfTypeSet = other._EmfTypeSet;
    this.EquipTypeCode = other.EquipTypeCode;
    this._EquipTypeCodeSet = other._EquipTypeCodeSet;
    this.EquipClassCode = other.EquipClassCode;
    this._EquipClassCodeSet = other._EquipClassCodeSet;
    this.ClassOfServiceCode = other.ClassOfServiceCode;
    this._ClassOfServiceCodeSet = other._ClassOfServiceCodeSet;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.EmfBookId = other.EmfBookId;
    this._EmfBookIdSet = other._EmfBookIdSet;
    this.IndustryType = other.IndustryType;
    this._IndustryTypeSet = other._IndustryTypeSet;
    this.UseAddressServer = other.UseAddressServer;
    this._UseAddressServerSet = other._UseAddressServerSet;
    this.IsE911Required = other.IsE911Required;
    this._IsE911RequiredSet = other._IsE911RequiredSet;
    this.IsLidbRequired = other.IsLidbRequired;
    this._IsLidbRequiredSet = other._IsLidbRequiredSet;
    this.IsPicRequired = other.IsPicRequired;
    this._IsPicRequiredSet = other._IsPicRequiredSet;
    this.IsDadlUsed = other.IsDadlUsed;
    this._IsDadlUsedSet = other._IsDadlUsedSet;
    this.IsCallingCardUsed = other.IsCallingCardUsed;
    this._IsCallingCardUsedSet = other._IsCallingCardUsedSet;
  }

  /** get the Key for this object
   * @return ServicePricingPlanObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ServicePricingPlanObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ServicePricingPlanObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setEmfConfigId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfConfigId", "setEmfConfigId");
    }
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyData ();
    this.Key.EmfConfigId = value;
    this.Key._EmfConfigIdSet = true;
  }
  /** get the value of the field: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    if (this.Key == null) return null;
    return this.Key.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   */
  public void unsetEmfConfigId () {
    if (this.Key == null) return;
    this.Key._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (EMF_CONFIG_ID_VALUES.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    if (this.Key == null) return false;
    return this.Key._EmfConfigIdSet;
  }

  /** Retrieves the EmfConfigId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfConfigId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigId field
   */
   public String getEmfConfigIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfConfigId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfConfigId field from a formatted string
   *
   * @param _value the EmfConfigId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfConfigId field
   */
   public void setEmfConfigIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfConfigId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new ServicePricingPlanObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (EMF_CONFIG_ID_VALUES.language_code)
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

  /** set the fields value: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (EMF_CONFIG_ID_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (EMF_CONFIG_ID_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  /** set the fields value: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FormatDisplay") 
  public void setFormatDisplay (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FormatDisplay", "setFormatDisplay");
    }
    this.FormatDisplay = value;
    this._FormatDisplaySet = true;
  }

  /** Retrieves the FormatDisplay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FormatDisplay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatDisplay field
   */
   public String getFormatDisplayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatDisplayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatDisplayAsFormattedString");
       return fmtMgr.formatString(this.getFormatDisplay());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatDisplayAsFormattedString");
       throw x;
     }
   }
  /** Sets the FormatDisplay field from a formatted string
   *
   * @param _value the FormatDisplay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FormatDisplay field
   */
   public void setFormatDisplayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatDisplayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFormatDisplay(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatDisplay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatDisplayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatDisplayFromFormattedString");
   }

  /** get the value of the field: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return String the value
   */
  public String getFormatDisplay () {
    return this.FormatDisplay;
  }
  /** Change the field to not being actively set: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   */
  public void unsetFormatDisplay () {
    this._FormatDisplaySet = false;
  }
  /** See if the field is actively set: FormatDisplay (EMF_CONFIG_ID_VALUES.format_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetFormatDisplay () {
    return this._FormatDisplaySet;
  }
  /** set the fields value: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DefaultExternalIdType") 
  public void setDefaultExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DefaultExternalIdType", "setDefaultExternalIdType");
    }
    this.DefaultExternalIdType = value;
    this._DefaultExternalIdTypeSet = true;
  }

  /** Retrieves the DefaultExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DefaultExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefaultExternalIdType field
   */
   public String getDefaultExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefaultExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDefaultExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefaultExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DefaultExternalIdType field from a formatted string
   *
   * @param _value the DefaultExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DefaultExternalIdType field
   */
   public void setDefaultExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefaultExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDefaultExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DefaultExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefaultExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefaultExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return Integer the value
   */
  public Integer getDefaultExternalIdType () {
    return this.DefaultExternalIdType;
  }
  /** Change the field to not being actively set: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   */
  public void unsetDefaultExternalIdType () {
    this._DefaultExternalIdTypeSet = false;
  }
  /** See if the field is actively set: DefaultExternalIdType (EMF_CONFIG_ID_REF.default_external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDefaultExternalIdType () {
    return this._DefaultExternalIdTypeSet;
  }
  /** set the fields value: IsDefault (EMF_CONFIG_ID_REF.is_default)
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

  /** get the value of the field: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (EMF_CONFIG_ID_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (EMF_CONFIG_ID_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (EMF_CONFIG_ID_REF.is_internal)
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

  /** get the value of the field: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (EMF_CONFIG_ID_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsServiceabilityApplicable") 
  public void setIsServiceabilityApplicable (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsServiceabilityApplicable", "setIsServiceabilityApplicable");
    }
    this.IsServiceabilityApplicable = value;
    this._IsServiceabilityApplicableSet = true;
  }

  /** Retrieves the IsServiceabilityApplicable field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsServiceabilityApplicable field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsServiceabilityApplicable field
   */
   public String getIsServiceabilityApplicableAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsServiceabilityApplicableAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsServiceabilityApplicableAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsServiceabilityApplicable());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsServiceabilityApplicable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsServiceabilityApplicableAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsServiceabilityApplicable field from a formatted string
   *
   * @param _value the IsServiceabilityApplicable field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsServiceabilityApplicable field
   */
   public void setIsServiceabilityApplicableFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsServiceabilityApplicableFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsServiceabilityApplicable(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsServiceabilityApplicable");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsServiceabilityApplicableFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsServiceabilityApplicableFromFormattedString");
   }

  /** get the value of the field: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return Boolean the value
   */
  public Boolean getIsServiceabilityApplicable () {
    return this.IsServiceabilityApplicable;
  }
  /** Change the field to not being actively set: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   */
  public void unsetIsServiceabilityApplicable () {
    this._IsServiceabilityApplicableSet = false;
  }
  /** See if the field is actively set: IsServiceabilityApplicable (EMF_CONFIG_ID_REF.is_serviceability_applicable)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsServiceabilityApplicable () {
    return this._IsServiceabilityApplicableSet;
  }
  /** set the fields value: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (EMF_CONFIG_ID_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: EmfType (EMF_CONFIGURATION.emf_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmfType") 
  public void setEmfType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfType", "setEmfType");
    }
    this.EmfType = value;
    this._EmfTypeSet = true;
  }

  /** Retrieves the EmfType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfType field
   */
   public String getEmfTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfType field from a formatted string
   *
   * @param _value the EmfType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfType field
   */
   public void setEmfTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfTypeFromFormattedString");
   }

  /** get the value of the field: EmfType (EMF_CONFIGURATION.emf_type)
   * @return Integer the value
   */
  public Integer getEmfType () {
    return this.EmfType;
  }
  /** Change the field to not being actively set: EmfType (EMF_CONFIGURATION.emf_type)
   */
  public void unsetEmfType () {
    this._EmfTypeSet = false;
  }
  /** See if the field is actively set: EmfType (EMF_CONFIGURATION.emf_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfType () {
    return this._EmfTypeSet;
  }
  /** set the fields value: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EquipTypeCode") 
  public void setEquipTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EquipTypeCode", "setEquipTypeCode");
    }
    this.EquipTypeCode = value;
    this._EquipTypeCodeSet = true;
  }

  /** Retrieves the EquipTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EquipTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipTypeCode field
   */
   public String getEquipTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getEquipTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EquipTypeCode field from a formatted string
   *
   * @param _value the EquipTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EquipTypeCode field
   */
   public void setEquipTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEquipTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipTypeCodeFromFormattedString");
   }

  /** get the value of the field: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return Integer the value
   */
  public Integer getEquipTypeCode () {
    return this.EquipTypeCode;
  }
  /** Change the field to not being actively set: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   */
  public void unsetEquipTypeCode () {
    this._EquipTypeCodeSet = false;
  }
  /** See if the field is actively set: EquipTypeCode (EMF_CONFIGURATION.equip_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipTypeCode () {
    return this._EquipTypeCodeSet;
  }
  /** set the fields value: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EquipClassCode") 
  public void setEquipClassCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EquipClassCode", "setEquipClassCode");
    }
    this.EquipClassCode = value;
    this._EquipClassCodeSet = true;
  }

  /** Retrieves the EquipClassCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EquipClassCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCode field
   */
   public String getEquipClassCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getEquipClassCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EquipClassCode field from a formatted string
   *
   * @param _value the EquipClassCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EquipClassCode field
   */
   public void setEquipClassCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEquipClassCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFromFormattedString");
   }

  /** get the value of the field: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return Integer the value
   */
  public Integer getEquipClassCode () {
    return this.EquipClassCode;
  }
  /** Change the field to not being actively set: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   */
  public void unsetEquipClassCode () {
    this._EquipClassCodeSet = false;
  }
  /** See if the field is actively set: EquipClassCode (EMF_CONFIGURATION.equip_class_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipClassCode () {
    return this._EquipClassCodeSet;
  }
  /** set the fields value: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClassOfServiceCode") 
  public void setClassOfServiceCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ClassOfServiceCode", "setClassOfServiceCode");
    }
    this.ClassOfServiceCode = value;
    this._ClassOfServiceCodeSet = true;
  }

  /** Retrieves the ClassOfServiceCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ClassOfServiceCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClassOfServiceCode field
   */
   public String getClassOfServiceCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClassOfServiceCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClassOfServiceCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getClassOfServiceCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClassOfServiceCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getClassOfServiceCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ClassOfServiceCode field from a formatted string
   *
   * @param _value the ClassOfServiceCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClassOfServiceCode field
   */
   public void setClassOfServiceCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClassOfServiceCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setClassOfServiceCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClassOfServiceCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setClassOfServiceCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClassOfServiceCodeFromFormattedString");
   }

  /** get the value of the field: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return Integer the value
   */
  public Integer getClassOfServiceCode () {
    return this.ClassOfServiceCode;
  }
  /** Change the field to not being actively set: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   */
  public void unsetClassOfServiceCode () {
    this._ClassOfServiceCodeSet = false;
  }
  /** See if the field is actively set: ClassOfServiceCode (EMF_CONFIGURATION.class_of_service_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetClassOfServiceCode () {
    return this._ClassOfServiceCodeSet;
  }
  /** set the fields value: RateClass (EMF_CONFIGURATION.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    this.RateClass = value;
    this._RateClassSet = true;
  }

  /** Retrieves the RateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClass field
   */
   public String getRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClass field from a formatted string
   *
   * @param _value the RateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClass field
   */
   public void setRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFromFormattedString");
   }

  /** get the value of the field: RateClass (EMF_CONFIGURATION.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (EMF_CONFIGURATION.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (EMF_CONFIGURATION.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (EMF_CONFIGURATION.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (EMF_CONFIGURATION.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDt") 
  public void setInactiveDt (Date value) throws ServiceException
  {
    this.InactiveDt = value;
    this._InactiveDtSet = true;
  }

  /** Retrieves the InactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
   public String getInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDt field from a formatted string
   *
   * @param _value the InactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
   public void setInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the InactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDt field
   */
  public String getInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDt field value from a formatted date/time string
   *
   * @param _value the InactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDt field
   */
  public void setInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (EMF_CONFIGURATION.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmfBookId") 
  public void setEmfBookId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfBookId", "setEmfBookId");
    }
    this.EmfBookId = value;
    this._EmfBookIdSet = true;
  }

  /** Retrieves the EmfBookId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfBookId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfBookId field
   */
   public String getEmfBookIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfBookIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfBookIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfBookId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfBookId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfBookIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfBookId field from a formatted string
   *
   * @param _value the EmfBookId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfBookId field
   */
   public void setEmfBookIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfBookIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfBookId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfBookId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfBookIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfBookIdFromFormattedString");
   }

  /** get the value of the field: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return Integer the value
   */
  public Integer getEmfBookId () {
    return this.EmfBookId;
  }
  /** Change the field to not being actively set: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   */
  public void unsetEmfBookId () {
    this._EmfBookIdSet = false;
  }
  /** See if the field is actively set: EmfBookId (EMF_CONFIGURATION.emf_book_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfBookId () {
    return this._EmfBookIdSet;
  }
  /** set the fields value: IndustryType (EMF_CONFIGURATION.industry_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IndustryType") 
  public void setIndustryType (Integer value) throws ServiceException
  {
    this.IndustryType = value;
    this._IndustryTypeSet = true;
  }

  /** Retrieves the IndustryType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IndustryType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IndustryType field
   */
   public String getIndustryTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIndustryTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIndustryTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getIndustryType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IndustryType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIndustryTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the IndustryType field from a formatted string
   *
   * @param _value the IndustryType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IndustryType field
   */
   public void setIndustryTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIndustryTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIndustryType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IndustryType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIndustryTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIndustryTypeFromFormattedString");
   }

  /** get the value of the field: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return Integer the value
   */
  public Integer getIndustryType () {
    return this.IndustryType;
  }
  /** Change the field to not being actively set: IndustryType (EMF_CONFIGURATION.industry_type)
   */
  public void unsetIndustryType () {
    this._IndustryTypeSet = false;
  }
  /** See if the field is actively set: IndustryType (EMF_CONFIGURATION.industry_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetIndustryType () {
    return this._IndustryTypeSet;
  }
  /** set the fields value: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseAddressServer") 
  public void setUseAddressServer (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseAddressServer", "setUseAddressServer");
    }
    this.UseAddressServer = value;
    this._UseAddressServerSet = true;
  }

  /** Retrieves the UseAddressServer field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseAddressServer field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseAddressServer field
   */
   public String getUseAddressServerAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseAddressServerAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseAddressServerAsFormattedString");
       return fmtMgr.formatBoolean(this.getUseAddressServer());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseAddressServer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseAddressServerAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseAddressServer field from a formatted string
   *
   * @param _value the UseAddressServer field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseAddressServer field
   */
   public void setUseAddressServerFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseAddressServerFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseAddressServer(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseAddressServer");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseAddressServerFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseAddressServerFromFormattedString");
   }

  /** get the value of the field: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return Boolean the value
   */
  public Boolean getUseAddressServer () {
    return this.UseAddressServer;
  }
  /** Change the field to not being actively set: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   */
  public void unsetUseAddressServer () {
    this._UseAddressServerSet = false;
  }
  /** See if the field is actively set: UseAddressServer (INDUSTRY_TYPE_REF.use_address_server)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseAddressServer () {
    return this._UseAddressServerSet;
  }
  /** set the fields value: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsE911Required") 
  public void setIsE911Required (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsE911Required", "setIsE911Required");
    }
    this.IsE911Required = value;
    this._IsE911RequiredSet = true;
  }

  /** Retrieves the IsE911Required field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsE911Required field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsE911Required field
   */
   public String getIsE911RequiredAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsE911RequiredAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsE911RequiredAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsE911Required());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsE911Required");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsE911RequiredAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsE911Required field from a formatted string
   *
   * @param _value the IsE911Required field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsE911Required field
   */
   public void setIsE911RequiredFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsE911RequiredFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsE911Required(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsE911Required");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsE911RequiredFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsE911RequiredFromFormattedString");
   }

  /** get the value of the field: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return Boolean the value
   */
  public Boolean getIsE911Required () {
    return this.IsE911Required;
  }
  /** Change the field to not being actively set: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   */
  public void unsetIsE911Required () {
    this._IsE911RequiredSet = false;
  }
  /** See if the field is actively set: IsE911Required (INDUSTRY_TYPE_REF.is_e911_required)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsE911Required () {
    return this._IsE911RequiredSet;
  }
  /** set the fields value: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsLidbRequired") 
  public void setIsLidbRequired (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsLidbRequired", "setIsLidbRequired");
    }
    this.IsLidbRequired = value;
    this._IsLidbRequiredSet = true;
  }

  /** Retrieves the IsLidbRequired field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsLidbRequired field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLidbRequired field
   */
   public String getIsLidbRequiredAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLidbRequiredAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLidbRequiredAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsLidbRequired());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLidbRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLidbRequiredAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsLidbRequired field from a formatted string
   *
   * @param _value the IsLidbRequired field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsLidbRequired field
   */
   public void setIsLidbRequiredFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLidbRequiredFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsLidbRequired(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLidbRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLidbRequiredFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLidbRequiredFromFormattedString");
   }

  /** get the value of the field: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return Boolean the value
   */
  public Boolean getIsLidbRequired () {
    return this.IsLidbRequired;
  }
  /** Change the field to not being actively set: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   */
  public void unsetIsLidbRequired () {
    this._IsLidbRequiredSet = false;
  }
  /** See if the field is actively set: IsLidbRequired (INDUSTRY_TYPE_REF.is_lidb_required)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsLidbRequired () {
    return this._IsLidbRequiredSet;
  }
  /** set the fields value: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPicRequired") 
  public void setIsPicRequired (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPicRequired", "setIsPicRequired");
    }
    this.IsPicRequired = value;
    this._IsPicRequiredSet = true;
  }

  /** Retrieves the IsPicRequired field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPicRequired field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPicRequired field
   */
   public String getIsPicRequiredAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPicRequiredAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPicRequiredAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPicRequired());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPicRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPicRequiredAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPicRequired field from a formatted string
   *
   * @param _value the IsPicRequired field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPicRequired field
   */
   public void setIsPicRequiredFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPicRequiredFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPicRequired(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPicRequired");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPicRequiredFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPicRequiredFromFormattedString");
   }

  /** get the value of the field: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return Boolean the value
   */
  public Boolean getIsPicRequired () {
    return this.IsPicRequired;
  }
  /** Change the field to not being actively set: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   */
  public void unsetIsPicRequired () {
    this._IsPicRequiredSet = false;
  }
  /** See if the field is actively set: IsPicRequired (INDUSTRY_TYPE_REF.is_pic_required)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPicRequired () {
    return this._IsPicRequiredSet;
  }
  /** set the fields value: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDadlUsed") 
  public void setIsDadlUsed (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDadlUsed", "setIsDadlUsed");
    }
    this.IsDadlUsed = value;
    this._IsDadlUsedSet = true;
  }

  /** Retrieves the IsDadlUsed field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDadlUsed field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDadlUsed field
   */
   public String getIsDadlUsedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDadlUsedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDadlUsedAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDadlUsed());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDadlUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDadlUsedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDadlUsed field from a formatted string
   *
   * @param _value the IsDadlUsed field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDadlUsed field
   */
   public void setIsDadlUsedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDadlUsedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDadlUsed(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDadlUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDadlUsedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDadlUsedFromFormattedString");
   }

  /** get the value of the field: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return Boolean the value
   */
  public Boolean getIsDadlUsed () {
    return this.IsDadlUsed;
  }
  /** Change the field to not being actively set: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   */
  public void unsetIsDadlUsed () {
    this._IsDadlUsedSet = false;
  }
  /** See if the field is actively set: IsDadlUsed (INDUSTRY_TYPE_REF.is_dadl_used)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDadlUsed () {
    return this._IsDadlUsedSet;
  }
  /** set the fields value: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsCallingCardUsed") 
  public void setIsCallingCardUsed (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsCallingCardUsed", "setIsCallingCardUsed");
    }
    this.IsCallingCardUsed = value;
    this._IsCallingCardUsedSet = true;
  }

  /** Retrieves the IsCallingCardUsed field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsCallingCardUsed field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCallingCardUsed field
   */
   public String getIsCallingCardUsedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCallingCardUsedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCallingCardUsedAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsCallingCardUsed());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCallingCardUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCallingCardUsedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsCallingCardUsed field from a formatted string
   *
   * @param _value the IsCallingCardUsed field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsCallingCardUsed field
   */
   public void setIsCallingCardUsedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCallingCardUsedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsCallingCardUsed(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCallingCardUsed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCallingCardUsedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCallingCardUsedFromFormattedString");
   }

  /** get the value of the field: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return Boolean the value
   */
  public Boolean getIsCallingCardUsed () {
    return this.IsCallingCardUsed;
  }
  /** Change the field to not being actively set: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   */
  public void unsetIsCallingCardUsed () {
    this._IsCallingCardUsedSet = false;
  }
  /** See if the field is actively set: IsCallingCardUsed (INDUSTRY_TYPE_REF.is_calling_card_used)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsCallingCardUsed () {
    return this._IsCallingCardUsedSet;
  }
  public String toString() {
    return ServicePricingPlanObjectHelper.toMap(this, null).toString();
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
  /** EMF_CONFIG_ID_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** EMF_CONFIG_ID_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  /** EMF_CONFIG_ID_VALUES.format_display field */
    if(!nonNullOnly || (FormatDisplay != null))  _FormatDisplaySet = flag;
  /** EMF_CONFIG_ID_REF.default_external_id_type field */
    if(!nonNullOnly || (DefaultExternalIdType != null))  _DefaultExternalIdTypeSet = flag;
  /** EMF_CONFIG_ID_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** EMF_CONFIG_ID_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** EMF_CONFIG_ID_REF.is_serviceability_applicable field */
    if(!nonNullOnly || (IsServiceabilityApplicable != null))  _IsServiceabilityApplicableSet = flag;
  /** EMF_CONFIG_ID_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** EMF_CONFIGURATION.emf_type field */
    if(!nonNullOnly || (EmfType != null))  _EmfTypeSet = flag;
  /** EMF_CONFIGURATION.equip_type_code field */
    if(!nonNullOnly || (EquipTypeCode != null))  _EquipTypeCodeSet = flag;
  /** EMF_CONFIGURATION.equip_class_code field */
    if(!nonNullOnly || (EquipClassCode != null))  _EquipClassCodeSet = flag;
  /** EMF_CONFIGURATION.class_of_service_code field */
    if(!nonNullOnly || (ClassOfServiceCode != null))  _ClassOfServiceCodeSet = flag;
  /** EMF_CONFIGURATION.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** EMF_CONFIGURATION.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** EMF_CONFIGURATION.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** EMF_CONFIGURATION.emf_book_id field */
    if(!nonNullOnly || (EmfBookId != null))  _EmfBookIdSet = flag;
  /** EMF_CONFIGURATION.industry_type field */
    if(!nonNullOnly || (IndustryType != null))  _IndustryTypeSet = flag;
  /** INDUSTRY_TYPE_REF.use_address_server field */
    if(!nonNullOnly || (UseAddressServer != null))  _UseAddressServerSet = flag;
  /** INDUSTRY_TYPE_REF.is_e911_required field */
    if(!nonNullOnly || (IsE911Required != null))  _IsE911RequiredSet = flag;
  /** INDUSTRY_TYPE_REF.is_lidb_required field */
    if(!nonNullOnly || (IsLidbRequired != null))  _IsLidbRequiredSet = flag;
  /** INDUSTRY_TYPE_REF.is_pic_required field */
    if(!nonNullOnly || (IsPicRequired != null))  _IsPicRequiredSet = flag;
  /** INDUSTRY_TYPE_REF.is_dadl_used field */
    if(!nonNullOnly || (IsDadlUsed != null))  _IsDadlUsedSet = flag;
  /** INDUSTRY_TYPE_REF.is_calling_card_used field */
    if(!nonNullOnly || (IsCallingCardUsed != null))  _IsCallingCardUsedSet = flag;
  }
}
