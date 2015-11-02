/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTaxObjectData.java
 * Definition File: Customer/AdjustmentTax.xml
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
  
/** AdjustmentTaxObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AdjustmentTaxObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AdjustmentTaxObjectKeyData Key = null;
  /** ADJ_TAX.tracking_id_counter field */
  public    Integer TrackingIdCounter  = null;
  protected boolean _TrackingIdCounterSet = false;
  /** ADJ_TAX.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** ADJ_TAX.tax_rate field */
  public    Integer TaxRate  = null;
  protected boolean _TaxRateSet = false;
  /** ADJ_TAX.federal_tax field */
  public    BigInteger FederalTax  = null;
  protected boolean _FederalTaxSet = false;
  /** ADJ_TAX.state_tax field */
  public    BigInteger StateTax  = null;
  protected boolean _StateTaxSet = false;
  /** ADJ_TAX.county_tax field */
  public    BigInteger CountyTax  = null;
  protected boolean _CountyTaxSet = false;
  /** ADJ_TAX.city_tax field */
  public    BigInteger CityTax  = null;
  protected boolean _CityTaxSet = false;
  /** ADJ_TAX.other_tax field */
  public    BigInteger OtherTax  = null;
  protected boolean _OtherTaxSet = false;
  /** ADJ_TAX.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** ADJ_TAX.aux_tax_info field */
  public    String AuxTaxInfo  = null;
  protected boolean _AuxTaxInfoSet = false;
  /** ADJ_TAX.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  private String _objName = "AdjustmentTaxObjectData";
  /** Default constructor */
  public AdjustmentTaxObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AdjustmentTaxObjectData (AdjustmentTaxObjectData other)
  {

    if (other == null) return;
    this.Key = new AdjustmentTaxObjectKeyData (other.Key);
    this.TrackingIdCounter = other.TrackingIdCounter;
    this._TrackingIdCounterSet = other._TrackingIdCounterSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.TaxRate = other.TaxRate;
    this._TaxRateSet = other._TaxRateSet;
    this.FederalTax = other.FederalTax;
    this._FederalTaxSet = other._FederalTaxSet;
    this.StateTax = other.StateTax;
    this._StateTaxSet = other._StateTaxSet;
    this.CountyTax = other.CountyTax;
    this._CountyTaxSet = other._CountyTaxSet;
    this.CityTax = other.CityTax;
    this._CityTaxSet = other._CityTaxSet;
    this.OtherTax = other.OtherTax;
    this._OtherTaxSet = other._OtherTaxSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this._AuxTaxInfoSet = other._AuxTaxInfoSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
  }

  /** get the Key for this object
   * @return AdjustmentTaxObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AdjustmentTaxObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AdjustmentTaxObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (ADJ_TAX.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (ADJ_TAX.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (ADJ_TAX.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (ADJ_TAX.tracking_id)
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

  /** set the fields value: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (ADJ_TAX.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (ADJ_TAX.tracking_id_serv)
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

  /** set the fields value: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyData ();
    this.Key.TaxPkgInstId = value;
    this.Key._TaxPkgInstIdSet = true;
  }
  /** get the value of the field: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    if (this.Key == null) return;
    this.Key._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (ADJ_TAX.tax_pkg_inst_id)
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

  /** set the fields value: Geocode (ADJ_TAX.geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGeocode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Geocode", "setGeocode");
    }
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Geocode", "setGeocode");
    }
    if (this.Key == null) this.Key = new AdjustmentTaxObjectKeyData ();
    this.Key.Geocode = value;
    this.Key._GeocodeSet = true;
  }
  /** get the value of the field: Geocode (ADJ_TAX.geocode)
   * @return String the value
   */
  public String getGeocode () {
    if (this.Key == null) return null;
    return this.Key.Geocode;
  }
  /** Change the field to not being actively set: Geocode (ADJ_TAX.geocode)
   */
  public void unsetGeocode () {
    if (this.Key == null) return;
    this.Key._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode (ADJ_TAX.geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode () {
    if (this.Key == null) return false;
    return this.Key._GeocodeSet;
  }

  /** Retrieves the Geocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Geocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Geocode field
   */
   public String getGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the Geocode field from a formatted string
   *
   * @param _value the Geocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Geocode field
   */
   public void setGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFromFormattedString");
   }

  /** set the fields value: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdCounter") 
  public void setTrackingIdCounter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdCounter", "setTrackingIdCounter");
    }
    this.TrackingIdCounter = value;
    this._TrackingIdCounterSet = true;
  }

  /** Retrieves the TrackingIdCounter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdCounter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdCounter field
   */
   public String getTrackingIdCounterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdCounterAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdCounter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdCounterAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdCounter field from a formatted string
   *
   * @param _value the TrackingIdCounter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdCounter field
   */
   public void setTrackingIdCounterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdCounterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdCounter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdCounterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdCounterFromFormattedString");
   }

  /** get the value of the field: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return Integer the value
   */
  public Integer getTrackingIdCounter () {
    return this.TrackingIdCounter;
  }
  /** Change the field to not being actively set: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   */
  public void unsetTrackingIdCounter () {
    this._TrackingIdCounterSet = false;
  }
  /** See if the field is actively set: TrackingIdCounter (ADJ_TAX.tracking_id_counter)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdCounter () {
    return this._TrackingIdCounterSet;
  }
  /** set the fields value: NoBill (ADJ_TAX.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (ADJ_TAX.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (ADJ_TAX.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (ADJ_TAX.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: TaxRate (ADJ_TAX.tax_rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxRate") 
  public void setTaxRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxRate", "setTaxRate");
    }
    this.TaxRate = value;
    this._TaxRateSet = true;
  }

  /** Retrieves the TaxRate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxRate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRate field
   */
   public String getTaxRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxRate field from a formatted string
   *
   * @param _value the TaxRate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRate field
   */
   public void setTaxRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateFromFormattedString");
   }

  /** get the value of the field: TaxRate (ADJ_TAX.tax_rate)
   * @return Integer the value
   */
  public Integer getTaxRate () {
    return this.TaxRate;
  }
  /** Change the field to not being actively set: TaxRate (ADJ_TAX.tax_rate)
   */
  public void unsetTaxRate () {
    this._TaxRateSet = false;
  }
  /** See if the field is actively set: TaxRate (ADJ_TAX.tax_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxRate () {
    return this._TaxRateSet;
  }
  /** set the fields value: FederalTax (ADJ_TAX.federal_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FederalTax") 
  public void setFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FederalTax", "setFederalTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FederalTax", "setFederalTax");
    }
    this.FederalTax = value;
    this._FederalTaxSet = true;
  }

  /** Retrieves the FederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
   public String getFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the FederalTax field from a formatted string
   *
   * @param _value the FederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
   public void setFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedString");
   }

  /**
   * Retrieves the FederalTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
  public String getFederalTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getFederalTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTax field value from a formatted currency string
   *
   * @param _value the FederalTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
  public void setFederalTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFederalTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: FederalTax (ADJ_TAX.federal_tax)
   * @return BigInteger the value
   */
  public BigInteger getFederalTax () {
    return this.FederalTax;
  }
  /** Change the field to not being actively set: FederalTax (ADJ_TAX.federal_tax)
   */
  public void unsetFederalTax () {
    this._FederalTaxSet = false;
  }
  /** See if the field is actively set: FederalTax (ADJ_TAX.federal_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetFederalTax () {
    return this._FederalTaxSet;
  }
  /** set the fields value: StateTax (ADJ_TAX.state_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateTax") 
  public void setStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateTax", "setStateTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateTax", "setStateTax");
    }
    this.StateTax = value;
    this._StateTaxSet = true;
  }

  /** Retrieves the StateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
   public String getStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateTax field from a formatted string
   *
   * @param _value the StateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
   public void setStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedString");
   }

  /**
   * Retrieves the StateTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
  public String getStateTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getStateTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the StateTax field value from a formatted currency string
   *
   * @param _value the StateTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
  public void setStateTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStateTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: StateTax (ADJ_TAX.state_tax)
   * @return BigInteger the value
   */
  public BigInteger getStateTax () {
    return this.StateTax;
  }
  /** Change the field to not being actively set: StateTax (ADJ_TAX.state_tax)
   */
  public void unsetStateTax () {
    this._StateTaxSet = false;
  }
  /** See if the field is actively set: StateTax (ADJ_TAX.state_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTax () {
    return this._StateTaxSet;
  }
  /** set the fields value: CountyTax (ADJ_TAX.county_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyTax") 
  public void setCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountyTax", "setCountyTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CountyTax", "setCountyTax");
    }
    this.CountyTax = value;
    this._CountyTaxSet = true;
  }

  /** Retrieves the CountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
   public String getCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyTax field from a formatted string
   *
   * @param _value the CountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
   public void setCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedString");
   }

  /**
   * Retrieves the CountyTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
  public String getCountyTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCountyTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTax field value from a formatted currency string
   *
   * @param _value the CountyTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
  public void setCountyTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCountyTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CountyTax (ADJ_TAX.county_tax)
   * @return BigInteger the value
   */
  public BigInteger getCountyTax () {
    return this.CountyTax;
  }
  /** Change the field to not being actively set: CountyTax (ADJ_TAX.county_tax)
   */
  public void unsetCountyTax () {
    this._CountyTaxSet = false;
  }
  /** See if the field is actively set: CountyTax (ADJ_TAX.county_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyTax () {
    return this._CountyTaxSet;
  }
  /** set the fields value: CityTax (ADJ_TAX.city_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityTax") 
  public void setCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CityTax", "setCityTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CityTax", "setCityTax");
    }
    this.CityTax = value;
    this._CityTaxSet = true;
  }

  /** Retrieves the CityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
   public String getCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityTax field from a formatted string
   *
   * @param _value the CityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
   public void setCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedString");
   }

  /**
   * Retrieves the CityTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
  public String getCityTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCityTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CityTax field value from a formatted currency string
   *
   * @param _value the CityTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
  public void setCityTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCityTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CityTax (ADJ_TAX.city_tax)
   * @return BigInteger the value
   */
  public BigInteger getCityTax () {
    return this.CityTax;
  }
  /** Change the field to not being actively set: CityTax (ADJ_TAX.city_tax)
   */
  public void unsetCityTax () {
    this._CityTaxSet = false;
  }
  /** See if the field is actively set: CityTax (ADJ_TAX.city_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityTax () {
    return this._CityTaxSet;
  }
  /** set the fields value: OtherTax (ADJ_TAX.other_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OtherTax") 
  public void setOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OtherTax", "setOtherTax");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OtherTax", "setOtherTax");
    }
    this.OtherTax = value;
    this._OtherTaxSet = true;
  }

  /** Retrieves the OtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
   public String getOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the OtherTax field from a formatted string
   *
   * @param _value the OtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
   public void setOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedString");
   }

  /**
   * Retrieves the OtherTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
  public String getOtherTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getOtherTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTax field value from a formatted currency string
   *
   * @param _value the OtherTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
  public void setOtherTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOtherTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: OtherTax (ADJ_TAX.other_tax)
   * @return BigInteger the value
   */
  public BigInteger getOtherTax () {
    return this.OtherTax;
  }
  /** Change the field to not being actively set: OtherTax (ADJ_TAX.other_tax)
   */
  public void unsetOtherTax () {
    this._OtherTaxSet = false;
  }
  /** See if the field is actively set: OtherTax (ADJ_TAX.other_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetOtherTax () {
    return this._OtherTaxSet;
  }
  /** set the fields value: ArchFlag (ADJ_TAX.arch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ArchFlag") 
  public void setArchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ArchFlag", "setArchFlag");
    }
    this.ArchFlag = value;
    this._ArchFlagSet = true;
  }

  /** Retrieves the ArchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ArchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlag field
   */
   public String getArchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getArchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ArchFlag field from a formatted string
   *
   * @param _value the ArchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ArchFlag field
   */
   public void setArchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFromFormattedString");
   }

  /** get the value of the field: ArchFlag (ADJ_TAX.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (ADJ_TAX.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (ADJ_TAX.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AuxTaxInfo") 
  public void setAuxTaxInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AuxTaxInfo", "setAuxTaxInfo");
    }
    this.AuxTaxInfo = value;
    this._AuxTaxInfoSet = true;
  }

  /** Retrieves the AuxTaxInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AuxTaxInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuxTaxInfo field
   */
   public String getAuxTaxInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuxTaxInfoAsFormattedString");
       return fmtMgr.formatString(this.getAuxTaxInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuxTaxInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AuxTaxInfo field from a formatted string
   *
   * @param _value the AuxTaxInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AuxTaxInfo field
   */
   public void setAuxTaxInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAuxTaxInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuxTaxInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuxTaxInfoFromFormattedString");
   }

  /** get the value of the field: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return String the value
   */
  public String getAuxTaxInfo () {
    return this.AuxTaxInfo;
  }
  /** Change the field to not being actively set: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   */
  public void unsetAuxTaxInfo () {
    this._AuxTaxInfoSet = false;
  }
  /** See if the field is actively set: AuxTaxInfo (ADJ_TAX.aux_tax_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetAuxTaxInfo () {
    return this._AuxTaxInfoSet;
  }
  /** set the fields value: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxTypeCode") 
  public void setTaxTypeCode (Integer value) throws ServiceException
  {
    this.TaxTypeCode = value;
    this._TaxTypeCodeSet = true;
  }

  /** Retrieves the TaxTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCode field
   */
   public String getTaxTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxTypeCode field from a formatted string
   *
   * @param _value the TaxTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxTypeCode field
   */
   public void setTaxTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFromFormattedString");
   }

  /** get the value of the field: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (ADJ_TAX.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (ADJ_TAX.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  public String toString() {
    return AdjustmentTaxObjectHelper.toMap(this, null).toString();
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
  /** ADJ_TAX.tracking_id_counter field */
    if(!nonNullOnly || (TrackingIdCounter != null))  _TrackingIdCounterSet = flag;
  /** ADJ_TAX.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** ADJ_TAX.tax_rate field */
    if(!nonNullOnly || (TaxRate != null))  _TaxRateSet = flag;
  /** ADJ_TAX.federal_tax field */
    if(!nonNullOnly || (FederalTax != null))  _FederalTaxSet = flag;
  /** ADJ_TAX.state_tax field */
    if(!nonNullOnly || (StateTax != null))  _StateTaxSet = flag;
  /** ADJ_TAX.county_tax field */
    if(!nonNullOnly || (CountyTax != null))  _CountyTaxSet = flag;
  /** ADJ_TAX.city_tax field */
    if(!nonNullOnly || (CityTax != null))  _CityTaxSet = flag;
  /** ADJ_TAX.other_tax field */
    if(!nonNullOnly || (OtherTax != null))  _OtherTaxSet = flag;
  /** ADJ_TAX.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** ADJ_TAX.aux_tax_info field */
    if(!nonNullOnly || (AuxTaxInfo != null))  _AuxTaxInfoSet = flag;
  /** ADJ_TAX.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  }
}
