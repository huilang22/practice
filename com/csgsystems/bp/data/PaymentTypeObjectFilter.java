/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTypeObjectFilter.java
 * Definition File: Admin/PaymentType.xml
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
public class PaymentTypeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PaymentTypeObjectKeyFilter Key = null;
  /** raw field for: BMF_TRANS_DESCR.bmf_trans_category) */
  public    IntegerFilter[] BmfTransCategory  = null;
  protected boolean BmfTransCategoryFetch = false;
  protected boolean BmfTransCategorySortAscending = true;
  protected Integer BmfTransCategorySort = null;
  /** raw field for: BMF_TRANS_DESCR.trans_sign) */
  public    IntegerFilter[] TransSign  = null;
  protected boolean TransSignFetch = false;
  protected boolean TransSignSortAscending = true;
  protected Integer TransSignSort = null;
  /** raw field for: BMF_TRANS_DESCR.billing_category) */
  public    IntegerFilter[] BillingCategory  = null;
  protected boolean BillingCategoryFetch = false;
  protected boolean BillingCategorySortAscending = true;
  protected Integer BillingCategorySort = null;
  /** raw field for: BMF_TRANS_DESCR.allow_manual_entry) */
  public    BooleanFilter[] AllowManualEntry  = null;
  protected boolean AllowManualEntryFetch = false;
  protected boolean AllowManualEntrySortAscending = true;
  protected Integer AllowManualEntrySort = null;
  /** raw field for: BMF_TRANS_DESCR.allow_suspense_acnt) */
  public    BooleanFilter[] AllowSuspenseAcnt  = null;
  protected boolean AllowSuspenseAcntFetch = false;
  protected boolean AllowSuspenseAcntSortAscending = true;
  protected Integer AllowSuspenseAcntSort = null;
  /** raw field for: BMF_TRANS_DESCR.is_displayed_onbill) */
  public    BooleanFilter[] IsDisplayedOnbill  = null;
  protected boolean IsDisplayedOnbillFetch = false;
  protected boolean IsDisplayedOnbillSortAscending = true;
  protected Integer IsDisplayedOnbillSort = null;
  /** raw field for: BMF_TRANS_DESCR.is_journalable) */
  public    BooleanFilter[] IsJournalable  = null;
  protected boolean IsJournalableFetch = false;
  protected boolean IsJournalableSortAscending = true;
  protected Integer IsJournalableSort = null;
  /** raw field for: BMF_TRANS_DESCR.allow_autotransfer) */
  public    BooleanFilter[] AllowAutotransfer  = null;
  protected boolean AllowAutotransferFetch = false;
  protected boolean AllowAutotransferSortAscending = true;
  protected Integer AllowAutotransferSort = null;
  /** raw field for: BMF_TRANS_DESCR.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  /** raw field for: DESCRIPTIONS.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: DESCRIPTIONS.description_group) */
  public    IntegerFilter[] DescriptionGroup  = null;
  protected boolean DescriptionGroupFetch = false;
  protected boolean DescriptionGroupSortAscending = true;
  protected Integer DescriptionGroupSort = null;
  /** raw field for: DESCRIPTIONS.description_text) */
  public    StringFilter[] DescriptionText  = null;
  protected boolean DescriptionTextFetch = false;
  protected boolean DescriptionTextSortAscending = true;
  protected boolean DescriptionTextCaseInsensitive = false;
  protected Integer DescriptionTextSort = null;
  /** raw field for: DESCRIPTIONS.short_description_text) */
  public    StringFilter[] ShortDescriptionText  = null;
  protected boolean ShortDescriptionTextFetch = false;
  protected boolean ShortDescriptionTextSortAscending = true;
  protected boolean ShortDescriptionTextCaseInsensitive = false;
  protected Integer ShortDescriptionTextSort = null;
  private String _objName = "PaymentTypeObjectFilter";
  /** default constructor */
  public PaymentTypeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PaymentTypeObjectFilter (PaymentTypeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PaymentTypeObjectKeyFilter (other.Key);
    this.BmfTransCategory = other.BmfTransCategory;
    this.BmfTransCategoryFetch = other.BmfTransCategoryFetch;
    this.BmfTransCategorySort = other.BmfTransCategorySort;
    this.BmfTransCategorySortAscending = other.BmfTransCategorySortAscending;
    this.TransSign = other.TransSign;
    this.TransSignFetch = other.TransSignFetch;
    this.TransSignSort = other.TransSignSort;
    this.TransSignSortAscending = other.TransSignSortAscending;
    this.BillingCategory = other.BillingCategory;
    this.BillingCategoryFetch = other.BillingCategoryFetch;
    this.BillingCategorySort = other.BillingCategorySort;
    this.BillingCategorySortAscending = other.BillingCategorySortAscending;
    this.AllowManualEntry = other.AllowManualEntry;
    this.AllowManualEntryFetch = other.AllowManualEntryFetch;
    this.AllowManualEntrySort = other.AllowManualEntrySort;
    this.AllowManualEntrySortAscending = other.AllowManualEntrySortAscending;
    this.AllowSuspenseAcnt = other.AllowSuspenseAcnt;
    this.AllowSuspenseAcntFetch = other.AllowSuspenseAcntFetch;
    this.AllowSuspenseAcntSort = other.AllowSuspenseAcntSort;
    this.AllowSuspenseAcntSortAscending = other.AllowSuspenseAcntSortAscending;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this.IsDisplayedOnbillFetch = other.IsDisplayedOnbillFetch;
    this.IsDisplayedOnbillSort = other.IsDisplayedOnbillSort;
    this.IsDisplayedOnbillSortAscending = other.IsDisplayedOnbillSortAscending;
    this.IsJournalable = other.IsJournalable;
    this.IsJournalableFetch = other.IsJournalableFetch;
    this.IsJournalableSort = other.IsJournalableSort;
    this.IsJournalableSortAscending = other.IsJournalableSortAscending;
    this.AllowAutotransfer = other.AllowAutotransfer;
    this.AllowAutotransferFetch = other.AllowAutotransferFetch;
    this.AllowAutotransferSort = other.AllowAutotransferSort;
    this.AllowAutotransferSortAscending = other.AllowAutotransferSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.DescriptionGroup = other.DescriptionGroup;
    this.DescriptionGroupFetch = other.DescriptionGroupFetch;
    this.DescriptionGroupSort = other.DescriptionGroupSort;
    this.DescriptionGroupSortAscending = other.DescriptionGroupSortAscending;
    this.DescriptionText = other.DescriptionText;
    this.DescriptionTextFetch = other.DescriptionTextFetch;
    this.DescriptionTextSort = other.DescriptionTextSort;
    this.DescriptionTextCaseInsensitive = other.DescriptionTextCaseInsensitive;
    this.DescriptionTextSortAscending = other.DescriptionTextSortAscending;
    this.ShortDescriptionText = other.ShortDescriptionText;
    this.ShortDescriptionTextFetch = other.ShortDescriptionTextFetch;
    this.ShortDescriptionTextSort = other.ShortDescriptionTextSort;
    this.ShortDescriptionTextCaseInsensitive = other.ShortDescriptionTextCaseInsensitive;
    this.ShortDescriptionTextSortAscending = other.ShortDescriptionTextSortAscending;  }
  /** get the filter for this object's key
   * @return PaymentTypeObjectKeyFilter
   */
  public PaymentTypeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PaymentTypeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.BmfTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTransTypeFetch;
  }
  /** Set the SortOrder for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.BmfTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTransTypeSort;
  }
  /** Set the sort direction for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.BmfTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BmfTransTypeSortAscending;
  }
  /** Set the field level filters for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.BmfTransType = value;
  }
  /** Retrieve filter for field: BmfTransType (BMF_TRANS_DESCR.bmf_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BmfTransType;
  }
  /** Set the field level Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (DESCRIPTIONS.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PaymentTypeObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransCategoryFetch (boolean fetch) {
    this.BmfTransCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransCategoryFetch () {
    return this.BmfTransCategoryFetch;
  }
  /** Set the SortOrder for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransCategorySortOrder (Integer value) {
    this.BmfTransCategorySort = value;
  }
  /** Retrieve SortOrder for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransCategorySortOrder () {
    return this.BmfTransCategorySort;
  }
  /** Set the sort direction for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransCategorySortDirection (boolean ascending) {
    this.BmfTransCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransCategorySortDirection () {
    return this.BmfTransCategorySortAscending;
  }
  /** Set the field level filters for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTransCategory = value;
  }
  /** Retrieve filter for field: BmfTransCategory (BMF_TRANS_DESCR.bmf_trans_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransCategoryFilter () {
    return this.BmfTransCategory;
  }

  /**
   * Retrieves the BmfTransCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTransCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransCategoryFilter field
   */
  public String[] getBmfTransCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTransCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTransCategoryFilter filter value from a formatted string
   *
   * @param _value the BmfTransCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransCategoryFilter filter field
   */
  public void setBmfTransCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransCategoryFilterFromFormattedString");
    try {
      this.setBmfTransCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSignFetch (boolean fetch) {
    this.TransSignFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSignFetch () {
    return this.TransSignFetch;
  }
  /** Set the SortOrder for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSignSortOrder (Integer value) {
    this.TransSignSort = value;
  }
  /** Retrieve SortOrder for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSignSortOrder () {
    return this.TransSignSort;
  }
  /** Set the sort direction for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSignSortDirection (boolean ascending) {
    this.TransSignSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSignSortDirection () {
    return this.TransSignSortAscending;
  }
  /** Set the field level filters for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSignFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSign = value;
  }
  /** Retrieve filter for field: TransSign (BMF_TRANS_DESCR.trans_sign)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransSignFilter () {
    return this.TransSign;
  }

  /**
   * Retrieves the TransSignFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSignFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSignFilter field
   */
  public String[] getTransSignFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSignFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSignFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSignFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSignFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSignFilter filter value from a formatted string
   *
   * @param _value the TransSignFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSignFilter filter field
   */
  public void setTransSignFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSignFilterFromFormattedString");
    try {
      this.setTransSignFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSignFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSignFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSignFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingCategoryFetch (boolean fetch) {
    this.BillingCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingCategoryFetch () {
    return this.BillingCategoryFetch;
  }
  /** Set the SortOrder for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingCategorySortOrder (Integer value) {
    this.BillingCategorySort = value;
  }
  /** Retrieve SortOrder for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingCategorySortOrder () {
    return this.BillingCategorySort;
  }
  /** Set the sort direction for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingCategorySortDirection (boolean ascending) {
    this.BillingCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingCategorySortDirection () {
    return this.BillingCategorySortAscending;
  }
  /** Set the field level filters for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingCategory = value;
  }
  /** Retrieve filter for field: BillingCategory (BMF_TRANS_DESCR.billing_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingCategoryFilter () {
    return this.BillingCategory;
  }

  /**
   * Retrieves the BillingCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingCategoryFilter field
   */
  public String[] getBillingCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingCategoryFilter filter value from a formatted string
   *
   * @param _value the BillingCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingCategoryFilter filter field
   */
  public void setBillingCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingCategoryFilterFromFormattedString");
    try {
      this.setBillingCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowManualEntryFetch (boolean fetch) {
    this.AllowManualEntryFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowManualEntryFetch () {
    return this.AllowManualEntryFetch;
  }
  /** Set the SortOrder for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowManualEntrySortOrder (Integer value) {
    this.AllowManualEntrySort = value;
  }
  /** Retrieve SortOrder for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowManualEntrySortOrder () {
    return this.AllowManualEntrySort;
  }
  /** Set the sort direction for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowManualEntrySortDirection (boolean ascending) {
    this.AllowManualEntrySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowManualEntrySortDirection () {
    return this.AllowManualEntrySortAscending;
  }
  /** Set the field level filters for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowManualEntryFilter (BooleanFilter[] value) throws ServiceException {
    this.AllowManualEntry = value;
  }
  /** Retrieve filter for field: AllowManualEntry (BMF_TRANS_DESCR.allow_manual_entry)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAllowManualEntryFilter () {
    return this.AllowManualEntry;
  }

  /**
   * Retrieves the AllowManualEntryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowManualEntryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowManualEntryFilter field
   */
  public String[] getAllowManualEntryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowManualEntryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowManualEntryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowManualEntryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowManualEntryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowManualEntryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowManualEntryFilter filter value from a formatted string
   *
   * @param _value the AllowManualEntryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowManualEntryFilter filter field
   */
  public void setAllowManualEntryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowManualEntryFilterFromFormattedString");
    try {
      this.setAllowManualEntryFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowManualEntryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowManualEntryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowManualEntryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowSuspenseAcntFetch (boolean fetch) {
    this.AllowSuspenseAcntFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowSuspenseAcntFetch () {
    return this.AllowSuspenseAcntFetch;
  }
  /** Set the SortOrder for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowSuspenseAcntSortOrder (Integer value) {
    this.AllowSuspenseAcntSort = value;
  }
  /** Retrieve SortOrder for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowSuspenseAcntSortOrder () {
    return this.AllowSuspenseAcntSort;
  }
  /** Set the sort direction for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowSuspenseAcntSortDirection (boolean ascending) {
    this.AllowSuspenseAcntSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowSuspenseAcntSortDirection () {
    return this.AllowSuspenseAcntSortAscending;
  }
  /** Set the field level filters for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowSuspenseAcntFilter (BooleanFilter[] value) throws ServiceException {
    this.AllowSuspenseAcnt = value;
  }
  /** Retrieve filter for field: AllowSuspenseAcnt (BMF_TRANS_DESCR.allow_suspense_acnt)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAllowSuspenseAcntFilter () {
    return this.AllowSuspenseAcnt;
  }

  /**
   * Retrieves the AllowSuspenseAcntFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowSuspenseAcntFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowSuspenseAcntFilter field
   */
  public String[] getAllowSuspenseAcntFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowSuspenseAcntFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowSuspenseAcntFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowSuspenseAcntFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowSuspenseAcntFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowSuspenseAcntFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowSuspenseAcntFilter filter value from a formatted string
   *
   * @param _value the AllowSuspenseAcntFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowSuspenseAcntFilter filter field
   */
  public void setAllowSuspenseAcntFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowSuspenseAcntFilterFromFormattedString");
    try {
      this.setAllowSuspenseAcntFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowSuspenseAcntFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowSuspenseAcntFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowSuspenseAcntFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDisplayedOnbillFetch (boolean fetch) {
    this.IsDisplayedOnbillFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDisplayedOnbillFetch () {
    return this.IsDisplayedOnbillFetch;
  }
  /** Set the SortOrder for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDisplayedOnbillSortOrder (Integer value) {
    this.IsDisplayedOnbillSort = value;
  }
  /** Retrieve SortOrder for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDisplayedOnbillSortOrder () {
    return this.IsDisplayedOnbillSort;
  }
  /** Set the sort direction for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDisplayedOnbillSortDirection (boolean ascending) {
    this.IsDisplayedOnbillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDisplayedOnbillSortDirection () {
    return this.IsDisplayedOnbillSortAscending;
  }
  /** Set the field level filters for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDisplayedOnbillFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDisplayedOnbill = value;
  }
  /** Retrieve filter for field: IsDisplayedOnbill (BMF_TRANS_DESCR.is_displayed_onbill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDisplayedOnbillFilter () {
    return this.IsDisplayedOnbill;
  }

  /**
   * Retrieves the IsDisplayedOnbillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDisplayedOnbillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisplayedOnbillFilter field
   */
  public String[] getIsDisplayedOnbillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDisplayedOnbillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisplayedOnbillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisplayedOnbillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDisplayedOnbillFilter filter value from a formatted string
   *
   * @param _value the IsDisplayedOnbillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDisplayedOnbillFilter filter field
   */
  public void setIsDisplayedOnbillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
    try {
      this.setIsDisplayedOnbillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisplayedOnbillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisplayedOnbillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsJournalableFetch (boolean fetch) {
    this.IsJournalableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsJournalableFetch () {
    return this.IsJournalableFetch;
  }
  /** Set the SortOrder for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsJournalableSortOrder (Integer value) {
    this.IsJournalableSort = value;
  }
  /** Retrieve SortOrder for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsJournalableSortOrder () {
    return this.IsJournalableSort;
  }
  /** Set the sort direction for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsJournalableSortDirection (boolean ascending) {
    this.IsJournalableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsJournalableSortDirection () {
    return this.IsJournalableSortAscending;
  }
  /** Set the field level filters for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsJournalableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsJournalable = value;
  }
  /** Retrieve filter for field: IsJournalable (BMF_TRANS_DESCR.is_journalable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsJournalableFilter () {
    return this.IsJournalable;
  }

  /**
   * Retrieves the IsJournalableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsJournalableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsJournalableFilter field
   */
  public String[] getIsJournalableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsJournalableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsJournalableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsJournalableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsJournalableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsJournalableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsJournalableFilter filter value from a formatted string
   *
   * @param _value the IsJournalableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsJournalableFilter filter field
   */
  public void setIsJournalableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsJournalableFilterFromFormattedString");
    try {
      this.setIsJournalableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsJournalableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsJournalableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsJournalableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowAutotransferFetch (boolean fetch) {
    this.AllowAutotransferFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowAutotransferFetch () {
    return this.AllowAutotransferFetch;
  }
  /** Set the SortOrder for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowAutotransferSortOrder (Integer value) {
    this.AllowAutotransferSort = value;
  }
  /** Retrieve SortOrder for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowAutotransferSortOrder () {
    return this.AllowAutotransferSort;
  }
  /** Set the sort direction for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowAutotransferSortDirection (boolean ascending) {
    this.AllowAutotransferSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowAutotransferSortDirection () {
    return this.AllowAutotransferSortAscending;
  }
  /** Set the field level filters for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowAutotransferFilter (BooleanFilter[] value) throws ServiceException {
    this.AllowAutotransfer = value;
  }
  /** Retrieve filter for field: AllowAutotransfer (BMF_TRANS_DESCR.allow_autotransfer)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAllowAutotransferFilter () {
    return this.AllowAutotransfer;
  }

  /**
   * Retrieves the AllowAutotransferFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowAutotransferFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAutotransferFilter field
   */
  public String[] getAllowAutotransferFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAutotransferFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowAutotransferFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAutotransferFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAutotransferFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAutotransferFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowAutotransferFilter filter value from a formatted string
   *
   * @param _value the AllowAutotransferFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowAutotransferFilter filter field
   */
  public void setAllowAutotransferFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowAutotransferFilterFromFormattedString");
    try {
      this.setAllowAutotransferFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAutotransferFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAutotransferFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAutotransferFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (BMF_TRANS_DESCR.config_tag_id)
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

  /** Set the field level Fetch value for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (DESCRIPTIONS.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (DESCRIPTIONS.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (DESCRIPTIONS.description_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDescriptionCodeFilter () {
    return this.DescriptionCode;
  }

  /**
   * Retrieves the DescriptionCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCodeFilter field
   */
  public String[] getDescriptionCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionCodeFilter filter value from a formatted string
   *
   * @param _value the DescriptionCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionCodeFilter filter field
   */
  public void setDescriptionCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
    try {
      this.setDescriptionCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionGroupFetch (boolean fetch) {
    this.DescriptionGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionGroupFetch () {
    return this.DescriptionGroupFetch;
  }
  /** Set the SortOrder for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionGroupSortOrder (Integer value) {
    this.DescriptionGroupSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionGroupSortOrder () {
    return this.DescriptionGroupSort;
  }
  /** Set the sort direction for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionGroupSortDirection (boolean ascending) {
    this.DescriptionGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionGroupSortDirection () {
    return this.DescriptionGroupSortAscending;
  }
  /** Set the field level filters for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionGroupFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionGroup = value;
  }
  /** Retrieve filter for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDescriptionGroupFilter () {
    return this.DescriptionGroup;
  }

  /**
   * Retrieves the DescriptionGroupFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionGroupFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionGroupFilter field
   */
  public String[] getDescriptionGroupFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionGroupFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionGroupFilter filter value from a formatted string
   *
   * @param _value the DescriptionGroupFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionGroupFilter filter field
   */
  public void setDescriptionGroupFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
    try {
      this.setDescriptionGroupFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionTextFetch (boolean fetch) {
    this.DescriptionTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionTextFetch () {
    return this.DescriptionTextFetch;
  }
  /** Set the SortOrder for field: DescriptionText (DESCRIPTIONS.description_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionTextSortOrder (Integer value) {
    this.DescriptionTextSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionTextSortOrder () {
    return this.DescriptionTextSort;
  }
  /** Set the sort direction for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionTextSortDirection (boolean ascending) {
    this.DescriptionTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionTextSortDirection () {
    return this.DescriptionTextSortAscending;
  }
  /** Set the case insensitive for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDescriptionTextCaseInsensitive (boolean ascending) {
    this.DescriptionTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDescriptionTextCaseInsensitive () {
    return this.DescriptionTextCaseInsensitive;
  }
  /** Set the field level filters for field: DescriptionText (DESCRIPTIONS.description_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionTextFilter (StringFilter[] value) throws ServiceException {
    this.DescriptionText = value;
  }
  /** Retrieve filter for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDescriptionTextFilter () {
    return this.DescriptionText;
  }

  /**
   * Retrieves the DescriptionTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionTextFilter field
   */
  public String[] getDescriptionTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionTextFilter filter value from a formatted string
   *
   * @param _value the DescriptionTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionTextFilter filter field
   */
  public void setDescriptionTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionTextFilterFromFormattedString");
    try {
      this.setDescriptionTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionTextFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDescriptionTextFetch (boolean fetch) {
    this.ShortDescriptionTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDescriptionTextFetch () {
    return this.ShortDescriptionTextFetch;
  }
  /** Set the SortOrder for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDescriptionTextSortOrder (Integer value) {
    this.ShortDescriptionTextSort = value;
  }
  /** Retrieve SortOrder for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDescriptionTextSortOrder () {
    return this.ShortDescriptionTextSort;
  }
  /** Set the sort direction for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDescriptionTextSortDirection (boolean ascending) {
    this.ShortDescriptionTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDescriptionTextSortDirection () {
    return this.ShortDescriptionTextSortAscending;
  }
  /** Set the case insensitive for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDescriptionTextCaseInsensitive (boolean ascending) {
    this.ShortDescriptionTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDescriptionTextCaseInsensitive () {
    return this.ShortDescriptionTextCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDescriptionTextFilter (StringFilter[] value) throws ServiceException {
    this.ShortDescriptionText = value;
  }
  /** Retrieve filter for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDescriptionTextFilter () {
    return this.ShortDescriptionText;
  }

  /**
   * Retrieves the ShortDescriptionTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDescriptionTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDescriptionTextFilter field
   */
  public String[] getShortDescriptionTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDescriptionTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDescriptionTextFilter filter value from a formatted string
   *
   * @param _value the ShortDescriptionTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDescriptionTextFilter filter field
   */
  public void setShortDescriptionTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
    try {
      this.setShortDescriptionTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
  }

  public String toString() {
    return PaymentTypeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PaymentTypeObjectHelper.toMap(this, null);
  }
}
