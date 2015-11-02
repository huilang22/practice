/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjKeyObjectFilter.java
 * Definition File: Customer/MultiLinesAdj.xml
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
public class MultiLinesAdjKeyObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: MULTI_LINES_ADJ.bill_ref_no) */
  public    IntegerFilter[] BillRefNo1  = null;
  protected boolean BillRefNo1Fetch = false;
  protected boolean BillRefNo1SortAscending = true;
  protected Integer BillRefNo1Sort = null;
  /** raw field for: MULTI_LINES_ADJ.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets1  = null;
  protected boolean BillRefResets1Fetch = false;
  protected boolean BillRefResets1SortAscending = true;
  protected Integer BillRefResets1Sort = null;
  /** raw field for: MULTI_LINES_ADJ.account_no) */
  public    IntegerFilter[] AccountNo1  = null;
  protected boolean AccountNo1Fetch = false;
  protected boolean AccountNo1SortAscending = true;
  protected Integer AccountNo1Sort = null;
  private String _objName = "MultiLinesAdjKeyObjectFilter";
  /** default constructor */
  public MultiLinesAdjKeyObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public MultiLinesAdjKeyObjectFilter (MultiLinesAdjKeyObjectFilter other)
  {
    if (other == null) return;
    this.BillRefNo1 = other.BillRefNo1;
    this.BillRefNo1Fetch = other.BillRefNo1Fetch;
    this.BillRefNo1Sort = other.BillRefNo1Sort;
    this.BillRefNo1SortAscending = other.BillRefNo1SortAscending;
    this.BillRefResets1 = other.BillRefResets1;
    this.BillRefResets1Fetch = other.BillRefResets1Fetch;
    this.BillRefResets1Sort = other.BillRefResets1Sort;
    this.BillRefResets1SortAscending = other.BillRefResets1SortAscending;
    this.AccountNo1 = other.AccountNo1;
    this.AccountNo1Fetch = other.AccountNo1Fetch;
    this.AccountNo1Sort = other.AccountNo1Sort;
    this.AccountNo1SortAscending = other.AccountNo1SortAscending;  }
  /** Set the field level Fetch value for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNo1Fetch (boolean fetch) {
    this.BillRefNo1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNo1Fetch () {
    return this.BillRefNo1Fetch;
  }
  /** Set the SortOrder for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNo1SortOrder (Integer value) {
    this.BillRefNo1Sort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNo1SortOrder () {
    return this.BillRefNo1Sort;
  }
  /** Set the sort direction for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNo1SortDirection (boolean ascending) {
    this.BillRefNo1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNo1SortDirection () {
    return this.BillRefNo1SortAscending;
  }
  /** Set the field level filters for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNo1Filter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo1 = value;
  }
  /** Retrieve filter for field: BillRefNo1 (MULTI_LINES_ADJ.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNo1Filter () {
    return this.BillRefNo1;
  }

  /**
   * Retrieves the BillRefNo1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefNo1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo1Filter field
   */
  public String[] getBillRefNo1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNo1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefNo1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNo1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNo1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNo1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefNo1Filter filter value from a formatted string
   *
   * @param _value the BillRefNo1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefNo1Filter filter field
   */
  public void setBillRefNo1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefNo1FilterFromFormattedString");
    try {
      this.setBillRefNo1Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNo1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNo1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNo1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResets1Fetch (boolean fetch) {
    this.BillRefResets1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResets1Fetch () {
    return this.BillRefResets1Fetch;
  }
  /** Set the SortOrder for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResets1SortOrder (Integer value) {
    this.BillRefResets1Sort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResets1SortOrder () {
    return this.BillRefResets1Sort;
  }
  /** Set the sort direction for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResets1SortDirection (boolean ascending) {
    this.BillRefResets1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResets1SortDirection () {
    return this.BillRefResets1SortAscending;
  }
  /** Set the field level filters for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResets1Filter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets1 = value;
  }
  /** Retrieve filter for field: BillRefResets1 (MULTI_LINES_ADJ.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResets1Filter () {
    return this.BillRefResets1;
  }

  /**
   * Retrieves the BillRefResets1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefResets1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets1Filter field
   */
  public String[] getBillRefResets1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResets1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefResets1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResets1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResets1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResets1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefResets1Filter filter value from a formatted string
   *
   * @param _value the BillRefResets1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefResets1Filter filter field
   */
  public void setBillRefResets1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefResets1FilterFromFormattedString");
    try {
      this.setBillRefResets1Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResets1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResets1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResets1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountNo1Fetch (boolean fetch) {
    this.AccountNo1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountNo1Fetch () {
    return this.AccountNo1Fetch;
  }
  /** Set the SortOrder for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountNo1SortOrder (Integer value) {
    this.AccountNo1Sort = value;
  }
  /** Retrieve SortOrder for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountNo1SortOrder () {
    return this.AccountNo1Sort;
  }
  /** Set the sort direction for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountNo1SortDirection (boolean ascending) {
    this.AccountNo1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountNo1SortDirection () {
    return this.AccountNo1SortAscending;
  }
  /** Set the field level filters for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountNo1Filter (IntegerFilter[] value) throws ServiceException {
    this.AccountNo1 = value;
  }
  /** Retrieve filter for field: AccountNo1 (MULTI_LINES_ADJ.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountNo1Filter () {
    return this.AccountNo1;
  }

  /**
   * Retrieves the AccountNo1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountNo1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountNo1Filter field
   */
  public String[] getAccountNo1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNo1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountNo1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountNo1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountNo1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountNo1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountNo1Filter filter value from a formatted string
   *
   * @param _value the AccountNo1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountNo1Filter filter field
   */
  public void setAccountNo1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountNo1FilterFromFormattedString");
    try {
      this.setAccountNo1Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountNo1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountNo1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountNo1FilterFromFormattedString");
  }

  public String toString() {
    return MultiLinesAdjKeyObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return MultiLinesAdjKeyObjectHelper.toMap(this, null);
  }
}
