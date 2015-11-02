/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeAddressObjectData.java
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
  
/** GeocodeAddressObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class GeocodeAddressObjectData extends BaseObjectData implements Serializable
{

  /** City field */
  public    String City  = null;
  protected boolean _CitySet = false;
  /** CountryCode field */
  public    Integer CountryCode  = null;
  protected boolean _CountryCodeSet = false;
  /** FranchiseCode field */
  public    Integer FranchiseCode  = null;
  protected boolean _FranchiseCodeSet = false;
  /** State field */
  public    String State  = null;
  protected boolean _StateSet = false;
  /** Zip field */
  public    String Zip  = null;
  protected boolean _ZipSet = false;
  private String _objName = "GeocodeAddressObjectData";
  /** Default constructor */
  public GeocodeAddressObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public GeocodeAddressObjectData (GeocodeAddressObjectData other)
  {

    if (other == null) return;
    this.City = other.City;
    this._CitySet = other._CitySet;
    this.CountryCode = other.CountryCode;
    this._CountryCodeSet = other._CountryCodeSet;
    this.FranchiseCode = other.FranchiseCode;
    this._FranchiseCodeSet = other._FranchiseCodeSet;
    this.State = other.State;
    this._StateSet = other._StateSet;
    this.Zip = other.Zip;
    this._ZipSet = other._ZipSet;
  }

  /** set the fields value: City
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCity (String value) throws ServiceException
  {
    this.City = value;
    this._CitySet = true;
  }
  /** get the value of the field: City
   * @return String the value
   */
  public String getCity ()
  {
    return this.City;
  }
  /** Change the field to not being actively set: City
   */
  public void unsetCity ()
  {
    this._CitySet = false;
  }
  /** See if the field is actively set: City
   * @return boolean whether the field is actively set
   */
  public boolean issetCity ()
  {
    return this._CitySet;
  }

  /** Retrieves the City field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The City field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the City field
   */
   public String getCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityAsFormattedString");
       return fmtMgr.formatString(this.getCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("City");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the City field from a formatted string
   *
   * @param _value the City field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the City field
   */
   public void setCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("City");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityFromFormattedString");
   }

  /** set the fields value: CountryCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCountryCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountryCode", "setCountryCode");
    }
    this.CountryCode = value;
    this._CountryCodeSet = true;
  }
  /** get the value of the field: CountryCode
   * @return Integer the value
   */
  public Integer getCountryCode ()
  {
    return this.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode
   */
  public void unsetCountryCode ()
  {
    this._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode ()
  {
    return this._CountryCodeSet;
  }

  /** Retrieves the CountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCode field
   */
   public String getCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCode field from a formatted string
   *
   * @param _value the CountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCode field
   */
   public void setCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeFromFormattedString");
   }

  /** set the fields value: FranchiseCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setFranchiseCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FranchiseCode", "setFranchiseCode");
    }
    this.FranchiseCode = value;
    this._FranchiseCodeSet = true;
  }
  /** get the value of the field: FranchiseCode
   * @return Integer the value
   */
  public Integer getFranchiseCode ()
  {
    return this.FranchiseCode;
  }
  /** Change the field to not being actively set: FranchiseCode
   */
  public void unsetFranchiseCode ()
  {
    this._FranchiseCodeSet = false;
  }
  /** See if the field is actively set: FranchiseCode
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseCode ()
  {
    return this._FranchiseCodeSet;
  }

  /** Retrieves the FranchiseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FranchiseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCode field
   */
   public String getFranchiseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFranchiseCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FranchiseCode field from a formatted string
   *
   * @param _value the FranchiseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FranchiseCode field
   */
   public void setFranchiseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFranchiseCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFromFormattedString");
   }

  /** set the fields value: State
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setState (String value) throws ServiceException
  {
    this.State = value;
    this._StateSet = true;
  }
  /** get the value of the field: State
   * @return String the value
   */
  public String getState ()
  {
    return this.State;
  }
  /** Change the field to not being actively set: State
   */
  public void unsetState ()
  {
    this._StateSet = false;
  }
  /** See if the field is actively set: State
   * @return boolean whether the field is actively set
   */
  public boolean issetState ()
  {
    return this._StateSet;
  }

  /** Retrieves the State field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The State field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the State field
   */
   public String getStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateAsFormattedString");
       return fmtMgr.formatString(this.getState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("State");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the State field from a formatted string
   *
   * @param _value the State field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the State field
   */
   public void setStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("State");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFromFormattedString");
   }

  /** set the fields value: Zip
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setZip (String value) throws ServiceException
  {
    this.Zip = value;
    this._ZipSet = true;
  }
  /** get the value of the field: Zip
   * @return String the value
   */
  public String getZip ()
  {
    return this.Zip;
  }
  /** Change the field to not being actively set: Zip
   */
  public void unsetZip ()
  {
    this._ZipSet = false;
  }
  /** See if the field is actively set: Zip
   * @return boolean whether the field is actively set
   */
  public boolean issetZip ()
  {
    return this._ZipSet;
  }

  /** Retrieves the Zip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Zip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Zip field
   */
   public String getZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZipAsFormattedString");
       return fmtMgr.formatString(this.getZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Zip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the Zip field from a formatted string
   *
   * @param _value the Zip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Zip field
   */
   public void setZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Zip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZipFromFormattedString");
   }

  public String toString() {
    return GeocodeAddressObjectHelper.toMap(this, null).toString();
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
    
  /** City field */
    if (!nonNullOnly || (City != null)) _CitySet = flag;
  /** CountryCode field */
    if (!nonNullOnly || (CountryCode != null)) _CountryCodeSet = flag;
  /** FranchiseCode field */
    if (!nonNullOnly || (FranchiseCode != null)) _FranchiseCodeSet = flag;
  /** State field */
    if (!nonNullOnly || (State != null)) _StateSet = flag;
  /** Zip field */
    if (!nonNullOnly || (Zip != null)) _ZipSet = flag;
  }
}
