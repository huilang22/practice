/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ETCQuoteResponseObjectFilter.java
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



import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class ETCQuoteResponseObjectFilter extends ETCQuoteRequestObjectFilter  implements Serializable
{
  /** raw field */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field */
  public    StringFilter[] ServiceExternalId  = null;
  protected boolean ServiceExternalIdFetch = false;
  protected boolean ServiceExternalIdSortAscending = true;
  protected boolean ServiceExternalIdCaseInsensitive = false;
  protected Integer ServiceExternalIdSort = null;
  /** raw field */
  public    IntegerFilter[] ServiceExternalIdType  = null;
  protected boolean ServiceExternalIdTypeFetch = false;
  protected boolean ServiceExternalIdTypeSortAscending = true;
  protected Integer ServiceExternalIdTypeSort = null;
  /** raw field */
  public    BigIntegerFilter[] EtcQuoteAmount  = null;
  protected boolean EtcQuoteAmountFetch = false;
  protected boolean EtcQuoteAmountSortAscending = true;
  protected Integer EtcQuoteAmountSort = null;
  /** raw field */
  public    StringFilter[] ETCNRCDesc  = null;
  protected boolean ETCNRCDescFetch = false;
  protected boolean ETCNRCDescSortAscending = true;
  protected boolean ETCNRCDescCaseInsensitive = false;
  protected Integer ETCNRCDescSort = null;
  /** raw field */
  public    StringFilter[] ETCCtrDesc  = null;
  protected boolean ETCCtrDescFetch = false;
  protected boolean ETCCtrDescSortAscending = true;
  protected boolean ETCCtrDescCaseInsensitive = false;
  protected Integer ETCCtrDescSort = null;
  /** raw field */
  public    StringFilter[] ETCRCDesc  = null;
  protected boolean ETCRCDescFetch = false;
  protected boolean ETCRCDescSortAscending = true;
  protected boolean ETCRCDescCaseInsensitive = false;
  protected Integer ETCRCDescSort = null;
  /** raw field */
  public    BigIntegerFilter[] InstallmentAmtQuote  = null;
  protected boolean InstallmentAmtQuoteFetch = false;
  protected boolean InstallmentAmtQuoteSortAscending = true;
  protected Integer InstallmentAmtQuoteSort = null;
  /** raw field */
  public    IntegerFilter[] InstallmentNum  = null;
  protected boolean InstallmentNumFetch = false;
  protected boolean InstallmentNumSortAscending = true;
  protected Integer InstallmentNumSort = null;
  /** raw field */
  public    IntegerFilter[] ContractLevel  = null;
  protected boolean ContractLevelFetch = false;
  protected boolean ContractLevelSortAscending = true;
  protected Integer ContractLevelSort = null;
  /** raw field */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field */
  public    DateFilter[] ContractEndDate  = null;
  protected boolean ContractEndDateFetch = false;
  protected boolean ContractEndDateSortAscending = true;
  protected Integer ContractEndDateSort = null;
  private String _objName = "ETCQuoteResponseObjectFilter";
  /** default constructor */
  public ETCQuoteResponseObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ETCQuoteResponseObjectFilter (ETCQuoteResponseObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.EtcQuoteAmount = other.EtcQuoteAmount;
    this.EtcQuoteAmountFetch = other.EtcQuoteAmountFetch;
    this.EtcQuoteAmountSort = other.EtcQuoteAmountSort;
    this.EtcQuoteAmountSortAscending = other.EtcQuoteAmountSortAscending;
    this.ETCNRCDesc = other.ETCNRCDesc;
    this.ETCNRCDescFetch = other.ETCNRCDescFetch;
    this.ETCNRCDescSort = other.ETCNRCDescSort;
    this.ETCNRCDescCaseInsensitive = other.ETCNRCDescCaseInsensitive;
    this.ETCNRCDescSortAscending = other.ETCNRCDescSortAscending;
    this.ETCCtrDesc = other.ETCCtrDesc;
    this.ETCCtrDescFetch = other.ETCCtrDescFetch;
    this.ETCCtrDescSort = other.ETCCtrDescSort;
    this.ETCCtrDescCaseInsensitive = other.ETCCtrDescCaseInsensitive;
    this.ETCCtrDescSortAscending = other.ETCCtrDescSortAscending;
    this.ETCRCDesc = other.ETCRCDesc;
    this.ETCRCDescFetch = other.ETCRCDescFetch;
    this.ETCRCDescSort = other.ETCRCDescSort;
    this.ETCRCDescCaseInsensitive = other.ETCRCDescCaseInsensitive;
    this.ETCRCDescSortAscending = other.ETCRCDescSortAscending;
    this.InstallmentAmtQuote = other.InstallmentAmtQuote;
    this.InstallmentAmtQuoteFetch = other.InstallmentAmtQuoteFetch;
    this.InstallmentAmtQuoteSort = other.InstallmentAmtQuoteSort;
    this.InstallmentAmtQuoteSortAscending = other.InstallmentAmtQuoteSortAscending;
    this.InstallmentNum = other.InstallmentNum;
    this.InstallmentNumFetch = other.InstallmentNumFetch;
    this.InstallmentNumSort = other.InstallmentNumSort;
    this.InstallmentNumSortAscending = other.InstallmentNumSortAscending;
    this.ContractLevel = other.ContractLevel;
    this.ContractLevelFetch = other.ContractLevelFetch;
    this.ContractLevelSort = other.ContractLevelSort;
    this.ContractLevelSortAscending = other.ContractLevelSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.ContractEndDate = other.ContractEndDate;
    this.ContractEndDateFetch = other.ContractEndDateFetch;
    this.ContractEndDateSort = other.ContractEndDateSort;
    this.ContractEndDateSortAscending = other.ContractEndDateSortAscending;  }
  /** Set the field level Fetch value for field: AccountExternalId
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch)
  {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch ()
  {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value)
  {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder ()
  {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending)
  {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection ()
  {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending)
  {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId
   * @return boolean whether the field is case insensitive
   */
  public boolean getAccountExternalIdCaseInsensitive ()
  {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException
  {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter ()
  {
    return this.AccountExternalId;
  }
  /** Set the field level Fetch value for field: AccountExternalIdType
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch)
  {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch ()
  {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value)
  {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder ()
  {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending)
  {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection ()
  {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter ()
  {
    return this.AccountExternalIdType;
  }
  /** Set the field level Fetch value for field: ServiceExternalId
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdFetch (boolean fetch)
  {
    this.ServiceExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalId
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdFetch ()
  {
    return this.ServiceExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceExternalId
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdSortOrder (Integer value)
  {
    this.ServiceExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalId
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdSortOrder ()
  {
    return this.ServiceExternalIdSort;
  }
  /** Set the sort direction for field: ServiceExternalId
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdSortDirection (boolean ascending)
  {
    this.ServiceExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalId
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdSortDirection ()
  {
    return this.ServiceExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceExternalId
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceExternalIdCaseInsensitive (boolean ascending)
  {
    this.ServiceExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceExternalId
   * @return boolean whether the field is case insensitive
   */
  public boolean getServiceExternalIdCaseInsensitive ()
  {
    return this.ServiceExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceExternalId
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdFilter (StringFilter[] value) throws ServiceException
  {
    this.ServiceExternalId = value;
  }
  /** Retrieve filter for field: ServiceExternalId
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceExternalIdFilter ()
  {
    return this.ServiceExternalId;
  }
  /** Set the field level Fetch value for field: ServiceExternalIdType
   * @param fetch whether to fetch this field or not
   */
  public void setServiceExternalIdTypeFetch (boolean fetch)
  {
    this.ServiceExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceExternalIdType
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceExternalIdTypeFetch ()
  {
    return this.ServiceExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceExternalIdType
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceExternalIdTypeSortOrder (Integer value)
  {
    this.ServiceExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceExternalIdType
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceExternalIdTypeSortOrder ()
  {
    return this.ServiceExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceExternalIdType
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceExternalIdTypeSortDirection (boolean ascending)
  {
    this.ServiceExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceExternalIdType
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceExternalIdTypeSortDirection ()
  {
    return this.ServiceExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceExternalIdType
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ServiceExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceExternalIdType
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceExternalIdTypeFilter ()
  {
    return this.ServiceExternalIdType;
  }
  /** Set the field level Fetch value for field: EtcQuoteAmount
   * @param fetch whether to fetch this field or not
   */
  public void setEtcQuoteAmountFetch (boolean fetch)
  {
    this.EtcQuoteAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: EtcQuoteAmount
   * @return boolean the Fetch value for this field
   */
  public boolean getEtcQuoteAmountFetch ()
  {
    return this.EtcQuoteAmountFetch;
  }
  /** Set the SortOrder for field: EtcQuoteAmount
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEtcQuoteAmountSortOrder (Integer value)
  {
    this.EtcQuoteAmountSort = value;
  }
  /** Retrieve SortOrder for field: EtcQuoteAmount
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEtcQuoteAmountSortOrder ()
  {
    return this.EtcQuoteAmountSort;
  }
  /** Set the sort direction for field: EtcQuoteAmount
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEtcQuoteAmountSortDirection (boolean ascending)
  {
    this.EtcQuoteAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EtcQuoteAmount
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEtcQuoteAmountSortDirection ()
  {
    return this.EtcQuoteAmountSortAscending;
  }
  /** Set the field level filters for field: EtcQuoteAmount
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEtcQuoteAmountFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.EtcQuoteAmount = value;
  }
  /** Retrieve filter for field: EtcQuoteAmount
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getEtcQuoteAmountFilter ()
  {
    return this.EtcQuoteAmount;
  }
  /** Set the field level Fetch value for field: ETCNRCDesc
   * @param fetch whether to fetch this field or not
   */
  public void setETCNRCDescFetch (boolean fetch)
  {
    this.ETCNRCDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: ETCNRCDesc
   * @return boolean the Fetch value for this field
   */
  public boolean getETCNRCDescFetch ()
  {
    return this.ETCNRCDescFetch;
  }
  /** Set the SortOrder for field: ETCNRCDesc
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setETCNRCDescSortOrder (Integer value)
  {
    this.ETCNRCDescSort = value;
  }
  /** Retrieve SortOrder for field: ETCNRCDesc
   * @return Integer the sort order, if set, for the field
   */
  public Integer getETCNRCDescSortOrder ()
  {
    return this.ETCNRCDescSort;
  }
  /** Set the sort direction for field: ETCNRCDesc
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setETCNRCDescSortDirection (boolean ascending)
  {
    this.ETCNRCDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ETCNRCDesc
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getETCNRCDescSortDirection ()
  {
    return this.ETCNRCDescSortAscending;
  }
  /** Set the case insensitive for field: ETCNRCDesc
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setETCNRCDescCaseInsensitive (boolean ascending)
  {
    this.ETCNRCDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ETCNRCDesc
   * @return boolean whether the field is case insensitive
   */
  public boolean getETCNRCDescCaseInsensitive ()
  {
    return this.ETCNRCDescCaseInsensitive;
  }
  /** Set the field level filters for field: ETCNRCDesc
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setETCNRCDescFilter (StringFilter[] value) throws ServiceException
  {
    this.ETCNRCDesc = value;
  }
  /** Retrieve filter for field: ETCNRCDesc
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getETCNRCDescFilter ()
  {
    return this.ETCNRCDesc;
  }
  /** Set the field level Fetch value for field: ETCCtrDesc
   * @param fetch whether to fetch this field or not
   */
  public void setETCCtrDescFetch (boolean fetch)
  {
    this.ETCCtrDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: ETCCtrDesc
   * @return boolean the Fetch value for this field
   */
  public boolean getETCCtrDescFetch ()
  {
    return this.ETCCtrDescFetch;
  }
  /** Set the SortOrder for field: ETCCtrDesc
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setETCCtrDescSortOrder (Integer value)
  {
    this.ETCCtrDescSort = value;
  }
  /** Retrieve SortOrder for field: ETCCtrDesc
   * @return Integer the sort order, if set, for the field
   */
  public Integer getETCCtrDescSortOrder ()
  {
    return this.ETCCtrDescSort;
  }
  /** Set the sort direction for field: ETCCtrDesc
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setETCCtrDescSortDirection (boolean ascending)
  {
    this.ETCCtrDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ETCCtrDesc
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getETCCtrDescSortDirection ()
  {
    return this.ETCCtrDescSortAscending;
  }
  /** Set the case insensitive for field: ETCCtrDesc
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setETCCtrDescCaseInsensitive (boolean ascending)
  {
    this.ETCCtrDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ETCCtrDesc
   * @return boolean whether the field is case insensitive
   */
  public boolean getETCCtrDescCaseInsensitive ()
  {
    return this.ETCCtrDescCaseInsensitive;
  }
  /** Set the field level filters for field: ETCCtrDesc
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setETCCtrDescFilter (StringFilter[] value) throws ServiceException
  {
    this.ETCCtrDesc = value;
  }
  /** Retrieve filter for field: ETCCtrDesc
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getETCCtrDescFilter ()
  {
    return this.ETCCtrDesc;
  }
  /** Set the field level Fetch value for field: ETCRCDesc
   * @param fetch whether to fetch this field or not
   */
  public void setETCRCDescFetch (boolean fetch)
  {
    this.ETCRCDescFetch = fetch;
  }
  /** Retrieve Fetch value for field: ETCRCDesc
   * @return boolean the Fetch value for this field
   */
  public boolean getETCRCDescFetch ()
  {
    return this.ETCRCDescFetch;
  }
  /** Set the SortOrder for field: ETCRCDesc
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setETCRCDescSortOrder (Integer value)
  {
    this.ETCRCDescSort = value;
  }
  /** Retrieve SortOrder for field: ETCRCDesc
   * @return Integer the sort order, if set, for the field
   */
  public Integer getETCRCDescSortOrder ()
  {
    return this.ETCRCDescSort;
  }
  /** Set the sort direction for field: ETCRCDesc
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setETCRCDescSortDirection (boolean ascending)
  {
    this.ETCRCDescSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ETCRCDesc
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getETCRCDescSortDirection ()
  {
    return this.ETCRCDescSortAscending;
  }
  /** Set the case insensitive for field: ETCRCDesc
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setETCRCDescCaseInsensitive (boolean ascending)
  {
    this.ETCRCDescCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ETCRCDesc
   * @return boolean whether the field is case insensitive
   */
  public boolean getETCRCDescCaseInsensitive ()
  {
    return this.ETCRCDescCaseInsensitive;
  }
  /** Set the field level filters for field: ETCRCDesc
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setETCRCDescFilter (StringFilter[] value) throws ServiceException
  {
    this.ETCRCDesc = value;
  }
  /** Retrieve filter for field: ETCRCDesc
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getETCRCDescFilter ()
  {
    return this.ETCRCDesc;
  }
  /** Set the field level Fetch value for field: InstallmentAmtQuote
   * @param fetch whether to fetch this field or not
   */
  public void setInstallmentAmtQuoteFetch (boolean fetch)
  {
    this.InstallmentAmtQuoteFetch = fetch;
  }
  /** Retrieve Fetch value for field: InstallmentAmtQuote
   * @return boolean the Fetch value for this field
   */
  public boolean getInstallmentAmtQuoteFetch ()
  {
    return this.InstallmentAmtQuoteFetch;
  }
  /** Set the SortOrder for field: InstallmentAmtQuote
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInstallmentAmtQuoteSortOrder (Integer value)
  {
    this.InstallmentAmtQuoteSort = value;
  }
  /** Retrieve SortOrder for field: InstallmentAmtQuote
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInstallmentAmtQuoteSortOrder ()
  {
    return this.InstallmentAmtQuoteSort;
  }
  /** Set the sort direction for field: InstallmentAmtQuote
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInstallmentAmtQuoteSortDirection (boolean ascending)
  {
    this.InstallmentAmtQuoteSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InstallmentAmtQuote
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInstallmentAmtQuoteSortDirection ()
  {
    return this.InstallmentAmtQuoteSortAscending;
  }
  /** Set the field level filters for field: InstallmentAmtQuote
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInstallmentAmtQuoteFilter (BigIntegerFilter[] value) throws ServiceException
  {
    this.InstallmentAmtQuote = value;
  }
  /** Retrieve filter for field: InstallmentAmtQuote
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getInstallmentAmtQuoteFilter ()
  {
    return this.InstallmentAmtQuote;
  }
  /** Set the field level Fetch value for field: InstallmentNum
   * @param fetch whether to fetch this field or not
   */
  public void setInstallmentNumFetch (boolean fetch)
  {
    this.InstallmentNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: InstallmentNum
   * @return boolean the Fetch value for this field
   */
  public boolean getInstallmentNumFetch ()
  {
    return this.InstallmentNumFetch;
  }
  /** Set the SortOrder for field: InstallmentNum
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInstallmentNumSortOrder (Integer value)
  {
    this.InstallmentNumSort = value;
  }
  /** Retrieve SortOrder for field: InstallmentNum
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInstallmentNumSortOrder ()
  {
    return this.InstallmentNumSort;
  }
  /** Set the sort direction for field: InstallmentNum
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInstallmentNumSortDirection (boolean ascending)
  {
    this.InstallmentNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InstallmentNum
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInstallmentNumSortDirection ()
  {
    return this.InstallmentNumSortAscending;
  }
  /** Set the field level filters for field: InstallmentNum
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInstallmentNumFilter (IntegerFilter[] value) throws ServiceException
  {
    this.InstallmentNum = value;
  }
  /** Retrieve filter for field: InstallmentNum
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getInstallmentNumFilter ()
  {
    return this.InstallmentNum;
  }
  /** Set the field level Fetch value for field: ContractLevel
   * @param fetch whether to fetch this field or not
   */
  public void setContractLevelFetch (boolean fetch)
  {
    this.ContractLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractLevel
   * @return boolean the Fetch value for this field
   */
  public boolean getContractLevelFetch ()
  {
    return this.ContractLevelFetch;
  }
  /** Set the SortOrder for field: ContractLevel
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractLevelSortOrder (Integer value)
  {
    this.ContractLevelSort = value;
  }
  /** Retrieve SortOrder for field: ContractLevel
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractLevelSortOrder ()
  {
    return this.ContractLevelSort;
  }
  /** Set the sort direction for field: ContractLevel
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractLevelSortDirection (boolean ascending)
  {
    this.ContractLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractLevel
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractLevelSortDirection ()
  {
    return this.ContractLevelSortAscending;
  }
  /** Set the field level filters for field: ContractLevel
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractLevelFilter (IntegerFilter[] value) throws ServiceException
  {
    this.ContractLevel = value;
  }
  /** Retrieve filter for field: ContractLevel
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractLevelFilter ()
  {
    return this.ContractLevel;
  }
  /** Set the field level Fetch value for field: CurrencyCode
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch)
  {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch ()
  {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value)
  {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder ()
  {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending)
  {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection ()
  {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter ()
  {
    return this.CurrencyCode;
  }
  /** Set the field level Fetch value for field: ContractEndDate
   * @param fetch whether to fetch this field or not
   */
  public void setContractEndDateFetch (boolean fetch)
  {
    this.ContractEndDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractEndDate
   * @return boolean the Fetch value for this field
   */
  public boolean getContractEndDateFetch ()
  {
    return this.ContractEndDateFetch;
  }
  /** Set the SortOrder for field: ContractEndDate
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractEndDateSortOrder (Integer value)
  {
    this.ContractEndDateSort = value;
  }
  /** Retrieve SortOrder for field: ContractEndDate
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractEndDateSortOrder ()
  {
    return this.ContractEndDateSort;
  }
  /** Set the sort direction for field: ContractEndDate
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractEndDateSortDirection (boolean ascending)
  {
    this.ContractEndDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractEndDate
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractEndDateSortDirection ()
  {
    return this.ContractEndDateSortAscending;
  }
  /** Set the field level filters for field: ContractEndDate
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractEndDateFilter (DateFilter[] value) throws ServiceException
  {
    this.ContractEndDate = value;
  }
  /** Retrieve filter for field: ContractEndDate
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getContractEndDateFilter ()
  {
    return this.ContractEndDate;
  }
  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public ETCQuoteResponseObjectFilter (ETCQuoteRequestObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return ETCQuoteResponseObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ETCQuoteResponseObjectHelper.toMap(this, null);
  }
}
