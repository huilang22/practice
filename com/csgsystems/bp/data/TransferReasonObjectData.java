/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TransferReasonObjectData.java
 * Definition File: Admin/TransferReason.xml
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
  
/** TransferReasonObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TransferReasonObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TransferReasonObjectKeyData Key = null;
  /** XFER_REASON_CODES_REF.xfer_category field */
  public    Integer XferCategory  = null;
  protected boolean _XferCategorySet = false;
  /** XFER_REASON_CODES_REF.suspend_dates field */
  public    Integer SuspendDates  = null;
  protected boolean _SuspendDatesSet = false;
  /** XFER_REASON_CODES_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** XFER_REASON_CODES_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** XFER_REASON_CODES_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** XFER_REASON_CODES_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** XFER_REASON_CODES_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "TransferReasonObjectData";
  /** Default constructor */
  public TransferReasonObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TransferReasonObjectData (TransferReasonObjectData other)
  {

    if (other == null) return;
    this.Key = new TransferReasonObjectKeyData (other.Key);
    this.XferCategory = other.XferCategory;
    this._XferCategorySet = other._XferCategorySet;
    this.SuspendDates = other.SuspendDates;
    this._SuspendDatesSet = other._SuspendDatesSet;
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
   * @return TransferReasonObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TransferReasonObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TransferReasonObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: XferReason (XFER_REASON_CODES_VALUES.xfer_reason)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setXferReason (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "XferReason", "setXferReason");
    }
    if (this.Key == null) this.Key = new TransferReasonObjectKeyData ();
    this.Key.XferReason = value;
    this.Key._XferReasonSet = true;
  }
  /** get the value of the field: XferReason (XFER_REASON_CODES_VALUES.xfer_reason)
   * @return Integer the value
   */
  public Integer getXferReason () {
    if (this.Key == null) return null;
    return this.Key.XferReason;
  }
  /** Change the field to not being actively set: XferReason (XFER_REASON_CODES_VALUES.xfer_reason)
   */
  public void unsetXferReason () {
    if (this.Key == null) return;
    this.Key._XferReasonSet = false;
  }
  /** See if the field is actively set: XferReason (XFER_REASON_CODES_VALUES.xfer_reason)
   * @return boolean whether the field is actively set
   */
  public boolean issetXferReason () {
    if (this.Key == null) return false;
    return this.Key._XferReasonSet;
  }

  /** Retrieves the XferReason field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The XferReason field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the XferReason field
   */
   public String getXferReasonAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXferReasonAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getXferReasonAsFormattedString");
       return fmtMgr.formatNumber(this.getXferReason(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XferReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getXferReasonAsFormattedString");
       throw x;
     }
   }
  /** Sets the XferReason field from a formatted string
   *
   * @param _value the XferReason field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the XferReason field
   */
   public void setXferReasonFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXferReasonFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setXferReason(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XferReason");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setXferReasonFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setXferReasonFromFormattedString");
   }

  /** set the fields value: LanguageCode (XFER_REASON_CODES_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new TransferReasonObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (XFER_REASON_CODES_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (XFER_REASON_CODES_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (XFER_REASON_CODES_VALUES.language_code)
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

  /** set the fields value: XferCategory (XFER_REASON_CODES_REF.xfer_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("XferCategory") 
  public void setXferCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "XferCategory", "setXferCategory");
    }
    this.XferCategory = value;
    this._XferCategorySet = true;
  }

  /** Retrieves the XferCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The XferCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the XferCategory field
   */
   public String getXferCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXferCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getXferCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getXferCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XferCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getXferCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the XferCategory field from a formatted string
   *
   * @param _value the XferCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the XferCategory field
   */
   public void setXferCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getXferCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setXferCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("XferCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setXferCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setXferCategoryFromFormattedString");
   }

  /** get the value of the field: XferCategory (XFER_REASON_CODES_REF.xfer_category)
   * @return Integer the value
   */
  public Integer getXferCategory () {
    return this.XferCategory;
  }
  /** Change the field to not being actively set: XferCategory (XFER_REASON_CODES_REF.xfer_category)
   */
  public void unsetXferCategory () {
    this._XferCategorySet = false;
  }
  /** See if the field is actively set: XferCategory (XFER_REASON_CODES_REF.xfer_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetXferCategory () {
    return this._XferCategorySet;
  }
  /** set the fields value: SuspendDates (XFER_REASON_CODES_REF.suspend_dates)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SuspendDates") 
  public void setSuspendDates (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SuspendDates", "setSuspendDates");
    }
    this.SuspendDates = value;
    this._SuspendDatesSet = true;
  }

  /** Retrieves the SuspendDates field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SuspendDates field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SuspendDates field
   */
   public String getSuspendDatesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSuspendDatesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSuspendDatesAsFormattedString");
       return fmtMgr.formatNumber(this.getSuspendDates(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SuspendDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSuspendDatesAsFormattedString");
       throw x;
     }
   }
  /** Sets the SuspendDates field from a formatted string
   *
   * @param _value the SuspendDates field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SuspendDates field
   */
   public void setSuspendDatesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSuspendDatesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSuspendDates(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SuspendDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSuspendDatesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSuspendDatesFromFormattedString");
   }

  /** get the value of the field: SuspendDates (XFER_REASON_CODES_REF.suspend_dates)
   * @return Integer the value
   */
  public Integer getSuspendDates () {
    return this.SuspendDates;
  }
  /** Change the field to not being actively set: SuspendDates (XFER_REASON_CODES_REF.suspend_dates)
   */
  public void unsetSuspendDates () {
    this._SuspendDatesSet = false;
  }
  /** See if the field is actively set: SuspendDates (XFER_REASON_CODES_REF.suspend_dates)
   * @return boolean whether the field is actively set
   */
  public boolean issetSuspendDates () {
    return this._SuspendDatesSet;
  }
  /** set the fields value: IsDefault (XFER_REASON_CODES_REF.is_default)
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

  /** get the value of the field: IsDefault (XFER_REASON_CODES_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (XFER_REASON_CODES_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (XFER_REASON_CODES_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (XFER_REASON_CODES_REF.is_internal)
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

  /** get the value of the field: IsInternal (XFER_REASON_CODES_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (XFER_REASON_CODES_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (XFER_REASON_CODES_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (XFER_REASON_CODES_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (XFER_REASON_CODES_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (XFER_REASON_CODES_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (XFER_REASON_CODES_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (XFER_REASON_CODES_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (XFER_REASON_CODES_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (XFER_REASON_CODES_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (XFER_REASON_CODES_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (XFER_REASON_CODES_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (XFER_REASON_CODES_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (XFER_REASON_CODES_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (XFER_REASON_CODES_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return TransferReasonObjectHelper.toMap(this, null).toString();
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
  /** XFER_REASON_CODES_REF.xfer_category field */
    if(!nonNullOnly || (XferCategory != null))  _XferCategorySet = flag;
  /** XFER_REASON_CODES_REF.suspend_dates field */
    if(!nonNullOnly || (SuspendDates != null))  _SuspendDatesSet = flag;
  /** XFER_REASON_CODES_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** XFER_REASON_CODES_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** XFER_REASON_CODES_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** XFER_REASON_CODES_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** XFER_REASON_CODES_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
