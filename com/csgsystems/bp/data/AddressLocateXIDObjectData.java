/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AddressLocateXIDObjectData.java
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
  
/** AddressLocateXIDObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AddressLocateXIDObjectData extends AccountLocateObjectData  implements Serializable
{

  /** SERVICE_ADDRESS_ASSOC.address_id field */
  public    BigInteger AddressId  = null;
  protected boolean _AddressIdSet = false;
  /** SERVICE_ADDRESS_ASSOC.emf_config_id field */
  public    Integer EmfConfigId  = null;
  protected boolean _EmfConfigIdSet = false;
  /** EXTERNAL_ID_ACCT_MAP.external_id field */
  public    String ExternalId  = null;
  protected boolean _ExternalIdSet = false;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
  public    Integer ExternalIdType  = null;
  protected boolean _ExternalIdTypeSet = false;
  /** EXTERNAL_ID_ACCT_MAP.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** EXTERNAL_ID_ACCT_MAP.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  /** SERVICE_ADDRESS_ASSOC.active_dt field */
  public    Date AddressAssocActiveDt  = null;
  protected boolean _AddressAssocActiveDtSet = false;
  /** SERVICE_ADDRESS_ASSOC.inactive_dt field */
  public    Date AddressAssocInactiveDt  = null;
  protected boolean _AddressAssocInactiveDtSet = false;
  private String _objName = "AddressLocateXIDObjectData";
  /** Default constructor */
  public AddressLocateXIDObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AddressLocateXIDObjectData (AddressLocateXIDObjectData other)
  {

    super (other);

    if (other == null) return;
    this.AddressId = other.AddressId;
    this._AddressIdSet = other._AddressIdSet;
    this.EmfConfigId = other.EmfConfigId;
    this._EmfConfigIdSet = other._EmfConfigIdSet;
    this.ExternalId = other.ExternalId;
    this._ExternalIdSet = other._ExternalIdSet;
    this.ExternalIdType = other.ExternalIdType;
    this._ExternalIdTypeSet = other._ExternalIdTypeSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
    this.AddressAssocActiveDt = other.AddressAssocActiveDt;
    this._AddressAssocActiveDtSet = other._AddressAssocActiveDtSet;
    this.AddressAssocInactiveDt = other.AddressAssocInactiveDt;
    this._AddressAssocInactiveDtSet = other._AddressAssocInactiveDtSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public AddressLocateXIDObjectData (AccountLocateObjectData other)
  {
    super (other);

  }

  /** set the fields value: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressId") 
  public void setAddressId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddressId", "setAddressId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressId", "setAddressId");
    }
    this.AddressId = value;
    this._AddressIdSet = true;
  }

  /** Retrieves the AddressId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressId field
   */
   public String getAddressIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAddressId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressId field from a formatted string
   *
   * @param _value the AddressId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressId field
   */
   public void setAddressIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressIdFromFormattedString");
   }

  /** get the value of the field: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return BigInteger the value
   */
  public BigInteger getAddressId () {
    return this.AddressId;
  }
  /** Change the field to not being actively set: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   */
  public void unsetAddressId () {
    this._AddressIdSet = false;
  }
  /** See if the field is actively set: AddressId (SERVICE_ADDRESS_ASSOC.address_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressId () {
    return this._AddressIdSet;
  }
  /** set the fields value: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmfConfigId") 
  public void setEmfConfigId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfConfigId", "setEmfConfigId");
    }
    this.EmfConfigId = value;
    this._EmfConfigIdSet = true;
  }

  /** Retrieves the EmfConfigId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfConfigId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigId field
   */
   public String getEmfConfigIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfConfigId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfConfigId field from a formatted string
   *
   * @param _value the EmfConfigId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfConfigId field
   */
   public void setEmfConfigIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfConfigId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFromFormattedString");
   }

  /** get the value of the field: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    return this.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   */
  public void unsetEmfConfigId () {
    this._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (SERVICE_ADDRESS_ASSOC.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    return this._EmfConfigIdSet;
  }
  /** set the fields value: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalId") 
  public void setExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalId", "setExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalId", "setExternalId");
    }
    this.ExternalId = value;
    this._ExternalIdSet = true;
  }

  /** Retrieves the ExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalId field
   */
   public String getExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalId field from a formatted string
   *
   * @param _value the ExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalId field
   */
   public void setExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFromFormattedString");
   }

  /** get the value of the field: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getExternalId () {
    return this.ExternalId;
  }
  /** Change the field to not being actively set: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   */
  public void unsetExternalId () {
    this._ExternalIdSet = false;
  }
  /** See if the field is actively set: ExternalId (EXTERNAL_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalId () {
    return this._ExternalIdSet;
  }
  /** set the fields value: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalIdType") 
  public void setExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalIdType", "setExternalIdType");
    }
    this.ExternalIdType = value;
    this._ExternalIdTypeSet = true;
  }

  /** Retrieves the ExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdType field
   */
   public String getExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalIdType field from a formatted string
   *
   * @param _value the ExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalIdType field
   */
   public void setExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getExternalIdType () {
    return this.ExternalIdType;
  }
  /** Change the field to not being actively set: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   */
  public void unsetExternalIdType () {
    this._ExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ExternalIdType (EXTERNAL_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalIdType () {
    return this._ExternalIdTypeSet;
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
  /** set the fields value: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressAssocActiveDt") 
  public void setAddressAssocActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddressAssocActiveDt", "setAddressAssocActiveDt");
    }
    this.AddressAssocActiveDt = value;
    this._AddressAssocActiveDtSet = true;
  }

  /** Retrieves the AddressAssocActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressAssocActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocActiveDt field
   */
   public String getAddressAssocActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getAddressAssocActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressAssocActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressAssocActiveDt field from a formatted string
   *
   * @param _value the AddressAssocActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressAssocActiveDt field
   */
   public void setAddressAssocActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressAssocActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressAssocActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocActiveDtFromFormattedString");
   }

  /**
   * Retrieves the AddressAssocActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocActiveDt field
   */
  public String getAddressAssocActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getAddressAssocActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocActiveDt field value from a formatted date/time string
   *
   * @param _value the AddressAssocActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressAssocActiveDt field
   */
  public void setAddressAssocActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAddressAssocActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return Date the value
   */
  public Date getAddressAssocActiveDt () {
    return this.AddressAssocActiveDt;
  }
  /** Change the field to not being actively set: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   */
  public void unsetAddressAssocActiveDt () {
    this._AddressAssocActiveDtSet = false;
  }
  /** See if the field is actively set: AddressAssocActiveDt (SERVICE_ADDRESS_ASSOC.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressAssocActiveDt () {
    return this._AddressAssocActiveDtSet;
  }
  /** set the fields value: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressAssocInactiveDt") 
  public void setAddressAssocInactiveDt (Date value) throws ServiceException
  {
    this.AddressAssocInactiveDt = value;
    this._AddressAssocInactiveDtSet = true;
  }

  /** Retrieves the AddressAssocInactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressAssocInactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocInactiveDt field
   */
   public String getAddressAssocInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getAddressAssocInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressAssocInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressAssocInactiveDt field from a formatted string
   *
   * @param _value the AddressAssocInactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressAssocInactiveDt field
   */
   public void setAddressAssocInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressAssocInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressAssocInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressAssocInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the AddressAssocInactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AddressAssocInactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressAssocInactiveDt field
   */
  public String getAddressAssocInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressAssocInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressAssocInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getAddressAssocInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressAssocInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the AddressAssocInactiveDt field value from a formatted date/time string
   *
   * @param _value the AddressAssocInactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressAssocInactiveDt field
   */
  public void setAddressAssocInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAddressAssocInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAddressAssocInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AddressAssocInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressAssocInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return Date the value
   */
  public Date getAddressAssocInactiveDt () {
    return this.AddressAssocInactiveDt;
  }
  /** Change the field to not being actively set: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   */
  public void unsetAddressAssocInactiveDt () {
    this._AddressAssocInactiveDtSet = false;
  }
  /** See if the field is actively set: AddressAssocInactiveDt (SERVICE_ADDRESS_ASSOC.inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressAssocInactiveDt () {
    return this._AddressAssocInactiveDtSet;
  }
  public String toString() {
    return AddressLocateXIDObjectHelper.toMap(this, null).toString();
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
    
  /** SERVICE_ADDRESS_ASSOC.address_id field */
    if(!nonNullOnly || (AddressId != null))  _AddressIdSet = flag;
  /** SERVICE_ADDRESS_ASSOC.emf_config_id field */
    if(!nonNullOnly || (EmfConfigId != null))  _EmfConfigIdSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (ExternalId != null))  _ExternalIdSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (ExternalIdType != null))  _ExternalIdTypeSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** EXTERNAL_ID_ACCT_MAP.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  /** SERVICE_ADDRESS_ASSOC.active_dt field */
    if(!nonNullOnly || (AddressAssocActiveDt != null))  _AddressAssocActiveDtSet = flag;
  /** SERVICE_ADDRESS_ASSOC.inactive_dt field */
    if(!nonNullOnly || (AddressAssocInactiveDt != null))  _AddressAssocInactiveDtSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
