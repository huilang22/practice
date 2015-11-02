/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ETCQuoteRequestObjectFilter.java
 * Definition File: Customer/EarlyTerminationCharge.xml
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
public class ETCQuoteRequestObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  private String _objName = "ETCQuoteRequestObjectFilter";
  /** default constructor */
  public ETCQuoteRequestObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ETCQuoteRequestObjectFilter (ETCQuoteRequestObjectFilter other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;  }
  /** Set the field level Fetch value for field: AccountInternalId
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch)
  {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch ()
  {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value)
  {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder ()
  {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending)
  {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection ()
  {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter ()
  {
    return this.AccountInternalId;
  }
  /** Set the field level Fetch value for field: TrackingId
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    return this.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    return this.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: ServiceInternalId
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch)
  {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch ()
  {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value)
  {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder ()
  {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending)
  {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection ()
  {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdFilter ()
  {
    return this.ServiceInternalId;
  }
  /** Set the field level Fetch value for field: ServiceInternalIdResets
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch)
  {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch ()
  {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value)
  {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder ()
  {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending)
  {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection ()
  {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInternalIdResetsFilter ()
  {
    return this.ServiceInternalIdResets;
  }
  public String toString() {
    return ETCQuoteRequestObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ETCQuoteRequestObjectHelper.toMap(this, null);
  }
}
