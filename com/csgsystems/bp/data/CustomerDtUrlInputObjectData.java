/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlInputObjectData.java
 * Definition File: Customer/CustomerDtUrl.xml
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
  
/** CustomerDtUrlInputObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CustomerDtUrlInputObjectData extends BaseObjectData implements Serializable
{

  /** AccountNo field */
  public    Integer AccountNo  = null;
  protected boolean _AccountNoSet = false;
  /** StatementDate field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** InvoiceType field */
  public    Integer InvoiceType  = null;
  protected boolean _InvoiceTypeSet = false;
  private String _objName = "CustomerDtUrlInputObjectData";
  /** Default constructor */
  public CustomerDtUrlInputObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CustomerDtUrlInputObjectData (CustomerDtUrlInputObjectData other)
  {

    if (other == null) return;
    this.AccountNo = other.AccountNo;
    this._AccountNoSet = other._AccountNoSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.InvoiceType = other.InvoiceType;
    this._InvoiceTypeSet = other._InvoiceTypeSet;
  }

  /** set the fields value: AccountNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountNo", "setAccountNo");
    }
    this.AccountNo = value;
    this._AccountNoSet = true;
  }
  /** get the value of the field: AccountNo
   * @return Integer the value
   */
  public Integer getAccountNo ()
  {
    return this.AccountNo;
  }
  /** Change the field to not being actively set: AccountNo
   */
  public void unsetAccountNo ()
  {
    this._AccountNoSet = false;
  }
  /** See if the field is actively set: AccountNo
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountNo ()
  {
    return this._AccountNoSet;
  }

  /** Retrieves the AccountNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountNo field
   */
   public String getAccountNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountNoAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountNo field from a formatted string
   *
   * @param _value the AccountNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountNo field
   */
   public void setAccountNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountNoFromFormattedString");
   }

  /** set the fields value: StatementDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setStatementDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatementDate", "setStatementDate");
    }
    this.StatementDate = value;
    this._StatementDateSet = true;
  }
  /** get the value of the field: StatementDate
   * @return Date the value
   */
  public Date getStatementDate ()
  {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate
   */
  public void unsetStatementDate ()
  {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate ()
  {
    return this._StatementDateSet;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: InvoiceType
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setInvoiceType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InvoiceType", "setInvoiceType");
    }
    this.InvoiceType = value;
    this._InvoiceTypeSet = true;
  }
  /** get the value of the field: InvoiceType
   * @return Integer the value
   */
  public Integer getInvoiceType ()
  {
    return this.InvoiceType;
  }
  /** Change the field to not being actively set: InvoiceType
   */
  public void unsetInvoiceType ()
  {
    this._InvoiceTypeSet = false;
  }
  /** See if the field is actively set: InvoiceType
   * @return boolean whether the field is actively set
   */
  public boolean issetInvoiceType ()
  {
    return this._InvoiceTypeSet;
  }

  /** Retrieves the InvoiceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InvoiceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InvoiceType field
   */
   public String getInvoiceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getInvoiceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInvoiceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the InvoiceType field from a formatted string
   *
   * @param _value the InvoiceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InvoiceType field
   */
   public void setInvoiceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInvoiceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInvoiceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInvoiceTypeFromFormattedString");
   }

  public String toString() {
    return CustomerDtUrlInputObjectHelper.toMap(this, null).toString();
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
    
  /** AccountNo field */
    if (!nonNullOnly || (AccountNo != null)) _AccountNoSet = flag;
  /** StatementDate field */
    if (!nonNullOnly || (StatementDate != null)) _StatementDateSet = flag;
  /** InvoiceType field */
    if (!nonNullOnly || (InvoiceType != null)) _InvoiceTypeSet = flag;
  }
}
