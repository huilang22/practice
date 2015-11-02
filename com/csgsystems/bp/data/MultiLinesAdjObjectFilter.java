/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjObjectFilter.java
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
public class MultiLinesAdjObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field for: MULTI_LINES_ADJ.msg_id) */
  public    IntegerFilter[] MsgId  = null;
  protected boolean MsgIdFetch = false;
  protected boolean MsgIdSortAscending = true;
  protected Integer MsgIdSort = null;
  /** raw field for: MULTI_LINES_ADJ.msg_id2) */
  public    IntegerFilter[] MsgId2  = null;
  protected boolean MsgId2Fetch = false;
  protected boolean MsgId2SortAscending = true;
  protected Integer MsgId2Sort = null;
  /** raw field for: MULTI_LINES_ADJ.msg_id_serv) */
  public    IntegerFilter[] MsgIdServ  = null;
  protected boolean MsgIdServFetch = false;
  protected boolean MsgIdServSortAscending = true;
  protected Integer MsgIdServSort = null;
  /** raw field for: MULTI_LINES_ADJ.split_row_num) */
  public    IntegerFilter[] SplitRowNum  = null;
  protected boolean SplitRowNumFetch = false;
  protected boolean SplitRowNumSortAscending = true;
  protected Integer SplitRowNumSort = null;
  /** raw field for: MULTI_LINES_ADJ.bill_ref_no) */
  public    IntegerFilter[] BillRefNo  = null;
  protected boolean BillRefNoFetch = false;
  protected boolean BillRefNoSortAscending = true;
  protected Integer BillRefNoSort = null;
  /** raw field for: MULTI_LINES_ADJ.bill_ref_resets) */
  public    IntegerFilter[] BillRefResets  = null;
  protected boolean BillRefResetsFetch = false;
  protected boolean BillRefResetsSortAscending = true;
  protected Integer BillRefResetsSort = null;
  /** raw field for: MULTI_LINES_ADJ.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: MULTI_LINES_ADJ.adj_trans_code) */
  public    IntegerFilter[] AdjTransCode  = null;
  protected boolean AdjTransCodeFetch = false;
  protected boolean AdjTransCodeSortAscending = true;
  protected Integer AdjTransCodeSort = null;
  /** raw field for: MULTI_LINES_ADJ.amt_eligible_calc) */
  public    BigIntegerFilter[] AmtEligibleCalc  = null;
  protected boolean AmtEligibleCalcFetch = false;
  protected boolean AmtEligibleCalcSortAscending = true;
  protected Integer AmtEligibleCalcSort = null;
  /** raw field for: MULTI_LINES_ADJ.row_number) */
  public    IntegerFilter[] RowNumber  = null;
  protected boolean RowNumberFetch = false;
  protected boolean RowNumberSortAscending = true;
  protected Integer RowNumberSort = null;
  private String _objName = "MultiLinesAdjObjectFilter";
  /** default constructor */
  public MultiLinesAdjObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public MultiLinesAdjObjectFilter (MultiLinesAdjObjectFilter other)
  {
    if (other == null) return;
    this.MsgId = other.MsgId;
    this.MsgIdFetch = other.MsgIdFetch;
    this.MsgIdSort = other.MsgIdSort;
    this.MsgIdSortAscending = other.MsgIdSortAscending;
    this.MsgId2 = other.MsgId2;
    this.MsgId2Fetch = other.MsgId2Fetch;
    this.MsgId2Sort = other.MsgId2Sort;
    this.MsgId2SortAscending = other.MsgId2SortAscending;
    this.MsgIdServ = other.MsgIdServ;
    this.MsgIdServFetch = other.MsgIdServFetch;
    this.MsgIdServSort = other.MsgIdServSort;
    this.MsgIdServSortAscending = other.MsgIdServSortAscending;
    this.SplitRowNum = other.SplitRowNum;
    this.SplitRowNumFetch = other.SplitRowNumFetch;
    this.SplitRowNumSort = other.SplitRowNumSort;
    this.SplitRowNumSortAscending = other.SplitRowNumSortAscending;
    this.BillRefNo = other.BillRefNo;
    this.BillRefNoFetch = other.BillRefNoFetch;
    this.BillRefNoSort = other.BillRefNoSort;
    this.BillRefNoSortAscending = other.BillRefNoSortAscending;
    this.BillRefResets = other.BillRefResets;
    this.BillRefResetsFetch = other.BillRefResetsFetch;
    this.BillRefResetsSort = other.BillRefResetsSort;
    this.BillRefResetsSortAscending = other.BillRefResetsSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.AdjTransCode = other.AdjTransCode;
    this.AdjTransCodeFetch = other.AdjTransCodeFetch;
    this.AdjTransCodeSort = other.AdjTransCodeSort;
    this.AdjTransCodeSortAscending = other.AdjTransCodeSortAscending;
    this.AmtEligibleCalc = other.AmtEligibleCalc;
    this.AmtEligibleCalcFetch = other.AmtEligibleCalcFetch;
    this.AmtEligibleCalcSort = other.AmtEligibleCalcSort;
    this.AmtEligibleCalcSortAscending = other.AmtEligibleCalcSortAscending;
    this.RowNumber = other.RowNumber;
    this.RowNumberFetch = other.RowNumberFetch;
    this.RowNumberSort = other.RowNumberSort;
    this.RowNumberSortAscending = other.RowNumberSortAscending;  }
  /** Set the field level Fetch value for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdFetch (boolean fetch) {
    this.MsgIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdFetch () {
    return this.MsgIdFetch;
  }
  /** Set the SortOrder for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdSortOrder (Integer value) {
    this.MsgIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdSortOrder () {
    return this.MsgIdSort;
  }
  /** Set the sort direction for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdSortDirection (boolean ascending) {
    this.MsgIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdSortDirection () {
    return this.MsgIdSortAscending;
  }
  /** Set the field level filters for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgId = value;
  }
  /** Retrieve filter for field: MsgId (MULTI_LINES_ADJ.msg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdFilter () {
    return this.MsgId;
  }

  /**
   * Retrieves the MsgIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdFilter field
   */
  public String[] getMsgIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdFilter filter value from a formatted string
   *
   * @param _value the MsgIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdFilter filter field
   */
  public void setMsgIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdFilterFromFormattedString");
    try {
      this.setMsgIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgId2Fetch (boolean fetch) {
    this.MsgId2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgId2Fetch () {
    return this.MsgId2Fetch;
  }
  /** Set the SortOrder for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgId2SortOrder (Integer value) {
    this.MsgId2Sort = value;
  }
  /** Retrieve SortOrder for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgId2SortOrder () {
    return this.MsgId2Sort;
  }
  /** Set the sort direction for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgId2SortDirection (boolean ascending) {
    this.MsgId2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgId2SortDirection () {
    return this.MsgId2SortAscending;
  }
  /** Set the field level filters for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgId2Filter (IntegerFilter[] value) throws ServiceException {
    this.MsgId2 = value;
  }
  /** Retrieve filter for field: MsgId2 (MULTI_LINES_ADJ.msg_id2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgId2Filter () {
    return this.MsgId2;
  }

  /**
   * Retrieves the MsgId2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgId2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2Filter field
   */
  public String[] getMsgId2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgId2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgId2Filter filter value from a formatted string
   *
   * @param _value the MsgId2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgId2Filter filter field
   */
  public void setMsgId2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgId2FilterFromFormattedString");
    try {
      this.setMsgId2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgId2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgIdServFetch (boolean fetch) {
    this.MsgIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgIdServFetch () {
    return this.MsgIdServFetch;
  }
  /** Set the SortOrder for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgIdServSortOrder (Integer value) {
    this.MsgIdServSort = value;
  }
  /** Retrieve SortOrder for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgIdServSortOrder () {
    return this.MsgIdServSort;
  }
  /** Set the sort direction for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgIdServSortDirection (boolean ascending) {
    this.MsgIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgIdServSortDirection () {
    return this.MsgIdServSortAscending;
  }
  /** Set the field level filters for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgIdServ = value;
  }
  /** Retrieve filter for field: MsgIdServ (MULTI_LINES_ADJ.msg_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgIdServFilter () {
    return this.MsgIdServ;
  }

  /**
   * Retrieves the MsgIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServFilter field
   */
  public String[] getMsgIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgIdServFilter filter value from a formatted string
   *
   * @param _value the MsgIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgIdServFilter filter field
   */
  public void setMsgIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgIdServFilterFromFormattedString");
    try {
      this.setMsgIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @param fetch whether to fetch this field or not
   */
  public void setSplitRowNumFetch (boolean fetch) {
    this.SplitRowNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getSplitRowNumFetch () {
    return this.SplitRowNumFetch;
  }
  /** Set the SortOrder for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSplitRowNumSortOrder (Integer value) {
    this.SplitRowNumSort = value;
  }
  /** Retrieve SortOrder for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSplitRowNumSortOrder () {
    return this.SplitRowNumSort;
  }
  /** Set the sort direction for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSplitRowNumSortDirection (boolean ascending) {
    this.SplitRowNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSplitRowNumSortDirection () {
    return this.SplitRowNumSortAscending;
  }
  /** Set the field level filters for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSplitRowNumFilter (IntegerFilter[] value) throws ServiceException {
    this.SplitRowNum = value;
  }
  /** Retrieve filter for field: SplitRowNum (MULTI_LINES_ADJ.split_row_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSplitRowNumFilter () {
    return this.SplitRowNum;
  }

  /**
   * Retrieves the SplitRowNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SplitRowNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNumFilter field
   */
  public String[] getSplitRowNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSplitRowNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SplitRowNumFilter filter value from a formatted string
   *
   * @param _value the SplitRowNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SplitRowNumFilter filter field
   */
  public void setSplitRowNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSplitRowNumFilterFromFormattedString");
    try {
      this.setSplitRowNumFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SplitRowNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch) {
    this.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch () {
    return this.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value) {
    this.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder () {
    return this.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending) {
    this.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection () {
    return this.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (MULTI_LINES_ADJ.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter () {
    return this.BillRefNo;
  }

  /**
   * Retrieves the BillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNoFilter field
   */
  public String[] getBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefNoFilter filter value from a formatted string
   *
   * @param _value the BillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefNoFilter filter field
   */
  public void setBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefNoFilterFromFormattedString");
    try {
      this.setBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch) {
    this.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch () {
    return this.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value) {
    this.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder () {
    return this.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending) {
    this.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection () {
    return this.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (MULTI_LINES_ADJ.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter () {
    return this.BillRefResets;
  }

  /**
   * Retrieves the BillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResetsFilter field
   */
  public String[] getBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillRefResetsFilter filter value from a formatted string
   *
   * @param _value the BillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillRefResetsFilter filter field
   */
  public void setBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillRefResetsFilterFromFormattedString");
    try {
      this.setBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (MULTI_LINES_ADJ.account_no)
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

  /** Set the field level Fetch value for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @param fetch whether to fetch this field or not
   */
  public void setAdjTransCodeFetch (boolean fetch) {
    this.AdjTransCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getAdjTransCodeFetch () {
    return this.AdjTransCodeFetch;
  }
  /** Set the SortOrder for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAdjTransCodeSortOrder (Integer value) {
    this.AdjTransCodeSort = value;
  }
  /** Retrieve SortOrder for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAdjTransCodeSortOrder () {
    return this.AdjTransCodeSort;
  }
  /** Set the sort direction for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAdjTransCodeSortDirection (boolean ascending) {
    this.AdjTransCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAdjTransCodeSortDirection () {
    return this.AdjTransCodeSortAscending;
  }
  /** Set the field level filters for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAdjTransCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.AdjTransCode = value;
  }
  /** Retrieve filter for field: AdjTransCode (MULTI_LINES_ADJ.adj_trans_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAdjTransCodeFilter () {
    return this.AdjTransCode;
  }

  /**
   * Retrieves the AdjTransCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AdjTransCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AdjTransCodeFilter field
   */
  public String[] getAdjTransCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAdjTransCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAdjTransCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAdjTransCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAdjTransCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AdjTransCodeFilter filter value from a formatted string
   *
   * @param _value the AdjTransCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AdjTransCodeFilter filter field
   */
  public void setAdjTransCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAdjTransCodeFilterFromFormattedString");
    try {
      this.setAdjTransCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AdjTransCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAdjTransCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAdjTransCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @param fetch whether to fetch this field or not
   */
  public void setAmtEligibleCalcFetch (boolean fetch) {
    this.AmtEligibleCalcFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmtEligibleCalcFetch () {
    return this.AmtEligibleCalcFetch;
  }
  /** Set the SortOrder for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmtEligibleCalcSortOrder (Integer value) {
    this.AmtEligibleCalcSort = value;
  }
  /** Retrieve SortOrder for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmtEligibleCalcSortOrder () {
    return this.AmtEligibleCalcSort;
  }
  /** Set the sort direction for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmtEligibleCalcSortDirection (boolean ascending) {
    this.AmtEligibleCalcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmtEligibleCalcSortDirection () {
    return this.AmtEligibleCalcSortAscending;
  }
  /** Set the field level filters for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmtEligibleCalcFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AmtEligibleCalc = value;
  }
  /** Retrieve filter for field: AmtEligibleCalc (MULTI_LINES_ADJ.amt_eligible_calc)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getAmtEligibleCalcFilter () {
    return this.AmtEligibleCalc;
  }

  /**
   * Retrieves the AmtEligibleCalcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmtEligibleCalcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmtEligibleCalcFilter field
   */
  public String[] getAmtEligibleCalcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmtEligibleCalcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAmtEligibleCalcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmtEligibleCalcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmtEligibleCalcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmtEligibleCalcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AmtEligibleCalcFilter filter value from a formatted string
   *
   * @param _value the AmtEligibleCalcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AmtEligibleCalcFilter filter field
   */
  public void setAmtEligibleCalcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmtEligibleCalcFilterFromFormattedString");
    try {
      this.setAmtEligibleCalcFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmtEligibleCalcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmtEligibleCalcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmtEligibleCalcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @param fetch whether to fetch this field or not
   */
  public void setRowNumberFetch (boolean fetch) {
    this.RowNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getRowNumberFetch () {
    return this.RowNumberFetch;
  }
  /** Set the SortOrder for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRowNumberSortOrder (Integer value) {
    this.RowNumberSort = value;
  }
  /** Retrieve SortOrder for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRowNumberSortOrder () {
    return this.RowNumberSort;
  }
  /** Set the sort direction for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRowNumberSortDirection (boolean ascending) {
    this.RowNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRowNumberSortDirection () {
    return this.RowNumberSortAscending;
  }
  /** Set the field level filters for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRowNumberFilter (IntegerFilter[] value) throws ServiceException {
    this.RowNumber = value;
  }
  /** Retrieve filter for field: RowNumber (MULTI_LINES_ADJ.row_number)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRowNumberFilter () {
    return this.RowNumber;
  }

  /**
   * Retrieves the RowNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RowNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RowNumberFilter field
   */
  public String[] getRowNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRowNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRowNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRowNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RowNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRowNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RowNumberFilter filter value from a formatted string
   *
   * @param _value the RowNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RowNumberFilter filter field
   */
  public void setRowNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRowNumberFilterFromFormattedString");
    try {
      this.setRowNumberFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RowNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRowNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRowNumberFilterFromFormattedString");
  }

  public String toString() {
    return MultiLinesAdjObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return MultiLinesAdjObjectHelper.toMap(this, null);
  }
}
