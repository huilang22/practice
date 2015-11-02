/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrAccountSegmentObjectFilter.java
 * Definition File: Admin/CsrAccountSegment.xml
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
public class CsrAccountSegmentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public CsrAccountSegmentObjectKeyFilter Key = null;
  /** raw field for: CSR_ACCT_SEG.is_csr_default) */
  public    BooleanFilter[] IsCsrDefault  = null;
  protected boolean IsCsrDefaultFetch = false;
  protected boolean IsCsrDefaultSortAscending = true;
  protected Integer IsCsrDefaultSort = null;
  /** raw field for: CSR_ACCT_SEG.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "CsrAccountSegmentObjectFilter";
  /** default constructor */
  public CsrAccountSegmentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public CsrAccountSegmentObjectFilter (CsrAccountSegmentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new CsrAccountSegmentObjectKeyFilter (other.Key);
    this.IsCsrDefault = other.IsCsrDefault;
    this.IsCsrDefaultFetch = other.IsCsrDefaultFetch;
    this.IsCsrDefaultSort = other.IsCsrDefaultSort;
    this.IsCsrDefaultSortAscending = other.IsCsrDefaultSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return CsrAccountSegmentObjectKeyFilter
   */
  public CsrAccountSegmentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (CsrAccountSegmentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @param fetch whether to fetch this field or not
   */
  public void setCsrNameFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.CsrNameFetch = fetch;
  }
  /** Retrieve Fetch value for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return boolean the Fetch value for this field
   */
  public boolean getCsrNameFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.CsrNameFetch;
  }
  /** Set the SortOrder for field: CsrName (CSR_ACCT_SEG.csr_name)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCsrNameSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.CsrNameSort = value;
  }
  /** Retrieve SortOrder for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCsrNameSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.CsrNameSort;
  }
  /** Set the sort direction for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCsrNameSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.CsrNameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCsrNameSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.CsrNameSortAscending;
  }
  /** Set the case insensitive for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCsrNameCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.CsrNameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return boolean whether the field is case insensitive
   */
  public boolean getCsrNameCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.CsrNameCaseInsensitive;
  }
  /** Set the field level filters for field: CsrName (CSR_ACCT_SEG.csr_name)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCsrNameFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.CsrName = value;
  }
  /** Retrieve filter for field: CsrName (CSR_ACCT_SEG.csr_name)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCsrNameFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.CsrName;
  }
  /** Set the field level Fetch value for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcctSegIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.AcctSegIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcctSegIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AcctSegIdFetch;
  }
  /** Set the SortOrder for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcctSegIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.AcctSegIdSort = value;
  }
  /** Retrieve SortOrder for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcctSegIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AcctSegIdSort;
  }
  /** Set the sort direction for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcctSegIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.AcctSegIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcctSegIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AcctSegIdSortAscending;
  }
  /** Set the field level filters for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcctSegIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new CsrAccountSegmentObjectKeyFilter ();
    this.Key.AcctSegId = value;
  }
  /** Retrieve filter for field: AcctSegId (CSR_ACCT_SEG.acct_seg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcctSegIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AcctSegId;
  }
  /** Set the field level Fetch value for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCsrDefaultFetch (boolean fetch) {
    this.IsCsrDefaultFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCsrDefaultFetch () {
    return this.IsCsrDefaultFetch;
  }
  /** Set the SortOrder for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCsrDefaultSortOrder (Integer value) {
    this.IsCsrDefaultSort = value;
  }
  /** Retrieve SortOrder for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCsrDefaultSortOrder () {
    return this.IsCsrDefaultSort;
  }
  /** Set the sort direction for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCsrDefaultSortDirection (boolean ascending) {
    this.IsCsrDefaultSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCsrDefaultSortDirection () {
    return this.IsCsrDefaultSortAscending;
  }
  /** Set the field level filters for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCsrDefaultFilter (BooleanFilter[] value) throws ServiceException {
    this.IsCsrDefault = value;
  }
  /** Retrieve filter for field: IsCsrDefault (CSR_ACCT_SEG.is_csr_default)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsCsrDefaultFilter () {
    return this.IsCsrDefault;
  }

  /**
   * Retrieves the IsCsrDefaultFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsCsrDefaultFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCsrDefaultFilter field
   */
  public String[] getIsCsrDefaultFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCsrDefaultFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsCsrDefaultFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCsrDefaultFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCsrDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCsrDefaultFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsCsrDefaultFilter filter value from a formatted string
   *
   * @param _value the IsCsrDefaultFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsCsrDefaultFilter filter field
   */
  public void setIsCsrDefaultFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsCsrDefaultFilterFromFormattedString");
    try {
      this.setIsCsrDefaultFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCsrDefaultFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCsrDefaultFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCsrDefaultFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (CSR_ACCT_SEG.config_tag_id)
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

  public String toString() {
    return CsrAccountSegmentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return CsrAccountSegmentObjectHelper.toMap(this, null);
  }
}
