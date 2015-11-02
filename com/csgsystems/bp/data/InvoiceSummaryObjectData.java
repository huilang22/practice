/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceSummaryObjectData.java
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
  
/** InvoiceSummaryObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InvoiceSummaryObjectData extends BaseObjectData implements Serializable
{

  /** UsageTotal field */
  public    BigInteger UsageTotal  = null;
  protected boolean _UsageTotalSet = false;
  /** UsageNumber field */
  public    Integer UsageNumber  = null;
  protected boolean _UsageNumberSet = false;
  /** RcTotal field */
  public    BigInteger RcTotal  = null;
  protected boolean _RcTotalSet = false;
  /** RcNumber field */
  public    Integer RcNumber  = null;
  protected boolean _RcNumberSet = false;
  /** NrcTotal field */
  public    BigInteger NrcTotal  = null;
  protected boolean _NrcTotalSet = false;
  /** NrcNumber field */
  public    Integer NrcNumber  = null;
  protected boolean _NrcNumberSet = false;
  /** AdjNumber field */
  public    Integer AdjNumber  = null;
  protected boolean _AdjNumberSet = false;
  /** PaymentNumber field */
  public    Integer PaymentNumber  = null;
  protected boolean _PaymentNumberSet = false;
  /** TaxTotal field */
  public    BigInteger TaxTotal  = null;
  protected boolean _TaxTotalSet = false;
  /** PostPaymentNumber field */
  public    Integer PostPaymentNumber  = null;
  protected boolean _PostPaymentNumberSet = false;
  /** PostPaymentTotal field */
  public    BigInteger PostPaymentTotal  = null;
  protected boolean _PostPaymentTotalSet = false;
  /** PrevBalanceDue field */
  public    BigInteger PrevBalanceDue  = null;
  protected boolean _PrevBalanceDueSet = false;
  private String _objName = "InvoiceSummaryObjectData";
  /** Default constructor */
  public InvoiceSummaryObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InvoiceSummaryObjectData (InvoiceSummaryObjectData other)
  {

    if (other == null) return;
    this.UsageTotal = other.UsageTotal;
    this._UsageTotalSet = other._UsageTotalSet;
    this.UsageNumber = other.UsageNumber;
    this._UsageNumberSet = other._UsageNumberSet;
    this.RcTotal = other.RcTotal;
    this._RcTotalSet = other._RcTotalSet;
    this.RcNumber = other.RcNumber;
    this._RcNumberSet = other._RcNumberSet;
    this.NrcTotal = other.NrcTotal;
    this._NrcTotalSet = other._NrcTotalSet;
    this.NrcNumber = other.NrcNumber;
    this._NrcNumberSet = other._NrcNumberSet;
    this.AdjNumber = other.AdjNumber;
    this._AdjNumberSet = other._AdjNumberSet;
    this.PaymentNumber = other.PaymentNumber;
    this._PaymentNumberSet = other._PaymentNumberSet;
    this.TaxTotal = other.TaxTotal;
    this._TaxTotalSet = other._TaxTotalSet;
    this.PostPaymentNumber = other.PostPaymentNumber;
    this._PostPaymentNumberSet = other._PostPaymentNumberSet;
    this.PostPaymentTotal = other.PostPaymentTotal;
    this._PostPaymentTotalSet = other._PostPaymentTotalSet;
    this.PrevBalanceDue = other.PrevBalanceDue;
    this._PrevBalanceDueSet = other._PrevBalanceDueSet;
  }

  /** set the fields value: UsageTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUsageTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsageTotal", "setUsageTotal");
    }
    this.UsageTotal = value;
    this._UsageTotalSet = true;
  }
  /** get the value of the field: UsageTotal
   * @return BigInteger the value
   */
  public BigInteger getUsageTotal ()
  {
    return this.UsageTotal;
  }
  /** Change the field to not being actively set: UsageTotal
   */
  public void unsetUsageTotal ()
  {
    this._UsageTotalSet = false;
  }
  /** See if the field is actively set: UsageTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetUsageTotal ()
  {
    return this._UsageTotalSet;
  }

  /** Retrieves the UsageTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsageTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsageTotal field
   */
   public String getUsageTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUsageTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsageTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsageTotal field from a formatted string
   *
   * @param _value the UsageTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsageTotal field
   */
   public void setUsageTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsageTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsageTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsageTotalFromFormattedString");
   }

  /** set the fields value: UsageNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUsageNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsageNumber", "setUsageNumber");
    }
    this.UsageNumber = value;
    this._UsageNumberSet = true;
  }
  /** get the value of the field: UsageNumber
   * @return Integer the value
   */
  public Integer getUsageNumber ()
  {
    return this.UsageNumber;
  }
  /** Change the field to not being actively set: UsageNumber
   */
  public void unsetUsageNumber ()
  {
    this._UsageNumberSet = false;
  }
  /** See if the field is actively set: UsageNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetUsageNumber ()
  {
    return this._UsageNumberSet;
  }

  /** Retrieves the UsageNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsageNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsageNumber field
   */
   public String getUsageNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsageNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getUsageNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsageNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsageNumber field from a formatted string
   *
   * @param _value the UsageNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsageNumber field
   */
   public void setUsageNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsageNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsageNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsageNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsageNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsageNumberFromFormattedString");
   }

  /** set the fields value: RcTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRcTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RcTotal", "setRcTotal");
    }
    this.RcTotal = value;
    this._RcTotalSet = true;
  }
  /** get the value of the field: RcTotal
   * @return BigInteger the value
   */
  public BigInteger getRcTotal ()
  {
    return this.RcTotal;
  }
  /** Change the field to not being actively set: RcTotal
   */
  public void unsetRcTotal ()
  {
    this._RcTotalSet = false;
  }
  /** See if the field is actively set: RcTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetRcTotal ()
  {
    return this._RcTotalSet;
  }

  /** Retrieves the RcTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RcTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RcTotal field
   */
   public String getRcTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRcTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRcTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRcTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RcTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRcTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the RcTotal field from a formatted string
   *
   * @param _value the RcTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RcTotal field
   */
   public void setRcTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRcTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRcTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RcTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRcTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRcTotalFromFormattedString");
   }

  /** set the fields value: RcNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setRcNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RcNumber", "setRcNumber");
    }
    this.RcNumber = value;
    this._RcNumberSet = true;
  }
  /** get the value of the field: RcNumber
   * @return Integer the value
   */
  public Integer getRcNumber ()
  {
    return this.RcNumber;
  }
  /** Change the field to not being actively set: RcNumber
   */
  public void unsetRcNumber ()
  {
    this._RcNumberSet = false;
  }
  /** See if the field is actively set: RcNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetRcNumber ()
  {
    return this._RcNumberSet;
  }

  /** Retrieves the RcNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RcNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RcNumber field
   */
   public String getRcNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRcNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRcNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getRcNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RcNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRcNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the RcNumber field from a formatted string
   *
   * @param _value the RcNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RcNumber field
   */
   public void setRcNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRcNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRcNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RcNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRcNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRcNumberFromFormattedString");
   }

  /** set the fields value: NrcTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setNrcTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NrcTotal", "setNrcTotal");
    }
    this.NrcTotal = value;
    this._NrcTotalSet = true;
  }
  /** get the value of the field: NrcTotal
   * @return BigInteger the value
   */
  public BigInteger getNrcTotal ()
  {
    return this.NrcTotal;
  }
  /** Change the field to not being actively set: NrcTotal
   */
  public void unsetNrcTotal ()
  {
    this._NrcTotalSet = false;
  }
  /** See if the field is actively set: NrcTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetNrcTotal ()
  {
    return this._NrcTotalSet;
  }

  /** Retrieves the NrcTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NrcTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NrcTotal field
   */
   public String getNrcTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNrcTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNrcTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getNrcTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NrcTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNrcTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the NrcTotal field from a formatted string
   *
   * @param _value the NrcTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NrcTotal field
   */
   public void setNrcTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNrcTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNrcTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NrcTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNrcTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNrcTotalFromFormattedString");
   }

  /** set the fields value: NrcNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setNrcNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NrcNumber", "setNrcNumber");
    }
    this.NrcNumber = value;
    this._NrcNumberSet = true;
  }
  /** get the value of the field: NrcNumber
   * @return Integer the value
   */
  public Integer getNrcNumber ()
  {
    return this.NrcNumber;
  }
  /** Change the field to not being actively set: NrcNumber
   */
  public void unsetNrcNumber ()
  {
    this._NrcNumberSet = false;
  }
  /** See if the field is actively set: NrcNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetNrcNumber ()
  {
    return this._NrcNumberSet;
  }

  /** Retrieves the NrcNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NrcNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NrcNumber field
   */
   public String getNrcNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNrcNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNrcNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getNrcNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NrcNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNrcNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the NrcNumber field from a formatted string
   *
   * @param _value the NrcNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NrcNumber field
   */
   public void setNrcNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNrcNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNrcNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NrcNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNrcNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNrcNumberFromFormattedString");
   }

  /** set the fields value: AdjNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAdjNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjNumber", "setAdjNumber");
    }
    this.AdjNumber = value;
    this._AdjNumberSet = true;
  }
  /** get the value of the field: AdjNumber
   * @return Integer the value
   */
  public Integer getAdjNumber ()
  {
    return this.AdjNumber;
  }
  /** Change the field to not being actively set: AdjNumber
   */
  public void unsetAdjNumber ()
  {
    this._AdjNumberSet = false;
  }
  /** See if the field is actively set: AdjNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjNumber ()
  {
    return this._AdjNumberSet;
  }

  /** Retrieves the AdjNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjNumber field
   */
   public String getAdjNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjNumber field from a formatted string
   *
   * @param _value the AdjNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjNumber field
   */
   public void setAdjNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjNumberFromFormattedString");
   }

  /** set the fields value: PaymentNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPaymentNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentNumber", "setPaymentNumber");
    }
    this.PaymentNumber = value;
    this._PaymentNumberSet = true;
  }
  /** get the value of the field: PaymentNumber
   * @return Integer the value
   */
  public Integer getPaymentNumber ()
  {
    return this.PaymentNumber;
  }
  /** Change the field to not being actively set: PaymentNumber
   */
  public void unsetPaymentNumber ()
  {
    this._PaymentNumberSet = false;
  }
  /** See if the field is actively set: PaymentNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentNumber ()
  {
    return this._PaymentNumberSet;
  }

  /** Retrieves the PaymentNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentNumber field
   */
   public String getPaymentNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getPaymentNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentNumber field from a formatted string
   *
   * @param _value the PaymentNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentNumber field
   */
   public void setPaymentNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentNumberFromFormattedString");
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

  /** set the fields value: PostPaymentNumber
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostPaymentNumber (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostPaymentNumber", "setPostPaymentNumber");
    }
    this.PostPaymentNumber = value;
    this._PostPaymentNumberSet = true;
  }
  /** get the value of the field: PostPaymentNumber
   * @return Integer the value
   */
  public Integer getPostPaymentNumber ()
  {
    return this.PostPaymentNumber;
  }
  /** Change the field to not being actively set: PostPaymentNumber
   */
  public void unsetPostPaymentNumber ()
  {
    this._PostPaymentNumberSet = false;
  }
  /** See if the field is actively set: PostPaymentNumber
   * @return boolean whether the field is actively set
   */
  public boolean issetPostPaymentNumber ()
  {
    return this._PostPaymentNumberSet;
  }

  /** Retrieves the PostPaymentNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostPaymentNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostPaymentNumber field
   */
   public String getPostPaymentNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostPaymentNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostPaymentNumberAsFormattedString");
       return fmtMgr.formatNumber(this.getPostPaymentNumber(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostPaymentNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostPaymentNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostPaymentNumber field from a formatted string
   *
   * @param _value the PostPaymentNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostPaymentNumber field
   */
   public void setPostPaymentNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostPaymentNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostPaymentNumber(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostPaymentNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostPaymentNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostPaymentNumberFromFormattedString");
   }

  /** set the fields value: PostPaymentTotal
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPostPaymentTotal (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostPaymentTotal", "setPostPaymentTotal");
    }
    this.PostPaymentTotal = value;
    this._PostPaymentTotalSet = true;
  }
  /** get the value of the field: PostPaymentTotal
   * @return BigInteger the value
   */
  public BigInteger getPostPaymentTotal ()
  {
    return this.PostPaymentTotal;
  }
  /** Change the field to not being actively set: PostPaymentTotal
   */
  public void unsetPostPaymentTotal ()
  {
    this._PostPaymentTotalSet = false;
  }
  /** See if the field is actively set: PostPaymentTotal
   * @return boolean whether the field is actively set
   */
  public boolean issetPostPaymentTotal ()
  {
    return this._PostPaymentTotalSet;
  }

  /** Retrieves the PostPaymentTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostPaymentTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostPaymentTotal field
   */
   public String getPostPaymentTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostPaymentTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostPaymentTotalAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPostPaymentTotal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostPaymentTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostPaymentTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostPaymentTotal field from a formatted string
   *
   * @param _value the PostPaymentTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostPaymentTotal field
   */
   public void setPostPaymentTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostPaymentTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostPaymentTotal(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostPaymentTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostPaymentTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostPaymentTotalFromFormattedString");
   }

  /** set the fields value: PrevBalanceDue
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrevBalanceDue (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrevBalanceDue", "setPrevBalanceDue");
    }
    this.PrevBalanceDue = value;
    this._PrevBalanceDueSet = true;
  }
  /** get the value of the field: PrevBalanceDue
   * @return BigInteger the value
   */
  public BigInteger getPrevBalanceDue ()
  {
    return this.PrevBalanceDue;
  }
  /** Change the field to not being actively set: PrevBalanceDue
   */
  public void unsetPrevBalanceDue ()
  {
    this._PrevBalanceDueSet = false;
  }
  /** See if the field is actively set: PrevBalanceDue
   * @return boolean whether the field is actively set
   */
  public boolean issetPrevBalanceDue ()
  {
    return this._PrevBalanceDueSet;
  }

  /** Retrieves the PrevBalanceDue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrevBalanceDue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevBalanceDue field
   */
   public String getPrevBalanceDueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceDueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevBalanceDueAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrevBalanceDue(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevBalanceDueAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrevBalanceDue field from a formatted string
   *
   * @param _value the PrevBalanceDue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrevBalanceDue field
   */
   public void setPrevBalanceDueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevBalanceDueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrevBalanceDue(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrevBalanceDue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevBalanceDueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevBalanceDueFromFormattedString");
   }

  public String toString() {
    return InvoiceSummaryObjectHelper.toMap(this, null).toString();
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
    
  /** UsageTotal field */
    if (!nonNullOnly || (UsageTotal != null)) _UsageTotalSet = flag;
  /** UsageNumber field */
    if (!nonNullOnly || (UsageNumber != null)) _UsageNumberSet = flag;
  /** RcTotal field */
    if (!nonNullOnly || (RcTotal != null)) _RcTotalSet = flag;
  /** RcNumber field */
    if (!nonNullOnly || (RcNumber != null)) _RcNumberSet = flag;
  /** NrcTotal field */
    if (!nonNullOnly || (NrcTotal != null)) _NrcTotalSet = flag;
  /** NrcNumber field */
    if (!nonNullOnly || (NrcNumber != null)) _NrcNumberSet = flag;
  /** AdjNumber field */
    if (!nonNullOnly || (AdjNumber != null)) _AdjNumberSet = flag;
  /** PaymentNumber field */
    if (!nonNullOnly || (PaymentNumber != null)) _PaymentNumberSet = flag;
  /** TaxTotal field */
    if (!nonNullOnly || (TaxTotal != null)) _TaxTotalSet = flag;
  /** PostPaymentNumber field */
    if (!nonNullOnly || (PostPaymentNumber != null)) _PostPaymentNumberSet = flag;
  /** PostPaymentTotal field */
    if (!nonNullOnly || (PostPaymentTotal != null)) _PostPaymentTotalSet = flag;
  /** PrevBalanceDue field */
    if (!nonNullOnly || (PrevBalanceDue != null)) _PrevBalanceDueSet = flag;
  }
}
