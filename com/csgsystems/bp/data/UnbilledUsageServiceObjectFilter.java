/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageServiceObjectFilter.java
 * Definition File: Customer/UnbilledUsage.xml
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

import com.csgsystems.bp.data.*;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class UnbilledUsageServiceObjectFilter extends UnbilledUsageObjectFilter  implements Serializable
{
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] ServiceParentAccountExternalId  = null;
  protected boolean ServiceParentAccountExternalIdFetch = false;
  protected boolean ServiceParentAccountExternalIdSortAscending = true;
  protected boolean ServiceParentAccountExternalIdCaseInsensitive = false;
  protected Integer ServiceParentAccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] ServiceParentAccountExternalIdType  = null;
  protected boolean ServiceParentAccountExternalIdTypeFetch = false;
  protected boolean ServiceParentAccountExternalIdTypeSortAscending = true;
  protected Integer ServiceParentAccountExternalIdTypeSort = null;
  /** raw field for: SERVICE.b_rev_rcv_cost_ctr) */
  public    IntegerFilter[] BRevRcvCostCtr  = null;
  protected boolean BRevRcvCostCtrFetch = false;
  protected boolean BRevRcvCostCtrSortAscending = true;
  protected Integer BRevRcvCostCtrSort = null;
  /** raw field for: SERVICE.b_service_fname) */
  public    StringFilter[] BServiceFname  = null;
  protected boolean BServiceFnameFetch = false;
  protected boolean BServiceFnameSortAscending = true;
  protected boolean BServiceFnameCaseInsensitive = false;
  protected Integer BServiceFnameSort = null;
  /** raw field for: SERVICE.b_service_minit) */
  public    StringFilter[] BServiceMinit  = null;
  protected boolean BServiceMinitFetch = false;
  protected boolean BServiceMinitSortAscending = true;
  protected boolean BServiceMinitCaseInsensitive = false;
  protected Integer BServiceMinitSort = null;
  /** raw field for: SERVICE.b_service_lname) */
  public    StringFilter[] BServiceLname  = null;
  protected boolean BServiceLnameFetch = false;
  protected boolean BServiceLnameSortAscending = true;
  protected boolean BServiceLnameCaseInsensitive = false;
  protected Integer BServiceLnameSort = null;
  /** raw field for: SERVICE.b_service_company) */
  public    StringFilter[] BServiceCompany  = null;
  protected boolean BServiceCompanyFetch = false;
  protected boolean BServiceCompanySortAscending = true;
  protected boolean BServiceCompanyCaseInsensitive = false;
  protected Integer BServiceCompanySort = null;
  /** raw field for: SERVICE.b_service_phone) */
  public    StringFilter[] BServicePhone  = null;
  protected boolean BServicePhoneFetch = false;
  protected boolean BServicePhoneSortAscending = true;
  protected boolean BServicePhoneCaseInsensitive = false;
  protected Integer BServicePhoneSort = null;
  /** raw field for: SERVICE.b_service_phone2) */
  public    StringFilter[] BServicePhone2  = null;
  protected boolean BServicePhone2Fetch = false;
  protected boolean BServicePhone2SortAscending = true;
  protected boolean BServicePhone2CaseInsensitive = false;
  protected Integer BServicePhone2Sort = null;
  /** raw field for: SERVICE.chg_dt) */
  public    DateFilter[] ChgDt  = null;
  protected boolean ChgDtFetch = false;
  protected boolean ChgDtSortAscending = true;
  protected Integer ChgDtSort = null;
  /** raw field for: SERVICE.chg_who) */
  public    StringFilter[] ChgWho  = null;
  protected boolean ChgWhoFetch = false;
  protected boolean ChgWhoSortAscending = true;
  protected boolean ChgWhoCaseInsensitive = false;
  protected Integer ChgWhoSort = null;
  /** raw field for: SERVICE.codeword) */
  public    StringFilter[] Codeword  = null;
  protected boolean CodewordFetch = false;
  protected boolean CodewordSortAscending = true;
  protected boolean CodewordCaseInsensitive = false;
  protected Integer CodewordSort = null;
  /** raw field for: SERVICE.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: SERVICE.display_external_id_type) */
  public    IntegerFilter[] DisplayExternalIdType  = null;
  protected boolean DisplayExternalIdTypeFetch = false;
  protected boolean DisplayExternalIdTypeSortAscending = true;
  protected Integer DisplayExternalIdTypeSort = null;
  /** raw field for: SERVICE.elig_key1) */
  public    IntegerFilter[] EligKey1  = null;
  protected boolean EligKey1Fetch = false;
  protected boolean EligKey1SortAscending = true;
  protected Integer EligKey1Sort = null;
  /** raw field for: SERVICE.elig_key2) */
  public    IntegerFilter[] EligKey2  = null;
  protected boolean EligKey2Fetch = false;
  protected boolean EligKey2SortAscending = true;
  protected Integer EligKey2Sort = null;
  /** raw field for: SERVICE.elig_key3) */
  public    IntegerFilter[] EligKey3  = null;
  protected boolean EligKey3Fetch = false;
  protected boolean EligKey3SortAscending = true;
  protected Integer EligKey3Sort = null;
  /** raw field for: SERVICE.emf_config_id) */
  public    IntegerFilter[] EmfConfigId  = null;
  protected boolean EmfConfigIdFetch = false;
  protected boolean EmfConfigIdSortAscending = true;
  protected Integer EmfConfigIdSort = null;
  /** raw field for: SERVICE.exrate_class) */
  public    IntegerFilter[] ExrateClass  = null;
  protected boolean ExrateClassFetch = false;
  protected boolean ExrateClassSortAscending = true;
  protected Integer ExrateClassSort = null;
  /** raw field for: SERVICE.ixc_provider_id) */
  public    IntegerFilter[] IxcProviderId  = null;
  protected boolean IxcProviderIdFetch = false;
  protected boolean IxcProviderIdSortAscending = true;
  protected Integer IxcProviderIdSort = null;
  /** raw field for: SERVICE.lec_provider_id) */
  public    IntegerFilter[] LecProviderId  = null;
  protected boolean LecProviderIdFetch = false;
  protected boolean LecProviderIdSortAscending = true;
  protected Integer LecProviderIdSort = null;
  /** raw field for: SERVICE.nonpub_nonlist) */
  public    IntegerFilter[] NonpubNonlist  = null;
  protected boolean NonpubNonlistFetch = false;
  protected boolean NonpubNonlistSortAscending = true;
  protected Integer NonpubNonlistSort = null;
  /** raw field for: SERVICE.pic_date_active) */
  public    DateFilter[] PicDateActive  = null;
  protected boolean PicDateActiveFetch = false;
  protected boolean PicDateActiveSortAscending = true;
  protected Integer PicDateActiveSort = null;
  /** raw field for: SERVICE.parent_account_no) */
  public    IntegerFilter[] ParentAccountInternalId  = null;
  protected boolean ParentAccountInternalIdFetch = false;
  protected boolean ParentAccountInternalIdSortAscending = true;
  protected Integer ParentAccountInternalIdSort = null;
  /** raw field for: SERVICE.pop_units) */
  public    IntegerFilter[] PopUnits  = null;
  protected boolean PopUnitsFetch = false;
  protected boolean PopUnitsSortAscending = true;
  protected Integer PopUnitsSort = null;
  /** raw field for: SERVICE.privacy_level) */
  public    IntegerFilter[] PrivacyLevel  = null;
  protected boolean PrivacyLevelFetch = false;
  protected boolean PrivacyLevelSortAscending = true;
  protected Integer PrivacyLevelSort = null;
  /** raw field for: SERVICE.restricted_pic) */
  public    IntegerFilter[] RestrictedPic  = null;
  protected boolean RestrictedPicFetch = false;
  protected boolean RestrictedPicSortAscending = true;
  protected Integer RestrictedPicSort = null;
  /** raw field for: SERVICE.service_name_pre) */
  public    StringFilter[] ServiceNamePre  = null;
  protected boolean ServiceNamePreFetch = false;
  protected boolean ServiceNamePreSortAscending = true;
  protected boolean ServiceNamePreCaseInsensitive = false;
  protected Integer ServiceNamePreSort = null;
  /** raw field for: SERVICE.service_fname) */
  public    StringFilter[] ServiceFname  = null;
  protected boolean ServiceFnameFetch = false;
  protected boolean ServiceFnameSortAscending = true;
  protected boolean ServiceFnameCaseInsensitive = false;
  protected Integer ServiceFnameSort = null;
  /** raw field for: SERVICE.service_minit) */
  public    StringFilter[] ServiceMinit  = null;
  protected boolean ServiceMinitFetch = false;
  protected boolean ServiceMinitSortAscending = true;
  protected boolean ServiceMinitCaseInsensitive = false;
  protected Integer ServiceMinitSort = null;
  /** raw field for: SERVICE.service_lname) */
  public    StringFilter[] ServiceLname  = null;
  protected boolean ServiceLnameFetch = false;
  protected boolean ServiceLnameSortAscending = true;
  protected boolean ServiceLnameCaseInsensitive = false;
  protected Integer ServiceLnameSort = null;
  /** raw field for: SERVICE.service_name_generation) */
  public    StringFilter[] ServiceNameGeneration  = null;
  protected boolean ServiceNameGenerationFetch = false;
  protected boolean ServiceNameGenerationSortAscending = true;
  protected boolean ServiceNameGenerationCaseInsensitive = false;
  protected Integer ServiceNameGenerationSort = null;
  /** raw field for: SERVICE.service_company) */
  public    StringFilter[] ServiceCompany  = null;
  protected boolean ServiceCompanyFetch = false;
  protected boolean ServiceCompanySortAscending = true;
  protected boolean ServiceCompanyCaseInsensitive = false;
  protected Integer ServiceCompanySort = null;
  /** raw field for: SERVICE.service_phone) */
  public    StringFilter[] ServicePhone  = null;
  protected boolean ServicePhoneFetch = false;
  protected boolean ServicePhoneSortAscending = true;
  protected boolean ServicePhoneCaseInsensitive = false;
  protected Integer ServicePhoneSort = null;
  /** raw field for: SERVICE.service_phone2) */
  public    StringFilter[] ServicePhone2  = null;
  protected boolean ServicePhone2Fetch = false;
  protected boolean ServicePhone2SortAscending = true;
  protected boolean ServicePhone2CaseInsensitive = false;
  protected Integer ServicePhone2Sort = null;
  /** raw field for: SERVICE.sales_channel_id) */
  public    IntegerFilter[] SalesChannelId  = null;
  protected boolean SalesChannelIdFetch = false;
  protected boolean SalesChannelIdSortAscending = true;
  protected Integer SalesChannelIdSort = null;
  /** raw field for: SERVICE.sim_serial_number) */
  public    StringFilter[] SimSerialNumber  = null;
  protected boolean SimSerialNumberFetch = false;
  protected boolean SimSerialNumberSortAscending = true;
  protected boolean SimSerialNumberCaseInsensitive = false;
  protected Integer SimSerialNumberSort = null;
  /** raw field for: SERVICE.switch_id) */
  public    StringFilter[] SwitchId  = null;
  protected boolean SwitchIdFetch = false;
  protected boolean SwitchIdSortAscending = true;
  protected boolean SwitchIdCaseInsensitive = false;
  protected Integer SwitchIdSort = null;
  /** raw field for: SERVICE.is_prepaid) */
  public    BooleanFilter[] IsPrepaid  = null;
  protected boolean IsPrepaidFetch = false;
  protected boolean IsPrepaidSortAscending = true;
  protected Integer IsPrepaidSort = null;
  /** raw field for: SERVICE.service_active_dt) */
  public    DateFilter[] ServiceActiveDt  = null;
  protected boolean ServiceActiveDtFetch = false;
  protected boolean ServiceActiveDtSortAscending = true;
  protected Integer ServiceActiveDtSort = null;
  /** raw field for: SERVICE.service_inactive_dt) */
  public    DateFilter[] ServiceInactiveDt  = null;
  protected boolean ServiceInactiveDtFetch = false;
  protected boolean ServiceInactiveDtSortAscending = true;
  protected Integer ServiceInactiveDtSort = null;
  /** raw field for: SERVICE.view_id) */
  public    BigIntegerFilter[] ViewId  = null;
  protected boolean ViewIdFetch = false;
  protected boolean ViewIdSortAscending = true;
  protected Integer ViewIdSort = null;
  private String _objName = "UnbilledUsageServiceObjectFilter";
  /** default constructor */
  public UnbilledUsageServiceObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public UnbilledUsageServiceObjectFilter (UnbilledUsageServiceObjectFilter other)
  {
    super (other);
    if (other == null) return;
    this.ServiceParentAccountExternalId = other.ServiceParentAccountExternalId;
    this.ServiceParentAccountExternalIdFetch = other.ServiceParentAccountExternalIdFetch;
    this.ServiceParentAccountExternalIdSort = other.ServiceParentAccountExternalIdSort;
    this.ServiceParentAccountExternalIdCaseInsensitive = other.ServiceParentAccountExternalIdCaseInsensitive;
    this.ServiceParentAccountExternalIdSortAscending = other.ServiceParentAccountExternalIdSortAscending;
    this.ServiceParentAccountExternalIdType = other.ServiceParentAccountExternalIdType;
    this.ServiceParentAccountExternalIdTypeFetch = other.ServiceParentAccountExternalIdTypeFetch;
    this.ServiceParentAccountExternalIdTypeSort = other.ServiceParentAccountExternalIdTypeSort;
    this.ServiceParentAccountExternalIdTypeSortAscending = other.ServiceParentAccountExternalIdTypeSortAscending;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this.BRevRcvCostCtrFetch = other.BRevRcvCostCtrFetch;
    this.BRevRcvCostCtrSort = other.BRevRcvCostCtrSort;
    this.BRevRcvCostCtrSortAscending = other.BRevRcvCostCtrSortAscending;
    this.BServiceFname = other.BServiceFname;
    this.BServiceFnameFetch = other.BServiceFnameFetch;
    this.BServiceFnameSort = other.BServiceFnameSort;
    this.BServiceFnameCaseInsensitive = other.BServiceFnameCaseInsensitive;
    this.BServiceFnameSortAscending = other.BServiceFnameSortAscending;
    this.BServiceMinit = other.BServiceMinit;
    this.BServiceMinitFetch = other.BServiceMinitFetch;
    this.BServiceMinitSort = other.BServiceMinitSort;
    this.BServiceMinitCaseInsensitive = other.BServiceMinitCaseInsensitive;
    this.BServiceMinitSortAscending = other.BServiceMinitSortAscending;
    this.BServiceLname = other.BServiceLname;
    this.BServiceLnameFetch = other.BServiceLnameFetch;
    this.BServiceLnameSort = other.BServiceLnameSort;
    this.BServiceLnameCaseInsensitive = other.BServiceLnameCaseInsensitive;
    this.BServiceLnameSortAscending = other.BServiceLnameSortAscending;
    this.BServiceCompany = other.BServiceCompany;
    this.BServiceCompanyFetch = other.BServiceCompanyFetch;
    this.BServiceCompanySort = other.BServiceCompanySort;
    this.BServiceCompanyCaseInsensitive = other.BServiceCompanyCaseInsensitive;
    this.BServiceCompanySortAscending = other.BServiceCompanySortAscending;
    this.BServicePhone = other.BServicePhone;
    this.BServicePhoneFetch = other.BServicePhoneFetch;
    this.BServicePhoneSort = other.BServicePhoneSort;
    this.BServicePhoneCaseInsensitive = other.BServicePhoneCaseInsensitive;
    this.BServicePhoneSortAscending = other.BServicePhoneSortAscending;
    this.BServicePhone2 = other.BServicePhone2;
    this.BServicePhone2Fetch = other.BServicePhone2Fetch;
    this.BServicePhone2Sort = other.BServicePhone2Sort;
    this.BServicePhone2CaseInsensitive = other.BServicePhone2CaseInsensitive;
    this.BServicePhone2SortAscending = other.BServicePhone2SortAscending;
    this.ChgDt = other.ChgDt;
    this.ChgDtFetch = other.ChgDtFetch;
    this.ChgDtSort = other.ChgDtSort;
    this.ChgDtSortAscending = other.ChgDtSortAscending;
    this.ChgWho = other.ChgWho;
    this.ChgWhoFetch = other.ChgWhoFetch;
    this.ChgWhoSort = other.ChgWhoSort;
    this.ChgWhoCaseInsensitive = other.ChgWhoCaseInsensitive;
    this.ChgWhoSortAscending = other.ChgWhoSortAscending;
    this.Codeword = other.Codeword;
    this.CodewordFetch = other.CodewordFetch;
    this.CodewordSort = other.CodewordSort;
    this.CodewordCaseInsensitive = other.CodewordCaseInsensitive;
    this.CodewordSortAscending = other.CodewordSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.DisplayExternalIdType = other.DisplayExternalIdType;
    this.DisplayExternalIdTypeFetch = other.DisplayExternalIdTypeFetch;
    this.DisplayExternalIdTypeSort = other.DisplayExternalIdTypeSort;
    this.DisplayExternalIdTypeSortAscending = other.DisplayExternalIdTypeSortAscending;
    this.EligKey1 = other.EligKey1;
    this.EligKey1Fetch = other.EligKey1Fetch;
    this.EligKey1Sort = other.EligKey1Sort;
    this.EligKey1SortAscending = other.EligKey1SortAscending;
    this.EligKey2 = other.EligKey2;
    this.EligKey2Fetch = other.EligKey2Fetch;
    this.EligKey2Sort = other.EligKey2Sort;
    this.EligKey2SortAscending = other.EligKey2SortAscending;
    this.EligKey3 = other.EligKey3;
    this.EligKey3Fetch = other.EligKey3Fetch;
    this.EligKey3Sort = other.EligKey3Sort;
    this.EligKey3SortAscending = other.EligKey3SortAscending;
    this.EmfConfigId = other.EmfConfigId;
    this.EmfConfigIdFetch = other.EmfConfigIdFetch;
    this.EmfConfigIdSort = other.EmfConfigIdSort;
    this.EmfConfigIdSortAscending = other.EmfConfigIdSortAscending;
    this.ExrateClass = other.ExrateClass;
    this.ExrateClassFetch = other.ExrateClassFetch;
    this.ExrateClassSort = other.ExrateClassSort;
    this.ExrateClassSortAscending = other.ExrateClassSortAscending;
    this.IxcProviderId = other.IxcProviderId;
    this.IxcProviderIdFetch = other.IxcProviderIdFetch;
    this.IxcProviderIdSort = other.IxcProviderIdSort;
    this.IxcProviderIdSortAscending = other.IxcProviderIdSortAscending;
    this.LecProviderId = other.LecProviderId;
    this.LecProviderIdFetch = other.LecProviderIdFetch;
    this.LecProviderIdSort = other.LecProviderIdSort;
    this.LecProviderIdSortAscending = other.LecProviderIdSortAscending;
    this.NonpubNonlist = other.NonpubNonlist;
    this.NonpubNonlistFetch = other.NonpubNonlistFetch;
    this.NonpubNonlistSort = other.NonpubNonlistSort;
    this.NonpubNonlistSortAscending = other.NonpubNonlistSortAscending;
    this.PicDateActive = other.PicDateActive;
    this.PicDateActiveFetch = other.PicDateActiveFetch;
    this.PicDateActiveSort = other.PicDateActiveSort;
    this.PicDateActiveSortAscending = other.PicDateActiveSortAscending;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this.ParentAccountInternalIdFetch = other.ParentAccountInternalIdFetch;
    this.ParentAccountInternalIdSort = other.ParentAccountInternalIdSort;
    this.ParentAccountInternalIdSortAscending = other.ParentAccountInternalIdSortAscending;
    this.PopUnits = other.PopUnits;
    this.PopUnitsFetch = other.PopUnitsFetch;
    this.PopUnitsSort = other.PopUnitsSort;
    this.PopUnitsSortAscending = other.PopUnitsSortAscending;
    this.PrivacyLevel = other.PrivacyLevel;
    this.PrivacyLevelFetch = other.PrivacyLevelFetch;
    this.PrivacyLevelSort = other.PrivacyLevelSort;
    this.PrivacyLevelSortAscending = other.PrivacyLevelSortAscending;
    this.RestrictedPic = other.RestrictedPic;
    this.RestrictedPicFetch = other.RestrictedPicFetch;
    this.RestrictedPicSort = other.RestrictedPicSort;
    this.RestrictedPicSortAscending = other.RestrictedPicSortAscending;
    this.ServiceNamePre = other.ServiceNamePre;
    this.ServiceNamePreFetch = other.ServiceNamePreFetch;
    this.ServiceNamePreSort = other.ServiceNamePreSort;
    this.ServiceNamePreCaseInsensitive = other.ServiceNamePreCaseInsensitive;
    this.ServiceNamePreSortAscending = other.ServiceNamePreSortAscending;
    this.ServiceFname = other.ServiceFname;
    this.ServiceFnameFetch = other.ServiceFnameFetch;
    this.ServiceFnameSort = other.ServiceFnameSort;
    this.ServiceFnameCaseInsensitive = other.ServiceFnameCaseInsensitive;
    this.ServiceFnameSortAscending = other.ServiceFnameSortAscending;
    this.ServiceMinit = other.ServiceMinit;
    this.ServiceMinitFetch = other.ServiceMinitFetch;
    this.ServiceMinitSort = other.ServiceMinitSort;
    this.ServiceMinitCaseInsensitive = other.ServiceMinitCaseInsensitive;
    this.ServiceMinitSortAscending = other.ServiceMinitSortAscending;
    this.ServiceLname = other.ServiceLname;
    this.ServiceLnameFetch = other.ServiceLnameFetch;
    this.ServiceLnameSort = other.ServiceLnameSort;
    this.ServiceLnameCaseInsensitive = other.ServiceLnameCaseInsensitive;
    this.ServiceLnameSortAscending = other.ServiceLnameSortAscending;
    this.ServiceNameGeneration = other.ServiceNameGeneration;
    this.ServiceNameGenerationFetch = other.ServiceNameGenerationFetch;
    this.ServiceNameGenerationSort = other.ServiceNameGenerationSort;
    this.ServiceNameGenerationCaseInsensitive = other.ServiceNameGenerationCaseInsensitive;
    this.ServiceNameGenerationSortAscending = other.ServiceNameGenerationSortAscending;
    this.ServiceCompany = other.ServiceCompany;
    this.ServiceCompanyFetch = other.ServiceCompanyFetch;
    this.ServiceCompanySort = other.ServiceCompanySort;
    this.ServiceCompanyCaseInsensitive = other.ServiceCompanyCaseInsensitive;
    this.ServiceCompanySortAscending = other.ServiceCompanySortAscending;
    this.ServicePhone = other.ServicePhone;
    this.ServicePhoneFetch = other.ServicePhoneFetch;
    this.ServicePhoneSort = other.ServicePhoneSort;
    this.ServicePhoneCaseInsensitive = other.ServicePhoneCaseInsensitive;
    this.ServicePhoneSortAscending = other.ServicePhoneSortAscending;
    this.ServicePhone2 = other.ServicePhone2;
    this.ServicePhone2Fetch = other.ServicePhone2Fetch;
    this.ServicePhone2Sort = other.ServicePhone2Sort;
    this.ServicePhone2CaseInsensitive = other.ServicePhone2CaseInsensitive;
    this.ServicePhone2SortAscending = other.ServicePhone2SortAscending;
    this.SalesChannelId = other.SalesChannelId;
    this.SalesChannelIdFetch = other.SalesChannelIdFetch;
    this.SalesChannelIdSort = other.SalesChannelIdSort;
    this.SalesChannelIdSortAscending = other.SalesChannelIdSortAscending;
    this.SimSerialNumber = other.SimSerialNumber;
    this.SimSerialNumberFetch = other.SimSerialNumberFetch;
    this.SimSerialNumberSort = other.SimSerialNumberSort;
    this.SimSerialNumberCaseInsensitive = other.SimSerialNumberCaseInsensitive;
    this.SimSerialNumberSortAscending = other.SimSerialNumberSortAscending;
    this.SwitchId = other.SwitchId;
    this.SwitchIdFetch = other.SwitchIdFetch;
    this.SwitchIdSort = other.SwitchIdSort;
    this.SwitchIdCaseInsensitive = other.SwitchIdCaseInsensitive;
    this.SwitchIdSortAscending = other.SwitchIdSortAscending;
    this.IsPrepaid = other.IsPrepaid;
    this.IsPrepaidFetch = other.IsPrepaidFetch;
    this.IsPrepaidSort = other.IsPrepaidSort;
    this.IsPrepaidSortAscending = other.IsPrepaidSortAscending;
    this.ServiceActiveDt = other.ServiceActiveDt;
    this.ServiceActiveDtFetch = other.ServiceActiveDtFetch;
    this.ServiceActiveDtSort = other.ServiceActiveDtSort;
    this.ServiceActiveDtSortAscending = other.ServiceActiveDtSortAscending;
    this.ServiceInactiveDt = other.ServiceInactiveDt;
    this.ServiceInactiveDtFetch = other.ServiceInactiveDtFetch;
    this.ServiceInactiveDtSort = other.ServiceInactiveDtSort;
    this.ServiceInactiveDtSortAscending = other.ServiceInactiveDtSortAscending;
    this.ViewId = other.ViewId;
    this.ViewIdFetch = other.ViewIdFetch;
    this.ViewIdSort = other.ViewIdSort;
    this.ViewIdSortAscending = other.ViewIdSortAscending;  }
  /** Set the field level Fetch value for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceParentAccountExternalIdFetch (boolean fetch) {
    this.ServiceParentAccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceParentAccountExternalIdFetch () {
    return this.ServiceParentAccountExternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceParentAccountExternalIdSortOrder (Integer value) {
    this.ServiceParentAccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceParentAccountExternalIdSortOrder () {
    return this.ServiceParentAccountExternalIdSort;
  }
  /** Set the sort direction for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceParentAccountExternalIdSortDirection (boolean ascending) {
    this.ServiceParentAccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceParentAccountExternalIdSortDirection () {
    return this.ServiceParentAccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceParentAccountExternalIdCaseInsensitive (boolean ascending) {
    this.ServiceParentAccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceParentAccountExternalIdCaseInsensitive () {
    return this.ServiceParentAccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceParentAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.ServiceParentAccountExternalId = value;
  }
  /** Retrieve filter for field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceParentAccountExternalIdFilter () {
    return this.ServiceParentAccountExternalId;
  }

  /**
   * Retrieves the ServiceParentAccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceParentAccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceParentAccountExternalIdFilter field
   */
  public String[] getServiceParentAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceParentAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceParentAccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the ServiceParentAccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceParentAccountExternalIdFilter filter field
   */
  public void setServiceParentAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceParentAccountExternalIdFilterFromFormattedString");
    try {
      this.setServiceParentAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceParentAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceParentAccountExternalIdTypeFetch (boolean fetch) {
    this.ServiceParentAccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceParentAccountExternalIdTypeFetch () {
    return this.ServiceParentAccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceParentAccountExternalIdTypeSortOrder (Integer value) {
    this.ServiceParentAccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceParentAccountExternalIdTypeSortOrder () {
    return this.ServiceParentAccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceParentAccountExternalIdTypeSortDirection (boolean ascending) {
    this.ServiceParentAccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceParentAccountExternalIdTypeSortDirection () {
    return this.ServiceParentAccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceParentAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceParentAccountExternalIdType = value;
  }
  /** Retrieve filter for field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceParentAccountExternalIdTypeFilter () {
    return this.ServiceParentAccountExternalIdType;
  }

  /**
   * Retrieves the ServiceParentAccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceParentAccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceParentAccountExternalIdTypeFilter field
   */
  public String[] getServiceParentAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceParentAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceParentAccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the ServiceParentAccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceParentAccountExternalIdTypeFilter filter field
   */
  public void setServiceParentAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setServiceParentAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ServiceParentAccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceParentAccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceParentAccountExternalIdTypeFilter filter field
   */
  public String[] getServiceParentAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getServiceParentAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ServiceParentAccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceParentAccountExternalIdTypeFilter filter field
   */
  public void setServiceParentAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setServiceParentAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ServiceParentAccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceParentAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setBRevRcvCostCtrFetch (boolean fetch) {
    this.BRevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getBRevRcvCostCtrFetch () {
    return this.BRevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBRevRcvCostCtrSortOrder (Integer value) {
    this.BRevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBRevRcvCostCtrSortOrder () {
    return this.BRevRcvCostCtrSort;
  }
  /** Set the sort direction for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBRevRcvCostCtrSortDirection (boolean ascending) {
    this.BRevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBRevRcvCostCtrSortDirection () {
    return this.BRevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.BRevRcvCostCtr = value;
  }
  /** Retrieve filter for field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBRevRcvCostCtrFilter () {
    return this.BRevRcvCostCtr;
  }

  /**
   * Retrieves the BRevRcvCostCtrFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BRevRcvCostCtrFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BRevRcvCostCtrFilter field
   */
  public String[] getBRevRcvCostCtrFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBRevRcvCostCtrFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BRevRcvCostCtrFilter filter value from a formatted string
   *
   * @param _value the BRevRcvCostCtrFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BRevRcvCostCtrFilter filter field
   */
  public void setBRevRcvCostCtrFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
    try {
      this.setBRevRcvCostCtrFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BRevRcvCostCtrFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBRevRcvCostCtrFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServiceFname (SERVICE.b_service_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setBServiceFnameFetch (boolean fetch) {
    this.BServiceFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BServiceFname (SERVICE.b_service_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServiceFnameFetch () {
    return this.BServiceFnameFetch;
  }
  /** Set the SortOrder for field: BServiceFname (SERVICE.b_service_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServiceFnameSortOrder (Integer value) {
    this.BServiceFnameSort = value;
  }
  /** Retrieve SortOrder for field: BServiceFname (SERVICE.b_service_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServiceFnameSortOrder () {
    return this.BServiceFnameSort;
  }
  /** Set the sort direction for field: BServiceFname (SERVICE.b_service_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServiceFnameSortDirection (boolean ascending) {
    this.BServiceFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServiceFname (SERVICE.b_service_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServiceFnameSortDirection () {
    return this.BServiceFnameSortAscending;
  }
  /** Set the case insensitive for field: BServiceFname (SERVICE.b_service_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServiceFnameCaseInsensitive (boolean ascending) {
    this.BServiceFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServiceFname (SERVICE.b_service_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServiceFnameCaseInsensitive () {
    return this.BServiceFnameCaseInsensitive;
  }
  /** Set the field level filters for field: BServiceFname (SERVICE.b_service_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServiceFnameFilter (StringFilter[] value) throws ServiceException {
    this.BServiceFname = value;
  }
  /** Retrieve filter for field: BServiceFname (SERVICE.b_service_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServiceFnameFilter () {
    return this.BServiceFname;
  }

  /**
   * Retrieves the BServiceFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServiceFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceFnameFilter field
   */
  public String[] getBServiceFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServiceFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServiceFnameFilter filter value from a formatted string
   *
   * @param _value the BServiceFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServiceFnameFilter filter field
   */
  public void setBServiceFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServiceFnameFilterFromFormattedString");
    try {
      this.setBServiceFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServiceMinit (SERVICE.b_service_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setBServiceMinitFetch (boolean fetch) {
    this.BServiceMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: BServiceMinit (SERVICE.b_service_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServiceMinitFetch () {
    return this.BServiceMinitFetch;
  }
  /** Set the SortOrder for field: BServiceMinit (SERVICE.b_service_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServiceMinitSortOrder (Integer value) {
    this.BServiceMinitSort = value;
  }
  /** Retrieve SortOrder for field: BServiceMinit (SERVICE.b_service_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServiceMinitSortOrder () {
    return this.BServiceMinitSort;
  }
  /** Set the sort direction for field: BServiceMinit (SERVICE.b_service_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServiceMinitSortDirection (boolean ascending) {
    this.BServiceMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServiceMinit (SERVICE.b_service_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServiceMinitSortDirection () {
    return this.BServiceMinitSortAscending;
  }
  /** Set the case insensitive for field: BServiceMinit (SERVICE.b_service_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServiceMinitCaseInsensitive (boolean ascending) {
    this.BServiceMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServiceMinit (SERVICE.b_service_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServiceMinitCaseInsensitive () {
    return this.BServiceMinitCaseInsensitive;
  }
  /** Set the field level filters for field: BServiceMinit (SERVICE.b_service_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServiceMinitFilter (StringFilter[] value) throws ServiceException {
    this.BServiceMinit = value;
  }
  /** Retrieve filter for field: BServiceMinit (SERVICE.b_service_minit)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServiceMinitFilter () {
    return this.BServiceMinit;
  }

  /**
   * Retrieves the BServiceMinitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServiceMinitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceMinitFilter field
   */
  public String[] getBServiceMinitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceMinitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServiceMinitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceMinitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceMinitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServiceMinitFilter filter value from a formatted string
   *
   * @param _value the BServiceMinitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServiceMinitFilter filter field
   */
  public void setBServiceMinitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServiceMinitFilterFromFormattedString");
    try {
      this.setBServiceMinitFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceMinitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceMinitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServiceLname (SERVICE.b_service_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setBServiceLnameFetch (boolean fetch) {
    this.BServiceLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: BServiceLname (SERVICE.b_service_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServiceLnameFetch () {
    return this.BServiceLnameFetch;
  }
  /** Set the SortOrder for field: BServiceLname (SERVICE.b_service_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServiceLnameSortOrder (Integer value) {
    this.BServiceLnameSort = value;
  }
  /** Retrieve SortOrder for field: BServiceLname (SERVICE.b_service_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServiceLnameSortOrder () {
    return this.BServiceLnameSort;
  }
  /** Set the sort direction for field: BServiceLname (SERVICE.b_service_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServiceLnameSortDirection (boolean ascending) {
    this.BServiceLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServiceLname (SERVICE.b_service_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServiceLnameSortDirection () {
    return this.BServiceLnameSortAscending;
  }
  /** Set the case insensitive for field: BServiceLname (SERVICE.b_service_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServiceLnameCaseInsensitive (boolean ascending) {
    this.BServiceLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServiceLname (SERVICE.b_service_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServiceLnameCaseInsensitive () {
    return this.BServiceLnameCaseInsensitive;
  }
  /** Set the field level filters for field: BServiceLname (SERVICE.b_service_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServiceLnameFilter (StringFilter[] value) throws ServiceException {
    this.BServiceLname = value;
  }
  /** Retrieve filter for field: BServiceLname (SERVICE.b_service_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServiceLnameFilter () {
    return this.BServiceLname;
  }

  /**
   * Retrieves the BServiceLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServiceLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceLnameFilter field
   */
  public String[] getBServiceLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServiceLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServiceLnameFilter filter value from a formatted string
   *
   * @param _value the BServiceLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServiceLnameFilter filter field
   */
  public void setBServiceLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServiceLnameFilterFromFormattedString");
    try {
      this.setBServiceLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServiceCompany (SERVICE.b_service_company)
   * @param fetch whether to fetch this field or not
   */
  public void setBServiceCompanyFetch (boolean fetch) {
    this.BServiceCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: BServiceCompany (SERVICE.b_service_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServiceCompanyFetch () {
    return this.BServiceCompanyFetch;
  }
  /** Set the SortOrder for field: BServiceCompany (SERVICE.b_service_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServiceCompanySortOrder (Integer value) {
    this.BServiceCompanySort = value;
  }
  /** Retrieve SortOrder for field: BServiceCompany (SERVICE.b_service_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServiceCompanySortOrder () {
    return this.BServiceCompanySort;
  }
  /** Set the sort direction for field: BServiceCompany (SERVICE.b_service_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServiceCompanySortDirection (boolean ascending) {
    this.BServiceCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServiceCompany (SERVICE.b_service_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServiceCompanySortDirection () {
    return this.BServiceCompanySortAscending;
  }
  /** Set the case insensitive for field: BServiceCompany (SERVICE.b_service_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServiceCompanyCaseInsensitive (boolean ascending) {
    this.BServiceCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServiceCompany (SERVICE.b_service_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServiceCompanyCaseInsensitive () {
    return this.BServiceCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: BServiceCompany (SERVICE.b_service_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServiceCompanyFilter (StringFilter[] value) throws ServiceException {
    this.BServiceCompany = value;
  }
  /** Retrieve filter for field: BServiceCompany (SERVICE.b_service_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServiceCompanyFilter () {
    return this.BServiceCompany;
  }

  /**
   * Retrieves the BServiceCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServiceCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceCompanyFilter field
   */
  public String[] getBServiceCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServiceCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServiceCompanyFilter filter value from a formatted string
   *
   * @param _value the BServiceCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServiceCompanyFilter filter field
   */
  public void setBServiceCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServiceCompanyFilterFromFormattedString");
    try {
      this.setBServiceCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServiceCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServicePhone (SERVICE.b_service_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setBServicePhoneFetch (boolean fetch) {
    this.BServicePhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: BServicePhone (SERVICE.b_service_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServicePhoneFetch () {
    return this.BServicePhoneFetch;
  }
  /** Set the SortOrder for field: BServicePhone (SERVICE.b_service_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServicePhoneSortOrder (Integer value) {
    this.BServicePhoneSort = value;
  }
  /** Retrieve SortOrder for field: BServicePhone (SERVICE.b_service_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServicePhoneSortOrder () {
    return this.BServicePhoneSort;
  }
  /** Set the sort direction for field: BServicePhone (SERVICE.b_service_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServicePhoneSortDirection (boolean ascending) {
    this.BServicePhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServicePhone (SERVICE.b_service_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServicePhoneSortDirection () {
    return this.BServicePhoneSortAscending;
  }
  /** Set the case insensitive for field: BServicePhone (SERVICE.b_service_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServicePhoneCaseInsensitive (boolean ascending) {
    this.BServicePhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServicePhone (SERVICE.b_service_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServicePhoneCaseInsensitive () {
    return this.BServicePhoneCaseInsensitive;
  }
  /** Set the field level filters for field: BServicePhone (SERVICE.b_service_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServicePhoneFilter (StringFilter[] value) throws ServiceException {
    this.BServicePhone = value;
  }
  /** Retrieve filter for field: BServicePhone (SERVICE.b_service_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServicePhoneFilter () {
    return this.BServicePhone;
  }

  /**
   * Retrieves the BServicePhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServicePhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServicePhoneFilter field
   */
  public String[] getBServicePhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServicePhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServicePhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServicePhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServicePhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServicePhoneFilter filter value from a formatted string
   *
   * @param _value the BServicePhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServicePhoneFilter filter field
   */
  public void setBServicePhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServicePhoneFilterFromFormattedString");
    try {
      this.setBServicePhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServicePhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServicePhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServicePhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @param fetch whether to fetch this field or not
   */
  public void setBServicePhone2Fetch (boolean fetch) {
    this.BServicePhone2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return boolean the Fetch value for this field
   */
  public boolean getBServicePhone2Fetch () {
    return this.BServicePhone2Fetch;
  }
  /** Set the SortOrder for field: BServicePhone2 (SERVICE.b_service_phone2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBServicePhone2SortOrder (Integer value) {
    this.BServicePhone2Sort = value;
  }
  /** Retrieve SortOrder for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBServicePhone2SortOrder () {
    return this.BServicePhone2Sort;
  }
  /** Set the sort direction for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBServicePhone2SortDirection (boolean ascending) {
    this.BServicePhone2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBServicePhone2SortDirection () {
    return this.BServicePhone2SortAscending;
  }
  /** Set the case insensitive for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBServicePhone2CaseInsensitive (boolean ascending) {
    this.BServicePhone2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBServicePhone2CaseInsensitive () {
    return this.BServicePhone2CaseInsensitive;
  }
  /** Set the field level filters for field: BServicePhone2 (SERVICE.b_service_phone2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBServicePhone2Filter (StringFilter[] value) throws ServiceException {
    this.BServicePhone2 = value;
  }
  /** Retrieve filter for field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBServicePhone2Filter () {
    return this.BServicePhone2;
  }

  /**
   * Retrieves the BServicePhone2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BServicePhone2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServicePhone2Filter field
   */
  public String[] getBServicePhone2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhone2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBServicePhone2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServicePhone2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServicePhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServicePhone2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BServicePhone2Filter filter value from a formatted string
   *
   * @param _value the BServicePhone2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BServicePhone2Filter filter field
   */
  public void setBServicePhone2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBServicePhone2FilterFromFormattedString");
    try {
      this.setBServicePhone2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BServicePhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServicePhone2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServicePhone2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDt (SERVICE.chg_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDtFetch (boolean fetch) {
    this.ChgDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDt (SERVICE.chg_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDtFetch () {
    return this.ChgDtFetch;
  }
  /** Set the SortOrder for field: ChgDt (SERVICE.chg_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDtSortOrder (Integer value) {
    this.ChgDtSort = value;
  }
  /** Retrieve SortOrder for field: ChgDt (SERVICE.chg_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDtSortOrder () {
    return this.ChgDtSort;
  }
  /** Set the sort direction for field: ChgDt (SERVICE.chg_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDtSortDirection (boolean ascending) {
    this.ChgDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDt (SERVICE.chg_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDtSortDirection () {
    return this.ChgDtSortAscending;
  }
  /** Set the field level filters for field: ChgDt (SERVICE.chg_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDtFilter (DateFilter[] value) throws ServiceException {
    this.ChgDt = value;
  }
  /** Retrieve filter for field: ChgDt (SERVICE.chg_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDtFilter () {
    return this.ChgDt;
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDtFilter field
   */
  public String[] getChgDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDtFilter filter value from a formatted string
   *
   * @param _value the ChgDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDtFilter filter field
   */
  public void setChgDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
    try {
      this.setChgDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ChgWho (SERVICE.chg_who)
   * @param fetch whether to fetch this field or not
   */
  public void setChgWhoFetch (boolean fetch) {
    this.ChgWhoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgWho (SERVICE.chg_who)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgWhoFetch () {
    return this.ChgWhoFetch;
  }
  /** Set the SortOrder for field: ChgWho (SERVICE.chg_who)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgWhoSortOrder (Integer value) {
    this.ChgWhoSort = value;
  }
  /** Retrieve SortOrder for field: ChgWho (SERVICE.chg_who)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgWhoSortOrder () {
    return this.ChgWhoSort;
  }
  /** Set the sort direction for field: ChgWho (SERVICE.chg_who)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgWhoSortDirection (boolean ascending) {
    this.ChgWhoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgWho (SERVICE.chg_who)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgWhoSortDirection () {
    return this.ChgWhoSortAscending;
  }
  /** Set the case insensitive for field: ChgWho (SERVICE.chg_who)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setChgWhoCaseInsensitive (boolean ascending) {
    this.ChgWhoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ChgWho (SERVICE.chg_who)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getChgWhoCaseInsensitive () {
    return this.ChgWhoCaseInsensitive;
  }
  /** Set the field level filters for field: ChgWho (SERVICE.chg_who)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgWhoFilter (StringFilter[] value) throws ServiceException {
    this.ChgWho = value;
  }
  /** Retrieve filter for field: ChgWho (SERVICE.chg_who)
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

  /** Set the field level Fetch value for field: Codeword (SERVICE.codeword)
   * @param fetch whether to fetch this field or not
   */
  public void setCodewordFetch (boolean fetch) {
    this.CodewordFetch = fetch;
  }
  /** Retrieve Fetch value for field: Codeword (SERVICE.codeword)
   * @return boolean the Fetch value for this field
   */
  public boolean getCodewordFetch () {
    return this.CodewordFetch;
  }
  /** Set the SortOrder for field: Codeword (SERVICE.codeword)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCodewordSortOrder (Integer value) {
    this.CodewordSort = value;
  }
  /** Retrieve SortOrder for field: Codeword (SERVICE.codeword)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCodewordSortOrder () {
    return this.CodewordSort;
  }
  /** Set the sort direction for field: Codeword (SERVICE.codeword)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCodewordSortDirection (boolean ascending) {
    this.CodewordSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Codeword (SERVICE.codeword)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCodewordSortDirection () {
    return this.CodewordSortAscending;
  }
  /** Set the case insensitive for field: Codeword (SERVICE.codeword)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setCodewordCaseInsensitive (boolean ascending) {
    this.CodewordCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Codeword (SERVICE.codeword)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getCodewordCaseInsensitive () {
    return this.CodewordCaseInsensitive;
  }
  /** Set the field level filters for field: Codeword (SERVICE.codeword)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCodewordFilter (StringFilter[] value) throws ServiceException {
    this.Codeword = value;
  }
  /** Retrieve filter for field: Codeword (SERVICE.codeword)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getCodewordFilter () {
    return this.Codeword;
  }

  /**
   * Retrieves the CodewordFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CodewordFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CodewordFilter field
   */
  public String[] getCodewordFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCodewordFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CodewordFilter filter value from a formatted string
   *
   * @param _value the CodewordFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CodewordFilter filter field
   */
  public void setCodewordFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCodewordFilterFromFormattedString");
    try {
      this.setCodewordFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CodewordFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CurrencyCode (SERVICE.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (SERVICE.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (SERVICE.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (SERVICE.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (SERVICE.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (SERVICE.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (SERVICE.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (SERVICE.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setDisplayExternalIdTypeFetch (boolean fetch) {
    this.DisplayExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getDisplayExternalIdTypeFetch () {
    return this.DisplayExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDisplayExternalIdTypeSortOrder (Integer value) {
    this.DisplayExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDisplayExternalIdTypeSortOrder () {
    return this.DisplayExternalIdTypeSort;
  }
  /** Set the sort direction for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDisplayExternalIdTypeSortDirection (boolean ascending) {
    this.DisplayExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDisplayExternalIdTypeSortDirection () {
    return this.DisplayExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDisplayExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.DisplayExternalIdType = value;
  }
  /** Retrieve filter for field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDisplayExternalIdTypeFilter () {
    return this.DisplayExternalIdType;
  }

  /**
   * Retrieves the DisplayExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DisplayExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayExternalIdTypeFilter field
   */
  public String[] getDisplayExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDisplayExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DisplayExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the DisplayExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DisplayExternalIdTypeFilter filter field
   */
  public void setDisplayExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDisplayExternalIdTypeFilterFromFormattedString");
    try {
      this.setDisplayExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DisplayExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayExternalIdTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EligKey1 (SERVICE.elig_key1)
   * @param fetch whether to fetch this field or not
   */
  public void setEligKey1Fetch (boolean fetch) {
    this.EligKey1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EligKey1 (SERVICE.elig_key1)
   * @return boolean the Fetch value for this field
   */
  public boolean getEligKey1Fetch () {
    return this.EligKey1Fetch;
  }
  /** Set the SortOrder for field: EligKey1 (SERVICE.elig_key1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEligKey1SortOrder (Integer value) {
    this.EligKey1Sort = value;
  }
  /** Retrieve SortOrder for field: EligKey1 (SERVICE.elig_key1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEligKey1SortOrder () {
    return this.EligKey1Sort;
  }
  /** Set the sort direction for field: EligKey1 (SERVICE.elig_key1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEligKey1SortDirection (boolean ascending) {
    this.EligKey1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EligKey1 (SERVICE.elig_key1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEligKey1SortDirection () {
    return this.EligKey1SortAscending;
  }
  /** Set the field level filters for field: EligKey1 (SERVICE.elig_key1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEligKey1Filter (IntegerFilter[] value) throws ServiceException {
    this.EligKey1 = value;
  }
  /** Retrieve filter for field: EligKey1 (SERVICE.elig_key1)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEligKey1Filter () {
    return this.EligKey1;
  }

  /**
   * Retrieves the EligKey1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EligKey1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey1Filter field
   */
  public String[] getEligKey1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEligKey1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EligKey1Filter filter value from a formatted string
   *
   * @param _value the EligKey1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EligKey1Filter filter field
   */
  public void setEligKey1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEligKey1FilterFromFormattedString");
    try {
      this.setEligKey1Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey1FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EligKey2 (SERVICE.elig_key2)
   * @param fetch whether to fetch this field or not
   */
  public void setEligKey2Fetch (boolean fetch) {
    this.EligKey2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EligKey2 (SERVICE.elig_key2)
   * @return boolean the Fetch value for this field
   */
  public boolean getEligKey2Fetch () {
    return this.EligKey2Fetch;
  }
  /** Set the SortOrder for field: EligKey2 (SERVICE.elig_key2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEligKey2SortOrder (Integer value) {
    this.EligKey2Sort = value;
  }
  /** Retrieve SortOrder for field: EligKey2 (SERVICE.elig_key2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEligKey2SortOrder () {
    return this.EligKey2Sort;
  }
  /** Set the sort direction for field: EligKey2 (SERVICE.elig_key2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEligKey2SortDirection (boolean ascending) {
    this.EligKey2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EligKey2 (SERVICE.elig_key2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEligKey2SortDirection () {
    return this.EligKey2SortAscending;
  }
  /** Set the field level filters for field: EligKey2 (SERVICE.elig_key2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEligKey2Filter (IntegerFilter[] value) throws ServiceException {
    this.EligKey2 = value;
  }
  /** Retrieve filter for field: EligKey2 (SERVICE.elig_key2)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEligKey2Filter () {
    return this.EligKey2;
  }

  /**
   * Retrieves the EligKey2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EligKey2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey2Filter field
   */
  public String[] getEligKey2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEligKey2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EligKey2Filter filter value from a formatted string
   *
   * @param _value the EligKey2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EligKey2Filter filter field
   */
  public void setEligKey2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEligKey2FilterFromFormattedString");
    try {
      this.setEligKey2Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EligKey3 (SERVICE.elig_key3)
   * @param fetch whether to fetch this field or not
   */
  public void setEligKey3Fetch (boolean fetch) {
    this.EligKey3Fetch = fetch;
  }
  /** Retrieve Fetch value for field: EligKey3 (SERVICE.elig_key3)
   * @return boolean the Fetch value for this field
   */
  public boolean getEligKey3Fetch () {
    return this.EligKey3Fetch;
  }
  /** Set the SortOrder for field: EligKey3 (SERVICE.elig_key3)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEligKey3SortOrder (Integer value) {
    this.EligKey3Sort = value;
  }
  /** Retrieve SortOrder for field: EligKey3 (SERVICE.elig_key3)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEligKey3SortOrder () {
    return this.EligKey3Sort;
  }
  /** Set the sort direction for field: EligKey3 (SERVICE.elig_key3)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEligKey3SortDirection (boolean ascending) {
    this.EligKey3SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EligKey3 (SERVICE.elig_key3)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEligKey3SortDirection () {
    return this.EligKey3SortAscending;
  }
  /** Set the field level filters for field: EligKey3 (SERVICE.elig_key3)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEligKey3Filter (IntegerFilter[] value) throws ServiceException {
    this.EligKey3 = value;
  }
  /** Retrieve filter for field: EligKey3 (SERVICE.elig_key3)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEligKey3Filter () {
    return this.EligKey3;
  }

  /**
   * Retrieves the EligKey3Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EligKey3Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey3Filter field
   */
  public String[] getEligKey3FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey3FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEligKey3Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey3FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey3FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EligKey3Filter filter value from a formatted string
   *
   * @param _value the EligKey3Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EligKey3Filter filter field
   */
  public void setEligKey3FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEligKey3FilterFromFormattedString");
    try {
      this.setEligKey3Filter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EligKey3Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey3FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey3FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: EmfConfigId (SERVICE.emf_config_id)
   * @param fetch whether to fetch this field or not
   */
  public void setEmfConfigIdFetch (boolean fetch) {
    this.EmfConfigIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: EmfConfigId (SERVICE.emf_config_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getEmfConfigIdFetch () {
    return this.EmfConfigIdFetch;
  }
  /** Set the SortOrder for field: EmfConfigId (SERVICE.emf_config_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEmfConfigIdSortOrder (Integer value) {
    this.EmfConfigIdSort = value;
  }
  /** Retrieve SortOrder for field: EmfConfigId (SERVICE.emf_config_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEmfConfigIdSortOrder () {
    return this.EmfConfigIdSort;
  }
  /** Set the sort direction for field: EmfConfigId (SERVICE.emf_config_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEmfConfigIdSortDirection (boolean ascending) {
    this.EmfConfigIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EmfConfigId (SERVICE.emf_config_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEmfConfigIdSortDirection () {
    return this.EmfConfigIdSortAscending;
  }
  /** Set the field level filters for field: EmfConfigId (SERVICE.emf_config_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEmfConfigIdFilter (IntegerFilter[] value) throws ServiceException {
    this.EmfConfigId = value;
  }
  /** Retrieve filter for field: EmfConfigId (SERVICE.emf_config_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEmfConfigIdFilter () {
    return this.EmfConfigId;
  }

  /**
   * Retrieves the EmfConfigIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EmfConfigIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigIdFilter field
   */
  public String[] getEmfConfigIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEmfConfigIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EmfConfigIdFilter filter value from a formatted string
   *
   * @param _value the EmfConfigIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EmfConfigIdFilter filter field
   */
  public void setEmfConfigIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
    try {
      this.setEmfConfigIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EmfConfigIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExrateClass (SERVICE.exrate_class)
   * @param fetch whether to fetch this field or not
   */
  public void setExrateClassFetch (boolean fetch) {
    this.ExrateClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExrateClass (SERVICE.exrate_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getExrateClassFetch () {
    return this.ExrateClassFetch;
  }
  /** Set the SortOrder for field: ExrateClass (SERVICE.exrate_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExrateClassSortOrder (Integer value) {
    this.ExrateClassSort = value;
  }
  /** Retrieve SortOrder for field: ExrateClass (SERVICE.exrate_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExrateClassSortOrder () {
    return this.ExrateClassSort;
  }
  /** Set the sort direction for field: ExrateClass (SERVICE.exrate_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExrateClassSortDirection (boolean ascending) {
    this.ExrateClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExrateClass (SERVICE.exrate_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExrateClassSortDirection () {
    return this.ExrateClassSortAscending;
  }
  /** Set the field level filters for field: ExrateClass (SERVICE.exrate_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExrateClassFilter (IntegerFilter[] value) throws ServiceException {
    this.ExrateClass = value;
  }
  /** Retrieve filter for field: ExrateClass (SERVICE.exrate_class)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExrateClassFilter () {
    return this.ExrateClass;
  }

  /**
   * Retrieves the ExrateClassFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExrateClassFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExrateClassFilter field
   */
  public String[] getExrateClassFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExrateClassFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExrateClassFilter filter value from a formatted string
   *
   * @param _value the ExrateClassFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExrateClassFilter filter field
   */
  public void setExrateClassFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExrateClassFilterFromFormattedString");
    try {
      this.setExrateClassFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExrateClassFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExrateClassFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setIxcProviderIdFetch (boolean fetch) {
    this.IxcProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getIxcProviderIdFetch () {
    return this.IxcProviderIdFetch;
  }
  /** Set the SortOrder for field: IxcProviderId (SERVICE.ixc_provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIxcProviderIdSortOrder (Integer value) {
    this.IxcProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIxcProviderIdSortOrder () {
    return this.IxcProviderIdSort;
  }
  /** Set the sort direction for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIxcProviderIdSortDirection (boolean ascending) {
    this.IxcProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIxcProviderIdSortDirection () {
    return this.IxcProviderIdSortAscending;
  }
  /** Set the field level filters for field: IxcProviderId (SERVICE.ixc_provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIxcProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.IxcProviderId = value;
  }
  /** Retrieve filter for field: IxcProviderId (SERVICE.ixc_provider_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIxcProviderIdFilter () {
    return this.IxcProviderId;
  }

  /**
   * Retrieves the IxcProviderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IxcProviderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IxcProviderIdFilter field
   */
  public String[] getIxcProviderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIxcProviderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIxcProviderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIxcProviderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IxcProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIxcProviderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IxcProviderIdFilter filter value from a formatted string
   *
   * @param _value the IxcProviderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IxcProviderIdFilter filter field
   */
  public void setIxcProviderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIxcProviderIdFilterFromFormattedString");
    try {
      this.setIxcProviderIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IxcProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIxcProviderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIxcProviderIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: LecProviderId (SERVICE.lec_provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLecProviderIdFetch (boolean fetch) {
    this.LecProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LecProviderId (SERVICE.lec_provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLecProviderIdFetch () {
    return this.LecProviderIdFetch;
  }
  /** Set the SortOrder for field: LecProviderId (SERVICE.lec_provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLecProviderIdSortOrder (Integer value) {
    this.LecProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: LecProviderId (SERVICE.lec_provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLecProviderIdSortOrder () {
    return this.LecProviderIdSort;
  }
  /** Set the sort direction for field: LecProviderId (SERVICE.lec_provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLecProviderIdSortDirection (boolean ascending) {
    this.LecProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LecProviderId (SERVICE.lec_provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLecProviderIdSortDirection () {
    return this.LecProviderIdSortAscending;
  }
  /** Set the field level filters for field: LecProviderId (SERVICE.lec_provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLecProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.LecProviderId = value;
  }
  /** Retrieve filter for field: LecProviderId (SERVICE.lec_provider_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLecProviderIdFilter () {
    return this.LecProviderId;
  }

  /**
   * Retrieves the LecProviderIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LecProviderIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LecProviderIdFilter field
   */
  public String[] getLecProviderIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLecProviderIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLecProviderIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLecProviderIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LecProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLecProviderIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LecProviderIdFilter filter value from a formatted string
   *
   * @param _value the LecProviderIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LecProviderIdFilter filter field
   */
  public void setLecProviderIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLecProviderIdFilterFromFormattedString");
    try {
      this.setLecProviderIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LecProviderIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLecProviderIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLecProviderIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @param fetch whether to fetch this field or not
   */
  public void setNonpubNonlistFetch (boolean fetch) {
    this.NonpubNonlistFetch = fetch;
  }
  /** Retrieve Fetch value for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return boolean the Fetch value for this field
   */
  public boolean getNonpubNonlistFetch () {
    return this.NonpubNonlistFetch;
  }
  /** Set the SortOrder for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNonpubNonlistSortOrder (Integer value) {
    this.NonpubNonlistSort = value;
  }
  /** Retrieve SortOrder for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNonpubNonlistSortOrder () {
    return this.NonpubNonlistSort;
  }
  /** Set the sort direction for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNonpubNonlistSortDirection (boolean ascending) {
    this.NonpubNonlistSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNonpubNonlistSortDirection () {
    return this.NonpubNonlistSortAscending;
  }
  /** Set the field level filters for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNonpubNonlistFilter (IntegerFilter[] value) throws ServiceException {
    this.NonpubNonlist = value;
  }
  /** Retrieve filter for field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getNonpubNonlistFilter () {
    return this.NonpubNonlist;
  }

  /**
   * Retrieves the NonpubNonlistFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NonpubNonlistFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NonpubNonlistFilter field
   */
  public String[] getNonpubNonlistFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonpubNonlistFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNonpubNonlistFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNonpubNonlistFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NonpubNonlistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNonpubNonlistFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NonpubNonlistFilter filter value from a formatted string
   *
   * @param _value the NonpubNonlistFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NonpubNonlistFilter filter field
   */
  public void setNonpubNonlistFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNonpubNonlistFilterFromFormattedString");
    try {
      this.setNonpubNonlistFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NonpubNonlistFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNonpubNonlistFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNonpubNonlistFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PicDateActive (SERVICE.pic_date_active)
   * @param fetch whether to fetch this field or not
   */
  public void setPicDateActiveFetch (boolean fetch) {
    this.PicDateActiveFetch = fetch;
  }
  /** Retrieve Fetch value for field: PicDateActive (SERVICE.pic_date_active)
   * @return boolean the Fetch value for this field
   */
  public boolean getPicDateActiveFetch () {
    return this.PicDateActiveFetch;
  }
  /** Set the SortOrder for field: PicDateActive (SERVICE.pic_date_active)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPicDateActiveSortOrder (Integer value) {
    this.PicDateActiveSort = value;
  }
  /** Retrieve SortOrder for field: PicDateActive (SERVICE.pic_date_active)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPicDateActiveSortOrder () {
    return this.PicDateActiveSort;
  }
  /** Set the sort direction for field: PicDateActive (SERVICE.pic_date_active)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPicDateActiveSortDirection (boolean ascending) {
    this.PicDateActiveSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PicDateActive (SERVICE.pic_date_active)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPicDateActiveSortDirection () {
    return this.PicDateActiveSortAscending;
  }
  /** Set the field level filters for field: PicDateActive (SERVICE.pic_date_active)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPicDateActiveFilter (DateFilter[] value) throws ServiceException {
    this.PicDateActive = value;
  }
  /** Retrieve filter for field: PicDateActive (SERVICE.pic_date_active)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPicDateActiveFilter () {
    return this.PicDateActive;
  }

  /**
   * Retrieves the PicDateActiveFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PicDateActiveFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PicDateActiveFilter field
   */
  public String[] getPicDateActiveFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPicDateActiveFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPicDateActiveFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPicDateActiveFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPicDateActiveFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PicDateActiveFilter filter value from a formatted string
   *
   * @param _value the PicDateActiveFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PicDateActiveFilter filter field
   */
  public void setPicDateActiveFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPicDateActiveFilterFromFormattedString");
    try {
      this.setPicDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPicDateActiveFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPicDateActiveFilterFromFormattedString");
  }

  /**
   * Retrieves the PicDateActiveFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PicDateActiveFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PicDateActiveFilter field
   */
  public String[] getPicDateActiveFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPicDateActiveFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPicDateActiveFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPicDateActiveFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPicDateActiveFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PicDateActiveFilter filter value from a formatted string
   *
   * @param _value the PicDateActiveFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PicDateActiveFilter filter field
   */
  public void setPicDateActiveFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPicDateActiveFilterFromFormattedDateTimeString");
    try {
      this.setPicDateActiveFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActiveFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPicDateActiveFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPicDateActiveFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentAccountInternalIdFetch (boolean fetch) {
    this.ParentAccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentAccountInternalIdFetch () {
    return this.ParentAccountInternalIdFetch;
  }
  /** Set the SortOrder for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentAccountInternalIdSortOrder (Integer value) {
    this.ParentAccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentAccountInternalIdSortOrder () {
    return this.ParentAccountInternalIdSort;
  }
  /** Set the sort direction for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentAccountInternalIdSortDirection (boolean ascending) {
    this.ParentAccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentAccountInternalIdSortDirection () {
    return this.ParentAccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentAccountInternalId = value;
  }
  /** Retrieve filter for field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentAccountInternalIdFilter () {
    return this.ParentAccountInternalId;
  }

  /**
   * Retrieves the ParentAccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentAccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountInternalIdFilter field
   */
  public String[] getParentAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentAccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the ParentAccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentAccountInternalIdFilter filter field
   */
  public void setParentAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
    try {
      this.setParentAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentAccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PopUnits (SERVICE.pop_units)
   * @param fetch whether to fetch this field or not
   */
  public void setPopUnitsFetch (boolean fetch) {
    this.PopUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: PopUnits (SERVICE.pop_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getPopUnitsFetch () {
    return this.PopUnitsFetch;
  }
  /** Set the SortOrder for field: PopUnits (SERVICE.pop_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPopUnitsSortOrder (Integer value) {
    this.PopUnitsSort = value;
  }
  /** Retrieve SortOrder for field: PopUnits (SERVICE.pop_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPopUnitsSortOrder () {
    return this.PopUnitsSort;
  }
  /** Set the sort direction for field: PopUnits (SERVICE.pop_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPopUnitsSortDirection (boolean ascending) {
    this.PopUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PopUnits (SERVICE.pop_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPopUnitsSortDirection () {
    return this.PopUnitsSortAscending;
  }
  /** Set the field level filters for field: PopUnits (SERVICE.pop_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPopUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.PopUnits = value;
  }
  /** Retrieve filter for field: PopUnits (SERVICE.pop_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPopUnitsFilter () {
    return this.PopUnits;
  }

  /**
   * Retrieves the PopUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PopUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PopUnitsFilter field
   */
  public String[] getPopUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPopUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPopUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPopUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PopUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPopUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PopUnitsFilter filter value from a formatted string
   *
   * @param _value the PopUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PopUnitsFilter filter field
   */
  public void setPopUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPopUnitsFilterFromFormattedString");
    try {
      this.setPopUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PopUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPopUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPopUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PrivacyLevel (SERVICE.privacy_level)
   * @param fetch whether to fetch this field or not
   */
  public void setPrivacyLevelFetch (boolean fetch) {
    this.PrivacyLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrivacyLevel (SERVICE.privacy_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrivacyLevelFetch () {
    return this.PrivacyLevelFetch;
  }
  /** Set the SortOrder for field: PrivacyLevel (SERVICE.privacy_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrivacyLevelSortOrder (Integer value) {
    this.PrivacyLevelSort = value;
  }
  /** Retrieve SortOrder for field: PrivacyLevel (SERVICE.privacy_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrivacyLevelSortOrder () {
    return this.PrivacyLevelSort;
  }
  /** Set the sort direction for field: PrivacyLevel (SERVICE.privacy_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrivacyLevelSortDirection (boolean ascending) {
    this.PrivacyLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrivacyLevel (SERVICE.privacy_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrivacyLevelSortDirection () {
    return this.PrivacyLevelSortAscending;
  }
  /** Set the field level filters for field: PrivacyLevel (SERVICE.privacy_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrivacyLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.PrivacyLevel = value;
  }
  /** Retrieve filter for field: PrivacyLevel (SERVICE.privacy_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrivacyLevelFilter () {
    return this.PrivacyLevel;
  }

  /**
   * Retrieves the PrivacyLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrivacyLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrivacyLevelFilter field
   */
  public String[] getPrivacyLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrivacyLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrivacyLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrivacyLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrivacyLevelFilter filter value from a formatted string
   *
   * @param _value the PrivacyLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrivacyLevelFilter filter field
   */
  public void setPrivacyLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrivacyLevelFilterFromFormattedString");
    try {
      this.setPrivacyLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrivacyLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrivacyLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrivacyLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RestrictedPic (SERVICE.restricted_pic)
   * @param fetch whether to fetch this field or not
   */
  public void setRestrictedPicFetch (boolean fetch) {
    this.RestrictedPicFetch = fetch;
  }
  /** Retrieve Fetch value for field: RestrictedPic (SERVICE.restricted_pic)
   * @return boolean the Fetch value for this field
   */
  public boolean getRestrictedPicFetch () {
    return this.RestrictedPicFetch;
  }
  /** Set the SortOrder for field: RestrictedPic (SERVICE.restricted_pic)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRestrictedPicSortOrder (Integer value) {
    this.RestrictedPicSort = value;
  }
  /** Retrieve SortOrder for field: RestrictedPic (SERVICE.restricted_pic)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRestrictedPicSortOrder () {
    return this.RestrictedPicSort;
  }
  /** Set the sort direction for field: RestrictedPic (SERVICE.restricted_pic)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRestrictedPicSortDirection (boolean ascending) {
    this.RestrictedPicSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RestrictedPic (SERVICE.restricted_pic)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRestrictedPicSortDirection () {
    return this.RestrictedPicSortAscending;
  }
  /** Set the field level filters for field: RestrictedPic (SERVICE.restricted_pic)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRestrictedPicFilter (IntegerFilter[] value) throws ServiceException {
    this.RestrictedPic = value;
  }
  /** Retrieve filter for field: RestrictedPic (SERVICE.restricted_pic)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRestrictedPicFilter () {
    return this.RestrictedPic;
  }

  /**
   * Retrieves the RestrictedPicFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RestrictedPicFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RestrictedPicFilter field
   */
  public String[] getRestrictedPicFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRestrictedPicFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRestrictedPicFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRestrictedPicFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RestrictedPicFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRestrictedPicFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RestrictedPicFilter filter value from a formatted string
   *
   * @param _value the RestrictedPicFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RestrictedPicFilter filter field
   */
  public void setRestrictedPicFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRestrictedPicFilterFromFormattedString");
    try {
      this.setRestrictedPicFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RestrictedPicFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRestrictedPicFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRestrictedPicFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceNamePre (SERVICE.service_name_pre)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceNamePreFetch (boolean fetch) {
    this.ServiceNamePreFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceNamePre (SERVICE.service_name_pre)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceNamePreFetch () {
    return this.ServiceNamePreFetch;
  }
  /** Set the SortOrder for field: ServiceNamePre (SERVICE.service_name_pre)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceNamePreSortOrder (Integer value) {
    this.ServiceNamePreSort = value;
  }
  /** Retrieve SortOrder for field: ServiceNamePre (SERVICE.service_name_pre)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceNamePreSortOrder () {
    return this.ServiceNamePreSort;
  }
  /** Set the sort direction for field: ServiceNamePre (SERVICE.service_name_pre)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceNamePreSortDirection (boolean ascending) {
    this.ServiceNamePreSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceNamePre (SERVICE.service_name_pre)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceNamePreSortDirection () {
    return this.ServiceNamePreSortAscending;
  }
  /** Set the case insensitive for field: ServiceNamePre (SERVICE.service_name_pre)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceNamePreCaseInsensitive (boolean ascending) {
    this.ServiceNamePreCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceNamePre (SERVICE.service_name_pre)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceNamePreCaseInsensitive () {
    return this.ServiceNamePreCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceNamePre (SERVICE.service_name_pre)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceNamePreFilter (StringFilter[] value) throws ServiceException {
    this.ServiceNamePre = value;
  }
  /** Retrieve filter for field: ServiceNamePre (SERVICE.service_name_pre)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceNamePreFilter () {
    return this.ServiceNamePre;
  }

  /**
   * Retrieves the ServiceNamePreFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceNamePreFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceNamePreFilter field
   */
  public String[] getServiceNamePreFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNamePreFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceNamePreFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceNamePreFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceNamePreFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceNamePreFilter filter value from a formatted string
   *
   * @param _value the ServiceNamePreFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceNamePreFilter filter field
   */
  public void setServiceNamePreFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceNamePreFilterFromFormattedString");
    try {
      this.setServiceNamePreFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceNamePreFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceNamePreFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceNamePreFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceFname (SERVICE.service_fname)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceFnameFetch (boolean fetch) {
    this.ServiceFnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceFname (SERVICE.service_fname)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceFnameFetch () {
    return this.ServiceFnameFetch;
  }
  /** Set the SortOrder for field: ServiceFname (SERVICE.service_fname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceFnameSortOrder (Integer value) {
    this.ServiceFnameSort = value;
  }
  /** Retrieve SortOrder for field: ServiceFname (SERVICE.service_fname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceFnameSortOrder () {
    return this.ServiceFnameSort;
  }
  /** Set the sort direction for field: ServiceFname (SERVICE.service_fname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceFnameSortDirection (boolean ascending) {
    this.ServiceFnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceFname (SERVICE.service_fname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceFnameSortDirection () {
    return this.ServiceFnameSortAscending;
  }
  /** Set the case insensitive for field: ServiceFname (SERVICE.service_fname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceFnameCaseInsensitive (boolean ascending) {
    this.ServiceFnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceFname (SERVICE.service_fname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceFnameCaseInsensitive () {
    return this.ServiceFnameCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceFname (SERVICE.service_fname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceFnameFilter (StringFilter[] value) throws ServiceException {
    this.ServiceFname = value;
  }
  /** Retrieve filter for field: ServiceFname (SERVICE.service_fname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceFnameFilter () {
    return this.ServiceFname;
  }

  /**
   * Retrieves the ServiceFnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceFnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceFnameFilter field
   */
  public String[] getServiceFnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceFnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceFnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceFnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceFnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceFnameFilter filter value from a formatted string
   *
   * @param _value the ServiceFnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceFnameFilter filter field
   */
  public void setServiceFnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceFnameFilterFromFormattedString");
    try {
      this.setServiceFnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceFnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceFnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceFnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceMinit (SERVICE.service_minit)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceMinitFetch (boolean fetch) {
    this.ServiceMinitFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceMinit (SERVICE.service_minit)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceMinitFetch () {
    return this.ServiceMinitFetch;
  }
  /** Set the SortOrder for field: ServiceMinit (SERVICE.service_minit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceMinitSortOrder (Integer value) {
    this.ServiceMinitSort = value;
  }
  /** Retrieve SortOrder for field: ServiceMinit (SERVICE.service_minit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceMinitSortOrder () {
    return this.ServiceMinitSort;
  }
  /** Set the sort direction for field: ServiceMinit (SERVICE.service_minit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceMinitSortDirection (boolean ascending) {
    this.ServiceMinitSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceMinit (SERVICE.service_minit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceMinitSortDirection () {
    return this.ServiceMinitSortAscending;
  }
  /** Set the case insensitive for field: ServiceMinit (SERVICE.service_minit)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceMinitCaseInsensitive (boolean ascending) {
    this.ServiceMinitCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceMinit (SERVICE.service_minit)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceMinitCaseInsensitive () {
    return this.ServiceMinitCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceMinit (SERVICE.service_minit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceMinitFilter (StringFilter[] value) throws ServiceException {
    this.ServiceMinit = value;
  }
  /** Retrieve filter for field: ServiceMinit (SERVICE.service_minit)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceMinitFilter () {
    return this.ServiceMinit;
  }

  /**
   * Retrieves the ServiceMinitFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceMinitFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceMinitFilter field
   */
  public String[] getServiceMinitFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMinitFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceMinitFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMinitFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceMinitFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceMinitFilter filter value from a formatted string
   *
   * @param _value the ServiceMinitFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceMinitFilter filter field
   */
  public void setServiceMinitFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceMinitFilterFromFormattedString");
    try {
      this.setServiceMinitFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceMinitFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceMinitFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceMinitFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceLname (SERVICE.service_lname)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceLnameFetch (boolean fetch) {
    this.ServiceLnameFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceLname (SERVICE.service_lname)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceLnameFetch () {
    return this.ServiceLnameFetch;
  }
  /** Set the SortOrder for field: ServiceLname (SERVICE.service_lname)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceLnameSortOrder (Integer value) {
    this.ServiceLnameSort = value;
  }
  /** Retrieve SortOrder for field: ServiceLname (SERVICE.service_lname)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceLnameSortOrder () {
    return this.ServiceLnameSort;
  }
  /** Set the sort direction for field: ServiceLname (SERVICE.service_lname)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceLnameSortDirection (boolean ascending) {
    this.ServiceLnameSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceLname (SERVICE.service_lname)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceLnameSortDirection () {
    return this.ServiceLnameSortAscending;
  }
  /** Set the case insensitive for field: ServiceLname (SERVICE.service_lname)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceLnameCaseInsensitive (boolean ascending) {
    this.ServiceLnameCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceLname (SERVICE.service_lname)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceLnameCaseInsensitive () {
    return this.ServiceLnameCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceLname (SERVICE.service_lname)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceLnameFilter (StringFilter[] value) throws ServiceException {
    this.ServiceLname = value;
  }
  /** Retrieve filter for field: ServiceLname (SERVICE.service_lname)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceLnameFilter () {
    return this.ServiceLname;
  }

  /**
   * Retrieves the ServiceLnameFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceLnameFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceLnameFilter field
   */
  public String[] getServiceLnameFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceLnameFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceLnameFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceLnameFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceLnameFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceLnameFilter filter value from a formatted string
   *
   * @param _value the ServiceLnameFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceLnameFilter filter field
   */
  public void setServiceLnameFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceLnameFilterFromFormattedString");
    try {
      this.setServiceLnameFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceLnameFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceLnameFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceLnameFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceNameGenerationFetch (boolean fetch) {
    this.ServiceNameGenerationFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceNameGenerationFetch () {
    return this.ServiceNameGenerationFetch;
  }
  /** Set the SortOrder for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceNameGenerationSortOrder (Integer value) {
    this.ServiceNameGenerationSort = value;
  }
  /** Retrieve SortOrder for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceNameGenerationSortOrder () {
    return this.ServiceNameGenerationSort;
  }
  /** Set the sort direction for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceNameGenerationSortDirection (boolean ascending) {
    this.ServiceNameGenerationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceNameGenerationSortDirection () {
    return this.ServiceNameGenerationSortAscending;
  }
  /** Set the case insensitive for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceNameGenerationCaseInsensitive (boolean ascending) {
    this.ServiceNameGenerationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceNameGenerationCaseInsensitive () {
    return this.ServiceNameGenerationCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceNameGenerationFilter (StringFilter[] value) throws ServiceException {
    this.ServiceNameGeneration = value;
  }
  /** Retrieve filter for field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceNameGenerationFilter () {
    return this.ServiceNameGeneration;
  }

  /**
   * Retrieves the ServiceNameGenerationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceNameGenerationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceNameGenerationFilter field
   */
  public String[] getServiceNameGenerationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNameGenerationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceNameGenerationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceNameGenerationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceNameGenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceNameGenerationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceNameGenerationFilter filter value from a formatted string
   *
   * @param _value the ServiceNameGenerationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceNameGenerationFilter filter field
   */
  public void setServiceNameGenerationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceNameGenerationFilterFromFormattedString");
    try {
      this.setServiceNameGenerationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceNameGenerationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceNameGenerationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceNameGenerationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceCompany (SERVICE.service_company)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCompanyFetch (boolean fetch) {
    this.ServiceCompanyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCompany (SERVICE.service_company)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCompanyFetch () {
    return this.ServiceCompanyFetch;
  }
  /** Set the SortOrder for field: ServiceCompany (SERVICE.service_company)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCompanySortOrder (Integer value) {
    this.ServiceCompanySort = value;
  }
  /** Retrieve SortOrder for field: ServiceCompany (SERVICE.service_company)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCompanySortOrder () {
    return this.ServiceCompanySort;
  }
  /** Set the sort direction for field: ServiceCompany (SERVICE.service_company)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCompanySortDirection (boolean ascending) {
    this.ServiceCompanySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCompany (SERVICE.service_company)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCompanySortDirection () {
    return this.ServiceCompanySortAscending;
  }
  /** Set the case insensitive for field: ServiceCompany (SERVICE.service_company)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServiceCompanyCaseInsensitive (boolean ascending) {
    this.ServiceCompanyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServiceCompany (SERVICE.service_company)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServiceCompanyCaseInsensitive () {
    return this.ServiceCompanyCaseInsensitive;
  }
  /** Set the field level filters for field: ServiceCompany (SERVICE.service_company)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCompanyFilter (StringFilter[] value) throws ServiceException {
    this.ServiceCompany = value;
  }
  /** Retrieve filter for field: ServiceCompany (SERVICE.service_company)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServiceCompanyFilter () {
    return this.ServiceCompany;
  }

  /**
   * Retrieves the ServiceCompanyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceCompanyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCompanyFilter field
   */
  public String[] getServiceCompanyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCompanyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceCompanyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCompanyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCompanyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceCompanyFilter filter value from a formatted string
   *
   * @param _value the ServiceCompanyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceCompanyFilter filter field
   */
  public void setServiceCompanyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceCompanyFilterFromFormattedString");
    try {
      this.setServiceCompanyFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceCompanyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCompanyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCompanyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServicePhone (SERVICE.service_phone)
   * @param fetch whether to fetch this field or not
   */
  public void setServicePhoneFetch (boolean fetch) {
    this.ServicePhoneFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServicePhone (SERVICE.service_phone)
   * @return boolean the Fetch value for this field
   */
  public boolean getServicePhoneFetch () {
    return this.ServicePhoneFetch;
  }
  /** Set the SortOrder for field: ServicePhone (SERVICE.service_phone)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServicePhoneSortOrder (Integer value) {
    this.ServicePhoneSort = value;
  }
  /** Retrieve SortOrder for field: ServicePhone (SERVICE.service_phone)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServicePhoneSortOrder () {
    return this.ServicePhoneSort;
  }
  /** Set the sort direction for field: ServicePhone (SERVICE.service_phone)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServicePhoneSortDirection (boolean ascending) {
    this.ServicePhoneSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServicePhone (SERVICE.service_phone)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServicePhoneSortDirection () {
    return this.ServicePhoneSortAscending;
  }
  /** Set the case insensitive for field: ServicePhone (SERVICE.service_phone)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServicePhoneCaseInsensitive (boolean ascending) {
    this.ServicePhoneCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServicePhone (SERVICE.service_phone)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServicePhoneCaseInsensitive () {
    return this.ServicePhoneCaseInsensitive;
  }
  /** Set the field level filters for field: ServicePhone (SERVICE.service_phone)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServicePhoneFilter (StringFilter[] value) throws ServiceException {
    this.ServicePhone = value;
  }
  /** Retrieve filter for field: ServicePhone (SERVICE.service_phone)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServicePhoneFilter () {
    return this.ServicePhone;
  }

  /**
   * Retrieves the ServicePhoneFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServicePhoneFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServicePhoneFilter field
   */
  public String[] getServicePhoneFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhoneFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServicePhoneFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePhoneFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServicePhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServicePhoneFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServicePhoneFilter filter value from a formatted string
   *
   * @param _value the ServicePhoneFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServicePhoneFilter filter field
   */
  public void setServicePhoneFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServicePhoneFilterFromFormattedString");
    try {
      this.setServicePhoneFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServicePhoneFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServicePhoneFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServicePhoneFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServicePhone2 (SERVICE.service_phone2)
   * @param fetch whether to fetch this field or not
   */
  public void setServicePhone2Fetch (boolean fetch) {
    this.ServicePhone2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: ServicePhone2 (SERVICE.service_phone2)
   * @return boolean the Fetch value for this field
   */
  public boolean getServicePhone2Fetch () {
    return this.ServicePhone2Fetch;
  }
  /** Set the SortOrder for field: ServicePhone2 (SERVICE.service_phone2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServicePhone2SortOrder (Integer value) {
    this.ServicePhone2Sort = value;
  }
  /** Retrieve SortOrder for field: ServicePhone2 (SERVICE.service_phone2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServicePhone2SortOrder () {
    return this.ServicePhone2Sort;
  }
  /** Set the sort direction for field: ServicePhone2 (SERVICE.service_phone2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServicePhone2SortDirection (boolean ascending) {
    this.ServicePhone2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServicePhone2 (SERVICE.service_phone2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServicePhone2SortDirection () {
    return this.ServicePhone2SortAscending;
  }
  /** Set the case insensitive for field: ServicePhone2 (SERVICE.service_phone2)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setServicePhone2CaseInsensitive (boolean ascending) {
    this.ServicePhone2CaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ServicePhone2 (SERVICE.service_phone2)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getServicePhone2CaseInsensitive () {
    return this.ServicePhone2CaseInsensitive;
  }
  /** Set the field level filters for field: ServicePhone2 (SERVICE.service_phone2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServicePhone2Filter (StringFilter[] value) throws ServiceException {
    this.ServicePhone2 = value;
  }
  /** Retrieve filter for field: ServicePhone2 (SERVICE.service_phone2)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getServicePhone2Filter () {
    return this.ServicePhone2;
  }

  /**
   * Retrieves the ServicePhone2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServicePhone2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServicePhone2Filter field
   */
  public String[] getServicePhone2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhone2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServicePhone2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePhone2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServicePhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServicePhone2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServicePhone2Filter filter value from a formatted string
   *
   * @param _value the ServicePhone2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServicePhone2Filter filter field
   */
  public void setServicePhone2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServicePhone2FilterFromFormattedString");
    try {
      this.setServicePhone2Filter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServicePhone2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServicePhone2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServicePhone2FilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SalesChannelId (SERVICE.sales_channel_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSalesChannelIdFetch (boolean fetch) {
    this.SalesChannelIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SalesChannelId (SERVICE.sales_channel_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSalesChannelIdFetch () {
    return this.SalesChannelIdFetch;
  }
  /** Set the SortOrder for field: SalesChannelId (SERVICE.sales_channel_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSalesChannelIdSortOrder (Integer value) {
    this.SalesChannelIdSort = value;
  }
  /** Retrieve SortOrder for field: SalesChannelId (SERVICE.sales_channel_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSalesChannelIdSortOrder () {
    return this.SalesChannelIdSort;
  }
  /** Set the sort direction for field: SalesChannelId (SERVICE.sales_channel_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSalesChannelIdSortDirection (boolean ascending) {
    this.SalesChannelIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SalesChannelId (SERVICE.sales_channel_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSalesChannelIdSortDirection () {
    return this.SalesChannelIdSortAscending;
  }
  /** Set the field level filters for field: SalesChannelId (SERVICE.sales_channel_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSalesChannelIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SalesChannelId = value;
  }
  /** Retrieve filter for field: SalesChannelId (SERVICE.sales_channel_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSalesChannelIdFilter () {
    return this.SalesChannelId;
  }

  /**
   * Retrieves the SalesChannelIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SalesChannelIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelIdFilter field
   */
  public String[] getSalesChannelIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSalesChannelIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SalesChannelIdFilter filter value from a formatted string
   *
   * @param _value the SalesChannelIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SalesChannelIdFilter filter field
   */
  public void setSalesChannelIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
    try {
      this.setSalesChannelIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @param fetch whether to fetch this field or not
   */
  public void setSimSerialNumberFetch (boolean fetch) {
    this.SimSerialNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getSimSerialNumberFetch () {
    return this.SimSerialNumberFetch;
  }
  /** Set the SortOrder for field: SimSerialNumber (SERVICE.sim_serial_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSimSerialNumberSortOrder (Integer value) {
    this.SimSerialNumberSort = value;
  }
  /** Retrieve SortOrder for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSimSerialNumberSortOrder () {
    return this.SimSerialNumberSort;
  }
  /** Set the sort direction for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSimSerialNumberSortDirection (boolean ascending) {
    this.SimSerialNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSimSerialNumberSortDirection () {
    return this.SimSerialNumberSortAscending;
  }
  /** Set the case insensitive for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSimSerialNumberCaseInsensitive (boolean ascending) {
    this.SimSerialNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSimSerialNumberCaseInsensitive () {
    return this.SimSerialNumberCaseInsensitive;
  }
  /** Set the field level filters for field: SimSerialNumber (SERVICE.sim_serial_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSimSerialNumberFilter (StringFilter[] value) throws ServiceException {
    this.SimSerialNumber = value;
  }
  /** Retrieve filter for field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSimSerialNumberFilter () {
    return this.SimSerialNumber;
  }

  /**
   * Retrieves the SimSerialNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SimSerialNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SimSerialNumberFilter field
   */
  public String[] getSimSerialNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSimSerialNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSimSerialNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSimSerialNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SimSerialNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSimSerialNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SimSerialNumberFilter filter value from a formatted string
   *
   * @param _value the SimSerialNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SimSerialNumberFilter filter field
   */
  public void setSimSerialNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSimSerialNumberFilterFromFormattedString");
    try {
      this.setSimSerialNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SimSerialNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSimSerialNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSimSerialNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SwitchId (SERVICE.switch_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSwitchIdFetch (boolean fetch) {
    this.SwitchIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SwitchId (SERVICE.switch_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSwitchIdFetch () {
    return this.SwitchIdFetch;
  }
  /** Set the SortOrder for field: SwitchId (SERVICE.switch_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSwitchIdSortOrder (Integer value) {
    this.SwitchIdSort = value;
  }
  /** Retrieve SortOrder for field: SwitchId (SERVICE.switch_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSwitchIdSortOrder () {
    return this.SwitchIdSort;
  }
  /** Set the sort direction for field: SwitchId (SERVICE.switch_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSwitchIdSortDirection (boolean ascending) {
    this.SwitchIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SwitchId (SERVICE.switch_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSwitchIdSortDirection () {
    return this.SwitchIdSortAscending;
  }
  /** Set the case insensitive for field: SwitchId (SERVICE.switch_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setSwitchIdCaseInsensitive (boolean ascending) {
    this.SwitchIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: SwitchId (SERVICE.switch_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getSwitchIdCaseInsensitive () {
    return this.SwitchIdCaseInsensitive;
  }
  /** Set the field level filters for field: SwitchId (SERVICE.switch_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSwitchIdFilter (StringFilter[] value) throws ServiceException {
    this.SwitchId = value;
  }
  /** Retrieve filter for field: SwitchId (SERVICE.switch_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getSwitchIdFilter () {
    return this.SwitchId;
  }

  /**
   * Retrieves the SwitchIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SwitchIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SwitchIdFilter field
   */
  public String[] getSwitchIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSwitchIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSwitchIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSwitchIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SwitchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSwitchIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SwitchIdFilter filter value from a formatted string
   *
   * @param _value the SwitchIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SwitchIdFilter filter field
   */
  public void setSwitchIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSwitchIdFilterFromFormattedString");
    try {
      this.setSwitchIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SwitchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSwitchIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSwitchIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPrepaid (SERVICE.is_prepaid)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPrepaidFetch (boolean fetch) {
    this.IsPrepaidFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPrepaid (SERVICE.is_prepaid)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPrepaidFetch () {
    return this.IsPrepaidFetch;
  }
  /** Set the SortOrder for field: IsPrepaid (SERVICE.is_prepaid)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPrepaidSortOrder (Integer value) {
    this.IsPrepaidSort = value;
  }
  /** Retrieve SortOrder for field: IsPrepaid (SERVICE.is_prepaid)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPrepaidSortOrder () {
    return this.IsPrepaidSort;
  }
  /** Set the sort direction for field: IsPrepaid (SERVICE.is_prepaid)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPrepaidSortDirection (boolean ascending) {
    this.IsPrepaidSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPrepaid (SERVICE.is_prepaid)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPrepaidSortDirection () {
    return this.IsPrepaidSortAscending;
  }
  /** Set the field level filters for field: IsPrepaid (SERVICE.is_prepaid)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPrepaidFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPrepaid = value;
  }
  /** Retrieve filter for field: IsPrepaid (SERVICE.is_prepaid)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPrepaidFilter () {
    return this.IsPrepaid;
  }

  /**
   * Retrieves the IsPrepaidFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPrepaidFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPrepaidFilter field
   */
  public String[] getIsPrepaidFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPrepaidFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPrepaidFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPrepaidFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPrepaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPrepaidFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPrepaidFilter filter value from a formatted string
   *
   * @param _value the IsPrepaidFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPrepaidFilter filter field
   */
  public void setIsPrepaidFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPrepaidFilterFromFormattedString");
    try {
      this.setIsPrepaidFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPrepaidFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPrepaidFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPrepaidFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceActiveDtFetch (boolean fetch) {
    this.ServiceActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceActiveDtFetch () {
    return this.ServiceActiveDtFetch;
  }
  /** Set the SortOrder for field: ServiceActiveDt (SERVICE.service_active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceActiveDtSortOrder (Integer value) {
    this.ServiceActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceActiveDtSortOrder () {
    return this.ServiceActiveDtSort;
  }
  /** Set the sort direction for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceActiveDtSortDirection (boolean ascending) {
    this.ServiceActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceActiveDtSortDirection () {
    return this.ServiceActiveDtSortAscending;
  }
  /** Set the field level filters for field: ServiceActiveDt (SERVICE.service_active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ServiceActiveDt = value;
  }
  /** Retrieve filter for field: ServiceActiveDt (SERVICE.service_active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getServiceActiveDtFilter () {
    return this.ServiceActiveDt;
  }

  /**
   * Retrieves the ServiceActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceActiveDtFilter field
   */
  public String[] getServiceActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceActiveDtFilter filter value from a formatted string
   *
   * @param _value the ServiceActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceActiveDtFilter filter field
   */
  public void setServiceActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceActiveDtFilterFromFormattedString");
    try {
      this.setServiceActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ServiceActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceActiveDtFilter field
   */
  public String[] getServiceActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceActiveDtFilter filter value from a formatted string
   *
   * @param _value the ServiceActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceActiveDtFilter filter field
   */
  public void setServiceActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setServiceActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInactiveDtFetch (boolean fetch) {
    this.ServiceInactiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInactiveDtFetch () {
    return this.ServiceInactiveDtFetch;
  }
  /** Set the SortOrder for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInactiveDtSortOrder (Integer value) {
    this.ServiceInactiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInactiveDtSortOrder () {
    return this.ServiceInactiveDtSort;
  }
  /** Set the sort direction for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInactiveDtSortDirection (boolean ascending) {
    this.ServiceInactiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInactiveDtSortDirection () {
    return this.ServiceInactiveDtSortAscending;
  }
  /** Set the field level filters for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInactiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ServiceInactiveDt = value;
  }
  /** Retrieve filter for field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getServiceInactiveDtFilter () {
    return this.ServiceInactiveDt;
  }

  /**
   * Retrieves the ServiceInactiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInactiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInactiveDtFilter field
   */
  public String[] getServiceInactiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInactiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInactiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInactiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInactiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInactiveDtFilter filter value from a formatted string
   *
   * @param _value the ServiceInactiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInactiveDtFilter filter field
   */
  public void setServiceInactiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInactiveDtFilterFromFormattedString");
    try {
      this.setServiceInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInactiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInactiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ServiceInactiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInactiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInactiveDtFilter field
   */
  public String[] getServiceInactiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInactiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getServiceInactiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInactiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInactiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInactiveDtFilter filter value from a formatted string
   *
   * @param _value the ServiceInactiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ServiceInactiveDtFilter filter field
   */
  public void setServiceInactiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInactiveDtFilterFromFormattedDateTimeString");
    try {
      this.setServiceInactiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInactiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInactiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ViewId (SERVICE.view_id)
   * @param fetch whether to fetch this field or not
   */
  public void setViewIdFetch (boolean fetch) {
    this.ViewIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewId (SERVICE.view_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewIdFetch () {
    return this.ViewIdFetch;
  }
  /** Set the SortOrder for field: ViewId (SERVICE.view_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewIdSortOrder (Integer value) {
    this.ViewIdSort = value;
  }
  /** Retrieve SortOrder for field: ViewId (SERVICE.view_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewIdSortOrder () {
    return this.ViewIdSort;
  }
  /** Set the sort direction for field: ViewId (SERVICE.view_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewIdSortDirection (boolean ascending) {
    this.ViewIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewId (SERVICE.view_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewIdSortDirection () {
    return this.ViewIdSortAscending;
  }
  /** Set the field level filters for field: ViewId (SERVICE.view_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ViewId = value;
  }
  /** Retrieve filter for field: ViewId (SERVICE.view_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getViewIdFilter () {
    return this.ViewId;
  }

  /**
   * Retrieves the ViewIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewIdFilter field
   */
  public String[] getViewIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewIdFilter filter value from a formatted string
   *
   * @param _value the ViewIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewIdFilter filter field
   */
  public void setViewIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewIdFilterFromFormattedString");
    try {
      this.setViewIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewIdFilterFromFormattedString");
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public UnbilledUsageServiceObjectFilter (UnbilledUsageObjectFilter other)
  {
    super (other);

  }

  public String toString() {
    return UnbilledUsageServiceObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return UnbilledUsageServiceObjectHelper.toMap(this, null);
  }
}
