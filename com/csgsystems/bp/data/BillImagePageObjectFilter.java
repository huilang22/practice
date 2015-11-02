/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImagePageObjectFilter.java
 * Definition File: Customer/BillImagePage.xml
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
public class BillImagePageObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BillImagePageObjectKeyFilter Key = null;
  /** raw field */
  public    StringFilter[] PageText  = null;
  protected boolean PageTextFetch = false;
  protected boolean PageTextSortAscending = true;
  protected boolean PageTextCaseInsensitive = false;
  protected Integer PageTextSort = null;
  /** raw field */
  public    BooleanFilter[] ReverseSearch  = null;
  protected boolean ReverseSearchFetch = false;
  protected boolean ReverseSearchSortAscending = true;
  protected Integer ReverseSearchSort = null;
  private String _objName = "BillImagePageObjectFilter";
  /** default constructor */
  public BillImagePageObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillImagePageObjectFilter (BillImagePageObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BillImagePageObjectKeyFilter (other.Key);
    this.PageText = other.PageText;
    this.PageTextFetch = other.PageTextFetch;
    this.PageTextSort = other.PageTextSort;
    this.PageTextCaseInsensitive = other.PageTextCaseInsensitive;
    this.PageTextSortAscending = other.PageTextSortAscending;
    this.ReverseSearch = other.ReverseSearch;
    this.ReverseSearchFetch = other.ReverseSearchFetch;
    this.ReverseSearchSort = other.ReverseSearchSort;
    this.ReverseSearchSortAscending = other.ReverseSearchSortAscending;  }
  /** get the filter for this object's key
   * @return BillImagePageObjectKeyFilter
   */
  public BillImagePageObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BillImagePageObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (BILL_IMAGE.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Set the field level Fetch value for field: ImageType (BILL_IMAGE.image_type)
   * @param fetch whether to fetch this field or not
   */
  public void setImageTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.ImageTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImageType (BILL_IMAGE.image_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getImageTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ImageTypeFetch;
  }
  /** Set the SortOrder for field: ImageType (BILL_IMAGE.image_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImageTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.ImageTypeSort = value;
  }
  /** Retrieve SortOrder for field: ImageType (BILL_IMAGE.image_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImageTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ImageTypeSort;
  }
  /** Set the sort direction for field: ImageType (BILL_IMAGE.image_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImageTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.ImageTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImageType (BILL_IMAGE.image_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImageTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ImageTypeSortAscending;
  }
  /** Set the field level filters for field: ImageType (BILL_IMAGE.image_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImageTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.ImageType = value;
  }
  /** Retrieve filter for field: ImageType (BILL_IMAGE.image_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getImageTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ImageType;
  }
  /** Set the field level Fetch value for field: PageNo (BILL_IMAGE.page_no)
   * @param fetch whether to fetch this field or not
   */
  public void setPageNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.PageNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: PageNo (BILL_IMAGE.page_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getPageNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PageNoFetch;
  }
  /** Set the SortOrder for field: PageNo (BILL_IMAGE.page_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPageNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.PageNoSort = value;
  }
  /** Retrieve SortOrder for field: PageNo (BILL_IMAGE.page_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPageNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PageNoSort;
  }
  /** Set the sort direction for field: PageNo (BILL_IMAGE.page_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPageNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.PageNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PageNo (BILL_IMAGE.page_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPageNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PageNoSortAscending;
  }
  /** Set the field level filters for field: PageNo (BILL_IMAGE.page_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPageNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillImagePageObjectKeyFilter ();
    this.Key.PageNo = value;
  }
  /** Retrieve filter for field: PageNo (BILL_IMAGE.page_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPageNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PageNo;
  }
  /** Set the field level Fetch value for field: PageText
   * @param fetch whether to fetch this field or not
   */
  public void setPageTextFetch (boolean fetch)
  {
    this.PageTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: PageText
   * @return boolean the Fetch value for this field
   */
  public boolean getPageTextFetch ()
  {
    return this.PageTextFetch;
  }
  /** Set the SortOrder for field: PageText
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPageTextSortOrder (Integer value)
  {
    this.PageTextSort = value;
  }
  /** Retrieve SortOrder for field: PageText
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPageTextSortOrder ()
  {
    return this.PageTextSort;
  }
  /** Set the sort direction for field: PageText
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPageTextSortDirection (boolean ascending)
  {
    this.PageTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PageText
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPageTextSortDirection ()
  {
    return this.PageTextSortAscending;
  }
  /** Set the case insensitive for field: PageText
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setPageTextCaseInsensitive (boolean ascending)
  {
    this.PageTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: PageText
   * @return boolean whether the field is case insensitive
   */
  public boolean getPageTextCaseInsensitive ()
  {
    return this.PageTextCaseInsensitive;
  }
  /** Set the field level filters for field: PageText
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPageTextFilter (StringFilter[] value) throws ServiceException
  {
    this.PageText = value;
  }
  /** Retrieve filter for field: PageText
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getPageTextFilter ()
  {
    return this.PageText;
  }
  /** Set the field level Fetch value for field: ReverseSearch
   * @param fetch whether to fetch this field or not
   */
  public void setReverseSearchFetch (boolean fetch)
  {
    this.ReverseSearchFetch = fetch;
  }
  /** Retrieve Fetch value for field: ReverseSearch
   * @return boolean the Fetch value for this field
   */
  public boolean getReverseSearchFetch ()
  {
    return this.ReverseSearchFetch;
  }
  /** Set the SortOrder for field: ReverseSearch
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setReverseSearchSortOrder (Integer value)
  {
    this.ReverseSearchSort = value;
  }
  /** Retrieve SortOrder for field: ReverseSearch
   * @return Integer the sort order, if set, for the field
   */
  public Integer getReverseSearchSortOrder ()
  {
    return this.ReverseSearchSort;
  }
  /** Set the sort direction for field: ReverseSearch
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setReverseSearchSortDirection (boolean ascending)
  {
    this.ReverseSearchSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ReverseSearch
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getReverseSearchSortDirection ()
  {
    return this.ReverseSearchSortAscending;
  }
  /** Set the field level filters for field: ReverseSearch
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setReverseSearchFilter (BooleanFilter[] value) throws ServiceException
  {
    this.ReverseSearch = value;
  }
  /** Retrieve filter for field: ReverseSearch
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getReverseSearchFilter ()
  {
    return this.ReverseSearch;
  }
  public String toString() {
    return BillImagePageObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillImagePageObjectHelper.toMap(this, null);
  }
}
