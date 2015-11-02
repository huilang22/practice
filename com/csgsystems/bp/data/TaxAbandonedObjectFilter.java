/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAbandonedObjectFilter.java
 * Definition File: Customer/TaxAbandoned.xml
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
public class TaxAbandonedObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public TaxAbandonedObjectKeyFilter Key = null;
  /** raw field for: TAX_ABANDONED.federal_tax) */
  public    BigIntegerFilter[] FederalTax  = null;
  protected boolean FederalTaxFetch = false;
  protected boolean FederalTaxSortAscending = true;
  protected Integer FederalTaxSort = null;
  /** raw field for: TAX_ABANDONED.state_tax) */
  public    BigIntegerFilter[] StateTax  = null;
  protected boolean StateTaxFetch = false;
  protected boolean StateTaxSortAscending = true;
  protected Integer StateTaxSort = null;
  /** raw field for: TAX_ABANDONED.county_tax) */
  public    BigIntegerFilter[] CountyTax  = null;
  protected boolean CountyTaxFetch = false;
  protected boolean CountyTaxSortAscending = true;
  protected Integer CountyTaxSort = null;
  /** raw field for: TAX_ABANDONED.city_tax) */
  public    BigIntegerFilter[] CityTax  = null;
  protected boolean CityTaxFetch = false;
  protected boolean CityTaxSortAscending = true;
  protected Integer CityTaxSort = null;
  /** raw field for: TAX_ABANDONED.other_tax) */
  public    BigIntegerFilter[] OtherTax  = null;
  protected boolean OtherTaxFetch = false;
  protected boolean OtherTaxSortAscending = true;
  protected Integer OtherTaxSort = null;
  private String _objName = "TaxAbandonedObjectFilter";
  /** default constructor */
  public TaxAbandonedObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public TaxAbandonedObjectFilter (TaxAbandonedObjectFilter other)
  {
    if (other == null) return;
    this.Key = new TaxAbandonedObjectKeyFilter (other.Key);
    this.FederalTax = other.FederalTax;
    this.FederalTaxFetch = other.FederalTaxFetch;
    this.FederalTaxSort = other.FederalTaxSort;
    this.FederalTaxSortAscending = other.FederalTaxSortAscending;
    this.StateTax = other.StateTax;
    this.StateTaxFetch = other.StateTaxFetch;
    this.StateTaxSort = other.StateTaxSort;
    this.StateTaxSortAscending = other.StateTaxSortAscending;
    this.CountyTax = other.CountyTax;
    this.CountyTaxFetch = other.CountyTaxFetch;
    this.CountyTaxSort = other.CountyTaxSort;
    this.CountyTaxSortAscending = other.CountyTaxSortAscending;
    this.CityTax = other.CityTax;
    this.CityTaxFetch = other.CityTaxFetch;
    this.CityTaxSort = other.CityTaxSort;
    this.CityTaxSortAscending = other.CityTaxSortAscending;
    this.OtherTax = other.OtherTax;
    this.OtherTaxFetch = other.OtherTaxFetch;
    this.OtherTaxSort = other.OtherTaxSort;
    this.OtherTaxSortAscending = other.OtherTaxSortAscending;  }
  /** get the filter for this object's key
   * @return TaxAbandonedObjectKeyFilter
   */
  public TaxAbandonedObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (TaxAbandonedObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (TAX_ABANDONED.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (TAX_ABANDONED.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (TAX_ABANDONED.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AccountInternalId;
  }
  /** Set the field level Fetch value for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (TAX_ABANDONED.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (TAX_ABANDONED.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Set the field level Fetch value for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @param fetch whether to fetch this field or not
   */
  public void setBillInvoiceRowFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillInvoiceRowFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillInvoiceRowFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillInvoiceRowFetch;
  }
  /** Set the SortOrder for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillInvoiceRowSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillInvoiceRowSort = value;
  }
  /** Retrieve SortOrder for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillInvoiceRowSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRowSort;
  }
  /** Set the sort direction for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillInvoiceRowSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillInvoiceRowSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillInvoiceRowSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillInvoiceRowSortAscending;
  }
  /** Set the field level filters for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillInvoiceRowFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.BillInvoiceRow = value;
  }
  /** Retrieve filter for field: BillInvoiceRow (TAX_ABANDONED.bill_invoice_row)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillInvoiceRowFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRow;
  }
  /** Set the field level Fetch value for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (TAX_ABANDONED.tax_pkg_inst_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTaxPkgInstIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TaxPkgInstId;
  }
  /** Set the field level Fetch value for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @param fetch whether to fetch this field or not
   */
  public void setAbandonReasonFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AbandonReasonFetch = fetch;
  }
  /** Retrieve Fetch value for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return boolean the Fetch value for this field
   */
  public boolean getAbandonReasonFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AbandonReasonFetch;
  }
  /** Set the SortOrder for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAbandonReasonSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AbandonReasonSort = value;
  }
  /** Retrieve SortOrder for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAbandonReasonSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AbandonReasonSort;
  }
  /** Set the sort direction for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAbandonReasonSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AbandonReasonSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAbandonReasonSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AbandonReasonSortAscending;
  }
  /** Set the field level filters for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAbandonReasonFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new TaxAbandonedObjectKeyFilter ();
    this.Key.AbandonReason = value;
  }
  /** Retrieve filter for field: AbandonReason (TAX_ABANDONED.abandon_reason)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAbandonReasonFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AbandonReason;
  }
  /** Set the field level Fetch value for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setFederalTaxFetch (boolean fetch) {
    this.FederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getFederalTaxFetch () {
    return this.FederalTaxFetch;
  }
  /** Set the SortOrder for field: FederalTax (TAX_ABANDONED.federal_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFederalTaxSortOrder (Integer value) {
    this.FederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFederalTaxSortOrder () {
    return this.FederalTaxSort;
  }
  /** Set the sort direction for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFederalTaxSortDirection (boolean ascending) {
    this.FederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFederalTaxSortDirection () {
    return this.FederalTaxSortAscending;
  }
  /** Set the field level filters for field: FederalTax (TAX_ABANDONED.federal_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FederalTax = value;
  }
  /** Retrieve filter for field: FederalTax (TAX_ABANDONED.federal_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getFederalTaxFilter () {
    return this.FederalTax;
  }

  /**
   * Retrieves the FederalTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTaxFilter field
   */
  public String[] getFederalTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFederalTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTaxFilter filter value from a formatted string
   *
   * @param _value the FederalTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FederalTaxFilter filter field
   */
  public void setFederalTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFilterFromFormattedString");
    try {
      this.setFederalTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StateTax (TAX_ABANDONED.state_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setStateTaxFetch (boolean fetch) {
    this.StateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateTax (TAX_ABANDONED.state_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateTaxFetch () {
    return this.StateTaxFetch;
  }
  /** Set the SortOrder for field: StateTax (TAX_ABANDONED.state_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateTaxSortOrder (Integer value) {
    this.StateTaxSort = value;
  }
  /** Retrieve SortOrder for field: StateTax (TAX_ABANDONED.state_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateTaxSortOrder () {
    return this.StateTaxSort;
  }
  /** Set the sort direction for field: StateTax (TAX_ABANDONED.state_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateTaxSortDirection (boolean ascending) {
    this.StateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateTax (TAX_ABANDONED.state_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateTaxSortDirection () {
    return this.StateTaxSortAscending;
  }
  /** Set the field level filters for field: StateTax (TAX_ABANDONED.state_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateTax = value;
  }
  /** Retrieve filter for field: StateTax (TAX_ABANDONED.state_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getStateTaxFilter () {
    return this.StateTax;
  }

  /**
   * Retrieves the StateTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTaxFilter field
   */
  public String[] getStateTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStateTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StateTaxFilter filter value from a formatted string
   *
   * @param _value the StateTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StateTaxFilter filter field
   */
  public void setStateTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFilterFromFormattedString");
    try {
      this.setStateTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CountyTax (TAX_ABANDONED.county_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyTaxFetch (boolean fetch) {
    this.CountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyTax (TAX_ABANDONED.county_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyTaxFetch () {
    return this.CountyTaxFetch;
  }
  /** Set the SortOrder for field: CountyTax (TAX_ABANDONED.county_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyTaxSortOrder (Integer value) {
    this.CountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CountyTax (TAX_ABANDONED.county_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyTaxSortOrder () {
    return this.CountyTaxSort;
  }
  /** Set the sort direction for field: CountyTax (TAX_ABANDONED.county_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyTaxSortDirection (boolean ascending) {
    this.CountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyTax (TAX_ABANDONED.county_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyTaxSortDirection () {
    return this.CountyTaxSortAscending;
  }
  /** Set the field level filters for field: CountyTax (TAX_ABANDONED.county_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CountyTax = value;
  }
  /** Retrieve filter for field: CountyTax (TAX_ABANDONED.county_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCountyTaxFilter () {
    return this.CountyTax;
  }

  /**
   * Retrieves the CountyTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTaxFilter field
   */
  public String[] getCountyTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCountyTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTaxFilter filter value from a formatted string
   *
   * @param _value the CountyTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CountyTaxFilter filter field
   */
  public void setCountyTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFilterFromFormattedString");
    try {
      this.setCountyTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CityTax (TAX_ABANDONED.city_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCityTaxFetch (boolean fetch) {
    this.CityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityTax (TAX_ABANDONED.city_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityTaxFetch () {
    return this.CityTaxFetch;
  }
  /** Set the SortOrder for field: CityTax (TAX_ABANDONED.city_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityTaxSortOrder (Integer value) {
    this.CityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CityTax (TAX_ABANDONED.city_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityTaxSortOrder () {
    return this.CityTaxSort;
  }
  /** Set the sort direction for field: CityTax (TAX_ABANDONED.city_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityTaxSortDirection (boolean ascending) {
    this.CityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityTax (TAX_ABANDONED.city_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityTaxSortDirection () {
    return this.CityTaxSortAscending;
  }
  /** Set the field level filters for field: CityTax (TAX_ABANDONED.city_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CityTax = value;
  }
  /** Retrieve filter for field: CityTax (TAX_ABANDONED.city_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCityTaxFilter () {
    return this.CityTax;
  }

  /**
   * Retrieves the CityTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTaxFilter field
   */
  public String[] getCityTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCityTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CityTaxFilter filter value from a formatted string
   *
   * @param _value the CityTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CityTaxFilter filter field
   */
  public void setCityTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFilterFromFormattedString");
    try {
      this.setCityTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OtherTax (TAX_ABANDONED.other_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setOtherTaxFetch (boolean fetch) {
    this.OtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: OtherTax (TAX_ABANDONED.other_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getOtherTaxFetch () {
    return this.OtherTaxFetch;
  }
  /** Set the SortOrder for field: OtherTax (TAX_ABANDONED.other_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOtherTaxSortOrder (Integer value) {
    this.OtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: OtherTax (TAX_ABANDONED.other_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOtherTaxSortOrder () {
    return this.OtherTaxSort;
  }
  /** Set the sort direction for field: OtherTax (TAX_ABANDONED.other_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOtherTaxSortDirection (boolean ascending) {
    this.OtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OtherTax (TAX_ABANDONED.other_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOtherTaxSortDirection () {
    return this.OtherTaxSortAscending;
  }
  /** Set the field level filters for field: OtherTax (TAX_ABANDONED.other_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OtherTax = value;
  }
  /** Retrieve filter for field: OtherTax (TAX_ABANDONED.other_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getOtherTaxFilter () {
    return this.OtherTax;
  }

  /**
   * Retrieves the OtherTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTaxFilter field
   */
  public String[] getOtherTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOtherTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTaxFilter filter value from a formatted string
   *
   * @param _value the OtherTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OtherTaxFilter filter field
   */
  public void setOtherTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFilterFromFormattedString");
    try {
      this.setOtherTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFilterFromFormattedString");
  }

  public String toString() {
    return TaxAbandonedObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return TaxAbandonedObjectHelper.toMap(this, null);
  }
}
