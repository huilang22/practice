/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlGetObjectFilter.java
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
public class CustomerDtUrlGetObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] DocumentId  = null;
  protected boolean DocumentIdFetch = false;
  protected boolean DocumentIdSortAscending = true;
  protected Integer DocumentIdSort = null;
  /** raw field */
  public    IntegerFilter[] DocumentTypeId  = null;
  protected boolean DocumentTypeIdFetch = false;
  protected boolean DocumentTypeIdSortAscending = true;
  protected Integer DocumentTypeIdSort = null;
  /** raw field */
  public    IntegerFilter[] SourceId  = null;
  protected boolean SourceIdFetch = false;
  protected boolean SourceIdSortAscending = true;
  protected Integer SourceIdSort = null;
  /** raw field */
  public    IntegerFilter[] SourceId2  = null;
  protected boolean SourceId2Fetch = false;
  protected boolean SourceId2SortAscending = true;
  protected Integer SourceId2Sort = null;
  /** raw field */
  public    StringFilter[] DisFilename  = null;
  protected boolean DisFilenameFetch = false;
  protected boolean DisFilenameSortAscending = true;
  protected boolean DisFilenameCaseInsensitive = false;
  protected Integer DisFilenameSort = null;
  /** raw field */
  public    StringFilter[] CustomerDocURL  = null;
  protected boolean CustomerDocURLFetch = false;
  protected boolean CustomerDocURLSortAscending = true;
  protected boolean CustomerDocURLCaseInsensitive = false;
  protected Integer CustomerDocURLSort = null;
  private String _objName = "CustomerDtUrlGetObjectFilter";
  /** default constructor */
  public CustomerDtUrlGetObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CustomerDtUrlGetObjectFilter (CustomerDtUrlGetObjectFilter other)
  {
    if (other == null) return;
    this.DocumentId = other.DocumentId;
    this.DocumentIdFetch = other.DocumentIdFetch;
    this.DocumentIdSort = other.DocumentIdSort;
    this.DocumentIdSortAscending = other.DocumentIdSortAscending;
    this.DocumentTypeId = other.DocumentTypeId;
    this.DocumentTypeIdFetch = other.DocumentTypeIdFetch;
    this.DocumentTypeIdSort = other.DocumentTypeIdSort;
    this.DocumentTypeIdSortAscending = other.DocumentTypeIdSortAscending;
    this.SourceId = other.SourceId;
    this.SourceIdFetch = other.SourceIdFetch;
    this.SourceIdSort = other.SourceIdSort;
    this.SourceIdSortAscending = other.SourceIdSortAscending;
    this.SourceId2 = other.SourceId2;
    this.SourceId2Fetch = other.SourceId2Fetch;
    this.SourceId2Sort = other.SourceId2Sort;
    this.SourceId2SortAscending = other.SourceId2SortAscending;
    this.DisFilename = other.DisFilename;
    this.DisFilenameFetch = other.DisFilenameFetch;
    this.DisFilenameSort = other.DisFilenameSort;
    this.DisFilenameCaseInsensitive = other.DisFilenameCaseInsensitive;
    this.DisFilenameSortAscending = other.DisFilenameSortAscending;
    this.CustomerDocURL = other.CustomerDocURL;
    this.CustomerDocURLFetch = other.CustomerDocURLFetch;
    this.CustomerDocURLSort = other.CustomerDocURLSort;
    this.CustomerDocURLCaseInsensitive = other.CustomerDocURLCaseInsensitive;
    this.CustomerDocURLSortAscending = other.CustomerDocURLSortAscending;  }
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
  /** Set the field level Fetch value for field: DocumentTypeId
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentTypeIdFetch (boolean fetch)
  {
    this.DocumentTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentTypeId
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentTypeIdFetch ()
  {
    return this.DocumentTypeIdFetch;
  }
  /** Set the SortOrder for field: DocumentTypeId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentTypeIdSortOrder (Integer value)
  {
    this.DocumentTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentTypeId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentTypeIdSortOrder ()
  {
    return this.DocumentTypeIdSort;
  }
  /** Set the sort direction for field: DocumentTypeId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentTypeIdSortDirection (boolean ascending)
  {
    this.DocumentTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentTypeId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentTypeIdSortDirection ()
  {
    return this.DocumentTypeIdSortAscending;
  }
  /** Set the field level filters for field: DocumentTypeId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentTypeIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.DocumentTypeId = value;
  }
  /** Retrieve filter for field: DocumentTypeId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentTypeIdFilter ()
  {
    return this.DocumentTypeId;
  }
  /** Set the field level Fetch value for field: SourceId
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch)
  {
    this.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch ()
  {
    return this.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value)
  {
    this.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder ()
  {
    return this.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending)
  {
    this.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection ()
  {
    return this.SourceIdSortAscending;
  }
  /** Set the field level filters for field: SourceId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.SourceId = value;
  }
  /** Retrieve filter for field: SourceId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdFilter ()
  {
    return this.SourceId;
  }
  /** Set the field level Fetch value for field: SourceId2
   * @param fetch whether to fetch this field or not
   */
  public void setSourceId2Fetch (boolean fetch)
  {
    this.SourceId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId2
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceId2Fetch ()
  {
    return this.SourceId2Fetch;
  }
  /** Set the SortOrder for field: SourceId2
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceId2SortOrder (Integer value)
  {
    this.SourceId2Sort = value;
  }
  /** Retrieve SortOrder for field: SourceId2
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceId2SortOrder ()
  {
    return this.SourceId2Sort;
  }
  /** Set the sort direction for field: SourceId2
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceId2SortDirection (boolean ascending)
  {
    this.SourceId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId2
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceId2SortDirection ()
  {
    return this.SourceId2SortAscending;
  }
  /** Set the field level filters for field: SourceId2
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceId2Filter (IntegerFilter[] value) throws ServiceException
  {
    this.SourceId2 = value;
  }
  /** Retrieve filter for field: SourceId2
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceId2Filter ()
  {
    return this.SourceId2;
  }
  /** Set the field level Fetch value for field: DisFilename
   * @param fetch whether to fetch this field or not
   */
  public void setDisFilenameFetch (boolean fetch)
  {
    this.DisFilenameFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisFilename
   * @return boolean the Fetch value for this field
   */
  public boolean getDisFilenameFetch ()
  {
    return this.DisFilenameFetch;
  }
  /** Set the SortOrder for field: DisFilename
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisFilenameSortOrder (Integer value)
  {
    this.DisFilenameSort = value;
  }
  /** Retrieve SortOrder for field: DisFilename
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisFilenameSortOrder ()
  {
    return this.DisFilenameSort;
  }
  /** Set the sort direction for field: DisFilename
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisFilenameSortDirection (boolean ascending)
  {
    this.DisFilenameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisFilename
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisFilenameSortDirection ()
  {
    return this.DisFilenameSortAscending;
  }
  /** Set the case insensitive for field: DisFilename
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDisFilenameCaseInsensitive (boolean ascending)
  {
    this.DisFilenameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DisFilename
   * @return boolean whether the field is case insensitive
   */
  public boolean getDisFilenameCaseInsensitive ()
  {
    return this.DisFilenameCaseInsensitive;
  }
  /** Set the field level filters for field: DisFilename
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisFilenameFilter (StringFilter[] value) throws ServiceException
  {
    this.DisFilename = value;
  }
  /** Retrieve filter for field: DisFilename
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDisFilenameFilter ()
  {
    return this.DisFilename;
  }
  /** Set the field level Fetch value for field: CustomerDocURL
   * @param fetch whether to fetch this field or not
   */
  public void setCustomerDocURLFetch (boolean fetch)
  {
    this.CustomerDocURLFetch = fetch;
  }
  /** Retrieve Fetch value for field: CustomerDocURL
   * @return boolean the Fetch value for this field
   */
  public boolean getCustomerDocURLFetch ()
  {
    return this.CustomerDocURLFetch;
  }
  /** Set the SortOrder for field: CustomerDocURL
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCustomerDocURLSortOrder (Integer value)
  {
    this.CustomerDocURLSort = value;
  }
  /** Retrieve SortOrder for field: CustomerDocURL
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCustomerDocURLSortOrder ()
  {
    return this.CustomerDocURLSort;
  }
  /** Set the sort direction for field: CustomerDocURL
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCustomerDocURLSortDirection (boolean ascending)
  {
    this.CustomerDocURLSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CustomerDocURL
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCustomerDocURLSortDirection ()
  {
    return this.CustomerDocURLSortAscending;
  }
  /** Set the case insensitive for field: CustomerDocURL
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCustomerDocURLCaseInsensitive (boolean ascending)
  {
    this.CustomerDocURLCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CustomerDocURL
   * @return boolean whether the field is case insensitive
   */
  public boolean getCustomerDocURLCaseInsensitive ()
  {
    return this.CustomerDocURLCaseInsensitive;
  }
  /** Set the field level filters for field: CustomerDocURL
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCustomerDocURLFilter (StringFilter[] value) throws ServiceException
  {
    this.CustomerDocURL = value;
  }
  /** Retrieve filter for field: CustomerDocURL
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCustomerDocURLFilter ()
  {
    return this.CustomerDocURL;
  }
  public String toString() {
    return CustomerDtUrlGetObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CustomerDtUrlGetObjectHelper.toMap(this, null);
  }
}
