/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAndDiscountAmountObjectData.java
 * Definition File: Customer/BilledUsage.xml
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
  
/** TaxAndDiscountAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TaxAndDiscountAmountObjectData extends BaseObjectData implements Serializable
{

  /** Discount field */
  public    BigInteger Discount  = null;
  protected boolean _DiscountSet = false;
  /** Tax field */
  public    BigInteger Tax  = null;
  protected boolean _TaxSet = false;
  private String _objName = "TaxAndDiscountAmountObjectData";
  /** Default constructor */
  public TaxAndDiscountAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TaxAndDiscountAmountObjectData (TaxAndDiscountAmountObjectData other)
  {

    if (other == null) return;
    this.Discount = other.Discount;
    this._DiscountSet = other._DiscountSet;
    this.Tax = other.Tax;
    this._TaxSet = other._TaxSet;
  }

  /** set the fields value: Discount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Discount", "setDiscount");
    }
    this.Discount = value;
    this._DiscountSet = true;
  }
  /** get the value of the field: Discount
   * @return BigInteger the value
   */
  public BigInteger getDiscount ()
  {
    return this.Discount;
  }
  /** Change the field to not being actively set: Discount
   */
  public void unsetDiscount ()
  {
    this._DiscountSet = false;
  }
  /** See if the field is actively set: Discount
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscount ()
  {
    return this._DiscountSet;
  }

  /** Retrieves the Discount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Discount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Discount field
   */
   public String getDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Discount field from a formatted string
   *
   * @param _value the Discount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Discount field
   */
   public void setDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFromFormattedString");
   }

  /** set the fields value: Tax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Tax", "setTax");
    }
    this.Tax = value;
    this._TaxSet = true;
  }
  /** get the value of the field: Tax
   * @return BigInteger the value
   */
  public BigInteger getTax ()
  {
    return this.Tax;
  }
  /** Change the field to not being actively set: Tax
   */
  public void unsetTax ()
  {
    this._TaxSet = false;
  }
  /** See if the field is actively set: Tax
   * @return boolean whether the field is actively set
   */
  public boolean issetTax ()
  {
    return this._TaxSet;
  }

  /** Retrieves the Tax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Tax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Tax field
   */
   public String getTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Tax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the Tax field from a formatted string
   *
   * @param _value the Tax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Tax field
   */
   public void setTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Tax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFromFormattedString");
   }

  public String toString() {
    return TaxAndDiscountAmountObjectHelper.toMap(this, null).toString();
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
    
  /** Discount field */
    if (!nonNullOnly || (Discount != null)) _DiscountSet = flag;
  /** Tax field */
    if (!nonNullOnly || (Tax != null)) _TaxSet = flag;
  }
}
