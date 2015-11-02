/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageAmountObjectData.java
 * Definition File: Customer/UnbilledUsage.xml
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
  
/** UnbilledUsageAmountObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class UnbilledUsageAmountObjectData extends BaseObjectData implements Serializable
{

  /** AdjustmentEligibleAmount field */
  public    BigInteger AdjustmentEligibleAmount  = null;
  protected boolean _AdjustmentEligibleAmountSet = false;
  /** Tax field */
  public    BigInteger Tax  = null;
  protected boolean _TaxSet = false;
  /** UnbilledUsageTaxExclusiveAmount field */
  public    BigInteger UnbilledUsageTaxExclusiveAmount  = null;
  protected boolean _UnbilledUsageTaxExclusiveAmountSet = false;
  /** AmountCredited field */
  public    BigInteger AmountCredited  = null;
  protected boolean _AmountCreditedSet = false;
  /** UnitsCredited field */
  public    BigInteger UnitsCredited  = null;
  protected boolean _UnitsCreditedSet = false;
  private String _objName = "UnbilledUsageAmountObjectData";
  /** Default constructor */
  public UnbilledUsageAmountObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public UnbilledUsageAmountObjectData (UnbilledUsageAmountObjectData other)
  {

    if (other == null) return;
    this.AdjustmentEligibleAmount = other.AdjustmentEligibleAmount;
    this._AdjustmentEligibleAmountSet = other._AdjustmentEligibleAmountSet;
    this.Tax = other.Tax;
    this._TaxSet = other._TaxSet;
    this.UnbilledUsageTaxExclusiveAmount = other.UnbilledUsageTaxExclusiveAmount;
    this._UnbilledUsageTaxExclusiveAmountSet = other._UnbilledUsageTaxExclusiveAmountSet;
    this.AmountCredited = other.AmountCredited;
    this._AmountCreditedSet = other._AmountCreditedSet;
    this.UnitsCredited = other.UnitsCredited;
    this._UnitsCreditedSet = other._UnitsCreditedSet;
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

  /** set the fields value: UnbilledUsageTaxExclusiveAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUnbilledUsageTaxExclusiveAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnbilledUsageTaxExclusiveAmount", "setUnbilledUsageTaxExclusiveAmount");
    }
    this.UnbilledUsageTaxExclusiveAmount = value;
    this._UnbilledUsageTaxExclusiveAmountSet = true;
  }
  /** get the value of the field: UnbilledUsageTaxExclusiveAmount
   * @return BigInteger the value
   */
  public BigInteger getUnbilledUsageTaxExclusiveAmount ()
  {
    return this.UnbilledUsageTaxExclusiveAmount;
  }
  /** Change the field to not being actively set: UnbilledUsageTaxExclusiveAmount
   */
  public void unsetUnbilledUsageTaxExclusiveAmount ()
  {
    this._UnbilledUsageTaxExclusiveAmountSet = false;
  }
  /** See if the field is actively set: UnbilledUsageTaxExclusiveAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetUnbilledUsageTaxExclusiveAmount ()
  {
    return this._UnbilledUsageTaxExclusiveAmountSet;
  }

  /** Retrieves the UnbilledUsageTaxExclusiveAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnbilledUsageTaxExclusiveAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnbilledUsageTaxExclusiveAmount field
   */
   public String getUnbilledUsageTaxExclusiveAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageTaxExclusiveAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnbilledUsageTaxExclusiveAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnbilledUsageTaxExclusiveAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnbilledUsageTaxExclusiveAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnbilledUsageTaxExclusiveAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnbilledUsageTaxExclusiveAmount field from a formatted string
   *
   * @param _value the UnbilledUsageTaxExclusiveAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnbilledUsageTaxExclusiveAmount field
   */
   public void setUnbilledUsageTaxExclusiveAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnbilledUsageTaxExclusiveAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnbilledUsageTaxExclusiveAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnbilledUsageTaxExclusiveAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnbilledUsageTaxExclusiveAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnbilledUsageTaxExclusiveAmountFromFormattedString");
   }

  /** set the fields value: AmountCredited
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAmountCredited (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountCredited", "setAmountCredited");
    }
    this.AmountCredited = value;
    this._AmountCreditedSet = true;
  }
  /** get the value of the field: AmountCredited
   * @return BigInteger the value
   */
  public BigInteger getAmountCredited ()
  {
    return this.AmountCredited;
  }
  /** Change the field to not being actively set: AmountCredited
   */
  public void unsetAmountCredited ()
  {
    this._AmountCreditedSet = false;
  }
  /** See if the field is actively set: AmountCredited
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountCredited ()
  {
    return this._AmountCreditedSet;
  }

  /** Retrieves the AmountCredited field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountCredited field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountCredited field
   */
   public String getAmountCreditedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountCreditedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountCreditedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountCredited(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountCreditedAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountCredited field from a formatted string
   *
   * @param _value the AmountCredited field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountCredited field
   */
   public void setAmountCreditedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountCreditedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountCredited(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountCreditedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountCreditedFromFormattedString");
   }

  /** set the fields value: UnitsCredited
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUnitsCredited (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsCredited", "setUnitsCredited");
    }
    this.UnitsCredited = value;
    this._UnitsCreditedSet = true;
  }
  /** get the value of the field: UnitsCredited
   * @return BigInteger the value
   */
  public BigInteger getUnitsCredited ()
  {
    return this.UnitsCredited;
  }
  /** Change the field to not being actively set: UnitsCredited
   */
  public void unsetUnitsCredited ()
  {
    this._UnitsCreditedSet = false;
  }
  /** See if the field is actively set: UnitsCredited
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsCredited ()
  {
    return this._UnitsCreditedSet;
  }

  /** Retrieves the UnitsCredited field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsCredited field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsCredited field
   */
   public String getUnitsCreditedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCreditedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCreditedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnitsCredited(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCreditedAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsCredited field from a formatted string
   *
   * @param _value the UnitsCredited field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsCredited field
   */
   public void setUnitsCreditedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCreditedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsCredited(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCreditedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsCreditedFromFormattedString");
   }

  public String toString() {
    return UnbilledUsageAmountObjectHelper.toMap(this, null).toString();
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
  /** Tax field */
    if (!nonNullOnly || (Tax != null)) _TaxSet = flag;
  /** UnbilledUsageTaxExclusiveAmount field */
    if (!nonNullOnly || (UnbilledUsageTaxExclusiveAmount != null)) _UnbilledUsageTaxExclusiveAmountSet = flag;
  /** AmountCredited field */
    if (!nonNullOnly || (AmountCredited != null)) _AmountCreditedSet = flag;
  /** UnitsCredited field */
    if (!nonNullOnly || (UnitsCredited != null)) _UnitsCreditedSet = flag;
  }
}
