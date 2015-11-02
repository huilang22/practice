/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRateKeyObjectData.java
 * Definition File: Customer/ProductRateKey.xml
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
  
/** ProductRateKeyObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ProductRateKeyObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ProductRateKeyObjectKeyData Key = null;
  /** PRODUCT_ELEMENTS.rate_jurisdiction field */
  public    Boolean RateJurisdiction  = null;
  protected boolean _RateJurisdictionSet = false;
  /** PRODUCT_ELEMENTS.rate_units field */
  public    Boolean RateUnits  = null;
  protected boolean _RateUnitsSet = false;
  /** PRODUCT_RATE_KEY.origin_location_code field */
  public    Integer OriginLocationCode  = null;
  protected boolean _OriginLocationCodeSet = false;
  /** PRODUCT_RATE_KEY.target_location_code field */
  public    Integer TargetLocationCode  = null;
  protected boolean _TargetLocationCodeSet = false;
  /** PRODUCT_RATE_KEY.jurisdiction field */
  public    Integer Jurisdiction  = null;
  protected boolean _JurisdictionSet = false;
  /** PRODUCT_RATE_KEY.units field */
  public    Integer Units  = null;
  protected boolean _UnitsSet = false;
  /** PRODUCT_RATE_KEY.units_type field */
  public    Integer UnitsType  = null;
  protected boolean _UnitsTypeSet = false;
  /** PRODUCT_RATE_KEY.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** PRODUCT_RATE_KEY.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** PRODUCT_RATE_KEY.inactive_dt field */
  public    Date InactiveDt  = null;
  protected boolean _InactiveDtSet = false;
  /** PRODUCT_RATE_KEY.cost field */
  public    BigInteger Cost  = null;
  protected boolean _CostSet = false;
  private String _objName = "ProductRateKeyObjectData";
  /** Default constructor */
  public ProductRateKeyObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ProductRateKeyObjectData (ProductRateKeyObjectData other)
  {

    if (other == null) return;
    this.Key = new ProductRateKeyObjectKeyData (other.Key);
    this.RateJurisdiction = other.RateJurisdiction;
    this._RateJurisdictionSet = other._RateJurisdictionSet;
    this.RateUnits = other.RateUnits;
    this._RateUnitsSet = other._RateUnitsSet;
    this.OriginLocationCode = other.OriginLocationCode;
    this._OriginLocationCodeSet = other._OriginLocationCodeSet;
    this.TargetLocationCode = other.TargetLocationCode;
    this._TargetLocationCodeSet = other._TargetLocationCodeSet;
    this.Jurisdiction = other.Jurisdiction;
    this._JurisdictionSet = other._JurisdictionSet;
    this.Units = other.Units;
    this._UnitsSet = other._UnitsSet;
    this.UnitsType = other.UnitsType;
    this._UnitsTypeSet = other._UnitsTypeSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.InactiveDt = other.InactiveDt;
    this._InactiveDtSet = other._InactiveDtSet;
    this.Cost = other.Cost;
    this._CostSet = other._CostSet;
  }

  /** get the Key for this object
   * @return ProductRateKeyObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ProductRateKeyObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ProductRateKeyObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (PRODUCT_RATE_KEY.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (PRODUCT_RATE_KEY.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    if (this.Key == null) this.Key = new ProductRateKeyObjectKeyData ();
    this.Key.ActiveDt = value;
    this.Key._ActiveDtSet = true;
  }
  /** get the value of the field: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    if (this.Key == null) return null;
    return this.Key.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   */
  public void unsetActiveDt () {
    if (this.Key == null) return;
    this.Key._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (PRODUCT_RATE_KEY.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    if (this.Key == null) return false;
    return this.Key._ActiveDtSet;
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
  /** set the fields value: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OriginLocationCode") 
  public void setOriginLocationCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OriginLocationCode", "setOriginLocationCode");
    }
    this.OriginLocationCode = value;
    this._OriginLocationCodeSet = true;
  }

  /** Retrieves the OriginLocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OriginLocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginLocationCode field
   */
   public String getOriginLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginLocationCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getOriginLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginLocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the OriginLocationCode field from a formatted string
   *
   * @param _value the OriginLocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OriginLocationCode field
   */
   public void setOriginLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOriginLocationCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginLocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginLocationCodeFromFormattedString");
   }

  /** get the value of the field: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return Integer the value
   */
  public Integer getOriginLocationCode () {
    return this.OriginLocationCode;
  }
  /** Change the field to not being actively set: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   */
  public void unsetOriginLocationCode () {
    this._OriginLocationCodeSet = false;
  }
  /** See if the field is actively set: OriginLocationCode (PRODUCT_RATE_KEY.origin_location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetOriginLocationCode () {
    return this._OriginLocationCodeSet;
  }
  /** set the fields value: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TargetLocationCode") 
  public void setTargetLocationCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TargetLocationCode", "setTargetLocationCode");
    }
    this.TargetLocationCode = value;
    this._TargetLocationCodeSet = true;
  }

  /** Retrieves the TargetLocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TargetLocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TargetLocationCode field
   */
   public String getTargetLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTargetLocationCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTargetLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetLocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTargetLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TargetLocationCode field from a formatted string
   *
   * @param _value the TargetLocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TargetLocationCode field
   */
   public void setTargetLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTargetLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTargetLocationCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TargetLocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTargetLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTargetLocationCodeFromFormattedString");
   }

  /** get the value of the field: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return Integer the value
   */
  public Integer getTargetLocationCode () {
    return this.TargetLocationCode;
  }
  /** Change the field to not being actively set: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   */
  public void unsetTargetLocationCode () {
    this._TargetLocationCodeSet = false;
  }
  /** See if the field is actively set: TargetLocationCode (PRODUCT_RATE_KEY.target_location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTargetLocationCode () {
    return this._TargetLocationCodeSet;
  }
  /** set the fields value: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
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

  /** get the value of the field: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return Integer the value
   */
  public Integer getJurisdiction () {
    return this.Jurisdiction;
  }
  /** Change the field to not being actively set: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   */
  public void unsetJurisdiction () {
    this._JurisdictionSet = false;
  }
  /** See if the field is actively set: Jurisdiction (PRODUCT_RATE_KEY.jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetJurisdiction () {
    return this._JurisdictionSet;
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
  /** set the fields value: ChgWho (PRODUCT_RATE_KEY.chg_who)
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

  /** get the value of the field: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (PRODUCT_RATE_KEY.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (PRODUCT_RATE_KEY.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: ChgDt (PRODUCT_RATE_KEY.chg_dt)
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

  /** get the value of the field: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (PRODUCT_RATE_KEY.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
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

  /** get the value of the field: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return Date the value
   */
  public Date getInactiveDt () {
    return this.InactiveDt;
  }
  /** Change the field to not being actively set: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   */
  public void unsetInactiveDt () {
    this._InactiveDtSet = false;
  }
  /** See if the field is actively set: InactiveDt (PRODUCT_RATE_KEY.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDt () {
    return this._InactiveDtSet;
  }
  /** set the fields value: Cost (PRODUCT_RATE_KEY.cost)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Cost") 
  public void setCost (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Cost", "setCost");
    }
    this.Cost = value;
    this._CostSet = true;
  }

  /** Retrieves the Cost field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Cost field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Cost field
   */
   public String getCostAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCostAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCostAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCost(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Cost");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCostAsFormattedString");
       throw x;
     }
   }
  /** Sets the Cost field from a formatted string
   *
   * @param _value the Cost field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Cost field
   */
   public void setCostFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCostFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCost(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Cost");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCostFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCostFromFormattedString");
   }

  /**
   * Retrieves the Cost field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Cost field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Cost field
   */
  public String getCostAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCostAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCostAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCost(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Cost");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCostAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Cost field value from a formatted currency string
   *
   * @param _value the Cost field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Cost field
   */
  public void setCostFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCostFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCost(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Cost");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCostFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCostFromFormattedCurrencyString");
  }

  /** get the value of the field: Cost (PRODUCT_RATE_KEY.cost)
   * @return BigInteger the value
   */
  public BigInteger getCost () {
    return this.Cost;
  }
  /** Change the field to not being actively set: Cost (PRODUCT_RATE_KEY.cost)
   */
  public void unsetCost () {
    this._CostSet = false;
  }
  /** See if the field is actively set: Cost (PRODUCT_RATE_KEY.cost)
   * @return boolean whether the field is actively set
   */
  public boolean issetCost () {
    return this._CostSet;
  }
  public String toString() {
    return ProductRateKeyObjectHelper.toMap(this, null).toString();
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
  /** PRODUCT_ELEMENTS.rate_jurisdiction field */
    if(!nonNullOnly || (RateJurisdiction != null))  _RateJurisdictionSet = flag;
  /** PRODUCT_ELEMENTS.rate_units field */
    if(!nonNullOnly || (RateUnits != null))  _RateUnitsSet = flag;
  /** PRODUCT_RATE_KEY.origin_location_code field */
    if(!nonNullOnly || (OriginLocationCode != null))  _OriginLocationCodeSet = flag;
  /** PRODUCT_RATE_KEY.target_location_code field */
    if(!nonNullOnly || (TargetLocationCode != null))  _TargetLocationCodeSet = flag;
  /** PRODUCT_RATE_KEY.jurisdiction field */
    if(!nonNullOnly || (Jurisdiction != null))  _JurisdictionSet = flag;
  /** PRODUCT_RATE_KEY.units field */
    if(!nonNullOnly || (Units != null))  _UnitsSet = flag;
  /** PRODUCT_RATE_KEY.units_type field */
    if(!nonNullOnly || (UnitsType != null))  _UnitsTypeSet = flag;
  /** PRODUCT_RATE_KEY.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** PRODUCT_RATE_KEY.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** PRODUCT_RATE_KEY.inactive_dt field */
    if(!nonNullOnly || (InactiveDt != null))  _InactiveDtSet = flag;
  /** PRODUCT_RATE_KEY.cost field */
    if(!nonNullOnly || (Cost != null))  _CostSet = flag;
  }
}
