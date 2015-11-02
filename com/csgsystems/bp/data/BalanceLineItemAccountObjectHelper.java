/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceLineItemAccountObjectHelper.java
 * Definition File: Customer/BalanceLineItem.xml
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

import java.math.BigInteger;
import java.util.*;
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert BalanceLineItemAccountObject JavaBean objects to/from HashMaps.
 */
public class BalanceLineItemAccountObjectHelper implements ArubaObjectHelper
{
  /** convert BalanceLineItemAccountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BalanceLineItemAccountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceLineItemAccountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceLineItemAccountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemAccountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceLineItemAccountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BalanceLineItemObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert BalanceLineItemAccountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemAccountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceLineItemAccountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceLineItemAccountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemAccountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceLineItemAccountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BalanceLineItemObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BalanceLineItemAccountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BalanceLineItemAccountObjectData the converted object
   */
  public static BalanceLineItemAccountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BalanceLineItemAccountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BalanceLineItemAccountObject")
   * @return BalanceLineItemAccountObjectData the converted object
   */
  public static BalanceLineItemAccountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemAccountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BalanceLineItemAccountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BalanceLineItemAccountObjectFilter the converted object
   */
  public static BalanceLineItemAccountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BalanceLineItemAccountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BalanceLineItemAccountObject")
   * @return BalanceLineItemAccountObjectFilter the converted object
   */
  public static BalanceLineItemAccountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemAccountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BalanceLineItemAccountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BalanceLineItemAccountObjectDataList the converted object
   */
  public static BalanceLineItemAccountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BalanceLineItemAccountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BalanceLineItemAccountObjectList")
   * @return BalanceLineItemAccountObjectDataList the converted object
   */
  public static BalanceLineItemAccountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemAccountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BalanceLineItemAccountObjectData[] array = null;
    if (root != null)
    {
      array = new BalanceLineItemAccountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BalanceLineItemAccountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BalanceLineItemAccountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BalanceLineItemAccountObjectDataList (array, index, total);
  }
  /** convert BalanceLineItemAccountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceLineItemAccountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CustBankSortCodeSet) record.put ("CustBankSortCode", in.CustBankSortCode);
  
    if (in._CustBankAccNumSet) record.put ("CustBankAccNum", in.CustBankAccNum);
  
    if (in._AltBankAccNumSet) record.put ("AltBankAccNum", in.AltBankAccNum);
  
    if (in._OwnrLnameSet) record.put ("OwnrLname", in.OwnrLname);
  
    if (in._OwnrFnameSet) record.put ("OwnrFname", in.OwnrFname);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._BankAgencyCodeSet) record.put ("BankAgencyCode", in.BankAgencyCode);
  
    if (in._BankAgencyNameSet) record.put ("BankAgencyName", in.BankAgencyName);
  
    if (in._NewCustBankSortCodeSet) record.put ("NewCustBankSortCode", in.NewCustBankSortCode);
  
    if (in._BankCodeSet) record.put ("BankCode", in.BankCode);
  
    if (in._BankAccountTypeSet) record.put ("BankAccountType", in.BankAccountType);
  
    if (in._BranchNameSet) record.put ("BranchName", in.BranchName);
  
    if (in._BranchCodeSet) record.put ("BranchCode", in.BranchCode);
  
    if (in._ParentAccountExternalIdSet) record.put ("ParentAccountExternalId", in.ParentAccountExternalId);
  
    if (in._ParentAccountExternalIdTypeSet) record.put ("ParentAccountExternalIdType", in.ParentAccountExternalIdType);
  
    if (in._HierarchyAccountExternalIdSet) record.put ("HierarchyAccountExternalId", in.HierarchyAccountExternalId);
  
    if (in._HierarchyAccountExternalIdTypeSet) record.put ("HierarchyAccountExternalIdType", in.HierarchyAccountExternalIdType);
  
    if (in._ParentIdSet) record.put ("ParentId", in.ParentId);
  
    if (in._ChildCountSet) record.put ("ChildCount", in.ChildCount);
  
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._TieCodeSet) record.put ("TieCode", in.TieCode);
  
    if (in._AccountTypeSet) record.put ("AccountType", in.AccountType);
  
    if (in._AccountCategorySet) record.put ("AccountCategory", in.AccountCategory);
  
    if (in._PrevBillDateSet) record.put ("PrevBillDate", in.PrevBillDate);
  
    if (in._NextBillDateSet) record.put ("NextBillDate", in.NextBillDate);
  
    if (in._BillNamePreSet) record.put ("BillNamePre", in.BillNamePre);
  
    if (in._BillFnameSet) record.put ("BillFname", in.BillFname);
  
    if (in._BillMinitSet) record.put ("BillMinit", in.BillMinit);
  
    if (in._BillLnameSet) record.put ("BillLname", in.BillLname);
  
    if (in._BillNameGenerationSet) record.put ("BillNameGeneration", in.BillNameGeneration);
  
    if (in._BillTitleSet) record.put ("BillTitle", in.BillTitle);
  
    if (in._BillCompanySet) record.put ("BillCompany", in.BillCompany);
  
    if (in._CustAddress1Set) record.put ("CustAddress1", in.CustAddress1);
  
    if (in._CustAddress2Set) record.put ("CustAddress2", in.CustAddress2);
  
    if (in._CustAddress3Set) record.put ("CustAddress3", in.CustAddress3);
  
    if (in._CustCitySet) record.put ("CustCity", in.CustCity);
  
    if (in._CustStateSet) record.put ("CustState", in.CustState);
  
    if (in._CustZipSet) record.put ("CustZip", in.CustZip);
  
    if (in._CustCountryCodeSet) record.put ("CustCountryCode", in.CustCountryCode);
  
    if (in._CustFranchiseTaxCodeSet) record.put ("CustFranchiseTaxCode", in.CustFranchiseTaxCode);
  
    if (in._CustGeocodeSet) record.put ("CustGeocode", in.CustGeocode);
  
    if (in._CustCountySet) record.put ("CustCounty", in.CustCounty);
  
    if (in._CustPhone1Set) record.put ("CustPhone1", in.CustPhone1);
  
    if (in._CustPhone2Set) record.put ("CustPhone2", in.CustPhone2);
  
    if (in._BillAddress1Set) record.put ("BillAddress1", in.BillAddress1);
  
    if (in._BillAddress2Set) record.put ("BillAddress2", in.BillAddress2);
  
    if (in._BillAddress3Set) record.put ("BillAddress3", in.BillAddress3);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
  
    if (in._BillCountryCodeSet) record.put ("BillCountryCode", in.BillCountryCode);
  
    if (in._BillFranchiseTaxCodeSet) record.put ("BillFranchiseTaxCode", in.BillFranchiseTaxCode);
  
    if (in._BillCountySet) record.put ("BillCounty", in.BillCounty);
  
    if (in._BillGeocodeSet) record.put ("BillGeocode", in.BillGeocode);
  
    if (in._SsnSet) record.put ("Ssn", in.Ssn);
  
    if (in._Contact1NameSet) record.put ("Contact1Name", in.Contact1Name);
  
    if (in._Contact2NameSet) record.put ("Contact2Name", in.Contact2Name);
  
    if (in._Contact1PhoneSet) record.put ("Contact1Phone", in.Contact1Phone);
  
    if (in._Contact2PhoneSet) record.put ("Contact2Phone", in.Contact2Phone);
  
    if (in._CustFaxnoSet) record.put ("CustFaxno", in.CustFaxno);
  
    if (in._StatementToFaxnoSet) record.put ("StatementToFaxno", in.StatementToFaxno);
  
    if (in._CreditThreshSet) record.put ("CreditThresh", in.CreditThresh);
  
    if (in._CredStatusSet) record.put ("CredStatus", in.CredStatus);
  
    if (in._CreditRatingSet) record.put ("CreditRating", in.CreditRating);
  
    if (in._DisconnectReasonSet) record.put ("DisconnectReason", in.DisconnectReason);
  
    if (in._DiscRcvOptSet) record.put ("DiscRcvOpt", in.DiscRcvOpt);
  
    if (in._ThreshRefSet) record.put ("ThreshRef", in.ThreshRef);
  
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._MsgGrpIdSet) record.put ("MsgGrpId", in.MsgGrpId);
  
    if (in._InsertGrpIdSet) record.put ("InsertGrpId", in.InsertGrpId);
  
    if (in._RateClassDefaultSet) record.put ("RateClassDefault", in.RateClassDefault);
  
    if (in._RateClassSpecialSet) record.put ("RateClassSpecial", in.RateClassSpecial);
  
    if (in._ExrateClassSet) record.put ("ExrateClass", in.ExrateClass);
  
    if (in._PlanIdDiscountSet) record.put ("PlanIdDiscount", in.PlanIdDiscount);
  
    if (in._PlanIdCreditSet) record.put ("PlanIdCredit", in.PlanIdCredit);
  
    if (in._AccountStatusDtSet) record.put ("AccountStatusDt", in.AccountStatusDt);
  
    if (in._DistrChanSet) record.put ("DistrChan", in.DistrChan);
  
    if (in._SalesCodeSet) record.put ("SalesCode", in.SalesCode);
  
    if (in._MktCodeSet) record.put ("MktCode", in.MktCode);
  
    if (in._SicCodeSet) record.put ("SicCode", in.SicCode);
  
    if (in._InUseSet) record.put ("InUse", in.InUse);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._CollectionStatusSet) record.put ("CollectionStatus", in.CollectionStatus);
  
    if (in._VipCodeSet) record.put ("VipCode", in.VipCode);
  
    if (in._PurchaseOrderSet) record.put ("PurchaseOrder", in.PurchaseOrder);
  
    if (in._CodewordSet) record.put ("Codeword", in.Codeword);
  
    if (in._RemarkSet) record.put ("Remark", in.Remark);
  
    if (in._CustEmailSet) record.put ("CustEmail", in.CustEmail);
  
    if (in._StatementToEmailSet) record.put ("StatementToEmail", in.StatementToEmail);
  
    if (in._DateCreatedSet) record.put ("DateCreated", in.DateCreated);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._RevRcvCostCtrSet) record.put ("RevRcvCostCtr", in.RevRcvCostCtr);
  
    if (in._OwningCostCtrSet) record.put ("OwningCostCtr", in.OwningCostCtr);
  
    if (in._AcctSegIdSet) record.put ("AcctSegId", in.AcctSegId);
  
    if (in._ChargeThresholdSet) record.put ("ChargeThreshold", in.ChargeThreshold);
  
    if (in._ThresholdSet) record.put ("Threshold", in.Threshold);
  
    if (in._CyclicalThresholdSet) record.put ("CyclicalThreshold", in.CyclicalThreshold);
  
    if (in._UsgAmtLimitSet) record.put ("UsgAmtLimit", in.UsgAmtLimit);
  
    if (in._UsgUnitsLimitSet) record.put ("UsgUnitsLimit", in.UsgUnitsLimit);
  
    if (in._RegulatoryIdSet) record.put ("RegulatoryId", in.RegulatoryId);
  
    if (in._GlobalContractStatusSet) record.put ("GlobalContractStatus", in.GlobalContractStatus);
  
    if (in._AltLnameSet) record.put ("AltLname", in.AltLname);
  
    if (in._AltFnameSet) record.put ("AltFname", in.AltFname);
  
    if (in._AltCompanyNameSet) record.put ("AltCompanyName", in.AltCompanyName);
  
    if (in._GenderSet) record.put ("Gender", in.Gender);
  
    if (in._DeptSet) record.put ("Dept", in.Dept);
  
    if (in._TitleSet) record.put ("Title", in.Title);
  
    if (in._PaymentProfileIdSet) record.put ("PaymentProfileId", in.PaymentProfileId);
  
    if (in._AccountProcessFlagSet) record.put ("AccountProcessFlag", in.AccountProcessFlag);
  
    if (in._SdAgencyIdSet) record.put ("SdAgencyId", in.SdAgencyId);
  
    if (in._CustomerLifetimeIdSet) record.put ("CustomerLifetimeId", in.CustomerLifetimeId);
  
    if (in._CustomerLifetimeId2Set) record.put ("CustomerLifetimeId2", in.CustomerLifetimeId2);
  
    if (in._AutoWriteoffStatusSet) record.put ("AutoWriteoffStatus", in.AutoWriteoffStatus);
      return record;
  }
  /** convert BalanceLineItemAccountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceLineItemAccountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CustBankSortCode, in.CustBankSortCodeSort, in.CustBankSortCodeSortAscending, in.CustBankSortCodeFetch, in.CustBankSortCodeCaseInsensitive);
      if (map != null) record.put ("CustBankSortCode", map);
      map = DataHelper.filterToMap (in.CustBankAccNum, in.CustBankAccNumSort, in.CustBankAccNumSortAscending, in.CustBankAccNumFetch, in.CustBankAccNumCaseInsensitive);
      if (map != null) record.put ("CustBankAccNum", map);
      map = DataHelper.filterToMap (in.AltBankAccNum, in.AltBankAccNumSort, in.AltBankAccNumSortAscending, in.AltBankAccNumFetch, in.AltBankAccNumCaseInsensitive);
      if (map != null) record.put ("AltBankAccNum", map);
      map = DataHelper.filterToMap (in.OwnrLname, in.OwnrLnameSort, in.OwnrLnameSortAscending, in.OwnrLnameFetch, in.OwnrLnameCaseInsensitive);
      if (map != null) record.put ("OwnrLname", map);
      map = DataHelper.filterToMap (in.OwnrFname, in.OwnrFnameSort, in.OwnrFnameSortAscending, in.OwnrFnameFetch, in.OwnrFnameCaseInsensitive);
      if (map != null) record.put ("OwnrFname", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.BankAgencyCode, in.BankAgencyCodeSort, in.BankAgencyCodeSortAscending, in.BankAgencyCodeFetch, in.BankAgencyCodeCaseInsensitive);
      if (map != null) record.put ("BankAgencyCode", map);
      map = DataHelper.filterToMap (in.BankAgencyName, in.BankAgencyNameSort, in.BankAgencyNameSortAscending, in.BankAgencyNameFetch, in.BankAgencyNameCaseInsensitive);
      if (map != null) record.put ("BankAgencyName", map);
      map = DataHelper.filterToMap (in.NewCustBankSortCode, in.NewCustBankSortCodeSort, in.NewCustBankSortCodeSortAscending, in.NewCustBankSortCodeFetch, in.NewCustBankSortCodeCaseInsensitive);
      if (map != null) record.put ("NewCustBankSortCode", map);
      map = DataHelper.filterToMap (in.BankCode, in.BankCodeSort, in.BankCodeSortAscending, in.BankCodeFetch, in.BankCodeCaseInsensitive);
      if (map != null) record.put ("BankCode", map);
      map = DataHelper.filterToMap (in.BankAccountType, in.BankAccountTypeSort, in.BankAccountTypeSortAscending, in.BankAccountTypeFetch);
      if (map != null) record.put ("BankAccountType", map);
      map = DataHelper.filterToMap (in.BranchName, in.BranchNameSort, in.BranchNameSortAscending, in.BranchNameFetch, in.BranchNameCaseInsensitive);
      if (map != null) record.put ("BranchName", map);
      map = DataHelper.filterToMap (in.BranchCode, in.BranchCodeSort, in.BranchCodeSortAscending, in.BranchCodeFetch, in.BranchCodeCaseInsensitive);
      if (map != null) record.put ("BranchCode", map);
      map = DataHelper.filterToMap (in.ParentAccountExternalId, in.ParentAccountExternalIdSort, in.ParentAccountExternalIdSortAscending, in.ParentAccountExternalIdFetch, in.ParentAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("ParentAccountExternalId", map);
      map = DataHelper.filterToMap (in.ParentAccountExternalIdType, in.ParentAccountExternalIdTypeSort, in.ParentAccountExternalIdTypeSortAscending, in.ParentAccountExternalIdTypeFetch);
      if (map != null) record.put ("ParentAccountExternalIdType", map);
      map = DataHelper.filterToMap (in.HierarchyAccountExternalId, in.HierarchyAccountExternalIdSort, in.HierarchyAccountExternalIdSortAscending, in.HierarchyAccountExternalIdFetch, in.HierarchyAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("HierarchyAccountExternalId", map);
      map = DataHelper.filterToMap (in.HierarchyAccountExternalIdType, in.HierarchyAccountExternalIdTypeSort, in.HierarchyAccountExternalIdTypeSortAscending, in.HierarchyAccountExternalIdTypeFetch);
      if (map != null) record.put ("HierarchyAccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ParentId, in.ParentIdSort, in.ParentIdSortAscending, in.ParentIdFetch);
      if (map != null) record.put ("ParentId", map);
      map = DataHelper.filterToMap (in.ChildCount, in.ChildCountSort, in.ChildCountSortAscending, in.ChildCountFetch);
      if (map != null) record.put ("ChildCount", map);
      map = DataHelper.filterToMap (in.HierarchyId, in.HierarchyIdSort, in.HierarchyIdSortAscending, in.HierarchyIdFetch);
      if (map != null) record.put ("HierarchyId", map);
      map = DataHelper.filterToMap (in.TieCode, in.TieCodeSort, in.TieCodeSortAscending, in.TieCodeFetch);
      if (map != null) record.put ("TieCode", map);
      map = DataHelper.filterToMap (in.AccountType, in.AccountTypeSort, in.AccountTypeSortAscending, in.AccountTypeFetch);
      if (map != null) record.put ("AccountType", map);
      map = DataHelper.filterToMap (in.AccountCategory, in.AccountCategorySort, in.AccountCategorySortAscending, in.AccountCategoryFetch);
      if (map != null) record.put ("AccountCategory", map);
      map = DataHelper.filterToMap (in.PrevBillDate, in.PrevBillDateSort, in.PrevBillDateSortAscending, in.PrevBillDateFetch);
      if (map != null) record.put ("PrevBillDate", map);
      map = DataHelper.filterToMap (in.NextBillDate, in.NextBillDateSort, in.NextBillDateSortAscending, in.NextBillDateFetch);
      if (map != null) record.put ("NextBillDate", map);
      map = DataHelper.filterToMap (in.BillNamePre, in.BillNamePreSort, in.BillNamePreSortAscending, in.BillNamePreFetch, in.BillNamePreCaseInsensitive);
      if (map != null) record.put ("BillNamePre", map);
      map = DataHelper.filterToMap (in.BillFname, in.BillFnameSort, in.BillFnameSortAscending, in.BillFnameFetch, in.BillFnameCaseInsensitive);
      if (map != null) record.put ("BillFname", map);
      map = DataHelper.filterToMap (in.BillMinit, in.BillMinitSort, in.BillMinitSortAscending, in.BillMinitFetch, in.BillMinitCaseInsensitive);
      if (map != null) record.put ("BillMinit", map);
      map = DataHelper.filterToMap (in.BillLname, in.BillLnameSort, in.BillLnameSortAscending, in.BillLnameFetch, in.BillLnameCaseInsensitive);
      if (map != null) record.put ("BillLname", map);
      map = DataHelper.filterToMap (in.BillNameGeneration, in.BillNameGenerationSort, in.BillNameGenerationSortAscending, in.BillNameGenerationFetch, in.BillNameGenerationCaseInsensitive);
      if (map != null) record.put ("BillNameGeneration", map);
      map = DataHelper.filterToMap (in.BillTitle, in.BillTitleSort, in.BillTitleSortAscending, in.BillTitleFetch, in.BillTitleCaseInsensitive);
      if (map != null) record.put ("BillTitle", map);
      map = DataHelper.filterToMap (in.BillCompany, in.BillCompanySort, in.BillCompanySortAscending, in.BillCompanyFetch, in.BillCompanyCaseInsensitive);
      if (map != null) record.put ("BillCompany", map);
      map = DataHelper.filterToMap (in.CustAddress1, in.CustAddress1Sort, in.CustAddress1SortAscending, in.CustAddress1Fetch, in.CustAddress1CaseInsensitive);
      if (map != null) record.put ("CustAddress1", map);
      map = DataHelper.filterToMap (in.CustAddress2, in.CustAddress2Sort, in.CustAddress2SortAscending, in.CustAddress2Fetch, in.CustAddress2CaseInsensitive);
      if (map != null) record.put ("CustAddress2", map);
      map = DataHelper.filterToMap (in.CustAddress3, in.CustAddress3Sort, in.CustAddress3SortAscending, in.CustAddress3Fetch, in.CustAddress3CaseInsensitive);
      if (map != null) record.put ("CustAddress3", map);
      map = DataHelper.filterToMap (in.CustCity, in.CustCitySort, in.CustCitySortAscending, in.CustCityFetch, in.CustCityCaseInsensitive);
      if (map != null) record.put ("CustCity", map);
      map = DataHelper.filterToMap (in.CustState, in.CustStateSort, in.CustStateSortAscending, in.CustStateFetch, in.CustStateCaseInsensitive);
      if (map != null) record.put ("CustState", map);
      map = DataHelper.filterToMap (in.CustZip, in.CustZipSort, in.CustZipSortAscending, in.CustZipFetch, in.CustZipCaseInsensitive);
      if (map != null) record.put ("CustZip", map);
      map = DataHelper.filterToMap (in.CustCountryCode, in.CustCountryCodeSort, in.CustCountryCodeSortAscending, in.CustCountryCodeFetch);
      if (map != null) record.put ("CustCountryCode", map);
      map = DataHelper.filterToMap (in.CustFranchiseTaxCode, in.CustFranchiseTaxCodeSort, in.CustFranchiseTaxCodeSortAscending, in.CustFranchiseTaxCodeFetch);
      if (map != null) record.put ("CustFranchiseTaxCode", map);
      map = DataHelper.filterToMap (in.CustGeocode, in.CustGeocodeSort, in.CustGeocodeSortAscending, in.CustGeocodeFetch, in.CustGeocodeCaseInsensitive);
      if (map != null) record.put ("CustGeocode", map);
      map = DataHelper.filterToMap (in.CustCounty, in.CustCountySort, in.CustCountySortAscending, in.CustCountyFetch, in.CustCountyCaseInsensitive);
      if (map != null) record.put ("CustCounty", map);
      map = DataHelper.filterToMap (in.CustPhone1, in.CustPhone1Sort, in.CustPhone1SortAscending, in.CustPhone1Fetch, in.CustPhone1CaseInsensitive);
      if (map != null) record.put ("CustPhone1", map);
      map = DataHelper.filterToMap (in.CustPhone2, in.CustPhone2Sort, in.CustPhone2SortAscending, in.CustPhone2Fetch, in.CustPhone2CaseInsensitive);
      if (map != null) record.put ("CustPhone2", map);
      map = DataHelper.filterToMap (in.BillAddress1, in.BillAddress1Sort, in.BillAddress1SortAscending, in.BillAddress1Fetch, in.BillAddress1CaseInsensitive);
      if (map != null) record.put ("BillAddress1", map);
      map = DataHelper.filterToMap (in.BillAddress2, in.BillAddress2Sort, in.BillAddress2SortAscending, in.BillAddress2Fetch, in.BillAddress2CaseInsensitive);
      if (map != null) record.put ("BillAddress2", map);
      map = DataHelper.filterToMap (in.BillAddress3, in.BillAddress3Sort, in.BillAddress3SortAscending, in.BillAddress3Fetch, in.BillAddress3CaseInsensitive);
      if (map != null) record.put ("BillAddress3", map);
      map = DataHelper.filterToMap (in.BillCity, in.BillCitySort, in.BillCitySortAscending, in.BillCityFetch, in.BillCityCaseInsensitive);
      if (map != null) record.put ("BillCity", map);
      map = DataHelper.filterToMap (in.BillState, in.BillStateSort, in.BillStateSortAscending, in.BillStateFetch, in.BillStateCaseInsensitive);
      if (map != null) record.put ("BillState", map);
      map = DataHelper.filterToMap (in.BillZip, in.BillZipSort, in.BillZipSortAscending, in.BillZipFetch, in.BillZipCaseInsensitive);
      if (map != null) record.put ("BillZip", map);
      map = DataHelper.filterToMap (in.BillCountryCode, in.BillCountryCodeSort, in.BillCountryCodeSortAscending, in.BillCountryCodeFetch);
      if (map != null) record.put ("BillCountryCode", map);
      map = DataHelper.filterToMap (in.BillFranchiseTaxCode, in.BillFranchiseTaxCodeSort, in.BillFranchiseTaxCodeSortAscending, in.BillFranchiseTaxCodeFetch);
      if (map != null) record.put ("BillFranchiseTaxCode", map);
      map = DataHelper.filterToMap (in.BillCounty, in.BillCountySort, in.BillCountySortAscending, in.BillCountyFetch, in.BillCountyCaseInsensitive);
      if (map != null) record.put ("BillCounty", map);
      map = DataHelper.filterToMap (in.BillGeocode, in.BillGeocodeSort, in.BillGeocodeSortAscending, in.BillGeocodeFetch, in.BillGeocodeCaseInsensitive);
      if (map != null) record.put ("BillGeocode", map);
      map = DataHelper.filterToMap (in.Ssn, in.SsnSort, in.SsnSortAscending, in.SsnFetch, in.SsnCaseInsensitive);
      if (map != null) record.put ("Ssn", map);
      map = DataHelper.filterToMap (in.Contact1Name, in.Contact1NameSort, in.Contact1NameSortAscending, in.Contact1NameFetch, in.Contact1NameCaseInsensitive);
      if (map != null) record.put ("Contact1Name", map);
      map = DataHelper.filterToMap (in.Contact2Name, in.Contact2NameSort, in.Contact2NameSortAscending, in.Contact2NameFetch, in.Contact2NameCaseInsensitive);
      if (map != null) record.put ("Contact2Name", map);
      map = DataHelper.filterToMap (in.Contact1Phone, in.Contact1PhoneSort, in.Contact1PhoneSortAscending, in.Contact1PhoneFetch, in.Contact1PhoneCaseInsensitive);
      if (map != null) record.put ("Contact1Phone", map);
      map = DataHelper.filterToMap (in.Contact2Phone, in.Contact2PhoneSort, in.Contact2PhoneSortAscending, in.Contact2PhoneFetch, in.Contact2PhoneCaseInsensitive);
      if (map != null) record.put ("Contact2Phone", map);
      map = DataHelper.filterToMap (in.CustFaxno, in.CustFaxnoSort, in.CustFaxnoSortAscending, in.CustFaxnoFetch, in.CustFaxnoCaseInsensitive);
      if (map != null) record.put ("CustFaxno", map);
      map = DataHelper.filterToMap (in.StatementToFaxno, in.StatementToFaxnoSort, in.StatementToFaxnoSortAscending, in.StatementToFaxnoFetch, in.StatementToFaxnoCaseInsensitive);
      if (map != null) record.put ("StatementToFaxno", map);
      map = DataHelper.filterToMap (in.CreditThresh, in.CreditThreshSort, in.CreditThreshSortAscending, in.CreditThreshFetch);
      if (map != null) record.put ("CreditThresh", map);
      map = DataHelper.filterToMap (in.CredStatus, in.CredStatusSort, in.CredStatusSortAscending, in.CredStatusFetch);
      if (map != null) record.put ("CredStatus", map);
      map = DataHelper.filterToMap (in.CreditRating, in.CreditRatingSort, in.CreditRatingSortAscending, in.CreditRatingFetch);
      if (map != null) record.put ("CreditRating", map);
      map = DataHelper.filterToMap (in.DisconnectReason, in.DisconnectReasonSort, in.DisconnectReasonSortAscending, in.DisconnectReasonFetch);
      if (map != null) record.put ("DisconnectReason", map);
      map = DataHelper.filterToMap (in.DiscRcvOpt, in.DiscRcvOptSort, in.DiscRcvOptSortAscending, in.DiscRcvOptFetch);
      if (map != null) record.put ("DiscRcvOpt", map);
      map = DataHelper.filterToMap (in.ThreshRef, in.ThreshRefSort, in.ThreshRefSortAscending, in.ThreshRefFetch);
      if (map != null) record.put ("ThreshRef", map);
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.MsgGrpId, in.MsgGrpIdSort, in.MsgGrpIdSortAscending, in.MsgGrpIdFetch);
      if (map != null) record.put ("MsgGrpId", map);
      map = DataHelper.filterToMap (in.InsertGrpId, in.InsertGrpIdSort, in.InsertGrpIdSortAscending, in.InsertGrpIdFetch);
      if (map != null) record.put ("InsertGrpId", map);
      map = DataHelper.filterToMap (in.RateClassDefault, in.RateClassDefaultSort, in.RateClassDefaultSortAscending, in.RateClassDefaultFetch);
      if (map != null) record.put ("RateClassDefault", map);
      map = DataHelper.filterToMap (in.RateClassSpecial, in.RateClassSpecialSort, in.RateClassSpecialSortAscending, in.RateClassSpecialFetch);
      if (map != null) record.put ("RateClassSpecial", map);
      map = DataHelper.filterToMap (in.ExrateClass, in.ExrateClassSort, in.ExrateClassSortAscending, in.ExrateClassFetch);
      if (map != null) record.put ("ExrateClass", map);
      map = DataHelper.filterToMap (in.PlanIdDiscount, in.PlanIdDiscountSort, in.PlanIdDiscountSortAscending, in.PlanIdDiscountFetch);
      if (map != null) record.put ("PlanIdDiscount", map);
      map = DataHelper.filterToMap (in.PlanIdCredit, in.PlanIdCreditSort, in.PlanIdCreditSortAscending, in.PlanIdCreditFetch);
      if (map != null) record.put ("PlanIdCredit", map);
      map = DataHelper.filterToMap (in.AccountStatusDt, in.AccountStatusDtSort, in.AccountStatusDtSortAscending, in.AccountStatusDtFetch);
      if (map != null) record.put ("AccountStatusDt", map);
      map = DataHelper.filterToMap (in.DistrChan, in.DistrChanSort, in.DistrChanSortAscending, in.DistrChanFetch, in.DistrChanCaseInsensitive);
      if (map != null) record.put ("DistrChan", map);
      map = DataHelper.filterToMap (in.SalesCode, in.SalesCodeSort, in.SalesCodeSortAscending, in.SalesCodeFetch, in.SalesCodeCaseInsensitive);
      if (map != null) record.put ("SalesCode", map);
      map = DataHelper.filterToMap (in.MktCode, in.MktCodeSort, in.MktCodeSortAscending, in.MktCodeFetch);
      if (map != null) record.put ("MktCode", map);
      map = DataHelper.filterToMap (in.SicCode, in.SicCodeSort, in.SicCodeSortAscending, in.SicCodeFetch);
      if (map != null) record.put ("SicCode", map);
      map = DataHelper.filterToMap (in.InUse, in.InUseSort, in.InUseSortAscending, in.InUseFetch, in.InUseCaseInsensitive);
      if (map != null) record.put ("InUse", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.CollectionStatus, in.CollectionStatusSort, in.CollectionStatusSortAscending, in.CollectionStatusFetch);
      if (map != null) record.put ("CollectionStatus", map);
      map = DataHelper.filterToMap (in.VipCode, in.VipCodeSort, in.VipCodeSortAscending, in.VipCodeFetch);
      if (map != null) record.put ("VipCode", map);
      map = DataHelper.filterToMap (in.PurchaseOrder, in.PurchaseOrderSort, in.PurchaseOrderSortAscending, in.PurchaseOrderFetch, in.PurchaseOrderCaseInsensitive);
      if (map != null) record.put ("PurchaseOrder", map);
      map = DataHelper.filterToMap (in.Codeword, in.CodewordSort, in.CodewordSortAscending, in.CodewordFetch, in.CodewordCaseInsensitive);
      if (map != null) record.put ("Codeword", map);
      map = DataHelper.filterToMap (in.Remark, in.RemarkSort, in.RemarkSortAscending, in.RemarkFetch, in.RemarkCaseInsensitive);
      if (map != null) record.put ("Remark", map);
      map = DataHelper.filterToMap (in.CustEmail, in.CustEmailSort, in.CustEmailSortAscending, in.CustEmailFetch, in.CustEmailCaseInsensitive);
      if (map != null) record.put ("CustEmail", map);
      map = DataHelper.filterToMap (in.StatementToEmail, in.StatementToEmailSort, in.StatementToEmailSortAscending, in.StatementToEmailFetch, in.StatementToEmailCaseInsensitive);
      if (map != null) record.put ("StatementToEmail", map);
      map = DataHelper.filterToMap (in.DateCreated, in.DateCreatedSort, in.DateCreatedSortAscending, in.DateCreatedFetch);
      if (map != null) record.put ("DateCreated", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.RevRcvCostCtr, in.RevRcvCostCtrSort, in.RevRcvCostCtrSortAscending, in.RevRcvCostCtrFetch);
      if (map != null) record.put ("RevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.OwningCostCtr, in.OwningCostCtrSort, in.OwningCostCtrSortAscending, in.OwningCostCtrFetch);
      if (map != null) record.put ("OwningCostCtr", map);
      map = DataHelper.filterToMap (in.AcctSegId, in.AcctSegIdSort, in.AcctSegIdSortAscending, in.AcctSegIdFetch);
      if (map != null) record.put ("AcctSegId", map);
      map = DataHelper.filterToMap (in.ChargeThreshold, in.ChargeThresholdSort, in.ChargeThresholdSortAscending, in.ChargeThresholdFetch);
      if (map != null) record.put ("ChargeThreshold", map);
      map = DataHelper.filterToMap (in.Threshold, in.ThresholdSort, in.ThresholdSortAscending, in.ThresholdFetch);
      if (map != null) record.put ("Threshold", map);
      map = DataHelper.filterToMap (in.CyclicalThreshold, in.CyclicalThresholdSort, in.CyclicalThresholdSortAscending, in.CyclicalThresholdFetch);
      if (map != null) record.put ("CyclicalThreshold", map);
      map = DataHelper.filterToMap (in.UsgAmtLimit, in.UsgAmtLimitSort, in.UsgAmtLimitSortAscending, in.UsgAmtLimitFetch);
      if (map != null) record.put ("UsgAmtLimit", map);
      map = DataHelper.filterToMap (in.UsgUnitsLimit, in.UsgUnitsLimitSort, in.UsgUnitsLimitSortAscending, in.UsgUnitsLimitFetch);
      if (map != null) record.put ("UsgUnitsLimit", map);
      map = DataHelper.filterToMap (in.RegulatoryId, in.RegulatoryIdSort, in.RegulatoryIdSortAscending, in.RegulatoryIdFetch);
      if (map != null) record.put ("RegulatoryId", map);
      map = DataHelper.filterToMap (in.GlobalContractStatus, in.GlobalContractStatusSort, in.GlobalContractStatusSortAscending, in.GlobalContractStatusFetch);
      if (map != null) record.put ("GlobalContractStatus", map);
      map = DataHelper.filterToMap (in.AltLname, in.AltLnameSort, in.AltLnameSortAscending, in.AltLnameFetch, in.AltLnameCaseInsensitive);
      if (map != null) record.put ("AltLname", map);
      map = DataHelper.filterToMap (in.AltFname, in.AltFnameSort, in.AltFnameSortAscending, in.AltFnameFetch, in.AltFnameCaseInsensitive);
      if (map != null) record.put ("AltFname", map);
      map = DataHelper.filterToMap (in.AltCompanyName, in.AltCompanyNameSort, in.AltCompanyNameSortAscending, in.AltCompanyNameFetch, in.AltCompanyNameCaseInsensitive);
      if (map != null) record.put ("AltCompanyName", map);
      map = DataHelper.filterToMap (in.Gender, in.GenderSort, in.GenderSortAscending, in.GenderFetch);
      if (map != null) record.put ("Gender", map);
      map = DataHelper.filterToMap (in.Dept, in.DeptSort, in.DeptSortAscending, in.DeptFetch, in.DeptCaseInsensitive);
      if (map != null) record.put ("Dept", map);
      map = DataHelper.filterToMap (in.Title, in.TitleSort, in.TitleSortAscending, in.TitleFetch, in.TitleCaseInsensitive);
      if (map != null) record.put ("Title", map);
      map = DataHelper.filterToMap (in.PaymentProfileId, in.PaymentProfileIdSort, in.PaymentProfileIdSortAscending, in.PaymentProfileIdFetch);
      if (map != null) record.put ("PaymentProfileId", map);
      map = DataHelper.filterToMap (in.AccountProcessFlag, in.AccountProcessFlagSort, in.AccountProcessFlagSortAscending, in.AccountProcessFlagFetch);
      if (map != null) record.put ("AccountProcessFlag", map);
      map = DataHelper.filterToMap (in.SdAgencyId, in.SdAgencyIdSort, in.SdAgencyIdSortAscending, in.SdAgencyIdFetch, in.SdAgencyIdCaseInsensitive);
      if (map != null) record.put ("SdAgencyId", map);
      map = DataHelper.filterToMap (in.CustomerLifetimeId, in.CustomerLifetimeIdSort, in.CustomerLifetimeIdSortAscending, in.CustomerLifetimeIdFetch);
      if (map != null) record.put ("CustomerLifetimeId", map);
      map = DataHelper.filterToMap (in.CustomerLifetimeId2, in.CustomerLifetimeId2Sort, in.CustomerLifetimeId2SortAscending, in.CustomerLifetimeId2Fetch);
      if (map != null) record.put ("CustomerLifetimeId2", map);
      map = DataHelper.filterToMap (in.AutoWriteoffStatus, in.AutoWriteoffStatusSort, in.AutoWriteoffStatusSortAscending, in.AutoWriteoffStatusFetch);
      if (map != null) record.put ("AutoWriteoffStatus", map);
    return record;
  }
  /** convert Map to BalanceLineItemAccountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceLineItemAccountObjectData the converted object
   */
  public static BalanceLineItemAccountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceLineItemAccountObjectData out = new BalanceLineItemAccountObjectData (BalanceLineItemObjectHelper.getObj (record));

