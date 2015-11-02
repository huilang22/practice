/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectFilter.java
 * Definition File: Customer/PrepaymentDistribution.xml
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
public class PrepaymentDistributionObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public PrepaymentDistributionObjectKeyFilter Key = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.bmf_tracking_id) */
  public    IntegerFilter[] BmfTrackingId  = null;
  protected boolean BmfTrackingIdFetch = false;
  protected boolean BmfTrackingIdSortAscending = true;
  protected Integer BmfTrackingIdSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv) */
  public    IntegerFilter[] BmfTrackingIdServ  = null;
  protected boolean BmfTrackingIdServFetch = false;
  protected boolean BmfTrackingIdServSortAscending = true;
  protected Integer BmfTrackingIdServSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id) */
  public    IntegerFilter[] OrigBmfTrackingId  = null;
  protected boolean OrigBmfTrackingIdFetch = false;
  protected boolean OrigBmfTrackingIdSortAscending = true;
  protected Integer OrigBmfTrackingIdSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv) */
  public    IntegerFilter[] OrigBmfTrackingIdServ  = null;
  protected boolean OrigBmfTrackingIdServFetch = false;
  protected boolean OrigBmfTrackingIdServSortAscending = true;
  protected Integer OrigBmfTrackingIdServSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.status) */
  public    IntegerFilter[] Status  = null;
  protected boolean StatusFetch = false;
  protected boolean StatusSortAscending = true;
  protected Integer StatusSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: PREPAYMENT_DISTRIBUTION.is_tax) */
  public    BooleanFilter[] IsTax  = null;
  protected boolean IsTaxFetch = false;
  protected boolean IsTaxSortAscending = true;
  protected Integer IsTaxSort = null;
  private String _objName = "PrepaymentDistributionObjectFilter";
  /** default constructor */
  public PrepaymentDistributionObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public PrepaymentDistributionObjectFilter (PrepaymentDistributionObjectFilter other)
  {
    if (other == null) return;
    this.Key = new PrepaymentDistributionObjectKeyFilter (other.Key);
    this.BmfTrackingId = other.BmfTrackingId;
    this.BmfTrackingIdFetch = other.BmfTrackingIdFetch;
    this.BmfTrackingIdSort = other.BmfTrackingIdSort;
    this.BmfTrackingIdSortAscending = other.BmfTrackingIdSortAscending;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this.BmfTrackingIdServFetch = other.BmfTrackingIdServFetch;
    this.BmfTrackingIdServSort = other.BmfTrackingIdServSort;
    this.BmfTrackingIdServSortAscending = other.BmfTrackingIdServSortAscending;
    this.OrigBmfTrackingId = other.OrigBmfTrackingId;
    this.OrigBmfTrackingIdFetch = other.OrigBmfTrackingIdFetch;
    this.OrigBmfTrackingIdSort = other.OrigBmfTrackingIdSort;
    this.OrigBmfTrackingIdSortAscending = other.OrigBmfTrackingIdSortAscending;
    this.OrigBmfTrackingIdServ = other.OrigBmfTrackingIdServ;
    this.OrigBmfTrackingIdServFetch = other.OrigBmfTrackingIdServFetch;
    this.OrigBmfTrackingIdServSort = other.OrigBmfTrackingIdServSort;
    this.OrigBmfTrackingIdServSortAscending = other.OrigBmfTrackingIdServSortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.Status = other.Status;
    this.StatusFetch = other.StatusFetch;
    this.StatusSort = other.StatusSort;
    this.StatusSortAscending = other.StatusSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.IsTax = other.IsTax;
    this.IsTaxFetch = other.IsTaxFetch;
    this.IsTaxSort = other.IsTaxSort;
    this.IsTaxSortAscending = other.IsTaxSortAscending;  }
  /** get the filter for this object's key
   * @return PrepaymentDistributionObjectKeyFilter
   */
  public PrepaymentDistributionObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (PrepaymentDistributionObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepaymentTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepaymentTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PrepaymentTrackingIdFetch;
  }
  /** Set the SortOrder for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepaymentTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepaymentTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingIdSort;
  }
  /** Set the sort direction for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepaymentTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepaymentTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PrepaymentTrackingIdSortAscending;
  }
  /** Set the field level filters for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepaymentTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingId = value;
  }
  /** Retrieve filter for field: PrepaymentTrackingId (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepaymentTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingId;
  }
  /** Set the field level Fetch value for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepaymentTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepaymentTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.PrepaymentTrackingIdServFetch;
  }
  /** Set the SortOrder for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepaymentTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepaymentTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingIdServSort;
  }
  /** Set the sort direction for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepaymentTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepaymentTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.PrepaymentTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepaymentTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.PrepaymentTrackingIdServ = value;
  }
  /** Retrieve filter for field: PrepaymentTrackingIdServ (PREPAYMENT_DISTRIBUTION.prepayment_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepaymentTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.PrepaymentTrackingIdServ;
  }
  /** Set the field level Fetch value for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param fetch whether to fetch this field or not
   */
  public void setDistribOrderFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistribOrderFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribOrderFetch;
  }
  /** Set the SortOrder for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistribOrderSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderSort = value;
  }
  /** Retrieve SortOrder for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistribOrderSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribOrderSort;
  }
  /** Set the sort direction for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistribOrderSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistribOrderSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DistribOrderSortAscending;
  }
  /** Set the field level filters for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistribOrderFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new PrepaymentDistributionObjectKeyFilter ();
    this.Key.DistribOrder = value;
  }
  /** Retrieve filter for field: DistribOrder (PREPAYMENT_DISTRIBUTION.distrib_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDistribOrderFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DistribOrder;
  }
  /** Set the field level Fetch value for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdFetch (boolean fetch) {
    this.BmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdFetch () {
    return this.BmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdSortOrder (Integer value) {
    this.BmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdSortOrder () {
    return this.BmfTrackingIdSort;
  }
  /** Set the sort direction for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdSortDirection (boolean ascending) {
    this.BmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdSortDirection () {
    return this.BmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingId = value;
  }
  /** Retrieve filter for field: BmfTrackingId (PREPAYMENT_DISTRIBUTION.bmf_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdFilter () {
    return this.BmfTrackingId;
  }

  /**
   * Retrieves the BmfTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdFilter field
   */
  public String[] getBmfTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdFilter filter field
   */
  public void setBmfTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
    try {
      this.setBmfTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdServFetch (boolean fetch) {
    this.BmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdServFetch () {
    return this.BmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdServSortOrder (Integer value) {
    this.BmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdServSortOrder () {
    return this.BmfTrackingIdServSort;
  }
  /** Set the sort direction for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdServSortDirection (boolean ascending) {
    this.BmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdServSortDirection () {
    return this.BmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: BmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.bmf_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdServFilter () {
    return this.BmfTrackingIdServ;
  }

  /**
   * Retrieves the BmfTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServFilter field
   */
  public String[] getBmfTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdServFilter filter field
   */
  public void setBmfTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
    try {
      this.setBmfTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBmfTrackingIdFetch (boolean fetch) {
    this.OrigBmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBmfTrackingIdFetch () {
    return this.OrigBmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBmfTrackingIdSortOrder (Integer value) {
    this.OrigBmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBmfTrackingIdSortOrder () {
    return this.OrigBmfTrackingIdSort;
  }
  /** Set the sort direction for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBmfTrackingIdSortDirection (boolean ascending) {
    this.OrigBmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBmfTrackingIdSortDirection () {
    return this.OrigBmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBmfTrackingId = value;
  }
  /** Retrieve filter for field: OrigBmfTrackingId (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBmfTrackingIdFilter () {
    return this.OrigBmfTrackingId;
  }

  /**
   * Retrieves the OrigBmfTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBmfTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBmfTrackingIdFilter field
   */
  public String[] getOrigBmfTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBmfTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBmfTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBmfTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBmfTrackingIdFilter filter value from a formatted string
   *
   * @param _value the OrigBmfTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBmfTrackingIdFilter filter field
   */
  public void setOrigBmfTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBmfTrackingIdFilterFromFormattedString");
    try {
      this.setOrigBmfTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBmfTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBmfTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBmfTrackingIdServFetch (boolean fetch) {
    this.OrigBmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBmfTrackingIdServFetch () {
    return this.OrigBmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBmfTrackingIdServSortOrder (Integer value) {
    this.OrigBmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBmfTrackingIdServSortOrder () {
    return this.OrigBmfTrackingIdServSort;
  }
  /** Set the sort direction for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBmfTrackingIdServSortDirection (boolean ascending) {
    this.OrigBmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBmfTrackingIdServSortDirection () {
    return this.OrigBmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: OrigBmfTrackingIdServ (PREPAYMENT_DISTRIBUTION.orig_bmf_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBmfTrackingIdServFilter () {
    return this.OrigBmfTrackingIdServ;
  }

  /**
   * Retrieves the OrigBmfTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBmfTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBmfTrackingIdServFilter field
   */
  public String[] getOrigBmfTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBmfTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBmfTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBmfTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBmfTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBmfTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the OrigBmfTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBmfTrackingIdServFilter filter field
   */
  public void setOrigBmfTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBmfTrackingIdServFilterFromFormattedString");
    try {
      this.setOrigBmfTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBmfTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBmfTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (PREPAYMENT_DISTRIBUTION.amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmountFilter () {
    return this.Amount;
  }

  /**
   * Retrieves the AmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */
  public String[] getAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedString");
  }

  /**
   * Sets the AmountFilter filter value from a formatted string
   *
   * @param _value the AmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmountFilter filter field
   */
  public void setAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
    try {
      this.setAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the AmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountFilter field
   */

  public String[] getAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @param fetch whether to fetch this field or not
   */
  public void setStatusFetch (boolean fetch) {
    this.StatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return boolean the Fetch value for this field
   */
  public boolean getStatusFetch () {
    return this.StatusFetch;
  }
  /** Set the SortOrder for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStatusSortOrder (Integer value) {
    this.StatusSort = value;
  }
  /** Retrieve SortOrder for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStatusSortOrder () {
    return this.StatusSort;
  }
  /** Set the sort direction for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStatusSortDirection (boolean ascending) {
    this.StatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStatusSortDirection () {
    return this.StatusSortAscending;
  }
  /** Set the field level filters for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.Status = value;
  }
  /** Retrieve filter for field: Status (PREPAYMENT_DISTRIBUTION.status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStatusFilter () {
    return this.Status;
  }

  /**
   * Retrieves the StatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusFilter field
   */
  public String[] getStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StatusFilter filter value from a formatted string
   *
   * @param _value the StatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StatusFilter filter field
   */
  public void setStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatusFilterFromFormattedString");
    try {
      this.setStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (PREPAYMENT_DISTRIBUTION.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter () {
    return this.TransDate;
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (PREPAYMENT_DISTRIBUTION.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (PREPAYMENT_DISTRIBUTION.chg_who)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getChgWhoFilter () {
    return this.ChgWho;
  }

  /**
   * Retrieves the ChgWhoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgWhoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWhoFilter field
   */
  public String[] getChgWhoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgWhoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgWhoFilter filter value from a formatted string
   *
   * @param _value the ChgWhoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgWhoFilter filter field
   */
  public void setChgWhoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgWhoFilterFromFormattedString");
    try {
      this.setChgWhoFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgWhoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setIsTaxFetch (boolean fetch) {
    this.IsTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsTaxFetch () {
    return this.IsTaxFetch;
  }
  /** Set the SortOrder for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsTaxSortOrder (Integer value) {
    this.IsTaxSort = value;
  }
  /** Retrieve SortOrder for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsTaxSortOrder () {
    return this.IsTaxSort;
  }
  /** Set the sort direction for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsTaxSortDirection (boolean ascending) {
    this.IsTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsTaxSortDirection () {
    return this.IsTaxSortAscending;
  }
  /** Set the field level filters for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsTaxFilter (BooleanFilter[] value) throws ServiceException {
    this.IsTax = value;
  }
  /** Retrieve filter for field: IsTax (PREPAYMENT_DISTRIBUTION.is_tax)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsTaxFilter () {
    return this.IsTax;
  }

  /**
   * Retrieves the IsTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsTaxFilter field
   */
  public String[] getIsTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsTaxFilter filter value from a formatted string
   *
   * @param _value the IsTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsTaxFilter filter field
   */
  public void setIsTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsTaxFilterFromFormattedString");
    try {
      this.setIsTaxFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsTaxFilterFromFormattedString");
  }

  public String toString() {
    return PrepaymentDistributionObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return PrepaymentDistributionObjectHelper.toMap(this, null);
  }
}
