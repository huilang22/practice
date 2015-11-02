/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CRBOObjectData.java
 * Definition File: Admin/CorridorRateBandOverride.xml
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
  
/** CRBOObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CRBOObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CRBOObjectKeyData Key = null;
  /** RATE_USAGE_BANDS_OVERRIDES.unit_rate field */
  public    Integer UnitRate  = null;
  protected boolean _UnitRateSet = false;
  /** RATE_USAGE_BANDS_OVERRIDES.num_units field */
  public    BigInteger NumUnits  = null;
  protected boolean _NumUnitsSet = false;
  /** RATE_USAGE_BANDS_OVERRIDES.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "CRBOObjectData";
  /** Default constructor */
  public CRBOObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CRBOObjectData (CRBOObjectData other)
  {

    if (other == null) return;
    this.Key = new CRBOObjectKeyData (other.Key);
    this.UnitRate = other.UnitRate;
    this._UnitRateSet = other._UnitRateSet;
    this.NumUnits = other.NumUnits;
    this._NumUnitsSet = other._NumUnitsSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return CRBOObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CRBOObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CRBOObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSeqnum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Seqnum", "setSeqnum");
    }
    if (this.Key == null) this.Key = new CRBOObjectKeyData ();
    this.Key.Seqnum = value;
    this.Key._SeqnumSet = true;
  }
  /** get the value of the field: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   * @return Integer the value
   */
  public Integer getSeqnum () {
    if (this.Key == null) return null;
    return this.Key.Seqnum;
  }
  /** Change the field to not being actively set: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
   */
  public void unsetSeqnum () {
    if (this.Key == null) return;
    this.Key._SeqnumSet = false;
  }
  /** See if the field is actively set: Seqnum (RATE_USAGE_BANDS_OVERRIDES.seqnum)
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

  /** set the fields value: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRateband (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Rateband", "setRateband");
    }
    if (this.Key == null) this.Key = new CRBOObjectKeyData ();
    this.Key.Rateband = value;
    this.Key._RatebandSet = true;
  }
  /** get the value of the field: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return Integer the value
   */
  public Integer getRateband () {
    if (this.Key == null) return null;
    return this.Key.Rateband;
  }
  /** Change the field to not being actively set: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   */
  public void unsetRateband () {
    if (this.Key == null) return;
    this.Key._RatebandSet = false;
  }
  /** See if the field is actively set: Rateband (RATE_USAGE_BANDS_OVERRIDES.rateband)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateband () {
    if (this.Key == null) return false;
    return this.Key._RatebandSet;
  }

  /** Retrieves the Rateband field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Rateband field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Rateband field
   */
   public String getRatebandAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatebandAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatebandAsFormattedString");
       return fmtMgr.formatNumber(this.getRateband(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Rateband");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatebandAsFormattedString");
       throw x;
     }
   }
  /** Sets the Rateband field from a formatted string
   *
   * @param _value the Rateband field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Rateband field
   */
   public void setRatebandFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatebandFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateband(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Rateband");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatebandFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatebandFromFormattedString");
   }

  /** set the fields value: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitRate") 
  public void setUnitRate (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitRate", "setUnitRate");
    }
    this.UnitRate = value;
    this._UnitRateSet = true;
  }

  /** Retrieves the UnitRate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitRate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitRate field
   */
   public String getUnitRateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitRateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitRateAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitRate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitRateAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitRate field from a formatted string
   *
   * @param _value the UnitRate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitRate field
   */
   public void setUnitRateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitRateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitRate(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitRate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitRateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitRateFromFormattedString");
   }

  /** get the value of the field: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return Integer the value
   */
  public Integer getUnitRate () {
    return this.UnitRate;
  }
  /** Change the field to not being actively set: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   */
  public void unsetUnitRate () {
    this._UnitRateSet = false;
  }
  /** See if the field is actively set: UnitRate (RATE_USAGE_BANDS_OVERRIDES.unit_rate)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitRate () {
    return this._UnitRateSet;
  }
  /** set the fields value: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NumUnits") 
  public void setNumUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NumUnits", "setNumUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NumUnits", "setNumUnits");
    }
    this.NumUnits = value;
    this._NumUnitsSet = true;
  }

  /** Retrieves the NumUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NumUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumUnits field
   */
   public String getNumUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNumUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the NumUnits field from a formatted string
   *
   * @param _value the NumUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NumUnits field
   */
   public void setNumUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNumUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumUnitsFromFormattedString");
   }

  /** get the value of the field: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return BigInteger the value
   */
  public BigInteger getNumUnits () {
    return this.NumUnits;
  }
  /** Change the field to not being actively set: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   */
  public void unsetNumUnits () {
    this._NumUnitsSet = false;
  }
  /** See if the field is actively set: NumUnits (RATE_USAGE_BANDS_OVERRIDES.num_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetNumUnits () {
    return this._NumUnitsSet;
  }
  /** set the fields value: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
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

  /** get the value of the field: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (RATE_USAGE_BANDS_OVERRIDES.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return CRBOObjectHelper.toMap(this, null).toString();
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
  /** RATE_USAGE_BANDS_OVERRIDES.unit_rate field */
    if(!nonNullOnly || (UnitRate != null))  _UnitRateSet = flag;
  /** RATE_USAGE_BANDS_OVERRIDES.num_units field */
    if(!nonNullOnly || (NumUnits != null))  _NumUnitsSet = flag;
  /** RATE_USAGE_BANDS_OVERRIDES.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
