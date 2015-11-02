/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectData.java
 * Definition File: Admin/LbxPaymentType.xml
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
  
/** LbxPaymentTypeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class LbxPaymentTypeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public LbxPaymentTypeObjectKeyData Key = null;
  /** LBX_PAYMENT_TYPES.bmf_trans_type field */
  public    Integer BmfTransType  = null;
  protected boolean _BmfTransTypeSet = false;
  /** LBX_SOURCE_ID_REF.lbx_source_type field */
  public    Integer LbxSourceType  = null;
  protected boolean _LbxSourceTypeSet = false;
  /** LBX_SOURCE_ID_REF.lbx_cycle_type field */
  public    Integer LbxCycleType  = null;
  protected boolean _LbxCycleTypeSet = false;
  /** LBX_SOURCE_ID_REF.cycle_expected field */
  public    String CycleExpected  = null;
  protected boolean _CycleExpectedSet = false;
  /** LBX_SOURCE_ID_REF.path_name field */
  public    String PathName  = null;
  protected boolean _PathNameSet = false;
  /** LBX_SOURCE_ID_REF.naming_pattern field */
  public    String NamingPattern  = null;
  protected boolean _NamingPatternSet = false;
  /** LBX_SOURCE_ID_REF.naming_extension field */
  public    String NamingExtension  = null;
  protected boolean _NamingExtensionSet = false;
  /** LBX_SOURCE_ID_REF.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** LBX_SOURCE_ID_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** LBX_SOURCE_ID_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** LBX_SOURCE_ID_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** LBX_SOURCE_ID_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** LBX_SOURCE_ID_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "LbxPaymentTypeObjectData";
  /** Default constructor */
  public LbxPaymentTypeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public LbxPaymentTypeObjectData (LbxPaymentTypeObjectData other)
  {

    if (other == null) return;
    this.Key = new LbxPaymentTypeObjectKeyData (other.Key);
    this.BmfTransType = other.BmfTransType;
    this._BmfTransTypeSet = other._BmfTransTypeSet;
    this.LbxSourceType = other.LbxSourceType;
    this._LbxSourceTypeSet = other._LbxSourceTypeSet;
    this.LbxCycleType = other.LbxCycleType;
    this._LbxCycleTypeSet = other._LbxCycleTypeSet;
    this.CycleExpected = other.CycleExpected;
    this._CycleExpectedSet = other._CycleExpectedSet;
    this.PathName = other.PathName;
    this._PathNameSet = other._PathNameSet;
    this.NamingPattern = other.NamingPattern;
    this._NamingPatternSet = other._NamingPatternSet;
    this.NamingExtension = other.NamingExtension;
    this._NamingExtensionSet = other._NamingExtensionSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
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
   * @return LbxPaymentTypeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public LbxPaymentTypeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (LbxPaymentTypeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setExtCategory (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExtCategory", "setExtCategory");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExtCategory", "setExtCategory");
    }
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyData ();
    this.Key.ExtCategory = value;
    this.Key._ExtCategorySet = true;
  }
  /** get the value of the field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return String the value
   */
  public String getExtCategory () {
    if (this.Key == null) return null;
    return this.Key.ExtCategory;
  }
  /** Change the field to not being actively set: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   */
  public void unsetExtCategory () {
    if (this.Key == null) return;
    this.Key._ExtCategorySet = false;
  }
  /** See if the field is actively set: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetExtCategory () {
    if (this.Key == null) return false;
    return this.Key._ExtCategorySet;
  }

  /** Retrieves the ExtCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExtCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtCategory field
   */
   public String getExtCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtCategoryAsFormattedString");
       return fmtMgr.formatString(this.getExtCategory());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExtCategory field from a formatted string
   *
   * @param _value the ExtCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExtCategory field
   */
   public void setExtCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExtCategory(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtCategoryFromFormattedString");
   }

  /** set the fields value: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSourceId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SourceId", "setSourceId");
    }
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyData ();
    this.Key.SourceId = value;
    this.Key._SourceIdSet = true;
  }
  /** get the value of the field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return String the value
   */
  public String getSourceId () {
    if (this.Key == null) return null;
    return this.Key.SourceId;
  }
  /** Change the field to not being actively set: SourceId (LBX_PAYMENT_TYPES.source_id)
   */
  public void unsetSourceId () {
    if (this.Key == null) return;
    this.Key._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId () {
    if (this.Key == null) return false;
    return this.Key._SourceIdSet;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatString(this.getSourceId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new LbxPaymentTypeObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
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

  /** set the fields value: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTransType") 
  public void setBmfTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTransType", "setBmfTransType");
    }
    this.BmfTransType = value;
    this._BmfTransTypeSet = true;
  }

  /** Retrieves the BmfTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransType field
   */
   public String getBmfTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTransType field from a formatted string
   *
   * @param _value the BmfTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTransType field
   */
   public void setBmfTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFromFormattedString");
   }

  /** get the value of the field: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return Integer the value
   */
  public Integer getBmfTransType () {
    return this.BmfTransType;
  }
  /** Change the field to not being actively set: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   */
  public void unsetBmfTransType () {
    this._BmfTransTypeSet = false;
  }
  /** See if the field is actively set: BmfTransType (LBX_PAYMENT_TYPES.bmf_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransType () {
    return this._BmfTransTypeSet;
  }
  /** set the fields value: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LbxSourceType") 
  public void setLbxSourceType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LbxSourceType", "setLbxSourceType");
    }
    this.LbxSourceType = value;
    this._LbxSourceTypeSet = true;
  }

  /** Retrieves the LbxSourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LbxSourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LbxSourceType field
   */
   public String getLbxSourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxSourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxSourceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getLbxSourceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LbxSourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLbxSourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LbxSourceType field from a formatted string
   *
   * @param _value the LbxSourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LbxSourceType field
   */
   public void setLbxSourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxSourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLbxSourceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LbxSourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLbxSourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLbxSourceTypeFromFormattedString");
   }

  /** get the value of the field: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return Integer the value
   */
  public Integer getLbxSourceType () {
    return this.LbxSourceType;
  }
  /** Change the field to not being actively set: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   */
  public void unsetLbxSourceType () {
    this._LbxSourceTypeSet = false;
  }
  /** See if the field is actively set: LbxSourceType (LBX_SOURCE_ID_REF.lbx_source_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetLbxSourceType () {
    return this._LbxSourceTypeSet;
  }
  /** set the fields value: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LbxCycleType") 
  public void setLbxCycleType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LbxCycleType", "setLbxCycleType");
    }
    this.LbxCycleType = value;
    this._LbxCycleTypeSet = true;
  }

  /** Retrieves the LbxCycleType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LbxCycleType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LbxCycleType field
   */
   public String getLbxCycleTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxCycleTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLbxCycleTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getLbxCycleType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LbxCycleType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLbxCycleTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LbxCycleType field from a formatted string
   *
   * @param _value the LbxCycleType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LbxCycleType field
   */
   public void setLbxCycleTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLbxCycleTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLbxCycleType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LbxCycleType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLbxCycleTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLbxCycleTypeFromFormattedString");
   }

  /** get the value of the field: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return Integer the value
   */
  public Integer getLbxCycleType () {
    return this.LbxCycleType;
  }
  /** Change the field to not being actively set: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   */
  public void unsetLbxCycleType () {
    this._LbxCycleTypeSet = false;
  }
  /** See if the field is actively set: LbxCycleType (LBX_SOURCE_ID_REF.lbx_cycle_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetLbxCycleType () {
    return this._LbxCycleTypeSet;
  }
  /** set the fields value: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CycleExpected") 
  public void setCycleExpected (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CycleExpected", "setCycleExpected");
    }
    if (value != null && !DataHelper.validLength (value, 2))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CycleExpected", "setCycleExpected");
    }
    this.CycleExpected = value;
    this._CycleExpectedSet = true;
  }

  /** Retrieves the CycleExpected field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CycleExpected field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CycleExpected field
   */
   public String getCycleExpectedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCycleExpectedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCycleExpectedAsFormattedString");
       return fmtMgr.formatString(this.getCycleExpected());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CycleExpected");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCycleExpectedAsFormattedString");
       throw x;
     }
   }
  /** Sets the CycleExpected field from a formatted string
   *
   * @param _value the CycleExpected field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CycleExpected field
   */
   public void setCycleExpectedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCycleExpectedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCycleExpected(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CycleExpected");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCycleExpectedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCycleExpectedFromFormattedString");
   }

  /** get the value of the field: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return String the value
   */
  public String getCycleExpected () {
    return this.CycleExpected;
  }
  /** Change the field to not being actively set: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   */
  public void unsetCycleExpected () {
    this._CycleExpectedSet = false;
  }
  /** See if the field is actively set: CycleExpected (LBX_SOURCE_ID_REF.cycle_expected)
   * @return boolean whether the field is actively set
   */
  public boolean issetCycleExpected () {
    return this._CycleExpectedSet;
  }
  /** set the fields value: PathName (LBX_SOURCE_ID_REF.path_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PathName") 
  public void setPathName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PathName", "setPathName");
    }
    this.PathName = value;
    this._PathNameSet = true;
  }

  /** Retrieves the PathName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PathName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PathName field
   */
   public String getPathNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPathNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPathNameAsFormattedString");
       return fmtMgr.formatString(this.getPathName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PathName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPathNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the PathName field from a formatted string
   *
   * @param _value the PathName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PathName field
   */
   public void setPathNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPathNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPathName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PathName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPathNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPathNameFromFormattedString");
   }

  /** get the value of the field: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return String the value
   */
  public String getPathName () {
    return this.PathName;
  }
  /** Change the field to not being actively set: PathName (LBX_SOURCE_ID_REF.path_name)
   */
  public void unsetPathName () {
    this._PathNameSet = false;
  }
  /** See if the field is actively set: PathName (LBX_SOURCE_ID_REF.path_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetPathName () {
    return this._PathNameSet;
  }
  /** set the fields value: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NamingPattern") 
  public void setNamingPattern (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NamingPattern", "setNamingPattern");
    }
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NamingPattern", "setNamingPattern");
    }
    this.NamingPattern = value;
    this._NamingPatternSet = true;
  }

  /** Retrieves the NamingPattern field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NamingPattern field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamingPattern field
   */
   public String getNamingPatternAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingPatternAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamingPatternAsFormattedString");
       return fmtMgr.formatString(this.getNamingPattern());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamingPattern");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamingPatternAsFormattedString");
       throw x;
     }
   }
  /** Sets the NamingPattern field from a formatted string
   *
   * @param _value the NamingPattern field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NamingPattern field
   */
   public void setNamingPatternFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingPatternFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNamingPattern(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamingPattern");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamingPatternFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamingPatternFromFormattedString");
   }

  /** get the value of the field: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return String the value
   */
  public String getNamingPattern () {
    return this.NamingPattern;
  }
  /** Change the field to not being actively set: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   */
  public void unsetNamingPattern () {
    this._NamingPatternSet = false;
  }
  /** See if the field is actively set: NamingPattern (LBX_SOURCE_ID_REF.naming_pattern)
   * @return boolean whether the field is actively set
   */
  public boolean issetNamingPattern () {
    return this._NamingPatternSet;
  }
  /** set the fields value: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NamingExtension") 
  public void setNamingExtension (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 7))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NamingExtension", "setNamingExtension");
    }
    this.NamingExtension = value;
    this._NamingExtensionSet = true;
  }

  /** Retrieves the NamingExtension field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NamingExtension field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamingExtension field
   */
   public String getNamingExtensionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingExtensionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamingExtensionAsFormattedString");
       return fmtMgr.formatString(this.getNamingExtension());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamingExtension");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamingExtensionAsFormattedString");
       throw x;
     }
   }
  /** Sets the NamingExtension field from a formatted string
   *
   * @param _value the NamingExtension field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NamingExtension field
   */
   public void setNamingExtensionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamingExtensionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNamingExtension(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamingExtension");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamingExtensionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamingExtensionFromFormattedString");
   }

  /** get the value of the field: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return String the value
   */
  public String getNamingExtension () {
    return this.NamingExtension;
  }
  /** Change the field to not being actively set: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   */
  public void unsetNamingExtension () {
    this._NamingExtensionSet = false;
  }
  /** See if the field is actively set: NamingExtension (LBX_SOURCE_ID_REF.naming_extension)
   * @return boolean whether the field is actively set
   */
  public boolean issetNamingExtension () {
    return this._NamingExtensionSet;
  }
  /** set the fields value: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (LBX_SOURCE_ID_REF.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: IsDefault (LBX_SOURCE_ID_REF.is_default)
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

  /** get the value of the field: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (LBX_SOURCE_ID_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (LBX_SOURCE_ID_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (LBX_SOURCE_ID_REF.is_internal)
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

  /** get the value of the field: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (LBX_SOURCE_ID_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (LBX_SOURCE_ID_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (LBX_SOURCE_ID_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (LBX_SOURCE_ID_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return LbxPaymentTypeObjectHelper.toMap(this, null).toString();
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
  /** LBX_PAYMENT_TYPES.bmf_trans_type field */
    if(!nonNullOnly || (BmfTransType != null))  _BmfTransTypeSet = flag;
  /** LBX_SOURCE_ID_REF.lbx_source_type field */
    if(!nonNullOnly || (LbxSourceType != null))  _LbxSourceTypeSet = flag;
  /** LBX_SOURCE_ID_REF.lbx_cycle_type field */
    if(!nonNullOnly || (LbxCycleType != null))  _LbxCycleTypeSet = flag;
  /** LBX_SOURCE_ID_REF.cycle_expected field */
    if(!nonNullOnly || (CycleExpected != null))  _CycleExpectedSet = flag;
  /** LBX_SOURCE_ID_REF.path_name field */
    if(!nonNullOnly || (PathName != null))  _PathNameSet = flag;
  /** LBX_SOURCE_ID_REF.naming_pattern field */
    if(!nonNullOnly || (NamingPattern != null))  _NamingPatternSet = flag;
  /** LBX_SOURCE_ID_REF.naming_extension field */
    if(!nonNullOnly || (NamingExtension != null))  _NamingExtensionSet = flag;
  /** LBX_SOURCE_ID_REF.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** LBX_SOURCE_ID_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** LBX_SOURCE_ID_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** LBX_SOURCE_ID_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** LBX_SOURCE_ID_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** LBX_SOURCE_ID_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
