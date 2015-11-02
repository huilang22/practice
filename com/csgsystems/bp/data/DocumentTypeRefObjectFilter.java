/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectFilter.java
 * Definition File: Admin/DocumentTypeRef.xml
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
public class DocumentTypeRefObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public DocumentTypeRefObjectKeyFilter Key = null;
  /** raw field for: DOCUMENT_TYPE_REF.repository_location) */
  public    StringFilter[] RepositoryLocation  = null;
  protected boolean RepositoryLocationFetch = false;
  protected boolean RepositoryLocationSortAscending = true;
  protected boolean RepositoryLocationCaseInsensitive = false;
  protected Integer RepositoryLocationSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.use_document_repository) */
  public    BooleanFilter[] UseDocumentRepository  = null;
  protected boolean UseDocumentRepositoryFetch = false;
  protected boolean UseDocumentRepositorySortAscending = true;
  protected Integer UseDocumentRepositorySort = null;
  /** raw field for: DOCUMENT_TYPE_REF.disp_fn_fmt) */
  public    StringFilter[] DispFnFmt  = null;
  protected boolean DispFnFmtFetch = false;
  protected boolean DispFnFmtSortAscending = true;
  protected boolean DispFnFmtCaseInsensitive = false;
  protected Integer DispFnFmtSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.source_type) */
  public    IntegerFilter[] SourceType  = null;
  protected boolean SourceTypeFetch = false;
  protected boolean SourceTypeSortAscending = true;
  protected Integer SourceTypeSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.max_instances) */
  public    IntegerFilter[] MaxInstances  = null;
  protected boolean MaxInstancesFetch = false;
  protected boolean MaxInstancesSortAscending = true;
  protected Integer MaxInstancesSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.document_category) */
  public    IntegerFilter[] DocumentCategory  = null;
  protected boolean DocumentCategoryFetch = false;
  protected boolean DocumentCategorySortAscending = true;
  protected Integer DocumentCategorySort = null;
  /** raw field for: DOCUMENT_TYPE_REF.dispatch_flag) */
  public    BooleanFilter[] DispatchFlag  = null;
  protected boolean DispatchFlagFetch = false;
  protected boolean DispatchFlagSortAscending = true;
  protected Integer DispatchFlagSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.max_age) */
  public    IntegerFilter[] MaxAge  = null;
  protected boolean MaxAgeFetch = false;
  protected boolean MaxAgeSortAscending = true;
  protected Integer MaxAgeSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.max_age_units) */
  public    IntegerFilter[] MaxAgeUnits  = null;
  protected boolean MaxAgeUnitsFetch = false;
  protected boolean MaxAgeUnitsSortAscending = true;
  protected Integer MaxAgeUnitsSort = null;
  /** raw field for: DOCUMENT_TYPE_REF.prodn_mode) */
  public    IntegerFilter[] ProdnMode  = null;
  protected boolean ProdnModeFetch = false;
  protected boolean ProdnModeSortAscending = true;
  protected Integer ProdnModeSort = null;
  private String _objName = "DocumentTypeRefObjectFilter";
  /** default constructor */
  public DocumentTypeRefObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public DocumentTypeRefObjectFilter (DocumentTypeRefObjectFilter other)
  {
    if (other == null) return;
    this.Key = new DocumentTypeRefObjectKeyFilter (other.Key);
    this.RepositoryLocation = other.RepositoryLocation;
    this.RepositoryLocationFetch = other.RepositoryLocationFetch;
    this.RepositoryLocationSort = other.RepositoryLocationSort;
    this.RepositoryLocationCaseInsensitive = other.RepositoryLocationCaseInsensitive;
    this.RepositoryLocationSortAscending = other.RepositoryLocationSortAscending;
    this.UseDocumentRepository = other.UseDocumentRepository;
    this.UseDocumentRepositoryFetch = other.UseDocumentRepositoryFetch;
    this.UseDocumentRepositorySort = other.UseDocumentRepositorySort;
    this.UseDocumentRepositorySortAscending = other.UseDocumentRepositorySortAscending;
    this.DispFnFmt = other.DispFnFmt;
    this.DispFnFmtFetch = other.DispFnFmtFetch;
    this.DispFnFmtSort = other.DispFnFmtSort;
    this.DispFnFmtCaseInsensitive = other.DispFnFmtCaseInsensitive;
    this.DispFnFmtSortAscending = other.DispFnFmtSortAscending;
    this.SourceType = other.SourceType;
    this.SourceTypeFetch = other.SourceTypeFetch;
    this.SourceTypeSort = other.SourceTypeSort;
    this.SourceTypeSortAscending = other.SourceTypeSortAscending;
    this.MaxInstances = other.MaxInstances;
    this.MaxInstancesFetch = other.MaxInstancesFetch;
    this.MaxInstancesSort = other.MaxInstancesSort;
    this.MaxInstancesSortAscending = other.MaxInstancesSortAscending;
    this.DocumentCategory = other.DocumentCategory;
    this.DocumentCategoryFetch = other.DocumentCategoryFetch;
    this.DocumentCategorySort = other.DocumentCategorySort;
    this.DocumentCategorySortAscending = other.DocumentCategorySortAscending;
    this.DispatchFlag = other.DispatchFlag;
    this.DispatchFlagFetch = other.DispatchFlagFetch;
    this.DispatchFlagSort = other.DispatchFlagSort;
    this.DispatchFlagSortAscending = other.DispatchFlagSortAscending;
    this.MaxAge = other.MaxAge;
    this.MaxAgeFetch = other.MaxAgeFetch;
    this.MaxAgeSort = other.MaxAgeSort;
    this.MaxAgeSortAscending = other.MaxAgeSortAscending;
    this.MaxAgeUnits = other.MaxAgeUnits;
    this.MaxAgeUnitsFetch = other.MaxAgeUnitsFetch;
    this.MaxAgeUnitsSort = other.MaxAgeUnitsSort;
    this.MaxAgeUnitsSortAscending = other.MaxAgeUnitsSortAscending;
    this.ProdnMode = other.ProdnMode;
    this.ProdnModeFetch = other.ProdnModeFetch;
    this.ProdnModeSort = other.ProdnModeSort;
    this.ProdnModeSortAscending = other.ProdnModeSortAscending;  }
  /** get the filter for this object's key
   * @return DocumentTypeRefObjectKeyFilter
   */
  public DocumentTypeRefObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (DocumentTypeRefObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentTypeIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new DocumentTypeRefObjectKeyFilter ();
    this.Key.DocumentTypeIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentTypeIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DocumentTypeIdFetch;
  }
  /** Set the SortOrder for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentTypeIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new DocumentTypeRefObjectKeyFilter ();
    this.Key.DocumentTypeIdSort = value;
  }
  /** Retrieve SortOrder for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentTypeIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DocumentTypeIdSort;
  }
  /** Set the sort direction for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentTypeIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new DocumentTypeRefObjectKeyFilter ();
    this.Key.DocumentTypeIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentTypeIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DocumentTypeIdSortAscending;
  }
  /** Set the field level filters for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentTypeIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new DocumentTypeRefObjectKeyFilter ();
    this.Key.DocumentTypeId = value;
  }
  /** Retrieve filter for field: DocumentTypeId (DOCUMENT_TYPE_REF.document_type_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentTypeIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DocumentTypeId;
  }
  /** Set the field level Fetch value for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @param fetch whether to fetch this field or not
   */
  public void setRepositoryLocationFetch (boolean fetch) {
    this.RepositoryLocationFetch = fetch;
  }
  /** Retrieve Fetch value for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return boolean the Fetch value for this field
   */
  public boolean getRepositoryLocationFetch () {
    return this.RepositoryLocationFetch;
  }
  /** Set the SortOrder for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRepositoryLocationSortOrder (Integer value) {
    this.RepositoryLocationSort = value;
  }
  /** Retrieve SortOrder for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRepositoryLocationSortOrder () {
    return this.RepositoryLocationSort;
  }
  /** Set the sort direction for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRepositoryLocationSortDirection (boolean ascending) {
    this.RepositoryLocationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRepositoryLocationSortDirection () {
    return this.RepositoryLocationSortAscending;
  }
  /** Set the case insensitive for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRepositoryLocationCaseInsensitive (boolean ascending) {
    this.RepositoryLocationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRepositoryLocationCaseInsensitive () {
    return this.RepositoryLocationCaseInsensitive;
  }
  /** Set the field level filters for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRepositoryLocationFilter (StringFilter[] value) throws ServiceException {
    this.RepositoryLocation = value;
  }
  /** Retrieve filter for field: RepositoryLocation (DOCUMENT_TYPE_REF.repository_location)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getRepositoryLocationFilter () {
    return this.RepositoryLocation;
  }

  /**
   * Retrieves the RepositoryLocationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RepositoryLocationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RepositoryLocationFilter field
   */
  public String[] getRepositoryLocationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRepositoryLocationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRepositoryLocationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRepositoryLocationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RepositoryLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRepositoryLocationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RepositoryLocationFilter filter value from a formatted string
   *
   * @param _value the RepositoryLocationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RepositoryLocationFilter filter field
   */
  public void setRepositoryLocationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRepositoryLocationFilterFromFormattedString");
    try {
      this.setRepositoryLocationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RepositoryLocationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRepositoryLocationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRepositoryLocationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @param fetch whether to fetch this field or not
   */
  public void setUseDocumentRepositoryFetch (boolean fetch) {
    this.UseDocumentRepositoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return boolean the Fetch value for this field
   */
  public boolean getUseDocumentRepositoryFetch () {
    return this.UseDocumentRepositoryFetch;
  }
  /** Set the SortOrder for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUseDocumentRepositorySortOrder (Integer value) {
    this.UseDocumentRepositorySort = value;
  }
  /** Retrieve SortOrder for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUseDocumentRepositorySortOrder () {
    return this.UseDocumentRepositorySort;
  }
  /** Set the sort direction for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUseDocumentRepositorySortDirection (boolean ascending) {
    this.UseDocumentRepositorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUseDocumentRepositorySortDirection () {
    return this.UseDocumentRepositorySortAscending;
  }
  /** Set the field level filters for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUseDocumentRepositoryFilter (BooleanFilter[] value) throws ServiceException {
    this.UseDocumentRepository = value;
  }
  /** Retrieve filter for field: UseDocumentRepository (DOCUMENT_TYPE_REF.use_document_repository)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getUseDocumentRepositoryFilter () {
    return this.UseDocumentRepository;
  }

  /**
   * Retrieves the UseDocumentRepositoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UseDocumentRepositoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDocumentRepositoryFilter field
   */
  public String[] getUseDocumentRepositoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDocumentRepositoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUseDocumentRepositoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDocumentRepositoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDocumentRepositoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDocumentRepositoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UseDocumentRepositoryFilter filter value from a formatted string
   *
   * @param _value the UseDocumentRepositoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UseDocumentRepositoryFilter filter field
   */
  public void setUseDocumentRepositoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUseDocumentRepositoryFilterFromFormattedString");
    try {
      this.setUseDocumentRepositoryFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UseDocumentRepositoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDocumentRepositoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDocumentRepositoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @param fetch whether to fetch this field or not
   */
  public void setDispFnFmtFetch (boolean fetch) {
    this.DispFnFmtFetch = fetch;
  }
  /** Retrieve Fetch value for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return boolean the Fetch value for this field
   */
  public boolean getDispFnFmtFetch () {
    return this.DispFnFmtFetch;
  }
  /** Set the SortOrder for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDispFnFmtSortOrder (Integer value) {
    this.DispFnFmtSort = value;
  }
  /** Retrieve SortOrder for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDispFnFmtSortOrder () {
    return this.DispFnFmtSort;
  }
  /** Set the sort direction for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDispFnFmtSortDirection (boolean ascending) {
    this.DispFnFmtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDispFnFmtSortDirection () {
    return this.DispFnFmtSortAscending;
  }
  /** Set the case insensitive for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDispFnFmtCaseInsensitive (boolean ascending) {
    this.DispFnFmtCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDispFnFmtCaseInsensitive () {
    return this.DispFnFmtCaseInsensitive;
  }
  /** Set the field level filters for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDispFnFmtFilter (StringFilter[] value) throws ServiceException {
    this.DispFnFmt = value;
  }
  /** Retrieve filter for field: DispFnFmt (DOCUMENT_TYPE_REF.disp_fn_fmt)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDispFnFmtFilter () {
    return this.DispFnFmt;
  }

  /**
   * Retrieves the DispFnFmtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispFnFmtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispFnFmtFilter field
   */
  public String[] getDispFnFmtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispFnFmtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDispFnFmtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispFnFmtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispFnFmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispFnFmtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DispFnFmtFilter filter value from a formatted string
   *
   * @param _value the DispFnFmtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DispFnFmtFilter filter field
   */
  public void setDispFnFmtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispFnFmtFilterFromFormattedString");
    try {
      this.setDispFnFmtFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispFnFmtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispFnFmtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispFnFmtFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceTypeFetch (boolean fetch) {
    this.SourceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceTypeFetch () {
    return this.SourceTypeFetch;
  }
  /** Set the SortOrder for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceTypeSortOrder (Integer value) {
    this.SourceTypeSort = value;
  }
  /** Retrieve SortOrder for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceTypeSortOrder () {
    return this.SourceTypeSort;
  }
  /** Set the sort direction for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceTypeSortDirection (boolean ascending) {
    this.SourceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceTypeSortDirection () {
    return this.SourceTypeSortAscending;
  }
  /** Set the field level filters for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceType = value;
  }
  /** Retrieve filter for field: SourceType (DOCUMENT_TYPE_REF.source_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceTypeFilter () {
    return this.SourceType;
  }

  /**
   * Retrieves the SourceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceTypeFilter field
   */
  public String[] getSourceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceTypeFilter filter value from a formatted string
   *
   * @param _value the SourceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceTypeFilter filter field
   */
  public void setSourceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceTypeFilterFromFormattedString");
    try {
      this.setSourceTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxInstancesFetch (boolean fetch) {
    this.MaxInstancesFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxInstancesFetch () {
    return this.MaxInstancesFetch;
  }
  /** Set the SortOrder for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxInstancesSortOrder (Integer value) {
    this.MaxInstancesSort = value;
  }
  /** Retrieve SortOrder for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxInstancesSortOrder () {
    return this.MaxInstancesSort;
  }
  /** Set the sort direction for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxInstancesSortDirection (boolean ascending) {
    this.MaxInstancesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxInstancesSortDirection () {
    return this.MaxInstancesSortAscending;
  }
  /** Set the field level filters for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxInstancesFilter (IntegerFilter[] value) throws ServiceException {
    this.MaxInstances = value;
  }
  /** Retrieve filter for field: MaxInstances (DOCUMENT_TYPE_REF.max_instances)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMaxInstancesFilter () {
    return this.MaxInstances;
  }

  /**
   * Retrieves the MaxInstancesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxInstancesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxInstancesFilter field
   */
  public String[] getMaxInstancesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxInstancesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxInstancesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxInstancesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxInstancesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxInstancesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxInstancesFilter filter value from a formatted string
   *
   * @param _value the MaxInstancesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxInstancesFilter filter field
   */
  public void setMaxInstancesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxInstancesFilterFromFormattedString");
    try {
      this.setMaxInstancesFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxInstancesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxInstancesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxInstancesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @param fetch whether to fetch this field or not
   */
  public void setDocumentCategoryFetch (boolean fetch) {
    this.DocumentCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getDocumentCategoryFetch () {
    return this.DocumentCategoryFetch;
  }
  /** Set the SortOrder for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDocumentCategorySortOrder (Integer value) {
    this.DocumentCategorySort = value;
  }
  /** Retrieve SortOrder for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDocumentCategorySortOrder () {
    return this.DocumentCategorySort;
  }
  /** Set the sort direction for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDocumentCategorySortDirection (boolean ascending) {
    this.DocumentCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDocumentCategorySortDirection () {
    return this.DocumentCategorySortAscending;
  }
  /** Set the field level filters for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDocumentCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.DocumentCategory = value;
  }
  /** Retrieve filter for field: DocumentCategory (DOCUMENT_TYPE_REF.document_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDocumentCategoryFilter () {
    return this.DocumentCategory;
  }

  /**
   * Retrieves the DocumentCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DocumentCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DocumentCategoryFilter field
   */
  public String[] getDocumentCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDocumentCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDocumentCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDocumentCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDocumentCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DocumentCategoryFilter filter value from a formatted string
   *
   * @param _value the DocumentCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DocumentCategoryFilter filter field
   */
  public void setDocumentCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDocumentCategoryFilterFromFormattedString");
    try {
      this.setDocumentCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DocumentCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDocumentCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDocumentCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setDispatchFlagFetch (boolean fetch) {
    this.DispatchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getDispatchFlagFetch () {
    return this.DispatchFlagFetch;
  }
  /** Set the SortOrder for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDispatchFlagSortOrder (Integer value) {
    this.DispatchFlagSort = value;
  }
  /** Retrieve SortOrder for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDispatchFlagSortOrder () {
    return this.DispatchFlagSort;
  }
  /** Set the sort direction for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDispatchFlagSortDirection (boolean ascending) {
    this.DispatchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDispatchFlagSortDirection () {
    return this.DispatchFlagSortAscending;
  }
  /** Set the field level filters for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDispatchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.DispatchFlag = value;
  }
  /** Retrieve filter for field: DispatchFlag (DOCUMENT_TYPE_REF.dispatch_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getDispatchFlagFilter () {
    return this.DispatchFlag;
  }

  /**
   * Retrieves the DispatchFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DispatchFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DispatchFlagFilter field
   */
  public String[] getDispatchFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDispatchFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDispatchFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDispatchFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDispatchFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DispatchFlagFilter filter value from a formatted string
   *
   * @param _value the DispatchFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DispatchFlagFilter filter field
   */
  public void setDispatchFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDispatchFlagFilterFromFormattedString");
    try {
      this.setDispatchFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DispatchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDispatchFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDispatchFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxAgeFetch (boolean fetch) {
    this.MaxAgeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxAgeFetch () {
    return this.MaxAgeFetch;
  }
  /** Set the SortOrder for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxAgeSortOrder (Integer value) {
    this.MaxAgeSort = value;
  }
  /** Retrieve SortOrder for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxAgeSortOrder () {
    return this.MaxAgeSort;
  }
  /** Set the sort direction for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxAgeSortDirection (boolean ascending) {
    this.MaxAgeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxAgeSortDirection () {
    return this.MaxAgeSortAscending;
  }
  /** Set the field level filters for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxAgeFilter (IntegerFilter[] value) throws ServiceException {
    this.MaxAge = value;
  }
  /** Retrieve filter for field: MaxAge (DOCUMENT_TYPE_REF.max_age)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMaxAgeFilter () {
    return this.MaxAge;
  }

  /**
   * Retrieves the MaxAgeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAgeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAgeFilter field
   */
  public String[] getMaxAgeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAgeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAgeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAgeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAgeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAgeFilter filter value from a formatted string
   *
   * @param _value the MaxAgeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAgeFilter filter field
   */
  public void setMaxAgeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAgeFilterFromFormattedString");
    try {
      this.setMaxAgeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAgeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAgeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAgeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @param fetch whether to fetch this field or not
   */
  public void setMaxAgeUnitsFetch (boolean fetch) {
    this.MaxAgeUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getMaxAgeUnitsFetch () {
    return this.MaxAgeUnitsFetch;
  }
  /** Set the SortOrder for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMaxAgeUnitsSortOrder (Integer value) {
    this.MaxAgeUnitsSort = value;
  }
  /** Retrieve SortOrder for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMaxAgeUnitsSortOrder () {
    return this.MaxAgeUnitsSort;
  }
  /** Set the sort direction for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMaxAgeUnitsSortDirection (boolean ascending) {
    this.MaxAgeUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMaxAgeUnitsSortDirection () {
    return this.MaxAgeUnitsSortAscending;
  }
  /** Set the field level filters for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMaxAgeUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.MaxAgeUnits = value;
  }
  /** Retrieve filter for field: MaxAgeUnits (DOCUMENT_TYPE_REF.max_age_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMaxAgeUnitsFilter () {
    return this.MaxAgeUnits;
  }

  /**
   * Retrieves the MaxAgeUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MaxAgeUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MaxAgeUnitsFilter field
   */
  public String[] getMaxAgeUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMaxAgeUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMaxAgeUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMaxAgeUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAgeUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMaxAgeUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MaxAgeUnitsFilter filter value from a formatted string
   *
   * @param _value the MaxAgeUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MaxAgeUnitsFilter filter field
   */
  public void setMaxAgeUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMaxAgeUnitsFilterFromFormattedString");
    try {
      this.setMaxAgeUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MaxAgeUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMaxAgeUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMaxAgeUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @param fetch whether to fetch this field or not
   */
  public void setProdnModeFetch (boolean fetch) {
    this.ProdnModeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return boolean the Fetch value for this field
   */
  public boolean getProdnModeFetch () {
    return this.ProdnModeFetch;
  }
  /** Set the SortOrder for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProdnModeSortOrder (Integer value) {
    this.ProdnModeSort = value;
  }
  /** Retrieve SortOrder for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProdnModeSortOrder () {
    return this.ProdnModeSort;
  }
  /** Set the sort direction for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProdnModeSortDirection (boolean ascending) {
    this.ProdnModeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProdnModeSortDirection () {
    return this.ProdnModeSortAscending;
  }
  /** Set the field level filters for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProdnModeFilter (IntegerFilter[] value) throws ServiceException {
    this.ProdnMode = value;
  }
  /** Retrieve filter for field: ProdnMode (DOCUMENT_TYPE_REF.prodn_mode)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProdnModeFilter () {
    return this.ProdnMode;
  }

  /**
   * Retrieves the ProdnModeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProdnModeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProdnModeFilter field
   */
  public String[] getProdnModeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProdnModeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProdnModeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProdnModeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProdnModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProdnModeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProdnModeFilter filter value from a formatted string
   *
   * @param _value the ProdnModeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProdnModeFilter filter field
   */
  public void setProdnModeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProdnModeFilterFromFormattedString");
    try {
      this.setProdnModeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProdnModeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProdnModeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProdnModeFilterFromFormattedString");
  }

  public String toString() {
    return DocumentTypeRefObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return DocumentTypeRefObjectHelper.toMap(this, null);
  }
}
