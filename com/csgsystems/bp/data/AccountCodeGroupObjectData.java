/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeGroupObjectData.java
 * Definition File: Customer/AccountCodeGroup.xml
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
  
/** AccountCodeGroupObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountCodeGroupObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountCodeGroupObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.display_value field */
  public    String DisplayValue  = null;
  protected boolean _DisplayValueSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id field */
  public    Integer AcgTrackingId  = null;
  protected boolean _AcgTrackingIdSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv field */
  public    Integer AcgTrackingIdServ  = null;
  protected boolean _AcgTrackingIdServSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id field */
  public    Integer ParentAcgTrackingId  = null;
  protected boolean _ParentAcgTrackingIdSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv field */
  public    Integer ParentAcgTrackingIdServ  = null;
  protected boolean _ParentAcgTrackingIdServSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id field */
  public    Integer HierarchyAcgTrackingId  = null;
  protected boolean _HierarchyAcgTrackingIdSet = false;
  /** CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv field */
  public    Integer HierarchyAcgTrackingIdServ  = null;
  protected boolean _HierarchyAcgTrackingIdServSet = false;
  private String _objName = "AccountCodeGroupObjectData";
  /** Default constructor */
  public AccountCodeGroupObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountCodeGroupObjectData (AccountCodeGroupObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountCodeGroupObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.DisplayValue = other.DisplayValue;
    this._DisplayValueSet = other._DisplayValueSet;
    this.AcgTrackingId = other.AcgTrackingId;
    this._AcgTrackingIdSet = other._AcgTrackingIdSet;
    this.AcgTrackingIdServ = other.AcgTrackingIdServ;
    this._AcgTrackingIdServSet = other._AcgTrackingIdServSet;
    this.ParentAcgTrackingId = other.ParentAcgTrackingId;
    this._ParentAcgTrackingIdSet = other._ParentAcgTrackingIdSet;
    this.ParentAcgTrackingIdServ = other.ParentAcgTrackingIdServ;
    this._ParentAcgTrackingIdServSet = other._ParentAcgTrackingIdServSet;
    this.HierarchyAcgTrackingId = other.HierarchyAcgTrackingId;
    this._HierarchyAcgTrackingIdSet = other._HierarchyAcgTrackingIdSet;
    this.HierarchyAcgTrackingIdServ = other.HierarchyAcgTrackingIdServ;
    this._HierarchyAcgTrackingIdServSet = other._HierarchyAcgTrackingIdServSet;
  }

  /** get the Key for this object
   * @return AccountCodeGroupObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountCodeGroupObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountCodeGroupObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountCodeGroup (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCodeGroup", "setAccountCodeGroup");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountCodeGroup", "setAccountCodeGroup");
    }
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyData ();
    this.Key.AccountCodeGroup = value;
    this.Key._AccountCodeGroupSet = true;
  }
  /** get the value of the field: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return String the value
   */
  public String getAccountCodeGroup () {
    if (this.Key == null) return null;
    return this.Key.AccountCodeGroup;
  }
  /** Change the field to not being actively set: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   */
  public void unsetAccountCodeGroup () {
    if (this.Key == null) return;
    this.Key._AccountCodeGroupSet = false;
  }
  /** See if the field is actively set: AccountCodeGroup (CMF_ACCOUNT_CODE_GROUPS.account_code_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCodeGroup () {
    if (this.Key == null) return false;
    return this.Key._AccountCodeGroupSet;
  }

  /** Retrieves the AccountCodeGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCodeGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCodeGroup field
   */
   public String getAccountCodeGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCodeGroupAsFormattedString");
       return fmtMgr.formatString(this.getAccountCodeGroup());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCodeGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCodeGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCodeGroup field from a formatted string
   *
   * @param _value the AccountCodeGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCodeGroup field
   */
   public void setAccountCodeGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCodeGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCodeGroup(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCodeGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCodeGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCodeGroupFromFormattedString");
   }

  /** set the fields value: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new AccountCodeGroupObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_ACCOUNT_CODE_GROUPS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    if (this.Key == null) return false;
    return this.Key._AccountInternalIdSet;
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
  /** set the fields value: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayValue") 
  public void setDisplayValue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayValue", "setDisplayValue");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DisplayValue", "setDisplayValue");
    }
    this.DisplayValue = value;
    this._DisplayValueSet = true;
  }

  /** Retrieves the DisplayValue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayValue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValue field
   */
   public String getDisplayValueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueAsFormattedString");
       return fmtMgr.formatString(this.getDisplayValue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayValue field from a formatted string
   *
   * @param _value the DisplayValue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayValue field
   */
   public void setDisplayValueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayValue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayValue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFromFormattedString");
   }

  /** get the value of the field: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return String the value
   */
  public String getDisplayValue () {
    return this.DisplayValue;
  }
  /** Change the field to not being actively set: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   */
  public void unsetDisplayValue () {
    this._DisplayValueSet = false;
  }
  /** See if the field is actively set: DisplayValue (CMF_ACCOUNT_CODE_GROUPS.display_value)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayValue () {
    return this._DisplayValueSet;
  }
  /** set the fields value: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcgTrackingId") 
  public void setAcgTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingId", "setAcgTrackingId");
    }
    this.AcgTrackingId = value;
    this._AcgTrackingIdSet = true;
  }

  /** Retrieves the AcgTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcgTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingId field
   */
   public String getAcgTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcgTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcgTrackingId field from a formatted string
   *
   * @param _value the AcgTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcgTrackingId field
   */
   public void setAcgTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcgTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdFromFormattedString");
   }

  /** get the value of the field: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return Integer the value
   */
  public Integer getAcgTrackingId () {
    return this.AcgTrackingId;
  }
  /** Change the field to not being actively set: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   */
  public void unsetAcgTrackingId () {
    this._AcgTrackingIdSet = false;
  }
  /** See if the field is actively set: AcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingId () {
    return this._AcgTrackingIdSet;
  }
  /** set the fields value: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcgTrackingIdServ") 
  public void setAcgTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcgTrackingIdServ", "setAcgTrackingIdServ");
    }
    this.AcgTrackingIdServ = value;
    this._AcgTrackingIdServSet = true;
  }

  /** Retrieves the AcgTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcgTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcgTrackingIdServ field
   */
   public String getAcgTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcgTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getAcgTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcgTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcgTrackingIdServ field from a formatted string
   *
   * @param _value the AcgTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcgTrackingIdServ field
   */
   public void setAcgTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcgTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcgTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcgTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcgTrackingIdServFromFormattedString");
   }

  /** get the value of the field: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getAcgTrackingIdServ () {
    return this.AcgTrackingIdServ;
  }
  /** Change the field to not being actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   */
  public void unsetAcgTrackingIdServ () {
    this._AcgTrackingIdServSet = false;
  }
  /** See if the field is actively set: AcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcgTrackingIdServ () {
    return this._AcgTrackingIdServSet;
  }
  /** set the fields value: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAcgTrackingId") 
  public void setParentAcgTrackingId (Integer value) throws ServiceException
  {
    this.ParentAcgTrackingId = value;
    this._ParentAcgTrackingIdSet = true;
  }

  /** Retrieves the ParentAcgTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAcgTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAcgTrackingId field
   */
   public String getParentAcgTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAcgTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAcgTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAcgTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAcgTrackingId field from a formatted string
   *
   * @param _value the ParentAcgTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAcgTrackingId field
   */
   public void setParentAcgTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAcgTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAcgTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAcgTrackingIdFromFormattedString");
   }

  /** get the value of the field: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return Integer the value
   */
  public Integer getParentAcgTrackingId () {
    return this.ParentAcgTrackingId;
  }
  /** Change the field to not being actively set: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   */
  public void unsetParentAcgTrackingId () {
    this._ParentAcgTrackingIdSet = false;
  }
  /** See if the field is actively set: ParentAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAcgTrackingId () {
    return this._ParentAcgTrackingIdSet;
  }
  /** set the fields value: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAcgTrackingIdServ") 
  public void setParentAcgTrackingIdServ (Integer value) throws ServiceException
  {
    this.ParentAcgTrackingIdServ = value;
    this._ParentAcgTrackingIdServSet = true;
  }

  /** Retrieves the ParentAcgTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAcgTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAcgTrackingIdServ field
   */
   public String getParentAcgTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAcgTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAcgTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAcgTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAcgTrackingIdServ field from a formatted string
   *
   * @param _value the ParentAcgTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAcgTrackingIdServ field
   */
   public void setParentAcgTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAcgTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAcgTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAcgTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAcgTrackingIdServFromFormattedString");
   }

  /** get the value of the field: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getParentAcgTrackingIdServ () {
    return this.ParentAcgTrackingIdServ;
  }
  /** Change the field to not being actively set: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   */
  public void unsetParentAcgTrackingIdServ () {
    this._ParentAcgTrackingIdServSet = false;
  }
  /** See if the field is actively set: ParentAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAcgTrackingIdServ () {
    return this._ParentAcgTrackingIdServSet;
  }
  /** set the fields value: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAcgTrackingId") 
  public void setHierarchyAcgTrackingId (Integer value) throws ServiceException
  {
    this.HierarchyAcgTrackingId = value;
    this._HierarchyAcgTrackingIdSet = true;
  }

  /** Retrieves the HierarchyAcgTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAcgTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAcgTrackingId field
   */
   public String getHierarchyAcgTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAcgTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyAcgTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAcgTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAcgTrackingId field from a formatted string
   *
   * @param _value the HierarchyAcgTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAcgTrackingId field
   */
   public void setHierarchyAcgTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAcgTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAcgTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAcgTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAcgTrackingIdFromFormattedString");
   }

  /** get the value of the field: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return Integer the value
   */
  public Integer getHierarchyAcgTrackingId () {
    return this.HierarchyAcgTrackingId;
  }
  /** Change the field to not being actively set: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   */
  public void unsetHierarchyAcgTrackingId () {
    this._HierarchyAcgTrackingIdSet = false;
  }
  /** See if the field is actively set: HierarchyAcgTrackingId (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAcgTrackingId () {
    return this._HierarchyAcgTrackingIdSet;
  }
  /** set the fields value: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("HierarchyAcgTrackingIdServ") 
  public void setHierarchyAcgTrackingIdServ (Integer value) throws ServiceException
  {
    this.HierarchyAcgTrackingIdServ = value;
    this._HierarchyAcgTrackingIdServSet = true;
  }

  /** Retrieves the HierarchyAcgTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HierarchyAcgTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HierarchyAcgTrackingIdServ field
   */
   public String getHierarchyAcgTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHierarchyAcgTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getHierarchyAcgTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHierarchyAcgTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the HierarchyAcgTrackingIdServ field from a formatted string
   *
   * @param _value the HierarchyAcgTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HierarchyAcgTrackingIdServ field
   */
   public void setHierarchyAcgTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHierarchyAcgTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHierarchyAcgTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HierarchyAcgTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHierarchyAcgTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHierarchyAcgTrackingIdServFromFormattedString");
   }

  /** get the value of the field: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getHierarchyAcgTrackingIdServ () {
    return this.HierarchyAcgTrackingIdServ;
  }
  /** Change the field to not being actively set: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   */
  public void unsetHierarchyAcgTrackingIdServ () {
    this._HierarchyAcgTrackingIdServSet = false;
  }
  /** See if the field is actively set: HierarchyAcgTrackingIdServ (CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyAcgTrackingIdServ () {
    return this._HierarchyAcgTrackingIdServSet;
  }
  public String toString() {
    return AccountCodeGroupObjectHelper.toMap(this, null).toString();
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
  /** CMF_ACCOUNT_CODE_GROUPS.display_value field */
    if(!nonNullOnly || (DisplayValue != null))  _DisplayValueSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id field */
    if(!nonNullOnly || (AcgTrackingId != null))  _AcgTrackingIdSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.acg_tracking_id_serv field */
    if(!nonNullOnly || (AcgTrackingIdServ != null))  _AcgTrackingIdServSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id field */
    if(!nonNullOnly || (ParentAcgTrackingId != null))  _ParentAcgTrackingIdSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.parent_acg_tracking_id_serv field */
    if(!nonNullOnly || (ParentAcgTrackingIdServ != null))  _ParentAcgTrackingIdServSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id field */
    if(!nonNullOnly || (HierarchyAcgTrackingId != null))  _HierarchyAcgTrackingIdSet = flag;
  /** CMF_ACCOUNT_CODE_GROUPS.hierarchy_acg_tracking_id_serv field */
    if(!nonNullOnly || (HierarchyAcgTrackingIdServ != null))  _HierarchyAcgTrackingIdServSet = flag;
  }
}
