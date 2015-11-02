/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentObjectHelper.java
 * Definition File: Customer/Adjustment.xml
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



/** Helper class to convert AdjustmentObject JavaBean objects to/from HashMaps.
 */
public class AdjustmentObjectHelper implements ArubaObjectHelper
{
  /** convert AdjustmentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AdjustmentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AdjustmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AdjustmentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentObjectData the converted object
   */
  public static AdjustmentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AdjustmentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentObject")
   * @return AdjustmentObjectData the converted object
   */
  public static AdjustmentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AdjustmentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentObjectFilter the converted object
   */
  public static AdjustmentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AdjustmentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AdjustmentObject")
   * @return AdjustmentObjectFilter the converted object
   */
  public static AdjustmentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AdjustmentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AdjustmentObjectDataList the converted object
   */
  public static AdjustmentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AdjustmentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentObjectList")
   * @return AdjustmentObjectDataList the converted object
   */
  public static AdjustmentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AdjustmentObjectData[] array = null;
    if (root != null)
    {
      array = new AdjustmentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AdjustmentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AdjustmentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AdjustmentObjectDataList (array, index, total);
  }
  /** convert AdjustmentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AdjustmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CcardAccountSet) record.put ("CcardAccount", in.CcardAccount);
  
    if (in._OwnrLnameSet) record.put ("OwnrLname", in.OwnrLname);
  
    if (in._OwnrFnameSet) record.put ("OwnrFname", in.OwnrFname);
  
    if (in._CcardCarrierSet) record.put ("CcardCarrier", in.CcardCarrier);
  
    if (in._CcardExpireSet) record.put ("CcardExpire", in.CcardExpire);
  
    if (in._AvsAddressIdSet) record.put ("AvsAddressId", in.AvsAddressId);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._AvsResponseCodeSet) record.put ("AvsResponseCode", in.AvsResponseCode);
  
    if (in._TransFlagSet) record.put ("TransFlag", in.TransFlag);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._PrepayBalanceDescSet) record.put ("PrepayBalanceDesc", in.PrepayBalanceDesc);
  
    if (in._TransSignSet) record.put ("TransSign", in.TransSign);
  
    if (in._BillingCategorySet) record.put ("BillingCategory", in.BillingCategory);
  
    if (in._TransTargetTypeSet) record.put ("TransTargetType", in.TransTargetType);
  
    if (in._IsNegativeBillAdjSet) record.put ("IsNegativeBillAdj", in.IsNegativeBillAdj);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._TransCodeSet) record.put ("TransCode", in.TransCode);
  
    if (in._OrigTransCodeSet) record.put ("OrigTransCode", in.OrigTransCode);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
    if (in._PrimaryUnitsTypeSet) record.put ("PrimaryUnitsType", in.PrimaryUnitsType);
  
    if (in._PrimaryUnitsSet) record.put ("PrimaryUnits", in.PrimaryUnits);
  
    if (in._TransactDateSet) record.put ("TransactDate", in.TransactDate);
  
    if (in._EffectiveDateSet) record.put ("EffectiveDate", in.EffectiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._TrackingIdCounterSet) record.put ("TrackingIdCounter", in.TrackingIdCounter);
  
    if (in._RequestStatusSet) record.put ("RequestStatus", in.RequestStatus);
  
    if (in._ReviewDateSet) record.put ("ReviewDate", in.ReviewDate);
  
    if (in._SupervisorNameSet) record.put ("SupervisorName", in.SupervisorName);
  
    if (in._CurrentFlagSet) record.put ("CurrentFlag", in.CurrentFlag);
  
    if (in._PendingFlagSet) record.put ("PendingFlag", in.PendingFlag);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._TotalAmtSet) record.put ("TotalAmt", in.TotalAmt);
  
    if (in._RatedFlagSet) record.put ("RatedFlag", in.RatedFlag);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._OrigProviderIdSet) record.put ("OrigProviderId", in.OrigProviderId);
  
    if (in._OrigBillRefNoSet) record.put ("OrigBillRefNo", in.OrigBillRefNo);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._OrigBillInvoiceRowSet) record.put ("OrigBillInvoiceRow", in.OrigBillInvoiceRow);
  
    if (in._OrigTypeSet) record.put ("OrigType", in.OrigType);
  
    if (in._OrigSubtypeSet) record.put ("OrigSubtype", in.OrigSubtype);
  
    if (in._OrigMsgIdSet) record.put ("OrigMsgId", in.OrigMsgId);
  
    if (in._OrigMsgId2Set) record.put ("OrigMsgId2", in.OrigMsgId2);
  
    if (in._OrigMsgIdServSet) record.put ("OrigMsgIdServ", in.OrigMsgIdServ);
  
    if (in._OrigTrackingIdSet) record.put ("OrigTrackingId", in.OrigTrackingId);
  
    if (in._OrigTrackingIdServSet) record.put ("OrigTrackingIdServ", in.OrigTrackingIdServ);
  
    if (in._OrigTrackingDtSet) record.put ("OrigTrackingDt", in.OrigTrackingDt);
  
    if (in._OrigRcFromDateSet) record.put ("OrigRcFromDate", in.OrigRcFromDate);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._TaxClassSet) record.put ("TaxClass", in.TaxClass);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
  
    if (in._AuxTaxInfoSet) record.put ("AuxTaxInfo", in.AuxTaxInfo);
  
    if (in._CombTaxRateSet) record.put ("CombTaxRate", in.CombTaxRate);
  
    if (in._FederalTaxSet) record.put ("FederalTax", in.FederalTax);
  
    if (in._StateTaxSet) record.put ("StateTax", in.StateTax);
  
    if (in._CountyTaxSet) record.put ("CountyTax", in.CountyTax);
  
    if (in._CityTaxSet) record.put ("CityTax", in.CityTax);
  
    if (in._OtherTaxSet) record.put ("OtherTax", in.OtherTax);
  
    if (in._TaxJournalStatusSet) record.put ("TaxJournalStatus", in.TaxJournalStatus);
  
    if (in._DiscountAmtSet) record.put ("DiscountAmt", in.DiscountAmt);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._AdjReasonCodeSet) record.put ("AdjReasonCode", in.AdjReasonCode);
  
    if (in._FraudIndicatorSet) record.put ("FraudIndicator", in.FraudIndicator);
  
    if (in._RevRcvCostCtrSet) record.put ("RevRcvCostCtr", in.RevRcvCostCtr);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._BalanceChgDateSet) record.put ("BalanceChgDate", in.BalanceChgDate);
  
    if (in._BRevRcvCostCtrSet) record.put ("BRevRcvCostCtr", in.BRevRcvCostCtr);
  
    if (in._OrigSplitRowNumSet) record.put ("OrigSplitRowNum", in.OrigSplitRowNum);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._OrigSubmitterNameSet) record.put ("OrigSubmitterName", in.OrigSubmitterName);
  
    if (in._LastReviewedNameSet) record.put ("LastReviewedName", in.LastReviewedName);
  
    if (in._JurisdictionSet) record.put ("Jurisdiction", in.Jurisdiction);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._BillOrderNumberSet) record.put ("BillOrderNumber", in.BillOrderNumber);
  
    if (in._RequestIdSet) record.put ("RequestId", in.RequestId);
      return record;
  }
  /** convert AdjustmentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AdjustmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CcardAccount, in.CcardAccountSort, in.CcardAccountSortAscending, in.CcardAccountFetch, in.CcardAccountCaseInsensitive);
      if (map != null) record.put ("CcardAccount", map);
      map = DataHelper.filterToMap (in.OwnrLname, in.OwnrLnameSort, in.OwnrLnameSortAscending, in.OwnrLnameFetch, in.OwnrLnameCaseInsensitive);
      if (map != null) record.put ("OwnrLname", map);
      map = DataHelper.filterToMap (in.OwnrFname, in.OwnrFnameSort, in.OwnrFnameSortAscending, in.OwnrFnameFetch, in.OwnrFnameCaseInsensitive);
      if (map != null) record.put ("OwnrFname", map);
      map = DataHelper.filterToMap (in.CcardCarrier, in.CcardCarrierSort, in.CcardCarrierSortAscending, in.CcardCarrierFetch, in.CcardCarrierCaseInsensitive);
      if (map != null) record.put ("CcardCarrier", map);
      map = DataHelper.filterToMap (in.CcardExpire, in.CcardExpireSort, in.CcardExpireSortAscending, in.CcardExpireFetch, in.CcardExpireCaseInsensitive);
      if (map != null) record.put ("CcardExpire", map);
      map = DataHelper.filterToMap (in.AvsAddressId, in.AvsAddressIdSort, in.AvsAddressIdSortAscending, in.AvsAddressIdFetch);
      if (map != null) record.put ("AvsAddressId", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.AvsResponseCode, in.AvsResponseCodeSort, in.AvsResponseCodeSortAscending, in.AvsResponseCodeFetch, in.AvsResponseCodeCaseInsensitive);
      if (map != null) record.put ("AvsResponseCode", map);
      map = DataHelper.filterToMap (in.TransFlag, in.TransFlagSort, in.TransFlagSortAscending, in.TransFlagFetch, in.TransFlagCaseInsensitive);
      if (map != null) record.put ("TransFlag", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.PrepayBalanceDesc, in.PrepayBalanceDescSort, in.PrepayBalanceDescSortAscending, in.PrepayBalanceDescFetch, in.PrepayBalanceDescCaseInsensitive);
      if (map != null) record.put ("PrepayBalanceDesc", map);
      map = DataHelper.filterToMap (in.TransSign, in.TransSignSort, in.TransSignSortAscending, in.TransSignFetch);
      if (map != null) record.put ("TransSign", map);
      map = DataHelper.filterToMap (in.BillingCategory, in.BillingCategorySort, in.BillingCategorySortAscending, in.BillingCategoryFetch);
      if (map != null) record.put ("BillingCategory", map);
      map = DataHelper.filterToMap (in.TransTargetType, in.TransTargetTypeSort, in.TransTargetTypeSortAscending, in.TransTargetTypeFetch);
      if (map != null) record.put ("TransTargetType", map);
      map = DataHelper.filterToMap (in.IsNegativeBillAdj, in.IsNegativeBillAdjSort, in.IsNegativeBillAdjSortAscending, in.IsNegativeBillAdjFetch);
      if (map != null) record.put ("IsNegativeBillAdj", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch); 
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.TransCode, in.TransCodeSort, in.TransCodeSortAscending, in.TransCodeFetch);
      if (map != null) record.put ("TransCode", map);
      map = DataHelper.filterToMap (in.OrigTransCode, in.OrigTransCodeSort, in.OrigTransCodeSortAscending, in.OrigTransCodeFetch);
      if (map != null) record.put ("OrigTransCode", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
      map = DataHelper.filterToMap (in.PrimaryUnitsType, in.PrimaryUnitsTypeSort, in.PrimaryUnitsTypeSortAscending, in.PrimaryUnitsTypeFetch);
      if (map != null) record.put ("PrimaryUnitsType", map);
      map = DataHelper.filterToMap (in.PrimaryUnits, in.PrimaryUnitsSort, in.PrimaryUnitsSortAscending, in.PrimaryUnitsFetch);
      if (map != null) record.put ("PrimaryUnits", map);
      map = DataHelper.filterToMap (in.TransactDate, in.TransactDateSort, in.TransactDateSortAscending, in.TransactDateFetch);
      if (map != null) record.put ("TransactDate", map);
      map = DataHelper.filterToMap (in.EffectiveDate, in.EffectiveDateSort, in.EffectiveDateSortAscending, in.EffectiveDateFetch);
      if (map != null) record.put ("EffectiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.TrackingIdCounter, in.TrackingIdCounterSort, in.TrackingIdCounterSortAscending, in.TrackingIdCounterFetch);
      if (map != null) record.put ("TrackingIdCounter", map);
      map = DataHelper.filterToMap (in.RequestStatus, in.RequestStatusSort, in.RequestStatusSortAscending, in.RequestStatusFetch);
      if (map != null) record.put ("RequestStatus", map);
      map = DataHelper.filterToMap (in.ReviewDate, in.ReviewDateSort, in.ReviewDateSortAscending, in.ReviewDateFetch);
      if (map != null) record.put ("ReviewDate", map);
      map = DataHelper.filterToMap (in.SupervisorName, in.SupervisorNameSort, in.SupervisorNameSortAscending, in.SupervisorNameFetch, in.SupervisorNameCaseInsensitive);
      if (map != null) record.put ("SupervisorName", map);
      map = DataHelper.filterToMap (in.CurrentFlag, in.CurrentFlagSort, in.CurrentFlagSortAscending, in.CurrentFlagFetch);
      if (map != null) record.put ("CurrentFlag", map);
      map = DataHelper.filterToMap (in.PendingFlag, in.PendingFlagSort, in.PendingFlagSortAscending, in.PendingFlagFetch);
      if (map != null) record.put ("PendingFlag", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.TotalAmt, in.TotalAmtSort, in.TotalAmtSortAscending, in.TotalAmtFetch);
      if (map != null) record.put ("TotalAmt", map);
      map = DataHelper.filterToMap (in.RatedFlag, in.RatedFlagSort, in.RatedFlagSortAscending, in.RatedFlagFetch);
      if (map != null) record.put ("RatedFlag", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.OrigProviderId, in.OrigProviderIdSort, in.OrigProviderIdSortAscending, in.OrigProviderIdFetch);
      if (map != null) record.put ("OrigProviderId", map);
      map = DataHelper.filterToMap (in.OrigBillRefNo, in.OrigBillRefNoSort, in.OrigBillRefNoSortAscending, in.OrigBillRefNoFetch);
      if (map != null) record.put ("OrigBillRefNo", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.OrigBillInvoiceRow, in.OrigBillInvoiceRowSort, in.OrigBillInvoiceRowSortAscending, in.OrigBillInvoiceRowFetch);
      if (map != null) record.put ("OrigBillInvoiceRow", map);
      map = DataHelper.filterToMap (in.OrigType, in.OrigTypeSort, in.OrigTypeSortAscending, in.OrigTypeFetch);
      if (map != null) record.put ("OrigType", map);
      map = DataHelper.filterToMap (in.OrigSubtype, in.OrigSubtypeSort, in.OrigSubtypeSortAscending, in.OrigSubtypeFetch);
      if (map != null) record.put ("OrigSubtype", map);
      map = DataHelper.filterToMap (in.OrigMsgId, in.OrigMsgIdSort, in.OrigMsgIdSortAscending, in.OrigMsgIdFetch);
      if (map != null) record.put ("OrigMsgId", map);
      map = DataHelper.filterToMap (in.OrigMsgId2, in.OrigMsgId2Sort, in.OrigMsgId2SortAscending, in.OrigMsgId2Fetch);
      if (map != null) record.put ("OrigMsgId2", map);
      map = DataHelper.filterToMap (in.OrigMsgIdServ, in.OrigMsgIdServSort, in.OrigMsgIdServSortAscending, in.OrigMsgIdServFetch);
      if (map != null) record.put ("OrigMsgIdServ", map);
      map = DataHelper.filterToMap (in.OrigTrackingId, in.OrigTrackingIdSort, in.OrigTrackingIdSortAscending, in.OrigTrackingIdFetch);
      if (map != null) record.put ("OrigTrackingId", map);
      map = DataHelper.filterToMap (in.OrigTrackingIdServ, in.OrigTrackingIdServSort, in.OrigTrackingIdServSortAscending, in.OrigTrackingIdServFetch);
      if (map != null) record.put ("OrigTrackingIdServ", map);
      map = DataHelper.filterToMap (in.OrigTrackingDt, in.OrigTrackingDtSort, in.OrigTrackingDtSortAscending, in.OrigTrackingDtFetch);
      if (map != null) record.put ("OrigTrackingDt", map);
      map = DataHelper.filterToMap (in.OrigRcFromDate, in.OrigRcFromDateSort, in.OrigRcFromDateSortAscending, in.OrigRcFromDateFetch);
      if (map != null) record.put ("OrigRcFromDate", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.TaxClass, in.TaxClassSort, in.TaxClassSortAscending, in.TaxClassFetch);
      if (map != null) record.put ("TaxClass", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive);
      if (map != null) record.put ("Geocode", map);
      map = DataHelper.filterToMap (in.AuxTaxInfo, in.AuxTaxInfoSort, in.AuxTaxInfoSortAscending, in.AuxTaxInfoFetch, in.AuxTaxInfoCaseInsensitive);
      if (map != null) record.put ("AuxTaxInfo", map);
      map = DataHelper.filterToMap (in.CombTaxRate, in.CombTaxRateSort, in.CombTaxRateSortAscending, in.CombTaxRateFetch);
      if (map != null) record.put ("CombTaxRate", map);
      map = DataHelper.filterToMap (in.FederalTax, in.FederalTaxSort, in.FederalTaxSortAscending, in.FederalTaxFetch);
      if (map != null) record.put ("FederalTax", map);
      map = DataHelper.filterToMap (in.StateTax, in.StateTaxSort, in.StateTaxSortAscending, in.StateTaxFetch);
      if (map != null) record.put ("StateTax", map);
      map = DataHelper.filterToMap (in.CountyTax, in.CountyTaxSort, in.CountyTaxSortAscending, in.CountyTaxFetch);
      if (map != null) record.put ("CountyTax", map);
      map = DataHelper.filterToMap (in.CityTax, in.CityTaxSort, in.CityTaxSortAscending, in.CityTaxFetch);
      if (map != null) record.put ("CityTax", map);
      map = DataHelper.filterToMap (in.OtherTax, in.OtherTaxSort, in.OtherTaxSortAscending, in.OtherTaxFetch);
      if (map != null) record.put ("OtherTax", map);
      map = DataHelper.filterToMap (in.TaxJournalStatus, in.TaxJournalStatusSort, in.TaxJournalStatusSortAscending, in.TaxJournalStatusFetch);
      if (map != null) record.put ("TaxJournalStatus", map);
      map = DataHelper.filterToMap (in.DiscountAmt, in.DiscountAmtSort, in.DiscountAmtSortAscending, in.DiscountAmtFetch);
      if (map != null) record.put ("DiscountAmt", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.AdjReasonCode, in.AdjReasonCodeSort, in.AdjReasonCodeSortAscending, in.AdjReasonCodeFetch);
      if (map != null) record.put ("AdjReasonCode", map);
      map = DataHelper.filterToMap (in.FraudIndicator, in.FraudIndicatorSort, in.FraudIndicatorSortAscending, in.FraudIndicatorFetch);
      if (map != null) record.put ("FraudIndicator", map);
      map = DataHelper.filterToMap (in.RevRcvCostCtr, in.RevRcvCostCtrSort, in.RevRcvCostCtrSortAscending, in.RevRcvCostCtrFetch);
      if (map != null) record.put ("RevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.BalanceChgDate, in.BalanceChgDateSort, in.BalanceChgDateSortAscending, in.BalanceChgDateFetch);
      if (map != null) record.put ("BalanceChgDate", map);
      map = DataHelper.filterToMap (in.BRevRcvCostCtr, in.BRevRcvCostCtrSort, in.BRevRcvCostCtrSortAscending, in.BRevRcvCostCtrFetch);
      if (map != null) record.put ("BRevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.OrigSplitRowNum, in.OrigSplitRowNumSort, in.OrigSplitRowNumSortAscending, in.OrigSplitRowNumFetch);
      if (map != null) record.put ("OrigSplitRowNum", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.OrigSubmitterName, in.OrigSubmitterNameSort, in.OrigSubmitterNameSortAscending, in.OrigSubmitterNameFetch, in.OrigSubmitterNameCaseInsensitive);
      if (map != null) record.put ("OrigSubmitterName", map);
      map = DataHelper.filterToMap (in.LastReviewedName, in.LastReviewedNameSort, in.LastReviewedNameSortAscending, in.LastReviewedNameFetch, in.LastReviewedNameCaseInsensitive);
      if (map != null) record.put ("LastReviewedName", map);
      map = DataHelper.filterToMap (in.Jurisdiction, in.JurisdictionSort, in.JurisdictionSortAscending, in.JurisdictionFetch);
      if (map != null) record.put ("Jurisdiction", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.BillOrderNumber, in.BillOrderNumberSort, in.BillOrderNumberSortAscending, in.BillOrderNumberFetch, in.BillOrderNumberCaseInsensitive);
      if (map != null) record.put ("BillOrderNumber", map);
      map = DataHelper.filterToMap (in.RequestId, in.RequestIdSort, in.RequestIdSortAscending, in.RequestIdFetch);
      if (map != null) record.put ("RequestId", map);
    return record;
  }
  /** convert Map to AdjustmentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentObjectData the converted object
   */
  public static AdjustmentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentObjectData out = new AdjustmentObjectData ();

