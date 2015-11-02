/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ReverseBulkAdjustmentGetOutputData.java
 * Definition File: Catalog/ReverseBulkAdjustment.xml
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
import com.csgsystems.bat.data.*;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ReverseBulkAdjustmentGetOutputData implements ArubaObjectData, Serializable
{
  /** __BatchRequest object */
  public BatchRequestObjectData __BatchRequest = null;

  /** ReasonCode field */
  public    Integer ReasonCode  = null;
  protected boolean _ReasonCodeSet = false;
  /** OriginalRequestId field */
  public    BigInteger OriginalRequestId  = null;
  protected boolean _OriginalRequestIdSet = false;
  private String _objName = "ReverseBulkAdjustmentGetOutputData";
  /** default constructor */
  public ReverseBulkAdjustmentGetOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public ReverseBulkAdjustmentGetOutputData (ReverseBulkAdjustmentGetOutputData other)
  {
    if (other == null) return;
    if (other.__BatchRequest != null)
    {
      this.__BatchRequest = new BatchRequestObjectData (other.__BatchRequest);
    }

    this.ReasonCode = other.ReasonCode;
    this._ReasonCodeSet = other._ReasonCodeSet;
    this.OriginalRequestId = other.OriginalRequestId;
    this._OriginalRequestIdSet = other._OriginalRequestIdSet;
  }
  /** get the object for BatchRequestObject
   * @return BatchRequestData the object
   */
  public BatchRequestObjectData getBatchRequest ()
  {
    return this.__BatchRequest;
  }
  /** set the object for BatchRequest
   * @param value the new object
   */
  public void setBatchRequest (BatchRequestObjectData value)
  {
    this.__BatchRequest = value;
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

  /** set the fields value: OriginalRequestId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setOriginalRequestId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OriginalRequestId", "setOriginalRequestId");
    }
    this.OriginalRequestId = value;
    this._OriginalRequestIdSet = true;
  }
  /** get the value of the field: OriginalRequestId
   * @return BigInteger the value
   */
  public BigInteger getOriginalRequestId ()
  {
    return this.OriginalRequestId;
  }
  /** Change the field to not being actively set: OriginalRequestId
   */
  public void unsetOriginalRequestId ()
  {
    this._OriginalRequestIdSet = false;
  }
  /** See if the field is actively set: OriginalRequestId
   * @return boolean whether the field is actively set
   */
  public boolean issetOriginalRequestId ()
  {
    return this._OriginalRequestIdSet;
  }

  /** Retrieves the OriginalRequestId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OriginalRequestId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginalRequestId field
   */
   public String getOriginalRequestIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginalRequestIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginalRequestIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOriginalRequestId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginalRequestId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginalRequestIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OriginalRequestId field from a formatted string
   *
   * @param _value the OriginalRequestId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OriginalRequestId field
   */
   public void setOriginalRequestIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginalRequestIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOriginalRequestId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginalRequestId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginalRequestIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginalRequestIdFromFormattedString");
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
    
  /** __BatchRequest object */
  
      if (__BatchRequest != null) __BatchRequest.resetFlags(flag, nonNullOnly);
    
  /** ReasonCode field */
    if (!nonNullOnly || (ReasonCode != null)) _ReasonCodeSet = flag;
  /** OriginalRequestId field */
    if (!nonNullOnly || (OriginalRequestId != null)) _OriginalRequestIdSet = flag;
  }
}
