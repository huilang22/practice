/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceDetailAmountObjectData.java
 * Definition File: Customer/InvoiceDetail.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** BillInvoiceDetailAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BillInvoiceDetailAmountObjectData extends BaseObjectData implements Serializable
{

  /** DiscountTotal field */
  public    BigInteger DiscountTotal  = null;
  protected boolean _DiscountTotalSet = false;
  /** TotalTax field */
  public    BigInteger TotalTax  = null;
  protected boolean _TotalTaxSet = false;
  /** UntaxesUndiscountedNewCharges field */
  public    BigInteger UntaxesUndiscountedNewCharges  = null;
  protected boolean _UntaxesUndiscountedNewChargesSet = false;
  private String _objName = "BillInvoiceDetailAmountObjectData";
  /** Default constructor */
  public BillInvoiceDetailAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BillInvoiceDetailAmountObjectData (BillInvoiceDetailAmountObjectData other)
  {

    if (other == null) return;
    this.DiscountTotal = other.DiscountTotal;
    this._DiscountTotalSet = other._DiscountTotalSet;
    this.TotalTax = other.TotalTax;
    this._TotalTaxSet = other._TotalTaxSet;
    this.UntaxesUndiscountedNewCharges = other.UntaxesUndiscountedNewCharges;
    this._UntaxesUndiscountedNewChargesSet = other._UntaxesUndiscountedNewChargesSet;
  }

  /** set the fields value: DiscountTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDiscountTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DiscountTotal", "setDiscountTotal");
    }
    this.DiscountTotal = value;
    this._DiscountTotalSet = true;
  }
  /** get the value of the field: DiscountTotal
   * @return BigInteger the value
   */
  public BigInteger getDiscountTotal ()
  {
    return this.DiscountTotal;
  }
  /** Change the field to not being actively set: DiscountTotal
   */
  public void unsetDiscountTotal ()
  {
    this._DiscountTotalSet = false;
  }
  /** See if the field is actively set: DiscountTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountTotal ()
  {
    return this._DiscountTotalSet;
  }

  /** Retrieves the DiscountTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountTotal field
   */
   public String getDiscountTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscountTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountTotal field from a formatted string
   *
   * @param _value the DiscountTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountTotal field
   */
   public void setDiscountTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountTotalFromFormattedString");
   }

  /** set the fields value: TotalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTotalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TotalTax", "setTotalTax");
    }
    this.TotalTax = value;
    this._TotalTaxSet = true;
  }
  /** get the value of the field: TotalTax
   * @return BigInteger the value
   */
  public BigInteger getTotalTax ()
  {
    return this.TotalTax;
  }
  /** Change the field to not being actively set: TotalTax
   */
  public void unsetTotalTax ()
  {
    this._TotalTaxSet = false;
  }
  /** See if the field is actively set: TotalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalTax ()
  {
    return this._TotalTaxSet;
  }

  /** Retrieves the TotalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalTax field
   */
   public String getTotalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalTax field from a formatted string
   *
   * @param _value the TotalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalTax field
   */
   public void setTotalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalTaxFromFormattedString");
   }

  /** set the fields value: UntaxesUndiscountedNewCharges
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUntaxesUndiscountedNewCharges (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UntaxesUndiscountedNewCharges", "setUntaxesUndiscountedNewCharges");
    }
    this.UntaxesUndiscountedNewCharges = value;
    this._UntaxesUndiscountedNewChargesSet = true;
  }
  /** get the value of the field: UntaxesUndiscountedNewCharges
   * @return BigInteger the value
   */
  public BigInteger getUntaxesUndiscountedNewCharges ()
  {
    return this.UntaxesUndiscountedNewCharges;
  }
  /** Change the field to not being actively set: UntaxesUndiscountedNewCharges
   */
  public void unsetUntaxesUndiscountedNewCharges ()
  {
    this._UntaxesUndiscountedNewChargesSet = false;
  }
  /** See if the field is actively set: UntaxesUndiscountedNewCharges
   * @return boolean whether the field is actively set
   */
  public boolean issetUntaxesUndiscountedNewCharges ()
  {
    return this._UntaxesUndiscountedNewChargesSet;
  }

  /** Retrieves the UntaxesUndiscountedNewCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UntaxesUndiscountedNewCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UntaxesUndiscountedNewCharges field
   */
   public String getUntaxesUndiscountedNewChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUntaxesUndiscountedNewChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUntaxesUndiscountedNewChargesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUntaxesUndiscountedNewCharges(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UntaxesUndiscountedNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUntaxesUndiscountedNewChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the UntaxesUndiscountedNewCharges field from a formatted string
   *
   * @param _value the UntaxesUndiscountedNewCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UntaxesUndiscountedNewCharges field
   */
   public void setUntaxesUndiscountedNewChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUntaxesUndiscountedNewChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUntaxesUndiscountedNewCharges(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UntaxesUndiscountedNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUntaxesUndiscountedNewChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUntaxesUndiscountedNewChargesFromFormattedString");
   }

  public String toString() {
    return BillInvoiceDetailAmountObjectHelper.toMap(this, null).toString();
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
    
  /** DiscountTotal field */
    if (!nonNullOnly || (DiscountTotal != null)) _DiscountTotalSet = flag;
  /** TotalTax field */
    if (!nonNullOnly || (TotalTax != null)) _TotalTaxSet = flag;
  /** UntaxesUndiscountedNewCharges field */
    if (!nonNullOnly || (UntaxesUndiscountedNewCharges != null)) _UntaxesUndiscountedNewChargesSet = flag;
  }
}
