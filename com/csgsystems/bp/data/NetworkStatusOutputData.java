/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetworkStatusOutputData.java
 * Definition File: Customer/Account.xml
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
public class NetworkStatusOutputData implements ArubaObjectData, Serializable
{
  /** Status field */
  public    Integer Status  = null;
  protected boolean _StatusSet = false;
  /** ReasonCode field */
  public    Integer ReasonCode  = null;
  protected boolean _ReasonCodeSet = false;
  private String _objName = "NetworkStatusOutputData";
  /** default constructor */
  public NetworkStatusOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public NetworkStatusOutputData (NetworkStatusOutputData other)
  {
    if (other == null) return;
    this.Status = other.Status;
    this._StatusSet = other._StatusSet;
    this.ReasonCode = other.ReasonCode;
    this._ReasonCodeSet = other._ReasonCodeSet;
  }
  /** set the fields value: Status
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Status", "setStatus");
    }
    this.Status = value;
    this._StatusSet = true;
  }
  /** get the value of the field: Status
   * @return Integer the value
   */
  public Integer getStatus ()
  {
    return this.Status;
  }
  /** Change the field to not being actively set: Status
   */
  public void unsetStatus ()
  {
    this._StatusSet = false;
  }
  /** See if the field is actively set: Status
   * @return boolean whether the field is actively set
   */
  public boolean issetStatus ()
  {
    return this._StatusSet;
  }

  /** Retrieves the Status field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Status field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Status field
   */
   public String getStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the Status field from a formatted string
   *
   * @param _value the Status field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Status field
   */
   public void setStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Status");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFromFormattedString");
   }

  /** set the fields value: ReasonCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setReasonCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ReasonCode", "setReasonCode");
    }
    this.ReasonCode = value;
    this._ReasonCodeSet = true;
  }
  /** get the value of the field: ReasonCode
   * @return Integer the value
   */
  public Integer getReasonCode ()
  {
    return this.ReasonCode;
  }
  /** Change the field to not being actively set: ReasonCode
   */
  public void unsetReasonCode ()
  {
    this._ReasonCodeSet = false;
  }
  /** See if the field is actively set: ReasonCode
   * @return boolean whether the field is actively set
   */
  public boolean issetReasonCode ()
  {
    return this._ReasonCodeSet;
  }

  /** Retrieves the ReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReasonCode field
   */
   public String getReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReasonCode field from a formatted string
   *
   * @param _value the ReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReasonCode field
   */
   public void setReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReasonCodeFromFormattedString");
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
    
  /** Status field */
    if (!nonNullOnly || (Status != null)) _StatusSet = flag;
  /** ReasonCode field */
    if (!nonNullOnly || (ReasonCode != null)) _ReasonCodeSet = flag;
  }
}
