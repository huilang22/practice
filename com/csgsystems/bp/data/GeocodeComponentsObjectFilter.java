/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeComponentsObjectFilter.java
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
public class GeocodeComponentsObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] CityCode  = null;
  protected boolean CityCodeFetch = false;
  protected boolean CityCodeSortAscending = true;
  protected Integer CityCodeSort = null;
  /** raw field */
  public    IntegerFilter[] CountyCode  = null;
  protected boolean CountyCodeFetch = false;
  protected boolean CountyCodeSortAscending = true;
  protected Integer CountyCodeSort = null;
  /** raw field */
  public    IntegerFilter[] StateCode  = null;
  protected boolean StateCodeFetch = false;
  protected boolean StateCodeSortAscending = true;
  protected Integer StateCodeSort = null;
  /** raw field */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  /** raw field */
  public    StringFilter[] County  = null;
  protected boolean CountyFetch = false;
  protected boolean CountySortAscending = true;
  protected boolean CountyCaseInsensitive = false;
  protected Integer CountySort = null;
  private String _objName = "GeocodeComponentsObjectFilter";
  /** default constructor */
  public GeocodeComponentsObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public GeocodeComponentsObjectFilter (GeocodeComponentsObjectFilter other)
  {
    if (other == null) return;
    this.CityCode = other.CityCode;
    this.CityCodeFetch = other.CityCodeFetch;
    this.CityCodeSort = other.CityCodeSort;
    this.CityCodeSortAscending = other.CityCodeSortAscending;
    this.CountyCode = other.CountyCode;
    this.CountyCodeFetch = other.CountyCodeFetch;
    this.CountyCodeSort = other.CountyCodeSort;
    this.CountyCodeSortAscending = other.CountyCodeSortAscending;
    this.StateCode = other.StateCode;
    this.StateCodeFetch = other.StateCodeFetch;
    this.StateCodeSort = other.StateCodeSort;
    this.StateCodeSortAscending = other.StateCodeSortAscending;
    this.Geocode = other.Geocode;
    this.GeocodeFetch = other.GeocodeFetch;
    this.GeocodeSort = other.GeocodeSort;
    this.GeocodeCaseInsensitive = other.GeocodeCaseInsensitive;
    this.GeocodeSortAscending = other.GeocodeSortAscending;
    this.County = other.County;
    this.CountyFetch = other.CountyFetch;
    this.CountySort = other.CountySort;
    this.CountyCaseInsensitive = other.CountyCaseInsensitive;
    this.CountySortAscending = other.CountySortAscending;  }
  /** Set the field level Fetch value for field: CityCode
   * @param fetch whether to fetch this field or not
   */
  public void setCityCodeFetch (boolean fetch)
  {
    this.CityCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityCode
   * @return boolean the Fetch value for this field
   */
  public boolean getCityCodeFetch ()
  {
    return this.CityCodeFetch;
  }
  /** Set the SortOrder for field: CityCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityCodeSortOrder (Integer value)
  {
    this.CityCodeSort = value;
  }
  /** Retrieve SortOrder for field: CityCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityCodeSortOrder ()
  {
    return this.CityCodeSort;
  }
  /** Set the sort direction for field: CityCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityCodeSortDirection (boolean ascending)
  {
    this.CityCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityCodeSortDirection ()
  {
    return this.CityCodeSortAscending;
  }
  /** Set the field level filters for field: CityCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CityCode = value;
  }
  /** Retrieve filter for field: CityCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCityCodeFilter ()
  {
    return this.CityCode;
  }
  /** Set the field level Fetch value for field: CountyCode
   * @param fetch whether to fetch this field or not
   */
  public void setCountyCodeFetch (boolean fetch)
  {
    this.CountyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyCode
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyCodeFetch ()
  {
    return this.CountyCodeFetch;
  }
  /** Set the SortOrder for field: CountyCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyCodeSortOrder (Integer value)
  {
    this.CountyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CountyCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyCodeSortOrder ()
  {
    return this.CountyCodeSort;
  }
  /** Set the sort direction for field: CountyCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyCodeSortDirection (boolean ascending)
  {
    this.CountyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyCodeSortDirection ()
  {
    return this.CountyCodeSortAscending;
  }
  /** Set the field level filters for field: CountyCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CountyCode = value;
  }
  /** Retrieve filter for field: CountyCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCountyCodeFilter ()
  {
    return this.CountyCode;
  }
  /** Set the field level Fetch value for field: StateCode
   * @param fetch whether to fetch this field or not
   */
  public void setStateCodeFetch (boolean fetch)
  {
    this.StateCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateCode
   * @return boolean the Fetch value for this field
   */
  public boolean getStateCodeFetch ()
  {
    return this.StateCodeFetch;
  }
  /** Set the SortOrder for field: StateCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateCodeSortOrder (Integer value)
  {
    this.StateCodeSort = value;
  }
  /** Retrieve SortOrder for field: StateCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateCodeSortOrder ()
  {
    return this.StateCodeSort;
  }
  /** Set the sort direction for field: StateCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateCodeSortDirection (boolean ascending)
  {
    this.StateCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateCodeSortDirection ()
  {
    return this.StateCodeSortAscending;
  }
  /** Set the field level filters for field: StateCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.StateCode = value;
  }
  /** Retrieve filter for field: StateCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStateCodeFilter ()
  {
    return this.StateCode;
  }
  /** Set the field level Fetch value for field: Geocode
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch)
  {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch ()
  {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value)
  {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder ()
  {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending)
  {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection ()
  {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending)
  {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode
   * @return boolean whether the field is case insensitive
   */
  public boolean getGeocodeCaseInsensitive ()
  {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException
  {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeocodeFilter ()
  {
    return this.Geocode;
  }
  /** Set the field level Fetch value for field: County
   * @param fetch whether to fetch this field or not
   */
  public void setCountyFetch (boolean fetch)
  {
    this.CountyFetch = fetch;
  }
  /** Retrieve Fetch value for field: County
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyFetch ()
  {
    return this.CountyFetch;
  }
  /** Set the SortOrder for field: County
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountySortOrder (Integer value)
  {
    this.CountySort = value;
  }
  /** Retrieve SortOrder for field: County
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountySortOrder ()
  {
    return this.CountySort;
  }
  /** Set the sort direction for field: County
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountySortDirection (boolean ascending)
  {
    this.CountySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: County
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountySortDirection ()
  {
    return this.CountySortAscending;
  }
  /** Set the case insensitive for field: County
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCountyCaseInsensitive (boolean ascending)
  {
    this.CountyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: County
   * @return boolean whether the field is case insensitive
   */
  public boolean getCountyCaseInsensitive ()
  {
    return this.CountyCaseInsensitive;
  }
  /** Set the field level filters for field: County
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyFilter (StringFilter[] value) throws ServiceException
  {
    this.County = value;
  }
  /** Retrieve filter for field: County
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCountyFilter ()
  {
    return this.County;
  }
  public String toString() {
    return GeocodeComponentsObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GeocodeComponentsObjectHelper.toMap(this, null);
  }
}
