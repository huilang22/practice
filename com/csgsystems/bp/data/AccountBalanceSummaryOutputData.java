/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalanceSummaryOutputData.java
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
public class AccountBalanceSummaryOutputData implements ArubaObjectData, Serializable
{
  /** SumBalance field */
  public    BigInteger SumBalance  = null;
  protected boolean _SumBalanceSet = false;
  /** PastDueDays1To30 field */
  public    BigInteger PastDueDays1To30  = null;
  protected boolean _PastDueDays1To30Set = false;
  /** PastDueDays31To60 field */
  public    BigInteger PastDueDays31To60  = null;
  protected boolean _PastDueDays31To60Set = false;
  /** PastDueDays61To90 field */
  public    BigInteger PastDueDays61To90  = null;
  protected boolean _PastDueDays61To90Set = false;
  /** PastDueDays91To120 field */
  public    BigInteger PastDueDays91To120  = null;
  protected boolean _PastDueDays91To120Set = false;
  /** PastDueDaysGt120 field */
  public    BigInteger PastDueDaysGt120  = null;
  protected boolean _PastDueDaysGt120Set = false;
  /** CurrencyCode field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  private String _objName = "AccountBalanceSummaryOutputData";
  /** default constructor */
  public AccountBalanceSummaryOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public AccountBalanceSummaryOutputData (AccountBalanceSummaryOutputData other)
  {
    if (other == null) return;
    this.SumBalance = other.SumBalance;
    this._SumBalanceSet = other._SumBalanceSet;
    this.PastDueDays1To30 = other.PastDueDays1To30;
    this._PastDueDays1To30Set = other._PastDueDays1To30Set;
    this.PastDueDays31To60 = other.PastDueDays31To60;
    this._PastDueDays31To60Set = other._PastDueDays31To60Set;
    this.PastDueDays61To90 = other.PastDueDays61To90;
    this._PastDueDays61To90Set = other._PastDueDays61To90Set;
    this.PastDueDays91To120 = other.PastDueDays91To120;
    this._PastDueDays91To120Set = other._PastDueDays91To120Set;
    this.PastDueDaysGt120 = other.PastDueDaysGt120;
    this._PastDueDaysGt120Set = other._PastDueDaysGt120Set;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
  }
  /** set the fields value: SumBalance
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSumBalance (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SumBalance", "setSumBalance");
    }
    this.SumBalance = value;
    this._SumBalanceSet = true;
  }
  /** get the value of the field: SumBalance
   * @return BigInteger the value
   */
  public BigInteger getSumBalance ()
  {
    return this.SumBalance;
  }
  /** Change the field to not being actively set: SumBalance
   */
  public void unsetSumBalance ()
  {
    this._SumBalanceSet = false;
  }
  /** See if the field is actively set: SumBalance
   * @return boolean whether the field is actively set
   */
  public boolean issetSumBalance ()
  {
    return this._SumBalanceSet;
  }

