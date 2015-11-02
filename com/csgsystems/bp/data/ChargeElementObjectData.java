/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeElementObjectData.java
 * Definition File: Customer/OrderQuote.xml
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


import com.csgsystems.api.base.BaseObjectData;
  
/** ChargeElementObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ChargeElementObjectData extends BaseObjectData implements Serializable
{

  /** CeBillRefno field */
  public    Integer CeBillRefno  = null;
  protected boolean _CeBillRefnoSet = false;
  /** CeBillRefResets field */
  public    Integer CeBillRefResets  = null;
  protected boolean _CeBillRefResetsSet = false;
  /** CeStatementDate field */
  public    Date CeStatementDate  = null;
  protected boolean _CeStatementDateSet = false;
  /** CeFromDate field */
  public    Date CeFromDate  = null;
  protected boolean _CeFromDateSet = false;
  /** CeToDate field */
  public    Date CeToDate  = null;
  protected boolean _CeToDateSet = false;
  /** CeObjectType field */
  public    Integer CeObjectType  = null;
  protected boolean _CeObjectTypeSet = false;
  /** CeObjectTypeKey field */
  public    Integer CeObjectTypeKey  = null;
  protected boolean _CeObjectTypeKeySet = false;
  /** CeObjectKey1 field */
  public    Integer CeObjectKey1  = null;
  protected boolean _CeObjectKey1Set = false;
  /** CeObjectKey2 field */
  public    Integer CeObjectKey2  = null;
  protected boolean _CeObjectKey2Set = false;
  /** CeParentType field */
  public    Integer CeParentType  = null;
  protected boolean _CeParentTypeSet = false;
  /** CeParentTypeKey field */
  public    Integer CeParentTypeKey  = null;
  protected boolean _CeParentTypeKeySet = false;
  /** CeParentKey1 field */
  public    Integer CeParentKey1  = null;
  protected boolean _CeParentKey1Set = false;
  /** CeParentKey2 field */
  public    Integer CeParentKey2  = null;
  protected boolean _CeParentKey2Set = false;
  /** CeAmount field */
  public    BigInteger CeAmount  = null;
  protected boolean _CeAmountSet = false;
  /** CeDiscount field */
  public    BigInteger CeDiscount  = null;
  protected boolean _CeDiscountSet = false;
  /** CeTaxes field */
  public    BigInteger CeTaxes  = null;
  protected boolean _CeTaxesSet = false;
  /** CeFederalTax field */
  public    BigInteger CeFederalTax  = null;
  protected boolean _CeFederalTaxSet = false;
  /** CeStateTax field */
  public    BigInteger CeStateTax  = null;
  protected boolean _CeStateTaxSet = false;
  /** CeCountyTax field */
  public    BigInteger CeCountyTax  = null;
  protected boolean _CeCountyTaxSet = false;
  /** CeCityTax field */
  public    BigInteger CeCityTax  = null;
  protected boolean _CeCityTaxSet = false;
  /** CeOtherTax field */
  public    BigInteger CeOtherTax  = null;
  protected boolean _CeOtherTaxSet = false;
  /** CeDescriptionText field */
  public    String CeDescriptionText  = null;
  protected boolean _CeDescriptionTextSet = false;
  /** CeDescriptionCode field */
  public    Integer CeDescriptionCode  = null;
  protected boolean _CeDescriptionCodeSet = false;
  private String _objName = "ChargeElementObjectData";
  /** Default constructor */
  public ChargeElementObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ChargeElementObjectData (ChargeElementObjectData other)
  {

    if (other == null) return;
    this.CeBillRefno = other.CeBillRefno;
    this._CeBillRefnoSet = other._CeBillRefnoSet;
    this.CeBillRefResets = other.CeBillRefResets;
    this._CeBillRefResetsSet = other._CeBillRefResetsSet;
    this.CeStatementDate = other.CeStatementDate;
    this._CeStatementDateSet = other._CeStatementDateSet;
    this.CeFromDate = other.CeFromDate;
    this._CeFromDateSet = other._CeFromDateSet;
    this.CeToDate = other.CeToDate;
    this._CeToDateSet = other._CeToDateSet;
    this.CeObjectType = other.CeObjectType;
    this._CeObjectTypeSet = other._CeObjectTypeSet;
    this.CeObjectTypeKey = other.CeObjectTypeKey;
    this._CeObjectTypeKeySet = other._CeObjectTypeKeySet;
    this.CeObjectKey1 = other.CeObjectKey1;
    this._CeObjectKey1Set = other._CeObjectKey1Set;
    this.CeObjectKey2 = other.CeObjectKey2;
    this._CeObjectKey2Set = other._CeObjectKey2Set;
    this.CeParentType = other.CeParentType;
    this._CeParentTypeSet = other._CeParentTypeSet;
    this.CeParentTypeKey = other.CeParentTypeKey;
    this._CeParentTypeKeySet = other._CeParentTypeKeySet;
    this.CeParentKey1 = other.CeParentKey1;
    this._CeParentKey1Set = other._CeParentKey1Set;
    this.CeParentKey2 = other.CeParentKey2;
    this._CeParentKey2Set = other._CeParentKey2Set;
    this.CeAmount = other.CeAmount;
    this._CeAmountSet = other._CeAmountSet;
    this.CeDiscount = other.CeDiscount;
    this._CeDiscountSet = other._CeDiscountSet;
    this.CeTaxes = other.CeTaxes;
    this._CeTaxesSet = other._CeTaxesSet;
    this.CeFederalTax = other.CeFederalTax;
    this._CeFederalTaxSet = other._CeFederalTaxSet;
    this.CeStateTax = other.CeStateTax;
    this._CeStateTaxSet = other._CeStateTaxSet;
    this.CeCountyTax = other.CeCountyTax;
    this._CeCountyTaxSet = other._CeCountyTaxSet;
    this.CeCityTax = other.CeCityTax;
    this._CeCityTaxSet = other._CeCityTaxSet;
    this.CeOtherTax = other.CeOtherTax;
    this._CeOtherTaxSet = other._CeOtherTaxSet;
    this.CeDescriptionText = other.CeDescriptionText;
    this._CeDescriptionTextSet = other._CeDescriptionTextSet;
    this.CeDescriptionCode = other.CeDescriptionCode;
    this._CeDescriptionCodeSet = other._CeDescriptionCodeSet;
  }

  /** set the fields value: CeBillRefno
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeBillRefno (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeBillRefno", "setCeBillRefno");
    }
    this.CeBillRefno = value;
    this._CeBillRefnoSet = true;
  }
  /** get the value of the field: CeBillRefno
   * @return Integer the value
   */
  public Integer getCeBillRefno ()
  {
    return this.CeBillRefno;
  }
  /** Change the field to not being actively set: CeBillRefno
   */
  public void unsetCeBillRefno ()
  {
    this._CeBillRefnoSet = false;
  }
  /** See if the field is actively set: CeBillRefno
   * @return boolean whether the field is actively set
   */
  public boolean issetCeBillRefno ()
  {
    return this._CeBillRefnoSet;
  }

  /** Retrieves the CeBillRefno field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeBillRefno field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeBillRefno field
   */
   public String getCeBillRefnoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeBillRefnoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeBillRefnoAsFormattedString");
       return fmtMgr.formatNumber(this.getCeBillRefno(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeBillRefnoAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeBillRefno field from a formatted string
   *
   * @param _value the CeBillRefno field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeBillRefno field
   */
   public void setCeBillRefnoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeBillRefnoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeBillRefno(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeBillRefno");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeBillRefnoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeBillRefnoFromFormattedString");
   }

  /** set the fields value: CeBillRefResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeBillRefResets", "setCeBillRefResets");
    }
    this.CeBillRefResets = value;
    this._CeBillRefResetsSet = true;
  }
  /** get the value of the field: CeBillRefResets
   * @return Integer the value
   */
  public Integer getCeBillRefResets ()
  {
    return this.CeBillRefResets;
  }
  /** Change the field to not being actively set: CeBillRefResets
   */
  public void unsetCeBillRefResets ()
  {
    this._CeBillRefResetsSet = false;
  }
  /** See if the field is actively set: CeBillRefResets
   * @return boolean whether the field is actively set
   */
  public boolean issetCeBillRefResets ()
  {
    return this._CeBillRefResetsSet;
  }

  /** Retrieves the CeBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeBillRefResets field
   */
   public String getCeBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getCeBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeBillRefResets field from a formatted string
   *
   * @param _value the CeBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeBillRefResets field
   */
   public void setCeBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeBillRefResetsFromFormattedString");
   }

  /** set the fields value: CeStatementDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeStatementDate", "setCeStatementDate");
    }
    this.CeStatementDate = value;
    this._CeStatementDateSet = true;
  }
  /** get the value of the field: CeStatementDate
   * @return Date the value
   */
  public Date getCeStatementDate ()
  {
    return this.CeStatementDate;
  }
  /** Change the field to not being actively set: CeStatementDate
   */
  public void unsetCeStatementDate ()
  {
    this._CeStatementDateSet = false;
  }
  /** See if the field is actively set: CeStatementDate
   * @return boolean whether the field is actively set
   */
  public boolean issetCeStatementDate ()
  {
    return this._CeStatementDateSet;
  }

  /** Retrieves the CeStatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeStatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeStatementDate field
   */
   public String getCeStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getCeStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeStatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeStatementDate field from a formatted string
   *
   * @param _value the CeStatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeStatementDate field
   */
   public void setCeStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeStatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeStatementDateFromFormattedString");
   }

  /**
   * Retrieves the CeStatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CeStatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeStatementDate field
   */
  public String getCeStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCeStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeStatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CeStatementDate field value from a formatted date/time string
   *
   * @param _value the CeStatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeStatementDate field
   */
  public void setCeStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCeStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCeStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeStatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: CeFromDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeFromDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeFromDate", "setCeFromDate");
    }
    this.CeFromDate = value;
    this._CeFromDateSet = true;
  }
  /** get the value of the field: CeFromDate
   * @return Date the value
   */
  public Date getCeFromDate ()
  {
    return this.CeFromDate;
  }
  /** Change the field to not being actively set: CeFromDate
   */
  public void unsetCeFromDate ()
  {
    this._CeFromDateSet = false;
  }
  /** See if the field is actively set: CeFromDate
   * @return boolean whether the field is actively set
   */
  public boolean issetCeFromDate ()
  {
    return this._CeFromDateSet;
  }

  /** Retrieves the CeFromDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeFromDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeFromDate field
   */
   public String getCeFromDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeFromDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeFromDateAsFormattedString");
       return fmtMgr.formatDate(this.getCeFromDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeFromDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeFromDate field from a formatted string
   *
   * @param _value the CeFromDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeFromDate field
   */
   public void setCeFromDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeFromDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeFromDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeFromDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeFromDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeFromDateFromFormattedString");
   }

  /**
   * Retrieves the CeFromDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CeFromDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeFromDate field
   */
  public String getCeFromDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeFromDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeFromDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCeFromDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeFromDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CeFromDate field value from a formatted date/time string
   *
   * @param _value the CeFromDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeFromDate field
   */
  public void setCeFromDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCeFromDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCeFromDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeFromDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeFromDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: CeToDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeToDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeToDate", "setCeToDate");
    }
    this.CeToDate = value;
    this._CeToDateSet = true;
  }
  /** get the value of the field: CeToDate
   * @return Date the value
   */
  public Date getCeToDate ()
  {
    return this.CeToDate;
  }
  /** Change the field to not being actively set: CeToDate
   */
  public void unsetCeToDate ()
  {
    this._CeToDateSet = false;
  }
  /** See if the field is actively set: CeToDate
   * @return boolean whether the field is actively set
   */
  public boolean issetCeToDate ()
  {
    return this._CeToDateSet;
  }

  /** Retrieves the CeToDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeToDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeToDate field
   */
   public String getCeToDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeToDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeToDateAsFormattedString");
       return fmtMgr.formatDate(this.getCeToDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeToDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeToDate field from a formatted string
   *
   * @param _value the CeToDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeToDate field
   */
   public void setCeToDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeToDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeToDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeToDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeToDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeToDateFromFormattedString");
   }

  /**
   * Retrieves the CeToDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CeToDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeToDate field
   */
  public String getCeToDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeToDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeToDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCeToDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeToDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CeToDate field value from a formatted date/time string
   *
   * @param _value the CeToDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeToDate field
   */
  public void setCeToDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCeToDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCeToDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CeToDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeToDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: CeObjectType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeObjectType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeObjectType", "setCeObjectType");
    }
    this.CeObjectType = value;
    this._CeObjectTypeSet = true;
  }
  /** get the value of the field: CeObjectType
   * @return Integer the value
   */
  public Integer getCeObjectType ()
  {
    return this.CeObjectType;
  }
  /** Change the field to not being actively set: CeObjectType
   */
  public void unsetCeObjectType ()
  {
    this._CeObjectTypeSet = false;
  }
  /** See if the field is actively set: CeObjectType
   * @return boolean whether the field is actively set
   */
  public boolean issetCeObjectType ()
  {
    return this._CeObjectTypeSet;
  }

  /** Retrieves the CeObjectType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeObjectType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeObjectType field
   */
   public String getCeObjectTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeObjectTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCeObjectType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeObjectTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeObjectType field from a formatted string
   *
   * @param _value the CeObjectType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeObjectType field
   */
   public void setCeObjectTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeObjectType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeObjectTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeObjectTypeFromFormattedString");
   }

  /** set the fields value: CeObjectTypeKey
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeObjectTypeKey (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeObjectTypeKey", "setCeObjectTypeKey");
    }
    this.CeObjectTypeKey = value;
    this._CeObjectTypeKeySet = true;
  }
  /** get the value of the field: CeObjectTypeKey
   * @return Integer the value
   */
  public Integer getCeObjectTypeKey ()
  {
    return this.CeObjectTypeKey;
  }
  /** Change the field to not being actively set: CeObjectTypeKey
   */
  public void unsetCeObjectTypeKey ()
  {
    this._CeObjectTypeKeySet = false;
  }
  /** See if the field is actively set: CeObjectTypeKey
   * @return boolean whether the field is actively set
   */
  public boolean issetCeObjectTypeKey ()
  {
    return this._CeObjectTypeKeySet;
  }

  /** Retrieves the CeObjectTypeKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeObjectTypeKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeObjectTypeKey field
   */
   public String getCeObjectTypeKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectTypeKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeObjectTypeKeyAsFormattedString");
       return fmtMgr.formatNumber(this.getCeObjectTypeKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectTypeKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeObjectTypeKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeObjectTypeKey field from a formatted string
   *
   * @param _value the CeObjectTypeKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeObjectTypeKey field
   */
   public void setCeObjectTypeKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectTypeKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeObjectTypeKey(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectTypeKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeObjectTypeKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeObjectTypeKeyFromFormattedString");
   }

  /** set the fields value: CeObjectKey1
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeObjectKey1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeObjectKey1", "setCeObjectKey1");
    }
    this.CeObjectKey1 = value;
    this._CeObjectKey1Set = true;
  }
  /** get the value of the field: CeObjectKey1
   * @return Integer the value
   */
  public Integer getCeObjectKey1 ()
  {
    return this.CeObjectKey1;
  }
  /** Change the field to not being actively set: CeObjectKey1
   */
  public void unsetCeObjectKey1 ()
  {
    this._CeObjectKey1Set = false;
  }
  /** See if the field is actively set: CeObjectKey1
   * @return boolean whether the field is actively set
   */
  public boolean issetCeObjectKey1 ()
  {
    return this._CeObjectKey1Set;
  }

  /** Retrieves the CeObjectKey1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeObjectKey1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeObjectKey1 field
   */
   public String getCeObjectKey1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectKey1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeObjectKey1AsFormattedString");
       return fmtMgr.formatNumber(this.getCeObjectKey1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeObjectKey1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CeObjectKey1 field from a formatted string
   *
   * @param _value the CeObjectKey1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeObjectKey1 field
   */
   public void setCeObjectKey1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectKey1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeObjectKey1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeObjectKey1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeObjectKey1FromFormattedString");
   }

  /** set the fields value: CeObjectKey2
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeObjectKey2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeObjectKey2", "setCeObjectKey2");
    }
    this.CeObjectKey2 = value;
    this._CeObjectKey2Set = true;
  }
  /** get the value of the field: CeObjectKey2
   * @return Integer the value
   */
  public Integer getCeObjectKey2 ()
  {
    return this.CeObjectKey2;
  }
  /** Change the field to not being actively set: CeObjectKey2
   */
  public void unsetCeObjectKey2 ()
  {
    this._CeObjectKey2Set = false;
  }
  /** See if the field is actively set: CeObjectKey2
   * @return boolean whether the field is actively set
   */
  public boolean issetCeObjectKey2 ()
  {
    return this._CeObjectKey2Set;
  }

  /** Retrieves the CeObjectKey2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeObjectKey2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeObjectKey2 field
   */
   public String getCeObjectKey2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectKey2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeObjectKey2AsFormattedString");
       return fmtMgr.formatNumber(this.getCeObjectKey2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeObjectKey2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CeObjectKey2 field from a formatted string
   *
   * @param _value the CeObjectKey2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeObjectKey2 field
   */
   public void setCeObjectKey2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeObjectKey2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeObjectKey2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeObjectKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeObjectKey2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeObjectKey2FromFormattedString");
   }

  /** set the fields value: CeParentType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeParentType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeParentType", "setCeParentType");
    }
    this.CeParentType = value;
    this._CeParentTypeSet = true;
  }
  /** get the value of the field: CeParentType
   * @return Integer the value
   */
  public Integer getCeParentType ()
  {
    return this.CeParentType;
  }
  /** Change the field to not being actively set: CeParentType
   */
  public void unsetCeParentType ()
  {
    this._CeParentTypeSet = false;
  }
  /** See if the field is actively set: CeParentType
   * @return boolean whether the field is actively set
   */
  public boolean issetCeParentType ()
  {
    return this._CeParentTypeSet;
  }

  /** Retrieves the CeParentType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeParentType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeParentType field
   */
   public String getCeParentTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeParentTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getCeParentType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeParentTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeParentType field from a formatted string
   *
   * @param _value the CeParentType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeParentType field
   */
   public void setCeParentTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeParentType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeParentTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeParentTypeFromFormattedString");
   }

  /** set the fields value: CeParentTypeKey
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeParentTypeKey (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeParentTypeKey", "setCeParentTypeKey");
    }
    this.CeParentTypeKey = value;
    this._CeParentTypeKeySet = true;
  }
  /** get the value of the field: CeParentTypeKey
   * @return Integer the value
   */
  public Integer getCeParentTypeKey ()
  {
    return this.CeParentTypeKey;
  }
  /** Change the field to not being actively set: CeParentTypeKey
   */
  public void unsetCeParentTypeKey ()
  {
    this._CeParentTypeKeySet = false;
  }
  /** See if the field is actively set: CeParentTypeKey
   * @return boolean whether the field is actively set
   */
  public boolean issetCeParentTypeKey ()
  {
    return this._CeParentTypeKeySet;
  }

  /** Retrieves the CeParentTypeKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeParentTypeKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeParentTypeKey field
   */
   public String getCeParentTypeKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentTypeKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeParentTypeKeyAsFormattedString");
       return fmtMgr.formatNumber(this.getCeParentTypeKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentTypeKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeParentTypeKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeParentTypeKey field from a formatted string
   *
   * @param _value the CeParentTypeKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeParentTypeKey field
   */
   public void setCeParentTypeKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentTypeKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeParentTypeKey(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentTypeKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeParentTypeKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeParentTypeKeyFromFormattedString");
   }

  /** set the fields value: CeParentKey1
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeParentKey1 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeParentKey1", "setCeParentKey1");
    }
    this.CeParentKey1 = value;
    this._CeParentKey1Set = true;
  }
  /** get the value of the field: CeParentKey1
   * @return Integer the value
   */
  public Integer getCeParentKey1 ()
  {
    return this.CeParentKey1;
  }
  /** Change the field to not being actively set: CeParentKey1
   */
  public void unsetCeParentKey1 ()
  {
    this._CeParentKey1Set = false;
  }
  /** See if the field is actively set: CeParentKey1
   * @return boolean whether the field is actively set
   */
  public boolean issetCeParentKey1 ()
  {
    return this._CeParentKey1Set;
  }

  /** Retrieves the CeParentKey1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeParentKey1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeParentKey1 field
   */
   public String getCeParentKey1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentKey1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeParentKey1AsFormattedString");
       return fmtMgr.formatNumber(this.getCeParentKey1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeParentKey1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CeParentKey1 field from a formatted string
   *
   * @param _value the CeParentKey1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeParentKey1 field
   */
   public void setCeParentKey1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentKey1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeParentKey1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeParentKey1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeParentKey1FromFormattedString");
   }

  /** set the fields value: CeParentKey2
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeParentKey2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeParentKey2", "setCeParentKey2");
    }
    this.CeParentKey2 = value;
    this._CeParentKey2Set = true;
  }
  /** get the value of the field: CeParentKey2
   * @return Integer the value
   */
  public Integer getCeParentKey2 ()
  {
    return this.CeParentKey2;
  }
  /** Change the field to not being actively set: CeParentKey2
   */
  public void unsetCeParentKey2 ()
  {
    this._CeParentKey2Set = false;
  }
  /** See if the field is actively set: CeParentKey2
   * @return boolean whether the field is actively set
   */
  public boolean issetCeParentKey2 ()
  {
    return this._CeParentKey2Set;
  }

  /** Retrieves the CeParentKey2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeParentKey2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeParentKey2 field
   */
   public String getCeParentKey2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentKey2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeParentKey2AsFormattedString");
       return fmtMgr.formatNumber(this.getCeParentKey2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeParentKey2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CeParentKey2 field from a formatted string
   *
   * @param _value the CeParentKey2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeParentKey2 field
   */
   public void setCeParentKey2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeParentKey2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeParentKey2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeParentKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeParentKey2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeParentKey2FromFormattedString");
   }

  /** set the fields value: CeAmount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeAmount", "setCeAmount");
    }
    this.CeAmount = value;
    this._CeAmountSet = true;
  }
  /** get the value of the field: CeAmount
   * @return BigInteger the value
   */
  public BigInteger getCeAmount ()
  {
    return this.CeAmount;
  }
  /** Change the field to not being actively set: CeAmount
   */
  public void unsetCeAmount ()
  {
    this._CeAmountSet = false;
  }
  /** See if the field is actively set: CeAmount
   * @return boolean whether the field is actively set
   */
  public boolean issetCeAmount ()
  {
    return this._CeAmountSet;
  }

  /** Retrieves the CeAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeAmount field
   */
   public String getCeAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeAmount field from a formatted string
   *
   * @param _value the CeAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeAmount field
   */
   public void setCeAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeAmountFromFormattedString");
   }

  /** set the fields value: CeDiscount
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeDiscount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeDiscount", "setCeDiscount");
    }
    this.CeDiscount = value;
    this._CeDiscountSet = true;
  }
  /** get the value of the field: CeDiscount
   * @return BigInteger the value
   */
  public BigInteger getCeDiscount ()
  {
    return this.CeDiscount;
  }
  /** Change the field to not being actively set: CeDiscount
   */
  public void unsetCeDiscount ()
  {
    this._CeDiscountSet = false;
  }
  /** See if the field is actively set: CeDiscount
   * @return boolean whether the field is actively set
   */
  public boolean issetCeDiscount ()
  {
    return this._CeDiscountSet;
  }

  /** Retrieves the CeDiscount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeDiscount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeDiscount field
   */
   public String getCeDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeDiscount field from a formatted string
   *
   * @param _value the CeDiscount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeDiscount field
   */
   public void setCeDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDiscount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeDiscountFromFormattedString");
   }

  /** set the fields value: CeTaxes
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeTaxes (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeTaxes", "setCeTaxes");
    }
    this.CeTaxes = value;
    this._CeTaxesSet = true;
  }
  /** get the value of the field: CeTaxes
   * @return BigInteger the value
   */
  public BigInteger getCeTaxes ()
  {
    return this.CeTaxes;
  }
  /** Change the field to not being actively set: CeTaxes
   */
  public void unsetCeTaxes ()
  {
    this._CeTaxesSet = false;
  }
  /** See if the field is actively set: CeTaxes
   * @return boolean whether the field is actively set
   */
  public boolean issetCeTaxes ()
  {
    return this._CeTaxesSet;
  }

  /** Retrieves the CeTaxes field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeTaxes field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeTaxes field
   */
   public String getCeTaxesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeTaxesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeTaxesAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeTaxes(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeTaxes");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeTaxesAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeTaxes field from a formatted string
   *
   * @param _value the CeTaxes field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeTaxes field
   */
   public void setCeTaxesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeTaxesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeTaxes(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeTaxes");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeTaxesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeTaxesFromFormattedString");
   }

  /** set the fields value: CeFederalTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeFederalTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeFederalTax", "setCeFederalTax");
    }
    this.CeFederalTax = value;
    this._CeFederalTaxSet = true;
  }
  /** get the value of the field: CeFederalTax
   * @return BigInteger the value
   */
  public BigInteger getCeFederalTax ()
  {
    return this.CeFederalTax;
  }
  /** Change the field to not being actively set: CeFederalTax
   */
  public void unsetCeFederalTax ()
  {
    this._CeFederalTaxSet = false;
  }
  /** See if the field is actively set: CeFederalTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCeFederalTax ()
  {
    return this._CeFederalTaxSet;
  }

  /** Retrieves the CeFederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeFederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeFederalTax field
   */
   public String getCeFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeFederalTax field from a formatted string
   *
   * @param _value the CeFederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeFederalTax field
   */
   public void setCeFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeFederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeFederalTaxFromFormattedString");
   }

  /** set the fields value: CeStateTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeStateTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeStateTax", "setCeStateTax");
    }
    this.CeStateTax = value;
    this._CeStateTaxSet = true;
  }
  /** get the value of the field: CeStateTax
   * @return BigInteger the value
   */
  public BigInteger getCeStateTax ()
  {
    return this.CeStateTax;
  }
  /** Change the field to not being actively set: CeStateTax
   */
  public void unsetCeStateTax ()
  {
    this._CeStateTaxSet = false;
  }
  /** See if the field is actively set: CeStateTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCeStateTax ()
  {
    return this._CeStateTaxSet;
  }

  /** Retrieves the CeStateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeStateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeStateTax field
   */
   public String getCeStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeStateTax field from a formatted string
   *
   * @param _value the CeStateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeStateTax field
   */
   public void setCeStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeStateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeStateTaxFromFormattedString");
   }

  /** set the fields value: CeCountyTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeCountyTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeCountyTax", "setCeCountyTax");
    }
    this.CeCountyTax = value;
    this._CeCountyTaxSet = true;
  }
  /** get the value of the field: CeCountyTax
   * @return BigInteger the value
   */
  public BigInteger getCeCountyTax ()
  {
    return this.CeCountyTax;
  }
  /** Change the field to not being actively set: CeCountyTax
   */
  public void unsetCeCountyTax ()
  {
    this._CeCountyTaxSet = false;
  }
  /** See if the field is actively set: CeCountyTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCeCountyTax ()
  {
    return this._CeCountyTaxSet;
  }

  /** Retrieves the CeCountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeCountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeCountyTax field
   */
   public String getCeCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeCountyTax field from a formatted string
   *
   * @param _value the CeCountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeCountyTax field
   */
   public void setCeCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeCountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeCountyTaxFromFormattedString");
   }

  /** set the fields value: CeCityTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeCityTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeCityTax", "setCeCityTax");
    }
    this.CeCityTax = value;
    this._CeCityTaxSet = true;
  }
  /** get the value of the field: CeCityTax
   * @return BigInteger the value
   */
  public BigInteger getCeCityTax ()
  {
    return this.CeCityTax;
  }
  /** Change the field to not being actively set: CeCityTax
   */
  public void unsetCeCityTax ()
  {
    this._CeCityTaxSet = false;
  }
  /** See if the field is actively set: CeCityTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCeCityTax ()
  {
    return this._CeCityTaxSet;
  }

  /** Retrieves the CeCityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeCityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeCityTax field
   */
   public String getCeCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeCityTax field from a formatted string
   *
   * @param _value the CeCityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeCityTax field
   */
   public void setCeCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeCityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeCityTaxFromFormattedString");
   }

  /** set the fields value: CeOtherTax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeOtherTax (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeOtherTax", "setCeOtherTax");
    }
    this.CeOtherTax = value;
    this._CeOtherTaxSet = true;
  }
  /** get the value of the field: CeOtherTax
   * @return BigInteger the value
   */
  public BigInteger getCeOtherTax ()
  {
    return this.CeOtherTax;
  }
  /** Change the field to not being actively set: CeOtherTax
   */
  public void unsetCeOtherTax ()
  {
    this._CeOtherTaxSet = false;
  }
  /** See if the field is actively set: CeOtherTax
   * @return boolean whether the field is actively set
   */
  public boolean issetCeOtherTax ()
  {
    return this._CeOtherTaxSet;
  }

  /** Retrieves the CeOtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeOtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeOtherTax field
   */
   public String getCeOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCeOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeOtherTax field from a formatted string
   *
   * @param _value the CeOtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeOtherTax field
   */
   public void setCeOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeOtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeOtherTaxFromFormattedString");
   }

  /** set the fields value: CeDescriptionText
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeDescriptionText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeDescriptionText", "setCeDescriptionText");
    }
    this.CeDescriptionText = value;
    this._CeDescriptionTextSet = true;
  }
  /** get the value of the field: CeDescriptionText
   * @return String the value
   */
  public String getCeDescriptionText ()
  {
    return this.CeDescriptionText;
  }
  /** Change the field to not being actively set: CeDescriptionText
   */
  public void unsetCeDescriptionText ()
  {
    this._CeDescriptionTextSet = false;
  }
  /** See if the field is actively set: CeDescriptionText
   * @return boolean whether the field is actively set
   */
  public boolean issetCeDescriptionText ()
  {
    return this._CeDescriptionTextSet;
  }

  /** Retrieves the CeDescriptionText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeDescriptionText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeDescriptionText field
   */
   public String getCeDescriptionTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDescriptionTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeDescriptionTextAsFormattedString");
       return fmtMgr.formatString(this.getCeDescriptionText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeDescriptionTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeDescriptionText field from a formatted string
   *
   * @param _value the CeDescriptionText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeDescriptionText field
   */
   public void setCeDescriptionTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDescriptionTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeDescriptionText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeDescriptionTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeDescriptionTextFromFormattedString");
   }

  /** set the fields value: CeDescriptionCode
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCeDescriptionCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CeDescriptionCode", "setCeDescriptionCode");
    }
    this.CeDescriptionCode = value;
    this._CeDescriptionCodeSet = true;
  }
  /** get the value of the field: CeDescriptionCode
   * @return Integer the value
   */
  public Integer getCeDescriptionCode ()
  {
    return this.CeDescriptionCode;
  }
  /** Change the field to not being actively set: CeDescriptionCode
   */
  public void unsetCeDescriptionCode ()
  {
    this._CeDescriptionCodeSet = false;
  }
  /** See if the field is actively set: CeDescriptionCode
   * @return boolean whether the field is actively set
   */
  public boolean issetCeDescriptionCode ()
  {
    return this._CeDescriptionCodeSet;
  }

  /** Retrieves the CeDescriptionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CeDescriptionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CeDescriptionCode field
   */
   public String getCeDescriptionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDescriptionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCeDescriptionCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCeDescriptionCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCeDescriptionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CeDescriptionCode field from a formatted string
   *
   * @param _value the CeDescriptionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CeDescriptionCode field
   */
   public void setCeDescriptionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCeDescriptionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCeDescriptionCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CeDescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCeDescriptionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCeDescriptionCodeFromFormattedString");
   }

  public String toString() {
    return ChargeElementObjectHelper.toMap(this, null).toString();
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
    
  /** CeBillRefno field */
    if (!nonNullOnly || (CeBillRefno != null)) _CeBillRefnoSet = flag;
  /** CeBillRefResets field */
    if (!nonNullOnly || (CeBillRefResets != null)) _CeBillRefResetsSet = flag;
  /** CeStatementDate field */
    if (!nonNullOnly || (CeStatementDate != null)) _CeStatementDateSet = flag;
  /** CeFromDate field */
    if (!nonNullOnly || (CeFromDate != null)) _CeFromDateSet = flag;
  /** CeToDate field */
    if (!nonNullOnly || (CeToDate != null)) _CeToDateSet = flag;
  /** CeObjectType field */
    if (!nonNullOnly || (CeObjectType != null)) _CeObjectTypeSet = flag;
  /** CeObjectTypeKey field */
    if (!nonNullOnly || (CeObjectTypeKey != null)) _CeObjectTypeKeySet = flag;
  /** CeObjectKey1 field */
    if (!nonNullOnly || (CeObjectKey1 != null)) _CeObjectKey1Set = flag;
  /** CeObjectKey2 field */
    if (!nonNullOnly || (CeObjectKey2 != null)) _CeObjectKey2Set = flag;
  /** CeParentType field */
    if (!nonNullOnly || (CeParentType != null)) _CeParentTypeSet = flag;
  /** CeParentTypeKey field */
    if (!nonNullOnly || (CeParentTypeKey != null)) _CeParentTypeKeySet = flag;
  /** CeParentKey1 field */
    if (!nonNullOnly || (CeParentKey1 != null)) _CeParentKey1Set = flag;
  /** CeParentKey2 field */
    if (!nonNullOnly || (CeParentKey2 != null)) _CeParentKey2Set = flag;
  /** CeAmount field */
    if (!nonNullOnly || (CeAmount != null)) _CeAmountSet = flag;
  /** CeDiscount field */
    if (!nonNullOnly || (CeDiscount != null)) _CeDiscountSet = flag;
  /** CeTaxes field */
    if (!nonNullOnly || (CeTaxes != null)) _CeTaxesSet = flag;
  /** CeFederalTax field */
    if (!nonNullOnly || (CeFederalTax != null)) _CeFederalTaxSet = flag;
  /** CeStateTax field */
    if (!nonNullOnly || (CeStateTax != null)) _CeStateTaxSet = flag;
  /** CeCountyTax field */
    if (!nonNullOnly || (CeCountyTax != null)) _CeCountyTaxSet = flag;
  /** CeCityTax field */
    if (!nonNullOnly || (CeCityTax != null)) _CeCityTaxSet = flag;
  /** CeOtherTax field */
    if (!nonNullOnly || (CeOtherTax != null)) _CeOtherTaxSet = flag;
  /** CeDescriptionText field */
    if (!nonNullOnly || (CeDescriptionText != null)) _CeDescriptionTextSet = flag;
  /** CeDescriptionCode field */
    if (!nonNullOnly || (CeDescriptionCode != null)) _CeDescriptionCodeSet = flag;
  }
}
