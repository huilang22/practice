/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardObjectFilter.java
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
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class CreditCardObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CreditCardObjectKeyFilter Key = null;
  /** raw field for: PAYMENT_PROFILE.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: PAYMENT_PROFILE.card_account) */
  public    StringFilter[] CcardAccount  = null;
  protected boolean CcardAccountFetch = false;
  protected boolean CcardAccountSortAscending = true;
  protected boolean CcardAccountCaseInsensitive = false;
  protected Integer CcardAccountSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_lname) */
  public    StringFilter[] OwnrLname  = null;
  protected boolean OwnrLnameFetch = false;
  protected boolean OwnrLnameSortAscending = true;
  protected boolean OwnrLnameCaseInsensitive = false;
  protected Integer OwnrLnameSort = null;
  /** raw field for: PAYMENT_PROFILE.ownr_fname) */
  public    StringFilter[] OwnrFname  = null;
  protected boolean OwnrFnameFetch = false;
  protected boolean OwnrFnameSortAscending = true;
  protected boolean OwnrFnameCaseInsensitive = false;
  protected Integer OwnrFnameSort = null;
  /** raw field for: PAYMENT_PROFILE.card_carrier) */
  public    StringFilter[] CcardCarrier  = null;
  protected boolean CcardCarrierFetch = false;
  protected boolean CcardCarrierSortAscending = true;
  protected boolean CcardCarrierCaseInsensitive = false;
  protected Integer CcardCarrierSort = null;
  /** raw field for: PAYMENT_PROFILE.card_expire) */
  public    StringFilter[] CcardExpire  = null;
  protected boolean CcardExpireFetch = false;
  protected boolean CcardExpireSortAscending = true;
  protected boolean CcardExpireCaseInsensitive = false;
  protected Integer CcardExpireSort = null;
  /** raw field for: PAYMENT_PROFILE.avs_address_id) */
  public    IntegerFilter[] AvsAddressId  = null;
  protected boolean AvsAddressIdFetch = false;
  protected boolean AvsAddressIdSortAscending = true;
  protected Integer AvsAddressIdSort = null;
  /** raw field for: PAYMENT_PROFILE.clearing_house_id) */
  public    StringFilter[] CcardClearingHouseId  = null;
  protected boolean CcardClearingHouseIdFetch = false;
  protected boolean CcardClearingHouseIdSortAscending = true;
  protected boolean CcardClearingHouseIdCaseInsensitive = false;
  protected Integer CcardClearingHouseIdSort = null;
  /** raw field for: PAYMENT_PROFILE.avs_response_code) */
  public    StringFilter[] AvsResponseCode  = null;
  protected boolean AvsResponseCodeFetch = false;
  protected boolean AvsResponseCodeSortAscending = true;
  protected boolean AvsResponseCodeCaseInsensitive = false;
  protected Integer AvsResponseCodeSort = null;
  /** raw field for: PAYMENT_PROFILE.trans_flag) */
  public    StringFilter[] TransFlag  = null;
  protected boolean TransFlagFetch = false;
  protected boolean TransFlagSortAscending = true;
  protected boolean TransFlagCaseInsensitive = false;
  protected Integer TransFlagSort = null;
  private String _objName = "CreditCardObjectFilter";
  /** default constructor */
  public CreditCardObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CreditCardObjectFilter (CreditCardObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CreditCardObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.CcardAccount = other.CcardAccount;
    this.CcardAccountFetch = other.CcardAccountFetch;
    this.CcardAccountSort = other.CcardAccountSort;
    this.CcardAccountCaseInsensitive = other.CcardAccountCaseInsensitive;
    this.CcardAccountSortAscending = other.CcardAccountSortAscending;
    this.OwnrLname = other.OwnrLname;
    this.OwnrLnameFetch = other.OwnrLnameFetch;
    this.OwnrLnameSort = other.OwnrLnameSort;
    this.OwnrLnameCaseInsensitive = other.OwnrLnameCaseInsensitive;
    this.OwnrLnameSortAscending = other.OwnrLnameSortAscending;
    this.OwnrFname = other.OwnrFname;
    this.OwnrFnameFetch = other.OwnrFnameFetch;
    this.OwnrFnameSort = other.OwnrFnameSort;
    this.OwnrFnameCaseInsensitive = other.OwnrFnameCaseInsensitive;
    this.OwnrFnameSortAscending = other.OwnrFnameSortAscending;
    this.CcardCarrier = other.CcardCarrier;
    this.CcardCarrierFetch = other.CcardCarrierFetch;
    this.CcardCarrierSort = other.CcardCarrierSort;
    this.CcardCarrierCaseInsensitive = other.CcardCarrierCaseInsensitive;
    this.CcardCarrierSortAscending = other.CcardCarrierSortAscending;
    this.CcardExpire = other.CcardExpire;
    this.CcardExpireFetch = other.CcardExpireFetch;
    this.CcardExpireSort = other.CcardExpireSort;
    this.CcardExpireCaseInsensitive = other.CcardExpireCaseInsensitive;
    this.CcardExpireSortAscending = other.CcardExpireSortAscending;
    this.AvsAddressId = other.AvsAddressId;
    this.AvsAddressIdFetch = other.AvsAddressIdFetch;
    this.AvsAddressIdSort = other.AvsAddressIdSort;
    this.AvsAddressIdSortAscending = other.AvsAddressIdSortAscending;
    this.CcardClearingHouseId = other.CcardClearingHouseId;
    this.CcardClearingHouseIdFetch = other.CcardClearingHouseIdFetch;
    this.CcardClearingHouseIdSort = other.CcardClearingHouseIdSort;
    this.CcardClearingHouseIdCaseInsensitive = other.CcardClearingHouseIdCaseInsensitive;
    this.CcardClearingHouseIdSortAscending = other.CcardClearingHouseIdSortAscending;
    this.AvsResponseCode = other.AvsResponseCode;
    this.AvsResponseCodeFetch = other.AvsResponseCodeFetch;
    this.AvsResponseCodeSort = other.AvsResponseCodeSort;
    this.AvsResponseCodeCaseInsensitive = other.AvsResponseCodeCaseInsensitive;
    this.AvsResponseCodeSortAscending = other.AvsResponseCodeSortAscending;
    this.TransFlag = other.TransFlag;
    this.TransFlagFetch = other.TransFlagFetch;
    this.TransFlagSort = other.TransFlagSort;
    this.TransFlagCaseInsensitive = other.TransFlagCaseInsensitive;
    this.TransFlagSortAscending = other.TransFlagSortAscending;  }
  /** get the filter for this object's key
   * @return CreditCardObjectKeyFilter
   */
  public CreditCardObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CreditCardObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CreditCardObjectKeyFilter ();
    this.Key.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CreditCardObjectKeyFilter ();
    this.Key.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CreditCardObjectKeyFilter ();
    this.Key.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CreditCardObjectKeyFilter ();
    this.Key.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (PAYMENT_PROFILE.profile_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getProfileIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ProfileId;
  }
  /** Set the field level Fetch value for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (PAYMENT_PROFILE.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardAccountFetch (boolean fetch) {
    this.CcardAccountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardAccountFetch () {
    return this.CcardAccountFetch;
  }
  /** Set the SortOrder for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardAccountSortOrder (Integer value) {
    this.CcardAccountSort = value;
  }
  /** Retrieve SortOrder for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardAccountSortOrder () {
    return this.CcardAccountSort;
  }
  /** Set the sort direction for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardAccountSortDirection (boolean ascending) {
    this.CcardAccountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardAccountSortDirection () {
    return this.CcardAccountSortAscending;
  }
  /** Set the case insensitive for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardAccountCaseInsensitive (boolean ascending) {
    this.CcardAccountCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardAccountCaseInsensitive () {
    return this.CcardAccountCaseInsensitive;
  }
  /** Set the field level filters for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardAccountFilter (StringFilter[] value) throws ServiceException {
    this.CcardAccount = value;
  }
  /** Retrieve filter for field: CcardAccount (PAYMENT_PROFILE.card_account)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardAccountFilter () {
    return this.CcardAccount;
  }

  /**
   * Retrieves the CcardAccountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardAccountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardAccountFilter field
   */
  public String[] getCcardAccountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardAccountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardAccountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardAccountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardAccountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardAccountFilter filter value from a formatted string
   *
   * @param _value the CcardAccountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardAccountFilter filter field
   */
  public void setCcardAccountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardAccountFilterFromFormattedString");
    try {
      this.setCcardAccountFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardAccountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardAccountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setOwnrLnameFetch (boolean fetch) {
    this.OwnrLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwnrLnameFetch () {
    return this.OwnrLnameFetch;
  }
  /** Set the SortOrder for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwnrLnameSortOrder (Integer value) {
    this.OwnrLnameSort = value;
  }
  /** Retrieve SortOrder for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwnrLnameSortOrder () {
    return this.OwnrLnameSort;
  }
  /** Set the sort direction for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwnrLnameSortDirection (boolean ascending) {
    this.OwnrLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwnrLnameSortDirection () {
    return this.OwnrLnameSortAscending;
  }
  /** Set the case insensitive for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOwnrLnameCaseInsensitive (boolean ascending) {
    this.OwnrLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOwnrLnameCaseInsensitive () {
    return this.OwnrLnameCaseInsensitive;
  }
  /** Set the field level filters for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwnrLnameFilter (StringFilter[] value) throws ServiceException {
    this.OwnrLname = value;
  }
  /** Retrieve filter for field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOwnrLnameFilter () {
    return this.OwnrLname;
  }

  /**
   * Retrieves the OwnrLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwnrLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrLnameFilter field
   */
  public String[] getOwnrLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwnrLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwnrLnameFilter filter value from a formatted string
   *
   * @param _value the OwnrLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwnrLnameFilter filter field
   */
  public void setOwnrLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwnrLnameFilterFromFormattedString");
    try {
      this.setOwnrLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setOwnrFnameFetch (boolean fetch) {
    this.OwnrFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getOwnrFnameFetch () {
    return this.OwnrFnameFetch;
  }
  /** Set the SortOrder for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOwnrFnameSortOrder (Integer value) {
    this.OwnrFnameSort = value;
  }
  /** Retrieve SortOrder for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOwnrFnameSortOrder () {
    return this.OwnrFnameSort;
  }
  /** Set the sort direction for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOwnrFnameSortDirection (boolean ascending) {
    this.OwnrFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOwnrFnameSortDirection () {
    return this.OwnrFnameSortAscending;
  }
  /** Set the case insensitive for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOwnrFnameCaseInsensitive (boolean ascending) {
    this.OwnrFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOwnrFnameCaseInsensitive () {
    return this.OwnrFnameCaseInsensitive;
  }
  /** Set the field level filters for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOwnrFnameFilter (StringFilter[] value) throws ServiceException {
    this.OwnrFname = value;
  }
  /** Retrieve filter for field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOwnrFnameFilter () {
    return this.OwnrFname;
  }

  /**
   * Retrieves the OwnrFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OwnrFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrFnameFilter field
   */
  public String[] getOwnrFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOwnrFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OwnrFnameFilter filter value from a formatted string
   *
   * @param _value the OwnrFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OwnrFnameFilter filter field
   */
  public void setOwnrFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOwnrFnameFilterFromFormattedString");
    try {
      this.setOwnrFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OwnrFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardCarrierFetch (boolean fetch) {
    this.CcardCarrierFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardCarrierFetch () {
    return this.CcardCarrierFetch;
  }
  /** Set the SortOrder for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardCarrierSortOrder (Integer value) {
    this.CcardCarrierSort = value;
  }
  /** Retrieve SortOrder for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardCarrierSortOrder () {
    return this.CcardCarrierSort;
  }
  /** Set the sort direction for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardCarrierSortDirection (boolean ascending) {
    this.CcardCarrierSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardCarrierSortDirection () {
    return this.CcardCarrierSortAscending;
  }
  /** Set the case insensitive for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardCarrierCaseInsensitive (boolean ascending) {
    this.CcardCarrierCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardCarrierCaseInsensitive () {
    return this.CcardCarrierCaseInsensitive;
  }
  /** Set the field level filters for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardCarrierFilter (StringFilter[] value) throws ServiceException {
    this.CcardCarrier = value;
  }
  /** Retrieve filter for field: CcardCarrier (PAYMENT_PROFILE.card_carrier)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardCarrierFilter () {
    return this.CcardCarrier;
  }

  /**
   * Retrieves the CcardCarrierFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardCarrierFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardCarrierFilter field
   */
  public String[] getCcardCarrierFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardCarrierFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardCarrierFilter filter value from a formatted string
   *
   * @param _value the CcardCarrierFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardCarrierFilter filter field
   */
  public void setCcardCarrierFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFilterFromFormattedString");
    try {
      this.setCcardCarrierFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CcardCarrierFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CcardCarrierFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CcardCarrierFilter filter field
   */
  public String[] getCcardCarrierFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardCarrierFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCcardCarrierFilter(), "CardTypeCode", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardCarrierFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardCarrierFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CcardCarrierFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardCarrierFilter filter field
   */
  public void setCcardCarrierFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCcardCarrierFilter((StringFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CcardCarrier", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardCarrierFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardCarrierFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardExpireFetch (boolean fetch) {
    this.CcardExpireFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardExpireFetch () {
    return this.CcardExpireFetch;
  }
  /** Set the SortOrder for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardExpireSortOrder (Integer value) {
    this.CcardExpireSort = value;
  }
  /** Retrieve SortOrder for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardExpireSortOrder () {
    return this.CcardExpireSort;
  }
  /** Set the sort direction for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardExpireSortDirection (boolean ascending) {
    this.CcardExpireSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardExpireSortDirection () {
    return this.CcardExpireSortAscending;
  }
  /** Set the case insensitive for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardExpireCaseInsensitive (boolean ascending) {
    this.CcardExpireCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardExpireCaseInsensitive () {
    return this.CcardExpireCaseInsensitive;
  }
  /** Set the field level filters for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardExpireFilter (StringFilter[] value) throws ServiceException {
    this.CcardExpire = value;
  }
  /** Retrieve filter for field: CcardExpire (PAYMENT_PROFILE.card_expire)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardExpireFilter () {
    return this.CcardExpire;
  }

  /**
   * Retrieves the CcardExpireFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardExpireFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardExpireFilter field
   */
  public String[] getCcardExpireFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardExpireFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardExpireFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardExpireFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardExpireFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardExpireFilter filter value from a formatted string
   *
   * @param _value the CcardExpireFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardExpireFilter filter field
   */
  public void setCcardExpireFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardExpireFilterFromFormattedString");
    try {
      this.setCcardExpireFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardExpireFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardExpireFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardExpireFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAvsAddressIdFetch (boolean fetch) {
    this.AvsAddressIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvsAddressIdFetch () {
    return this.AvsAddressIdFetch;
  }
  /** Set the SortOrder for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvsAddressIdSortOrder (Integer value) {
    this.AvsAddressIdSort = value;
  }
  /** Retrieve SortOrder for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvsAddressIdSortOrder () {
    return this.AvsAddressIdSort;
  }
  /** Set the sort direction for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvsAddressIdSortDirection (boolean ascending) {
    this.AvsAddressIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvsAddressIdSortDirection () {
    return this.AvsAddressIdSortAscending;
  }
  /** Set the field level filters for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvsAddressIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AvsAddressId = value;
  }
  /** Retrieve filter for field: AvsAddressId (PAYMENT_PROFILE.avs_address_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAvsAddressIdFilter () {
    return this.AvsAddressId;
  }

  /**
   * Retrieves the AvsAddressIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvsAddressIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsAddressIdFilter field
   */
  public String[] getAvsAddressIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvsAddressIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsAddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsAddressIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvsAddressIdFilter filter value from a formatted string
   *
   * @param _value the AvsAddressIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvsAddressIdFilter filter field
   */
  public void setAvsAddressIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
    try {
      this.setAvsAddressIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsAddressIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsAddressIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCcardClearingHouseIdFetch (boolean fetch) {
    this.CcardClearingHouseIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCcardClearingHouseIdFetch () {
    return this.CcardClearingHouseIdFetch;
  }
  /** Set the SortOrder for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCcardClearingHouseIdSortOrder (Integer value) {
    this.CcardClearingHouseIdSort = value;
  }
  /** Retrieve SortOrder for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCcardClearingHouseIdSortOrder () {
    return this.CcardClearingHouseIdSort;
  }
  /** Set the sort direction for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCcardClearingHouseIdSortDirection (boolean ascending) {
    this.CcardClearingHouseIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCcardClearingHouseIdSortDirection () {
    return this.CcardClearingHouseIdSortAscending;
  }
  /** Set the case insensitive for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCcardClearingHouseIdCaseInsensitive (boolean ascending) {
    this.CcardClearingHouseIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCcardClearingHouseIdCaseInsensitive () {
    return this.CcardClearingHouseIdCaseInsensitive;
  }
  /** Set the field level filters for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCcardClearingHouseIdFilter (StringFilter[] value) throws ServiceException {
    this.CcardClearingHouseId = value;
  }
  /** Retrieve filter for field: CcardClearingHouseId (PAYMENT_PROFILE.clearing_house_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCcardClearingHouseIdFilter () {
    return this.CcardClearingHouseId;
  }

  /**
   * Retrieves the CcardClearingHouseIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CcardClearingHouseIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CcardClearingHouseIdFilter field
   */
  public String[] getCcardClearingHouseIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCcardClearingHouseIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCcardClearingHouseIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCcardClearingHouseIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCcardClearingHouseIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CcardClearingHouseIdFilter filter value from a formatted string
   *
   * @param _value the CcardClearingHouseIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CcardClearingHouseIdFilter filter field
   */
  public void setCcardClearingHouseIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCcardClearingHouseIdFilterFromFormattedString");
    try {
      this.setCcardClearingHouseIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CcardClearingHouseIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCcardClearingHouseIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCcardClearingHouseIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAvsResponseCodeFetch (boolean fetch) {
    this.AvsResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvsResponseCodeFetch () {
    return this.AvsResponseCodeFetch;
  }
  /** Set the SortOrder for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvsResponseCodeSortOrder (Integer value) {
    this.AvsResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvsResponseCodeSortOrder () {
    return this.AvsResponseCodeSort;
  }
  /** Set the sort direction for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvsResponseCodeSortDirection (boolean ascending) {
    this.AvsResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvsResponseCodeSortDirection () {
    return this.AvsResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAvsResponseCodeCaseInsensitive (boolean ascending) {
    this.AvsResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAvsResponseCodeCaseInsensitive () {
    return this.AvsResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvsResponseCodeFilter (StringFilter[] value) throws ServiceException {
    this.AvsResponseCode = value;
  }
  /** Retrieve filter for field: AvsResponseCode (PAYMENT_PROFILE.avs_response_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAvsResponseCodeFilter () {
    return this.AvsResponseCode;
  }

  /**
   * Retrieves the AvsResponseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvsResponseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvsResponseCodeFilter field
   */
  public String[] getAvsResponseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvsResponseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvsResponseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvsResponseCodeFilter filter value from a formatted string
   *
   * @param _value the AvsResponseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvsResponseCodeFilter filter field
   */
  public void setAvsResponseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
    try {
      this.setAvsResponseCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvsResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvsResponseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setTransFlagFetch (boolean fetch) {
    this.TransFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransFlagFetch () {
    return this.TransFlagFetch;
  }
  /** Set the SortOrder for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransFlagSortOrder (Integer value) {
    this.TransFlagSort = value;
  }
  /** Retrieve SortOrder for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransFlagSortOrder () {
    return this.TransFlagSort;
  }
  /** Set the sort direction for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransFlagSortDirection (boolean ascending) {
    this.TransFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransFlagSortDirection () {
    return this.TransFlagSortAscending;
  }
  /** Set the case insensitive for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransFlagCaseInsensitive (boolean ascending) {
    this.TransFlagCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransFlagCaseInsensitive () {
    return this.TransFlagCaseInsensitive;
  }
  /** Set the field level filters for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransFlagFilter (StringFilter[] value) throws ServiceException {
    this.TransFlag = value;
  }
  /** Retrieve filter for field: TransFlag (PAYMENT_PROFILE.trans_flag)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransFlagFilter () {
    return this.TransFlag;
  }

  /**
   * Retrieves the TransFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransFlagFilter field
   */
  public String[] getTransFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransFlagFilter filter value from a formatted string
   *
   * @param _value the TransFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransFlagFilter filter field
   */
  public void setTransFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransFlagFilterFromFormattedString");
    try {
      this.setTransFlagFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransFlagFilterFromFormattedString");
  }

  public String toString() {
    return CreditCardObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CreditCardObjectHelper.toMap(this, null);
  }
}
