/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageAmountObjectData.java
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
  
/** BilledUsageAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BilledUsageAmountObjectData extends BaseObjectData implements Serializable
{

  /** AdjustmentEligibleAmount field */
  public    BigInteger AdjustmentEligibleAmount  = null;
  protected boolean _AdjustmentEligibleAmountSet = false;
  /** Discount field */
  public    BigInteger Discount  = null;
  protected boolean _DiscountSet = false;
  /** Tax field */
  public    BigInteger Tax  = null;
  protected boolean _TaxSet = false;
  /** BilledUsageTaxExclusiveAmount field */
  public    BigInteger BilledUsageTaxExclusiveAmount  = null;
  protected boolean _BilledUsageTaxExclusiveAmountSet = false;
  private String _objName = "BilledUsageAmountObjectData";
  /** Default constructor */
  public BilledUsageAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BilledUsageAmountObjectData (BilledUsageAmountObjectData other)
  {

    if (other == null) return;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this._AdjustmentEligibleAmountSet = other._AdjustmentEligibleAmountSet;
    this.Discount = other.Discount;
    this._DiscountSet = other._DiscountSet;
    this.Tax = other.Tax;
    this._TaxSet = other._TaxSet;
    this.BilledUsageTaxExclusiveAmount = other.BilledUsageTaxExclusiveAmount;
    this._BilledUsageTaxExclusiveAmountSet = other._BilledUsageTaxExclusiveAmountSet;
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

  /** set the fields value: BilledUsageTaxExclusiveAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBilledUsageTaxExclusiveAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BilledUsageTaxExclusiveAmount", "setBilledUsageTaxExclusiveAmount");
    }
    this.BilledUsageTaxExclusiveAmount = value;
    this._BilledUsageTaxExclusiveAmountSet = true;
  }
  /** get the value of the field: BilledUsageTaxExclusiveAmount
   * @return BigInteger the value
   */
  public BigInteger getBilledUsageTaxExclusiveAmount ()
  {
    return this.BilledUsageTaxExclusiveAmount;
  }
  /** Change the field to not being actively set: BilledUsageTaxExclusiveAmount
   */
  public void unsetBilledUsageTaxExclusiveAmount ()
  {
    this._BilledUsageTaxExclusiveAmountSet = false;
  }
  /** See if the field is actively set: BilledUsageTaxExclusiveAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetBilledUsageTaxExclusiveAmount ()
  {
    return this._BilledUsageTaxExclusiveAmountSet;
  }

  /** Retrieves the BilledUsageTaxExclusiveAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BilledUsageTaxExclusiveAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BilledUsageTaxExclusiveAmount field
   */
   public String getBilledUsageTaxExclusiveAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageTaxExclusiveAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBilledUsageTaxExclusiveAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBilledUsageTaxExclusiveAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledUsageTaxExclusiveAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBilledUsageTaxExclusiveAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the BilledUsageTaxExclusiveAmount field from a formatted string
   *
   * @param _value the BilledUsageTaxExclusiveAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BilledUsageTaxExclusiveAmount field
   */
   public void setBilledUsageTaxExclusiveAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBilledUsageTaxExclusiveAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBilledUsageTaxExclusiveAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BilledUsageTaxExclusiveAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBilledUsageTaxExclusiveAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBilledUsageTaxExclusiveAmountFromFormattedString");
   }

  public String toString() {
    return BilledUsageAmountObjectHelper.toMap(this, null).toString();
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
    
  /** AdjustmentEligibleAmount field */
    if (!nonNullOnly || (AdjustmentEligibleAmount != null)) _AdjustmentEligibleAmountSet = flag;
  /** Discount field */
    if (!nonNullOnly || (Discount != null)) _DiscountSet = flag;
  /** Tax field */
    if (!nonNullOnly || (Tax != null)) _TaxSet = flag;
  /** BilledUsageTaxExclusiveAmount field */
    if (!nonNullOnly || (BilledUsageTaxExclusiveAmount != null)) _BilledUsageTaxExclusiveAmountSet = flag;
  }
}