    if ((obj = record.get ("CustBankSortCode")) != null)
    {
      out.CustBankSortCode = (String) obj;
    }
  
    if ((obj = record.get ("CustBankAccNum")) != null)
    {
      out.CustBankAccNum = (String) obj;
    }
  
    if ((obj = record.get ("AltBankAccNum")) != null)
    {
      out.AltBankAccNum = (String) obj;
    }
  
    if ((obj = record.get ("OwnrLname")) != null)
    {
      out.OwnrLname = (String) obj;
    }
  
    if ((obj = record.get ("OwnrFname")) != null)
    {
      out.OwnrFname = (String) obj;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("BankAgencyCode")) != null)
    {
      out.BankAgencyCode = (String) obj;
    }
  
    if ((obj = record.get ("BankAgencyName")) != null)
    {
      out.BankAgencyName = (String) obj;
    }
  
    if ((obj = record.get ("NewCustBankSortCode")) != null)
    {
      out.NewCustBankSortCode = (String) obj;
    }
  
    if ((obj = record.get ("BankCode")) != null)
    {
      out.BankCode = (String) obj;
    }
  
    if ((obj = record.get ("BankAccountType")) != null)
    {
      out.BankAccountType = (Integer) obj;
    }
  
    if ((obj = record.get ("BranchName")) != null)
    {
      out.BranchName = (String) obj;
    }
  
    if ((obj = record.get ("BranchCode")) != null)
    {
      out.BranchCode = (String) obj;
    }
  
    if ((obj = record.get ("ParentAccountExternalId")) != null)
    {
      out.ParentAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ParentAccountExternalIdType")) != null)
    {
      out.ParentAccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("HierarchyAccountExternalId")) != null)
    {
      out.HierarchyAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("HierarchyAccountExternalIdType")) != null)
    {
      out.HierarchyAccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentId")) != null)
    {
      out.ParentId = (Integer) obj;
    }
  
    if ((obj = record.get ("ChildCount")) != null)
    {
      out.ChildCount = (Integer) obj;
    }
  
    if ((obj = record.get ("HierarchyId")) != null)
    {
      out.HierarchyId = (Integer) obj;
    }
  
    if ((obj = record.get ("TieCode")) != null)
    {
      out.TieCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountType")) != null)
    {
      out.AccountType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountCategory")) != null)
    {
      out.AccountCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("PrevBillDate")) != null)
    {
      out.PrevBillDate = (Date) obj;
    }
  
    if ((obj = record.get ("NextBillDate")) != null)
    {
      out.NextBillDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillNamePre")) != null)
    {
      out.BillNamePre = (String) obj;
    }
  
    if ((obj = record.get ("BillFname")) != null)
    {
      out.BillFname = (String) obj;
    }
  
    if ((obj = record.get ("BillMinit")) != null)
    {
      out.BillMinit = (String) obj;
    }
  
    if ((obj = record.get ("BillLname")) != null)
    {
      out.BillLname = (String) obj;
    }
  
    if ((obj = record.get ("BillNameGeneration")) != null)
    {
      out.BillNameGeneration = (String) obj;
    }
  
    if ((obj = record.get ("BillTitle")) != null)
    {
      out.BillTitle = (String) obj;
    }
  
    if ((obj = record.get ("BillCompany")) != null)
    {
      out.BillCompany = (String) obj;
    }
  
    if ((obj = record.get ("CustAddress1")) != null)
    {
      out.CustAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("CustAddress2")) != null)
    {
      out.CustAddress2 = (String) obj;
    }
  
    if ((obj = record.get ("CustAddress3")) != null)
    {
      out.CustAddress3 = (String) obj;
    }
  
    if ((obj = record.get ("CustCity")) != null)
    {
      out.CustCity = (String) obj;
    }
  
    if ((obj = record.get ("CustState")) != null)
    {
      out.CustState = (String) obj;
    }
  
    if ((obj = record.get ("CustZip")) != null)
    {
      out.CustZip = (String) obj;
    }
  
    if ((obj = record.get ("CustCountryCode")) != null)
    {
      out.CustCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CustFranchiseTaxCode")) != null)
    {
      out.CustFranchiseTaxCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CustGeocode")) != null)
    {
      out.CustGeocode = (String) obj;
    }
  
    if ((obj = record.get ("CustCounty")) != null)
    {
      out.CustCounty = (String) obj;
    }
  
    if ((obj = record.get ("CustPhone1")) != null)
    {
      out.CustPhone1 = (String) obj;
    }
  
    if ((obj = record.get ("CustPhone2")) != null)
    {
      out.CustPhone2 = (String) obj;
    }
  
    if ((obj = record.get ("BillAddress1")) != null)
    {
      out.BillAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("BillAddress2")) != null)
    {
      out.BillAddress2 = (String) obj;
    }
  
    if ((obj = record.get ("BillAddress3")) != null)
    {
      out.BillAddress3 = (String) obj;
    }
  
    if ((obj = record.get ("BillCity")) != null)
    {
      out.BillCity = (String) obj;
    }
  
    if ((obj = record.get ("BillState")) != null)
    {
      out.BillState = (String) obj;
    }
  
    if ((obj = record.get ("BillZip")) != null)
    {
      out.BillZip = (String) obj;
    }
  
    if ((obj = record.get ("BillCountryCode")) != null)
    {
      out.BillCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillFranchiseTaxCode")) != null)
    {
      out.BillFranchiseTaxCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillCounty")) != null)
    {
      out.BillCounty = (String) obj;
    }
  
    if ((obj = record.get ("BillGeocode")) != null)
    {
      out.BillGeocode = (String) obj;
    }
  
    if ((obj = record.get ("Ssn")) != null)
    {
      out.Ssn = (String) obj;
    }
  
    if ((obj = record.get ("Contact1Name")) != null)
    {
      out.Contact1Name = (String) obj;
    }
  
    if ((obj = record.get ("Contact2Name")) != null)
    {
      out.Contact2Name = (String) obj;
    }
  
    if ((obj = record.get ("Contact1Phone")) != null)
    {
      out.Contact1Phone = (String) obj;
    }
  
    if ((obj = record.get ("Contact2Phone")) != null)
    {
      out.Contact2Phone = (String) obj;
    }
  
    if ((obj = record.get ("CustFaxno")) != null)
    {
      out.CustFaxno = (String) obj;
    }
  
    if ((obj = record.get ("StatementToFaxno")) != null)
    {
      out.StatementToFaxno = (String) obj;
    }
  
    if ((obj = record.get ("CreditThresh")) != null)
    {
      out.CreditThresh = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CredStatus")) != null)
    {
      out.CredStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("CreditRating")) != null)
    {
      out.CreditRating = (Integer) obj;
    }
  
    if ((obj = record.get ("DisconnectReason")) != null)
    {
      out.DisconnectReason = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscRcvOpt")) != null)
    {
      out.DiscRcvOpt = (Integer) obj;
    }
  
    if ((obj = record.get ("ThreshRef")) != null)
    {
      out.ThreshRef = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgGrpId")) != null)
    {
      out.MsgGrpId = (Integer) obj;
    }
  
    if ((obj = record.get ("InsertGrpId")) != null)
    {
      out.InsertGrpId = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClassDefault")) != null)
    {
      out.RateClassDefault = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClassSpecial")) != null)
    {
      out.RateClassSpecial = (Integer) obj;
    }
  
    if ((obj = record.get ("ExrateClass")) != null)
    {
      out.ExrateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanIdDiscount")) != null)
    {
      out.PlanIdDiscount = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanIdCredit")) != null)
    {
      out.PlanIdCredit = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountStatusDt")) != null)
    {
      out.AccountStatusDt = (Date) obj;
    }
  
    if ((obj = record.get ("DistrChan")) != null)
    {
      out.DistrChan = (String) obj;
    }
  
    if ((obj = record.get ("SalesCode")) != null)
    {
      out.SalesCode = (String) obj;
    }
  
    if ((obj = record.get ("MktCode")) != null)
    {
      out.MktCode = (Integer) obj;
    }
  
    if ((obj = record.get ("SicCode")) != null)
    {
      out.SicCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InUse")) != null)
    {
      out.InUse = (String) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("CollectionStatus")) != null)
    {
      out.CollectionStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("VipCode")) != null)
    {
      out.VipCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PurchaseOrder")) != null)
    {
      out.PurchaseOrder = (String) obj;
    }
  
    if ((obj = record.get ("Codeword")) != null)
    {
      out.Codeword = (String) obj;
    }
  
    if ((obj = record.get ("Remark")) != null)
    {
      out.Remark = (String) obj;
    }
  
    if ((obj = record.get ("CustEmail")) != null)
    {
      out.CustEmail = (String) obj;
    }
  
    if ((obj = record.get ("StatementToEmail")) != null)
    {
      out.StatementToEmail = (String) obj;
    }
  
    if ((obj = record.get ("DateCreated")) != null)
    {
      out.DateCreated = (Date) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("RevRcvCostCtr")) != null)
    {
      out.RevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("OwningCostCtr")) != null)
    {
      out.OwningCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("AcctSegId")) != null)
    {
      out.AcctSegId = (Integer) obj;
    }
  
    if ((obj = record.get ("ChargeThreshold")) != null)
    {
      out.ChargeThreshold = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Threshold")) != null)
    {
      out.Threshold = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CyclicalThreshold")) != null)
    {
      out.CyclicalThreshold = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UsgAmtLimit")) != null)
    {
      out.UsgAmtLimit = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UsgUnitsLimit")) != null)
    {
      out.UsgUnitsLimit = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RegulatoryId")) != null)
    {
      out.RegulatoryId = (Integer) obj;
    }
  
    if ((obj = record.get ("GlobalContractStatus")) != null)
    {
      out.GlobalContractStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("AltLname")) != null)
    {
      out.AltLname = (String) obj;
    }
  
    if ((obj = record.get ("AltFname")) != null)
    {
      out.AltFname = (String) obj;
    }
  
    if ((obj = record.get ("AltCompanyName")) != null)
    {
      out.AltCompanyName = (String) obj;
    }
  
    if ((obj = record.get ("Gender")) != null)
    {
      out.Gender = (Integer) obj;
    }
  
    if ((obj = record.get ("Dept")) != null)
    {
      out.Dept = (String) obj;
    }
  
    if ((obj = record.get ("Title")) != null)
    {
      out.Title = (String) obj;
    }
  
    if ((obj = record.get ("PaymentProfileId")) != null)
    {
      out.PaymentProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AccountProcessFlag")) != null)
    {
      out.AccountProcessFlag = (Integer) obj;
    }
  
    if ((obj = record.get ("SdAgencyId")) != null)
    {
      out.SdAgencyId = (String) obj;
    }
  
    if ((obj = record.get ("CustomerLifetimeId")) != null)
    {
      out.CustomerLifetimeId = (Integer) obj;
    }
  
    if ((obj = record.get ("CustomerLifetimeId2")) != null)
    {
      out.CustomerLifetimeId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("AutoWriteoffStatus")) != null)
    {
      out.AutoWriteoffStatus = (Integer) obj;
    }
      return out;
  }
  /** convert Map to BalanceLineItemAccountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceLineItemAccountObjectFilter the converted object
   */
  public static BalanceLineItemAccountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceLineItemAccountObjectFilter out = new BalanceLineItemAccountObjectFilter (BalanceLineItemObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map CustBankSortCodeMap = (Map)record.get("CustBankSortCode");
    Boolean CustBankSortCodeFetch = DataHelper.getFetch(CustBankSortCodeMap);
    Boolean CustBankSortCodeSortDir = DataHelper.getSortDirection(CustBankSortCodeMap);
    Integer CustBankSortCodeSortOrder = DataHelper.getSortOrder(CustBankSortCodeMap);
    if (CustBankSortCodeFetch != null) out.setCustBankSortCodeFetch(CustBankSortCodeFetch);
    if (CustBankSortCodeSortDir != null) out.setCustBankSortCodeSortDirection(CustBankSortCodeSortDir);
    if (CustBankSortCodeSortOrder != null) out.setCustBankSortCodeSortOrder(CustBankSortCodeSortOrder);

    Filter[] CustBankSortCodeFilter = DataHelper.mapToFilterArray(CustBankSortCodeMap, String.class);
    if (CustBankSortCodeFilter != null) {
      StringFilter[] CustBankSortCodeFilters = new StringFilter[CustBankSortCodeFilter.length];
      for (int i = 0; i < CustBankSortCodeFilters.length; i++) {
        CustBankSortCodeFilters[i] = (StringFilter)CustBankSortCodeFilter[i];
      }
      try {
        out.setCustBankSortCodeFilter(CustBankSortCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankAccNumMap = (Map)record.get("CustBankAccNum");
    Boolean CustBankAccNumFetch = DataHelper.getFetch(CustBankAccNumMap);
    Boolean CustBankAccNumSortDir = DataHelper.getSortDirection(CustBankAccNumMap);
    Integer CustBankAccNumSortOrder = DataHelper.getSortOrder(CustBankAccNumMap);
    if (CustBankAccNumFetch != null) out.setCustBankAccNumFetch(CustBankAccNumFetch);
    if (CustBankAccNumSortDir != null) out.setCustBankAccNumSortDirection(CustBankAccNumSortDir);
    if (CustBankAccNumSortOrder != null) out.setCustBankAccNumSortOrder(CustBankAccNumSortOrder);

    Filter[] CustBankAccNumFilter = DataHelper.mapToFilterArray(CustBankAccNumMap, String.class);
    if (CustBankAccNumFilter != null) {
      StringFilter[] CustBankAccNumFilters = new StringFilter[CustBankAccNumFilter.length];
      for (int i = 0; i < CustBankAccNumFilters.length; i++) {
        CustBankAccNumFilters[i] = (StringFilter)CustBankAccNumFilter[i];
      }
      try {
        out.setCustBankAccNumFilter(CustBankAccNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltBankAccNumMap = (Map)record.get("AltBankAccNum");
    Boolean AltBankAccNumFetch = DataHelper.getFetch(AltBankAccNumMap);
    Boolean AltBankAccNumSortDir = DataHelper.getSortDirection(AltBankAccNumMap);
    Integer AltBankAccNumSortOrder = DataHelper.getSortOrder(AltBankAccNumMap);
    if (AltBankAccNumFetch != null) out.setAltBankAccNumFetch(AltBankAccNumFetch);
    if (AltBankAccNumSortDir != null) out.setAltBankAccNumSortDirection(AltBankAccNumSortDir);
    if (AltBankAccNumSortOrder != null) out.setAltBankAccNumSortOrder(AltBankAccNumSortOrder);

    Filter[] AltBankAccNumFilter = DataHelper.mapToFilterArray(AltBankAccNumMap, String.class);
    if (AltBankAccNumFilter != null) {
      StringFilter[] AltBankAccNumFilters = new StringFilter[AltBankAccNumFilter.length];
      for (int i = 0; i < AltBankAccNumFilters.length; i++) {
        AltBankAccNumFilters[i] = (StringFilter)AltBankAccNumFilter[i];
      }
      try {
        out.setAltBankAccNumFilter(AltBankAccNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrLnameMap = (Map)record.get("OwnrLname");
    Boolean OwnrLnameFetch = DataHelper.getFetch(OwnrLnameMap);
    Boolean OwnrLnameSortDir = DataHelper.getSortDirection(OwnrLnameMap);
    Integer OwnrLnameSortOrder = DataHelper.getSortOrder(OwnrLnameMap);
    if (OwnrLnameFetch != null) out.setOwnrLnameFetch(OwnrLnameFetch);
    if (OwnrLnameSortDir != null) out.setOwnrLnameSortDirection(OwnrLnameSortDir);
    if (OwnrLnameSortOrder != null) out.setOwnrLnameSortOrder(OwnrLnameSortOrder);

    Filter[] OwnrLnameFilter = DataHelper.mapToFilterArray(OwnrLnameMap, String.class);
    if (OwnrLnameFilter != null) {
      StringFilter[] OwnrLnameFilters = new StringFilter[OwnrLnameFilter.length];
      for (int i = 0; i < OwnrLnameFilters.length; i++) {
        OwnrLnameFilters[i] = (StringFilter)OwnrLnameFilter[i];
      }
      try {
        out.setOwnrLnameFilter(OwnrLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrFnameMap = (Map)record.get("OwnrFname");
    Boolean OwnrFnameFetch = DataHelper.getFetch(OwnrFnameMap);
    Boolean OwnrFnameSortDir = DataHelper.getSortDirection(OwnrFnameMap);
    Integer OwnrFnameSortOrder = DataHelper.getSortOrder(OwnrFnameMap);
    if (OwnrFnameFetch != null) out.setOwnrFnameFetch(OwnrFnameFetch);
    if (OwnrFnameSortDir != null) out.setOwnrFnameSortDirection(OwnrFnameSortDir);
    if (OwnrFnameSortOrder != null) out.setOwnrFnameSortOrder(OwnrFnameSortOrder);

    Filter[] OwnrFnameFilter = DataHelper.mapToFilterArray(OwnrFnameMap, String.class);
    if (OwnrFnameFilter != null) {
      StringFilter[] OwnrFnameFilters = new StringFilter[OwnrFnameFilter.length];
      for (int i = 0; i < OwnrFnameFilters.length; i++) {
        OwnrFnameFilters[i] = (StringFilter)OwnrFnameFilter[i];
      }
      try {
        out.setOwnrFnameFilter(OwnrFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ClearingHouseIdMap = (Map)record.get("ClearingHouseId");
    Boolean ClearingHouseIdFetch = DataHelper.getFetch(ClearingHouseIdMap);
    Boolean ClearingHouseIdSortDir = DataHelper.getSortDirection(ClearingHouseIdMap);
    Integer ClearingHouseIdSortOrder = DataHelper.getSortOrder(ClearingHouseIdMap);
    if (ClearingHouseIdFetch != null) out.setClearingHouseIdFetch(ClearingHouseIdFetch);
    if (ClearingHouseIdSortDir != null) out.setClearingHouseIdSortDirection(ClearingHouseIdSortDir);
    if (ClearingHouseIdSortOrder != null) out.setClearingHouseIdSortOrder(ClearingHouseIdSortOrder);

    Filter[] ClearingHouseIdFilter = DataHelper.mapToFilterArray(ClearingHouseIdMap, String.class);
    if (ClearingHouseIdFilter != null) {
      StringFilter[] ClearingHouseIdFilters = new StringFilter[ClearingHouseIdFilter.length];
      for (int i = 0; i < ClearingHouseIdFilters.length; i++) {
        ClearingHouseIdFilters[i] = (StringFilter)ClearingHouseIdFilter[i];
      }
      try {
        out.setClearingHouseIdFilter(ClearingHouseIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAgencyCodeMap = (Map)record.get("BankAgencyCode");
    Boolean BankAgencyCodeFetch = DataHelper.getFetch(BankAgencyCodeMap);
    Boolean BankAgencyCodeSortDir = DataHelper.getSortDirection(BankAgencyCodeMap);
    Integer BankAgencyCodeSortOrder = DataHelper.getSortOrder(BankAgencyCodeMap);
    if (BankAgencyCodeFetch != null) out.setBankAgencyCodeFetch(BankAgencyCodeFetch);
    if (BankAgencyCodeSortDir != null) out.setBankAgencyCodeSortDirection(BankAgencyCodeSortDir);
    if (BankAgencyCodeSortOrder != null) out.setBankAgencyCodeSortOrder(BankAgencyCodeSortOrder);

    Filter[] BankAgencyCodeFilter = DataHelper.mapToFilterArray(BankAgencyCodeMap, String.class);
    if (BankAgencyCodeFilter != null) {
      StringFilter[] BankAgencyCodeFilters = new StringFilter[BankAgencyCodeFilter.length];
      for (int i = 0; i < BankAgencyCodeFilters.length; i++) {
        BankAgencyCodeFilters[i] = (StringFilter)BankAgencyCodeFilter[i];
      }
      try {
        out.setBankAgencyCodeFilter(BankAgencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAgencyNameMap = (Map)record.get("BankAgencyName");
    Boolean BankAgencyNameFetch = DataHelper.getFetch(BankAgencyNameMap);
    Boolean BankAgencyNameSortDir = DataHelper.getSortDirection(BankAgencyNameMap);
    Integer BankAgencyNameSortOrder = DataHelper.getSortOrder(BankAgencyNameMap);
    if (BankAgencyNameFetch != null) out.setBankAgencyNameFetch(BankAgencyNameFetch);
    if (BankAgencyNameSortDir != null) out.setBankAgencyNameSortDirection(BankAgencyNameSortDir);
    if (BankAgencyNameSortOrder != null) out.setBankAgencyNameSortOrder(BankAgencyNameSortOrder);

    Filter[] BankAgencyNameFilter = DataHelper.mapToFilterArray(BankAgencyNameMap, String.class);
    if (BankAgencyNameFilter != null) {
      StringFilter[] BankAgencyNameFilters = new StringFilter[BankAgencyNameFilter.length];
      for (int i = 0; i < BankAgencyNameFilters.length; i++) {
        BankAgencyNameFilters[i] = (StringFilter)BankAgencyNameFilter[i];
      }
      try {
        out.setBankAgencyNameFilter(BankAgencyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NewCustBankSortCodeMap = (Map)record.get("NewCustBankSortCode");
    Boolean NewCustBankSortCodeFetch = DataHelper.getFetch(NewCustBankSortCodeMap);
    Boolean NewCustBankSortCodeSortDir = DataHelper.getSortDirection(NewCustBankSortCodeMap);
    Integer NewCustBankSortCodeSortOrder = DataHelper.getSortOrder(NewCustBankSortCodeMap);
    if (NewCustBankSortCodeFetch != null) out.setNewCustBankSortCodeFetch(NewCustBankSortCodeFetch);
    if (NewCustBankSortCodeSortDir != null) out.setNewCustBankSortCodeSortDirection(NewCustBankSortCodeSortDir);
    if (NewCustBankSortCodeSortOrder != null) out.setNewCustBankSortCodeSortOrder(NewCustBankSortCodeSortOrder);

    Filter[] NewCustBankSortCodeFilter = DataHelper.mapToFilterArray(NewCustBankSortCodeMap, String.class);
    if (NewCustBankSortCodeFilter != null) {
      StringFilter[] NewCustBankSortCodeFilters = new StringFilter[NewCustBankSortCodeFilter.length];
      for (int i = 0; i < NewCustBankSortCodeFilters.length; i++) {
        NewCustBankSortCodeFilters[i] = (StringFilter)NewCustBankSortCodeFilter[i];
      }
      try {
        out.setNewCustBankSortCodeFilter(NewCustBankSortCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankCodeMap = (Map)record.get("BankCode");
    Boolean BankCodeFetch = DataHelper.getFetch(BankCodeMap);
    Boolean BankCodeSortDir = DataHelper.getSortDirection(BankCodeMap);
    Integer BankCodeSortOrder = DataHelper.getSortOrder(BankCodeMap);
    if (BankCodeFetch != null) out.setBankCodeFetch(BankCodeFetch);
    if (BankCodeSortDir != null) out.setBankCodeSortDirection(BankCodeSortDir);
    if (BankCodeSortOrder != null) out.setBankCodeSortOrder(BankCodeSortOrder);

    Filter[] BankCodeFilter = DataHelper.mapToFilterArray(BankCodeMap, String.class);
    if (BankCodeFilter != null) {
      StringFilter[] BankCodeFilters = new StringFilter[BankCodeFilter.length];
      for (int i = 0; i < BankCodeFilters.length; i++) {
        BankCodeFilters[i] = (StringFilter)BankCodeFilter[i];
      }
      try {
        out.setBankCodeFilter(BankCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAccountTypeMap = (Map)record.get("BankAccountType");
    Boolean BankAccountTypeFetch = DataHelper.getFetch(BankAccountTypeMap);
    Boolean BankAccountTypeSortDir = DataHelper.getSortDirection(BankAccountTypeMap);
    Integer BankAccountTypeSortOrder = DataHelper.getSortOrder(BankAccountTypeMap);
    if (BankAccountTypeFetch != null) out.setBankAccountTypeFetch(BankAccountTypeFetch);
    if (BankAccountTypeSortDir != null) out.setBankAccountTypeSortDirection(BankAccountTypeSortDir);
    if (BankAccountTypeSortOrder != null) out.setBankAccountTypeSortOrder(BankAccountTypeSortOrder);

    Filter[] BankAccountTypeFilter = DataHelper.mapToFilterArray(BankAccountTypeMap, Integer.class);
    if (BankAccountTypeFilter != null) {
      IntegerFilter[] BankAccountTypeFilters = new IntegerFilter[BankAccountTypeFilter.length];
      for (int i = 0; i < BankAccountTypeFilters.length; i++) {
        BankAccountTypeFilters[i] = (IntegerFilter)BankAccountTypeFilter[i];
      }
      try {
        out.setBankAccountTypeFilter(BankAccountTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BranchNameMap = (Map)record.get("BranchName");
    Boolean BranchNameFetch = DataHelper.getFetch(BranchNameMap);
    Boolean BranchNameSortDir = DataHelper.getSortDirection(BranchNameMap);
    Integer BranchNameSortOrder = DataHelper.getSortOrder(BranchNameMap);
    if (BranchNameFetch != null) out.setBranchNameFetch(BranchNameFetch);
    if (BranchNameSortDir != null) out.setBranchNameSortDirection(BranchNameSortDir);
    if (BranchNameSortOrder != null) out.setBranchNameSortOrder(BranchNameSortOrder);

    Filter[] BranchNameFilter = DataHelper.mapToFilterArray(BranchNameMap, String.class);
    if (BranchNameFilter != null) {
      StringFilter[] BranchNameFilters = new StringFilter[BranchNameFilter.length];
      for (int i = 0; i < BranchNameFilters.length; i++) {
        BranchNameFilters[i] = (StringFilter)BranchNameFilter[i];
      }
      try {
        out.setBranchNameFilter(BranchNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BranchCodeMap = (Map)record.get("BranchCode");
    Boolean BranchCodeFetch = DataHelper.getFetch(BranchCodeMap);
    Boolean BranchCodeSortDir = DataHelper.getSortDirection(BranchCodeMap);
    Integer BranchCodeSortOrder = DataHelper.getSortOrder(BranchCodeMap);
    if (BranchCodeFetch != null) out.setBranchCodeFetch(BranchCodeFetch);
    if (BranchCodeSortDir != null) out.setBranchCodeSortDirection(BranchCodeSortDir);
    if (BranchCodeSortOrder != null) out.setBranchCodeSortOrder(BranchCodeSortOrder);

    Filter[] BranchCodeFilter = DataHelper.mapToFilterArray(BranchCodeMap, String.class);
    if (BranchCodeFilter != null) {
      StringFilter[] BranchCodeFilters = new StringFilter[BranchCodeFilter.length];
      for (int i = 0; i < BranchCodeFilters.length; i++) {
        BranchCodeFilters[i] = (StringFilter)BranchCodeFilter[i];
      }
      try {
        out.setBranchCodeFilter(BranchCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAccountExternalIdMap = (Map)record.get("ParentAccountExternalId");
    Boolean ParentAccountExternalIdFetch = DataHelper.getFetch(ParentAccountExternalIdMap);
    Boolean ParentAccountExternalIdSortDir = DataHelper.getSortDirection(ParentAccountExternalIdMap);
    Integer ParentAccountExternalIdSortOrder = DataHelper.getSortOrder(ParentAccountExternalIdMap);
    if (ParentAccountExternalIdFetch != null) out.setParentAccountExternalIdFetch(ParentAccountExternalIdFetch);
    if (ParentAccountExternalIdSortDir != null) out.setParentAccountExternalIdSortDirection(ParentAccountExternalIdSortDir);
    if (ParentAccountExternalIdSortOrder != null) out.setParentAccountExternalIdSortOrder(ParentAccountExternalIdSortOrder);

    Filter[] ParentAccountExternalIdFilter = DataHelper.mapToFilterArray(ParentAccountExternalIdMap, String.class);
    if (ParentAccountExternalIdFilter != null) {
      StringFilter[] ParentAccountExternalIdFilters = new StringFilter[ParentAccountExternalIdFilter.length];
      for (int i = 0; i < ParentAccountExternalIdFilters.length; i++) {
        ParentAccountExternalIdFilters[i] = (StringFilter)ParentAccountExternalIdFilter[i];
      }
      try {
        out.setParentAccountExternalIdFilter(ParentAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAccountExternalIdTypeMap = (Map)record.get("ParentAccountExternalIdType");
    Boolean ParentAccountExternalIdTypeFetch = DataHelper.getFetch(ParentAccountExternalIdTypeMap);
    Boolean ParentAccountExternalIdTypeSortDir = DataHelper.getSortDirection(ParentAccountExternalIdTypeMap);
    Integer ParentAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(ParentAccountExternalIdTypeMap);
    if (ParentAccountExternalIdTypeFetch != null) out.setParentAccountExternalIdTypeFetch(ParentAccountExternalIdTypeFetch);
    if (ParentAccountExternalIdTypeSortDir != null) out.setParentAccountExternalIdTypeSortDirection(ParentAccountExternalIdTypeSortDir);
    if (ParentAccountExternalIdTypeSortOrder != null) out.setParentAccountExternalIdTypeSortOrder(ParentAccountExternalIdTypeSortOrder);

    Filter[] ParentAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(ParentAccountExternalIdTypeMap, Integer.class);
    if (ParentAccountExternalIdTypeFilter != null) {
      IntegerFilter[] ParentAccountExternalIdTypeFilters = new IntegerFilter[ParentAccountExternalIdTypeFilter.length];
      for (int i = 0; i < ParentAccountExternalIdTypeFilters.length; i++) {
        ParentAccountExternalIdTypeFilters[i] = (IntegerFilter)ParentAccountExternalIdTypeFilter[i];
      }
      try {
        out.setParentAccountExternalIdTypeFilter(ParentAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAccountExternalIdMap = (Map)record.get("HierarchyAccountExternalId");
    Boolean HierarchyAccountExternalIdFetch = DataHelper.getFetch(HierarchyAccountExternalIdMap);
    Boolean HierarchyAccountExternalIdSortDir = DataHelper.getSortDirection(HierarchyAccountExternalIdMap);
    Integer HierarchyAccountExternalIdSortOrder = DataHelper.getSortOrder(HierarchyAccountExternalIdMap);
    if (HierarchyAccountExternalIdFetch != null) out.setHierarchyAccountExternalIdFetch(HierarchyAccountExternalIdFetch);
    if (HierarchyAccountExternalIdSortDir != null) out.setHierarchyAccountExternalIdSortDirection(HierarchyAccountExternalIdSortDir);
    if (HierarchyAccountExternalIdSortOrder != null) out.setHierarchyAccountExternalIdSortOrder(HierarchyAccountExternalIdSortOrder);

    Filter[] HierarchyAccountExternalIdFilter = DataHelper.mapToFilterArray(HierarchyAccountExternalIdMap, String.class);
    if (HierarchyAccountExternalIdFilter != null) {
      StringFilter[] HierarchyAccountExternalIdFilters = new StringFilter[HierarchyAccountExternalIdFilter.length];
      for (int i = 0; i < HierarchyAccountExternalIdFilters.length; i++) {
        HierarchyAccountExternalIdFilters[i] = (StringFilter)HierarchyAccountExternalIdFilter[i];
      }
      try {
        out.setHierarchyAccountExternalIdFilter(HierarchyAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAccountExternalIdTypeMap = (Map)record.get("HierarchyAccountExternalIdType");
    Boolean HierarchyAccountExternalIdTypeFetch = DataHelper.getFetch(HierarchyAccountExternalIdTypeMap);
    Boolean HierarchyAccountExternalIdTypeSortDir = DataHelper.getSortDirection(HierarchyAccountExternalIdTypeMap);
    Integer HierarchyAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(HierarchyAccountExternalIdTypeMap);
    if (HierarchyAccountExternalIdTypeFetch != null) out.setHierarchyAccountExternalIdTypeFetch(HierarchyAccountExternalIdTypeFetch);
    if (HierarchyAccountExternalIdTypeSortDir != null) out.setHierarchyAccountExternalIdTypeSortDirection(HierarchyAccountExternalIdTypeSortDir);
    if (HierarchyAccountExternalIdTypeSortOrder != null) out.setHierarchyAccountExternalIdTypeSortOrder(HierarchyAccountExternalIdTypeSortOrder);

    Filter[] HierarchyAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(HierarchyAccountExternalIdTypeMap, Integer.class);
    if (HierarchyAccountExternalIdTypeFilter != null) {
      IntegerFilter[] HierarchyAccountExternalIdTypeFilters = new IntegerFilter[HierarchyAccountExternalIdTypeFilter.length];
      for (int i = 0; i < HierarchyAccountExternalIdTypeFilters.length; i++) {
        HierarchyAccountExternalIdTypeFilters[i] = (IntegerFilter)HierarchyAccountExternalIdTypeFilter[i];
      }
      try {
        out.setHierarchyAccountExternalIdTypeFilter(HierarchyAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentIdMap = (Map)record.get("ParentId");
    Boolean ParentIdFetch = DataHelper.getFetch(ParentIdMap);
    Boolean ParentIdSortDir = DataHelper.getSortDirection(ParentIdMap);
    Integer ParentIdSortOrder = DataHelper.getSortOrder(ParentIdMap);
    if (ParentIdFetch != null) out.setParentIdFetch(ParentIdFetch);
    if (ParentIdSortDir != null) out.setParentIdSortDirection(ParentIdSortDir);
    if (ParentIdSortOrder != null) out.setParentIdSortOrder(ParentIdSortOrder);

    Filter[] ParentIdFilter = DataHelper.mapToFilterArray(ParentIdMap, Integer.class);
    if (ParentIdFilter != null) {
      IntegerFilter[] ParentIdFilters = new IntegerFilter[ParentIdFilter.length];
      for (int i = 0; i < ParentIdFilters.length; i++) {
        ParentIdFilters[i] = (IntegerFilter)ParentIdFilter[i];
      }
      try {
        out.setParentIdFilter(ParentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChildCountMap = (Map)record.get("ChildCount");
    Boolean ChildCountFetch = DataHelper.getFetch(ChildCountMap);
    Boolean ChildCountSortDir = DataHelper.getSortDirection(ChildCountMap);
    Integer ChildCountSortOrder = DataHelper.getSortOrder(ChildCountMap);
    if (ChildCountFetch != null) out.setChildCountFetch(ChildCountFetch);
    if (ChildCountSortDir != null) out.setChildCountSortDirection(ChildCountSortDir);
    if (ChildCountSortOrder != null) out.setChildCountSortOrder(ChildCountSortOrder);

    Filter[] ChildCountFilter = DataHelper.mapToFilterArray(ChildCountMap, Integer.class);
    if (ChildCountFilter != null) {
      IntegerFilter[] ChildCountFilters = new IntegerFilter[ChildCountFilter.length];
      for (int i = 0; i < ChildCountFilters.length; i++) {
        ChildCountFilters[i] = (IntegerFilter)ChildCountFilter[i];
      }
      try {
        out.setChildCountFilter(ChildCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyIdMap = (Map)record.get("HierarchyId");
    Boolean HierarchyIdFetch = DataHelper.getFetch(HierarchyIdMap);
    Boolean HierarchyIdSortDir = DataHelper.getSortDirection(HierarchyIdMap);
    Integer HierarchyIdSortOrder = DataHelper.getSortOrder(HierarchyIdMap);
    if (HierarchyIdFetch != null) out.setHierarchyIdFetch(HierarchyIdFetch);
    if (HierarchyIdSortDir != null) out.setHierarchyIdSortDirection(HierarchyIdSortDir);
    if (HierarchyIdSortOrder != null) out.setHierarchyIdSortOrder(HierarchyIdSortOrder);

    Filter[] HierarchyIdFilter = DataHelper.mapToFilterArray(HierarchyIdMap, Integer.class);
    if (HierarchyIdFilter != null) {
      IntegerFilter[] HierarchyIdFilters = new IntegerFilter[HierarchyIdFilter.length];
      for (int i = 0; i < HierarchyIdFilters.length; i++) {
        HierarchyIdFilters[i] = (IntegerFilter)HierarchyIdFilter[i];
      }
      try {
        out.setHierarchyIdFilter(HierarchyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TieCodeMap = (Map)record.get("TieCode");
    Boolean TieCodeFetch = DataHelper.getFetch(TieCodeMap);
    Boolean TieCodeSortDir = DataHelper.getSortDirection(TieCodeMap);
    Integer TieCodeSortOrder = DataHelper.getSortOrder(TieCodeMap);
    if (TieCodeFetch != null) out.setTieCodeFetch(TieCodeFetch);
    if (TieCodeSortDir != null) out.setTieCodeSortDirection(TieCodeSortDir);
    if (TieCodeSortOrder != null) out.setTieCodeSortOrder(TieCodeSortOrder);

    Filter[] TieCodeFilter = DataHelper.mapToFilterArray(TieCodeMap, Integer.class);
    if (TieCodeFilter != null) {
      IntegerFilter[] TieCodeFilters = new IntegerFilter[TieCodeFilter.length];
      for (int i = 0; i < TieCodeFilters.length; i++) {
        TieCodeFilters[i] = (IntegerFilter)TieCodeFilter[i];
      }
      try {
        out.setTieCodeFilter(TieCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountTypeMap = (Map)record.get("AccountType");
    Boolean AccountTypeFetch = DataHelper.getFetch(AccountTypeMap);
    Boolean AccountTypeSortDir = DataHelper.getSortDirection(AccountTypeMap);
    Integer AccountTypeSortOrder = DataHelper.getSortOrder(AccountTypeMap);
    if (AccountTypeFetch != null) out.setAccountTypeFetch(AccountTypeFetch);
    if (AccountTypeSortDir != null) out.setAccountTypeSortDirection(AccountTypeSortDir);
    if (AccountTypeSortOrder != null) out.setAccountTypeSortOrder(AccountTypeSortOrder);

    Filter[] AccountTypeFilter = DataHelper.mapToFilterArray(AccountTypeMap, Integer.class);
    if (AccountTypeFilter != null) {
      IntegerFilter[] AccountTypeFilters = new IntegerFilter[AccountTypeFilter.length];
      for (int i = 0; i < AccountTypeFilters.length; i++) {
        AccountTypeFilters[i] = (IntegerFilter)AccountTypeFilter[i];
      }
      try {
        out.setAccountTypeFilter(AccountTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountCategoryMap = (Map)record.get("AccountCategory");
    Boolean AccountCategoryFetch = DataHelper.getFetch(AccountCategoryMap);
    Boolean AccountCategorySortDir = DataHelper.getSortDirection(AccountCategoryMap);
    Integer AccountCategorySortOrder = DataHelper.getSortOrder(AccountCategoryMap);
    if (AccountCategoryFetch != null) out.setAccountCategoryFetch(AccountCategoryFetch);
    if (AccountCategorySortDir != null) out.setAccountCategorySortDirection(AccountCategorySortDir);
    if (AccountCategorySortOrder != null) out.setAccountCategorySortOrder(AccountCategorySortOrder);

    Filter[] AccountCategoryFilter = DataHelper.mapToFilterArray(AccountCategoryMap, Integer.class);
    if (AccountCategoryFilter != null) {
      IntegerFilter[] AccountCategoryFilters = new IntegerFilter[AccountCategoryFilter.length];
      for (int i = 0; i < AccountCategoryFilters.length; i++) {
        AccountCategoryFilters[i] = (IntegerFilter)AccountCategoryFilter[i];
      }
      try {
        out.setAccountCategoryFilter(AccountCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevBillDateMap = (Map)record.get("PrevBillDate");
    Boolean PrevBillDateFetch = DataHelper.getFetch(PrevBillDateMap);
    Boolean PrevBillDateSortDir = DataHelper.getSortDirection(PrevBillDateMap);
    Integer PrevBillDateSortOrder = DataHelper.getSortOrder(PrevBillDateMap);
    if (PrevBillDateFetch != null) out.setPrevBillDateFetch(PrevBillDateFetch);
    if (PrevBillDateSortDir != null) out.setPrevBillDateSortDirection(PrevBillDateSortDir);
    if (PrevBillDateSortOrder != null) out.setPrevBillDateSortOrder(PrevBillDateSortOrder);

    Filter[] PrevBillDateFilter = DataHelper.mapToFilterArray(PrevBillDateMap, Date.class);
    if (PrevBillDateFilter != null) {
      DateFilter[] PrevBillDateFilters = new DateFilter[PrevBillDateFilter.length];
      for (int i = 0; i < PrevBillDateFilters.length; i++) {
        PrevBillDateFilters[i] = (DateFilter)PrevBillDateFilter[i];
      }
      try {
        out.setPrevBillDateFilter(PrevBillDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NextBillDateMap = (Map)record.get("NextBillDate");
    Boolean NextBillDateFetch = DataHelper.getFetch(NextBillDateMap);
    Boolean NextBillDateSortDir = DataHelper.getSortDirection(NextBillDateMap);
    Integer NextBillDateSortOrder = DataHelper.getSortOrder(NextBillDateMap);
    if (NextBillDateFetch != null) out.setNextBillDateFetch(NextBillDateFetch);
    if (NextBillDateSortDir != null) out.setNextBillDateSortDirection(NextBillDateSortDir);
    if (NextBillDateSortOrder != null) out.setNextBillDateSortOrder(NextBillDateSortOrder);

    Filter[] NextBillDateFilter = DataHelper.mapToFilterArray(NextBillDateMap, Date.class);
    if (NextBillDateFilter != null) {
      DateFilter[] NextBillDateFilters = new DateFilter[NextBillDateFilter.length];
      for (int i = 0; i < NextBillDateFilters.length; i++) {
        NextBillDateFilters[i] = (DateFilter)NextBillDateFilter[i];
      }
      try {
        out.setNextBillDateFilter(NextBillDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillNamePreMap = (Map)record.get("BillNamePre");
    Boolean BillNamePreFetch = DataHelper.getFetch(BillNamePreMap);
    Boolean BillNamePreSortDir = DataHelper.getSortDirection(BillNamePreMap);
    Integer BillNamePreSortOrder = DataHelper.getSortOrder(BillNamePreMap);
    if (BillNamePreFetch != null) out.setBillNamePreFetch(BillNamePreFetch);
    if (BillNamePreSortDir != null) out.setBillNamePreSortDirection(BillNamePreSortDir);
    if (BillNamePreSortOrder != null) out.setBillNamePreSortOrder(BillNamePreSortOrder);

    Filter[] BillNamePreFilter = DataHelper.mapToFilterArray(BillNamePreMap, String.class);
    if (BillNamePreFilter != null) {
      StringFilter[] BillNamePreFilters = new StringFilter[BillNamePreFilter.length];
      for (int i = 0; i < BillNamePreFilters.length; i++) {
        BillNamePreFilters[i] = (StringFilter)BillNamePreFilter[i];
      }
      try {
        out.setBillNamePreFilter(BillNamePreFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFnameMap = (Map)record.get("BillFname");
    Boolean BillFnameFetch = DataHelper.getFetch(BillFnameMap);
    Boolean BillFnameSortDir = DataHelper.getSortDirection(BillFnameMap);
    Integer BillFnameSortOrder = DataHelper.getSortOrder(BillFnameMap);
    if (BillFnameFetch != null) out.setBillFnameFetch(BillFnameFetch);
    if (BillFnameSortDir != null) out.setBillFnameSortDirection(BillFnameSortDir);
    if (BillFnameSortOrder != null) out.setBillFnameSortOrder(BillFnameSortOrder);

    Filter[] BillFnameFilter = DataHelper.mapToFilterArray(BillFnameMap, String.class);
    if (BillFnameFilter != null) {
      StringFilter[] BillFnameFilters = new StringFilter[BillFnameFilter.length];
      for (int i = 0; i < BillFnameFilters.length; i++) {
        BillFnameFilters[i] = (StringFilter)BillFnameFilter[i];
      }
      try {
        out.setBillFnameFilter(BillFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillMinitMap = (Map)record.get("BillMinit");
    Boolean BillMinitFetch = DataHelper.getFetch(BillMinitMap);
    Boolean BillMinitSortDir = DataHelper.getSortDirection(BillMinitMap);
    Integer BillMinitSortOrder = DataHelper.getSortOrder(BillMinitMap);
    if (BillMinitFetch != null) out.setBillMinitFetch(BillMinitFetch);
    if (BillMinitSortDir != null) out.setBillMinitSortDirection(BillMinitSortDir);
    if (BillMinitSortOrder != null) out.setBillMinitSortOrder(BillMinitSortOrder);

    Filter[] BillMinitFilter = DataHelper.mapToFilterArray(BillMinitMap, String.class);
    if (BillMinitFilter != null) {
      StringFilter[] BillMinitFilters = new StringFilter[BillMinitFilter.length];
      for (int i = 0; i < BillMinitFilters.length; i++) {
        BillMinitFilters[i] = (StringFilter)BillMinitFilter[i];
      }
      try {
        out.setBillMinitFilter(BillMinitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillLnameMap = (Map)record.get("BillLname");
    Boolean BillLnameFetch = DataHelper.getFetch(BillLnameMap);
    Boolean BillLnameSortDir = DataHelper.getSortDirection(BillLnameMap);
    Integer BillLnameSortOrder = DataHelper.getSortOrder(BillLnameMap);
    if (BillLnameFetch != null) out.setBillLnameFetch(BillLnameFetch);
    if (BillLnameSortDir != null) out.setBillLnameSortDirection(BillLnameSortDir);
    if (BillLnameSortOrder != null) out.setBillLnameSortOrder(BillLnameSortOrder);

    Filter[] BillLnameFilter = DataHelper.mapToFilterArray(BillLnameMap, String.class);
    if (BillLnameFilter != null) {
      StringFilter[] BillLnameFilters = new StringFilter[BillLnameFilter.length];
      for (int i = 0; i < BillLnameFilters.length; i++) {
        BillLnameFilters[i] = (StringFilter)BillLnameFilter[i];
      }
      try {
        out.setBillLnameFilter(BillLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillNameGenerationMap = (Map)record.get("BillNameGeneration");
    Boolean BillNameGenerationFetch = DataHelper.getFetch(BillNameGenerationMap);
    Boolean BillNameGenerationSortDir = DataHelper.getSortDirection(BillNameGenerationMap);
    Integer BillNameGenerationSortOrder = DataHelper.getSortOrder(BillNameGenerationMap);
    if (BillNameGenerationFetch != null) out.setBillNameGenerationFetch(BillNameGenerationFetch);
    if (BillNameGenerationSortDir != null) out.setBillNameGenerationSortDirection(BillNameGenerationSortDir);
    if (BillNameGenerationSortOrder != null) out.setBillNameGenerationSortOrder(BillNameGenerationSortOrder);

    Filter[] BillNameGenerationFilter = DataHelper.mapToFilterArray(BillNameGenerationMap, String.class);
    if (BillNameGenerationFilter != null) {
      StringFilter[] BillNameGenerationFilters = new StringFilter[BillNameGenerationFilter.length];
      for (int i = 0; i < BillNameGenerationFilters.length; i++) {
        BillNameGenerationFilters[i] = (StringFilter)BillNameGenerationFilter[i];
      }
      try {
        out.setBillNameGenerationFilter(BillNameGenerationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillTitleMap = (Map)record.get("BillTitle");
    Boolean BillTitleFetch = DataHelper.getFetch(BillTitleMap);
    Boolean BillTitleSortDir = DataHelper.getSortDirection(BillTitleMap);
    Integer BillTitleSortOrder = DataHelper.getSortOrder(BillTitleMap);
    if (BillTitleFetch != null) out.setBillTitleFetch(BillTitleFetch);
    if (BillTitleSortDir != null) out.setBillTitleSortDirection(BillTitleSortDir);
    if (BillTitleSortOrder != null) out.setBillTitleSortOrder(BillTitleSortOrder);

    Filter[] BillTitleFilter = DataHelper.mapToFilterArray(BillTitleMap, String.class);
    if (BillTitleFilter != null) {
      StringFilter[] BillTitleFilters = new StringFilter[BillTitleFilter.length];
      for (int i = 0; i < BillTitleFilters.length; i++) {
        BillTitleFilters[i] = (StringFilter)BillTitleFilter[i];
      }
      try {
        out.setBillTitleFilter(BillTitleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyMap = (Map)record.get("BillCompany");
    Boolean BillCompanyFetch = DataHelper.getFetch(BillCompanyMap);
    Boolean BillCompanySortDir = DataHelper.getSortDirection(BillCompanyMap);
    Integer BillCompanySortOrder = DataHelper.getSortOrder(BillCompanyMap);
    if (BillCompanyFetch != null) out.setBillCompanyFetch(BillCompanyFetch);
    if (BillCompanySortDir != null) out.setBillCompanySortDirection(BillCompanySortDir);
    if (BillCompanySortOrder != null) out.setBillCompanySortOrder(BillCompanySortOrder);

    Filter[] BillCompanyFilter = DataHelper.mapToFilterArray(BillCompanyMap, String.class);
    if (BillCompanyFilter != null) {
      StringFilter[] BillCompanyFilters = new StringFilter[BillCompanyFilter.length];
      for (int i = 0; i < BillCompanyFilters.length; i++) {
        BillCompanyFilters[i] = (StringFilter)BillCompanyFilter[i];
      }
      try {
        out.setBillCompanyFilter(BillCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustAddress1Map = (Map)record.get("CustAddress1");
    Boolean CustAddress1Fetch = DataHelper.getFetch(CustAddress1Map);
    Boolean CustAddress1SortDir = DataHelper.getSortDirection(CustAddress1Map);
    Integer CustAddress1SortOrder = DataHelper.getSortOrder(CustAddress1Map);
    if (CustAddress1Fetch != null) out.setCustAddress1Fetch(CustAddress1Fetch);
    if (CustAddress1SortDir != null) out.setCustAddress1SortDirection(CustAddress1SortDir);
    if (CustAddress1SortOrder != null) out.setCustAddress1SortOrder(CustAddress1SortOrder);

    Filter[] CustAddress1Filter = DataHelper.mapToFilterArray(CustAddress1Map, String.class);
    if (CustAddress1Filter != null) {
      StringFilter[] CustAddress1Filters = new StringFilter[CustAddress1Filter.length];
      for (int i = 0; i < CustAddress1Filters.length; i++) {
        CustAddress1Filters[i] = (StringFilter)CustAddress1Filter[i];
      }
      try {
        out.setCustAddress1Filter(CustAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustAddress2Map = (Map)record.get("CustAddress2");
    Boolean CustAddress2Fetch = DataHelper.getFetch(CustAddress2Map);
    Boolean CustAddress2SortDir = DataHelper.getSortDirection(CustAddress2Map);
    Integer CustAddress2SortOrder = DataHelper.getSortOrder(CustAddress2Map);
    if (CustAddress2Fetch != null) out.setCustAddress2Fetch(CustAddress2Fetch);
    if (CustAddress2SortDir != null) out.setCustAddress2SortDirection(CustAddress2SortDir);
    if (CustAddress2SortOrder != null) out.setCustAddress2SortOrder(CustAddress2SortOrder);

    Filter[] CustAddress2Filter = DataHelper.mapToFilterArray(CustAddress2Map, String.class);
    if (CustAddress2Filter != null) {
      StringFilter[] CustAddress2Filters = new StringFilter[CustAddress2Filter.length];
      for (int i = 0; i < CustAddress2Filters.length; i++) {
        CustAddress2Filters[i] = (StringFilter)CustAddress2Filter[i];
      }
      try {
        out.setCustAddress2Filter(CustAddress2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustAddress3Map = (Map)record.get("CustAddress3");
    Boolean CustAddress3Fetch = DataHelper.getFetch(CustAddress3Map);
    Boolean CustAddress3SortDir = DataHelper.getSortDirection(CustAddress3Map);
    Integer CustAddress3SortOrder = DataHelper.getSortOrder(CustAddress3Map);
    if (CustAddress3Fetch != null) out.setCustAddress3Fetch(CustAddress3Fetch);
    if (CustAddress3SortDir != null) out.setCustAddress3SortDirection(CustAddress3SortDir);
    if (CustAddress3SortOrder != null) out.setCustAddress3SortOrder(CustAddress3SortOrder);

    Filter[] CustAddress3Filter = DataHelper.mapToFilterArray(CustAddress3Map, String.class);
    if (CustAddress3Filter != null) {
      StringFilter[] CustAddress3Filters = new StringFilter[CustAddress3Filter.length];
      for (int i = 0; i < CustAddress3Filters.length; i++) {
        CustAddress3Filters[i] = (StringFilter)CustAddress3Filter[i];
      }
      try {
        out.setCustAddress3Filter(CustAddress3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustCityMap = (Map)record.get("CustCity");
    Boolean CustCityFetch = DataHelper.getFetch(CustCityMap);
    Boolean CustCitySortDir = DataHelper.getSortDirection(CustCityMap);
    Integer CustCitySortOrder = DataHelper.getSortOrder(CustCityMap);
    if (CustCityFetch != null) out.setCustCityFetch(CustCityFetch);
    if (CustCitySortDir != null) out.setCustCitySortDirection(CustCitySortDir);
    if (CustCitySortOrder != null) out.setCustCitySortOrder(CustCitySortOrder);

    Filter[] CustCityFilter = DataHelper.mapToFilterArray(CustCityMap, String.class);
    if (CustCityFilter != null) {
      StringFilter[] CustCityFilters = new StringFilter[CustCityFilter.length];
      for (int i = 0; i < CustCityFilters.length; i++) {
        CustCityFilters[i] = (StringFilter)CustCityFilter[i];
      }
      try {
        out.setCustCityFilter(CustCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustStateMap = (Map)record.get("CustState");
    Boolean CustStateFetch = DataHelper.getFetch(CustStateMap);
    Boolean CustStateSortDir = DataHelper.getSortDirection(CustStateMap);
    Integer CustStateSortOrder = DataHelper.getSortOrder(CustStateMap);
    if (CustStateFetch != null) out.setCustStateFetch(CustStateFetch);
    if (CustStateSortDir != null) out.setCustStateSortDirection(CustStateSortDir);
    if (CustStateSortOrder != null) out.setCustStateSortOrder(CustStateSortOrder);

    Filter[] CustStateFilter = DataHelper.mapToFilterArray(CustStateMap, String.class);
    if (CustStateFilter != null) {
      StringFilter[] CustStateFilters = new StringFilter[CustStateFilter.length];
      for (int i = 0; i < CustStateFilters.length; i++) {
        CustStateFilters[i] = (StringFilter)CustStateFilter[i];
      }
      try {
        out.setCustStateFilter(CustStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustZipMap = (Map)record.get("CustZip");
    Boolean CustZipFetch = DataHelper.getFetch(CustZipMap);
    Boolean CustZipSortDir = DataHelper.getSortDirection(CustZipMap);
    Integer CustZipSortOrder = DataHelper.getSortOrder(CustZipMap);
    if (CustZipFetch != null) out.setCustZipFetch(CustZipFetch);
    if (CustZipSortDir != null) out.setCustZipSortDirection(CustZipSortDir);
    if (CustZipSortOrder != null) out.setCustZipSortOrder(CustZipSortOrder);

    Filter[] CustZipFilter = DataHelper.mapToFilterArray(CustZipMap, String.class);
    if (CustZipFilter != null) {
      StringFilter[] CustZipFilters = new StringFilter[CustZipFilter.length];
      for (int i = 0; i < CustZipFilters.length; i++) {
        CustZipFilters[i] = (StringFilter)CustZipFilter[i];
      }
      try {
        out.setCustZipFilter(CustZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustCountryCodeMap = (Map)record.get("CustCountryCode");
    Boolean CustCountryCodeFetch = DataHelper.getFetch(CustCountryCodeMap);
    Boolean CustCountryCodeSortDir = DataHelper.getSortDirection(CustCountryCodeMap);
    Integer CustCountryCodeSortOrder = DataHelper.getSortOrder(CustCountryCodeMap);
    if (CustCountryCodeFetch != null) out.setCustCountryCodeFetch(CustCountryCodeFetch);
    if (CustCountryCodeSortDir != null) out.setCustCountryCodeSortDirection(CustCountryCodeSortDir);
    if (CustCountryCodeSortOrder != null) out.setCustCountryCodeSortOrder(CustCountryCodeSortOrder);

    Filter[] CustCountryCodeFilter = DataHelper.mapToFilterArray(CustCountryCodeMap, Integer.class);
    if (CustCountryCodeFilter != null) {
      IntegerFilter[] CustCountryCodeFilters = new IntegerFilter[CustCountryCodeFilter.length];
      for (int i = 0; i < CustCountryCodeFilters.length; i++) {
        CustCountryCodeFilters[i] = (IntegerFilter)CustCountryCodeFilter[i];
      }
      try {
        out.setCustCountryCodeFilter(CustCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustFranchiseTaxCodeMap = (Map)record.get("CustFranchiseTaxCode");
    Boolean CustFranchiseTaxCodeFetch = DataHelper.getFetch(CustFranchiseTaxCodeMap);
    Boolean CustFranchiseTaxCodeSortDir = DataHelper.getSortDirection(CustFranchiseTaxCodeMap);
    Integer CustFranchiseTaxCodeSortOrder = DataHelper.getSortOrder(CustFranchiseTaxCodeMap);
    if (CustFranchiseTaxCodeFetch != null) out.setCustFranchiseTaxCodeFetch(CustFranchiseTaxCodeFetch);
    if (CustFranchiseTaxCodeSortDir != null) out.setCustFranchiseTaxCodeSortDirection(CustFranchiseTaxCodeSortDir);
    if (CustFranchiseTaxCodeSortOrder != null) out.setCustFranchiseTaxCodeSortOrder(CustFranchiseTaxCodeSortOrder);

    Filter[] CustFranchiseTaxCodeFilter = DataHelper.mapToFilterArray(CustFranchiseTaxCodeMap, Integer.class);
    if (CustFranchiseTaxCodeFilter != null) {
      IntegerFilter[] CustFranchiseTaxCodeFilters = new IntegerFilter[CustFranchiseTaxCodeFilter.length];
      for (int i = 0; i < CustFranchiseTaxCodeFilters.length; i++) {
        CustFranchiseTaxCodeFilters[i] = (IntegerFilter)CustFranchiseTaxCodeFilter[i];
      }
      try {
        out.setCustFranchiseTaxCodeFilter(CustFranchiseTaxCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustGeocodeMap = (Map)record.get("CustGeocode");
    Boolean CustGeocodeFetch = DataHelper.getFetch(CustGeocodeMap);
    Boolean CustGeocodeSortDir = DataHelper.getSortDirection(CustGeocodeMap);
    Integer CustGeocodeSortOrder = DataHelper.getSortOrder(CustGeocodeMap);
    if (CustGeocodeFetch != null) out.setCustGeocodeFetch(CustGeocodeFetch);
    if (CustGeocodeSortDir != null) out.setCustGeocodeSortDirection(CustGeocodeSortDir);
    if (CustGeocodeSortOrder != null) out.setCustGeocodeSortOrder(CustGeocodeSortOrder);

    Filter[] CustGeocodeFilter = DataHelper.mapToFilterArray(CustGeocodeMap, String.class);
    if (CustGeocodeFilter != null) {
      StringFilter[] CustGeocodeFilters = new StringFilter[CustGeocodeFilter.length];
      for (int i = 0; i < CustGeocodeFilters.length; i++) {
        CustGeocodeFilters[i] = (StringFilter)CustGeocodeFilter[i];
      }
      try {
        out.setCustGeocodeFilter(CustGeocodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustCountyMap = (Map)record.get("CustCounty");
    Boolean CustCountyFetch = DataHelper.getFetch(CustCountyMap);
    Boolean CustCountySortDir = DataHelper.getSortDirection(CustCountyMap);
    Integer CustCountySortOrder = DataHelper.getSortOrder(CustCountyMap);
    if (CustCountyFetch != null) out.setCustCountyFetch(CustCountyFetch);
    if (CustCountySortDir != null) out.setCustCountySortDirection(CustCountySortDir);
    if (CustCountySortOrder != null) out.setCustCountySortOrder(CustCountySortOrder);

    Filter[] CustCountyFilter = DataHelper.mapToFilterArray(CustCountyMap, String.class);
    if (CustCountyFilter != null) {
      StringFilter[] CustCountyFilters = new StringFilter[CustCountyFilter.length];
      for (int i = 0; i < CustCountyFilters.length; i++) {
        CustCountyFilters[i] = (StringFilter)CustCountyFilter[i];
      }
      try {
        out.setCustCountyFilter(CustCountyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustPhone1Map = (Map)record.get("CustPhone1");
    Boolean CustPhone1Fetch = DataHelper.getFetch(CustPhone1Map);
    Boolean CustPhone1SortDir = DataHelper.getSortDirection(CustPhone1Map);
    Integer CustPhone1SortOrder = DataHelper.getSortOrder(CustPhone1Map);
    if (CustPhone1Fetch != null) out.setCustPhone1Fetch(CustPhone1Fetch);
    if (CustPhone1SortDir != null) out.setCustPhone1SortDirection(CustPhone1SortDir);
    if (CustPhone1SortOrder != null) out.setCustPhone1SortOrder(CustPhone1SortOrder);

    Filter[] CustPhone1Filter = DataHelper.mapToFilterArray(CustPhone1Map, String.class);
    if (CustPhone1Filter != null) {
      StringFilter[] CustPhone1Filters = new StringFilter[CustPhone1Filter.length];
      for (int i = 0; i < CustPhone1Filters.length; i++) {
        CustPhone1Filters[i] = (StringFilter)CustPhone1Filter[i];
      }
      try {
        out.setCustPhone1Filter(CustPhone1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustPhone2Map = (Map)record.get("CustPhone2");
    Boolean CustPhone2Fetch = DataHelper.getFetch(CustPhone2Map);
    Boolean CustPhone2SortDir = DataHelper.getSortDirection(CustPhone2Map);
    Integer CustPhone2SortOrder = DataHelper.getSortOrder(CustPhone2Map);
    if (CustPhone2Fetch != null) out.setCustPhone2Fetch(CustPhone2Fetch);
    if (CustPhone2SortDir != null) out.setCustPhone2SortDirection(CustPhone2SortDir);
    if (CustPhone2SortOrder != null) out.setCustPhone2SortOrder(CustPhone2SortOrder);

    Filter[] CustPhone2Filter = DataHelper.mapToFilterArray(CustPhone2Map, String.class);
    if (CustPhone2Filter != null) {
      StringFilter[] CustPhone2Filters = new StringFilter[CustPhone2Filter.length];
      for (int i = 0; i < CustPhone2Filters.length; i++) {
        CustPhone2Filters[i] = (StringFilter)CustPhone2Filter[i];
      }
      try {
        out.setCustPhone2Filter(CustPhone2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillAddress1Map = (Map)record.get("BillAddress1");
    Boolean BillAddress1Fetch = DataHelper.getFetch(BillAddress1Map);
    Boolean BillAddress1SortDir = DataHelper.getSortDirection(BillAddress1Map);
    Integer BillAddress1SortOrder = DataHelper.getSortOrder(BillAddress1Map);
    if (BillAddress1Fetch != null) out.setBillAddress1Fetch(BillAddress1Fetch);
    if (BillAddress1SortDir != null) out.setBillAddress1SortDirection(BillAddress1SortDir);
    if (BillAddress1SortOrder != null) out.setBillAddress1SortOrder(BillAddress1SortOrder);

    Filter[] BillAddress1Filter = DataHelper.mapToFilterArray(BillAddress1Map, String.class);
    if (BillAddress1Filter != null) {
      StringFilter[] BillAddress1Filters = new StringFilter[BillAddress1Filter.length];
      for (int i = 0; i < BillAddress1Filters.length; i++) {
        BillAddress1Filters[i] = (StringFilter)BillAddress1Filter[i];
      }
      try {
        out.setBillAddress1Filter(BillAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillAddress2Map = (Map)record.get("BillAddress2");
    Boolean BillAddress2Fetch = DataHelper.getFetch(BillAddress2Map);
    Boolean BillAddress2SortDir = DataHelper.getSortDirection(BillAddress2Map);
    Integer BillAddress2SortOrder = DataHelper.getSortOrder(BillAddress2Map);
    if (BillAddress2Fetch != null) out.setBillAddress2Fetch(BillAddress2Fetch);
    if (BillAddress2SortDir != null) out.setBillAddress2SortDirection(BillAddress2SortDir);
    if (BillAddress2SortOrder != null) out.setBillAddress2SortOrder(BillAddress2SortOrder);

    Filter[] BillAddress2Filter = DataHelper.mapToFilterArray(BillAddress2Map, String.class);
    if (BillAddress2Filter != null) {
      StringFilter[] BillAddress2Filters = new StringFilter[BillAddress2Filter.length];
      for (int i = 0; i < BillAddress2Filters.length; i++) {
        BillAddress2Filters[i] = (StringFilter)BillAddress2Filter[i];
      }
      try {
        out.setBillAddress2Filter(BillAddress2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillAddress3Map = (Map)record.get("BillAddress3");
    Boolean BillAddress3Fetch = DataHelper.getFetch(BillAddress3Map);
    Boolean BillAddress3SortDir = DataHelper.getSortDirection(BillAddress3Map);
    Integer BillAddress3SortOrder = DataHelper.getSortOrder(BillAddress3Map);
    if (BillAddress3Fetch != null) out.setBillAddress3Fetch(BillAddress3Fetch);
    if (BillAddress3SortDir != null) out.setBillAddress3SortDirection(BillAddress3SortDir);
    if (BillAddress3SortOrder != null) out.setBillAddress3SortOrder(BillAddress3SortOrder);

    Filter[] BillAddress3Filter = DataHelper.mapToFilterArray(BillAddress3Map, String.class);
    if (BillAddress3Filter != null) {
      StringFilter[] BillAddress3Filters = new StringFilter[BillAddress3Filter.length];
      for (int i = 0; i < BillAddress3Filters.length; i++) {
        BillAddress3Filters[i] = (StringFilter)BillAddress3Filter[i];
      }
      try {
        out.setBillAddress3Filter(BillAddress3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCityMap = (Map)record.get("BillCity");
    Boolean BillCityFetch = DataHelper.getFetch(BillCityMap);
    Boolean BillCitySortDir = DataHelper.getSortDirection(BillCityMap);
    Integer BillCitySortOrder = DataHelper.getSortOrder(BillCityMap);
    if (BillCityFetch != null) out.setBillCityFetch(BillCityFetch);
    if (BillCitySortDir != null) out.setBillCitySortDirection(BillCitySortDir);
    if (BillCitySortOrder != null) out.setBillCitySortOrder(BillCitySortOrder);

    Filter[] BillCityFilter = DataHelper.mapToFilterArray(BillCityMap, String.class);
    if (BillCityFilter != null) {
      StringFilter[] BillCityFilters = new StringFilter[BillCityFilter.length];
      for (int i = 0; i < BillCityFilters.length; i++) {
        BillCityFilters[i] = (StringFilter)BillCityFilter[i];
      }
      try {
        out.setBillCityFilter(BillCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillStateMap = (Map)record.get("BillState");
    Boolean BillStateFetch = DataHelper.getFetch(BillStateMap);
    Boolean BillStateSortDir = DataHelper.getSortDirection(BillStateMap);
    Integer BillStateSortOrder = DataHelper.getSortOrder(BillStateMap);
    if (BillStateFetch != null) out.setBillStateFetch(BillStateFetch);
    if (BillStateSortDir != null) out.setBillStateSortDirection(BillStateSortDir);
    if (BillStateSortOrder != null) out.setBillStateSortOrder(BillStateSortOrder);

    Filter[] BillStateFilter = DataHelper.mapToFilterArray(BillStateMap, String.class);
    if (BillStateFilter != null) {
      StringFilter[] BillStateFilters = new StringFilter[BillStateFilter.length];
      for (int i = 0; i < BillStateFilters.length; i++) {
        BillStateFilters[i] = (StringFilter)BillStateFilter[i];
      }
      try {
        out.setBillStateFilter(BillStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillZipMap = (Map)record.get("BillZip");
    Boolean BillZipFetch = DataHelper.getFetch(BillZipMap);
    Boolean BillZipSortDir = DataHelper.getSortDirection(BillZipMap);
    Integer BillZipSortOrder = DataHelper.getSortOrder(BillZipMap);
    if (BillZipFetch != null) out.setBillZipFetch(BillZipFetch);
    if (BillZipSortDir != null) out.setBillZipSortDirection(BillZipSortDir);
    if (BillZipSortOrder != null) out.setBillZipSortOrder(BillZipSortOrder);

    Filter[] BillZipFilter = DataHelper.mapToFilterArray(BillZipMap, String.class);
    if (BillZipFilter != null) {
      StringFilter[] BillZipFilters = new StringFilter[BillZipFilter.length];
      for (int i = 0; i < BillZipFilters.length; i++) {
        BillZipFilters[i] = (StringFilter)BillZipFilter[i];
      }
      try {
        out.setBillZipFilter(BillZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCountryCodeMap = (Map)record.get("BillCountryCode");
    Boolean BillCountryCodeFetch = DataHelper.getFetch(BillCountryCodeMap);
    Boolean BillCountryCodeSortDir = DataHelper.getSortDirection(BillCountryCodeMap);
    Integer BillCountryCodeSortOrder = DataHelper.getSortOrder(BillCountryCodeMap);
    if (BillCountryCodeFetch != null) out.setBillCountryCodeFetch(BillCountryCodeFetch);
    if (BillCountryCodeSortDir != null) out.setBillCountryCodeSortDirection(BillCountryCodeSortDir);
    if (BillCountryCodeSortOrder != null) out.setBillCountryCodeSortOrder(BillCountryCodeSortOrder);

    Filter[] BillCountryCodeFilter = DataHelper.mapToFilterArray(BillCountryCodeMap, Integer.class);
    if (BillCountryCodeFilter != null) {
      IntegerFilter[] BillCountryCodeFilters = new IntegerFilter[BillCountryCodeFilter.length];
      for (int i = 0; i < BillCountryCodeFilters.length; i++) {
        BillCountryCodeFilters[i] = (IntegerFilter)BillCountryCodeFilter[i];
      }
      try {
        out.setBillCountryCodeFilter(BillCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFranchiseTaxCodeMap = (Map)record.get("BillFranchiseTaxCode");
    Boolean BillFranchiseTaxCodeFetch = DataHelper.getFetch(BillFranchiseTaxCodeMap);
    Boolean BillFranchiseTaxCodeSortDir = DataHelper.getSortDirection(BillFranchiseTaxCodeMap);
    Integer BillFranchiseTaxCodeSortOrder = DataHelper.getSortOrder(BillFranchiseTaxCodeMap);
    if (BillFranchiseTaxCodeFetch != null) out.setBillFranchiseTaxCodeFetch(BillFranchiseTaxCodeFetch);
    if (BillFranchiseTaxCodeSortDir != null) out.setBillFranchiseTaxCodeSortDirection(BillFranchiseTaxCodeSortDir);
    if (BillFranchiseTaxCodeSortOrder != null) out.setBillFranchiseTaxCodeSortOrder(BillFranchiseTaxCodeSortOrder);

    Filter[] BillFranchiseTaxCodeFilter = DataHelper.mapToFilterArray(BillFranchiseTaxCodeMap, Integer.class);
    if (BillFranchiseTaxCodeFilter != null) {
      IntegerFilter[] BillFranchiseTaxCodeFilters = new IntegerFilter[BillFranchiseTaxCodeFilter.length];
      for (int i = 0; i < BillFranchiseTaxCodeFilters.length; i++) {
        BillFranchiseTaxCodeFilters[i] = (IntegerFilter)BillFranchiseTaxCodeFilter[i];
      }
      try {
        out.setBillFranchiseTaxCodeFilter(BillFranchiseTaxCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCountyMap = (Map)record.get("BillCounty");
    Boolean BillCountyFetch = DataHelper.getFetch(BillCountyMap);
    Boolean BillCountySortDir = DataHelper.getSortDirection(BillCountyMap);
    Integer BillCountySortOrder = DataHelper.getSortOrder(BillCountyMap);
    if (BillCountyFetch != null) out.setBillCountyFetch(BillCountyFetch);
    if (BillCountySortDir != null) out.setBillCountySortDirection(BillCountySortDir);
    if (BillCountySortOrder != null) out.setBillCountySortOrder(BillCountySortOrder);

    Filter[] BillCountyFilter = DataHelper.mapToFilterArray(BillCountyMap, String.class);
    if (BillCountyFilter != null) {
      StringFilter[] BillCountyFilters = new StringFilter[BillCountyFilter.length];
      for (int i = 0; i < BillCountyFilters.length; i++) {
        BillCountyFilters[i] = (StringFilter)BillCountyFilter[i];
      }
      try {
        out.setBillCountyFilter(BillCountyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillGeocodeMap = (Map)record.get("BillGeocode");
    Boolean BillGeocodeFetch = DataHelper.getFetch(BillGeocodeMap);
    Boolean BillGeocodeSortDir = DataHelper.getSortDirection(BillGeocodeMap);
    Integer BillGeocodeSortOrder = DataHelper.getSortOrder(BillGeocodeMap);
    if (BillGeocodeFetch != null) out.setBillGeocodeFetch(BillGeocodeFetch);
    if (BillGeocodeSortDir != null) out.setBillGeocodeSortDirection(BillGeocodeSortDir);
    if (BillGeocodeSortOrder != null) out.setBillGeocodeSortOrder(BillGeocodeSortOrder);

    Filter[] BillGeocodeFilter = DataHelper.mapToFilterArray(BillGeocodeMap, String.class);
    if (BillGeocodeFilter != null) {
      StringFilter[] BillGeocodeFilters = new StringFilter[BillGeocodeFilter.length];
      for (int i = 0; i < BillGeocodeFilters.length; i++) {
        BillGeocodeFilters[i] = (StringFilter)BillGeocodeFilter[i];
      }
      try {
        out.setBillGeocodeFilter(BillGeocodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SsnMap = (Map)record.get("Ssn");
    Boolean SsnFetch = DataHelper.getFetch(SsnMap);
    Boolean SsnSortDir = DataHelper.getSortDirection(SsnMap);
    Integer SsnSortOrder = DataHelper.getSortOrder(SsnMap);
    if (SsnFetch != null) out.setSsnFetch(SsnFetch);
    if (SsnSortDir != null) out.setSsnSortDirection(SsnSortDir);
    if (SsnSortOrder != null) out.setSsnSortOrder(SsnSortOrder);

    Filter[] SsnFilter = DataHelper.mapToFilterArray(SsnMap, String.class);
    if (SsnFilter != null) {
      StringFilter[] SsnFilters = new StringFilter[SsnFilter.length];
      for (int i = 0; i < SsnFilters.length; i++) {
        SsnFilters[i] = (StringFilter)SsnFilter[i];
      }
      try {
        out.setSsnFilter(SsnFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact1NameMap = (Map)record.get("Contact1Name");
    Boolean Contact1NameFetch = DataHelper.getFetch(Contact1NameMap);
    Boolean Contact1NameSortDir = DataHelper.getSortDirection(Contact1NameMap);
    Integer Contact1NameSortOrder = DataHelper.getSortOrder(Contact1NameMap);
    if (Contact1NameFetch != null) out.setContact1NameFetch(Contact1NameFetch);
    if (Contact1NameSortDir != null) out.setContact1NameSortDirection(Contact1NameSortDir);
    if (Contact1NameSortOrder != null) out.setContact1NameSortOrder(Contact1NameSortOrder);

    Filter[] Contact1NameFilter = DataHelper.mapToFilterArray(Contact1NameMap, String.class);
    if (Contact1NameFilter != null) {
      StringFilter[] Contact1NameFilters = new StringFilter[Contact1NameFilter.length];
      for (int i = 0; i < Contact1NameFilters.length; i++) {
        Contact1NameFilters[i] = (StringFilter)Contact1NameFilter[i];
      }
      try {
        out.setContact1NameFilter(Contact1NameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact2NameMap = (Map)record.get("Contact2Name");
    Boolean Contact2NameFetch = DataHelper.getFetch(Contact2NameMap);
    Boolean Contact2NameSortDir = DataHelper.getSortDirection(Contact2NameMap);
    Integer Contact2NameSortOrder = DataHelper.getSortOrder(Contact2NameMap);
    if (Contact2NameFetch != null) out.setContact2NameFetch(Contact2NameFetch);
    if (Contact2NameSortDir != null) out.setContact2NameSortDirection(Contact2NameSortDir);
    if (Contact2NameSortOrder != null) out.setContact2NameSortOrder(Contact2NameSortOrder);

    Filter[] Contact2NameFilter = DataHelper.mapToFilterArray(Contact2NameMap, String.class);
    if (Contact2NameFilter != null) {
      StringFilter[] Contact2NameFilters = new StringFilter[Contact2NameFilter.length];
      for (int i = 0; i < Contact2NameFilters.length; i++) {
        Contact2NameFilters[i] = (StringFilter)Contact2NameFilter[i];
      }
      try {
        out.setContact2NameFilter(Contact2NameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact1PhoneMap = (Map)record.get("Contact1Phone");
    Boolean Contact1PhoneFetch = DataHelper.getFetch(Contact1PhoneMap);
    Boolean Contact1PhoneSortDir = DataHelper.getSortDirection(Contact1PhoneMap);
    Integer Contact1PhoneSortOrder = DataHelper.getSortOrder(Contact1PhoneMap);
    if (Contact1PhoneFetch != null) out.setContact1PhoneFetch(Contact1PhoneFetch);
    if (Contact1PhoneSortDir != null) out.setContact1PhoneSortDirection(Contact1PhoneSortDir);
    if (Contact1PhoneSortOrder != null) out.setContact1PhoneSortOrder(Contact1PhoneSortOrder);

    Filter[] Contact1PhoneFilter = DataHelper.mapToFilterArray(Contact1PhoneMap, String.class);
    if (Contact1PhoneFilter != null) {
      StringFilter[] Contact1PhoneFilters = new StringFilter[Contact1PhoneFilter.length];
      for (int i = 0; i < Contact1PhoneFilters.length; i++) {
        Contact1PhoneFilters[i] = (StringFilter)Contact1PhoneFilter[i];
      }
      try {
        out.setContact1PhoneFilter(Contact1PhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact2PhoneMap = (Map)record.get("Contact2Phone");
    Boolean Contact2PhoneFetch = DataHelper.getFetch(Contact2PhoneMap);
    Boolean Contact2PhoneSortDir = DataHelper.getSortDirection(Contact2PhoneMap);
    Integer Contact2PhoneSortOrder = DataHelper.getSortOrder(Contact2PhoneMap);
    if (Contact2PhoneFetch != null) out.setContact2PhoneFetch(Contact2PhoneFetch);
    if (Contact2PhoneSortDir != null) out.setContact2PhoneSortDirection(Contact2PhoneSortDir);
    if (Contact2PhoneSortOrder != null) out.setContact2PhoneSortOrder(Contact2PhoneSortOrder);

    Filter[] Contact2PhoneFilter = DataHelper.mapToFilterArray(Contact2PhoneMap, String.class);
    if (Contact2PhoneFilter != null) {
      StringFilter[] Contact2PhoneFilters = new StringFilter[Contact2PhoneFilter.length];
      for (int i = 0; i < Contact2PhoneFilters.length; i++) {
        Contact2PhoneFilters[i] = (StringFilter)Contact2PhoneFilter[i];
      }
      try {
        out.setContact2PhoneFilter(Contact2PhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustFaxnoMap = (Map)record.get("CustFaxno");
    Boolean CustFaxnoFetch = DataHelper.getFetch(CustFaxnoMap);
    Boolean CustFaxnoSortDir = DataHelper.getSortDirection(CustFaxnoMap);
    Integer CustFaxnoSortOrder = DataHelper.getSortOrder(CustFaxnoMap);
    if (CustFaxnoFetch != null) out.setCustFaxnoFetch(CustFaxnoFetch);
    if (CustFaxnoSortDir != null) out.setCustFaxnoSortDirection(CustFaxnoSortDir);
    if (CustFaxnoSortOrder != null) out.setCustFaxnoSortOrder(CustFaxnoSortOrder);

    Filter[] CustFaxnoFilter = DataHelper.mapToFilterArray(CustFaxnoMap, String.class);
    if (CustFaxnoFilter != null) {
      StringFilter[] CustFaxnoFilters = new StringFilter[CustFaxnoFilter.length];
      for (int i = 0; i < CustFaxnoFilters.length; i++) {
        CustFaxnoFilters[i] = (StringFilter)CustFaxnoFilter[i];
      }
      try {
        out.setCustFaxnoFilter(CustFaxnoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatementToFaxnoMap = (Map)record.get("StatementToFaxno");
    Boolean StatementToFaxnoFetch = DataHelper.getFetch(StatementToFaxnoMap);
    Boolean StatementToFaxnoSortDir = DataHelper.getSortDirection(StatementToFaxnoMap);
    Integer StatementToFaxnoSortOrder = DataHelper.getSortOrder(StatementToFaxnoMap);
    if (StatementToFaxnoFetch != null) out.setStatementToFaxnoFetch(StatementToFaxnoFetch);
    if (StatementToFaxnoSortDir != null) out.setStatementToFaxnoSortDirection(StatementToFaxnoSortDir);
    if (StatementToFaxnoSortOrder != null) out.setStatementToFaxnoSortOrder(StatementToFaxnoSortOrder);

    Filter[] StatementToFaxnoFilter = DataHelper.mapToFilterArray(StatementToFaxnoMap, String.class);
    if (StatementToFaxnoFilter != null) {
      StringFilter[] StatementToFaxnoFilters = new StringFilter[StatementToFaxnoFilter.length];
      for (int i = 0; i < StatementToFaxnoFilters.length; i++) {
        StatementToFaxnoFilters[i] = (StringFilter)StatementToFaxnoFilter[i];
      }
      try {
        out.setStatementToFaxnoFilter(StatementToFaxnoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreditThreshMap = (Map)record.get("CreditThresh");
    Boolean CreditThreshFetch = DataHelper.getFetch(CreditThreshMap);
    Boolean CreditThreshSortDir = DataHelper.getSortDirection(CreditThreshMap);
    Integer CreditThreshSortOrder = DataHelper.getSortOrder(CreditThreshMap);
    if (CreditThreshFetch != null) out.setCreditThreshFetch(CreditThreshFetch);
    if (CreditThreshSortDir != null) out.setCreditThreshSortDirection(CreditThreshSortDir);
    if (CreditThreshSortOrder != null) out.setCreditThreshSortOrder(CreditThreshSortOrder);

    Filter[] CreditThreshFilter = DataHelper.mapToFilterArray(CreditThreshMap, BigInteger.class);
    if (CreditThreshFilter != null) {
      BigIntegerFilter[] CreditThreshFilters = new BigIntegerFilter[CreditThreshFilter.length];
      for (int i = 0; i < CreditThreshFilters.length; i++) {
        CreditThreshFilters[i] = (BigIntegerFilter)CreditThreshFilter[i];
      }
      try {
        out.setCreditThreshFilter(CreditThreshFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CredStatusMap = (Map)record.get("CredStatus");
    Boolean CredStatusFetch = DataHelper.getFetch(CredStatusMap);
    Boolean CredStatusSortDir = DataHelper.getSortDirection(CredStatusMap);
    Integer CredStatusSortOrder = DataHelper.getSortOrder(CredStatusMap);
    if (CredStatusFetch != null) out.setCredStatusFetch(CredStatusFetch);
    if (CredStatusSortDir != null) out.setCredStatusSortDirection(CredStatusSortDir);
    if (CredStatusSortOrder != null) out.setCredStatusSortOrder(CredStatusSortOrder);

    Filter[] CredStatusFilter = DataHelper.mapToFilterArray(CredStatusMap, Integer.class);
    if (CredStatusFilter != null) {
      IntegerFilter[] CredStatusFilters = new IntegerFilter[CredStatusFilter.length];
      for (int i = 0; i < CredStatusFilters.length; i++) {
        CredStatusFilters[i] = (IntegerFilter)CredStatusFilter[i];
      }
      try {
        out.setCredStatusFilter(CredStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreditRatingMap = (Map)record.get("CreditRating");
    Boolean CreditRatingFetch = DataHelper.getFetch(CreditRatingMap);
    Boolean CreditRatingSortDir = DataHelper.getSortDirection(CreditRatingMap);
    Integer CreditRatingSortOrder = DataHelper.getSortOrder(CreditRatingMap);
    if (CreditRatingFetch != null) out.setCreditRatingFetch(CreditRatingFetch);
    if (CreditRatingSortDir != null) out.setCreditRatingSortDirection(CreditRatingSortDir);
    if (CreditRatingSortOrder != null) out.setCreditRatingSortOrder(CreditRatingSortOrder);

    Filter[] CreditRatingFilter = DataHelper.mapToFilterArray(CreditRatingMap, Integer.class);
    if (CreditRatingFilter != null) {
      IntegerFilter[] CreditRatingFilters = new IntegerFilter[CreditRatingFilter.length];
      for (int i = 0; i < CreditRatingFilters.length; i++) {
        CreditRatingFilters[i] = (IntegerFilter)CreditRatingFilter[i];
      }
      try {
        out.setCreditRatingFilter(CreditRatingFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisconnectReasonMap = (Map)record.get("DisconnectReason");
    Boolean DisconnectReasonFetch = DataHelper.getFetch(DisconnectReasonMap);
    Boolean DisconnectReasonSortDir = DataHelper.getSortDirection(DisconnectReasonMap);
    Integer DisconnectReasonSortOrder = DataHelper.getSortOrder(DisconnectReasonMap);
    if (DisconnectReasonFetch != null) out.setDisconnectReasonFetch(DisconnectReasonFetch);
    if (DisconnectReasonSortDir != null) out.setDisconnectReasonSortDirection(DisconnectReasonSortDir);
    if (DisconnectReasonSortOrder != null) out.setDisconnectReasonSortOrder(DisconnectReasonSortOrder);

    Filter[] DisconnectReasonFilter = DataHelper.mapToFilterArray(DisconnectReasonMap, Integer.class);
    if (DisconnectReasonFilter != null) {
      IntegerFilter[] DisconnectReasonFilters = new IntegerFilter[DisconnectReasonFilter.length];
      for (int i = 0; i < DisconnectReasonFilters.length; i++) {
        DisconnectReasonFilters[i] = (IntegerFilter)DisconnectReasonFilter[i];
      }
      try {
        out.setDisconnectReasonFilter(DisconnectReasonFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscRcvOptMap = (Map)record.get("DiscRcvOpt");
    Boolean DiscRcvOptFetch = DataHelper.getFetch(DiscRcvOptMap);
    Boolean DiscRcvOptSortDir = DataHelper.getSortDirection(DiscRcvOptMap);
    Integer DiscRcvOptSortOrder = DataHelper.getSortOrder(DiscRcvOptMap);
    if (DiscRcvOptFetch != null) out.setDiscRcvOptFetch(DiscRcvOptFetch);
    if (DiscRcvOptSortDir != null) out.setDiscRcvOptSortDirection(DiscRcvOptSortDir);
    if (DiscRcvOptSortOrder != null) out.setDiscRcvOptSortOrder(DiscRcvOptSortOrder);

    Filter[] DiscRcvOptFilter = DataHelper.mapToFilterArray(DiscRcvOptMap, Integer.class);
    if (DiscRcvOptFilter != null) {
      IntegerFilter[] DiscRcvOptFilters = new IntegerFilter[DiscRcvOptFilter.length];
      for (int i = 0; i < DiscRcvOptFilters.length; i++) {
        DiscRcvOptFilters[i] = (IntegerFilter)DiscRcvOptFilter[i];
      }
      try {
        out.setDiscRcvOptFilter(DiscRcvOptFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ThreshRefMap = (Map)record.get("ThreshRef");
    Boolean ThreshRefFetch = DataHelper.getFetch(ThreshRefMap);
    Boolean ThreshRefSortDir = DataHelper.getSortDirection(ThreshRefMap);
    Integer ThreshRefSortOrder = DataHelper.getSortOrder(ThreshRefMap);
    if (ThreshRefFetch != null) out.setThreshRefFetch(ThreshRefFetch);
    if (ThreshRefSortDir != null) out.setThreshRefSortDirection(ThreshRefSortDir);
    if (ThreshRefSortOrder != null) out.setThreshRefSortOrder(ThreshRefSortOrder);

    Filter[] ThreshRefFilter = DataHelper.mapToFilterArray(ThreshRefMap, Integer.class);
    if (ThreshRefFilter != null) {
      IntegerFilter[] ThreshRefFilters = new IntegerFilter[ThreshRefFilter.length];
      for (int i = 0; i < ThreshRefFilters.length; i++) {
        ThreshRefFilters[i] = (IntegerFilter)ThreshRefFilter[i];
      }
      try {
        out.setThreshRefFilter(ThreshRefFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingFrequencyMap = (Map)record.get("BillingFrequency");
    Boolean BillingFrequencyFetch = DataHelper.getFetch(BillingFrequencyMap);
    Boolean BillingFrequencySortDir = DataHelper.getSortDirection(BillingFrequencyMap);
    Integer BillingFrequencySortOrder = DataHelper.getSortOrder(BillingFrequencyMap);
    if (BillingFrequencyFetch != null) out.setBillingFrequencyFetch(BillingFrequencyFetch);
    if (BillingFrequencySortDir != null) out.setBillingFrequencySortDirection(BillingFrequencySortDir);
    if (BillingFrequencySortOrder != null) out.setBillingFrequencySortOrder(BillingFrequencySortOrder);

    Filter[] BillingFrequencyFilter = DataHelper.mapToFilterArray(BillingFrequencyMap, Integer.class);
    if (BillingFrequencyFilter != null) {
      IntegerFilter[] BillingFrequencyFilters = new IntegerFilter[BillingFrequencyFilter.length];
      for (int i = 0; i < BillingFrequencyFilters.length; i++) {
        BillingFrequencyFilters[i] = (IntegerFilter)BillingFrequencyFilter[i];
      }
      try {
        out.setBillingFrequencyFilter(BillingFrequencyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgGrpIdMap = (Map)record.get("MsgGrpId");
    Boolean MsgGrpIdFetch = DataHelper.getFetch(MsgGrpIdMap);
    Boolean MsgGrpIdSortDir = DataHelper.getSortDirection(MsgGrpIdMap);
    Integer MsgGrpIdSortOrder = DataHelper.getSortOrder(MsgGrpIdMap);
    if (MsgGrpIdFetch != null) out.setMsgGrpIdFetch(MsgGrpIdFetch);
    if (MsgGrpIdSortDir != null) out.setMsgGrpIdSortDirection(MsgGrpIdSortDir);
    if (MsgGrpIdSortOrder != null) out.setMsgGrpIdSortOrder(MsgGrpIdSortOrder);

    Filter[] MsgGrpIdFilter = DataHelper.mapToFilterArray(MsgGrpIdMap, Integer.class);
    if (MsgGrpIdFilter != null) {
      IntegerFilter[] MsgGrpIdFilters = new IntegerFilter[MsgGrpIdFilter.length];
      for (int i = 0; i < MsgGrpIdFilters.length; i++) {
        MsgGrpIdFilters[i] = (IntegerFilter)MsgGrpIdFilter[i];
      }
      try {
        out.setMsgGrpIdFilter(MsgGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InsertGrpIdMap = (Map)record.get("InsertGrpId");
    Boolean InsertGrpIdFetch = DataHelper.getFetch(InsertGrpIdMap);
    Boolean InsertGrpIdSortDir = DataHelper.getSortDirection(InsertGrpIdMap);
    Integer InsertGrpIdSortOrder = DataHelper.getSortOrder(InsertGrpIdMap);
    if (InsertGrpIdFetch != null) out.setInsertGrpIdFetch(InsertGrpIdFetch);
    if (InsertGrpIdSortDir != null) out.setInsertGrpIdSortDirection(InsertGrpIdSortDir);
    if (InsertGrpIdSortOrder != null) out.setInsertGrpIdSortOrder(InsertGrpIdSortOrder);

    Filter[] InsertGrpIdFilter = DataHelper.mapToFilterArray(InsertGrpIdMap, Integer.class);
    if (InsertGrpIdFilter != null) {
      IntegerFilter[] InsertGrpIdFilters = new IntegerFilter[InsertGrpIdFilter.length];
      for (int i = 0; i < InsertGrpIdFilters.length; i++) {
        InsertGrpIdFilters[i] = (IntegerFilter)InsertGrpIdFilter[i];
      }
      try {
        out.setInsertGrpIdFilter(InsertGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassDefaultMap = (Map)record.get("RateClassDefault");
    Boolean RateClassDefaultFetch = DataHelper.getFetch(RateClassDefaultMap);
    Boolean RateClassDefaultSortDir = DataHelper.getSortDirection(RateClassDefaultMap);
    Integer RateClassDefaultSortOrder = DataHelper.getSortOrder(RateClassDefaultMap);
    if (RateClassDefaultFetch != null) out.setRateClassDefaultFetch(RateClassDefaultFetch);
    if (RateClassDefaultSortDir != null) out.setRateClassDefaultSortDirection(RateClassDefaultSortDir);
    if (RateClassDefaultSortOrder != null) out.setRateClassDefaultSortOrder(RateClassDefaultSortOrder);

    Filter[] RateClassDefaultFilter = DataHelper.mapToFilterArray(RateClassDefaultMap, Integer.class);
    if (RateClassDefaultFilter != null) {
      IntegerFilter[] RateClassDefaultFilters = new IntegerFilter[RateClassDefaultFilter.length];
      for (int i = 0; i < RateClassDefaultFilters.length; i++) {
        RateClassDefaultFilters[i] = (IntegerFilter)RateClassDefaultFilter[i];
      }
      try {
        out.setRateClassDefaultFilter(RateClassDefaultFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassSpecialMap = (Map)record.get("RateClassSpecial");
    Boolean RateClassSpecialFetch = DataHelper.getFetch(RateClassSpecialMap);
    Boolean RateClassSpecialSortDir = DataHelper.getSortDirection(RateClassSpecialMap);
    Integer RateClassSpecialSortOrder = DataHelper.getSortOrder(RateClassSpecialMap);
    if (RateClassSpecialFetch != null) out.setRateClassSpecialFetch(RateClassSpecialFetch);
    if (RateClassSpecialSortDir != null) out.setRateClassSpecialSortDirection(RateClassSpecialSortDir);
    if (RateClassSpecialSortOrder != null) out.setRateClassSpecialSortOrder(RateClassSpecialSortOrder);

    Filter[] RateClassSpecialFilter = DataHelper.mapToFilterArray(RateClassSpecialMap, Integer.class);
    if (RateClassSpecialFilter != null) {
      IntegerFilter[] RateClassSpecialFilters = new IntegerFilter[RateClassSpecialFilter.length];
      for (int i = 0; i < RateClassSpecialFilters.length; i++) {
        RateClassSpecialFilters[i] = (IntegerFilter)RateClassSpecialFilter[i];
      }
      try {
        out.setRateClassSpecialFilter(RateClassSpecialFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExrateClassMap = (Map)record.get("ExrateClass");
    Boolean ExrateClassFetch = DataHelper.getFetch(ExrateClassMap);
    Boolean ExrateClassSortDir = DataHelper.getSortDirection(ExrateClassMap);
    Integer ExrateClassSortOrder = DataHelper.getSortOrder(ExrateClassMap);
    if (ExrateClassFetch != null) out.setExrateClassFetch(ExrateClassFetch);
    if (ExrateClassSortDir != null) out.setExrateClassSortDirection(ExrateClassSortDir);
    if (ExrateClassSortOrder != null) out.setExrateClassSortOrder(ExrateClassSortOrder);

    Filter[] ExrateClassFilter = DataHelper.mapToFilterArray(ExrateClassMap, Integer.class);
    if (ExrateClassFilter != null) {
      IntegerFilter[] ExrateClassFilters = new IntegerFilter[ExrateClassFilter.length];
      for (int i = 0; i < ExrateClassFilters.length; i++) {
        ExrateClassFilters[i] = (IntegerFilter)ExrateClassFilter[i];
      }
      try {
        out.setExrateClassFilter(ExrateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanIdDiscountMap = (Map)record.get("PlanIdDiscount");
    Boolean PlanIdDiscountFetch = DataHelper.getFetch(PlanIdDiscountMap);
    Boolean PlanIdDiscountSortDir = DataHelper.getSortDirection(PlanIdDiscountMap);
    Integer PlanIdDiscountSortOrder = DataHelper.getSortOrder(PlanIdDiscountMap);
    if (PlanIdDiscountFetch != null) out.setPlanIdDiscountFetch(PlanIdDiscountFetch);
    if (PlanIdDiscountSortDir != null) out.setPlanIdDiscountSortDirection(PlanIdDiscountSortDir);
    if (PlanIdDiscountSortOrder != null) out.setPlanIdDiscountSortOrder(PlanIdDiscountSortOrder);

    Filter[] PlanIdDiscountFilter = DataHelper.mapToFilterArray(PlanIdDiscountMap, Integer.class);
    if (PlanIdDiscountFilter != null) {
      IntegerFilter[] PlanIdDiscountFilters = new IntegerFilter[PlanIdDiscountFilter.length];
      for (int i = 0; i < PlanIdDiscountFilters.length; i++) {
        PlanIdDiscountFilters[i] = (IntegerFilter)PlanIdDiscountFilter[i];
      }
      try {
        out.setPlanIdDiscountFilter(PlanIdDiscountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanIdCreditMap = (Map)record.get("PlanIdCredit");
    Boolean PlanIdCreditFetch = DataHelper.getFetch(PlanIdCreditMap);
    Boolean PlanIdCreditSortDir = DataHelper.getSortDirection(PlanIdCreditMap);
    Integer PlanIdCreditSortOrder = DataHelper.getSortOrder(PlanIdCreditMap);
    if (PlanIdCreditFetch != null) out.setPlanIdCreditFetch(PlanIdCreditFetch);
    if (PlanIdCreditSortDir != null) out.setPlanIdCreditSortDirection(PlanIdCreditSortDir);
    if (PlanIdCreditSortOrder != null) out.setPlanIdCreditSortOrder(PlanIdCreditSortOrder);

    Filter[] PlanIdCreditFilter = DataHelper.mapToFilterArray(PlanIdCreditMap, Integer.class);
    if (PlanIdCreditFilter != null) {
      IntegerFilter[] PlanIdCreditFilters = new IntegerFilter[PlanIdCreditFilter.length];
      for (int i = 0; i < PlanIdCreditFilters.length; i++) {
        PlanIdCreditFilters[i] = (IntegerFilter)PlanIdCreditFilter[i];
      }
      try {
        out.setPlanIdCreditFilter(PlanIdCreditFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountStatusDtMap = (Map)record.get("AccountStatusDt");
    Boolean AccountStatusDtFetch = DataHelper.getFetch(AccountStatusDtMap);
    Boolean AccountStatusDtSortDir = DataHelper.getSortDirection(AccountStatusDtMap);
    Integer AccountStatusDtSortOrder = DataHelper.getSortOrder(AccountStatusDtMap);
    if (AccountStatusDtFetch != null) out.setAccountStatusDtFetch(AccountStatusDtFetch);
    if (AccountStatusDtSortDir != null) out.setAccountStatusDtSortDirection(AccountStatusDtSortDir);
    if (AccountStatusDtSortOrder != null) out.setAccountStatusDtSortOrder(AccountStatusDtSortOrder);

    Filter[] AccountStatusDtFilter = DataHelper.mapToFilterArray(AccountStatusDtMap, Date.class);
    if (AccountStatusDtFilter != null) {
      DateFilter[] AccountStatusDtFilters = new DateFilter[AccountStatusDtFilter.length];
      for (int i = 0; i < AccountStatusDtFilters.length; i++) {
        AccountStatusDtFilters[i] = (DateFilter)AccountStatusDtFilter[i];
      }
      try {
        out.setAccountStatusDtFilter(AccountStatusDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistrChanMap = (Map)record.get("DistrChan");
    Boolean DistrChanFetch = DataHelper.getFetch(DistrChanMap);
    Boolean DistrChanSortDir = DataHelper.getSortDirection(DistrChanMap);
    Integer DistrChanSortOrder = DataHelper.getSortOrder(DistrChanMap);
    if (DistrChanFetch != null) out.setDistrChanFetch(DistrChanFetch);
    if (DistrChanSortDir != null) out.setDistrChanSortDirection(DistrChanSortDir);
    if (DistrChanSortOrder != null) out.setDistrChanSortOrder(DistrChanSortOrder);

    Filter[] DistrChanFilter = DataHelper.mapToFilterArray(DistrChanMap, String.class);
    if (DistrChanFilter != null) {
      StringFilter[] DistrChanFilters = new StringFilter[DistrChanFilter.length];
      for (int i = 0; i < DistrChanFilters.length; i++) {
        DistrChanFilters[i] = (StringFilter)DistrChanFilter[i];
      }
      try {
        out.setDistrChanFilter(DistrChanFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SalesCodeMap = (Map)record.get("SalesCode");
    Boolean SalesCodeFetch = DataHelper.getFetch(SalesCodeMap);
    Boolean SalesCodeSortDir = DataHelper.getSortDirection(SalesCodeMap);
    Integer SalesCodeSortOrder = DataHelper.getSortOrder(SalesCodeMap);
    if (SalesCodeFetch != null) out.setSalesCodeFetch(SalesCodeFetch);
    if (SalesCodeSortDir != null) out.setSalesCodeSortDirection(SalesCodeSortDir);
    if (SalesCodeSortOrder != null) out.setSalesCodeSortOrder(SalesCodeSortOrder);

    Filter[] SalesCodeFilter = DataHelper.mapToFilterArray(SalesCodeMap, String.class);
    if (SalesCodeFilter != null) {
      StringFilter[] SalesCodeFilters = new StringFilter[SalesCodeFilter.length];
      for (int i = 0; i < SalesCodeFilters.length; i++) {
        SalesCodeFilters[i] = (StringFilter)SalesCodeFilter[i];
      }
      try {
        out.setSalesCodeFilter(SalesCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MktCodeMap = (Map)record.get("MktCode");
    Boolean MktCodeFetch = DataHelper.getFetch(MktCodeMap);
    Boolean MktCodeSortDir = DataHelper.getSortDirection(MktCodeMap);
    Integer MktCodeSortOrder = DataHelper.getSortOrder(MktCodeMap);
    if (MktCodeFetch != null) out.setMktCodeFetch(MktCodeFetch);
    if (MktCodeSortDir != null) out.setMktCodeSortDirection(MktCodeSortDir);
    if (MktCodeSortOrder != null) out.setMktCodeSortOrder(MktCodeSortOrder);

    Filter[] MktCodeFilter = DataHelper.mapToFilterArray(MktCodeMap, Integer.class);
    if (MktCodeFilter != null) {
      IntegerFilter[] MktCodeFilters = new IntegerFilter[MktCodeFilter.length];
      for (int i = 0; i < MktCodeFilters.length; i++) {
        MktCodeFilters[i] = (IntegerFilter)MktCodeFilter[i];
      }
      try {
        out.setMktCodeFilter(MktCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SicCodeMap = (Map)record.get("SicCode");
    Boolean SicCodeFetch = DataHelper.getFetch(SicCodeMap);
    Boolean SicCodeSortDir = DataHelper.getSortDirection(SicCodeMap);
    Integer SicCodeSortOrder = DataHelper.getSortOrder(SicCodeMap);
    if (SicCodeFetch != null) out.setSicCodeFetch(SicCodeFetch);
    if (SicCodeSortDir != null) out.setSicCodeSortDirection(SicCodeSortDir);
    if (SicCodeSortOrder != null) out.setSicCodeSortOrder(SicCodeSortOrder);

    Filter[] SicCodeFilter = DataHelper.mapToFilterArray(SicCodeMap, Integer.class);
    if (SicCodeFilter != null) {
      IntegerFilter[] SicCodeFilters = new IntegerFilter[SicCodeFilter.length];
      for (int i = 0; i < SicCodeFilters.length; i++) {
        SicCodeFilters[i] = (IntegerFilter)SicCodeFilter[i];
      }
      try {
        out.setSicCodeFilter(SicCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InUseMap = (Map)record.get("InUse");
    Boolean InUseFetch = DataHelper.getFetch(InUseMap);
    Boolean InUseSortDir = DataHelper.getSortDirection(InUseMap);
    Integer InUseSortOrder = DataHelper.getSortOrder(InUseMap);
    if (InUseFetch != null) out.setInUseFetch(InUseFetch);
    if (InUseSortDir != null) out.setInUseSortDirection(InUseSortDir);
    if (InUseSortOrder != null) out.setInUseSortOrder(InUseSortOrder);

    Filter[] InUseFilter = DataHelper.mapToFilterArray(InUseMap, String.class);
    if (InUseFilter != null) {
      StringFilter[] InUseFilters = new StringFilter[InUseFilter.length];
      for (int i = 0; i < InUseFilters.length; i++) {
        InUseFilters[i] = (StringFilter)InUseFilter[i];
      }
      try {
        out.setInUseFilter(InUseFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoBillMap = (Map)record.get("NoBill");
    Boolean NoBillFetch = DataHelper.getFetch(NoBillMap);
    Boolean NoBillSortDir = DataHelper.getSortDirection(NoBillMap);
    Integer NoBillSortOrder = DataHelper.getSortOrder(NoBillMap);
    if (NoBillFetch != null) out.setNoBillFetch(NoBillFetch);
    if (NoBillSortDir != null) out.setNoBillSortDirection(NoBillSortDir);
    if (NoBillSortOrder != null) out.setNoBillSortOrder(NoBillSortOrder);

    Filter[] NoBillFilter = DataHelper.mapToFilterArray(NoBillMap, Boolean.class);
    if (NoBillFilter != null) {
      BooleanFilter[] NoBillFilters = new BooleanFilter[NoBillFilter.length];
      for (int i = 0; i < NoBillFilters.length; i++) {
        NoBillFilters[i] = (BooleanFilter)NoBillFilter[i];
      }
      try {
        out.setNoBillFilter(NoBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CollectionStatusMap = (Map)record.get("CollectionStatus");
    Boolean CollectionStatusFetch = DataHelper.getFetch(CollectionStatusMap);
    Boolean CollectionStatusSortDir = DataHelper.getSortDirection(CollectionStatusMap);
    Integer CollectionStatusSortOrder = DataHelper.getSortOrder(CollectionStatusMap);
    if (CollectionStatusFetch != null) out.setCollectionStatusFetch(CollectionStatusFetch);
    if (CollectionStatusSortDir != null) out.setCollectionStatusSortDirection(CollectionStatusSortDir);
    if (CollectionStatusSortOrder != null) out.setCollectionStatusSortOrder(CollectionStatusSortOrder);

    Filter[] CollectionStatusFilter = DataHelper.mapToFilterArray(CollectionStatusMap, Integer.class);
    if (CollectionStatusFilter != null) {
      IntegerFilter[] CollectionStatusFilters = new IntegerFilter[CollectionStatusFilter.length];
      for (int i = 0; i < CollectionStatusFilters.length; i++) {
        CollectionStatusFilters[i] = (IntegerFilter)CollectionStatusFilter[i];
      }
      try {
        out.setCollectionStatusFilter(CollectionStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map VipCodeMap = (Map)record.get("VipCode");
    Boolean VipCodeFetch = DataHelper.getFetch(VipCodeMap);
    Boolean VipCodeSortDir = DataHelper.getSortDirection(VipCodeMap);
    Integer VipCodeSortOrder = DataHelper.getSortOrder(VipCodeMap);
    if (VipCodeFetch != null) out.setVipCodeFetch(VipCodeFetch);
    if (VipCodeSortDir != null) out.setVipCodeSortDirection(VipCodeSortDir);
    if (VipCodeSortOrder != null) out.setVipCodeSortOrder(VipCodeSortOrder);

    Filter[] VipCodeFilter = DataHelper.mapToFilterArray(VipCodeMap, Integer.class);
    if (VipCodeFilter != null) {
      IntegerFilter[] VipCodeFilters = new IntegerFilter[VipCodeFilter.length];
      for (int i = 0; i < VipCodeFilters.length; i++) {
        VipCodeFilters[i] = (IntegerFilter)VipCodeFilter[i];
      }
      try {
        out.setVipCodeFilter(VipCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PurchaseOrderMap = (Map)record.get("PurchaseOrder");
    Boolean PurchaseOrderFetch = DataHelper.getFetch(PurchaseOrderMap);
    Boolean PurchaseOrderSortDir = DataHelper.getSortDirection(PurchaseOrderMap);
    Integer PurchaseOrderSortOrder = DataHelper.getSortOrder(PurchaseOrderMap);
    if (PurchaseOrderFetch != null) out.setPurchaseOrderFetch(PurchaseOrderFetch);
    if (PurchaseOrderSortDir != null) out.setPurchaseOrderSortDirection(PurchaseOrderSortDir);
    if (PurchaseOrderSortOrder != null) out.setPurchaseOrderSortOrder(PurchaseOrderSortOrder);

    Filter[] PurchaseOrderFilter = DataHelper.mapToFilterArray(PurchaseOrderMap, String.class);
    if (PurchaseOrderFilter != null) {
      StringFilter[] PurchaseOrderFilters = new StringFilter[PurchaseOrderFilter.length];
      for (int i = 0; i < PurchaseOrderFilters.length; i++) {
        PurchaseOrderFilters[i] = (StringFilter)PurchaseOrderFilter[i];
      }
      try {
        out.setPurchaseOrderFilter(PurchaseOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CodewordMap = (Map)record.get("Codeword");
    Boolean CodewordFetch = DataHelper.getFetch(CodewordMap);
    Boolean CodewordSortDir = DataHelper.getSortDirection(CodewordMap);
    Integer CodewordSortOrder = DataHelper.getSortOrder(CodewordMap);
    if (CodewordFetch != null) out.setCodewordFetch(CodewordFetch);
    if (CodewordSortDir != null) out.setCodewordSortDirection(CodewordSortDir);
    if (CodewordSortOrder != null) out.setCodewordSortOrder(CodewordSortOrder);

    Filter[] CodewordFilter = DataHelper.mapToFilterArray(CodewordMap, String.class);
    if (CodewordFilter != null) {
      StringFilter[] CodewordFilters = new StringFilter[CodewordFilter.length];
      for (int i = 0; i < CodewordFilters.length; i++) {
        CodewordFilters[i] = (StringFilter)CodewordFilter[i];
      }
      try {
        out.setCodewordFilter(CodewordFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RemarkMap = (Map)record.get("Remark");
    Boolean RemarkFetch = DataHelper.getFetch(RemarkMap);
    Boolean RemarkSortDir = DataHelper.getSortDirection(RemarkMap);
    Integer RemarkSortOrder = DataHelper.getSortOrder(RemarkMap);
    if (RemarkFetch != null) out.setRemarkFetch(RemarkFetch);
    if (RemarkSortDir != null) out.setRemarkSortDirection(RemarkSortDir);
    if (RemarkSortOrder != null) out.setRemarkSortOrder(RemarkSortOrder);

    Filter[] RemarkFilter = DataHelper.mapToFilterArray(RemarkMap, String.class);
    if (RemarkFilter != null) {
      StringFilter[] RemarkFilters = new StringFilter[RemarkFilter.length];
      for (int i = 0; i < RemarkFilters.length; i++) {
        RemarkFilters[i] = (StringFilter)RemarkFilter[i];
      }
      try {
        out.setRemarkFilter(RemarkFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustEmailMap = (Map)record.get("CustEmail");
    Boolean CustEmailFetch = DataHelper.getFetch(CustEmailMap);
    Boolean CustEmailSortDir = DataHelper.getSortDirection(CustEmailMap);
    Integer CustEmailSortOrder = DataHelper.getSortOrder(CustEmailMap);
    if (CustEmailFetch != null) out.setCustEmailFetch(CustEmailFetch);
    if (CustEmailSortDir != null) out.setCustEmailSortDirection(CustEmailSortDir);
    if (CustEmailSortOrder != null) out.setCustEmailSortOrder(CustEmailSortOrder);

    Filter[] CustEmailFilter = DataHelper.mapToFilterArray(CustEmailMap, String.class);
    if (CustEmailFilter != null) {
      StringFilter[] CustEmailFilters = new StringFilter[CustEmailFilter.length];
      for (int i = 0; i < CustEmailFilters.length; i++) {
        CustEmailFilters[i] = (StringFilter)CustEmailFilter[i];
      }
      try {
        out.setCustEmailFilter(CustEmailFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatementToEmailMap = (Map)record.get("StatementToEmail");
    Boolean StatementToEmailFetch = DataHelper.getFetch(StatementToEmailMap);
    Boolean StatementToEmailSortDir = DataHelper.getSortDirection(StatementToEmailMap);
    Integer StatementToEmailSortOrder = DataHelper.getSortOrder(StatementToEmailMap);
    if (StatementToEmailFetch != null) out.setStatementToEmailFetch(StatementToEmailFetch);
    if (StatementToEmailSortDir != null) out.setStatementToEmailSortDirection(StatementToEmailSortDir);
    if (StatementToEmailSortOrder != null) out.setStatementToEmailSortOrder(StatementToEmailSortOrder);

    Filter[] StatementToEmailFilter = DataHelper.mapToFilterArray(StatementToEmailMap, String.class);
    if (StatementToEmailFilter != null) {
      StringFilter[] StatementToEmailFilters = new StringFilter[StatementToEmailFilter.length];
      for (int i = 0; i < StatementToEmailFilters.length; i++) {
        StatementToEmailFilters[i] = (StringFilter)StatementToEmailFilter[i];
      }
      try {
        out.setStatementToEmailFilter(StatementToEmailFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateCreatedMap = (Map)record.get("DateCreated");
    Boolean DateCreatedFetch = DataHelper.getFetch(DateCreatedMap);
    Boolean DateCreatedSortDir = DataHelper.getSortDirection(DateCreatedMap);
    Integer DateCreatedSortOrder = DataHelper.getSortOrder(DateCreatedMap);
    if (DateCreatedFetch != null) out.setDateCreatedFetch(DateCreatedFetch);
    if (DateCreatedSortDir != null) out.setDateCreatedSortDirection(DateCreatedSortDir);
    if (DateCreatedSortOrder != null) out.setDateCreatedSortOrder(DateCreatedSortOrder);

    Filter[] DateCreatedFilter = DataHelper.mapToFilterArray(DateCreatedMap, Date.class);
    if (DateCreatedFilter != null) {
      DateFilter[] DateCreatedFilters = new DateFilter[DateCreatedFilter.length];
      for (int i = 0; i < DateCreatedFilters.length; i++) {
        DateCreatedFilters[i] = (DateFilter)DateCreatedFilter[i];
      }
      try {
        out.setDateCreatedFilter(DateCreatedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateActiveMap = (Map)record.get("DateActive");
    Boolean DateActiveFetch = DataHelper.getFetch(DateActiveMap);
    Boolean DateActiveSortDir = DataHelper.getSortDirection(DateActiveMap);
    Integer DateActiveSortOrder = DataHelper.getSortOrder(DateActiveMap);
    if (DateActiveFetch != null) out.setDateActiveFetch(DateActiveFetch);
    if (DateActiveSortDir != null) out.setDateActiveSortDirection(DateActiveSortDir);
    if (DateActiveSortOrder != null) out.setDateActiveSortOrder(DateActiveSortOrder);

    Filter[] DateActiveFilter = DataHelper.mapToFilterArray(DateActiveMap, Date.class);
    if (DateActiveFilter != null) {
      DateFilter[] DateActiveFilters = new DateFilter[DateActiveFilter.length];
      for (int i = 0; i < DateActiveFilters.length; i++) {
        DateActiveFilters[i] = (DateFilter)DateActiveFilter[i];
      }
      try {
        out.setDateActiveFilter(DateActiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateInactiveMap = (Map)record.get("DateInactive");
    Boolean DateInactiveFetch = DataHelper.getFetch(DateInactiveMap);
    Boolean DateInactiveSortDir = DataHelper.getSortDirection(DateInactiveMap);
    Integer DateInactiveSortOrder = DataHelper.getSortOrder(DateInactiveMap);
    if (DateInactiveFetch != null) out.setDateInactiveFetch(DateInactiveFetch);
    if (DateInactiveSortDir != null) out.setDateInactiveSortDirection(DateInactiveSortDir);
    if (DateInactiveSortOrder != null) out.setDateInactiveSortOrder(DateInactiveSortOrder);

    Filter[] DateInactiveFilter = DataHelper.mapToFilterArray(DateInactiveMap, Date.class);
    if (DateInactiveFilter != null) {
      DateFilter[] DateInactiveFilters = new DateFilter[DateInactiveFilter.length];
      for (int i = 0; i < DateInactiveFilters.length; i++) {
        DateInactiveFilters[i] = (DateFilter)DateInactiveFilter[i];
      }
      try {
        out.setDateInactiveFilter(DateInactiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RevRcvCostCtrMap = (Map)record.get("RevRcvCostCtr");
    Boolean RevRcvCostCtrFetch = DataHelper.getFetch(RevRcvCostCtrMap);
    Boolean RevRcvCostCtrSortDir = DataHelper.getSortDirection(RevRcvCostCtrMap);
    Integer RevRcvCostCtrSortOrder = DataHelper.getSortOrder(RevRcvCostCtrMap);
    if (RevRcvCostCtrFetch != null) out.setRevRcvCostCtrFetch(RevRcvCostCtrFetch);
    if (RevRcvCostCtrSortDir != null) out.setRevRcvCostCtrSortDirection(RevRcvCostCtrSortDir);
    if (RevRcvCostCtrSortOrder != null) out.setRevRcvCostCtrSortOrder(RevRcvCostCtrSortOrder);

    Filter[] RevRcvCostCtrFilter = DataHelper.mapToFilterArray(RevRcvCostCtrMap, Integer.class);
    if (RevRcvCostCtrFilter != null) {
      IntegerFilter[] RevRcvCostCtrFilters = new IntegerFilter[RevRcvCostCtrFilter.length];
      for (int i = 0; i < RevRcvCostCtrFilters.length; i++) {
        RevRcvCostCtrFilters[i] = (IntegerFilter)RevRcvCostCtrFilter[i];
      }
      try {
        out.setRevRcvCostCtrFilter(RevRcvCostCtrFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningCostCtrMap = (Map)record.get("OwningCostCtr");
    Boolean OwningCostCtrFetch = DataHelper.getFetch(OwningCostCtrMap);
    Boolean OwningCostCtrSortDir = DataHelper.getSortDirection(OwningCostCtrMap);
    Integer OwningCostCtrSortOrder = DataHelper.getSortOrder(OwningCostCtrMap);
    if (OwningCostCtrFetch != null) out.setOwningCostCtrFetch(OwningCostCtrFetch);
    if (OwningCostCtrSortDir != null) out.setOwningCostCtrSortDirection(OwningCostCtrSortDir);
    if (OwningCostCtrSortOrder != null) out.setOwningCostCtrSortOrder(OwningCostCtrSortOrder);

    Filter[] OwningCostCtrFilter = DataHelper.mapToFilterArray(OwningCostCtrMap, Integer.class);
    if (OwningCostCtrFilter != null) {
      IntegerFilter[] OwningCostCtrFilters = new IntegerFilter[OwningCostCtrFilter.length];
      for (int i = 0; i < OwningCostCtrFilters.length; i++) {
        OwningCostCtrFilters[i] = (IntegerFilter)OwningCostCtrFilter[i];
      }
      try {
        out.setOwningCostCtrFilter(OwningCostCtrFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AcctSegIdMap = (Map)record.get("AcctSegId");
    Boolean AcctSegIdFetch = DataHelper.getFetch(AcctSegIdMap);
    Boolean AcctSegIdSortDir = DataHelper.getSortDirection(AcctSegIdMap);
    Integer AcctSegIdSortOrder = DataHelper.getSortOrder(AcctSegIdMap);
    if (AcctSegIdFetch != null) out.setAcctSegIdFetch(AcctSegIdFetch);
    if (AcctSegIdSortDir != null) out.setAcctSegIdSortDirection(AcctSegIdSortDir);
    if (AcctSegIdSortOrder != null) out.setAcctSegIdSortOrder(AcctSegIdSortOrder);

    Filter[] AcctSegIdFilter = DataHelper.mapToFilterArray(AcctSegIdMap, Integer.class);
    if (AcctSegIdFilter != null) {
      IntegerFilter[] AcctSegIdFilters = new IntegerFilter[AcctSegIdFilter.length];
      for (int i = 0; i < AcctSegIdFilters.length; i++) {
        AcctSegIdFilters[i] = (IntegerFilter)AcctSegIdFilter[i];
      }
      try {
        out.setAcctSegIdFilter(AcctSegIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeThresholdMap = (Map)record.get("ChargeThreshold");
    Boolean ChargeThresholdFetch = DataHelper.getFetch(ChargeThresholdMap);
    Boolean ChargeThresholdSortDir = DataHelper.getSortDirection(ChargeThresholdMap);
    Integer ChargeThresholdSortOrder = DataHelper.getSortOrder(ChargeThresholdMap);
    if (ChargeThresholdFetch != null) out.setChargeThresholdFetch(ChargeThresholdFetch);
    if (ChargeThresholdSortDir != null) out.setChargeThresholdSortDirection(ChargeThresholdSortDir);
    if (ChargeThresholdSortOrder != null) out.setChargeThresholdSortOrder(ChargeThresholdSortOrder);

    Filter[] ChargeThresholdFilter = DataHelper.mapToFilterArray(ChargeThresholdMap, BigInteger.class);
    if (ChargeThresholdFilter != null) {
      BigIntegerFilter[] ChargeThresholdFilters = new BigIntegerFilter[ChargeThresholdFilter.length];
      for (int i = 0; i < ChargeThresholdFilters.length; i++) {
        ChargeThresholdFilters[i] = (BigIntegerFilter)ChargeThresholdFilter[i];
      }
      try {
        out.setChargeThresholdFilter(ChargeThresholdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ThresholdMap = (Map)record.get("Threshold");
    Boolean ThresholdFetch = DataHelper.getFetch(ThresholdMap);
    Boolean ThresholdSortDir = DataHelper.getSortDirection(ThresholdMap);
    Integer ThresholdSortOrder = DataHelper.getSortOrder(ThresholdMap);
    if (ThresholdFetch != null) out.setThresholdFetch(ThresholdFetch);
    if (ThresholdSortDir != null) out.setThresholdSortDirection(ThresholdSortDir);
    if (ThresholdSortOrder != null) out.setThresholdSortOrder(ThresholdSortOrder);

    Filter[] ThresholdFilter = DataHelper.mapToFilterArray(ThresholdMap, BigInteger.class);
    if (ThresholdFilter != null) {
      BigIntegerFilter[] ThresholdFilters = new BigIntegerFilter[ThresholdFilter.length];
      for (int i = 0; i < ThresholdFilters.length; i++) {
        ThresholdFilters[i] = (BigIntegerFilter)ThresholdFilter[i];
      }
      try {
        out.setThresholdFilter(ThresholdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CyclicalThresholdMap = (Map)record.get("CyclicalThreshold");
    Boolean CyclicalThresholdFetch = DataHelper.getFetch(CyclicalThresholdMap);
    Boolean CyclicalThresholdSortDir = DataHelper.getSortDirection(CyclicalThresholdMap);
    Integer CyclicalThresholdSortOrder = DataHelper.getSortOrder(CyclicalThresholdMap);
    if (CyclicalThresholdFetch != null) out.setCyclicalThresholdFetch(CyclicalThresholdFetch);
    if (CyclicalThresholdSortDir != null) out.setCyclicalThresholdSortDirection(CyclicalThresholdSortDir);
    if (CyclicalThresholdSortOrder != null) out.setCyclicalThresholdSortOrder(CyclicalThresholdSortOrder);

    Filter[] CyclicalThresholdFilter = DataHelper.mapToFilterArray(CyclicalThresholdMap, BigInteger.class);
    if (CyclicalThresholdFilter != null) {
      BigIntegerFilter[] CyclicalThresholdFilters = new BigIntegerFilter[CyclicalThresholdFilter.length];
      for (int i = 0; i < CyclicalThresholdFilters.length; i++) {
        CyclicalThresholdFilters[i] = (BigIntegerFilter)CyclicalThresholdFilter[i];
      }
      try {
        out.setCyclicalThresholdFilter(CyclicalThresholdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsgAmtLimitMap = (Map)record.get("UsgAmtLimit");
    Boolean UsgAmtLimitFetch = DataHelper.getFetch(UsgAmtLimitMap);
    Boolean UsgAmtLimitSortDir = DataHelper.getSortDirection(UsgAmtLimitMap);
    Integer UsgAmtLimitSortOrder = DataHelper.getSortOrder(UsgAmtLimitMap);
    if (UsgAmtLimitFetch != null) out.setUsgAmtLimitFetch(UsgAmtLimitFetch);
    if (UsgAmtLimitSortDir != null) out.setUsgAmtLimitSortDirection(UsgAmtLimitSortDir);
    if (UsgAmtLimitSortOrder != null) out.setUsgAmtLimitSortOrder(UsgAmtLimitSortOrder);

    Filter[] UsgAmtLimitFilter = DataHelper.mapToFilterArray(UsgAmtLimitMap, BigInteger.class);
    if (UsgAmtLimitFilter != null) {
      BigIntegerFilter[] UsgAmtLimitFilters = new BigIntegerFilter[UsgAmtLimitFilter.length];
      for (int i = 0; i < UsgAmtLimitFilters.length; i++) {
        UsgAmtLimitFilters[i] = (BigIntegerFilter)UsgAmtLimitFilter[i];
      }
      try {
        out.setUsgAmtLimitFilter(UsgAmtLimitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsgUnitsLimitMap = (Map)record.get("UsgUnitsLimit");
    Boolean UsgUnitsLimitFetch = DataHelper.getFetch(UsgUnitsLimitMap);
    Boolean UsgUnitsLimitSortDir = DataHelper.getSortDirection(UsgUnitsLimitMap);
    Integer UsgUnitsLimitSortOrder = DataHelper.getSortOrder(UsgUnitsLimitMap);
    if (UsgUnitsLimitFetch != null) out.setUsgUnitsLimitFetch(UsgUnitsLimitFetch);
    if (UsgUnitsLimitSortDir != null) out.setUsgUnitsLimitSortDirection(UsgUnitsLimitSortDir);
    if (UsgUnitsLimitSortOrder != null) out.setUsgUnitsLimitSortOrder(UsgUnitsLimitSortOrder);

    Filter[] UsgUnitsLimitFilter = DataHelper.mapToFilterArray(UsgUnitsLimitMap, BigInteger.class);
    if (UsgUnitsLimitFilter != null) {
      BigIntegerFilter[] UsgUnitsLimitFilters = new BigIntegerFilter[UsgUnitsLimitFilter.length];
      for (int i = 0; i < UsgUnitsLimitFilters.length; i++) {
        UsgUnitsLimitFilters[i] = (BigIntegerFilter)UsgUnitsLimitFilter[i];
      }
      try {
        out.setUsgUnitsLimitFilter(UsgUnitsLimitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RegulatoryIdMap = (Map)record.get("RegulatoryId");
    Boolean RegulatoryIdFetch = DataHelper.getFetch(RegulatoryIdMap);
    Boolean RegulatoryIdSortDir = DataHelper.getSortDirection(RegulatoryIdMap);
    Integer RegulatoryIdSortOrder = DataHelper.getSortOrder(RegulatoryIdMap);
    if (RegulatoryIdFetch != null) out.setRegulatoryIdFetch(RegulatoryIdFetch);
    if (RegulatoryIdSortDir != null) out.setRegulatoryIdSortDirection(RegulatoryIdSortDir);
    if (RegulatoryIdSortOrder != null) out.setRegulatoryIdSortOrder(RegulatoryIdSortOrder);

    Filter[] RegulatoryIdFilter = DataHelper.mapToFilterArray(RegulatoryIdMap, Integer.class);
    if (RegulatoryIdFilter != null) {
      IntegerFilter[] RegulatoryIdFilters = new IntegerFilter[RegulatoryIdFilter.length];
      for (int i = 0; i < RegulatoryIdFilters.length; i++) {
        RegulatoryIdFilters[i] = (IntegerFilter)RegulatoryIdFilter[i];
      }
      try {
        out.setRegulatoryIdFilter(RegulatoryIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GlobalContractStatusMap = (Map)record.get("GlobalContractStatus");
    Boolean GlobalContractStatusFetch = DataHelper.getFetch(GlobalContractStatusMap);
    Boolean GlobalContractStatusSortDir = DataHelper.getSortDirection(GlobalContractStatusMap);
    Integer GlobalContractStatusSortOrder = DataHelper.getSortOrder(GlobalContractStatusMap);
    if (GlobalContractStatusFetch != null) out.setGlobalContractStatusFetch(GlobalContractStatusFetch);
    if (GlobalContractStatusSortDir != null) out.setGlobalContractStatusSortDirection(GlobalContractStatusSortDir);
    if (GlobalContractStatusSortOrder != null) out.setGlobalContractStatusSortOrder(GlobalContractStatusSortOrder);

    Filter[] GlobalContractStatusFilter = DataHelper.mapToFilterArray(GlobalContractStatusMap, Integer.class);
    if (GlobalContractStatusFilter != null) {
      IntegerFilter[] GlobalContractStatusFilters = new IntegerFilter[GlobalContractStatusFilter.length];
      for (int i = 0; i < GlobalContractStatusFilters.length; i++) {
        GlobalContractStatusFilters[i] = (IntegerFilter)GlobalContractStatusFilter[i];
      }
      try {
        out.setGlobalContractStatusFilter(GlobalContractStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltLnameMap = (Map)record.get("AltLname");
    Boolean AltLnameFetch = DataHelper.getFetch(AltLnameMap);
    Boolean AltLnameSortDir = DataHelper.getSortDirection(AltLnameMap);
    Integer AltLnameSortOrder = DataHelper.getSortOrder(AltLnameMap);
    if (AltLnameFetch != null) out.setAltLnameFetch(AltLnameFetch);
    if (AltLnameSortDir != null) out.setAltLnameSortDirection(AltLnameSortDir);
    if (AltLnameSortOrder != null) out.setAltLnameSortOrder(AltLnameSortOrder);

    Filter[] AltLnameFilter = DataHelper.mapToFilterArray(AltLnameMap, String.class);
    if (AltLnameFilter != null) {
      StringFilter[] AltLnameFilters = new StringFilter[AltLnameFilter.length];
      for (int i = 0; i < AltLnameFilters.length; i++) {
        AltLnameFilters[i] = (StringFilter)AltLnameFilter[i];
      }
      try {
        out.setAltLnameFilter(AltLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltFnameMap = (Map)record.get("AltFname");
    Boolean AltFnameFetch = DataHelper.getFetch(AltFnameMap);
    Boolean AltFnameSortDir = DataHelper.getSortDirection(AltFnameMap);
    Integer AltFnameSortOrder = DataHelper.getSortOrder(AltFnameMap);
    if (AltFnameFetch != null) out.setAltFnameFetch(AltFnameFetch);
    if (AltFnameSortDir != null) out.setAltFnameSortDirection(AltFnameSortDir);
    if (AltFnameSortOrder != null) out.setAltFnameSortOrder(AltFnameSortOrder);

    Filter[] AltFnameFilter = DataHelper.mapToFilterArray(AltFnameMap, String.class);
    if (AltFnameFilter != null) {
      StringFilter[] AltFnameFilters = new StringFilter[AltFnameFilter.length];
      for (int i = 0; i < AltFnameFilters.length; i++) {
        AltFnameFilters[i] = (StringFilter)AltFnameFilter[i];
      }
      try {
        out.setAltFnameFilter(AltFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltCompanyNameMap = (Map)record.get("AltCompanyName");
    Boolean AltCompanyNameFetch = DataHelper.getFetch(AltCompanyNameMap);
    Boolean AltCompanyNameSortDir = DataHelper.getSortDirection(AltCompanyNameMap);
    Integer AltCompanyNameSortOrder = DataHelper.getSortOrder(AltCompanyNameMap);
    if (AltCompanyNameFetch != null) out.setAltCompanyNameFetch(AltCompanyNameFetch);
    if (AltCompanyNameSortDir != null) out.setAltCompanyNameSortDirection(AltCompanyNameSortDir);
    if (AltCompanyNameSortOrder != null) out.setAltCompanyNameSortOrder(AltCompanyNameSortOrder);

    Filter[] AltCompanyNameFilter = DataHelper.mapToFilterArray(AltCompanyNameMap, String.class);
    if (AltCompanyNameFilter != null) {
      StringFilter[] AltCompanyNameFilters = new StringFilter[AltCompanyNameFilter.length];
      for (int i = 0; i < AltCompanyNameFilters.length; i++) {
        AltCompanyNameFilters[i] = (StringFilter)AltCompanyNameFilter[i];
      }
      try {
        out.setAltCompanyNameFilter(AltCompanyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GenderMap = (Map)record.get("Gender");
    Boolean GenderFetch = DataHelper.getFetch(GenderMap);
    Boolean GenderSortDir = DataHelper.getSortDirection(GenderMap);
    Integer GenderSortOrder = DataHelper.getSortOrder(GenderMap);
    if (GenderFetch != null) out.setGenderFetch(GenderFetch);
    if (GenderSortDir != null) out.setGenderSortDirection(GenderSortDir);
    if (GenderSortOrder != null) out.setGenderSortOrder(GenderSortOrder);

    Filter[] GenderFilter = DataHelper.mapToFilterArray(GenderMap, Integer.class);
    if (GenderFilter != null) {
      IntegerFilter[] GenderFilters = new IntegerFilter[GenderFilter.length];
      for (int i = 0; i < GenderFilters.length; i++) {
        GenderFilters[i] = (IntegerFilter)GenderFilter[i];
      }
      try {
        out.setGenderFilter(GenderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DeptMap = (Map)record.get("Dept");
    Boolean DeptFetch = DataHelper.getFetch(DeptMap);
    Boolean DeptSortDir = DataHelper.getSortDirection(DeptMap);
    Integer DeptSortOrder = DataHelper.getSortOrder(DeptMap);
    if (DeptFetch != null) out.setDeptFetch(DeptFetch);
    if (DeptSortDir != null) out.setDeptSortDirection(DeptSortDir);
    if (DeptSortOrder != null) out.setDeptSortOrder(DeptSortOrder);

    Filter[] DeptFilter = DataHelper.mapToFilterArray(DeptMap, String.class);
    if (DeptFilter != null) {
      StringFilter[] DeptFilters = new StringFilter[DeptFilter.length];
      for (int i = 0; i < DeptFilters.length; i++) {
        DeptFilters[i] = (StringFilter)DeptFilter[i];
      }
      try {
        out.setDeptFilter(DeptFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TitleMap = (Map)record.get("Title");
    Boolean TitleFetch = DataHelper.getFetch(TitleMap);
    Boolean TitleSortDir = DataHelper.getSortDirection(TitleMap);
    Integer TitleSortOrder = DataHelper.getSortOrder(TitleMap);
    if (TitleFetch != null) out.setTitleFetch(TitleFetch);
    if (TitleSortDir != null) out.setTitleSortDirection(TitleSortDir);
    if (TitleSortOrder != null) out.setTitleSortOrder(TitleSortOrder);

    Filter[] TitleFilter = DataHelper.mapToFilterArray(TitleMap, String.class);
    if (TitleFilter != null) {
      StringFilter[] TitleFilters = new StringFilter[TitleFilter.length];
      for (int i = 0; i < TitleFilters.length; i++) {
        TitleFilters[i] = (StringFilter)TitleFilter[i];
      }
      try {
        out.setTitleFilter(TitleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentProfileIdMap = (Map)record.get("PaymentProfileId");
    Boolean PaymentProfileIdFetch = DataHelper.getFetch(PaymentProfileIdMap);
    Boolean PaymentProfileIdSortDir = DataHelper.getSortDirection(PaymentProfileIdMap);
    Integer PaymentProfileIdSortOrder = DataHelper.getSortOrder(PaymentProfileIdMap);
    if (PaymentProfileIdFetch != null) out.setPaymentProfileIdFetch(PaymentProfileIdFetch);
    if (PaymentProfileIdSortDir != null) out.setPaymentProfileIdSortDirection(PaymentProfileIdSortDir);
    if (PaymentProfileIdSortOrder != null) out.setPaymentProfileIdSortOrder(PaymentProfileIdSortOrder);

    Filter[] PaymentProfileIdFilter = DataHelper.mapToFilterArray(PaymentProfileIdMap, BigInteger.class);
    if (PaymentProfileIdFilter != null) {
      BigIntegerFilter[] PaymentProfileIdFilters = new BigIntegerFilter[PaymentProfileIdFilter.length];
      for (int i = 0; i < PaymentProfileIdFilters.length; i++) {
        PaymentProfileIdFilters[i] = (BigIntegerFilter)PaymentProfileIdFilter[i];
      }
      try {
        out.setPaymentProfileIdFilter(PaymentProfileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountProcessFlagMap = (Map)record.get("AccountProcessFlag");
    Boolean AccountProcessFlagFetch = DataHelper.getFetch(AccountProcessFlagMap);
    Boolean AccountProcessFlagSortDir = DataHelper.getSortDirection(AccountProcessFlagMap);
    Integer AccountProcessFlagSortOrder = DataHelper.getSortOrder(AccountProcessFlagMap);
    if (AccountProcessFlagFetch != null) out.setAccountProcessFlagFetch(AccountProcessFlagFetch);
    if (AccountProcessFlagSortDir != null) out.setAccountProcessFlagSortDirection(AccountProcessFlagSortDir);
    if (AccountProcessFlagSortOrder != null) out.setAccountProcessFlagSortOrder(AccountProcessFlagSortOrder);

    Filter[] AccountProcessFlagFilter = DataHelper.mapToFilterArray(AccountProcessFlagMap, Integer.class);
    if (AccountProcessFlagFilter != null) {
      IntegerFilter[] AccountProcessFlagFilters = new IntegerFilter[AccountProcessFlagFilter.length];
      for (int i = 0; i < AccountProcessFlagFilters.length; i++) {
        AccountProcessFlagFilters[i] = (IntegerFilter)AccountProcessFlagFilter[i];
      }
      try {
        out.setAccountProcessFlagFilter(AccountProcessFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SdAgencyIdMap = (Map)record.get("SdAgencyId");
    Boolean SdAgencyIdFetch = DataHelper.getFetch(SdAgencyIdMap);
    Boolean SdAgencyIdSortDir = DataHelper.getSortDirection(SdAgencyIdMap);
    Integer SdAgencyIdSortOrder = DataHelper.getSortOrder(SdAgencyIdMap);
    if (SdAgencyIdFetch != null) out.setSdAgencyIdFetch(SdAgencyIdFetch);
    if (SdAgencyIdSortDir != null) out.setSdAgencyIdSortDirection(SdAgencyIdSortDir);
    if (SdAgencyIdSortOrder != null) out.setSdAgencyIdSortOrder(SdAgencyIdSortOrder);

    Filter[] SdAgencyIdFilter = DataHelper.mapToFilterArray(SdAgencyIdMap, String.class);
    if (SdAgencyIdFilter != null) {
      StringFilter[] SdAgencyIdFilters = new StringFilter[SdAgencyIdFilter.length];
      for (int i = 0; i < SdAgencyIdFilters.length; i++) {
        SdAgencyIdFilters[i] = (StringFilter)SdAgencyIdFilter[i];
      }
      try {
        out.setSdAgencyIdFilter(SdAgencyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustomerLifetimeIdMap = (Map)record.get("CustomerLifetimeId");
    Boolean CustomerLifetimeIdFetch = DataHelper.getFetch(CustomerLifetimeIdMap);
    Boolean CustomerLifetimeIdSortDir = DataHelper.getSortDirection(CustomerLifetimeIdMap);
    Integer CustomerLifetimeIdSortOrder = DataHelper.getSortOrder(CustomerLifetimeIdMap);
    if (CustomerLifetimeIdFetch != null) out.setCustomerLifetimeIdFetch(CustomerLifetimeIdFetch);
    if (CustomerLifetimeIdSortDir != null) out.setCustomerLifetimeIdSortDirection(CustomerLifetimeIdSortDir);
    if (CustomerLifetimeIdSortOrder != null) out.setCustomerLifetimeIdSortOrder(CustomerLifetimeIdSortOrder);

    Filter[] CustomerLifetimeIdFilter = DataHelper.mapToFilterArray(CustomerLifetimeIdMap, Integer.class);
    if (CustomerLifetimeIdFilter != null) {
      IntegerFilter[] CustomerLifetimeIdFilters = new IntegerFilter[CustomerLifetimeIdFilter.length];
      for (int i = 0; i < CustomerLifetimeIdFilters.length; i++) {
        CustomerLifetimeIdFilters[i] = (IntegerFilter)CustomerLifetimeIdFilter[i];
      }
      try {
        out.setCustomerLifetimeIdFilter(CustomerLifetimeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustomerLifetimeId2Map = (Map)record.get("CustomerLifetimeId2");
    Boolean CustomerLifetimeId2Fetch = DataHelper.getFetch(CustomerLifetimeId2Map);
    Boolean CustomerLifetimeId2SortDir = DataHelper.getSortDirection(CustomerLifetimeId2Map);
    Integer CustomerLifetimeId2SortOrder = DataHelper.getSortOrder(CustomerLifetimeId2Map);
    if (CustomerLifetimeId2Fetch != null) out.setCustomerLifetimeId2Fetch(CustomerLifetimeId2Fetch);
    if (CustomerLifetimeId2SortDir != null) out.setCustomerLifetimeId2SortDirection(CustomerLifetimeId2SortDir);
    if (CustomerLifetimeId2SortOrder != null) out.setCustomerLifetimeId2SortOrder(CustomerLifetimeId2SortOrder);

    Filter[] CustomerLifetimeId2Filter = DataHelper.mapToFilterArray(CustomerLifetimeId2Map, Integer.class);
    if (CustomerLifetimeId2Filter != null) {
      IntegerFilter[] CustomerLifetimeId2Filters = new IntegerFilter[CustomerLifetimeId2Filter.length];
      for (int i = 0; i < CustomerLifetimeId2Filters.length; i++) {
        CustomerLifetimeId2Filters[i] = (IntegerFilter)CustomerLifetimeId2Filter[i];
      }
      try {
        out.setCustomerLifetimeId2Filter(CustomerLifetimeId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AutoWriteoffStatusMap = (Map)record.get("AutoWriteoffStatus");
    Boolean AutoWriteoffStatusFetch = DataHelper.getFetch(AutoWriteoffStatusMap);
    Boolean AutoWriteoffStatusSortDir = DataHelper.getSortDirection(AutoWriteoffStatusMap);
    Integer AutoWriteoffStatusSortOrder = DataHelper.getSortOrder(AutoWriteoffStatusMap);
    if (AutoWriteoffStatusFetch != null) out.setAutoWriteoffStatusFetch(AutoWriteoffStatusFetch);
    if (AutoWriteoffStatusSortDir != null) out.setAutoWriteoffStatusSortDirection(AutoWriteoffStatusSortDir);
    if (AutoWriteoffStatusSortOrder != null) out.setAutoWriteoffStatusSortOrder(AutoWriteoffStatusSortOrder);

    Filter[] AutoWriteoffStatusFilter = DataHelper.mapToFilterArray(AutoWriteoffStatusMap, Integer.class);
    if (AutoWriteoffStatusFilter != null) {
      IntegerFilter[] AutoWriteoffStatusFilters = new IntegerFilter[AutoWriteoffStatusFilter.length];
      for (int i = 0; i < AutoWriteoffStatusFilters.length; i++) {
        AutoWriteoffStatusFilters[i] = (IntegerFilter)AutoWriteoffStatusFilter[i];
      }
      try {
        out.setAutoWriteoffStatusFilter(AutoWriteoffStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
