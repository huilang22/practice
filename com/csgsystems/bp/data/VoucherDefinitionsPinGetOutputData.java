/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsPinGetOutputData.java
 * Definition File: Catalog/VoucherDefinitions.xml
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class VoucherDefinitionsPinGetOutputData implements ArubaObjectData, Serializable
{
  /** PinCode1 field */
  public    String PinCode1  = null;
  protected boolean _PinCode1Set = false;
  /** PinCode2 field */
  public    String PinCode2  = null;
  protected boolean _PinCode2Set = false;
  private String _objName = "VoucherDefinitionsPinGetOutputData";
  /** default constructor */
  public VoucherDefinitionsPinGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public VoucherDefinitionsPinGetOutputData (VoucherDefinitionsPinGetOutputData other)
  {
    if (other == null) return;
    this.PinCode1 = other.PinCode1;
    this._PinCode1Set = other._PinCode1Set;
    this.PinCode2 = other.PinCode2;
    this._PinCode2Set = other._PinCode2Set;
  }
  /** set the fields value: PinCode1
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPinCode1 (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PinCode1", "setPinCode1");
    }
    this.PinCode1 = value;
    this._PinCode1Set = true;
  }
  /** get the value of the field: PinCode1
   * @return String the value
   */
  public String getPinCode1 ()
  {
    return this.PinCode1;
  }
  /** Change the field to not being actively set: PinCode1
   */
  public void unsetPinCode1 ()
  {
    this._PinCode1Set = false;
  }
  /** See if the field is actively set: PinCode1
   * @return boolean whether the field is actively set
   */
  public boolean issetPinCode1 ()
  {
    return this._PinCode1Set;
  }

  /** Retrieves the PinCode1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PinCode1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode1 field
   */
   public String getPinCode1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode1AsFormattedString");
       return fmtMgr.formatString(this.getPinCode1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode1AsFormattedString");
       throw x;
     }
   }
  /** Sets the PinCode1 field from a formatted string
   *
   * @param _value the PinCode1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PinCode1 field
   */
   public void setPinCode1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPinCode1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode1FromFormattedString");
   }

  /** set the fields value: PinCode2
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPinCode2 (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PinCode2", "setPinCode2");
    }
    this.PinCode2 = value;
    this._PinCode2Set = true;
  }
  /** get the value of the field: PinCode2
   * @return String the value
   */
  public String getPinCode2 ()
  {
    return this.PinCode2;
  }
  /** Change the field to not being actively set: PinCode2
   */
  public void unsetPinCode2 ()
  {
    this._PinCode2Set = false;
  }
  /** See if the field is actively set: PinCode2
   * @return boolean whether the field is actively set
   */
  public boolean issetPinCode2 ()
  {
    return this._PinCode2Set;
  }

  /** Retrieves the PinCode2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PinCode2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PinCode2 field
   */
   public String getPinCode2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPinCode2AsFormattedString");
       return fmtMgr.formatString(this.getPinCode2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPinCode2AsFormattedString");
       throw x;
     }
   }
  /** Sets the PinCode2 field from a formatted string
   *
   * @param _value the PinCode2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PinCode2 field
   */
   public void setPinCode2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPinCode2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPinCode2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PinCode2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPinCode2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPinCode2FromFormattedString");
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
    
  /** PinCode1 field */
    if (!nonNullOnly || (PinCode1 != null)) _PinCode1Set = flag;
  /** PinCode2 field */
    if (!nonNullOnly || (PinCode2 != null)) _PinCode2Set = flag;
  }
}
