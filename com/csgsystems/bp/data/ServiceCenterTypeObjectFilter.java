/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectFilter.java
 * Definition File: Admin/ServiceCenterType.xml
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
public class ServiceCenterTypeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ServiceCenterTypeObjectKeyFilter Key = null;
  /** raw field for: SERVICE_CENTERS.sc_name) */
  public    StringFilter[] ScName  = null;
  protected boolean ScNameFetch = false;
  protected boolean ScNameSortAscending = true;
  protected boolean ScNameCaseInsensitive = false;
  protected Integer ScNameSort = null;
  /** raw field for: SERVICE_CENTERS.sc_contact_fname) */
  public    StringFilter[] ScContactFname  = null;
  protected boolean ScContactFnameFetch = false;
  protected boolean ScContactFnameSortAscending = true;
  protected boolean ScContactFnameCaseInsensitive = false;
  protected Integer ScContactFnameSort = null;
  /** raw field for: SERVICE_CENTERS.sc_contact_minit) */
  public    StringFilter[] ScContactMinit  = null;
  protected boolean ScContactMinitFetch = false;
  protected boolean ScContactMinitSortAscending = true;
  protected boolean ScContactMinitCaseInsensitive = false;
  protected Integer ScContactMinitSort = null;
  /** raw field for: SERVICE_CENTERS.sc_contact_lname) */
  public    StringFilter[] ScContactLname  = null;
  protected boolean ScContactLnameFetch = false;
  protected boolean ScContactLnameSortAscending = true;
  protected boolean ScContactLnameCaseInsensitive = false;
  protected Integer ScContactLnameSort = null;
  /** raw field for: SERVICE_CENTERS.sc_address1) */
  public    StringFilter[] ScAddress1  = null;
  protected boolean ScAddress1Fetch = false;
  protected boolean ScAddress1SortAscending = true;
  protected boolean ScAddress1CaseInsensitive = false;
  protected Integer ScAddress1Sort = null;
  /** raw field for: SERVICE_CENTERS.sc_address2) */
  public    StringFilter[] ScAddress2  = null;
  protected boolean ScAddress2Fetch = false;
  protected boolean ScAddress2SortAscending = true;
  protected boolean ScAddress2CaseInsensitive = false;
  protected Integer ScAddress2Sort = null;
  /** raw field for: SERVICE_CENTERS.sc_address3) */
  public    StringFilter[] ScAddress3  = null;
  protected boolean ScAddress3Fetch = false;
  protected boolean ScAddress3SortAscending = true;
  protected boolean ScAddress3CaseInsensitive = false;
  protected Integer ScAddress3Sort = null;
  /** raw field for: SERVICE_CENTERS.sc_city) */
  public    StringFilter[] ScCity  = null;
  protected boolean ScCityFetch = false;
  protected boolean ScCitySortAscending = true;
  protected boolean ScCityCaseInsensitive = false;
  protected Integer ScCitySort = null;
  /** raw field for: SERVICE_CENTERS.sc_state) */
  public    StringFilter[] ScState  = null;
  protected boolean ScStateFetch = false;
  protected boolean ScStateSortAscending = true;
  protected boolean ScStateCaseInsensitive = false;
  protected Integer ScStateSort = null;
  /** raw field for: SERVICE_CENTERS.sc_zip) */
  public    StringFilter[] ScZip  = null;
  protected boolean ScZipFetch = false;
  protected boolean ScZipSortAscending = true;
  protected boolean ScZipCaseInsensitive = false;
  protected Integer ScZipSort = null;
  /** raw field for: SERVICE_CENTERS.sc_country_code) */
  public    IntegerFilter[] ScCountryCode  = null;
  protected boolean ScCountryCodeFetch = false;
  protected boolean ScCountryCodeSortAscending = true;
  protected Integer ScCountryCodeSort = null;
  /** raw field for: SERVICE_CENTERS.sc_county) */
  public    StringFilter[] ScCounty  = null;
  protected boolean ScCountyFetch = false;
  protected boolean ScCountySortAscending = true;
  protected boolean ScCountyCaseInsensitive = false;
  protected Integer ScCountySort = null;
  /** raw field for: SERVICE_CENTERS.sc_phone) */
  public    StringFilter[] ScPhone  = null;
  protected boolean ScPhoneFetch = false;
  protected boolean ScPhoneSortAscending = true;
  protected boolean ScPhoneCaseInsensitive = false;
  protected Integer ScPhoneSort = null;
  /** raw field for: SERVICE_CENTERS.tele_msg) */
  public    StringFilter[] TeleMsg  = null;
  protected boolean TeleMsgFetch = false;
  protected boolean TeleMsgSortAscending = true;
  protected boolean TeleMsgCaseInsensitive = false;
  protected Integer TeleMsgSort = null;
  /** raw field for: SERVICE_CENTERS.fax_msg) */
  public    StringFilter[] FaxMsg  = null;
  protected boolean FaxMsgFetch = false;
  protected boolean FaxMsgSortAscending = true;
  protected boolean FaxMsgCaseInsensitive = false;
  protected Integer FaxMsgSort = null;
  /** raw field for: SERVICE_CENTERS.email_msg) */
  public    StringFilter[] EmailMsg  = null;
  protected boolean EmailMsgFetch = false;
  protected boolean EmailMsgSortAscending = true;
  protected boolean EmailMsgCaseInsensitive = false;
  protected Integer EmailMsgSort = null;
  /** raw field for: SERVICE_CENTERS.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: SERVICE_CENTERS.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: SERVICE_CENTERS.printer_device_id) */
  public    StringFilter[] PrinterDeviceId  = null;
  protected boolean PrinterDeviceIdFetch = false;
  protected boolean PrinterDeviceIdSortAscending = true;
  protected boolean PrinterDeviceIdCaseInsensitive = false;
  protected Integer PrinterDeviceIdSort = null;
  /** raw field for: SERVICE_CENTER_TYPE_REF.is_default) */
  public    BooleanFilter[] IsDefault  = null;
  protected boolean IsDefaultFetch = false;
  protected boolean IsDefaultSortAscending = true;
  protected Integer IsDefaultSort = null;
  /** raw field for: SERVICE_CENTER_TYPE_REF.is_internal) */
  public    BooleanFilter[] IsInternal  = null;
  protected boolean IsInternalFetch = false;
  protected boolean IsInternalSortAscending = true;
  protected Integer IsInternalSort = null;
  /** raw field for: SERVICE_CENTER_TYPE_REF.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: SERVICE_CENTER_TYPE_VALUES.short_display) */
  public    StringFilter[] ShortDisplay  = null;
  protected boolean ShortDisplayFetch = false;
  protected boolean ShortDisplaySortAscending = true;
  protected boolean ShortDisplayCaseInsensitive = false;
  protected Integer ShortDisplaySort = null;
  /** raw field for: SERVICE_CENTER_TYPE_VALUES.display_value) */
  public    StringFilter[] DisplayValue  = null;
  protected boolean DisplayValueFetch = false;
  protected boolean DisplayValueSortAscending = true;
  protected boolean DisplayValueCaseInsensitive = false;
  protected Integer DisplayValueSort = null;
  private String _objName = "ServiceCenterTypeObjectFilter";
  /** default constructor */
  public ServiceCenterTypeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ServiceCenterTypeObjectFilter (ServiceCenterTypeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ServiceCenterTypeObjectKeyFilter (other.Key);
    this.ScName = other.ScName;
    this.ScNameFetch = other.ScNameFetch;
    this.ScNameSort = other.ScNameSort;
    this.ScNameCaseInsensitive = other.ScNameCaseInsensitive;
    this.ScNameSortAscending = other.ScNameSortAscending;
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
    this.ScZip = other.ScZip;
    this.ScZipFetch = other.ScZipFetch;
    this.ScZipSort = other.ScZipSort;
    this.ScZipCaseInsensitive = other.ScZipCaseInsensitive;
    this.ScZipSortAscending = other.ScZipSortAscending;
    this.ScCountryCode = other.ScCountryCode;
    this.ScCountryCodeFetch = other.ScCountryCodeFetch;
    this.ScCountryCodeSort = other.ScCountryCodeSort;
    this.ScCountryCodeSortAscending = other.ScCountryCodeSortAscending;
    this.ScCounty = other.ScCounty;
    this.ScCountyFetch = other.ScCountyFetch;
    this.ScCountySort = other.ScCountySort;
    this.ScCountyCaseInsensitive = other.ScCountyCaseInsensitive;
    this.ScCountySortAscending = other.ScCountySortAscending;
    this.ScPhone = other.ScPhone;
    this.ScPhoneFetch = other.ScPhoneFetch;
    this.ScPhoneSort = other.ScPhoneSort;
    this.ScPhoneCaseInsensitive = other.ScPhoneCaseInsensitive;
    this.ScPhoneSortAscending = other.ScPhoneSortAscending;
    this.TeleMsg = other.TeleMsg;
    this.TeleMsgFetch = other.TeleMsgFetch;
    this.TeleMsgSort = other.TeleMsgSort;
    this.TeleMsgCaseInsensitive = other.TeleMsgCaseInsensitive;
    this.TeleMsgSortAscending = other.TeleMsgSortAscending;
    this.FaxMsg = other.FaxMsg;
    this.FaxMsgFetch = other.FaxMsgFetch;
    this.FaxMsgSort = other.FaxMsgSort;
    this.FaxMsgCaseInsensitive = other.FaxMsgCaseInsensitive;
    this.FaxMsgSortAscending = other.FaxMsgSortAscending;
    this.EmailMsg = other.EmailMsg;
    this.EmailMsgFetch = other.EmailMsgFetch;
    this.EmailMsgSort = other.EmailMsgSort;
    this.EmailMsgCaseInsensitive = other.EmailMsgCaseInsensitive;
    this.EmailMsgSortAscending = other.EmailMsgSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.PrinterDeviceId = other.PrinterDeviceId;
    this.PrinterDeviceIdFetch = other.PrinterDeviceIdFetch;
    this.PrinterDeviceIdSort = other.PrinterDeviceIdSort;
    this.PrinterDeviceIdCaseInsensitive = other.PrinterDeviceIdCaseInsensitive;
    this.PrinterDeviceIdSortAscending = other.PrinterDeviceIdSortAscending;
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
   * @return ServiceCenterTypeObjectKeyFilter
   */
  public ServiceCenterTypeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ServiceCenterTypeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterIdFetch;
  }
  /** Set the SortOrder for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterIdSort;
  }
  /** Set the sort direction for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterIdSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterId = value;
  }
  /** Retrieve filter for field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterId;
  }
  /** Set the field level Fetch value for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterTypeFetch;
  }
  /** Set the SortOrder for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterTypeSort;
  }
  /** Set the sort direction for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.ServiceCenterType = value;
  }
  /** Retrieve filter for field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterType;
  }
  /** Set the field level Fetch value for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ServiceCenterTypeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: ScName (SERVICE_CENTERS.sc_name)
   * @param fetch whether to fetch this field or not
   */
  public void setScNameFetch (boolean fetch) {
    this.ScNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScName (SERVICE_CENTERS.sc_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getScNameFetch () {
    return this.ScNameFetch;
  }
  /** Set the SortOrder for field: ScName (SERVICE_CENTERS.sc_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScNameSortOrder (Integer value) {
    this.ScNameSort = value;
  }
  /** Retrieve SortOrder for field: ScName (SERVICE_CENTERS.sc_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScNameSortOrder () {
    return this.ScNameSort;
  }
  /** Set the sort direction for field: ScName (SERVICE_CENTERS.sc_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScNameSortDirection (boolean ascending) {
    this.ScNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScName (SERVICE_CENTERS.sc_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScNameSortDirection () {
    return this.ScNameSortAscending;
  }
  /** Set the case insensitive for field: ScName (SERVICE_CENTERS.sc_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScNameCaseInsensitive (boolean ascending) {
    this.ScNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScName (SERVICE_CENTERS.sc_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScNameCaseInsensitive () {
    return this.ScNameCaseInsensitive;
  }
  /** Set the field level filters for field: ScName (SERVICE_CENTERS.sc_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScNameFilter (StringFilter[] value) throws ServiceException {
    this.ScName = value;
  }
  /** Retrieve filter for field: ScName (SERVICE_CENTERS.sc_name)
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

  /** Set the field level Fetch value for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactFnameFetch (boolean fetch) {
    this.ScContactFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactFnameFetch () {
    return this.ScContactFnameFetch;
  }
  /** Set the SortOrder for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactFnameSortOrder (Integer value) {
    this.ScContactFnameSort = value;
  }
  /** Retrieve SortOrder for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactFnameSortOrder () {
    return this.ScContactFnameSort;
  }
  /** Set the sort direction for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactFnameSortDirection (boolean ascending) {
    this.ScContactFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactFnameSortDirection () {
    return this.ScContactFnameSortAscending;
  }
  /** Set the case insensitive for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactFnameCaseInsensitive (boolean ascending) {
    this.ScContactFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactFnameCaseInsensitive () {
    return this.ScContactFnameCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactFnameFilter (StringFilter[] value) throws ServiceException {
    this.ScContactFname = value;
  }
  /** Retrieve filter for field: ScContactFname (SERVICE_CENTERS.sc_contact_fname)
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

  /** Set the field level Fetch value for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactMinitFetch (boolean fetch) {
    this.ScContactMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactMinitFetch () {
    return this.ScContactMinitFetch;
  }
  /** Set the SortOrder for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactMinitSortOrder (Integer value) {
    this.ScContactMinitSort = value;
  }
  /** Retrieve SortOrder for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactMinitSortOrder () {
    return this.ScContactMinitSort;
  }
  /** Set the sort direction for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactMinitSortDirection (boolean ascending) {
    this.ScContactMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactMinitSortDirection () {
    return this.ScContactMinitSortAscending;
  }
  /** Set the case insensitive for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactMinitCaseInsensitive (boolean ascending) {
    this.ScContactMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactMinitCaseInsensitive () {
    return this.ScContactMinitCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactMinitFilter (StringFilter[] value) throws ServiceException {
    this.ScContactMinit = value;
  }
  /** Retrieve filter for field: ScContactMinit (SERVICE_CENTERS.sc_contact_minit)
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

  /** Set the field level Fetch value for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setScContactLnameFetch (boolean fetch) {
    this.ScContactLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getScContactLnameFetch () {
    return this.ScContactLnameFetch;
  }
  /** Set the SortOrder for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScContactLnameSortOrder (Integer value) {
    this.ScContactLnameSort = value;
  }
  /** Retrieve SortOrder for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScContactLnameSortOrder () {
    return this.ScContactLnameSort;
  }
  /** Set the sort direction for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScContactLnameSortDirection (boolean ascending) {
    this.ScContactLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScContactLnameSortDirection () {
    return this.ScContactLnameSortAscending;
  }
  /** Set the case insensitive for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScContactLnameCaseInsensitive (boolean ascending) {
    this.ScContactLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScContactLnameCaseInsensitive () {
    return this.ScContactLnameCaseInsensitive;
  }
  /** Set the field level filters for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScContactLnameFilter (StringFilter[] value) throws ServiceException {
    this.ScContactLname = value;
  }
  /** Retrieve filter for field: ScContactLname (SERVICE_CENTERS.sc_contact_lname)
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

  /** Set the field level Fetch value for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress1Fetch (boolean fetch) {
    this.ScAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress1Fetch () {
    return this.ScAddress1Fetch;
  }
  /** Set the SortOrder for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress1SortOrder (Integer value) {
    this.ScAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress1SortOrder () {
    return this.ScAddress1Sort;
  }
  /** Set the sort direction for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress1SortDirection (boolean ascending) {
    this.ScAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress1SortDirection () {
    return this.ScAddress1SortAscending;
  }
  /** Set the case insensitive for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress1CaseInsensitive (boolean ascending) {
    this.ScAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress1CaseInsensitive () {
    return this.ScAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress1Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress1 = value;
  }
  /** Retrieve filter for field: ScAddress1 (SERVICE_CENTERS.sc_address1)
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

  /** Set the field level Fetch value for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress2Fetch (boolean fetch) {
    this.ScAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress2Fetch () {
    return this.ScAddress2Fetch;
  }
  /** Set the SortOrder for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress2SortOrder (Integer value) {
    this.ScAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress2SortOrder () {
    return this.ScAddress2Sort;
  }
  /** Set the sort direction for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress2SortDirection (boolean ascending) {
    this.ScAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress2SortDirection () {
    return this.ScAddress2SortAscending;
  }
  /** Set the case insensitive for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress2CaseInsensitive (boolean ascending) {
    this.ScAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress2CaseInsensitive () {
    return this.ScAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress2Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress2 = value;
  }
  /** Retrieve filter for field: ScAddress2 (SERVICE_CENTERS.sc_address2)
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

  /** Set the field level Fetch value for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setScAddress3Fetch (boolean fetch) {
    this.ScAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getScAddress3Fetch () {
    return this.ScAddress3Fetch;
  }
  /** Set the SortOrder for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScAddress3SortOrder (Integer value) {
    this.ScAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScAddress3SortOrder () {
    return this.ScAddress3Sort;
  }
  /** Set the sort direction for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScAddress3SortDirection (boolean ascending) {
    this.ScAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScAddress3SortDirection () {
    return this.ScAddress3SortAscending;
  }
  /** Set the case insensitive for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScAddress3CaseInsensitive (boolean ascending) {
    this.ScAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScAddress3CaseInsensitive () {
    return this.ScAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScAddress3Filter (StringFilter[] value) throws ServiceException {
    this.ScAddress3 = value;
  }
  /** Retrieve filter for field: ScAddress3 (SERVICE_CENTERS.sc_address3)
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

  /** Set the field level Fetch value for field: ScCity (SERVICE_CENTERS.sc_city)
   * @param fetch whether to fetch this field or not
   */
  public void setScCityFetch (boolean fetch) {
    this.ScCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScCity (SERVICE_CENTERS.sc_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getScCityFetch () {
    return this.ScCityFetch;
  }
  /** Set the SortOrder for field: ScCity (SERVICE_CENTERS.sc_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScCitySortOrder (Integer value) {
    this.ScCitySort = value;
  }
  /** Retrieve SortOrder for field: ScCity (SERVICE_CENTERS.sc_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScCitySortOrder () {
    return this.ScCitySort;
  }
  /** Set the sort direction for field: ScCity (SERVICE_CENTERS.sc_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScCitySortDirection (boolean ascending) {
    this.ScCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScCity (SERVICE_CENTERS.sc_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScCitySortDirection () {
    return this.ScCitySortAscending;
  }
  /** Set the case insensitive for field: ScCity (SERVICE_CENTERS.sc_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScCityCaseInsensitive (boolean ascending) {
    this.ScCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScCity (SERVICE_CENTERS.sc_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScCityCaseInsensitive () {
    return this.ScCityCaseInsensitive;
  }
  /** Set the field level filters for field: ScCity (SERVICE_CENTERS.sc_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScCityFilter (StringFilter[] value) throws ServiceException {
    this.ScCity = value;
  }
  /** Retrieve filter for field: ScCity (SERVICE_CENTERS.sc_city)
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

  /** Set the field level Fetch value for field: ScState (SERVICE_CENTERS.sc_state)
   * @param fetch whether to fetch this field or not
   */
  public void setScStateFetch (boolean fetch) {
    this.ScStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScState (SERVICE_CENTERS.sc_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getScStateFetch () {
    return this.ScStateFetch;
  }
  /** Set the SortOrder for field: ScState (SERVICE_CENTERS.sc_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScStateSortOrder (Integer value) {
    this.ScStateSort = value;
  }
  /** Retrieve SortOrder for field: ScState (SERVICE_CENTERS.sc_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScStateSortOrder () {
    return this.ScStateSort;
  }
  /** Set the sort direction for field: ScState (SERVICE_CENTERS.sc_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScStateSortDirection (boolean ascending) {
    this.ScStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScState (SERVICE_CENTERS.sc_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScStateSortDirection () {
    return this.ScStateSortAscending;
  }
  /** Set the case insensitive for field: ScState (SERVICE_CENTERS.sc_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScStateCaseInsensitive (boolean ascending) {
    this.ScStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScState (SERVICE_CENTERS.sc_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScStateCaseInsensitive () {
    return this.ScStateCaseInsensitive;
  }
  /** Set the field level filters for field: ScState (SERVICE_CENTERS.sc_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScStateFilter (StringFilter[] value) throws ServiceException {
    this.ScState = value;
  }
  /** Retrieve filter for field: ScState (SERVICE_CENTERS.sc_state)
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

  /** Set the field level Fetch value for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setScZipFetch (boolean fetch) {
    this.ScZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getScZipFetch () {
    return this.ScZipFetch;
  }
  /** Set the SortOrder for field: ScZip (SERVICE_CENTERS.sc_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScZipSortOrder (Integer value) {
    this.ScZipSort = value;
  }
  /** Retrieve SortOrder for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScZipSortOrder () {
    return this.ScZipSort;
  }
  /** Set the sort direction for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScZipSortDirection (boolean ascending) {
    this.ScZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScZipSortDirection () {
    return this.ScZipSortAscending;
  }
  /** Set the case insensitive for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScZipCaseInsensitive (boolean ascending) {
    this.ScZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScZipCaseInsensitive () {
    return this.ScZipCaseInsensitive;
  }
  /** Set the field level filters for field: ScZip (SERVICE_CENTERS.sc_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScZipFilter (StringFilter[] value) throws ServiceException {
    this.ScZip = value;
  }
  /** Retrieve filter for field: ScZip (SERVICE_CENTERS.sc_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScZipFilter () {
    return this.ScZip;
  }

  /**
   * Retrieves the ScZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScZipFilter field
   */
  public String[] getScZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScZipFilter filter value from a formatted string
   *
   * @param _value the ScZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScZipFilter filter field
   */
  public void setScZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScZipFilterFromFormattedString");
    try {
      this.setScZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setScCountryCodeFetch (boolean fetch) {
    this.ScCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getScCountryCodeFetch () {
    return this.ScCountryCodeFetch;
  }
  /** Set the SortOrder for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScCountryCodeSortOrder (Integer value) {
    this.ScCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScCountryCodeSortOrder () {
    return this.ScCountryCodeSort;
  }
  /** Set the sort direction for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScCountryCodeSortDirection (boolean ascending) {
    this.ScCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScCountryCodeSortDirection () {
    return this.ScCountryCodeSortAscending;
  }
  /** Set the field level filters for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ScCountryCode = value;
  }
  /** Retrieve filter for field: ScCountryCode (SERVICE_CENTERS.sc_country_code)
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

  /** Set the field level Fetch value for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @param fetch whether to fetch this field or not
   */
  public void setScCountyFetch (boolean fetch) {
    this.ScCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getScCountyFetch () {
    return this.ScCountyFetch;
  }
  /** Set the SortOrder for field: ScCounty (SERVICE_CENTERS.sc_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScCountySortOrder (Integer value) {
    this.ScCountySort = value;
  }
  /** Retrieve SortOrder for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScCountySortOrder () {
    return this.ScCountySort;
  }
  /** Set the sort direction for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScCountySortDirection (boolean ascending) {
    this.ScCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScCountySortDirection () {
    return this.ScCountySortAscending;
  }
  /** Set the case insensitive for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScCountyCaseInsensitive (boolean ascending) {
    this.ScCountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScCountyCaseInsensitive () {
    return this.ScCountyCaseInsensitive;
  }
  /** Set the field level filters for field: ScCounty (SERVICE_CENTERS.sc_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScCountyFilter (StringFilter[] value) throws ServiceException {
    this.ScCounty = value;
  }
  /** Retrieve filter for field: ScCounty (SERVICE_CENTERS.sc_county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getScCountyFilter () {
    return this.ScCounty;
  }

  /**
   * Retrieves the ScCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ScCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ScCountyFilter field
   */
  public String[] getScCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getScCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getScCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getScCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getScCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ScCountyFilter filter value from a formatted string
   *
   * @param _value the ScCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ScCountyFilter filter field
   */
  public void setScCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setScCountyFilterFromFormattedString");
    try {
      this.setScCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ScCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setScCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setScCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setScPhoneFetch (boolean fetch) {
    this.ScPhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getScPhoneFetch () {
    return this.ScPhoneFetch;
  }
  /** Set the SortOrder for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setScPhoneSortOrder (Integer value) {
    this.ScPhoneSort = value;
  }
  /** Retrieve SortOrder for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getScPhoneSortOrder () {
    return this.ScPhoneSort;
  }
  /** Set the sort direction for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setScPhoneSortDirection (boolean ascending) {
    this.ScPhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getScPhoneSortDirection () {
    return this.ScPhoneSortAscending;
  }
  /** Set the case insensitive for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setScPhoneCaseInsensitive (boolean ascending) {
    this.ScPhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getScPhoneCaseInsensitive () {
    return this.ScPhoneCaseInsensitive;
  }
  /** Set the field level filters for field: ScPhone (SERVICE_CENTERS.sc_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setScPhoneFilter (StringFilter[] value) throws ServiceException {
    this.ScPhone = value;
  }
  /** Retrieve filter for field: ScPhone (SERVICE_CENTERS.sc_phone)
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

  /** Set the field level Fetch value for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @param fetch whether to fetch this field or not
   */
  public void setTeleMsgFetch (boolean fetch) {
    this.TeleMsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return boolean the Fetch value for this field
   */
  public boolean getTeleMsgFetch () {
    return this.TeleMsgFetch;
  }
  /** Set the SortOrder for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTeleMsgSortOrder (Integer value) {
    this.TeleMsgSort = value;
  }
  /** Retrieve SortOrder for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTeleMsgSortOrder () {
    return this.TeleMsgSort;
  }
  /** Set the sort direction for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTeleMsgSortDirection (boolean ascending) {
    this.TeleMsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTeleMsgSortDirection () {
    return this.TeleMsgSortAscending;
  }
  /** Set the case insensitive for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTeleMsgCaseInsensitive (boolean ascending) {
    this.TeleMsgCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTeleMsgCaseInsensitive () {
    return this.TeleMsgCaseInsensitive;
  }
  /** Set the field level filters for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTeleMsgFilter (StringFilter[] value) throws ServiceException {
    this.TeleMsg = value;
  }
  /** Retrieve filter for field: TeleMsg (SERVICE_CENTERS.tele_msg)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTeleMsgFilter () {
    return this.TeleMsg;
  }

  /**
   * Retrieves the TeleMsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TeleMsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TeleMsgFilter field
   */
  public String[] getTeleMsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTeleMsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTeleMsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTeleMsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TeleMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTeleMsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TeleMsgFilter filter value from a formatted string
   *
   * @param _value the TeleMsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TeleMsgFilter filter field
   */
  public void setTeleMsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTeleMsgFilterFromFormattedString");
    try {
      this.setTeleMsgFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TeleMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTeleMsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTeleMsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @param fetch whether to fetch this field or not
   */
  public void setFaxMsgFetch (boolean fetch) {
    this.FaxMsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return boolean the Fetch value for this field
   */
  public boolean getFaxMsgFetch () {
    return this.FaxMsgFetch;
  }
  /** Set the SortOrder for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFaxMsgSortOrder (Integer value) {
    this.FaxMsgSort = value;
  }
  /** Retrieve SortOrder for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFaxMsgSortOrder () {
    return this.FaxMsgSort;
  }
  /** Set the sort direction for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFaxMsgSortDirection (boolean ascending) {
    this.FaxMsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFaxMsgSortDirection () {
    return this.FaxMsgSortAscending;
  }
  /** Set the case insensitive for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setFaxMsgCaseInsensitive (boolean ascending) {
    this.FaxMsgCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getFaxMsgCaseInsensitive () {
    return this.FaxMsgCaseInsensitive;
  }
  /** Set the field level filters for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFaxMsgFilter (StringFilter[] value) throws ServiceException {
    this.FaxMsg = value;
  }
  /** Retrieve filter for field: FaxMsg (SERVICE_CENTERS.fax_msg)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getFaxMsgFilter () {
    return this.FaxMsg;
  }

  /**
   * Retrieves the FaxMsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FaxMsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FaxMsgFilter field
   */
  public String[] getFaxMsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFaxMsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFaxMsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFaxMsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FaxMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFaxMsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FaxMsgFilter filter value from a formatted string
   *
   * @param _value the FaxMsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FaxMsgFilter filter field
   */
  public void setFaxMsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFaxMsgFilterFromFormattedString");
    try {
      this.setFaxMsgFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FaxMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFaxMsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFaxMsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @param fetch whether to fetch this field or not
   */
  public void setEmailMsgFetch (boolean fetch) {
    this.EmailMsgFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmailMsgFetch () {
    return this.EmailMsgFetch;
  }
  /** Set the SortOrder for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmailMsgSortOrder (Integer value) {
    this.EmailMsgSort = value;
  }
  /** Retrieve SortOrder for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmailMsgSortOrder () {
    return this.EmailMsgSort;
  }
  /** Set the sort direction for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmailMsgSortDirection (boolean ascending) {
    this.EmailMsgSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmailMsgSortDirection () {
    return this.EmailMsgSortAscending;
  }
  /** Set the case insensitive for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setEmailMsgCaseInsensitive (boolean ascending) {
    this.EmailMsgCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getEmailMsgCaseInsensitive () {
    return this.EmailMsgCaseInsensitive;
  }
  /** Set the field level filters for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmailMsgFilter (StringFilter[] value) throws ServiceException {
    this.EmailMsg = value;
  }
  /** Retrieve filter for field: EmailMsg (SERVICE_CENTERS.email_msg)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getEmailMsgFilter () {
    return this.EmailMsg;
  }

  /**
   * Retrieves the EmailMsgFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmailMsgFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmailMsgFilter field
   */
  public String[] getEmailMsgFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmailMsgFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmailMsgFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmailMsgFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmailMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmailMsgFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmailMsgFilter filter value from a formatted string
   *
   * @param _value the EmailMsgFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmailMsgFilter filter field
   */
  public void setEmailMsgFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmailMsgFilterFromFormattedString");
    try {
      this.setEmailMsgFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmailMsgFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmailMsgFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmailMsgFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (SERVICE_CENTERS.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (SERVICE_CENTERS.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (SERVICE_CENTERS.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (SERVICE_CENTERS.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (SERVICE_CENTERS.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (SERVICE_CENTERS.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPrinterDeviceIdFetch (boolean fetch) {
    this.PrinterDeviceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrinterDeviceIdFetch () {
    return this.PrinterDeviceIdFetch;
  }
  /** Set the SortOrder for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrinterDeviceIdSortOrder (Integer value) {
    this.PrinterDeviceIdSort = value;
  }
  /** Retrieve SortOrder for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrinterDeviceIdSortOrder () {
    return this.PrinterDeviceIdSort;
  }
  /** Set the sort direction for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrinterDeviceIdSortDirection (boolean ascending) {
    this.PrinterDeviceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrinterDeviceIdSortDirection () {
    return this.PrinterDeviceIdSortAscending;
  }
  /** Set the case insensitive for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPrinterDeviceIdCaseInsensitive (boolean ascending) {
    this.PrinterDeviceIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPrinterDeviceIdCaseInsensitive () {
    return this.PrinterDeviceIdCaseInsensitive;
  }
  /** Set the field level filters for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrinterDeviceIdFilter (StringFilter[] value) throws ServiceException {
    this.PrinterDeviceId = value;
  }
  /** Retrieve filter for field: PrinterDeviceId (SERVICE_CENTERS.printer_device_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPrinterDeviceIdFilter () {
    return this.PrinterDeviceId;
  }

  /**
   * Retrieves the PrinterDeviceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrinterDeviceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrinterDeviceIdFilter field
   */
  public String[] getPrinterDeviceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrinterDeviceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrinterDeviceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrinterDeviceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrinterDeviceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrinterDeviceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrinterDeviceIdFilter filter value from a formatted string
   *
   * @param _value the PrinterDeviceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrinterDeviceIdFilter filter field
   */
  public void setPrinterDeviceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrinterDeviceIdFilterFromFormattedString");
    try {
      this.setPrinterDeviceIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrinterDeviceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrinterDeviceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrinterDeviceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDefaultFetch (boolean fetch) {
    this.IsDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDefaultFetch () {
    return this.IsDefaultFetch;
  }
  /** Set the SortOrder for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDefaultSortOrder (Integer value) {
    this.IsDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDefaultSortOrder () {
    return this.IsDefaultSort;
  }
  /** Set the sort direction for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDefaultSortDirection (boolean ascending) {
    this.IsDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDefaultSortDirection () {
    return this.IsDefaultSortAscending;
  }
  /** Set the field level filters for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDefault = value;
  }
  /** Retrieve filter for field: IsDefault (SERVICE_CENTER_TYPE_REF.is_default)
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

  /** Set the field level Fetch value for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @param fetch whether to fetch this field or not
   */
  public void setIsInternalFetch (boolean fetch) {
    this.IsInternalFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsInternalFetch () {
    return this.IsInternalFetch;
  }
  /** Set the SortOrder for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsInternalSortOrder (Integer value) {
    this.IsInternalSort = value;
  }
  /** Retrieve SortOrder for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsInternalSortOrder () {
    return this.IsInternalSort;
  }
  /** Set the sort direction for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsInternalSortDirection (boolean ascending) {
    this.IsInternalSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsInternalSortDirection () {
    return this.IsInternalSortAscending;
  }
  /** Set the field level filters for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsInternalFilter (BooleanFilter[] value) throws ServiceException {
    this.IsInternal = value;
  }
  /** Retrieve filter for field: IsInternal (SERVICE_CENTER_TYPE_REF.is_internal)
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

  /** Set the field level Fetch value for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (SERVICE_CENTER_TYPE_REF.config_tag_id)
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

  /** Set the field level Fetch value for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDisplayFetch (boolean fetch) {
    this.ShortDisplayFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDisplayFetch () {
    return this.ShortDisplayFetch;
  }
  /** Set the SortOrder for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDisplaySortOrder (Integer value) {
    this.ShortDisplaySort = value;
  }
  /** Retrieve SortOrder for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDisplaySortOrder () {
    return this.ShortDisplaySort;
  }
  /** Set the sort direction for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDisplaySortDirection (boolean ascending) {
    this.ShortDisplaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDisplaySortDirection () {
    return this.ShortDisplaySortAscending;
  }
  /** Set the case insensitive for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDisplayCaseInsensitive (boolean ascending) {
    this.ShortDisplayCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDisplayCaseInsensitive () {
    return this.ShortDisplayCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDisplayFilter (StringFilter[] value) throws ServiceException {
    this.ShortDisplay = value;
  }
  /** Retrieve filter for field: ShortDisplay (SERVICE_CENTER_TYPE_VALUES.short_display)
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

  /** Set the field level Fetch value for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayValueFetch (boolean fetch) {
    this.DisplayValueFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayValueFetch () {
    return this.DisplayValueFetch;
  }
  /** Set the SortOrder for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayValueSortOrder (Integer value) {
    this.DisplayValueSort = value;
  }
  /** Retrieve SortOrder for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayValueSortOrder () {
    return this.DisplayValueSort;
  }
  /** Set the sort direction for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayValueSortDirection (boolean ascending) {
    this.DisplayValueSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayValueSortDirection () {
    return this.DisplayValueSortAscending;
  }
  /** Set the case insensitive for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayValueCaseInsensitive (boolean ascending) {
    this.DisplayValueCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDisplayValueCaseInsensitive () {
    return this.DisplayValueCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayValueFilter (StringFilter[] value) throws ServiceException {
    this.DisplayValue = value;
  }
  /** Retrieve filter for field: DisplayValue (SERVICE_CENTER_TYPE_VALUES.display_value)
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
    return ServiceCenterTypeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ServiceCenterTypeObjectHelper.toMap(this, null);
  }
}
