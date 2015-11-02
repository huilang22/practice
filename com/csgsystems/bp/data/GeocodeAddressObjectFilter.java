/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeAddressObjectFilter.java
 * Definition File: Admin/Geocode.xml
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
public class GeocodeAddressObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    StringFilter[] City  = null;
  protected boolean CityFetch = false;
  protected boolean CitySortAscending = true;
  protected boolean CityCaseInsensitive = false;
  protected Integer CitySort = null;
  /** raw field */
  public    IntegerFilter[] CountryCode  = null;
  protected boolean CountryCodeFetch = false;
  protected boolean CountryCodeSortAscending = true;
  protected Integer CountryCodeSort = null;
  /** raw field */
  public    IntegerFilter[] FranchiseCode  = null;
  protected boolean FranchiseCodeFetch = false;
  protected boolean FranchiseCodeSortAscending = true;
  protected Integer FranchiseCodeSort = null;
  /** raw field */
  public    StringFilter[] State  = null;
  protected boolean StateFetch = false;
  protected boolean StateSortAscending = true;
  protected boolean StateCaseInsensitive = false;
  protected Integer StateSort = null;
  /** raw field */
  public    StringFilter[] Zip  = null;
  protected boolean ZipFetch = false;
  protected boolean ZipSortAscending = true;
  protected boolean ZipCaseInsensitive = false;
  protected Integer ZipSort = null;
  private String _objName = "GeocodeAddressObjectFilter";
  /** default constructor */
  public GeocodeAddressObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public GeocodeAddressObjectFilter (GeocodeAddressObjectFilter other)
  {
    if (other == null) return;
    this.City = other.City;
    this.CityFetch = other.CityFetch;
    this.CitySort = other.CitySort;
    this.CityCaseInsensitive = other.CityCaseInsensitive;
    this.CitySortAscending = other.CitySortAscending;
    this.CountryCode = other.CountryCode;
    this.CountryCodeFetch = other.CountryCodeFetch;
    this.CountryCodeSort = other.CountryCodeSort;
    this.CountryCodeSortAscending = other.CountryCodeSortAscending;
    this.FranchiseCode = other.FranchiseCode;
    this.FranchiseCodeFetch = other.FranchiseCodeFetch;
    this.FranchiseCodeSort = other.FranchiseCodeSort;
    this.FranchiseCodeSortAscending = other.FranchiseCodeSortAscending;
    this.State = other.State;
    this.StateFetch = other.StateFetch;
    this.StateSort = other.StateSort;
    this.StateCaseInsensitive = other.StateCaseInsensitive;
    this.StateSortAscending = other.StateSortAscending;
    this.Zip = other.Zip;
    this.ZipFetch = other.ZipFetch;
    this.ZipSort = other.ZipSort;
    this.ZipCaseInsensitive = other.ZipCaseInsensitive;
    this.ZipSortAscending = other.ZipSortAscending;  }
  /** Set the field level Fetch value for field: City
   * @param fetch whether to fetch this field or not
   */
  public void setCityFetch (boolean fetch)
  {
    this.CityFetch = fetch;
  }
  /** Retrieve Fetch value for field: City
   * @return boolean the Fetch value for this field
   */
  public boolean getCityFetch ()
  {
    return this.CityFetch;
  }
  /** Set the SortOrder for field: City
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCitySortOrder (Integer value)
  {
    this.CitySort = value;
  }
  /** Retrieve SortOrder for field: City
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCitySortOrder ()
  {
    return this.CitySort;
  }
  /** Set the sort direction for field: City
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCitySortDirection (boolean ascending)
  {
    this.CitySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: City
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCitySortDirection ()
  {
    return this.CitySortAscending;
  }
  /** Set the case insensitive for field: City
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCityCaseInsensitive (boolean ascending)
  {
    this.CityCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: City
   * @return boolean whether the field is case insensitive
   */
  public boolean getCityCaseInsensitive ()
  {
    return this.CityCaseInsensitive;
  }
  /** Set the field level filters for field: City
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityFilter (StringFilter[] value) throws ServiceException
  {
    this.City = value;
  }
  /** Retrieve filter for field: City
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCityFilter ()
  {
    return this.City;
  }
  /** Set the field level Fetch value for field: CountryCode
   * @param fetch whether to fetch this field or not
   */
  public void setCountryCodeFetch (boolean fetch)
  {
    this.CountryCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountryCode
   * @return boolean the Fetch value for this field
   */
  public boolean getCountryCodeFetch ()
  {
    return this.CountryCodeFetch;
  }
  /** Set the SortOrder for field: CountryCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountryCodeSortOrder (Integer value)
  {
    this.CountryCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountryCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountryCodeSortOrder ()
  {
    return this.CountryCodeSort;
  }
  /** Set the sort direction for field: CountryCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountryCodeSortDirection (boolean ascending)
  {
    this.CountryCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountryCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountryCodeSortDirection ()
  {
    return this.CountryCodeSortAscending;
  }
  /** Set the field level filters for field: CountryCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountryCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CountryCode = value;
  }
  /** Retrieve filter for field: CountryCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountryCodeFilter ()
  {
    return this.CountryCode;
  }
  /** Set the field level Fetch value for field: FranchiseCode
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseCodeFetch (boolean fetch)
  {
    this.FranchiseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseCode
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseCodeFetch ()
  {
    return this.FranchiseCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseCodeSortOrder (Integer value)
  {
    this.FranchiseCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseCodeSortOrder ()
  {
    return this.FranchiseCodeSort;
  }
  /** Set the sort direction for field: FranchiseCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseCodeSortDirection (boolean ascending)
  {
    this.FranchiseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseCodeSortDirection ()
  {
    return this.FranchiseCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.FranchiseCode = value;
  }
  /** Retrieve filter for field: FranchiseCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFranchiseCodeFilter ()
  {
    return this.FranchiseCode;
  }
  /** Set the field level Fetch value for field: State
   * @param fetch whether to fetch this field or not
   */
  public void setStateFetch (boolean fetch)
  {
    this.StateFetch = fetch;
  }
  /** Retrieve Fetch value for field: State
   * @return boolean the Fetch value for this field
   */
  public boolean getStateFetch ()
  {
    return this.StateFetch;
  }
  /** Set the SortOrder for field: State
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateSortOrder (Integer value)
  {
    this.StateSort = value;
  }
  /** Retrieve SortOrder for field: State
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateSortOrder ()
  {
    return this.StateSort;
  }
  /** Set the sort direction for field: State
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateSortDirection (boolean ascending)
  {
    this.StateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: State
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateSortDirection ()
  {
    return this.StateSortAscending;
  }
  /** Set the case insensitive for field: State
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setStateCaseInsensitive (boolean ascending)
  {
    this.StateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: State
   * @return boolean whether the field is case insensitive
   */
  public boolean getStateCaseInsensitive ()
  {
    return this.StateCaseInsensitive;
  }
  /** Set the field level filters for field: State
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateFilter (StringFilter[] value) throws ServiceException
  {
    this.State = value;
  }
  /** Retrieve filter for field: State
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getStateFilter ()
  {
    return this.State;
  }
  /** Set the field level Fetch value for field: Zip
   * @param fetch whether to fetch this field or not
   */
  public void setZipFetch (boolean fetch)
  {
    this.ZipFetch = fetch;
  }
  /** Retrieve Fetch value for field: Zip
   * @return boolean the Fetch value for this field
   */
  public boolean getZipFetch ()
  {
    return this.ZipFetch;
  }
  /** Set the SortOrder for field: Zip
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setZipSortOrder (Integer value)
  {
    this.ZipSort = value;
  }
  /** Retrieve SortOrder for field: Zip
   * @return Integer the sort order, if set, for the field
   */
  public Integer getZipSortOrder ()
  {
    return this.ZipSort;
  }
  /** Set the sort direction for field: Zip
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setZipSortDirection (boolean ascending)
  {
    this.ZipSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Zip
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getZipSortDirection ()
  {
    return this.ZipSortAscending;
  }
  /** Set the case insensitive for field: Zip
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setZipCaseInsensitive (boolean ascending)
  {
    this.ZipCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Zip
   * @return boolean whether the field is case insensitive
   */
  public boolean getZipCaseInsensitive ()
  {
    return this.ZipCaseInsensitive;
  }
  /** Set the field level filters for field: Zip
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setZipFilter (StringFilter[] value) throws ServiceException
  {
    this.Zip = value;
  }
  /** Retrieve filter for field: Zip
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getZipFilter ()
  {
    return this.Zip;
  }
  public String toString() {
    return GeocodeAddressObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GeocodeAddressObjectHelper.toMap(this, null);
  }
}