    out.Key = AdjustmentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CcardAccount")) != null)
    {
      out.CcardAccount = (String) obj;
    }
  
    if ((obj = record.get ("OwnrLname")) != null)
    {
      out.OwnrLname = (String) obj;
    }
  
    if ((obj = record.get ("OwnrFname")) != null)
    {
      out.OwnrFname = (String) obj;
    }
  
    if ((obj = record.get ("CcardCarrier")) != null)
    {
      out.CcardCarrier = (String) obj;
    }
  
    if ((obj = record.get ("CcardExpire")) != null)
    {
      out.CcardExpire = (String) obj;
    }
  
    if ((obj = record.get ("AvsAddressId")) != null)
    {
      out.AvsAddressId = (Integer) obj;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("AvsResponseCode")) != null)
    {
      out.AvsResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("TransFlag")) != null)
    {
      out.TransFlag = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("PrepayBalanceDesc")) != null)
    {
      out.PrepayBalanceDesc = (String) obj;
    }
  
    if ((obj = record.get ("TransSign")) != null)
    {
      out.TransSign = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingCategory")) != null)
    {
      out.BillingCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("TransTargetType")) != null)
    {
      out.TransTargetType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsNegativeBillAdj")) != null)
    {
      out.IsNegativeBillAdj = (Boolean) obj;
    }
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("TransCode")) != null)
    {
      out.TransCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTransCode")) != null)
    {
      out.OrigTransCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
  
    if ((obj = record.get ("PrimaryUnitsType")) != null)
    {
      out.PrimaryUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("PrimaryUnits")) != null)
    {
      out.PrimaryUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TransactDate")) != null)
    {
      out.TransactDate = (Date) obj;
    }
  
    if ((obj = record.get ("EffectiveDate")) != null)
    {
      out.EffectiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("TrackingIdCounter")) != null)
    {
      out.TrackingIdCounter = (Integer) obj;
    }
  
    if ((obj = record.get ("RequestStatus")) != null)
    {
      out.RequestStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("ReviewDate")) != null)
    {
      out.ReviewDate = (Date) obj;
    }
  
    if ((obj = record.get ("SupervisorName")) != null)
    {
      out.SupervisorName = (String) obj;
    }
  
    if ((obj = record.get ("CurrentFlag")) != null)
    {
      out.CurrentFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("PendingFlag")) != null)
    {
      out.PendingFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalAmt")) != null)
    {
      out.TotalAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RatedFlag")) != null)
    {
      out.RatedFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("OrigProviderId")) != null)
    {
      out.OrigProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefNo")) != null)
    {
      out.OrigBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefResets")) != null)
    {
      out.OrigBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillInvoiceRow")) != null)
    {
      out.OrigBillInvoiceRow = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigType")) != null)
    {
      out.OrigType = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigSubtype")) != null)
    {
      out.OrigSubtype = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigMsgId")) != null)
    {
      out.OrigMsgId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigMsgId2")) != null)
    {
      out.OrigMsgId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigMsgIdServ")) != null)
    {
      out.OrigMsgIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingId")) != null)
    {
      out.OrigTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingIdServ")) != null)
    {
      out.OrigTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingDt")) != null)
    {
      out.OrigTrackingDt = (Date) obj;
    }
  
    if ((obj = record.get ("OrigRcFromDate")) != null)
    {
      out.OrigRcFromDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxClass")) != null)
    {
      out.TaxClass = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
  
    if ((obj = record.get ("AuxTaxInfo")) != null)
    {
      out.AuxTaxInfo = (String) obj;
    }
  
    if ((obj = record.get ("CombTaxRate")) != null)
    {
      out.CombTaxRate = (Integer) obj;
    }
  
    if ((obj = record.get ("FederalTax")) != null)
    {
      out.FederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("StateTax")) != null)
    {
      out.StateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CountyTax")) != null)
    {
      out.CountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CityTax")) != null)
    {
      out.CityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OtherTax")) != null)
    {
      out.OtherTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TaxJournalStatus")) != null)
    {
      out.TaxJournalStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountAmt")) != null)
    {
      out.DiscountAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AdjReasonCode")) != null)
    {
      out.AdjReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FraudIndicator")) != null)
    {
      out.FraudIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("RevRcvCostCtr")) != null)
    {
      out.RevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("BalanceChgDate")) != null)
    {
      out.BalanceChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("BRevRcvCostCtr")) != null)
    {
      out.BRevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigSplitRowNum")) != null)
    {
      out.OrigSplitRowNum = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigSubmitterName")) != null)
    {
      out.OrigSubmitterName = (String) obj;
    }
  
    if ((obj = record.get ("LastReviewedName")) != null)
    {
      out.LastReviewedName = (String) obj;
    }
  
    if ((obj = record.get ("Jurisdiction")) != null)
    {
      out.Jurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillOrderNumber")) != null)
    {
      out.BillOrderNumber = (String) obj;
    }
  
    if ((obj = record.get ("RequestId")) != null)
    {
      out.RequestId = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to AdjustmentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentObjectFilter the converted object
   */
  public static AdjustmentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentObjectFilter out = new AdjustmentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AdjustmentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map CcardAccountMap = (Map)record.get("CcardAccount");
    Boolean CcardAccountFetch = DataHelper.getFetch(CcardAccountMap);
    Boolean CcardAccountSortDir = DataHelper.getSortDirection(CcardAccountMap);
    Integer CcardAccountSortOrder = DataHelper.getSortOrder(CcardAccountMap);
    if (CcardAccountFetch != null) out.setCcardAccountFetch(CcardAccountFetch);
    if (CcardAccountSortDir != null) out.setCcardAccountSortDirection(CcardAccountSortDir);
    if (CcardAccountSortOrder != null) out.setCcardAccountSortOrder(CcardAccountSortOrder);

    Filter[] CcardAccountFilter = DataHelper.mapToFilterArray(CcardAccountMap, String.class);
    if (CcardAccountFilter != null) {
      StringFilter[] CcardAccountFilters = new StringFilter[CcardAccountFilter.length];
      for (int i = 0; i < CcardAccountFilters.length; i++) {
        CcardAccountFilters[i] = (StringFilter)CcardAccountFilter[i];
      }
      try {
        out.setCcardAccountFilter(CcardAccountFilters);
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
  
    Map CcardCarrierMap = (Map)record.get("CcardCarrier");
    Boolean CcardCarrierFetch = DataHelper.getFetch(CcardCarrierMap);
    Boolean CcardCarrierSortDir = DataHelper.getSortDirection(CcardCarrierMap);
    Integer CcardCarrierSortOrder = DataHelper.getSortOrder(CcardCarrierMap);
    if (CcardCarrierFetch != null) out.setCcardCarrierFetch(CcardCarrierFetch);
    if (CcardCarrierSortDir != null) out.setCcardCarrierSortDirection(CcardCarrierSortDir);
    if (CcardCarrierSortOrder != null) out.setCcardCarrierSortOrder(CcardCarrierSortOrder);

    Filter[] CcardCarrierFilter = DataHelper.mapToFilterArray(CcardCarrierMap, String.class);
    if (CcardCarrierFilter != null) {
      StringFilter[] CcardCarrierFilters = new StringFilter[CcardCarrierFilter.length];
      for (int i = 0; i < CcardCarrierFilters.length; i++) {
        CcardCarrierFilters[i] = (StringFilter)CcardCarrierFilter[i];
      }
      try {
        out.setCcardCarrierFilter(CcardCarrierFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CcardExpireMap = (Map)record.get("CcardExpire");
    Boolean CcardExpireFetch = DataHelper.getFetch(CcardExpireMap);
    Boolean CcardExpireSortDir = DataHelper.getSortDirection(CcardExpireMap);
    Integer CcardExpireSortOrder = DataHelper.getSortOrder(CcardExpireMap);
    if (CcardExpireFetch != null) out.setCcardExpireFetch(CcardExpireFetch);
    if (CcardExpireSortDir != null) out.setCcardExpireSortDirection(CcardExpireSortDir);
    if (CcardExpireSortOrder != null) out.setCcardExpireSortOrder(CcardExpireSortOrder);

    Filter[] CcardExpireFilter = DataHelper.mapToFilterArray(CcardExpireMap, String.class);
    if (CcardExpireFilter != null) {
      StringFilter[] CcardExpireFilters = new StringFilter[CcardExpireFilter.length];
      for (int i = 0; i < CcardExpireFilters.length; i++) {
        CcardExpireFilters[i] = (StringFilter)CcardExpireFilter[i];
      }
      try {
        out.setCcardExpireFilter(CcardExpireFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvsAddressIdMap = (Map)record.get("AvsAddressId");
    Boolean AvsAddressIdFetch = DataHelper.getFetch(AvsAddressIdMap);
    Boolean AvsAddressIdSortDir = DataHelper.getSortDirection(AvsAddressIdMap);
    Integer AvsAddressIdSortOrder = DataHelper.getSortOrder(AvsAddressIdMap);
    if (AvsAddressIdFetch != null) out.setAvsAddressIdFetch(AvsAddressIdFetch);
    if (AvsAddressIdSortDir != null) out.setAvsAddressIdSortDirection(AvsAddressIdSortDir);
    if (AvsAddressIdSortOrder != null) out.setAvsAddressIdSortOrder(AvsAddressIdSortOrder);

    Filter[] AvsAddressIdFilter = DataHelper.mapToFilterArray(AvsAddressIdMap, Integer.class);
    if (AvsAddressIdFilter != null) {
      IntegerFilter[] AvsAddressIdFilters = new IntegerFilter[AvsAddressIdFilter.length];
      for (int i = 0; i < AvsAddressIdFilters.length; i++) {
        AvsAddressIdFilters[i] = (IntegerFilter)AvsAddressIdFilter[i];
      }
      try {
        out.setAvsAddressIdFilter(AvsAddressIdFilters);
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
  
    Map AvsResponseCodeMap = (Map)record.get("AvsResponseCode");
    Boolean AvsResponseCodeFetch = DataHelper.getFetch(AvsResponseCodeMap);
    Boolean AvsResponseCodeSortDir = DataHelper.getSortDirection(AvsResponseCodeMap);
    Integer AvsResponseCodeSortOrder = DataHelper.getSortOrder(AvsResponseCodeMap);
    if (AvsResponseCodeFetch != null) out.setAvsResponseCodeFetch(AvsResponseCodeFetch);
    if (AvsResponseCodeSortDir != null) out.setAvsResponseCodeSortDirection(AvsResponseCodeSortDir);
    if (AvsResponseCodeSortOrder != null) out.setAvsResponseCodeSortOrder(AvsResponseCodeSortOrder);

    Filter[] AvsResponseCodeFilter = DataHelper.mapToFilterArray(AvsResponseCodeMap, String.class);
    if (AvsResponseCodeFilter != null) {
      StringFilter[] AvsResponseCodeFilters = new StringFilter[AvsResponseCodeFilter.length];
      for (int i = 0; i < AvsResponseCodeFilters.length; i++) {
        AvsResponseCodeFilters[i] = (StringFilter)AvsResponseCodeFilter[i];
      }
      try {
        out.setAvsResponseCodeFilter(AvsResponseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransFlagMap = (Map)record.get("TransFlag");
    Boolean TransFlagFetch = DataHelper.getFetch(TransFlagMap);
    Boolean TransFlagSortDir = DataHelper.getSortDirection(TransFlagMap);
    Integer TransFlagSortOrder = DataHelper.getSortOrder(TransFlagMap);
    if (TransFlagFetch != null) out.setTransFlagFetch(TransFlagFetch);
    if (TransFlagSortDir != null) out.setTransFlagSortDirection(TransFlagSortDir);
    if (TransFlagSortOrder != null) out.setTransFlagSortOrder(TransFlagSortOrder);

    Filter[] TransFlagFilter = DataHelper.mapToFilterArray(TransFlagMap, String.class);
    if (TransFlagFilter != null) {
      StringFilter[] TransFlagFilters = new StringFilter[TransFlagFilter.length];
      for (int i = 0; i < TransFlagFilters.length; i++) {
        TransFlagFilters[i] = (StringFilter)TransFlagFilter[i];
      }
      try {
        out.setTransFlagFilter(TransFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdMap = (Map)record.get("AccountExternalId");
    Boolean AccountExternalIdFetch = DataHelper.getFetch(AccountExternalIdMap);
    Boolean AccountExternalIdSortDir = DataHelper.getSortDirection(AccountExternalIdMap);
    Integer AccountExternalIdSortOrder = DataHelper.getSortOrder(AccountExternalIdMap);
    if (AccountExternalIdFetch != null) out.setAccountExternalIdFetch(AccountExternalIdFetch);
    if (AccountExternalIdSortDir != null) out.setAccountExternalIdSortDirection(AccountExternalIdSortDir);
    if (AccountExternalIdSortOrder != null) out.setAccountExternalIdSortOrder(AccountExternalIdSortOrder);

    Filter[] AccountExternalIdFilter = DataHelper.mapToFilterArray(AccountExternalIdMap, String.class);
    if (AccountExternalIdFilter != null) {
      StringFilter[] AccountExternalIdFilters = new StringFilter[AccountExternalIdFilter.length];
      for (int i = 0; i < AccountExternalIdFilters.length; i++) {
        AccountExternalIdFilters[i] = (StringFilter)AccountExternalIdFilter[i];
      }
      try {
        out.setAccountExternalIdFilter(AccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdTypeMap = (Map)record.get("AccountExternalIdType");
    Boolean AccountExternalIdTypeFetch = DataHelper.getFetch(AccountExternalIdTypeMap);
    Boolean AccountExternalIdTypeSortDir = DataHelper.getSortDirection(AccountExternalIdTypeMap);
    Integer AccountExternalIdTypeSortOrder = DataHelper.getSortOrder(AccountExternalIdTypeMap);
    if (AccountExternalIdTypeFetch != null) out.setAccountExternalIdTypeFetch(AccountExternalIdTypeFetch);
    if (AccountExternalIdTypeSortDir != null) out.setAccountExternalIdTypeSortDirection(AccountExternalIdTypeSortDir);
    if (AccountExternalIdTypeSortOrder != null) out.setAccountExternalIdTypeSortOrder(AccountExternalIdTypeSortOrder);

    Filter[] AccountExternalIdTypeFilter = DataHelper.mapToFilterArray(AccountExternalIdTypeMap, Integer.class);
    if (AccountExternalIdTypeFilter != null) {
      IntegerFilter[] AccountExternalIdTypeFilters = new IntegerFilter[AccountExternalIdTypeFilter.length];
      for (int i = 0; i < AccountExternalIdTypeFilters.length; i++) {
        AccountExternalIdTypeFilters[i] = (IntegerFilter)AccountExternalIdTypeFilter[i];
      }
      try {
        out.setAccountExternalIdTypeFilter(AccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceExternalIdMap = (Map)record.get("ServiceExternalId");
    Boolean ServiceExternalIdFetch = DataHelper.getFetch(ServiceExternalIdMap);
    Boolean ServiceExternalIdSortDir = DataHelper.getSortDirection(ServiceExternalIdMap);
    Integer ServiceExternalIdSortOrder = DataHelper.getSortOrder(ServiceExternalIdMap);
    if (ServiceExternalIdFetch != null) out.setServiceExternalIdFetch(ServiceExternalIdFetch);
    if (ServiceExternalIdSortDir != null) out.setServiceExternalIdSortDirection(ServiceExternalIdSortDir);
    if (ServiceExternalIdSortOrder != null) out.setServiceExternalIdSortOrder(ServiceExternalIdSortOrder);

    Filter[] ServiceExternalIdFilter = DataHelper.mapToFilterArray(ServiceExternalIdMap, String.class);
    if (ServiceExternalIdFilter != null) {
      StringFilter[] ServiceExternalIdFilters = new StringFilter[ServiceExternalIdFilter.length];
      for (int i = 0; i < ServiceExternalIdFilters.length; i++) {
        ServiceExternalIdFilters[i] = (StringFilter)ServiceExternalIdFilter[i];
      }
      try {
        out.setServiceExternalIdFilter(ServiceExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceExternalIdTypeMap = (Map)record.get("ServiceExternalIdType");
    Boolean ServiceExternalIdTypeFetch = DataHelper.getFetch(ServiceExternalIdTypeMap);
    Boolean ServiceExternalIdTypeSortDir = DataHelper.getSortDirection(ServiceExternalIdTypeMap);
    Integer ServiceExternalIdTypeSortOrder = DataHelper.getSortOrder(ServiceExternalIdTypeMap);
    if (ServiceExternalIdTypeFetch != null) out.setServiceExternalIdTypeFetch(ServiceExternalIdTypeFetch);
    if (ServiceExternalIdTypeSortDir != null) out.setServiceExternalIdTypeSortDirection(ServiceExternalIdTypeSortDir);
    if (ServiceExternalIdTypeSortOrder != null) out.setServiceExternalIdTypeSortOrder(ServiceExternalIdTypeSortOrder);

    Filter[] ServiceExternalIdTypeFilter = DataHelper.mapToFilterArray(ServiceExternalIdTypeMap, Integer.class);
    if (ServiceExternalIdTypeFilter != null) {
      IntegerFilter[] ServiceExternalIdTypeFilters = new IntegerFilter[ServiceExternalIdTypeFilter.length];
      for (int i = 0; i < ServiceExternalIdTypeFilters.length; i++) {
        ServiceExternalIdTypeFilters[i] = (IntegerFilter)ServiceExternalIdTypeFilter[i];
      }
      try {
        out.setServiceExternalIdTypeFilter(ServiceExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepayBalanceDescMap = (Map)record.get("PrepayBalanceDesc");
    Boolean PrepayBalanceDescFetch = DataHelper.getFetch(PrepayBalanceDescMap);
    Boolean PrepayBalanceDescSortDir = DataHelper.getSortDirection(PrepayBalanceDescMap);
    Integer PrepayBalanceDescSortOrder = DataHelper.getSortOrder(PrepayBalanceDescMap);
    if (PrepayBalanceDescFetch != null) out.setPrepayBalanceDescFetch(PrepayBalanceDescFetch);
    if (PrepayBalanceDescSortDir != null) out.setPrepayBalanceDescSortDirection(PrepayBalanceDescSortDir);
    if (PrepayBalanceDescSortOrder != null) out.setPrepayBalanceDescSortOrder(PrepayBalanceDescSortOrder);

    Filter[] PrepayBalanceDescFilter = DataHelper.mapToFilterArray(PrepayBalanceDescMap, String.class);
    if (PrepayBalanceDescFilter != null) {
      StringFilter[] PrepayBalanceDescFilters = new StringFilter[PrepayBalanceDescFilter.length];
      for (int i = 0; i < PrepayBalanceDescFilters.length; i++) {
        PrepayBalanceDescFilters[i] = (StringFilter)PrepayBalanceDescFilter[i];
      }
      try {
        out.setPrepayBalanceDescFilter(PrepayBalanceDescFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransSignMap = (Map)record.get("TransSign");
    Boolean TransSignFetch = DataHelper.getFetch(TransSignMap);
    Boolean TransSignSortDir = DataHelper.getSortDirection(TransSignMap);
    Integer TransSignSortOrder = DataHelper.getSortOrder(TransSignMap);
    if (TransSignFetch != null) out.setTransSignFetch(TransSignFetch);
    if (TransSignSortDir != null) out.setTransSignSortDirection(TransSignSortDir);
    if (TransSignSortOrder != null) out.setTransSignSortOrder(TransSignSortOrder);

    Filter[] TransSignFilter = DataHelper.mapToFilterArray(TransSignMap, Integer.class);
    if (TransSignFilter != null) {
      IntegerFilter[] TransSignFilters = new IntegerFilter[TransSignFilter.length];
      for (int i = 0; i < TransSignFilters.length; i++) {
        TransSignFilters[i] = (IntegerFilter)TransSignFilter[i];
      }
      try {
        out.setTransSignFilter(TransSignFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingCategoryMap = (Map)record.get("BillingCategory");
    Boolean BillingCategoryFetch = DataHelper.getFetch(BillingCategoryMap);
    Boolean BillingCategorySortDir = DataHelper.getSortDirection(BillingCategoryMap);
    Integer BillingCategorySortOrder = DataHelper.getSortOrder(BillingCategoryMap);
    if (BillingCategoryFetch != null) out.setBillingCategoryFetch(BillingCategoryFetch);
    if (BillingCategorySortDir != null) out.setBillingCategorySortDirection(BillingCategorySortDir);
    if (BillingCategorySortOrder != null) out.setBillingCategorySortOrder(BillingCategorySortOrder);

    Filter[] BillingCategoryFilter = DataHelper.mapToFilterArray(BillingCategoryMap, Integer.class);
    if (BillingCategoryFilter != null) {
      IntegerFilter[] BillingCategoryFilters = new IntegerFilter[BillingCategoryFilter.length];
      for (int i = 0; i < BillingCategoryFilters.length; i++) {
        BillingCategoryFilters[i] = (IntegerFilter)BillingCategoryFilter[i];
      }
      try {
        out.setBillingCategoryFilter(BillingCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransTargetTypeMap = (Map)record.get("TransTargetType");
    Boolean TransTargetTypeFetch = DataHelper.getFetch(TransTargetTypeMap);
    Boolean TransTargetTypeSortDir = DataHelper.getSortDirection(TransTargetTypeMap);
    Integer TransTargetTypeSortOrder = DataHelper.getSortOrder(TransTargetTypeMap);
    if (TransTargetTypeFetch != null) out.setTransTargetTypeFetch(TransTargetTypeFetch);
    if (TransTargetTypeSortDir != null) out.setTransTargetTypeSortDirection(TransTargetTypeSortDir);
    if (TransTargetTypeSortOrder != null) out.setTransTargetTypeSortOrder(TransTargetTypeSortOrder);

    Filter[] TransTargetTypeFilter = DataHelper.mapToFilterArray(TransTargetTypeMap, Integer.class);
    if (TransTargetTypeFilter != null) {
      IntegerFilter[] TransTargetTypeFilters = new IntegerFilter[TransTargetTypeFilter.length];
      for (int i = 0; i < TransTargetTypeFilters.length; i++) {
        TransTargetTypeFilters[i] = (IntegerFilter)TransTargetTypeFilter[i];
      }
      try {
        out.setTransTargetTypeFilter(TransTargetTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsNegativeBillAdjMap = (Map)record.get("IsNegativeBillAdj");
    Boolean IsNegativeBillAdjFetch = DataHelper.getFetch(IsNegativeBillAdjMap);
    Boolean IsNegativeBillAdjSortDir = DataHelper.getSortDirection(IsNegativeBillAdjMap);
    Integer IsNegativeBillAdjSortOrder = DataHelper.getSortOrder(IsNegativeBillAdjMap);
    if (IsNegativeBillAdjFetch != null) out.setIsNegativeBillAdjFetch(IsNegativeBillAdjFetch);
    if (IsNegativeBillAdjSortDir != null) out.setIsNegativeBillAdjSortDirection(IsNegativeBillAdjSortDir);
    if (IsNegativeBillAdjSortOrder != null) out.setIsNegativeBillAdjSortOrder(IsNegativeBillAdjSortOrder);

    Filter[] IsNegativeBillAdjFilter = DataHelper.mapToFilterArray(IsNegativeBillAdjMap, Boolean.class);
    if (IsNegativeBillAdjFilter != null) {
      BooleanFilter[] IsNegativeBillAdjFilters = new BooleanFilter[IsNegativeBillAdjFilter.length];
      for (int i = 0; i < IsNegativeBillAdjFilters.length; i++) {
        IsNegativeBillAdjFilters[i] = (BooleanFilter)IsNegativeBillAdjFilter[i];
      }
      try {
        out.setIsNegativeBillAdjFilter(IsNegativeBillAdjFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransCodeMap = (Map)record.get("TransCode");
    Boolean TransCodeFetch = DataHelper.getFetch(TransCodeMap);
    Boolean TransCodeSortDir = DataHelper.getSortDirection(TransCodeMap);
    Integer TransCodeSortOrder = DataHelper.getSortOrder(TransCodeMap);
    if (TransCodeFetch != null) out.setTransCodeFetch(TransCodeFetch);
    if (TransCodeSortDir != null) out.setTransCodeSortDirection(TransCodeSortDir);
    if (TransCodeSortOrder != null) out.setTransCodeSortOrder(TransCodeSortOrder);

    Filter[] TransCodeFilter = DataHelper.mapToFilterArray(TransCodeMap, Integer.class);
    if (TransCodeFilter != null) {
      IntegerFilter[] TransCodeFilters = new IntegerFilter[TransCodeFilter.length];
      for (int i = 0; i < TransCodeFilters.length; i++) {
        TransCodeFilters[i] = (IntegerFilter)TransCodeFilter[i];
      }
      try {
        out.setTransCodeFilter(TransCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTransCodeMap = (Map)record.get("OrigTransCode");
    Boolean OrigTransCodeFetch = DataHelper.getFetch(OrigTransCodeMap);
    Boolean OrigTransCodeSortDir = DataHelper.getSortDirection(OrigTransCodeMap);
    Integer OrigTransCodeSortOrder = DataHelper.getSortOrder(OrigTransCodeMap);
    if (OrigTransCodeFetch != null) out.setOrigTransCodeFetch(OrigTransCodeFetch);
    if (OrigTransCodeSortDir != null) out.setOrigTransCodeSortDirection(OrigTransCodeSortDir);
    if (OrigTransCodeSortOrder != null) out.setOrigTransCodeSortOrder(OrigTransCodeSortOrder);

    Filter[] OrigTransCodeFilter = DataHelper.mapToFilterArray(OrigTransCodeMap, Integer.class);
    if (OrigTransCodeFilter != null) {
      IntegerFilter[] OrigTransCodeFilters = new IntegerFilter[OrigTransCodeFilter.length];
      for (int i = 0; i < OrigTransCodeFilters.length; i++) {
        OrigTransCodeFilters[i] = (IntegerFilter)OrigTransCodeFilter[i];
      }
      try {
        out.setOrigTransCodeFilter(OrigTransCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AnnotationMap = (Map)record.get("Annotation");
    Boolean AnnotationFetch = DataHelper.getFetch(AnnotationMap);
    Boolean AnnotationSortDir = DataHelper.getSortDirection(AnnotationMap);
    Integer AnnotationSortOrder = DataHelper.getSortOrder(AnnotationMap);
    if (AnnotationFetch != null) out.setAnnotationFetch(AnnotationFetch);
    if (AnnotationSortDir != null) out.setAnnotationSortDirection(AnnotationSortDir);
    if (AnnotationSortOrder != null) out.setAnnotationSortOrder(AnnotationSortOrder);

    Filter[] AnnotationFilter = DataHelper.mapToFilterArray(AnnotationMap, String.class);
    if (AnnotationFilter != null) {
      StringFilter[] AnnotationFilters = new StringFilter[AnnotationFilter.length];
      for (int i = 0; i < AnnotationFilters.length; i++) {
        AnnotationFilters[i] = (StringFilter)AnnotationFilter[i];
      }
      try {
        out.setAnnotationFilter(AnnotationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrimaryUnitsTypeMap = (Map)record.get("PrimaryUnitsType");
    Boolean PrimaryUnitsTypeFetch = DataHelper.getFetch(PrimaryUnitsTypeMap);
    Boolean PrimaryUnitsTypeSortDir = DataHelper.getSortDirection(PrimaryUnitsTypeMap);
    Integer PrimaryUnitsTypeSortOrder = DataHelper.getSortOrder(PrimaryUnitsTypeMap);
    if (PrimaryUnitsTypeFetch != null) out.setPrimaryUnitsTypeFetch(PrimaryUnitsTypeFetch);
    if (PrimaryUnitsTypeSortDir != null) out.setPrimaryUnitsTypeSortDirection(PrimaryUnitsTypeSortDir);
    if (PrimaryUnitsTypeSortOrder != null) out.setPrimaryUnitsTypeSortOrder(PrimaryUnitsTypeSortOrder);

    Filter[] PrimaryUnitsTypeFilter = DataHelper.mapToFilterArray(PrimaryUnitsTypeMap, Integer.class);
    if (PrimaryUnitsTypeFilter != null) {
      IntegerFilter[] PrimaryUnitsTypeFilters = new IntegerFilter[PrimaryUnitsTypeFilter.length];
      for (int i = 0; i < PrimaryUnitsTypeFilters.length; i++) {
        PrimaryUnitsTypeFilters[i] = (IntegerFilter)PrimaryUnitsTypeFilter[i];
      }
      try {
        out.setPrimaryUnitsTypeFilter(PrimaryUnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrimaryUnitsMap = (Map)record.get("PrimaryUnits");
    Boolean PrimaryUnitsFetch = DataHelper.getFetch(PrimaryUnitsMap);
    Boolean PrimaryUnitsSortDir = DataHelper.getSortDirection(PrimaryUnitsMap);
    Integer PrimaryUnitsSortOrder = DataHelper.getSortOrder(PrimaryUnitsMap);
    if (PrimaryUnitsFetch != null) out.setPrimaryUnitsFetch(PrimaryUnitsFetch);
    if (PrimaryUnitsSortDir != null) out.setPrimaryUnitsSortDirection(PrimaryUnitsSortDir);
    if (PrimaryUnitsSortOrder != null) out.setPrimaryUnitsSortOrder(PrimaryUnitsSortOrder);

    Filter[] PrimaryUnitsFilter = DataHelper.mapToFilterArray(PrimaryUnitsMap, BigInteger.class);
    if (PrimaryUnitsFilter != null) {
      BigIntegerFilter[] PrimaryUnitsFilters = new BigIntegerFilter[PrimaryUnitsFilter.length];
      for (int i = 0; i < PrimaryUnitsFilters.length; i++) {
        PrimaryUnitsFilters[i] = (BigIntegerFilter)PrimaryUnitsFilter[i];
      }
      try {
        out.setPrimaryUnitsFilter(PrimaryUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransactDateMap = (Map)record.get("TransactDate");
    Boolean TransactDateFetch = DataHelper.getFetch(TransactDateMap);
    Boolean TransactDateSortDir = DataHelper.getSortDirection(TransactDateMap);
    Integer TransactDateSortOrder = DataHelper.getSortOrder(TransactDateMap);
    if (TransactDateFetch != null) out.setTransactDateFetch(TransactDateFetch);
    if (TransactDateSortDir != null) out.setTransactDateSortDirection(TransactDateSortDir);
    if (TransactDateSortOrder != null) out.setTransactDateSortOrder(TransactDateSortOrder);

    Filter[] TransactDateFilter = DataHelper.mapToFilterArray(TransactDateMap, Date.class);
    if (TransactDateFilter != null) {
      DateFilter[] TransactDateFilters = new DateFilter[TransactDateFilter.length];
      for (int i = 0; i < TransactDateFilters.length; i++) {
        TransactDateFilters[i] = (DateFilter)TransactDateFilter[i];
      }
      try {
        out.setTransactDateFilter(TransactDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EffectiveDateMap = (Map)record.get("EffectiveDate");
    Boolean EffectiveDateFetch = DataHelper.getFetch(EffectiveDateMap);
    Boolean EffectiveDateSortDir = DataHelper.getSortDirection(EffectiveDateMap);
    Integer EffectiveDateSortOrder = DataHelper.getSortOrder(EffectiveDateMap);
    if (EffectiveDateFetch != null) out.setEffectiveDateFetch(EffectiveDateFetch);
    if (EffectiveDateSortDir != null) out.setEffectiveDateSortDirection(EffectiveDateSortDir);
    if (EffectiveDateSortOrder != null) out.setEffectiveDateSortOrder(EffectiveDateSortOrder);

    Filter[] EffectiveDateFilter = DataHelper.mapToFilterArray(EffectiveDateMap, Date.class);
    if (EffectiveDateFilter != null) {
      DateFilter[] EffectiveDateFilters = new DateFilter[EffectiveDateFilter.length];
      for (int i = 0; i < EffectiveDateFilters.length; i++) {
        EffectiveDateFilters[i] = (DateFilter)EffectiveDateFilter[i];
      }
      try {
        out.setEffectiveDateFilter(EffectiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdCounterMap = (Map)record.get("TrackingIdCounter");
    Boolean TrackingIdCounterFetch = DataHelper.getFetch(TrackingIdCounterMap);
    Boolean TrackingIdCounterSortDir = DataHelper.getSortDirection(TrackingIdCounterMap);
    Integer TrackingIdCounterSortOrder = DataHelper.getSortOrder(TrackingIdCounterMap);
    if (TrackingIdCounterFetch != null) out.setTrackingIdCounterFetch(TrackingIdCounterFetch);
    if (TrackingIdCounterSortDir != null) out.setTrackingIdCounterSortDirection(TrackingIdCounterSortDir);
    if (TrackingIdCounterSortOrder != null) out.setTrackingIdCounterSortOrder(TrackingIdCounterSortOrder);

    Filter[] TrackingIdCounterFilter = DataHelper.mapToFilterArray(TrackingIdCounterMap, Integer.class);
    if (TrackingIdCounterFilter != null) {
      IntegerFilter[] TrackingIdCounterFilters = new IntegerFilter[TrackingIdCounterFilter.length];
      for (int i = 0; i < TrackingIdCounterFilters.length; i++) {
        TrackingIdCounterFilters[i] = (IntegerFilter)TrackingIdCounterFilter[i];
      }
      try {
        out.setTrackingIdCounterFilter(TrackingIdCounterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RequestStatusMap = (Map)record.get("RequestStatus");
    Boolean RequestStatusFetch = DataHelper.getFetch(RequestStatusMap);
    Boolean RequestStatusSortDir = DataHelper.getSortDirection(RequestStatusMap);
    Integer RequestStatusSortOrder = DataHelper.getSortOrder(RequestStatusMap);
    if (RequestStatusFetch != null) out.setRequestStatusFetch(RequestStatusFetch);
    if (RequestStatusSortDir != null) out.setRequestStatusSortDirection(RequestStatusSortDir);
    if (RequestStatusSortOrder != null) out.setRequestStatusSortOrder(RequestStatusSortOrder);

    Filter[] RequestStatusFilter = DataHelper.mapToFilterArray(RequestStatusMap, Integer.class);
    if (RequestStatusFilter != null) {
      IntegerFilter[] RequestStatusFilters = new IntegerFilter[RequestStatusFilter.length];
      for (int i = 0; i < RequestStatusFilters.length; i++) {
        RequestStatusFilters[i] = (IntegerFilter)RequestStatusFilter[i];
      }
      try {
        out.setRequestStatusFilter(RequestStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReviewDateMap = (Map)record.get("ReviewDate");
    Boolean ReviewDateFetch = DataHelper.getFetch(ReviewDateMap);
    Boolean ReviewDateSortDir = DataHelper.getSortDirection(ReviewDateMap);
    Integer ReviewDateSortOrder = DataHelper.getSortOrder(ReviewDateMap);
    if (ReviewDateFetch != null) out.setReviewDateFetch(ReviewDateFetch);
    if (ReviewDateSortDir != null) out.setReviewDateSortDirection(ReviewDateSortDir);
    if (ReviewDateSortOrder != null) out.setReviewDateSortOrder(ReviewDateSortOrder);

    Filter[] ReviewDateFilter = DataHelper.mapToFilterArray(ReviewDateMap, Date.class);
    if (ReviewDateFilter != null) {
      DateFilter[] ReviewDateFilters = new DateFilter[ReviewDateFilter.length];
      for (int i = 0; i < ReviewDateFilters.length; i++) {
        ReviewDateFilters[i] = (DateFilter)ReviewDateFilter[i];
      }
      try {
        out.setReviewDateFilter(ReviewDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SupervisorNameMap = (Map)record.get("SupervisorName");
    Boolean SupervisorNameFetch = DataHelper.getFetch(SupervisorNameMap);
    Boolean SupervisorNameSortDir = DataHelper.getSortDirection(SupervisorNameMap);
    Integer SupervisorNameSortOrder = DataHelper.getSortOrder(SupervisorNameMap);
    if (SupervisorNameFetch != null) out.setSupervisorNameFetch(SupervisorNameFetch);
    if (SupervisorNameSortDir != null) out.setSupervisorNameSortDirection(SupervisorNameSortDir);
    if (SupervisorNameSortOrder != null) out.setSupervisorNameSortOrder(SupervisorNameSortOrder);

    Filter[] SupervisorNameFilter = DataHelper.mapToFilterArray(SupervisorNameMap, String.class);
    if (SupervisorNameFilter != null) {
      StringFilter[] SupervisorNameFilters = new StringFilter[SupervisorNameFilter.length];
      for (int i = 0; i < SupervisorNameFilters.length; i++) {
        SupervisorNameFilters[i] = (StringFilter)SupervisorNameFilter[i];
      }
      try {
        out.setSupervisorNameFilter(SupervisorNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrentFlagMap = (Map)record.get("CurrentFlag");
    Boolean CurrentFlagFetch = DataHelper.getFetch(CurrentFlagMap);
    Boolean CurrentFlagSortDir = DataHelper.getSortDirection(CurrentFlagMap);
    Integer CurrentFlagSortOrder = DataHelper.getSortOrder(CurrentFlagMap);
    if (CurrentFlagFetch != null) out.setCurrentFlagFetch(CurrentFlagFetch);
    if (CurrentFlagSortDir != null) out.setCurrentFlagSortDirection(CurrentFlagSortDir);
    if (CurrentFlagSortOrder != null) out.setCurrentFlagSortOrder(CurrentFlagSortOrder);

    Filter[] CurrentFlagFilter = DataHelper.mapToFilterArray(CurrentFlagMap, Boolean.class);
    if (CurrentFlagFilter != null) {
      BooleanFilter[] CurrentFlagFilters = new BooleanFilter[CurrentFlagFilter.length];
      for (int i = 0; i < CurrentFlagFilters.length; i++) {
        CurrentFlagFilters[i] = (BooleanFilter)CurrentFlagFilter[i];
      }
      try {
        out.setCurrentFlagFilter(CurrentFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PendingFlagMap = (Map)record.get("PendingFlag");
    Boolean PendingFlagFetch = DataHelper.getFetch(PendingFlagMap);
    Boolean PendingFlagSortDir = DataHelper.getSortDirection(PendingFlagMap);
    Integer PendingFlagSortOrder = DataHelper.getSortOrder(PendingFlagMap);
    if (PendingFlagFetch != null) out.setPendingFlagFetch(PendingFlagFetch);
    if (PendingFlagSortDir != null) out.setPendingFlagSortDirection(PendingFlagSortDir);
    if (PendingFlagSortOrder != null) out.setPendingFlagSortOrder(PendingFlagSortOrder);

    Filter[] PendingFlagFilter = DataHelper.mapToFilterArray(PendingFlagMap, Boolean.class);
    if (PendingFlagFilter != null) {
      BooleanFilter[] PendingFlagFilters = new BooleanFilter[PendingFlagFilter.length];
      for (int i = 0; i < PendingFlagFilters.length; i++) {
        PendingFlagFilters[i] = (BooleanFilter)PendingFlagFilter[i];
      }
      try {
        out.setPendingFlagFilter(PendingFlagFilters);
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
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAmtMap = (Map)record.get("TotalAmt");
    Boolean TotalAmtFetch = DataHelper.getFetch(TotalAmtMap);
    Boolean TotalAmtSortDir = DataHelper.getSortDirection(TotalAmtMap);
    Integer TotalAmtSortOrder = DataHelper.getSortOrder(TotalAmtMap);
    if (TotalAmtFetch != null) out.setTotalAmtFetch(TotalAmtFetch);
    if (TotalAmtSortDir != null) out.setTotalAmtSortDirection(TotalAmtSortDir);
    if (TotalAmtSortOrder != null) out.setTotalAmtSortOrder(TotalAmtSortOrder);

    Filter[] TotalAmtFilter = DataHelper.mapToFilterArray(TotalAmtMap, BigInteger.class);
    if (TotalAmtFilter != null) {
      BigIntegerFilter[] TotalAmtFilters = new BigIntegerFilter[TotalAmtFilter.length];
      for (int i = 0; i < TotalAmtFilters.length; i++) {
        TotalAmtFilters[i] = (BigIntegerFilter)TotalAmtFilter[i];
      }
      try {
        out.setTotalAmtFilter(TotalAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatedFlagMap = (Map)record.get("RatedFlag");
    Boolean RatedFlagFetch = DataHelper.getFetch(RatedFlagMap);
    Boolean RatedFlagSortDir = DataHelper.getSortDirection(RatedFlagMap);
    Integer RatedFlagSortOrder = DataHelper.getSortOrder(RatedFlagMap);
    if (RatedFlagFetch != null) out.setRatedFlagFetch(RatedFlagFetch);
    if (RatedFlagSortDir != null) out.setRatedFlagSortDirection(RatedFlagSortDir);
    if (RatedFlagSortOrder != null) out.setRatedFlagSortOrder(RatedFlagSortOrder);

    Filter[] RatedFlagFilter = DataHelper.mapToFilterArray(RatedFlagMap, Boolean.class);
    if (RatedFlagFilter != null) {
      BooleanFilter[] RatedFlagFilters = new BooleanFilter[RatedFlagFilter.length];
      for (int i = 0; i < RatedFlagFilters.length; i++) {
        RatedFlagFilters[i] = (BooleanFilter)RatedFlagFilter[i];
      }
      try {
        out.setRatedFlagFilter(RatedFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ArchFlagMap = (Map)record.get("ArchFlag");
    Boolean ArchFlagFetch = DataHelper.getFetch(ArchFlagMap);
    Boolean ArchFlagSortDir = DataHelper.getSortDirection(ArchFlagMap);
    Integer ArchFlagSortOrder = DataHelper.getSortOrder(ArchFlagMap);
    if (ArchFlagFetch != null) out.setArchFlagFetch(ArchFlagFetch);
    if (ArchFlagSortDir != null) out.setArchFlagSortDirection(ArchFlagSortDir);
    if (ArchFlagSortOrder != null) out.setArchFlagSortOrder(ArchFlagSortOrder);

    Filter[] ArchFlagFilter = DataHelper.mapToFilterArray(ArchFlagMap, Boolean.class);
    if (ArchFlagFilter != null) {
      BooleanFilter[] ArchFlagFilters = new BooleanFilter[ArchFlagFilter.length];
      for (int i = 0; i < ArchFlagFilters.length; i++) {
        ArchFlagFilters[i] = (BooleanFilter)ArchFlagFilter[i];
      }
      try {
        out.setArchFlagFilter(ArchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigProviderIdMap = (Map)record.get("OrigProviderId");
    Boolean OrigProviderIdFetch = DataHelper.getFetch(OrigProviderIdMap);
    Boolean OrigProviderIdSortDir = DataHelper.getSortDirection(OrigProviderIdMap);
    Integer OrigProviderIdSortOrder = DataHelper.getSortOrder(OrigProviderIdMap);
    if (OrigProviderIdFetch != null) out.setOrigProviderIdFetch(OrigProviderIdFetch);
    if (OrigProviderIdSortDir != null) out.setOrigProviderIdSortDirection(OrigProviderIdSortDir);
    if (OrigProviderIdSortOrder != null) out.setOrigProviderIdSortOrder(OrigProviderIdSortOrder);

    Filter[] OrigProviderIdFilter = DataHelper.mapToFilterArray(OrigProviderIdMap, Integer.class);
    if (OrigProviderIdFilter != null) {
      IntegerFilter[] OrigProviderIdFilters = new IntegerFilter[OrigProviderIdFilter.length];
      for (int i = 0; i < OrigProviderIdFilters.length; i++) {
        OrigProviderIdFilters[i] = (IntegerFilter)OrigProviderIdFilter[i];
      }
      try {
        out.setOrigProviderIdFilter(OrigProviderIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefNoMap = (Map)record.get("OrigBillRefNo");
    Boolean OrigBillRefNoFetch = DataHelper.getFetch(OrigBillRefNoMap);
    Boolean OrigBillRefNoSortDir = DataHelper.getSortDirection(OrigBillRefNoMap);
    Integer OrigBillRefNoSortOrder = DataHelper.getSortOrder(OrigBillRefNoMap);
    if (OrigBillRefNoFetch != null) out.setOrigBillRefNoFetch(OrigBillRefNoFetch);
    if (OrigBillRefNoSortDir != null) out.setOrigBillRefNoSortDirection(OrigBillRefNoSortDir);
    if (OrigBillRefNoSortOrder != null) out.setOrigBillRefNoSortOrder(OrigBillRefNoSortOrder);

    Filter[] OrigBillRefNoFilter = DataHelper.mapToFilterArray(OrigBillRefNoMap, Integer.class);
    if (OrigBillRefNoFilter != null) {
      IntegerFilter[] OrigBillRefNoFilters = new IntegerFilter[OrigBillRefNoFilter.length];
      for (int i = 0; i < OrigBillRefNoFilters.length; i++) {
        OrigBillRefNoFilters[i] = (IntegerFilter)OrigBillRefNoFilter[i];
      }
      try {
        out.setOrigBillRefNoFilter(OrigBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefResetsMap = (Map)record.get("OrigBillRefResets");
    Boolean OrigBillRefResetsFetch = DataHelper.getFetch(OrigBillRefResetsMap);
    Boolean OrigBillRefResetsSortDir = DataHelper.getSortDirection(OrigBillRefResetsMap);
    Integer OrigBillRefResetsSortOrder = DataHelper.getSortOrder(OrigBillRefResetsMap);
    if (OrigBillRefResetsFetch != null) out.setOrigBillRefResetsFetch(OrigBillRefResetsFetch);
    if (OrigBillRefResetsSortDir != null) out.setOrigBillRefResetsSortDirection(OrigBillRefResetsSortDir);
    if (OrigBillRefResetsSortOrder != null) out.setOrigBillRefResetsSortOrder(OrigBillRefResetsSortOrder);

    Filter[] OrigBillRefResetsFilter = DataHelper.mapToFilterArray(OrigBillRefResetsMap, Integer.class);
    if (OrigBillRefResetsFilter != null) {
      IntegerFilter[] OrigBillRefResetsFilters = new IntegerFilter[OrigBillRefResetsFilter.length];
      for (int i = 0; i < OrigBillRefResetsFilters.length; i++) {
        OrigBillRefResetsFilters[i] = (IntegerFilter)OrigBillRefResetsFilter[i];
      }
      try {
        out.setOrigBillRefResetsFilter(OrigBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillInvoiceRowMap = (Map)record.get("OrigBillInvoiceRow");
    Boolean OrigBillInvoiceRowFetch = DataHelper.getFetch(OrigBillInvoiceRowMap);
    Boolean OrigBillInvoiceRowSortDir = DataHelper.getSortDirection(OrigBillInvoiceRowMap);
    Integer OrigBillInvoiceRowSortOrder = DataHelper.getSortOrder(OrigBillInvoiceRowMap);
    if (OrigBillInvoiceRowFetch != null) out.setOrigBillInvoiceRowFetch(OrigBillInvoiceRowFetch);
    if (OrigBillInvoiceRowSortDir != null) out.setOrigBillInvoiceRowSortDirection(OrigBillInvoiceRowSortDir);
    if (OrigBillInvoiceRowSortOrder != null) out.setOrigBillInvoiceRowSortOrder(OrigBillInvoiceRowSortOrder);

    Filter[] OrigBillInvoiceRowFilter = DataHelper.mapToFilterArray(OrigBillInvoiceRowMap, Integer.class);
    if (OrigBillInvoiceRowFilter != null) {
      IntegerFilter[] OrigBillInvoiceRowFilters = new IntegerFilter[OrigBillInvoiceRowFilter.length];
      for (int i = 0; i < OrigBillInvoiceRowFilters.length; i++) {
        OrigBillInvoiceRowFilters[i] = (IntegerFilter)OrigBillInvoiceRowFilter[i];
      }
      try {
        out.setOrigBillInvoiceRowFilter(OrigBillInvoiceRowFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTypeMap = (Map)record.get("OrigType");
    Boolean OrigTypeFetch = DataHelper.getFetch(OrigTypeMap);
    Boolean OrigTypeSortDir = DataHelper.getSortDirection(OrigTypeMap);
    Integer OrigTypeSortOrder = DataHelper.getSortOrder(OrigTypeMap);
    if (OrigTypeFetch != null) out.setOrigTypeFetch(OrigTypeFetch);
    if (OrigTypeSortDir != null) out.setOrigTypeSortDirection(OrigTypeSortDir);
    if (OrigTypeSortOrder != null) out.setOrigTypeSortOrder(OrigTypeSortOrder);

    Filter[] OrigTypeFilter = DataHelper.mapToFilterArray(OrigTypeMap, Integer.class);
    if (OrigTypeFilter != null) {
      IntegerFilter[] OrigTypeFilters = new IntegerFilter[OrigTypeFilter.length];
      for (int i = 0; i < OrigTypeFilters.length; i++) {
        OrigTypeFilters[i] = (IntegerFilter)OrigTypeFilter[i];
      }
      try {
        out.setOrigTypeFilter(OrigTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigSubtypeMap = (Map)record.get("OrigSubtype");
    Boolean OrigSubtypeFetch = DataHelper.getFetch(OrigSubtypeMap);
    Boolean OrigSubtypeSortDir = DataHelper.getSortDirection(OrigSubtypeMap);
    Integer OrigSubtypeSortOrder = DataHelper.getSortOrder(OrigSubtypeMap);
    if (OrigSubtypeFetch != null) out.setOrigSubtypeFetch(OrigSubtypeFetch);
    if (OrigSubtypeSortDir != null) out.setOrigSubtypeSortDirection(OrigSubtypeSortDir);
    if (OrigSubtypeSortOrder != null) out.setOrigSubtypeSortOrder(OrigSubtypeSortOrder);

    Filter[] OrigSubtypeFilter = DataHelper.mapToFilterArray(OrigSubtypeMap, Integer.class);
    if (OrigSubtypeFilter != null) {
      IntegerFilter[] OrigSubtypeFilters = new IntegerFilter[OrigSubtypeFilter.length];
      for (int i = 0; i < OrigSubtypeFilters.length; i++) {
        OrigSubtypeFilters[i] = (IntegerFilter)OrigSubtypeFilter[i];
      }
      try {
        out.setOrigSubtypeFilter(OrigSubtypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigMsgIdMap = (Map)record.get("OrigMsgId");
    Boolean OrigMsgIdFetch = DataHelper.getFetch(OrigMsgIdMap);
    Boolean OrigMsgIdSortDir = DataHelper.getSortDirection(OrigMsgIdMap);
    Integer OrigMsgIdSortOrder = DataHelper.getSortOrder(OrigMsgIdMap);
    if (OrigMsgIdFetch != null) out.setOrigMsgIdFetch(OrigMsgIdFetch);
    if (OrigMsgIdSortDir != null) out.setOrigMsgIdSortDirection(OrigMsgIdSortDir);
    if (OrigMsgIdSortOrder != null) out.setOrigMsgIdSortOrder(OrigMsgIdSortOrder);

    Filter[] OrigMsgIdFilter = DataHelper.mapToFilterArray(OrigMsgIdMap, Integer.class);
    if (OrigMsgIdFilter != null) {
      IntegerFilter[] OrigMsgIdFilters = new IntegerFilter[OrigMsgIdFilter.length];
      for (int i = 0; i < OrigMsgIdFilters.length; i++) {
        OrigMsgIdFilters[i] = (IntegerFilter)OrigMsgIdFilter[i];
      }
      try {
        out.setOrigMsgIdFilter(OrigMsgIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigMsgId2Map = (Map)record.get("OrigMsgId2");
    Boolean OrigMsgId2Fetch = DataHelper.getFetch(OrigMsgId2Map);
    Boolean OrigMsgId2SortDir = DataHelper.getSortDirection(OrigMsgId2Map);
    Integer OrigMsgId2SortOrder = DataHelper.getSortOrder(OrigMsgId2Map);
    if (OrigMsgId2Fetch != null) out.setOrigMsgId2Fetch(OrigMsgId2Fetch);
    if (OrigMsgId2SortDir != null) out.setOrigMsgId2SortDirection(OrigMsgId2SortDir);
    if (OrigMsgId2SortOrder != null) out.setOrigMsgId2SortOrder(OrigMsgId2SortOrder);

    Filter[] OrigMsgId2Filter = DataHelper.mapToFilterArray(OrigMsgId2Map, Integer.class);
    if (OrigMsgId2Filter != null) {
      IntegerFilter[] OrigMsgId2Filters = new IntegerFilter[OrigMsgId2Filter.length];
      for (int i = 0; i < OrigMsgId2Filters.length; i++) {
        OrigMsgId2Filters[i] = (IntegerFilter)OrigMsgId2Filter[i];
      }
      try {
        out.setOrigMsgId2Filter(OrigMsgId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigMsgIdServMap = (Map)record.get("OrigMsgIdServ");
    Boolean OrigMsgIdServFetch = DataHelper.getFetch(OrigMsgIdServMap);
    Boolean OrigMsgIdServSortDir = DataHelper.getSortDirection(OrigMsgIdServMap);
    Integer OrigMsgIdServSortOrder = DataHelper.getSortOrder(OrigMsgIdServMap);
    if (OrigMsgIdServFetch != null) out.setOrigMsgIdServFetch(OrigMsgIdServFetch);
    if (OrigMsgIdServSortDir != null) out.setOrigMsgIdServSortDirection(OrigMsgIdServSortDir);
    if (OrigMsgIdServSortOrder != null) out.setOrigMsgIdServSortOrder(OrigMsgIdServSortOrder);

    Filter[] OrigMsgIdServFilter = DataHelper.mapToFilterArray(OrigMsgIdServMap, Integer.class);
    if (OrigMsgIdServFilter != null) {
      IntegerFilter[] OrigMsgIdServFilters = new IntegerFilter[OrigMsgIdServFilter.length];
      for (int i = 0; i < OrigMsgIdServFilters.length; i++) {
        OrigMsgIdServFilters[i] = (IntegerFilter)OrigMsgIdServFilter[i];
      }
      try {
        out.setOrigMsgIdServFilter(OrigMsgIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdMap = (Map)record.get("OrigTrackingId");
    Boolean OrigTrackingIdFetch = DataHelper.getFetch(OrigTrackingIdMap);
    Boolean OrigTrackingIdSortDir = DataHelper.getSortDirection(OrigTrackingIdMap);
    Integer OrigTrackingIdSortOrder = DataHelper.getSortOrder(OrigTrackingIdMap);
    if (OrigTrackingIdFetch != null) out.setOrigTrackingIdFetch(OrigTrackingIdFetch);
    if (OrigTrackingIdSortDir != null) out.setOrigTrackingIdSortDirection(OrigTrackingIdSortDir);
    if (OrigTrackingIdSortOrder != null) out.setOrigTrackingIdSortOrder(OrigTrackingIdSortOrder);

    Filter[] OrigTrackingIdFilter = DataHelper.mapToFilterArray(OrigTrackingIdMap, Integer.class);
    if (OrigTrackingIdFilter != null) {
      IntegerFilter[] OrigTrackingIdFilters = new IntegerFilter[OrigTrackingIdFilter.length];
      for (int i = 0; i < OrigTrackingIdFilters.length; i++) {
        OrigTrackingIdFilters[i] = (IntegerFilter)OrigTrackingIdFilter[i];
      }
      try {
        out.setOrigTrackingIdFilter(OrigTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdServMap = (Map)record.get("OrigTrackingIdServ");
    Boolean OrigTrackingIdServFetch = DataHelper.getFetch(OrigTrackingIdServMap);
    Boolean OrigTrackingIdServSortDir = DataHelper.getSortDirection(OrigTrackingIdServMap);
    Integer OrigTrackingIdServSortOrder = DataHelper.getSortOrder(OrigTrackingIdServMap);
    if (OrigTrackingIdServFetch != null) out.setOrigTrackingIdServFetch(OrigTrackingIdServFetch);
    if (OrigTrackingIdServSortDir != null) out.setOrigTrackingIdServSortDirection(OrigTrackingIdServSortDir);
    if (OrigTrackingIdServSortOrder != null) out.setOrigTrackingIdServSortOrder(OrigTrackingIdServSortOrder);

    Filter[] OrigTrackingIdServFilter = DataHelper.mapToFilterArray(OrigTrackingIdServMap, Integer.class);
    if (OrigTrackingIdServFilter != null) {
      IntegerFilter[] OrigTrackingIdServFilters = new IntegerFilter[OrigTrackingIdServFilter.length];
      for (int i = 0; i < OrigTrackingIdServFilters.length; i++) {
        OrigTrackingIdServFilters[i] = (IntegerFilter)OrigTrackingIdServFilter[i];
      }
      try {
        out.setOrigTrackingIdServFilter(OrigTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingDtMap = (Map)record.get("OrigTrackingDt");
    Boolean OrigTrackingDtFetch = DataHelper.getFetch(OrigTrackingDtMap);
    Boolean OrigTrackingDtSortDir = DataHelper.getSortDirection(OrigTrackingDtMap);
    Integer OrigTrackingDtSortOrder = DataHelper.getSortOrder(OrigTrackingDtMap);
    if (OrigTrackingDtFetch != null) out.setOrigTrackingDtFetch(OrigTrackingDtFetch);
    if (OrigTrackingDtSortDir != null) out.setOrigTrackingDtSortDirection(OrigTrackingDtSortDir);
    if (OrigTrackingDtSortOrder != null) out.setOrigTrackingDtSortOrder(OrigTrackingDtSortOrder);

    Filter[] OrigTrackingDtFilter = DataHelper.mapToFilterArray(OrigTrackingDtMap, Date.class);
    if (OrigTrackingDtFilter != null) {
      DateFilter[] OrigTrackingDtFilters = new DateFilter[OrigTrackingDtFilter.length];
      for (int i = 0; i < OrigTrackingDtFilters.length; i++) {
        OrigTrackingDtFilters[i] = (DateFilter)OrigTrackingDtFilter[i];
      }
      try {
        out.setOrigTrackingDtFilter(OrigTrackingDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigRcFromDateMap = (Map)record.get("OrigRcFromDate");
    Boolean OrigRcFromDateFetch = DataHelper.getFetch(OrigRcFromDateMap);
    Boolean OrigRcFromDateSortDir = DataHelper.getSortDirection(OrigRcFromDateMap);
    Integer OrigRcFromDateSortOrder = DataHelper.getSortOrder(OrigRcFromDateMap);
    if (OrigRcFromDateFetch != null) out.setOrigRcFromDateFetch(OrigRcFromDateFetch);
    if (OrigRcFromDateSortDir != null) out.setOrigRcFromDateSortDirection(OrigRcFromDateSortDir);
    if (OrigRcFromDateSortOrder != null) out.setOrigRcFromDateSortOrder(OrigRcFromDateSortOrder);

    Filter[] OrigRcFromDateFilter = DataHelper.mapToFilterArray(OrigRcFromDateMap, Date.class);
    if (OrigRcFromDateFilter != null) {
      DateFilter[] OrigRcFromDateFilters = new DateFilter[OrigRcFromDateFilter.length];
      for (int i = 0; i < OrigRcFromDateFilters.length; i++) {
        OrigRcFromDateFilters[i] = (DateFilter)OrigRcFromDateFilter[i];
      }
      try {
        out.setOrigRcFromDateFilter(OrigRcFromDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefNoMap = (Map)record.get("BillRefNo");
    Boolean BillRefNoFetch = DataHelper.getFetch(BillRefNoMap);
    Boolean BillRefNoSortDir = DataHelper.getSortDirection(BillRefNoMap);
    Integer BillRefNoSortOrder = DataHelper.getSortOrder(BillRefNoMap);
    if (BillRefNoFetch != null) out.setBillRefNoFetch(BillRefNoFetch);
    if (BillRefNoSortDir != null) out.setBillRefNoSortDirection(BillRefNoSortDir);
    if (BillRefNoSortOrder != null) out.setBillRefNoSortOrder(BillRefNoSortOrder);

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, Integer.class);
    if (BillRefNoFilter != null) {
      IntegerFilter[] BillRefNoFilters = new IntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (IntegerFilter)BillRefNoFilter[i];
      }
      try {
        out.setBillRefNoFilter(BillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResetsMap = (Map)record.get("BillRefResets");
    Boolean BillRefResetsFetch = DataHelper.getFetch(BillRefResetsMap);
    Boolean BillRefResetsSortDir = DataHelper.getSortDirection(BillRefResetsMap);
    Integer BillRefResetsSortOrder = DataHelper.getSortOrder(BillRefResetsMap);
    if (BillRefResetsFetch != null) out.setBillRefResetsFetch(BillRefResetsFetch);
    if (BillRefResetsSortDir != null) out.setBillRefResetsSortDirection(BillRefResetsSortDir);
    if (BillRefResetsSortOrder != null) out.setBillRefResetsSortOrder(BillRefResetsSortOrder);

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, Integer.class);
    if (BillRefResetsFilter != null) {
      IntegerFilter[] BillRefResetsFilters = new IntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (IntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxClassMap = (Map)record.get("TaxClass");
    Boolean TaxClassFetch = DataHelper.getFetch(TaxClassMap);
    Boolean TaxClassSortDir = DataHelper.getSortDirection(TaxClassMap);
    Integer TaxClassSortOrder = DataHelper.getSortOrder(TaxClassMap);
    if (TaxClassFetch != null) out.setTaxClassFetch(TaxClassFetch);
    if (TaxClassSortDir != null) out.setTaxClassSortDirection(TaxClassSortDir);
    if (TaxClassSortOrder != null) out.setTaxClassSortOrder(TaxClassSortOrder);

    Filter[] TaxClassFilter = DataHelper.mapToFilterArray(TaxClassMap, Integer.class);
    if (TaxClassFilter != null) {
      IntegerFilter[] TaxClassFilters = new IntegerFilter[TaxClassFilter.length];
      for (int i = 0; i < TaxClassFilters.length; i++) {
        TaxClassFilters[i] = (IntegerFilter)TaxClassFilter[i];
      }
      try {
        out.setTaxClassFilter(TaxClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxPkgInstIdMap = (Map)record.get("TaxPkgInstId");
    Boolean TaxPkgInstIdFetch = DataHelper.getFetch(TaxPkgInstIdMap);
    Boolean TaxPkgInstIdSortDir = DataHelper.getSortDirection(TaxPkgInstIdMap);
    Integer TaxPkgInstIdSortOrder = DataHelper.getSortOrder(TaxPkgInstIdMap);
    if (TaxPkgInstIdFetch != null) out.setTaxPkgInstIdFetch(TaxPkgInstIdFetch);
    if (TaxPkgInstIdSortDir != null) out.setTaxPkgInstIdSortDirection(TaxPkgInstIdSortDir);
    if (TaxPkgInstIdSortOrder != null) out.setTaxPkgInstIdSortOrder(TaxPkgInstIdSortOrder);

    Filter[] TaxPkgInstIdFilter = DataHelper.mapToFilterArray(TaxPkgInstIdMap, Integer.class);
    if (TaxPkgInstIdFilter != null) {
      IntegerFilter[] TaxPkgInstIdFilters = new IntegerFilter[TaxPkgInstIdFilter.length];
      for (int i = 0; i < TaxPkgInstIdFilters.length; i++) {
        TaxPkgInstIdFilters[i] = (IntegerFilter)TaxPkgInstIdFilter[i];
      }
      try {
        out.setTaxPkgInstIdFilter(TaxPkgInstIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GeocodeMap = (Map)record.get("Geocode");
    Boolean GeocodeFetch = DataHelper.getFetch(GeocodeMap);
    Boolean GeocodeSortDir = DataHelper.getSortDirection(GeocodeMap);
    Integer GeocodeSortOrder = DataHelper.getSortOrder(GeocodeMap);
    if (GeocodeFetch != null) out.setGeocodeFetch(GeocodeFetch);
    if (GeocodeSortDir != null) out.setGeocodeSortDirection(GeocodeSortDir);
    if (GeocodeSortOrder != null) out.setGeocodeSortOrder(GeocodeSortOrder);

    Filter[] GeocodeFilter = DataHelper.mapToFilterArray(GeocodeMap, String.class);
    if (GeocodeFilter != null) {
      StringFilter[] GeocodeFilters = new StringFilter[GeocodeFilter.length];
      for (int i = 0; i < GeocodeFilters.length; i++) {
        GeocodeFilters[i] = (StringFilter)GeocodeFilter[i];
      }
      try {
        out.setGeocodeFilter(GeocodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AuxTaxInfoMap = (Map)record.get("AuxTaxInfo");
    Boolean AuxTaxInfoFetch = DataHelper.getFetch(AuxTaxInfoMap);
    Boolean AuxTaxInfoSortDir = DataHelper.getSortDirection(AuxTaxInfoMap);
    Integer AuxTaxInfoSortOrder = DataHelper.getSortOrder(AuxTaxInfoMap);
    if (AuxTaxInfoFetch != null) out.setAuxTaxInfoFetch(AuxTaxInfoFetch);
    if (AuxTaxInfoSortDir != null) out.setAuxTaxInfoSortDirection(AuxTaxInfoSortDir);
    if (AuxTaxInfoSortOrder != null) out.setAuxTaxInfoSortOrder(AuxTaxInfoSortOrder);

    Filter[] AuxTaxInfoFilter = DataHelper.mapToFilterArray(AuxTaxInfoMap, String.class);
    if (AuxTaxInfoFilter != null) {
      StringFilter[] AuxTaxInfoFilters = new StringFilter[AuxTaxInfoFilter.length];
      for (int i = 0; i < AuxTaxInfoFilters.length; i++) {
        AuxTaxInfoFilters[i] = (StringFilter)AuxTaxInfoFilter[i];
      }
      try {
        out.setAuxTaxInfoFilter(AuxTaxInfoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CombTaxRateMap = (Map)record.get("CombTaxRate");
    Boolean CombTaxRateFetch = DataHelper.getFetch(CombTaxRateMap);
    Boolean CombTaxRateSortDir = DataHelper.getSortDirection(CombTaxRateMap);
    Integer CombTaxRateSortOrder = DataHelper.getSortOrder(CombTaxRateMap);
    if (CombTaxRateFetch != null) out.setCombTaxRateFetch(CombTaxRateFetch);
    if (CombTaxRateSortDir != null) out.setCombTaxRateSortDirection(CombTaxRateSortDir);
    if (CombTaxRateSortOrder != null) out.setCombTaxRateSortOrder(CombTaxRateSortOrder);

    Filter[] CombTaxRateFilter = DataHelper.mapToFilterArray(CombTaxRateMap, Integer.class);
    if (CombTaxRateFilter != null) {
      IntegerFilter[] CombTaxRateFilters = new IntegerFilter[CombTaxRateFilter.length];
      for (int i = 0; i < CombTaxRateFilters.length; i++) {
        CombTaxRateFilters[i] = (IntegerFilter)CombTaxRateFilter[i];
      }
      try {
        out.setCombTaxRateFilter(CombTaxRateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FederalTaxMap = (Map)record.get("FederalTax");
    Boolean FederalTaxFetch = DataHelper.getFetch(FederalTaxMap);
    Boolean FederalTaxSortDir = DataHelper.getSortDirection(FederalTaxMap);
    Integer FederalTaxSortOrder = DataHelper.getSortOrder(FederalTaxMap);
    if (FederalTaxFetch != null) out.setFederalTaxFetch(FederalTaxFetch);
    if (FederalTaxSortDir != null) out.setFederalTaxSortDirection(FederalTaxSortDir);
    if (FederalTaxSortOrder != null) out.setFederalTaxSortOrder(FederalTaxSortOrder);

    Filter[] FederalTaxFilter = DataHelper.mapToFilterArray(FederalTaxMap, BigInteger.class);
    if (FederalTaxFilter != null) {
      BigIntegerFilter[] FederalTaxFilters = new BigIntegerFilter[FederalTaxFilter.length];
      for (int i = 0; i < FederalTaxFilters.length; i++) {
        FederalTaxFilters[i] = (BigIntegerFilter)FederalTaxFilter[i];
      }
      try {
        out.setFederalTaxFilter(FederalTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StateTaxMap = (Map)record.get("StateTax");
    Boolean StateTaxFetch = DataHelper.getFetch(StateTaxMap);
    Boolean StateTaxSortDir = DataHelper.getSortDirection(StateTaxMap);
    Integer StateTaxSortOrder = DataHelper.getSortOrder(StateTaxMap);
    if (StateTaxFetch != null) out.setStateTaxFetch(StateTaxFetch);
    if (StateTaxSortDir != null) out.setStateTaxSortDirection(StateTaxSortDir);
    if (StateTaxSortOrder != null) out.setStateTaxSortOrder(StateTaxSortOrder);

    Filter[] StateTaxFilter = DataHelper.mapToFilterArray(StateTaxMap, BigInteger.class);
    if (StateTaxFilter != null) {
      BigIntegerFilter[] StateTaxFilters = new BigIntegerFilter[StateTaxFilter.length];
      for (int i = 0; i < StateTaxFilters.length; i++) {
        StateTaxFilters[i] = (BigIntegerFilter)StateTaxFilter[i];
      }
      try {
        out.setStateTaxFilter(StateTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountyTaxMap = (Map)record.get("CountyTax");
    Boolean CountyTaxFetch = DataHelper.getFetch(CountyTaxMap);
    Boolean CountyTaxSortDir = DataHelper.getSortDirection(CountyTaxMap);
    Integer CountyTaxSortOrder = DataHelper.getSortOrder(CountyTaxMap);
    if (CountyTaxFetch != null) out.setCountyTaxFetch(CountyTaxFetch);
    if (CountyTaxSortDir != null) out.setCountyTaxSortDirection(CountyTaxSortDir);
    if (CountyTaxSortOrder != null) out.setCountyTaxSortOrder(CountyTaxSortOrder);

    Filter[] CountyTaxFilter = DataHelper.mapToFilterArray(CountyTaxMap, BigInteger.class);
    if (CountyTaxFilter != null) {
      BigIntegerFilter[] CountyTaxFilters = new BigIntegerFilter[CountyTaxFilter.length];
      for (int i = 0; i < CountyTaxFilters.length; i++) {
        CountyTaxFilters[i] = (BigIntegerFilter)CountyTaxFilter[i];
      }
      try {
        out.setCountyTaxFilter(CountyTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CityTaxMap = (Map)record.get("CityTax");
    Boolean CityTaxFetch = DataHelper.getFetch(CityTaxMap);
    Boolean CityTaxSortDir = DataHelper.getSortDirection(CityTaxMap);
    Integer CityTaxSortOrder = DataHelper.getSortOrder(CityTaxMap);
    if (CityTaxFetch != null) out.setCityTaxFetch(CityTaxFetch);
    if (CityTaxSortDir != null) out.setCityTaxSortDirection(CityTaxSortDir);
    if (CityTaxSortOrder != null) out.setCityTaxSortOrder(CityTaxSortOrder);

    Filter[] CityTaxFilter = DataHelper.mapToFilterArray(CityTaxMap, BigInteger.class);
    if (CityTaxFilter != null) {
      BigIntegerFilter[] CityTaxFilters = new BigIntegerFilter[CityTaxFilter.length];
      for (int i = 0; i < CityTaxFilters.length; i++) {
        CityTaxFilters[i] = (BigIntegerFilter)CityTaxFilter[i];
      }
      try {
        out.setCityTaxFilter(CityTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OtherTaxMap = (Map)record.get("OtherTax");
    Boolean OtherTaxFetch = DataHelper.getFetch(OtherTaxMap);
    Boolean OtherTaxSortDir = DataHelper.getSortDirection(OtherTaxMap);
    Integer OtherTaxSortOrder = DataHelper.getSortOrder(OtherTaxMap);
    if (OtherTaxFetch != null) out.setOtherTaxFetch(OtherTaxFetch);
    if (OtherTaxSortDir != null) out.setOtherTaxSortDirection(OtherTaxSortDir);
    if (OtherTaxSortOrder != null) out.setOtherTaxSortOrder(OtherTaxSortOrder);

    Filter[] OtherTaxFilter = DataHelper.mapToFilterArray(OtherTaxMap, BigInteger.class);
    if (OtherTaxFilter != null) {
      BigIntegerFilter[] OtherTaxFilters = new BigIntegerFilter[OtherTaxFilter.length];
      for (int i = 0; i < OtherTaxFilters.length; i++) {
        OtherTaxFilters[i] = (BigIntegerFilter)OtherTaxFilter[i];
      }
      try {
        out.setOtherTaxFilter(OtherTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxJournalStatusMap = (Map)record.get("TaxJournalStatus");
    Boolean TaxJournalStatusFetch = DataHelper.getFetch(TaxJournalStatusMap);
    Boolean TaxJournalStatusSortDir = DataHelper.getSortDirection(TaxJournalStatusMap);
    Integer TaxJournalStatusSortOrder = DataHelper.getSortOrder(TaxJournalStatusMap);
    if (TaxJournalStatusFetch != null) out.setTaxJournalStatusFetch(TaxJournalStatusFetch);
    if (TaxJournalStatusSortDir != null) out.setTaxJournalStatusSortDirection(TaxJournalStatusSortDir);
    if (TaxJournalStatusSortOrder != null) out.setTaxJournalStatusSortOrder(TaxJournalStatusSortOrder);

    Filter[] TaxJournalStatusFilter = DataHelper.mapToFilterArray(TaxJournalStatusMap, Integer.class);
    if (TaxJournalStatusFilter != null) {
      IntegerFilter[] TaxJournalStatusFilters = new IntegerFilter[TaxJournalStatusFilter.length];
      for (int i = 0; i < TaxJournalStatusFilters.length; i++) {
        TaxJournalStatusFilters[i] = (IntegerFilter)TaxJournalStatusFilter[i];
      }
      try {
        out.setTaxJournalStatusFilter(TaxJournalStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountAmtMap = (Map)record.get("DiscountAmt");
    Boolean DiscountAmtFetch = DataHelper.getFetch(DiscountAmtMap);
    Boolean DiscountAmtSortDir = DataHelper.getSortDirection(DiscountAmtMap);
    Integer DiscountAmtSortOrder = DataHelper.getSortOrder(DiscountAmtMap);
    if (DiscountAmtFetch != null) out.setDiscountAmtFetch(DiscountAmtFetch);
    if (DiscountAmtSortDir != null) out.setDiscountAmtSortDirection(DiscountAmtSortDir);
    if (DiscountAmtSortOrder != null) out.setDiscountAmtSortOrder(DiscountAmtSortOrder);

    Filter[] DiscountAmtFilter = DataHelper.mapToFilterArray(DiscountAmtMap, BigInteger.class);
    if (DiscountAmtFilter != null) {
      BigIntegerFilter[] DiscountAmtFilters = new BigIntegerFilter[DiscountAmtFilter.length];
      for (int i = 0; i < DiscountAmtFilters.length; i++) {
        DiscountAmtFilters[i] = (BigIntegerFilter)DiscountAmtFilter[i];
      }
      try {
        out.setDiscountAmtFilter(DiscountAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProfileIdMap = (Map)record.get("ProfileId");
    Boolean ProfileIdFetch = DataHelper.getFetch(ProfileIdMap);
    Boolean ProfileIdSortDir = DataHelper.getSortDirection(ProfileIdMap);
    Integer ProfileIdSortOrder = DataHelper.getSortOrder(ProfileIdMap);
    if (ProfileIdFetch != null) out.setProfileIdFetch(ProfileIdFetch);
    if (ProfileIdSortDir != null) out.setProfileIdSortDirection(ProfileIdSortDir);
    if (ProfileIdSortOrder != null) out.setProfileIdSortOrder(ProfileIdSortOrder);

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, BigInteger.class);
    if (ProfileIdFilter != null) {
      BigIntegerFilter[] ProfileIdFilters = new BigIntegerFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (BigIntegerFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AdjReasonCodeMap = (Map)record.get("AdjReasonCode");
    Boolean AdjReasonCodeFetch = DataHelper.getFetch(AdjReasonCodeMap);
    Boolean AdjReasonCodeSortDir = DataHelper.getSortDirection(AdjReasonCodeMap);
    Integer AdjReasonCodeSortOrder = DataHelper.getSortOrder(AdjReasonCodeMap);
    if (AdjReasonCodeFetch != null) out.setAdjReasonCodeFetch(AdjReasonCodeFetch);
    if (AdjReasonCodeSortDir != null) out.setAdjReasonCodeSortDirection(AdjReasonCodeSortDir);
    if (AdjReasonCodeSortOrder != null) out.setAdjReasonCodeSortOrder(AdjReasonCodeSortOrder);

    Filter[] AdjReasonCodeFilter = DataHelper.mapToFilterArray(AdjReasonCodeMap, Integer.class);
    if (AdjReasonCodeFilter != null) {
      IntegerFilter[] AdjReasonCodeFilters = new IntegerFilter[AdjReasonCodeFilter.length];
      for (int i = 0; i < AdjReasonCodeFilters.length; i++) {
        AdjReasonCodeFilters[i] = (IntegerFilter)AdjReasonCodeFilter[i];
      }
      try {
        out.setAdjReasonCodeFilter(AdjReasonCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FraudIndicatorMap = (Map)record.get("FraudIndicator");
    Boolean FraudIndicatorFetch = DataHelper.getFetch(FraudIndicatorMap);
    Boolean FraudIndicatorSortDir = DataHelper.getSortDirection(FraudIndicatorMap);
    Integer FraudIndicatorSortOrder = DataHelper.getSortOrder(FraudIndicatorMap);
    if (FraudIndicatorFetch != null) out.setFraudIndicatorFetch(FraudIndicatorFetch);
    if (FraudIndicatorSortDir != null) out.setFraudIndicatorSortDirection(FraudIndicatorSortDir);
    if (FraudIndicatorSortOrder != null) out.setFraudIndicatorSortOrder(FraudIndicatorSortOrder);

    Filter[] FraudIndicatorFilter = DataHelper.mapToFilterArray(FraudIndicatorMap, Integer.class);
    if (FraudIndicatorFilter != null) {
      IntegerFilter[] FraudIndicatorFilters = new IntegerFilter[FraudIndicatorFilter.length];
      for (int i = 0; i < FraudIndicatorFilters.length; i++) {
        FraudIndicatorFilters[i] = (IntegerFilter)FraudIndicatorFilter[i];
      }
      try {
        out.setFraudIndicatorFilter(FraudIndicatorFilters);
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
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceChgDateMap = (Map)record.get("BalanceChgDate");
    Boolean BalanceChgDateFetch = DataHelper.getFetch(BalanceChgDateMap);
    Boolean BalanceChgDateSortDir = DataHelper.getSortDirection(BalanceChgDateMap);
    Integer BalanceChgDateSortOrder = DataHelper.getSortOrder(BalanceChgDateMap);
    if (BalanceChgDateFetch != null) out.setBalanceChgDateFetch(BalanceChgDateFetch);
    if (BalanceChgDateSortDir != null) out.setBalanceChgDateSortDirection(BalanceChgDateSortDir);
    if (BalanceChgDateSortOrder != null) out.setBalanceChgDateSortOrder(BalanceChgDateSortOrder);

    Filter[] BalanceChgDateFilter = DataHelper.mapToFilterArray(BalanceChgDateMap, Date.class);
    if (BalanceChgDateFilter != null) {
      DateFilter[] BalanceChgDateFilters = new DateFilter[BalanceChgDateFilter.length];
      for (int i = 0; i < BalanceChgDateFilters.length; i++) {
        BalanceChgDateFilters[i] = (DateFilter)BalanceChgDateFilter[i];
      }
      try {
        out.setBalanceChgDateFilter(BalanceChgDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BRevRcvCostCtrMap = (Map)record.get("BRevRcvCostCtr");
    Boolean BRevRcvCostCtrFetch = DataHelper.getFetch(BRevRcvCostCtrMap);
    Boolean BRevRcvCostCtrSortDir = DataHelper.getSortDirection(BRevRcvCostCtrMap);
    Integer BRevRcvCostCtrSortOrder = DataHelper.getSortOrder(BRevRcvCostCtrMap);
    if (BRevRcvCostCtrFetch != null) out.setBRevRcvCostCtrFetch(BRevRcvCostCtrFetch);
    if (BRevRcvCostCtrSortDir != null) out.setBRevRcvCostCtrSortDirection(BRevRcvCostCtrSortDir);
    if (BRevRcvCostCtrSortOrder != null) out.setBRevRcvCostCtrSortOrder(BRevRcvCostCtrSortOrder);

    Filter[] BRevRcvCostCtrFilter = DataHelper.mapToFilterArray(BRevRcvCostCtrMap, Integer.class);
    if (BRevRcvCostCtrFilter != null) {
      IntegerFilter[] BRevRcvCostCtrFilters = new IntegerFilter[BRevRcvCostCtrFilter.length];
      for (int i = 0; i < BRevRcvCostCtrFilters.length; i++) {
        BRevRcvCostCtrFilters[i] = (IntegerFilter)BRevRcvCostCtrFilter[i];
      }
      try {
        out.setBRevRcvCostCtrFilter(BRevRcvCostCtrFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigSplitRowNumMap = (Map)record.get("OrigSplitRowNum");
    Boolean OrigSplitRowNumFetch = DataHelper.getFetch(OrigSplitRowNumMap);
    Boolean OrigSplitRowNumSortDir = DataHelper.getSortDirection(OrigSplitRowNumMap);
    Integer OrigSplitRowNumSortOrder = DataHelper.getSortOrder(OrigSplitRowNumMap);
    if (OrigSplitRowNumFetch != null) out.setOrigSplitRowNumFetch(OrigSplitRowNumFetch);
    if (OrigSplitRowNumSortDir != null) out.setOrigSplitRowNumSortDirection(OrigSplitRowNumSortDir);
    if (OrigSplitRowNumSortOrder != null) out.setOrigSplitRowNumSortOrder(OrigSplitRowNumSortOrder);

    Filter[] OrigSplitRowNumFilter = DataHelper.mapToFilterArray(OrigSplitRowNumMap, Integer.class);
    if (OrigSplitRowNumFilter != null) {
      IntegerFilter[] OrigSplitRowNumFilters = new IntegerFilter[OrigSplitRowNumFilter.length];
      for (int i = 0; i < OrigSplitRowNumFilters.length; i++) {
        OrigSplitRowNumFilters[i] = (IntegerFilter)OrigSplitRowNumFilter[i];
      }
      try {
        out.setOrigSplitRowNumFilter(OrigSplitRowNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxTypeCodeMap = (Map)record.get("TaxTypeCode");
    Boolean TaxTypeCodeFetch = DataHelper.getFetch(TaxTypeCodeMap);
    Boolean TaxTypeCodeSortDir = DataHelper.getSortDirection(TaxTypeCodeMap);
    Integer TaxTypeCodeSortOrder = DataHelper.getSortOrder(TaxTypeCodeMap);
    if (TaxTypeCodeFetch != null) out.setTaxTypeCodeFetch(TaxTypeCodeFetch);
    if (TaxTypeCodeSortDir != null) out.setTaxTypeCodeSortDirection(TaxTypeCodeSortDir);
    if (TaxTypeCodeSortOrder != null) out.setTaxTypeCodeSortOrder(TaxTypeCodeSortOrder);

    Filter[] TaxTypeCodeFilter = DataHelper.mapToFilterArray(TaxTypeCodeMap, Integer.class);
    if (TaxTypeCodeFilter != null) {
      IntegerFilter[] TaxTypeCodeFilters = new IntegerFilter[TaxTypeCodeFilter.length];
      for (int i = 0; i < TaxTypeCodeFilters.length; i++) {
        TaxTypeCodeFilters[i] = (IntegerFilter)TaxTypeCodeFilter[i];
      }
      try {
        out.setTaxTypeCodeFilter(TaxTypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigSubmitterNameMap = (Map)record.get("OrigSubmitterName");
    Boolean OrigSubmitterNameFetch = DataHelper.getFetch(OrigSubmitterNameMap);
    Boolean OrigSubmitterNameSortDir = DataHelper.getSortDirection(OrigSubmitterNameMap);
    Integer OrigSubmitterNameSortOrder = DataHelper.getSortOrder(OrigSubmitterNameMap);
    if (OrigSubmitterNameFetch != null) out.setOrigSubmitterNameFetch(OrigSubmitterNameFetch);
    if (OrigSubmitterNameSortDir != null) out.setOrigSubmitterNameSortDirection(OrigSubmitterNameSortDir);
    if (OrigSubmitterNameSortOrder != null) out.setOrigSubmitterNameSortOrder(OrigSubmitterNameSortOrder);

    Filter[] OrigSubmitterNameFilter = DataHelper.mapToFilterArray(OrigSubmitterNameMap, String.class);
    if (OrigSubmitterNameFilter != null) {
      StringFilter[] OrigSubmitterNameFilters = new StringFilter[OrigSubmitterNameFilter.length];
      for (int i = 0; i < OrigSubmitterNameFilters.length; i++) {
        OrigSubmitterNameFilters[i] = (StringFilter)OrigSubmitterNameFilter[i];
      }
      try {
        out.setOrigSubmitterNameFilter(OrigSubmitterNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LastReviewedNameMap = (Map)record.get("LastReviewedName");
    Boolean LastReviewedNameFetch = DataHelper.getFetch(LastReviewedNameMap);
    Boolean LastReviewedNameSortDir = DataHelper.getSortDirection(LastReviewedNameMap);
    Integer LastReviewedNameSortOrder = DataHelper.getSortOrder(LastReviewedNameMap);
    if (LastReviewedNameFetch != null) out.setLastReviewedNameFetch(LastReviewedNameFetch);
    if (LastReviewedNameSortDir != null) out.setLastReviewedNameSortDirection(LastReviewedNameSortDir);
    if (LastReviewedNameSortOrder != null) out.setLastReviewedNameSortOrder(LastReviewedNameSortOrder);

    Filter[] LastReviewedNameFilter = DataHelper.mapToFilterArray(LastReviewedNameMap, String.class);
    if (LastReviewedNameFilter != null) {
      StringFilter[] LastReviewedNameFilters = new StringFilter[LastReviewedNameFilter.length];
      for (int i = 0; i < LastReviewedNameFilters.length; i++) {
        LastReviewedNameFilters[i] = (StringFilter)LastReviewedNameFilter[i];
      }
      try {
        out.setLastReviewedNameFilter(LastReviewedNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map JurisdictionMap = (Map)record.get("Jurisdiction");
    Boolean JurisdictionFetch = DataHelper.getFetch(JurisdictionMap);
    Boolean JurisdictionSortDir = DataHelper.getSortDirection(JurisdictionMap);
    Integer JurisdictionSortOrder = DataHelper.getSortOrder(JurisdictionMap);
    if (JurisdictionFetch != null) out.setJurisdictionFetch(JurisdictionFetch);
    if (JurisdictionSortDir != null) out.setJurisdictionSortDirection(JurisdictionSortDir);
    if (JurisdictionSortOrder != null) out.setJurisdictionSortOrder(JurisdictionSortOrder);

    Filter[] JurisdictionFilter = DataHelper.mapToFilterArray(JurisdictionMap, Integer.class);
    if (JurisdictionFilter != null) {
      IntegerFilter[] JurisdictionFilters = new IntegerFilter[JurisdictionFilter.length];
      for (int i = 0; i < JurisdictionFilters.length; i++) {
        JurisdictionFilters[i] = (IntegerFilter)JurisdictionFilter[i];
      }
      try {
        out.setJurisdictionFilter(JurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillOrderNumberMap = (Map)record.get("BillOrderNumber");
    Boolean BillOrderNumberFetch = DataHelper.getFetch(BillOrderNumberMap);
    Boolean BillOrderNumberSortDir = DataHelper.getSortDirection(BillOrderNumberMap);
    Integer BillOrderNumberSortOrder = DataHelper.getSortOrder(BillOrderNumberMap);
    if (BillOrderNumberFetch != null) out.setBillOrderNumberFetch(BillOrderNumberFetch);
    if (BillOrderNumberSortDir != null) out.setBillOrderNumberSortDirection(BillOrderNumberSortDir);
    if (BillOrderNumberSortOrder != null) out.setBillOrderNumberSortOrder(BillOrderNumberSortOrder);

    Filter[] BillOrderNumberFilter = DataHelper.mapToFilterArray(BillOrderNumberMap, String.class);
    if (BillOrderNumberFilter != null) {
      StringFilter[] BillOrderNumberFilters = new StringFilter[BillOrderNumberFilter.length];
      for (int i = 0; i < BillOrderNumberFilters.length; i++) {
        BillOrderNumberFilters[i] = (StringFilter)BillOrderNumberFilter[i];
      }
      try {
        out.setBillOrderNumberFilter(BillOrderNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RequestIdMap = (Map)record.get("RequestId");
    Boolean RequestIdFetch = DataHelper.getFetch(RequestIdMap);
    Boolean RequestIdSortDir = DataHelper.getSortDirection(RequestIdMap);
    Integer RequestIdSortOrder = DataHelper.getSortOrder(RequestIdMap);
    if (RequestIdFetch != null) out.setRequestIdFetch(RequestIdFetch);
    if (RequestIdSortDir != null) out.setRequestIdSortDirection(RequestIdSortDir);
    if (RequestIdSortOrder != null) out.setRequestIdSortOrder(RequestIdSortOrder);

    Filter[] RequestIdFilter = DataHelper.mapToFilterArray(RequestIdMap, BigInteger.class);
    if (RequestIdFilter != null) {
      BigIntegerFilter[] RequestIdFilters = new BigIntegerFilter[RequestIdFilter.length];
      for (int i = 0; i < RequestIdFilters.length; i++) {
        RequestIdFilters[i] = (BigIntegerFilter)RequestIdFilter[i];
      }
      try {
        out.setRequestIdFilter(RequestIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
