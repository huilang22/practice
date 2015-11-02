/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTypeObjectFilter.java
 * Definition File: Admin/AdjustmentType.xml
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class AdjustmentTypeObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AdjustmentTypeObjectKeyFilter Key = null;
  /** raw field for: ADJ_TRANS_DESCR.trans_target_type) */
  public    IntegerFilter[] TransTargetType  = null;
  protected boolean TransTargetTypeFetch = false;
  protected boolean TransTargetTypeSortAscending = true;
  protected Integer TransTargetTypeSort = null;
  /** raw field for: ADJ_TRANS_DESCR.trans_target_id) */
  public    IntegerFilter[] TransTargetId  = null;
  protected boolean TransTargetIdFetch = false;
  protected boolean TransTargetIdSortAscending = true;
  protected Integer TransTargetIdSort = null;
  /** raw field for: ADJ_TRANS_DESCR.adj_trans_category) */
  public    IntegerFilter[] TransCategory  = null;
  protected boolean TransCategoryFetch = false;
  protected boolean TransCategorySortAscending = true;
  protected Integer TransCategorySort = null;
  /** raw field for: ADJ_TRANS_DESCR.trans_sign) */
  public    IntegerFilter[] TransSign  = null;
  protected boolean TransSignFetch = false;
  protected boolean TransSignSortAscending = true;
  protected Integer TransSignSort = null;
  /** raw field for: ADJ_TRANS_DESCR.billing_category) */
  public    IntegerFilter[] BillingCategory  = null;
  protected boolean BillingCategoryFetch = false;
  protected boolean BillingCategorySortAscending = true;
  protected Integer BillingCategorySort = null;
  /** raw field for: ADJ_TRANS_DESCR.billing_level) */
  public    IntegerFilter[] BillingLevel  = null;
  protected boolean BillingLevelFetch = false;
  protected boolean BillingLevelSortAscending = true;
  protected Integer BillingLevelSort = null;
  /** raw field for: ADJ_TRANS_DESCR.tax_class) */
  public    IntegerFilter[] TaxClass  = null;
  protected boolean TaxClassFetch = false;
  protected boolean TaxClassSortAscending = true;
  protected Integer TaxClassSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_viewable) */
  public    BooleanFilter[] IsViewable  = null;
  protected boolean IsViewableFetch = false;
  protected boolean IsViewableSortAscending = true;
  protected Integer IsViewableSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_modifiable) */
  public    BooleanFilter[] IsModifiable  = null;
  protected boolean IsModifiableFetch = false;
  protected boolean IsModifiableSortAscending = true;
  protected Integer IsModifiableSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_adjustable) */
  public    BooleanFilter[] IsAdjustable  = null;
  protected boolean IsAdjustableFetch = false;
  protected boolean IsAdjustableSortAscending = true;
  protected Integer IsAdjustableSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_journalable) */
  public    BooleanFilter[] IsJournalable  = null;
  protected boolean IsJournalableFetch = false;
  protected boolean IsJournalableSortAscending = true;
  protected Integer IsJournalableSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_displayed_onbill) */
  public    BooleanFilter[] IsDisplayedOnbill  = null;
  protected boolean IsDisplayedOnbillFetch = false;
  protected boolean IsDisplayedOnbillSortAscending = true;
  protected Integer IsDisplayedOnbillSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_disconnect_credit) */
  public    BooleanFilter[] IsDisconnectCredit  = null;
  protected boolean IsDisconnectCreditFetch = false;
  protected boolean IsDisconnectCreditSortAscending = true;
  protected Integer IsDisconnectCreditSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_refinance) */
  public    BooleanFilter[] IsRefinance  = null;
  protected boolean IsRefinanceFetch = false;
  protected boolean IsRefinanceSortAscending = true;
  protected Integer IsRefinanceSort = null;
  /** raw field for: ADJ_TRANS_DESCR.annotation_type) */
  public    IntegerFilter[] AnnotationType  = null;
  protected boolean AnnotationTypeFetch = false;
  protected boolean AnnotationTypeSortAscending = true;
  protected Integer AnnotationTypeSort = null;
  /** raw field for: ADJ_TRANS_DESCR.tax_on_invoice) */
  public    BooleanFilter[] TaxOnInvoice  = null;
  protected boolean TaxOnInvoiceFetch = false;
  protected boolean TaxOnInvoiceSortAscending = true;
  protected Integer TaxOnInvoiceSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_late_fee_exempt) */
  public    BooleanFilter[] IsLateFeeExempt  = null;
  protected boolean IsLateFeeExemptFetch = false;
  protected boolean IsLateFeeExemptSortAscending = true;
  protected Integer IsLateFeeExemptSort = null;
  /** raw field for: ADJ_TRANS_DESCR.allow_interim_bill) */
  public    BooleanFilter[] AllowInterimBill  = null;
  protected boolean AllowInterimBillFetch = false;
  protected boolean AllowInterimBillSortAscending = true;
  protected Integer AllowInterimBillSort = null;
  /** raw field for: ADJ_TRANS_DESCR.is_negative_bill_adj) */
  public    BooleanFilter[] IsNegativeBillAdj  = null;
  protected boolean IsNegativeBillAdjFetch = false;
  protected boolean IsNegativeBillAdjSortAscending = true;
  protected Integer IsNegativeBillAdjSort = null;
  /** raw field for: ADJ_TRANS_DESCR.config_tag_id) */
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
  private String _objName = "AdjustmentTypeObjectFilter";
  /** default constructor */
  public AdjustmentTypeObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AdjustmentTypeObjectFilter (AdjustmentTypeObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AdjustmentTypeObjectKeyFilter (other.Key);
    this.TransTargetType = other.TransTargetType;
    this.TransTargetTypeFetch = other.TransTargetTypeFetch;
    this.TransTargetTypeSort = other.TransTargetTypeSort;
    this.TransTargetTypeSortAscending = other.TransTargetTypeSortAscending;
    this.TransTargetId = other.TransTargetId;
    this.TransTargetIdFetch = other.TransTargetIdFetch;
    this.TransTargetIdSort = other.TransTargetIdSort;
    this.TransTargetIdSortAscending = other.TransTargetIdSortAscending;
    this.TransCategory = other.TransCategory;
    this.TransCategoryFetch = other.TransCategoryFetch;
    this.TransCategorySort = other.TransCategorySort;
    this.TransCategorySortAscending = other.TransCategorySortAscending;
    this.TransSign = other.TransSign;
    this.TransSignFetch = other.TransSignFetch;
    this.TransSignSort = other.TransSignSort;
    this.TransSignSortAscending = other.TransSignSortAscending;
    this.BillingCategory = other.BillingCategory;
    this.BillingCategoryFetch = other.BillingCategoryFetch;
    this.BillingCategorySort = other.BillingCategorySort;
    this.BillingCategorySortAscending = other.BillingCategorySortAscending;
    this.BillingLevel = other.BillingLevel;
    this.BillingLevelFetch = other.BillingLevelFetch;
    this.BillingLevelSort = other.BillingLevelSort;
    this.BillingLevelSortAscending = other.BillingLevelSortAscending;
    this.TaxClass = other.TaxClass;
    this.TaxClassFetch = other.TaxClassFetch;
    this.TaxClassSort = other.TaxClassSort;
    this.TaxClassSortAscending = other.TaxClassSortAscending;
    this.IsViewable = other.IsViewable;
    this.IsViewableFetch = other.IsViewableFetch;
    this.IsViewableSort = other.IsViewableSort;
    this.IsViewableSortAscending = other.IsViewableSortAscending;
    this.IsModifiable = other.IsModifiable;
    this.IsModifiableFetch = other.IsModifiableFetch;
    this.IsModifiableSort = other.IsModifiableSort;
    this.IsModifiableSortAscending = other.IsModifiableSortAscending;
    this.IsAdjustable = other.IsAdjustable;
    this.IsAdjustableFetch = other.IsAdjustableFetch;
    this.IsAdjustableSort = other.IsAdjustableSort;
    this.IsAdjustableSortAscending = other.IsAdjustableSortAscending;
    this.IsJournalable = other.IsJournalable;
    this.IsJournalableFetch = other.IsJournalableFetch;
    this.IsJournalableSort = other.IsJournalableSort;
    this.IsJournalableSortAscending = other.IsJournalableSortAscending;
    this.IsDisplayedOnbill = other.IsDisplayedOnbill;
    this.IsDisplayedOnbillFetch = other.IsDisplayedOnbillFetch;
    this.IsDisplayedOnbillSort = other.IsDisplayedOnbillSort;
    this.IsDisplayedOnbillSortAscending = other.IsDisplayedOnbillSortAscending;
    this.IsDisconnectCredit = other.IsDisconnectCredit;
    this.IsDisconnectCreditFetch = other.IsDisconnectCreditFetch;
    this.IsDisconnectCreditSort = other.IsDisconnectCreditSort;
    this.IsDisconnectCreditSortAscending = other.IsDisconnectCreditSortAscending;
    this.IsRefinance = other.IsRefinance;
    this.IsRefinanceFetch = other.IsRefinanceFetch;
    this.IsRefinanceSort = other.IsRefinanceSort;
    this.IsRefinanceSortAscending = other.IsRefinanceSortAscending;
    this.AnnotationType = other.AnnotationType;
    this.AnnotationTypeFetch = other.AnnotationTypeFetch;
    this.AnnotationTypeSort = other.AnnotationTypeSort;
    this.AnnotationTypeSortAscending = other.AnnotationTypeSortAscending;
    this.TaxOnInvoice = other.TaxOnInvoice;
    this.TaxOnInvoiceFetch = other.TaxOnInvoiceFetch;
    this.TaxOnInvoiceSort = other.TaxOnInvoiceSort;
    this.TaxOnInvoiceSortAscending = other.TaxOnInvoiceSortAscending;
    this.IsLateFeeExempt = other.IsLateFeeExempt;
    this.IsLateFeeExemptFetch = other.IsLateFeeExemptFetch;
    this.IsLateFeeExemptSort = other.IsLateFeeExemptSort;
    this.IsLateFeeExemptSortAscending = other.IsLateFeeExemptSortAscending;
    this.AllowInterimBill = other.AllowInterimBill;
    this.AllowInterimBillFetch = other.AllowInterimBillFetch;
    this.AllowInterimBillSort = other.AllowInterimBillSort;
    this.AllowInterimBillSortAscending = other.AllowInterimBillSortAscending;
    this.IsNegativeBillAdj = other.IsNegativeBillAdj;
    this.IsNegativeBillAdjFetch = other.IsNegativeBillAdjFetch;
    this.IsNegativeBillAdjSort = other.IsNegativeBillAdjSort;
    this.IsNegativeBillAdjSortAscending = other.IsNegativeBillAdjSortAscending;
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
   * @return AdjustmentTypeObjectKeyFilter
   */
  public AdjustmentTypeObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AdjustmentTypeObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTransCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
    this.Key.TransCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TransCodeFetch;
  }
  /** Set the SortOrder for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
    this.Key.TransCodeSort = value;
  }
  /** Retrieve SortOrder for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TransCodeSort;
  }
  /** Set the sort direction for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
    this.Key.TransCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TransCodeSortAscending;
  }
  /** Set the field level filters for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
    this.Key.TransCode = value;
  }
  /** Retrieve filter for field: TransCode (ADJ_TRANS_DESCR.adj_trans_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TransCode;
  }
  /** Set the field level Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new AdjustmentTypeObjectKeyFilter ();
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
  /** Set the field level Fetch value for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @param fetch whether to fetch this field or not
   */
  public void setTransTargetTypeFetch (boolean fetch) {
    this.TransTargetTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransTargetTypeFetch () {
    return this.TransTargetTypeFetch;
  }
  /** Set the SortOrder for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransTargetTypeSortOrder (Integer value) {
    this.TransTargetTypeSort = value;
  }
  /** Retrieve SortOrder for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransTargetTypeSortOrder () {
    return this.TransTargetTypeSort;
  }
  /** Set the sort direction for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransTargetTypeSortDirection (boolean ascending) {
    this.TransTargetTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransTargetTypeSortDirection () {
    return this.TransTargetTypeSortAscending;
  }
  /** Set the field level filters for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransTargetTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.TransTargetType = value;
  }
  /** Retrieve filter for field: TransTargetType (ADJ_TRANS_DESCR.trans_target_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransTargetTypeFilter () {
    return this.TransTargetType;
  }

  /**
   * Retrieves the TransTargetTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransTargetTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTargetTypeFilter field
   */
  public String[] getTransTargetTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransTargetTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTargetTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransTargetTypeFilter filter value from a formatted string
   *
   * @param _value the TransTargetTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransTargetTypeFilter filter field
   */
  public void setTransTargetTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
    try {
      this.setTransTargetTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTargetTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTransTargetIdFetch (boolean fetch) {
    this.TransTargetIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransTargetIdFetch () {
    return this.TransTargetIdFetch;
  }
  /** Set the SortOrder for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransTargetIdSortOrder (Integer value) {
    this.TransTargetIdSort = value;
  }
  /** Retrieve SortOrder for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransTargetIdSortOrder () {
    return this.TransTargetIdSort;
  }
  /** Set the sort direction for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransTargetIdSortDirection (boolean ascending) {
    this.TransTargetIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransTargetIdSortDirection () {
    return this.TransTargetIdSortAscending;
  }
  /** Set the field level filters for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransTargetIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TransTargetId = value;
  }
  /** Retrieve filter for field: TransTargetId (ADJ_TRANS_DESCR.trans_target_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransTargetIdFilter () {
    return this.TransTargetId;
  }

  /**
   * Retrieves the TransTargetIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransTargetIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransTargetIdFilter field
   */
  public String[] getTransTargetIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransTargetIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransTargetIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransTargetIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransTargetIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransTargetIdFilter filter value from a formatted string
   *
   * @param _value the TransTargetIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransTargetIdFilter filter field
   */
  public void setTransTargetIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransTargetIdFilterFromFormattedString");
    try {
      this.setTransTargetIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransTargetIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransTargetIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransTargetIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @param fetch whether to fetch this field or not
   */
  public void setTransCategoryFetch (boolean fetch) {
    this.TransCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransCategoryFetch () {
    return this.TransCategoryFetch;
  }
  /** Set the SortOrder for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransCategorySortOrder (Integer value) {
    this.TransCategorySort = value;
  }
  /** Retrieve SortOrder for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransCategorySortOrder () {
    return this.TransCategorySort;
  }
  /** Set the sort direction for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransCategorySortDirection (boolean ascending) {
    this.TransCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransCategorySortDirection () {
    return this.TransCategorySortAscending;
  }
  /** Set the field level filters for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.TransCategory = value;
  }
  /** Retrieve filter for field: TransCategory (ADJ_TRANS_DESCR.adj_trans_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransCategoryFilter () {
    return this.TransCategory;
  }

  /**
   * Retrieves the TransCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransCategoryFilter field
   */
  public String[] getTransCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransCategoryFilter filter value from a formatted string
   *
   * @param _value the TransCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransCategoryFilter filter field
   */
  public void setTransCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransCategoryFilterFromFormattedString");
    try {
      this.setTransCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSignFetch (boolean fetch) {
    this.TransSignFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSignFetch () {
    return this.TransSignFetch;
  }
  /** Set the SortOrder for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSignSortOrder (Integer value) {
    this.TransSignSort = value;
  }
  /** Retrieve SortOrder for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSignSortOrder () {
    return this.TransSignSort;
  }
  /** Set the sort direction for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSignSortDirection (boolean ascending) {
    this.TransSignSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSignSortDirection () {
    return this.TransSignSortAscending;
  }
  /** Set the field level filters for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSignFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSign = value;
  }
  /** Retrieve filter for field: TransSign (ADJ_TRANS_DESCR.trans_sign)
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

  /** Set the field level Fetch value for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingCategoryFetch (boolean fetch) {
    this.BillingCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingCategoryFetch () {
    return this.BillingCategoryFetch;
  }
  /** Set the SortOrder for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingCategorySortOrder (Integer value) {
    this.BillingCategorySort = value;
  }
  /** Retrieve SortOrder for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingCategorySortOrder () {
    return this.BillingCategorySort;
  }
  /** Set the sort direction for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingCategorySortDirection (boolean ascending) {
    this.BillingCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingCategorySortDirection () {
    return this.BillingCategorySortAscending;
  }
  /** Set the field level filters for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingCategory = value;
  }
  /** Retrieve filter for field: BillingCategory (ADJ_TRANS_DESCR.billing_category)
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

  /** Set the field level Fetch value for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingLevelFetch (boolean fetch) {
    this.BillingLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingLevelFetch () {
    return this.BillingLevelFetch;
  }
  /** Set the SortOrder for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingLevelSortOrder (Integer value) {
    this.BillingLevelSort = value;
  }
  /** Retrieve SortOrder for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingLevelSortOrder () {
    return this.BillingLevelSort;
  }
  /** Set the sort direction for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingLevelSortDirection (boolean ascending) {
    this.BillingLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingLevelSortDirection () {
    return this.BillingLevelSortAscending;
  }
  /** Set the field level filters for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingLevel = value;
  }
  /** Retrieve filter for field: BillingLevel (ADJ_TRANS_DESCR.billing_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingLevelFilter () {
    return this.BillingLevel;
  }

  /**
   * Retrieves the BillingLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingLevelFilter field
   */
  public String[] getBillingLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingLevelFilter filter value from a formatted string
   *
   * @param _value the BillingLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingLevelFilter filter field
   */
  public void setBillingLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingLevelFilterFromFormattedString");
    try {
      this.setBillingLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxClassFetch (boolean fetch) {
    this.TaxClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxClassFetch () {
    return this.TaxClassFetch;
  }
  /** Set the SortOrder for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxClassSortOrder (Integer value) {
    this.TaxClassSort = value;
  }
  /** Retrieve SortOrder for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxClassSortOrder () {
    return this.TaxClassSort;
  }
  /** Set the sort direction for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxClassSortDirection (boolean ascending) {
    this.TaxClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxClassSortDirection () {
    return this.TaxClassSortAscending;
  }
  /** Set the field level filters for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxClassFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxClass = value;
  }
  /** Retrieve filter for field: TaxClass (ADJ_TRANS_DESCR.tax_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxClassFilter () {
    return this.TaxClass;
  }

  /**
   * Retrieves the TaxClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxClassFilter field
   */
  public String[] getTaxClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxClassFilter filter value from a formatted string
   *
   * @param _value the TaxClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxClassFilter filter field
   */
  public void setTaxClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxClassFilterFromFormattedString");
    try {
      this.setTaxClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsViewableFetch (boolean fetch) {
    this.IsViewableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsViewableFetch () {
    return this.IsViewableFetch;
  }
  /** Set the SortOrder for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsViewableSortOrder (Integer value) {
    this.IsViewableSort = value;
  }
  /** Retrieve SortOrder for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsViewableSortOrder () {
    return this.IsViewableSort;
  }
  /** Set the sort direction for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsViewableSortDirection (boolean ascending) {
    this.IsViewableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsViewableSortDirection () {
    return this.IsViewableSortAscending;
  }
  /** Set the field level filters for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsViewableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsViewable = value;
  }
  /** Retrieve filter for field: IsViewable (ADJ_TRANS_DESCR.is_viewable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsViewableFilter () {
    return this.IsViewable;
  }

  /**
   * Retrieves the IsViewableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsViewableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsViewableFilter field
   */
  public String[] getIsViewableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsViewableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsViewableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsViewableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsViewableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsViewableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsViewableFilter filter value from a formatted string
   *
   * @param _value the IsViewableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsViewableFilter filter field
   */
  public void setIsViewableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsViewableFilterFromFormattedString");
    try {
      this.setIsViewableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsViewableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsViewableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsViewableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsModifiableFetch (boolean fetch) {
    this.IsModifiableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsModifiableFetch () {
    return this.IsModifiableFetch;
  }
  /** Set the SortOrder for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsModifiableSortOrder (Integer value) {
    this.IsModifiableSort = value;
  }
  /** Retrieve SortOrder for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsModifiableSortOrder () {
    return this.IsModifiableSort;
  }
  /** Set the sort direction for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsModifiableSortDirection (boolean ascending) {
    this.IsModifiableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsModifiableSortDirection () {
    return this.IsModifiableSortAscending;
  }
  /** Set the field level filters for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsModifiableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsModifiable = value;
  }
  /** Retrieve filter for field: IsModifiable (ADJ_TRANS_DESCR.is_modifiable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsModifiableFilter () {
    return this.IsModifiable;
  }

  /**
   * Retrieves the IsModifiableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsModifiableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsModifiableFilter field
   */
  public String[] getIsModifiableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsModifiableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsModifiableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsModifiableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsModifiableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsModifiableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsModifiableFilter filter value from a formatted string
   *
   * @param _value the IsModifiableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsModifiableFilter filter field
   */
  public void setIsModifiableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsModifiableFilterFromFormattedString");
    try {
      this.setIsModifiableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsModifiableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsModifiableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsModifiableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsAdjustableFetch (boolean fetch) {
    this.IsAdjustableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsAdjustableFetch () {
    return this.IsAdjustableFetch;
  }
  /** Set the SortOrder for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsAdjustableSortOrder (Integer value) {
    this.IsAdjustableSort = value;
  }
  /** Retrieve SortOrder for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsAdjustableSortOrder () {
    return this.IsAdjustableSort;
  }
  /** Set the sort direction for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsAdjustableSortDirection (boolean ascending) {
    this.IsAdjustableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsAdjustableSortDirection () {
    return this.IsAdjustableSortAscending;
  }
  /** Set the field level filters for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsAdjustableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsAdjustable = value;
  }
  /** Retrieve filter for field: IsAdjustable (ADJ_TRANS_DESCR.is_adjustable)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsAdjustableFilter () {
    return this.IsAdjustable;
  }

  /**
   * Retrieves the IsAdjustableFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsAdjustableFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsAdjustableFilter field
   */
  public String[] getIsAdjustableFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsAdjustableFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsAdjustableFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsAdjustableFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsAdjustableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsAdjustableFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsAdjustableFilter filter value from a formatted string
   *
   * @param _value the IsAdjustableFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsAdjustableFilter filter field
   */
  public void setIsAdjustableFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsAdjustableFilterFromFormattedString");
    try {
      this.setIsAdjustableFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsAdjustableFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsAdjustableFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsAdjustableFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @param fetch whether to fetch this field or not
   */
  public void setIsJournalableFetch (boolean fetch) {
    this.IsJournalableFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsJournalableFetch () {
    return this.IsJournalableFetch;
  }
  /** Set the SortOrder for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsJournalableSortOrder (Integer value) {
    this.IsJournalableSort = value;
  }
  /** Retrieve SortOrder for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsJournalableSortOrder () {
    return this.IsJournalableSort;
  }
  /** Set the sort direction for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsJournalableSortDirection (boolean ascending) {
    this.IsJournalableSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsJournalableSortDirection () {
    return this.IsJournalableSortAscending;
  }
  /** Set the field level filters for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsJournalableFilter (BooleanFilter[] value) throws ServiceException {
    this.IsJournalable = value;
  }
  /** Retrieve filter for field: IsJournalable (ADJ_TRANS_DESCR.is_journalable)
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

  /** Set the field level Fetch value for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDisplayedOnbillFetch (boolean fetch) {
    this.IsDisplayedOnbillFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDisplayedOnbillFetch () {
    return this.IsDisplayedOnbillFetch;
  }
  /** Set the SortOrder for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDisplayedOnbillSortOrder (Integer value) {
    this.IsDisplayedOnbillSort = value;
  }
  /** Retrieve SortOrder for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDisplayedOnbillSortOrder () {
    return this.IsDisplayedOnbillSort;
  }
  /** Set the sort direction for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDisplayedOnbillSortDirection (boolean ascending) {
    this.IsDisplayedOnbillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDisplayedOnbillSortDirection () {
    return this.IsDisplayedOnbillSortAscending;
  }
  /** Set the field level filters for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDisplayedOnbillFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDisplayedOnbill = value;
  }
  /** Retrieve filter for field: IsDisplayedOnbill (ADJ_TRANS_DESCR.is_displayed_onbill)
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

  /** Set the field level Fetch value for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @param fetch whether to fetch this field or not
   */
  public void setIsDisconnectCreditFetch (boolean fetch) {
    this.IsDisconnectCreditFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsDisconnectCreditFetch () {
    return this.IsDisconnectCreditFetch;
  }
  /** Set the SortOrder for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsDisconnectCreditSortOrder (Integer value) {
    this.IsDisconnectCreditSort = value;
  }
  /** Retrieve SortOrder for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsDisconnectCreditSortOrder () {
    return this.IsDisconnectCreditSort;
  }
  /** Set the sort direction for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsDisconnectCreditSortDirection (boolean ascending) {
    this.IsDisconnectCreditSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsDisconnectCreditSortDirection () {
    return this.IsDisconnectCreditSortAscending;
  }
  /** Set the field level filters for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsDisconnectCreditFilter (BooleanFilter[] value) throws ServiceException {
    this.IsDisconnectCredit = value;
  }
  /** Retrieve filter for field: IsDisconnectCredit (ADJ_TRANS_DESCR.is_disconnect_credit)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsDisconnectCreditFilter () {
    return this.IsDisconnectCredit;
  }

  /**
   * Retrieves the IsDisconnectCreditFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsDisconnectCreditFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsDisconnectCreditFilter field
   */
  public String[] getIsDisconnectCreditFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsDisconnectCreditFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsDisconnectCreditFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsDisconnectCreditFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisconnectCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsDisconnectCreditFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsDisconnectCreditFilter filter value from a formatted string
   *
   * @param _value the IsDisconnectCreditFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsDisconnectCreditFilter filter field
   */
  public void setIsDisconnectCreditFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsDisconnectCreditFilterFromFormattedString");
    try {
      this.setIsDisconnectCreditFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsDisconnectCreditFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsDisconnectCreditFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsDisconnectCreditFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @param fetch whether to fetch this field or not
   */
  public void setIsRefinanceFetch (boolean fetch) {
    this.IsRefinanceFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsRefinanceFetch () {
    return this.IsRefinanceFetch;
  }
  /** Set the SortOrder for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsRefinanceSortOrder (Integer value) {
    this.IsRefinanceSort = value;
  }
  /** Retrieve SortOrder for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsRefinanceSortOrder () {
    return this.IsRefinanceSort;
  }
  /** Set the sort direction for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsRefinanceSortDirection (boolean ascending) {
    this.IsRefinanceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsRefinanceSortDirection () {
    return this.IsRefinanceSortAscending;
  }
  /** Set the field level filters for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsRefinanceFilter (BooleanFilter[] value) throws ServiceException {
    this.IsRefinance = value;
  }
  /** Retrieve filter for field: IsRefinance (ADJ_TRANS_DESCR.is_refinance)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsRefinanceFilter () {
    return this.IsRefinance;
  }

  /**
   * Retrieves the IsRefinanceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsRefinanceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsRefinanceFilter field
   */
  public String[] getIsRefinanceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsRefinanceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsRefinanceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsRefinanceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRefinanceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsRefinanceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsRefinanceFilter filter value from a formatted string
   *
   * @param _value the IsRefinanceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsRefinanceFilter filter field
   */
  public void setIsRefinanceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsRefinanceFilterFromFormattedString");
    try {
      this.setIsRefinanceFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsRefinanceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsRefinanceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsRefinanceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationTypeFetch (boolean fetch) {
    this.AnnotationTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationTypeFetch () {
    return this.AnnotationTypeFetch;
  }
  /** Set the SortOrder for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationTypeSortOrder (Integer value) {
    this.AnnotationTypeSort = value;
  }
  /** Retrieve SortOrder for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationTypeSortOrder () {
    return this.AnnotationTypeSort;
  }
  /** Set the sort direction for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationTypeSortDirection (boolean ascending) {
    this.AnnotationTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationTypeSortDirection () {
    return this.AnnotationTypeSortAscending;
  }
  /** Set the field level filters for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AnnotationType = value;
  }
  /** Retrieve filter for field: AnnotationType (ADJ_TRANS_DESCR.annotation_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAnnotationTypeFilter () {
    return this.AnnotationType;
  }

  /**
   * Retrieves the AnnotationTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationTypeFilter field
   */
  public String[] getAnnotationTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationTypeFilter filter value from a formatted string
   *
   * @param _value the AnnotationTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationTypeFilter filter field
   */
  public void setAnnotationTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationTypeFilterFromFormattedString");
    try {
      this.setAnnotationTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxOnInvoiceFetch (boolean fetch) {
    this.TaxOnInvoiceFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxOnInvoiceFetch () {
    return this.TaxOnInvoiceFetch;
  }
  /** Set the SortOrder for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxOnInvoiceSortOrder (Integer value) {
    this.TaxOnInvoiceSort = value;
  }
  /** Retrieve SortOrder for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxOnInvoiceSortOrder () {
    return this.TaxOnInvoiceSort;
  }
  /** Set the sort direction for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxOnInvoiceSortDirection (boolean ascending) {
    this.TaxOnInvoiceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxOnInvoiceSortDirection () {
    return this.TaxOnInvoiceSortAscending;
  }
  /** Set the field level filters for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxOnInvoiceFilter (BooleanFilter[] value) throws ServiceException {
    this.TaxOnInvoice = value;
  }
  /** Retrieve filter for field: TaxOnInvoice (ADJ_TRANS_DESCR.tax_on_invoice)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getTaxOnInvoiceFilter () {
    return this.TaxOnInvoice;
  }

  /**
   * Retrieves the TaxOnInvoiceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxOnInvoiceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxOnInvoiceFilter field
   */
  public String[] getTaxOnInvoiceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxOnInvoiceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxOnInvoiceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxOnInvoiceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxOnInvoiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxOnInvoiceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxOnInvoiceFilter filter value from a formatted string
   *
   * @param _value the TaxOnInvoiceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxOnInvoiceFilter filter field
   */
  public void setTaxOnInvoiceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxOnInvoiceFilterFromFormattedString");
    try {
      this.setTaxOnInvoiceFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxOnInvoiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxOnInvoiceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxOnInvoiceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @param fetch whether to fetch this field or not
   */
  public void setIsLateFeeExemptFetch (boolean fetch) {
    this.IsLateFeeExemptFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsLateFeeExemptFetch () {
    return this.IsLateFeeExemptFetch;
  }
  /** Set the SortOrder for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsLateFeeExemptSortOrder (Integer value) {
    this.IsLateFeeExemptSort = value;
  }
  /** Retrieve SortOrder for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsLateFeeExemptSortOrder () {
    return this.IsLateFeeExemptSort;
  }
  /** Set the sort direction for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsLateFeeExemptSortDirection (boolean ascending) {
    this.IsLateFeeExemptSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsLateFeeExemptSortDirection () {
    return this.IsLateFeeExemptSortAscending;
  }
  /** Set the field level filters for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsLateFeeExemptFilter (BooleanFilter[] value) throws ServiceException {
    this.IsLateFeeExempt = value;
  }
  /** Retrieve filter for field: IsLateFeeExempt (ADJ_TRANS_DESCR.is_late_fee_exempt)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsLateFeeExemptFilter () {
    return this.IsLateFeeExempt;
  }

  /**
   * Retrieves the IsLateFeeExemptFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsLateFeeExemptFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLateFeeExemptFilter field
   */
  public String[] getIsLateFeeExemptFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsLateFeeExemptFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLateFeeExemptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLateFeeExemptFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsLateFeeExemptFilter filter value from a formatted string
   *
   * @param _value the IsLateFeeExemptFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsLateFeeExemptFilter filter field
   */
  public void setIsLateFeeExemptFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
    try {
      this.setIsLateFeeExemptFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsLateFeeExemptFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLateFeeExemptFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowInterimBillFetch (boolean fetch) {
    this.AllowInterimBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowInterimBillFetch () {
    return this.AllowInterimBillFetch;
  }
  /** Set the SortOrder for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowInterimBillSortOrder (Integer value) {
    this.AllowInterimBillSort = value;
  }
  /** Retrieve SortOrder for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowInterimBillSortOrder () {
    return this.AllowInterimBillSort;
  }
  /** Set the sort direction for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowInterimBillSortDirection (boolean ascending) {
    this.AllowInterimBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowInterimBillSortDirection () {
    return this.AllowInterimBillSortAscending;
  }
  /** Set the field level filters for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowInterimBillFilter (BooleanFilter[] value) throws ServiceException {
    this.AllowInterimBill = value;
  }
  /** Retrieve filter for field: AllowInterimBill (ADJ_TRANS_DESCR.allow_interim_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAllowInterimBillFilter () {
    return this.AllowInterimBill;
  }

  /**
   * Retrieves the AllowInterimBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowInterimBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowInterimBillFilter field
   */
  public String[] getAllowInterimBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowInterimBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowInterimBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowInterimBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowInterimBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowInterimBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowInterimBillFilter filter value from a formatted string
   *
   * @param _value the AllowInterimBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowInterimBillFilter filter field
   */
  public void setAllowInterimBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowInterimBillFilterFromFormattedString");
    try {
      this.setAllowInterimBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowInterimBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowInterimBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowInterimBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @param fetch whether to fetch this field or not
   */
  public void setIsNegativeBillAdjFetch (boolean fetch) {
    this.IsNegativeBillAdjFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsNegativeBillAdjFetch () {
    return this.IsNegativeBillAdjFetch;
  }
  /** Set the SortOrder for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsNegativeBillAdjSortOrder (Integer value) {
    this.IsNegativeBillAdjSort = value;
  }
  /** Retrieve SortOrder for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsNegativeBillAdjSortOrder () {
    return this.IsNegativeBillAdjSort;
  }
  /** Set the sort direction for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsNegativeBillAdjSortDirection (boolean ascending) {
    this.IsNegativeBillAdjSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsNegativeBillAdjSortDirection () {
    return this.IsNegativeBillAdjSortAscending;
  }
  /** Set the field level filters for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsNegativeBillAdjFilter (BooleanFilter[] value) throws ServiceException {
    this.IsNegativeBillAdj = value;
  }
  /** Retrieve filter for field: IsNegativeBillAdj (ADJ_TRANS_DESCR.is_negative_bill_adj)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsNegativeBillAdjFilter () {
    return this.IsNegativeBillAdj;
  }

  /**
   * Retrieves the IsNegativeBillAdjFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsNegativeBillAdjFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsNegativeBillAdjFilter field
   */
  public String[] getIsNegativeBillAdjFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsNegativeBillAdjFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsNegativeBillAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsNegativeBillAdjFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsNegativeBillAdjFilter filter value from a formatted string
   *
   * @param _value the IsNegativeBillAdjFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsNegativeBillAdjFilter filter field
   */
  public void setIsNegativeBillAdjFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
    try {
      this.setIsNegativeBillAdjFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsNegativeBillAdjFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsNegativeBillAdjFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (ADJ_TRANS_DESCR.config_tag_id)
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
    return AdjustmentTypeObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AdjustmentTypeObjectHelper.toMap(this, null);
  }
}
