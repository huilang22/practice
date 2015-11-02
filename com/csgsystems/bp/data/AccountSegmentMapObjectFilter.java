/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentMapObjectFilter.java
 * Definition File: Admin/AccountSegmentMap.xml
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
public class AccountSegmentMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public AccountSegmentMapObjectKeyFilter Key = null;
  /** raw field for: ACCT_SEG_MAP.mkt_code) */
  public    IntegerFilter[] MktCode  = null;
  protected boolean MktCodeFetch = false;
  protected boolean MktCodeSortAscending = true;
  protected Integer MktCodeSort = null;
  /** raw field for: ACCT_SEG_MAP.franchise_code) */
  public    IntegerFilter[] FranchiseCode  = null;
  protected boolean FranchiseCodeFetch = false;
  protected boolean FranchiseCodeSortAscending = true;
  protected Integer FranchiseCodeSort = null;
  /** raw field for: ACCT_SEG_MAP.rev_rcv_cost_ctr) */
  public    IntegerFilter[] RevRcvCostCtr  = null;
  protected boolean RevRcvCostCtrFetch = false;
  protected boolean RevRcvCostCtrSortAscending = true;
  protected Integer RevRcvCostCtrSort = null;
  /** raw field for: ACCT_SEG_MAP.remit_service_center) */
  public    IntegerFilter[] RemitServiceCenter  = null;
  protected boolean RemitServiceCenterFetch = false;
  protected boolean RemitServiceCenterSortAscending = true;
  protected Integer RemitServiceCenterSort = null;
  /** raw field for: ACCT_SEG_MAP.billing_service_center) */
  public    IntegerFilter[] BillingServiceCenter  = null;
  protected boolean BillingServiceCenterFetch = false;
  protected boolean BillingServiceCenterSortAscending = true;
  protected Integer BillingServiceCenterSort = null;
  /** raw field for: ACCT_SEG_MAP.service_inquiry_center) */
  public    IntegerFilter[] ServiceInquiryCenter  = null;
  protected boolean ServiceInquiryCenterFetch = false;
  protected boolean ServiceInquiryCenterSortAscending = true;
  protected Integer ServiceInquiryCenterSort = null;
  /** raw field for: ACCT_SEG_MAP.collections_center) */
  public    IntegerFilter[] CollectionsCenter  = null;
  protected boolean CollectionsCenterFetch = false;
  protected boolean CollectionsCenterSortAscending = true;
  protected Integer CollectionsCenterSort = null;
  /** raw field for: ACCT_SEG_MAP.msg_grp_id) */
  public    IntegerFilter[] MsgGrpId  = null;
  protected boolean MsgGrpIdFetch = false;
  protected boolean MsgGrpIdSortAscending = true;
  protected Integer MsgGrpIdSort = null;
  /** raw field for: ACCT_SEG_MAP.insert_grp_id) */
  public    IntegerFilter[] InsertGrpId  = null;
  protected boolean InsertGrpIdFetch = false;
  protected boolean InsertGrpIdSortAscending = true;
  protected Integer InsertGrpIdSort = null;
  /** raw field for: ACCT_SEG_MAP.vip_code) */
  public    IntegerFilter[] VipCode  = null;
  protected boolean VipCodeFetch = false;
  protected boolean VipCodeSortAscending = true;
  protected Integer VipCodeSort = null;
  /** raw field for: ACCT_SEG_MAP.rate_class) */
  public    IntegerFilter[] RateClass  = null;
  protected boolean RateClassFetch = false;
  protected boolean RateClassSortAscending = true;
  protected Integer RateClassSort = null;
  /** raw field for: ACCT_SEG_MAP.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "AccountSegmentMapObjectFilter";
  /** default constructor */
  public AccountSegmentMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public AccountSegmentMapObjectFilter (AccountSegmentMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new AccountSegmentMapObjectKeyFilter (other.Key);
    this.MktCode = other.MktCode;
    this.MktCodeFetch = other.MktCodeFetch;
    this.MktCodeSort = other.MktCodeSort;
    this.MktCodeSortAscending = other.MktCodeSortAscending;
    this.FranchiseCode = other.FranchiseCode;
    this.FranchiseCodeFetch = other.FranchiseCodeFetch;
    this.FranchiseCodeSort = other.FranchiseCodeSort;
    this.FranchiseCodeSortAscending = other.FranchiseCodeSortAscending;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this.RevRcvCostCtrFetch = other.RevRcvCostCtrFetch;
    this.RevRcvCostCtrSort = other.RevRcvCostCtrSort;
    this.RevRcvCostCtrSortAscending = other.RevRcvCostCtrSortAscending;
    this.RemitServiceCenter = other.RemitServiceCenter;
    this.RemitServiceCenterFetch = other.RemitServiceCenterFetch;
    this.RemitServiceCenterSort = other.RemitServiceCenterSort;
    this.RemitServiceCenterSortAscending = other.RemitServiceCenterSortAscending;
    this.BillingServiceCenter = other.BillingServiceCenter;
    this.BillingServiceCenterFetch = other.BillingServiceCenterFetch;
    this.BillingServiceCenterSort = other.BillingServiceCenterSort;
    this.BillingServiceCenterSortAscending = other.BillingServiceCenterSortAscending;
    this.ServiceInquiryCenter = other.ServiceInquiryCenter;
    this.ServiceInquiryCenterFetch = other.ServiceInquiryCenterFetch;
    this.ServiceInquiryCenterSort = other.ServiceInquiryCenterSort;
    this.ServiceInquiryCenterSortAscending = other.ServiceInquiryCenterSortAscending;
    this.CollectionsCenter = other.CollectionsCenter;
    this.CollectionsCenterFetch = other.CollectionsCenterFetch;
    this.CollectionsCenterSort = other.CollectionsCenterSort;
    this.CollectionsCenterSortAscending = other.CollectionsCenterSortAscending;
    this.MsgGrpId = other.MsgGrpId;
    this.MsgGrpIdFetch = other.MsgGrpIdFetch;
    this.MsgGrpIdSort = other.MsgGrpIdSort;
    this.MsgGrpIdSortAscending = other.MsgGrpIdSortAscending;
    this.InsertGrpId = other.InsertGrpId;
    this.InsertGrpIdFetch = other.InsertGrpIdFetch;
    this.InsertGrpIdSort = other.InsertGrpIdSort;
    this.InsertGrpIdSortAscending = other.InsertGrpIdSortAscending;
    this.VipCode = other.VipCode;
    this.VipCodeFetch = other.VipCodeFetch;
    this.VipCodeSort = other.VipCodeSort;
    this.VipCodeSortAscending = other.VipCodeSortAscending;
    this.RateClass = other.RateClass;
    this.RateClassFetch = other.RateClassFetch;
    this.RateClassSort = other.RateClassSort;
    this.RateClassSortAscending = other.RateClassSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return AccountSegmentMapObjectKeyFilter
   */
  public AccountSegmentMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (AccountSegmentMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAcctSegIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new AccountSegmentMapObjectKeyFilter ();
    this.Key.AcctSegIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAcctSegIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.AcctSegIdFetch;
  }
  /** Set the SortOrder for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAcctSegIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new AccountSegmentMapObjectKeyFilter ();
    this.Key.AcctSegIdSort = value;
  }
  /** Retrieve SortOrder for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAcctSegIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.AcctSegIdSort;
  }
  /** Set the sort direction for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAcctSegIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new AccountSegmentMapObjectKeyFilter ();
    this.Key.AcctSegIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAcctSegIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.AcctSegIdSortAscending;
  }
  /** Set the field level filters for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAcctSegIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new AccountSegmentMapObjectKeyFilter ();
    this.Key.AcctSegId = value;
  }
  /** Retrieve filter for field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAcctSegIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.AcctSegId;
  }
  /** Set the field level Fetch value for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch) {
    this.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch () {
    return this.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value) {
    this.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder () {
    return this.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending) {
    this.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection () {
    return this.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter () {
    return this.MktCode;
  }

  /**
   * Retrieves the MktCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MktCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCodeFilter field
   */
  public String[] getMktCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMktCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MktCodeFilter filter value from a formatted string
   *
   * @param _value the MktCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MktCodeFilter filter field
   */
  public void setMktCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMktCodeFilterFromFormattedString");
    try {
      this.setMktCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MktCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @param fetch whether to fetch this field or not
   */
  public void setFranchiseCodeFetch (boolean fetch) {
    this.FranchiseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getFranchiseCodeFetch () {
    return this.FranchiseCodeFetch;
  }
  /** Set the SortOrder for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFranchiseCodeSortOrder (Integer value) {
    this.FranchiseCodeSort = value;
  }
  /** Retrieve SortOrder for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFranchiseCodeSortOrder () {
    return this.FranchiseCodeSort;
  }
  /** Set the sort direction for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFranchiseCodeSortDirection (boolean ascending) {
    this.FranchiseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFranchiseCodeSortDirection () {
    return this.FranchiseCodeSortAscending;
  }
  /** Set the field level filters for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFranchiseCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.FranchiseCode = value;
  }
  /** Retrieve filter for field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFranchiseCodeFilter () {
    return this.FranchiseCode;
  }

  /**
   * Retrieves the FranchiseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FranchiseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCodeFilter field
   */
  public String[] getFranchiseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFranchiseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FranchiseCodeFilter filter value from a formatted string
   *
   * @param _value the FranchiseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FranchiseCodeFilter filter field
   */
  public void setFranchiseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
    try {
      this.setFranchiseCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FranchiseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setRevRcvCostCtrFetch (boolean fetch) {
    this.RevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getRevRcvCostCtrFetch () {
    return this.RevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRevRcvCostCtrSortOrder (Integer value) {
    this.RevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRevRcvCostCtrSortOrder () {
    return this.RevRcvCostCtrSort;
  }
  /** Set the sort direction for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRevRcvCostCtrSortDirection (boolean ascending) {
    this.RevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRevRcvCostCtrSortDirection () {
    return this.RevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.RevRcvCostCtr = value;
  }
  /** Retrieve filter for field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRevRcvCostCtrFilter () {
    return this.RevRcvCostCtr;
  }

  /**
   * Retrieves the RevRcvCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RevRcvCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RevRcvCostCtrFilter field
   */
  public String[] getRevRcvCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRevRcvCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RevRcvCostCtrFilter filter value from a formatted string
   *
   * @param _value the RevRcvCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RevRcvCostCtrFilter filter field
   */
  public void setRevRcvCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
    try {
      this.setRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @param fetch whether to fetch this field or not
   */
  public void setRemitServiceCenterFetch (boolean fetch) {
    this.RemitServiceCenterFetch = fetch;
  }
  /** Retrieve Fetch value for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return boolean the Fetch value for this field
   */
  public boolean getRemitServiceCenterFetch () {
    return this.RemitServiceCenterFetch;
  }
  /** Set the SortOrder for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRemitServiceCenterSortOrder (Integer value) {
    this.RemitServiceCenterSort = value;
  }
  /** Retrieve SortOrder for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRemitServiceCenterSortOrder () {
    return this.RemitServiceCenterSort;
  }
  /** Set the sort direction for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRemitServiceCenterSortDirection (boolean ascending) {
    this.RemitServiceCenterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRemitServiceCenterSortDirection () {
    return this.RemitServiceCenterSortAscending;
  }
  /** Set the field level filters for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRemitServiceCenterFilter (IntegerFilter[] value) throws ServiceException {
    this.RemitServiceCenter = value;
  }
  /** Retrieve filter for field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRemitServiceCenterFilter () {
    return this.RemitServiceCenter;
  }

  /**
   * Retrieves the RemitServiceCenterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RemitServiceCenterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RemitServiceCenterFilter field
   */
  public String[] getRemitServiceCenterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemitServiceCenterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRemitServiceCenterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRemitServiceCenterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RemitServiceCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRemitServiceCenterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RemitServiceCenterFilter filter value from a formatted string
   *
   * @param _value the RemitServiceCenterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RemitServiceCenterFilter filter field
   */
  public void setRemitServiceCenterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRemitServiceCenterFilterFromFormattedString");
    try {
      this.setRemitServiceCenterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RemitServiceCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRemitServiceCenterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRemitServiceCenterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingServiceCenterFetch (boolean fetch) {
    this.BillingServiceCenterFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingServiceCenterFetch () {
    return this.BillingServiceCenterFetch;
  }
  /** Set the SortOrder for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingServiceCenterSortOrder (Integer value) {
    this.BillingServiceCenterSort = value;
  }
  /** Retrieve SortOrder for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingServiceCenterSortOrder () {
    return this.BillingServiceCenterSort;
  }
  /** Set the sort direction for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingServiceCenterSortDirection (boolean ascending) {
    this.BillingServiceCenterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingServiceCenterSortDirection () {
    return this.BillingServiceCenterSortAscending;
  }
  /** Set the field level filters for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingServiceCenterFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingServiceCenter = value;
  }
  /** Retrieve filter for field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingServiceCenterFilter () {
    return this.BillingServiceCenter;
  }

  /**
   * Retrieves the BillingServiceCenterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingServiceCenterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingServiceCenterFilter field
   */
  public String[] getBillingServiceCenterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingServiceCenterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingServiceCenterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingServiceCenterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingServiceCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingServiceCenterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingServiceCenterFilter filter value from a formatted string
   *
   * @param _value the BillingServiceCenterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingServiceCenterFilter filter field
   */
  public void setBillingServiceCenterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingServiceCenterFilterFromFormattedString");
    try {
      this.setBillingServiceCenterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingServiceCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingServiceCenterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingServiceCenterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInquiryCenterFetch (boolean fetch) {
    this.ServiceInquiryCenterFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInquiryCenterFetch () {
    return this.ServiceInquiryCenterFetch;
  }
  /** Set the SortOrder for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInquiryCenterSortOrder (Integer value) {
    this.ServiceInquiryCenterSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInquiryCenterSortOrder () {
    return this.ServiceInquiryCenterSort;
  }
  /** Set the sort direction for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInquiryCenterSortDirection (boolean ascending) {
    this.ServiceInquiryCenterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInquiryCenterSortDirection () {
    return this.ServiceInquiryCenterSortAscending;
  }
  /** Set the field level filters for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInquiryCenterFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInquiryCenter = value;
  }
  /** Retrieve filter for field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceInquiryCenterFilter () {
    return this.ServiceInquiryCenter;
  }

  /**
   * Retrieves the ServiceInquiryCenterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInquiryCenterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInquiryCenterFilter field
   */
  public String[] getServiceInquiryCenterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInquiryCenterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInquiryCenterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInquiryCenterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInquiryCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInquiryCenterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInquiryCenterFilter filter value from a formatted string
   *
   * @param _value the ServiceInquiryCenterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInquiryCenterFilter filter field
   */
  public void setServiceInquiryCenterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInquiryCenterFilterFromFormattedString");
    try {
      this.setServiceInquiryCenterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInquiryCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInquiryCenterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInquiryCenterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @param fetch whether to fetch this field or not
   */
  public void setCollectionsCenterFetch (boolean fetch) {
    this.CollectionsCenterFetch = fetch;
  }
  /** Retrieve Fetch value for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return boolean the Fetch value for this field
   */
  public boolean getCollectionsCenterFetch () {
    return this.CollectionsCenterFetch;
  }
  /** Set the SortOrder for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCollectionsCenterSortOrder (Integer value) {
    this.CollectionsCenterSort = value;
  }
  /** Retrieve SortOrder for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCollectionsCenterSortOrder () {
    return this.CollectionsCenterSort;
  }
  /** Set the sort direction for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCollectionsCenterSortDirection (boolean ascending) {
    this.CollectionsCenterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCollectionsCenterSortDirection () {
    return this.CollectionsCenterSortAscending;
  }
  /** Set the field level filters for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCollectionsCenterFilter (IntegerFilter[] value) throws ServiceException {
    this.CollectionsCenter = value;
  }
  /** Retrieve filter for field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCollectionsCenterFilter () {
    return this.CollectionsCenter;
  }

  /**
   * Retrieves the CollectionsCenterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CollectionsCenterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionsCenterFilter field
   */
  public String[] getCollectionsCenterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionsCenterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCollectionsCenterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionsCenterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionsCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionsCenterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CollectionsCenterFilter filter value from a formatted string
   *
   * @param _value the CollectionsCenterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CollectionsCenterFilter filter field
   */
  public void setCollectionsCenterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCollectionsCenterFilterFromFormattedString");
    try {
      this.setCollectionsCenterFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CollectionsCenterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionsCenterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionsCenterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgGrpIdFetch (boolean fetch) {
    this.MsgGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgGrpIdFetch () {
    return this.MsgGrpIdFetch;
  }
  /** Set the SortOrder for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgGrpIdSortOrder (Integer value) {
    this.MsgGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgGrpIdSortOrder () {
    return this.MsgGrpIdSort;
  }
  /** Set the sort direction for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgGrpIdSortDirection (boolean ascending) {
    this.MsgGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgGrpIdSortDirection () {
    return this.MsgGrpIdSortAscending;
  }
  /** Set the field level filters for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgGrpId = value;
  }
  /** Retrieve filter for field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgGrpIdFilter () {
    return this.MsgGrpId;
  }

  /**
   * Retrieves the MsgGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpIdFilter field
   */
  public String[] getMsgGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgGrpIdFilter filter value from a formatted string
   *
   * @param _value the MsgGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgGrpIdFilter filter field
   */
  public void setMsgGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
    try {
      this.setMsgGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setInsertGrpIdFetch (boolean fetch) {
    this.InsertGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getInsertGrpIdFetch () {
    return this.InsertGrpIdFetch;
  }
  /** Set the SortOrder for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInsertGrpIdSortOrder (Integer value) {
    this.InsertGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInsertGrpIdSortOrder () {
    return this.InsertGrpIdSort;
  }
  /** Set the sort direction for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInsertGrpIdSortDirection (boolean ascending) {
    this.InsertGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInsertGrpIdSortDirection () {
    return this.InsertGrpIdSortAscending;
  }
  /** Set the field level filters for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInsertGrpIdFilter (IntegerFilter[] value) throws ServiceException {
    this.InsertGrpId = value;
  }
  /** Retrieve filter for field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInsertGrpIdFilter () {
    return this.InsertGrpId;
  }

  /**
   * Retrieves the InsertGrpIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InsertGrpIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpIdFilter field
   */
  public String[] getInsertGrpIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInsertGrpIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InsertGrpIdFilter filter value from a formatted string
   *
   * @param _value the InsertGrpIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InsertGrpIdFilter filter field
   */
  public void setInsertGrpIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
    try {
      this.setInsertGrpIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InsertGrpIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @param fetch whether to fetch this field or not
   */
  public void setVipCodeFetch (boolean fetch) {
    this.VipCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getVipCodeFetch () {
    return this.VipCodeFetch;
  }
  /** Set the SortOrder for field: VipCode (ACCT_SEG_MAP.vip_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setVipCodeSortOrder (Integer value) {
    this.VipCodeSort = value;
  }
  /** Retrieve SortOrder for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getVipCodeSortOrder () {
    return this.VipCodeSort;
  }
  /** Set the sort direction for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setVipCodeSortDirection (boolean ascending) {
    this.VipCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getVipCodeSortDirection () {
    return this.VipCodeSortAscending;
  }
  /** Set the field level filters for field: VipCode (ACCT_SEG_MAP.vip_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setVipCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.VipCode = value;
  }
  /** Retrieve filter for field: VipCode (ACCT_SEG_MAP.vip_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getVipCodeFilter () {
    return this.VipCode;
  }

  /**
   * Retrieves the VipCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The VipCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VipCodeFilter field
   */
  public String[] getVipCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getVipCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the VipCodeFilter filter value from a formatted string
   *
   * @param _value the VipCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the VipCodeFilter filter field
   */
  public void setVipCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setVipCodeFilterFromFormattedString");
    try {
      this.setVipCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("VipCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVipCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setRateClassFetch (boolean fetch) {
    this.RateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateClassFetch () {
    return this.RateClassFetch;
  }
  /** Set the SortOrder for field: RateClass (ACCT_SEG_MAP.rate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateClassSortOrder (Integer value) {
    this.RateClassSort = value;
  }
  /** Retrieve SortOrder for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateClassSortOrder () {
    return this.RateClassSort;
  }
  /** Set the sort direction for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateClassSortDirection (boolean ascending) {
    this.RateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateClassSortDirection () {
    return this.RateClassSortAscending;
  }
  /** Set the field level filters for field: RateClass (ACCT_SEG_MAP.rate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.RateClass = value;
  }
  /** Retrieve filter for field: RateClass (ACCT_SEG_MAP.rate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateClassFilter () {
    return this.RateClass;
  }

  /**
   * Retrieves the RateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClassFilter field
   */
  public String[] getRateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateClassFilter filter value from a formatted string
   *
   * @param _value the RateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateClassFilter filter field
   */
  public void setRateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFilterFromFormattedString");
    try {
      this.setRateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
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
    return AccountSegmentMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return AccountSegmentMapObjectHelper.toMap(this, null);
  }
}
