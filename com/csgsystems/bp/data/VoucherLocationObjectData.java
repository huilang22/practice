/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectData.java
 * Definition File: Catalog/VoucherLocation.xml
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
  
/** VoucherLocationObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherLocationObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public VoucherLocationObjectKeyData Key = null;
  /** VOUCHER_LOCATION.location_info field */
  public    String LocationInfo  = null;
  protected boolean _LocationInfoSet = false;
  private String _objName = "VoucherLocationObjectData";
  /** Default constructor */
  public VoucherLocationObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public VoucherLocationObjectData (VoucherLocationObjectData other)
  {

    if (other == null) return;
    this.Key = new VoucherLocationObjectKeyData (other.Key);
    this.LocationInfo = other.LocationInfo;
    this._LocationInfoSet = other._LocationInfoSet;
  }

  /** get the Key for this object
   * @return VoucherLocationObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public VoucherLocationObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (VoucherLocationObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: LocationCode (VOUCHER_LOCATION.location_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLocationCode (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LocationCode", "setLocationCode");
    }
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LocationCode", "setLocationCode");
    }
    if (this.Key == null) this.Key = new VoucherLocationObjectKeyData ();
    this.Key.LocationCode = value;
    this.Key._LocationCodeSet = true;
  }
  /** get the value of the field: LocationCode (VOUCHER_LOCATION.location_code)
   * @return BigInteger the value
   */
  public BigInteger getLocationCode () {
    if (this.Key == null) return null;
    return this.Key.LocationCode;
  }
  /** Change the field to not being actively set: LocationCode (VOUCHER_LOCATION.location_code)
   */
  public void unsetLocationCode () {
    if (this.Key == null) return;
    this.Key._LocationCodeSet = false;
  }
  /** See if the field is actively set: LocationCode (VOUCHER_LOCATION.location_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLocationCode () {
    if (this.Key == null) return false;
    return this.Key._LocationCodeSet;
  }

  /** Retrieves the LocationCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LocationCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationCode field
   */
   public String getLocationCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationCodeAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLocationCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LocationCode field from a formatted string
   *
   * @param _value the LocationCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LocationCode field
   */
   public void setLocationCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLocationCode(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationCodeFromFormattedString");
   }

  /** set the fields value: LocationInfo (VOUCHER_LOCATION.location_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LocationInfo") 
  public void setLocationInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 100))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LocationInfo", "setLocationInfo");
    }
    this.LocationInfo = value;
    this._LocationInfoSet = true;
  }

  /** Retrieves the LocationInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LocationInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LocationInfo field
   */
   public String getLocationInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLocationInfoAsFormattedString");
       return fmtMgr.formatString(this.getLocationInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLocationInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the LocationInfo field from a formatted string
   *
   * @param _value the LocationInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LocationInfo field
   */
   public void setLocationInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLocationInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLocationInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LocationInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLocationInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLocationInfoFromFormattedString");
   }

  /** get the value of the field: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return String the value
   */
  public String getLocationInfo () {
    return this.LocationInfo;
  }
  /** Change the field to not being actively set: LocationInfo (VOUCHER_LOCATION.location_info)
   */
  public void unsetLocationInfo () {
    this._LocationInfoSet = false;
  }
  /** See if the field is actively set: LocationInfo (VOUCHER_LOCATION.location_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetLocationInfo () {
    return this._LocationInfoSet;
  }
  public String toString() {
    return VoucherLocationObjectHelper.toMap(this, null).toString();
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
  /** VOUCHER_LOCATION.location_info field */
    if(!nonNullOnly || (LocationInfo != null))  _LocationInfoSet = flag;
  }
}
