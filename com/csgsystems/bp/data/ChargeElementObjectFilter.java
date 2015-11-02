/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeElementObjectFilter.java
 * Definition File: Customer/OrderQuote.xml
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
public class ChargeElementObjectFilter  extends BaseFilter  implements Serializable
{
  /** raw field */
  public    IntegerFilter[] CeBillRefno  = null;
  protected boolean CeBillRefnoFetch = false;
  protected boolean CeBillRefnoSortAscending = true;
  protected Integer CeBillRefnoSort = null;
  /** raw field */
  public    IntegerFilter[] CeBillRefResets  = null;
  protected boolean CeBillRefResetsFetch = false;
  protected boolean CeBillRefResetsSortAscending = true;
  protected Integer CeBillRefResetsSort = null;
  /** raw field */
  public    DateFilter[] CeStatementDate  = null;
  protected boolean CeStatementDateFetch = false;
  protected boolean CeStatementDateSortAscending = true;
  protected Integer CeStatementDateSort = null;
  /** raw field */
  public    DateFilter[] CeFromDate  = null;
  protected boolean CeFromDateFetch = false;
  protected boolean CeFromDateSortAscending = true;
  protected Integer CeFromDateSort = null;
  /** raw field */
  public    DateFilter[] CeToDate  = null;
  protected boolean CeToDateFetch = false;
  protected boolean CeToDateSortAscending = true;
  protected Integer CeToDateSort = null;
  /** raw field */
  public    IntegerFilter[] CeObjectType  = null;
  protected boolean CeObjectTypeFetch = false;
  protected boolean CeObjectTypeSortAscending = true;
  protected Integer CeObjectTypeSort = null;
  /** raw field */
  public    IntegerFilter[] CeObjectTypeKey  = null;
  protected boolean CeObjectTypeKeyFetch = false;
  protected boolean CeObjectTypeKeySortAscending = true;
  protected Integer CeObjectTypeKeySort = null;
  /** raw field */
  public    IntegerFilter[] CeObjectKey1  = null;
  protected boolean CeObjectKey1Fetch = false;
  protected boolean CeObjectKey1SortAscending = true;
  protected Integer CeObjectKey1Sort = null;
  /** raw field */
  public    IntegerFilter[] CeObjectKey2  = null;
  protected boolean CeObjectKey2Fetch = false;
  protected boolean CeObjectKey2SortAscending = true;
  protected Integer CeObjectKey2Sort = null;
  /** raw field */
  public    IntegerFilter[] CeParentType  = null;
  protected boolean CeParentTypeFetch = false;
  protected boolean CeParentTypeSortAscending = true;
  protected Integer CeParentTypeSort = null;
  /** raw field */
  public    IntegerFilter[] CeParentTypeKey  = null;
  protected boolean CeParentTypeKeyFetch = false;
  protected boolean CeParentTypeKeySortAscending = true;
  protected Integer CeParentTypeKeySort = null;
  /** raw field */
  public    IntegerFilter[] CeParentKey1  = null;
  protected boolean CeParentKey1Fetch = false;
  protected boolean CeParentKey1SortAscending = true;
  protected Integer CeParentKey1Sort = null;
  /** raw field */
  public    IntegerFilter[] CeParentKey2  = null;
  protected boolean CeParentKey2Fetch = false;
  protected boolean CeParentKey2SortAscending = true;
  protected Integer CeParentKey2Sort = null;
  /** raw field */
  public    BigIntegerFilter[] CeAmount  = null;
  protected boolean CeAmountFetch = false;
  protected boolean CeAmountSortAscending = true;
  protected Integer CeAmountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeDiscount  = null;
  protected boolean CeDiscountFetch = false;
  protected boolean CeDiscountSortAscending = true;
  protected Integer CeDiscountSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeTaxes  = null;
  protected boolean CeTaxesFetch = false;
  protected boolean CeTaxesSortAscending = true;
  protected Integer CeTaxesSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeFederalTax  = null;
  protected boolean CeFederalTaxFetch = false;
  protected boolean CeFederalTaxSortAscending = true;
  protected Integer CeFederalTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeStateTax  = null;
  protected boolean CeStateTaxFetch = false;
  protected boolean CeStateTaxSortAscending = true;
  protected Integer CeStateTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeCountyTax  = null;
  protected boolean CeCountyTaxFetch = false;
  protected boolean CeCountyTaxSortAscending = true;
  protected Integer CeCountyTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeCityTax  = null;
  protected boolean CeCityTaxFetch = false;
  protected boolean CeCityTaxSortAscending = true;
  protected Integer CeCityTaxSort = null;
  /** raw field */
  public    BigIntegerFilter[] CeOtherTax  = null;
  protected boolean CeOtherTaxFetch = false;
  protected boolean CeOtherTaxSortAscending = true;
  protected Integer CeOtherTaxSort = null;
  /** raw field */
  public    StringFilter[] CeDescriptionText  = null;
  protected boolean CeDescriptionTextFetch = false;
  protected boolean CeDescriptionTextSortAscending = true;
  protected boolean CeDescriptionTextCaseInsensitive = false;
  protected Integer CeDescriptionTextSort = null;
  /** raw field */
  public    IntegerFilter[] CeDescriptionCode  = null;
  protected boolean CeDescriptionCodeFetch = false;
  protected boolean CeDescriptionCodeSortAscending = true;
  protected Integer CeDescriptionCodeSort = null;
  private String _objName = "ChargeElementObjectFilter";
  /** default constructor */
  public ChargeElementObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ChargeElementObjectFilter (ChargeElementObjectFilter other)
  {
    if (other == null) return;
    this.CeBillRefno = other.CeBillRefno;
    this.CeBillRefnoFetch = other.CeBillRefnoFetch;
    this.CeBillRefnoSort = other.CeBillRefnoSort;
    this.CeBillRefnoSortAscending = other.CeBillRefnoSortAscending;
    this.CeBillRefResets = other.CeBillRefResets;
    this.CeBillRefResetsFetch = other.CeBillRefResetsFetch;
    this.CeBillRefResetsSort = other.CeBillRefResetsSort;
    this.CeBillRefResetsSortAscending = other.CeBillRefResetsSortAscending;
    this.CeStatementDate = other.CeStatementDate;
    this.CeStatementDateFetch = other.CeStatementDateFetch;
    this.CeStatementDateSort = other.CeStatementDateSort;
    this.CeStatementDateSortAscending = other.CeStatementDateSortAscending;
    this.CeFromDate = other.CeFromDate;
    this.CeFromDateFetch = other.CeFromDateFetch;
    this.CeFromDateSort = other.CeFromDateSort;
    this.CeFromDateSortAscending = other.CeFromDateSortAscending;
    this.CeToDate = other.CeToDate;
    this.CeToDateFetch = other.CeToDateFetch;
    this.CeToDateSort = other.CeToDateSort;
    this.CeToDateSortAscending = other.CeToDateSortAscending;
    this.CeObjectType = other.CeObjectType;
    this.CeObjectTypeFetch = other.CeObjectTypeFetch;
    this.CeObjectTypeSort = other.CeObjectTypeSort;
    this.CeObjectTypeSortAscending = other.CeObjectTypeSortAscending;
    this.CeObjectTypeKey = other.CeObjectTypeKey;
    this.CeObjectTypeKeyFetch = other.CeObjectTypeKeyFetch;
    this.CeObjectTypeKeySort = other.CeObjectTypeKeySort;
    this.CeObjectTypeKeySortAscending = other.CeObjectTypeKeySortAscending;
    this.CeObjectKey1 = other.CeObjectKey1;
    this.CeObjectKey1Fetch = other.CeObjectKey1Fetch;
    this.CeObjectKey1Sort = other.CeObjectKey1Sort;
    this.CeObjectKey1SortAscending = other.CeObjectKey1SortAscending;
    this.CeObjectKey2 = other.CeObjectKey2;
    this.CeObjectKey2Fetch = other.CeObjectKey2Fetch;
    this.CeObjectKey2Sort = other.CeObjectKey2Sort;
    this.CeObjectKey2SortAscending = other.CeObjectKey2SortAscending;
    this.CeParentType = other.CeParentType;
    this.CeParentTypeFetch = other.CeParentTypeFetch;
    this.CeParentTypeSort = other.CeParentTypeSort;
    this.CeParentTypeSortAscending = other.CeParentTypeSortAscending;
    this.CeParentTypeKey = other.CeParentTypeKey;
    this.CeParentTypeKeyFetch = other.CeParentTypeKeyFetch;
    this.CeParentTypeKeySort = other.CeParentTypeKeySort;
    this.CeParentTypeKeySortAscending = other.CeParentTypeKeySortAscending;
    this.CeParentKey1 = other.CeParentKey1;
    this.CeParentKey1Fetch = other.CeParentKey1Fetch;
    this.CeParentKey1Sort = other.CeParentKey1Sort;
    this.CeParentKey1SortAscending = other.CeParentKey1SortAscending;
    this.CeParentKey2 = other.CeParentKey2;
    this.CeParentKey2Fetch = other.CeParentKey2Fetch;
    this.CeParentKey2Sort = other.CeParentKey2Sort;
    this.CeParentKey2SortAscending = other.CeParentKey2SortAscending;
    this.CeAmount = other.CeAmount;
    this.CeAmountFetch = other.CeAmountFetch;
    this.CeAmountSort = other.CeAmountSort;
    this.CeAmountSortAscending = other.CeAmountSortAscending;
    this.CeDiscount = other.CeDiscount;
    this.CeDiscountFetch = other.CeDiscountFetch;
    this.CeDiscountSort = other.CeDiscountSort;
    this.CeDiscountSortAscending = other.CeDiscountSortAscending;
    this.CeTaxes = other.CeTaxes;
    this.CeTaxesFetch = other.CeTaxesFetch;
    this.CeTaxesSort = other.CeTaxesSort;
    this.CeTaxesSortAscending = other.CeTaxesSortAscending;
    this.CeFederalTax = other.CeFederalTax;
    this.CeFederalTaxFetch = other.CeFederalTaxFetch;
    this.CeFederalTaxSort = other.CeFederalTaxSort;
    this.CeFederalTaxSortAscending = other.CeFederalTaxSortAscending;
    this.CeStateTax = other.CeStateTax;
    this.CeStateTaxFetch = other.CeStateTaxFetch;
    this.CeStateTaxSort = other.CeStateTaxSort;
    this.CeStateTaxSortAscending = other.CeStateTaxSortAscending;
    this.CeCountyTax = other.CeCountyTax;
    this.CeCountyTaxFetch = other.CeCountyTaxFetch;
    this.CeCountyTaxSort = other.CeCountyTaxSort;
    this.CeCountyTaxSortAscending = other.CeCountyTaxSortAscending;
    this.CeCityTax = other.CeCityTax;
    this.CeCityTaxFetch = other.CeCityTaxFetch;
    this.CeCityTaxSort = other.CeCityTaxSort;
    this.CeCityTaxSortAscending = other.CeCityTaxSortAscending;
    this.CeOtherTax = other.CeOtherTax;
    this.CeOtherTaxFetch = other.CeOtherTaxFetch;
    this.CeOtherTaxSort = other.CeOtherTaxSort;
    this.CeOtherTaxSortAscending = other.CeOtherTaxSortAscending;
    this.CeDescriptionText = other.CeDescriptionText;
    this.CeDescriptionTextFetch = other.CeDescriptionTextFetch;
    this.CeDescriptionTextSort = other.CeDescriptionTextSort;
    this.CeDescriptionTextCaseInsensitive = other.CeDescriptionTextCaseInsensitive;
    this.CeDescriptionTextSortAscending = other.CeDescriptionTextSortAscending;
    this.CeDescriptionCode = other.CeDescriptionCode;
    this.CeDescriptionCodeFetch = other.CeDescriptionCodeFetch;
    this.CeDescriptionCodeSort = other.CeDescriptionCodeSort;
    this.CeDescriptionCodeSortAscending = other.CeDescriptionCodeSortAscending;  }
  /** Set the field level Fetch value for field: CeBillRefno
   * @param fetch whether to fetch this field or not
   */
  public void setCeBillRefnoFetch (boolean fetch)
  {
    this.CeBillRefnoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeBillRefno
   * @return boolean the Fetch value for this field
   */
  public boolean getCeBillRefnoFetch ()
  {
    return this.CeBillRefnoFetch;
  }
  /** Set the SortOrder for field: CeBillRefno
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeBillRefnoSortOrder (Integer value)
  {
    this.CeBillRefnoSort = value;
  }
  /** Retrieve SortOrder for field: CeBillRefno
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeBillRefnoSortOrder ()
  {
    return this.CeBillRefnoSort;
  }
  /** Set the sort direction for field: CeBillRefno
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeBillRefnoSortDirection (boolean ascending)
  {
    this.CeBillRefnoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeBillRefno
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeBillRefnoSortDirection ()
  {
    return this.CeBillRefnoSortAscending;
  }
  /** Set the field level filters for field: CeBillRefno
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeBillRefnoFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeBillRefno = value;
  }
  /** Retrieve filter for field: CeBillRefno
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeBillRefnoFilter ()
  {
    return this.CeBillRefno;
  }
  /** Set the field level Fetch value for field: CeBillRefResets
   * @param fetch whether to fetch this field or not
   */
  public void setCeBillRefResetsFetch (boolean fetch)
  {
    this.CeBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeBillRefResets
   * @return boolean the Fetch value for this field
   */
  public boolean getCeBillRefResetsFetch ()
  {
    return this.CeBillRefResetsFetch;
  }
  /** Set the SortOrder for field: CeBillRefResets
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeBillRefResetsSortOrder (Integer value)
  {
    this.CeBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: CeBillRefResets
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeBillRefResetsSortOrder ()
  {
    return this.CeBillRefResetsSort;
  }
  /** Set the sort direction for field: CeBillRefResets
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeBillRefResetsSortDirection (boolean ascending)
  {
    this.CeBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeBillRefResets
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeBillRefResetsSortDirection ()
  {
    return this.CeBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: CeBillRefResets
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeBillRefResets = value;
  }
  /** Retrieve filter for field: CeBillRefResets
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeBillRefResetsFilter ()
  {
    return this.CeBillRefResets;
  }
  /** Set the field level Fetch value for field: CeStatementDate
   * @param fetch whether to fetch this field or not
   */
  public void setCeStatementDateFetch (boolean fetch)
  {
    this.CeStatementDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeStatementDate
   * @return boolean the Fetch value for this field
   */
  public boolean getCeStatementDateFetch ()
  {
    return this.CeStatementDateFetch;
  }
  /** Set the SortOrder for field: CeStatementDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeStatementDateSortOrder (Integer value)
  {
    this.CeStatementDateSort = value;
  }
  /** Retrieve SortOrder for field: CeStatementDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeStatementDateSortOrder ()
  {
    return this.CeStatementDateSort;
  }
  /** Set the sort direction for field: CeStatementDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeStatementDateSortDirection (boolean ascending)
  {
    this.CeStatementDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeStatementDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeStatementDateSortDirection ()
  {
    return this.CeStatementDateSortAscending;
  }
  /** Set the field level filters for field: CeStatementDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeStatementDateFilter (DateFilter[] value) throws ServiceException
  {
    this.CeStatementDate = value;
  }
  /** Retrieve filter for field: CeStatementDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCeStatementDateFilter ()
  {
    return this.CeStatementDate;
  }
  /** Set the field level Fetch value for field: CeFromDate
   * @param fetch whether to fetch this field or not
   */
  public void setCeFromDateFetch (boolean fetch)
  {
    this.CeFromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeFromDate
   * @return boolean the Fetch value for this field
   */
  public boolean getCeFromDateFetch ()
  {
    return this.CeFromDateFetch;
  }
  /** Set the SortOrder for field: CeFromDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeFromDateSortOrder (Integer value)
  {
    this.CeFromDateSort = value;
  }
  /** Retrieve SortOrder for field: CeFromDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeFromDateSortOrder ()
  {
    return this.CeFromDateSort;
  }
  /** Set the sort direction for field: CeFromDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeFromDateSortDirection (boolean ascending)
  {
    this.CeFromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeFromDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeFromDateSortDirection ()
  {
    return this.CeFromDateSortAscending;
  }
  /** Set the field level filters for field: CeFromDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeFromDateFilter (DateFilter[] value) throws ServiceException
  {
    this.CeFromDate = value;
  }
  /** Retrieve filter for field: CeFromDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCeFromDateFilter ()
  {
    return this.CeFromDate;
  }
  /** Set the field level Fetch value for field: CeToDate
   * @param fetch whether to fetch this field or not
   */
  public void setCeToDateFetch (boolean fetch)
  {
    this.CeToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeToDate
   * @return boolean the Fetch value for this field
   */
  public boolean getCeToDateFetch ()
  {
    return this.CeToDateFetch;
  }
  /** Set the SortOrder for field: CeToDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeToDateSortOrder (Integer value)
  {
    this.CeToDateSort = value;
  }
  /** Retrieve SortOrder for field: CeToDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeToDateSortOrder ()
  {
    return this.CeToDateSort;
  }
  /** Set the sort direction for field: CeToDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeToDateSortDirection (boolean ascending)
  {
    this.CeToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeToDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeToDateSortDirection ()
  {
    return this.CeToDateSortAscending;
  }
  /** Set the field level filters for field: CeToDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeToDateFilter (DateFilter[] value) throws ServiceException
  {
    this.CeToDate = value;
  }
  /** Retrieve filter for field: CeToDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCeToDateFilter ()
  {
    return this.CeToDate;
  }
  /** Set the field level Fetch value for field: CeObjectType
   * @param fetch whether to fetch this field or not
   */
  public void setCeObjectTypeFetch (boolean fetch)
  {
    this.CeObjectTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeObjectType
   * @return boolean the Fetch value for this field
   */
  public boolean getCeObjectTypeFetch ()
  {
    return this.CeObjectTypeFetch;
  }
  /** Set the SortOrder for field: CeObjectType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeObjectTypeSortOrder (Integer value)
  {
    this.CeObjectTypeSort = value;
  }
  /** Retrieve SortOrder for field: CeObjectType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeObjectTypeSortOrder ()
  {
    return this.CeObjectTypeSort;
  }
  /** Set the sort direction for field: CeObjectType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeObjectTypeSortDirection (boolean ascending)
  {
    this.CeObjectTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeObjectType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeObjectTypeSortDirection ()
  {
    return this.CeObjectTypeSortAscending;
  }
  /** Set the field level filters for field: CeObjectType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeObjectTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeObjectType = value;
  }
  /** Retrieve filter for field: CeObjectType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeObjectTypeFilter ()
  {
    return this.CeObjectType;
  }
  /** Set the field level Fetch value for field: CeObjectTypeKey
   * @param fetch whether to fetch this field or not
   */
  public void setCeObjectTypeKeyFetch (boolean fetch)
  {
    this.CeObjectTypeKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeObjectTypeKey
   * @return boolean the Fetch value for this field
   */
  public boolean getCeObjectTypeKeyFetch ()
  {
    return this.CeObjectTypeKeyFetch;
  }
  /** Set the SortOrder for field: CeObjectTypeKey
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeObjectTypeKeySortOrder (Integer value)
  {
    this.CeObjectTypeKeySort = value;
  }
  /** Retrieve SortOrder for field: CeObjectTypeKey
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeObjectTypeKeySortOrder ()
  {
    return this.CeObjectTypeKeySort;
  }
  /** Set the sort direction for field: CeObjectTypeKey
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeObjectTypeKeySortDirection (boolean ascending)
  {
    this.CeObjectTypeKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeObjectTypeKey
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeObjectTypeKeySortDirection ()
  {
    return this.CeObjectTypeKeySortAscending;
  }
  /** Set the field level filters for field: CeObjectTypeKey
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeObjectTypeKeyFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeObjectTypeKey = value;
  }
  /** Retrieve filter for field: CeObjectTypeKey
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeObjectTypeKeyFilter ()
  {
    return this.CeObjectTypeKey;
  }
  /** Set the field level Fetch value for field: CeObjectKey1
   * @param fetch whether to fetch this field or not
   */
  public void setCeObjectKey1Fetch (boolean fetch)
  {
    this.CeObjectKey1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CeObjectKey1
   * @return boolean the Fetch value for this field
   */
  public boolean getCeObjectKey1Fetch ()
  {
    return this.CeObjectKey1Fetch;
  }
  /** Set the SortOrder for field: CeObjectKey1
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeObjectKey1SortOrder (Integer value)
  {
    this.CeObjectKey1Sort = value;
  }
  /** Retrieve SortOrder for field: CeObjectKey1
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeObjectKey1SortOrder ()
  {
    return this.CeObjectKey1Sort;
  }
  /** Set the sort direction for field: CeObjectKey1
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeObjectKey1SortDirection (boolean ascending)
  {
    this.CeObjectKey1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeObjectKey1
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeObjectKey1SortDirection ()
  {
    return this.CeObjectKey1SortAscending;
  }
  /** Set the field level filters for field: CeObjectKey1
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeObjectKey1Filter (IntegerFilter[] value) throws ServiceException
  {
    this.CeObjectKey1 = value;
  }
  /** Retrieve filter for field: CeObjectKey1
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeObjectKey1Filter ()
  {
    return this.CeObjectKey1;
  }
  /** Set the field level Fetch value for field: CeObjectKey2
   * @param fetch whether to fetch this field or not
   */
  public void setCeObjectKey2Fetch (boolean fetch)
  {
    this.CeObjectKey2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CeObjectKey2
   * @return boolean the Fetch value for this field
   */
  public boolean getCeObjectKey2Fetch ()
  {
    return this.CeObjectKey2Fetch;
  }
  /** Set the SortOrder for field: CeObjectKey2
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeObjectKey2SortOrder (Integer value)
  {
    this.CeObjectKey2Sort = value;
  }
  /** Retrieve SortOrder for field: CeObjectKey2
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeObjectKey2SortOrder ()
  {
    return this.CeObjectKey2Sort;
  }
  /** Set the sort direction for field: CeObjectKey2
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeObjectKey2SortDirection (boolean ascending)
  {
    this.CeObjectKey2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeObjectKey2
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeObjectKey2SortDirection ()
  {
    return this.CeObjectKey2SortAscending;
  }
  /** Set the field level filters for field: CeObjectKey2
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeObjectKey2Filter (IntegerFilter[] value) throws ServiceException
  {
    this.CeObjectKey2 = value;
  }
  /** Retrieve filter for field: CeObjectKey2
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeObjectKey2Filter ()
  {
    return this.CeObjectKey2;
  }
  /** Set the field level Fetch value for field: CeParentType
   * @param fetch whether to fetch this field or not
   */
  public void setCeParentTypeFetch (boolean fetch)
  {
    this.CeParentTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeParentType
   * @return boolean the Fetch value for this field
   */
  public boolean getCeParentTypeFetch ()
  {
    return this.CeParentTypeFetch;
  }
  /** Set the SortOrder for field: CeParentType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeParentTypeSortOrder (Integer value)
  {
    this.CeParentTypeSort = value;
  }
  /** Retrieve SortOrder for field: CeParentType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeParentTypeSortOrder ()
  {
    return this.CeParentTypeSort;
  }
  /** Set the sort direction for field: CeParentType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeParentTypeSortDirection (boolean ascending)
  {
    this.CeParentTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeParentType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeParentTypeSortDirection ()
  {
    return this.CeParentTypeSortAscending;
  }
  /** Set the field level filters for field: CeParentType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeParentTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeParentType = value;
  }
  /** Retrieve filter for field: CeParentType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeParentTypeFilter ()
  {
    return this.CeParentType;
  }
  /** Set the field level Fetch value for field: CeParentTypeKey
   * @param fetch whether to fetch this field or not
   */
  public void setCeParentTypeKeyFetch (boolean fetch)
  {
    this.CeParentTypeKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeParentTypeKey
   * @return boolean the Fetch value for this field
   */
  public boolean getCeParentTypeKeyFetch ()
  {
    return this.CeParentTypeKeyFetch;
  }
  /** Set the SortOrder for field: CeParentTypeKey
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeParentTypeKeySortOrder (Integer value)
  {
    this.CeParentTypeKeySort = value;
  }
  /** Retrieve SortOrder for field: CeParentTypeKey
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeParentTypeKeySortOrder ()
  {
    return this.CeParentTypeKeySort;
  }
  /** Set the sort direction for field: CeParentTypeKey
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeParentTypeKeySortDirection (boolean ascending)
  {
    this.CeParentTypeKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeParentTypeKey
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeParentTypeKeySortDirection ()
  {
    return this.CeParentTypeKeySortAscending;
  }
  /** Set the field level filters for field: CeParentTypeKey
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeParentTypeKeyFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeParentTypeKey = value;
  }
  /** Retrieve filter for field: CeParentTypeKey
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeParentTypeKeyFilter ()
  {
    return this.CeParentTypeKey;
  }
  /** Set the field level Fetch value for field: CeParentKey1
   * @param fetch whether to fetch this field or not
   */
  public void setCeParentKey1Fetch (boolean fetch)
  {
    this.CeParentKey1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CeParentKey1
   * @return boolean the Fetch value for this field
   */
  public boolean getCeParentKey1Fetch ()
  {
    return this.CeParentKey1Fetch;
  }
  /** Set the SortOrder for field: CeParentKey1
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeParentKey1SortOrder (Integer value)
  {
    this.CeParentKey1Sort = value;
  }
  /** Retrieve SortOrder for field: CeParentKey1
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeParentKey1SortOrder ()
  {
    return this.CeParentKey1Sort;
  }
  /** Set the sort direction for field: CeParentKey1
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeParentKey1SortDirection (boolean ascending)
  {
    this.CeParentKey1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeParentKey1
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeParentKey1SortDirection ()
  {
    return this.CeParentKey1SortAscending;
  }
  /** Set the field level filters for field: CeParentKey1
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeParentKey1Filter (IntegerFilter[] value) throws ServiceException
  {
    this.CeParentKey1 = value;
  }
  /** Retrieve filter for field: CeParentKey1
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeParentKey1Filter ()
  {
    return this.CeParentKey1;
  }
  /** Set the field level Fetch value for field: CeParentKey2
   * @param fetch whether to fetch this field or not
   */
  public void setCeParentKey2Fetch (boolean fetch)
  {
    this.CeParentKey2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: CeParentKey2
   * @return boolean the Fetch value for this field
   */
  public boolean getCeParentKey2Fetch ()
  {
    return this.CeParentKey2Fetch;
  }
  /** Set the SortOrder for field: CeParentKey2
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeParentKey2SortOrder (Integer value)
  {
    this.CeParentKey2Sort = value;
  }
  /** Retrieve SortOrder for field: CeParentKey2
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeParentKey2SortOrder ()
  {
    return this.CeParentKey2Sort;
  }
  /** Set the sort direction for field: CeParentKey2
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeParentKey2SortDirection (boolean ascending)
  {
    this.CeParentKey2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeParentKey2
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeParentKey2SortDirection ()
  {
    return this.CeParentKey2SortAscending;
  }
  /** Set the field level filters for field: CeParentKey2
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeParentKey2Filter (IntegerFilter[] value) throws ServiceException
  {
    this.CeParentKey2 = value;
  }
  /** Retrieve filter for field: CeParentKey2
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeParentKey2Filter ()
  {
    return this.CeParentKey2;
  }
  /** Set the field level Fetch value for field: CeAmount
   * @param fetch whether to fetch this field or not
   */
  public void setCeAmountFetch (boolean fetch)
  {
    this.CeAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getCeAmountFetch ()
  {
    return this.CeAmountFetch;
  }
  /** Set the SortOrder for field: CeAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeAmountSortOrder (Integer value)
  {
    this.CeAmountSort = value;
  }
  /** Retrieve SortOrder for field: CeAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeAmountSortOrder ()
  {
    return this.CeAmountSort;
  }
  /** Set the sort direction for field: CeAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeAmountSortDirection (boolean ascending)
  {
    this.CeAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeAmountSortDirection ()
  {
    return this.CeAmountSortAscending;
  }
  /** Set the field level filters for field: CeAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeAmount = value;
  }
  /** Retrieve filter for field: CeAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeAmountFilter ()
  {
    return this.CeAmount;
  }
  /** Set the field level Fetch value for field: CeDiscount
   * @param fetch whether to fetch this field or not
   */
  public void setCeDiscountFetch (boolean fetch)
  {
    this.CeDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeDiscount
   * @return boolean the Fetch value for this field
   */
  public boolean getCeDiscountFetch ()
  {
    return this.CeDiscountFetch;
  }
  /** Set the SortOrder for field: CeDiscount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeDiscountSortOrder (Integer value)
  {
    this.CeDiscountSort = value;
  }
  /** Retrieve SortOrder for field: CeDiscount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeDiscountSortOrder ()
  {
    return this.CeDiscountSort;
  }
  /** Set the sort direction for field: CeDiscount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeDiscountSortDirection (boolean ascending)
  {
    this.CeDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeDiscount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeDiscountSortDirection ()
  {
    return this.CeDiscountSortAscending;
  }
  /** Set the field level filters for field: CeDiscount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeDiscountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeDiscount = value;
  }
  /** Retrieve filter for field: CeDiscount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeDiscountFilter ()
  {
    return this.CeDiscount;
  }
  /** Set the field level Fetch value for field: CeTaxes
   * @param fetch whether to fetch this field or not
   */
  public void setCeTaxesFetch (boolean fetch)
  {
    this.CeTaxesFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeTaxes
   * @return boolean the Fetch value for this field
   */
  public boolean getCeTaxesFetch ()
  {
    return this.CeTaxesFetch;
  }
  /** Set the SortOrder for field: CeTaxes
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeTaxesSortOrder (Integer value)
  {
    this.CeTaxesSort = value;
  }
  /** Retrieve SortOrder for field: CeTaxes
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeTaxesSortOrder ()
  {
    return this.CeTaxesSort;
  }
  /** Set the sort direction for field: CeTaxes
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeTaxesSortDirection (boolean ascending)
  {
    this.CeTaxesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeTaxes
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeTaxesSortDirection ()
  {
    return this.CeTaxesSortAscending;
  }
  /** Set the field level filters for field: CeTaxes
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeTaxesFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeTaxes = value;
  }
  /** Retrieve filter for field: CeTaxes
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeTaxesFilter ()
  {
    return this.CeTaxes;
  }
  /** Set the field level Fetch value for field: CeFederalTax
   * @param fetch whether to fetch this field or not
   */
  public void setCeFederalTaxFetch (boolean fetch)
  {
    this.CeFederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeFederalTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCeFederalTaxFetch ()
  {
    return this.CeFederalTaxFetch;
  }
  /** Set the SortOrder for field: CeFederalTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeFederalTaxSortOrder (Integer value)
  {
    this.CeFederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: CeFederalTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeFederalTaxSortOrder ()
  {
    return this.CeFederalTaxSort;
  }
  /** Set the sort direction for field: CeFederalTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeFederalTaxSortDirection (boolean ascending)
  {
    this.CeFederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeFederalTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeFederalTaxSortDirection ()
  {
    return this.CeFederalTaxSortAscending;
  }
  /** Set the field level filters for field: CeFederalTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeFederalTax = value;
  }
  /** Retrieve filter for field: CeFederalTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeFederalTaxFilter ()
  {
    return this.CeFederalTax;
  }
  /** Set the field level Fetch value for field: CeStateTax
   * @param fetch whether to fetch this field or not
   */
  public void setCeStateTaxFetch (boolean fetch)
  {
    this.CeStateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeStateTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCeStateTaxFetch ()
  {
    return this.CeStateTaxFetch;
  }
  /** Set the SortOrder for field: CeStateTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeStateTaxSortOrder (Integer value)
  {
    this.CeStateTaxSort = value;
  }
  /** Retrieve SortOrder for field: CeStateTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeStateTaxSortOrder ()
  {
    return this.CeStateTaxSort;
  }
  /** Set the sort direction for field: CeStateTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeStateTaxSortDirection (boolean ascending)
  {
    this.CeStateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeStateTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeStateTaxSortDirection ()
  {
    return this.CeStateTaxSortAscending;
  }
  /** Set the field level filters for field: CeStateTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeStateTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeStateTax = value;
  }
  /** Retrieve filter for field: CeStateTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeStateTaxFilter ()
  {
    return this.CeStateTax;
  }
  /** Set the field level Fetch value for field: CeCountyTax
   * @param fetch whether to fetch this field or not
   */
  public void setCeCountyTaxFetch (boolean fetch)
  {
    this.CeCountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeCountyTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCeCountyTaxFetch ()
  {
    return this.CeCountyTaxFetch;
  }
  /** Set the SortOrder for field: CeCountyTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeCountyTaxSortOrder (Integer value)
  {
    this.CeCountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CeCountyTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeCountyTaxSortOrder ()
  {
    return this.CeCountyTaxSort;
  }
  /** Set the sort direction for field: CeCountyTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeCountyTaxSortDirection (boolean ascending)
  {
    this.CeCountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeCountyTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeCountyTaxSortDirection ()
  {
    return this.CeCountyTaxSortAscending;
  }
  /** Set the field level filters for field: CeCountyTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeCountyTax = value;
  }
  /** Retrieve filter for field: CeCountyTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeCountyTaxFilter ()
  {
    return this.CeCountyTax;
  }
  /** Set the field level Fetch value for field: CeCityTax
   * @param fetch whether to fetch this field or not
   */
  public void setCeCityTaxFetch (boolean fetch)
  {
    this.CeCityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeCityTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCeCityTaxFetch ()
  {
    return this.CeCityTaxFetch;
  }
  /** Set the SortOrder for field: CeCityTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeCityTaxSortOrder (Integer value)
  {
    this.CeCityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CeCityTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeCityTaxSortOrder ()
  {
    return this.CeCityTaxSort;
  }
  /** Set the sort direction for field: CeCityTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeCityTaxSortDirection (boolean ascending)
  {
    this.CeCityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeCityTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeCityTaxSortDirection ()
  {
    return this.CeCityTaxSortAscending;
  }
  /** Set the field level filters for field: CeCityTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeCityTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeCityTax = value;
  }
  /** Retrieve filter for field: CeCityTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeCityTaxFilter ()
  {
    return this.CeCityTax;
  }
  /** Set the field level Fetch value for field: CeOtherTax
   * @param fetch whether to fetch this field or not
   */
  public void setCeOtherTaxFetch (boolean fetch)
  {
    this.CeOtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeOtherTax
   * @return boolean the Fetch value for this field
   */
  public boolean getCeOtherTaxFetch ()
  {
    return this.CeOtherTaxFetch;
  }
  /** Set the SortOrder for field: CeOtherTax
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeOtherTaxSortOrder (Integer value)
  {
    this.CeOtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: CeOtherTax
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeOtherTaxSortOrder ()
  {
    return this.CeOtherTaxSort;
  }
  /** Set the sort direction for field: CeOtherTax
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeOtherTaxSortDirection (boolean ascending)
  {
    this.CeOtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeOtherTax
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeOtherTaxSortDirection ()
  {
    return this.CeOtherTaxSortAscending;
  }
  /** Set the field level filters for field: CeOtherTax
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.CeOtherTax = value;
  }
  /** Retrieve filter for field: CeOtherTax
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCeOtherTaxFilter ()
  {
    return this.CeOtherTax;
  }
  /** Set the field level Fetch value for field: CeDescriptionText
   * @param fetch whether to fetch this field or not
   */
  public void setCeDescriptionTextFetch (boolean fetch)
  {
    this.CeDescriptionTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeDescriptionText
   * @return boolean the Fetch value for this field
   */
  public boolean getCeDescriptionTextFetch ()
  {
    return this.CeDescriptionTextFetch;
  }
  /** Set the SortOrder for field: CeDescriptionText
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeDescriptionTextSortOrder (Integer value)
  {
    this.CeDescriptionTextSort = value;
  }
  /** Retrieve SortOrder for field: CeDescriptionText
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeDescriptionTextSortOrder ()
  {
    return this.CeDescriptionTextSort;
  }
  /** Set the sort direction for field: CeDescriptionText
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeDescriptionTextSortDirection (boolean ascending)
  {
    this.CeDescriptionTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeDescriptionText
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeDescriptionTextSortDirection ()
  {
    return this.CeDescriptionTextSortAscending;
  }
  /** Set the case insensitive for field: CeDescriptionText
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCeDescriptionTextCaseInsensitive (boolean ascending)
  {
    this.CeDescriptionTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: CeDescriptionText
   * @return boolean whether the field is case insensitive
   */
  public boolean getCeDescriptionTextCaseInsensitive ()
  {
    return this.CeDescriptionTextCaseInsensitive;
  }
  /** Set the field level filters for field: CeDescriptionText
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeDescriptionTextFilter (StringFilter[] value) throws ServiceException
  {
    this.CeDescriptionText = value;
  }
  /** Retrieve filter for field: CeDescriptionText
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCeDescriptionTextFilter ()
  {
    return this.CeDescriptionText;
  }
  /** Set the field level Fetch value for field: CeDescriptionCode
   * @param fetch whether to fetch this field or not
   */
  public void setCeDescriptionCodeFetch (boolean fetch)
  {
    this.CeDescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CeDescriptionCode
   * @return boolean the Fetch value for this field
   */
  public boolean getCeDescriptionCodeFetch ()
  {
    return this.CeDescriptionCodeFetch;
  }
  /** Set the SortOrder for field: CeDescriptionCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCeDescriptionCodeSortOrder (Integer value)
  {
    this.CeDescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: CeDescriptionCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCeDescriptionCodeSortOrder ()
  {
    return this.CeDescriptionCodeSort;
  }
  /** Set the sort direction for field: CeDescriptionCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCeDescriptionCodeSortDirection (boolean ascending)
  {
    this.CeDescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CeDescriptionCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCeDescriptionCodeSortDirection ()
  {
    return this.CeDescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: CeDescriptionCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCeDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CeDescriptionCode = value;
  }
  /** Retrieve filter for field: CeDescriptionCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCeDescriptionCodeFilter ()
  {
    return this.CeDescriptionCode;
  }
  public String toString() {
    return ChargeElementObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ChargeElementObjectHelper.toMap(this, null);
  }
}
