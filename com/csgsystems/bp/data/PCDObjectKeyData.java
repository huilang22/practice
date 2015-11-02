/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PCDObjectKeyData.java
 * Definition File: Admin/PackageComponentDef.xml
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** PCDObject's Key Data class. */
public class PCDObjectKeyData  extends BaseObjectData
{
  /** PACKAGE_COMPONENTS.package_id field */
  public    Integer PackageId  = null;
  protected boolean _PackageIdSet = false;
  /** PACKAGE_COMPONENTS.active_dt field */
  public    Date PackageActiveDt  = null;
  protected boolean _PackageActiveDtSet = false;
  /** COMPONENT_DEFINITION_VALUES.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** COMPONENT_DEFINITION_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "PCDObjectKeyData";
  /** default constructor */
  public PCDObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public PCDObjectKeyData (PCDObjectKeyData other)
  {
    if (other == null) return;
    this.PackageId = other.PackageId;
    this._PackageIdSet = other._PackageIdSet;
    this.PackageActiveDt = other.PackageActiveDt;
    this._PackageActiveDtSet = other._PackageActiveDtSet;
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: PackageId (PACKAGE_COMPONENTS.package_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageId") 
  public void setPackageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageId", "setPackageId");
    }
    this.PackageId = value;
    this._PackageIdSet = true;
  }

  /** Retrieves the PackageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageId field
   */
   public String getPackageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getPackageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageId field from a formatted string
   *
   * @param _value the PackageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageId field
   */
   public void setPackageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PackageId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PackageId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageId field
   */

  public String getPackageIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPackageIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPackageId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PackageId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PackageId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageId field
   */
  public Enumeration getPackageIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PackageType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PackageId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPackageIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPackageIdEnumeration(_locale);
      this.setPackageId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFromDisplayValue");
  }

  /** get the value of the field: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return Integer the value
   */
  public Integer getPackageId () {
    return this.PackageId;
  }
  /** Change the field to not being actively set: PackageId (PACKAGE_COMPONENTS.package_id)
   */
  public void unsetPackageId () {
    this._PackageIdSet = false;
  }
  /** See if the field is actively set: PackageId (PACKAGE_COMPONENTS.package_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageId () {
    return this._PackageIdSet;
  }
  /** set the fields value: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PackageActiveDt") 
  public void setPackageActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PackageActiveDt", "setPackageActiveDt");
    }
    this.PackageActiveDt = value;
    this._PackageActiveDtSet = true;
  }

  /** Retrieves the PackageActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PackageActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageActiveDt field
   */
   public String getPackageActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getPackageActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the PackageActiveDt field from a formatted string
   *
   * @param _value the PackageActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageActiveDt field
   */
   public void setPackageActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPackageActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PackageActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageActiveDtFromFormattedString");
   }

  /**
   * Retrieves the PackageActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageActiveDt field
   */
  public String getPackageActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPackageActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PackageActiveDt field value from a formatted date/time string
   *
   * @param _value the PackageActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PackageActiveDt field
   */
  public void setPackageActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPackageActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return Date the value
   */
  public Date getPackageActiveDt () {
    return this.PackageActiveDt;
  }
  /** Change the field to not being actively set: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   */
  public void unsetPackageActiveDt () {
    this._PackageActiveDtSet = false;
  }
  /** See if the field is actively set: PackageActiveDt (PACKAGE_COMPONENTS.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetPackageActiveDt () {
    return this._PackageActiveDtSet;
  }
  /** set the fields value: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ComponentId", "setComponentId");
    }
    this.ComponentId = value;
    this._ComponentIdSet = true;
  }

  /** Retrieves the ComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentId field
   */
   public String getComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ComponentId field from a formatted string
   *
   * @param _value the ComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ComponentId field
   */
   public void setComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ComponentId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ComponentId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentId field
   */

  public String getComponentIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getComponentIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getComponentId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ComponentId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ComponentId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentId field
   */
  public Enumeration getComponentIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PackageComponentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ComponentId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setComponentIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getComponentIdEnumeration(_locale);
      this.setComponentId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFromDisplayValue");
  }

  /** get the value of the field: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (COMPONENT_DEFINITION_VALUES.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */

  public String getLanguageCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getLanguageCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated LanguageCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the LanguageCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the LanguageCode field
   */
  public Enumeration getLanguageCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("LanguageCode", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated LanguageCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setLanguageCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getLanguageCodeEnumeration(_locale);
      this.setLanguageCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LanguageCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLanguageCodeFromDisplayValue");
  }

  /** get the value of the field: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (COMPONENT_DEFINITION_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return PCDObjectKeyHelper.toMap(this, null).toString();
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
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** PACKAGE_COMPONENTS.package_id field */
    if(!nonNullOnly || (PackageId != null))  _PackageIdSet = flag;
  /** PACKAGE_COMPONENTS.active_dt field */
    if(!nonNullOnly || (PackageActiveDt != null))  _PackageActiveDtSet = flag;
  /** COMPONENT_DEFINITION_VALUES.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** COMPONENT_DEFINITION_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
