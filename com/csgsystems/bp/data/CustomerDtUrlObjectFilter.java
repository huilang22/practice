/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlObjectFilter.java
 * Definition File: Customer/CustomerDtUrl.xml
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
public class CustomerDtUrlObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field */
  public    DateFilter[] PaymentDueDate  = null;
  protected boolean PaymentDueDateFetch = false;
  protected boolean PaymentDueDateSortAscending = true;
  protected Integer PaymentDueDateSort = null;
  /** raw field */
  public    DateFilter[] PrepDate  = null;
  protected boolean PrepDateFetch = false;
  protected boolean PrepDateSortAscending = true;
  protected Integer PrepDateSort = null;
  /** raw field */
  public    StringFilter[] DisplayFilename  = null;
  protected boolean DisplayFilenameFetch = false;
  protected boolean DisplayFilenameSortAscending = true;
  protected boolean DisplayFilenameCaseInsensitive = false;
  protected Integer DisplayFilenameSort = null;
  /** raw field */
  public    StringFilter[] CustomerDocumentUrl  = null;
  protected boolean CustomerDocumentUrlFetch = false;
  protected boolean CustomerDocumentUrlSortAscending = true;
  protected boolean CustomerDocumentUrlCaseInsensitive = false;
  protected Integer CustomerDocumentUrlSort = null;
  /** raw field */
  public    IntegerFilter[] DocumentId  = null;
  protected boolean DocumentIdFetch = false;
  protected boolean DocumentIdSortAscending = true;
  protected Integer DocumentIdSort = null;
  /** raw field */
  public    IntegerFilter[] DocumentTypeid  = null;
  protected boolean DocumentTypeidFetch = false;
  protected boolean DocumentTypeidSortAscending = true;
  protected Integer DocumentTypeidSort = null;
  private String _objName = "CustomerDtUrlObjectFilter";
  /** default constructor */
  public CustomerDtUrlObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CustomerDtUrlObjectFilter (CustomerDtUrlObjectFilter other)
  {
    if (other == null) return;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.PaymentDueDate = other.PaymentDueDate;
    this.PaymentDueDateFetch = other.PaymentDueDateFetch;
    this.PaymentDueDateSort = other.PaymentDueDateSort;
    this.PaymentDueDateSortAscending = other.PaymentDueDateSortAscending;
    this.PrepDate = other.PrepDate;
    this.PrepDateFetch = other.PrepDateFetch;
    this.PrepDateSort = other.PrepDateSort;
    this.PrepDateSortAscending = other.PrepDateSortAscending;
    this.DisplayFilename = other.DisplayFilename;
    this.DisplayFilenameFetch = other.DisplayFilenameFetch;
    this.DisplayFilenameSort = other.DisplayFilenameSort;
    this.DisplayFilenameCaseInsensitive = other.DisplayFilenameCaseInsensitive;
    this.DisplayFilenameSortAscending = other.DisplayFilenameSortAscending;
    this.CustomerDocumentUrl = other.CustomerDocumentUrl;
    this.CustomerDocumentUrlFetch = other.CustomerDocumentUrlFetch;
    this.CustomerDocumentUrlSort = other.CustomerDocumentUrlSort;
    this.CustomerDocumentUrlCaseInsensitive = other.CustomerDocumentUrlCaseInsensitive;
    this.CustomerDocumentUrlSortAscending = other.CustomerDocumentUrlSortAscending;
    this.DocumentId = other.DocumentId;
    this.DocumentIdFetch = other.DocumentIdFetch;
    this.DocumentIdSort = other.DocumentIdSort;
    this.DocumentIdSortAscending = other.DocumentIdSortAscending;
    this.DocumentTypeid = other.DocumentTypeid;
    this.DocumentTypeidFetch = other.DocumentTypeidFetch;
    this.DocumentTypeidSort = other.DocumentTypeidSort;
    this.DocumentTypeidSortAscending = other.DocumentTypeidSortAscending;  }
  /** Set the field level Fetch value for field: BillRefNo
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    return this.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    return this.BillRefResets;
  }
  /** Set the field level Fetch value for field: PaymentDueDate
   * @param fetch whether to fetch this field or not
   */
  public void setPaymentDueDateFetch (boolean fetch)
  {
    this.PaymentDueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PaymentDueDate
   * @return boolean the Fetch value for this field
   */
  public boolean getPaymentDueDateFetch ()
  {
    return this.PaymentDueDateFetch;
  }
  /** Set the SortOrder for field: PaymentDueDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPaymentDueDateSortOrder (Integer value)
  {
    this.PaymentDueDateSort = value;
  }
  /** Retrieve SortOrder for field: PaymentDueDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPaymentDueDateSortOrder ()
  {
    return this.PaymentDueDateSort;
  }
  /** Set the sort direction for field: PaymentDueDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPaymentDueDateSortDirection (boolean ascending)
  {
    this.PaymentDueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PaymentDueDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPaymentDueDateSortDirection ()
  {
    return this.PaymentDueDateSortAscending;
  }
  /** Set the field level filters for field: PaymentDueDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPaymentDueDateFilter (DateFilter[] value) throws ServiceException
  {
    this.PaymentDueDate = value;
  }
  /** Retrieve filter for field: PaymentDueDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPaymentDueDateFilter ()
  {
    return this.PaymentDueDate;
  }
  /** Set the field level Fetch value for field: PrepDate
   * @param fetch whether to fetch this field or not
   */
  public void setPrepDateFetch (boolean fetch)
  {
    this.PrepDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepDate
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepDateFetch ()
  {
    return this.PrepDateFetch;
  }
  /** Set the SortOrder for field: PrepDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepDateSortOrder (Integer value)
  {
    this.PrepDateSort = value;
  }
  /** Retrieve SortOrder for field: PrepDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepDateSortOrder ()
  {
    return this.PrepDateSort;
  }
  /** Set the sort direction for field: PrepDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepDateSortDirection (boolean ascending)
  {
    this.PrepDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepDateSortDirection ()
  {
    return this.PrepDateSortAscending;
  }
  /** Set the field level filters for field: PrepDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepDateFilter (DateFilter[] value) throws ServiceException
  {
    this.PrepDate = value;
  }
  /** Retrieve filter for field: PrepDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrepDateFilter ()
  {
    return this.PrepDate;
  }
  /** Set the field level Fetch value for field: DisplayFilename
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayFilenameFetch (boolean fetch)
  {
    this.DisplayFilenameFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayFilename
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayFilenameFetch ()
  {
    return this.DisplayFilenameFetch;
  }
  /** Set the SortOrder for field: DisplayFilename
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayFilenameSortOrder (Integer value)
  {
    this.DisplayFilenameSort = value;
  }
  /** Retrieve SortOrder for field: DisplayFilename
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayFilenameSortOrder ()
  {
    return this.DisplayFilenameSort;
  }
  /** Set the sort direction for field: DisplayFilename
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayFilenameSortDirection (boolean ascending)
  {
    this.DisplayFilenameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayFilename
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayFilenameSortDirection ()
  {
    return this.DisplayFilenameSortAscending;
  }
  /** Set the case insensitive for field: DisplayFilename
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisplayFilenameCaseInsensitive (boolean ascending)
  {
    this.DisplayFilenameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisplayFilename
   * @return boolean whether the field is case insensitive
   */
  public boolean getDisplayFilenameCaseInsensitive ()
  {
    return this.DisplayFilenameCaseInsensitive;
  }
  /** Set the field level filters for field: DisplayFilename
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayFilenameFilter (StringFilter[] value) throws ServiceException
  {
    this.DisplayFilename = value;
  }
  /** Retrieve filter for field: DisplayFilename
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisplayFilenameFilter ()
  {
    return this.DisplayFilename;
  }
  /** Set the field level Fetch value for field: CustomerDocumentUrl
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerDocumentUrlFetch (boolean fetch)
  {
    this.CustomerDocumentUrlFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerDocumentUrl
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerDocumentUrlFetch ()
  {
    return this.CustomerDocumentUrlFetch;
  }
  /** Set the SortOrder for field: CustomerDocumentUrl
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerDocumentUrlSortOrder (Integer value)
  {
    this.CustomerDocumentUrlSort = value;
  }
  /** Retrieve SortOrder for field: CustomerDocumentUrl
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerDocumentUrlSortOrder ()
  {
    return this.CustomerDocumentUrlSort;
  }
  /** Set the sort direction for field: CustomerDocumentUrl
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerDocumentUrlSortDirection (boolean ascending)
  {
    this.CustomerDocumentUrlSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerDocumentUrl
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerDocumentUrlSortDirection ()
  {
    return this.CustomerDocumentUrlSortAscending;
  }
  /** Set the case insensitive for field: CustomerDocumentUrl
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustomerDocumentUrlCaseInsensitive (boolean ascending)
  {
    this.CustomerDocumentUrlCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustomerDocumentUrl
   * @return boolean whether the field is case insensitive
   */
  public boolean getCustomerDocumentUrlCaseInsensitive ()
  {
    return this.CustomerDocumentUrlCaseInsensitive;
  }
  /** Set the field level filters for field: CustomerDocumentUrl
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerDocumentUrlFilter (StringFilter[] value) throws ServiceException
  {
    this.CustomerDocumentUrl = value;
  }
  /** Retrieve filter for field: CustomerDocumentUrl
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustomerDocumentUrlFilter ()
  {
    return this.CustomerDocumentUrl;
  }
  /** Set the field level Fetch value for field: DocumentId
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentIdFetch (boolean fetch)
  {
    this.DocumentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentId
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentIdFetch ()
  {
    return this.DocumentIdFetch;
  }
  /** Set the SortOrder for field: DocumentId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentIdSortOrder (Integer value)
  {
    this.DocumentIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentIdSortOrder ()
  {
    return this.DocumentIdSort;
  }
  /** Set the sort direction for field: DocumentId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentIdSortDirection (boolean ascending)
  {
    this.DocumentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentIdSortDirection ()
  {
    return this.DocumentIdSortAscending;
  }
  /** Set the field level filters for field: DocumentId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.DocumentId = value;
  }
  /** Retrieve filter for field: DocumentId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentIdFilter ()
  {
    return this.DocumentId;
  }
  /** Set the field level Fetch value for field: DocumentTypeid
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentTypeidFetch (boolean fetch)
  {
    this.DocumentTypeidFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentTypeid
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentTypeidFetch ()
  {
    return this.DocumentTypeidFetch;
  }
  /** Set the SortOrder for field: DocumentTypeid
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentTypeidSortOrder (Integer value)
  {
    this.DocumentTypeidSort = value;
  }
  /** Retrieve SortOrder for field: DocumentTypeid
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentTypeidSortOrder ()
  {
    return this.DocumentTypeidSort;
  }
  /** Set the sort direction for field: DocumentTypeid
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentTypeidSortDirection (boolean ascending)
  {
    this.DocumentTypeidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentTypeid
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentTypeidSortDirection ()
  {
    return this.DocumentTypeidSortAscending;
  }
  /** Set the field level filters for field: DocumentTypeid
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentTypeidFilter (IntegerFilter[] value) throws ServiceException
  {
    this.DocumentTypeid = value;
  }
  /** Retrieve filter for field: DocumentTypeid
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentTypeidFilter ()
  {
    return this.DocumentTypeid;
  }
  public String toString() {
    return CustomerDtUrlObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDtUrlObjectHelper.toMap(this, null);
  }
}
