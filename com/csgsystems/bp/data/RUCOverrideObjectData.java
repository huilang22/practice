/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCOverrideObjectData.java
 * Definition File: Customer/OverrideUsageCreditRate.xml
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
  
/** RUCOverrideObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class RUCOverrideObjectData extends RUCBaseOverrideObjectData  implements Serializable
{

  /** RATE_UNIT_CR_OVERRIDES.range_origin field */
  public    BigInteger RangeOriginAmount  = null;
  protected boolean _RangeOriginAmountSet = false;
  /** RATE_UNIT_CR_OVERRIDES.range_origin field */
  public    BigInteger RangeOriginUnits  = null;
  protected boolean _RangeOriginUnitsSet = false;
  /** RATE_UNIT_CR_OVERRIDES.range_terminus field */
  public    BigInteger RangeTerminusAmount  = null;
  protected boolean _RangeTerminusAmountSet = false;
  /** RATE_UNIT_CR_OVERRIDES.range_terminus field */
  public    BigInteger RangeTerminusUnits  = null;
  protected boolean _RangeTerminusUnitsSet = false;
  private String _objName = "RUCOverrideObjectData";
  /** Default constructor */
  public RUCOverrideObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public RUCOverrideObjectData (RUCOverrideObjectData other)
  {

    super (other);

    if (other == null) return;
    this.RangeOriginAmount = other.RangeOriginAmount;
    this._RangeOriginAmountSet = other._RangeOriginAmountSet;
    this.RangeOriginUnits = other.RangeOriginUnits;
    this._RangeOriginUnitsSet = other._RangeOriginUnitsSet;
    this.RangeTerminusAmount = other.RangeTerminusAmount;
    this._RangeTerminusAmountSet = other._RangeTerminusAmountSet;
    this.RangeTerminusUnits = other.RangeTerminusUnits;
    this._RangeTerminusUnitsSet = other._RangeTerminusUnitsSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public RUCOverrideObjectData (RUCBaseOverrideObjectData other)
  {
    super (other);

  }

  /** set the fields value: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeOriginAmount") 
  public void setRangeOriginAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RangeOriginAmount", "setRangeOriginAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeOriginAmount", "setRangeOriginAmount");
    }
    this.RangeOriginAmount = value;
    this._RangeOriginAmountSet = true;
  }

  /** Retrieves the RangeOriginAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeOriginAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginAmount field
   */
   public String getRangeOriginAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeOriginAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOriginAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeOriginAmount field from a formatted string
   *
   * @param _value the RangeOriginAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeOriginAmount field
   */
   public void setRangeOriginAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeOriginAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOriginAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginAmountFromFormattedString");
   }

  /** get the value of the field: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return BigInteger the value
   */
  public BigInteger getRangeOriginAmount () {
    return this.RangeOriginAmount;
  }
  /** Change the field to not being actively set: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   */
  public void unsetRangeOriginAmount () {
    this._RangeOriginAmountSet = false;
  }
  /** See if the field is actively set: RangeOriginAmount (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeOriginAmount () {
    return this._RangeOriginAmountSet;
  }
  /** set the fields value: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeOriginUnits") 
  public void setRangeOriginUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RangeOriginUnits", "setRangeOriginUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeOriginUnits", "setRangeOriginUnits");
    }
    this.RangeOriginUnits = value;
    this._RangeOriginUnitsSet = true;
  }

  /** Retrieves the RangeOriginUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeOriginUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeOriginUnits field
   */
   public String getRangeOriginUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeOriginUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeOriginUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOriginUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeOriginUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeOriginUnits field from a formatted string
   *
   * @param _value the RangeOriginUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeOriginUnits field
   */
   public void setRangeOriginUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeOriginUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeOriginUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeOriginUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeOriginUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeOriginUnitsFromFormattedString");
   }

  /** get the value of the field: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return BigInteger the value
   */
  public BigInteger getRangeOriginUnits () {
    return this.RangeOriginUnits;
  }
  /** Change the field to not being actively set: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   */
  public void unsetRangeOriginUnits () {
    this._RangeOriginUnitsSet = false;
  }
  /** See if the field is actively set: RangeOriginUnits (RATE_UNIT_CR_OVERRIDES.range_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeOriginUnits () {
    return this._RangeOriginUnitsSet;
  }
  /** set the fields value: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeTerminusAmount") 
  public void setRangeTerminusAmount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeTerminusAmount", "setRangeTerminusAmount");
    }
    this.RangeTerminusAmount = value;
    this._RangeTerminusAmountSet = true;
  }

  /** Retrieves the RangeTerminusAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeTerminusAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminusAmount field
   */
   public String getRangeTerminusAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeTerminusAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminusAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeTerminusAmount field from a formatted string
   *
   * @param _value the RangeTerminusAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeTerminusAmount field
   */
   public void setRangeTerminusAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeTerminusAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminusAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusAmountFromFormattedString");
   }

  /** get the value of the field: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return BigInteger the value
   */
  public BigInteger getRangeTerminusAmount () {
    return this.RangeTerminusAmount;
  }
  /** Change the field to not being actively set: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   */
  public void unsetRangeTerminusAmount () {
    this._RangeTerminusAmountSet = false;
  }
  /** See if the field is actively set: RangeTerminusAmount (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeTerminusAmount () {
    return this._RangeTerminusAmountSet;
  }
  /** set the fields value: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RangeTerminusUnits") 
  public void setRangeTerminusUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RangeTerminusUnits", "setRangeTerminusUnits");
    }
    this.RangeTerminusUnits = value;
    this._RangeTerminusUnitsSet = true;
  }

  /** Retrieves the RangeTerminusUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RangeTerminusUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RangeTerminusUnits field
   */
   public String getRangeTerminusUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRangeTerminusUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRangeTerminusUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminusUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRangeTerminusUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the RangeTerminusUnits field from a formatted string
   *
   * @param _value the RangeTerminusUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RangeTerminusUnits field
   */
   public void setRangeTerminusUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRangeTerminusUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRangeTerminusUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RangeTerminusUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRangeTerminusUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRangeTerminusUnitsFromFormattedString");
   }

  /** get the value of the field: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return BigInteger the value
   */
  public BigInteger getRangeTerminusUnits () {
    return this.RangeTerminusUnits;
  }
  /** Change the field to not being actively set: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   */
  public void unsetRangeTerminusUnits () {
    this._RangeTerminusUnitsSet = false;
  }
  /** See if the field is actively set: RangeTerminusUnits (RATE_UNIT_CR_OVERRIDES.range_terminus)
   * @return boolean whether the field is actively set
   */
  public boolean issetRangeTerminusUnits () {
    return this._RangeTerminusUnitsSet;
  }
  public String toString() {
    return RUCOverrideObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** RATE_UNIT_CR_OVERRIDES.range_origin field */
    if(!nonNullOnly || (RangeOriginAmount != null))  _RangeOriginAmountSet = flag;
  /** RATE_UNIT_CR_OVERRIDES.range_origin field */
    if(!nonNullOnly || (RangeOriginUnits != null))  _RangeOriginUnitsSet = flag;
  /** RATE_UNIT_CR_OVERRIDES.range_terminus field */
    if(!nonNullOnly || (RangeTerminusAmount != null))  _RangeTerminusAmountSet = flag;
  /** RATE_UNIT_CR_OVERRIDES.range_terminus field */
    if(!nonNullOnly || (RangeTerminusUnits != null))  _RangeTerminusUnitsSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
