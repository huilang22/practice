/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountXIDObjectData.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** AccountXIDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountXIDObjectData extends AccountObjectData  implements Serializable
{

  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** CUSTOMER_ID_ACCT_MAP.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String ParentAccountExternalId  = null;
  protected boolean _ParentAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer ParentAccountExternalIdType  = null;
  protected boolean _ParentAccountExternalIdTypeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String HierarchyAccountExternalId  = null;
  protected boolean _HierarchyAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer HierarchyAccountExternalIdType  = null;
  protected boolean _HierarchyAccountExternalIdTypeSet = false;
  private String _objName = "AccountXIDObjectData";
  /** Default constructor */
  public AccountXIDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountXIDObjectData (AccountXIDObjectData other)
  {

    super (other);

    if (other == null) return;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.ParentAccountExternalId = other.ParentAccountExternalId;
    this._ParentAccountExternalIdSet = other._ParentAccountExternalIdSet;
    this.ParentAccountExternalIdType = other.ParentAccountExternalIdType;
    this._ParentAccountExternalIdTypeSet = other._ParentAccountExternalIdTypeSet;
    this.HierarchyAccountExternalId = other.HierarchyAccountExternalId;
    this._HierarchyAccountExternalIdSet = other._HierarchyAccountExternalIdSet;
    this.HierarchyAccountExternalIdType = other.HierarchyAccountExternalIdType;
    this._HierarchyAccountExternalIdTypeSet = other._HierarchyAccountExternalIdTypeSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public AccountXIDObjectData (AccountObjectData other)
  {
    super (other);

  }

  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */

  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDate") 
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    this.ActiveDate = value;
    this._ActiveDateSet = true;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountExternalId") 
  public void setParentAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountExternalId", "setParentAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ParentAccountExternalId", "setParentAccountExternalId");
    }
    this.ParentAccountExternalId = value;
    this._ParentAccountExternalIdSet = true;
  }

  /** Retrieves the ParentAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalId field
   */
   public String getParentAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getParentAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountExternalId field from a formatted string
   *
   * @param _value the ParentAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountExternalId field
   */
   public void setParentAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getParentAccountExternalId () {
    return this.ParentAccountExternalId;
  }
  /** Change the field to not being actively set: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetParentAccountExternalId () {
    this._ParentAccountExternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountExternalId () {
    return this._ParentAccountExternalIdSet;
  }
  /** set the fields value: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountExternalIdType") 
  public void setParentAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountExternalIdType", "setParentAccountExternalIdType");
    }
    this.ParentAccountExternalIdType = value;
    this._ParentAccountExternalIdTypeSet = true;
  }

  /** Retrieves the ParentAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountExternalIdType field
   */
   public String getParentAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountExternalIdType field from a formatted string
   *
   * @param _value the ParentAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountExternalIdType field
   */
   public void setParentAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ParentAccountExternalIdType field
   */

  public String getParentAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getParentAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getParentAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ParentAccountExternalIdType field
   */
  public Enumeration getParentAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ParentAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setParentAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getParentAccountExternalIdTypeEnumeration(_locale);
      this.setParentAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getParentAccountExternalIdType () {
    return this.ParentAccountExternalIdType;
  }
  /** Change the field to not being actively set: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetParentAccountExternalIdType () {
    this._ParentAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountExternalIdType () {
    return this._ParentAccountExternalIdTypeSet;
  }
  /** set the fields value: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAccountExternalId") 
  public void setHierarchyAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HierarchyAccountExternalId", "setHierarchyAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "HierarchyAccountExternalId", "setHierarchyAccountExternalId");
    }
    this.HierarchyAccountExternalId = value;
    this._HierarchyAccountExternalIdSet = true;
  }

  /** Retrieves the HierarchyAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalId field
   */
   public String getHierarchyAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getHierarchyAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAccountExternalId field from a formatted string
   *
   * @param _value the HierarchyAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAccountExternalId field
   */
   public void setHierarchyAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getHierarchyAccountExternalId () {
    return this.HierarchyAccountExternalId;
  }
  /** Change the field to not being actively set: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetHierarchyAccountExternalId () {
    this._HierarchyAccountExternalIdSet = false;
  }
  /** See if the field is actively set: HierarchyAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAccountExternalId () {
    return this._HierarchyAccountExternalIdSet;
  }
  /** set the fields value: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAccountExternalIdType") 
  public void setHierarchyAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HierarchyAccountExternalIdType", "setHierarchyAccountExternalIdType");
    }
    this.HierarchyAccountExternalIdType = value;
    this._HierarchyAccountExternalIdTypeSet = true;
  }

  /** Retrieves the HierarchyAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAccountExternalIdType field
   */
   public String getHierarchyAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAccountExternalIdType field from a formatted string
   *
   * @param _value the HierarchyAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAccountExternalIdType field
   */
   public void setHierarchyAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated HierarchyAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the HierarchyAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the HierarchyAccountExternalIdType field
   */

  public String getHierarchyAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getHierarchyAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getHierarchyAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated HierarchyAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the HierarchyAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the HierarchyAccountExternalIdType field
   */
  public Enumeration getHierarchyAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated HierarchyAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setHierarchyAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getHierarchyAccountExternalIdTypeEnumeration(_locale);
      this.setHierarchyAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("HierarchyAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setHierarchyAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getHierarchyAccountExternalIdType () {
    return this.HierarchyAccountExternalIdType;
  }
  /** Change the field to not being actively set: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetHierarchyAccountExternalIdType () {
    this._HierarchyAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: HierarchyAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAccountExternalIdType () {
    return this._HierarchyAccountExternalIdTypeSet;
  }
  public String toString() {
    return AccountXIDObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (ParentAccountExternalId != null))  _ParentAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (ParentAccountExternalIdType != null))  _ParentAccountExternalIdTypeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (HierarchyAccountExternalId != null))  _HierarchyAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (HierarchyAccountExternalIdType != null))  _HierarchyAccountExternalIdTypeSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
