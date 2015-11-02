/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountLocateObjectData.java
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
  
/** AccountLocateObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountLocateObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountLocateObjectKeyData Key = null;
  /** HierarchyId field */
  public    Integer HierarchyId  = null;
  protected boolean _HierarchyIdSet = false;
  /** ParentId field */
  public    Integer ParentId  = null;
  protected boolean _ParentIdSet = false;
  /** SERVER_LOOKUP.account_category field */
  public    Integer AccountCategory  = null;
  protected boolean _AccountCategorySet = false;
  /** SERVER_LOOKUP.bill_fname field */
  public    String BillFname  = null;
  protected boolean _BillFnameSet = false;
  /** SERVER_LOOKUP.bill_fname_find field */
  public    String BillFnameFind  = null;
  protected boolean _BillFnameFindSet = false;
  /** SERVER_LOOKUP.bill_lname field */
  public    String BillLname  = null;
  protected boolean _BillLnameSet = false;
  /** SERVER_LOOKUP.bill_lname_find field */
  public    String BillLnameFind  = null;
  protected boolean _BillLnameFindSet = false;
  /** SERVER_LOOKUP.bill_company field */
  public    String BillCompany  = null;
  protected boolean _BillCompanySet = false;
  /** SERVER_LOOKUP.bill_company_find field */
  public    String BillCompanyFind  = null;
  protected boolean _BillCompanyFindSet = false;
  /** SERVER_LOOKUP.bill_address1 field */
  public    String BillAddress1  = null;
  protected boolean _BillAddress1Set = false;
  /** SERVER_LOOKUP.bill_city field */
  public    String BillCity  = null;
  protected boolean _BillCitySet = false;
  /** SERVER_LOOKUP.bill_state field */
  public    String BillState  = null;
  protected boolean _BillStateSet = false;
  /** SERVER_LOOKUP.bill_zip field */
  public    String BillZip  = null;
  protected boolean _BillZipSet = false;
  /** SERVER_LOOKUP.cust_phone1 field */
  public    String CustPhone1  = null;
  protected boolean _CustPhone1Set = false;
  /** SERVER_LOOKUP.cust_phone2 field */
  public    String CustPhone2  = null;
  protected boolean _CustPhone2Set = false;
  /** SERVER_LOOKUP.codeword field */
  public    String Codeword  = null;
  protected boolean _CodewordSet = false;
  /** SERVER_LOOKUP.server_id field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** SERVER_LOOKUP.acct_seg_id field */
  public    Integer AcctSegId  = null;
  protected boolean _AcctSegIdSet = false;
  /** SERVER_LOOKUP.alt_lname field */
  public    String AltLname  = null;
  protected boolean _AltLnameSet = false;
  /** SERVER_LOOKUP.alt_fname field */
  public    String AltFname  = null;
  protected boolean _AltFnameSet = false;
  /** SERVER_LOOKUP.alt_company_name field */
  public    String AltCompanyName  = null;
  protected boolean _AltCompanyNameSet = false;
  /** SERVER_LOOKUP.date_active field */
  public    Date DateActive  = null;
  protected boolean _DateActiveSet = false;
  /** SERVER_LOOKUP.date_inactive field */
  public    Date DateInactive  = null;
  protected boolean _DateInactiveSet = false;
  /** SERVER_LOOKUP.customer_lifetime_id field */
  public    Integer CustomerLifetimeId  = null;
  protected boolean _CustomerLifetimeIdSet = false;
  /** SERVER_LOOKUP.customer_lifetime_id2 field */
  public    Integer CustomerLifetimeId2  = null;
  protected boolean _CustomerLifetimeId2Set = false;
  private String _objName = "AccountLocateObjectData";
  /** Default constructor */
  public AccountLocateObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountLocateObjectData (AccountLocateObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountLocateObjectKeyData (other.Key);
    this.HierarchyId = other.HierarchyId;
    this._HierarchyIdSet = other._HierarchyIdSet;
    this.ParentId = other.ParentId;
    this._ParentIdSet = other._ParentIdSet;
    this.AccountCategory = other.AccountCategory;
    this._AccountCategorySet = other._AccountCategorySet;
    this.BillFname = other.BillFname;
    this._BillFnameSet = other._BillFnameSet;
    this.BillFnameFind = other.BillFnameFind;
    this._BillFnameFindSet = other._BillFnameFindSet;
    this.BillLname = other.BillLname;
    this._BillLnameSet = other._BillLnameSet;
    this.BillLnameFind = other.BillLnameFind;
    this._BillLnameFindSet = other._BillLnameFindSet;
    this.BillCompany = other.BillCompany;
    this._BillCompanySet = other._BillCompanySet;
    this.BillCompanyFind = other.BillCompanyFind;
    this._BillCompanyFindSet = other._BillCompanyFindSet;
    this.BillAddress1 = other.BillAddress1;
    this._BillAddress1Set = other._BillAddress1Set;
    this.BillCity = other.BillCity;
    this._BillCitySet = other._BillCitySet;
    this.BillState = other.BillState;
    this._BillStateSet = other._BillStateSet;
    this.BillZip = other.BillZip;
    this._BillZipSet = other._BillZipSet;
    this.CustPhone1 = other.CustPhone1;
    this._CustPhone1Set = other._CustPhone1Set;
    this.CustPhone2 = other.CustPhone2;
    this._CustPhone2Set = other._CustPhone2Set;
    this.Codeword = other.Codeword;
    this._CodewordSet = other._CodewordSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.AcctSegId = other.AcctSegId;
    this._AcctSegIdSet = other._AcctSegIdSet;
    this.AltLname = other.AltLname;
    this._AltLnameSet = other._AltLnameSet;
    this.AltFname = other.AltFname;
    this._AltFnameSet = other._AltFnameSet;
    this.AltCompanyName = other.AltCompanyName;
    this._AltCompanyNameSet = other._AltCompanyNameSet;
    this.DateActive = other.DateActive;
    this._DateActiveSet = other._DateActiveSet;
    this.DateInactive = other.DateInactive;
    this._DateInactiveSet = other._DateInactiveSet;
    this.CustomerLifetimeId = other.CustomerLifetimeId;
    this._CustomerLifetimeIdSet = other._CustomerLifetimeIdSet;
    this.CustomerLifetimeId2 = other.CustomerLifetimeId2;
    this._CustomerLifetimeId2Set = other._CustomerLifetimeId2Set;
  }

  /** get the Key for this object
   * @return AccountLocateObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountLocateObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountLocateObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AccountInternalId (SERVER_LOOKUP.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    if (this.Key == null) this.Key = new AccountLocateObjectKeyData ();
    this.Key.AccountInternalId = value;
    this.Key._AccountInternalIdSet = true;
  }
  /** get the value of the field: AccountInternalId (SERVER_LOOKUP.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (SERVER_LOOKUP.account_no)
   */
  public void unsetAccountInternalId () {
    if (this.Key == null) return;
    this.Key._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (SERVER_LOOKUP.account_no)
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

  /** set the fields value: HierarchyId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHierarchyId (Integer value) throws ServiceException
  {
    this.HierarchyId = value;
    this._HierarchyIdSet = true;
  }
  /** get the value of the field: HierarchyId
   * @return Integer the value
   */
  public Integer getHierarchyId ()
  {
    return this.HierarchyId;
  }
  /** Change the field to not being actively set: HierarchyId
   */
  public void unsetHierarchyId ()
  {
    this._HierarchyIdSet = false;
  }
  /** See if the field is actively set: HierarchyId
   * @return boolean whether the field is actively set
   */
  public boolean issetHierarchyId ()
  {
    return this._HierarchyIdSet;
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

  /** set the fields value: ParentId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setParentId (Integer value) throws ServiceException
  {
    this.ParentId = value;
    this._ParentIdSet = true;
  }
  /** get the value of the field: ParentId
   * @return Integer the value
   */
  public Integer getParentId ()
  {
    return this.ParentId;
  }
  /** Change the field to not being actively set: ParentId
   */
  public void unsetParentId ()
  {
    this._ParentIdSet = false;
  }
  /** See if the field is actively set: ParentId
   * @return boolean whether the field is actively set
   */
  public boolean issetParentId ()
  {
    return this._ParentIdSet;
  }

  /** Retrieves the ParentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentId field
   */
   public String getParentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentId field from a formatted string
   *
   * @param _value the ParentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentId field
   */
   public void setParentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentIdFromFormattedString");
   }

  /** set the fields value: AccountCategory (SERVER_LOOKUP.account_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountCategory") 
  public void setAccountCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountCategory", "setAccountCategory");
    }
    this.AccountCategory = value;
    this._AccountCategorySet = true;
  }

  /** Retrieves the AccountCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountCategory field
   */
   public String getAccountCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountCategory field from a formatted string
   *
   * @param _value the AccountCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountCategory field
   */
   public void setAccountCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountCategoryFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountCategory field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountCategory field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountCategory field
   */

  public String getAccountCategoryDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountCategoryEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountCategory()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountCategory field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountCategory field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountCategory field
   */
  public Enumeration getAccountCategoryEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountCategoryEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountCategory", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountCategoryEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountCategoryEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountCategory field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountCategoryFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCategoryFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountCategoryEnumeration(_locale);
      this.setAccountCategory((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountCategory");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountCategoryFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountCategoryFromDisplayValue");
  }

  /** get the value of the field: AccountCategory (SERVER_LOOKUP.account_category)
   * @return Integer the value
   */
  public Integer getAccountCategory () {
    return this.AccountCategory;
  }
  /** Change the field to not being actively set: AccountCategory (SERVER_LOOKUP.account_category)
   */
  public void unsetAccountCategory () {
    this._AccountCategorySet = false;
  }
  /** See if the field is actively set: AccountCategory (SERVER_LOOKUP.account_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountCategory () {
    return this._AccountCategorySet;
  }
  /** set the fields value: BillFname (SERVER_LOOKUP.bill_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFname") 
  public void setBillFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillFname", "setBillFname");
    }
    this.BillFname = value;
    this._BillFnameSet = true;
  }

  /** Retrieves the BillFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFname field
   */
   public String getBillFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameAsFormattedString");
       return fmtMgr.formatString(this.getBillFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFname field from a formatted string
   *
   * @param _value the BillFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFname field
   */
   public void setBillFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFromFormattedString");
   }

  /** get the value of the field: BillFname (SERVER_LOOKUP.bill_fname)
   * @return String the value
   */
  public String getBillFname () {
    return this.BillFname;
  }
  /** Change the field to not being actively set: BillFname (SERVER_LOOKUP.bill_fname)
   */
  public void unsetBillFname () {
    this._BillFnameSet = false;
  }
  /** See if the field is actively set: BillFname (SERVER_LOOKUP.bill_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFname () {
    return this._BillFnameSet;
  }
  /** set the fields value: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillFnameFind") 
  public void setBillFnameFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillFnameFind", "setBillFnameFind");
    }
    this.BillFnameFind = value;
    this._BillFnameFindSet = true;
  }

  /** Retrieves the BillFnameFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillFnameFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFnameFind field
   */
   public String getBillFnameFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameFindAsFormattedString");
       return fmtMgr.formatString(this.getBillFnameFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillFnameFind field from a formatted string
   *
   * @param _value the BillFnameFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillFnameFind field
   */
   public void setBillFnameFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillFnameFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillFnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFindFromFormattedString");
   }

  /** get the value of the field: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return String the value
   */
  public String getBillFnameFind () {
    return this.BillFnameFind;
  }
  /** Change the field to not being actively set: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   */
  public void unsetBillFnameFind () {
    this._BillFnameFindSet = false;
  }
  /** See if the field is actively set: BillFnameFind (SERVER_LOOKUP.bill_fname_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillFnameFind () {
    return this._BillFnameFindSet;
  }
  /** set the fields value: BillLname (SERVER_LOOKUP.bill_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillLname") 
  public void setBillLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillLname", "setBillLname");
    }
    this.BillLname = value;
    this._BillLnameSet = true;
  }

  /** Retrieves the BillLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLname field
   */
   public String getBillLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameAsFormattedString");
       return fmtMgr.formatString(this.getBillLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillLname field from a formatted string
   *
   * @param _value the BillLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillLname field
   */
   public void setBillLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFromFormattedString");
   }

  /** get the value of the field: BillLname (SERVER_LOOKUP.bill_lname)
   * @return String the value
   */
  public String getBillLname () {
    return this.BillLname;
  }
  /** Change the field to not being actively set: BillLname (SERVER_LOOKUP.bill_lname)
   */
  public void unsetBillLname () {
    this._BillLnameSet = false;
  }
  /** See if the field is actively set: BillLname (SERVER_LOOKUP.bill_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillLname () {
    return this._BillLnameSet;
  }
  /** set the fields value: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillLnameFind") 
  public void setBillLnameFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillLnameFind", "setBillLnameFind");
    }
    this.BillLnameFind = value;
    this._BillLnameFindSet = true;
  }

  /** Retrieves the BillLnameFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillLnameFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLnameFind field
   */
   public String getBillLnameFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameFindAsFormattedString");
       return fmtMgr.formatString(this.getBillLnameFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillLnameFind field from a formatted string
   *
   * @param _value the BillLnameFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillLnameFind field
   */
   public void setBillLnameFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillLnameFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillLnameFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFindFromFormattedString");
   }

  /** get the value of the field: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return String the value
   */
  public String getBillLnameFind () {
    return this.BillLnameFind;
  }
  /** Change the field to not being actively set: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   */
  public void unsetBillLnameFind () {
    this._BillLnameFindSet = false;
  }
  /** See if the field is actively set: BillLnameFind (SERVER_LOOKUP.bill_lname_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillLnameFind () {
    return this._BillLnameFindSet;
  }
  /** set the fields value: BillCompany (SERVER_LOOKUP.bill_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCompany") 
  public void setBillCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCompany", "setBillCompany");
    }
    this.BillCompany = value;
    this._BillCompanySet = true;
  }

  /** Retrieves the BillCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompany field
   */
   public String getBillCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyAsFormattedString");
       return fmtMgr.formatString(this.getBillCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCompany field from a formatted string
   *
   * @param _value the BillCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCompany field
   */
   public void setBillCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFromFormattedString");
   }

  /** get the value of the field: BillCompany (SERVER_LOOKUP.bill_company)
   * @return String the value
   */
  public String getBillCompany () {
    return this.BillCompany;
  }
  /** Change the field to not being actively set: BillCompany (SERVER_LOOKUP.bill_company)
   */
  public void unsetBillCompany () {
    this._BillCompanySet = false;
  }
  /** See if the field is actively set: BillCompany (SERVER_LOOKUP.bill_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompany () {
    return this._BillCompanySet;
  }
  /** set the fields value: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillCompanyFind") 
  public void setBillCompanyFind (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillCompanyFind", "setBillCompanyFind");
    }
    this.BillCompanyFind = value;
    this._BillCompanyFindSet = true;
  }

  /** Retrieves the BillCompanyFind field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillCompanyFind field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyFind field
   */
   public String getBillCompanyFindAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFindAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyFindAsFormattedString");
       return fmtMgr.formatString(this.getBillCompanyFind());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompanyFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyFindAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillCompanyFind field from a formatted string
   *
   * @param _value the BillCompanyFind field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillCompanyFind field
   */
   public void setBillCompanyFindFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFindFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillCompanyFind(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillCompanyFind");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFindFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFindFromFormattedString");
   }

  /** get the value of the field: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return String the value
   */
  public String getBillCompanyFind () {
    return this.BillCompanyFind;
  }
  /** Change the field to not being actively set: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   */
  public void unsetBillCompanyFind () {
    this._BillCompanyFindSet = false;
  }
  /** See if the field is actively set: BillCompanyFind (SERVER_LOOKUP.bill_company_find)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCompanyFind () {
    return this._BillCompanyFindSet;
  }
  /** set the fields value: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillAddress1") 
  public void setBillAddress1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillAddress1", "setBillAddress1");
    }
    this.BillAddress1 = value;
    this._BillAddress1Set = true;
  }

  /** Retrieves the BillAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAddress1 field
   */
   public String getBillAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAddress1AsFormattedString");
       return fmtMgr.formatString(this.getBillAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the BillAddress1 field from a formatted string
   *
   * @param _value the BillAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillAddress1 field
   */
   public void setBillAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAddress1FromFormattedString");
   }

  /** get the value of the field: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return String the value
   */
  public String getBillAddress1 () {
    return this.BillAddress1;
  }
  /** Change the field to not being actively set: BillAddress1 (SERVER_LOOKUP.bill_address1)
   */
  public void unsetBillAddress1 () {
    this._BillAddress1Set = false;
  }
  /** See if the field is actively set: BillAddress1 (SERVER_LOOKUP.bill_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillAddress1 () {
    return this._BillAddress1Set;
  }
  /** set the fields value: BillCity (SERVER_LOOKUP.bill_city)
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

  /** get the value of the field: BillCity (SERVER_LOOKUP.bill_city)
   * @return String the value
   */
  public String getBillCity () {
    return this.BillCity;
  }
  /** Change the field to not being actively set: BillCity (SERVER_LOOKUP.bill_city)
   */
  public void unsetBillCity () {
    this._BillCitySet = false;
  }
  /** See if the field is actively set: BillCity (SERVER_LOOKUP.bill_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillCity () {
    return this._BillCitySet;
  }
  /** set the fields value: BillState (SERVER_LOOKUP.bill_state)
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

  /** get the value of the field: BillState (SERVER_LOOKUP.bill_state)
   * @return String the value
   */
  public String getBillState () {
    return this.BillState;
  }
  /** Change the field to not being actively set: BillState (SERVER_LOOKUP.bill_state)
   */
  public void unsetBillState () {
    this._BillStateSet = false;
  }
  /** See if the field is actively set: BillState (SERVER_LOOKUP.bill_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillState () {
    return this._BillStateSet;
  }
  /** set the fields value: BillZip (SERVER_LOOKUP.bill_zip)
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

  /** get the value of the field: BillZip (SERVER_LOOKUP.bill_zip)
   * @return String the value
   */
  public String getBillZip () {
    return this.BillZip;
  }
  /** Change the field to not being actively set: BillZip (SERVER_LOOKUP.bill_zip)
   */
  public void unsetBillZip () {
    this._BillZipSet = false;
  }
  /** See if the field is actively set: BillZip (SERVER_LOOKUP.bill_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillZip () {
    return this._BillZipSet;
  }
  /** set the fields value: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustPhone1") 
  public void setCustPhone1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustPhone1", "setCustPhone1");
    }
    this.CustPhone1 = value;
    this._CustPhone1Set = true;
  }

  /** Retrieves the CustPhone1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustPhone1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone1 field
   */
   public String getCustPhone1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone1AsFormattedString");
       return fmtMgr.formatString(this.getCustPhone1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone1AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustPhone1 field from a formatted string
   *
   * @param _value the CustPhone1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustPhone1 field
   */
   public void setCustPhone1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustPhone1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone1FromFormattedString");
   }

  /** get the value of the field: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return String the value
   */
  public String getCustPhone1 () {
    return this.CustPhone1;
  }
  /** Change the field to not being actively set: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   */
  public void unsetCustPhone1 () {
    this._CustPhone1Set = false;
  }
  /** See if the field is actively set: CustPhone1 (SERVER_LOOKUP.cust_phone1)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustPhone1 () {
    return this._CustPhone1Set;
  }
  /** set the fields value: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustPhone2") 
  public void setCustPhone2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustPhone2", "setCustPhone2");
    }
    this.CustPhone2 = value;
    this._CustPhone2Set = true;
  }

  /** Retrieves the CustPhone2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustPhone2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustPhone2 field
   */
   public String getCustPhone2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustPhone2AsFormattedString");
       return fmtMgr.formatString(this.getCustPhone2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustPhone2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustPhone2 field from a formatted string
   *
   * @param _value the CustPhone2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustPhone2 field
   */
   public void setCustPhone2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustPhone2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustPhone2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustPhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustPhone2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustPhone2FromFormattedString");
   }

  /** get the value of the field: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return String the value
   */
  public String getCustPhone2 () {
    return this.CustPhone2;
  }
  /** Change the field to not being actively set: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   */
  public void unsetCustPhone2 () {
    this._CustPhone2Set = false;
  }
  /** See if the field is actively set: CustPhone2 (SERVER_LOOKUP.cust_phone2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustPhone2 () {
    return this._CustPhone2Set;
  }
  /** set the fields value: Codeword (SERVER_LOOKUP.codeword)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Codeword") 
  public void setCodeword (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Codeword", "setCodeword");
    }
    this.Codeword = value;
    this._CodewordSet = true;
  }

  /** Retrieves the Codeword field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Codeword field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Codeword field
   */
   public String getCodewordAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordAsFormattedString");
       return fmtMgr.formatString(this.getCodeword());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordAsFormattedString");
       throw x;
     }
   }
  /** Sets the Codeword field from a formatted string
   *
   * @param _value the Codeword field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Codeword field
   */
   public void setCodewordFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCodeword(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFromFormattedString");
   }

  /** get the value of the field: Codeword (SERVER_LOOKUP.codeword)
   * @return String the value
   */
  public String getCodeword () {
    return this.Codeword;
  }
  /** Change the field to not being actively set: Codeword (SERVER_LOOKUP.codeword)
   */
  public void unsetCodeword () {
    this._CodewordSet = false;
  }
  /** See if the field is actively set: Codeword (SERVER_LOOKUP.codeword)
   * @return boolean whether the field is actively set
   */
  public boolean issetCodeword () {
    return this._CodewordSet;
  }
  /** set the fields value: ServerId (SERVER_LOOKUP.server_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServerId") 
  public void setServerId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServerId", "setServerId");
    }
    this.ServerId = value;
    this._ServerIdSet = true;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** get the value of the field: ServerId (SERVER_LOOKUP.server_id)
   * @return Integer the value
   */
  public Integer getServerId () {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId (SERVER_LOOKUP.server_id)
   */
  public void unsetServerId () {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId (SERVER_LOOKUP.server_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId () {
    return this._ServerIdSet;
  }
  /** set the fields value: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AcctSegId") 
  public void setAcctSegId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcctSegId", "setAcctSegId");
    }
    this.AcctSegId = value;
    this._AcctSegIdSet = true;
  }

  /** Retrieves the AcctSegId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcctSegId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegId field
   */
   public String getAcctSegIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcctSegId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcctSegId field from a formatted string
   *
   * @param _value the AcctSegId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcctSegId field
   */
   public void setAcctSegIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcctSegId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AcctSegId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AcctSegId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegId field
   */

  public String getAcctSegIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAcctSegIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAcctSegId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AcctSegId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AcctSegId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AcctSegId field
   */
  public Enumeration getAcctSegIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("AccountSegment", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AcctSegId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAcctSegIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAcctSegIdEnumeration(_locale);
      this.setAcctSegId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AcctSegId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAcctSegIdFromDisplayValue");
  }

  /** get the value of the field: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return Integer the value
   */
  public Integer getAcctSegId () {
    return this.AcctSegId;
  }
  /** Change the field to not being actively set: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   */
  public void unsetAcctSegId () {
    this._AcctSegIdSet = false;
  }
  /** See if the field is actively set: AcctSegId (SERVER_LOOKUP.acct_seg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcctSegId () {
    return this._AcctSegIdSet;
  }
  /** set the fields value: AltLname (SERVER_LOOKUP.alt_lname)
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

  /** get the value of the field: AltLname (SERVER_LOOKUP.alt_lname)
   * @return String the value
   */
  public String getAltLname () {
    return this.AltLname;
  }
  /** Change the field to not being actively set: AltLname (SERVER_LOOKUP.alt_lname)
   */
  public void unsetAltLname () {
    this._AltLnameSet = false;
  }
  /** See if the field is actively set: AltLname (SERVER_LOOKUP.alt_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltLname () {
    return this._AltLnameSet;
  }
  /** set the fields value: AltFname (SERVER_LOOKUP.alt_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltFname") 
  public void setAltFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
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

  /** get the value of the field: AltFname (SERVER_LOOKUP.alt_fname)
   * @return String the value
   */
  public String getAltFname () {
    return this.AltFname;
  }
  /** Change the field to not being actively set: AltFname (SERVER_LOOKUP.alt_fname)
   */
  public void unsetAltFname () {
    this._AltFnameSet = false;
  }
  /** See if the field is actively set: AltFname (SERVER_LOOKUP.alt_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltFname () {
    return this._AltFnameSet;
  }
  /** set the fields value: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltCompanyName") 
  public void setAltCompanyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 60))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AltCompanyName", "setAltCompanyName");
    }
    this.AltCompanyName = value;
    this._AltCompanyNameSet = true;
  }

  /** Retrieves the AltCompanyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltCompanyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCompanyName field
   */
   public String getAltCompanyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCompanyNameAsFormattedString");
       return fmtMgr.formatString(this.getAltCompanyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCompanyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltCompanyName field from a formatted string
   *
   * @param _value the AltCompanyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltCompanyName field
   */
   public void setAltCompanyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCompanyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltCompanyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCompanyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCompanyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCompanyNameFromFormattedString");
   }

  /** get the value of the field: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return String the value
   */
  public String getAltCompanyName () {
    return this.AltCompanyName;
  }
  /** Change the field to not being actively set: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   */
  public void unsetAltCompanyName () {
    this._AltCompanyNameSet = false;
  }
  /** See if the field is actively set: AltCompanyName (SERVER_LOOKUP.alt_company_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltCompanyName () {
    return this._AltCompanyNameSet;
  }
  /** set the fields value: DateActive (SERVER_LOOKUP.date_active)
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

  /** get the value of the field: DateActive (SERVER_LOOKUP.date_active)
   * @return Date the value
   */
  public Date getDateActive () {
    return this.DateActive;
  }
  /** Change the field to not being actively set: DateActive (SERVER_LOOKUP.date_active)
   */
  public void unsetDateActive () {
    this._DateActiveSet = false;
  }
  /** See if the field is actively set: DateActive (SERVER_LOOKUP.date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateActive () {
    return this._DateActiveSet;
  }
  /** set the fields value: DateInactive (SERVER_LOOKUP.date_inactive)
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

  /** get the value of the field: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return Date the value
   */
  public Date getDateInactive () {
    return this.DateInactive;
  }
  /** Change the field to not being actively set: DateInactive (SERVER_LOOKUP.date_inactive)
   */
  public void unsetDateInactive () {
    this._DateInactiveSet = false;
  }
  /** See if the field is actively set: DateInactive (SERVER_LOOKUP.date_inactive)
   * @return boolean whether the field is actively set
   */
  public boolean issetDateInactive () {
    return this._DateInactiveSet;
  }
  /** set the fields value: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustomerLifetimeId") 
  public void setCustomerLifetimeId (Integer value) throws ServiceException
  {
    this.CustomerLifetimeId = value;
    this._CustomerLifetimeIdSet = true;
  }

  /** Retrieves the CustomerLifetimeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerLifetimeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId field
   */
   public String getCustomerLifetimeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCustomerLifetimeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerLifetimeId field from a formatted string
   *
   * @param _value the CustomerLifetimeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerLifetimeId field
   */
   public void setCustomerLifetimeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerLifetimeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeIdFromFormattedString");
   }

  /** get the value of the field: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return Integer the value
   */
  public Integer getCustomerLifetimeId () {
    return this.CustomerLifetimeId;
  }
  /** Change the field to not being actively set: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   */
  public void unsetCustomerLifetimeId () {
    this._CustomerLifetimeIdSet = false;
  }
  /** See if the field is actively set: CustomerLifetimeId (SERVER_LOOKUP.customer_lifetime_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerLifetimeId () {
    return this._CustomerLifetimeIdSet;
  }
  /** set the fields value: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustomerLifetimeId2") 
  public void setCustomerLifetimeId2 (Integer value) throws ServiceException
  {
    this.CustomerLifetimeId2 = value;
    this._CustomerLifetimeId2Set = true;
  }

  /** Retrieves the CustomerLifetimeId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerLifetimeId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerLifetimeId2 field
   */
   public String getCustomerLifetimeId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
       return fmtMgr.formatNumber(this.getCustomerLifetimeId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerLifetimeId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerLifetimeId2 field from a formatted string
   *
   * @param _value the CustomerLifetimeId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerLifetimeId2 field
   */
   public void setCustomerLifetimeId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerLifetimeId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerLifetimeId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerLifetimeId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerLifetimeId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerLifetimeId2FromFormattedString");
   }

  /** get the value of the field: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return Integer the value
   */
  public Integer getCustomerLifetimeId2 () {
    return this.CustomerLifetimeId2;
  }
  /** Change the field to not being actively set: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   */
  public void unsetCustomerLifetimeId2 () {
    this._CustomerLifetimeId2Set = false;
  }
  /** See if the field is actively set: CustomerLifetimeId2 (SERVER_LOOKUP.customer_lifetime_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerLifetimeId2 () {
    return this._CustomerLifetimeId2Set;
  }
  public String toString() {
    return AccountLocateObjectHelper.toMap(this, null).toString();
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
  /** HierarchyId field */
    if (!nonNullOnly || (HierarchyId != null)) _HierarchyIdSet = flag;
  /** ParentId field */
    if (!nonNullOnly || (ParentId != null)) _ParentIdSet = flag;
  /** SERVER_LOOKUP.account_category field */
    if(!nonNullOnly || (AccountCategory != null))  _AccountCategorySet = flag;
  /** SERVER_LOOKUP.bill_fname field */
    if(!nonNullOnly || (BillFname != null))  _BillFnameSet = flag;
  /** SERVER_LOOKUP.bill_fname_find field */
    if(!nonNullOnly || (BillFnameFind != null))  _BillFnameFindSet = flag;
  /** SERVER_LOOKUP.bill_lname field */
    if(!nonNullOnly || (BillLname != null))  _BillLnameSet = flag;
  /** SERVER_LOOKUP.bill_lname_find field */
    if(!nonNullOnly || (BillLnameFind != null))  _BillLnameFindSet = flag;
  /** SERVER_LOOKUP.bill_company field */
    if(!nonNullOnly || (BillCompany != null))  _BillCompanySet = flag;
  /** SERVER_LOOKUP.bill_company_find field */
    if(!nonNullOnly || (BillCompanyFind != null))  _BillCompanyFindSet = flag;
  /** SERVER_LOOKUP.bill_address1 field */
    if(!nonNullOnly || (BillAddress1 != null))  _BillAddress1Set = flag;
  /** SERVER_LOOKUP.bill_city field */
    if(!nonNullOnly || (BillCity != null))  _BillCitySet = flag;
  /** SERVER_LOOKUP.bill_state field */
    if(!nonNullOnly || (BillState != null))  _BillStateSet = flag;
  /** SERVER_LOOKUP.bill_zip field */
    if(!nonNullOnly || (BillZip != null))  _BillZipSet = flag;
  /** SERVER_LOOKUP.cust_phone1 field */
    if(!nonNullOnly || (CustPhone1 != null))  _CustPhone1Set = flag;
  /** SERVER_LOOKUP.cust_phone2 field */
    if(!nonNullOnly || (CustPhone2 != null))  _CustPhone2Set = flag;
  /** SERVER_LOOKUP.codeword field */
    if(!nonNullOnly || (Codeword != null))  _CodewordSet = flag;
  /** SERVER_LOOKUP.server_id field */
    if(!nonNullOnly || (ServerId != null))  _ServerIdSet = flag;
  /** SERVER_LOOKUP.acct_seg_id field */
    if(!nonNullOnly || (AcctSegId != null))  _AcctSegIdSet = flag;
  /** SERVER_LOOKUP.alt_lname field */
    if(!nonNullOnly || (AltLname != null))  _AltLnameSet = flag;
  /** SERVER_LOOKUP.alt_fname field */
    if(!nonNullOnly || (AltFname != null))  _AltFnameSet = flag;
  /** SERVER_LOOKUP.alt_company_name field */
    if(!nonNullOnly || (AltCompanyName != null))  _AltCompanyNameSet = flag;
  /** SERVER_LOOKUP.date_active field */
    if(!nonNullOnly || (DateActive != null))  _DateActiveSet = flag;
  /** SERVER_LOOKUP.date_inactive field */
    if(!nonNullOnly || (DateInactive != null))  _DateInactiveSet = flag;
  /** SERVER_LOOKUP.customer_lifetime_id field */
    if(!nonNullOnly || (CustomerLifetimeId != null))  _CustomerLifetimeIdSet = flag;
  /** SERVER_LOOKUP.customer_lifetime_id2 field */
    if(!nonNullOnly || (CustomerLifetimeId2 != null))  _CustomerLifetimeId2Set = flag;
  }
}
