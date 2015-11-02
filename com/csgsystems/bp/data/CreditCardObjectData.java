/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardObjectData.java
 * Definition File: Customer/CreditCard.xml
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
  
/** CreditCardObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class CreditCardObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public CreditCardObjectKeyData Key = null;
  /** PAYMENT_PROFILE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** PAYMENT_PROFILE.card_account field */
  public    String CcardAccount  = null;
  protected boolean _CcardAccountSet = false;
  /** PAYMENT_PROFILE.ownr_lname field */
  public    String OwnrLname  = null;
  protected boolean _OwnrLnameSet = false;
  /** PAYMENT_PROFILE.ownr_fname field */
  public    String OwnrFname  = null;
  protected boolean _OwnrFnameSet = false;
  /** PAYMENT_PROFILE.card_carrier field */
  public    String CcardCarrier  = null;
  protected boolean _CcardCarrierSet = false;
  /** PAYMENT_PROFILE.card_expire field */
  public    String CcardExpire  = null;
  protected boolean _CcardExpireSet = false;
  /** PAYMENT_PROFILE.avs_address_id field */
  public    Integer AvsAddressId  = null;
  protected boolean _AvsAddressIdSet = false;
  /** PAYMENT_PROFILE.clearing_house_id field */
  public    String CcardClearingHouseId  = null;
  protected boolean _CcardClearingHouseIdSet = false;
  /** PAYMENT_PROFILE.avs_response_code field */
  public    String AvsResponseCode  = null;
  protected boolean _AvsResponseCodeSet = false;
  /** PAYMENT_PROFILE.trans_flag field */
  public    String TransFlag  = null;
  protected boolean _TransFlagSet = false;
  private String _objName = "CreditCardObjectData";
  /** Default constructor */
  public CreditCardObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public CreditCardObjectData (CreditCardObjectData other)
  {

    if (other == null) return;
    this.Key = new CreditCardObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.CcardAccount = other.CcardAccount;
    this._CcardAccountSet = other._CcardAccountSet;
    this.OwnrLname = other.OwnrLname;
    this._OwnrLnameSet = other._OwnrLnameSet;
    this.OwnrFname = other.OwnrFname;
    this._OwnrFnameSet = other._OwnrFnameSet;
    this.CcardCarrier = other.CcardCarrier;
    this._CcardCarrierSet = other._CcardCarrierSet;
    this.CcardExpire = other.CcardExpire;
    this._CcardExpireSet = other._CcardExpireSet;
    this.AvsAddressId = other.AvsAddressId;
    this._AvsAddressIdSet = other._AvsAddressIdSet;
    this.CcardClearingHouseId = other.CcardClearingHouseId;
    this._CcardClearingHouseIdSet = other._CcardClearingHouseIdSet;
    this.AvsResponseCode = other.AvsResponseCode;
    this._AvsResponseCodeSet = other._AvsResponseCodeSet;
    this.TransFlag = other.TransFlag;
    this._TransFlagSet = other._TransFlagSet;
  }

  /** get the Key for this object
   * @return CreditCardObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public CreditCardObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (CreditCardObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: ProfileId (PAYMENT_PROFILE.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setProfileId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProfileId", "setProfileId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProfileId", "setProfileId");
    }
    if (this.Key == null) this.Key = new CreditCardObjectKeyData ();
    this.Key.ProfileId = value;
    this.Key._ProfileIdSet = true;
  }
  /** get the value of the field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    if (this.Key == null) return null;
    return this.Key.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (PAYMENT_PROFILE.profile_id)
   */
  public void unsetProfileId () {
    if (this.Key == null) return;
    this.Key._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    if (this.Key == null) return false;
    return this.Key._ProfileIdSet;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** set the fields value: AccountInternalId (PAYMENT_PROFILE.account_no)
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

  /** get the value of the field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (PAYMENT_PROFILE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardAccount") 
  public void setCcardAccount (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 22))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardAccount", "setCcardAccount");
    }
    this.CcardAccount = value;
    this._CcardAccountSet = true;
  }

  /** Retrieves the CcardAccount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardAccount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardAccount field
   */
   public String getCcardAccountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardAccountAsFormattedString");
       return fmtMgr.formatString(this.getCcardAccount());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardAccountAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardAccount field from a formatted string
   *
   * @param _value the CcardAccount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardAccount field
   */
   public void setCcardAccountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardAccount(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardAccount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardAccountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardAccountFromFormattedString");
   }

  /** get the value of the field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return String the value
   */
  public String getCcardAccount () {
    return this.CcardAccount;
  }
  /** Change the field to not being actively set: CcardAccount (PAYMENT_PROFILE.card_account)
   */
  public void unsetCcardAccount () {
    this._CcardAccountSet = false;
  }
  /** See if the field is actively set: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardAccount () {
    return this._CcardAccountSet;
  }
  /** set the fields value: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrLname") 
  public void setOwnrLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrLname", "setOwnrLname");
    }
    this.OwnrLname = value;
    this._OwnrLnameSet = true;
  }

  /** Retrieves the OwnrLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrLname field
   */
   public String getOwnrLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrLnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrLname field from a formatted string
   *
   * @param _value the OwnrLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrLname field
   */
   public void setOwnrLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrLnameFromFormattedString");
   }

  /** get the value of the field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return String the value
   */
  public String getOwnrLname () {
    return this.OwnrLname;
  }
  /** Change the field to not being actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   */
  public void unsetOwnrLname () {
    this._OwnrLnameSet = false;
  }
  /** See if the field is actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrLname () {
    return this._OwnrLnameSet;
  }
  /** set the fields value: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrFname") 
  public void setOwnrFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrFname", "setOwnrFname");
    }
    this.OwnrFname = value;
    this._OwnrFnameSet = true;
  }

  /** Retrieves the OwnrFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrFname field
   */
   public String getOwnrFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrFnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrFname field from a formatted string
   *
   * @param _value the OwnrFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrFname field
   */
   public void setOwnrFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrFnameFromFormattedString");
   }

  /** get the value of the field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return String the value
   */
  public String getOwnrFname () {
    return this.OwnrFname;
  }
  /** Change the field to not being actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   */
  public void unsetOwnrFname () {
    this._OwnrFnameSet = false;
  }
  /** See if the field is actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrFname () {
    return this._OwnrFnameSet;
  }
  /** set the fields value: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardCarrier") 
  public void setCcardCarrier (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardCarrier", "setCcardCarrier");
    }
    this.CcardCarrier = value;
    this._CcardCarrierSet = true;
  }

  /** Retrieves the CcardCarrier field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardCarrier field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardCarrier field
   */
   public String getCcardCarrierAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierAsFormattedString");
       return fmtMgr.formatString(this.getCcardCarrier());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardCarrier field from a formatted string
   *
   * @param _value the CcardCarrier field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardCarrier field
   */
   public void setCcardCarrierFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardCarrier(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardCarrier");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CcardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CcardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrier field
   */

  public String getCcardCarrierDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCcardCarrierEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCcardCarrier()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CcardCarrier field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CcardCarrier field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrier field
   */
  public Enumeration getCcardCarrierEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CardTypeCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CcardCarrier field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCcardCarrierFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCcardCarrierEnumeration(_locale);
      this.setCcardCarrier((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrier");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFromDisplayValue");
  }

  /** get the value of the field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return String the value
   */
  public String getCcardCarrier () {
    return this.CcardCarrier;
  }
  /** Change the field to not being actively set: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   */
  public void unsetCcardCarrier () {
    this._CcardCarrierSet = false;
  }
  /** See if the field is actively set: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardCarrier () {
    return this._CcardCarrierSet;
  }
  /** set the fields value: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardExpire") 
  public void setCcardExpire (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardExpire", "setCcardExpire");
    }
    this.CcardExpire = value;
    this._CcardExpireSet = true;
  }

  /** Retrieves the CcardExpire field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardExpire field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardExpire field
   */
   public String getCcardExpireAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardExpireAsFormattedString");
       return fmtMgr.formatString(this.getCcardExpire());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardExpireAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardExpire field from a formatted string
   *
   * @param _value the CcardExpire field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardExpire field
   */
   public void setCcardExpireFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardExpire(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardExpire");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardExpireFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardExpireFromFormattedString");
   }

  /** get the value of the field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return String the value
   */
  public String getCcardExpire () {
    return this.CcardExpire;
  }
  /** Change the field to not being actively set: CcardExpire (PAYMENT_PROFILE.card_expire)
   */
  public void unsetCcardExpire () {
    this._CcardExpireSet = false;
  }
  /** See if the field is actively set: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardExpire () {
    return this._CcardExpireSet;
  }
  /** set the fields value: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvsAddressId") 
  public void setAvsAddressId (Integer value) throws ServiceException
  {
    this.AvsAddressId = value;
    this._AvsAddressIdSet = true;
  }

  /** Retrieves the AvsAddressId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvsAddressId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsAddressId field
   */
   public String getAvsAddressIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsAddressIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAvsAddressId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsAddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsAddressIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvsAddressId field from a formatted string
   *
   * @param _value the AvsAddressId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvsAddressId field
   */
   public void setAvsAddressIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvsAddressId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsAddressId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsAddressIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsAddressIdFromFormattedString");
   }

  /** get the value of the field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return Integer the value
   */
  public Integer getAvsAddressId () {
    return this.AvsAddressId;
  }
  /** Change the field to not being actively set: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   */
  public void unsetAvsAddressId () {
    this._AvsAddressIdSet = false;
  }
  /** See if the field is actively set: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvsAddressId () {
    return this._AvsAddressIdSet;
  }
  /** set the fields value: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CcardClearingHouseId") 
  public void setCcardClearingHouseId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CcardClearingHouseId", "setCcardClearingHouseId");
    }
    this.CcardClearingHouseId = value;
    this._CcardClearingHouseIdSet = true;
  }

  /** Retrieves the CcardClearingHouseId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CcardClearingHouseId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardClearingHouseId field
   */
   public String getCcardClearingHouseIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardClearingHouseIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardClearingHouseIdAsFormattedString");
       return fmtMgr.formatString(this.getCcardClearingHouseId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardClearingHouseIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CcardClearingHouseId field from a formatted string
   *
   * @param _value the CcardClearingHouseId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CcardClearingHouseId field
   */
   public void setCcardClearingHouseIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardClearingHouseIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCcardClearingHouseId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CcardClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardClearingHouseIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardClearingHouseIdFromFormattedString");
   }

  /** get the value of the field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return String the value
   */
  public String getCcardClearingHouseId () {
    return this.CcardClearingHouseId;
  }
  /** Change the field to not being actively set: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   */
  public void unsetCcardClearingHouseId () {
    this._CcardClearingHouseIdSet = false;
  }
  /** See if the field is actively set: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCcardClearingHouseId () {
    return this._CcardClearingHouseIdSet;
  }
  /** set the fields value: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AvsResponseCode") 
  public void setAvsResponseCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AvsResponseCode", "setAvsResponseCode");
    }
    this.AvsResponseCode = value;
    this._AvsResponseCodeSet = true;
  }

  /** Retrieves the AvsResponseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AvsResponseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsResponseCode field
   */
   public String getAvsResponseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsResponseCodeAsFormattedString");
       return fmtMgr.formatString(this.getAvsResponseCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsResponseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AvsResponseCode field from a formatted string
   *
   * @param _value the AvsResponseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AvsResponseCode field
   */
   public void setAvsResponseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAvsResponseCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AvsResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsResponseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsResponseCodeFromFormattedString");
   }

  /** get the value of the field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return String the value
   */
  public String getAvsResponseCode () {
    return this.AvsResponseCode;
  }
  /** Change the field to not being actively set: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   */
  public void unsetAvsResponseCode () {
    this._AvsResponseCodeSet = false;
  }
  /** See if the field is actively set: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAvsResponseCode () {
    return this._AvsResponseCodeSet;
  }
  /** set the fields value: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransFlag") 
  public void setTransFlag (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransFlag", "setTransFlag");
    }
    this.TransFlag = value;
    this._TransFlagSet = true;
  }

  /** Retrieves the TransFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransFlag field
   */
   public String getTransFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransFlagAsFormattedString");
       return fmtMgr.formatString(this.getTransFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransFlag field from a formatted string
   *
   * @param _value the TransFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransFlag field
   */
   public void setTransFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransFlag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransFlagFromFormattedString");
   }

  /** get the value of the field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return String the value
   */
  public String getTransFlag () {
    return this.TransFlag;
  }
  /** Change the field to not being actively set: TransFlag (PAYMENT_PROFILE.trans_flag)
   */
  public void unsetTransFlag () {
    this._TransFlagSet = false;
  }
  /** See if the field is actively set: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransFlag () {
    return this._TransFlagSet;
  }
  public String toString() {
    return CreditCardObjectHelper.toMap(this, null).toString();
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
  /** PAYMENT_PROFILE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** PAYMENT_PROFILE.card_account field */
    if(!nonNullOnly || (CcardAccount != null))  _CcardAccountSet = flag;
  /** PAYMENT_PROFILE.ownr_lname field */
    if(!nonNullOnly || (OwnrLname != null))  _OwnrLnameSet = flag;
  /** PAYMENT_PROFILE.ownr_fname field */
    if(!nonNullOnly || (OwnrFname != null))  _OwnrFnameSet = flag;
  /** PAYMENT_PROFILE.card_carrier field */
    if(!nonNullOnly || (CcardCarrier != null))  _CcardCarrierSet = flag;
  /** PAYMENT_PROFILE.card_expire field */
    if(!nonNullOnly || (CcardExpire != null))  _CcardExpireSet = flag;
  /** PAYMENT_PROFILE.avs_address_id field */
    if(!nonNullOnly || (AvsAddressId != null))  _AvsAddressIdSet = flag;
  /** PAYMENT_PROFILE.clearing_house_id field */
    if(!nonNullOnly || (CcardClearingHouseId != null))  _CcardClearingHouseIdSet = flag;
  /** PAYMENT_PROFILE.avs_response_code field */
    if(!nonNullOnly || (AvsResponseCode != null))  _AvsResponseCodeSet = flag;
  /** PAYMENT_PROFILE.trans_flag field */
    if(!nonNullOnly || (TransFlag != null))  _TransFlagSet = flag;
  }
}
