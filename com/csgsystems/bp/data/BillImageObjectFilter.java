/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImageObjectFilter.java
 * Definition File: Customer/BillImage.xml
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
public class BillImageObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BillImageObjectKeyFilter Key = null;
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
  /** raw field for: BILL_IMAGE.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: BILL_IMAGE.from_date) */
  public    DateFilter[] FromDate  = null;
  protected boolean FromDateFetch = false;
  protected boolean FromDateSortAscending = true;
  protected Integer FromDateSort = null;
  /** raw field for: BILL_IMAGE.to_date) */
  public    DateFilter[] ToDate  = null;
  protected boolean ToDateFetch = false;
  protected boolean ToDateSortAscending = true;
  protected Integer ToDateSort = null;
  /** raw field for: BILL_IMAGE.bill_date) */
  public    DateFilter[] BillDate  = null;
  protected boolean BillDateFetch = false;
  protected boolean BillDateSortAscending = true;
  protected Integer BillDateSort = null;
  /** raw field for: BILL_IMAGE.due_date) */
  public    DateFilter[] DueDate  = null;
  protected boolean DueDateFetch = false;
  protected boolean DueDateSortAscending = true;
  protected Integer DueDateSort = null;
  /** raw field for: BILL_IMAGE.bill_lname) */
  public    StringFilter[] BillLname  = null;
  protected boolean BillLnameFetch = false;
  protected boolean BillLnameSortAscending = true;
  protected boolean BillLnameCaseInsensitive = false;
  protected Integer BillLnameSort = null;
  /** raw field for: BILL_IMAGE.bill_fname) */
  public    StringFilter[] BillFname  = null;
  protected boolean BillFnameFetch = false;
  protected boolean BillFnameSortAscending = true;
  protected boolean BillFnameCaseInsensitive = false;
  protected Integer BillFnameSort = null;
  /** raw field for: BILL_IMAGE.bill_company) */
  public    StringFilter[] BillCompany  = null;
  protected boolean BillCompanyFetch = false;
  protected boolean BillCompanySortAscending = true;
  protected boolean BillCompanyCaseInsensitive = false;
  protected Integer BillCompanySort = null;
  /** raw field for: BILL_IMAGE.contact1_name) */
  public    StringFilter[] Contact1Name  = null;
  protected boolean Contact1NameFetch = false;
  protected boolean Contact1NameSortAscending = true;
  protected boolean Contact1NameCaseInsensitive = false;
  protected Integer Contact1NameSort = null;
  /** raw field for: BILL_IMAGE.contact2_name) */
  public    StringFilter[] Contact2Name  = null;
  protected boolean Contact2NameFetch = false;
  protected boolean Contact2NameSortAscending = true;
  protected boolean Contact2NameCaseInsensitive = false;
  protected Integer Contact2NameSort = null;
  /** raw field for: BILL_IMAGE.bill_image) */
  public    StringFilter[] BillImage  = null;
  protected boolean BillImageFetch = false;
  protected boolean BillImageSortAscending = true;
  protected Integer BillImageSort = null;
  /** raw field for: BILL_IMAGE.image_size) */
  public    IntegerFilter[] ImageSize  = null;
  protected boolean ImageSizeFetch = false;
  protected boolean ImageSizeSortAscending = true;
  protected Integer ImageSizeSort = null;
  /** raw field for: BILL_IMAGE.compression_type) */
  public    IntegerFilter[] CompressionType  = null;
  protected boolean CompressionTypeFetch = false;
  protected boolean CompressionTypeSortAscending = true;
  protected Integer CompressionTypeSort = null;
  /** raw field for: BILL_IMAGE.compressed_size) */
  public    IntegerFilter[] CompressedSize  = null;
  protected boolean CompressedSizeFetch = false;
  protected boolean CompressedSizeSortAscending = true;
  protected Integer CompressedSizeSort = null;
  /** raw field for: BILL_IMAGE.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  private String _objName = "BillImageObjectFilter";
  /** default constructor */
  public BillImageObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillImageObjectFilter (BillImageObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BillImageObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.FromDate = other.FromDate;
    this.FromDateFetch = other.FromDateFetch;
    this.FromDateSort = other.FromDateSort;
    this.FromDateSortAscending = other.FromDateSortAscending;
    this.ToDate = other.ToDate;
    this.ToDateFetch = other.ToDateFetch;
    this.ToDateSort = other.ToDateSort;
    this.ToDateSortAscending = other.ToDateSortAscending;
    this.BillDate = other.BillDate;
    this.BillDateFetch = other.BillDateFetch;
    this.BillDateSort = other.BillDateSort;
    this.BillDateSortAscending = other.BillDateSortAscending;
    this.DueDate = other.DueDate;
    this.DueDateFetch = other.DueDateFetch;
    this.DueDateSort = other.DueDateSort;
    this.DueDateSortAscending = other.DueDateSortAscending;
    this.BillLname = other.BillLname;
    this.BillLnameFetch = other.BillLnameFetch;
    this.BillLnameSort = other.BillLnameSort;
    this.BillLnameCaseInsensitive = other.BillLnameCaseInsensitive;
    this.BillLnameSortAscending = other.BillLnameSortAscending;
    this.BillFname = other.BillFname;
    this.BillFnameFetch = other.BillFnameFetch;
    this.BillFnameSort = other.BillFnameSort;
    this.BillFnameCaseInsensitive = other.BillFnameCaseInsensitive;
    this.BillFnameSortAscending = other.BillFnameSortAscending;
    this.BillCompany = other.BillCompany;
    this.BillCompanyFetch = other.BillCompanyFetch;
    this.BillCompanySort = other.BillCompanySort;
    this.BillCompanyCaseInsensitive = other.BillCompanyCaseInsensitive;
    this.BillCompanySortAscending = other.BillCompanySortAscending;
    this.Contact1Name = other.Contact1Name;
    this.Contact1NameFetch = other.Contact1NameFetch;
    this.Contact1NameSort = other.Contact1NameSort;
    this.Contact1NameCaseInsensitive = other.Contact1NameCaseInsensitive;
    this.Contact1NameSortAscending = other.Contact1NameSortAscending;
    this.Contact2Name = other.Contact2Name;
    this.Contact2NameFetch = other.Contact2NameFetch;
    this.Contact2NameSort = other.Contact2NameSort;
    this.Contact2NameCaseInsensitive = other.Contact2NameCaseInsensitive;
    this.Contact2NameSortAscending = other.Contact2NameSortAscending;
    this.BillImage = other.BillImage;
    this.BillImageFetch = other.BillImageFetch;
    this.BillImageSort = other.BillImageSort;
    this.BillImageSortAscending = other.BillImageSortAscending;
    this.ImageSize = other.ImageSize;
    this.ImageSizeFetch = other.ImageSizeFetch;
    this.ImageSizeSort = other.ImageSizeSort;
    this.ImageSizeSortAscending = other.ImageSizeSortAscending;
    this.CompressionType = other.CompressionType;
    this.CompressionTypeFetch = other.CompressionTypeFetch;
    this.CompressionTypeSort = other.CompressionTypeSort;
    this.CompressionTypeSortAscending = other.CompressionTypeSortAscending;
    this.CompressedSize = other.CompressedSize;
    this.CompressedSizeFetch = other.CompressedSizeFetch;
    this.CompressedSizeSort = other.CompressedSizeSort;
    this.CompressedSizeSortAscending = other.CompressedSizeSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;  }
  /** get the filter for this object's key
   * @return BillImageObjectKeyFilter
   */
  public BillImageObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BillImageObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BillRefNo (BILL_IMAGE.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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
    if (this.Key == null) this.Key = new BillImageObjectKeyFilter ();
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


  /** Set the field level Fetch value for field: AccountInternalId (BILL_IMAGE.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BILL_IMAGE.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BILL_IMAGE.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BILL_IMAGE.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BILL_IMAGE.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BILL_IMAGE.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BILL_IMAGE.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BILL_IMAGE.account_no)
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

  /** Set the field level Fetch value for field: FromDate (BILL_IMAGE.from_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFromDateFetch (boolean fetch) {
    this.FromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FromDate (BILL_IMAGE.from_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFromDateFetch () {
    return this.FromDateFetch;
  }
  /** Set the SortOrder for field: FromDate (BILL_IMAGE.from_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFromDateSortOrder (Integer value) {
    this.FromDateSort = value;
  }
  /** Retrieve SortOrder for field: FromDate (BILL_IMAGE.from_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFromDateSortOrder () {
    return this.FromDateSort;
  }
  /** Set the sort direction for field: FromDate (BILL_IMAGE.from_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFromDateSortDirection (boolean ascending) {
    this.FromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FromDate (BILL_IMAGE.from_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFromDateSortDirection () {
    return this.FromDateSortAscending;
  }
  /** Set the field level filters for field: FromDate (BILL_IMAGE.from_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFromDateFilter (DateFilter[] value) throws ServiceException {
    this.FromDate = value;
  }
  /** Retrieve filter for field: FromDate (BILL_IMAGE.from_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFromDateFilter () {
    return this.FromDate;
  }

  /**
   * Retrieves the FromDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDateFilter field
   */
  public String[] getFromDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFromDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FromDateFilter filter value from a formatted string
   *
   * @param _value the FromDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FromDateFilter filter field
   */
  public void setFromDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFilterFromFormattedString");
    try {
      this.setFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FromDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FromDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FromDateFilter field
   */
  public String[] getFromDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFromDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFromDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FromDateFilter filter value from a formatted string
   *
   * @param _value the FromDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FromDateFilter filter field
   */
  public void setFromDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
    try {
      this.setFromDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FromDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFromDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ToDate (BILL_IMAGE.to_date)
   * @param fetch whether to fetch this field or not
   */
  public void setToDateFetch (boolean fetch) {
    this.ToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ToDate (BILL_IMAGE.to_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getToDateFetch () {
    return this.ToDateFetch;
  }
  /** Set the SortOrder for field: ToDate (BILL_IMAGE.to_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setToDateSortOrder (Integer value) {
    this.ToDateSort = value;
  }
  /** Retrieve SortOrder for field: ToDate (BILL_IMAGE.to_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getToDateSortOrder () {
    return this.ToDateSort;
  }
  /** Set the sort direction for field: ToDate (BILL_IMAGE.to_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setToDateSortDirection (boolean ascending) {
    this.ToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ToDate (BILL_IMAGE.to_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getToDateSortDirection () {
    return this.ToDateSortAscending;
  }
  /** Set the field level filters for field: ToDate (BILL_IMAGE.to_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setToDateFilter (DateFilter[] value) throws ServiceException {
    this.ToDate = value;
  }
  /** Retrieve filter for field: ToDate (BILL_IMAGE.to_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getToDateFilter () {
    return this.ToDate;
  }

  /**
   * Retrieves the ToDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDateFilter field
   */
  public String[] getToDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getToDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ToDateFilter filter value from a formatted string
   *
   * @param _value the ToDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ToDateFilter filter field
   */
  public void setToDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFilterFromFormattedString");
    try {
      this.setToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ToDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ToDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ToDateFilter field
   */
  public String[] getToDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getToDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getToDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ToDateFilter filter value from a formatted string
   *
   * @param _value the ToDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ToDateFilter filter field
   */
  public void setToDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
    try {
      this.setToDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ToDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setToDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BillDate (BILL_IMAGE.bill_date)
   * @param fetch whether to fetch this field or not
   */
  public void setBillDateFetch (boolean fetch) {
    this.BillDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillDate (BILL_IMAGE.bill_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillDateFetch () {
    return this.BillDateFetch;
  }
  /** Set the SortOrder for field: BillDate (BILL_IMAGE.bill_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillDateSortOrder (Integer value) {
    this.BillDateSort = value;
  }
  /** Retrieve SortOrder for field: BillDate (BILL_IMAGE.bill_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillDateSortOrder () {
    return this.BillDateSort;
  }
  /** Set the sort direction for field: BillDate (BILL_IMAGE.bill_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillDateSortDirection (boolean ascending) {
    this.BillDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillDate (BILL_IMAGE.bill_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillDateSortDirection () {
    return this.BillDateSortAscending;
  }
  /** Set the field level filters for field: BillDate (BILL_IMAGE.bill_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillDateFilter (DateFilter[] value) throws ServiceException {
    this.BillDate = value;
  }
  /** Retrieve filter for field: BillDate (BILL_IMAGE.bill_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getBillDateFilter () {
    return this.BillDate;
  }

  /**
   * Retrieves the BillDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDateFilter field
   */
  public String[] getBillDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillDateFilter filter value from a formatted string
   *
   * @param _value the BillDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillDateFilter filter field
   */
  public void setBillDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDateFilterFromFormattedString");
    try {
      this.setBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDateFilterFromFormattedString");
  }

  /**
   * Retrieves the BillDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillDateFilter field
   */
  public String[] getBillDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the BillDateFilter filter value from a formatted string
   *
   * @param _value the BillDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillDateFilter filter field
   */
  public void setBillDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillDateFilterFromFormattedDateTimeString");
    try {
      this.setBillDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DueDate (BILL_IMAGE.due_date)
   * @param fetch whether to fetch this field or not
   */
  public void setDueDateFetch (boolean fetch) {
    this.DueDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: DueDate (BILL_IMAGE.due_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getDueDateFetch () {
    return this.DueDateFetch;
  }
  /** Set the SortOrder for field: DueDate (BILL_IMAGE.due_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDueDateSortOrder (Integer value) {
    this.DueDateSort = value;
  }
  /** Retrieve SortOrder for field: DueDate (BILL_IMAGE.due_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDueDateSortOrder () {
    return this.DueDateSort;
  }
  /** Set the sort direction for field: DueDate (BILL_IMAGE.due_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDueDateSortDirection (boolean ascending) {
    this.DueDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DueDate (BILL_IMAGE.due_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDueDateSortDirection () {
    return this.DueDateSortAscending;
  }
  /** Set the field level filters for field: DueDate (BILL_IMAGE.due_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDueDateFilter (DateFilter[] value) throws ServiceException {
    this.DueDate = value;
  }
  /** Retrieve filter for field: DueDate (BILL_IMAGE.due_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getDueDateFilter () {
    return this.DueDate;
  }

  /**
   * Retrieves the DueDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DueDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DueDateFilter field
   */
  public String[] getDueDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDueDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDueDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDueDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDueDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DueDateFilter filter value from a formatted string
   *
   * @param _value the DueDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DueDateFilter filter field
   */
  public void setDueDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDueDateFilterFromFormattedString");
    try {
      this.setDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDueDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDueDateFilterFromFormattedString");
  }

  /**
   * Retrieves the DueDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DueDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the DueDateFilter field
   */
  public String[] getDueDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDueDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDueDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDueDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDueDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the DueDateFilter filter value from a formatted string
   *
   * @param _value the DueDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DueDateFilter filter field
   */
  public void setDueDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDueDateFilterFromFormattedDateTimeString");
    try {
      this.setDueDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DueDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDueDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDueDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: BillLname (BILL_IMAGE.bill_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillLnameFetch (boolean fetch) {
    this.BillLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillLname (BILL_IMAGE.bill_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillLnameFetch () {
    return this.BillLnameFetch;
  }
  /** Set the SortOrder for field: BillLname (BILL_IMAGE.bill_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillLnameSortOrder (Integer value) {
    this.BillLnameSort = value;
  }
  /** Retrieve SortOrder for field: BillLname (BILL_IMAGE.bill_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillLnameSortOrder () {
    return this.BillLnameSort;
  }
  /** Set the sort direction for field: BillLname (BILL_IMAGE.bill_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillLnameSortDirection (boolean ascending) {
    this.BillLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillLname (BILL_IMAGE.bill_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillLnameSortDirection () {
    return this.BillLnameSortAscending;
  }
  /** Set the case insensitive for field: BillLname (BILL_IMAGE.bill_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillLnameCaseInsensitive (boolean ascending) {
    this.BillLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillLname (BILL_IMAGE.bill_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillLnameCaseInsensitive () {
    return this.BillLnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillLname (BILL_IMAGE.bill_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillLnameFilter (StringFilter[] value) throws ServiceException {
    this.BillLname = value;
  }
  /** Retrieve filter for field: BillLname (BILL_IMAGE.bill_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillLnameFilter () {
    return this.BillLname;
  }

  /**
   * Retrieves the BillLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillLnameFilter field
   */
  public String[] getBillLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillLnameFilter filter value from a formatted string
   *
   * @param _value the BillLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillLnameFilter filter field
   */
  public void setBillLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillLnameFilterFromFormattedString");
    try {
      this.setBillLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillFname (BILL_IMAGE.bill_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setBillFnameFetch (boolean fetch) {
    this.BillFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillFname (BILL_IMAGE.bill_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillFnameFetch () {
    return this.BillFnameFetch;
  }
  /** Set the SortOrder for field: BillFname (BILL_IMAGE.bill_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillFnameSortOrder (Integer value) {
    this.BillFnameSort = value;
  }
  /** Retrieve SortOrder for field: BillFname (BILL_IMAGE.bill_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillFnameSortOrder () {
    return this.BillFnameSort;
  }
  /** Set the sort direction for field: BillFname (BILL_IMAGE.bill_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillFnameSortDirection (boolean ascending) {
    this.BillFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillFname (BILL_IMAGE.bill_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillFnameSortDirection () {
    return this.BillFnameSortAscending;
  }
  /** Set the case insensitive for field: BillFname (BILL_IMAGE.bill_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillFnameCaseInsensitive (boolean ascending) {
    this.BillFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillFname (BILL_IMAGE.bill_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillFnameCaseInsensitive () {
    return this.BillFnameCaseInsensitive;
  }
  /** Set the field level filters for field: BillFname (BILL_IMAGE.bill_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillFnameFilter (StringFilter[] value) throws ServiceException {
    this.BillFname = value;
  }
  /** Retrieve filter for field: BillFname (BILL_IMAGE.bill_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillFnameFilter () {
    return this.BillFname;
  }

  /**
   * Retrieves the BillFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillFnameFilter field
   */
  public String[] getBillFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillFnameFilter filter value from a formatted string
   *
   * @param _value the BillFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillFnameFilter filter field
   */
  public void setBillFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillFnameFilterFromFormattedString");
    try {
      this.setBillFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillCompany (BILL_IMAGE.bill_company)
   * @param fetch whether to fetch this field or not
   */
  public void setBillCompanyFetch (boolean fetch) {
    this.BillCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillCompany (BILL_IMAGE.bill_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillCompanyFetch () {
    return this.BillCompanyFetch;
  }
  /** Set the SortOrder for field: BillCompany (BILL_IMAGE.bill_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillCompanySortOrder (Integer value) {
    this.BillCompanySort = value;
  }
  /** Retrieve SortOrder for field: BillCompany (BILL_IMAGE.bill_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillCompanySortOrder () {
    return this.BillCompanySort;
  }
  /** Set the sort direction for field: BillCompany (BILL_IMAGE.bill_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillCompanySortDirection (boolean ascending) {
    this.BillCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillCompany (BILL_IMAGE.bill_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillCompanySortDirection () {
    return this.BillCompanySortAscending;
  }
  /** Set the case insensitive for field: BillCompany (BILL_IMAGE.bill_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillCompanyCaseInsensitive (boolean ascending) {
    this.BillCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillCompany (BILL_IMAGE.bill_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillCompanyCaseInsensitive () {
    return this.BillCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: BillCompany (BILL_IMAGE.bill_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillCompanyFilter (StringFilter[] value) throws ServiceException {
    this.BillCompany = value;
  }
  /** Retrieve filter for field: BillCompany (BILL_IMAGE.bill_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillCompanyFilter () {
    return this.BillCompany;
  }

  /**
   * Retrieves the BillCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillCompanyFilter field
   */
  public String[] getBillCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillCompanyFilter filter value from a formatted string
   *
   * @param _value the BillCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillCompanyFilter filter field
   */
  public void setBillCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillCompanyFilterFromFormattedString");
    try {
      this.setBillCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @param fetch whether to fetch this field or not
   */
  public void setContact1NameFetch (boolean fetch) {
    this.Contact1NameFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact1NameFetch () {
    return this.Contact1NameFetch;
  }
  /** Set the SortOrder for field: Contact1Name (BILL_IMAGE.contact1_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact1NameSortOrder (Integer value) {
    this.Contact1NameSort = value;
  }
  /** Retrieve SortOrder for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact1NameSortOrder () {
    return this.Contact1NameSort;
  }
  /** Set the sort direction for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact1NameSortDirection (boolean ascending) {
    this.Contact1NameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact1NameSortDirection () {
    return this.Contact1NameSortAscending;
  }
  /** Set the case insensitive for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact1NameCaseInsensitive (boolean ascending) {
    this.Contact1NameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact1NameCaseInsensitive () {
    return this.Contact1NameCaseInsensitive;
  }
  /** Set the field level filters for field: Contact1Name (BILL_IMAGE.contact1_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact1NameFilter (StringFilter[] value) throws ServiceException {
    this.Contact1Name = value;
  }
  /** Retrieve filter for field: Contact1Name (BILL_IMAGE.contact1_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact1NameFilter () {
    return this.Contact1Name;
  }

  /**
   * Retrieves the Contact1NameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact1NameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact1NameFilter field
   */
  public String[] getContact1NameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact1NameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact1NameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact1NameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact1NameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact1NameFilter filter value from a formatted string
   *
   * @param _value the Contact1NameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact1NameFilter filter field
   */
  public void setContact1NameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact1NameFilterFromFormattedString");
    try {
      this.setContact1NameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact1NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact1NameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact1NameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @param fetch whether to fetch this field or not
   */
  public void setContact2NameFetch (boolean fetch) {
    this.Contact2NameFetch = fetch;
  }
  /** Retrieve Fetch value for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getContact2NameFetch () {
    return this.Contact2NameFetch;
  }
  /** Set the SortOrder for field: Contact2Name (BILL_IMAGE.contact2_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContact2NameSortOrder (Integer value) {
    this.Contact2NameSort = value;
  }
  /** Retrieve SortOrder for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContact2NameSortOrder () {
    return this.Contact2NameSort;
  }
  /** Set the sort direction for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContact2NameSortDirection (boolean ascending) {
    this.Contact2NameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContact2NameSortDirection () {
    return this.Contact2NameSortAscending;
  }
  /** Set the case insensitive for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContact2NameCaseInsensitive (boolean ascending) {
    this.Contact2NameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContact2NameCaseInsensitive () {
    return this.Contact2NameCaseInsensitive;
  }
  /** Set the field level filters for field: Contact2Name (BILL_IMAGE.contact2_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContact2NameFilter (StringFilter[] value) throws ServiceException {
    this.Contact2Name = value;
  }
  /** Retrieve filter for field: Contact2Name (BILL_IMAGE.contact2_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContact2NameFilter () {
    return this.Contact2Name;
  }

  /**
   * Retrieves the Contact2NameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Contact2NameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Contact2NameFilter field
   */
  public String[] getContact2NameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContact2NameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContact2NameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContact2NameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContact2NameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the Contact2NameFilter filter value from a formatted string
   *
   * @param _value the Contact2NameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the Contact2NameFilter filter field
   */
  public void setContact2NameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContact2NameFilterFromFormattedString");
    try {
      this.setContact2NameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Contact2NameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContact2NameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContact2NameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillImage (BILL_IMAGE.bill_image)
   * @param fetch whether to fetch this field or not
   */
  public void setBillImageFetch (boolean fetch) {
    this.BillImageFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillImage (BILL_IMAGE.bill_image)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillImageFetch () {
    return this.BillImageFetch;
  }
  /** Set the SortOrder for field: BillImage (BILL_IMAGE.bill_image)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillImageSortOrder (Integer value) {
    this.BillImageSort = value;
  }
  /** Retrieve SortOrder for field: BillImage (BILL_IMAGE.bill_image)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillImageSortOrder () {
    return this.BillImageSort;
  }
  /** Set the sort direction for field: BillImage (BILL_IMAGE.bill_image)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillImageSortDirection (boolean ascending) {
    this.BillImageSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillImage (BILL_IMAGE.bill_image)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillImageSortDirection () {
    return this.BillImageSortAscending;
  }
  /** Set the field level filters for field: BillImage (BILL_IMAGE.bill_image)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillImageFilter (StringFilter[] value) throws ServiceException {
    this.BillImage = value;
  }
  /** Retrieve filter for field: BillImage (BILL_IMAGE.bill_image)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillImageFilter () {
    return this.BillImage;
  }

  /**
   * Retrieves the BillImageFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillImageFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillImageFilter field
   */
  public String[] getBillImageFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillImageFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillImageFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillImageFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillImageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillImageFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillImageFilter filter value from a formatted string
   *
   * @param _value the BillImageFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillImageFilter filter field
   */
  public void setBillImageFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillImageFilterFromFormattedString");
    try {
      this.setBillImageFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillImageFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillImageFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillImageFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ImageSize (BILL_IMAGE.image_size)
   * @param fetch whether to fetch this field or not
   */
  public void setImageSizeFetch (boolean fetch) {
    this.ImageSizeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ImageSize (BILL_IMAGE.image_size)
   * @return boolean the Fetch value for this field
   */
  public boolean getImageSizeFetch () {
    return this.ImageSizeFetch;
  }
  /** Set the SortOrder for field: ImageSize (BILL_IMAGE.image_size)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setImageSizeSortOrder (Integer value) {
    this.ImageSizeSort = value;
  }
  /** Retrieve SortOrder for field: ImageSize (BILL_IMAGE.image_size)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getImageSizeSortOrder () {
    return this.ImageSizeSort;
  }
  /** Set the sort direction for field: ImageSize (BILL_IMAGE.image_size)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setImageSizeSortDirection (boolean ascending) {
    this.ImageSizeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ImageSize (BILL_IMAGE.image_size)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getImageSizeSortDirection () {
    return this.ImageSizeSortAscending;
  }
  /** Set the field level filters for field: ImageSize (BILL_IMAGE.image_size)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setImageSizeFilter (IntegerFilter[] value) throws ServiceException {
    this.ImageSize = value;
  }
  /** Retrieve filter for field: ImageSize (BILL_IMAGE.image_size)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getImageSizeFilter () {
    return this.ImageSize;
  }

  /**
   * Retrieves the ImageSizeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ImageSizeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ImageSizeFilter field
   */
  public String[] getImageSizeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getImageSizeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getImageSizeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getImageSizeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageSizeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getImageSizeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ImageSizeFilter filter value from a formatted string
   *
   * @param _value the ImageSizeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ImageSizeFilter filter field
   */
  public void setImageSizeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setImageSizeFilterFromFormattedString");
    try {
      this.setImageSizeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ImageSizeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setImageSizeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setImageSizeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CompressionType (BILL_IMAGE.compression_type)
   * @param fetch whether to fetch this field or not
   */
  public void setCompressionTypeFetch (boolean fetch) {
    this.CompressionTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CompressionType (BILL_IMAGE.compression_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getCompressionTypeFetch () {
    return this.CompressionTypeFetch;
  }
  /** Set the SortOrder for field: CompressionType (BILL_IMAGE.compression_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCompressionTypeSortOrder (Integer value) {
    this.CompressionTypeSort = value;
  }
  /** Retrieve SortOrder for field: CompressionType (BILL_IMAGE.compression_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCompressionTypeSortOrder () {
    return this.CompressionTypeSort;
  }
  /** Set the sort direction for field: CompressionType (BILL_IMAGE.compression_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCompressionTypeSortDirection (boolean ascending) {
    this.CompressionTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CompressionType (BILL_IMAGE.compression_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCompressionTypeSortDirection () {
    return this.CompressionTypeSortAscending;
  }
  /** Set the field level filters for field: CompressionType (BILL_IMAGE.compression_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCompressionTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.CompressionType = value;
  }
  /** Retrieve filter for field: CompressionType (BILL_IMAGE.compression_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCompressionTypeFilter () {
    return this.CompressionType;
  }

  /**
   * Retrieves the CompressionTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CompressionTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompressionTypeFilter field
   */
  public String[] getCompressionTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressionTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCompressionTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompressionTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompressionTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompressionTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CompressionTypeFilter filter value from a formatted string
   *
   * @param _value the CompressionTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CompressionTypeFilter filter field
   */
  public void setCompressionTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCompressionTypeFilterFromFormattedString");
    try {
      this.setCompressionTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompressionTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompressionTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompressionTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @param fetch whether to fetch this field or not
   */
  public void setCompressedSizeFetch (boolean fetch) {
    this.CompressedSizeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @return boolean the Fetch value for this field
   */
  public boolean getCompressedSizeFetch () {
    return this.CompressedSizeFetch;
  }
  /** Set the SortOrder for field: CompressedSize (BILL_IMAGE.compressed_size)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCompressedSizeSortOrder (Integer value) {
    this.CompressedSizeSort = value;
  }
  /** Retrieve SortOrder for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCompressedSizeSortOrder () {
    return this.CompressedSizeSort;
  }
  /** Set the sort direction for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCompressedSizeSortDirection (boolean ascending) {
    this.CompressedSizeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCompressedSizeSortDirection () {
    return this.CompressedSizeSortAscending;
  }
  /** Set the field level filters for field: CompressedSize (BILL_IMAGE.compressed_size)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCompressedSizeFilter (IntegerFilter[] value) throws ServiceException {
    this.CompressedSize = value;
  }
  /** Retrieve filter for field: CompressedSize (BILL_IMAGE.compressed_size)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCompressedSizeFilter () {
    return this.CompressedSize;
  }

  /**
   * Retrieves the CompressedSizeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CompressedSizeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompressedSizeFilter field
   */
  public String[] getCompressedSizeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompressedSizeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCompressedSizeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompressedSizeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompressedSizeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompressedSizeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CompressedSizeFilter filter value from a formatted string
   *
   * @param _value the CompressedSizeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CompressedSizeFilter filter field
   */
  public void setCompressedSizeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCompressedSizeFilterFromFormattedString");
    try {
      this.setCompressedSizeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CompressedSizeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompressedSizeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompressedSizeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (BILL_IMAGE.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (BILL_IMAGE.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (BILL_IMAGE.arch_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getArchFlagFilter () {
    return this.ArchFlag;
  }

  /**
   * Retrieves the ArchFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ArchFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlagFilter field
   */
  public String[] getArchFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getArchFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ArchFlagFilter filter value from a formatted string
   *
   * @param _value the ArchFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ArchFlagFilter filter field
   */
  public void setArchFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setArchFlagFilterFromFormattedString");
    try {
      this.setArchFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFilterFromFormattedString");
  }

  public String toString() {
    return BillImageObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillImageObjectHelper.toMap(this, null);
  }
}
