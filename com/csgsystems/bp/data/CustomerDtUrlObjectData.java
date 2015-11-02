/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlObjectData.java
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
  
/** CustomerDtUrlObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CustomerDtUrlObjectData extends BaseObjectData implements Serializable
{

  /** BillRefNo field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** BillRefResets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** PaymentDueDate field */
  public    Date PaymentDueDate  = null;
  protected boolean _PaymentDueDateSet = false;
  /** PrepDate field */
  public    Date PrepDate  = null;
  protected boolean _PrepDateSet = false;
  /** DisplayFilename field */
  public    String DisplayFilename  = null;
  protected boolean _DisplayFilenameSet = false;
  /** CustomerDocumentUrl field */
  public    String CustomerDocumentUrl  = null;
  protected boolean _CustomerDocumentUrlSet = false;
  /** DocumentId field */
  public    Integer DocumentId  = null;
  protected boolean _DocumentIdSet = false;
  /** DocumentTypeid field */
  public    Integer DocumentTypeid  = null;
  protected boolean _DocumentTypeidSet = false;
  private String _objName = "CustomerDtUrlObjectData";
  /** Default constructor */
  public CustomerDtUrlObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CustomerDtUrlObjectData (CustomerDtUrlObjectData other)
  {

    if (other == null) return;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.PaymentDueDate = other.PaymentDueDate;
    this._PaymentDueDateSet = other._PaymentDueDateSet;
    this.PrepDate = other.PrepDate;
    this._PrepDateSet = other._PrepDateSet;
    this.DisplayFilename = other.DisplayFilename;
    this._DisplayFilenameSet = other._DisplayFilenameSet;
    this.CustomerDocumentUrl = other.CustomerDocumentUrl;
    this._CustomerDocumentUrlSet = other._CustomerDocumentUrlSet;
    this.DocumentId = other.DocumentId;
    this._DocumentIdSet = other._DocumentIdSet;
    this.DocumentTypeid = other.DocumentTypeid;
    this._DocumentTypeidSet = other._DocumentTypeidSet;
  }

  /** set the fields value: BillRefNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    this.BillRefNo = value;
    this._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo
   * @return Integer the value
   */
  public Integer getBillRefNo ()
  {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo
   */
  public void unsetBillRefNo ()
  {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo ()
  {
    return this._BillRefNoSet;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** set the fields value: BillRefResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets
   * @return Integer the value
   */
  public Integer getBillRefResets ()
  {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets
   */
  public void unsetBillRefResets ()
  {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets ()
  {
    return this._BillRefResetsSet;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** set the fields value: PaymentDueDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPaymentDueDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PaymentDueDate", "setPaymentDueDate");
    }
    this.PaymentDueDate = value;
    this._PaymentDueDateSet = true;
  }
  /** get the value of the field: PaymentDueDate
   * @return Date the value
   */
  public Date getPaymentDueDate ()
  {
    return this.PaymentDueDate;
  }
  /** Change the field to not being actively set: PaymentDueDate
   */
  public void unsetPaymentDueDate ()
  {
    this._PaymentDueDateSet = false;
  }
  /** See if the field is actively set: PaymentDueDate
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentDueDate ()
  {
    return this._PaymentDueDateSet;
  }

  /** Retrieves the PaymentDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
   public String getPaymentDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getPaymentDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentDueDate field from a formatted string
   *
   * @param _value the PaymentDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
   public void setPaymentDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFromFormattedString");
   }

  /**
   * Retrieves the PaymentDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
  public String getPaymentDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPaymentDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDate field value from a formatted date/time string
   *
   * @param _value the PaymentDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
  public void setPaymentDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPaymentDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: PrepDate
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setPrepDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrepDate", "setPrepDate");
    }
    this.PrepDate = value;
    this._PrepDateSet = true;
  }
  /** get the value of the field: PrepDate
   * @return Date the value
   */
  public Date getPrepDate ()
  {
    return this.PrepDate;
  }
  /** Change the field to not being actively set: PrepDate
   */
  public void unsetPrepDate ()
  {
    this._PrepDateSet = false;
  }
  /** See if the field is actively set: PrepDate
   * @return boolean whether the field is actively set
   */
  public boolean issetPrepDate ()
  {
    return this._PrepDateSet;
  }

  /** Retrieves the PrepDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrepDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
   public String getPrepDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedString");
       return fmtMgr.formatDate(this.getPrepDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrepDate field from a formatted string
   *
   * @param _value the PrepDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
   public void setPrepDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrepDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrepDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepDateFromFormattedString");
   }

  /**
   * Retrieves the PrepDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepDate field
   */
  public String getPrepDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPrepDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrepDate field value from a formatted date/time string
   *
   * @param _value the PrepDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrepDate field
   */
  public void setPrepDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPrepDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: DisplayFilename
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDisplayFilename (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayFilename", "setDisplayFilename");
    }
    this.DisplayFilename = value;
    this._DisplayFilenameSet = true;
  }
  /** get the value of the field: DisplayFilename
   * @return String the value
   */
  public String getDisplayFilename ()
  {
    return this.DisplayFilename;
  }
  /** Change the field to not being actively set: DisplayFilename
   */
  public void unsetDisplayFilename ()
  {
    this._DisplayFilenameSet = false;
  }
  /** See if the field is actively set: DisplayFilename
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayFilename ()
  {
    return this._DisplayFilenameSet;
  }

  /** Retrieves the DisplayFilename field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayFilename field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayFilename field
   */
   public String getDisplayFilenameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayFilenameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayFilenameAsFormattedString");
       return fmtMgr.formatString(this.getDisplayFilename());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayFilenameAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayFilename field from a formatted string
   *
   * @param _value the DisplayFilename field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayFilename field
   */
   public void setDisplayFilenameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayFilenameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayFilename(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayFilename");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayFilenameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayFilenameFromFormattedString");
   }

  /** set the fields value: CustomerDocumentUrl
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCustomerDocumentUrl (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CustomerDocumentUrl", "setCustomerDocumentUrl");
    }
    this.CustomerDocumentUrl = value;
    this._CustomerDocumentUrlSet = true;
  }
  /** get the value of the field: CustomerDocumentUrl
   * @return String the value
   */
  public String getCustomerDocumentUrl ()
  {
    return this.CustomerDocumentUrl;
  }
  /** Change the field to not being actively set: CustomerDocumentUrl
   */
  public void unsetCustomerDocumentUrl ()
  {
    this._CustomerDocumentUrlSet = false;
  }
  /** See if the field is actively set: CustomerDocumentUrl
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerDocumentUrl ()
  {
    return this._CustomerDocumentUrlSet;
  }

  /** Retrieves the CustomerDocumentUrl field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerDocumentUrl field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerDocumentUrl field
   */
   public String getCustomerDocumentUrlAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentUrlAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerDocumentUrlAsFormattedString");
       return fmtMgr.formatString(this.getCustomerDocumentUrl());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerDocumentUrl");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerDocumentUrlAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerDocumentUrl field from a formatted string
   *
   * @param _value the CustomerDocumentUrl field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerDocumentUrl field
   */
   public void setCustomerDocumentUrlFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerDocumentUrlFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerDocumentUrl(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerDocumentUrl");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerDocumentUrlFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerDocumentUrlFromFormattedString");
   }

  /** set the fields value: DocumentId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentId", "setDocumentId");
    }
    this.DocumentId = value;
    this._DocumentIdSet = true;
  }
  /** get the value of the field: DocumentId
   * @return Integer the value
   */
  public Integer getDocumentId ()
  {
    return this.DocumentId;
  }
  /** Change the field to not being actively set: DocumentId
   */
  public void unsetDocumentId ()
  {
    this._DocumentIdSet = false;
  }
  /** See if the field is actively set: DocumentId
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentId ()
  {
    return this._DocumentIdSet;
  }

  /** Retrieves the DocumentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentId field
   */
   public String getDocumentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentId field from a formatted string
   *
   * @param _value the DocumentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentId field
   */
   public void setDocumentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentIdFromFormattedString");
   }

  /** set the fields value: DocumentTypeid
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setDocumentTypeid (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DocumentTypeid", "setDocumentTypeid");
    }
    this.DocumentTypeid = value;
    this._DocumentTypeidSet = true;
  }
  /** get the value of the field: DocumentTypeid
   * @return Integer the value
   */
  public Integer getDocumentTypeid ()
  {
    return this.DocumentTypeid;
  }
  /** Change the field to not being actively set: DocumentTypeid
   */
  public void unsetDocumentTypeid ()
  {
    this._DocumentTypeidSet = false;
  }
  /** See if the field is actively set: DocumentTypeid
   * @return boolean whether the field is actively set
   */
  public boolean issetDocumentTypeid ()
  {
    return this._DocumentTypeidSet;
  }

  /** Retrieves the DocumentTypeid field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DocumentTypeid field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentTypeid field
   */
   public String getDocumentTypeidAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeidAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentTypeidAsFormattedString");
       return fmtMgr.formatNumber(this.getDocumentTypeid(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentTypeidAsFormattedString");
       throw x;
     }
   }
  /** Sets the DocumentTypeid field from a formatted string
   *
   * @param _value the DocumentTypeid field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DocumentTypeid field
   */
   public void setDocumentTypeidFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentTypeidFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDocumentTypeid(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DocumentTypeid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentTypeidFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentTypeidFromFormattedString");
   }

  public String toString() {
    return CustomerDtUrlObjectHelper.toMap(this, null).toString();
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
    
  /** BillRefNo field */
    if (!nonNullOnly || (BillRefNo != null)) _BillRefNoSet = flag;
  /** BillRefResets field */
    if (!nonNullOnly || (BillRefResets != null)) _BillRefResetsSet = flag;
  /** PaymentDueDate field */
    if (!nonNullOnly || (PaymentDueDate != null)) _PaymentDueDateSet = flag;
  /** PrepDate field */
    if (!nonNullOnly || (PrepDate != null)) _PrepDateSet = flag;
  /** DisplayFilename field */
    if (!nonNullOnly || (DisplayFilename != null)) _DisplayFilenameSet = flag;
  /** CustomerDocumentUrl field */
    if (!nonNullOnly || (CustomerDocumentUrl != null)) _CustomerDocumentUrlSet = flag;
  /** DocumentId field */
    if (!nonNullOnly || (DocumentId != null)) _DocumentIdSet = flag;
  /** DocumentTypeid field */
    if (!nonNullOnly || (DocumentTypeid != null)) _DocumentTypeidSet = flag;
  }
}
