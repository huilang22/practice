/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BulkAdjustmentObjectData.java
 * Definition File: Customer/BulkAdjustment.xml
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
  
/** BulkAdjustmentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BulkAdjustmentObjectData extends BaseObjectData implements Serializable
{

  /** ADJ.adj_trans_code field */
  public    Integer TransCode  = null;
  protected boolean _TransCodeSet = false;
  /** ADJ.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  /** ADJ.primary_units_type field */
  public    Integer PrimaryUnitsType  = null;
  protected boolean _PrimaryUnitsTypeSet = false;
  /** ADJ.primary_units field */
  public    BigInteger PrimaryUnits  = null;
  protected boolean _PrimaryUnitsSet = false;
  /** ADJ.effective_date field */
  public    Date EffectiveDate  = null;
  protected boolean _EffectiveDateSet = false;
  /** ADJ.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** ADJ.adj_reason_code field */
  public    Integer AdjReasonCode  = null;
  protected boolean _AdjReasonCodeSet = false;
  /** ADJ.total_amt field */
  public    BigInteger TotalAmt  = null;
  protected boolean _TotalAmtSet = false;
  /** AdjTransGroup field */
  public    Integer AdjTransGroup  = null;
  protected boolean _AdjTransGroupSet = false;
  /** IsMax field */
  public    Integer IsMax  = null;
  protected boolean _IsMaxSet = false;
  private String _objName = "BulkAdjustmentObjectData";
  /** Default constructor */
  public BulkAdjustmentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BulkAdjustmentObjectData (BulkAdjustmentObjectData other)
  {

    if (other == null) return;
    this.TransCode = other.TransCode;
    this._TransCodeSet = other._TransCodeSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
    this.PrimaryUnitsType = other.PrimaryUnitsType;
    this._PrimaryUnitsTypeSet = other._PrimaryUnitsTypeSet;
    this.PrimaryUnits = other.PrimaryUnits;
    this._PrimaryUnitsSet = other._PrimaryUnitsSet;
    this.EffectiveDate = other.EffectiveDate;
    this._EffectiveDateSet = other._EffectiveDateSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.AdjReasonCode = other.AdjReasonCode;
    this._AdjReasonCodeSet = other._AdjReasonCodeSet;
    this.TotalAmt = other.TotalAmt;
    this._TotalAmtSet = other._TotalAmtSet;
    this.AdjTransGroup = other.AdjTransGroup;
    this._AdjTransGroupSet = other._AdjTransGroupSet;
    this.IsMax = other.IsMax;
    this._IsMaxSet = other._IsMaxSet;
  }

  /** set the fields value: TransCode (ADJ.adj_trans_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransCode") 
  public void setTransCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransCode", "setTransCode");
    }
    this.TransCode = value;
    this._TransCodeSet = true;
  }

  /** Retrieves the TransCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCode field
   */
   public String getTransCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTransCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransCode field from a formatted string
   *
   * @param _value the TransCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransCode field
   */
   public void setTransCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated TransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCode field
   */

  public String getTransCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTransCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTransCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated TransCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the TransCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TransCode field
   */
  public Enumeration getTransCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AdjustmentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated TransCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTransCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTransCodeEnumeration(_locale);
      this.setTransCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCodeFromDisplayValue");
  }

  /** get the value of the field: TransCode (ADJ.adj_trans_code)
   * @return Integer the value
   */
  public Integer getTransCode () {
    return this.TransCode;
  }
  /** Change the field to not being actively set: TransCode (ADJ.adj_trans_code)
   */
  public void unsetTransCode () {
    this._TransCodeSet = false;
  }
  /** See if the field is actively set: TransCode (ADJ.adj_trans_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransCode () {
    return this._TransCodeSet;
  }
  /** set the fields value: Annotation (ADJ.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (ADJ.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (ADJ.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (ADJ.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  /** set the fields value: PrimaryUnitsType (ADJ.primary_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrimaryUnitsType") 
  public void setPrimaryUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrimaryUnitsType", "setPrimaryUnitsType");
    }
    this.PrimaryUnitsType = value;
    this._PrimaryUnitsTypeSet = true;
  }

  /** Retrieves the PrimaryUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrimaryUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnitsType field
   */
   public String getPrimaryUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getPrimaryUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrimaryUnitsType field from a formatted string
   *
   * @param _value the PrimaryUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrimaryUnitsType field
   */
   public void setPrimaryUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrimaryUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsTypeFromFormattedString");
   }

  /** get the value of the field: PrimaryUnitsType (ADJ.primary_units_type)
   * @return Integer the value
   */
  public Integer getPrimaryUnitsType () {
    return this.PrimaryUnitsType;
  }
  /** Change the field to not being actively set: PrimaryUnitsType (ADJ.primary_units_type)
   */
  public void unsetPrimaryUnitsType () {
    this._PrimaryUnitsTypeSet = false;
  }
  /** See if the field is actively set: PrimaryUnitsType (ADJ.primary_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrimaryUnitsType () {
    return this._PrimaryUnitsTypeSet;
  }
  /** set the fields value: PrimaryUnits (ADJ.primary_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrimaryUnits") 
  public void setPrimaryUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrimaryUnits", "setPrimaryUnits");
    }
    this.PrimaryUnits = value;
    this._PrimaryUnitsSet = true;
  }

  /** Retrieves the PrimaryUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrimaryUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnits field
   */
   public String getPrimaryUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrimaryUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrimaryUnits field from a formatted string
   *
   * @param _value the PrimaryUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrimaryUnits field
   */
   public void setPrimaryUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrimaryUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsFromFormattedString");
   }

  /** get the value of the field: PrimaryUnits (ADJ.primary_units)
   * @return BigInteger the value
   */
  public BigInteger getPrimaryUnits () {
    return this.PrimaryUnits;
  }
  /** Change the field to not being actively set: PrimaryUnits (ADJ.primary_units)
   */
  public void unsetPrimaryUnits () {
    this._PrimaryUnitsSet = false;
  }
  /** See if the field is actively set: PrimaryUnits (ADJ.primary_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrimaryUnits () {
    return this._PrimaryUnitsSet;
  }
  /** set the fields value: EffectiveDate (ADJ.effective_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EffectiveDate") 
  public void setEffectiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EffectiveDate", "setEffectiveDate");
    }
    this.EffectiveDate = value;
    this._EffectiveDateSet = true;
  }

  /** Retrieves the EffectiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EffectiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDate field
   */
   public String getEffectiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getEffectiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EffectiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the EffectiveDate field from a formatted string
   *
   * @param _value the EffectiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EffectiveDate field
   */
   public void setEffectiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEffectiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EffectiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEffectiveDateFromFormattedString");
   }

  /**
   * Retrieves the EffectiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EffectiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EffectiveDate field
   */
  public String getEffectiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEffectiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEffectiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EffectiveDate field value from a formatted date/time string
   *
   * @param _value the EffectiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EffectiveDate field
   */
  public void setEffectiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEffectiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEffectiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EffectiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEffectiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EffectiveDate (ADJ.effective_date)
   * @return Date the value
   */
  public Date getEffectiveDate () {
    return this.EffectiveDate;
  }
  /** Change the field to not being actively set: EffectiveDate (ADJ.effective_date)
   */
  public void unsetEffectiveDate () {
    this._EffectiveDateSet = false;
  }
  /** See if the field is actively set: EffectiveDate (ADJ.effective_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetEffectiveDate () {
    return this._EffectiveDateSet;
  }
  /** set the fields value: CurrencyCode (ADJ.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
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

  /** get the value of the field: CurrencyCode (ADJ.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (ADJ.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (ADJ.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: AdjReasonCode (ADJ.adj_reason_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AdjReasonCode") 
  public void setAdjReasonCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AdjReasonCode", "setAdjReasonCode");
    }
    this.AdjReasonCode = value;
    this._AdjReasonCodeSet = true;
  }

  /** Retrieves the AdjReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjReasonCode field
   */
   public String getAdjReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjReasonCode field from a formatted string
   *
   * @param _value the AdjReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjReasonCode field
   */
   public void setAdjReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjReasonCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AdjReasonCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AdjReasonCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCode field
   */

  public String getAdjReasonCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAdjReasonCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAdjReasonCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AdjReasonCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AdjReasonCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AdjReasonCode field
   */
  public Enumeration getAdjReasonCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjReasonCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AdjustmentReason", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjReasonCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjReasonCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AdjReasonCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAdjReasonCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAdjReasonCodeEnumeration(_locale);
      this.setAdjReasonCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjReasonCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjReasonCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjReasonCodeFromDisplayValue");
  }

  /** get the value of the field: AdjReasonCode (ADJ.adj_reason_code)
   * @return Integer the value
   */
  public Integer getAdjReasonCode () {
    return this.AdjReasonCode;
  }
  /** Change the field to not being actively set: AdjReasonCode (ADJ.adj_reason_code)
   */
  public void unsetAdjReasonCode () {
    this._AdjReasonCodeSet = false;
  }
  /** See if the field is actively set: AdjReasonCode (ADJ.adj_reason_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjReasonCode () {
    return this._AdjReasonCodeSet;
  }
  /** set the fields value: TotalAmt (ADJ.total_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TotalAmt") 
  public void setTotalAmt (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TotalAmt", "setTotalAmt");
    }
    this.TotalAmt = value;
    this._TotalAmtSet = true;
  }

  /** Retrieves the TotalAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TotalAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmt field
   */
   public String getTotalAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTotalAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TotalAmt field from a formatted string
   *
   * @param _value the TotalAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAmt field
   */
   public void setTotalAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTotalAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TotalAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFromFormattedString");
   }

  /**
   * Retrieves the TotalAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalAmt field
   */
  public String getTotalAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTotalAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TotalAmt field value from a formatted currency string
   *
   * @param _value the TotalAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TotalAmt field
   */
  public void setTotalAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTotalAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: TotalAmt (ADJ.total_amt)
   * @return BigInteger the value
   */
  public BigInteger getTotalAmt () {
    return this.TotalAmt;
  }
  /** Change the field to not being actively set: TotalAmt (ADJ.total_amt)
   */
  public void unsetTotalAmt () {
    this._TotalAmtSet = false;
  }
  /** See if the field is actively set: TotalAmt (ADJ.total_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTotalAmt () {
    return this._TotalAmtSet;
  }
  /** set the fields value: AdjTransGroup
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAdjTransGroup (Integer value) throws ServiceException
  {
    this.AdjTransGroup = value;
    this._AdjTransGroupSet = true;
  }
  /** get the value of the field: AdjTransGroup
   * @return Integer the value
   */
  public Integer getAdjTransGroup ()
  {
    return this.AdjTransGroup;
  }
  /** Change the field to not being actively set: AdjTransGroup
   */
  public void unsetAdjTransGroup ()
  {
    this._AdjTransGroupSet = false;
  }
  /** See if the field is actively set: AdjTransGroup
   * @return boolean whether the field is actively set
   */
  public boolean issetAdjTransGroup ()
  {
    return this._AdjTransGroupSet;
  }

  /** Retrieves the AdjTransGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AdjTransGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTransGroup field
   */
   public String getAdjTransGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTransGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTransGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getAdjTransGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTransGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTransGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the AdjTransGroup field from a formatted string
   *
   * @param _value the AdjTransGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AdjTransGroup field
   */
   public void setAdjTransGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTransGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAdjTransGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AdjTransGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTransGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTransGroupFromFormattedString");
   }

  /** set the fields value: IsMax
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setIsMax (Integer value) throws ServiceException
  {
    this.IsMax = value;
    this._IsMaxSet = true;
  }
  /** get the value of the field: IsMax
   * @return Integer the value
   */
  public Integer getIsMax ()
  {
    return this.IsMax;
  }
  /** Change the field to not being actively set: IsMax
   */
  public void unsetIsMax ()
  {
    this._IsMaxSet = false;
  }
  /** See if the field is actively set: IsMax
   * @return boolean whether the field is actively set
   */
  public boolean issetIsMax ()
  {
    return this._IsMaxSet;
  }

  /** Retrieves the IsMax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsMax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsMax field
   */
   public String getIsMaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsMaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsMaxAsFormattedString");
       return fmtMgr.formatNumber(this.getIsMax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsMax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsMaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsMax field from a formatted string
   *
   * @param _value the IsMax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsMax field
   */
   public void setIsMaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsMaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsMax(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsMax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsMaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsMaxFromFormattedString");
   }

  public String toString() {
    return BulkAdjustmentObjectHelper.toMap(this, null).toString();
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
    
  /** ADJ.adj_trans_code field */
    if(!nonNullOnly || (TransCode != null))  _TransCodeSet = flag;
  /** ADJ.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  /** ADJ.primary_units_type field */
    if(!nonNullOnly || (PrimaryUnitsType != null))  _PrimaryUnitsTypeSet = flag;
  /** ADJ.primary_units field */
    if(!nonNullOnly || (PrimaryUnits != null))  _PrimaryUnitsSet = flag;
  /** ADJ.effective_date field */
    if(!nonNullOnly || (EffectiveDate != null))  _EffectiveDateSet = flag;
  /** ADJ.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** ADJ.adj_reason_code field */
    if(!nonNullOnly || (AdjReasonCode != null))  _AdjReasonCodeSet = flag;
  /** ADJ.total_amt field */
    if(!nonNullOnly || (TotalAmt != null))  _TotalAmtSet = flag;
  /** AdjTransGroup field */
    if (!nonNullOnly || (AdjTransGroup != null)) _AdjTransGroupSet = flag;
  /** IsMax field */
    if (!nonNullOnly || (IsMax != null)) _IsMaxSet = flag;
  }
}