  /** Retrieves the SumBalance field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SumBalance field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SumBalance field
   */
   public String getSumBalanceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumBalanceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSumBalanceAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSumBalance(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumBalance");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSumBalanceAsFormattedString");
       throw x;
     }
   }
  /** Sets the SumBalance field from a formatted string
   *
   * @param _value the SumBalance field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SumBalance field
   */
   public void setSumBalanceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumBalanceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSumBalance(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SumBalance");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSumBalanceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSumBalanceFromFormattedString");
   }

  /**
   * Retrieves the SumBalance field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SumBalance field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the SumBalance field
   */
  public String getSumBalanceAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSumBalanceAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSumBalanceAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getSumBalance(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SumBalance");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSumBalanceAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the SumBalance field value from a formatted currency string
   *
   * @param _value the SumBalance field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SumBalance field
   */
  public void setSumBalanceFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSumBalanceFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSumBalance(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SumBalance");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSumBalanceFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSumBalanceFromFormattedCurrencyString");
  }

  /** set the fields value: PastDueDays1To30
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPastDueDays1To30 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PastDueDays1To30", "setPastDueDays1To30");
    }
    this.PastDueDays1To30 = value;
    this._PastDueDays1To30Set = true;
  }
  /** get the value of the field: PastDueDays1To30
   * @return BigInteger the value
   */
  public BigInteger getPastDueDays1To30 ()
  {
    return this.PastDueDays1To30;
  }
  /** Change the field to not being actively set: PastDueDays1To30
   */
  public void unsetPastDueDays1To30 ()
  {
    this._PastDueDays1To30Set = false;
  }
  /** See if the field is actively set: PastDueDays1To30
   * @return boolean whether the field is actively set
   */
  public boolean issetPastDueDays1To30 ()
  {
    return this._PastDueDays1To30Set;
  }

  /** Retrieves the PastDueDays1To30 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PastDueDays1To30 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays1To30 field
   */
   public String getPastDueDays1To30AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays1To30AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays1To30AsFormattedString");
       return fmtMgr.formatBigInteger(this.getPastDueDays1To30(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays1To30");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays1To30AsFormattedString");
       throw x;
     }
   }
  /** Sets the PastDueDays1To30 field from a formatted string
   *
   * @param _value the PastDueDays1To30 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays1To30 field
   */
   public void setPastDueDays1To30FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays1To30FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPastDueDays1To30(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays1To30");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays1To30FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays1To30FromFormattedString");
   }

  /**
   * Retrieves the PastDueDays1To30 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PastDueDays1To30 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays1To30 field
   */
  public String getPastDueDays1To30AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays1To30AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays1To30AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getPastDueDays1To30(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays1To30");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays1To30AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the PastDueDays1To30 field value from a formatted currency string
   *
   * @param _value the PastDueDays1To30 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays1To30 field
   */
  public void setPastDueDays1To30FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPastDueDays1To30FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPastDueDays1To30(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays1To30");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays1To30FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays1To30FromFormattedCurrencyString");
  }

  /** set the fields value: PastDueDays31To60
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPastDueDays31To60 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PastDueDays31To60", "setPastDueDays31To60");
    }
    this.PastDueDays31To60 = value;
    this._PastDueDays31To60Set = true;
  }
  /** get the value of the field: PastDueDays31To60
   * @return BigInteger the value
   */
  public BigInteger getPastDueDays31To60 ()
  {
    return this.PastDueDays31To60;
  }
  /** Change the field to not being actively set: PastDueDays31To60
   */
  public void unsetPastDueDays31To60 ()
  {
    this._PastDueDays31To60Set = false;
  }
  /** See if the field is actively set: PastDueDays31To60
   * @return boolean whether the field is actively set
   */
  public boolean issetPastDueDays31To60 ()
  {
    return this._PastDueDays31To60Set;
  }

  /** Retrieves the PastDueDays31To60 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PastDueDays31To60 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays31To60 field
   */
   public String getPastDueDays31To60AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays31To60AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays31To60AsFormattedString");
       return fmtMgr.formatBigInteger(this.getPastDueDays31To60(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays31To60");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays31To60AsFormattedString");
       throw x;
     }
   }
  /** Sets the PastDueDays31To60 field from a formatted string
   *
   * @param _value the PastDueDays31To60 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays31To60 field
   */
   public void setPastDueDays31To60FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays31To60FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPastDueDays31To60(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays31To60");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays31To60FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays31To60FromFormattedString");
   }

  /**
   * Retrieves the PastDueDays31To60 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PastDueDays31To60 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays31To60 field
   */
  public String getPastDueDays31To60AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays31To60AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays31To60AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getPastDueDays31To60(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays31To60");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays31To60AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the PastDueDays31To60 field value from a formatted currency string
   *
   * @param _value the PastDueDays31To60 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays31To60 field
   */
  public void setPastDueDays31To60FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPastDueDays31To60FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPastDueDays31To60(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays31To60");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays31To60FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays31To60FromFormattedCurrencyString");
  }

  /** set the fields value: PastDueDays61To90
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPastDueDays61To90 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PastDueDays61To90", "setPastDueDays61To90");
    }
    this.PastDueDays61To90 = value;
    this._PastDueDays61To90Set = true;
  }
  /** get the value of the field: PastDueDays61To90
   * @return BigInteger the value
   */
  public BigInteger getPastDueDays61To90 ()
  {
    return this.PastDueDays61To90;
  }
  /** Change the field to not being actively set: PastDueDays61To90
   */
  public void unsetPastDueDays61To90 ()
  {
    this._PastDueDays61To90Set = false;
  }
  /** See if the field is actively set: PastDueDays61To90
   * @return boolean whether the field is actively set
   */
  public boolean issetPastDueDays61To90 ()
  {
    return this._PastDueDays61To90Set;
  }

  /** Retrieves the PastDueDays61To90 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PastDueDays61To90 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays61To90 field
   */
   public String getPastDueDays61To90AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays61To90AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays61To90AsFormattedString");
       return fmtMgr.formatBigInteger(this.getPastDueDays61To90(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays61To90");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays61To90AsFormattedString");
       throw x;
     }
   }
  /** Sets the PastDueDays61To90 field from a formatted string
   *
   * @param _value the PastDueDays61To90 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays61To90 field
   */
   public void setPastDueDays61To90FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays61To90FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPastDueDays61To90(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays61To90");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays61To90FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays61To90FromFormattedString");
   }

  /**
   * Retrieves the PastDueDays61To90 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PastDueDays61To90 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays61To90 field
   */
  public String getPastDueDays61To90AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays61To90AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays61To90AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getPastDueDays61To90(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays61To90");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays61To90AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the PastDueDays61To90 field value from a formatted currency string
   *
   * @param _value the PastDueDays61To90 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays61To90 field
   */
  public void setPastDueDays61To90FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPastDueDays61To90FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPastDueDays61To90(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays61To90");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays61To90FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays61To90FromFormattedCurrencyString");
  }

  /** set the fields value: PastDueDays91To120
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPastDueDays91To120 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PastDueDays91To120", "setPastDueDays91To120");
    }
    this.PastDueDays91To120 = value;
    this._PastDueDays91To120Set = true;
  }
  /** get the value of the field: PastDueDays91To120
   * @return BigInteger the value
   */
  public BigInteger getPastDueDays91To120 ()
  {
    return this.PastDueDays91To120;
  }
  /** Change the field to not being actively set: PastDueDays91To120
   */
  public void unsetPastDueDays91To120 ()
  {
    this._PastDueDays91To120Set = false;
  }
  /** See if the field is actively set: PastDueDays91To120
   * @return boolean whether the field is actively set
   */
  public boolean issetPastDueDays91To120 ()
  {
    return this._PastDueDays91To120Set;
  }

  /** Retrieves the PastDueDays91To120 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PastDueDays91To120 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays91To120 field
   */
   public String getPastDueDays91To120AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays91To120AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays91To120AsFormattedString");
       return fmtMgr.formatBigInteger(this.getPastDueDays91To120(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays91To120");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays91To120AsFormattedString");
       throw x;
     }
   }
  /** Sets the PastDueDays91To120 field from a formatted string
   *
   * @param _value the PastDueDays91To120 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays91To120 field
   */
   public void setPastDueDays91To120FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays91To120FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPastDueDays91To120(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDays91To120");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays91To120FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays91To120FromFormattedString");
   }

  /**
   * Retrieves the PastDueDays91To120 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PastDueDays91To120 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDays91To120 field
   */
  public String getPastDueDays91To120AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDays91To120AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDays91To120AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getPastDueDays91To120(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays91To120");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDays91To120AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the PastDueDays91To120 field value from a formatted currency string
   *
   * @param _value the PastDueDays91To120 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDays91To120 field
   */
  public void setPastDueDays91To120FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPastDueDays91To120FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPastDueDays91To120(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDays91To120");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDays91To120FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDays91To120FromFormattedCurrencyString");
  }

  /** set the fields value: PastDueDaysGt120
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPastDueDaysGt120 (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PastDueDaysGt120", "setPastDueDaysGt120");
    }
    this.PastDueDaysGt120 = value;
    this._PastDueDaysGt120Set = true;
  }
  /** get the value of the field: PastDueDaysGt120
   * @return BigInteger the value
   */
  public BigInteger getPastDueDaysGt120 ()
  {
    return this.PastDueDaysGt120;
  }
  /** Change the field to not being actively set: PastDueDaysGt120
   */
  public void unsetPastDueDaysGt120 ()
  {
    this._PastDueDaysGt120Set = false;
  }
  /** See if the field is actively set: PastDueDaysGt120
   * @return boolean whether the field is actively set
   */
  public boolean issetPastDueDaysGt120 ()
  {
    return this._PastDueDaysGt120Set;
  }

  /** Retrieves the PastDueDaysGt120 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PastDueDaysGt120 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDaysGt120 field
   */
   public String getPastDueDaysGt120AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDaysGt120AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDaysGt120AsFormattedString");
       return fmtMgr.formatBigInteger(this.getPastDueDaysGt120(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDaysGt120");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDaysGt120AsFormattedString");
       throw x;
     }
   }
  /** Sets the PastDueDaysGt120 field from a formatted string
   *
   * @param _value the PastDueDaysGt120 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDaysGt120 field
   */
   public void setPastDueDaysGt120FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDaysGt120FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPastDueDaysGt120(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PastDueDaysGt120");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDaysGt120FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDaysGt120FromFormattedString");
   }

  /**
   * Retrieves the PastDueDaysGt120 field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PastDueDaysGt120 field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the PastDueDaysGt120 field
   */
  public String getPastDueDaysGt120AsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPastDueDaysGt120AsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPastDueDaysGt120AsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getPastDueDaysGt120(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDaysGt120");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPastDueDaysGt120AsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the PastDueDaysGt120 field value from a formatted currency string
   *
   * @param _value the PastDueDaysGt120 field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PastDueDaysGt120 field
   */
  public void setPastDueDaysGt120FromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPastDueDaysGt120FromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPastDueDaysGt120(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PastDueDaysGt120");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPastDueDaysGt120FromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPastDueDaysGt120FromFormattedCurrencyString");
  }

  /** set the fields value: CurrencyCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }
  /** get the value of the field: CurrencyCode
   * @return Integer the value
   */
  public Integer getCurrencyCode ()
  {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode
   */
  public void unsetCurrencyCode ()
  {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode ()
  {
    return this._CurrencyCodeSet;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
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
    
  /** SumBalance field */
    if (!nonNullOnly || (SumBalance != null)) _SumBalanceSet = flag;
  /** PastDueDays1To30 field */
    if (!nonNullOnly || (PastDueDays1To30 != null)) _PastDueDays1To30Set = flag;
  /** PastDueDays31To60 field */
    if (!nonNullOnly || (PastDueDays31To60 != null)) _PastDueDays31To60Set = flag;
  /** PastDueDays61To90 field */
    if (!nonNullOnly || (PastDueDays61To90 != null)) _PastDueDays61To90Set = flag;
  /** PastDueDays91To120 field */
    if (!nonNullOnly || (PastDueDays91To120 != null)) _PastDueDays91To120Set = flag;
  /** PastDueDaysGt120 field */
    if (!nonNullOnly || (PastDueDaysGt120 != null)) _PastDueDaysGt120Set = flag;
  /** CurrencyCode field */
    if (!nonNullOnly || (CurrencyCode != null)) _CurrencyCodeSet = flag;
  }
}
