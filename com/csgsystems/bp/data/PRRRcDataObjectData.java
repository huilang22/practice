/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRRcDataObjectData.java
 * Definition File: Customer/ProductRcRate.xml
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
  
/** PRRRcDataObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PRRRcDataObjectData extends BaseObjectData implements Serializable
{

  /** PRODUCT_ELEMENTS.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** PRODUCT_ELEMENTS.rate_rate_class field */
  public    Boolean RateRateClass  = null;
  protected boolean _RateRateClassSet = false;
  /** PRODUCT_ELEMENTS.rate_equip_type field */
  public    Boolean RateEquipType  = null;
  protected boolean _RateEquipTypeSet = false;
  /** PRODUCT_ELEMENTS.rate_equip_class field */
  public    Boolean RateEquipClass  = null;
  protected boolean _RateEquipClassSet = false;
  /** PRODUCT_ELEMENTS.rate_class_of_service field */
  public    Boolean RateClassOfService  = null;
  protected boolean _RateClassOfServiceSet = false;
  /** PRODUCT_ELEMENTS.rate_component_id field */
  public    Boolean RateComponentId  = null;
  protected boolean _RateComponentIdSet = false;
  /** PRODUCT_ELEMENTS.rate_jurisdiction field */
  public    Boolean RateJurisdiction  = null;
  protected boolean _RateJurisdictionSet = false;
  /** PRODUCT_ELEMENTS.rate_units field */
  public    Boolean RateUnits  = null;
  protected boolean _RateUnitsSet = false;
  /** PRODUCT_ELEMENTS.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** PRODUCT_ELEMENTS.rate_currency_location field */
  public    Integer RateCurrencyLocation  = null;
  protected boolean _RateCurrencyLocationSet = false;
  /** PRODUCT_ELEMENTS.bill_in_arrears field */
  public    Boolean BillInArrears  = null;
  protected boolean _BillInArrearsSet = false;
  /** PRODUCT_RATE_KEY.units_type field */
  public    Integer UnitsType  = null;
  protected boolean _UnitsTypeSet = false;
  /** PRODUCT_RATE_KEY.units field */
  public    Integer Units  = null;
  protected boolean _UnitsSet = false;
  /** PRODUCT.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** PRODUCT_CHARGE_MAP.bill_period field */
  public    String BillPeriod  = null;
  protected boolean _BillPeriodSet = false;
  /** PRODUCT_CHARGE_MAP.billed_thru_dt field */
  public    Date BilledThruDt  = null;
  protected boolean _BilledThruDtSet = false;
  /** PRODUCT_CHARGE_MAP.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** PRODUCT_CHARGE_MAP.termination_code field */
  public    Integer TerminationCode  = null;
  protected boolean _TerminationCodeSet = false;
  /** PRODUCT_CHARGE_MAP.in_arrears_override field */
  public    Integer InArrearsOverride  = null;
  protected boolean _InArrearsOverrideSet = false;
  private String _objName = "PRRRcDataObjectData";
  /** Default constructor */
  public PRRRcDataObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PRRRcDataObjectData (PRRRcDataObjectData other)
  {

    if (other == null) return;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.RateRateClass = other.RateRateClass;
    this._RateRateClassSet = other._RateRateClassSet;
    this.RateEquipType = other.RateEquipType;
    this._RateEquipTypeSet = other._RateEquipTypeSet;
    this.RateEquipClass = other.RateEquipClass;
    this._RateEquipClassSet = other._RateEquipClassSet;
    this.RateClassOfService = other.RateClassOfService;
    this._RateClassOfServiceSet = other._RateClassOfServiceSet;
    this.RateComponentId = other.RateComponentId;
    this._RateComponentIdSet = other._RateComponentIdSet;
    this.RateJurisdiction = other.RateJurisdiction;
    this._RateJurisdictionSet = other._RateJurisdictionSet;
    this.RateUnits = other.RateUnits;
    this._RateUnitsSet = other._RateUnitsSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.RateCurrencyLocation = other.RateCurrencyLocation;
    this._RateCurrencyLocationSet = other._RateCurrencyLocationSet;
    this.BillInArrears = other.BillInArrears;
    this._BillInArrearsSet = other._BillInArrearsSet;
    this.UnitsType = other.UnitsType;
    this._UnitsTypeSet = other._UnitsTypeSet;
    this.Units = other.Units;
    this._UnitsSet = other._UnitsSet;
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.BillPeriod = other.BillPeriod;
    this._BillPeriodSet = other._BillPeriodSet;
    this.BilledThruDt = other.BilledThruDt;
    this._BilledThruDtSet = other._BilledThruDtSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.TerminationCode = other.TerminationCode;
    this._TerminationCodeSet = other._TerminationCodeSet;
    this.InArrearsOverride = other.InArrearsOverride;
    this._InArrearsOverrideSet = other._InArrearsOverrideSet;
  }

  /** set the fields value: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionCode") 
  public void setDescriptionCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionCode", "setDescriptionCode");
    }
    this.DescriptionCode = value;
    this._DescriptionCodeSet = true;
  }

  /** Retrieves the DescriptionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCode field
   */
   public String getDescriptionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionCode field from a formatted string
   *
   * @param _value the DescriptionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionCode field
   */
   public void setDescriptionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFromFormattedString");
   }

  /** get the value of the field: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (PRODUCT_ELEMENTS.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
  }
  /** set the fields value: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateRateClass") 
  public void setRateRateClass (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateRateClass", "setRateRateClass");
    }
    this.RateRateClass = value;
    this._RateRateClassSet = true;
  }

  /** Retrieves the RateRateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateRateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateRateClass field
   */
   public String getRateRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateRateClassAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateRateClass());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateRateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateRateClass field from a formatted string
   *
   * @param _value the RateRateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateRateClass field
   */
   public void setRateRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateRateClass(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateRateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateRateClassFromFormattedString");
   }

  /** get the value of the field: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return Boolean the value
   */
  public Boolean getRateRateClass () {
    return this.RateRateClass;
  }
  /** Change the field to not being actively set: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   */
  public void unsetRateRateClass () {
    this._RateRateClassSet = false;
  }
  /** See if the field is actively set: RateRateClass (PRODUCT_ELEMENTS.rate_rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateRateClass () {
    return this._RateRateClassSet;
  }
  /** set the fields value: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateEquipType") 
  public void setRateEquipType (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateEquipType", "setRateEquipType");
    }
    this.RateEquipType = value;
    this._RateEquipTypeSet = true;
  }

  /** Retrieves the RateEquipType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateEquipType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateEquipType field
   */
   public String getRateEquipTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateEquipTypeAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateEquipType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateEquipType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateEquipTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateEquipType field from a formatted string
   *
   * @param _value the RateEquipType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateEquipType field
   */
   public void setRateEquipTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateEquipType(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateEquipType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateEquipTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateEquipTypeFromFormattedString");
   }

  /** get the value of the field: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return Boolean the value
   */
  public Boolean getRateEquipType () {
    return this.RateEquipType;
  }
  /** Change the field to not being actively set: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   */
  public void unsetRateEquipType () {
    this._RateEquipTypeSet = false;
  }
  /** See if the field is actively set: RateEquipType (PRODUCT_ELEMENTS.rate_equip_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateEquipType () {
    return this._RateEquipTypeSet;
  }
  /** set the fields value: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateEquipClass") 
  public void setRateEquipClass (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateEquipClass", "setRateEquipClass");
    }
    this.RateEquipClass = value;
    this._RateEquipClassSet = true;
  }

  /** Retrieves the RateEquipClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateEquipClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateEquipClass field
   */
   public String getRateEquipClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateEquipClassAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateEquipClass());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateEquipClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateEquipClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateEquipClass field from a formatted string
   *
   * @param _value the RateEquipClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateEquipClass field
   */
   public void setRateEquipClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateEquipClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateEquipClass(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateEquipClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateEquipClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateEquipClassFromFormattedString");
   }

  /** get the value of the field: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return Boolean the value
   */
  public Boolean getRateEquipClass () {
    return this.RateEquipClass;
  }
  /** Change the field to not being actively set: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   */
  public void unsetRateEquipClass () {
    this._RateEquipClassSet = false;
  }
  /** See if the field is actively set: RateEquipClass (PRODUCT_ELEMENTS.rate_equip_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateEquipClass () {
    return this._RateEquipClassSet;
  }
  /** set the fields value: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClassOfService") 
  public void setRateClassOfService (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClassOfService", "setRateClassOfService");
    }
    this.RateClassOfService = value;
    this._RateClassOfServiceSet = true;
  }

  /** Retrieves the RateClassOfService field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClassOfService field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassOfService field
   */
   public String getRateClassOfServiceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassOfServiceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassOfServiceAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateClassOfService());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassOfService");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassOfServiceAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClassOfService field from a formatted string
   *
   * @param _value the RateClassOfService field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClassOfService field
   */
   public void setRateClassOfServiceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassOfServiceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClassOfService(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClassOfService");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassOfServiceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassOfServiceFromFormattedString");
   }

  /** get the value of the field: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return Boolean the value
   */
  public Boolean getRateClassOfService () {
    return this.RateClassOfService;
  }
  /** Change the field to not being actively set: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   */
  public void unsetRateClassOfService () {
    this._RateClassOfServiceSet = false;
  }
  /** See if the field is actively set: RateClassOfService (PRODUCT_ELEMENTS.rate_class_of_service)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClassOfService () {
    return this._RateClassOfServiceSet;
  }
  /** set the fields value: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateComponentId") 
  public void setRateComponentId (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateComponentId", "setRateComponentId");
    }
    this.RateComponentId = value;
    this._RateComponentIdSet = true;
  }

  /** Retrieves the RateComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateComponentId field
   */
   public String getRateComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateComponentIdAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateComponentId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateComponentId field from a formatted string
   *
   * @param _value the RateComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateComponentId field
   */
   public void setRateComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateComponentId(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateComponentIdFromFormattedString");
   }

  /** get the value of the field: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return Boolean the value
   */
  public Boolean getRateComponentId () {
    return this.RateComponentId;
  }
  /** Change the field to not being actively set: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   */
  public void unsetRateComponentId () {
    this._RateComponentIdSet = false;
  }
  /** See if the field is actively set: RateComponentId (PRODUCT_ELEMENTS.rate_component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateComponentId () {
    return this._RateComponentIdSet;
  }
  /** set the fields value: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateJurisdiction") 
  public void setRateJurisdiction (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateJurisdiction", "setRateJurisdiction");
    }
    this.RateJurisdiction = value;
    this._RateJurisdictionSet = true;
  }

  /** Retrieves the RateJurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateJurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateJurisdiction field
   */
   public String getRateJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateJurisdictionAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateJurisdiction());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateJurisdiction field from a formatted string
   *
   * @param _value the RateJurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateJurisdiction field
   */
   public void setRateJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateJurisdiction(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateJurisdictionFromFormattedString");
   }

  /** get the value of the field: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return Boolean the value
   */
  public Boolean getRateJurisdiction () {
    return this.RateJurisdiction;
  }
  /** Change the field to not being actively set: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   */
  public void unsetRateJurisdiction () {
    this._RateJurisdictionSet = false;
  }
  /** See if the field is actively set: RateJurisdiction (PRODUCT_ELEMENTS.rate_jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateJurisdiction () {
    return this._RateJurisdictionSet;
  }
  /** set the fields value: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateUnits") 
  public void setRateUnits (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateUnits", "setRateUnits");
    }
    this.RateUnits = value;
    this._RateUnitsSet = true;
  }

  /** Retrieves the RateUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateUnits field
   */
   public String getRateUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateUnitsAsFormattedString");
       return fmtMgr.formatBoolean(this.getRateUnits());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateUnits field from a formatted string
   *
   * @param _value the RateUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateUnits field
   */
   public void setRateUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateUnits(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateUnitsFromFormattedString");
   }

  /** get the value of the field: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return Boolean the value
   */
  public Boolean getRateUnits () {
    return this.RateUnits;
  }
  /** Change the field to not being actively set: RateUnits (PRODUCT_ELEMENTS.rate_units)
   */
  public void unsetRateUnits () {
    this._RateUnitsSet = false;
  }
  /** See if the field is actively set: RateUnits (PRODUCT_ELEMENTS.rate_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateUnits () {
    return this._RateUnitsSet;
  }
  /** set the fields value: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
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

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (PRODUCT_ELEMENTS.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateCurrencyLocation") 
  public void setRateCurrencyLocation (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyLocation", "setRateCurrencyLocation");
    }
    this.RateCurrencyLocation = value;
    this._RateCurrencyLocationSet = true;
  }

  /** Retrieves the RateCurrencyLocation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyLocation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyLocation field
   */
   public String getRateCurrencyLocationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyLocationAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyLocation(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyLocationAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyLocation field from a formatted string
   *
   * @param _value the RateCurrencyLocation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyLocation field
   */
   public void setRateCurrencyLocationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyLocation(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyLocationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyLocationFromFormattedString");
   }

  /** get the value of the field: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return Integer the value
   */
  public Integer getRateCurrencyLocation () {
    return this.RateCurrencyLocation;
  }
  /** Change the field to not being actively set: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   */
  public void unsetRateCurrencyLocation () {
    this._RateCurrencyLocationSet = false;
  }
  /** See if the field is actively set: RateCurrencyLocation (PRODUCT_ELEMENTS.rate_currency_location)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyLocation () {
    return this._RateCurrencyLocationSet;
  }
  /** set the fields value: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillInArrears") 
  public void setBillInArrears (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillInArrears", "setBillInArrears");
    }
    this.BillInArrears = value;
    this._BillInArrearsSet = true;
  }

  /** Retrieves the BillInArrears field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillInArrears field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillInArrears field
   */
   public String getBillInArrearsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInArrearsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInArrearsAsFormattedString");
       return fmtMgr.formatBoolean(this.getBillInArrears());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInArrears");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillInArrearsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillInArrears field from a formatted string
   *
   * @param _value the BillInArrears field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillInArrears field
   */
   public void setBillInArrearsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInArrearsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillInArrears(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInArrears");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillInArrearsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillInArrearsFromFormattedString");
   }

  /** get the value of the field: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return Boolean the value
   */
  public Boolean getBillInArrears () {
    return this.BillInArrears;
  }
  /** Change the field to not being actively set: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   */
  public void unsetBillInArrears () {
    this._BillInArrearsSet = false;
  }
  /** See if the field is actively set: BillInArrears (PRODUCT_ELEMENTS.bill_in_arrears)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillInArrears () {
    return this._BillInArrearsSet;
  }
  /** set the fields value: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsType") 
  public void setUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsType", "setUnitsType");
    }
    this.UnitsType = value;
    this._UnitsTypeSet = true;
  }

  /** Retrieves the UnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsType field
   */
   public String getUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsType field from a formatted string
   *
   * @param _value the UnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsType field
   */
   public void setUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsTypeFromFormattedString");
   }

  /** get the value of the field: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return Integer the value
   */
  public Integer getUnitsType () {
    return this.UnitsType;
  }
  /** Change the field to not being actively set: UnitsType (PRODUCT_RATE_KEY.units_type)
   */
  public void unsetUnitsType () {
    this._UnitsTypeSet = false;
  }
  /** See if the field is actively set: UnitsType (PRODUCT_RATE_KEY.units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsType () {
    return this._UnitsTypeSet;
  }
  /** set the fields value: Units (PRODUCT_RATE_KEY.units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Units") 
  public void setUnits (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Units", "setUnits");
    }
    this.Units = value;
    this._UnitsSet = true;
  }

  /** Retrieves the Units field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Units field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Units field
   */
   public String getUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the Units field from a formatted string
   *
   * @param _value the Units field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Units field
   */
   public void setUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFromFormattedString");
   }

  /** get the value of the field: Units (PRODUCT_RATE_KEY.units)
   * @return Integer the value
   */
  public Integer getUnits () {
    return this.Units;
  }
  /** Change the field to not being actively set: Units (PRODUCT_RATE_KEY.units)
   */
  public void unsetUnits () {
    this._UnitsSet = false;
  }
  /** See if the field is actively set: Units (PRODUCT_RATE_KEY.units)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnits () {
    return this._UnitsSet;
  }
  /** set the fields value: ComponentId (PRODUCT.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    this.ComponentId = value;
    this._ComponentIdSet = true;
  }

  /** Retrieves the ComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentId field
   */
   public String getComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ComponentId field from a formatted string
   *
   * @param _value the ComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ComponentId field
   */
   public void setComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFromFormattedString");
   }

  /** get the value of the field: ComponentId (PRODUCT.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (PRODUCT.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (PRODUCT.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillPeriod") 
  public void setBillPeriod (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillPeriod", "setBillPeriod");
    }
    this.BillPeriod = value;
    this._BillPeriodSet = true;
  }

  /** Retrieves the BillPeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillPeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillPeriod field
   */
   public String getBillPeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillPeriodAsFormattedString");
       return fmtMgr.formatString(this.getBillPeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillPeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillPeriod field from a formatted string
   *
   * @param _value the BillPeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillPeriod field
   */
   public void setBillPeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillPeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillPeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillPeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillPeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillPeriodFromFormattedString");
   }

  /** get the value of the field: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return String the value
   */
  public String getBillPeriod () {
    return this.BillPeriod;
  }
  /** Change the field to not being actively set: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   */
  public void unsetBillPeriod () {
    this._BillPeriodSet = false;
  }
  /** See if the field is actively set: BillPeriod (PRODUCT_CHARGE_MAP.bill_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillPeriod () {
    return this._BillPeriodSet;
  }
  /** set the fields value: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BilledThruDt") 
  public void setBilledThruDt (Date value) throws ServiceException
  {
    this.BilledThruDt = value;
    this._BilledThruDtSet = true;
  }

  /** Retrieves the BilledThruDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BilledThruDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDt field
   */
   public String getBilledThruDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtAsFormattedString");
       return fmtMgr.formatDate(this.getBilledThruDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the BilledThruDt field from a formatted string
   *
   * @param _value the BilledThruDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BilledThruDt field
   */
   public void setBilledThruDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBilledThruDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledThruDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledThruDtFromFormattedString");
   }

  /**
   * Retrieves the BilledThruDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BilledThruDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledThruDt field
   */
  public String getBilledThruDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getBilledThruDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledThruDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BilledThruDt field value from a formatted date/time string
   *
   * @param _value the BilledThruDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BilledThruDt field
   */
  public void setBilledThruDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBilledThruDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBilledThruDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BilledThruDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledThruDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return Date the value
   */
  public Date getBilledThruDt () {
    return this.BilledThruDt;
  }
  /** Change the field to not being actively set: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   */
  public void unsetBilledThruDt () {
    this._BilledThruDtSet = false;
  }
  /** See if the field is actively set: BilledThruDt (PRODUCT_CHARGE_MAP.billed_thru_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBilledThruDt () {
    return this._BilledThruDtSet;
  }
  /** set the fields value: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
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

  /** get the value of the field: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (PRODUCT_CHARGE_MAP.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TerminationCode") 
  public void setTerminationCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TerminationCode", "setTerminationCode");
    }
    this.TerminationCode = value;
    this._TerminationCodeSet = true;
  }

  /** Retrieves the TerminationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TerminationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationCode field
   */
   public String getTerminationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTerminationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TerminationCode field from a formatted string
   *
   * @param _value the TerminationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TerminationCode field
   */
   public void setTerminationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTerminationCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationCodeFromFormattedString");
   }

  /** get the value of the field: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return Integer the value
   */
  public Integer getTerminationCode () {
    return this.TerminationCode;
  }
  /** Change the field to not being actively set: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   */
  public void unsetTerminationCode () {
    this._TerminationCodeSet = false;
  }
  /** See if the field is actively set: TerminationCode (PRODUCT_CHARGE_MAP.termination_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTerminationCode () {
    return this._TerminationCodeSet;
  }
  /** set the fields value: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InArrearsOverride") 
  public void setInArrearsOverride (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InArrearsOverride", "setInArrearsOverride");
    }
    this.InArrearsOverride = value;
    this._InArrearsOverrideSet = true;
  }

  /** Retrieves the InArrearsOverride field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InArrearsOverride field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InArrearsOverride field
   */
   public String getInArrearsOverrideAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInArrearsOverrideAsFormattedString");
       return fmtMgr.formatNumber(this.getInArrearsOverride(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InArrearsOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInArrearsOverrideAsFormattedString");
       throw x;
     }
   }
  /** Sets the InArrearsOverride field from a formatted string
   *
   * @param _value the InArrearsOverride field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InArrearsOverride field
   */
   public void setInArrearsOverrideFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInArrearsOverrideFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInArrearsOverride(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InArrearsOverride");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInArrearsOverrideFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInArrearsOverrideFromFormattedString");
   }

  /** get the value of the field: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return Integer the value
   */
  public Integer getInArrearsOverride () {
    return this.InArrearsOverride;
  }
  /** Change the field to not being actively set: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   */
  public void unsetInArrearsOverride () {
    this._InArrearsOverrideSet = false;
  }
  /** See if the field is actively set: InArrearsOverride (PRODUCT_CHARGE_MAP.in_arrears_override)
   * @return boolean whether the field is actively set
   */
  public boolean issetInArrearsOverride () {
    return this._InArrearsOverrideSet;
  }
  public String toString() {
    return PRRRcDataObjectHelper.toMap(this, null).toString();
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
    
  /** PRODUCT_ELEMENTS.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** PRODUCT_ELEMENTS.rate_rate_class field */
    if(!nonNullOnly || (RateRateClass != null))  _RateRateClassSet = flag;
  /** PRODUCT_ELEMENTS.rate_equip_type field */
    if(!nonNullOnly || (RateEquipType != null))  _RateEquipTypeSet = flag;
  /** PRODUCT_ELEMENTS.rate_equip_class field */
    if(!nonNullOnly || (RateEquipClass != null))  _RateEquipClassSet = flag;
  /** PRODUCT_ELEMENTS.rate_class_of_service field */
    if(!nonNullOnly || (RateClassOfService != null))  _RateClassOfServiceSet = flag;
  /** PRODUCT_ELEMENTS.rate_component_id field */
    if(!nonNullOnly || (RateComponentId != null))  _RateComponentIdSet = flag;
  /** PRODUCT_ELEMENTS.rate_jurisdiction field */
    if(!nonNullOnly || (RateJurisdiction != null))  _RateJurisdictionSet = flag;
  /** PRODUCT_ELEMENTS.rate_units field */
    if(!nonNullOnly || (RateUnits != null))  _RateUnitsSet = flag;
  /** PRODUCT_ELEMENTS.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** PRODUCT_ELEMENTS.rate_currency_location field */
    if(!nonNullOnly || (RateCurrencyLocation != null))  _RateCurrencyLocationSet = flag;
  /** PRODUCT_ELEMENTS.bill_in_arrears field */
    if(!nonNullOnly || (BillInArrears != null))  _BillInArrearsSet = flag;
  /** PRODUCT_RATE_KEY.units_type field */
    if(!nonNullOnly || (UnitsType != null))  _UnitsTypeSet = flag;
  /** PRODUCT_RATE_KEY.units field */
    if(!nonNullOnly || (Units != null))  _UnitsSet = flag;
  /** PRODUCT.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** PRODUCT_CHARGE_MAP.bill_period field */
    if(!nonNullOnly || (BillPeriod != null))  _BillPeriodSet = flag;
  /** PRODUCT_CHARGE_MAP.billed_thru_dt field */
    if(!nonNullOnly || (BilledThruDt != null))  _BilledThruDtSet = flag;
  /** PRODUCT_CHARGE_MAP.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** PRODUCT_CHARGE_MAP.termination_code field */
    if(!nonNullOnly || (TerminationCode != null))  _TerminationCodeSet = flag;
  /** PRODUCT_CHARGE_MAP.in_arrears_override field */
    if(!nonNullOnly || (InArrearsOverride != null))  _InArrearsOverrideSet = flag;
  }
}
