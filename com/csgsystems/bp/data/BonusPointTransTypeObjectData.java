/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointTransTypeObjectData.java
 * Definition File: Admin/BonusPointTransType.xml
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
  
/** BonusPointTransTypeObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BonusPointTransTypeObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BonusPointTransTypeObjectKeyData Key = null;
  /** BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category field */
  public    Integer BonusPointTransCategory  = null;
  protected boolean _BonusPointTransCategorySet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.trans_sign field */
  public    Integer TransSign  = null;
  protected boolean _TransSignSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill field */
  public    Boolean IsDisplayedOnbill  = null;
  protected boolean _IsDisplayedOnbillSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui field */
  public    Boolean IsViewableOnGui  = null;
  protected boolean _IsViewableOnGuiSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_external field */
  public    Boolean IsExternal  = null;
  protected boolean _IsExternalSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_system_generated field */
  public    Boolean IsSystemGenerated  = null;
  protected boolean _IsSystemGeneratedSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** BONUS_POINT_TRANS_TYPE_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** BONUS_POINT_TRANS_TYPE_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** BONUS_POINT_TRANS_TYPE_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "BonusPointTransTypeObjectData";
  /** Default constructor */
  public BonusPointTransTypeObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BonusPointTransTypeObjectData (BonusPointTransTypeObjectData other)
  {

    if (other == null) return;
    this.Key = new BonusPointTransTypeObjectKeyData (other.Key);
    this.BonusPointTransCategory = other.BonusPointTransCategory;
    this._BonusPointTransCategorySet = other._BonusPointTransCategorySet;
    this.TransSign = other.TransSign;
    this._TransSignSet = other._TransSignSet;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this._IsDisplayedOnbillSet = other._IsDisplayedOnbillSet;
    this.IsViewableOnGui = other.IsViewableOnGui;
    this._IsViewableOnGuiSet = other._IsViewableOnGuiSet;
    this.IsExternal = other.IsExternal;
    this._IsExternalSet = other._IsExternalSet;
    this.IsSystemGenerated = other.IsSystemGenerated;
    this._IsSystemGeneratedSet = other._IsSystemGeneratedSet;
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
   * @return BonusPointTransTypeObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BonusPointTransTypeObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BonusPointTransTypeObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBonusPointTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BonusPointTransType", "setBonusPointTransType");
    }
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyData ();
    this.Key.BonusPointTransType = value;
    this.Key._BonusPointTransTypeSet = true;
  }
  /** get the value of the field: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return Integer the value
   */
  public Integer getBonusPointTransType () {
    if (this.Key == null) return null;
    return this.Key.BonusPointTransType;
  }
  /** Change the field to not being actively set: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   */
  public void unsetBonusPointTransType () {
    if (this.Key == null) return;
    this.Key._BonusPointTransTypeSet = false;
  }
  /** See if the field is actively set: BonusPointTransType (BONUS_POINT_TRANS_TYPE_VALUES.bonus_point_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointTransType () {
    if (this.Key == null) return false;
    return this.Key._BonusPointTransTypeSet;
  }

  /** Retrieves the BonusPointTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointTransType field
   */
   public String getBonusPointTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointTransType field from a formatted string
   *
   * @param _value the BonusPointTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointTransType field
   */
   public void setBonusPointTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransTypeFromFormattedString");
   }

  /** set the fields value: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new BonusPointTransTypeObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (BONUS_POINT_TRANS_TYPE_VALUES.language_code)
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

  /** set the fields value: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BonusPointTransCategory") 
  public void setBonusPointTransCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BonusPointTransCategory", "setBonusPointTransCategory");
    }
    this.BonusPointTransCategory = value;
    this._BonusPointTransCategorySet = true;
  }

  /** Retrieves the BonusPointTransCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BonusPointTransCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointTransCategory field
   */
   public String getBonusPointTransCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointTransCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getBonusPointTransCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointTransCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the BonusPointTransCategory field from a formatted string
   *
   * @param _value the BonusPointTransCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BonusPointTransCategory field
   */
   public void setBonusPointTransCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointTransCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBonusPointTransCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BonusPointTransCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointTransCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointTransCategoryFromFormattedString");
   }

  /** get the value of the field: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return Integer the value
   */
  public Integer getBonusPointTransCategory () {
    return this.BonusPointTransCategory;
  }
  /** Change the field to not being actively set: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   */
  public void unsetBonusPointTransCategory () {
    this._BonusPointTransCategorySet = false;
  }
  /** See if the field is actively set: BonusPointTransCategory (BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetBonusPointTransCategory () {
    return this._BonusPointTransCategorySet;
  }
  /** set the fields value: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransSign") 
  public void setTransSign (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransSign", "setTransSign");
    }
    this.TransSign = value;
    this._TransSignSet = true;
  }

  /** Retrieves the TransSign field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransSign field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSign field
   */
   public String getTransSignAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSignAsFormattedString");
       return fmtMgr.formatNumber(this.getTransSign(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSign");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSignAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransSign field from a formatted string
   *
   * @param _value the TransSign field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransSign field
   */
   public void setTransSignFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransSign(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSign");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSignFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSignFromFormattedString");
   }

  /** get the value of the field: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return Integer the value
   */
  public Integer getTransSign () {
    return this.TransSign;
  }
  /** Change the field to not being actively set: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   */
  public void unsetTransSign () {
    this._TransSignSet = false;
  }
  /** See if the field is actively set: TransSign (BONUS_POINT_TRANS_TYPE_REF.trans_sign)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSign () {
    return this._TransSignSet;
  }
  /** set the fields value: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDisplayedOnbill") 
  public void setIsDisplayedOnbill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDisplayedOnbill", "setIsDisplayedOnbill");
    }
    this.IsDisplayedOnbill = value;
    this._IsDisplayedOnbillSet = true;
  }

  /** Retrieves the IsDisplayedOnbill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDisplayedOnbill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisplayedOnbill field
   */
   public String getIsDisplayedOnbillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDisplayedOnbill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisplayedOnbill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisplayedOnbillAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDisplayedOnbill field from a formatted string
   *
   * @param _value the IsDisplayedOnbill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDisplayedOnbill field
   */
   public void setIsDisplayedOnbillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDisplayedOnbill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDisplayedOnbill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisplayedOnbillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisplayedOnbillFromFormattedString");
   }

  /** get the value of the field: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return Boolean the value
   */
  public Boolean getIsDisplayedOnbill () {
    return this.IsDisplayedOnbill;
  }
  /** Change the field to not being actively set: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   */
  public void unsetIsDisplayedOnbill () {
    this._IsDisplayedOnbillSet = false;
  }
  /** See if the field is actively set: IsDisplayedOnbill (BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDisplayedOnbill () {
    return this._IsDisplayedOnbillSet;
  }
  /** set the fields value: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsViewableOnGui") 
  public void setIsViewableOnGui (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsViewableOnGui", "setIsViewableOnGui");
    }
    this.IsViewableOnGui = value;
    this._IsViewableOnGuiSet = true;
  }

  /** Retrieves the IsViewableOnGui field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsViewableOnGui field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsViewableOnGui field
   */
   public String getIsViewableOnGuiAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableOnGuiAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsViewableOnGuiAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsViewableOnGui());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsViewableOnGui");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsViewableOnGuiAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsViewableOnGui field from a formatted string
   *
   * @param _value the IsViewableOnGui field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsViewableOnGui field
   */
   public void setIsViewableOnGuiFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableOnGuiFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsViewableOnGui(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsViewableOnGui");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsViewableOnGuiFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsViewableOnGuiFromFormattedString");
   }

  /** get the value of the field: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return Boolean the value
   */
  public Boolean getIsViewableOnGui () {
    return this.IsViewableOnGui;
  }
  /** Change the field to not being actively set: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   */
  public void unsetIsViewableOnGui () {
    this._IsViewableOnGuiSet = false;
  }
  /** See if the field is actively set: IsViewableOnGui (BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsViewableOnGui () {
    return this._IsViewableOnGuiSet;
  }
  /** set the fields value: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsExternal") 
  public void setIsExternal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsExternal", "setIsExternal");
    }
    this.IsExternal = value;
    this._IsExternalSet = true;
  }

  /** Retrieves the IsExternal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsExternal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsExternal field
   */
   public String getIsExternalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsExternalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsExternalAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsExternal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsExternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsExternalAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsExternal field from a formatted string
   *
   * @param _value the IsExternal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsExternal field
   */
   public void setIsExternalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsExternalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsExternal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsExternal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsExternalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsExternalFromFormattedString");
   }

  /** get the value of the field: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return Boolean the value
   */
  public Boolean getIsExternal () {
    return this.IsExternal;
  }
  /** Change the field to not being actively set: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   */
  public void unsetIsExternal () {
    this._IsExternalSet = false;
  }
  /** See if the field is actively set: IsExternal (BONUS_POINT_TRANS_TYPE_REF.is_external)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsExternal () {
    return this._IsExternalSet;
  }
  /** set the fields value: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsSystemGenerated") 
  public void setIsSystemGenerated (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsSystemGenerated", "setIsSystemGenerated");
    }
    this.IsSystemGenerated = value;
    this._IsSystemGeneratedSet = true;
  }

  /** Retrieves the IsSystemGenerated field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsSystemGenerated field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsSystemGenerated field
   */
   public String getIsSystemGeneratedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSystemGeneratedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsSystemGeneratedAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsSystemGenerated());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSystemGenerated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsSystemGeneratedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsSystemGenerated field from a formatted string
   *
   * @param _value the IsSystemGenerated field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsSystemGenerated field
   */
   public void setIsSystemGeneratedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsSystemGeneratedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsSystemGenerated(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsSystemGenerated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsSystemGeneratedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsSystemGeneratedFromFormattedString");
   }

  /** get the value of the field: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return Boolean the value
   */
  public Boolean getIsSystemGenerated () {
    return this.IsSystemGenerated;
  }
  /** Change the field to not being actively set: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   */
  public void unsetIsSystemGenerated () {
    this._IsSystemGeneratedSet = false;
  }
  /** See if the field is actively set: IsSystemGenerated (BONUS_POINT_TRANS_TYPE_REF.is_system_generated)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsSystemGenerated () {
    return this._IsSystemGeneratedSet;
  }
  /** set the fields value: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
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

  /** get the value of the field: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (BONUS_POINT_TRANS_TYPE_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
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

  /** get the value of the field: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (BONUS_POINT_TRANS_TYPE_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (BONUS_POINT_TRANS_TYPE_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (BONUS_POINT_TRANS_TYPE_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (BONUS_POINT_TRANS_TYPE_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return BonusPointTransTypeObjectHelper.toMap(this, null).toString();
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
  /** BONUS_POINT_TRANS_TYPE_REF.bonus_point_trans_category field */
    if(!nonNullOnly || (BonusPointTransCategory != null))  _BonusPointTransCategorySet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.trans_sign field */
    if(!nonNullOnly || (TransSign != null))  _TransSignSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_displayed_onbill field */
    if(!nonNullOnly || (IsDisplayedOnbill != null))  _IsDisplayedOnbillSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_viewable_on_gui field */
    if(!nonNullOnly || (IsViewableOnGui != null))  _IsViewableOnGuiSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_external field */
    if(!nonNullOnly || (IsExternal != null))  _IsExternalSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_system_generated field */
    if(!nonNullOnly || (IsSystemGenerated != null))  _IsSystemGeneratedSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** BONUS_POINT_TRANS_TYPE_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** BONUS_POINT_TRANS_TYPE_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** BONUS_POINT_TRANS_TYPE_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
