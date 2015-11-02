/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectData.java
 * Definition File: Customer/Contact.xml
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
  
/** ContactObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class ContactObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public ContactObjectKeyData Key = null;
  /** CONTACTS.create_dt field */
  public    Date CreateDt  = null;
  protected boolean _CreateDtSet = false;
  /** CONTACTS.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** CONTACTS.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** CONTACTS.name_prefix field */
  public    String NamePrefix  = null;
  protected boolean _NamePrefixSet = false;
  /** CONTACTS.first_name field */
  public    String FirstName  = null;
  protected boolean _FirstNameSet = false;
  /** CONTACTS.middle_name field */
  public    String MiddleName  = null;
  protected boolean _MiddleNameSet = false;
  /** CONTACTS.last_name field */
  public    String LastName  = null;
  protected boolean _LastNameSet = false;
  /** CONTACTS.generation field */
  public    String Generation  = null;
  protected boolean _GenerationSet = false;
  /** CONTACTS.title field */
  public    String Title  = null;
  protected boolean _TitleSet = false;
  /** CONTACTS.company field */
  public    String Company  = null;
  protected boolean _CompanySet = false;
  /** CONTACTS.address_id field */
  public    BigInteger AddressId  = null;
  protected boolean _AddressIdSet = false;
  /** CONTACTS.alt_lname field */
  public    String AltLname  = null;
  protected boolean _AltLnameSet = false;
  /** CONTACTS.alt_fname field */
  public    String AltFname  = null;
  protected boolean _AltFnameSet = false;
  /** CONTACTS.alt_company field */
  public    String AltCompany  = null;
  protected boolean _AltCompanySet = false;
  /** CONTACTS.gender field */
  public    Integer Gender  = null;
  protected boolean _GenderSet = false;
  /** CONTACTS.dept field */
  public    String Dept  = null;
  protected boolean _DeptSet = false;
  /** ADDRESS.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** ADDRESS.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** ADDRESS.address_line1 field */
  public    String AddressLine1  = null;
  protected boolean _AddressLine1Set = false;
  /** ADDRESS.address_line2 field */
  public    String AddressLine2  = null;
  protected boolean _AddressLine2Set = false;
  /** ADDRESS.address_line3 field */
  public    String AddressLine3  = null;
  protected boolean _AddressLine3Set = false;
  /** ADDRESS.address_line4 field */
  public    String AddressLine4  = null;
  protected boolean _AddressLine4Set = false;
  /** ADDRESS.city field */
  public    String City  = null;
  protected boolean _CitySet = false;
  /** ADDRESS.state field */
  public    String State  = null;
  protected boolean _StateSet = false;
  /** ADDRESS.postal_code field */
  public    String PostalCode  = null;
  protected boolean _PostalCodeSet = false;
  /** ADDRESS.country_code field */
  public    Integer CountryCode  = null;
  protected boolean _CountryCodeSet = false;
  /** ADDRESS.franchise_tax_code field */
  public    Integer FranchiseTaxCode  = null;
  protected boolean _FranchiseTaxCodeSet = false;
  /** ADDRESS.geocode field */
  public    String Geocode  = null;
  protected boolean _GeocodeSet = false;
  /** ADDRESS.county field */
  public    String County  = null;
  protected boolean _CountySet = false;
  private String _objName = "ContactObjectData";
  /** Default constructor */
  public ContactObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public ContactObjectData (ContactObjectData other)
  {

    if (other == null) return;
    this.Key = new ContactObjectKeyData (other.Key);
    this.CreateDt = other.CreateDt;
    this._CreateDtSet = other._CreateDtSet;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.NamePrefix = other.NamePrefix;
    this._NamePrefixSet = other._NamePrefixSet;
    this.FirstName = other.FirstName;
    this._FirstNameSet = other._FirstNameSet;
    this.MiddleName = other.MiddleName;
    this._MiddleNameSet = other._MiddleNameSet;
    this.LastName = other.LastName;
    this._LastNameSet = other._LastNameSet;
    this.Generation = other.Generation;
    this._GenerationSet = other._GenerationSet;
    this.Title = other.Title;
    this._TitleSet = other._TitleSet;
    this.Company = other.Company;
    this._CompanySet = other._CompanySet;
    this.AddressId = other.AddressId;
    this._AddressIdSet = other._AddressIdSet;
    this.AltLname = other.AltLname;
    this._AltLnameSet = other._AltLnameSet;
    this.AltFname = other.AltFname;
    this._AltFnameSet = other._AltFnameSet;
    this.AltCompany = other.AltCompany;
    this._AltCompanySet = other._AltCompanySet;
    this.Gender = other.Gender;
    this._GenderSet = other._GenderSet;
    this.Dept = other.Dept;
    this._DeptSet = other._DeptSet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.AddressLine1 = other.AddressLine1;
    this._AddressLine1Set = other._AddressLine1Set;
    this.AddressLine2 = other.AddressLine2;
    this._AddressLine2Set = other._AddressLine2Set;
    this.AddressLine3 = other.AddressLine3;
    this._AddressLine3Set = other._AddressLine3Set;
    this.AddressLine4 = other.AddressLine4;
    this._AddressLine4Set = other._AddressLine4Set;
    this.City = other.City;
    this._CitySet = other._CitySet;
    this.State = other.State;
    this._StateSet = other._StateSet;
    this.PostalCode = other.PostalCode;
    this._PostalCodeSet = other._PostalCodeSet;
    this.CountryCode = other.CountryCode;
    this._CountryCodeSet = other._CountryCodeSet;
    this.FranchiseTaxCode = other.FranchiseTaxCode;
    this._FranchiseTaxCodeSet = other._FranchiseTaxCodeSet;
    this.Geocode = other.Geocode;
    this._GeocodeSet = other._GeocodeSet;
    this.County = other.County;
    this._CountySet = other._CountySet;
  }

  /** get the Key for this object
   * @return ContactObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public ContactObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (ContactObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ContactId (CONTACTS.contact_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setContactId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContactId", "setContactId");
    }
    if (this.Key == null) this.Key = new ContactObjectKeyData ();
    this.Key.ContactId = value;
    this.Key._ContactIdSet = true;
  }
  /** get the value of the field: ContactId (CONTACTS.contact_id)
   * @return Integer the value
   */
  public Integer getContactId () {
    if (this.Key == null) return null;
    return this.Key.ContactId;
  }
  /** Change the field to not being actively set: ContactId (CONTACTS.contact_id)
   */
  public void unsetContactId () {
    if (this.Key == null) return;
    this.Key._ContactIdSet = false;
  }
  /** See if the field is actively set: ContactId (CONTACTS.contact_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetContactId () {
    if (this.Key == null) return false;
    return this.Key._ContactIdSet;
  }

  /** Retrieves the ContactId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContactId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContactId field
   */
   public String getContactIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContactIdAsFormattedString");
       return fmtMgr.formatNumber(this.getContactId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContactIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContactId field from a formatted string
   *
   * @param _value the ContactId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContactId field
   */
   public void setContactIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContactIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContactId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContactIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContactIdFromFormattedString");
   }

  /** set the fields value: CreateDt (CONTACTS.create_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CreateDt") 
  public void setCreateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CreateDt", "setCreateDt");
    }
    this.CreateDt = value;
    this._CreateDtSet = true;
  }

  /** Retrieves the CreateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CreateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
   public String getCreateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedString");
       return fmtMgr.formatDate(this.getCreateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the CreateDt field from a formatted string
   *
   * @param _value the CreateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
   public void setCreateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCreateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CreateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFromFormattedString");
   }

  /**
   * Retrieves the CreateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDt field
   */
  public String getCreateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCreateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDt field value from a formatted date/time string
   *
   * @param _value the CreateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CreateDt field
   */
  public void setCreateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCreateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: CreateDt (CONTACTS.create_dt)
   * @return Date the value
   */
  public Date getCreateDt () {
    return this.CreateDt;
  }
  /** Change the field to not being actively set: CreateDt (CONTACTS.create_dt)
   */
  public void unsetCreateDt () {
    this._CreateDtSet = false;
  }
  /** See if the field is actively set: CreateDt (CONTACTS.create_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetCreateDt () {
    return this._CreateDtSet;
  }
  /** set the fields value: ChgDt (CONTACTS.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (CONTACTS.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (CONTACTS.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (CONTACTS.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (CONTACTS.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (CONTACTS.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (CONTACTS.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (CONTACTS.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: NamePrefix (CONTACTS.name_prefix)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NamePrefix") 
  public void setNamePrefix (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "NamePrefix", "setNamePrefix");
    }
    this.NamePrefix = value;
    this._NamePrefixSet = true;
  }

  /** Retrieves the NamePrefix field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NamePrefix field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NamePrefix field
   */
   public String getNamePrefixAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamePrefixAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNamePrefixAsFormattedString");
       return fmtMgr.formatString(this.getNamePrefix());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamePrefix");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNamePrefixAsFormattedString");
       throw x;
     }
   }
  /** Sets the NamePrefix field from a formatted string
   *
   * @param _value the NamePrefix field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NamePrefix field
   */
   public void setNamePrefixFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNamePrefixFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNamePrefix(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NamePrefix");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNamePrefixFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNamePrefixFromFormattedString");
   }

  /** get the value of the field: NamePrefix (CONTACTS.name_prefix)
   * @return String the value
   */
  public String getNamePrefix () {
    return this.NamePrefix;
  }
  /** Change the field to not being actively set: NamePrefix (CONTACTS.name_prefix)
   */
  public void unsetNamePrefix () {
    this._NamePrefixSet = false;
  }
  /** See if the field is actively set: NamePrefix (CONTACTS.name_prefix)
   * @return boolean whether the field is actively set
   */
  public boolean issetNamePrefix () {
    return this._NamePrefixSet;
  }
  /** set the fields value: FirstName (CONTACTS.first_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FirstName") 
  public void setFirstName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FirstName", "setFirstName");
    }
    this.FirstName = value;
    this._FirstNameSet = true;
  }

  /** Retrieves the FirstName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FirstName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstName field
   */
   public String getFirstNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstNameAsFormattedString");
       return fmtMgr.formatString(this.getFirstName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FirstName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the FirstName field from a formatted string
   *
   * @param _value the FirstName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FirstName field
   */
   public void setFirstNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFirstName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FirstName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFirstNameFromFormattedString");
   }

  /** get the value of the field: FirstName (CONTACTS.first_name)
   * @return String the value
   */
  public String getFirstName () {
    return this.FirstName;
  }
  /** Change the field to not being actively set: FirstName (CONTACTS.first_name)
   */
  public void unsetFirstName () {
    this._FirstNameSet = false;
  }
  /** See if the field is actively set: FirstName (CONTACTS.first_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetFirstName () {
    return this._FirstNameSet;
  }
  /** set the fields value: MiddleName (CONTACTS.middle_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MiddleName") 
  public void setMiddleName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MiddleName", "setMiddleName");
    }
    this.MiddleName = value;
    this._MiddleNameSet = true;
  }

  /** Retrieves the MiddleName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MiddleName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiddleName field
   */
   public String getMiddleNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiddleNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiddleNameAsFormattedString");
       return fmtMgr.formatString(this.getMiddleName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiddleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiddleNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the MiddleName field from a formatted string
   *
   * @param _value the MiddleName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MiddleName field
   */
   public void setMiddleNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiddleNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMiddleName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MiddleName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiddleNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiddleNameFromFormattedString");
   }

  /** get the value of the field: MiddleName (CONTACTS.middle_name)
   * @return String the value
   */
  public String getMiddleName () {
    return this.MiddleName;
  }
  /** Change the field to not being actively set: MiddleName (CONTACTS.middle_name)
   */
  public void unsetMiddleName () {
    this._MiddleNameSet = false;
  }
  /** See if the field is actively set: MiddleName (CONTACTS.middle_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetMiddleName () {
    return this._MiddleNameSet;
  }
  /** set the fields value: LastName (CONTACTS.last_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LastName") 
  public void setLastName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LastName", "setLastName");
    }
    this.LastName = value;
    this._LastNameSet = true;
  }

  /** Retrieves the LastName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LastName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastName field
   */
   public String getLastNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastNameAsFormattedString");
       return fmtMgr.formatString(this.getLastName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the LastName field from a formatted string
   *
   * @param _value the LastName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LastName field
   */
   public void setLastNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLastName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastNameFromFormattedString");
   }

  /** get the value of the field: LastName (CONTACTS.last_name)
   * @return String the value
   */
  public String getLastName () {
    return this.LastName;
  }
  /** Change the field to not being actively set: LastName (CONTACTS.last_name)
   */
  public void unsetLastName () {
    this._LastNameSet = false;
  }
  /** See if the field is actively set: LastName (CONTACTS.last_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetLastName () {
    return this._LastNameSet;
  }
  /** set the fields value: Generation (CONTACTS.generation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Generation") 
  public void setGeneration (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 8))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Generation", "setGeneration");
    }
    this.Generation = value;
    this._GenerationSet = true;
  }

  /** Retrieves the Generation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Generation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Generation field
   */
   public String getGenerationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenerationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenerationAsFormattedString");
       return fmtMgr.formatString(this.getGeneration());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Generation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenerationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Generation field from a formatted string
   *
   * @param _value the Generation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Generation field
   */
   public void setGenerationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenerationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeneration(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Generation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenerationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenerationFromFormattedString");
   }

  /** get the value of the field: Generation (CONTACTS.generation)
   * @return String the value
   */
  public String getGeneration () {
    return this.Generation;
  }
  /** Change the field to not being actively set: Generation (CONTACTS.generation)
   */
  public void unsetGeneration () {
    this._GenerationSet = false;
  }
  /** See if the field is actively set: Generation (CONTACTS.generation)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeneration () {
    return this._GenerationSet;
  }
  /** set the fields value: Title (CONTACTS.title)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Title") 
  public void setTitle (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Title", "setTitle");
    }
    this.Title = value;
    this._TitleSet = true;
  }

  /** Retrieves the Title field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Title field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Title field
   */
   public String getTitleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTitleAsFormattedString");
       return fmtMgr.formatString(this.getTitle());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Title");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTitleAsFormattedString");
       throw x;
     }
   }
  /** Sets the Title field from a formatted string
   *
   * @param _value the Title field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Title field
   */
   public void setTitleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTitleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTitle(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Title");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTitleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTitleFromFormattedString");
   }

  /** get the value of the field: Title (CONTACTS.title)
   * @return String the value
   */
  public String getTitle () {
    return this.Title;
  }
  /** Change the field to not being actively set: Title (CONTACTS.title)
   */
  public void unsetTitle () {
    this._TitleSet = false;
  }
  /** See if the field is actively set: Title (CONTACTS.title)
   * @return boolean whether the field is actively set
   */
  public boolean issetTitle () {
    return this._TitleSet;
  }
  /** set the fields value: Company (CONTACTS.company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Company") 
  public void setCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Company", "setCompany");
    }
    this.Company = value;
    this._CompanySet = true;
  }

  /** Retrieves the Company field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Company field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Company field
   */
   public String getCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompanyAsFormattedString");
       return fmtMgr.formatString(this.getCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Company");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the Company field from a formatted string
   *
   * @param _value the Company field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Company field
   */
   public void setCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Company");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompanyFromFormattedString");
   }

  /** get the value of the field: Company (CONTACTS.company)
   * @return String the value
   */
  public String getCompany () {
    return this.Company;
  }
  /** Change the field to not being actively set: Company (CONTACTS.company)
   */
  public void unsetCompany () {
    this._CompanySet = false;
  }
  /** See if the field is actively set: Company (CONTACTS.company)
   * @return boolean whether the field is actively set
   */
  public boolean issetCompany () {
    return this._CompanySet;
  }
  /** set the fields value: AddressId (CONTACTS.address_id)
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

  /** get the value of the field: AddressId (CONTACTS.address_id)
   * @return BigInteger the value
   */
  public BigInteger getAddressId () {
    return this.AddressId;
  }
  /** Change the field to not being actively set: AddressId (CONTACTS.address_id)
   */
  public void unsetAddressId () {
    this._AddressIdSet = false;
  }
  /** See if the field is actively set: AddressId (CONTACTS.address_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressId () {
    return this._AddressIdSet;
  }
  /** set the fields value: AltLname (CONTACTS.alt_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltLname") 
  public void setAltLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltLname", "setAltLname");
    }
    this.AltLname = value;
    this._AltLnameSet = true;
  }

  /** Retrieves the AltLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltLname field
   */
   public String getAltLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltLnameAsFormattedString");
       return fmtMgr.formatString(this.getAltLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltLname field from a formatted string
   *
   * @param _value the AltLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltLname field
   */
   public void setAltLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltLnameFromFormattedString");
   }

  /** get the value of the field: AltLname (CONTACTS.alt_lname)
   * @return String the value
   */
  public String getAltLname () {
    return this.AltLname;
  }
  /** Change the field to not being actively set: AltLname (CONTACTS.alt_lname)
   */
  public void unsetAltLname () {
    this._AltLnameSet = false;
  }
  /** See if the field is actively set: AltLname (CONTACTS.alt_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltLname () {
    return this._AltLnameSet;
  }
  /** set the fields value: AltFname (CONTACTS.alt_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltFname") 
  public void setAltFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltFname", "setAltFname");
    }
    this.AltFname = value;
    this._AltFnameSet = true;
  }

  /** Retrieves the AltFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltFname field
   */
   public String getAltFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltFnameAsFormattedString");
       return fmtMgr.formatString(this.getAltFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltFname field from a formatted string
   *
   * @param _value the AltFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltFname field
   */
   public void setAltFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltFnameFromFormattedString");
   }

  /** get the value of the field: AltFname (CONTACTS.alt_fname)
   * @return String the value
   */
  public String getAltFname () {
    return this.AltFname;
  }
  /** Change the field to not being actively set: AltFname (CONTACTS.alt_fname)
   */
  public void unsetAltFname () {
    this._AltFnameSet = false;
  }
  /** See if the field is actively set: AltFname (CONTACTS.alt_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltFname () {
    return this._AltFnameSet;
  }
  /** set the fields value: AltCompany (CONTACTS.alt_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltCompany") 
  public void setAltCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltCompany", "setAltCompany");
    }
    this.AltCompany = value;
    this._AltCompanySet = true;
  }

  /** Retrieves the AltCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompany field
   */
   public String getAltCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyAsFormattedString");
       return fmtMgr.formatString(this.getAltCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltCompany field from a formatted string
   *
   * @param _value the AltCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltCompany field
   */
   public void setAltCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyFromFormattedString");
   }

  /** get the value of the field: AltCompany (CONTACTS.alt_company)
   * @return String the value
   */
  public String getAltCompany () {
    return this.AltCompany;
  }
  /** Change the field to not being actively set: AltCompany (CONTACTS.alt_company)
   */
  public void unsetAltCompany () {
    this._AltCompanySet = false;
  }
  /** See if the field is actively set: AltCompany (CONTACTS.alt_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltCompany () {
    return this._AltCompanySet;
  }
  /** set the fields value: Gender (CONTACTS.gender)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Gender") 
  public void setGender (Integer value) throws ServiceException
  {
    this.Gender = value;
    this._GenderSet = true;
  }

  /** Retrieves the Gender field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Gender field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Gender field
   */
   public String getGenderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGenderAsFormattedString");
       return fmtMgr.formatNumber(this.getGender(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Gender");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGenderAsFormattedString");
       throw x;
     }
   }
  /** Sets the Gender field from a formatted string
   *
   * @param _value the Gender field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Gender field
   */
   public void setGenderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGenderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGender(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Gender");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGenderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGenderFromFormattedString");
   }

  /** get the value of the field: Gender (CONTACTS.gender)
   * @return Integer the value
   */
  public Integer getGender () {
    return this.Gender;
  }
  /** Change the field to not being actively set: Gender (CONTACTS.gender)
   */
  public void unsetGender () {
    this._GenderSet = false;
  }
  /** See if the field is actively set: Gender (CONTACTS.gender)
   * @return boolean whether the field is actively set
   */
  public boolean issetGender () {
    return this._GenderSet;
  }
  /** set the fields value: Dept (CONTACTS.dept)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Dept") 
  public void setDept (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Dept", "setDept");
    }
    this.Dept = value;
    this._DeptSet = true;
  }

  /** Retrieves the Dept field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Dept field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Dept field
   */
   public String getDeptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeptAsFormattedString");
       return fmtMgr.formatString(this.getDept());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dept");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeptAsFormattedString");
       throw x;
     }
   }
  /** Sets the Dept field from a formatted string
   *
   * @param _value the Dept field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Dept field
   */
   public void setDeptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDept(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Dept");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeptFromFormattedString");
   }

  /** get the value of the field: Dept (CONTACTS.dept)
   * @return String the value
   */
  public String getDept () {
    return this.Dept;
  }
  /** Change the field to not being actively set: Dept (CONTACTS.dept)
   */
  public void unsetDept () {
    this._DeptSet = false;
  }
  /** See if the field is actively set: Dept (CONTACTS.dept)
   * @return boolean whether the field is actively set
   */
  public boolean issetDept () {
    return this._DeptSet;
  }
  /** set the fields value: DateActive (ADDRESS.date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateActive") 
  public void setDateActive (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DateActive", "setDateActive");
    }
    this.DateActive = value;
    this._DateActiveSet = true;
  }

  /** Retrieves the DateActive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateActive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
   public String getDateActiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateActive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateActive field from a formatted string
   *
   * @param _value the DateActive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
   public void setDateActiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateActive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFromFormattedString");
   }

  /**
   * Retrieves the DateActive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActive field
   */
  public String getDateActiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateActive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActive field value from a formatted date/time string
   *
   * @param _value the DateActive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateActive field
   */
  public void setDateActiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateActive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateActive (ADDRESS.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (ADDRESS.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (ADDRESS.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: DateInactive (ADDRESS.date_inactive)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DateInactive") 
  public void setDateInactive (Date value) throws ServiceException
  {
    this.DateInactive = value;
    this._DateInactiveSet = true;
  }

  /** Retrieves the DateInactive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DateInactive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
   public String getDateInactiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedString");
       return fmtMgr.formatDate(this.getDateInactive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the DateInactive field from a formatted string
   *
   * @param _value the DateInactive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
   public void setDateInactiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDateInactive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DateInactive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFromFormattedString");
   }

  /**
   * Retrieves the DateInactive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactive field
   */
  public String getDateInactiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getDateInactive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactive field value from a formatted date/time string
   *
   * @param _value the DateInactive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DateInactive field
   */
  public void setDateInactiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDateInactive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: DateInactive (ADDRESS.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (ADDRESS.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (ADDRESS.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: AddressLine1 (ADDRESS.address_line1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressLine1") 
  public void setAddressLine1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressLine1", "setAddressLine1");
    }
    this.AddressLine1 = value;
    this._AddressLine1Set = true;
  }

  /** Retrieves the AddressLine1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressLine1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine1 field
   */
   public String getAddressLine1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine1AsFormattedString");
       return fmtMgr.formatString(this.getAddressLine1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine1AsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressLine1 field from a formatted string
   *
   * @param _value the AddressLine1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressLine1 field
   */
   public void setAddressLine1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressLine1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine1FromFormattedString");
   }

  /** get the value of the field: AddressLine1 (ADDRESS.address_line1)
   * @return String the value
   */
  public String getAddressLine1 () {
    return this.AddressLine1;
  }
  /** Change the field to not being actively set: AddressLine1 (ADDRESS.address_line1)
   */
  public void unsetAddressLine1 () {
    this._AddressLine1Set = false;
  }
  /** See if the field is actively set: AddressLine1 (ADDRESS.address_line1)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressLine1 () {
    return this._AddressLine1Set;
  }
  /** set the fields value: AddressLine2 (ADDRESS.address_line2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressLine2") 
  public void setAddressLine2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressLine2", "setAddressLine2");
    }
    this.AddressLine2 = value;
    this._AddressLine2Set = true;
  }

  /** Retrieves the AddressLine2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressLine2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine2 field
   */
   public String getAddressLine2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine2AsFormattedString");
       return fmtMgr.formatString(this.getAddressLine2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine2AsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressLine2 field from a formatted string
   *
   * @param _value the AddressLine2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressLine2 field
   */
   public void setAddressLine2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressLine2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine2FromFormattedString");
   }

  /** get the value of the field: AddressLine2 (ADDRESS.address_line2)
   * @return String the value
   */
  public String getAddressLine2 () {
    return this.AddressLine2;
  }
  /** Change the field to not being actively set: AddressLine2 (ADDRESS.address_line2)
   */
  public void unsetAddressLine2 () {
    this._AddressLine2Set = false;
  }
  /** See if the field is actively set: AddressLine2 (ADDRESS.address_line2)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressLine2 () {
    return this._AddressLine2Set;
  }
  /** set the fields value: AddressLine3 (ADDRESS.address_line3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressLine3") 
  public void setAddressLine3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressLine3", "setAddressLine3");
    }
    this.AddressLine3 = value;
    this._AddressLine3Set = true;
  }

  /** Retrieves the AddressLine3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressLine3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine3 field
   */
   public String getAddressLine3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine3AsFormattedString");
       return fmtMgr.formatString(this.getAddressLine3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine3AsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressLine3 field from a formatted string
   *
   * @param _value the AddressLine3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressLine3 field
   */
   public void setAddressLine3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressLine3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine3FromFormattedString");
   }

  /** get the value of the field: AddressLine3 (ADDRESS.address_line3)
   * @return String the value
   */
  public String getAddressLine3 () {
    return this.AddressLine3;
  }
  /** Change the field to not being actively set: AddressLine3 (ADDRESS.address_line3)
   */
  public void unsetAddressLine3 () {
    this._AddressLine3Set = false;
  }
  /** See if the field is actively set: AddressLine3 (ADDRESS.address_line3)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressLine3 () {
    return this._AddressLine3Set;
  }
  /** set the fields value: AddressLine4 (ADDRESS.address_line4)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddressLine4") 
  public void setAddressLine4 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AddressLine4", "setAddressLine4");
    }
    this.AddressLine4 = value;
    this._AddressLine4Set = true;
  }

  /** Retrieves the AddressLine4 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddressLine4 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddressLine4 field
   */
   public String getAddressLine4AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine4AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddressLine4AsFormattedString");
       return fmtMgr.formatString(this.getAddressLine4());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine4");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddressLine4AsFormattedString");
       throw x;
     }
   }
  /** Sets the AddressLine4 field from a formatted string
   *
   * @param _value the AddressLine4 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddressLine4 field
   */
   public void setAddressLine4FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddressLine4FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddressLine4(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddressLine4");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddressLine4FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddressLine4FromFormattedString");
   }

  /** get the value of the field: AddressLine4 (ADDRESS.address_line4)
   * @return String the value
   */
  public String getAddressLine4 () {
    return this.AddressLine4;
  }
  /** Change the field to not being actively set: AddressLine4 (ADDRESS.address_line4)
   */
  public void unsetAddressLine4 () {
    this._AddressLine4Set = false;
  }
  /** See if the field is actively set: AddressLine4 (ADDRESS.address_line4)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddressLine4 () {
    return this._AddressLine4Set;
  }
  /** set the fields value: City (ADDRESS.city)
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

  /** get the value of the field: City (ADDRESS.city)
   * @return String the value
   */
  public String getCity () {
    return this.City;
  }
  /** Change the field to not being actively set: City (ADDRESS.city)
   */
  public void unsetCity () {
    this._CitySet = false;
  }
  /** See if the field is actively set: City (ADDRESS.city)
   * @return boolean whether the field is actively set
   */
  public boolean issetCity () {
    return this._CitySet;
  }
  /** set the fields value: State (ADDRESS.state)
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

  /** get the value of the field: State (ADDRESS.state)
   * @return String the value
   */
  public String getState () {
    return this.State;
  }
  /** Change the field to not being actively set: State (ADDRESS.state)
   */
  public void unsetState () {
    this._StateSet = false;
  }
  /** See if the field is actively set: State (ADDRESS.state)
   * @return boolean whether the field is actively set
   */
  public boolean issetState () {
    return this._StateSet;
  }
  /** set the fields value: PostalCode (ADDRESS.postal_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PostalCode") 
  public void setPostalCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PostalCode", "setPostalCode");
    }
    this.PostalCode = value;
    this._PostalCodeSet = true;
  }

  /** Retrieves the PostalCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostalCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostalCode field
   */
   public String getPostalCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostalCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostalCodeAsFormattedString");
       return fmtMgr.formatString(this.getPostalCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostalCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostalCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostalCode field from a formatted string
   *
   * @param _value the PostalCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostalCode field
   */
   public void setPostalCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostalCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostalCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostalCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostalCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostalCodeFromFormattedString");
   }

  /** get the value of the field: PostalCode (ADDRESS.postal_code)
   * @return String the value
   */
  public String getPostalCode () {
    return this.PostalCode;
  }
  /** Change the field to not being actively set: PostalCode (ADDRESS.postal_code)
   */
  public void unsetPostalCode () {
    this._PostalCodeSet = false;
  }
  /** See if the field is actively set: PostalCode (ADDRESS.postal_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetPostalCode () {
    return this._PostalCodeSet;
  }
  /** set the fields value: CountryCode (ADDRESS.country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCode") 
  public void setCountryCode (Integer value) throws ServiceException
  {
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

  /** get the value of the field: CountryCode (ADDRESS.country_code)
   * @return Integer the value
   */
  public Integer getCountryCode () {
    return this.CountryCode;
  }
  /** Change the field to not being actively set: CountryCode (ADDRESS.country_code)
   */
  public void unsetCountryCode () {
    this._CountryCodeSet = false;
  }
  /** See if the field is actively set: CountryCode (ADDRESS.country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCode () {
    return this._CountryCodeSet;
  }
  /** set the fields value: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FranchiseTaxCode") 
  public void setFranchiseTaxCode (Integer value) throws ServiceException
  {
    this.FranchiseTaxCode = value;
    this._FranchiseTaxCodeSet = true;
  }

  /** Retrieves the FranchiseTaxCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FranchiseTaxCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseTaxCode field
   */
   public String getFranchiseTaxCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseTaxCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseTaxCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFranchiseTaxCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseTaxCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FranchiseTaxCode field from a formatted string
   *
   * @param _value the FranchiseTaxCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FranchiseTaxCode field
   */
   public void setFranchiseTaxCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseTaxCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFranchiseTaxCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseTaxCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseTaxCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseTaxCodeFromFormattedString");
   }

  /** get the value of the field: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return Integer the value
   */
  public Integer getFranchiseTaxCode () {
    return this.FranchiseTaxCode;
  }
  /** Change the field to not being actively set: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   */
  public void unsetFranchiseTaxCode () {
    this._FranchiseTaxCodeSet = false;
  }
  /** See if the field is actively set: FranchiseTaxCode (ADDRESS.franchise_tax_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseTaxCode () {
    return this._FranchiseTaxCodeSet;
  }
  /** set the fields value: Geocode (ADDRESS.geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Geocode") 
  public void setGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Geocode", "setGeocode");
    }
    this.Geocode = value;
    this._GeocodeSet = true;
  }

  /** Retrieves the Geocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Geocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Geocode field
   */
   public String getGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the Geocode field from a formatted string
   *
   * @param _value the Geocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Geocode field
   */
   public void setGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFromFormattedString");
   }

  /** get the value of the field: Geocode (ADDRESS.geocode)
   * @return String the value
   */
  public String getGeocode () {
    return this.Geocode;
  }
  /** Change the field to not being actively set: Geocode (ADDRESS.geocode)
   */
  public void unsetGeocode () {
    this._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode (ADDRESS.geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode () {
    return this._GeocodeSet;
  }
  /** set the fields value: County (ADDRESS.county)
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

  /** get the value of the field: County (ADDRESS.county)
   * @return String the value
   */
  public String getCounty () {
    return this.County;
  }
  /** Change the field to not being actively set: County (ADDRESS.county)
   */
  public void unsetCounty () {
    this._CountySet = false;
  }
  /** See if the field is actively set: County (ADDRESS.county)
   * @return boolean whether the field is actively set
   */
  public boolean issetCounty () {
    return this._CountySet;
  }
  public String toString() {
    return ContactObjectHelper.toMap(this, null).toString();
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
  /** CONTACTS.create_dt field */
    if(!nonNullOnly || (CreateDt != null))  _CreateDtSet = flag;
  /** CONTACTS.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** CONTACTS.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** CONTACTS.name_prefix field */
    if(!nonNullOnly || (NamePrefix != null))  _NamePrefixSet = flag;
  /** CONTACTS.first_name field */
    if(!nonNullOnly || (FirstName != null))  _FirstNameSet = flag;
  /** CONTACTS.middle_name field */
    if(!nonNullOnly || (MiddleName != null))  _MiddleNameSet = flag;
  /** CONTACTS.last_name field */
    if(!nonNullOnly || (LastName != null))  _LastNameSet = flag;
  /** CONTACTS.generation field */
    if(!nonNullOnly || (Generation != null))  _GenerationSet = flag;
  /** CONTACTS.title field */
    if(!nonNullOnly || (Title != null))  _TitleSet = flag;
  /** CONTACTS.company field */
    if(!nonNullOnly || (Company != null))  _CompanySet = flag;
  /** CONTACTS.address_id field */
    if(!nonNullOnly || (AddressId != null))  _AddressIdSet = flag;
  /** CONTACTS.alt_lname field */
    if(!nonNullOnly || (AltLname != null))  _AltLnameSet = flag;
  /** CONTACTS.alt_fname field */
    if(!nonNullOnly || (AltFname != null))  _AltFnameSet = flag;
  /** CONTACTS.alt_company field */
    if(!nonNullOnly || (AltCompany != null))  _AltCompanySet = flag;
  /** CONTACTS.gender field */
    if(!nonNullOnly || (Gender != null))  _GenderSet = flag;
  /** CONTACTS.dept field */
    if(!nonNullOnly || (Dept != null))  _DeptSet = flag;
  /** ADDRESS.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** ADDRESS.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** ADDRESS.address_line1 field */
    if(!nonNullOnly || (AddressLine1 != null))  _AddressLine1Set = flag;
  /** ADDRESS.address_line2 field */
    if(!nonNullOnly || (AddressLine2 != null))  _AddressLine2Set = flag;
  /** ADDRESS.address_line3 field */
    if(!nonNullOnly || (AddressLine3 != null))  _AddressLine3Set = flag;
  /** ADDRESS.address_line4 field */
    if(!nonNullOnly || (AddressLine4 != null))  _AddressLine4Set = flag;
  /** ADDRESS.city field */
    if(!nonNullOnly || (City != null))  _CitySet = flag;
  /** ADDRESS.state field */
    if(!nonNullOnly || (State != null))  _StateSet = flag;
  /** ADDRESS.postal_code field */
    if(!nonNullOnly || (PostalCode != null))  _PostalCodeSet = flag;
  /** ADDRESS.country_code field */
    if(!nonNullOnly || (CountryCode != null))  _CountryCodeSet = flag;
  /** ADDRESS.franchise_tax_code field */
    if(!nonNullOnly || (FranchiseTaxCode != null))  _FranchiseTaxCodeSet = flag;
  /** ADDRESS.geocode field */
    if(!nonNullOnly || (Geocode != null))  _GeocodeSet = flag;
  /** ADDRESS.county field */
    if(!nonNullOnly || (County != null))  _CountySet = flag;
  }
}
