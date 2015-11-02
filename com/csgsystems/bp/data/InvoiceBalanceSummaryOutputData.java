/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceBalanceSummaryOutputData.java
 * Definition File: Customer/Invoice.xml
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
public class InvoiceBalanceSummaryOutputData implements ArubaObjectData, Serializable
{
  /** over_payment object */
  public BalanceSummaryObjectData over_payment = null;

  /** AmountInCollections field */
  public    BigInteger AmountInCollections  = null;
  protected boolean _AmountInCollectionsSet = false;
  private String _objName = "InvoiceBalanceSummaryOutputData";
  /** default constructor */
  public InvoiceBalanceSummaryOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public InvoiceBalanceSummaryOutputData (InvoiceBalanceSummaryOutputData other)
  {
    if (other == null) return;
    if (other.over_payment != null)
    {
      this.over_payment = new BalanceSummaryObjectData (other.over_payment);
    }

    this.AmountInCollections = other.AmountInCollections;
    this._AmountInCollectionsSet = other._AmountInCollectionsSet;
  }
  /** get the object for BalanceSummaryObject
   * @return OverPaymentData the object
   */
  public BalanceSummaryObjectData getOverPayment ()
  {
    return this.over_payment;
  }
  /** set the object for OverPayment
   * @param value the new object
   */
  public void setOverPayment (BalanceSummaryObjectData value)
  {
    this.over_payment = value;
  }
  /** set the fields value: AmountInCollections
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAmountInCollections (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountInCollections", "setAmountInCollections");
    }
    this.AmountInCollections = value;
    this._AmountInCollectionsSet = true;
  }
  /** get the value of the field: AmountInCollections
   * @return BigInteger the value
   */
  public BigInteger getAmountInCollections ()
  {
    return this.AmountInCollections;
  }
  /** Change the field to not being actively set: AmountInCollections
   */
  public void unsetAmountInCollections ()
  {
    this._AmountInCollectionsSet = false;
  }
  /** See if the field is actively set: AmountInCollections
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountInCollections ()
  {
    return this._AmountInCollectionsSet;
  }

  /** Retrieves the AmountInCollections field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountInCollections field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountInCollections field
   */
   public String getAmountInCollectionsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountInCollectionsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountInCollectionsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountInCollections(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountInCollections");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountInCollectionsAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountInCollections field from a formatted string
   *
   * @param _value the AmountInCollections field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountInCollections field
   */
   public void setAmountInCollectionsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountInCollectionsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountInCollections(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountInCollections");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountInCollectionsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountInCollectionsFromFormattedString");
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
    
  /** over_payment object */
  
      if (over_payment != null) over_payment.resetFlags(flag, nonNullOnly);
    
  /** AmountInCollections field */
    if (!nonNullOnly || (AmountInCollections != null)) _AmountInCollectionsSet = flag;
  }
}
