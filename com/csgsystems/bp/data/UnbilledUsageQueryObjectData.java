/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageQueryObjectData.java
 * Definition File: Customer/UnbilledUsage.xml
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
  
/** UnbilledUsageQueryObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class UnbilledUsageQueryObjectData extends UnbilledUsageObjectData  implements Serializable
{

  /** ApiQueryName field */
  public    String ApiQueryName  = null;
  protected boolean _ApiQueryNameSet = false;
  /** CMF.hierarchy_id field */
  public    Integer HierarchyId  = null;
  protected boolean _HierarchyIdSet = false;
  /** CMF.bill_city field */
  public    String BillCity  = null;
  protected boolean _BillCitySet = false;
  /** CMF.bill_state field */
  public    String BillState  = null;
  protected boolean _BillStateSet = false;
  /** CMF.bill_country_code field */
  public    Integer BillCountryCode  = null;
  protected boolean _BillCountryCodeSet = false;
  /** CMF.bill_zip field */
  public    String BillZip  = null;
  protected boolean _BillZipSet = false;
  /** CMF.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** CMF.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  /** SERVICE.emf_config_id field */
  public    Integer EmfConfigId  = null;
  protected boolean _EmfConfigIdSet = false;
  private String _objName = "UnbilledUsageQueryObjectData";
  /** Default constructor */
  public UnbilledUsageQueryObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public UnbilledUsageQueryObjectData (UnbilledUsageQueryObjectData other)
  {

    super (other);

    if (other == null) return;
    this.ApiQueryName = other.ApiQueryName;
    this._ApiQueryNameSet = other._ApiQueryNameSet;
    this.HierarchyId = other.HierarchyId;
    this._HierarchyIdSet = other._HierarchyIdSet;
    this.BillCity = other.BillCity;
    this._BillCitySet = other._BillCitySet;
    this.BillState = other.BillState;
    this._BillStateSet = other._BillStateSet;
    this.BillCountryCode = other.BillCountryCode;
    this._BillCountryCodeSet = other._BillCountryCodeSet;
    this.BillZip = other.BillZip;
    this._BillZipSet = other._BillZipSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
    this.EmfConfigId = other.EmfConfigId;
    this._EmfConfigIdSet = other._EmfConfigIdSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public UnbilledUsageQueryObjectData (UnbilledUsageObjectData other)
  {
    super (other);

  }

  /** set the fields value: ApiQueryName
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setApiQueryName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ApiQueryName", "setApiQueryName");
    }
    this.ApiQueryName = value;
    this._ApiQueryNameSet = true;
  }
  /** get the value of the field: ApiQueryName
   * @return String the value
   */
  public String getApiQueryName ()
  {
    return this.ApiQueryName;
  }
  /** Change the field to not being actively set: ApiQueryName
   */
  public void unsetApiQueryName ()
  {
    this._ApiQueryNameSet = false;
  }
  /** See if the field is actively set: ApiQueryName
   * @return boolean whether the field is actively set
   */
  public boolean issetApiQueryName ()
  {
    return this._ApiQueryNameSet;
  }

  /** Retrieves the ApiQueryName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ApiQueryName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApiQueryName field
   */
   public String getApiQueryNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiQueryNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApiQueryNameAsFormattedString");
       return fmtMgr.formatString(this.getApiQueryName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiQueryName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getApiQueryNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ApiQueryName field from a formatted string
   *
   * @param _value the ApiQueryName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ApiQueryName field
   */
   public void setApiQueryNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApiQueryNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setApiQueryName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ApiQueryName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setApiQueryNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApiQueryNameFromFormattedString");
   }

  /** set the fields value: HierarchyId (CMF.hierarchy_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyId") 
  public void setHierarchyId (Integer value) throws ServiceException
  {
    this.HierarchyId = value;
    this._HierarchyIdSet = true;
  }

  /** Retrieves the HierarchyId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyId field
   */
   public String getHierarchyIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyId field from a formatted string
   *
   * @param _value the HierarchyId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyId field
   */
   public void setHierarchyIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyIdFromFormattedString");
   }

  /** get the value of the field: HierarchyId (CMF.hierarchy_id)
   * @return Integer the value
   */
  public Integer getHierarchyId () {
    return this.HierarchyId;
  }
  /** Change the field to not being actively set: HierarchyId (CMF.hierarchy_id)
   */
  public void unsetHierarchyId () {
    this._HierarchyIdSet = false;
  }
  /** See if the field is actively set: HierarchyId (CMF.hierarchy_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyId () {
    return this._HierarchyIdSet;
  }
  /** set the fields value: BillCity (CMF.bill_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCity") 
  public void setBillCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCity", "setBillCity");
    }
    this.BillCity = value;
    this._BillCitySet = true;
  }

  /** Retrieves the BillCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCity field
   */
   public String getBillCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCityAsFormattedString");
       return fmtMgr.formatString(this.getBillCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCity field from a formatted string
   *
   * @param _value the BillCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCity field
   */
   public void setBillCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCityFromFormattedString");
   }

  /** get the value of the field: BillCity (CMF.bill_city)
   * @return String the value
   */
  public String getBillCity () {
    return this.BillCity;
  }
  /** Change the field to not being actively set: BillCity (CMF.bill_city)
   */
  public void unsetBillCity () {
    this._BillCitySet = false;
  }
  /** See if the field is actively set: BillCity (CMF.bill_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCity () {
    return this._BillCitySet;
  }
  /** set the fields value: BillState (CMF.bill_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillState") 
  public void setBillState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillState", "setBillState");
    }
    this.BillState = value;
    this._BillStateSet = true;
  }

  /** Retrieves the BillState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillState field
   */
   public String getBillStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateAsFormattedString");
       return fmtMgr.formatString(this.getBillState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillState field from a formatted string
   *
   * @param _value the BillState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillState field
   */
   public void setBillStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillStateFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */

  public String getBillStateDisplayValue(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillState()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillState field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillState field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillState field
   */
  public Enumeration getBillStateEnumeration(Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillStateEnumeration");
    EnumerationFilter enumFilter = new EnumerationFilter();
    enumFilter.addFilterCondition("CountryCode", CountryCode);

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("StateProvince", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillStateEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillStateEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillState field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillStateFromDisplayValue(String _value, Locale _locale, IntegerEquals CountryCode) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillStateEnumeration(_locale, CountryCode);
      this.setBillState((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillState");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillStateFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillStateFromDisplayValue");
  }

  /** get the value of the field: BillState (CMF.bill_state)
   * @return String the value
   */
  public String getBillState () {
    return this.BillState;
  }
  /** Change the field to not being actively set: BillState (CMF.bill_state)
   */
  public void unsetBillState () {
    this._BillStateSet = false;
  }
  /** See if the field is actively set: BillState (CMF.bill_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillState () {
    return this._BillStateSet;
  }
  /** set the fields value: BillCountryCode (CMF.bill_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCountryCode") 
  public void setBillCountryCode (Integer value) throws ServiceException
  {
    this.BillCountryCode = value;
    this._BillCountryCodeSet = true;
  }

  /** Retrieves the BillCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCountryCode field
   */
   public String getBillCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCountryCode field from a formatted string
   *
   * @param _value the BillCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCountryCode field
   */
   public void setBillCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCountryCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */

  public String getBillCountryCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillCountryCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillCountryCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillCountryCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillCountryCode field
   */
  public Enumeration getBillCountryCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCountryCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCountryCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCountryCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillCountryCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillCountryCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillCountryCodeEnumeration(_locale);
      this.setBillCountryCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCountryCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCountryCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCountryCodeFromDisplayValue");
  }

  /** get the value of the field: BillCountryCode (CMF.bill_country_code)
   * @return Integer the value
   */
  public Integer getBillCountryCode () {
    return this.BillCountryCode;
  }
  /** Change the field to not being actively set: BillCountryCode (CMF.bill_country_code)
   */
  public void unsetBillCountryCode () {
    this._BillCountryCodeSet = false;
  }
  /** See if the field is actively set: BillCountryCode (CMF.bill_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCountryCode () {
    return this._BillCountryCodeSet;
  }
  /** set the fields value: BillZip (CMF.bill_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillZip") 
  public void setBillZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillZip", "setBillZip");
    }
    this.BillZip = value;
    this._BillZipSet = true;
  }

  /** Retrieves the BillZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillZip field
   */
   public String getBillZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillZipAsFormattedString");
       return fmtMgr.formatString(this.getBillZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillZip field from a formatted string
   *
   * @param _value the BillZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillZip field
   */
   public void setBillZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillZipFromFormattedString");
   }

  /** get the value of the field: BillZip (CMF.bill_zip)
   * @return String the value
   */
  public String getBillZip () {
    return this.BillZip;
  }
  /** Change the field to not being actively set: BillZip (CMF.bill_zip)
   */
  public void unsetBillZip () {
    this._BillZipSet = false;
  }
  /** See if the field is actively set: BillZip (CMF.bill_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillZip () {
    return this._BillZipSet;
  }
  /** set the fields value: CurrencyCode (CMF.currency_code)
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

  /** get the value of the field: CurrencyCode (CMF.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (CMF.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (CMF.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: LanguageCode (CMF.language_code)
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

  /** get the value of the field: LanguageCode (CMF.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (CMF.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (CMF.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  /** set the fields value: EmfConfigId (SERVICE.emf_config_id)
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

  /** get the value of the field: EmfConfigId (SERVICE.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    return this.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (SERVICE.emf_config_id)
   */
  public void unsetEmfConfigId () {
    this._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (SERVICE.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    return this._EmfConfigIdSet;
  }
  public String toString() {
    return UnbilledUsageQueryObjectHelper.toMap(this, null).toString();
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
    
  /** ApiQueryName field */
    if (!nonNullOnly || (ApiQueryName != null)) _ApiQueryNameSet = flag;
  /** CMF.hierarchy_id field */
    if(!nonNullOnly || (HierarchyId != null))  _HierarchyIdSet = flag;
  /** CMF.bill_city field */
    if(!nonNullOnly || (BillCity != null))  _BillCitySet = flag;
  /** CMF.bill_state field */
    if(!nonNullOnly || (BillState != null))  _BillStateSet = flag;
  /** CMF.bill_country_code field */
    if(!nonNullOnly || (BillCountryCode != null))  _BillCountryCodeSet = flag;
  /** CMF.bill_zip field */
    if(!nonNullOnly || (BillZip != null))  _BillZipSet = flag;
  /** CMF.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** CMF.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  /** SERVICE.emf_config_id field */
    if(!nonNullOnly || (EmfConfigId != null))  _EmfConfigIdSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
