/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InterimBillPollHotOutputData.java
 * Definition File: Customer/InterimBill.xml
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
public class InterimBillPollHotOutputData implements ArubaObjectData, Serializable
{
  /** PollHotInvoice object */
  public InterimBillObjectData PollHotInvoice = null;

  /** RequestStatus field */
  public    Integer RequestStatus  = null;
  protected boolean _RequestStatusSet = false;
  private String _objName = "InterimBillPollHotOutputData";
  /** default constructor */
  public InterimBillPollHotOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InterimBillPollHotOutputData (InterimBillPollHotOutputData other)
  {
    if (other == null) return;
    if (other.PollHotInvoice != null)
    {
      this.PollHotInvoice = new InterimBillObjectData (other.PollHotInvoice);
    }

    this.RequestStatus = other.RequestStatus;
    this._RequestStatusSet = other._RequestStatusSet;
  }
  /** get the object for InterimBillObject
   * @return InterimBillData the object
   */
  public InterimBillObjectData getInterimBill ()
  {
    return this.PollHotInvoice;
  }
  /** set the object for InterimBill
   * @param value the new object
   */
  public void setInterimBill (InterimBillObjectData value)
  {
    this.PollHotInvoice = value;
  }
  /** set the fields value: RequestStatus
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRequestStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RequestStatus", "setRequestStatus");
    }
    this.RequestStatus = value;
    this._RequestStatusSet = true;
  }
  /** get the value of the field: RequestStatus
   * @return Integer the value
   */
  public Integer getRequestStatus ()
  {
    return this.RequestStatus;
  }
  /** Change the field to not being actively set: RequestStatus
   */
  public void unsetRequestStatus ()
  {
    this._RequestStatusSet = false;
  }
  /** See if the field is actively set: RequestStatus
   * @return boolean whether the field is actively set
   */
  public boolean issetRequestStatus ()
  {
    return this._RequestStatusSet;
  }

  /** Retrieves the RequestStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RequestStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestStatus field
   */
   public String getRequestStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getRequestStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the RequestStatus field from a formatted string
   *
   * @param _value the RequestStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RequestStatus field
   */
   public void setRequestStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRequestStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestStatusFromFormattedString");
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
    
  /** PollHotInvoice object */
  
      if (PollHotInvoice != null) PollHotInvoice.resetFlags(flag, nonNullOnly);
    
  /** RequestStatus field */
    if (!nonNullOnly || (RequestStatus != null)) _RequestStatusSet = flag;
  }
}
