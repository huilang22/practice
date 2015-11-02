/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TPIObjectData.java
 * Definition File: Admin/TaxPackageInst.xml
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
  
/** TPIObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TPIObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TPIObjectKeyData Key = null;
  /** TAX_PKG_INST_ID_REF.tax_pkg_type field */
  public    Integer TaxPkgType  = null;
  protected boolean _TaxPkgTypeSet = false;
  /** TAX_PKG_INST_ID_REF.pkg_order field */
  public    Integer PkgOrder  = null;
  protected boolean _PkgOrderSet = false;
  /** TAX_PKG_INST_ID_REF.basic_days field */
  public    Integer BasicDays  = null;
  protected boolean _BasicDaysSet = false;
  /** TAX_PKG_INST_ID_REF.is_binned field */
  public    Integer IsBinned  = null;
  protected boolean _IsBinnedSet = false;
  /** TAX_PKG_INST_ID_REF.is_distributed field */
  public    Boolean IsDistributed  = null;
  protected boolean _IsDistributedSet = false;
  /** TAX_PKG_INST_ID_REF.is_franchise field */
  public    Boolean IsFranchise  = null;
  protected boolean _IsFranchiseSet = false;
  /** TAX_PKG_INST_ID_REF.is_gui_pretax field */
  public    Boolean IsGuiPretax  = null;
  protected boolean _IsGuiPretaxSet = false;
  /** TAX_PKG_INST_ID_REF.exclude_charge field */
  public    Boolean ExcludeCharge  = null;
  protected boolean _ExcludeChargeSet = false;
  /** TAX_PKG_INST_ID_REF.rounding_method field */
  public    Integer RoundingMethod  = null;
  protected boolean _RoundingMethodSet = false;
  /** TAX_PKG_INST_ID_REF.tax_type field */
  public    Integer TaxType  = null;
  protected boolean _TaxTypeSet = false;
  /** TAX_PKG_INST_ID_REF.is_default field */
  public    Boolean IsDefault  = null;
  protected boolean _IsDefaultSet = false;
  /** TAX_PKG_INST_ID_REF.is_internal field */
  public    Boolean IsInternal  = null;
  protected boolean _IsInternalSet = false;
  /** TAX_PKG_INST_ID_REF.is_graduated field */
  public    Integer IsGraduated  = null;
  protected boolean _IsGraduatedSet = false;
  /** TAX_PKG_INST_ID_REF.tax_zero_charge field */
  public    Integer TaxZeroCharge  = null;
  protected boolean _TaxZeroChargeSet = false;
  /** TAX_PKG_INST_ID_REF.rounding_factor field */
  public    Integer RoundingFactor  = null;
  protected boolean _RoundingFactorSet = false;
  /** TAX_PKG_INST_ID_REF.bin_rounding field */
  public    Boolean BinRounding  = null;
  protected boolean _BinRoundingSet = false;
  /** TAX_PKG_INST_ID_REF.is_late_fee_exempt field */
  public    Boolean IsLateFeeExempt  = null;
  protected boolean _IsLateFeeExemptSet = false;
  /** TAX_PKG_INST_ID_REF.is_inclusive field */
  public    Integer IsInclusive  = null;
  protected boolean _IsInclusiveSet = false;
  /** TAX_PKG_INST_ID_REF.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  /** TAX_PKG_INST_ID_VALUES.short_display field */
  public    String ShortDisplay  = null;
  protected boolean _ShortDisplaySet = false;
  /** TAX_PKG_INST_ID_VALUES.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  private String _objName = "TPIObjectData";
  /** Default constructor */
  public TPIObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TPIObjectData (TPIObjectData other)
  {

    if (other == null) return;
    this.Key = new TPIObjectKeyData (other.Key);
    this.TaxPkgType = other.TaxPkgType;
    this._TaxPkgTypeSet = other._TaxPkgTypeSet;
    this.PkgOrder = other.PkgOrder;
    this._PkgOrderSet = other._PkgOrderSet;
    this.BasicDays = other.BasicDays;
    this._BasicDaysSet = other._BasicDaysSet;
    this.IsBinned = other.IsBinned;
    this._IsBinnedSet = other._IsBinnedSet;
    this.IsDistributed = other.IsDistributed;
    this._IsDistributedSet = other._IsDistributedSet;
    this.IsFranchise = other.IsFranchise;
    this._IsFranchiseSet = other._IsFranchiseSet;
    this.IsGuiPretax = other.IsGuiPretax;
    this._IsGuiPretaxSet = other._IsGuiPretaxSet;
    this.ExcludeCharge = other.ExcludeCharge;
    this._ExcludeChargeSet = other._ExcludeChargeSet;
    this.RoundingMethod = other.RoundingMethod;
    this._RoundingMethodSet = other._RoundingMethodSet;
    this.TaxType = other.TaxType;
    this._TaxTypeSet = other._TaxTypeSet;
    this.IsDefault = other.IsDefault;
    this._IsDefaultSet = other._IsDefaultSet;
    this.IsInternal = other.IsInternal;
    this._IsInternalSet = other._IsInternalSet;
    this.IsGraduated = other.IsGraduated;
    this._IsGraduatedSet = other._IsGraduatedSet;
    this.TaxZeroCharge = other.TaxZeroCharge;
    this._TaxZeroChargeSet = other._TaxZeroChargeSet;
    this.RoundingFactor = other.RoundingFactor;
    this._RoundingFactorSet = other._RoundingFactorSet;
    this.BinRounding = other.BinRounding;
    this._BinRoundingSet = other._BinRoundingSet;
    this.IsLateFeeExempt = other.IsLateFeeExempt;
    this._IsLateFeeExemptSet = other._IsLateFeeExemptSet;
    this.IsInclusive = other.IsInclusive;
    this._IsInclusiveSet = other._IsInclusiveSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
    this.ShortDisplay = other.ShortDisplay;
    this._ShortDisplaySet = other._ShortDisplaySet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
  }

  /** get the Key for this object
   * @return TPIObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TPIObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TPIObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new TPIObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (TAX_PKG_INST_ID_VALUES.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    if (this.Key == null) return false;
    return this.Key._TaxPkgInstIdSet;
  }

  /** Retrieves the TaxPkgInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstId field
   */
   public String getTaxPkgInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgInstId field from a formatted string
   *
   * @param _value the TaxPkgInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgInstId field
   */
   public void setTaxPkgInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFromFormattedString");
   }

  /** set the fields value: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new TPIObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (TAX_PKG_INST_ID_VALUES.language_code)
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

  /** set the fields value: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPkgType") 
  public void setTaxPkgType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgType", "setTaxPkgType");
    }
    this.TaxPkgType = value;
    this._TaxPkgTypeSet = true;
  }

  /** Retrieves the TaxPkgType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgType field
   */
   public String getTaxPkgTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgType field from a formatted string
   *
   * @param _value the TaxPkgType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgType field
   */
   public void setTaxPkgTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgTypeFromFormattedString");
   }

  /** get the value of the field: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return Integer the value
   */
  public Integer getTaxPkgType () {
    return this.TaxPkgType;
  }
  /** Change the field to not being actively set: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   */
  public void unsetTaxPkgType () {
    this._TaxPkgTypeSet = false;
  }
  /** See if the field is actively set: TaxPkgType (TAX_PKG_INST_ID_REF.tax_pkg_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgType () {
    return this._TaxPkgTypeSet;
  }
  /** set the fields value: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PkgOrder") 
  public void setPkgOrder (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PkgOrder", "setPkgOrder");
    }
    this.PkgOrder = value;
    this._PkgOrderSet = true;
  }

  /** Retrieves the PkgOrder field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PkgOrder field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PkgOrder field
   */
   public String getPkgOrderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkgOrderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPkgOrderAsFormattedString");
       return fmtMgr.formatNumber(this.getPkgOrder(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkgOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPkgOrderAsFormattedString");
       throw x;
     }
   }
  /** Sets the PkgOrder field from a formatted string
   *
   * @param _value the PkgOrder field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PkgOrder field
   */
   public void setPkgOrderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPkgOrderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPkgOrder(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PkgOrder");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPkgOrderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPkgOrderFromFormattedString");
   }

  /** get the value of the field: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return Integer the value
   */
  public Integer getPkgOrder () {
    return this.PkgOrder;
  }
  /** Change the field to not being actively set: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   */
  public void unsetPkgOrder () {
    this._PkgOrderSet = false;
  }
  /** See if the field is actively set: PkgOrder (TAX_PKG_INST_ID_REF.pkg_order)
   * @return boolean whether the field is actively set
   */
  public boolean issetPkgOrder () {
    return this._PkgOrderSet;
  }
  /** set the fields value: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BasicDays") 
  public void setBasicDays (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BasicDays", "setBasicDays");
    }
    this.BasicDays = value;
    this._BasicDaysSet = true;
  }

  /** Retrieves the BasicDays field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BasicDays field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BasicDays field
   */
   public String getBasicDaysAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBasicDaysAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBasicDaysAsFormattedString");
       return fmtMgr.formatNumber(this.getBasicDays(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BasicDays");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBasicDaysAsFormattedString");
       throw x;
     }
   }
  /** Sets the BasicDays field from a formatted string
   *
   * @param _value the BasicDays field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BasicDays field
   */
   public void setBasicDaysFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBasicDaysFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBasicDays(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BasicDays");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBasicDaysFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBasicDaysFromFormattedString");
   }

  /** get the value of the field: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return Integer the value
   */
  public Integer getBasicDays () {
    return this.BasicDays;
  }
  /** Change the field to not being actively set: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   */
  public void unsetBasicDays () {
    this._BasicDaysSet = false;
  }
  /** See if the field is actively set: BasicDays (TAX_PKG_INST_ID_REF.basic_days)
   * @return boolean whether the field is actively set
   */
  public boolean issetBasicDays () {
    return this._BasicDaysSet;
  }
  /** set the fields value: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsBinned") 
  public void setIsBinned (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsBinned", "setIsBinned");
    }
    this.IsBinned = value;
    this._IsBinnedSet = true;
  }

  /** Retrieves the IsBinned field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsBinned field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsBinned field
   */
   public String getIsBinnedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBinnedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsBinnedAsFormattedString");
       return fmtMgr.formatNumber(this.getIsBinned(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsBinned");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsBinnedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsBinned field from a formatted string
   *
   * @param _value the IsBinned field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsBinned field
   */
   public void setIsBinnedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsBinnedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsBinned(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsBinned");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsBinnedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsBinnedFromFormattedString");
   }

  /** get the value of the field: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return Integer the value
   */
  public Integer getIsBinned () {
    return this.IsBinned;
  }
  /** Change the field to not being actively set: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   */
  public void unsetIsBinned () {
    this._IsBinnedSet = false;
  }
  /** See if the field is actively set: IsBinned (TAX_PKG_INST_ID_REF.is_binned)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsBinned () {
    return this._IsBinnedSet;
  }
  /** set the fields value: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsDistributed") 
  public void setIsDistributed (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsDistributed", "setIsDistributed");
    }
    this.IsDistributed = value;
    this._IsDistributedSet = true;
  }

  /** Retrieves the IsDistributed field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsDistributed field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDistributed field
   */
   public String getIsDistributedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDistributedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDistributedAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsDistributed());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDistributed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDistributedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsDistributed field from a formatted string
   *
   * @param _value the IsDistributed field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsDistributed field
   */
   public void setIsDistributedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDistributedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsDistributed(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsDistributed");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDistributedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDistributedFromFormattedString");
   }

  /** get the value of the field: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return Boolean the value
   */
  public Boolean getIsDistributed () {
    return this.IsDistributed;
  }
  /** Change the field to not being actively set: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   */
  public void unsetIsDistributed () {
    this._IsDistributedSet = false;
  }
  /** See if the field is actively set: IsDistributed (TAX_PKG_INST_ID_REF.is_distributed)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDistributed () {
    return this._IsDistributedSet;
  }
  /** set the fields value: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsFranchise") 
  public void setIsFranchise (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsFranchise", "setIsFranchise");
    }
    this.IsFranchise = value;
    this._IsFranchiseSet = true;
  }

  /** Retrieves the IsFranchise field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsFranchise field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsFranchise field
   */
   public String getIsFranchiseAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsFranchiseAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsFranchiseAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsFranchise());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsFranchise");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsFranchiseAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsFranchise field from a formatted string
   *
   * @param _value the IsFranchise field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsFranchise field
   */
   public void setIsFranchiseFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsFranchiseFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsFranchise(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsFranchise");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsFranchiseFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsFranchiseFromFormattedString");
   }

  /** get the value of the field: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return Boolean the value
   */
  public Boolean getIsFranchise () {
    return this.IsFranchise;
  }
  /** Change the field to not being actively set: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   */
  public void unsetIsFranchise () {
    this._IsFranchiseSet = false;
  }
  /** See if the field is actively set: IsFranchise (TAX_PKG_INST_ID_REF.is_franchise)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsFranchise () {
    return this._IsFranchiseSet;
  }
  /** set the fields value: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsGuiPretax") 
  public void setIsGuiPretax (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsGuiPretax", "setIsGuiPretax");
    }
    this.IsGuiPretax = value;
    this._IsGuiPretaxSet = true;
  }

  /** Retrieves the IsGuiPretax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsGuiPretax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsGuiPretax field
   */
   public String getIsGuiPretaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGuiPretaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsGuiPretaxAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsGuiPretax());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsGuiPretax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsGuiPretaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsGuiPretax field from a formatted string
   *
   * @param _value the IsGuiPretax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsGuiPretax field
   */
   public void setIsGuiPretaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGuiPretaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsGuiPretax(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsGuiPretax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsGuiPretaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsGuiPretaxFromFormattedString");
   }

  /** get the value of the field: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return Boolean the value
   */
  public Boolean getIsGuiPretax () {
    return this.IsGuiPretax;
  }
  /** Change the field to not being actively set: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   */
  public void unsetIsGuiPretax () {
    this._IsGuiPretaxSet = false;
  }
  /** See if the field is actively set: IsGuiPretax (TAX_PKG_INST_ID_REF.is_gui_pretax)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsGuiPretax () {
    return this._IsGuiPretaxSet;
  }
  /** set the fields value: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExcludeCharge") 
  public void setExcludeCharge (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExcludeCharge", "setExcludeCharge");
    }
    this.ExcludeCharge = value;
    this._ExcludeChargeSet = true;
  }

  /** Retrieves the ExcludeCharge field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExcludeCharge field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExcludeCharge field
   */
   public String getExcludeChargeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExcludeChargeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExcludeChargeAsFormattedString");
       return fmtMgr.formatBoolean(this.getExcludeCharge());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExcludeCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExcludeChargeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExcludeCharge field from a formatted string
   *
   * @param _value the ExcludeCharge field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExcludeCharge field
   */
   public void setExcludeChargeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExcludeChargeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExcludeCharge(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExcludeCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExcludeChargeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExcludeChargeFromFormattedString");
   }

  /** get the value of the field: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return Boolean the value
   */
  public Boolean getExcludeCharge () {
    return this.ExcludeCharge;
  }
  /** Change the field to not being actively set: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   */
  public void unsetExcludeCharge () {
    this._ExcludeChargeSet = false;
  }
  /** See if the field is actively set: ExcludeCharge (TAX_PKG_INST_ID_REF.exclude_charge)
   * @return boolean whether the field is actively set
   */
  public boolean issetExcludeCharge () {
    return this._ExcludeChargeSet;
  }
  /** set the fields value: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RoundingMethod") 
  public void setRoundingMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RoundingMethod", "setRoundingMethod");
    }
    this.RoundingMethod = value;
    this._RoundingMethodSet = true;
  }

  /** Retrieves the RoundingMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RoundingMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingMethod field
   */
   public String getRoundingMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getRoundingMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RoundingMethod field from a formatted string
   *
   * @param _value the RoundingMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RoundingMethod field
   */
   public void setRoundingMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRoundingMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingMethodFromFormattedString");
   }

  /** get the value of the field: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return Integer the value
   */
  public Integer getRoundingMethod () {
    return this.RoundingMethod;
  }
  /** Change the field to not being actively set: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   */
  public void unsetRoundingMethod () {
    this._RoundingMethodSet = false;
  }
  /** See if the field is actively set: RoundingMethod (TAX_PKG_INST_ID_REF.rounding_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetRoundingMethod () {
    return this._RoundingMethodSet;
  }
  /** set the fields value: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxType") 
  public void setTaxType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxType", "setTaxType");
    }
    this.TaxType = value;
    this._TaxTypeSet = true;
  }

  /** Retrieves the TaxType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxType field
   */
   public String getTaxTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxType field from a formatted string
   *
   * @param _value the TaxType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxType field
   */
   public void setTaxTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeFromFormattedString");
   }

  /** get the value of the field: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return Integer the value
   */
  public Integer getTaxType () {
    return this.TaxType;
  }
  /** Change the field to not being actively set: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   */
  public void unsetTaxType () {
    this._TaxTypeSet = false;
  }
  /** See if the field is actively set: TaxType (TAX_PKG_INST_ID_REF.tax_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxType () {
    return this._TaxTypeSet;
  }
  /** set the fields value: IsDefault (TAX_PKG_INST_ID_REF.is_default)
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

  /** get the value of the field: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @return Boolean the value
   */
  public Boolean getIsDefault () {
    return this.IsDefault;
  }
  /** Change the field to not being actively set: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   */
  public void unsetIsDefault () {
    this._IsDefaultSet = false;
  }
  /** See if the field is actively set: IsDefault (TAX_PKG_INST_ID_REF.is_default)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsDefault () {
    return this._IsDefaultSet;
  }
  /** set the fields value: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
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

  /** get the value of the field: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @return Boolean the value
   */
  public Boolean getIsInternal () {
    return this.IsInternal;
  }
  /** Change the field to not being actively set: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   */
  public void unsetIsInternal () {
    this._IsInternalSet = false;
  }
  /** See if the field is actively set: IsInternal (TAX_PKG_INST_ID_REF.is_internal)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInternal () {
    return this._IsInternalSet;
  }
  /** set the fields value: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsGraduated") 
  public void setIsGraduated (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsGraduated", "setIsGraduated");
    }
    this.IsGraduated = value;
    this._IsGraduatedSet = true;
  }

  /** Retrieves the IsGraduated field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsGraduated field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsGraduated field
   */
   public String getIsGraduatedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGraduatedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsGraduatedAsFormattedString");
       return fmtMgr.formatNumber(this.getIsGraduated(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsGraduated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsGraduatedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsGraduated field from a formatted string
   *
   * @param _value the IsGraduated field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsGraduated field
   */
   public void setIsGraduatedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsGraduatedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsGraduated(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsGraduated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsGraduatedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsGraduatedFromFormattedString");
   }

  /** get the value of the field: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return Integer the value
   */
  public Integer getIsGraduated () {
    return this.IsGraduated;
  }
  /** Change the field to not being actively set: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   */
  public void unsetIsGraduated () {
    this._IsGraduatedSet = false;
  }
  /** See if the field is actively set: IsGraduated (TAX_PKG_INST_ID_REF.is_graduated)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsGraduated () {
    return this._IsGraduatedSet;
  }
  /** set the fields value: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxZeroCharge") 
  public void setTaxZeroCharge (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxZeroCharge", "setTaxZeroCharge");
    }
    this.TaxZeroCharge = value;
    this._TaxZeroChargeSet = true;
  }

  /** Retrieves the TaxZeroCharge field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxZeroCharge field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxZeroCharge field
   */
   public String getTaxZeroChargeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxZeroChargeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxZeroChargeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxZeroCharge(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxZeroCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxZeroChargeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxZeroCharge field from a formatted string
   *
   * @param _value the TaxZeroCharge field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxZeroCharge field
   */
   public void setTaxZeroChargeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxZeroChargeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxZeroCharge(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxZeroCharge");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxZeroChargeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxZeroChargeFromFormattedString");
   }

  /** get the value of the field: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return Integer the value
   */
  public Integer getTaxZeroCharge () {
    return this.TaxZeroCharge;
  }
  /** Change the field to not being actively set: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   */
  public void unsetTaxZeroCharge () {
    this._TaxZeroChargeSet = false;
  }
  /** See if the field is actively set: TaxZeroCharge (TAX_PKG_INST_ID_REF.tax_zero_charge)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxZeroCharge () {
    return this._TaxZeroChargeSet;
  }
  /** set the fields value: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RoundingFactor") 
  public void setRoundingFactor (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RoundingFactor", "setRoundingFactor");
    }
    this.RoundingFactor = value;
    this._RoundingFactorSet = true;
  }

  /** Retrieves the RoundingFactor field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RoundingFactor field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingFactor field
   */
   public String getRoundingFactorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingFactorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingFactorAsFormattedString");
       return fmtMgr.formatNumber(this.getRoundingFactor(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingFactorAsFormattedString");
       throw x;
     }
   }
  /** Sets the RoundingFactor field from a formatted string
   *
   * @param _value the RoundingFactor field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RoundingFactor field
   */
   public void setRoundingFactorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingFactorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRoundingFactor(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingFactorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingFactorFromFormattedString");
   }

  /** get the value of the field: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return Integer the value
   */
  public Integer getRoundingFactor () {
    return this.RoundingFactor;
  }
  /** Change the field to not being actively set: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   */
  public void unsetRoundingFactor () {
    this._RoundingFactorSet = false;
  }
  /** See if the field is actively set: RoundingFactor (TAX_PKG_INST_ID_REF.rounding_factor)
   * @return boolean whether the field is actively set
   */
  public boolean issetRoundingFactor () {
    return this._RoundingFactorSet;
  }
  /** set the fields value: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BinRounding") 
  public void setBinRounding (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BinRounding", "setBinRounding");
    }
    this.BinRounding = value;
    this._BinRoundingSet = true;
  }

  /** Retrieves the BinRounding field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BinRounding field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BinRounding field
   */
   public String getBinRoundingAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBinRoundingAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBinRoundingAsFormattedString");
       return fmtMgr.formatBoolean(this.getBinRounding());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BinRounding");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBinRoundingAsFormattedString");
       throw x;
     }
   }
  /** Sets the BinRounding field from a formatted string
   *
   * @param _value the BinRounding field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BinRounding field
   */
   public void setBinRoundingFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBinRoundingFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBinRounding(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BinRounding");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBinRoundingFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBinRoundingFromFormattedString");
   }

  /** get the value of the field: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return Boolean the value
   */
  public Boolean getBinRounding () {
    return this.BinRounding;
  }
  /** Change the field to not being actively set: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   */
  public void unsetBinRounding () {
    this._BinRoundingSet = false;
  }
  /** See if the field is actively set: BinRounding (TAX_PKG_INST_ID_REF.bin_rounding)
   * @return boolean whether the field is actively set
   */
  public boolean issetBinRounding () {
    return this._BinRoundingSet;
  }
  /** set the fields value: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsLateFeeExempt") 
  public void setIsLateFeeExempt (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsLateFeeExempt", "setIsLateFeeExempt");
    }
    this.IsLateFeeExempt = value;
    this._IsLateFeeExemptSet = true;
  }

  /** Retrieves the IsLateFeeExempt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsLateFeeExempt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLateFeeExempt field
   */
   public String getIsLateFeeExemptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsLateFeeExempt());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsLateFeeExempt field from a formatted string
   *
   * @param _value the IsLateFeeExempt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsLateFeeExempt field
   */
   public void setIsLateFeeExemptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsLateFeeExempt(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLateFeeExemptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLateFeeExemptFromFormattedString");
   }

  /** get the value of the field: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return Boolean the value
   */
  public Boolean getIsLateFeeExempt () {
    return this.IsLateFeeExempt;
  }
  /** Change the field to not being actively set: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   */
  public void unsetIsLateFeeExempt () {
    this._IsLateFeeExemptSet = false;
  }
  /** See if the field is actively set: IsLateFeeExempt (TAX_PKG_INST_ID_REF.is_late_fee_exempt)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsLateFeeExempt () {
    return this._IsLateFeeExemptSet;
  }
  /** set the fields value: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsInclusive") 
  public void setIsInclusive (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsInclusive", "setIsInclusive");
    }
    this.IsInclusive = value;
    this._IsInclusiveSet = true;
  }

  /** Retrieves the IsInclusive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsInclusive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInclusive field
   */
   public String getIsInclusiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInclusiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInclusiveAsFormattedString");
       return fmtMgr.formatNumber(this.getIsInclusive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInclusive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInclusiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsInclusive field from a formatted string
   *
   * @param _value the IsInclusive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsInclusive field
   */
   public void setIsInclusiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInclusiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsInclusive(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsInclusive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInclusiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInclusiveFromFormattedString");
   }

  /** get the value of the field: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return Integer the value
   */
  public Integer getIsInclusive () {
    return this.IsInclusive;
  }
  /** Change the field to not being actively set: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   */
  public void unsetIsInclusive () {
    this._IsInclusiveSet = false;
  }
  /** See if the field is actively set: IsInclusive (TAX_PKG_INST_ID_REF.is_inclusive)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsInclusive () {
    return this._IsInclusiveSet;
  }
  /** set the fields value: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
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

  /** get the value of the field: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (TAX_PKG_INST_ID_REF.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  /** set the fields value: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
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

  /** get the value of the field: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return String the value
   */
  public String getShortDisplay () {
    return this.ShortDisplay;
  }
  /** Change the field to not being actively set: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   */
  public void unsetShortDisplay () {
    this._ShortDisplaySet = false;
  }
  /** See if the field is actively set: ShortDisplay (TAX_PKG_INST_ID_VALUES.short_display)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDisplay () {
    return this._ShortDisplaySet;
  }
  /** set the fields value: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
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

  /** get the value of the field: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (TAX_PKG_INST_ID_VALUES.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  public String toString() {
    return TPIObjectHelper.toMap(this, null).toString();
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
  /** TAX_PKG_INST_ID_REF.tax_pkg_type field */
    if(!nonNullOnly || (TaxPkgType != null))  _TaxPkgTypeSet = flag;
  /** TAX_PKG_INST_ID_REF.pkg_order field */
    if(!nonNullOnly || (PkgOrder != null))  _PkgOrderSet = flag;
  /** TAX_PKG_INST_ID_REF.basic_days field */
    if(!nonNullOnly || (BasicDays != null))  _BasicDaysSet = flag;
  /** TAX_PKG_INST_ID_REF.is_binned field */
    if(!nonNullOnly || (IsBinned != null))  _IsBinnedSet = flag;
  /** TAX_PKG_INST_ID_REF.is_distributed field */
    if(!nonNullOnly || (IsDistributed != null))  _IsDistributedSet = flag;
  /** TAX_PKG_INST_ID_REF.is_franchise field */
    if(!nonNullOnly || (IsFranchise != null))  _IsFranchiseSet = flag;
  /** TAX_PKG_INST_ID_REF.is_gui_pretax field */
    if(!nonNullOnly || (IsGuiPretax != null))  _IsGuiPretaxSet = flag;
  /** TAX_PKG_INST_ID_REF.exclude_charge field */
    if(!nonNullOnly || (ExcludeCharge != null))  _ExcludeChargeSet = flag;
  /** TAX_PKG_INST_ID_REF.rounding_method field */
    if(!nonNullOnly || (RoundingMethod != null))  _RoundingMethodSet = flag;
  /** TAX_PKG_INST_ID_REF.tax_type field */
    if(!nonNullOnly || (TaxType != null))  _TaxTypeSet = flag;
  /** TAX_PKG_INST_ID_REF.is_default field */
    if(!nonNullOnly || (IsDefault != null))  _IsDefaultSet = flag;
  /** TAX_PKG_INST_ID_REF.is_internal field */
    if(!nonNullOnly || (IsInternal != null))  _IsInternalSet = flag;
  /** TAX_PKG_INST_ID_REF.is_graduated field */
    if(!nonNullOnly || (IsGraduated != null))  _IsGraduatedSet = flag;
  /** TAX_PKG_INST_ID_REF.tax_zero_charge field */
    if(!nonNullOnly || (TaxZeroCharge != null))  _TaxZeroChargeSet = flag;
  /** TAX_PKG_INST_ID_REF.rounding_factor field */
    if(!nonNullOnly || (RoundingFactor != null))  _RoundingFactorSet = flag;
  /** TAX_PKG_INST_ID_REF.bin_rounding field */
    if(!nonNullOnly || (BinRounding != null))  _BinRoundingSet = flag;
  /** TAX_PKG_INST_ID_REF.is_late_fee_exempt field */
    if(!nonNullOnly || (IsLateFeeExempt != null))  _IsLateFeeExemptSet = flag;
  /** TAX_PKG_INST_ID_REF.is_inclusive field */
    if(!nonNullOnly || (IsInclusive != null))  _IsInclusiveSet = flag;
  /** TAX_PKG_INST_ID_REF.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  /** TAX_PKG_INST_ID_VALUES.short_display field */
    if(!nonNullOnly || (ShortDisplay != null))  _ShortDisplaySet = flag;
  /** TAX_PKG_INST_ID_VALUES.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  }
}
