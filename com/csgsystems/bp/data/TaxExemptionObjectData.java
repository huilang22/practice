/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxExemptionObjectData.java
 * Definition File: Customer/TaxExemption.xml
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
  
/** TaxExemptionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class TaxExemptionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public TaxExemptionObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CMF_EXEMPT.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CMF_EXEMPT.tax_pkg_inst_id field */
  public    Integer TaxPkgInstId  = null;
  protected boolean _TaxPkgInstIdSet = false;
  /** CMF_EXEMPT.tax_status field */
  public    Integer TaxStatus  = null;
  protected boolean _TaxStatusSet = false;
  /** CMF_EXEMPT.certificate field */
  public    String Certificate  = null;
  protected boolean _CertificateSet = false;
  /** CMF_EXEMPT.date_active field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** CMF_EXEMPT.date_expiration field */
  public    Date DateExpiration  = null;
  protected boolean _DateExpirationSet = false;
  /** CMF_EXEMPT.exempt_federal field */
  public    Boolean ExemptFederal  = null;
  protected boolean _ExemptFederalSet = false;
  /** CMF_EXEMPT.exempt_state field */
  public    Boolean ExemptState  = null;
  protected boolean _ExemptStateSet = false;
  /** CMF_EXEMPT.exempt_county field */
  public    Boolean ExemptCounty  = null;
  protected boolean _ExemptCountySet = false;
  /** CMF_EXEMPT.exempt_city field */
  public    Boolean ExemptCity  = null;
  protected boolean _ExemptCitySet = false;
  /** CMF_EXEMPT.exempt_other field */
  public    Boolean ExemptOther  = null;
  protected boolean _ExemptOtherSet = false;
  /** CMF_EXEMPT.tax_type_code field */
  public    Integer TaxTypeCode  = null;
  protected boolean _TaxTypeCodeSet = false;
  /** CMF_EXEMPT.country_code field */
  public    Integer CountryCode  = null;
  protected boolean _CountryCodeSet = false;
  /** CMF_EXEMPT.franchise_code field */
  public    Integer FranchiseCode  = null;
  protected boolean _FranchiseCodeSet = false;
  /** CMF_EXEMPT.state_code field */
  public    Integer StateCode  = null;
  protected boolean _StateCodeSet = false;
  /** CMF_EXEMPT.county_code field */
  public    Integer CountyCode  = null;
  protected boolean _CountyCodeSet = false;
  /** CMF_EXEMPT.city_code field */
  public    Integer CityCode  = null;
  protected boolean _CityCodeSet = false;
  /** CMF_EXEMPT.state field */
  public    String State  = null;
  protected boolean _StateSet = false;
  /** CMF_EXEMPT.county field */
  public    String County  = null;
  protected boolean _CountySet = false;
  /** CMF_EXEMPT.city field */
  public    String City  = null;
  protected boolean _CitySet = false;
  private String _objName = "TaxExemptionObjectData";
  /** Default constructor */
  public TaxExemptionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public TaxExemptionObjectData (TaxExemptionObjectData other)
  {

    if (other == null) return;
    this.Key = new TaxExemptionObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this._TaxPkgInstIdSet = other._TaxPkgInstIdSet;
    this.TaxStatus = other.TaxStatus;
    this._TaxStatusSet = other._TaxStatusSet;
    this.Certificate = other.Certificate;
    this._CertificateSet = other._CertificateSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.DateExpiration = other.DateExpiration;
    this._DateExpirationSet = other._DateExpirationSet;
    this.ExemptFederal = other.ExemptFederal;
    this._ExemptFederalSet = other._ExemptFederalSet;
    this.ExemptState = other.ExemptState;
    this._ExemptStateSet = other._ExemptStateSet;
    this.ExemptCounty = other.ExemptCounty;
    this._ExemptCountySet = other._ExemptCountySet;
    this.ExemptCity = other.ExemptCity;
    this._ExemptCitySet = other._ExemptCitySet;
    this.ExemptOther = other.ExemptOther;
    this._ExemptOtherSet = other._ExemptOtherSet;
    this.TaxTypeCode = other.TaxTypeCode;
    this._TaxTypeCodeSet = other._TaxTypeCodeSet;
    this.CountryCode = other.CountryCode;
    this._CountryCodeSet = other._CountryCodeSet;
    this.FranchiseCode = other.FranchiseCode;
    this._FranchiseCodeSet = other._FranchiseCodeSet;
    this.StateCode = other.StateCode;
    this._StateCodeSet = other._StateCodeSet;
    this.CountyCode = other.CountyCode;
    this._CountyCodeSet = other._CountyCodeSet;
    this.CityCode = other.CityCode;
    this._CityCodeSet = other._CityCodeSet;
    this.State = other.State;
    this._StateSet = other._StateSet;
    this.County = other.County;
    this._CountySet = other._CountySet;
    this.City = other.City;
    this._CitySet = other._CitySet;
  }

  /** get the Key for this object
   * @return TaxExemptionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public TaxExemptionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (TaxExemptionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (CMF_EXEMPT.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (CMF_EXEMPT.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (CMF_EXEMPT.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (CMF_EXEMPT.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new TaxExemptionObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (CMF_EXEMPT.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
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
  /** set the fields value: AccountInternalId (CMF_EXEMPT.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (CMF_EXEMPT.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_EXEMPT.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_EXEMPT.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPkgInstId") 
  public void setTaxPkgInstId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgInstId", "setTaxPkgInstId");
    }
    this.TaxPkgInstId = value;
    this._TaxPkgInstIdSet = true;
  }

  /** Retrieves the TaxPkgInstId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgInstId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgInstId field
   */
   public String getTaxPkgInstIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgInstId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgInstIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgInstId field from a formatted string
   *
   * @param _value the TaxPkgInstId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgInstId field
   */
   public void setTaxPkgInstIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgInstIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgInstId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgInstId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgInstIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgInstIdFromFormattedString");
   }

  /** get the value of the field: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return Integer the value
   */
  public Integer getTaxPkgInstId () {
    return this.TaxPkgInstId;
  }
  /** Change the field to not being actively set: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   */
  public void unsetTaxPkgInstId () {
    this._TaxPkgInstIdSet = false;
  }
  /** See if the field is actively set: TaxPkgInstId (CMF_EXEMPT.tax_pkg_inst_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgInstId () {
    return this._TaxPkgInstIdSet;
  }
  /** set the fields value: TaxStatus (CMF_EXEMPT.tax_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxStatus") 
  public void setTaxStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxStatus", "setTaxStatus");
    }
    this.TaxStatus = value;
    this._TaxStatusSet = true;
  }

  /** Retrieves the TaxStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxStatus field
   */
   public String getTaxStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxStatus field from a formatted string
   *
   * @param _value the TaxStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxStatus field
   */
   public void setTaxStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxStatusFromFormattedString");
   }

  /** get the value of the field: TaxStatus (CMF_EXEMPT.tax_status)
   * @return Integer the value
   */
  public Integer getTaxStatus () {
    return this.TaxStatus;
  }
  /** Change the field to not being actively set: TaxStatus (CMF_EXEMPT.tax_status)
   */
  public void unsetTaxStatus () {
    this._TaxStatusSet = false;
  }
  /** See if the field is actively set: TaxStatus (CMF_EXEMPT.tax_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxStatus () {
    return this._TaxStatusSet;
  }
  /** set the fields value: Certificate (CMF_EXEMPT.certificate)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Certificate") 
  public void setCertificate (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Certificate", "setCertificate");
    }
    this.Certificate = value;
    this._CertificateSet = true;
  }

  /** Retrieves the Certificate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Certificate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Certificate field
   */
   public String getCertificateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCertificateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCertificateAsFormattedString");
       return fmtMgr.formatString(this.getCertificate());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Certificate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCertificateAsFormattedString");
       throw x;
     }
   }
  /** Sets the Certificate field from a formatted string
   *
   * @param _value the Certificate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Certificate field
   */
   public void setCertificateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCertificateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCertificate(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Certificate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCertificateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCertificateFromFormattedString");
   }

  /** get the value of the field: Certificate (CMF_EXEMPT.certificate)
   * @return String the value
   */
  public String getCertificate () {
    return this.Certificate;
  }
  /** Change the field to not being actively set: Certificate (CMF_EXEMPT.certificate)
   */
  public void unsetCertificate () {
    this._CertificateSet = false;
  }
  /** See if the field is actively set: Certificate (CMF_EXEMPT.certificate)
   * @return boolean whether the field is actively set
   */
  public boolean issetCertificate () {
    return this._CertificateSet;
  }
  /** set the fields value: ActiveDate (CMF_EXEMPT.date_active)
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

  /** get the value of the field: ActiveDate (CMF_EXEMPT.date_active)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CMF_EXEMPT.date_active)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CMF_EXEMPT.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: DateExpiration (CMF_EXEMPT.date_expiration)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateExpiration") 
  public void setDateExpiration (Date value) throws ServiceException
  {
    this.DateExpiration = value;
    this._DateExpirationSet = true;
  }

  /** Retrieves the DateExpiration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateExpiration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateExpiration field
   */
   public String getDateExpirationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateExpirationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateExpirationAsFormattedString");
       return fmtMgr.formatDate(this.getDateExpiration(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateExpiration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateExpirationAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateExpiration field from a formatted string
   *
   * @param _value the DateExpiration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateExpiration field
   */
   public void setDateExpirationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateExpirationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateExpiration(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateExpiration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateExpirationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateExpirationFromFormattedString");
   }

  /**
   * Retrieves the DateExpiration field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateExpiration field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateExpiration field
   */
  public String getDateExpirationAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateExpirationAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateExpirationAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateExpiration(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpiration");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateExpirationAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateExpiration field value from a formatted date/time string
   *
   * @param _value the DateExpiration field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateExpiration field
   */
  public void setDateExpirationFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateExpirationFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateExpiration(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateExpiration");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateExpirationFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return Date the value
   */
  public Date getDateExpiration () {
    return this.DateExpiration;
  }
  /** Change the field to not being actively set: DateExpiration (CMF_EXEMPT.date_expiration)
   */
  public void unsetDateExpiration () {
    this._DateExpirationSet = false;
  }
  /** See if the field is actively set: DateExpiration (CMF_EXEMPT.date_expiration)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateExpiration () {
    return this._DateExpirationSet;
  }
  /** set the fields value: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExemptFederal") 
  public void setExemptFederal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExemptFederal", "setExemptFederal");
    }
    this.ExemptFederal = value;
    this._ExemptFederalSet = true;
  }

  /** Retrieves the ExemptFederal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExemptFederal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptFederal field
   */
   public String getExemptFederalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptFederalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptFederalAsFormattedString");
       return fmtMgr.formatBoolean(this.getExemptFederal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptFederal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptFederalAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExemptFederal field from a formatted string
   *
   * @param _value the ExemptFederal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExemptFederal field
   */
   public void setExemptFederalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptFederalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExemptFederal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptFederal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptFederalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptFederalFromFormattedString");
   }

  /** get the value of the field: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return Boolean the value
   */
  public Boolean getExemptFederal () {
    return this.ExemptFederal;
  }
  /** Change the field to not being actively set: ExemptFederal (CMF_EXEMPT.exempt_federal)
   */
  public void unsetExemptFederal () {
    this._ExemptFederalSet = false;
  }
  /** See if the field is actively set: ExemptFederal (CMF_EXEMPT.exempt_federal)
   * @return boolean whether the field is actively set
   */
  public boolean issetExemptFederal () {
    return this._ExemptFederalSet;
  }
  /** set the fields value: ExemptState (CMF_EXEMPT.exempt_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExemptState") 
  public void setExemptState (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExemptState", "setExemptState");
    }
    this.ExemptState = value;
    this._ExemptStateSet = true;
  }

  /** Retrieves the ExemptState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExemptState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptState field
   */
   public String getExemptStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptStateAsFormattedString");
       return fmtMgr.formatBoolean(this.getExemptState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExemptState field from a formatted string
   *
   * @param _value the ExemptState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExemptState field
   */
   public void setExemptStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExemptState(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptStateFromFormattedString");
   }

  /** get the value of the field: ExemptState (CMF_EXEMPT.exempt_state)
   * @return Boolean the value
   */
  public Boolean getExemptState () {
    return this.ExemptState;
  }
  /** Change the field to not being actively set: ExemptState (CMF_EXEMPT.exempt_state)
   */
  public void unsetExemptState () {
    this._ExemptStateSet = false;
  }
  /** See if the field is actively set: ExemptState (CMF_EXEMPT.exempt_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetExemptState () {
    return this._ExemptStateSet;
  }
  /** set the fields value: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExemptCounty") 
  public void setExemptCounty (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExemptCounty", "setExemptCounty");
    }
    this.ExemptCounty = value;
    this._ExemptCountySet = true;
  }

  /** Retrieves the ExemptCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExemptCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptCounty field
   */
   public String getExemptCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptCountyAsFormattedString");
       return fmtMgr.formatBoolean(this.getExemptCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExemptCounty field from a formatted string
   *
   * @param _value the ExemptCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExemptCounty field
   */
   public void setExemptCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExemptCounty(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptCountyFromFormattedString");
   }

  /** get the value of the field: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return Boolean the value
   */
  public Boolean getExemptCounty () {
    return this.ExemptCounty;
  }
  /** Change the field to not being actively set: ExemptCounty (CMF_EXEMPT.exempt_county)
   */
  public void unsetExemptCounty () {
    this._ExemptCountySet = false;
  }
  /** See if the field is actively set: ExemptCounty (CMF_EXEMPT.exempt_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetExemptCounty () {
    return this._ExemptCountySet;
  }
  /** set the fields value: ExemptCity (CMF_EXEMPT.exempt_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExemptCity") 
  public void setExemptCity (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExemptCity", "setExemptCity");
    }
    this.ExemptCity = value;
    this._ExemptCitySet = true;
  }

  /** Retrieves the ExemptCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExemptCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptCity field
   */
   public String getExemptCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptCityAsFormattedString");
       return fmtMgr.formatBoolean(this.getExemptCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExemptCity field from a formatted string
   *
   * @param _value the ExemptCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExemptCity field
   */
   public void setExemptCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExemptCity(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptCityFromFormattedString");
   }

  /** get the value of the field: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return Boolean the value
   */
  public Boolean getExemptCity () {
    return this.ExemptCity;
  }
  /** Change the field to not being actively set: ExemptCity (CMF_EXEMPT.exempt_city)
   */
  public void unsetExemptCity () {
    this._ExemptCitySet = false;
  }
  /** See if the field is actively set: ExemptCity (CMF_EXEMPT.exempt_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetExemptCity () {
    return this._ExemptCitySet;
  }
  /** set the fields value: ExemptOther (CMF_EXEMPT.exempt_other)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExemptOther") 
  public void setExemptOther (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExemptOther", "setExemptOther");
    }
    this.ExemptOther = value;
    this._ExemptOtherSet = true;
  }

  /** Retrieves the ExemptOther field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExemptOther field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExemptOther field
   */
   public String getExemptOtherAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptOtherAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExemptOtherAsFormattedString");
       return fmtMgr.formatBoolean(this.getExemptOther());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptOther");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExemptOtherAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExemptOther field from a formatted string
   *
   * @param _value the ExemptOther field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExemptOther field
   */
   public void setExemptOtherFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExemptOtherFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExemptOther(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExemptOther");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExemptOtherFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExemptOtherFromFormattedString");
   }

  /** get the value of the field: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return Boolean the value
   */
  public Boolean getExemptOther () {
    return this.ExemptOther;
  }
  /** Change the field to not being actively set: ExemptOther (CMF_EXEMPT.exempt_other)
   */
  public void unsetExemptOther () {
    this._ExemptOtherSet = false;
  }
  /** See if the field is actively set: ExemptOther (CMF_EXEMPT.exempt_other)
   * @return boolean whether the field is actively set
   */
  public boolean issetExemptOther () {
    return this._ExemptOtherSet;
  }
  /** set the fields value: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxTypeCode") 
  public void setTaxTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxTypeCode", "setTaxTypeCode");
    }
    this.TaxTypeCode = value;
    this._TaxTypeCodeSet = true;
  }

  /** Retrieves the TaxTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxTypeCode field
   */
   public String getTaxTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxTypeCode field from a formatted string
   *
   * @param _value the TaxTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxTypeCode field
   */
   public void setTaxTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxTypeCodeFromFormattedString");
   }

  /** get the value of the field: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return Integer the value
   */
  public Integer getTaxTypeCode () {
    return this.TaxTypeCode;
  }
  /** Change the field to not being actively set: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   */
  public void unsetTaxTypeCode () {
    this._TaxTypeCodeSet = false;
  }
  /** See if the field is actively set: TaxTypeCode (CMF_EXEMPT.tax_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxTypeCode () {
    return this._TaxTypeCodeSet;
  }
  /** set the fields value: CountryCode (CMF_EXEMPT.country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCode") 
  public void setCountryCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountryCode", "setCountryCode");
    }
    this.CountryCode = value;
    this._CountryCodeSet = true;
  }

  /** Retrieves the CountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCode field
   */
   public String getCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCode field from a formatted string
   *
   * @param _value the CountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCode field
   */
   public void setCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeFromFormattedString");
   }

  /** get the value of the field: CountryCode (CMF_EXEMPT.country_code)
   * @return Integer the value
   */
  public Integer getCountryCode () {
    return this.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode (CMF_EXEMPT.country_code)
   */
  public void unsetCountryCode () {
    this._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode (CMF_EXEMPT.country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode () {
    return this._CountryCodeSet;
  }
  /** set the fields value: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FranchiseCode") 
  public void setFranchiseCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FranchiseCode", "setFranchiseCode");
    }
    this.FranchiseCode = value;
    this._FranchiseCodeSet = true;
  }

  /** Retrieves the FranchiseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FranchiseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCode field
   */
   public String getFranchiseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFranchiseCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FranchiseCode field from a formatted string
   *
   * @param _value the FranchiseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FranchiseCode field
   */
   public void setFranchiseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFranchiseCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFromFormattedString");
   }

  /** get the value of the field: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return Integer the value
   */
  public Integer getFranchiseCode () {
    return this.FranchiseCode;
  }
  /** Change the field to not being actively set: FranchiseCode (CMF_EXEMPT.franchise_code)
   */
  public void unsetFranchiseCode () {
    this._FranchiseCodeSet = false;
  }
  /** See if the field is actively set: FranchiseCode (CMF_EXEMPT.franchise_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseCode () {
    return this._FranchiseCodeSet;
  }
  /** set the fields value: StateCode (CMF_EXEMPT.state_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateCode") 
  public void setStateCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StateCode", "setStateCode");
    }
    this.StateCode = value;
    this._StateCodeSet = true;
  }

  /** Retrieves the StateCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateCode field
   */
   public String getStateCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getStateCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateCode field from a formatted string
   *
   * @param _value the StateCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateCode field
   */
   public void setStateCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateCodeFromFormattedString");
   }

  /** get the value of the field: StateCode (CMF_EXEMPT.state_code)
   * @return Integer the value
   */
  public Integer getStateCode () {
    return this.StateCode;
  }
  /** Change the field to not being actively set: StateCode (CMF_EXEMPT.state_code)
   */
  public void unsetStateCode () {
    this._StateCodeSet = false;
  }
  /** See if the field is actively set: StateCode (CMF_EXEMPT.state_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateCode () {
    return this._StateCodeSet;
  }
  /** set the fields value: CountyCode (CMF_EXEMPT.county_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyCode") 
  public void setCountyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CountyCode", "setCountyCode");
    }
    this.CountyCode = value;
    this._CountyCodeSet = true;
  }

  /** Retrieves the CountyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyCode field
   */
   public String getCountyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCountyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyCode field from a formatted string
   *
   * @param _value the CountyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyCode field
   */
   public void setCountyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyCodeFromFormattedString");
   }

  /** get the value of the field: CountyCode (CMF_EXEMPT.county_code)
   * @return Integer the value
   */
  public Integer getCountyCode () {
    return this.CountyCode;
  }
  /** Change the field to not being actively set: CountyCode (CMF_EXEMPT.county_code)
   */
  public void unsetCountyCode () {
    this._CountyCodeSet = false;
  }
  /** See if the field is actively set: CountyCode (CMF_EXEMPT.county_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyCode () {
    return this._CountyCodeSet;
  }
  /** set the fields value: CityCode (CMF_EXEMPT.city_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityCode") 
  public void setCityCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CityCode", "setCityCode");
    }
    this.CityCode = value;
    this._CityCodeSet = true;
  }

  /** Retrieves the CityCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityCode field
   */
   public String getCityCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCityCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityCode field from a formatted string
   *
   * @param _value the CityCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityCode field
   */
   public void setCityCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityCodeFromFormattedString");
   }

  /** get the value of the field: CityCode (CMF_EXEMPT.city_code)
   * @return Integer the value
   */
  public Integer getCityCode () {
    return this.CityCode;
  }
  /** Change the field to not being actively set: CityCode (CMF_EXEMPT.city_code)
   */
  public void unsetCityCode () {
    this._CityCodeSet = false;
  }
  /** See if the field is actively set: CityCode (CMF_EXEMPT.city_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityCode () {
    return this._CityCodeSet;
  }
  /** set the fields value: State (CMF_EXEMPT.state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("State") 
  public void setState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "State", "setState");
    }
    this.State = value;
    this._StateSet = true;
  }

  /** Retrieves the State field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The State field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the State field
   */
   public String getStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateAsFormattedString");
       return fmtMgr.formatString(this.getState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("State");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the State field from a formatted string
   *
   * @param _value the State field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the State field
   */
   public void setStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("State");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateFromFormattedString");
   }

  /** get the value of the field: State (CMF_EXEMPT.state)
   * @return String the value
   */
  public String getState () {
    return this.State;
  }
  /** Change the field to not being actively set: State (CMF_EXEMPT.state)
   */
  public void unsetState () {
    this._StateSet = false;
  }
  /** See if the field is actively set: State (CMF_EXEMPT.state)
   * @return boolean whether the field is actively set
   */
  public boolean issetState () {
    return this._StateSet;
  }
  /** set the fields value: County (CMF_EXEMPT.county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("County") 
  public void setCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "County", "setCounty");
    }
    this.County = value;
    this._CountySet = true;
  }

  /** Retrieves the County field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The County field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the County field
   */
   public String getCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyAsFormattedString");
       return fmtMgr.formatString(this.getCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("County");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the County field from a formatted string
   *
   * @param _value the County field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the County field
   */
   public void setCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("County");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyFromFormattedString");
   }

  /** get the value of the field: County (CMF_EXEMPT.county)
   * @return String the value
   */
  public String getCounty () {
    return this.County;
  }
  /** Change the field to not being actively set: County (CMF_EXEMPT.county)
   */
  public void unsetCounty () {
    this._CountySet = false;
  }
  /** See if the field is actively set: County (CMF_EXEMPT.county)
   * @return boolean whether the field is actively set
   */
  public boolean issetCounty () {
    return this._CountySet;
  }
  /** set the fields value: City (CMF_EXEMPT.city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("City") 
  public void setCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "City", "setCity");
    }
    this.City = value;
    this._CitySet = true;
  }

  /** Retrieves the City field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The City field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the City field
   */
   public String getCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityAsFormattedString");
       return fmtMgr.formatString(this.getCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("City");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the City field from a formatted string
   *
   * @param _value the City field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the City field
   */
   public void setCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("City");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityFromFormattedString");
   }

  /** get the value of the field: City (CMF_EXEMPT.city)
   * @return String the value
   */
  public String getCity () {
    return this.City;
  }
  /** Change the field to not being actively set: City (CMF_EXEMPT.city)
   */
  public void unsetCity () {
    this._CitySet = false;
  }
  /** See if the field is actively set: City (CMF_EXEMPT.city)
   * @return boolean whether the field is actively set
   */
  public boolean issetCity () {
    return this._CitySet;
  }
  public String toString() {
    return TaxExemptionObjectHelper.toMap(this, null).toString();
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
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** CMF_EXEMPT.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CMF_EXEMPT.tax_pkg_inst_id field */
    if(!nonNullOnly || (TaxPkgInstId != null))  _TaxPkgInstIdSet = flag;
  /** CMF_EXEMPT.tax_status field */
    if(!nonNullOnly || (TaxStatus != null))  _TaxStatusSet = flag;
  /** CMF_EXEMPT.certificate field */
    if(!nonNullOnly || (Certificate != null))  _CertificateSet = flag;
  /** CMF_EXEMPT.date_active field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** CMF_EXEMPT.date_expiration field */
    if(!nonNullOnly || (DateExpiration != null))  _DateExpirationSet = flag;
  /** CMF_EXEMPT.exempt_federal field */
    if(!nonNullOnly || (ExemptFederal != null))  _ExemptFederalSet = flag;
  /** CMF_EXEMPT.exempt_state field */
    if(!nonNullOnly || (ExemptState != null))  _ExemptStateSet = flag;
  /** CMF_EXEMPT.exempt_county field */
    if(!nonNullOnly || (ExemptCounty != null))  _ExemptCountySet = flag;
  /** CMF_EXEMPT.exempt_city field */
    if(!nonNullOnly || (ExemptCity != null))  _ExemptCitySet = flag;
  /** CMF_EXEMPT.exempt_other field */
    if(!nonNullOnly || (ExemptOther != null))  _ExemptOtherSet = flag;
  /** CMF_EXEMPT.tax_type_code field */
    if(!nonNullOnly || (TaxTypeCode != null))  _TaxTypeCodeSet = flag;
  /** CMF_EXEMPT.country_code field */
    if(!nonNullOnly || (CountryCode != null))  _CountryCodeSet = flag;
  /** CMF_EXEMPT.franchise_code field */
    if(!nonNullOnly || (FranchiseCode != null))  _FranchiseCodeSet = flag;
  /** CMF_EXEMPT.state_code field */
    if(!nonNullOnly || (StateCode != null))  _StateCodeSet = flag;
  /** CMF_EXEMPT.county_code field */
    if(!nonNullOnly || (CountyCode != null))  _CountyCodeSet = flag;
  /** CMF_EXEMPT.city_code field */
    if(!nonNullOnly || (CityCode != null))  _CityCodeSet = flag;
  /** CMF_EXEMPT.state field */
    if(!nonNullOnly || (State != null))  _StateSet = flag;
  /** CMF_EXEMPT.county field */
    if(!nonNullOnly || (County != null))  _CountySet = flag;
  /** CMF_EXEMPT.city field */
    if(!nonNullOnly || (City != null))  _CitySet = flag;
  }
}
