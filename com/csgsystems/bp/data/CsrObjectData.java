/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectData.java
 * Definition File: Admin/Csr.xml
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
  
/** CsrObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CsrObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CsrObjectKeyData Key = null;
  /** CSR_INFORMATION.supervisor_name field */
  public    String SupervisorName  = null;
  protected boolean _SupervisorNameSet = false;
  /** CSR_INFORMATION.csr_lname field */
  public    String CsrLname  = null;
  protected boolean _CsrLnameSet = false;
  /** CSR_INFORMATION.csr_fname field */
  public    String CsrFname  = null;
  protected boolean _CsrFnameSet = false;
  /** CSR_INFORMATION.csr_minit field */
  public    String CsrMinit  = null;
  protected boolean _CsrMinitSet = false;
  /** CSR_INFORMATION.csr_title field */
  public    String CsrTitle  = null;
  protected boolean _CsrTitleSet = false;
  /** CSR_INFORMATION.csr_phone field */
  public    String CsrPhone  = null;
  protected boolean _CsrPhoneSet = false;
  /** CSR_INFORMATION.csr_email field */
  public    String CsrEmail  = null;
  protected boolean _CsrEmailSet = false;
  /** CSR_INFORMATION.csr_address1 field */
  public    String CsrAddress1  = null;
  protected boolean _CsrAddress1Set = false;
  /** CSR_INFORMATION.csr_address2 field */
  public    String CsrAddress2  = null;
  protected boolean _CsrAddress2Set = false;
  /** CSR_INFORMATION.csr_address3 field */
  public    String CsrAddress3  = null;
  protected boolean _CsrAddress3Set = false;
  /** CSR_INFORMATION.csr_city field */
  public    String CsrCity  = null;
  protected boolean _CsrCitySet = false;
  /** CSR_INFORMATION.csr_state field */
  public    String CsrState  = null;
  protected boolean _CsrStateSet = false;
  /** CSR_INFORMATION.csr_zip field */
  public    String CsrZip  = null;
  protected boolean _CsrZipSet = false;
  /** CSR_INFORMATION.csr_country_code field */
  public    Integer CsrCountryCode  = null;
  protected boolean _CsrCountryCodeSet = false;
  /** CSR_INFORMATION.csr_county field */
  public    String CsrCounty  = null;
  protected boolean _CsrCountySet = false;
  /** CSR_INFORMATION.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** CSR_INFORMATION.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** CSR_INFORMATION.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "CsrObjectData";
  /** Default constructor */
  public CsrObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CsrObjectData (CsrObjectData other)
  {

    if (other == null) return;
    this.Key = new CsrObjectKeyData (other.Key);
    this.SupervisorName = other.SupervisorName;
    this._SupervisorNameSet = other._SupervisorNameSet;
    this.CsrLname = other.CsrLname;
    this._CsrLnameSet = other._CsrLnameSet;
    this.CsrFname = other.CsrFname;
    this._CsrFnameSet = other._CsrFnameSet;
    this.CsrMinit = other.CsrMinit;
    this._CsrMinitSet = other._CsrMinitSet;
    this.CsrTitle = other.CsrTitle;
    this._CsrTitleSet = other._CsrTitleSet;
    this.CsrPhone = other.CsrPhone;
    this._CsrPhoneSet = other._CsrPhoneSet;
    this.CsrEmail = other.CsrEmail;
    this._CsrEmailSet = other._CsrEmailSet;
    this.CsrAddress1 = other.CsrAddress1;
    this._CsrAddress1Set = other._CsrAddress1Set;
    this.CsrAddress2 = other.CsrAddress2;
    this._CsrAddress2Set = other._CsrAddress2Set;
    this.CsrAddress3 = other.CsrAddress3;
    this._CsrAddress3Set = other._CsrAddress3Set;
    this.CsrCity = other.CsrCity;
    this._CsrCitySet = other._CsrCitySet;
    this.CsrState = other.CsrState;
    this._CsrStateSet = other._CsrStateSet;
    this.CsrZip = other.CsrZip;
    this._CsrZipSet = other._CsrZipSet;
    this.CsrCountryCode = other.CsrCountryCode;
    this._CsrCountryCodeSet = other._CsrCountryCodeSet;
    this.CsrCounty = other.CsrCounty;
    this._CsrCountySet = other._CsrCountySet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return CsrObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CsrObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CsrObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: UserName (CSR_INFORMATION.user_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setUserName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UserName", "setUserName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UserName", "setUserName");
    }
    if (this.Key == null) this.Key = new CsrObjectKeyData ();
    this.Key.UserName = value;
    this.Key._UserNameSet = true;
  }
  /** get the value of the field: UserName (CSR_INFORMATION.user_name)
   * @return String the value
   */
  public String getUserName () {
    if (this.Key == null) return null;
    return this.Key.UserName;
  }
  /** Change the field to not being actively set: UserName (CSR_INFORMATION.user_name)
   */
  public void unsetUserName () {
    if (this.Key == null) return;
    this.Key._UserNameSet = false;
  }
  /** See if the field is actively set: UserName (CSR_INFORMATION.user_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetUserName () {
    if (this.Key == null) return false;
    return this.Key._UserNameSet;
  }

  /** Retrieves the UserName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UserName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserName field
   */
   public String getUserNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserNameAsFormattedString");
       return fmtMgr.formatString(this.getUserName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the UserName field from a formatted string
   *
   * @param _value the UserName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UserName field
   */
   public void setUserNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUserName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserNameFromFormattedString");
   }

  /** set the fields value: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SupervisorName") 
  public void setSupervisorName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SupervisorName", "setSupervisorName");
    }
    this.SupervisorName = value;
    this._SupervisorNameSet = true;
  }

  /** Retrieves the SupervisorName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SupervisorName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorName field
   */
   public String getSupervisorNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameAsFormattedString");
       return fmtMgr.formatString(this.getSupervisorName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the SupervisorName field from a formatted string
   *
   * @param _value the SupervisorName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SupervisorName field
   */
   public void setSupervisorNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSupervisorName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFromFormattedString");
   }

  /** get the value of the field: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return String the value
   */
  public String getSupervisorName () {
    return this.SupervisorName;
  }
  /** Change the field to not being actively set: SupervisorName (CSR_INFORMATION.supervisor_name)
   */
  public void unsetSupervisorName () {
    this._SupervisorNameSet = false;
  }
  /** See if the field is actively set: SupervisorName (CSR_INFORMATION.supervisor_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetSupervisorName () {
    return this._SupervisorNameSet;
  }
  /** set the fields value: CsrLname (CSR_INFORMATION.csr_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrLname") 
  public void setCsrLname (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrLname", "setCsrLname");
    }
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrLname", "setCsrLname");
    }
    this.CsrLname = value;
    this._CsrLnameSet = true;
  }

  /** Retrieves the CsrLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrLname field
   */
   public String getCsrLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrLnameAsFormattedString");
       return fmtMgr.formatString(this.getCsrLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrLname field from a formatted string
   *
   * @param _value the CsrLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrLname field
   */
   public void setCsrLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrLnameFromFormattedString");
   }

  /** get the value of the field: CsrLname (CSR_INFORMATION.csr_lname)
   * @return String the value
   */
  public String getCsrLname () {
    return this.CsrLname;
  }
  /** Change the field to not being actively set: CsrLname (CSR_INFORMATION.csr_lname)
   */
  public void unsetCsrLname () {
    this._CsrLnameSet = false;
  }
  /** See if the field is actively set: CsrLname (CSR_INFORMATION.csr_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrLname () {
    return this._CsrLnameSet;
  }
  /** set the fields value: CsrFname (CSR_INFORMATION.csr_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrFname") 
  public void setCsrFname (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrFname", "setCsrFname");
    }
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrFname", "setCsrFname");
    }
    this.CsrFname = value;
    this._CsrFnameSet = true;
  }

  /** Retrieves the CsrFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrFname field
   */
   public String getCsrFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrFnameAsFormattedString");
       return fmtMgr.formatString(this.getCsrFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrFname field from a formatted string
   *
   * @param _value the CsrFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrFname field
   */
   public void setCsrFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrFnameFromFormattedString");
   }

  /** get the value of the field: CsrFname (CSR_INFORMATION.csr_fname)
   * @return String the value
   */
  public String getCsrFname () {
    return this.CsrFname;
  }
  /** Change the field to not being actively set: CsrFname (CSR_INFORMATION.csr_fname)
   */
  public void unsetCsrFname () {
    this._CsrFnameSet = false;
  }
  /** See if the field is actively set: CsrFname (CSR_INFORMATION.csr_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrFname () {
    return this._CsrFnameSet;
  }
  /** set the fields value: CsrMinit (CSR_INFORMATION.csr_minit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrMinit") 
  public void setCsrMinit (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrMinit", "setCsrMinit");
    }
    this.CsrMinit = value;
    this._CsrMinitSet = true;
  }

  /** Retrieves the CsrMinit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrMinit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrMinit field
   */
   public String getCsrMinitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrMinitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrMinitAsFormattedString");
       return fmtMgr.formatString(this.getCsrMinit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrMinitAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrMinit field from a formatted string
   *
   * @param _value the CsrMinit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrMinit field
   */
   public void setCsrMinitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrMinitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrMinit(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrMinitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrMinitFromFormattedString");
   }

  /** get the value of the field: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return String the value
   */
  public String getCsrMinit () {
    return this.CsrMinit;
  }
  /** Change the field to not being actively set: CsrMinit (CSR_INFORMATION.csr_minit)
   */
  public void unsetCsrMinit () {
    this._CsrMinitSet = false;
  }
  /** See if the field is actively set: CsrMinit (CSR_INFORMATION.csr_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrMinit () {
    return this._CsrMinitSet;
  }
  /** set the fields value: CsrTitle (CSR_INFORMATION.csr_title)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrTitle") 
  public void setCsrTitle (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 40))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrTitle", "setCsrTitle");
    }
    this.CsrTitle = value;
    this._CsrTitleSet = true;
  }

  /** Retrieves the CsrTitle field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrTitle field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrTitle field
   */
   public String getCsrTitleAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrTitleAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrTitleAsFormattedString");
       return fmtMgr.formatString(this.getCsrTitle());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrTitle");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrTitleAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrTitle field from a formatted string
   *
   * @param _value the CsrTitle field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrTitle field
   */
   public void setCsrTitleFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrTitleFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrTitle(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrTitle");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrTitleFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrTitleFromFormattedString");
   }

  /** get the value of the field: CsrTitle (CSR_INFORMATION.csr_title)
   * @return String the value
   */
  public String getCsrTitle () {
    return this.CsrTitle;
  }
  /** Change the field to not being actively set: CsrTitle (CSR_INFORMATION.csr_title)
   */
  public void unsetCsrTitle () {
    this._CsrTitleSet = false;
  }
  /** See if the field is actively set: CsrTitle (CSR_INFORMATION.csr_title)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrTitle () {
    return this._CsrTitleSet;
  }
  /** set the fields value: CsrPhone (CSR_INFORMATION.csr_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrPhone") 
  public void setCsrPhone (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrPhone", "setCsrPhone");
    }
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrPhone", "setCsrPhone");
    }
    this.CsrPhone = value;
    this._CsrPhoneSet = true;
  }

  /** Retrieves the CsrPhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrPhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrPhone field
   */
   public String getCsrPhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrPhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrPhoneAsFormattedString");
       return fmtMgr.formatString(this.getCsrPhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrPhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrPhone field from a formatted string
   *
   * @param _value the CsrPhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrPhone field
   */
   public void setCsrPhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrPhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrPhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrPhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrPhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrPhoneFromFormattedString");
   }

  /** get the value of the field: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return String the value
   */
  public String getCsrPhone () {
    return this.CsrPhone;
  }
  /** Change the field to not being actively set: CsrPhone (CSR_INFORMATION.csr_phone)
   */
  public void unsetCsrPhone () {
    this._CsrPhoneSet = false;
  }
  /** See if the field is actively set: CsrPhone (CSR_INFORMATION.csr_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrPhone () {
    return this._CsrPhoneSet;
  }
  /** set the fields value: CsrEmail (CSR_INFORMATION.csr_email)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrEmail") 
  public void setCsrEmail (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrEmail", "setCsrEmail");
    }
    this.CsrEmail = value;
    this._CsrEmailSet = true;
  }

  /** Retrieves the CsrEmail field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrEmail field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrEmail field
   */
   public String getCsrEmailAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrEmailAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrEmailAsFormattedString");
       return fmtMgr.formatString(this.getCsrEmail());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrEmailAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrEmail field from a formatted string
   *
   * @param _value the CsrEmail field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrEmail field
   */
   public void setCsrEmailFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrEmailFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrEmail(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrEmail");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrEmailFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrEmailFromFormattedString");
   }

  /** get the value of the field: CsrEmail (CSR_INFORMATION.csr_email)
   * @return String the value
   */
  public String getCsrEmail () {
    return this.CsrEmail;
  }
  /** Change the field to not being actively set: CsrEmail (CSR_INFORMATION.csr_email)
   */
  public void unsetCsrEmail () {
    this._CsrEmailSet = false;
  }
  /** See if the field is actively set: CsrEmail (CSR_INFORMATION.csr_email)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrEmail () {
    return this._CsrEmailSet;
  }
  /** set the fields value: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrAddress1") 
  public void setCsrAddress1 (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrAddress1", "setCsrAddress1");
    }
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrAddress1", "setCsrAddress1");
    }
    this.CsrAddress1 = value;
    this._CsrAddress1Set = true;
  }

  /** Retrieves the CsrAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress1 field
   */
   public String getCsrAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress1AsFormattedString");
       return fmtMgr.formatString(this.getCsrAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrAddress1 field from a formatted string
   *
   * @param _value the CsrAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrAddress1 field
   */
   public void setCsrAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress1FromFormattedString");
   }

  /** get the value of the field: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return String the value
   */
  public String getCsrAddress1 () {
    return this.CsrAddress1;
  }
  /** Change the field to not being actively set: CsrAddress1 (CSR_INFORMATION.csr_address1)
   */
  public void unsetCsrAddress1 () {
    this._CsrAddress1Set = false;
  }
  /** See if the field is actively set: CsrAddress1 (CSR_INFORMATION.csr_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrAddress1 () {
    return this._CsrAddress1Set;
  }
  /** set the fields value: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrAddress2") 
  public void setCsrAddress2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrAddress2", "setCsrAddress2");
    }
    this.CsrAddress2 = value;
    this._CsrAddress2Set = true;
  }

  /** Retrieves the CsrAddress2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrAddress2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress2 field
   */
   public String getCsrAddress2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress2AsFormattedString");
       return fmtMgr.formatString(this.getCsrAddress2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrAddress2 field from a formatted string
   *
   * @param _value the CsrAddress2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrAddress2 field
   */
   public void setCsrAddress2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrAddress2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress2FromFormattedString");
   }

  /** get the value of the field: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return String the value
   */
  public String getCsrAddress2 () {
    return this.CsrAddress2;
  }
  /** Change the field to not being actively set: CsrAddress2 (CSR_INFORMATION.csr_address2)
   */
  public void unsetCsrAddress2 () {
    this._CsrAddress2Set = false;
  }
  /** See if the field is actively set: CsrAddress2 (CSR_INFORMATION.csr_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrAddress2 () {
    return this._CsrAddress2Set;
  }
  /** set the fields value: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrAddress3") 
  public void setCsrAddress3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrAddress3", "setCsrAddress3");
    }
    this.CsrAddress3 = value;
    this._CsrAddress3Set = true;
  }

  /** Retrieves the CsrAddress3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrAddress3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrAddress3 field
   */
   public String getCsrAddress3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrAddress3AsFormattedString");
       return fmtMgr.formatString(this.getCsrAddress3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrAddress3AsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrAddress3 field from a formatted string
   *
   * @param _value the CsrAddress3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrAddress3 field
   */
   public void setCsrAddress3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrAddress3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrAddress3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrAddress3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrAddress3FromFormattedString");
   }

  /** get the value of the field: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return String the value
   */
  public String getCsrAddress3 () {
    return this.CsrAddress3;
  }
  /** Change the field to not being actively set: CsrAddress3 (CSR_INFORMATION.csr_address3)
   */
  public void unsetCsrAddress3 () {
    this._CsrAddress3Set = false;
  }
  /** See if the field is actively set: CsrAddress3 (CSR_INFORMATION.csr_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrAddress3 () {
    return this._CsrAddress3Set;
  }
  /** set the fields value: CsrCity (CSR_INFORMATION.csr_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrCity") 
  public void setCsrCity (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrCity", "setCsrCity");
    }
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrCity", "setCsrCity");
    }
    this.CsrCity = value;
    this._CsrCitySet = true;
  }

  /** Retrieves the CsrCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCity field
   */
   public String getCsrCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCityAsFormattedString");
       return fmtMgr.formatString(this.getCsrCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrCity field from a formatted string
   *
   * @param _value the CsrCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrCity field
   */
   public void setCsrCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCityFromFormattedString");
   }

  /** get the value of the field: CsrCity (CSR_INFORMATION.csr_city)
   * @return String the value
   */
  public String getCsrCity () {
    return this.CsrCity;
  }
  /** Change the field to not being actively set: CsrCity (CSR_INFORMATION.csr_city)
   */
  public void unsetCsrCity () {
    this._CsrCitySet = false;
  }
  /** See if the field is actively set: CsrCity (CSR_INFORMATION.csr_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrCity () {
    return this._CsrCitySet;
  }
  /** set the fields value: CsrState (CSR_INFORMATION.csr_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrState") 
  public void setCsrState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrState", "setCsrState");
    }
    this.CsrState = value;
    this._CsrStateSet = true;
  }

  /** Retrieves the CsrState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrState field
   */
   public String getCsrStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrStateAsFormattedString");
       return fmtMgr.formatString(this.getCsrState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrState field from a formatted string
   *
   * @param _value the CsrState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrState field
   */
   public void setCsrStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrStateFromFormattedString");
   }

  /** get the value of the field: CsrState (CSR_INFORMATION.csr_state)
   * @return String the value
   */
  public String getCsrState () {
    return this.CsrState;
  }
  /** Change the field to not being actively set: CsrState (CSR_INFORMATION.csr_state)
   */
  public void unsetCsrState () {
    this._CsrStateSet = false;
  }
  /** See if the field is actively set: CsrState (CSR_INFORMATION.csr_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrState () {
    return this._CsrStateSet;
  }
  /** set the fields value: CsrZip (CSR_INFORMATION.csr_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrZip") 
  public void setCsrZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrZip", "setCsrZip");
    }
    this.CsrZip = value;
    this._CsrZipSet = true;
  }

  /** Retrieves the CsrZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrZip field
   */
   public String getCsrZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrZipAsFormattedString");
       return fmtMgr.formatString(this.getCsrZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrZip field from a formatted string
   *
   * @param _value the CsrZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrZip field
   */
   public void setCsrZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrZipFromFormattedString");
   }

  /** get the value of the field: CsrZip (CSR_INFORMATION.csr_zip)
   * @return String the value
   */
  public String getCsrZip () {
    return this.CsrZip;
  }
  /** Change the field to not being actively set: CsrZip (CSR_INFORMATION.csr_zip)
   */
  public void unsetCsrZip () {
    this._CsrZipSet = false;
  }
  /** See if the field is actively set: CsrZip (CSR_INFORMATION.csr_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrZip () {
    return this._CsrZipSet;
  }
  /** set the fields value: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrCountryCode") 
  public void setCsrCountryCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CsrCountryCode", "setCsrCountryCode");
    }
    this.CsrCountryCode = value;
    this._CsrCountryCodeSet = true;
  }

  /** Retrieves the CsrCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCountryCode field
   */
   public String getCsrCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCsrCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrCountryCode field from a formatted string
   *
   * @param _value the CsrCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrCountryCode field
   */
   public void setCsrCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCountryCodeFromFormattedString");
   }

  /** get the value of the field: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return Integer the value
   */
  public Integer getCsrCountryCode () {
    return this.CsrCountryCode;
  }
  /** Change the field to not being actively set: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   */
  public void unsetCsrCountryCode () {
    this._CsrCountryCodeSet = false;
  }
  /** See if the field is actively set: CsrCountryCode (CSR_INFORMATION.csr_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrCountryCode () {
    return this._CsrCountryCodeSet;
  }
  /** set the fields value: CsrCounty (CSR_INFORMATION.csr_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CsrCounty") 
  public void setCsrCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CsrCounty", "setCsrCounty");
    }
    this.CsrCounty = value;
    this._CsrCountySet = true;
  }

  /** Retrieves the CsrCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CsrCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CsrCounty field
   */
   public String getCsrCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCsrCountyAsFormattedString");
       return fmtMgr.formatString(this.getCsrCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCsrCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CsrCounty field from a formatted string
   *
   * @param _value the CsrCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CsrCounty field
   */
   public void setCsrCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCsrCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCsrCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CsrCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCsrCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCsrCountyFromFormattedString");
   }

  /** get the value of the field: CsrCounty (CSR_INFORMATION.csr_county)
   * @return String the value
   */
  public String getCsrCounty () {
    return this.CsrCounty;
  }
  /** Change the field to not being actively set: CsrCounty (CSR_INFORMATION.csr_county)
   */
  public void unsetCsrCounty () {
    this._CsrCountySet = false;
  }
  /** See if the field is actively set: CsrCounty (CSR_INFORMATION.csr_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetCsrCounty () {
    return this._CsrCountySet;
  }
  /** set the fields value: DateActive (CSR_INFORMATION.date_active)
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

  /** get the value of the field: DateActive (CSR_INFORMATION.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (CSR_INFORMATION.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (CSR_INFORMATION.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: DateInactive (CSR_INFORMATION.date_inactive)
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

  /** get the value of the field: DateInactive (CSR_INFORMATION.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (CSR_INFORMATION.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (CSR_INFORMATION.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (CSR_INFORMATION.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (CSR_INFORMATION.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return CsrObjectHelper.toMap(this, null).toString();
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
  /** CSR_INFORMATION.supervisor_name field */
    if(!nonNullOnly || (SupervisorName != null))  _SupervisorNameSet = flag;
  /** CSR_INFORMATION.csr_lname field */
    if(!nonNullOnly || (CsrLname != null))  _CsrLnameSet = flag;
  /** CSR_INFORMATION.csr_fname field */
    if(!nonNullOnly || (CsrFname != null))  _CsrFnameSet = flag;
  /** CSR_INFORMATION.csr_minit field */
    if(!nonNullOnly || (CsrMinit != null))  _CsrMinitSet = flag;
  /** CSR_INFORMATION.csr_title field */
    if(!nonNullOnly || (CsrTitle != null))  _CsrTitleSet = flag;
  /** CSR_INFORMATION.csr_phone field */
    if(!nonNullOnly || (CsrPhone != null))  _CsrPhoneSet = flag;
  /** CSR_INFORMATION.csr_email field */
    if(!nonNullOnly || (CsrEmail != null))  _CsrEmailSet = flag;
  /** CSR_INFORMATION.csr_address1 field */
    if(!nonNullOnly || (CsrAddress1 != null))  _CsrAddress1Set = flag;
  /** CSR_INFORMATION.csr_address2 field */
    if(!nonNullOnly || (CsrAddress2 != null))  _CsrAddress2Set = flag;
  /** CSR_INFORMATION.csr_address3 field */
    if(!nonNullOnly || (CsrAddress3 != null))  _CsrAddress3Set = flag;
  /** CSR_INFORMATION.csr_city field */
    if(!nonNullOnly || (CsrCity != null))  _CsrCitySet = flag;
  /** CSR_INFORMATION.csr_state field */
    if(!nonNullOnly || (CsrState != null))  _CsrStateSet = flag;
  /** CSR_INFORMATION.csr_zip field */
    if(!nonNullOnly || (CsrZip != null))  _CsrZipSet = flag;
  /** CSR_INFORMATION.csr_country_code field */
    if(!nonNullOnly || (CsrCountryCode != null))  _CsrCountryCodeSet = flag;
  /** CSR_INFORMATION.csr_county field */
    if(!nonNullOnly || (CsrCounty != null))  _CsrCountySet = flag;
  /** CSR_INFORMATION.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** CSR_INFORMATION.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** CSR_INFORMATION.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
