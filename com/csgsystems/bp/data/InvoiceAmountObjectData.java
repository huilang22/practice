/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceAmountObjectData.java
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
  
/** InvoiceAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceAmountObjectData extends BaseObjectData implements Serializable
{

  /** TaxTotal field */
  public    BigInteger TaxTotal  = null;
  protected boolean _TaxTotalSet = false;
  /** DiscountTotal field */
  public    BigInteger DiscountTotal  = null;
  protected boolean _DiscountTotalSet = false;
  /** AdjustmentEligibleAmount field */
  public    BigInteger AdjustmentEligibleAmount  = null;
  protected boolean _AdjustmentEligibleAmountSet = false;
  /** SubTotalNewCharges field */
  public    BigInteger SubTotalNewCharges  = null;
  protected boolean _SubTotalNewChargesSet = false;
  private String _objName = "InvoiceAmountObjectData";
  /** Default constructor */
  public InvoiceAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceAmountObjectData (InvoiceAmountObjectData other)
  {

    if (other == null) return;
    this.TaxTotal = other.TaxTotal;
    this._TaxTotalSet = other._TaxTotalSet;
    this.DiscountTotal = other.DiscountTotal;
    this._DiscountTotalSet = other._DiscountTotalSet;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this._AdjustmentEligibleAmountSet = other._AdjustmentEligibleAmountSet;
    this.SubTotalNewCharges = other.SubTotalNewCharges;
    this._SubTotalNewChargesSet = other._SubTotalNewChargesSet;
  }

  /** set the fields value: TaxTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTaxTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxTotal", "setTaxTotal");
    }
    this.TaxTotal = value;
    this._TaxTotalSet = true;
  }
  /** get the value of the field: TaxTotal
   * @return BigInteger the value
   */
  public BigInteger getTaxTotal ()
  {
    return this.TaxTotal;
  }
  /** Change the field to not being actively set: TaxTotal
   */
  public void unsetTaxTotal ()
  {
    this._TaxTotalSet = false;
  }
  /** See if the field is actively set: TaxTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTotal ()
  {
    return this._TaxTotalSet;
  }

  /** Retrieves the TaxTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTotal field
   */
   public String getTaxTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTaxTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxTotal field from a formatted string
   *
   * @param _value the TaxTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxTotal field
   */
   public void setTaxTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTotalFromFormattedString");
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

  /** set the fields value: AdjustmentEligibleAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAdjustmentEligibleAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjustmentEligibleAmount", "setAdjustmentEligibleAmount");
    }
    this.AdjustmentEligibleAmount = value;
    this._AdjustmentEligibleAmountSet = true;
  }
  /** get the value of the field: AdjustmentEligibleAmount
   * @return BigInteger the value
   */
  public BigInteger getAdjustmentEligibleAmount ()
  {
    return this.AdjustmentEligibleAmount;
  }
  /** Change the field to not being actively set: AdjustmentEligibleAmount
   */
  public void unsetAdjustmentEligibleAmount ()
  {
    this._AdjustmentEligibleAmountSet = false;
  }
  /** See if the field is actively set: AdjustmentEligibleAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjustmentEligibleAmount ()
  {
    return this._AdjustmentEligibleAmountSet;
  }

  /** Retrieves the AdjustmentEligibleAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjustmentEligibleAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjustmentEligibleAmount field
   */
   public String getAdjustmentEligibleAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentEligibleAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjustmentEligibleAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAdjustmentEligibleAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjustmentEligibleAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjustmentEligibleAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjustmentEligibleAmount field from a formatted string
   *
   * @param _value the AdjustmentEligibleAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjustmentEligibleAmount field
   */
   public void setAdjustmentEligibleAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjustmentEligibleAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjustmentEligibleAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjustmentEligibleAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjustmentEligibleAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjustmentEligibleAmountFromFormattedString");
   }

  /** set the fields value: SubTotalNewCharges
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSubTotalNewCharges (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SubTotalNewCharges", "setSubTotalNewCharges");
    }
    this.SubTotalNewCharges = value;
    this._SubTotalNewChargesSet = true;
  }
  /** get the value of the field: SubTotalNewCharges
   * @return BigInteger the value
   */
  public BigInteger getSubTotalNewCharges ()
  {
    return this.SubTotalNewCharges;
  }
  /** Change the field to not being actively set: SubTotalNewCharges
   */
  public void unsetSubTotalNewCharges ()
  {
    this._SubTotalNewChargesSet = false;
  }
  /** See if the field is actively set: SubTotalNewCharges
   * @return boolean whether the field is actively set
   */
  public boolean issetSubTotalNewCharges ()
  {
    return this._SubTotalNewChargesSet;
  }

  /** Retrieves the SubTotalNewCharges field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SubTotalNewCharges field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubTotalNewCharges field
   */
   public String getSubTotalNewChargesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubTotalNewChargesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubTotalNewChargesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSubTotalNewCharges(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubTotalNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubTotalNewChargesAsFormattedString");
       throw x;
     }
   }
  /** Sets the SubTotalNewCharges field from a formatted string
   *
   * @param _value the SubTotalNewCharges field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SubTotalNewCharges field
   */
   public void setSubTotalNewChargesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubTotalNewChargesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSubTotalNewCharges(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SubTotalNewCharges");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubTotalNewChargesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubTotalNewChargesFromFormattedString");
   }

  public String toString() {
    return InvoiceAmountObjectHelper.toMap(this, null).toString();
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
    
  /** TaxTotal field */
    if (!nonNullOnly || (TaxTotal != null)) _TaxTotalSet = flag;
  /** DiscountTotal field */
    if (!nonNullOnly || (DiscountTotal != null)) _DiscountTotalSet = flag;
  /** AdjustmentEligibleAmount field */
    if (!nonNullOnly || (AdjustmentEligibleAmount != null)) _AdjustmentEligibleAmountSet = flag;
  /** SubTotalNewCharges field */
    if (!nonNullOnly || (SubTotalNewCharges != null)) _SubTotalNewChargesSet = flag;
  }
}
