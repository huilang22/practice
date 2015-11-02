/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeComponentsObjectData.java
 * Definition File: Admin/Geocode.xml
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
  
/** GeocodeComponentsObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class GeocodeComponentsObjectData extends BaseObjectData implements Serializable
{

  /** CityCode field */
  public    Integer CityCode  = null;
  protected boolean _CityCodeSet = false;
  /** CountyCode field */
  public    Integer CountyCode  = null;
  protected boolean _CountyCodeSet = false;
  /** StateCode field */
  public    Integer StateCode  = null;
  protected boolean _StateCodeSet = false;
  /** Geocode field */
  public    String Geocode  = null;
  protected boolean _GeocodeSet = false;
  /** County field */
  public    String County  = null;
  protected boolean _CountySet = false;
  private String _objName = "GeocodeComponentsObjectData";
  /** Default constructor */
  public GeocodeComponentsObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public GeocodeComponentsObjectData (GeocodeComponentsObjectData other)
  {

    if (other == null) return;
    this.CityCode = other.CityCode;
    this._CityCodeSet = other._CityCodeSet;
    this.CountyCode = other.CountyCode;
    this._CountyCodeSet = other._CountyCodeSet;
    this.StateCode = other.StateCode;
    this._StateCodeSet = other._StateCodeSet;
    this.Geocode = other.Geocode;
    this._GeocodeSet = other._GeocodeSet;
    this.County = other.County;
    this._CountySet = other._CountySet;
  }

  /** set the fields value: CityCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCityCode (Integer value) throws ServiceException
  {
    this.CityCode = value;
    this._CityCodeSet = true;
  }
  /** get the value of the field: CityCode
   * @return Integer the value
   */
  public Integer getCityCode ()
  {
    return this.CityCode;
  }
  /** Change the field to not being actively set: CityCode
   */
  public void unsetCityCode ()
  {
    this._CityCodeSet = false;
  }
  /** See if the field is actively set: CityCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCityCode ()
  {
    return this._CityCodeSet;
  }

  /** Retrieves the CityCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityCode field
   */
   public String getCityCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCityCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityCode field from a formatted string
   *
   * @param _value the CityCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityCode field
   */
   public void setCityCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityCodeFromFormattedString");
   }

  /** set the fields value: CountyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCountyCode (Integer value) throws ServiceException
  {
    this.CountyCode = value;
    this._CountyCodeSet = true;
  }
  /** get the value of the field: CountyCode
   * @return Integer the value
   */
  public Integer getCountyCode ()
  {
    return this.CountyCode;
  }
  /** Change the field to not being actively set: CountyCode
   */
  public void unsetCountyCode ()
  {
    this._CountyCodeSet = false;
  }
  /** See if the field is actively set: CountyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyCode ()
  {
    return this._CountyCodeSet;
  }

  /** Retrieves the CountyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyCode field
   */
   public String getCountyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyCode field from a formatted string
   *
   * @param _value the CountyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyCode field
   */
   public void setCountyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyCodeFromFormattedString");
   }

  /** set the fields value: StateCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStateCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateCode", "setStateCode");
    }
    this.StateCode = value;
    this._StateCodeSet = true;
  }
  /** get the value of the field: StateCode
   * @return Integer the value
   */
  public Integer getStateCode ()
  {
    return this.StateCode;
  }
  /** Change the field to not being actively set: StateCode
   */
  public void unsetStateCode ()
  {
    this._StateCodeSet = false;
  }
  /** See if the field is actively set: StateCode
   * @return boolean whether the field is actively set
   */
  public boolean issetStateCode ()
  {
    return this._StateCodeSet;
  }

  /** Retrieves the StateCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateCode field
   */
   public String getStateCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getStateCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateCode field from a formatted string
   *
   * @param _value the StateCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateCode field
   */
   public void setStateCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateCodeFromFormattedString");
   }

  /** set the fields value: Geocode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setGeocode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Geocode", "setGeocode");
    }
    this.Geocode = value;
    this._GeocodeSet = true;
  }
  /** get the value of the field: Geocode
   * @return String the value
   */
  public String getGeocode ()
  {
    return this.Geocode;
  }
  /** Change the field to not being actively set: Geocode
   */
  public void unsetGeocode ()
  {
    this._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode ()
  {
    return this._GeocodeSet;
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

  /** set the fields value: County
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCounty (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "County", "setCounty");
    }
    this.County = value;
    this._CountySet = true;
  }
  /** get the value of the field: County
   * @return String the value
   */
  public String getCounty ()
  {
    return this.County;
  }
  /** Change the field to not being actively set: County
   */
  public void unsetCounty ()
  {
    this._CountySet = false;
  }
  /** See if the field is actively set: County
   * @return boolean whether the field is actively set
   */
  public boolean issetCounty ()
  {
    return this._CountySet;
  }

  /** Retrieves the County field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The County field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the County field
   */
   public String getCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyAsFormattedString");
       return fmtMgr.formatString(this.getCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("County");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the County field from a formatted string
   *
   * @param _value the County field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the County field
   */
   public void setCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("County");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyFromFormattedString");
   }

  public String toString() {
    return GeocodeComponentsObjectHelper.toMap(this, null).toString();
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
    
  /** CityCode field */
    if (!nonNullOnly || (CityCode != null)) _CityCodeSet = flag;
  /** CountyCode field */
    if (!nonNullOnly || (CountyCode != null)) _CountyCodeSet = flag;
  /** StateCode field */
    if (!nonNullOnly || (StateCode != null)) _StateCodeSet = flag;
  /** Geocode field */
    if (!nonNullOnly || (Geocode != null)) _GeocodeSet = flag;
  /** County field */
    if (!nonNullOnly || (County != null)) _CountySet = flag;
  }
}
