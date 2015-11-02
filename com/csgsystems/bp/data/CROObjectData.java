/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CROObjectData.java
 * Definition File: Admin/CorridorRateOverride.xml
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
  
/** CROObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CROObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CROObjectKeyData Key = null;
  /** RATE_USAGE_OVERRIDES.corridor_plan_id field */
  public    Integer CorridorPlanId  = null;
  protected boolean _CorridorPlanIdSet = false;
  /** RATE_USAGE_OVERRIDES.type_id_usg field */
  public    Integer TypeIdUsg  = null;
  protected boolean _TypeIdUsgSet = false;
  /** RATE_USAGE_OVERRIDES.units_indicator field */
  public    Integer UnitsIndicator  = null;
  protected boolean _UnitsIndicatorSet = false;
  /** RATE_USAGE_OVERRIDES.element_id field */
  public    Integer ElementId  = null;
  protected boolean _ElementIdSet = false;
  /** RATE_USAGE_OVERRIDES.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** RATE_USAGE_OVERRIDES.equip_type_code field */
  public    Integer EquipTypeCode  = null;
  protected boolean _EquipTypeCodeSet = false;
  /** RATE_USAGE_OVERRIDES.equip_class_code field */
  public    Integer EquipClassCode  = null;
  protected boolean _EquipClassCodeSet = false;
  /** RATE_USAGE_OVERRIDES.class_of_service_code field */
  public    Integer ClassOfServiceCode  = null;
  protected boolean _ClassOfServiceCodeSet = false;
  /** RATE_USAGE_OVERRIDES.provider_class field */
  public    Integer ProviderClass  = null;
  protected boolean _ProviderClassSet = false;
  /** RATE_USAGE_OVERRIDES.bill_class field */
  public    Integer BillClass  = null;
  protected boolean _BillClassSet = false;
  /** RATE_USAGE_OVERRIDES.jurisdiction field */
  public    Integer Jurisdiction  = null;
  protected boolean _JurisdictionSet = false;
  /** RATE_USAGE_OVERRIDES.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** RATE_USAGE_OVERRIDES.rate_period field */
  public    String RatePeriod  = null;
  protected boolean _RatePeriodSet = false;
  /** RATE_USAGE_OVERRIDES.incremental_bands field */
  public    Boolean IncrementalBands  = null;
  protected boolean _IncrementalBandsSet = false;
  /** RATE_USAGE_OVERRIDES.fixed_charge_amt field */
  public    BigInteger FixedChargeAmt  = null;
  protected boolean _FixedChargeAmtSet = false;
  /** RATE_USAGE_OVERRIDES.add_fixed_amt field */
  public    Integer AddFixedAmt  = null;
  protected boolean _AddFixedAmtSet = false;
  /** RATE_USAGE_OVERRIDES.add_unit_rate field */
  public    Integer AddUnitRate  = null;
  protected boolean _AddUnitRateSet = false;
  /** RATE_USAGE_OVERRIDES.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** RATE_USAGE_OVERRIDES.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** RATE_USAGE_OVERRIDES.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** RATE_USAGE_OVERRIDES.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** RATE_USAGE_OVERRIDES.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** RATE_USAGE_OVERRIDES.rate_units_type field */
  public    Integer RateUnitsType  = null;
  protected boolean _RateUnitsTypeSet = false;
  /** RATE_USAGE_OVERRIDES.distance_band_id field */
  public    Integer DistanceBandId  = null;
  protected boolean _DistanceBandIdSet = false;
  /** RATE_USAGE_OVERRIDES.add_implied_decimal field */
  public    Integer AddImpliedDecimal  = null;
  protected boolean _AddImpliedDecimalSet = false;
  /** RATE_USAGE_OVERRIDES.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** RATE_USAGE_OVERRIDES.billing_units_type field */
  public    Integer BillingUnitsType  = null;
  protected boolean _BillingUnitsTypeSet = false;
  /** RATE_USAGE_OVERRIDES.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "CROObjectData";
  /** Default constructor */
  public CROObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CROObjectData (CROObjectData other)
  {

    if (other == null) return;
    this.Key = new CROObjectKeyData (other.Key);
    this.CorridorPlanId = other.CorridorPlanId;
    this._CorridorPlanIdSet = other._CorridorPlanIdSet;
    this.TypeIdUsg = other.TypeIdUsg;
    this._TypeIdUsgSet = other._TypeIdUsgSet;
    this.UnitsIndicator = other.UnitsIndicator;
    this._UnitsIndicatorSet = other._UnitsIndicatorSet;
    this.ElementId = other.ElementId;
    this._ElementIdSet = other._ElementIdSet;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.EquipTypeCode = other.EquipTypeCode;
    this._EquipTypeCodeSet = other._EquipTypeCodeSet;
    this.EquipClassCode = other.EquipClassCode;
    this._EquipClassCodeSet = other._EquipClassCodeSet;
    this.ClassOfServiceCode = other.ClassOfServiceCode;
    this._ClassOfServiceCodeSet = other._ClassOfServiceCodeSet;
    this.ProviderClass = other.ProviderClass;
    this._ProviderClassSet = other._ProviderClassSet;
    this.BillClass = other.BillClass;
    this._BillClassSet = other._BillClassSet;
    this.Jurisdiction = other.Jurisdiction;
    this._JurisdictionSet = other._JurisdictionSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.RatePeriod = other.RatePeriod;
    this._RatePeriodSet = other._RatePeriodSet;
    this.IncrementalBands = other.IncrementalBands;
    this._IncrementalBandsSet = other._IncrementalBandsSet;
    this.FixedChargeAmt = other.FixedChargeAmt;
    this._FixedChargeAmtSet = other._FixedChargeAmtSet;
    this.AddFixedAmt = other.AddFixedAmt;
    this._AddFixedAmtSet = other._AddFixedAmtSet;
    this.AddUnitRate = other.AddUnitRate;
    this._AddUnitRateSet = other._AddUnitRateSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.RateUnitsType = other.RateUnitsType;
    this._RateUnitsTypeSet = other._RateUnitsTypeSet;
    this.DistanceBandId = other.DistanceBandId;
    this._DistanceBandIdSet = other._DistanceBandIdSet;
    this.AddImpliedDecimal = other.AddImpliedDecimal;
    this._AddImpliedDecimalSet = other._AddImpliedDecimalSet;
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.BillingUnitsType = other.BillingUnitsType;
    this._BillingUnitsTypeSet = other._BillingUnitsTypeSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return CROObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CROObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CROObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSeqnum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Seqnum", "setSeqnum");
    }
    if (this.Key == null) this.Key = new CROObjectKeyData ();
    this.Key.Seqnum = value;
    this.Key._SeqnumSet = true;
  }
  /** get the value of the field: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return Integer the value
   */
  public Integer getSeqnum () {
    if (this.Key == null) return null;
    return this.Key.Seqnum;
  }
  /** Change the field to not being actively set: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   */
  public void unsetSeqnum () {
    if (this.Key == null) return;
    this.Key._SeqnumSet = false;
  }
  /** See if the field is actively set: Seqnum (RATE_USAGE_OVERRIDES.seqnum)
   * @return boolean whether the field is actively set
   */
  public boolean issetSeqnum () {
    if (this.Key == null) return false;
    return this.Key._SeqnumSet;
  }

  /** Retrieves the Seqnum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Seqnum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Seqnum field
   */
   public String getSeqnumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumAsFormattedString");
       return fmtMgr.formatNumber(this.getSeqnum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Seqnum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumAsFormattedString");
       throw x;
     }
   }
  /** Sets the Seqnum field from a formatted string
   *
   * @param _value the Seqnum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Seqnum field
   */
   public void setSeqnumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSeqnum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Seqnum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumFromFormattedString");
   }

  /** set the fields value: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CorridorPlanId") 
  public void setCorridorPlanId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CorridorPlanId", "setCorridorPlanId");
    }
    this.CorridorPlanId = value;
    this._CorridorPlanIdSet = true;
  }

  /** Retrieves the CorridorPlanId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CorridorPlanId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanId field
   */
   public String getCorridorPlanIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCorridorPlanId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CorridorPlanId field from a formatted string
   *
   * @param _value the CorridorPlanId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CorridorPlanId field
   */
   public void setCorridorPlanIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCorridorPlanId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFromFormattedString");
   }

  /** get the value of the field: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return Integer the value
   */
  public Integer getCorridorPlanId () {
    return this.CorridorPlanId;
  }
  /** Change the field to not being actively set: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   */
  public void unsetCorridorPlanId () {
    this._CorridorPlanIdSet = false;
  }
  /** See if the field is actively set: CorridorPlanId (RATE_USAGE_OVERRIDES.corridor_plan_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCorridorPlanId () {
    return this._CorridorPlanIdSet;
  }
  /** set the fields value: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TypeIdUsg") 
  public void setTypeIdUsg (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TypeIdUsg", "setTypeIdUsg");
    }
    this.TypeIdUsg = value;
    this._TypeIdUsgSet = true;
  }

  /** Retrieves the TypeIdUsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TypeIdUsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdUsg field
   */
   public String getTypeIdUsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgAsFormattedString");
       return fmtMgr.formatNumber(this.getTypeIdUsg(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the TypeIdUsg field from a formatted string
   *
   * @param _value the TypeIdUsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TypeIdUsg field
   */
   public void setTypeIdUsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTypeIdUsg(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdUsgFromFormattedString");
   }

  /** get the value of the field: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return Integer the value
   */
  public Integer getTypeIdUsg () {
    return this.TypeIdUsg;
  }
  /** Change the field to not being actively set: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   */
  public void unsetTypeIdUsg () {
    this._TypeIdUsgSet = false;
  }
  /** See if the field is actively set: TypeIdUsg (RATE_USAGE_OVERRIDES.type_id_usg)
   * @return boolean whether the field is actively set
   */
  public boolean issetTypeIdUsg () {
    return this._TypeIdUsgSet;
  }
  /** set the fields value: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsIndicator") 
  public void setUnitsIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsIndicator", "setUnitsIndicator");
    }
    this.UnitsIndicator = value;
    this._UnitsIndicatorSet = true;
  }

  /** Retrieves the UnitsIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsIndicator field
   */
   public String getUnitsIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitsIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsIndicator field from a formatted string
   *
   * @param _value the UnitsIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsIndicator field
   */
   public void setUnitsIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsIndicatorFromFormattedString");
   }

  /** get the value of the field: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return Integer the value
   */
  public Integer getUnitsIndicator () {
    return this.UnitsIndicator;
  }
  /** Change the field to not being actively set: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   */
  public void unsetUnitsIndicator () {
    this._UnitsIndicatorSet = false;
  }
  /** See if the field is actively set: UnitsIndicator (RATE_USAGE_OVERRIDES.units_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsIndicator () {
    return this._UnitsIndicatorSet;
  }
  /** set the fields value: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ElementId") 
  public void setElementId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ElementId", "setElementId");
    }
    this.ElementId = value;
    this._ElementIdSet = true;
  }

  /** Retrieves the ElementId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ElementId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ElementId field
   */
   public String getElementIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdAsFormattedString");
       return fmtMgr.formatNumber(this.getElementId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ElementId field from a formatted string
   *
   * @param _value the ElementId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ElementId field
   */
   public void setElementIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setElementId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFromFormattedString");
   }

  /** get the value of the field: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @return Integer the value
   */
  public Integer getElementId () {
    return this.ElementId;
  }
  /** Change the field to not being actively set: ElementId (RATE_USAGE_OVERRIDES.element_id)
   */
  public void unsetElementId () {
    this._ElementIdSet = false;
  }
  /** See if the field is actively set: ElementId (RATE_USAGE_OVERRIDES.element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetElementId () {
    return this._ElementIdSet;
  }
  /** set the fields value: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
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

  /** get the value of the field: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (RATE_USAGE_OVERRIDES.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
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

  /** get the value of the field: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return Integer the value
   */
  public Integer getEquipTypeCode () {
    return this.EquipTypeCode;
  }
  /** Change the field to not being actively set: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   */
  public void unsetEquipTypeCode () {
    this._EquipTypeCodeSet = false;
  }
  /** See if the field is actively set: EquipTypeCode (RATE_USAGE_OVERRIDES.equip_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipTypeCode () {
    return this._EquipTypeCodeSet;
  }
  /** set the fields value: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
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

  /** get the value of the field: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return Integer the value
   */
  public Integer getEquipClassCode () {
    return this.EquipClassCode;
  }
  /** Change the field to not being actively set: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   */
  public void unsetEquipClassCode () {
    this._EquipClassCodeSet = false;
  }
  /** See if the field is actively set: EquipClassCode (RATE_USAGE_OVERRIDES.equip_class_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipClassCode () {
    return this._EquipClassCodeSet;
  }
  /** set the fields value: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
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

  /** get the value of the field: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return Integer the value
   */
  public Integer getClassOfServiceCode () {
    return this.ClassOfServiceCode;
  }
  /** Change the field to not being actively set: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   */
  public void unsetClassOfServiceCode () {
    this._ClassOfServiceCodeSet = false;
  }
  /** See if the field is actively set: ClassOfServiceCode (RATE_USAGE_OVERRIDES.class_of_service_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetClassOfServiceCode () {
    return this._ClassOfServiceCodeSet;
  }
  /** set the fields value: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProviderClass") 
  public void setProviderClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProviderClass", "setProviderClass");
    }
    this.ProviderClass = value;
    this._ProviderClassSet = true;
  }

  /** Retrieves the ProviderClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProviderClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderClass field
   */
   public String getProviderClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderClassAsFormattedString");
       return fmtMgr.formatNumber(this.getProviderClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProviderClass field from a formatted string
   *
   * @param _value the ProviderClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProviderClass field
   */
   public void setProviderClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProviderClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderClassFromFormattedString");
   }

  /** get the value of the field: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return Integer the value
   */
  public Integer getProviderClass () {
    return this.ProviderClass;
  }
  /** Change the field to not being actively set: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   */
  public void unsetProviderClass () {
    this._ProviderClassSet = false;
  }
  /** See if the field is actively set: ProviderClass (RATE_USAGE_OVERRIDES.provider_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetProviderClass () {
    return this._ProviderClassSet;
  }
  /** set the fields value: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillClass") 
  public void setBillClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillClass", "setBillClass");
    }
    this.BillClass = value;
    this._BillClassSet = true;
  }

  /** Retrieves the BillClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillClass field
   */
   public String getBillClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillClassAsFormattedString");
       return fmtMgr.formatNumber(this.getBillClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillClass field from a formatted string
   *
   * @param _value the BillClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillClass field
   */
   public void setBillClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillClassFromFormattedString");
   }

  /** get the value of the field: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return Integer the value
   */
  public Integer getBillClass () {
    return this.BillClass;
  }
  /** Change the field to not being actively set: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   */
  public void unsetBillClass () {
    this._BillClassSet = false;
  }
  /** See if the field is actively set: BillClass (RATE_USAGE_OVERRIDES.bill_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillClass () {
    return this._BillClassSet;
  }
  /** set the fields value: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Jurisdiction") 
  public void setJurisdiction (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Jurisdiction", "setJurisdiction");
    }
    this.Jurisdiction = value;
    this._JurisdictionSet = true;
  }

  /** Retrieves the Jurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Jurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Jurisdiction field
   */
   public String getJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionAsFormattedString");
       return fmtMgr.formatNumber(this.getJurisdiction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Jurisdiction field from a formatted string
   *
   * @param _value the Jurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Jurisdiction field
   */
   public void setJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setJurisdiction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFromFormattedString");
   }

  /** get the value of the field: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return Integer the value
   */
  public Integer getJurisdiction () {
    return this.Jurisdiction;
  }
  /** Change the field to not being actively set: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   */
  public void unsetJurisdiction () {
    this._JurisdictionSet = false;
  }
  /** See if the field is actively set: Jurisdiction (RATE_USAGE_OVERRIDES.jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetJurisdiction () {
    return this._JurisdictionSet;
  }
  /** set the fields value: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
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

  /** get the value of the field: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (RATE_USAGE_OVERRIDES.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatePeriod") 
  public void setRatePeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatePeriod", "setRatePeriod");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatePeriod", "setRatePeriod");
    }
    this.RatePeriod = value;
    this._RatePeriodSet = true;
  }

  /** Retrieves the RatePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriod field
   */
   public String getRatePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodAsFormattedString");
       return fmtMgr.formatString(this.getRatePeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatePeriod field from a formatted string
   *
   * @param _value the RatePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatePeriod field
   */
   public void setRatePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatePeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFromFormattedString");
   }

  /** get the value of the field: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return String the value
   */
  public String getRatePeriod () {
    return this.RatePeriod;
  }
  /** Change the field to not being actively set: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   */
  public void unsetRatePeriod () {
    this._RatePeriodSet = false;
  }
  /** See if the field is actively set: RatePeriod (RATE_USAGE_OVERRIDES.rate_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatePeriod () {
    return this._RatePeriodSet;
  }
  /** set the fields value: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncrementalBands") 
  public void setIncrementalBands (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncrementalBands", "setIncrementalBands");
    }
    this.IncrementalBands = value;
    this._IncrementalBandsSet = true;
  }

  /** Retrieves the IncrementalBands field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncrementalBands field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncrementalBands field
   */
   public String getIncrementalBandsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncrementalBandsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncrementalBandsAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncrementalBands());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncrementalBands");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncrementalBandsAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncrementalBands field from a formatted string
   *
   * @param _value the IncrementalBands field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncrementalBands field
   */
   public void setIncrementalBandsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncrementalBandsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncrementalBands(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncrementalBands");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncrementalBandsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncrementalBandsFromFormattedString");
   }

  /** get the value of the field: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return Boolean the value
   */
  public Boolean getIncrementalBands () {
    return this.IncrementalBands;
  }
  /** Change the field to not being actively set: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   */
  public void unsetIncrementalBands () {
    this._IncrementalBandsSet = false;
  }
  /** See if the field is actively set: IncrementalBands (RATE_USAGE_OVERRIDES.incremental_bands)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncrementalBands () {
    return this._IncrementalBandsSet;
  }
  /** set the fields value: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FixedChargeAmt") 
  public void setFixedChargeAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FixedChargeAmt", "setFixedChargeAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FixedChargeAmt", "setFixedChargeAmt");
    }
    this.FixedChargeAmt = value;
    this._FixedChargeAmtSet = true;
  }

  /** Retrieves the FixedChargeAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FixedChargeAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedChargeAmt field
   */
   public String getFixedChargeAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedChargeAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedChargeAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFixedChargeAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedChargeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedChargeAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the FixedChargeAmt field from a formatted string
   *
   * @param _value the FixedChargeAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedChargeAmt field
   */
   public void setFixedChargeAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedChargeAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFixedChargeAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FixedChargeAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedChargeAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedChargeAmtFromFormattedString");
   }

  /**
   * Retrieves the FixedChargeAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedChargeAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedChargeAmt field
   */
  public String getFixedChargeAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedChargeAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedChargeAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getFixedChargeAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedChargeAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the FixedChargeAmt field value from a formatted currency string
   *
   * @param _value the FixedChargeAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FixedChargeAmt field
   */
  public void setFixedChargeAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedChargeAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFixedChargeAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedChargeAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedChargeAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedChargeAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return BigInteger the value
   */
  public BigInteger getFixedChargeAmt () {
    return this.FixedChargeAmt;
  }
  /** Change the field to not being actively set: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   */
  public void unsetFixedChargeAmt () {
    this._FixedChargeAmtSet = false;
  }
  /** See if the field is actively set: FixedChargeAmt (RATE_USAGE_OVERRIDES.fixed_charge_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetFixedChargeAmt () {
    return this._FixedChargeAmtSet;
  }
  /** set the fields value: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddFixedAmt") 
  public void setAddFixedAmt (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddFixedAmt", "setAddFixedAmt");
    }
    this.AddFixedAmt = value;
    this._AddFixedAmtSet = true;
  }

  /** Retrieves the AddFixedAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddFixedAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddFixedAmt field
   */
   public String getAddFixedAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddFixedAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddFixedAmtAsFormattedString");
       return fmtMgr.formatNumber(this.getAddFixedAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddFixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddFixedAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddFixedAmt field from a formatted string
   *
   * @param _value the AddFixedAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddFixedAmt field
   */
   public void setAddFixedAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddFixedAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddFixedAmt(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddFixedAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddFixedAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddFixedAmtFromFormattedString");
   }

  /** get the value of the field: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return Integer the value
   */
  public Integer getAddFixedAmt () {
    return this.AddFixedAmt;
  }
  /** Change the field to not being actively set: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   */
  public void unsetAddFixedAmt () {
    this._AddFixedAmtSet = false;
  }
  /** See if the field is actively set: AddFixedAmt (RATE_USAGE_OVERRIDES.add_fixed_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddFixedAmt () {
    return this._AddFixedAmtSet;
  }
  /** set the fields value: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddUnitRate") 
  public void setAddUnitRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddUnitRate", "setAddUnitRate");
    }
    this.AddUnitRate = value;
    this._AddUnitRateSet = true;
  }

  /** Retrieves the AddUnitRate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddUnitRate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddUnitRate field
   */
   public String getAddUnitRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddUnitRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddUnitRateAsFormattedString");
       return fmtMgr.formatNumber(this.getAddUnitRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddUnitRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddUnitRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddUnitRate field from a formatted string
   *
   * @param _value the AddUnitRate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddUnitRate field
   */
   public void setAddUnitRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddUnitRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddUnitRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddUnitRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddUnitRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddUnitRateFromFormattedString");
   }

  /** get the value of the field: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return Integer the value
   */
  public Integer getAddUnitRate () {
    return this.AddUnitRate;
  }
  /** Change the field to not being actively set: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   */
  public void unsetAddUnitRate () {
    this._AddUnitRateSet = false;
  }
  /** See if the field is actively set: AddUnitRate (RATE_USAGE_OVERRIDES.add_unit_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddUnitRate () {
    return this._AddUnitRateSet;
  }
  /** set the fields value: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
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

  /** get the value of the field: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (RATE_USAGE_OVERRIDES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
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

  /** get the value of the field: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (RATE_USAGE_OVERRIDES.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (RATE_USAGE_OVERRIDES.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (RATE_USAGE_OVERRIDES.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (RATE_USAGE_OVERRIDES.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateUnitsType") 
  public void setRateUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateUnitsType", "setRateUnitsType");
    }
    this.RateUnitsType = value;
    this._RateUnitsTypeSet = true;
  }

  /** Retrieves the RateUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateUnitsType field
   */
   public String getRateUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateUnitsType field from a formatted string
   *
   * @param _value the RateUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateUnitsType field
   */
   public void setRateUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateUnitsTypeFromFormattedString");
   }

  /** get the value of the field: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return Integer the value
   */
  public Integer getRateUnitsType () {
    return this.RateUnitsType;
  }
  /** Change the field to not being actively set: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   */
  public void unsetRateUnitsType () {
    this._RateUnitsTypeSet = false;
  }
  /** See if the field is actively set: RateUnitsType (RATE_USAGE_OVERRIDES.rate_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateUnitsType () {
    return this._RateUnitsTypeSet;
  }
  /** set the fields value: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistanceBandId") 
  public void setDistanceBandId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistanceBandId", "setDistanceBandId");
    }
    this.DistanceBandId = value;
    this._DistanceBandIdSet = true;
  }

  /** Retrieves the DistanceBandId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistanceBandId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistanceBandId field
   */
   public String getDistanceBandIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceBandIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistanceBandIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDistanceBandId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistanceBandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistanceBandIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistanceBandId field from a formatted string
   *
   * @param _value the DistanceBandId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistanceBandId field
   */
   public void setDistanceBandIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceBandIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistanceBandId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistanceBandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistanceBandIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistanceBandIdFromFormattedString");
   }

  /** get the value of the field: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return Integer the value
   */
  public Integer getDistanceBandId () {
    return this.DistanceBandId;
  }
  /** Change the field to not being actively set: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   */
  public void unsetDistanceBandId () {
    this._DistanceBandIdSet = false;
  }
  /** See if the field is actively set: DistanceBandId (RATE_USAGE_OVERRIDES.distance_band_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistanceBandId () {
    return this._DistanceBandIdSet;
  }
  /** set the fields value: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddImpliedDecimal") 
  public void setAddImpliedDecimal (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddImpliedDecimal", "setAddImpliedDecimal");
    }
    this.AddImpliedDecimal = value;
    this._AddImpliedDecimalSet = true;
  }

  /** Retrieves the AddImpliedDecimal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddImpliedDecimal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimal field
   */
   public String getAddImpliedDecimalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalAsFormattedString");
       return fmtMgr.formatNumber(this.getAddImpliedDecimal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddImpliedDecimal field from a formatted string
   *
   * @param _value the AddImpliedDecimal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddImpliedDecimal field
   */
   public void setAddImpliedDecimalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddImpliedDecimal(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalFromFormattedString");
   }

  /** get the value of the field: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return Integer the value
   */
  public Integer getAddImpliedDecimal () {
    return this.AddImpliedDecimal;
  }
  /** Change the field to not being actively set: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   */
  public void unsetAddImpliedDecimal () {
    this._AddImpliedDecimalSet = false;
  }
  /** See if the field is actively set: AddImpliedDecimal (RATE_USAGE_OVERRIDES.add_implied_decimal)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddImpliedDecimal () {
    return this._AddImpliedDecimalSet;
  }
  /** set the fields value: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ComponentId", "setComponentId");
    }
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

  /** get the value of the field: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (RATE_USAGE_OVERRIDES.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingUnitsType") 
  public void setBillingUnitsType (Integer value) throws ServiceException
  {
    this.BillingUnitsType = value;
    this._BillingUnitsTypeSet = true;
  }

  /** Retrieves the BillingUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingUnitsType field
   */
   public String getBillingUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingUnitsType field from a formatted string
   *
   * @param _value the BillingUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingUnitsType field
   */
   public void setBillingUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingUnitsTypeFromFormattedString");
   }

  /** get the value of the field: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return Integer the value
   */
  public Integer getBillingUnitsType () {
    return this.BillingUnitsType;
  }
  /** Change the field to not being actively set: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   */
  public void unsetBillingUnitsType () {
    this._BillingUnitsTypeSet = false;
  }
  /** See if the field is actively set: BillingUnitsType (RATE_USAGE_OVERRIDES.billing_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingUnitsType () {
    return this._BillingUnitsTypeSet;
  }
  /** set the fields value: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
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

  /** get the value of the field: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (RATE_USAGE_OVERRIDES.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return CROObjectHelper.toMap(this, null).toString();
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
  /** RATE_USAGE_OVERRIDES.corridor_plan_id field */
    if(!nonNullOnly || (CorridorPlanId != null))  _CorridorPlanIdSet = flag;
  /** RATE_USAGE_OVERRIDES.type_id_usg field */
    if(!nonNullOnly || (TypeIdUsg != null))  _TypeIdUsgSet = flag;
  /** RATE_USAGE_OVERRIDES.units_indicator field */
    if(!nonNullOnly || (UnitsIndicator != null))  _UnitsIndicatorSet = flag;
  /** RATE_USAGE_OVERRIDES.element_id field */
    if(!nonNullOnly || (ElementId != null))  _ElementIdSet = flag;
  /** RATE_USAGE_OVERRIDES.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** RATE_USAGE_OVERRIDES.equip_type_code field */
    if(!nonNullOnly || (EquipTypeCode != null))  _EquipTypeCodeSet = flag;
  /** RATE_USAGE_OVERRIDES.equip_class_code field */
    if(!nonNullOnly || (EquipClassCode != null))  _EquipClassCodeSet = flag;
  /** RATE_USAGE_OVERRIDES.class_of_service_code field */
    if(!nonNullOnly || (ClassOfServiceCode != null))  _ClassOfServiceCodeSet = flag;
  /** RATE_USAGE_OVERRIDES.provider_class field */
    if(!nonNullOnly || (ProviderClass != null))  _ProviderClassSet = flag;
  /** RATE_USAGE_OVERRIDES.bill_class field */
    if(!nonNullOnly || (BillClass != null))  _BillClassSet = flag;
  /** RATE_USAGE_OVERRIDES.jurisdiction field */
    if(!nonNullOnly || (Jurisdiction != null))  _JurisdictionSet = flag;
  /** RATE_USAGE_OVERRIDES.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** RATE_USAGE_OVERRIDES.rate_period field */
    if(!nonNullOnly || (RatePeriod != null))  _RatePeriodSet = flag;
  /** RATE_USAGE_OVERRIDES.incremental_bands field */
    if(!nonNullOnly || (IncrementalBands != null))  _IncrementalBandsSet = flag;
  /** RATE_USAGE_OVERRIDES.fixed_charge_amt field */
    if(!nonNullOnly || (FixedChargeAmt != null))  _FixedChargeAmtSet = flag;
  /** RATE_USAGE_OVERRIDES.add_fixed_amt field */
    if(!nonNullOnly || (AddFixedAmt != null))  _AddFixedAmtSet = flag;
  /** RATE_USAGE_OVERRIDES.add_unit_rate field */
    if(!nonNullOnly || (AddUnitRate != null))  _AddUnitRateSet = flag;
  /** RATE_USAGE_OVERRIDES.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** RATE_USAGE_OVERRIDES.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** RATE_USAGE_OVERRIDES.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** RATE_USAGE_OVERRIDES.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** RATE_USAGE_OVERRIDES.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** RATE_USAGE_OVERRIDES.rate_units_type field */
    if(!nonNullOnly || (RateUnitsType != null))  _RateUnitsTypeSet = flag;
  /** RATE_USAGE_OVERRIDES.distance_band_id field */
    if(!nonNullOnly || (DistanceBandId != null))  _DistanceBandIdSet = flag;
  /** RATE_USAGE_OVERRIDES.add_implied_decimal field */
    if(!nonNullOnly || (AddImpliedDecimal != null))  _AddImpliedDecimalSet = flag;
  /** RATE_USAGE_OVERRIDES.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** RATE_USAGE_OVERRIDES.billing_units_type field */
    if(!nonNullOnly || (BillingUnitsType != null))  _BillingUnitsTypeSet = flag;
  /** RATE_USAGE_OVERRIDES.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
