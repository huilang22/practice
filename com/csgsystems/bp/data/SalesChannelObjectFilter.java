/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SalesChannelObjectFilter.java
 * Definition File: Admin/SalesChannel.xml
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


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class SalesChannelObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public SalesChannelObjectKeyFilter Key = null;
  /** raw field for: SALES_CHANNEL_REF.sc_name) */
  public    StringFilter[] ScName  = null;
  protected boolean ScNameFetch = false;
  protected boolean ScNameSortAscending = true;
  protected boolean ScNameCaseInsensitive = false;
  protected Integer ScNameSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_number) */
  public    StringFilter[] ScNumber  = null;
  protected boolean ScNumberFetch = false;
  protected boolean ScNumberSortAscending = true;
  protected boolean ScNumberCaseInsensitive = false;
  protected Integer ScNumberSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_contact_name_pre) */
  public    StringFilter[] ScContactNamePre  = null;
  protected boolean ScContactNamePreFetch = false;
  protected boolean ScContactNamePreSortAscending = true;
  protected boolean ScContactNamePreCaseInsensitive = false;
  protected Integer ScContactNamePreSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_contact_fname) */
  public    StringFilter[] ScContactFname  = null;
  protected boolean ScContactFnameFetch = false;
  protected boolean ScContactFnameSortAscending = true;
  protected boolean ScContactFnameCaseInsensitive = false;
  protected Integer ScContactFnameSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_contact_minit) */
  public    StringFilter[] ScContactMinit  = null;
  protected boolean ScContactMinitFetch = false;
  protected boolean ScContactMinitSortAscending = true;
  protected boolean ScContactMinitCaseInsensitive = false;
  protected Integer ScContactMinitSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_contact_lname) */
  public    StringFilter[] ScContactLname  = null;
  protected boolean ScContactLnameFetch = false;
  protected boolean ScContactLnameSortAscending = true;
  protected boolean ScContactLnameCaseInsensitive = false;
  protected Integer ScContactLnameSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_contact_name_gen) */
  public    StringFilter[] ScContactNameGen  = null;
  protected boolean ScContactNameGenFetch = false;
  protected boolean ScContactNameGenSortAscending = true;
  protected boolean ScContactNameGenCaseInsensitive = false;
  protected Integer ScContactNameGenSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_address1) */
  public    StringFilter[] ScAddress1  = null;
  protected boolean ScAddress1Fetch = false;
  protected boolean ScAddress1SortAscending = true;
  protected boolean ScAddress1CaseInsensitive = false;
  protected Integer ScAddress1Sort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_address2) */
  public    StringFilter[] ScAddress2  = null;
  protected boolean ScAddress2Fetch = false;
  protected boolean ScAddress2SortAscending = true;
  protected boolean ScAddress2CaseInsensitive = false;
  protected Integer ScAddress2Sort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_address3) */
  public    StringFilter[] ScAddress3  = null;
  protected boolean ScAddress3Fetch = false;
  protected boolean ScAddress3SortAscending = true;
  protected boolean ScAddress3CaseInsensitive = false;
  protected Integer ScAddress3Sort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_city) */
  public    StringFilter[] ScCity  = null;
  protected boolean ScCityFetch = false;
  protected boolean ScCitySortAscending = true;
  protected boolean ScCityCaseInsensitive = false;
  protected Integer ScCitySort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_state) */
  public    StringFilter[] ScState  = null;
  protected boolean ScStateFetch = false;
  protected boolean ScStateSortAscending = true;
  protected boolean ScStateCaseInsensitive = false;
  protected Integer ScStateSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_zip_code) */
  public    StringFilter[] ScZipCode  = null;
  protected boolean ScZipCodeFetch = false;
  protected boolean ScZipCodeSortAscending = true;
  protected boolean ScZipCodeCaseInsensitive = false;
  protected Integer ScZipCodeSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_country_code) */
  public    IntegerFilter[] ScCountryCode  = null;
  protected boolean ScCountryCodeFetch = false;
  protected boolean ScCountryCodeSortAscending = true;
  protected Integer ScCountryCodeSort = null;
  /** raw field for: SALES_CHANNEL_REF.sc_phone) */
  public    StringFilter[] ScPhone  = null;
  protected boolean ScPhoneFetch = false;
  protected boolean ScPhoneSortAscending = true;
  protected boolean ScPhoneCaseInsensitive = false;
  protected Integer ScPhoneSort = null;
  /** raw field for: SALES_CHANNEL_REF.parent_sales_channel_id) */
  public    IntegerFilter[] ParentSalesChannelId  = null;
  protected boolean ParentSalesChannelIdFetch = false;
  protected boolean ParentSalesChannelIdSortAscending = true;
  protected Integer ParentSalesChannelIdSort = null;
  /** raw field for: SALES_CHANNEL_REF.commission_id) */
  public    IntegerFilter[] CommissionId  = null;
  protected boolean CommissionIdFetch = false;
  protected boolean CommissionIdSortAscending = true;
  protected Integer CommissionIdSort = null;
  /** raw field for: SALES_CHANNEL_REF.dealer_pin) */
  public    StringFilter[] DealerPin  = null;
  protected boolean DealerPinFetch = false;
  protected boolean DealerPinSortAscending = true;
  protected boolean DealerPinCaseInsensitive = false;
  protected Integer DealerPinSort = null;
  /** raw field for: SALES_CHANNEL_REF.security_word) */
  public    StringFilter[] SecurityWord  = null;
  protected boolean SecurityWordFetch = false;
  protected boolean SecurityWordSortAscending = true;
  protected boolean SecurityWordCaseInsensitive = false;
  protected Integer SecurityWordSort = null;
  /** raw field for: SALES_CHANNEL_REF.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: SALES_CHANNEL_REF.date_active) */
  public    DateFilter[] DateActive  = null;
  protected boolean DateActiveFetch = false;
  protected boolean DateActiveSortAscending = true;
  protected Integer DateActiveSort = null;
  /** raw field for: SALES_CHANNEL_REF.date_inactive) */
  public    DateFilter[] DateInactive  = null;
  protected boolean DateInactiveFetch = false;
  protected boolean DateInactiveSortAscending = true;
  protected Integer DateInactiveSort = null;
  /** raw field for: SALES_CHANNEL_REF.num_threshold) */
  public    IntegerFilter[] NumThreshold  = null;
  protected boolean NumThresholdFetch = false;
  protected boolean NumThresholdSortAscending = true;
  protected Integer NumThresholdSort = null;
  /** raw field for: SALES_CHANNEL_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: SALES_CHANNEL_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: SALES_CHANNEL_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: SALES_CHANNEL_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: SALES_CHANNEL_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "SalesChannelObjectFilter";
  /** default constructor */
  public SalesChannelObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public SalesChannelObjectFilter (SalesChannelObjectFilter other)
  {
    if (other == null) return;
    this.Key = new SalesChannelObjectKeyFilter (other.Key);
    this.ScName = other.ScName;
    this.ScNameFetch = other.ScNameFetch;
    this.ScNameSort = other.ScNameSort;
    this.ScNameCaseInsensitive = other.ScNameCaseInsensitive;
    this.ScNameSortAscending = other.ScNameSortAscending;
    this.ScNumber = other.ScNumber;
    this.ScNumberFetch = other.ScNumberFetch;
    this.ScNumberSort = other.ScNumberSort;
    this.ScNumberCaseInsensitive = other.ScNumberCaseInsensitive;
    this.ScNumberSortAscending = other.ScNumberSortAscending;
    this.ScContactNamePre = other.ScContactNamePre;
    this.ScContactNamePreFetch = other.ScContactNamePreFetch;
    this.ScContactNamePreSort = other.ScContactNamePreSort;
    this.ScContactNamePreCaseInsensitive = other.ScContactNamePreCaseInsensitive;
    this.ScContactNamePreSortAscending = other.ScContactNamePreSortAscending;
    this.ScContactFname = other.ScContactFname;
    this.ScContactFnameFetch = other.ScContactFnameFetch;
    this.ScContactFnameSort = other.ScContactFnameSort;
    this.ScContactFnameCaseInsensitive = other.ScContactFnameCaseInsensitive;
    this.ScContactFnameSortAscending = other.ScContactFnameSortAscending;
    this.ScContactMinit = other.ScContactMinit;
    this.ScContactMinitFetch = other.ScContactMinitFetch;
    this.ScContactMinitSort = other.ScContactMinitSort;
    this.ScContactMinitCaseInsensitive = other.ScContactMinitCaseInsensitive;
    this.ScContactMinitSortAscending = other.ScContactMinitSortAscending;
    this.ScContactLname = other.ScContactLname;
    this.ScContactLnameFetch = other.ScContactLnameFetch;
    this.ScContactLnameSort = other.ScContactLnameSort;
    this.ScContactLnameCaseInsensitive = other.ScContactLnameCaseInsensitive;
    this.ScContactLnameSortAscending = other.ScContactLnameSortAscending;
    this.ScContactNameGen = other.ScContactNameGen;
    this.ScContactNameGenFetch = other.ScContactNameGenFetch;
    this.ScContactNameGenSort = other.ScContactNameGenSort;
    this.ScContactNameGenCaseInsensitive = other.ScContactNameGenCaseInsensitive;
    this.ScContactNameGenSortAscending = other.ScContactNameGenSortAscending;
    this.ScAddress1 = other.ScAddress1;
    this.ScAddress1Fetch = other.ScAddress1Fetch;
    this.ScAddress1Sort = other.ScAddress1Sort;
    this.ScAddress1CaseInsensitive = other.ScAddress1CaseInsensitive;
    this.ScAddress1SortAscending = other.ScAddress1SortAscending;
    this.ScAddress2 = other.ScAddress2;
    this.ScAddress2Fetch = other.ScAddress2Fetch;
    this.ScAddress2Sort = other.ScAddress2Sort;
    this.ScAddress2CaseInsensitive = other.ScAddress2CaseInsensitive;
    this.ScAddress2SortAscending = other.ScAddress2SortAscending;
    this.ScAddress3 = other.ScAddress3;
    this.ScAddress3Fetch = other.ScAddress3Fetch;
    this.ScAddress3Sort = other.ScAddress3Sort;
    this.ScAddress3CaseInsensitive = other.ScAddress3CaseInsensitive;
    this.ScAddress3SortAscending = other.ScAddress3SortAscending;
    this.ScCity = other.ScCity;
    this.ScCityFetch = other.ScCityFetch;
    this.ScCitySort = other.ScCitySort;
    this.ScCityCaseInsensitive = other.ScCityCaseInsensitive;
    this.ScCitySortAscending = other.ScCitySortAscending;
    this.ScState = other.ScState;
    this.ScStateFetch = other.ScStateFetch;
    this.ScStateSort = other.ScStateSort;
    this.ScStateCaseInsensitive = other.ScStateCaseInsensitive;
    this.ScStateSortAscending = other.ScStateSortAscending;
    this.ScZipCode = other.ScZipCode;
    this.ScZipCodeFetch = other.ScZipCodeFetch;
    this.ScZipCodeSort = other.ScZipCodeSort;
    this.ScZipCodeCaseInsensitive = other.ScZipCodeCaseInsensitive;
    this.ScZipCodeSortAscending = other.ScZipCodeSortAscending;
    this.ScCountryCode = other.ScCountryCode;
    this.ScCountryCodeFetch = other.ScCountryCodeFetch;
    this.ScCountryCodeSort = other.ScCountryCodeSort;
    this.ScCountryCodeSortAscending = other.ScCountryCodeSortAscending;
    this.ScPhone = other.ScPhone;
    this.ScPhoneFetch = other.ScPhoneFetch;
    this.ScPhoneSort = other.ScPhoneSort;
    this.ScPhoneCaseInsensitive = other.ScPhoneCaseInsensitive;
    this.ScPhoneSortAscending = other.ScPhoneSortAscending;
    this.ParentSalesChannelId = other.ParentSalesChannelId;
    this.ParentSalesChannelIdFetch = other.ParentSalesChannelIdFetch;
    this.ParentSalesChannelIdSort = other.ParentSalesChannelIdSort;
    this.ParentSalesChannelIdSortAscending = other.ParentSalesChannelIdSortAscending;
    this.CommissionId = other.CommissionId;
    this.CommissionIdFetch = other.CommissionIdFetch;
    this.CommissionIdSort = other.CommissionIdSort;
    this.CommissionIdSortAscending = other.CommissionIdSortAscending;
    this.DealerPin = other.DealerPin;
    this.DealerPinFetch = other.DealerPinFetch;
    this.DealerPinSort = other.DealerPinSort;
    this.DealerPinCaseInsensitive = other.DealerPinCaseInsensitive;
    this.DealerPinSortAscending = other.DealerPinSortAscending;
    this.SecurityWord = other.SecurityWord;
    this.SecurityWordFetch = other.SecurityWordFetch;
    this.SecurityWordSort = other.SecurityWordSort;
    this.SecurityWordCaseInsensitive = other.SecurityWordCaseInsensitive;
    this.SecurityWordSortAscending = other.SecurityWordSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.DateActive = other.DateActive;
    this.DateActiveFetch = other.DateActiveFetch;
    this.DateActiveSort = other.DateActiveSort;
    this.DateActiveSortAscending = other.DateActiveSortAscending;
    this.DateInactive = other.DateInactive;
    this.DateInactiveFetch = other.DateInactiveFetch;
    this.DateInactiveSort = other.DateInactiveSort;
    this.DateInactiveSortAscending = other.DateInactiveSortAscending;
    this.NumThreshold = other.NumThreshold;
    this.NumThresholdFetch = other.NumThresholdFetch;
    this.NumThresholdSort = other.NumThresholdSort;
    this.NumThresholdSortAscending = other.NumThresholdSortAscending;
    this.IsDefault = other.IsDefault;
    this.IsDefaultFetch = other.IsDefaultFetch;
    this.IsDefaultSort = other.IsDefaultSort;
    this.IsDefaultSortAscending = other.IsDefaultSortAscending;
    this.IsInternal = other.IsInternal;
    this.IsInternalFetch = other.IsInternalFetch;
    this.IsInternalSort = other.IsInternalSort;
    this.IsInternalSortAscending = other.IsInternalSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.ShortDisplay = other.ShortDisplay;
    this.ShortDisplayFetch = other.ShortDisplayFetch;
    this.ShortDisplaySort = other.ShortDisplaySort;
    this.ShortDisplayCaseInsensitive = other.ShortDisplayCaseInsensitive;
    this.ShortDisplaySortAscending = other.ShortDisplaySortAscending;
    this.DisplayValue = other.DisplayValue;
    this.DisplayValueFetch = other.DisplayValueFetch;
    this.DisplayValueSort = other.DisplayValueSort;
    this.DisplayValueCaseInsensitive = other.DisplayValueCaseInsensitive;
    this.DisplayValueSortAscending = other.DisplayValueSortAscending;  }
  /** get the filter for this object's key
   * @return SalesChannelObjectKeyFilter
   */
  public SalesChannelObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (SalesChannelObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSalesChannelIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.SalesChannelIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSalesChannelIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.SalesChannelIdFetch;
  }
  /** Set the SortOrder for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSalesChannelIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.SalesChannelIdSort = value;
  }
  /** Retrieve SortOrder for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSalesChannelIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.SalesChannelIdSort;
  }
  /** Set the sort direction for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSalesChannelIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.SalesChannelIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSalesChannelIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.SalesChannelIdSortAscending;
  }
  /** Set the field level filters for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSalesChannelIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.SalesChannelId = value;
  }
  /** Retrieve filter for field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSalesChannelIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.SalesChannelId;
  }
  /** Set the field level Fetch value for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new SalesChannelObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @param fetch whether to fetch this field or not
   */
  public void setScNameFetch (boolean fetch) {
    this.ScNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getScNameFetch () {
    return this.ScNameFetch;
  }
  /** Set the SortOrder for field: ScName (SALES_CHANNEL_REF.sc_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScNameSortOrder (Integer value) {
    this.ScNameSort = value;
  }
  /** Retrieve SortOrder for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScNameSortOrder () {
    return this.ScNameSort;
  }
  /** Set the sort direction for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScNameSortDirection (boolean ascending) {
    this.ScNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScNameSortDirection () {
    return this.ScNameSortAscending;
  }
  /** Set the case insensitive for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScNameCaseInsensitive (boolean ascending) {
    this.ScNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScNameCaseInsensitive () {
    return this.ScNameCaseInsensitive;
  }
  /** Set the field level filters for field: ScName (SALES_CHANNEL_REF.sc_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScNameFilter (StringFilter[] value) throws ServiceException {
    this.ScName = value;
  }
  /** Retrieve filter for field: ScName (SALES_CHANNEL_REF.sc_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScNameFilter () {
    return this.ScName;
  }

  /**
   * Retrieves the ScNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScNameFilter field
   */
  public String[] getScNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScNameFilter filter value from a formatted string
   *
   * @param _value the ScNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScNameFilter filter field
   */
  public void setScNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScNameFilterFromFormattedString");
    try {
      this.setScNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @param fetch whether to fetch this field or not
   */
  public void setScNumberFetch (boolean fetch) {
    this.ScNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getScNumberFetch () {
    return this.ScNumberFetch;
  }
  /** Set the SortOrder for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScNumberSortOrder (Integer value) {
    this.ScNumberSort = value;
  }
  /** Retrieve SortOrder for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScNumberSortOrder () {
    return this.ScNumberSort;
  }
  /** Set the sort direction for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScNumberSortDirection (boolean ascending) {
    this.ScNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScNumberSortDirection () {
    return this.ScNumberSortAscending;
  }
  /** Set the case insensitive for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScNumberCaseInsensitive (boolean ascending) {
    this.ScNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScNumberCaseInsensitive () {
    return this.ScNumberCaseInsensitive;
  }
  /** Set the field level filters for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScNumberFilter (StringFilter[] value) throws ServiceException {
    this.ScNumber = value;
  }
  /** Retrieve filter for field: ScNumber (SALES_CHANNEL_REF.sc_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScNumberFilter () {
    return this.ScNumber;
  }

  /**
   * Retrieves the ScNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScNumberFilter field
   */
  public String[] getScNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScNumberFilter filter value from a formatted string
   *
   * @param _value the ScNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScNumberFilter filter field
   */
  public void setScNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScNumberFilterFromFormattedString");
    try {
      this.setScNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactNamePreFetch (boolean fetch) {
    this.ScContactNamePreFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactNamePreFetch () {
    return this.ScContactNamePreFetch;
  }
  /** Set the SortOrder for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactNamePreSortOrder (Integer value) {
    this.ScContactNamePreSort = value;
  }
  /** Retrieve SortOrder for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactNamePreSortOrder () {
    return this.ScContactNamePreSort;
  }
  /** Set the sort direction for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactNamePreSortDirection (boolean ascending) {
    this.ScContactNamePreSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactNamePreSortDirection () {
    return this.ScContactNamePreSortAscending;
  }
  /** Set the case insensitive for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactNamePreCaseInsensitive (boolean ascending) {
    this.ScContactNamePreCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactNamePreCaseInsensitive () {
    return this.ScContactNamePreCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactNamePreFilter (StringFilter[] value) throws ServiceException {
    this.ScContactNamePre = value;
  }
  /** Retrieve filter for field: ScContactNamePre (SALES_CHANNEL_REF.sc_contact_name_pre)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScContactNamePreFilter () {
    return this.ScContactNamePre;
  }

  /**
   * Retrieves the ScContactNamePreFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScContactNamePreFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactNamePreFilter field
   */
  public String[] getScContactNamePreFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNamePreFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScContactNamePreFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactNamePreFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactNamePreFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScContactNamePreFilter filter value from a formatted string
   *
   * @param _value the ScContactNamePreFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScContactNamePreFilter filter field
   */
  public void setScContactNamePreFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScContactNamePreFilterFromFormattedString");
    try {
      this.setScContactNamePreFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactNamePreFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactNamePreFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactFnameFetch (boolean fetch) {
    this.ScContactFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactFnameFetch () {
    return this.ScContactFnameFetch;
  }
  /** Set the SortOrder for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactFnameSortOrder (Integer value) {
    this.ScContactFnameSort = value;
  }
  /** Retrieve SortOrder for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactFnameSortOrder () {
    return this.ScContactFnameSort;
  }
  /** Set the sort direction for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactFnameSortDirection (boolean ascending) {
    this.ScContactFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactFnameSortDirection () {
    return this.ScContactFnameSortAscending;
  }
  /** Set the case insensitive for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactFnameCaseInsensitive (boolean ascending) {
    this.ScContactFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactFnameCaseInsensitive () {
    return this.ScContactFnameCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactFnameFilter (StringFilter[] value) throws ServiceException {
    this.ScContactFname = value;
  }
  /** Retrieve filter for field: ScContactFname (SALES_CHANNEL_REF.sc_contact_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScContactFnameFilter () {
    return this.ScContactFname;
  }

  /**
   * Retrieves the ScContactFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScContactFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactFnameFilter field
   */
  public String[] getScContactFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScContactFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScContactFnameFilter filter value from a formatted string
   *
   * @param _value the ScContactFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScContactFnameFilter filter field
   */
  public void setScContactFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScContactFnameFilterFromFormattedString");
    try {
      this.setScContactFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactMinitFetch (boolean fetch) {
    this.ScContactMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactMinitFetch () {
    return this.ScContactMinitFetch;
  }
  /** Set the SortOrder for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactMinitSortOrder (Integer value) {
    this.ScContactMinitSort = value;
  }
  /** Retrieve SortOrder for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactMinitSortOrder () {
    return this.ScContactMinitSort;
  }
  /** Set the sort direction for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactMinitSortDirection (boolean ascending) {
    this.ScContactMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactMinitSortDirection () {
    return this.ScContactMinitSortAscending;
  }
  /** Set the case insensitive for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactMinitCaseInsensitive (boolean ascending) {
    this.ScContactMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactMinitCaseInsensitive () {
    return this.ScContactMinitCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactMinitFilter (StringFilter[] value) throws ServiceException {
    this.ScContactMinit = value;
  }
  /** Retrieve filter for field: ScContactMinit (SALES_CHANNEL_REF.sc_contact_minit)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScContactMinitFilter () {
    return this.ScContactMinit;
  }

  /**
   * Retrieves the ScContactMinitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScContactMinitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactMinitFilter field
   */
  public String[] getScContactMinitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactMinitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScContactMinitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactMinitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactMinitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScContactMinitFilter filter value from a formatted string
   *
   * @param _value the ScContactMinitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScContactMinitFilter filter field
   */
  public void setScContactMinitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScContactMinitFilterFromFormattedString");
    try {
      this.setScContactMinitFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactMinitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactMinitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactLnameFetch (boolean fetch) {
    this.ScContactLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactLnameFetch () {
    return this.ScContactLnameFetch;
  }
  /** Set the SortOrder for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactLnameSortOrder (Integer value) {
    this.ScContactLnameSort = value;
  }
  /** Retrieve SortOrder for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactLnameSortOrder () {
    return this.ScContactLnameSort;
  }
  /** Set the sort direction for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactLnameSortDirection (boolean ascending) {
    this.ScContactLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactLnameSortDirection () {
    return this.ScContactLnameSortAscending;
  }
  /** Set the case insensitive for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactLnameCaseInsensitive (boolean ascending) {
    this.ScContactLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactLnameCaseInsensitive () {
    return this.ScContactLnameCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactLnameFilter (StringFilter[] value) throws ServiceException {
    this.ScContactLname = value;
  }
  /** Retrieve filter for field: ScContactLname (SALES_CHANNEL_REF.sc_contact_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScContactLnameFilter () {
    return this.ScContactLname;
  }

  /**
   * Retrieves the ScContactLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScContactLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactLnameFilter field
   */
  public String[] getScContactLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScContactLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScContactLnameFilter filter value from a formatted string
   *
   * @param _value the ScContactLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScContactLnameFilter filter field
   */
  public void setScContactLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScContactLnameFilterFromFormattedString");
    try {
      this.setScContactLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactNameGenFetch (boolean fetch) {
    this.ScContactNameGenFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactNameGenFetch () {
    return this.ScContactNameGenFetch;
  }
  /** Set the SortOrder for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactNameGenSortOrder (Integer value) {
    this.ScContactNameGenSort = value;
  }
  /** Retrieve SortOrder for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactNameGenSortOrder () {
    return this.ScContactNameGenSort;
  }
  /** Set the sort direction for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactNameGenSortDirection (boolean ascending) {
    this.ScContactNameGenSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactNameGenSortDirection () {
    return this.ScContactNameGenSortAscending;
  }
  /** Set the case insensitive for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactNameGenCaseInsensitive (boolean ascending) {
    this.ScContactNameGenCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactNameGenCaseInsensitive () {
    return this.ScContactNameGenCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactNameGenFilter (StringFilter[] value) throws ServiceException {
    this.ScContactNameGen = value;
  }
  /** Retrieve filter for field: ScContactNameGen (SALES_CHANNEL_REF.sc_contact_name_gen)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScContactNameGenFilter () {
    return this.ScContactNameGen;
  }

  /**
   * Retrieves the ScContactNameGenFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScContactNameGenFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScContactNameGenFilter field
   */
  public String[] getScContactNameGenFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScContactNameGenFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScContactNameGenFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScContactNameGenFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactNameGenFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScContactNameGenFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScContactNameGenFilter filter value from a formatted string
   *
   * @param _value the ScContactNameGenFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScContactNameGenFilter filter field
   */
  public void setScContactNameGenFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScContactNameGenFilterFromFormattedString");
    try {
      this.setScContactNameGenFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScContactNameGenFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScContactNameGenFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScContactNameGenFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress1Fetch (boolean fetch) {
    this.ScAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress1Fetch () {
    return this.ScAddress1Fetch;
  }
  /** Set the SortOrder for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress1SortOrder (Integer value) {
    this.ScAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress1SortOrder () {
    return this.ScAddress1Sort;
  }
  /** Set the sort direction for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress1SortDirection (boolean ascending) {
    this.ScAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress1SortDirection () {
    return this.ScAddress1SortAscending;
  }
  /** Set the case insensitive for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress1CaseInsensitive (boolean ascending) {
    this.ScAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress1CaseInsensitive () {
    return this.ScAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress1Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress1 = value;
  }
  /** Retrieve filter for field: ScAddress1 (SALES_CHANNEL_REF.sc_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScAddress1Filter () {
    return this.ScAddress1;
  }

  /**
   * Retrieves the ScAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress1Filter field
   */
  public String[] getScAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScAddress1Filter filter value from a formatted string
   *
   * @param _value the ScAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScAddress1Filter filter field
   */
  public void setScAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScAddress1FilterFromFormattedString");
    try {
      this.setScAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress2Fetch (boolean fetch) {
    this.ScAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress2Fetch () {
    return this.ScAddress2Fetch;
  }
  /** Set the SortOrder for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress2SortOrder (Integer value) {
    this.ScAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress2SortOrder () {
    return this.ScAddress2Sort;
  }
  /** Set the sort direction for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress2SortDirection (boolean ascending) {
    this.ScAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress2SortDirection () {
    return this.ScAddress2SortAscending;
  }
  /** Set the case insensitive for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress2CaseInsensitive (boolean ascending) {
    this.ScAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress2CaseInsensitive () {
    return this.ScAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress2Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress2 = value;
  }
  /** Retrieve filter for field: ScAddress2 (SALES_CHANNEL_REF.sc_address2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScAddress2Filter () {
    return this.ScAddress2;
  }

  /**
   * Retrieves the ScAddress2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScAddress2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress2Filter field
   */
  public String[] getScAddress2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScAddress2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScAddress2Filter filter value from a formatted string
   *
   * @param _value the ScAddress2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScAddress2Filter filter field
   */
  public void setScAddress2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScAddress2FilterFromFormattedString");
    try {
      this.setScAddress2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress3Fetch (boolean fetch) {
    this.ScAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress3Fetch () {
    return this.ScAddress3Fetch;
  }
  /** Set the SortOrder for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress3SortOrder (Integer value) {
    this.ScAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress3SortOrder () {
    return this.ScAddress3Sort;
  }
  /** Set the sort direction for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress3SortDirection (boolean ascending) {
    this.ScAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress3SortDirection () {
    return this.ScAddress3SortAscending;
  }
  /** Set the case insensitive for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress3CaseInsensitive (boolean ascending) {
    this.ScAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress3CaseInsensitive () {
    return this.ScAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress3Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress3 = value;
  }
  /** Retrieve filter for field: ScAddress3 (SALES_CHANNEL_REF.sc_address3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScAddress3Filter () {
    return this.ScAddress3;
  }

  /**
   * Retrieves the ScAddress3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScAddress3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScAddress3Filter field
   */
  public String[] getScAddress3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScAddress3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScAddress3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScAddress3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScAddress3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScAddress3Filter filter value from a formatted string
   *
   * @param _value the ScAddress3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScAddress3Filter filter field
   */
  public void setScAddress3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScAddress3FilterFromFormattedString");
    try {
      this.setScAddress3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScAddress3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScAddress3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @param fetch whether to fetch this field or not
   */
  public void setScCityFetch (boolean fetch) {
    this.ScCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getScCityFetch () {
    return this.ScCityFetch;
  }
  /** Set the SortOrder for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScCitySortOrder (Integer value) {
    this.ScCitySort = value;
  }
  /** Retrieve SortOrder for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScCitySortOrder () {
    return this.ScCitySort;
  }
  /** Set the sort direction for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScCitySortDirection (boolean ascending) {
    this.ScCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScCitySortDirection () {
    return this.ScCitySortAscending;
  }
  /** Set the case insensitive for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScCityCaseInsensitive (boolean ascending) {
    this.ScCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScCityCaseInsensitive () {
    return this.ScCityCaseInsensitive;
  }
  /** Set the field level filters for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScCityFilter (StringFilter[] value) throws ServiceException {
    this.ScCity = value;
  }
  /** Retrieve filter for field: ScCity (SALES_CHANNEL_REF.sc_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScCityFilter () {
    return this.ScCity;
  }

  /**
   * Retrieves the ScCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCityFilter field
   */
  public String[] getScCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScCityFilter filter value from a formatted string
   *
   * @param _value the ScCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScCityFilter filter field
   */
  public void setScCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScCityFilterFromFormattedString");
    try {
      this.setScCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @param fetch whether to fetch this field or not
   */
  public void setScStateFetch (boolean fetch) {
    this.ScStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getScStateFetch () {
    return this.ScStateFetch;
  }
  /** Set the SortOrder for field: ScState (SALES_CHANNEL_REF.sc_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScStateSortOrder (Integer value) {
    this.ScStateSort = value;
  }
  /** Retrieve SortOrder for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScStateSortOrder () {
    return this.ScStateSort;
  }
  /** Set the sort direction for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScStateSortDirection (boolean ascending) {
    this.ScStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScStateSortDirection () {
    return this.ScStateSortAscending;
  }
  /** Set the case insensitive for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScStateCaseInsensitive (boolean ascending) {
    this.ScStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScStateCaseInsensitive () {
    return this.ScStateCaseInsensitive;
  }
  /** Set the field level filters for field: ScState (SALES_CHANNEL_REF.sc_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScStateFilter (StringFilter[] value) throws ServiceException {
    this.ScState = value;
  }
  /** Retrieve filter for field: ScState (SALES_CHANNEL_REF.sc_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScStateFilter () {
    return this.ScState;
  }

  /**
   * Retrieves the ScStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScStateFilter field
   */
  public String[] getScStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScStateFilter filter value from a formatted string
   *
   * @param _value the ScStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScStateFilter filter field
   */
  public void setScStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScStateFilterFromFormattedString");
    try {
      this.setScStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @param fetch whether to fetch this field or not
   */
  public void setScZipCodeFetch (boolean fetch) {
    this.ScZipCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getScZipCodeFetch () {
    return this.ScZipCodeFetch;
  }
  /** Set the SortOrder for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScZipCodeSortOrder (Integer value) {
    this.ScZipCodeSort = value;
  }
  /** Retrieve SortOrder for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScZipCodeSortOrder () {
    return this.ScZipCodeSort;
  }
  /** Set the sort direction for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScZipCodeSortDirection (boolean ascending) {
    this.ScZipCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScZipCodeSortDirection () {
    return this.ScZipCodeSortAscending;
  }
  /** Set the case insensitive for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScZipCodeCaseInsensitive (boolean ascending) {
    this.ScZipCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScZipCodeCaseInsensitive () {
    return this.ScZipCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScZipCodeFilter (StringFilter[] value) throws ServiceException {
    this.ScZipCode = value;
  }
  /** Retrieve filter for field: ScZipCode (SALES_CHANNEL_REF.sc_zip_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScZipCodeFilter () {
    return this.ScZipCode;
  }

  /**
   * Retrieves the ScZipCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScZipCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScZipCodeFilter field
   */
  public String[] getScZipCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScZipCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScZipCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScZipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScZipCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScZipCodeFilter filter value from a formatted string
   *
   * @param _value the ScZipCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScZipCodeFilter filter field
   */
  public void setScZipCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScZipCodeFilterFromFormattedString");
    try {
      this.setScZipCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScZipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScZipCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScZipCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setScCountryCodeFetch (boolean fetch) {
    this.ScCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getScCountryCodeFetch () {
    return this.ScCountryCodeFetch;
  }
  /** Set the SortOrder for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScCountryCodeSortOrder (Integer value) {
    this.ScCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScCountryCodeSortOrder () {
    return this.ScCountryCodeSort;
  }
  /** Set the sort direction for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScCountryCodeSortDirection (boolean ascending) {
    this.ScCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScCountryCodeSortDirection () {
    return this.ScCountryCodeSortAscending;
  }
  /** Set the field level filters for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ScCountryCode = value;
  }
  /** Retrieve filter for field: ScCountryCode (SALES_CHANNEL_REF.sc_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getScCountryCodeFilter () {
    return this.ScCountryCode;
  }

  /**
   * Retrieves the ScCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCountryCodeFilter field
   */
  public String[] getScCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScCountryCodeFilter filter value from a formatted string
   *
   * @param _value the ScCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScCountryCodeFilter filter field
   */
  public void setScCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScCountryCodeFilterFromFormattedString");
    try {
      this.setScCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCountryCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setScPhoneFetch (boolean fetch) {
    this.ScPhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getScPhoneFetch () {
    return this.ScPhoneFetch;
  }
  /** Set the SortOrder for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScPhoneSortOrder (Integer value) {
    this.ScPhoneSort = value;
  }
  /** Retrieve SortOrder for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScPhoneSortOrder () {
    return this.ScPhoneSort;
  }
  /** Set the sort direction for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScPhoneSortDirection (boolean ascending) {
    this.ScPhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScPhoneSortDirection () {
    return this.ScPhoneSortAscending;
  }
  /** Set the case insensitive for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScPhoneCaseInsensitive (boolean ascending) {
    this.ScPhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScPhoneCaseInsensitive () {
    return this.ScPhoneCaseInsensitive;
  }
  /** Set the field level filters for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScPhoneFilter (StringFilter[] value) throws ServiceException {
    this.ScPhone = value;
  }
  /** Retrieve filter for field: ScPhone (SALES_CHANNEL_REF.sc_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScPhoneFilter () {
    return this.ScPhone;
  }

  /**
   * Retrieves the ScPhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScPhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScPhoneFilter field
   */
  public String[] getScPhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScPhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScPhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScPhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScPhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScPhoneFilter filter value from a formatted string
   *
   * @param _value the ScPhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScPhoneFilter filter field
   */
  public void setScPhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScPhoneFilterFromFormattedString");
    try {
      this.setScPhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScPhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScPhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScPhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @param fetch whether to fetch this field or not
   */
  public void setParentSalesChannelIdFetch (boolean fetch) {
    this.ParentSalesChannelIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentSalesChannelIdFetch () {
    return this.ParentSalesChannelIdFetch;
  }
  /** Set the SortOrder for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentSalesChannelIdSortOrder (Integer value) {
    this.ParentSalesChannelIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentSalesChannelIdSortOrder () {
    return this.ParentSalesChannelIdSort;
  }
  /** Set the sort direction for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentSalesChannelIdSortDirection (boolean ascending) {
    this.ParentSalesChannelIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentSalesChannelIdSortDirection () {
    return this.ParentSalesChannelIdSortAscending;
  }
  /** Set the field level filters for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentSalesChannelIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentSalesChannelId = value;
  }
  /** Retrieve filter for field: ParentSalesChannelId (SALES_CHANNEL_REF.parent_sales_channel_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentSalesChannelIdFilter () {
    return this.ParentSalesChannelId;
  }

  /**
   * Retrieves the ParentSalesChannelIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentSalesChannelIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentSalesChannelIdFilter field
   */
  public String[] getParentSalesChannelIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentSalesChannelIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentSalesChannelIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentSalesChannelIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentSalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentSalesChannelIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentSalesChannelIdFilter filter value from a formatted string
   *
   * @param _value the ParentSalesChannelIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentSalesChannelIdFilter filter field
   */
  public void setParentSalesChannelIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentSalesChannelIdFilterFromFormattedString");
    try {
      this.setParentSalesChannelIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentSalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentSalesChannelIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentSalesChannelIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @param fetch whether to fetch this field or not
   */
  public void setCommissionIdFetch (boolean fetch) {
    this.CommissionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommissionIdFetch () {
    return this.CommissionIdFetch;
  }
  /** Set the SortOrder for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommissionIdSortOrder (Integer value) {
    this.CommissionIdSort = value;
  }
  /** Retrieve SortOrder for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommissionIdSortOrder () {
    return this.CommissionIdSort;
  }
  /** Set the sort direction for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommissionIdSortDirection (boolean ascending) {
    this.CommissionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommissionIdSortDirection () {
    return this.CommissionIdSortAscending;
  }
  /** Set the field level filters for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommissionIdFilter (IntegerFilter[] value) throws ServiceException {
    this.CommissionId = value;
  }
  /** Retrieve filter for field: CommissionId (SALES_CHANNEL_REF.commission_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommissionIdFilter () {
    return this.CommissionId;
  }

  /**
   * Retrieves the CommissionIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommissionIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommissionIdFilter field
   */
  public String[] getCommissionIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommissionIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommissionIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommissionIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommissionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommissionIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommissionIdFilter filter value from a formatted string
   *
   * @param _value the CommissionIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommissionIdFilter filter field
   */
  public void setCommissionIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommissionIdFilterFromFormattedString");
    try {
      this.setCommissionIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommissionIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommissionIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommissionIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @param fetch whether to fetch this field or not
   */
  public void setDealerPinFetch (boolean fetch) {
    this.DealerPinFetch = fetch;
  }
  /** Retrieve Fetch value for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return boolean the Fetch value for this field
   */
  public boolean getDealerPinFetch () {
    return this.DealerPinFetch;
  }
  /** Set the SortOrder for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDealerPinSortOrder (Integer value) {
    this.DealerPinSort = value;
  }
  /** Retrieve SortOrder for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDealerPinSortOrder () {
    return this.DealerPinSort;
  }
  /** Set the sort direction for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDealerPinSortDirection (boolean ascending) {
    this.DealerPinSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDealerPinSortDirection () {
    return this.DealerPinSortAscending;
  }
  /** Set the case insensitive for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDealerPinCaseInsensitive (boolean ascending) {
    this.DealerPinCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDealerPinCaseInsensitive () {
    return this.DealerPinCaseInsensitive;
  }
  /** Set the field level filters for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDealerPinFilter (StringFilter[] value) throws ServiceException {
    this.DealerPin = value;
  }
  /** Retrieve filter for field: DealerPin (SALES_CHANNEL_REF.dealer_pin)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDealerPinFilter () {
    return this.DealerPin;
  }

  /**
   * Retrieves the DealerPinFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DealerPinFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DealerPinFilter field
   */
  public String[] getDealerPinFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDealerPinFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDealerPinFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDealerPinFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DealerPinFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDealerPinFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DealerPinFilter filter value from a formatted string
   *
   * @param _value the DealerPinFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DealerPinFilter filter field
   */
  public void setDealerPinFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDealerPinFilterFromFormattedString");
    try {
      this.setDealerPinFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DealerPinFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDealerPinFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDealerPinFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @param fetch whether to fetch this field or not
   */
  public void setSecurityWordFetch (boolean fetch) {
    this.SecurityWordFetch = fetch;
  }
  /** Retrieve Fetch value for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return boolean the Fetch value for this field
   */
  public boolean getSecurityWordFetch () {
    return this.SecurityWordFetch;
  }
  /** Set the SortOrder for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSecurityWordSortOrder (Integer value) {
    this.SecurityWordSort = value;
  }
  /** Retrieve SortOrder for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSecurityWordSortOrder () {
    return this.SecurityWordSort;
  }
  /** Set the sort direction for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSecurityWordSortDirection (boolean ascending) {
    this.SecurityWordSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSecurityWordSortDirection () {
    return this.SecurityWordSortAscending;
  }
  /** Set the case insensitive for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSecurityWordCaseInsensitive (boolean ascending) {
    this.SecurityWordCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSecurityWordCaseInsensitive () {
    return this.SecurityWordCaseInsensitive;
  }
  /** Set the field level filters for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSecurityWordFilter (StringFilter[] value) throws ServiceException {
    this.SecurityWord = value;
  }
  /** Retrieve filter for field: SecurityWord (SALES_CHANNEL_REF.security_word)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSecurityWordFilter () {
    return this.SecurityWord;
  }

  /**
   * Retrieves the SecurityWordFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecurityWordFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecurityWordFilter field
   */
  public String[] getSecurityWordFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecurityWordFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecurityWordFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecurityWordFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecurityWordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecurityWordFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SecurityWordFilter filter value from a formatted string
   *
   * @param _value the SecurityWordFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecurityWordFilter filter field
   */
  public void setSecurityWordFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecurityWordFilterFromFormattedString");
    try {
      this.setSecurityWordFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecurityWordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecurityWordFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecurityWordFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Status (SALES_CHANNEL_REF.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (SALES_CHANNEL_REF.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (SALES_CHANNEL_REF.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (SALES_CHANNEL_REF.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (SALES_CHANNEL_REF.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (SALES_CHANNEL_REF.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (SALES_CHANNEL_REF.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (SALES_CHANNEL_REF.status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setDateActiveFetch (boolean fetch) {
    this.DateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateActiveFetch () {
    return this.DateActiveFetch;
  }
  /** Set the SortOrder for field: DateActive (SALES_CHANNEL_REF.date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateActiveSortOrder (Integer value) {
    this.DateActiveSort = value;
  }
  /** Retrieve SortOrder for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateActiveSortOrder () {
    return this.DateActiveSort;
  }
  /** Set the sort direction for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateActiveSortDirection (boolean ascending) {
    this.DateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateActiveSortDirection () {
    return this.DateActiveSortAscending;
  }
  /** Set the field level filters for field: DateActive (SALES_CHANNEL_REF.date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.DateActive = value;
  }
  /** Retrieve filter for field: DateActive (SALES_CHANNEL_REF.date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateActiveFilter () {
    return this.DateActive;
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateActiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateActiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateActiveFilter field
   */
  public String[] getDateActiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateActiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateActiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateActiveFilter filter value from a formatted string
   *
   * @param _value the DateActiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateActiveFilter filter field
   */
  public void setDateActiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
    try {
      this.setDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateActiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @param fetch whether to fetch this field or not
   */
  public void setDateInactiveFetch (boolean fetch) {
    this.DateInactiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return boolean the Fetch value for this field
   */
  public boolean getDateInactiveFetch () {
    return this.DateInactiveFetch;
  }
  /** Set the SortOrder for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDateInactiveSortOrder (Integer value) {
    this.DateInactiveSort = value;
  }
  /** Retrieve SortOrder for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDateInactiveSortOrder () {
    return this.DateInactiveSort;
  }
  /** Set the sort direction for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDateInactiveSortDirection (boolean ascending) {
    this.DateInactiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDateInactiveSortDirection () {
    return this.DateInactiveSortAscending;
  }
  /** Set the field level filters for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDateInactiveFilter (DateFilter[] value) throws ServiceException {
    this.DateInactive = value;
  }
  /** Retrieve filter for field: DateInactive (SALES_CHANNEL_REF.date_inactive)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDateInactiveFilter () {
    return this.DateInactive;
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedString");
  }

  /**
   * Retrieves the DateInactiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DateInactiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DateInactiveFilter field
   */
  public String[] getDateInactiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDateInactiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDateInactiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DateInactiveFilter filter value from a formatted string
   *
   * @param _value the DateInactiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DateInactiveFilter filter field
   */
  public void setDateInactiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
    try {
      this.setDateInactiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DateInactiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDateInactiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setNumThresholdFetch (boolean fetch) {
    this.NumThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getNumThresholdFetch () {
    return this.NumThresholdFetch;
  }
  /** Set the SortOrder for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNumThresholdSortOrder (Integer value) {
    this.NumThresholdSort = value;
  }
  /** Retrieve SortOrder for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNumThresholdSortOrder () {
    return this.NumThresholdSort;
  }
  /** Set the sort direction for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNumThresholdSortDirection (boolean ascending) {
    this.NumThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNumThresholdSortDirection () {
    return this.NumThresholdSortAscending;
  }
  /** Set the field level filters for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNumThresholdFilter (IntegerFilter[] value) throws ServiceException {
    this.NumThreshold = value;
  }
  /** Retrieve filter for field: NumThreshold (SALES_CHANNEL_REF.num_threshold)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNumThresholdFilter () {
    return this.NumThreshold;
  }

  /**
   * Retrieves the NumThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NumThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumThresholdFilter field
   */
  public String[] getNumThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNumThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NumThresholdFilter filter value from a formatted string
   *
   * @param _value the NumThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NumThresholdFilter filter field
   */
  public void setNumThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNumThresholdFilterFromFormattedString");
    try {
      this.setNumThresholdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NumThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumThresholdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (SALES_CHANNEL_REF.is_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDefaultFilter () {
    return this.IsDefault;
  }

  /**
   * Retrieves the IsDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDefaultFilter field
   */
  public String[] getIsDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDefaultFilter filter value from a formatted string
   *
   * @param _value the IsDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDefaultFilter filter field
   */
  public void setIsDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDefaultFilterFromFormattedString");
    try {
      this.setIsDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (SALES_CHANNEL_REF.is_internal)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsInternalFilter () {
    return this.IsInternal;
  }

  /**
   * Retrieves the IsInternalFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsInternalFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsInternalFilter field
   */
  public String[] getIsInternalFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsInternalFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsInternalFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsInternalFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsInternalFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsInternalFilter filter value from a formatted string
   *
   * @param _value the IsInternalFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsInternalFilter filter field
   */
  public void setIsInternalFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsInternalFilterFromFormattedString");
    try {
      this.setIsInternalFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsInternalFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsInternalFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsInternalFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (SALES_CHANNEL_REF.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (SALES_CHANNEL_VALUES.short_display)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDisplayFilter () {
    return this.ShortDisplay;
  }

  /**
   * Retrieves the ShortDisplayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDisplayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDisplayFilter field
   */
  public String[] getShortDisplayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDisplayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDisplayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDisplayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDisplayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDisplayFilter filter value from a formatted string
   *
   * @param _value the ShortDisplayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDisplayFilter filter field
   */
  public void setShortDisplayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDisplayFilterFromFormattedString");
    try {
      this.setShortDisplayFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDisplayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDisplayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDisplayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (SALES_CHANNEL_VALUES.display_value)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayValueFilter () {
    return this.DisplayValue;
  }

  /**
   * Retrieves the DisplayValueFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayValueFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayValueFilter field
   */
  public String[] getDisplayValueFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayValueFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayValueFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayValueFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayValueFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayValueFilter filter value from a formatted string
   *
   * @param _value the DisplayValueFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayValueFilter filter field
   */
  public void setDisplayValueFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayValueFilterFromFormattedString");
    try {
      this.setDisplayValueFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayValueFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayValueFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayValueFilterFromFormattedString");
  }

  public String toString() {
    return SalesChannelObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return SalesChannelObjectHelper.toMap(this, null);
  }
}
