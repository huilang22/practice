/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceLocateXIDObjectData.java
 * Definition File: Catalog/AccountLocate.xml
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
  
/** ServiceLocateXIDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ServiceLocateXIDObjectData extends AccountLocateObjectData  implements Serializable
{

  /** EXTERNAL_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** EXTERNAL_ID_ACCT_MAP.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** EXTERNAL_ID_ACCT_MAP.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.external_id field */
  public    String ServiceExternalId  = null;
  protected boolean _ServiceExternalIdSet = false;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type field */
  public    Integer ServiceExternalIdType  = null;
  protected boolean _ServiceExternalIdTypeSet = false;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.active_date field */
  public    Date ServiceIdActiveDate  = null;
  protected boolean _ServiceIdActiveDateSet = false;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date field */
  public    Date ServiceIdInactiveDate  = null;
  protected boolean _ServiceIdInactiveDateSet = false;
  private String _objName = "ServiceLocateXIDObjectData";
  /** Default constructor */
  public ServiceLocateXIDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ServiceLocateXIDObjectData (ServiceLocateXIDObjectData other)
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
    this.ServiceExternalId = other.ServiceExternalId;
    this._ServiceExternalIdSet = other._ServiceExternalIdSet;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this._ServiceExternalIdTypeSet = other._ServiceExternalIdTypeSet;
    this.ServiceIdActiveDate = other.ServiceIdActiveDate;
    this._ServiceIdActiveDateSet = other._ServiceIdActiveDateSet;
    this.ServiceIdInactiveDate = other.ServiceIdInactiveDate;
    this._ServiceIdInactiveDateSet = other._ServiceIdInactiveDateSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public ServiceLocateXIDObjectData (AccountLocateObjectData other)
  {
    super (other);

  }

  /** set the fields value: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
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

  /** get the value of the field: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
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

  /** get the value of the field: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
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

  /** get the value of the field: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (EXTERNAL_ID_ACCT_MAP.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
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

  /** get the value of the field: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (EXTERNAL_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  /** set the fields value: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalId") 
  public void setServiceExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    this.ServiceExternalId = value;
    this._ServiceExternalIdSet = true;
  }

  /** Retrieves the ServiceExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalId field
   */
   public String getServiceExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalId field from a formatted string
   *
   * @param _value the ServiceExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalId field
   */
   public void setServiceExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id)
   * @return String the value
   */
  public String getServiceExternalId () {
    return this.ServiceExternalId;
  }
  /** Change the field to not being actively set: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id)
   */
  public void unsetServiceExternalId () {
    this._ServiceExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceExternalId (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalId () {
    return this._ServiceExternalIdSet;
  }
  /** set the fields value: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceExternalIdType") 
  public void setServiceExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalIdType", "setServiceExternalIdType");
    }
    this.ServiceExternalIdType = value;
    this._ServiceExternalIdTypeSet = true;
  }

  /** Retrieves the ServiceExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdType field
   */
   public String getServiceExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalIdType field from a formatted string
   *
   * @param _value the ServiceExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalIdType field
   */
   public void setServiceExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the value
   */
  public Integer getServiceExternalIdType () {
    return this.ServiceExternalIdType;
  }
  /** Change the field to not being actively set: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type)
   */
  public void unsetServiceExternalIdType () {
    this._ServiceExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceExternalIdType (EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalIdType () {
    return this._ServiceExternalIdTypeSet;
  }
  /** set the fields value: ServiceIdActiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceIdActiveDate") 
  public void setServiceIdActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceIdActiveDate", "setServiceIdActiveDate");
    }
    this.ServiceIdActiveDate = value;
    this._ServiceIdActiveDateSet = true;
  }

  /** Retrieves the ServiceIdActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceIdActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceIdActiveDate field
   */
   public String getServiceIdActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceIdActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getServiceIdActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceIdActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceIdActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceIdActiveDate field from a formatted string
   *
   * @param _value the ServiceIdActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceIdActiveDate field
   */
   public void setServiceIdActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceIdActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceIdActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceIdActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceIdActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ServiceIdActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceIdActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceIdActiveDate field
   */
  public String getServiceIdActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceIdActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getServiceIdActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceIdActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceIdActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceIdActiveDate field value from a formatted date/time string
   *
   * @param _value the ServiceIdActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceIdActiveDate field
   */
  public void setServiceIdActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceIdActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setServiceIdActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceIdActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceIdActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ServiceIdActiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.active_date)
   * @return Date the value
   */
  public Date getServiceIdActiveDate () {
    return this.ServiceIdActiveDate;
  }
  /** Change the field to not being actively set: ServiceIdActiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.active_date)
   */
  public void unsetServiceIdActiveDate () {
    this._ServiceIdActiveDateSet = false;
  }
  /** See if the field is actively set: ServiceIdActiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceIdActiveDate () {
    return this._ServiceIdActiveDateSet;
  }
  /** set the fields value: ServiceIdInactiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceIdInactiveDate") 
  public void setServiceIdInactiveDate (Date value) throws ServiceException
  {
    this.ServiceIdInactiveDate = value;
    this._ServiceIdInactiveDateSet = true;
  }

  /** Retrieves the ServiceIdInactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceIdInactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceIdInactiveDate field
   */
   public String getServiceIdInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceIdInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getServiceIdInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceIdInactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceIdInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceIdInactiveDate field from a formatted string
   *
   * @param _value the ServiceIdInactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceIdInactiveDate field
   */
   public void setServiceIdInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceIdInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceIdInactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceIdInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceIdInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the ServiceIdInactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceIdInactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceIdInactiveDate field
   */
  public String getServiceIdInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceIdInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceIdInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getServiceIdInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceIdInactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceIdInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceIdInactiveDate field value from a formatted date/time string
   *
   * @param _value the ServiceIdInactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceIdInactiveDate field
   */
  public void setServiceIdInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceIdInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setServiceIdInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceIdInactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceIdInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ServiceIdInactiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date)
   * @return Date the value
   */
  public Date getServiceIdInactiveDate () {
    return this.ServiceIdInactiveDate;
  }
  /** Change the field to not being actively set: ServiceIdInactiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date)
   */
  public void unsetServiceIdInactiveDate () {
    this._ServiceIdInactiveDateSet = false;
  }
  /** See if the field is actively set: ServiceIdInactiveDate (EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceIdInactiveDate () {
    return this._ServiceIdInactiveDateSet;
  }
  public String toString() {
    return ServiceLocateXIDObjectHelper.toMap(this, null).toString();
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
    
  /** EXTERNAL_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.external_id field */
    if(!nonNullOnly || (ServiceExternalId != null))  _ServiceExternalIdSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.external_id_type field */
    if(!nonNullOnly || (ServiceExternalIdType != null))  _ServiceExternalIdTypeSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.active_date field */
    if(!nonNullOnly || (ServiceIdActiveDate != null))  _ServiceIdActiveDateSet = flag;
  /** EXTERNAL_ID_EQUIP_MAP_VIEW.inactive_date field */
    if(!nonNullOnly || (ServiceIdInactiveDate != null))  _ServiceIdInactiveDateSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
