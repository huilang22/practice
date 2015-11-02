/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefundObjectFilter.java
 * Definition File: Customer/Refund.xml
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
public class RefundObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public RefundObjectKeyFilter Key = null;
  /** raw field for: REFUND.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: REFUND.orig_submitter_name) */
  public    StringFilter[] OrigSubmitterName  = null;
  protected boolean OrigSubmitterNameFetch = false;
  protected boolean OrigSubmitterNameSortAscending = true;
  protected boolean OrigSubmitterNameCaseInsensitive = false;
  protected Integer OrigSubmitterNameSort = null;
  /** raw field for: REFUND.request_date) */
  public    DateFilter[] RequestDate  = null;
  protected boolean RequestDateFetch = false;
  protected boolean RequestDateSortAscending = true;
  protected Integer RequestDateSort = null;
  /** raw field for: REFUND.refund_reason_code) */
  public    IntegerFilter[] RefundReasonCode  = null;
  protected boolean RefundReasonCodeFetch = false;
  protected boolean RefundReasonCodeSortAscending = true;
  protected Integer RefundReasonCodeSort = null;
  /** raw field for: REFUND.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: REFUND.refund_status) */
  public    IntegerFilter[] RefundStatus  = null;
  protected boolean RefundStatusFetch = false;
  protected boolean RefundStatusSortAscending = true;
  protected Integer RefundStatusSort = null;
  /** raw field for: REFUND.refund_type) */
  public    IntegerFilter[] RefundType  = null;
  protected boolean RefundTypeFetch = false;
  protected boolean RefundTypeSortAscending = true;
  protected Integer RefundTypeSort = null;
  /** raw field for: REFUND.supervisor_name) */
  public    StringFilter[] SupervisorName  = null;
  protected boolean SupervisorNameFetch = false;
  protected boolean SupervisorNameSortAscending = true;
  protected boolean SupervisorNameCaseInsensitive = false;
  protected Integer SupervisorNameSort = null;
  /** raw field for: REFUND.review_date) */
  public    DateFilter[] ReviewDate  = null;
  protected boolean ReviewDateFetch = false;
  protected boolean ReviewDateSortAscending = true;
  protected Integer ReviewDateSort = null;
  /** raw field for: REFUND.payee_last) */
  public    StringFilter[] PayeeLast  = null;
  protected boolean PayeeLastFetch = false;
  protected boolean PayeeLastSortAscending = true;
  protected boolean PayeeLastCaseInsensitive = false;
  protected Integer PayeeLastSort = null;
  /** raw field for: REFUND.payee_first) */
  public    StringFilter[] PayeeFirst  = null;
  protected boolean PayeeFirstFetch = false;
  protected boolean PayeeFirstSortAscending = true;
  protected boolean PayeeFirstCaseInsensitive = false;
  protected Integer PayeeFirstSort = null;
  /** raw field for: REFUND.payee_company) */
  public    StringFilter[] PayeeCompany  = null;
  protected boolean PayeeCompanyFetch = false;
  protected boolean PayeeCompanySortAscending = true;
  protected boolean PayeeCompanyCaseInsensitive = false;
  protected Integer PayeeCompanySort = null;
  /** raw field for: REFUND.payee_address1) */
  public    StringFilter[] PayeeAddress1  = null;
  protected boolean PayeeAddress1Fetch = false;
  protected boolean PayeeAddress1SortAscending = true;
  protected boolean PayeeAddress1CaseInsensitive = false;
  protected Integer PayeeAddress1Sort = null;
  /** raw field for: REFUND.payee_address2) */
  public    StringFilter[] PayeeAddress2  = null;
  protected boolean PayeeAddress2Fetch = false;
  protected boolean PayeeAddress2SortAscending = true;
  protected boolean PayeeAddress2CaseInsensitive = false;
  protected Integer PayeeAddress2Sort = null;
  /** raw field for: REFUND.payee_address3) */
  public    StringFilter[] PayeeAddress3  = null;
  protected boolean PayeeAddress3Fetch = false;
  protected boolean PayeeAddress3SortAscending = true;
  protected boolean PayeeAddress3CaseInsensitive = false;
  protected Integer PayeeAddress3Sort = null;
  /** raw field for: REFUND.payee_city) */
  public    StringFilter[] PayeeCity  = null;
  protected boolean PayeeCityFetch = false;
  protected boolean PayeeCitySortAscending = true;
  protected boolean PayeeCityCaseInsensitive = false;
  protected Integer PayeeCitySort = null;
  /** raw field for: REFUND.payee_state) */
  public    StringFilter[] PayeeState  = null;
  protected boolean PayeeStateFetch = false;
  protected boolean PayeeStateSortAscending = true;
  protected boolean PayeeStateCaseInsensitive = false;
  protected Integer PayeeStateSort = null;
  /** raw field for: REFUND.payee_zip) */
  public    StringFilter[] PayeeZip  = null;
  protected boolean PayeeZipFetch = false;
  protected boolean PayeeZipSortAscending = true;
  protected boolean PayeeZipCaseInsensitive = false;
  protected Integer PayeeZipSort = null;
  /** raw field for: REFUND.payee_country_code) */
  public    IntegerFilter[] PayeeCountryCode  = null;
  protected boolean PayeeCountryCodeFetch = false;
  protected boolean PayeeCountryCodeSortAscending = true;
  protected Integer PayeeCountryCodeSort = null;
  /** raw field for: REFUND.payee_geocode) */
  public    StringFilter[] PayeeGeocode  = null;
  protected boolean PayeeGeocodeFetch = false;
  protected boolean PayeeGeocodeSortAscending = true;
  protected boolean PayeeGeocodeCaseInsensitive = false;
  protected Integer PayeeGeocodeSort = null;
  /** raw field for: REFUND.payee_county) */
  public    StringFilter[] PayeeCounty  = null;
  protected boolean PayeeCountyFetch = false;
  protected boolean PayeeCountySortAscending = true;
  protected boolean PayeeCountyCaseInsensitive = false;
  protected Integer PayeeCountySort = null;
  /** raw field for: REFUND.treasury_date) */
  public    DateFilter[] TreasuryDate  = null;
  protected boolean TreasuryDateFetch = false;
  protected boolean TreasuryDateSortAscending = true;
  protected Integer TreasuryDateSort = null;
  /** raw field for: REFUND.check_num) */
  public    StringFilter[] CheckNum  = null;
  protected boolean CheckNumFetch = false;
  protected boolean CheckNumSortAscending = true;
  protected boolean CheckNumCaseInsensitive = false;
  protected Integer CheckNumSort = null;
  /** raw field for: REFUND.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: REFUND.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: REFUND.last_reviewed_name) */
  public    StringFilter[] LastReviewedName  = null;
  protected boolean LastReviewedNameFetch = false;
  protected boolean LastReviewedNameSortAscending = true;
  protected boolean LastReviewedNameCaseInsensitive = false;
  protected Integer LastReviewedNameSort = null;
  /** raw field for: REFUND.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: REFUND.alt_contact_id) */
  public    IntegerFilter[] AltContactId  = null;
  protected boolean AltContactIdFetch = false;
  protected boolean AltContactIdSortAscending = true;
  protected Integer AltContactIdSort = null;
  /** raw field for: REFUND.alt_currency_code) */
  public    IntegerFilter[] AltCurrencyCode  = null;
  protected boolean AltCurrencyCodeFetch = false;
  protected boolean AltCurrencyCodeSortAscending = true;
  protected Integer AltCurrencyCodeSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.is_current) */
  public    BooleanFilter[] IsCurrent  = null;
  protected boolean IsCurrentFetch = false;
  protected boolean IsCurrentSortAscending = true;
  protected Integer IsCurrentSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.active_date) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  private String _objName = "RefundObjectFilter";
  /** default constructor */
  public RefundObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public RefundObjectFilter (RefundObjectFilter other)
  {
    if (other == null) return;
    this.Key = new RefundObjectKeyFilter (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.OrigSubmitterName = other.OrigSubmitterName;
    this.OrigSubmitterNameFetch = other.OrigSubmitterNameFetch;
    this.OrigSubmitterNameSort = other.OrigSubmitterNameSort;
    this.OrigSubmitterNameCaseInsensitive = other.OrigSubmitterNameCaseInsensitive;
    this.OrigSubmitterNameSortAscending = other.OrigSubmitterNameSortAscending;
    this.RequestDate = other.RequestDate;
    this.RequestDateFetch = other.RequestDateFetch;
    this.RequestDateSort = other.RequestDateSort;
    this.RequestDateSortAscending = other.RequestDateSortAscending;
    this.RefundReasonCode = other.RefundReasonCode;
    this.RefundReasonCodeFetch = other.RefundReasonCodeFetch;
    this.RefundReasonCodeSort = other.RefundReasonCodeSort;
    this.RefundReasonCodeSortAscending = other.RefundReasonCodeSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.RefundStatus = other.RefundStatus;
    this.RefundStatusFetch = other.RefundStatusFetch;
    this.RefundStatusSort = other.RefundStatusSort;
    this.RefundStatusSortAscending = other.RefundStatusSortAscending;
    this.RefundType = other.RefundType;
    this.RefundTypeFetch = other.RefundTypeFetch;
    this.RefundTypeSort = other.RefundTypeSort;
    this.RefundTypeSortAscending = other.RefundTypeSortAscending;
    this.SupervisorName = other.SupervisorName;
    this.SupervisorNameFetch = other.SupervisorNameFetch;
    this.SupervisorNameSort = other.SupervisorNameSort;
    this.SupervisorNameCaseInsensitive = other.SupervisorNameCaseInsensitive;
    this.SupervisorNameSortAscending = other.SupervisorNameSortAscending;
    this.ReviewDate = other.ReviewDate;
    this.ReviewDateFetch = other.ReviewDateFetch;
    this.ReviewDateSort = other.ReviewDateSort;
    this.ReviewDateSortAscending = other.ReviewDateSortAscending;
    this.PayeeLast = other.PayeeLast;
    this.PayeeLastFetch = other.PayeeLastFetch;
    this.PayeeLastSort = other.PayeeLastSort;
    this.PayeeLastCaseInsensitive = other.PayeeLastCaseInsensitive;
    this.PayeeLastSortAscending = other.PayeeLastSortAscending;
    this.PayeeFirst = other.PayeeFirst;
    this.PayeeFirstFetch = other.PayeeFirstFetch;
    this.PayeeFirstSort = other.PayeeFirstSort;
    this.PayeeFirstCaseInsensitive = other.PayeeFirstCaseInsensitive;
    this.PayeeFirstSortAscending = other.PayeeFirstSortAscending;
    this.PayeeCompany = other.PayeeCompany;
    this.PayeeCompanyFetch = other.PayeeCompanyFetch;
    this.PayeeCompanySort = other.PayeeCompanySort;
    this.PayeeCompanyCaseInsensitive = other.PayeeCompanyCaseInsensitive;
    this.PayeeCompanySortAscending = other.PayeeCompanySortAscending;
    this.PayeeAddress1 = other.PayeeAddress1;
    this.PayeeAddress1Fetch = other.PayeeAddress1Fetch;
    this.PayeeAddress1Sort = other.PayeeAddress1Sort;
    this.PayeeAddress1CaseInsensitive = other.PayeeAddress1CaseInsensitive;
    this.PayeeAddress1SortAscending = other.PayeeAddress1SortAscending;
    this.PayeeAddress2 = other.PayeeAddress2;
    this.PayeeAddress2Fetch = other.PayeeAddress2Fetch;
    this.PayeeAddress2Sort = other.PayeeAddress2Sort;
    this.PayeeAddress2CaseInsensitive = other.PayeeAddress2CaseInsensitive;
    this.PayeeAddress2SortAscending = other.PayeeAddress2SortAscending;
    this.PayeeAddress3 = other.PayeeAddress3;
    this.PayeeAddress3Fetch = other.PayeeAddress3Fetch;
    this.PayeeAddress3Sort = other.PayeeAddress3Sort;
    this.PayeeAddress3CaseInsensitive = other.PayeeAddress3CaseInsensitive;
    this.PayeeAddress3SortAscending = other.PayeeAddress3SortAscending;
    this.PayeeCity = other.PayeeCity;
    this.PayeeCityFetch = other.PayeeCityFetch;
    this.PayeeCitySort = other.PayeeCitySort;
    this.PayeeCityCaseInsensitive = other.PayeeCityCaseInsensitive;
    this.PayeeCitySortAscending = other.PayeeCitySortAscending;
    this.PayeeState = other.PayeeState;
    this.PayeeStateFetch = other.PayeeStateFetch;
    this.PayeeStateSort = other.PayeeStateSort;
    this.PayeeStateCaseInsensitive = other.PayeeStateCaseInsensitive;
    this.PayeeStateSortAscending = other.PayeeStateSortAscending;
    this.PayeeZip = other.PayeeZip;
    this.PayeeZipFetch = other.PayeeZipFetch;
    this.PayeeZipSort = other.PayeeZipSort;
    this.PayeeZipCaseInsensitive = other.PayeeZipCaseInsensitive;
    this.PayeeZipSortAscending = other.PayeeZipSortAscending;
    this.PayeeCountryCode = other.PayeeCountryCode;
    this.PayeeCountryCodeFetch = other.PayeeCountryCodeFetch;
    this.PayeeCountryCodeSort = other.PayeeCountryCodeSort;
    this.PayeeCountryCodeSortAscending = other.PayeeCountryCodeSortAscending;
    this.PayeeGeocode = other.PayeeGeocode;
    this.PayeeGeocodeFetch = other.PayeeGeocodeFetch;
    this.PayeeGeocodeSort = other.PayeeGeocodeSort;
    this.PayeeGeocodeCaseInsensitive = other.PayeeGeocodeCaseInsensitive;
    this.PayeeGeocodeSortAscending = other.PayeeGeocodeSortAscending;
    this.PayeeCounty = other.PayeeCounty;
    this.PayeeCountyFetch = other.PayeeCountyFetch;
    this.PayeeCountySort = other.PayeeCountySort;
    this.PayeeCountyCaseInsensitive = other.PayeeCountyCaseInsensitive;
    this.PayeeCountySortAscending = other.PayeeCountySortAscending;
    this.TreasuryDate = other.TreasuryDate;
    this.TreasuryDateFetch = other.TreasuryDateFetch;
    this.TreasuryDateSort = other.TreasuryDateSort;
    this.TreasuryDateSortAscending = other.TreasuryDateSortAscending;
    this.CheckNum = other.CheckNum;
    this.CheckNumFetch = other.CheckNumFetch;
    this.CheckNumSort = other.CheckNumSort;
    this.CheckNumCaseInsensitive = other.CheckNumCaseInsensitive;
    this.CheckNumSortAscending = other.CheckNumSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.LastReviewedName = other.LastReviewedName;
    this.LastReviewedNameFetch = other.LastReviewedNameFetch;
    this.LastReviewedNameSort = other.LastReviewedNameSort;
    this.LastReviewedNameCaseInsensitive = other.LastReviewedNameCaseInsensitive;
    this.LastReviewedNameSortAscending = other.LastReviewedNameSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.AltContactId = other.AltContactId;
    this.AltContactIdFetch = other.AltContactIdFetch;
    this.AltContactIdSort = other.AltContactIdSort;
    this.AltContactIdSortAscending = other.AltContactIdSortAscending;
    this.AltCurrencyCode = other.AltCurrencyCode;
    this.AltCurrencyCodeFetch = other.AltCurrencyCodeFetch;
    this.AltCurrencyCodeSort = other.AltCurrencyCodeSort;
    this.AltCurrencyCodeSortAscending = other.AltCurrencyCodeSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.IsCurrent = other.IsCurrent;
    this.IsCurrentFetch = other.IsCurrentFetch;
    this.IsCurrentSort = other.IsCurrentSort;
    this.IsCurrentSortAscending = other.IsCurrentSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;  }
  /** get the filter for this object's key
   * @return RefundObjectKeyFilter
   */
  public RefundObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (RefundObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (REFUND.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (REFUND.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (REFUND.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (REFUND.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (REFUND.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (REFUND.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (REFUND.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (REFUND.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (REFUND.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (REFUND.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new RefundObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (REFUND.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountInternalId (REFUND.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (REFUND.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (REFUND.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (REFUND.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (REFUND.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (REFUND.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (REFUND.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (REFUND.account_no)
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

  /** Set the field level Fetch value for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigSubmitterNameFetch (boolean fetch) {
    this.OrigSubmitterNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigSubmitterNameFetch () {
    return this.OrigSubmitterNameFetch;
  }
  /** Set the SortOrder for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigSubmitterNameSortOrder (Integer value) {
    this.OrigSubmitterNameSort = value;
  }
  /** Retrieve SortOrder for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigSubmitterNameSortOrder () {
    return this.OrigSubmitterNameSort;
  }
  /** Set the sort direction for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigSubmitterNameSortDirection (boolean ascending) {
    this.OrigSubmitterNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigSubmitterNameSortDirection () {
    return this.OrigSubmitterNameSortAscending;
  }
  /** Set the case insensitive for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setOrigSubmitterNameCaseInsensitive (boolean ascending) {
    this.OrigSubmitterNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getOrigSubmitterNameCaseInsensitive () {
    return this.OrigSubmitterNameCaseInsensitive;
  }
  /** Set the field level filters for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigSubmitterNameFilter (StringFilter[] value) throws ServiceException {
    this.OrigSubmitterName = value;
  }
  /** Retrieve filter for field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getOrigSubmitterNameFilter () {
    return this.OrigSubmitterName;
  }

  /**
   * Retrieves the OrigSubmitterNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigSubmitterNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubmitterNameFilter field
   */
  public String[] getOrigSubmitterNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigSubmitterNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubmitterNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubmitterNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigSubmitterNameFilter filter value from a formatted string
   *
   * @param _value the OrigSubmitterNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigSubmitterNameFilter filter field
   */
  public void setOrigSubmitterNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
    try {
      this.setOrigSubmitterNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigSubmitterNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubmitterNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RequestDate (REFUND.request_date)
   * @param fetch whether to fetch this field or not
   */
  public void setRequestDateFetch (boolean fetch) {
    this.RequestDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: RequestDate (REFUND.request_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getRequestDateFetch () {
    return this.RequestDateFetch;
  }
  /** Set the SortOrder for field: RequestDate (REFUND.request_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRequestDateSortOrder (Integer value) {
    this.RequestDateSort = value;
  }
  /** Retrieve SortOrder for field: RequestDate (REFUND.request_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRequestDateSortOrder () {
    return this.RequestDateSort;
  }
  /** Set the sort direction for field: RequestDate (REFUND.request_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRequestDateSortDirection (boolean ascending) {
    this.RequestDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RequestDate (REFUND.request_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRequestDateSortDirection () {
    return this.RequestDateSortAscending;
  }
  /** Set the field level filters for field: RequestDate (REFUND.request_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRequestDateFilter (DateFilter[] value) throws ServiceException {
    this.RequestDate = value;
  }
  /** Retrieve filter for field: RequestDate (REFUND.request_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getRequestDateFilter () {
    return this.RequestDate;
  }

  /**
   * Retrieves the RequestDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestDateFilter field
   */
  public String[] getRequestDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RequestDateFilter filter value from a formatted string
   *
   * @param _value the RequestDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestDateFilter filter field
   */
  public void setRequestDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestDateFilterFromFormattedString");
    try {
      this.setRequestDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestDateFilterFromFormattedString");
  }

  /**
   * Retrieves the RequestDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestDateFilter field
   */
  public String[] getRequestDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRequestDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RequestDateFilter filter value from a formatted string
   *
   * @param _value the RequestDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RequestDateFilter filter field
   */
  public void setRequestDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestDateFilterFromFormattedDateTimeString");
    try {
      this.setRequestDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: RefundReasonCode (REFUND.refund_reason_code)
   * @param fetch whether to fetch this field or not
   */
  public void setRefundReasonCodeFetch (boolean fetch) {
    this.RefundReasonCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefundReasonCode (REFUND.refund_reason_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefundReasonCodeFetch () {
    return this.RefundReasonCodeFetch;
  }
  /** Set the SortOrder for field: RefundReasonCode (REFUND.refund_reason_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefundReasonCodeSortOrder (Integer value) {
    this.RefundReasonCodeSort = value;
  }
  /** Retrieve SortOrder for field: RefundReasonCode (REFUND.refund_reason_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefundReasonCodeSortOrder () {
    return this.RefundReasonCodeSort;
  }
  /** Set the sort direction for field: RefundReasonCode (REFUND.refund_reason_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefundReasonCodeSortDirection (boolean ascending) {
    this.RefundReasonCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefundReasonCode (REFUND.refund_reason_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefundReasonCodeSortDirection () {
    return this.RefundReasonCodeSortAscending;
  }
  /** Set the field level filters for field: RefundReasonCode (REFUND.refund_reason_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefundReasonCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.RefundReasonCode = value;
  }
  /** Retrieve filter for field: RefundReasonCode (REFUND.refund_reason_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefundReasonCodeFilter () {
    return this.RefundReasonCode;
  }

  /**
   * Retrieves the RefundReasonCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefundReasonCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundReasonCodeFilter field
   */
  public String[] getRefundReasonCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefundReasonCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundReasonCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefundReasonCodeFilter filter value from a formatted string
   *
   * @param _value the RefundReasonCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefundReasonCodeFilter filter field
   */
  public void setRefundReasonCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefundReasonCodeFilterFromFormattedString");
    try {
      this.setRefundReasonCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundReasonCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundReasonCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundReasonCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Amount (REFUND.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (REFUND.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (REFUND.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (REFUND.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (REFUND.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (REFUND.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (REFUND.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (REFUND.amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountFilter () {
    return this.Amount;
  }

  /**
   * Retrieves the AmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */
  public String[] getAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedString");
  }

  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */

  public String[] getAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RefundStatus (REFUND.refund_status)
   * @param fetch whether to fetch this field or not
   */
  public void setRefundStatusFetch (boolean fetch) {
    this.RefundStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefundStatus (REFUND.refund_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefundStatusFetch () {
    return this.RefundStatusFetch;
  }
  /** Set the SortOrder for field: RefundStatus (REFUND.refund_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefundStatusSortOrder (Integer value) {
    this.RefundStatusSort = value;
  }
  /** Retrieve SortOrder for field: RefundStatus (REFUND.refund_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefundStatusSortOrder () {
    return this.RefundStatusSort;
  }
  /** Set the sort direction for field: RefundStatus (REFUND.refund_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefundStatusSortDirection (boolean ascending) {
    this.RefundStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefundStatus (REFUND.refund_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefundStatusSortDirection () {
    return this.RefundStatusSortAscending;
  }
  /** Set the field level filters for field: RefundStatus (REFUND.refund_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefundStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.RefundStatus = value;
  }
  /** Retrieve filter for field: RefundStatus (REFUND.refund_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefundStatusFilter () {
    return this.RefundStatus;
  }

  /**
   * Retrieves the RefundStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefundStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundStatusFilter field
   */
  public String[] getRefundStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefundStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefundStatusFilter filter value from a formatted string
   *
   * @param _value the RefundStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefundStatusFilter filter field
   */
  public void setRefundStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefundStatusFilterFromFormattedString");
    try {
      this.setRefundStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RefundType (REFUND.refund_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRefundTypeFetch (boolean fetch) {
    this.RefundTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RefundType (REFUND.refund_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRefundTypeFetch () {
    return this.RefundTypeFetch;
  }
  /** Set the SortOrder for field: RefundType (REFUND.refund_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRefundTypeSortOrder (Integer value) {
    this.RefundTypeSort = value;
  }
  /** Retrieve SortOrder for field: RefundType (REFUND.refund_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRefundTypeSortOrder () {
    return this.RefundTypeSort;
  }
  /** Set the sort direction for field: RefundType (REFUND.refund_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRefundTypeSortDirection (boolean ascending) {
    this.RefundTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RefundType (REFUND.refund_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRefundTypeSortDirection () {
    return this.RefundTypeSortAscending;
  }
  /** Set the field level filters for field: RefundType (REFUND.refund_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRefundTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RefundType = value;
  }
  /** Retrieve filter for field: RefundType (REFUND.refund_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRefundTypeFilter () {
    return this.RefundType;
  }

  /**
   * Retrieves the RefundTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RefundTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundTypeFilter field
   */
  public String[] getRefundTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRefundTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RefundTypeFilter filter value from a formatted string
   *
   * @param _value the RefundTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RefundTypeFilter filter field
   */
  public void setRefundTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRefundTypeFilterFromFormattedString");
    try {
      this.setRefundTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RefundTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SupervisorName (REFUND.supervisor_name)
   * @param fetch whether to fetch this field or not
   */
  public void setSupervisorNameFetch (boolean fetch) {
    this.SupervisorNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: SupervisorName (REFUND.supervisor_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getSupervisorNameFetch () {
    return this.SupervisorNameFetch;
  }
  /** Set the SortOrder for field: SupervisorName (REFUND.supervisor_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSupervisorNameSortOrder (Integer value) {
    this.SupervisorNameSort = value;
  }
  /** Retrieve SortOrder for field: SupervisorName (REFUND.supervisor_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSupervisorNameSortOrder () {
    return this.SupervisorNameSort;
  }
  /** Set the sort direction for field: SupervisorName (REFUND.supervisor_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSupervisorNameSortDirection (boolean ascending) {
    this.SupervisorNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SupervisorName (REFUND.supervisor_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSupervisorNameSortDirection () {
    return this.SupervisorNameSortAscending;
  }
  /** Set the case insensitive for field: SupervisorName (REFUND.supervisor_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSupervisorNameCaseInsensitive (boolean ascending) {
    this.SupervisorNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SupervisorName (REFUND.supervisor_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSupervisorNameCaseInsensitive () {
    return this.SupervisorNameCaseInsensitive;
  }
  /** Set the field level filters for field: SupervisorName (REFUND.supervisor_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSupervisorNameFilter (StringFilter[] value) throws ServiceException {
    this.SupervisorName = value;
  }
  /** Retrieve filter for field: SupervisorName (REFUND.supervisor_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSupervisorNameFilter () {
    return this.SupervisorName;
  }

  /**
   * Retrieves the SupervisorNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SupervisorNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorNameFilter field
   */
  public String[] getSupervisorNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSupervisorNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SupervisorNameFilter filter value from a formatted string
   *
   * @param _value the SupervisorNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SupervisorNameFilter filter field
   */
  public void setSupervisorNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSupervisorNameFilterFromFormattedString");
    try {
      this.setSupervisorNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SupervisorNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ReviewDate (REFUND.review_date)
   * @param fetch whether to fetch this field or not
   */
  public void setReviewDateFetch (boolean fetch) {
    this.ReviewDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReviewDate (REFUND.review_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getReviewDateFetch () {
    return this.ReviewDateFetch;
  }
  /** Set the SortOrder for field: ReviewDate (REFUND.review_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReviewDateSortOrder (Integer value) {
    this.ReviewDateSort = value;
  }
  /** Retrieve SortOrder for field: ReviewDate (REFUND.review_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReviewDateSortOrder () {
    return this.ReviewDateSort;
  }
  /** Set the sort direction for field: ReviewDate (REFUND.review_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReviewDateSortDirection (boolean ascending) {
    this.ReviewDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReviewDate (REFUND.review_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReviewDateSortDirection () {
    return this.ReviewDateSortAscending;
  }
  /** Set the field level filters for field: ReviewDate (REFUND.review_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReviewDateFilter (DateFilter[] value) throws ServiceException {
    this.ReviewDate = value;
  }
  /** Retrieve filter for field: ReviewDate (REFUND.review_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getReviewDateFilter () {
    return this.ReviewDate;
  }

  /**
   * Retrieves the ReviewDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDateFilter field
   */
  public String[] getReviewDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReviewDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDateFilter filter value from a formatted string
   *
   * @param _value the ReviewDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReviewDateFilter filter field
   */
  public void setReviewDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFilterFromFormattedString");
    try {
      this.setReviewDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ReviewDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDateFilter field
   */
  public String[] getReviewDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getReviewDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDateFilter filter value from a formatted string
   *
   * @param _value the ReviewDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ReviewDateFilter filter field
   */
  public void setReviewDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
    try {
      this.setReviewDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PayeeLast (REFUND.payee_last)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeLastFetch (boolean fetch) {
    this.PayeeLastFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeLast (REFUND.payee_last)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeLastFetch () {
    return this.PayeeLastFetch;
  }
  /** Set the SortOrder for field: PayeeLast (REFUND.payee_last)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeLastSortOrder (Integer value) {
    this.PayeeLastSort = value;
  }
  /** Retrieve SortOrder for field: PayeeLast (REFUND.payee_last)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeLastSortOrder () {
    return this.PayeeLastSort;
  }
  /** Set the sort direction for field: PayeeLast (REFUND.payee_last)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeLastSortDirection (boolean ascending) {
    this.PayeeLastSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeLast (REFUND.payee_last)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeLastSortDirection () {
    return this.PayeeLastSortAscending;
  }
  /** Set the case insensitive for field: PayeeLast (REFUND.payee_last)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeLastCaseInsensitive (boolean ascending) {
    this.PayeeLastCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeLast (REFUND.payee_last)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeLastCaseInsensitive () {
    return this.PayeeLastCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeLast (REFUND.payee_last)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeLastFilter (StringFilter[] value) throws ServiceException {
    this.PayeeLast = value;
  }
  /** Retrieve filter for field: PayeeLast (REFUND.payee_last)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeLastFilter () {
    return this.PayeeLast;
  }

  /**
   * Retrieves the PayeeLastFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeLastFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeLastFilter field
   */
  public String[] getPayeeLastFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeLastFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeLastFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeLastFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeLastFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeLastFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeLastFilter filter value from a formatted string
   *
   * @param _value the PayeeLastFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeLastFilter filter field
   */
  public void setPayeeLastFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeLastFilterFromFormattedString");
    try {
      this.setPayeeLastFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeLastFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeLastFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeLastFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeFirst (REFUND.payee_first)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeFirstFetch (boolean fetch) {
    this.PayeeFirstFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeFirst (REFUND.payee_first)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeFirstFetch () {
    return this.PayeeFirstFetch;
  }
  /** Set the SortOrder for field: PayeeFirst (REFUND.payee_first)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeFirstSortOrder (Integer value) {
    this.PayeeFirstSort = value;
  }
  /** Retrieve SortOrder for field: PayeeFirst (REFUND.payee_first)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeFirstSortOrder () {
    return this.PayeeFirstSort;
  }
  /** Set the sort direction for field: PayeeFirst (REFUND.payee_first)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeFirstSortDirection (boolean ascending) {
    this.PayeeFirstSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeFirst (REFUND.payee_first)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeFirstSortDirection () {
    return this.PayeeFirstSortAscending;
  }
  /** Set the case insensitive for field: PayeeFirst (REFUND.payee_first)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeFirstCaseInsensitive (boolean ascending) {
    this.PayeeFirstCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeFirst (REFUND.payee_first)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeFirstCaseInsensitive () {
    return this.PayeeFirstCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeFirst (REFUND.payee_first)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeFirstFilter (StringFilter[] value) throws ServiceException {
    this.PayeeFirst = value;
  }
  /** Retrieve filter for field: PayeeFirst (REFUND.payee_first)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeFirstFilter () {
    return this.PayeeFirst;
  }

  /**
   * Retrieves the PayeeFirstFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeFirstFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeFirstFilter field
   */
  public String[] getPayeeFirstFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeFirstFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeFirstFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeFirstFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeFirstFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeFirstFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeFirstFilter filter value from a formatted string
   *
   * @param _value the PayeeFirstFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeFirstFilter filter field
   */
  public void setPayeeFirstFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeFirstFilterFromFormattedString");
    try {
      this.setPayeeFirstFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeFirstFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeFirstFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeFirstFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeCompany (REFUND.payee_company)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeCompanyFetch (boolean fetch) {
    this.PayeeCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeCompany (REFUND.payee_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeCompanyFetch () {
    return this.PayeeCompanyFetch;
  }
  /** Set the SortOrder for field: PayeeCompany (REFUND.payee_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeCompanySortOrder (Integer value) {
    this.PayeeCompanySort = value;
  }
  /** Retrieve SortOrder for field: PayeeCompany (REFUND.payee_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeCompanySortOrder () {
    return this.PayeeCompanySort;
  }
  /** Set the sort direction for field: PayeeCompany (REFUND.payee_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeCompanySortDirection (boolean ascending) {
    this.PayeeCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeCompany (REFUND.payee_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeCompanySortDirection () {
    return this.PayeeCompanySortAscending;
  }
  /** Set the case insensitive for field: PayeeCompany (REFUND.payee_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeCompanyCaseInsensitive (boolean ascending) {
    this.PayeeCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeCompany (REFUND.payee_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeCompanyCaseInsensitive () {
    return this.PayeeCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeCompany (REFUND.payee_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeCompanyFilter (StringFilter[] value) throws ServiceException {
    this.PayeeCompany = value;
  }
  /** Retrieve filter for field: PayeeCompany (REFUND.payee_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeCompanyFilter () {
    return this.PayeeCompany;
  }

  /**
   * Retrieves the PayeeCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCompanyFilter field
   */
  public String[] getPayeeCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeCompanyFilter filter value from a formatted string
   *
   * @param _value the PayeeCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeCompanyFilter filter field
   */
  public void setPayeeCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeCompanyFilterFromFormattedString");
    try {
      this.setPayeeCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeAddress1 (REFUND.payee_address1)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeAddress1Fetch (boolean fetch) {
    this.PayeeAddress1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeAddress1 (REFUND.payee_address1)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeAddress1Fetch () {
    return this.PayeeAddress1Fetch;
  }
  /** Set the SortOrder for field: PayeeAddress1 (REFUND.payee_address1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeAddress1SortOrder (Integer value) {
    this.PayeeAddress1Sort = value;
  }
  /** Retrieve SortOrder for field: PayeeAddress1 (REFUND.payee_address1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeAddress1SortOrder () {
    return this.PayeeAddress1Sort;
  }
  /** Set the sort direction for field: PayeeAddress1 (REFUND.payee_address1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeAddress1SortDirection (boolean ascending) {
    this.PayeeAddress1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeAddress1 (REFUND.payee_address1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeAddress1SortDirection () {
    return this.PayeeAddress1SortAscending;
  }
  /** Set the case insensitive for field: PayeeAddress1 (REFUND.payee_address1)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeAddress1CaseInsensitive (boolean ascending) {
    this.PayeeAddress1CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeAddress1 (REFUND.payee_address1)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeAddress1CaseInsensitive () {
    return this.PayeeAddress1CaseInsensitive;
  }
  /** Set the field level filters for field: PayeeAddress1 (REFUND.payee_address1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeAddress1Filter (StringFilter[] value) throws ServiceException {
    this.PayeeAddress1 = value;
  }
  /** Retrieve filter for field: PayeeAddress1 (REFUND.payee_address1)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeAddress1Filter () {
    return this.PayeeAddress1;
  }

  /**
   * Retrieves the PayeeAddress1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeAddress1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress1Filter field
   */
  public String[] getPayeeAddress1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeAddress1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeAddress1Filter filter value from a formatted string
   *
   * @param _value the PayeeAddress1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeAddress1Filter filter field
   */
  public void setPayeeAddress1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeAddress1FilterFromFormattedString");
    try {
      this.setPayeeAddress1Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeAddress2 (REFUND.payee_address2)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeAddress2Fetch (boolean fetch) {
    this.PayeeAddress2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeAddress2 (REFUND.payee_address2)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeAddress2Fetch () {
    return this.PayeeAddress2Fetch;
  }
  /** Set the SortOrder for field: PayeeAddress2 (REFUND.payee_address2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeAddress2SortOrder (Integer value) {
    this.PayeeAddress2Sort = value;
  }
  /** Retrieve SortOrder for field: PayeeAddress2 (REFUND.payee_address2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeAddress2SortOrder () {
    return this.PayeeAddress2Sort;
  }
  /** Set the sort direction for field: PayeeAddress2 (REFUND.payee_address2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeAddress2SortDirection (boolean ascending) {
    this.PayeeAddress2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeAddress2 (REFUND.payee_address2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeAddress2SortDirection () {
    return this.PayeeAddress2SortAscending;
  }
  /** Set the case insensitive for field: PayeeAddress2 (REFUND.payee_address2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeAddress2CaseInsensitive (boolean ascending) {
    this.PayeeAddress2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeAddress2 (REFUND.payee_address2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeAddress2CaseInsensitive () {
    return this.PayeeAddress2CaseInsensitive;
  }
  /** Set the field level filters for field: PayeeAddress2 (REFUND.payee_address2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeAddress2Filter (StringFilter[] value) throws ServiceException {
    this.PayeeAddress2 = value;
  }
  /** Retrieve filter for field: PayeeAddress2 (REFUND.payee_address2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeAddress2Filter () {
    return this.PayeeAddress2;
  }

  /**
   * Retrieves the PayeeAddress2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeAddress2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress2Filter field
   */
  public String[] getPayeeAddress2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeAddress2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeAddress2Filter filter value from a formatted string
   *
   * @param _value the PayeeAddress2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeAddress2Filter filter field
   */
  public void setPayeeAddress2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeAddress2FilterFromFormattedString");
    try {
      this.setPayeeAddress2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeAddress3 (REFUND.payee_address3)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeAddress3Fetch (boolean fetch) {
    this.PayeeAddress3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeAddress3 (REFUND.payee_address3)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeAddress3Fetch () {
    return this.PayeeAddress3Fetch;
  }
  /** Set the SortOrder for field: PayeeAddress3 (REFUND.payee_address3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeAddress3SortOrder (Integer value) {
    this.PayeeAddress3Sort = value;
  }
  /** Retrieve SortOrder for field: PayeeAddress3 (REFUND.payee_address3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeAddress3SortOrder () {
    return this.PayeeAddress3Sort;
  }
  /** Set the sort direction for field: PayeeAddress3 (REFUND.payee_address3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeAddress3SortDirection (boolean ascending) {
    this.PayeeAddress3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeAddress3 (REFUND.payee_address3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeAddress3SortDirection () {
    return this.PayeeAddress3SortAscending;
  }
  /** Set the case insensitive for field: PayeeAddress3 (REFUND.payee_address3)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeAddress3CaseInsensitive (boolean ascending) {
    this.PayeeAddress3CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeAddress3 (REFUND.payee_address3)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeAddress3CaseInsensitive () {
    return this.PayeeAddress3CaseInsensitive;
  }
  /** Set the field level filters for field: PayeeAddress3 (REFUND.payee_address3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeAddress3Filter (StringFilter[] value) throws ServiceException {
    this.PayeeAddress3 = value;
  }
  /** Retrieve filter for field: PayeeAddress3 (REFUND.payee_address3)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeAddress3Filter () {
    return this.PayeeAddress3;
  }

  /**
   * Retrieves the PayeeAddress3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeAddress3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress3Filter field
   */
  public String[] getPayeeAddress3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeAddress3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeAddress3Filter filter value from a formatted string
   *
   * @param _value the PayeeAddress3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeAddress3Filter filter field
   */
  public void setPayeeAddress3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeAddress3FilterFromFormattedString");
    try {
      this.setPayeeAddress3Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeAddress3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeCity (REFUND.payee_city)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeCityFetch (boolean fetch) {
    this.PayeeCityFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeCity (REFUND.payee_city)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeCityFetch () {
    return this.PayeeCityFetch;
  }
  /** Set the SortOrder for field: PayeeCity (REFUND.payee_city)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeCitySortOrder (Integer value) {
    this.PayeeCitySort = value;
  }
  /** Retrieve SortOrder for field: PayeeCity (REFUND.payee_city)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeCitySortOrder () {
    return this.PayeeCitySort;
  }
  /** Set the sort direction for field: PayeeCity (REFUND.payee_city)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeCitySortDirection (boolean ascending) {
    this.PayeeCitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeCity (REFUND.payee_city)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeCitySortDirection () {
    return this.PayeeCitySortAscending;
  }
  /** Set the case insensitive for field: PayeeCity (REFUND.payee_city)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeCityCaseInsensitive (boolean ascending) {
    this.PayeeCityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeCity (REFUND.payee_city)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeCityCaseInsensitive () {
    return this.PayeeCityCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeCity (REFUND.payee_city)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeCityFilter (StringFilter[] value) throws ServiceException {
    this.PayeeCity = value;
  }
  /** Retrieve filter for field: PayeeCity (REFUND.payee_city)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeCityFilter () {
    return this.PayeeCity;
  }

  /**
   * Retrieves the PayeeCityFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeCityFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCityFilter field
   */
  public String[] getPayeeCityFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCityFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeCityFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCityFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCityFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeCityFilter filter value from a formatted string
   *
   * @param _value the PayeeCityFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeCityFilter filter field
   */
  public void setPayeeCityFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeCityFilterFromFormattedString");
    try {
      this.setPayeeCityFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCityFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCityFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCityFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeState (REFUND.payee_state)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeStateFetch (boolean fetch) {
    this.PayeeStateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeState (REFUND.payee_state)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeStateFetch () {
    return this.PayeeStateFetch;
  }
  /** Set the SortOrder for field: PayeeState (REFUND.payee_state)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeStateSortOrder (Integer value) {
    this.PayeeStateSort = value;
  }
  /** Retrieve SortOrder for field: PayeeState (REFUND.payee_state)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeStateSortOrder () {
    return this.PayeeStateSort;
  }
  /** Set the sort direction for field: PayeeState (REFUND.payee_state)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeStateSortDirection (boolean ascending) {
    this.PayeeStateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeState (REFUND.payee_state)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeStateSortDirection () {
    return this.PayeeStateSortAscending;
  }
  /** Set the case insensitive for field: PayeeState (REFUND.payee_state)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeStateCaseInsensitive (boolean ascending) {
    this.PayeeStateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeState (REFUND.payee_state)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeStateCaseInsensitive () {
    return this.PayeeStateCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeState (REFUND.payee_state)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeStateFilter (StringFilter[] value) throws ServiceException {
    this.PayeeState = value;
  }
  /** Retrieve filter for field: PayeeState (REFUND.payee_state)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeStateFilter () {
    return this.PayeeState;
  }

  /**
   * Retrieves the PayeeStateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeStateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeStateFilter field
   */
  public String[] getPayeeStateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeStateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeStateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeStateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeStateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeStateFilter filter value from a formatted string
   *
   * @param _value the PayeeStateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeStateFilter filter field
   */
  public void setPayeeStateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeStateFilterFromFormattedString");
    try {
      this.setPayeeStateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeStateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeStateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeStateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeZip (REFUND.payee_zip)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeZipFetch (boolean fetch) {
    this.PayeeZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeZip (REFUND.payee_zip)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeZipFetch () {
    return this.PayeeZipFetch;
  }
  /** Set the SortOrder for field: PayeeZip (REFUND.payee_zip)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeZipSortOrder (Integer value) {
    this.PayeeZipSort = value;
  }
  /** Retrieve SortOrder for field: PayeeZip (REFUND.payee_zip)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeZipSortOrder () {
    return this.PayeeZipSort;
  }
  /** Set the sort direction for field: PayeeZip (REFUND.payee_zip)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeZipSortDirection (boolean ascending) {
    this.PayeeZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeZip (REFUND.payee_zip)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeZipSortDirection () {
    return this.PayeeZipSortAscending;
  }
  /** Set the case insensitive for field: PayeeZip (REFUND.payee_zip)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeZipCaseInsensitive (boolean ascending) {
    this.PayeeZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeZip (REFUND.payee_zip)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeZipCaseInsensitive () {
    return this.PayeeZipCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeZip (REFUND.payee_zip)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeZipFilter (StringFilter[] value) throws ServiceException {
    this.PayeeZip = value;
  }
  /** Retrieve filter for field: PayeeZip (REFUND.payee_zip)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeZipFilter () {
    return this.PayeeZip;
  }

  /**
   * Retrieves the PayeeZipFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeZipFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeZipFilter field
   */
  public String[] getPayeeZipFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeZipFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeZipFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeZipFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeZipFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeZipFilter filter value from a formatted string
   *
   * @param _value the PayeeZipFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeZipFilter filter field
   */
  public void setPayeeZipFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeZipFilterFromFormattedString");
    try {
      this.setPayeeZipFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeZipFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeZipFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeZipFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeCountryCode (REFUND.payee_country_code)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeCountryCodeFetch (boolean fetch) {
    this.PayeeCountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeCountryCode (REFUND.payee_country_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeCountryCodeFetch () {
    return this.PayeeCountryCodeFetch;
  }
  /** Set the SortOrder for field: PayeeCountryCode (REFUND.payee_country_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeCountryCodeSortOrder (Integer value) {
    this.PayeeCountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: PayeeCountryCode (REFUND.payee_country_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeCountryCodeSortOrder () {
    return this.PayeeCountryCodeSort;
  }
  /** Set the sort direction for field: PayeeCountryCode (REFUND.payee_country_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeCountryCodeSortDirection (boolean ascending) {
    this.PayeeCountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeCountryCode (REFUND.payee_country_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeCountryCodeSortDirection () {
    return this.PayeeCountryCodeSortAscending;
  }
  /** Set the field level filters for field: PayeeCountryCode (REFUND.payee_country_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeCountryCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.PayeeCountryCode = value;
  }
  /** Retrieve filter for field: PayeeCountryCode (REFUND.payee_country_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPayeeCountryCodeFilter () {
    return this.PayeeCountryCode;
  }

  /**
   * Retrieves the PayeeCountryCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeCountryCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCountryCodeFilter field
   */
  public String[] getPayeeCountryCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountryCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeCountryCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCountryCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCountryCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeCountryCodeFilter filter value from a formatted string
   *
   * @param _value the PayeeCountryCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeCountryCodeFilter filter field
   */
  public void setPayeeCountryCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeCountryCodeFilterFromFormattedString");
    try {
      this.setPayeeCountryCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCountryCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCountryCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCountryCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeGeocode (REFUND.payee_geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeGeocodeFetch (boolean fetch) {
    this.PayeeGeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeGeocode (REFUND.payee_geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeGeocodeFetch () {
    return this.PayeeGeocodeFetch;
  }
  /** Set the SortOrder for field: PayeeGeocode (REFUND.payee_geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeGeocodeSortOrder (Integer value) {
    this.PayeeGeocodeSort = value;
  }
  /** Retrieve SortOrder for field: PayeeGeocode (REFUND.payee_geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeGeocodeSortOrder () {
    return this.PayeeGeocodeSort;
  }
  /** Set the sort direction for field: PayeeGeocode (REFUND.payee_geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeGeocodeSortDirection (boolean ascending) {
    this.PayeeGeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeGeocode (REFUND.payee_geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeGeocodeSortDirection () {
    return this.PayeeGeocodeSortAscending;
  }
  /** Set the case insensitive for field: PayeeGeocode (REFUND.payee_geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeGeocodeCaseInsensitive (boolean ascending) {
    this.PayeeGeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeGeocode (REFUND.payee_geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeGeocodeCaseInsensitive () {
    return this.PayeeGeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeGeocode (REFUND.payee_geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.PayeeGeocode = value;
  }
  /** Retrieve filter for field: PayeeGeocode (REFUND.payee_geocode)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeGeocodeFilter () {
    return this.PayeeGeocode;
  }

  /**
   * Retrieves the PayeeGeocodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeGeocodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeGeocodeFilter field
   */
  public String[] getPayeeGeocodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeGeocodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeGeocodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeGeocodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeGeocodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeGeocodeFilter filter value from a formatted string
   *
   * @param _value the PayeeGeocodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeGeocodeFilter filter field
   */
  public void setPayeeGeocodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeGeocodeFilterFromFormattedString");
    try {
      this.setPayeeGeocodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeGeocodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeGeocodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeGeocodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PayeeCounty (REFUND.payee_county)
   * @param fetch whether to fetch this field or not
   */
  public void setPayeeCountyFetch (boolean fetch) {
    this.PayeeCountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: PayeeCounty (REFUND.payee_county)
   * @return boolean the Fetch value for this field
   */
  public boolean getPayeeCountyFetch () {
    return this.PayeeCountyFetch;
  }
  /** Set the SortOrder for field: PayeeCounty (REFUND.payee_county)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPayeeCountySortOrder (Integer value) {
    this.PayeeCountySort = value;
  }
  /** Retrieve SortOrder for field: PayeeCounty (REFUND.payee_county)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPayeeCountySortOrder () {
    return this.PayeeCountySort;
  }
  /** Set the sort direction for field: PayeeCounty (REFUND.payee_county)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPayeeCountySortDirection (boolean ascending) {
    this.PayeeCountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PayeeCounty (REFUND.payee_county)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPayeeCountySortDirection () {
    return this.PayeeCountySortAscending;
  }
  /** Set the case insensitive for field: PayeeCounty (REFUND.payee_county)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPayeeCountyCaseInsensitive (boolean ascending) {
    this.PayeeCountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PayeeCounty (REFUND.payee_county)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getPayeeCountyCaseInsensitive () {
    return this.PayeeCountyCaseInsensitive;
  }
  /** Set the field level filters for field: PayeeCounty (REFUND.payee_county)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPayeeCountyFilter (StringFilter[] value) throws ServiceException {
    this.PayeeCounty = value;
  }
  /** Retrieve filter for field: PayeeCounty (REFUND.payee_county)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPayeeCountyFilter () {
    return this.PayeeCounty;
  }

  /**
   * Retrieves the PayeeCountyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PayeeCountyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCountyFilter field
   */
  public String[] getPayeeCountyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPayeeCountyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCountyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCountyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PayeeCountyFilter filter value from a formatted string
   *
   * @param _value the PayeeCountyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PayeeCountyFilter filter field
   */
  public void setPayeeCountyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPayeeCountyFilterFromFormattedString");
    try {
      this.setPayeeCountyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PayeeCountyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCountyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCountyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TreasuryDate (REFUND.treasury_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTreasuryDateFetch (boolean fetch) {
    this.TreasuryDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TreasuryDate (REFUND.treasury_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTreasuryDateFetch () {
    return this.TreasuryDateFetch;
  }
  /** Set the SortOrder for field: TreasuryDate (REFUND.treasury_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTreasuryDateSortOrder (Integer value) {
    this.TreasuryDateSort = value;
  }
  /** Retrieve SortOrder for field: TreasuryDate (REFUND.treasury_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTreasuryDateSortOrder () {
    return this.TreasuryDateSort;
  }
  /** Set the sort direction for field: TreasuryDate (REFUND.treasury_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTreasuryDateSortDirection (boolean ascending) {
    this.TreasuryDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TreasuryDate (REFUND.treasury_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTreasuryDateSortDirection () {
    return this.TreasuryDateSortAscending;
  }
  /** Set the field level filters for field: TreasuryDate (REFUND.treasury_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTreasuryDateFilter (DateFilter[] value) throws ServiceException {
    this.TreasuryDate = value;
  }
  /** Retrieve filter for field: TreasuryDate (REFUND.treasury_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTreasuryDateFilter () {
    return this.TreasuryDate;
  }

  /**
   * Retrieves the TreasuryDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TreasuryDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TreasuryDateFilter field
   */
  public String[] getTreasuryDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreasuryDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTreasuryDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTreasuryDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTreasuryDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TreasuryDateFilter filter value from a formatted string
   *
   * @param _value the TreasuryDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TreasuryDateFilter filter field
   */
  public void setTreasuryDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTreasuryDateFilterFromFormattedString");
    try {
      this.setTreasuryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTreasuryDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTreasuryDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TreasuryDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TreasuryDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TreasuryDateFilter field
   */
  public String[] getTreasuryDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreasuryDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTreasuryDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTreasuryDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTreasuryDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TreasuryDateFilter filter value from a formatted string
   *
   * @param _value the TreasuryDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TreasuryDateFilter filter field
   */
  public void setTreasuryDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTreasuryDateFilterFromFormattedDateTimeString");
    try {
      this.setTreasuryDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTreasuryDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTreasuryDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CheckNum (REFUND.check_num)
   * @param fetch whether to fetch this field or not
   */
  public void setCheckNumFetch (boolean fetch) {
    this.CheckNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: CheckNum (REFUND.check_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getCheckNumFetch () {
    return this.CheckNumFetch;
  }
  /** Set the SortOrder for field: CheckNum (REFUND.check_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCheckNumSortOrder (Integer value) {
    this.CheckNumSort = value;
  }
  /** Retrieve SortOrder for field: CheckNum (REFUND.check_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCheckNumSortOrder () {
    return this.CheckNumSort;
  }
  /** Set the sort direction for field: CheckNum (REFUND.check_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCheckNumSortDirection (boolean ascending) {
    this.CheckNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CheckNum (REFUND.check_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCheckNumSortDirection () {
    return this.CheckNumSortAscending;
  }
  /** Set the case insensitive for field: CheckNum (REFUND.check_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCheckNumCaseInsensitive (boolean ascending) {
    this.CheckNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CheckNum (REFUND.check_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCheckNumCaseInsensitive () {
    return this.CheckNumCaseInsensitive;
  }
  /** Set the field level filters for field: CheckNum (REFUND.check_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCheckNumFilter (StringFilter[] value) throws ServiceException {
    this.CheckNum = value;
  }
  /** Retrieve filter for field: CheckNum (REFUND.check_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCheckNumFilter () {
    return this.CheckNum;
  }

  /**
   * Retrieves the CheckNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CheckNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CheckNumFilter field
   */
  public String[] getCheckNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCheckNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCheckNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCheckNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CheckNumFilter filter value from a formatted string
   *
   * @param _value the CheckNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CheckNumFilter filter field
   */
  public void setCheckNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCheckNumFilterFromFormattedString");
    try {
      this.setCheckNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCheckNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCheckNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProfileId (REFUND.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (REFUND.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (REFUND.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (REFUND.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (REFUND.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (REFUND.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (REFUND.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (REFUND.profile_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getProfileIdFilter () {
    return this.ProfileId;
  }

  /**
   * Retrieves the ProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdFilter field
   */
  public String[] getProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdFilter filter value from a formatted string
   *
   * @param _value the ProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdFilter filter field
   */
  public void setProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdFilterFromFormattedString");
    try {
      this.setProfileIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (REFUND.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (REFUND.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (REFUND.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (REFUND.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (REFUND.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (REFUND.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (REFUND.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (REFUND.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LastReviewedName (REFUND.last_reviewed_name)
   * @param fetch whether to fetch this field or not
   */
  public void setLastReviewedNameFetch (boolean fetch) {
    this.LastReviewedNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: LastReviewedName (REFUND.last_reviewed_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getLastReviewedNameFetch () {
    return this.LastReviewedNameFetch;
  }
  /** Set the SortOrder for field: LastReviewedName (REFUND.last_reviewed_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLastReviewedNameSortOrder (Integer value) {
    this.LastReviewedNameSort = value;
  }
  /** Retrieve SortOrder for field: LastReviewedName (REFUND.last_reviewed_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLastReviewedNameSortOrder () {
    return this.LastReviewedNameSort;
  }
  /** Set the sort direction for field: LastReviewedName (REFUND.last_reviewed_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLastReviewedNameSortDirection (boolean ascending) {
    this.LastReviewedNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LastReviewedName (REFUND.last_reviewed_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLastReviewedNameSortDirection () {
    return this.LastReviewedNameSortAscending;
  }
  /** Set the case insensitive for field: LastReviewedName (REFUND.last_reviewed_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setLastReviewedNameCaseInsensitive (boolean ascending) {
    this.LastReviewedNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: LastReviewedName (REFUND.last_reviewed_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getLastReviewedNameCaseInsensitive () {
    return this.LastReviewedNameCaseInsensitive;
  }
  /** Set the field level filters for field: LastReviewedName (REFUND.last_reviewed_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLastReviewedNameFilter (StringFilter[] value) throws ServiceException {
    this.LastReviewedName = value;
  }
  /** Retrieve filter for field: LastReviewedName (REFUND.last_reviewed_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getLastReviewedNameFilter () {
    return this.LastReviewedName;
  }

  /**
   * Retrieves the LastReviewedNameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastReviewedNameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastReviewedNameFilter field
   */
  public String[] getLastReviewedNameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLastReviewedNameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastReviewedNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastReviewedNameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LastReviewedNameFilter filter value from a formatted string
   *
   * @param _value the LastReviewedNameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LastReviewedNameFilter filter field
   */
  public void setLastReviewedNameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
    try {
      this.setLastReviewedNameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastReviewedNameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastReviewedNameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (REFUND.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (REFUND.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (REFUND.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (REFUND.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (REFUND.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (REFUND.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (REFUND.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (REFUND.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltContactId (REFUND.alt_contact_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAltContactIdFetch (boolean fetch) {
    this.AltContactIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltContactId (REFUND.alt_contact_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltContactIdFetch () {
    return this.AltContactIdFetch;
  }
  /** Set the SortOrder for field: AltContactId (REFUND.alt_contact_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltContactIdSortOrder (Integer value) {
    this.AltContactIdSort = value;
  }
  /** Retrieve SortOrder for field: AltContactId (REFUND.alt_contact_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltContactIdSortOrder () {
    return this.AltContactIdSort;
  }
  /** Set the sort direction for field: AltContactId (REFUND.alt_contact_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltContactIdSortDirection (boolean ascending) {
    this.AltContactIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltContactId (REFUND.alt_contact_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltContactIdSortDirection () {
    return this.AltContactIdSortAscending;
  }
  /** Set the field level filters for field: AltContactId (REFUND.alt_contact_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltContactIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AltContactId = value;
  }
  /** Retrieve filter for field: AltContactId (REFUND.alt_contact_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAltContactIdFilter () {
    return this.AltContactId;
  }

  /**
   * Retrieves the AltContactIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltContactIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltContactIdFilter field
   */
  public String[] getAltContactIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltContactIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltContactIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltContactIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltContactIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltContactIdFilter filter value from a formatted string
   *
   * @param _value the AltContactIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltContactIdFilter filter field
   */
  public void setAltContactIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltContactIdFilterFromFormattedString");
    try {
      this.setAltContactIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltContactIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltContactIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltContactIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAltCurrencyCodeFetch (boolean fetch) {
    this.AltCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAltCurrencyCodeFetch () {
    return this.AltCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: AltCurrencyCode (REFUND.alt_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAltCurrencyCodeSortOrder (Integer value) {
    this.AltCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAltCurrencyCodeSortOrder () {
    return this.AltCurrencyCodeSort;
  }
  /** Set the sort direction for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAltCurrencyCodeSortDirection (boolean ascending) {
    this.AltCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAltCurrencyCodeSortDirection () {
    return this.AltCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: AltCurrencyCode (REFUND.alt_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAltCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.AltCurrencyCode = value;
  }
  /** Retrieve filter for field: AltCurrencyCode (REFUND.alt_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAltCurrencyCodeFilter () {
    return this.AltCurrencyCode;
  }

  /**
   * Retrieves the AltCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AltCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCurrencyCodeFilter field
   */
  public String[] getAltCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAltCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AltCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the AltCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AltCurrencyCodeFilter filter field
   */
  public void setAltCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAltCurrencyCodeFilterFromFormattedString");
    try {
      this.setAltCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AltCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCurrentFetch (boolean fetch) {
    this.IsCurrentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCurrentFetch () {
    return this.IsCurrentFetch;
  }
  /** Set the SortOrder for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCurrentSortOrder (Integer value) {
    this.IsCurrentSort = value;
  }
  /** Retrieve SortOrder for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCurrentSortOrder () {
    return this.IsCurrentSort;
  }
  /** Set the sort direction for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCurrentSortDirection (boolean ascending) {
    this.IsCurrentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCurrentSortDirection () {
    return this.IsCurrentSortAscending;
  }
  /** Set the field level filters for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCurrentFilter (BooleanFilter[] value) throws ServiceException {
    this.IsCurrent = value;
  }
  /** Retrieve filter for field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsCurrentFilter () {
    return this.IsCurrent;
  }

  /**
   * Retrieves the IsCurrentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsCurrentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCurrentFilter field
   */
  public String[] getIsCurrentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCurrentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsCurrentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCurrentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCurrentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCurrentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsCurrentFilter filter value from a formatted string
   *
   * @param _value the IsCurrentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsCurrentFilter filter field
   */
  public void setIsCurrentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsCurrentFilterFromFormattedString");
    try {
      this.setIsCurrentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCurrentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCurrentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCurrentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDateFilter () {
    return this.InactiveDate;
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
  }


  public String toString() {
    return RefundObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return RefundObjectHelper.toMap(this, null);
  }
}
