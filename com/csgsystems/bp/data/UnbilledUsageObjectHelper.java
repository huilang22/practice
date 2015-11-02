/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageObjectHelper.java
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

import java.math.BigInteger;
import java.util.*;
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.bp.data.*;


/** Helper class to convert UnbilledUsageObject JavaBean objects to/from HashMaps.
 */
public class UnbilledUsageObjectHelper implements ArubaObjectHelper
{
  /** convert UnbilledUsageObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (UnbilledUsageObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert UnbilledUsageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnbilledUsageObjectData.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageObjectData the converted object
   */
  public static UnbilledUsageObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnbilledUsageObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageObject")
   * @return UnbilledUsageObjectData the converted object
   */
  public static UnbilledUsageObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnbilledUsageObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageObjectFilter the converted object
   */
  public static UnbilledUsageObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnbilledUsageObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnbilledUsageObject")
   * @return UnbilledUsageObjectFilter the converted object
   */
  public static UnbilledUsageObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to UnbilledUsageObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return UnbilledUsageObjectDataList the converted object
   */
  public static UnbilledUsageObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to UnbilledUsageObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageObjectList")
   * @return UnbilledUsageObjectDataList the converted object
   */
  public static UnbilledUsageObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageObjectList";
    Object[] root = (Object[]) record.get (rootName);
    UnbilledUsageObjectData[] array = null;
    if (root != null)
    {
      array = new UnbilledUsageObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = UnbilledUsageObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new UnbilledUsageObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new UnbilledUsageObjectDataList (array, index, total);
  }
  /** convert UnbilledUsageObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", UnbilledUsageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._CdrDataPartitionKeySet) record.put ("CdrDataPartitionKey", in.CdrDataPartitionKey);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._TypeIdUsgSet) record.put ("TypeIdUsg", in.TypeIdUsg);
  
    if (in._TransDtSet) record.put ("TransDt", in.TransDt);
  
    if (in._RateDtSet) record.put ("RateDt", in.RateDt);
  
    if (in._ExtTrackingIdSet) record.put ("ExtTrackingId", in.ExtTrackingId);
  
    if (in._TransIdSet) record.put ("TransId", in.TransId);
  
    if (in._ElementIdSet) record.put ("ElementId", in.ElementId);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._BillClassSet) record.put ("BillClass", in.BillClass);
  
    if (in._ProviderIdSet) record.put ("ProviderId", in.ProviderId);
  
    if (in._JurisdictionSet) record.put ("Jurisdiction", in.Jurisdiction);
  
    if (in._RateCurrencyCodeSet) record.put ("RateCurrencyCode", in.RateCurrencyCode);
  
    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._PointOriginSet) record.put ("PointOrigin", in.PointOrigin);
  
    if (in._CountryCodeOriginSet) record.put ("CountryCodeOrigin", in.CountryCodeOrigin);
  
    if (in._CountryDialCodeOriginSet) record.put ("CountryDialCodeOrigin", in.CountryDialCodeOrigin);
  
    if (in._PointIdOriginSet) record.put ("PointIdOrigin", in.PointIdOrigin);
  
    if (in._PointTaxCodeOriginSet) record.put ("PointTaxCodeOrigin", in.PointTaxCodeOrigin);
  
    if (in._PointTaxCodeTypeOriginSet) record.put ("PointTaxCodeTypeOrigin", in.PointTaxCodeTypeOrigin);
  
    if (in._PointTargetSet) record.put ("PointTarget", in.PointTarget);
  
    if (in._CountryCodeTargetSet) record.put ("CountryCodeTarget", in.CountryCodeTarget);
  
    if (in._PointIdTargetSet) record.put ("PointIdTarget", in.PointIdTarget);
  
    if (in._PointTaxCodeTargetSet) record.put ("PointTaxCodeTarget", in.PointTaxCodeTarget);
  
    if (in._PointTaxCodeTypeTargetSet) record.put ("PointTaxCodeTypeTarget", in.PointTaxCodeTypeTarget);
  
    if (in._BaseAmtSet) record.put ("BaseAmt", in.BaseAmt);
  
    if (in._SecondDtSet) record.put ("SecondDt", in.SecondDt);
  
    if (in._TaxRateActiveDtSet) record.put ("TaxRateActiveDt", in.TaxRateActiveDt);
  
    if (in._TaxRateInactiveDtSet) record.put ("TaxRateInactiveDt", in.TaxRateInactiveDt);
  
    if (in._TimezoneSet) record.put ("Timezone", in.Timezone);
  
    if (in._PrimaryUnitsSet) record.put ("PrimaryUnits", in.PrimaryUnits);
  
    if (in._SecondUnitsSet) record.put ("SecondUnits", in.SecondUnits);
  
    if (in._ThirdUnitsSet) record.put ("ThirdUnits", in.ThirdUnits);
  
    if (in._UnitsCurrencyCodeSet) record.put ("UnitsCurrencyCode", in.UnitsCurrencyCode);
  
    if (in._BillingUnitsTypeSet) record.put ("BillingUnitsType", in.BillingUnitsType);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
    if (in._CustomerTagSet) record.put ("CustomerTag", in.CustomerTag);
  
    if (in._RatedUnitsSet) record.put ("RatedUnits", in.RatedUnits);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._ForeignAmountSet) record.put ("ForeignAmount", in.ForeignAmount);
  
    if (in._RatePeriodSet) record.put ("RatePeriod", in.RatePeriod);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._CompStatusSet) record.put ("CompStatus", in.CompStatus);
  
    if (in._CdrStatusSet) record.put ("CdrStatus", in.CdrStatus);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._FileIdServSet) record.put ("FileIdServ", in.FileIdServ);
  
    if (in._RevRcvCostCtrSet) record.put ("RevRcvCostCtr", in.RevRcvCostCtr);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._UnroundedAmountSet) record.put ("UnroundedAmount", in.UnroundedAmount);
  
    if (in._CorridorPlanIdSet) record.put ("CorridorPlanId", in.CorridorPlanId);
  
    if (in._CellIdOriginSet) record.put ("CellIdOrigin", in.CellIdOrigin);
  
    if (in._OrigTypeIdUsgSet) record.put ("OrigTypeIdUsg", in.OrigTypeIdUsg);
  
    if (in._AccessRegionOriginSet) record.put ("AccessRegionOrigin", in.AccessRegionOrigin);
  
    if (in._AccessRegionTargetSet) record.put ("AccessRegionTarget", in.AccessRegionTarget);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._NumRecordsSet) record.put ("NumRecords", in.NumRecords);
  
    if (in._AmountReductionSet) record.put ("AmountReduction", in.AmountReduction);
  
    if (in._AmountReductionIdSet) record.put ("AmountReductionId", in.AmountReductionId);
  
    if (in._SeqnumRateUsageSet) record.put ("SeqnumRateUsage", in.SeqnumRateUsage);
  
    if (in._SeqnumRateUsageOverridesSet) record.put ("SeqnumRateUsageOverrides", in.SeqnumRateUsageOverrides);
  
    if (in._RawUnitsSet) record.put ("RawUnits", in.RawUnits);
  
    if (in._RawUnitsRoundedSet) record.put ("RawUnitsRounded", in.RawUnitsRounded);
  
    if (in._AggrUsageIdSet) record.put ("AggrUsageId", in.AggrUsageId);
  
    if (in._ZoneClassSet) record.put ("ZoneClass", in.ZoneClass);
  
    if (in._PointClassOriginSet) record.put ("PointClassOrigin", in.PointClassOrigin);
  
    if (in._PointClassTargetSet) record.put ("PointClassTarget", in.PointClassTarget);
  
    if (in._EquipClassCodeSet) record.put ("EquipClassCode", in.EquipClassCode);
  
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._TaxPkgCountSet) record.put ("TaxPkgCount", in.TaxPkgCount);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
  
    if (in._AddImpliedDecimalSet) record.put ("AddImpliedDecimal", in.AddImpliedDecimal);
  
    if (in._ReratedDtSet) record.put ("ReratedDt", in.ReratedDt);
  
    if (in._ExternalInvoiceIdSet) record.put ("ExternalInvoiceId", in.ExternalInvoiceId);
  
    if (in._InvoiceRecordSeqSet) record.put ("InvoiceRecordSeq", in.InvoiceRecordSeq);
  
    if (in._LobIdSet) record.put ("LobId", in.LobId);
  
    if (in._TransactionIdSet) record.put ("TransactionId", in.TransactionId);
  
    if (in._GuideToSet) record.put ("GuideTo", in.GuideTo);
  
    if (in._PointCategorySet) record.put ("PointCategory", in.PointCategory);
  
    if (in._OriginCountryDialCodeReqSet) record.put ("OriginCountryDialCodeReq", in.OriginCountryDialCodeReq);
  
    if (in._TaxCodeOriginReqSet) record.put ("TaxCodeOriginReq", in.TaxCodeOriginReq);
  
    if (in._TaxCodeTargetReqSet) record.put ("TaxCodeTargetReq", in.TaxCodeTargetReq);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._TaxClassSet) record.put ("TaxClass", in.TaxClass);
  
    if (in._TaxLocationUsgSet) record.put ("TaxLocationUsg", in.TaxLocationUsg);
  
    if (in._TaxLocationOutcollectSet) record.put ("TaxLocationOutcollect", in.TaxLocationOutcollect);
  
    if (in._UsgClassSet) record.put ("UsgClass", in.UsgClass);
  
    if (in._FreeUsgSet) record.put ("FreeUsg", in.FreeUsg);
  
    if (in._ProductLineIdSet) record.put ("ProductLineId", in.ProductLineId);
  
    if (in._BillAggrLevelSet) record.put ("BillAggrLevel", in.BillAggrLevel);
  
    if (in._DeriveJurisdictionSet) record.put ("DeriveJurisdiction", in.DeriveJurisdiction);
  
    if (in._UnitsIndicatorSet) record.put ("UnitsIndicator", in.UnitsIndicator);
  
    if (in._RatableUnitClassSet) record.put ("RatableUnitClass", in.RatableUnitClass);
  
    if (in._DurationFlagSet) record.put ("DurationFlag", in.DurationFlag);
  
    if (in._DeriveDistanceUnitsSet) record.put ("DeriveDistanceUnits", in.DeriveDistanceUnits);
  
    if (in._VhMinorThresholdSet) record.put ("VhMinorThreshold", in.VhMinorThreshold);
  
    if (in._DistanceUnitsIndicatorSet) record.put ("DistanceUnitsIndicator", in.DistanceUnitsIndicator);
  
    if (in._GuideToProviderSet) record.put ("GuideToProvider", in.GuideToProvider);
  
    if (in._IsPreratedSet) record.put ("IsPrerated", in.IsPrerated);
  
    if (in._KeepRunningTotalSet) record.put ("KeepRunningTotal", in.KeepRunningTotal);
  
    if (in._RoundingMethodSet) record.put ("RoundingMethod", in.RoundingMethod);
  
    if (in._RawUnitsTypeSet) record.put ("RawUnitsType", in.RawUnitsType);
  
    if (in._UseRateClassSet) record.put ("UseRateClass", in.UseRateClass);
  
    if (in._UseBillClassSet) record.put ("UseBillClass", in.UseBillClass);
  
    if (in._UseJurisdictionSet) record.put ("UseJurisdiction", in.UseJurisdiction);
  
    if (in._UsePointClassOriginSet) record.put ("UsePointClassOrigin", in.UsePointClassOrigin);
  
    if (in._UsePointClassTargetSet) record.put ("UsePointClassTarget", in.UsePointClassTarget);
  
    if (in._UseProviderClassSet) record.put ("UseProviderClass", in.UseProviderClass);
  
    if (in._UseRatePeriodSet) record.put ("UseRatePeriod", in.UseRatePeriod);
  
    if (in._UseElementIdSet) record.put ("UseElementId", in.UseElementId);
  
    if (in._UseEquipTypeCodeSet) record.put ("UseEquipTypeCode", in.UseEquipTypeCode);
  
    if (in._UseEquipClassCodeSet) record.put ("UseEquipClassCode", in.UseEquipClassCode);
  
    if (in._UseClassOfServiceCodeSet) record.put ("UseClassOfServiceCode", in.UseClassOfServiceCode);
  
    if (in._UseDistanceBandIdSet) record.put ("UseDistanceBandId", in.UseDistanceBandId);
  
    if (in._UseDefaultRateTypeSet) record.put ("UseDefaultRateType", in.UseDefaultRateType);
  
    if (in._RateCurrencyLocationSet) record.put ("RateCurrencyLocation", in.RateCurrencyLocation);
  
    if (in._RatePeriodRoundingSet) record.put ("RatePeriodRounding", in.RatePeriodRounding);
  
    if (in._RateMinimumDurationSet) record.put ("RateMinimumDuration", in.RateMinimumDuration);
  
    if (in._UseComponentIdSet) record.put ("UseComponentId", in.UseComponentId);
  
    if (in._MinBillingUnitsSet) record.put ("MinBillingUnits", in.MinBillingUnits);
  
    if (in._ConsolidateUsageSet) record.put ("ConsolidateUsage", in.ConsolidateUsage);
  
    if (in._NetworkDelaySet) record.put ("NetworkDelay", in.NetworkDelay);
  
    if (in._RatingMethodSet) record.put ("RatingMethod", in.RatingMethod);
  
    if (in._UseZoneClassSet) record.put ("UseZoneClass", in.UseZoneClass);
      return record;
  }
  /** convert UnbilledUsageObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", UnbilledUsageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch); 
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.CdrDataPartitionKey, in.CdrDataPartitionKeySort, in.CdrDataPartitionKeySortAscending, in.CdrDataPartitionKeyFetch);
      if (map != null) record.put ("CdrDataPartitionKey", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.TypeIdUsg, in.TypeIdUsgSort, in.TypeIdUsgSortAscending, in.TypeIdUsgFetch);
      if (map != null) record.put ("TypeIdUsg", map);
      map = DataHelper.filterToMap (in.TransDt, in.TransDtSort, in.TransDtSortAscending, in.TransDtFetch);
      if (map != null) record.put ("TransDt", map);
      map = DataHelper.filterToMap (in.RateDt, in.RateDtSort, in.RateDtSortAscending, in.RateDtFetch);
      if (map != null) record.put ("RateDt", map);
      map = DataHelper.filterToMap (in.ExtTrackingId, in.ExtTrackingIdSort, in.ExtTrackingIdSortAscending, in.ExtTrackingIdFetch, in.ExtTrackingIdCaseInsensitive);
      if (map != null) record.put ("ExtTrackingId", map);
      map = DataHelper.filterToMap (in.TransId, in.TransIdSort, in.TransIdSortAscending, in.TransIdFetch, in.TransIdCaseInsensitive);
      if (map != null) record.put ("TransId", map);
      map = DataHelper.filterToMap (in.ElementId, in.ElementIdSort, in.ElementIdSortAscending, in.ElementIdFetch);
      if (map != null) record.put ("ElementId", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.BillClass, in.BillClassSort, in.BillClassSortAscending, in.BillClassFetch);
      if (map != null) record.put ("BillClass", map);
      map = DataHelper.filterToMap (in.ProviderId, in.ProviderIdSort, in.ProviderIdSortAscending, in.ProviderIdFetch);
      if (map != null) record.put ("ProviderId", map);
      map = DataHelper.filterToMap (in.Jurisdiction, in.JurisdictionSort, in.JurisdictionSortAscending, in.JurisdictionFetch);
      if (map != null) record.put ("Jurisdiction", map);
      map = DataHelper.filterToMap (in.RateCurrencyCode, in.RateCurrencyCodeSort, in.RateCurrencyCodeSortAscending, in.RateCurrencyCodeFetch);
      if (map != null) record.put ("RateCurrencyCode", map);
      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.PointOrigin, in.PointOriginSort, in.PointOriginSortAscending, in.PointOriginFetch, in.PointOriginCaseInsensitive);
      if (map != null) record.put ("PointOrigin", map);
      map = DataHelper.filterToMap (in.CountryCodeOrigin, in.CountryCodeOriginSort, in.CountryCodeOriginSortAscending, in.CountryCodeOriginFetch);
      if (map != null) record.put ("CountryCodeOrigin", map);
      map = DataHelper.filterToMap (in.CountryDialCodeOrigin, in.CountryDialCodeOriginSort, in.CountryDialCodeOriginSortAscending, in.CountryDialCodeOriginFetch, in.CountryDialCodeOriginCaseInsensitive);
      if (map != null) record.put ("CountryDialCodeOrigin", map);
      map = DataHelper.filterToMap (in.PointIdOrigin, in.PointIdOriginSort, in.PointIdOriginSortAscending, in.PointIdOriginFetch);
      if (map != null) record.put ("PointIdOrigin", map);
      map = DataHelper.filterToMap (in.PointTaxCodeOrigin, in.PointTaxCodeOriginSort, in.PointTaxCodeOriginSortAscending, in.PointTaxCodeOriginFetch, in.PointTaxCodeOriginCaseInsensitive);
      if (map != null) record.put ("PointTaxCodeOrigin", map);
      map = DataHelper.filterToMap (in.PointTaxCodeTypeOrigin, in.PointTaxCodeTypeOriginSort, in.PointTaxCodeTypeOriginSortAscending, in.PointTaxCodeTypeOriginFetch);
      if (map != null) record.put ("PointTaxCodeTypeOrigin", map);
      map = DataHelper.filterToMap (in.PointTarget, in.PointTargetSort, in.PointTargetSortAscending, in.PointTargetFetch, in.PointTargetCaseInsensitive);
      if (map != null) record.put ("PointTarget", map);
      map = DataHelper.filterToMap (in.CountryCodeTarget, in.CountryCodeTargetSort, in.CountryCodeTargetSortAscending, in.CountryCodeTargetFetch);
      if (map != null) record.put ("CountryCodeTarget", map);
      map = DataHelper.filterToMap (in.PointIdTarget, in.PointIdTargetSort, in.PointIdTargetSortAscending, in.PointIdTargetFetch);
      if (map != null) record.put ("PointIdTarget", map);
      map = DataHelper.filterToMap (in.PointTaxCodeTarget, in.PointTaxCodeTargetSort, in.PointTaxCodeTargetSortAscending, in.PointTaxCodeTargetFetch, in.PointTaxCodeTargetCaseInsensitive);
      if (map != null) record.put ("PointTaxCodeTarget", map);
      map = DataHelper.filterToMap (in.PointTaxCodeTypeTarget, in.PointTaxCodeTypeTargetSort, in.PointTaxCodeTypeTargetSortAscending, in.PointTaxCodeTypeTargetFetch);
      if (map != null) record.put ("PointTaxCodeTypeTarget", map);
      map = DataHelper.filterToMap (in.BaseAmt, in.BaseAmtSort, in.BaseAmtSortAscending, in.BaseAmtFetch);
      if (map != null) record.put ("BaseAmt", map);
      map = DataHelper.filterToMap (in.SecondDt, in.SecondDtSort, in.SecondDtSortAscending, in.SecondDtFetch);
      if (map != null) record.put ("SecondDt", map);
      map = DataHelper.filterToMap (in.TaxRateActiveDt, in.TaxRateActiveDtSort, in.TaxRateActiveDtSortAscending, in.TaxRateActiveDtFetch);
      if (map != null) record.put ("TaxRateActiveDt", map);
      map = DataHelper.filterToMap (in.TaxRateInactiveDt, in.TaxRateInactiveDtSort, in.TaxRateInactiveDtSortAscending, in.TaxRateInactiveDtFetch);
      if (map != null) record.put ("TaxRateInactiveDt", map);
      map = DataHelper.filterToMap (in.Timezone, in.TimezoneSort, in.TimezoneSortAscending, in.TimezoneFetch);
      if (map != null) record.put ("Timezone", map);
      map = DataHelper.filterToMap (in.PrimaryUnits, in.PrimaryUnitsSort, in.PrimaryUnitsSortAscending, in.PrimaryUnitsFetch);
      if (map != null) record.put ("PrimaryUnits", map);
      map = DataHelper.filterToMap (in.SecondUnits, in.SecondUnitsSort, in.SecondUnitsSortAscending, in.SecondUnitsFetch);
      if (map != null) record.put ("SecondUnits", map);
      map = DataHelper.filterToMap (in.ThirdUnits, in.ThirdUnitsSort, in.ThirdUnitsSortAscending, in.ThirdUnitsFetch);
      if (map != null) record.put ("ThirdUnits", map);
      map = DataHelper.filterToMap (in.UnitsCurrencyCode, in.UnitsCurrencyCodeSort, in.UnitsCurrencyCodeSortAscending, in.UnitsCurrencyCodeFetch);
      if (map != null) record.put ("UnitsCurrencyCode", map);
      map = DataHelper.filterToMap (in.BillingUnitsType, in.BillingUnitsTypeSort, in.BillingUnitsTypeSortAscending, in.BillingUnitsTypeFetch);
      if (map != null) record.put ("BillingUnitsType", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
      map = DataHelper.filterToMap (in.CustomerTag, in.CustomerTagSort, in.CustomerTagSortAscending, in.CustomerTagFetch, in.CustomerTagCaseInsensitive);
      if (map != null) record.put ("CustomerTag", map);
      map = DataHelper.filterToMap (in.RatedUnits, in.RatedUnitsSort, in.RatedUnitsSortAscending, in.RatedUnitsFetch);
      if (map != null) record.put ("RatedUnits", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.ForeignAmount, in.ForeignAmountSort, in.ForeignAmountSortAscending, in.ForeignAmountFetch);
      if (map != null) record.put ("ForeignAmount", map);
      map = DataHelper.filterToMap (in.RatePeriod, in.RatePeriodSort, in.RatePeriodSortAscending, in.RatePeriodFetch, in.RatePeriodCaseInsensitive);
      if (map != null) record.put ("RatePeriod", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.CompStatus, in.CompStatusSort, in.CompStatusSortAscending, in.CompStatusFetch);
      if (map != null) record.put ("CompStatus", map);
      map = DataHelper.filterToMap (in.CdrStatus, in.CdrStatusSort, in.CdrStatusSortAscending, in.CdrStatusFetch);
      if (map != null) record.put ("CdrStatus", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.FileIdServ, in.FileIdServSort, in.FileIdServSortAscending, in.FileIdServFetch);
      if (map != null) record.put ("FileIdServ", map);
      map = DataHelper.filterToMap (in.RevRcvCostCtr, in.RevRcvCostCtrSort, in.RevRcvCostCtrSortAscending, in.RevRcvCostCtrFetch);
      if (map != null) record.put ("RevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.UnroundedAmount, in.UnroundedAmountSort, in.UnroundedAmountSortAscending, in.UnroundedAmountFetch);
      if (map != null) record.put ("UnroundedAmount", map);
      map = DataHelper.filterToMap (in.CorridorPlanId, in.CorridorPlanIdSort, in.CorridorPlanIdSortAscending, in.CorridorPlanIdFetch);
      if (map != null) record.put ("CorridorPlanId", map);
      map = DataHelper.filterToMap (in.CellIdOrigin, in.CellIdOriginSort, in.CellIdOriginSortAscending, in.CellIdOriginFetch);
      if (map != null) record.put ("CellIdOrigin", map);
      map = DataHelper.filterToMap (in.OrigTypeIdUsg, in.OrigTypeIdUsgSort, in.OrigTypeIdUsgSortAscending, in.OrigTypeIdUsgFetch);
      if (map != null) record.put ("OrigTypeIdUsg", map);
      map = DataHelper.filterToMap (in.AccessRegionOrigin, in.AccessRegionOriginSort, in.AccessRegionOriginSortAscending, in.AccessRegionOriginFetch, in.AccessRegionOriginCaseInsensitive);
      if (map != null) record.put ("AccessRegionOrigin", map);
      map = DataHelper.filterToMap (in.AccessRegionTarget, in.AccessRegionTargetSort, in.AccessRegionTargetSortAscending, in.AccessRegionTargetFetch, in.AccessRegionTargetCaseInsensitive);
      if (map != null) record.put ("AccessRegionTarget", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.NumRecords, in.NumRecordsSort, in.NumRecordsSortAscending, in.NumRecordsFetch);
      if (map != null) record.put ("NumRecords", map);
      map = DataHelper.filterToMap (in.AmountReduction, in.AmountReductionSort, in.AmountReductionSortAscending, in.AmountReductionFetch);
      if (map != null) record.put ("AmountReduction", map);
      map = DataHelper.filterToMap (in.AmountReductionId, in.AmountReductionIdSort, in.AmountReductionIdSortAscending, in.AmountReductionIdFetch);
      if (map != null) record.put ("AmountReductionId", map);
      map = DataHelper.filterToMap (in.SeqnumRateUsage, in.SeqnumRateUsageSort, in.SeqnumRateUsageSortAscending, in.SeqnumRateUsageFetch);
      if (map != null) record.put ("SeqnumRateUsage", map);
      map = DataHelper.filterToMap (in.SeqnumRateUsageOverrides, in.SeqnumRateUsageOverridesSort, in.SeqnumRateUsageOverridesSortAscending, in.SeqnumRateUsageOverridesFetch);
      if (map != null) record.put ("SeqnumRateUsageOverrides", map);
      map = DataHelper.filterToMap (in.RawUnits, in.RawUnitsSort, in.RawUnitsSortAscending, in.RawUnitsFetch);
      if (map != null) record.put ("RawUnits", map);
      map = DataHelper.filterToMap (in.RawUnitsRounded, in.RawUnitsRoundedSort, in.RawUnitsRoundedSortAscending, in.RawUnitsRoundedFetch);
      if (map != null) record.put ("RawUnitsRounded", map);
      map = DataHelper.filterToMap (in.AggrUsageId, in.AggrUsageIdSort, in.AggrUsageIdSortAscending, in.AggrUsageIdFetch);
      if (map != null) record.put ("AggrUsageId", map);
      map = DataHelper.filterToMap (in.ZoneClass, in.ZoneClassSort, in.ZoneClassSortAscending, in.ZoneClassFetch);
      if (map != null) record.put ("ZoneClass", map);
      map = DataHelper.filterToMap (in.PointClassOrigin, in.PointClassOriginSort, in.PointClassOriginSortAscending, in.PointClassOriginFetch);
      if (map != null) record.put ("PointClassOrigin", map);
      map = DataHelper.filterToMap (in.PointClassTarget, in.PointClassTargetSort, in.PointClassTargetSortAscending, in.PointClassTargetFetch);
      if (map != null) record.put ("PointClassTarget", map);
      map = DataHelper.filterToMap (in.EquipClassCode, in.EquipClassCodeSort, in.EquipClassCodeSortAscending, in.EquipClassCodeFetch);
      if (map != null) record.put ("EquipClassCode", map);
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.TaxPkgCount, in.TaxPkgCountSort, in.TaxPkgCountSortAscending, in.TaxPkgCountFetch);
      if (map != null) record.put ("TaxPkgCount", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive);
      if (map != null) record.put ("Geocode", map);
      map = DataHelper.filterToMap (in.AddImpliedDecimal, in.AddImpliedDecimalSort, in.AddImpliedDecimalSortAscending, in.AddImpliedDecimalFetch);
      if (map != null) record.put ("AddImpliedDecimal", map);
      map = DataHelper.filterToMap (in.ReratedDt, in.ReratedDtSort, in.ReratedDtSortAscending, in.ReratedDtFetch);
      if (map != null) record.put ("ReratedDt", map);
      map = DataHelper.filterToMap (in.ExternalInvoiceId, in.ExternalInvoiceIdSort, in.ExternalInvoiceIdSortAscending, in.ExternalInvoiceIdFetch);
      if (map != null) record.put ("ExternalInvoiceId", map);
      map = DataHelper.filterToMap (in.InvoiceRecordSeq, in.InvoiceRecordSeqSort, in.InvoiceRecordSeqSortAscending, in.InvoiceRecordSeqFetch);
      if (map != null) record.put ("InvoiceRecordSeq", map);
      map = DataHelper.filterToMap (in.LobId, in.LobIdSort, in.LobIdSortAscending, in.LobIdFetch);
      if (map != null) record.put ("LobId", map);
      map = DataHelper.filterToMap (in.TransactionId, in.TransactionIdSort, in.TransactionIdSortAscending, in.TransactionIdFetch);
      if (map != null) record.put ("TransactionId", map);
      map = DataHelper.filterToMap (in.GuideTo, in.GuideToSort, in.GuideToSortAscending, in.GuideToFetch);
      if (map != null) record.put ("GuideTo", map);
      map = DataHelper.filterToMap (in.PointCategory, in.PointCategorySort, in.PointCategorySortAscending, in.PointCategoryFetch);
      if (map != null) record.put ("PointCategory", map);
      map = DataHelper.filterToMap (in.OriginCountryDialCodeReq, in.OriginCountryDialCodeReqSort, in.OriginCountryDialCodeReqSortAscending, in.OriginCountryDialCodeReqFetch);
      if (map != null) record.put ("OriginCountryDialCodeReq", map);
      map = DataHelper.filterToMap (in.TaxCodeOriginReq, in.TaxCodeOriginReqSort, in.TaxCodeOriginReqSortAscending, in.TaxCodeOriginReqFetch);
      if (map != null) record.put ("TaxCodeOriginReq", map);
      map = DataHelper.filterToMap (in.TaxCodeTargetReq, in.TaxCodeTargetReqSort, in.TaxCodeTargetReqSortAscending, in.TaxCodeTargetReqFetch);
      if (map != null) record.put ("TaxCodeTargetReq", map);
      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.TaxClass, in.TaxClassSort, in.TaxClassSortAscending, in.TaxClassFetch);
      if (map != null) record.put ("TaxClass", map);
      map = DataHelper.filterToMap (in.TaxLocationUsg, in.TaxLocationUsgSort, in.TaxLocationUsgSortAscending, in.TaxLocationUsgFetch);
      if (map != null) record.put ("TaxLocationUsg", map);
      map = DataHelper.filterToMap (in.TaxLocationOutcollect, in.TaxLocationOutcollectSort, in.TaxLocationOutcollectSortAscending, in.TaxLocationOutcollectFetch);
      if (map != null) record.put ("TaxLocationOutcollect", map);
      map = DataHelper.filterToMap (in.UsgClass, in.UsgClassSort, in.UsgClassSortAscending, in.UsgClassFetch);
      if (map != null) record.put ("UsgClass", map);
      map = DataHelper.filterToMap (in.FreeUsg, in.FreeUsgSort, in.FreeUsgSortAscending, in.FreeUsgFetch);
      if (map != null) record.put ("FreeUsg", map);
      map = DataHelper.filterToMap (in.ProductLineId, in.ProductLineIdSort, in.ProductLineIdSortAscending, in.ProductLineIdFetch);
      if (map != null) record.put ("ProductLineId", map);
      map = DataHelper.filterToMap (in.BillAggrLevel, in.BillAggrLevelSort, in.BillAggrLevelSortAscending, in.BillAggrLevelFetch);
      if (map != null) record.put ("BillAggrLevel", map);
      map = DataHelper.filterToMap (in.DeriveJurisdiction, in.DeriveJurisdictionSort, in.DeriveJurisdictionSortAscending, in.DeriveJurisdictionFetch);
      if (map != null) record.put ("DeriveJurisdiction", map);
      map = DataHelper.filterToMap (in.UnitsIndicator, in.UnitsIndicatorSort, in.UnitsIndicatorSortAscending, in.UnitsIndicatorFetch);
      if (map != null) record.put ("UnitsIndicator", map);
      map = DataHelper.filterToMap (in.RatableUnitClass, in.RatableUnitClassSort, in.RatableUnitClassSortAscending, in.RatableUnitClassFetch);
      if (map != null) record.put ("RatableUnitClass", map);
      map = DataHelper.filterToMap (in.DurationFlag, in.DurationFlagSort, in.DurationFlagSortAscending, in.DurationFlagFetch);
      if (map != null) record.put ("DurationFlag", map);
      map = DataHelper.filterToMap (in.DeriveDistanceUnits, in.DeriveDistanceUnitsSort, in.DeriveDistanceUnitsSortAscending, in.DeriveDistanceUnitsFetch);
      if (map != null) record.put ("DeriveDistanceUnits", map);
      map = DataHelper.filterToMap (in.VhMinorThreshold, in.VhMinorThresholdSort, in.VhMinorThresholdSortAscending, in.VhMinorThresholdFetch);
      if (map != null) record.put ("VhMinorThreshold", map);
      map = DataHelper.filterToMap (in.DistanceUnitsIndicator, in.DistanceUnitsIndicatorSort, in.DistanceUnitsIndicatorSortAscending, in.DistanceUnitsIndicatorFetch);
      if (map != null) record.put ("DistanceUnitsIndicator", map);
      map = DataHelper.filterToMap (in.GuideToProvider, in.GuideToProviderSort, in.GuideToProviderSortAscending, in.GuideToProviderFetch);
      if (map != null) record.put ("GuideToProvider", map);
      map = DataHelper.filterToMap (in.IsPrerated, in.IsPreratedSort, in.IsPreratedSortAscending, in.IsPreratedFetch);
      if (map != null) record.put ("IsPrerated", map);
      map = DataHelper.filterToMap (in.KeepRunningTotal, in.KeepRunningTotalSort, in.KeepRunningTotalSortAscending, in.KeepRunningTotalFetch);
      if (map != null) record.put ("KeepRunningTotal", map);
      map = DataHelper.filterToMap (in.RoundingMethod, in.RoundingMethodSort, in.RoundingMethodSortAscending, in.RoundingMethodFetch);
      if (map != null) record.put ("RoundingMethod", map);
      map = DataHelper.filterToMap (in.RawUnitsType, in.RawUnitsTypeSort, in.RawUnitsTypeSortAscending, in.RawUnitsTypeFetch);
      if (map != null) record.put ("RawUnitsType", map);
      map = DataHelper.filterToMap (in.UseRateClass, in.UseRateClassSort, in.UseRateClassSortAscending, in.UseRateClassFetch);
      if (map != null) record.put ("UseRateClass", map);
      map = DataHelper.filterToMap (in.UseBillClass, in.UseBillClassSort, in.UseBillClassSortAscending, in.UseBillClassFetch);
      if (map != null) record.put ("UseBillClass", map);
      map = DataHelper.filterToMap (in.UseJurisdiction, in.UseJurisdictionSort, in.UseJurisdictionSortAscending, in.UseJurisdictionFetch);
      if (map != null) record.put ("UseJurisdiction", map);
      map = DataHelper.filterToMap (in.UsePointClassOrigin, in.UsePointClassOriginSort, in.UsePointClassOriginSortAscending, in.UsePointClassOriginFetch);
      if (map != null) record.put ("UsePointClassOrigin", map);
      map = DataHelper.filterToMap (in.UsePointClassTarget, in.UsePointClassTargetSort, in.UsePointClassTargetSortAscending, in.UsePointClassTargetFetch);
      if (map != null) record.put ("UsePointClassTarget", map);
      map = DataHelper.filterToMap (in.UseProviderClass, in.UseProviderClassSort, in.UseProviderClassSortAscending, in.UseProviderClassFetch);
      if (map != null) record.put ("UseProviderClass", map);
      map = DataHelper.filterToMap (in.UseRatePeriod, in.UseRatePeriodSort, in.UseRatePeriodSortAscending, in.UseRatePeriodFetch);
      if (map != null) record.put ("UseRatePeriod", map);
      map = DataHelper.filterToMap (in.UseElementId, in.UseElementIdSort, in.UseElementIdSortAscending, in.UseElementIdFetch);
      if (map != null) record.put ("UseElementId", map);
      map = DataHelper.filterToMap (in.UseEquipTypeCode, in.UseEquipTypeCodeSort, in.UseEquipTypeCodeSortAscending, in.UseEquipTypeCodeFetch);
      if (map != null) record.put ("UseEquipTypeCode", map);
      map = DataHelper.filterToMap (in.UseEquipClassCode, in.UseEquipClassCodeSort, in.UseEquipClassCodeSortAscending, in.UseEquipClassCodeFetch);
      if (map != null) record.put ("UseEquipClassCode", map);
      map = DataHelper.filterToMap (in.UseClassOfServiceCode, in.UseClassOfServiceCodeSort, in.UseClassOfServiceCodeSortAscending, in.UseClassOfServiceCodeFetch);
      if (map != null) record.put ("UseClassOfServiceCode", map);
      map = DataHelper.filterToMap (in.UseDistanceBandId, in.UseDistanceBandIdSort, in.UseDistanceBandIdSortAscending, in.UseDistanceBandIdFetch);
      if (map != null) record.put ("UseDistanceBandId", map);
      map = DataHelper.filterToMap (in.UseDefaultRateType, in.UseDefaultRateTypeSort, in.UseDefaultRateTypeSortAscending, in.UseDefaultRateTypeFetch);
      if (map != null) record.put ("UseDefaultRateType", map);
      map = DataHelper.filterToMap (in.RateCurrencyLocation, in.RateCurrencyLocationSort, in.RateCurrencyLocationSortAscending, in.RateCurrencyLocationFetch);
      if (map != null) record.put ("RateCurrencyLocation", map);
      map = DataHelper.filterToMap (in.RatePeriodRounding, in.RatePeriodRoundingSort, in.RatePeriodRoundingSortAscending, in.RatePeriodRoundingFetch);
      if (map != null) record.put ("RatePeriodRounding", map);
      map = DataHelper.filterToMap (in.RateMinimumDuration, in.RateMinimumDurationSort, in.RateMinimumDurationSortAscending, in.RateMinimumDurationFetch);
      if (map != null) record.put ("RateMinimumDuration", map);
      map = DataHelper.filterToMap (in.UseComponentId, in.UseComponentIdSort, in.UseComponentIdSortAscending, in.UseComponentIdFetch);
      if (map != null) record.put ("UseComponentId", map);
      map = DataHelper.filterToMap (in.MinBillingUnits, in.MinBillingUnitsSort, in.MinBillingUnitsSortAscending, in.MinBillingUnitsFetch);
      if (map != null) record.put ("MinBillingUnits", map);
      map = DataHelper.filterToMap (in.ConsolidateUsage, in.ConsolidateUsageSort, in.ConsolidateUsageSortAscending, in.ConsolidateUsageFetch);
      if (map != null) record.put ("ConsolidateUsage", map);
      map = DataHelper.filterToMap (in.NetworkDelay, in.NetworkDelaySort, in.NetworkDelaySortAscending, in.NetworkDelayFetch);
      if (map != null) record.put ("NetworkDelay", map);
      map = DataHelper.filterToMap (in.RatingMethod, in.RatingMethodSort, in.RatingMethodSortAscending, in.RatingMethodFetch);
      if (map != null) record.put ("RatingMethod", map);
      map = DataHelper.filterToMap (in.UseZoneClass, in.UseZoneClassSort, in.UseZoneClassSortAscending, in.UseZoneClassFetch);
      if (map != null) record.put ("UseZoneClass", map);
    return record;
  }
  /** convert Map to UnbilledUsageObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageObjectData the converted object
   */
  public static UnbilledUsageObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageObjectData out = new UnbilledUsageObjectData ();

    out.Key = UnbilledUsageObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("CdrDataPartitionKey")) != null)
    {
      out.CdrDataPartitionKey = (Date) obj;
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
  
    if ((obj = record.get ("TypeIdUsg")) != null)
    {
      out.TypeIdUsg = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDt")) != null)
    {
      out.TransDt = (Date) obj;
    }
  
    if ((obj = record.get ("RateDt")) != null)
    {
      out.RateDt = (Date) obj;
    }
  
    if ((obj = record.get ("ExtTrackingId")) != null)
    {
      out.ExtTrackingId = (String) obj;
    }
  
    if ((obj = record.get ("TransId")) != null)
    {
      out.TransId = (String) obj;
    }
  
    if ((obj = record.get ("ElementId")) != null)
    {
      out.ElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("BillClass")) != null)
    {
      out.BillClass = (Integer) obj;
    }
  
    if ((obj = record.get ("ProviderId")) != null)
    {
      out.ProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("Jurisdiction")) != null)
    {
      out.Jurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("RateCurrencyCode")) != null)
    {
      out.RateCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ExternalId")) != null)
    {
      out.ExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("PointOrigin")) != null)
    {
      out.PointOrigin = (String) obj;
    }
  
    if ((obj = record.get ("CountryCodeOrigin")) != null)
    {
      out.CountryCodeOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("CountryDialCodeOrigin")) != null)
    {
      out.CountryDialCodeOrigin = (String) obj;
    }
  
    if ((obj = record.get ("PointIdOrigin")) != null)
    {
      out.PointIdOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("PointTaxCodeOrigin")) != null)
    {
      out.PointTaxCodeOrigin = (String) obj;
    }
  
    if ((obj = record.get ("PointTaxCodeTypeOrigin")) != null)
    {
      out.PointTaxCodeTypeOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("PointTarget")) != null)
    {
      out.PointTarget = (String) obj;
    }
  
    if ((obj = record.get ("CountryCodeTarget")) != null)
    {
      out.CountryCodeTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("PointIdTarget")) != null)
    {
      out.PointIdTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("PointTaxCodeTarget")) != null)
    {
      out.PointTaxCodeTarget = (String) obj;
    }
  
    if ((obj = record.get ("PointTaxCodeTypeTarget")) != null)
    {
      out.PointTaxCodeTypeTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("BaseAmt")) != null)
    {
      out.BaseAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SecondDt")) != null)
    {
      out.SecondDt = (Date) obj;
    }
  
    if ((obj = record.get ("TaxRateActiveDt")) != null)
    {
      out.TaxRateActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("TaxRateInactiveDt")) != null)
    {
      out.TaxRateInactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("Timezone")) != null)
    {
      out.Timezone = (Integer) obj;
    }
  
    if ((obj = record.get ("PrimaryUnits")) != null)
    {
      out.PrimaryUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SecondUnits")) != null)
    {
      out.SecondUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ThirdUnits")) != null)
    {
      out.ThirdUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UnitsCurrencyCode")) != null)
    {
      out.UnitsCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingUnitsType")) != null)
    {
      out.BillingUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
  
    if ((obj = record.get ("CustomerTag")) != null)
    {
      out.CustomerTag = (String) obj;
    }
  
    if ((obj = record.get ("RatedUnits")) != null)
    {
      out.RatedUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ForeignAmount")) != null)
    {
      out.ForeignAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RatePeriod")) != null)
    {
      out.RatePeriod = (String) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("CompStatus")) != null)
    {
      out.CompStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("CdrStatus")) != null)
    {
      out.CdrStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("FileId")) != null)
    {
      out.FileId = (Integer) obj;
    }
  
    if ((obj = record.get ("FileIdServ")) != null)
    {
      out.FileIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("RevRcvCostCtr")) != null)
    {
      out.RevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("UnroundedAmount")) != null)
    {
      out.UnroundedAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CorridorPlanId")) != null)
    {
      out.CorridorPlanId = (Integer) obj;
    }
  
    if ((obj = record.get ("CellIdOrigin")) != null)
    {
      out.CellIdOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTypeIdUsg")) != null)
    {
      out.OrigTypeIdUsg = (Integer) obj;
    }
  
    if ((obj = record.get ("AccessRegionOrigin")) != null)
    {
      out.AccessRegionOrigin = (String) obj;
    }
  
    if ((obj = record.get ("AccessRegionTarget")) != null)
    {
      out.AccessRegionTarget = (String) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("NumRecords")) != null)
    {
      out.NumRecords = (Integer) obj;
    }
  
    if ((obj = record.get ("AmountReduction")) != null)
    {
      out.AmountReduction = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AmountReductionId")) != null)
    {
      out.AmountReductionId = (Integer) obj;
    }
  
    if ((obj = record.get ("SeqnumRateUsage")) != null)
    {
      out.SeqnumRateUsage = (Integer) obj;
    }
  
    if ((obj = record.get ("SeqnumRateUsageOverrides")) != null)
    {
      out.SeqnumRateUsageOverrides = (Integer) obj;
    }
  
    if ((obj = record.get ("RawUnits")) != null)
    {
      out.RawUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RawUnitsRounded")) != null)
    {
      out.RawUnitsRounded = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AggrUsageId")) != null)
    {
      out.AggrUsageId = (Integer) obj;
    }
  
    if ((obj = record.get ("ZoneClass")) != null)
    {
      out.ZoneClass = (Integer) obj;
    }
  
    if ((obj = record.get ("PointClassOrigin")) != null)
    {
      out.PointClassOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("PointClassTarget")) != null)
    {
      out.PointClassTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("EquipClassCode")) != null)
    {
      out.EquipClassCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxPkgCount")) != null)
    {
      out.TaxPkgCount = (Integer) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
  
    if ((obj = record.get ("AddImpliedDecimal")) != null)
    {
      out.AddImpliedDecimal = (Integer) obj;
    }
  
    if ((obj = record.get ("ReratedDt")) != null)
    {
      out.ReratedDt = (Date) obj;
    }
  
    if ((obj = record.get ("ExternalInvoiceId")) != null)
    {
      out.ExternalInvoiceId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InvoiceRecordSeq")) != null)
    {
      out.InvoiceRecordSeq = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LobId")) != null)
    {
      out.LobId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TransactionId")) != null)
    {
      out.TransactionId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("GuideTo")) != null)
    {
      out.GuideTo = (Integer) obj;
    }
  
    if ((obj = record.get ("PointCategory")) != null)
    {
      out.PointCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("OriginCountryDialCodeReq")) != null)
    {
      out.OriginCountryDialCodeReq = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxCodeOriginReq")) != null)
    {
      out.TaxCodeOriginReq = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxCodeTargetReq")) != null)
    {
      out.TaxCodeTargetReq = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxClass")) != null)
    {
      out.TaxClass = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxLocationUsg")) != null)
    {
      out.TaxLocationUsg = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxLocationOutcollect")) != null)
    {
      out.TaxLocationOutcollect = (Integer) obj;
    }
  
    if ((obj = record.get ("UsgClass")) != null)
    {
      out.UsgClass = (Integer) obj;
    }
  
    if ((obj = record.get ("FreeUsg")) != null)
    {
      out.FreeUsg = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProductLineId")) != null)
    {
      out.ProductLineId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillAggrLevel")) != null)
    {
      out.BillAggrLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("DeriveJurisdiction")) != null)
    {
      out.DeriveJurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitsIndicator")) != null)
    {
      out.UnitsIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("RatableUnitClass")) != null)
    {
      out.RatableUnitClass = (Integer) obj;
    }
  
    if ((obj = record.get ("DurationFlag")) != null)
    {
      out.DurationFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("DeriveDistanceUnits")) != null)
    {
      out.DeriveDistanceUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("VhMinorThreshold")) != null)
    {
      out.VhMinorThreshold = (Integer) obj;
    }
  
    if ((obj = record.get ("DistanceUnitsIndicator")) != null)
    {
      out.DistanceUnitsIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("GuideToProvider")) != null)
    {
      out.GuideToProvider = (Integer) obj;
    }
  
    if ((obj = record.get ("IsPrerated")) != null)
    {
      out.IsPrerated = (Boolean) obj;
    }
  
    if ((obj = record.get ("KeepRunningTotal")) != null)
    {
      out.KeepRunningTotal = (Boolean) obj;
    }
  
    if ((obj = record.get ("RoundingMethod")) != null)
    {
      out.RoundingMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("RawUnitsType")) != null)
    {
      out.RawUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("UseRateClass")) != null)
    {
      out.UseRateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("UseBillClass")) != null)
    {
      out.UseBillClass = (Integer) obj;
    }
  
    if ((obj = record.get ("UseJurisdiction")) != null)
    {
      out.UseJurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("UsePointClassOrigin")) != null)
    {
      out.UsePointClassOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("UsePointClassTarget")) != null)
    {
      out.UsePointClassTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("UseProviderClass")) != null)
    {
      out.UseProviderClass = (Integer) obj;
    }
  
    if ((obj = record.get ("UseRatePeriod")) != null)
    {
      out.UseRatePeriod = (Integer) obj;
    }
  
    if ((obj = record.get ("UseElementId")) != null)
    {
      out.UseElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("UseEquipTypeCode")) != null)
    {
      out.UseEquipTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("UseEquipClassCode")) != null)
    {
      out.UseEquipClassCode = (Integer) obj;
    }
  
    if ((obj = record.get ("UseClassOfServiceCode")) != null)
    {
      out.UseClassOfServiceCode = (Integer) obj;
    }
  
    if ((obj = record.get ("UseDistanceBandId")) != null)
    {
      out.UseDistanceBandId = (Integer) obj;
    }
  
    if ((obj = record.get ("UseDefaultRateType")) != null)
    {
      out.UseDefaultRateType = (Integer) obj;
    }
  
    if ((obj = record.get ("RateCurrencyLocation")) != null)
    {
      out.RateCurrencyLocation = (Integer) obj;
    }
  
    if ((obj = record.get ("RatePeriodRounding")) != null)
    {
      out.RatePeriodRounding = (Integer) obj;
    }
  
    if ((obj = record.get ("RateMinimumDuration")) != null)
    {
      out.RateMinimumDuration = (Integer) obj;
    }
  
    if ((obj = record.get ("UseComponentId")) != null)
    {
      out.UseComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("MinBillingUnits")) != null)
    {
      out.MinBillingUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ConsolidateUsage")) != null)
    {
      out.ConsolidateUsage = (Boolean) obj;
    }
  
    if ((obj = record.get ("NetworkDelay")) != null)
    {
      out.NetworkDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("RatingMethod")) != null)
    {
      out.RatingMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("UseZoneClass")) != null)
    {
      out.UseZoneClass = (Integer) obj;
    }
      return out;
  }
  /** convert Map to UnbilledUsageObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageObjectFilter the converted object
   */
  public static UnbilledUsageObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageObjectFilter out = new UnbilledUsageObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = UnbilledUsageObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map CdrDataPartitionKeyMap = (Map)record.get("CdrDataPartitionKey");
    Boolean CdrDataPartitionKeyFetch = DataHelper.getFetch(CdrDataPartitionKeyMap);
    Boolean CdrDataPartitionKeySortDir = DataHelper.getSortDirection(CdrDataPartitionKeyMap);
    Integer CdrDataPartitionKeySortOrder = DataHelper.getSortOrder(CdrDataPartitionKeyMap);
    if (CdrDataPartitionKeyFetch != null) out.setCdrDataPartitionKeyFetch(CdrDataPartitionKeyFetch);
    if (CdrDataPartitionKeySortDir != null) out.setCdrDataPartitionKeySortDirection(CdrDataPartitionKeySortDir);
    if (CdrDataPartitionKeySortOrder != null) out.setCdrDataPartitionKeySortOrder(CdrDataPartitionKeySortOrder);

    Filter[] CdrDataPartitionKeyFilter = DataHelper.mapToFilterArray(CdrDataPartitionKeyMap, Date.class);
    if (CdrDataPartitionKeyFilter != null) {
      DateFilter[] CdrDataPartitionKeyFilters = new DateFilter[CdrDataPartitionKeyFilter.length];
      for (int i = 0; i < CdrDataPartitionKeyFilters.length; i++) {
        CdrDataPartitionKeyFilters[i] = (DateFilter)CdrDataPartitionKeyFilter[i];
      }
      try {
        out.setCdrDataPartitionKeyFilter(CdrDataPartitionKeyFilters);
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
  
    Map TypeIdUsgMap = (Map)record.get("TypeIdUsg");
    Boolean TypeIdUsgFetch = DataHelper.getFetch(TypeIdUsgMap);
    Boolean TypeIdUsgSortDir = DataHelper.getSortDirection(TypeIdUsgMap);
    Integer TypeIdUsgSortOrder = DataHelper.getSortOrder(TypeIdUsgMap);
    if (TypeIdUsgFetch != null) out.setTypeIdUsgFetch(TypeIdUsgFetch);
    if (TypeIdUsgSortDir != null) out.setTypeIdUsgSortDirection(TypeIdUsgSortDir);
    if (TypeIdUsgSortOrder != null) out.setTypeIdUsgSortOrder(TypeIdUsgSortOrder);

    Filter[] TypeIdUsgFilter = DataHelper.mapToFilterArray(TypeIdUsgMap, Integer.class);
    if (TypeIdUsgFilter != null) {
      IntegerFilter[] TypeIdUsgFilters = new IntegerFilter[TypeIdUsgFilter.length];
      for (int i = 0; i < TypeIdUsgFilters.length; i++) {
        TypeIdUsgFilters[i] = (IntegerFilter)TypeIdUsgFilter[i];
      }
      try {
        out.setTypeIdUsgFilter(TypeIdUsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDtMap = (Map)record.get("TransDt");
    Boolean TransDtFetch = DataHelper.getFetch(TransDtMap);
    Boolean TransDtSortDir = DataHelper.getSortDirection(TransDtMap);
    Integer TransDtSortOrder = DataHelper.getSortOrder(TransDtMap);
    if (TransDtFetch != null) out.setTransDtFetch(TransDtFetch);
    if (TransDtSortDir != null) out.setTransDtSortDirection(TransDtSortDir);
    if (TransDtSortOrder != null) out.setTransDtSortOrder(TransDtSortOrder);

    Filter[] TransDtFilter = DataHelper.mapToFilterArray(TransDtMap, Date.class);
    if (TransDtFilter != null) {
      DateFilter[] TransDtFilters = new DateFilter[TransDtFilter.length];
      for (int i = 0; i < TransDtFilters.length; i++) {
        TransDtFilters[i] = (DateFilter)TransDtFilter[i];
      }
      try {
        out.setTransDtFilter(TransDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateDtMap = (Map)record.get("RateDt");
    Boolean RateDtFetch = DataHelper.getFetch(RateDtMap);
    Boolean RateDtSortDir = DataHelper.getSortDirection(RateDtMap);
    Integer RateDtSortOrder = DataHelper.getSortOrder(RateDtMap);
    if (RateDtFetch != null) out.setRateDtFetch(RateDtFetch);
    if (RateDtSortDir != null) out.setRateDtSortDirection(RateDtSortDir);
    if (RateDtSortOrder != null) out.setRateDtSortOrder(RateDtSortOrder);

    Filter[] RateDtFilter = DataHelper.mapToFilterArray(RateDtMap, Date.class);
    if (RateDtFilter != null) {
      DateFilter[] RateDtFilters = new DateFilter[RateDtFilter.length];
      for (int i = 0; i < RateDtFilters.length; i++) {
        RateDtFilters[i] = (DateFilter)RateDtFilter[i];
      }
      try {
        out.setRateDtFilter(RateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExtTrackingIdMap = (Map)record.get("ExtTrackingId");
    Boolean ExtTrackingIdFetch = DataHelper.getFetch(ExtTrackingIdMap);
    Boolean ExtTrackingIdSortDir = DataHelper.getSortDirection(ExtTrackingIdMap);
    Integer ExtTrackingIdSortOrder = DataHelper.getSortOrder(ExtTrackingIdMap);
    if (ExtTrackingIdFetch != null) out.setExtTrackingIdFetch(ExtTrackingIdFetch);
    if (ExtTrackingIdSortDir != null) out.setExtTrackingIdSortDirection(ExtTrackingIdSortDir);
    if (ExtTrackingIdSortOrder != null) out.setExtTrackingIdSortOrder(ExtTrackingIdSortOrder);

    Filter[] ExtTrackingIdFilter = DataHelper.mapToFilterArray(ExtTrackingIdMap, String.class);
    if (ExtTrackingIdFilter != null) {
      StringFilter[] ExtTrackingIdFilters = new StringFilter[ExtTrackingIdFilter.length];
      for (int i = 0; i < ExtTrackingIdFilters.length; i++) {
        ExtTrackingIdFilters[i] = (StringFilter)ExtTrackingIdFilter[i];
      }
      try {
        out.setExtTrackingIdFilter(ExtTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransIdMap = (Map)record.get("TransId");
    Boolean TransIdFetch = DataHelper.getFetch(TransIdMap);
    Boolean TransIdSortDir = DataHelper.getSortDirection(TransIdMap);
    Integer TransIdSortOrder = DataHelper.getSortOrder(TransIdMap);
    if (TransIdFetch != null) out.setTransIdFetch(TransIdFetch);
    if (TransIdSortDir != null) out.setTransIdSortDirection(TransIdSortDir);
    if (TransIdSortOrder != null) out.setTransIdSortOrder(TransIdSortOrder);

    Filter[] TransIdFilter = DataHelper.mapToFilterArray(TransIdMap, String.class);
    if (TransIdFilter != null) {
      StringFilter[] TransIdFilters = new StringFilter[TransIdFilter.length];
      for (int i = 0; i < TransIdFilters.length; i++) {
        TransIdFilters[i] = (StringFilter)TransIdFilter[i];
      }
      try {
        out.setTransIdFilter(TransIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ElementIdMap = (Map)record.get("ElementId");
    Boolean ElementIdFetch = DataHelper.getFetch(ElementIdMap);
    Boolean ElementIdSortDir = DataHelper.getSortDirection(ElementIdMap);
    Integer ElementIdSortOrder = DataHelper.getSortOrder(ElementIdMap);
    if (ElementIdFetch != null) out.setElementIdFetch(ElementIdFetch);
    if (ElementIdSortDir != null) out.setElementIdSortDirection(ElementIdSortDir);
    if (ElementIdSortOrder != null) out.setElementIdSortOrder(ElementIdSortOrder);

    Filter[] ElementIdFilter = DataHelper.mapToFilterArray(ElementIdMap, Integer.class);
    if (ElementIdFilter != null) {
      IntegerFilter[] ElementIdFilters = new IntegerFilter[ElementIdFilter.length];
      for (int i = 0; i < ElementIdFilters.length; i++) {
        ElementIdFilters[i] = (IntegerFilter)ElementIdFilter[i];
      }
      try {
        out.setElementIdFilter(ElementIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassMap = (Map)record.get("RateClass");
    Boolean RateClassFetch = DataHelper.getFetch(RateClassMap);
    Boolean RateClassSortDir = DataHelper.getSortDirection(RateClassMap);
    Integer RateClassSortOrder = DataHelper.getSortOrder(RateClassMap);
    if (RateClassFetch != null) out.setRateClassFetch(RateClassFetch);
    if (RateClassSortDir != null) out.setRateClassSortDirection(RateClassSortDir);
    if (RateClassSortOrder != null) out.setRateClassSortOrder(RateClassSortOrder);

    Filter[] RateClassFilter = DataHelper.mapToFilterArray(RateClassMap, Integer.class);
    if (RateClassFilter != null) {
      IntegerFilter[] RateClassFilters = new IntegerFilter[RateClassFilter.length];
      for (int i = 0; i < RateClassFilters.length; i++) {
        RateClassFilters[i] = (IntegerFilter)RateClassFilter[i];
      }
      try {
        out.setRateClassFilter(RateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillClassMap = (Map)record.get("BillClass");
    Boolean BillClassFetch = DataHelper.getFetch(BillClassMap);
    Boolean BillClassSortDir = DataHelper.getSortDirection(BillClassMap);
    Integer BillClassSortOrder = DataHelper.getSortOrder(BillClassMap);
    if (BillClassFetch != null) out.setBillClassFetch(BillClassFetch);
    if (BillClassSortDir != null) out.setBillClassSortDirection(BillClassSortDir);
    if (BillClassSortOrder != null) out.setBillClassSortOrder(BillClassSortOrder);

    Filter[] BillClassFilter = DataHelper.mapToFilterArray(BillClassMap, Integer.class);
    if (BillClassFilter != null) {
      IntegerFilter[] BillClassFilters = new IntegerFilter[BillClassFilter.length];
      for (int i = 0; i < BillClassFilters.length; i++) {
        BillClassFilters[i] = (IntegerFilter)BillClassFilter[i];
      }
      try {
        out.setBillClassFilter(BillClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProviderIdMap = (Map)record.get("ProviderId");
    Boolean ProviderIdFetch = DataHelper.getFetch(ProviderIdMap);
    Boolean ProviderIdSortDir = DataHelper.getSortDirection(ProviderIdMap);
    Integer ProviderIdSortOrder = DataHelper.getSortOrder(ProviderIdMap);
    if (ProviderIdFetch != null) out.setProviderIdFetch(ProviderIdFetch);
    if (ProviderIdSortDir != null) out.setProviderIdSortDirection(ProviderIdSortDir);
    if (ProviderIdSortOrder != null) out.setProviderIdSortOrder(ProviderIdSortOrder);

    Filter[] ProviderIdFilter = DataHelper.mapToFilterArray(ProviderIdMap, Integer.class);
    if (ProviderIdFilter != null) {
      IntegerFilter[] ProviderIdFilters = new IntegerFilter[ProviderIdFilter.length];
      for (int i = 0; i < ProviderIdFilters.length; i++) {
        ProviderIdFilters[i] = (IntegerFilter)ProviderIdFilter[i];
      }
      try {
        out.setProviderIdFilter(ProviderIdFilters);
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
  
    Map RateCurrencyCodeMap = (Map)record.get("RateCurrencyCode");
    Boolean RateCurrencyCodeFetch = DataHelper.getFetch(RateCurrencyCodeMap);
    Boolean RateCurrencyCodeSortDir = DataHelper.getSortDirection(RateCurrencyCodeMap);
    Integer RateCurrencyCodeSortOrder = DataHelper.getSortOrder(RateCurrencyCodeMap);
    if (RateCurrencyCodeFetch != null) out.setRateCurrencyCodeFetch(RateCurrencyCodeFetch);
    if (RateCurrencyCodeSortDir != null) out.setRateCurrencyCodeSortDirection(RateCurrencyCodeSortDir);
    if (RateCurrencyCodeSortOrder != null) out.setRateCurrencyCodeSortOrder(RateCurrencyCodeSortOrder);

    Filter[] RateCurrencyCodeFilter = DataHelper.mapToFilterArray(RateCurrencyCodeMap, Integer.class);
    if (RateCurrencyCodeFilter != null) {
      IntegerFilter[] RateCurrencyCodeFilters = new IntegerFilter[RateCurrencyCodeFilter.length];
      for (int i = 0; i < RateCurrencyCodeFilters.length; i++) {
        RateCurrencyCodeFilters[i] = (IntegerFilter)RateCurrencyCodeFilter[i];
      }
      try {
        out.setRateCurrencyCodeFilter(RateCurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalIdMap = (Map)record.get("ExternalId");
    Boolean ExternalIdFetch = DataHelper.getFetch(ExternalIdMap);
    Boolean ExternalIdSortDir = DataHelper.getSortDirection(ExternalIdMap);
    Integer ExternalIdSortOrder = DataHelper.getSortOrder(ExternalIdMap);
    if (ExternalIdFetch != null) out.setExternalIdFetch(ExternalIdFetch);
    if (ExternalIdSortDir != null) out.setExternalIdSortDirection(ExternalIdSortDir);
    if (ExternalIdSortOrder != null) out.setExternalIdSortOrder(ExternalIdSortOrder);

    Filter[] ExternalIdFilter = DataHelper.mapToFilterArray(ExternalIdMap, String.class);
    if (ExternalIdFilter != null) {
      StringFilter[] ExternalIdFilters = new StringFilter[ExternalIdFilter.length];
      for (int i = 0; i < ExternalIdFilters.length; i++) {
        ExternalIdFilters[i] = (StringFilter)ExternalIdFilter[i];
      }
      try {
        out.setExternalIdFilter(ExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalIdTypeMap = (Map)record.get("ExternalIdType");
    Boolean ExternalIdTypeFetch = DataHelper.getFetch(ExternalIdTypeMap);
    Boolean ExternalIdTypeSortDir = DataHelper.getSortDirection(ExternalIdTypeMap);
    Integer ExternalIdTypeSortOrder = DataHelper.getSortOrder(ExternalIdTypeMap);
    if (ExternalIdTypeFetch != null) out.setExternalIdTypeFetch(ExternalIdTypeFetch);
    if (ExternalIdTypeSortDir != null) out.setExternalIdTypeSortDirection(ExternalIdTypeSortDir);
    if (ExternalIdTypeSortOrder != null) out.setExternalIdTypeSortOrder(ExternalIdTypeSortOrder);

    Filter[] ExternalIdTypeFilter = DataHelper.mapToFilterArray(ExternalIdTypeMap, Integer.class);
    if (ExternalIdTypeFilter != null) {
      IntegerFilter[] ExternalIdTypeFilters = new IntegerFilter[ExternalIdTypeFilter.length];
      for (int i = 0; i < ExternalIdTypeFilters.length; i++) {
        ExternalIdTypeFilters[i] = (IntegerFilter)ExternalIdTypeFilter[i];
      }
      try {
        out.setExternalIdTypeFilter(ExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointOriginMap = (Map)record.get("PointOrigin");
    Boolean PointOriginFetch = DataHelper.getFetch(PointOriginMap);
    Boolean PointOriginSortDir = DataHelper.getSortDirection(PointOriginMap);
    Integer PointOriginSortOrder = DataHelper.getSortOrder(PointOriginMap);
    if (PointOriginFetch != null) out.setPointOriginFetch(PointOriginFetch);
    if (PointOriginSortDir != null) out.setPointOriginSortDirection(PointOriginSortDir);
    if (PointOriginSortOrder != null) out.setPointOriginSortOrder(PointOriginSortOrder);

    Filter[] PointOriginFilter = DataHelper.mapToFilterArray(PointOriginMap, String.class);
    if (PointOriginFilter != null) {
      StringFilter[] PointOriginFilters = new StringFilter[PointOriginFilter.length];
      for (int i = 0; i < PointOriginFilters.length; i++) {
        PointOriginFilters[i] = (StringFilter)PointOriginFilter[i];
      }
      try {
        out.setPointOriginFilter(PointOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeOriginMap = (Map)record.get("CountryCodeOrigin");
    Boolean CountryCodeOriginFetch = DataHelper.getFetch(CountryCodeOriginMap);
    Boolean CountryCodeOriginSortDir = DataHelper.getSortDirection(CountryCodeOriginMap);
    Integer CountryCodeOriginSortOrder = DataHelper.getSortOrder(CountryCodeOriginMap);
    if (CountryCodeOriginFetch != null) out.setCountryCodeOriginFetch(CountryCodeOriginFetch);
    if (CountryCodeOriginSortDir != null) out.setCountryCodeOriginSortDirection(CountryCodeOriginSortDir);
    if (CountryCodeOriginSortOrder != null) out.setCountryCodeOriginSortOrder(CountryCodeOriginSortOrder);

    Filter[] CountryCodeOriginFilter = DataHelper.mapToFilterArray(CountryCodeOriginMap, Integer.class);
    if (CountryCodeOriginFilter != null) {
      IntegerFilter[] CountryCodeOriginFilters = new IntegerFilter[CountryCodeOriginFilter.length];
      for (int i = 0; i < CountryCodeOriginFilters.length; i++) {
        CountryCodeOriginFilters[i] = (IntegerFilter)CountryCodeOriginFilter[i];
      }
      try {
        out.setCountryCodeOriginFilter(CountryCodeOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryDialCodeOriginMap = (Map)record.get("CountryDialCodeOrigin");
    Boolean CountryDialCodeOriginFetch = DataHelper.getFetch(CountryDialCodeOriginMap);
    Boolean CountryDialCodeOriginSortDir = DataHelper.getSortDirection(CountryDialCodeOriginMap);
    Integer CountryDialCodeOriginSortOrder = DataHelper.getSortOrder(CountryDialCodeOriginMap);
    if (CountryDialCodeOriginFetch != null) out.setCountryDialCodeOriginFetch(CountryDialCodeOriginFetch);
    if (CountryDialCodeOriginSortDir != null) out.setCountryDialCodeOriginSortDirection(CountryDialCodeOriginSortDir);
    if (CountryDialCodeOriginSortOrder != null) out.setCountryDialCodeOriginSortOrder(CountryDialCodeOriginSortOrder);

    Filter[] CountryDialCodeOriginFilter = DataHelper.mapToFilterArray(CountryDialCodeOriginMap, String.class);
    if (CountryDialCodeOriginFilter != null) {
      StringFilter[] CountryDialCodeOriginFilters = new StringFilter[CountryDialCodeOriginFilter.length];
      for (int i = 0; i < CountryDialCodeOriginFilters.length; i++) {
        CountryDialCodeOriginFilters[i] = (StringFilter)CountryDialCodeOriginFilter[i];
      }
      try {
        out.setCountryDialCodeOriginFilter(CountryDialCodeOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointIdOriginMap = (Map)record.get("PointIdOrigin");
    Boolean PointIdOriginFetch = DataHelper.getFetch(PointIdOriginMap);
    Boolean PointIdOriginSortDir = DataHelper.getSortDirection(PointIdOriginMap);
    Integer PointIdOriginSortOrder = DataHelper.getSortOrder(PointIdOriginMap);
    if (PointIdOriginFetch != null) out.setPointIdOriginFetch(PointIdOriginFetch);
    if (PointIdOriginSortDir != null) out.setPointIdOriginSortDirection(PointIdOriginSortDir);
    if (PointIdOriginSortOrder != null) out.setPointIdOriginSortOrder(PointIdOriginSortOrder);

    Filter[] PointIdOriginFilter = DataHelper.mapToFilterArray(PointIdOriginMap, Integer.class);
    if (PointIdOriginFilter != null) {
      IntegerFilter[] PointIdOriginFilters = new IntegerFilter[PointIdOriginFilter.length];
      for (int i = 0; i < PointIdOriginFilters.length; i++) {
        PointIdOriginFilters[i] = (IntegerFilter)PointIdOriginFilter[i];
      }
      try {
        out.setPointIdOriginFilter(PointIdOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTaxCodeOriginMap = (Map)record.get("PointTaxCodeOrigin");
    Boolean PointTaxCodeOriginFetch = DataHelper.getFetch(PointTaxCodeOriginMap);
    Boolean PointTaxCodeOriginSortDir = DataHelper.getSortDirection(PointTaxCodeOriginMap);
    Integer PointTaxCodeOriginSortOrder = DataHelper.getSortOrder(PointTaxCodeOriginMap);
    if (PointTaxCodeOriginFetch != null) out.setPointTaxCodeOriginFetch(PointTaxCodeOriginFetch);
    if (PointTaxCodeOriginSortDir != null) out.setPointTaxCodeOriginSortDirection(PointTaxCodeOriginSortDir);
    if (PointTaxCodeOriginSortOrder != null) out.setPointTaxCodeOriginSortOrder(PointTaxCodeOriginSortOrder);

    Filter[] PointTaxCodeOriginFilter = DataHelper.mapToFilterArray(PointTaxCodeOriginMap, String.class);
    if (PointTaxCodeOriginFilter != null) {
      StringFilter[] PointTaxCodeOriginFilters = new StringFilter[PointTaxCodeOriginFilter.length];
      for (int i = 0; i < PointTaxCodeOriginFilters.length; i++) {
        PointTaxCodeOriginFilters[i] = (StringFilter)PointTaxCodeOriginFilter[i];
      }
      try {
        out.setPointTaxCodeOriginFilter(PointTaxCodeOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTaxCodeTypeOriginMap = (Map)record.get("PointTaxCodeTypeOrigin");
    Boolean PointTaxCodeTypeOriginFetch = DataHelper.getFetch(PointTaxCodeTypeOriginMap);
    Boolean PointTaxCodeTypeOriginSortDir = DataHelper.getSortDirection(PointTaxCodeTypeOriginMap);
    Integer PointTaxCodeTypeOriginSortOrder = DataHelper.getSortOrder(PointTaxCodeTypeOriginMap);
    if (PointTaxCodeTypeOriginFetch != null) out.setPointTaxCodeTypeOriginFetch(PointTaxCodeTypeOriginFetch);
    if (PointTaxCodeTypeOriginSortDir != null) out.setPointTaxCodeTypeOriginSortDirection(PointTaxCodeTypeOriginSortDir);
    if (PointTaxCodeTypeOriginSortOrder != null) out.setPointTaxCodeTypeOriginSortOrder(PointTaxCodeTypeOriginSortOrder);

    Filter[] PointTaxCodeTypeOriginFilter = DataHelper.mapToFilterArray(PointTaxCodeTypeOriginMap, Integer.class);
    if (PointTaxCodeTypeOriginFilter != null) {
      IntegerFilter[] PointTaxCodeTypeOriginFilters = new IntegerFilter[PointTaxCodeTypeOriginFilter.length];
      for (int i = 0; i < PointTaxCodeTypeOriginFilters.length; i++) {
        PointTaxCodeTypeOriginFilters[i] = (IntegerFilter)PointTaxCodeTypeOriginFilter[i];
      }
      try {
        out.setPointTaxCodeTypeOriginFilter(PointTaxCodeTypeOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTargetMap = (Map)record.get("PointTarget");
    Boolean PointTargetFetch = DataHelper.getFetch(PointTargetMap);
    Boolean PointTargetSortDir = DataHelper.getSortDirection(PointTargetMap);
    Integer PointTargetSortOrder = DataHelper.getSortOrder(PointTargetMap);
    if (PointTargetFetch != null) out.setPointTargetFetch(PointTargetFetch);
    if (PointTargetSortDir != null) out.setPointTargetSortDirection(PointTargetSortDir);
    if (PointTargetSortOrder != null) out.setPointTargetSortOrder(PointTargetSortOrder);

    Filter[] PointTargetFilter = DataHelper.mapToFilterArray(PointTargetMap, String.class);
    if (PointTargetFilter != null) {
      StringFilter[] PointTargetFilters = new StringFilter[PointTargetFilter.length];
      for (int i = 0; i < PointTargetFilters.length; i++) {
        PointTargetFilters[i] = (StringFilter)PointTargetFilter[i];
      }
      try {
        out.setPointTargetFilter(PointTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeTargetMap = (Map)record.get("CountryCodeTarget");
    Boolean CountryCodeTargetFetch = DataHelper.getFetch(CountryCodeTargetMap);
    Boolean CountryCodeTargetSortDir = DataHelper.getSortDirection(CountryCodeTargetMap);
    Integer CountryCodeTargetSortOrder = DataHelper.getSortOrder(CountryCodeTargetMap);
    if (CountryCodeTargetFetch != null) out.setCountryCodeTargetFetch(CountryCodeTargetFetch);
    if (CountryCodeTargetSortDir != null) out.setCountryCodeTargetSortDirection(CountryCodeTargetSortDir);
    if (CountryCodeTargetSortOrder != null) out.setCountryCodeTargetSortOrder(CountryCodeTargetSortOrder);

    Filter[] CountryCodeTargetFilter = DataHelper.mapToFilterArray(CountryCodeTargetMap, Integer.class);
    if (CountryCodeTargetFilter != null) {
      IntegerFilter[] CountryCodeTargetFilters = new IntegerFilter[CountryCodeTargetFilter.length];
      for (int i = 0; i < CountryCodeTargetFilters.length; i++) {
        CountryCodeTargetFilters[i] = (IntegerFilter)CountryCodeTargetFilter[i];
      }
      try {
        out.setCountryCodeTargetFilter(CountryCodeTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointIdTargetMap = (Map)record.get("PointIdTarget");
    Boolean PointIdTargetFetch = DataHelper.getFetch(PointIdTargetMap);
    Boolean PointIdTargetSortDir = DataHelper.getSortDirection(PointIdTargetMap);
    Integer PointIdTargetSortOrder = DataHelper.getSortOrder(PointIdTargetMap);
    if (PointIdTargetFetch != null) out.setPointIdTargetFetch(PointIdTargetFetch);
    if (PointIdTargetSortDir != null) out.setPointIdTargetSortDirection(PointIdTargetSortDir);
    if (PointIdTargetSortOrder != null) out.setPointIdTargetSortOrder(PointIdTargetSortOrder);

    Filter[] PointIdTargetFilter = DataHelper.mapToFilterArray(PointIdTargetMap, Integer.class);
    if (PointIdTargetFilter != null) {
      IntegerFilter[] PointIdTargetFilters = new IntegerFilter[PointIdTargetFilter.length];
      for (int i = 0; i < PointIdTargetFilters.length; i++) {
        PointIdTargetFilters[i] = (IntegerFilter)PointIdTargetFilter[i];
      }
      try {
        out.setPointIdTargetFilter(PointIdTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTaxCodeTargetMap = (Map)record.get("PointTaxCodeTarget");
    Boolean PointTaxCodeTargetFetch = DataHelper.getFetch(PointTaxCodeTargetMap);
    Boolean PointTaxCodeTargetSortDir = DataHelper.getSortDirection(PointTaxCodeTargetMap);
    Integer PointTaxCodeTargetSortOrder = DataHelper.getSortOrder(PointTaxCodeTargetMap);
    if (PointTaxCodeTargetFetch != null) out.setPointTaxCodeTargetFetch(PointTaxCodeTargetFetch);
    if (PointTaxCodeTargetSortDir != null) out.setPointTaxCodeTargetSortDirection(PointTaxCodeTargetSortDir);
    if (PointTaxCodeTargetSortOrder != null) out.setPointTaxCodeTargetSortOrder(PointTaxCodeTargetSortOrder);

    Filter[] PointTaxCodeTargetFilter = DataHelper.mapToFilterArray(PointTaxCodeTargetMap, String.class);
    if (PointTaxCodeTargetFilter != null) {
      StringFilter[] PointTaxCodeTargetFilters = new StringFilter[PointTaxCodeTargetFilter.length];
      for (int i = 0; i < PointTaxCodeTargetFilters.length; i++) {
        PointTaxCodeTargetFilters[i] = (StringFilter)PointTaxCodeTargetFilter[i];
      }
      try {
        out.setPointTaxCodeTargetFilter(PointTaxCodeTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTaxCodeTypeTargetMap = (Map)record.get("PointTaxCodeTypeTarget");
    Boolean PointTaxCodeTypeTargetFetch = DataHelper.getFetch(PointTaxCodeTypeTargetMap);
    Boolean PointTaxCodeTypeTargetSortDir = DataHelper.getSortDirection(PointTaxCodeTypeTargetMap);
    Integer PointTaxCodeTypeTargetSortOrder = DataHelper.getSortOrder(PointTaxCodeTypeTargetMap);
    if (PointTaxCodeTypeTargetFetch != null) out.setPointTaxCodeTypeTargetFetch(PointTaxCodeTypeTargetFetch);
    if (PointTaxCodeTypeTargetSortDir != null) out.setPointTaxCodeTypeTargetSortDirection(PointTaxCodeTypeTargetSortDir);
    if (PointTaxCodeTypeTargetSortOrder != null) out.setPointTaxCodeTypeTargetSortOrder(PointTaxCodeTypeTargetSortOrder);

    Filter[] PointTaxCodeTypeTargetFilter = DataHelper.mapToFilterArray(PointTaxCodeTypeTargetMap, Integer.class);
    if (PointTaxCodeTypeTargetFilter != null) {
      IntegerFilter[] PointTaxCodeTypeTargetFilters = new IntegerFilter[PointTaxCodeTypeTargetFilter.length];
      for (int i = 0; i < PointTaxCodeTypeTargetFilters.length; i++) {
        PointTaxCodeTypeTargetFilters[i] = (IntegerFilter)PointTaxCodeTypeTargetFilter[i];
      }
      try {
        out.setPointTaxCodeTypeTargetFilter(PointTaxCodeTypeTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BaseAmtMap = (Map)record.get("BaseAmt");
    Boolean BaseAmtFetch = DataHelper.getFetch(BaseAmtMap);
    Boolean BaseAmtSortDir = DataHelper.getSortDirection(BaseAmtMap);
    Integer BaseAmtSortOrder = DataHelper.getSortOrder(BaseAmtMap);
    if (BaseAmtFetch != null) out.setBaseAmtFetch(BaseAmtFetch);
    if (BaseAmtSortDir != null) out.setBaseAmtSortDirection(BaseAmtSortDir);
    if (BaseAmtSortOrder != null) out.setBaseAmtSortOrder(BaseAmtSortOrder);

    Filter[] BaseAmtFilter = DataHelper.mapToFilterArray(BaseAmtMap, BigInteger.class);
    if (BaseAmtFilter != null) {
      BigIntegerFilter[] BaseAmtFilters = new BigIntegerFilter[BaseAmtFilter.length];
      for (int i = 0; i < BaseAmtFilters.length; i++) {
        BaseAmtFilters[i] = (BigIntegerFilter)BaseAmtFilter[i];
      }
      try {
        out.setBaseAmtFilter(BaseAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SecondDtMap = (Map)record.get("SecondDt");
    Boolean SecondDtFetch = DataHelper.getFetch(SecondDtMap);
    Boolean SecondDtSortDir = DataHelper.getSortDirection(SecondDtMap);
    Integer SecondDtSortOrder = DataHelper.getSortOrder(SecondDtMap);
    if (SecondDtFetch != null) out.setSecondDtFetch(SecondDtFetch);
    if (SecondDtSortDir != null) out.setSecondDtSortDirection(SecondDtSortDir);
    if (SecondDtSortOrder != null) out.setSecondDtSortOrder(SecondDtSortOrder);

    Filter[] SecondDtFilter = DataHelper.mapToFilterArray(SecondDtMap, Date.class);
    if (SecondDtFilter != null) {
      DateFilter[] SecondDtFilters = new DateFilter[SecondDtFilter.length];
      for (int i = 0; i < SecondDtFilters.length; i++) {
        SecondDtFilters[i] = (DateFilter)SecondDtFilter[i];
      }
      try {
        out.setSecondDtFilter(SecondDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxRateActiveDtMap = (Map)record.get("TaxRateActiveDt");
    Boolean TaxRateActiveDtFetch = DataHelper.getFetch(TaxRateActiveDtMap);
    Boolean TaxRateActiveDtSortDir = DataHelper.getSortDirection(TaxRateActiveDtMap);
    Integer TaxRateActiveDtSortOrder = DataHelper.getSortOrder(TaxRateActiveDtMap);
    if (TaxRateActiveDtFetch != null) out.setTaxRateActiveDtFetch(TaxRateActiveDtFetch);
    if (TaxRateActiveDtSortDir != null) out.setTaxRateActiveDtSortDirection(TaxRateActiveDtSortDir);
    if (TaxRateActiveDtSortOrder != null) out.setTaxRateActiveDtSortOrder(TaxRateActiveDtSortOrder);

    Filter[] TaxRateActiveDtFilter = DataHelper.mapToFilterArray(TaxRateActiveDtMap, Date.class);
    if (TaxRateActiveDtFilter != null) {
      DateFilter[] TaxRateActiveDtFilters = new DateFilter[TaxRateActiveDtFilter.length];
      for (int i = 0; i < TaxRateActiveDtFilters.length; i++) {
        TaxRateActiveDtFilters[i] = (DateFilter)TaxRateActiveDtFilter[i];
      }
      try {
        out.setTaxRateActiveDtFilter(TaxRateActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxRateInactiveDtMap = (Map)record.get("TaxRateInactiveDt");
    Boolean TaxRateInactiveDtFetch = DataHelper.getFetch(TaxRateInactiveDtMap);
    Boolean TaxRateInactiveDtSortDir = DataHelper.getSortDirection(TaxRateInactiveDtMap);
    Integer TaxRateInactiveDtSortOrder = DataHelper.getSortOrder(TaxRateInactiveDtMap);
    if (TaxRateInactiveDtFetch != null) out.setTaxRateInactiveDtFetch(TaxRateInactiveDtFetch);
    if (TaxRateInactiveDtSortDir != null) out.setTaxRateInactiveDtSortDirection(TaxRateInactiveDtSortDir);
    if (TaxRateInactiveDtSortOrder != null) out.setTaxRateInactiveDtSortOrder(TaxRateInactiveDtSortOrder);

    Filter[] TaxRateInactiveDtFilter = DataHelper.mapToFilterArray(TaxRateInactiveDtMap, Date.class);
    if (TaxRateInactiveDtFilter != null) {
      DateFilter[] TaxRateInactiveDtFilters = new DateFilter[TaxRateInactiveDtFilter.length];
      for (int i = 0; i < TaxRateInactiveDtFilters.length; i++) {
        TaxRateInactiveDtFilters[i] = (DateFilter)TaxRateInactiveDtFilter[i];
      }
      try {
        out.setTaxRateInactiveDtFilter(TaxRateInactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TimezoneMap = (Map)record.get("Timezone");
    Boolean TimezoneFetch = DataHelper.getFetch(TimezoneMap);
    Boolean TimezoneSortDir = DataHelper.getSortDirection(TimezoneMap);
    Integer TimezoneSortOrder = DataHelper.getSortOrder(TimezoneMap);
    if (TimezoneFetch != null) out.setTimezoneFetch(TimezoneFetch);
    if (TimezoneSortDir != null) out.setTimezoneSortDirection(TimezoneSortDir);
    if (TimezoneSortOrder != null) out.setTimezoneSortOrder(TimezoneSortOrder);

    Filter[] TimezoneFilter = DataHelper.mapToFilterArray(TimezoneMap, Integer.class);
    if (TimezoneFilter != null) {
      IntegerFilter[] TimezoneFilters = new IntegerFilter[TimezoneFilter.length];
      for (int i = 0; i < TimezoneFilters.length; i++) {
        TimezoneFilters[i] = (IntegerFilter)TimezoneFilter[i];
      }
      try {
        out.setTimezoneFilter(TimezoneFilters);
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
  
    Map SecondUnitsMap = (Map)record.get("SecondUnits");
    Boolean SecondUnitsFetch = DataHelper.getFetch(SecondUnitsMap);
    Boolean SecondUnitsSortDir = DataHelper.getSortDirection(SecondUnitsMap);
    Integer SecondUnitsSortOrder = DataHelper.getSortOrder(SecondUnitsMap);
    if (SecondUnitsFetch != null) out.setSecondUnitsFetch(SecondUnitsFetch);
    if (SecondUnitsSortDir != null) out.setSecondUnitsSortDirection(SecondUnitsSortDir);
    if (SecondUnitsSortOrder != null) out.setSecondUnitsSortOrder(SecondUnitsSortOrder);

    Filter[] SecondUnitsFilter = DataHelper.mapToFilterArray(SecondUnitsMap, BigInteger.class);
    if (SecondUnitsFilter != null) {
      BigIntegerFilter[] SecondUnitsFilters = new BigIntegerFilter[SecondUnitsFilter.length];
      for (int i = 0; i < SecondUnitsFilters.length; i++) {
        SecondUnitsFilters[i] = (BigIntegerFilter)SecondUnitsFilter[i];
      }
      try {
        out.setSecondUnitsFilter(SecondUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ThirdUnitsMap = (Map)record.get("ThirdUnits");
    Boolean ThirdUnitsFetch = DataHelper.getFetch(ThirdUnitsMap);
    Boolean ThirdUnitsSortDir = DataHelper.getSortDirection(ThirdUnitsMap);
    Integer ThirdUnitsSortOrder = DataHelper.getSortOrder(ThirdUnitsMap);
    if (ThirdUnitsFetch != null) out.setThirdUnitsFetch(ThirdUnitsFetch);
    if (ThirdUnitsSortDir != null) out.setThirdUnitsSortDirection(ThirdUnitsSortDir);
    if (ThirdUnitsSortOrder != null) out.setThirdUnitsSortOrder(ThirdUnitsSortOrder);

    Filter[] ThirdUnitsFilter = DataHelper.mapToFilterArray(ThirdUnitsMap, BigInteger.class);
    if (ThirdUnitsFilter != null) {
      BigIntegerFilter[] ThirdUnitsFilters = new BigIntegerFilter[ThirdUnitsFilter.length];
      for (int i = 0; i < ThirdUnitsFilters.length; i++) {
        ThirdUnitsFilters[i] = (BigIntegerFilter)ThirdUnitsFilter[i];
      }
      try {
        out.setThirdUnitsFilter(ThirdUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsCurrencyCodeMap = (Map)record.get("UnitsCurrencyCode");
    Boolean UnitsCurrencyCodeFetch = DataHelper.getFetch(UnitsCurrencyCodeMap);
    Boolean UnitsCurrencyCodeSortDir = DataHelper.getSortDirection(UnitsCurrencyCodeMap);
    Integer UnitsCurrencyCodeSortOrder = DataHelper.getSortOrder(UnitsCurrencyCodeMap);
    if (UnitsCurrencyCodeFetch != null) out.setUnitsCurrencyCodeFetch(UnitsCurrencyCodeFetch);
    if (UnitsCurrencyCodeSortDir != null) out.setUnitsCurrencyCodeSortDirection(UnitsCurrencyCodeSortDir);
    if (UnitsCurrencyCodeSortOrder != null) out.setUnitsCurrencyCodeSortOrder(UnitsCurrencyCodeSortOrder);

    Filter[] UnitsCurrencyCodeFilter = DataHelper.mapToFilterArray(UnitsCurrencyCodeMap, Integer.class);
    if (UnitsCurrencyCodeFilter != null) {
      IntegerFilter[] UnitsCurrencyCodeFilters = new IntegerFilter[UnitsCurrencyCodeFilter.length];
      for (int i = 0; i < UnitsCurrencyCodeFilters.length; i++) {
        UnitsCurrencyCodeFilters[i] = (IntegerFilter)UnitsCurrencyCodeFilter[i];
      }
      try {
        out.setUnitsCurrencyCodeFilter(UnitsCurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingUnitsTypeMap = (Map)record.get("BillingUnitsType");
    Boolean BillingUnitsTypeFetch = DataHelper.getFetch(BillingUnitsTypeMap);
    Boolean BillingUnitsTypeSortDir = DataHelper.getSortDirection(BillingUnitsTypeMap);
    Integer BillingUnitsTypeSortOrder = DataHelper.getSortOrder(BillingUnitsTypeMap);
    if (BillingUnitsTypeFetch != null) out.setBillingUnitsTypeFetch(BillingUnitsTypeFetch);
    if (BillingUnitsTypeSortDir != null) out.setBillingUnitsTypeSortDirection(BillingUnitsTypeSortDir);
    if (BillingUnitsTypeSortOrder != null) out.setBillingUnitsTypeSortOrder(BillingUnitsTypeSortOrder);

    Filter[] BillingUnitsTypeFilter = DataHelper.mapToFilterArray(BillingUnitsTypeMap, Integer.class);
    if (BillingUnitsTypeFilter != null) {
      IntegerFilter[] BillingUnitsTypeFilters = new IntegerFilter[BillingUnitsTypeFilter.length];
      for (int i = 0; i < BillingUnitsTypeFilters.length; i++) {
        BillingUnitsTypeFilters[i] = (IntegerFilter)BillingUnitsTypeFilter[i];
      }
      try {
        out.setBillingUnitsTypeFilter(BillingUnitsTypeFilters);
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
  
    Map CustomerTagMap = (Map)record.get("CustomerTag");
    Boolean CustomerTagFetch = DataHelper.getFetch(CustomerTagMap);
    Boolean CustomerTagSortDir = DataHelper.getSortDirection(CustomerTagMap);
    Integer CustomerTagSortOrder = DataHelper.getSortOrder(CustomerTagMap);
    if (CustomerTagFetch != null) out.setCustomerTagFetch(CustomerTagFetch);
    if (CustomerTagSortDir != null) out.setCustomerTagSortDirection(CustomerTagSortDir);
    if (CustomerTagSortOrder != null) out.setCustomerTagSortOrder(CustomerTagSortOrder);

    Filter[] CustomerTagFilter = DataHelper.mapToFilterArray(CustomerTagMap, String.class);
    if (CustomerTagFilter != null) {
      StringFilter[] CustomerTagFilters = new StringFilter[CustomerTagFilter.length];
      for (int i = 0; i < CustomerTagFilters.length; i++) {
        CustomerTagFilters[i] = (StringFilter)CustomerTagFilter[i];
      }
      try {
        out.setCustomerTagFilter(CustomerTagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatedUnitsMap = (Map)record.get("RatedUnits");
    Boolean RatedUnitsFetch = DataHelper.getFetch(RatedUnitsMap);
    Boolean RatedUnitsSortDir = DataHelper.getSortDirection(RatedUnitsMap);
    Integer RatedUnitsSortOrder = DataHelper.getSortOrder(RatedUnitsMap);
    if (RatedUnitsFetch != null) out.setRatedUnitsFetch(RatedUnitsFetch);
    if (RatedUnitsSortDir != null) out.setRatedUnitsSortDirection(RatedUnitsSortDir);
    if (RatedUnitsSortOrder != null) out.setRatedUnitsSortOrder(RatedUnitsSortOrder);

    Filter[] RatedUnitsFilter = DataHelper.mapToFilterArray(RatedUnitsMap, BigInteger.class);
    if (RatedUnitsFilter != null) {
      BigIntegerFilter[] RatedUnitsFilters = new BigIntegerFilter[RatedUnitsFilter.length];
      for (int i = 0; i < RatedUnitsFilters.length; i++) {
        RatedUnitsFilters[i] = (BigIntegerFilter)RatedUnitsFilter[i];
      }
      try {
        out.setRatedUnitsFilter(RatedUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountMap = (Map)record.get("Amount");
    Boolean AmountFetch = DataHelper.getFetch(AmountMap);
    Boolean AmountSortDir = DataHelper.getSortDirection(AmountMap);
    Integer AmountSortOrder = DataHelper.getSortOrder(AmountMap);
    if (AmountFetch != null) out.setAmountFetch(AmountFetch);
    if (AmountSortDir != null) out.setAmountSortDirection(AmountSortDir);
    if (AmountSortOrder != null) out.setAmountSortOrder(AmountSortOrder);

    Filter[] AmountFilter = DataHelper.mapToFilterArray(AmountMap, BigInteger.class);
    if (AmountFilter != null) {
      BigIntegerFilter[] AmountFilters = new BigIntegerFilter[AmountFilter.length];
      for (int i = 0; i < AmountFilters.length; i++) {
        AmountFilters[i] = (BigIntegerFilter)AmountFilter[i];
      }
      try {
        out.setAmountFilter(AmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ForeignAmountMap = (Map)record.get("ForeignAmount");
    Boolean ForeignAmountFetch = DataHelper.getFetch(ForeignAmountMap);
    Boolean ForeignAmountSortDir = DataHelper.getSortDirection(ForeignAmountMap);
    Integer ForeignAmountSortOrder = DataHelper.getSortOrder(ForeignAmountMap);
    if (ForeignAmountFetch != null) out.setForeignAmountFetch(ForeignAmountFetch);
    if (ForeignAmountSortDir != null) out.setForeignAmountSortDirection(ForeignAmountSortDir);
    if (ForeignAmountSortOrder != null) out.setForeignAmountSortOrder(ForeignAmountSortOrder);

    Filter[] ForeignAmountFilter = DataHelper.mapToFilterArray(ForeignAmountMap, BigInteger.class);
    if (ForeignAmountFilter != null) {
      BigIntegerFilter[] ForeignAmountFilters = new BigIntegerFilter[ForeignAmountFilter.length];
      for (int i = 0; i < ForeignAmountFilters.length; i++) {
        ForeignAmountFilters[i] = (BigIntegerFilter)ForeignAmountFilter[i];
      }
      try {
        out.setForeignAmountFilter(ForeignAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatePeriodMap = (Map)record.get("RatePeriod");
    Boolean RatePeriodFetch = DataHelper.getFetch(RatePeriodMap);
    Boolean RatePeriodSortDir = DataHelper.getSortDirection(RatePeriodMap);
    Integer RatePeriodSortOrder = DataHelper.getSortOrder(RatePeriodMap);
    if (RatePeriodFetch != null) out.setRatePeriodFetch(RatePeriodFetch);
    if (RatePeriodSortDir != null) out.setRatePeriodSortDirection(RatePeriodSortDir);
    if (RatePeriodSortOrder != null) out.setRatePeriodSortOrder(RatePeriodSortOrder);

    Filter[] RatePeriodFilter = DataHelper.mapToFilterArray(RatePeriodMap, String.class);
    if (RatePeriodFilter != null) {
      StringFilter[] RatePeriodFilters = new StringFilter[RatePeriodFilter.length];
      for (int i = 0; i < RatePeriodFilters.length; i++) {
        RatePeriodFilters[i] = (StringFilter)RatePeriodFilter[i];
      }
      try {
        out.setRatePeriodFilter(RatePeriodFilters);
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
  
    Map CompStatusMap = (Map)record.get("CompStatus");
    Boolean CompStatusFetch = DataHelper.getFetch(CompStatusMap);
    Boolean CompStatusSortDir = DataHelper.getSortDirection(CompStatusMap);
    Integer CompStatusSortOrder = DataHelper.getSortOrder(CompStatusMap);
    if (CompStatusFetch != null) out.setCompStatusFetch(CompStatusFetch);
    if (CompStatusSortDir != null) out.setCompStatusSortDirection(CompStatusSortDir);
    if (CompStatusSortOrder != null) out.setCompStatusSortOrder(CompStatusSortOrder);

    Filter[] CompStatusFilter = DataHelper.mapToFilterArray(CompStatusMap, Integer.class);
    if (CompStatusFilter != null) {
      IntegerFilter[] CompStatusFilters = new IntegerFilter[CompStatusFilter.length];
      for (int i = 0; i < CompStatusFilters.length; i++) {
        CompStatusFilters[i] = (IntegerFilter)CompStatusFilter[i];
      }
      try {
        out.setCompStatusFilter(CompStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CdrStatusMap = (Map)record.get("CdrStatus");
    Boolean CdrStatusFetch = DataHelper.getFetch(CdrStatusMap);
    Boolean CdrStatusSortDir = DataHelper.getSortDirection(CdrStatusMap);
    Integer CdrStatusSortOrder = DataHelper.getSortOrder(CdrStatusMap);
    if (CdrStatusFetch != null) out.setCdrStatusFetch(CdrStatusFetch);
    if (CdrStatusSortDir != null) out.setCdrStatusSortDirection(CdrStatusSortDir);
    if (CdrStatusSortOrder != null) out.setCdrStatusSortOrder(CdrStatusSortOrder);

    Filter[] CdrStatusFilter = DataHelper.mapToFilterArray(CdrStatusMap, Integer.class);
    if (CdrStatusFilter != null) {
      IntegerFilter[] CdrStatusFilters = new IntegerFilter[CdrStatusFilter.length];
      for (int i = 0; i < CdrStatusFilters.length; i++) {
        CdrStatusFilters[i] = (IntegerFilter)CdrStatusFilter[i];
      }
      try {
        out.setCdrStatusFilter(CdrStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileIdMap = (Map)record.get("FileId");
    Boolean FileIdFetch = DataHelper.getFetch(FileIdMap);
    Boolean FileIdSortDir = DataHelper.getSortDirection(FileIdMap);
    Integer FileIdSortOrder = DataHelper.getSortOrder(FileIdMap);
    if (FileIdFetch != null) out.setFileIdFetch(FileIdFetch);
    if (FileIdSortDir != null) out.setFileIdSortDirection(FileIdSortDir);
    if (FileIdSortOrder != null) out.setFileIdSortOrder(FileIdSortOrder);

    Filter[] FileIdFilter = DataHelper.mapToFilterArray(FileIdMap, Integer.class);
    if (FileIdFilter != null) {
      IntegerFilter[] FileIdFilters = new IntegerFilter[FileIdFilter.length];
      for (int i = 0; i < FileIdFilters.length; i++) {
        FileIdFilters[i] = (IntegerFilter)FileIdFilter[i];
      }
      try {
        out.setFileIdFilter(FileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileIdServMap = (Map)record.get("FileIdServ");
    Boolean FileIdServFetch = DataHelper.getFetch(FileIdServMap);
    Boolean FileIdServSortDir = DataHelper.getSortDirection(FileIdServMap);
    Integer FileIdServSortOrder = DataHelper.getSortOrder(FileIdServMap);
    if (FileIdServFetch != null) out.setFileIdServFetch(FileIdServFetch);
    if (FileIdServSortDir != null) out.setFileIdServSortDirection(FileIdServSortDir);
    if (FileIdServSortOrder != null) out.setFileIdServSortOrder(FileIdServSortOrder);

    Filter[] FileIdServFilter = DataHelper.mapToFilterArray(FileIdServMap, Integer.class);
    if (FileIdServFilter != null) {
      IntegerFilter[] FileIdServFilters = new IntegerFilter[FileIdServFilter.length];
      for (int i = 0; i < FileIdServFilters.length; i++) {
        FileIdServFilters[i] = (IntegerFilter)FileIdServFilter[i];
      }
      try {
        out.setFileIdServFilter(FileIdServFilters);
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
  
    Map UnroundedAmountMap = (Map)record.get("UnroundedAmount");
    Boolean UnroundedAmountFetch = DataHelper.getFetch(UnroundedAmountMap);
    Boolean UnroundedAmountSortDir = DataHelper.getSortDirection(UnroundedAmountMap);
    Integer UnroundedAmountSortOrder = DataHelper.getSortOrder(UnroundedAmountMap);
    if (UnroundedAmountFetch != null) out.setUnroundedAmountFetch(UnroundedAmountFetch);
    if (UnroundedAmountSortDir != null) out.setUnroundedAmountSortDirection(UnroundedAmountSortDir);
    if (UnroundedAmountSortOrder != null) out.setUnroundedAmountSortOrder(UnroundedAmountSortOrder);

    Filter[] UnroundedAmountFilter = DataHelper.mapToFilterArray(UnroundedAmountMap, BigInteger.class);
    if (UnroundedAmountFilter != null) {
      BigIntegerFilter[] UnroundedAmountFilters = new BigIntegerFilter[UnroundedAmountFilter.length];
      for (int i = 0; i < UnroundedAmountFilters.length; i++) {
        UnroundedAmountFilters[i] = (BigIntegerFilter)UnroundedAmountFilter[i];
      }
      try {
        out.setUnroundedAmountFilter(UnroundedAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CorridorPlanIdMap = (Map)record.get("CorridorPlanId");
    Boolean CorridorPlanIdFetch = DataHelper.getFetch(CorridorPlanIdMap);
    Boolean CorridorPlanIdSortDir = DataHelper.getSortDirection(CorridorPlanIdMap);
    Integer CorridorPlanIdSortOrder = DataHelper.getSortOrder(CorridorPlanIdMap);
    if (CorridorPlanIdFetch != null) out.setCorridorPlanIdFetch(CorridorPlanIdFetch);
    if (CorridorPlanIdSortDir != null) out.setCorridorPlanIdSortDirection(CorridorPlanIdSortDir);
    if (CorridorPlanIdSortOrder != null) out.setCorridorPlanIdSortOrder(CorridorPlanIdSortOrder);

    Filter[] CorridorPlanIdFilter = DataHelper.mapToFilterArray(CorridorPlanIdMap, Integer.class);
    if (CorridorPlanIdFilter != null) {
      IntegerFilter[] CorridorPlanIdFilters = new IntegerFilter[CorridorPlanIdFilter.length];
      for (int i = 0; i < CorridorPlanIdFilters.length; i++) {
        CorridorPlanIdFilters[i] = (IntegerFilter)CorridorPlanIdFilter[i];
      }
      try {
        out.setCorridorPlanIdFilter(CorridorPlanIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CellIdOriginMap = (Map)record.get("CellIdOrigin");
    Boolean CellIdOriginFetch = DataHelper.getFetch(CellIdOriginMap);
    Boolean CellIdOriginSortDir = DataHelper.getSortDirection(CellIdOriginMap);
    Integer CellIdOriginSortOrder = DataHelper.getSortOrder(CellIdOriginMap);
    if (CellIdOriginFetch != null) out.setCellIdOriginFetch(CellIdOriginFetch);
    if (CellIdOriginSortDir != null) out.setCellIdOriginSortDirection(CellIdOriginSortDir);
    if (CellIdOriginSortOrder != null) out.setCellIdOriginSortOrder(CellIdOriginSortOrder);

    Filter[] CellIdOriginFilter = DataHelper.mapToFilterArray(CellIdOriginMap, Integer.class);
    if (CellIdOriginFilter != null) {
      IntegerFilter[] CellIdOriginFilters = new IntegerFilter[CellIdOriginFilter.length];
      for (int i = 0; i < CellIdOriginFilters.length; i++) {
        CellIdOriginFilters[i] = (IntegerFilter)CellIdOriginFilter[i];
      }
      try {
        out.setCellIdOriginFilter(CellIdOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTypeIdUsgMap = (Map)record.get("OrigTypeIdUsg");
    Boolean OrigTypeIdUsgFetch = DataHelper.getFetch(OrigTypeIdUsgMap);
    Boolean OrigTypeIdUsgSortDir = DataHelper.getSortDirection(OrigTypeIdUsgMap);
    Integer OrigTypeIdUsgSortOrder = DataHelper.getSortOrder(OrigTypeIdUsgMap);
    if (OrigTypeIdUsgFetch != null) out.setOrigTypeIdUsgFetch(OrigTypeIdUsgFetch);
    if (OrigTypeIdUsgSortDir != null) out.setOrigTypeIdUsgSortDirection(OrigTypeIdUsgSortDir);
    if (OrigTypeIdUsgSortOrder != null) out.setOrigTypeIdUsgSortOrder(OrigTypeIdUsgSortOrder);

    Filter[] OrigTypeIdUsgFilter = DataHelper.mapToFilterArray(OrigTypeIdUsgMap, Integer.class);
    if (OrigTypeIdUsgFilter != null) {
      IntegerFilter[] OrigTypeIdUsgFilters = new IntegerFilter[OrigTypeIdUsgFilter.length];
      for (int i = 0; i < OrigTypeIdUsgFilters.length; i++) {
        OrigTypeIdUsgFilters[i] = (IntegerFilter)OrigTypeIdUsgFilter[i];
      }
      try {
        out.setOrigTypeIdUsgFilter(OrigTypeIdUsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccessRegionOriginMap = (Map)record.get("AccessRegionOrigin");
    Boolean AccessRegionOriginFetch = DataHelper.getFetch(AccessRegionOriginMap);
    Boolean AccessRegionOriginSortDir = DataHelper.getSortDirection(AccessRegionOriginMap);
    Integer AccessRegionOriginSortOrder = DataHelper.getSortOrder(AccessRegionOriginMap);
    if (AccessRegionOriginFetch != null) out.setAccessRegionOriginFetch(AccessRegionOriginFetch);
    if (AccessRegionOriginSortDir != null) out.setAccessRegionOriginSortDirection(AccessRegionOriginSortDir);
    if (AccessRegionOriginSortOrder != null) out.setAccessRegionOriginSortOrder(AccessRegionOriginSortOrder);

    Filter[] AccessRegionOriginFilter = DataHelper.mapToFilterArray(AccessRegionOriginMap, String.class);
    if (AccessRegionOriginFilter != null) {
      StringFilter[] AccessRegionOriginFilters = new StringFilter[AccessRegionOriginFilter.length];
      for (int i = 0; i < AccessRegionOriginFilters.length; i++) {
        AccessRegionOriginFilters[i] = (StringFilter)AccessRegionOriginFilter[i];
      }
      try {
        out.setAccessRegionOriginFilter(AccessRegionOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccessRegionTargetMap = (Map)record.get("AccessRegionTarget");
    Boolean AccessRegionTargetFetch = DataHelper.getFetch(AccessRegionTargetMap);
    Boolean AccessRegionTargetSortDir = DataHelper.getSortDirection(AccessRegionTargetMap);
    Integer AccessRegionTargetSortOrder = DataHelper.getSortOrder(AccessRegionTargetMap);
    if (AccessRegionTargetFetch != null) out.setAccessRegionTargetFetch(AccessRegionTargetFetch);
    if (AccessRegionTargetSortDir != null) out.setAccessRegionTargetSortDirection(AccessRegionTargetSortDir);
    if (AccessRegionTargetSortOrder != null) out.setAccessRegionTargetSortOrder(AccessRegionTargetSortOrder);

    Filter[] AccessRegionTargetFilter = DataHelper.mapToFilterArray(AccessRegionTargetMap, String.class);
    if (AccessRegionTargetFilter != null) {
      StringFilter[] AccessRegionTargetFilters = new StringFilter[AccessRegionTargetFilter.length];
      for (int i = 0; i < AccessRegionTargetFilters.length; i++) {
        AccessRegionTargetFilters[i] = (StringFilter)AccessRegionTargetFilter[i];
      }
      try {
        out.setAccessRegionTargetFilter(AccessRegionTargetFilters);
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
  
    Map NumRecordsMap = (Map)record.get("NumRecords");
    Boolean NumRecordsFetch = DataHelper.getFetch(NumRecordsMap);
    Boolean NumRecordsSortDir = DataHelper.getSortDirection(NumRecordsMap);
    Integer NumRecordsSortOrder = DataHelper.getSortOrder(NumRecordsMap);
    if (NumRecordsFetch != null) out.setNumRecordsFetch(NumRecordsFetch);
    if (NumRecordsSortDir != null) out.setNumRecordsSortDirection(NumRecordsSortDir);
    if (NumRecordsSortOrder != null) out.setNumRecordsSortOrder(NumRecordsSortOrder);

    Filter[] NumRecordsFilter = DataHelper.mapToFilterArray(NumRecordsMap, Integer.class);
    if (NumRecordsFilter != null) {
      IntegerFilter[] NumRecordsFilters = new IntegerFilter[NumRecordsFilter.length];
      for (int i = 0; i < NumRecordsFilters.length; i++) {
        NumRecordsFilters[i] = (IntegerFilter)NumRecordsFilter[i];
      }
      try {
        out.setNumRecordsFilter(NumRecordsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountReductionMap = (Map)record.get("AmountReduction");
    Boolean AmountReductionFetch = DataHelper.getFetch(AmountReductionMap);
    Boolean AmountReductionSortDir = DataHelper.getSortDirection(AmountReductionMap);
    Integer AmountReductionSortOrder = DataHelper.getSortOrder(AmountReductionMap);
    if (AmountReductionFetch != null) out.setAmountReductionFetch(AmountReductionFetch);
    if (AmountReductionSortDir != null) out.setAmountReductionSortDirection(AmountReductionSortDir);
    if (AmountReductionSortOrder != null) out.setAmountReductionSortOrder(AmountReductionSortOrder);

    Filter[] AmountReductionFilter = DataHelper.mapToFilterArray(AmountReductionMap, BigInteger.class);
    if (AmountReductionFilter != null) {
      BigIntegerFilter[] AmountReductionFilters = new BigIntegerFilter[AmountReductionFilter.length];
      for (int i = 0; i < AmountReductionFilters.length; i++) {
        AmountReductionFilters[i] = (BigIntegerFilter)AmountReductionFilter[i];
      }
      try {
        out.setAmountReductionFilter(AmountReductionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountReductionIdMap = (Map)record.get("AmountReductionId");
    Boolean AmountReductionIdFetch = DataHelper.getFetch(AmountReductionIdMap);
    Boolean AmountReductionIdSortDir = DataHelper.getSortDirection(AmountReductionIdMap);
    Integer AmountReductionIdSortOrder = DataHelper.getSortOrder(AmountReductionIdMap);
    if (AmountReductionIdFetch != null) out.setAmountReductionIdFetch(AmountReductionIdFetch);
    if (AmountReductionIdSortDir != null) out.setAmountReductionIdSortDirection(AmountReductionIdSortDir);
    if (AmountReductionIdSortOrder != null) out.setAmountReductionIdSortOrder(AmountReductionIdSortOrder);

    Filter[] AmountReductionIdFilter = DataHelper.mapToFilterArray(AmountReductionIdMap, Integer.class);
    if (AmountReductionIdFilter != null) {
      IntegerFilter[] AmountReductionIdFilters = new IntegerFilter[AmountReductionIdFilter.length];
      for (int i = 0; i < AmountReductionIdFilters.length; i++) {
        AmountReductionIdFilters[i] = (IntegerFilter)AmountReductionIdFilter[i];
      }
      try {
        out.setAmountReductionIdFilter(AmountReductionIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SeqnumRateUsageMap = (Map)record.get("SeqnumRateUsage");
    Boolean SeqnumRateUsageFetch = DataHelper.getFetch(SeqnumRateUsageMap);
    Boolean SeqnumRateUsageSortDir = DataHelper.getSortDirection(SeqnumRateUsageMap);
    Integer SeqnumRateUsageSortOrder = DataHelper.getSortOrder(SeqnumRateUsageMap);
    if (SeqnumRateUsageFetch != null) out.setSeqnumRateUsageFetch(SeqnumRateUsageFetch);
    if (SeqnumRateUsageSortDir != null) out.setSeqnumRateUsageSortDirection(SeqnumRateUsageSortDir);
    if (SeqnumRateUsageSortOrder != null) out.setSeqnumRateUsageSortOrder(SeqnumRateUsageSortOrder);

    Filter[] SeqnumRateUsageFilter = DataHelper.mapToFilterArray(SeqnumRateUsageMap, Integer.class);
    if (SeqnumRateUsageFilter != null) {
      IntegerFilter[] SeqnumRateUsageFilters = new IntegerFilter[SeqnumRateUsageFilter.length];
      for (int i = 0; i < SeqnumRateUsageFilters.length; i++) {
        SeqnumRateUsageFilters[i] = (IntegerFilter)SeqnumRateUsageFilter[i];
      }
      try {
        out.setSeqnumRateUsageFilter(SeqnumRateUsageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SeqnumRateUsageOverridesMap = (Map)record.get("SeqnumRateUsageOverrides");
    Boolean SeqnumRateUsageOverridesFetch = DataHelper.getFetch(SeqnumRateUsageOverridesMap);
    Boolean SeqnumRateUsageOverridesSortDir = DataHelper.getSortDirection(SeqnumRateUsageOverridesMap);
    Integer SeqnumRateUsageOverridesSortOrder = DataHelper.getSortOrder(SeqnumRateUsageOverridesMap);
    if (SeqnumRateUsageOverridesFetch != null) out.setSeqnumRateUsageOverridesFetch(SeqnumRateUsageOverridesFetch);
    if (SeqnumRateUsageOverridesSortDir != null) out.setSeqnumRateUsageOverridesSortDirection(SeqnumRateUsageOverridesSortDir);
    if (SeqnumRateUsageOverridesSortOrder != null) out.setSeqnumRateUsageOverridesSortOrder(SeqnumRateUsageOverridesSortOrder);

    Filter[] SeqnumRateUsageOverridesFilter = DataHelper.mapToFilterArray(SeqnumRateUsageOverridesMap, Integer.class);
    if (SeqnumRateUsageOverridesFilter != null) {
      IntegerFilter[] SeqnumRateUsageOverridesFilters = new IntegerFilter[SeqnumRateUsageOverridesFilter.length];
      for (int i = 0; i < SeqnumRateUsageOverridesFilters.length; i++) {
        SeqnumRateUsageOverridesFilters[i] = (IntegerFilter)SeqnumRateUsageOverridesFilter[i];
      }
      try {
        out.setSeqnumRateUsageOverridesFilter(SeqnumRateUsageOverridesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RawUnitsMap = (Map)record.get("RawUnits");
    Boolean RawUnitsFetch = DataHelper.getFetch(RawUnitsMap);
    Boolean RawUnitsSortDir = DataHelper.getSortDirection(RawUnitsMap);
    Integer RawUnitsSortOrder = DataHelper.getSortOrder(RawUnitsMap);
    if (RawUnitsFetch != null) out.setRawUnitsFetch(RawUnitsFetch);
    if (RawUnitsSortDir != null) out.setRawUnitsSortDirection(RawUnitsSortDir);
    if (RawUnitsSortOrder != null) out.setRawUnitsSortOrder(RawUnitsSortOrder);

    Filter[] RawUnitsFilter = DataHelper.mapToFilterArray(RawUnitsMap, BigInteger.class);
    if (RawUnitsFilter != null) {
      BigIntegerFilter[] RawUnitsFilters = new BigIntegerFilter[RawUnitsFilter.length];
      for (int i = 0; i < RawUnitsFilters.length; i++) {
        RawUnitsFilters[i] = (BigIntegerFilter)RawUnitsFilter[i];
      }
      try {
        out.setRawUnitsFilter(RawUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RawUnitsRoundedMap = (Map)record.get("RawUnitsRounded");
    Boolean RawUnitsRoundedFetch = DataHelper.getFetch(RawUnitsRoundedMap);
    Boolean RawUnitsRoundedSortDir = DataHelper.getSortDirection(RawUnitsRoundedMap);
    Integer RawUnitsRoundedSortOrder = DataHelper.getSortOrder(RawUnitsRoundedMap);
    if (RawUnitsRoundedFetch != null) out.setRawUnitsRoundedFetch(RawUnitsRoundedFetch);
    if (RawUnitsRoundedSortDir != null) out.setRawUnitsRoundedSortDirection(RawUnitsRoundedSortDir);
    if (RawUnitsRoundedSortOrder != null) out.setRawUnitsRoundedSortOrder(RawUnitsRoundedSortOrder);

    Filter[] RawUnitsRoundedFilter = DataHelper.mapToFilterArray(RawUnitsRoundedMap, BigInteger.class);
    if (RawUnitsRoundedFilter != null) {
      BigIntegerFilter[] RawUnitsRoundedFilters = new BigIntegerFilter[RawUnitsRoundedFilter.length];
      for (int i = 0; i < RawUnitsRoundedFilters.length; i++) {
        RawUnitsRoundedFilters[i] = (BigIntegerFilter)RawUnitsRoundedFilter[i];
      }
      try {
        out.setRawUnitsRoundedFilter(RawUnitsRoundedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AggrUsageIdMap = (Map)record.get("AggrUsageId");
    Boolean AggrUsageIdFetch = DataHelper.getFetch(AggrUsageIdMap);
    Boolean AggrUsageIdSortDir = DataHelper.getSortDirection(AggrUsageIdMap);
    Integer AggrUsageIdSortOrder = DataHelper.getSortOrder(AggrUsageIdMap);
    if (AggrUsageIdFetch != null) out.setAggrUsageIdFetch(AggrUsageIdFetch);
    if (AggrUsageIdSortDir != null) out.setAggrUsageIdSortDirection(AggrUsageIdSortDir);
    if (AggrUsageIdSortOrder != null) out.setAggrUsageIdSortOrder(AggrUsageIdSortOrder);

    Filter[] AggrUsageIdFilter = DataHelper.mapToFilterArray(AggrUsageIdMap, Integer.class);
    if (AggrUsageIdFilter != null) {
      IntegerFilter[] AggrUsageIdFilters = new IntegerFilter[AggrUsageIdFilter.length];
      for (int i = 0; i < AggrUsageIdFilters.length; i++) {
        AggrUsageIdFilters[i] = (IntegerFilter)AggrUsageIdFilter[i];
      }
      try {
        out.setAggrUsageIdFilter(AggrUsageIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ZoneClassMap = (Map)record.get("ZoneClass");
    Boolean ZoneClassFetch = DataHelper.getFetch(ZoneClassMap);
    Boolean ZoneClassSortDir = DataHelper.getSortDirection(ZoneClassMap);
    Integer ZoneClassSortOrder = DataHelper.getSortOrder(ZoneClassMap);
    if (ZoneClassFetch != null) out.setZoneClassFetch(ZoneClassFetch);
    if (ZoneClassSortDir != null) out.setZoneClassSortDirection(ZoneClassSortDir);
    if (ZoneClassSortOrder != null) out.setZoneClassSortOrder(ZoneClassSortOrder);

    Filter[] ZoneClassFilter = DataHelper.mapToFilterArray(ZoneClassMap, Integer.class);
    if (ZoneClassFilter != null) {
      IntegerFilter[] ZoneClassFilters = new IntegerFilter[ZoneClassFilter.length];
      for (int i = 0; i < ZoneClassFilters.length; i++) {
        ZoneClassFilters[i] = (IntegerFilter)ZoneClassFilter[i];
      }
      try {
        out.setZoneClassFilter(ZoneClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointClassOriginMap = (Map)record.get("PointClassOrigin");
    Boolean PointClassOriginFetch = DataHelper.getFetch(PointClassOriginMap);
    Boolean PointClassOriginSortDir = DataHelper.getSortDirection(PointClassOriginMap);
    Integer PointClassOriginSortOrder = DataHelper.getSortOrder(PointClassOriginMap);
    if (PointClassOriginFetch != null) out.setPointClassOriginFetch(PointClassOriginFetch);
    if (PointClassOriginSortDir != null) out.setPointClassOriginSortDirection(PointClassOriginSortDir);
    if (PointClassOriginSortOrder != null) out.setPointClassOriginSortOrder(PointClassOriginSortOrder);

    Filter[] PointClassOriginFilter = DataHelper.mapToFilterArray(PointClassOriginMap, Integer.class);
    if (PointClassOriginFilter != null) {
      IntegerFilter[] PointClassOriginFilters = new IntegerFilter[PointClassOriginFilter.length];
      for (int i = 0; i < PointClassOriginFilters.length; i++) {
        PointClassOriginFilters[i] = (IntegerFilter)PointClassOriginFilter[i];
      }
      try {
        out.setPointClassOriginFilter(PointClassOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointClassTargetMap = (Map)record.get("PointClassTarget");
    Boolean PointClassTargetFetch = DataHelper.getFetch(PointClassTargetMap);
    Boolean PointClassTargetSortDir = DataHelper.getSortDirection(PointClassTargetMap);
    Integer PointClassTargetSortOrder = DataHelper.getSortOrder(PointClassTargetMap);
    if (PointClassTargetFetch != null) out.setPointClassTargetFetch(PointClassTargetFetch);
    if (PointClassTargetSortDir != null) out.setPointClassTargetSortDirection(PointClassTargetSortDir);
    if (PointClassTargetSortOrder != null) out.setPointClassTargetSortOrder(PointClassTargetSortOrder);

    Filter[] PointClassTargetFilter = DataHelper.mapToFilterArray(PointClassTargetMap, Integer.class);
    if (PointClassTargetFilter != null) {
      IntegerFilter[] PointClassTargetFilters = new IntegerFilter[PointClassTargetFilter.length];
      for (int i = 0; i < PointClassTargetFilters.length; i++) {
        PointClassTargetFilters[i] = (IntegerFilter)PointClassTargetFilter[i];
      }
      try {
        out.setPointClassTargetFilter(PointClassTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EquipClassCodeMap = (Map)record.get("EquipClassCode");
    Boolean EquipClassCodeFetch = DataHelper.getFetch(EquipClassCodeMap);
    Boolean EquipClassCodeSortDir = DataHelper.getSortDirection(EquipClassCodeMap);
    Integer EquipClassCodeSortOrder = DataHelper.getSortOrder(EquipClassCodeMap);
    if (EquipClassCodeFetch != null) out.setEquipClassCodeFetch(EquipClassCodeFetch);
    if (EquipClassCodeSortDir != null) out.setEquipClassCodeSortDirection(EquipClassCodeSortDir);
    if (EquipClassCodeSortOrder != null) out.setEquipClassCodeSortOrder(EquipClassCodeSortOrder);

    Filter[] EquipClassCodeFilter = DataHelper.mapToFilterArray(EquipClassCodeMap, Integer.class);
    if (EquipClassCodeFilter != null) {
      IntegerFilter[] EquipClassCodeFilters = new IntegerFilter[EquipClassCodeFilter.length];
      for (int i = 0; i < EquipClassCodeFilters.length; i++) {
        EquipClassCodeFilters[i] = (IntegerFilter)EquipClassCodeFilter[i];
      }
      try {
        out.setEquipClassCodeFilter(EquipClassCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ComponentIdMap = (Map)record.get("ComponentId");
    Boolean ComponentIdFetch = DataHelper.getFetch(ComponentIdMap);
    Boolean ComponentIdSortDir = DataHelper.getSortDirection(ComponentIdMap);
    Integer ComponentIdSortOrder = DataHelper.getSortOrder(ComponentIdMap);
    if (ComponentIdFetch != null) out.setComponentIdFetch(ComponentIdFetch);
    if (ComponentIdSortDir != null) out.setComponentIdSortDirection(ComponentIdSortDir);
    if (ComponentIdSortOrder != null) out.setComponentIdSortOrder(ComponentIdSortOrder);

    Filter[] ComponentIdFilter = DataHelper.mapToFilterArray(ComponentIdMap, Integer.class);
    if (ComponentIdFilter != null) {
      IntegerFilter[] ComponentIdFilters = new IntegerFilter[ComponentIdFilter.length];
      for (int i = 0; i < ComponentIdFilters.length; i++) {
        ComponentIdFilters[i] = (IntegerFilter)ComponentIdFilter[i];
      }
      try {
        out.setComponentIdFilter(ComponentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxPkgCountMap = (Map)record.get("TaxPkgCount");
    Boolean TaxPkgCountFetch = DataHelper.getFetch(TaxPkgCountMap);
    Boolean TaxPkgCountSortDir = DataHelper.getSortDirection(TaxPkgCountMap);
    Integer TaxPkgCountSortOrder = DataHelper.getSortOrder(TaxPkgCountMap);
    if (TaxPkgCountFetch != null) out.setTaxPkgCountFetch(TaxPkgCountFetch);
    if (TaxPkgCountSortDir != null) out.setTaxPkgCountSortDirection(TaxPkgCountSortDir);
    if (TaxPkgCountSortOrder != null) out.setTaxPkgCountSortOrder(TaxPkgCountSortOrder);

    Filter[] TaxPkgCountFilter = DataHelper.mapToFilterArray(TaxPkgCountMap, Integer.class);
    if (TaxPkgCountFilter != null) {
      IntegerFilter[] TaxPkgCountFilters = new IntegerFilter[TaxPkgCountFilter.length];
      for (int i = 0; i < TaxPkgCountFilters.length; i++) {
        TaxPkgCountFilters[i] = (IntegerFilter)TaxPkgCountFilter[i];
      }
      try {
        out.setTaxPkgCountFilter(TaxPkgCountFilters);
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
  
    Map AddImpliedDecimalMap = (Map)record.get("AddImpliedDecimal");
    Boolean AddImpliedDecimalFetch = DataHelper.getFetch(AddImpliedDecimalMap);
    Boolean AddImpliedDecimalSortDir = DataHelper.getSortDirection(AddImpliedDecimalMap);
    Integer AddImpliedDecimalSortOrder = DataHelper.getSortOrder(AddImpliedDecimalMap);
    if (AddImpliedDecimalFetch != null) out.setAddImpliedDecimalFetch(AddImpliedDecimalFetch);
    if (AddImpliedDecimalSortDir != null) out.setAddImpliedDecimalSortDirection(AddImpliedDecimalSortDir);
    if (AddImpliedDecimalSortOrder != null) out.setAddImpliedDecimalSortOrder(AddImpliedDecimalSortOrder);

    Filter[] AddImpliedDecimalFilter = DataHelper.mapToFilterArray(AddImpliedDecimalMap, Integer.class);
    if (AddImpliedDecimalFilter != null) {
      IntegerFilter[] AddImpliedDecimalFilters = new IntegerFilter[AddImpliedDecimalFilter.length];
      for (int i = 0; i < AddImpliedDecimalFilters.length; i++) {
        AddImpliedDecimalFilters[i] = (IntegerFilter)AddImpliedDecimalFilter[i];
      }
      try {
        out.setAddImpliedDecimalFilter(AddImpliedDecimalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReratedDtMap = (Map)record.get("ReratedDt");
    Boolean ReratedDtFetch = DataHelper.getFetch(ReratedDtMap);
    Boolean ReratedDtSortDir = DataHelper.getSortDirection(ReratedDtMap);
    Integer ReratedDtSortOrder = DataHelper.getSortOrder(ReratedDtMap);
    if (ReratedDtFetch != null) out.setReratedDtFetch(ReratedDtFetch);
    if (ReratedDtSortDir != null) out.setReratedDtSortDirection(ReratedDtSortDir);
    if (ReratedDtSortOrder != null) out.setReratedDtSortOrder(ReratedDtSortOrder);

    Filter[] ReratedDtFilter = DataHelper.mapToFilterArray(ReratedDtMap, Date.class);
    if (ReratedDtFilter != null) {
      DateFilter[] ReratedDtFilters = new DateFilter[ReratedDtFilter.length];
      for (int i = 0; i < ReratedDtFilters.length; i++) {
        ReratedDtFilters[i] = (DateFilter)ReratedDtFilter[i];
      }
      try {
        out.setReratedDtFilter(ReratedDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalInvoiceIdMap = (Map)record.get("ExternalInvoiceId");
    Boolean ExternalInvoiceIdFetch = DataHelper.getFetch(ExternalInvoiceIdMap);
    Boolean ExternalInvoiceIdSortDir = DataHelper.getSortDirection(ExternalInvoiceIdMap);
    Integer ExternalInvoiceIdSortOrder = DataHelper.getSortOrder(ExternalInvoiceIdMap);
    if (ExternalInvoiceIdFetch != null) out.setExternalInvoiceIdFetch(ExternalInvoiceIdFetch);
    if (ExternalInvoiceIdSortDir != null) out.setExternalInvoiceIdSortDirection(ExternalInvoiceIdSortDir);
    if (ExternalInvoiceIdSortOrder != null) out.setExternalInvoiceIdSortOrder(ExternalInvoiceIdSortOrder);

    Filter[] ExternalInvoiceIdFilter = DataHelper.mapToFilterArray(ExternalInvoiceIdMap, BigInteger.class);
    if (ExternalInvoiceIdFilter != null) {
      BigIntegerFilter[] ExternalInvoiceIdFilters = new BigIntegerFilter[ExternalInvoiceIdFilter.length];
      for (int i = 0; i < ExternalInvoiceIdFilters.length; i++) {
        ExternalInvoiceIdFilters[i] = (BigIntegerFilter)ExternalInvoiceIdFilter[i];
      }
      try {
        out.setExternalInvoiceIdFilter(ExternalInvoiceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InvoiceRecordSeqMap = (Map)record.get("InvoiceRecordSeq");
    Boolean InvoiceRecordSeqFetch = DataHelper.getFetch(InvoiceRecordSeqMap);
    Boolean InvoiceRecordSeqSortDir = DataHelper.getSortDirection(InvoiceRecordSeqMap);
    Integer InvoiceRecordSeqSortOrder = DataHelper.getSortOrder(InvoiceRecordSeqMap);
    if (InvoiceRecordSeqFetch != null) out.setInvoiceRecordSeqFetch(InvoiceRecordSeqFetch);
    if (InvoiceRecordSeqSortDir != null) out.setInvoiceRecordSeqSortDirection(InvoiceRecordSeqSortDir);
    if (InvoiceRecordSeqSortOrder != null) out.setInvoiceRecordSeqSortOrder(InvoiceRecordSeqSortOrder);

    Filter[] InvoiceRecordSeqFilter = DataHelper.mapToFilterArray(InvoiceRecordSeqMap, BigInteger.class);
    if (InvoiceRecordSeqFilter != null) {
      BigIntegerFilter[] InvoiceRecordSeqFilters = new BigIntegerFilter[InvoiceRecordSeqFilter.length];
      for (int i = 0; i < InvoiceRecordSeqFilters.length; i++) {
        InvoiceRecordSeqFilters[i] = (BigIntegerFilter)InvoiceRecordSeqFilter[i];
      }
      try {
        out.setInvoiceRecordSeqFilter(InvoiceRecordSeqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LobIdMap = (Map)record.get("LobId");
    Boolean LobIdFetch = DataHelper.getFetch(LobIdMap);
    Boolean LobIdSortDir = DataHelper.getSortDirection(LobIdMap);
    Integer LobIdSortOrder = DataHelper.getSortOrder(LobIdMap);
    if (LobIdFetch != null) out.setLobIdFetch(LobIdFetch);
    if (LobIdSortDir != null) out.setLobIdSortDirection(LobIdSortDir);
    if (LobIdSortOrder != null) out.setLobIdSortOrder(LobIdSortOrder);

    Filter[] LobIdFilter = DataHelper.mapToFilterArray(LobIdMap, BigInteger.class);
    if (LobIdFilter != null) {
      BigIntegerFilter[] LobIdFilters = new BigIntegerFilter[LobIdFilter.length];
      for (int i = 0; i < LobIdFilters.length; i++) {
        LobIdFilters[i] = (BigIntegerFilter)LobIdFilter[i];
      }
      try {
        out.setLobIdFilter(LobIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransactionIdMap = (Map)record.get("TransactionId");
    Boolean TransactionIdFetch = DataHelper.getFetch(TransactionIdMap);
    Boolean TransactionIdSortDir = DataHelper.getSortDirection(TransactionIdMap);
    Integer TransactionIdSortOrder = DataHelper.getSortOrder(TransactionIdMap);
    if (TransactionIdFetch != null) out.setTransactionIdFetch(TransactionIdFetch);
    if (TransactionIdSortDir != null) out.setTransactionIdSortDirection(TransactionIdSortDir);
    if (TransactionIdSortOrder != null) out.setTransactionIdSortOrder(TransactionIdSortOrder);

    Filter[] TransactionIdFilter = DataHelper.mapToFilterArray(TransactionIdMap, BigInteger.class);
    if (TransactionIdFilter != null) {
      BigIntegerFilter[] TransactionIdFilters = new BigIntegerFilter[TransactionIdFilter.length];
      for (int i = 0; i < TransactionIdFilters.length; i++) {
        TransactionIdFilters[i] = (BigIntegerFilter)TransactionIdFilter[i];
      }
      try {
        out.setTransactionIdFilter(TransactionIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GuideToMap = (Map)record.get("GuideTo");
    Boolean GuideToFetch = DataHelper.getFetch(GuideToMap);
    Boolean GuideToSortDir = DataHelper.getSortDirection(GuideToMap);
    Integer GuideToSortOrder = DataHelper.getSortOrder(GuideToMap);
    if (GuideToFetch != null) out.setGuideToFetch(GuideToFetch);
    if (GuideToSortDir != null) out.setGuideToSortDirection(GuideToSortDir);
    if (GuideToSortOrder != null) out.setGuideToSortOrder(GuideToSortOrder);

    Filter[] GuideToFilter = DataHelper.mapToFilterArray(GuideToMap, Integer.class);
    if (GuideToFilter != null) {
      IntegerFilter[] GuideToFilters = new IntegerFilter[GuideToFilter.length];
      for (int i = 0; i < GuideToFilters.length; i++) {
        GuideToFilters[i] = (IntegerFilter)GuideToFilter[i];
      }
      try {
        out.setGuideToFilter(GuideToFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointCategoryMap = (Map)record.get("PointCategory");
    Boolean PointCategoryFetch = DataHelper.getFetch(PointCategoryMap);
    Boolean PointCategorySortDir = DataHelper.getSortDirection(PointCategoryMap);
    Integer PointCategorySortOrder = DataHelper.getSortOrder(PointCategoryMap);
    if (PointCategoryFetch != null) out.setPointCategoryFetch(PointCategoryFetch);
    if (PointCategorySortDir != null) out.setPointCategorySortDirection(PointCategorySortDir);
    if (PointCategorySortOrder != null) out.setPointCategorySortOrder(PointCategorySortOrder);

    Filter[] PointCategoryFilter = DataHelper.mapToFilterArray(PointCategoryMap, Integer.class);
    if (PointCategoryFilter != null) {
      IntegerFilter[] PointCategoryFilters = new IntegerFilter[PointCategoryFilter.length];
      for (int i = 0; i < PointCategoryFilters.length; i++) {
        PointCategoryFilters[i] = (IntegerFilter)PointCategoryFilter[i];
      }
      try {
        out.setPointCategoryFilter(PointCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OriginCountryDialCodeReqMap = (Map)record.get("OriginCountryDialCodeReq");
    Boolean OriginCountryDialCodeReqFetch = DataHelper.getFetch(OriginCountryDialCodeReqMap);
    Boolean OriginCountryDialCodeReqSortDir = DataHelper.getSortDirection(OriginCountryDialCodeReqMap);
    Integer OriginCountryDialCodeReqSortOrder = DataHelper.getSortOrder(OriginCountryDialCodeReqMap);
    if (OriginCountryDialCodeReqFetch != null) out.setOriginCountryDialCodeReqFetch(OriginCountryDialCodeReqFetch);
    if (OriginCountryDialCodeReqSortDir != null) out.setOriginCountryDialCodeReqSortDirection(OriginCountryDialCodeReqSortDir);
    if (OriginCountryDialCodeReqSortOrder != null) out.setOriginCountryDialCodeReqSortOrder(OriginCountryDialCodeReqSortOrder);

    Filter[] OriginCountryDialCodeReqFilter = DataHelper.mapToFilterArray(OriginCountryDialCodeReqMap, Integer.class);
    if (OriginCountryDialCodeReqFilter != null) {
      IntegerFilter[] OriginCountryDialCodeReqFilters = new IntegerFilter[OriginCountryDialCodeReqFilter.length];
      for (int i = 0; i < OriginCountryDialCodeReqFilters.length; i++) {
        OriginCountryDialCodeReqFilters[i] = (IntegerFilter)OriginCountryDialCodeReqFilter[i];
      }
      try {
        out.setOriginCountryDialCodeReqFilter(OriginCountryDialCodeReqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxCodeOriginReqMap = (Map)record.get("TaxCodeOriginReq");
    Boolean TaxCodeOriginReqFetch = DataHelper.getFetch(TaxCodeOriginReqMap);
    Boolean TaxCodeOriginReqSortDir = DataHelper.getSortDirection(TaxCodeOriginReqMap);
    Integer TaxCodeOriginReqSortOrder = DataHelper.getSortOrder(TaxCodeOriginReqMap);
    if (TaxCodeOriginReqFetch != null) out.setTaxCodeOriginReqFetch(TaxCodeOriginReqFetch);
    if (TaxCodeOriginReqSortDir != null) out.setTaxCodeOriginReqSortDirection(TaxCodeOriginReqSortDir);
    if (TaxCodeOriginReqSortOrder != null) out.setTaxCodeOriginReqSortOrder(TaxCodeOriginReqSortOrder);

    Filter[] TaxCodeOriginReqFilter = DataHelper.mapToFilterArray(TaxCodeOriginReqMap, Integer.class);
    if (TaxCodeOriginReqFilter != null) {
      IntegerFilter[] TaxCodeOriginReqFilters = new IntegerFilter[TaxCodeOriginReqFilter.length];
      for (int i = 0; i < TaxCodeOriginReqFilters.length; i++) {
        TaxCodeOriginReqFilters[i] = (IntegerFilter)TaxCodeOriginReqFilter[i];
      }
      try {
        out.setTaxCodeOriginReqFilter(TaxCodeOriginReqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxCodeTargetReqMap = (Map)record.get("TaxCodeTargetReq");
    Boolean TaxCodeTargetReqFetch = DataHelper.getFetch(TaxCodeTargetReqMap);
    Boolean TaxCodeTargetReqSortDir = DataHelper.getSortDirection(TaxCodeTargetReqMap);
    Integer TaxCodeTargetReqSortOrder = DataHelper.getSortOrder(TaxCodeTargetReqMap);
    if (TaxCodeTargetReqFetch != null) out.setTaxCodeTargetReqFetch(TaxCodeTargetReqFetch);
    if (TaxCodeTargetReqSortDir != null) out.setTaxCodeTargetReqSortDirection(TaxCodeTargetReqSortDir);
    if (TaxCodeTargetReqSortOrder != null) out.setTaxCodeTargetReqSortOrder(TaxCodeTargetReqSortOrder);

    Filter[] TaxCodeTargetReqFilter = DataHelper.mapToFilterArray(TaxCodeTargetReqMap, Integer.class);
    if (TaxCodeTargetReqFilter != null) {
      IntegerFilter[] TaxCodeTargetReqFilters = new IntegerFilter[TaxCodeTargetReqFilter.length];
      for (int i = 0; i < TaxCodeTargetReqFilters.length; i++) {
        TaxCodeTargetReqFilters[i] = (IntegerFilter)TaxCodeTargetReqFilter[i];
      }
      try {
        out.setTaxCodeTargetReqFilter(TaxCodeTargetReqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionCodeMap = (Map)record.get("DescriptionCode");
    Boolean DescriptionCodeFetch = DataHelper.getFetch(DescriptionCodeMap);
    Boolean DescriptionCodeSortDir = DataHelper.getSortDirection(DescriptionCodeMap);
    Integer DescriptionCodeSortOrder = DataHelper.getSortOrder(DescriptionCodeMap);
    if (DescriptionCodeFetch != null) out.setDescriptionCodeFetch(DescriptionCodeFetch);
    if (DescriptionCodeSortDir != null) out.setDescriptionCodeSortDirection(DescriptionCodeSortDir);
    if (DescriptionCodeSortOrder != null) out.setDescriptionCodeSortOrder(DescriptionCodeSortOrder);

    Filter[] DescriptionCodeFilter = DataHelper.mapToFilterArray(DescriptionCodeMap, Integer.class);
    if (DescriptionCodeFilter != null) {
      IntegerFilter[] DescriptionCodeFilters = new IntegerFilter[DescriptionCodeFilter.length];
      for (int i = 0; i < DescriptionCodeFilters.length; i++) {
        DescriptionCodeFilters[i] = (IntegerFilter)DescriptionCodeFilter[i];
      }
      try {
        out.setDescriptionCodeFilter(DescriptionCodeFilters);
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
  
    Map TaxLocationUsgMap = (Map)record.get("TaxLocationUsg");
    Boolean TaxLocationUsgFetch = DataHelper.getFetch(TaxLocationUsgMap);
    Boolean TaxLocationUsgSortDir = DataHelper.getSortDirection(TaxLocationUsgMap);
    Integer TaxLocationUsgSortOrder = DataHelper.getSortOrder(TaxLocationUsgMap);
    if (TaxLocationUsgFetch != null) out.setTaxLocationUsgFetch(TaxLocationUsgFetch);
    if (TaxLocationUsgSortDir != null) out.setTaxLocationUsgSortDirection(TaxLocationUsgSortDir);
    if (TaxLocationUsgSortOrder != null) out.setTaxLocationUsgSortOrder(TaxLocationUsgSortOrder);

    Filter[] TaxLocationUsgFilter = DataHelper.mapToFilterArray(TaxLocationUsgMap, Integer.class);
    if (TaxLocationUsgFilter != null) {
      IntegerFilter[] TaxLocationUsgFilters = new IntegerFilter[TaxLocationUsgFilter.length];
      for (int i = 0; i < TaxLocationUsgFilters.length; i++) {
        TaxLocationUsgFilters[i] = (IntegerFilter)TaxLocationUsgFilter[i];
      }
      try {
        out.setTaxLocationUsgFilter(TaxLocationUsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxLocationOutcollectMap = (Map)record.get("TaxLocationOutcollect");
    Boolean TaxLocationOutcollectFetch = DataHelper.getFetch(TaxLocationOutcollectMap);
    Boolean TaxLocationOutcollectSortDir = DataHelper.getSortDirection(TaxLocationOutcollectMap);
    Integer TaxLocationOutcollectSortOrder = DataHelper.getSortOrder(TaxLocationOutcollectMap);
    if (TaxLocationOutcollectFetch != null) out.setTaxLocationOutcollectFetch(TaxLocationOutcollectFetch);
    if (TaxLocationOutcollectSortDir != null) out.setTaxLocationOutcollectSortDirection(TaxLocationOutcollectSortDir);
    if (TaxLocationOutcollectSortOrder != null) out.setTaxLocationOutcollectSortOrder(TaxLocationOutcollectSortOrder);

    Filter[] TaxLocationOutcollectFilter = DataHelper.mapToFilterArray(TaxLocationOutcollectMap, Integer.class);
    if (TaxLocationOutcollectFilter != null) {
      IntegerFilter[] TaxLocationOutcollectFilters = new IntegerFilter[TaxLocationOutcollectFilter.length];
      for (int i = 0; i < TaxLocationOutcollectFilters.length; i++) {
        TaxLocationOutcollectFilters[i] = (IntegerFilter)TaxLocationOutcollectFilter[i];
      }
      try {
        out.setTaxLocationOutcollectFilter(TaxLocationOutcollectFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsgClassMap = (Map)record.get("UsgClass");
    Boolean UsgClassFetch = DataHelper.getFetch(UsgClassMap);
    Boolean UsgClassSortDir = DataHelper.getSortDirection(UsgClassMap);
    Integer UsgClassSortOrder = DataHelper.getSortOrder(UsgClassMap);
    if (UsgClassFetch != null) out.setUsgClassFetch(UsgClassFetch);
    if (UsgClassSortDir != null) out.setUsgClassSortDirection(UsgClassSortDir);
    if (UsgClassSortOrder != null) out.setUsgClassSortOrder(UsgClassSortOrder);

    Filter[] UsgClassFilter = DataHelper.mapToFilterArray(UsgClassMap, Integer.class);
    if (UsgClassFilter != null) {
      IntegerFilter[] UsgClassFilters = new IntegerFilter[UsgClassFilter.length];
      for (int i = 0; i < UsgClassFilters.length; i++) {
        UsgClassFilters[i] = (IntegerFilter)UsgClassFilter[i];
      }
      try {
        out.setUsgClassFilter(UsgClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FreeUsgMap = (Map)record.get("FreeUsg");
    Boolean FreeUsgFetch = DataHelper.getFetch(FreeUsgMap);
    Boolean FreeUsgSortDir = DataHelper.getSortDirection(FreeUsgMap);
    Integer FreeUsgSortOrder = DataHelper.getSortOrder(FreeUsgMap);
    if (FreeUsgFetch != null) out.setFreeUsgFetch(FreeUsgFetch);
    if (FreeUsgSortDir != null) out.setFreeUsgSortDirection(FreeUsgSortDir);
    if (FreeUsgSortOrder != null) out.setFreeUsgSortOrder(FreeUsgSortOrder);

    Filter[] FreeUsgFilter = DataHelper.mapToFilterArray(FreeUsgMap, Boolean.class);
    if (FreeUsgFilter != null) {
      BooleanFilter[] FreeUsgFilters = new BooleanFilter[FreeUsgFilter.length];
      for (int i = 0; i < FreeUsgFilters.length; i++) {
        FreeUsgFilters[i] = (BooleanFilter)FreeUsgFilter[i];
      }
      try {
        out.setFreeUsgFilter(FreeUsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProductLineIdMap = (Map)record.get("ProductLineId");
    Boolean ProductLineIdFetch = DataHelper.getFetch(ProductLineIdMap);
    Boolean ProductLineIdSortDir = DataHelper.getSortDirection(ProductLineIdMap);
    Integer ProductLineIdSortOrder = DataHelper.getSortOrder(ProductLineIdMap);
    if (ProductLineIdFetch != null) out.setProductLineIdFetch(ProductLineIdFetch);
    if (ProductLineIdSortDir != null) out.setProductLineIdSortDirection(ProductLineIdSortDir);
    if (ProductLineIdSortOrder != null) out.setProductLineIdSortOrder(ProductLineIdSortOrder);

    Filter[] ProductLineIdFilter = DataHelper.mapToFilterArray(ProductLineIdMap, Integer.class);
    if (ProductLineIdFilter != null) {
      IntegerFilter[] ProductLineIdFilters = new IntegerFilter[ProductLineIdFilter.length];
      for (int i = 0; i < ProductLineIdFilters.length; i++) {
        ProductLineIdFilters[i] = (IntegerFilter)ProductLineIdFilter[i];
      }
      try {
        out.setProductLineIdFilter(ProductLineIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillAggrLevelMap = (Map)record.get("BillAggrLevel");
    Boolean BillAggrLevelFetch = DataHelper.getFetch(BillAggrLevelMap);
    Boolean BillAggrLevelSortDir = DataHelper.getSortDirection(BillAggrLevelMap);
    Integer BillAggrLevelSortOrder = DataHelper.getSortOrder(BillAggrLevelMap);
    if (BillAggrLevelFetch != null) out.setBillAggrLevelFetch(BillAggrLevelFetch);
    if (BillAggrLevelSortDir != null) out.setBillAggrLevelSortDirection(BillAggrLevelSortDir);
    if (BillAggrLevelSortOrder != null) out.setBillAggrLevelSortOrder(BillAggrLevelSortOrder);

    Filter[] BillAggrLevelFilter = DataHelper.mapToFilterArray(BillAggrLevelMap, Integer.class);
    if (BillAggrLevelFilter != null) {
      IntegerFilter[] BillAggrLevelFilters = new IntegerFilter[BillAggrLevelFilter.length];
      for (int i = 0; i < BillAggrLevelFilters.length; i++) {
        BillAggrLevelFilters[i] = (IntegerFilter)BillAggrLevelFilter[i];
      }
      try {
        out.setBillAggrLevelFilter(BillAggrLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DeriveJurisdictionMap = (Map)record.get("DeriveJurisdiction");
    Boolean DeriveJurisdictionFetch = DataHelper.getFetch(DeriveJurisdictionMap);
    Boolean DeriveJurisdictionSortDir = DataHelper.getSortDirection(DeriveJurisdictionMap);
    Integer DeriveJurisdictionSortOrder = DataHelper.getSortOrder(DeriveJurisdictionMap);
    if (DeriveJurisdictionFetch != null) out.setDeriveJurisdictionFetch(DeriveJurisdictionFetch);
    if (DeriveJurisdictionSortDir != null) out.setDeriveJurisdictionSortDirection(DeriveJurisdictionSortDir);
    if (DeriveJurisdictionSortOrder != null) out.setDeriveJurisdictionSortOrder(DeriveJurisdictionSortOrder);

    Filter[] DeriveJurisdictionFilter = DataHelper.mapToFilterArray(DeriveJurisdictionMap, Integer.class);
    if (DeriveJurisdictionFilter != null) {
      IntegerFilter[] DeriveJurisdictionFilters = new IntegerFilter[DeriveJurisdictionFilter.length];
      for (int i = 0; i < DeriveJurisdictionFilters.length; i++) {
        DeriveJurisdictionFilters[i] = (IntegerFilter)DeriveJurisdictionFilter[i];
      }
      try {
        out.setDeriveJurisdictionFilter(DeriveJurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsIndicatorMap = (Map)record.get("UnitsIndicator");
    Boolean UnitsIndicatorFetch = DataHelper.getFetch(UnitsIndicatorMap);
    Boolean UnitsIndicatorSortDir = DataHelper.getSortDirection(UnitsIndicatorMap);
    Integer UnitsIndicatorSortOrder = DataHelper.getSortOrder(UnitsIndicatorMap);
    if (UnitsIndicatorFetch != null) out.setUnitsIndicatorFetch(UnitsIndicatorFetch);
    if (UnitsIndicatorSortDir != null) out.setUnitsIndicatorSortDirection(UnitsIndicatorSortDir);
    if (UnitsIndicatorSortOrder != null) out.setUnitsIndicatorSortOrder(UnitsIndicatorSortOrder);

    Filter[] UnitsIndicatorFilter = DataHelper.mapToFilterArray(UnitsIndicatorMap, Integer.class);
    if (UnitsIndicatorFilter != null) {
      IntegerFilter[] UnitsIndicatorFilters = new IntegerFilter[UnitsIndicatorFilter.length];
      for (int i = 0; i < UnitsIndicatorFilters.length; i++) {
        UnitsIndicatorFilters[i] = (IntegerFilter)UnitsIndicatorFilter[i];
      }
      try {
        out.setUnitsIndicatorFilter(UnitsIndicatorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatableUnitClassMap = (Map)record.get("RatableUnitClass");
    Boolean RatableUnitClassFetch = DataHelper.getFetch(RatableUnitClassMap);
    Boolean RatableUnitClassSortDir = DataHelper.getSortDirection(RatableUnitClassMap);
    Integer RatableUnitClassSortOrder = DataHelper.getSortOrder(RatableUnitClassMap);
    if (RatableUnitClassFetch != null) out.setRatableUnitClassFetch(RatableUnitClassFetch);
    if (RatableUnitClassSortDir != null) out.setRatableUnitClassSortDirection(RatableUnitClassSortDir);
    if (RatableUnitClassSortOrder != null) out.setRatableUnitClassSortOrder(RatableUnitClassSortOrder);

    Filter[] RatableUnitClassFilter = DataHelper.mapToFilterArray(RatableUnitClassMap, Integer.class);
    if (RatableUnitClassFilter != null) {
      IntegerFilter[] RatableUnitClassFilters = new IntegerFilter[RatableUnitClassFilter.length];
      for (int i = 0; i < RatableUnitClassFilters.length; i++) {
        RatableUnitClassFilters[i] = (IntegerFilter)RatableUnitClassFilter[i];
      }
      try {
        out.setRatableUnitClassFilter(RatableUnitClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DurationFlagMap = (Map)record.get("DurationFlag");
    Boolean DurationFlagFetch = DataHelper.getFetch(DurationFlagMap);
    Boolean DurationFlagSortDir = DataHelper.getSortDirection(DurationFlagMap);
    Integer DurationFlagSortOrder = DataHelper.getSortOrder(DurationFlagMap);
    if (DurationFlagFetch != null) out.setDurationFlagFetch(DurationFlagFetch);
    if (DurationFlagSortDir != null) out.setDurationFlagSortDirection(DurationFlagSortDir);
    if (DurationFlagSortOrder != null) out.setDurationFlagSortOrder(DurationFlagSortOrder);

    Filter[] DurationFlagFilter = DataHelper.mapToFilterArray(DurationFlagMap, Boolean.class);
    if (DurationFlagFilter != null) {
      BooleanFilter[] DurationFlagFilters = new BooleanFilter[DurationFlagFilter.length];
      for (int i = 0; i < DurationFlagFilters.length; i++) {
        DurationFlagFilters[i] = (BooleanFilter)DurationFlagFilter[i];
      }
      try {
        out.setDurationFlagFilter(DurationFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DeriveDistanceUnitsMap = (Map)record.get("DeriveDistanceUnits");
    Boolean DeriveDistanceUnitsFetch = DataHelper.getFetch(DeriveDistanceUnitsMap);
    Boolean DeriveDistanceUnitsSortDir = DataHelper.getSortDirection(DeriveDistanceUnitsMap);
    Integer DeriveDistanceUnitsSortOrder = DataHelper.getSortOrder(DeriveDistanceUnitsMap);
    if (DeriveDistanceUnitsFetch != null) out.setDeriveDistanceUnitsFetch(DeriveDistanceUnitsFetch);
    if (DeriveDistanceUnitsSortDir != null) out.setDeriveDistanceUnitsSortDirection(DeriveDistanceUnitsSortDir);
    if (DeriveDistanceUnitsSortOrder != null) out.setDeriveDistanceUnitsSortOrder(DeriveDistanceUnitsSortOrder);

    Filter[] DeriveDistanceUnitsFilter = DataHelper.mapToFilterArray(DeriveDistanceUnitsMap, Integer.class);
    if (DeriveDistanceUnitsFilter != null) {
      IntegerFilter[] DeriveDistanceUnitsFilters = new IntegerFilter[DeriveDistanceUnitsFilter.length];
      for (int i = 0; i < DeriveDistanceUnitsFilters.length; i++) {
        DeriveDistanceUnitsFilters[i] = (IntegerFilter)DeriveDistanceUnitsFilter[i];
      }
      try {
        out.setDeriveDistanceUnitsFilter(DeriveDistanceUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map VhMinorThresholdMap = (Map)record.get("VhMinorThreshold");
    Boolean VhMinorThresholdFetch = DataHelper.getFetch(VhMinorThresholdMap);
    Boolean VhMinorThresholdSortDir = DataHelper.getSortDirection(VhMinorThresholdMap);
    Integer VhMinorThresholdSortOrder = DataHelper.getSortOrder(VhMinorThresholdMap);
    if (VhMinorThresholdFetch != null) out.setVhMinorThresholdFetch(VhMinorThresholdFetch);
    if (VhMinorThresholdSortDir != null) out.setVhMinorThresholdSortDirection(VhMinorThresholdSortDir);
    if (VhMinorThresholdSortOrder != null) out.setVhMinorThresholdSortOrder(VhMinorThresholdSortOrder);

    Filter[] VhMinorThresholdFilter = DataHelper.mapToFilterArray(VhMinorThresholdMap, Integer.class);
    if (VhMinorThresholdFilter != null) {
      IntegerFilter[] VhMinorThresholdFilters = new IntegerFilter[VhMinorThresholdFilter.length];
      for (int i = 0; i < VhMinorThresholdFilters.length; i++) {
        VhMinorThresholdFilters[i] = (IntegerFilter)VhMinorThresholdFilter[i];
      }
      try {
        out.setVhMinorThresholdFilter(VhMinorThresholdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistanceUnitsIndicatorMap = (Map)record.get("DistanceUnitsIndicator");
    Boolean DistanceUnitsIndicatorFetch = DataHelper.getFetch(DistanceUnitsIndicatorMap);
    Boolean DistanceUnitsIndicatorSortDir = DataHelper.getSortDirection(DistanceUnitsIndicatorMap);
    Integer DistanceUnitsIndicatorSortOrder = DataHelper.getSortOrder(DistanceUnitsIndicatorMap);
    if (DistanceUnitsIndicatorFetch != null) out.setDistanceUnitsIndicatorFetch(DistanceUnitsIndicatorFetch);
    if (DistanceUnitsIndicatorSortDir != null) out.setDistanceUnitsIndicatorSortDirection(DistanceUnitsIndicatorSortDir);
    if (DistanceUnitsIndicatorSortOrder != null) out.setDistanceUnitsIndicatorSortOrder(DistanceUnitsIndicatorSortOrder);

    Filter[] DistanceUnitsIndicatorFilter = DataHelper.mapToFilterArray(DistanceUnitsIndicatorMap, Integer.class);
    if (DistanceUnitsIndicatorFilter != null) {
      IntegerFilter[] DistanceUnitsIndicatorFilters = new IntegerFilter[DistanceUnitsIndicatorFilter.length];
      for (int i = 0; i < DistanceUnitsIndicatorFilters.length; i++) {
        DistanceUnitsIndicatorFilters[i] = (IntegerFilter)DistanceUnitsIndicatorFilter[i];
      }
      try {
        out.setDistanceUnitsIndicatorFilter(DistanceUnitsIndicatorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GuideToProviderMap = (Map)record.get("GuideToProvider");
    Boolean GuideToProviderFetch = DataHelper.getFetch(GuideToProviderMap);
    Boolean GuideToProviderSortDir = DataHelper.getSortDirection(GuideToProviderMap);
    Integer GuideToProviderSortOrder = DataHelper.getSortOrder(GuideToProviderMap);
    if (GuideToProviderFetch != null) out.setGuideToProviderFetch(GuideToProviderFetch);
    if (GuideToProviderSortDir != null) out.setGuideToProviderSortDirection(GuideToProviderSortDir);
    if (GuideToProviderSortOrder != null) out.setGuideToProviderSortOrder(GuideToProviderSortOrder);

    Filter[] GuideToProviderFilter = DataHelper.mapToFilterArray(GuideToProviderMap, Integer.class);
    if (GuideToProviderFilter != null) {
      IntegerFilter[] GuideToProviderFilters = new IntegerFilter[GuideToProviderFilter.length];
      for (int i = 0; i < GuideToProviderFilters.length; i++) {
        GuideToProviderFilters[i] = (IntegerFilter)GuideToProviderFilter[i];
      }
      try {
        out.setGuideToProviderFilter(GuideToProviderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPreratedMap = (Map)record.get("IsPrerated");
    Boolean IsPreratedFetch = DataHelper.getFetch(IsPreratedMap);
    Boolean IsPreratedSortDir = DataHelper.getSortDirection(IsPreratedMap);
    Integer IsPreratedSortOrder = DataHelper.getSortOrder(IsPreratedMap);
    if (IsPreratedFetch != null) out.setIsPreratedFetch(IsPreratedFetch);
    if (IsPreratedSortDir != null) out.setIsPreratedSortDirection(IsPreratedSortDir);
    if (IsPreratedSortOrder != null) out.setIsPreratedSortOrder(IsPreratedSortOrder);

    Filter[] IsPreratedFilter = DataHelper.mapToFilterArray(IsPreratedMap, Boolean.class);
    if (IsPreratedFilter != null) {
      BooleanFilter[] IsPreratedFilters = new BooleanFilter[IsPreratedFilter.length];
      for (int i = 0; i < IsPreratedFilters.length; i++) {
        IsPreratedFilters[i] = (BooleanFilter)IsPreratedFilter[i];
      }
      try {
        out.setIsPreratedFilter(IsPreratedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map KeepRunningTotalMap = (Map)record.get("KeepRunningTotal");
    Boolean KeepRunningTotalFetch = DataHelper.getFetch(KeepRunningTotalMap);
    Boolean KeepRunningTotalSortDir = DataHelper.getSortDirection(KeepRunningTotalMap);
    Integer KeepRunningTotalSortOrder = DataHelper.getSortOrder(KeepRunningTotalMap);
    if (KeepRunningTotalFetch != null) out.setKeepRunningTotalFetch(KeepRunningTotalFetch);
    if (KeepRunningTotalSortDir != null) out.setKeepRunningTotalSortDirection(KeepRunningTotalSortDir);
    if (KeepRunningTotalSortOrder != null) out.setKeepRunningTotalSortOrder(KeepRunningTotalSortOrder);

    Filter[] KeepRunningTotalFilter = DataHelper.mapToFilterArray(KeepRunningTotalMap, Boolean.class);
    if (KeepRunningTotalFilter != null) {
      BooleanFilter[] KeepRunningTotalFilters = new BooleanFilter[KeepRunningTotalFilter.length];
      for (int i = 0; i < KeepRunningTotalFilters.length; i++) {
        KeepRunningTotalFilters[i] = (BooleanFilter)KeepRunningTotalFilter[i];
      }
      try {
        out.setKeepRunningTotalFilter(KeepRunningTotalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RoundingMethodMap = (Map)record.get("RoundingMethod");
    Boolean RoundingMethodFetch = DataHelper.getFetch(RoundingMethodMap);
    Boolean RoundingMethodSortDir = DataHelper.getSortDirection(RoundingMethodMap);
    Integer RoundingMethodSortOrder = DataHelper.getSortOrder(RoundingMethodMap);
    if (RoundingMethodFetch != null) out.setRoundingMethodFetch(RoundingMethodFetch);
    if (RoundingMethodSortDir != null) out.setRoundingMethodSortDirection(RoundingMethodSortDir);
    if (RoundingMethodSortOrder != null) out.setRoundingMethodSortOrder(RoundingMethodSortOrder);

    Filter[] RoundingMethodFilter = DataHelper.mapToFilterArray(RoundingMethodMap, Integer.class);
    if (RoundingMethodFilter != null) {
      IntegerFilter[] RoundingMethodFilters = new IntegerFilter[RoundingMethodFilter.length];
      for (int i = 0; i < RoundingMethodFilters.length; i++) {
        RoundingMethodFilters[i] = (IntegerFilter)RoundingMethodFilter[i];
      }
      try {
        out.setRoundingMethodFilter(RoundingMethodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RawUnitsTypeMap = (Map)record.get("RawUnitsType");
    Boolean RawUnitsTypeFetch = DataHelper.getFetch(RawUnitsTypeMap);
    Boolean RawUnitsTypeSortDir = DataHelper.getSortDirection(RawUnitsTypeMap);
    Integer RawUnitsTypeSortOrder = DataHelper.getSortOrder(RawUnitsTypeMap);
    if (RawUnitsTypeFetch != null) out.setRawUnitsTypeFetch(RawUnitsTypeFetch);
    if (RawUnitsTypeSortDir != null) out.setRawUnitsTypeSortDirection(RawUnitsTypeSortDir);
    if (RawUnitsTypeSortOrder != null) out.setRawUnitsTypeSortOrder(RawUnitsTypeSortOrder);

    Filter[] RawUnitsTypeFilter = DataHelper.mapToFilterArray(RawUnitsTypeMap, Integer.class);
    if (RawUnitsTypeFilter != null) {
      IntegerFilter[] RawUnitsTypeFilters = new IntegerFilter[RawUnitsTypeFilter.length];
      for (int i = 0; i < RawUnitsTypeFilters.length; i++) {
        RawUnitsTypeFilters[i] = (IntegerFilter)RawUnitsTypeFilter[i];
      }
      try {
        out.setRawUnitsTypeFilter(RawUnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseRateClassMap = (Map)record.get("UseRateClass");
    Boolean UseRateClassFetch = DataHelper.getFetch(UseRateClassMap);
    Boolean UseRateClassSortDir = DataHelper.getSortDirection(UseRateClassMap);
    Integer UseRateClassSortOrder = DataHelper.getSortOrder(UseRateClassMap);
    if (UseRateClassFetch != null) out.setUseRateClassFetch(UseRateClassFetch);
    if (UseRateClassSortDir != null) out.setUseRateClassSortDirection(UseRateClassSortDir);
    if (UseRateClassSortOrder != null) out.setUseRateClassSortOrder(UseRateClassSortOrder);

    Filter[] UseRateClassFilter = DataHelper.mapToFilterArray(UseRateClassMap, Integer.class);
    if (UseRateClassFilter != null) {
      IntegerFilter[] UseRateClassFilters = new IntegerFilter[UseRateClassFilter.length];
      for (int i = 0; i < UseRateClassFilters.length; i++) {
        UseRateClassFilters[i] = (IntegerFilter)UseRateClassFilter[i];
      }
      try {
        out.setUseRateClassFilter(UseRateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseBillClassMap = (Map)record.get("UseBillClass");
    Boolean UseBillClassFetch = DataHelper.getFetch(UseBillClassMap);
    Boolean UseBillClassSortDir = DataHelper.getSortDirection(UseBillClassMap);
    Integer UseBillClassSortOrder = DataHelper.getSortOrder(UseBillClassMap);
    if (UseBillClassFetch != null) out.setUseBillClassFetch(UseBillClassFetch);
    if (UseBillClassSortDir != null) out.setUseBillClassSortDirection(UseBillClassSortDir);
    if (UseBillClassSortOrder != null) out.setUseBillClassSortOrder(UseBillClassSortOrder);

    Filter[] UseBillClassFilter = DataHelper.mapToFilterArray(UseBillClassMap, Integer.class);
    if (UseBillClassFilter != null) {
      IntegerFilter[] UseBillClassFilters = new IntegerFilter[UseBillClassFilter.length];
      for (int i = 0; i < UseBillClassFilters.length; i++) {
        UseBillClassFilters[i] = (IntegerFilter)UseBillClassFilter[i];
      }
      try {
        out.setUseBillClassFilter(UseBillClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseJurisdictionMap = (Map)record.get("UseJurisdiction");
    Boolean UseJurisdictionFetch = DataHelper.getFetch(UseJurisdictionMap);
    Boolean UseJurisdictionSortDir = DataHelper.getSortDirection(UseJurisdictionMap);
    Integer UseJurisdictionSortOrder = DataHelper.getSortOrder(UseJurisdictionMap);
    if (UseJurisdictionFetch != null) out.setUseJurisdictionFetch(UseJurisdictionFetch);
    if (UseJurisdictionSortDir != null) out.setUseJurisdictionSortDirection(UseJurisdictionSortDir);
    if (UseJurisdictionSortOrder != null) out.setUseJurisdictionSortOrder(UseJurisdictionSortOrder);

    Filter[] UseJurisdictionFilter = DataHelper.mapToFilterArray(UseJurisdictionMap, Integer.class);
    if (UseJurisdictionFilter != null) {
      IntegerFilter[] UseJurisdictionFilters = new IntegerFilter[UseJurisdictionFilter.length];
      for (int i = 0; i < UseJurisdictionFilters.length; i++) {
        UseJurisdictionFilters[i] = (IntegerFilter)UseJurisdictionFilter[i];
      }
      try {
        out.setUseJurisdictionFilter(UseJurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsePointClassOriginMap = (Map)record.get("UsePointClassOrigin");
    Boolean UsePointClassOriginFetch = DataHelper.getFetch(UsePointClassOriginMap);
    Boolean UsePointClassOriginSortDir = DataHelper.getSortDirection(UsePointClassOriginMap);
    Integer UsePointClassOriginSortOrder = DataHelper.getSortOrder(UsePointClassOriginMap);
    if (UsePointClassOriginFetch != null) out.setUsePointClassOriginFetch(UsePointClassOriginFetch);
    if (UsePointClassOriginSortDir != null) out.setUsePointClassOriginSortDirection(UsePointClassOriginSortDir);
    if (UsePointClassOriginSortOrder != null) out.setUsePointClassOriginSortOrder(UsePointClassOriginSortOrder);

    Filter[] UsePointClassOriginFilter = DataHelper.mapToFilterArray(UsePointClassOriginMap, Integer.class);
    if (UsePointClassOriginFilter != null) {
      IntegerFilter[] UsePointClassOriginFilters = new IntegerFilter[UsePointClassOriginFilter.length];
      for (int i = 0; i < UsePointClassOriginFilters.length; i++) {
        UsePointClassOriginFilters[i] = (IntegerFilter)UsePointClassOriginFilter[i];
      }
      try {
        out.setUsePointClassOriginFilter(UsePointClassOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsePointClassTargetMap = (Map)record.get("UsePointClassTarget");
    Boolean UsePointClassTargetFetch = DataHelper.getFetch(UsePointClassTargetMap);
    Boolean UsePointClassTargetSortDir = DataHelper.getSortDirection(UsePointClassTargetMap);
    Integer UsePointClassTargetSortOrder = DataHelper.getSortOrder(UsePointClassTargetMap);
    if (UsePointClassTargetFetch != null) out.setUsePointClassTargetFetch(UsePointClassTargetFetch);
    if (UsePointClassTargetSortDir != null) out.setUsePointClassTargetSortDirection(UsePointClassTargetSortDir);
    if (UsePointClassTargetSortOrder != null) out.setUsePointClassTargetSortOrder(UsePointClassTargetSortOrder);

    Filter[] UsePointClassTargetFilter = DataHelper.mapToFilterArray(UsePointClassTargetMap, Integer.class);
    if (UsePointClassTargetFilter != null) {
      IntegerFilter[] UsePointClassTargetFilters = new IntegerFilter[UsePointClassTargetFilter.length];
      for (int i = 0; i < UsePointClassTargetFilters.length; i++) {
        UsePointClassTargetFilters[i] = (IntegerFilter)UsePointClassTargetFilter[i];
      }
      try {
        out.setUsePointClassTargetFilter(UsePointClassTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseProviderClassMap = (Map)record.get("UseProviderClass");
    Boolean UseProviderClassFetch = DataHelper.getFetch(UseProviderClassMap);
    Boolean UseProviderClassSortDir = DataHelper.getSortDirection(UseProviderClassMap);
    Integer UseProviderClassSortOrder = DataHelper.getSortOrder(UseProviderClassMap);
    if (UseProviderClassFetch != null) out.setUseProviderClassFetch(UseProviderClassFetch);
    if (UseProviderClassSortDir != null) out.setUseProviderClassSortDirection(UseProviderClassSortDir);
    if (UseProviderClassSortOrder != null) out.setUseProviderClassSortOrder(UseProviderClassSortOrder);

    Filter[] UseProviderClassFilter = DataHelper.mapToFilterArray(UseProviderClassMap, Integer.class);
    if (UseProviderClassFilter != null) {
      IntegerFilter[] UseProviderClassFilters = new IntegerFilter[UseProviderClassFilter.length];
      for (int i = 0; i < UseProviderClassFilters.length; i++) {
        UseProviderClassFilters[i] = (IntegerFilter)UseProviderClassFilter[i];
      }
      try {
        out.setUseProviderClassFilter(UseProviderClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseRatePeriodMap = (Map)record.get("UseRatePeriod");
    Boolean UseRatePeriodFetch = DataHelper.getFetch(UseRatePeriodMap);
    Boolean UseRatePeriodSortDir = DataHelper.getSortDirection(UseRatePeriodMap);
    Integer UseRatePeriodSortOrder = DataHelper.getSortOrder(UseRatePeriodMap);
    if (UseRatePeriodFetch != null) out.setUseRatePeriodFetch(UseRatePeriodFetch);
    if (UseRatePeriodSortDir != null) out.setUseRatePeriodSortDirection(UseRatePeriodSortDir);
    if (UseRatePeriodSortOrder != null) out.setUseRatePeriodSortOrder(UseRatePeriodSortOrder);

    Filter[] UseRatePeriodFilter = DataHelper.mapToFilterArray(UseRatePeriodMap, Integer.class);
    if (UseRatePeriodFilter != null) {
      IntegerFilter[] UseRatePeriodFilters = new IntegerFilter[UseRatePeriodFilter.length];
      for (int i = 0; i < UseRatePeriodFilters.length; i++) {
        UseRatePeriodFilters[i] = (IntegerFilter)UseRatePeriodFilter[i];
      }
      try {
        out.setUseRatePeriodFilter(UseRatePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseElementIdMap = (Map)record.get("UseElementId");
    Boolean UseElementIdFetch = DataHelper.getFetch(UseElementIdMap);
    Boolean UseElementIdSortDir = DataHelper.getSortDirection(UseElementIdMap);
    Integer UseElementIdSortOrder = DataHelper.getSortOrder(UseElementIdMap);
    if (UseElementIdFetch != null) out.setUseElementIdFetch(UseElementIdFetch);
    if (UseElementIdSortDir != null) out.setUseElementIdSortDirection(UseElementIdSortDir);
    if (UseElementIdSortOrder != null) out.setUseElementIdSortOrder(UseElementIdSortOrder);

    Filter[] UseElementIdFilter = DataHelper.mapToFilterArray(UseElementIdMap, Integer.class);
    if (UseElementIdFilter != null) {
      IntegerFilter[] UseElementIdFilters = new IntegerFilter[UseElementIdFilter.length];
      for (int i = 0; i < UseElementIdFilters.length; i++) {
        UseElementIdFilters[i] = (IntegerFilter)UseElementIdFilter[i];
      }
      try {
        out.setUseElementIdFilter(UseElementIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseEquipTypeCodeMap = (Map)record.get("UseEquipTypeCode");
    Boolean UseEquipTypeCodeFetch = DataHelper.getFetch(UseEquipTypeCodeMap);
    Boolean UseEquipTypeCodeSortDir = DataHelper.getSortDirection(UseEquipTypeCodeMap);
    Integer UseEquipTypeCodeSortOrder = DataHelper.getSortOrder(UseEquipTypeCodeMap);
    if (UseEquipTypeCodeFetch != null) out.setUseEquipTypeCodeFetch(UseEquipTypeCodeFetch);
    if (UseEquipTypeCodeSortDir != null) out.setUseEquipTypeCodeSortDirection(UseEquipTypeCodeSortDir);
    if (UseEquipTypeCodeSortOrder != null) out.setUseEquipTypeCodeSortOrder(UseEquipTypeCodeSortOrder);

    Filter[] UseEquipTypeCodeFilter = DataHelper.mapToFilterArray(UseEquipTypeCodeMap, Integer.class);
    if (UseEquipTypeCodeFilter != null) {
      IntegerFilter[] UseEquipTypeCodeFilters = new IntegerFilter[UseEquipTypeCodeFilter.length];
      for (int i = 0; i < UseEquipTypeCodeFilters.length; i++) {
        UseEquipTypeCodeFilters[i] = (IntegerFilter)UseEquipTypeCodeFilter[i];
      }
      try {
        out.setUseEquipTypeCodeFilter(UseEquipTypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseEquipClassCodeMap = (Map)record.get("UseEquipClassCode");
    Boolean UseEquipClassCodeFetch = DataHelper.getFetch(UseEquipClassCodeMap);
    Boolean UseEquipClassCodeSortDir = DataHelper.getSortDirection(UseEquipClassCodeMap);
    Integer UseEquipClassCodeSortOrder = DataHelper.getSortOrder(UseEquipClassCodeMap);
    if (UseEquipClassCodeFetch != null) out.setUseEquipClassCodeFetch(UseEquipClassCodeFetch);
    if (UseEquipClassCodeSortDir != null) out.setUseEquipClassCodeSortDirection(UseEquipClassCodeSortDir);
    if (UseEquipClassCodeSortOrder != null) out.setUseEquipClassCodeSortOrder(UseEquipClassCodeSortOrder);

    Filter[] UseEquipClassCodeFilter = DataHelper.mapToFilterArray(UseEquipClassCodeMap, Integer.class);
    if (UseEquipClassCodeFilter != null) {
      IntegerFilter[] UseEquipClassCodeFilters = new IntegerFilter[UseEquipClassCodeFilter.length];
      for (int i = 0; i < UseEquipClassCodeFilters.length; i++) {
        UseEquipClassCodeFilters[i] = (IntegerFilter)UseEquipClassCodeFilter[i];
      }
      try {
        out.setUseEquipClassCodeFilter(UseEquipClassCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseClassOfServiceCodeMap = (Map)record.get("UseClassOfServiceCode");
    Boolean UseClassOfServiceCodeFetch = DataHelper.getFetch(UseClassOfServiceCodeMap);
    Boolean UseClassOfServiceCodeSortDir = DataHelper.getSortDirection(UseClassOfServiceCodeMap);
    Integer UseClassOfServiceCodeSortOrder = DataHelper.getSortOrder(UseClassOfServiceCodeMap);
    if (UseClassOfServiceCodeFetch != null) out.setUseClassOfServiceCodeFetch(UseClassOfServiceCodeFetch);
    if (UseClassOfServiceCodeSortDir != null) out.setUseClassOfServiceCodeSortDirection(UseClassOfServiceCodeSortDir);
    if (UseClassOfServiceCodeSortOrder != null) out.setUseClassOfServiceCodeSortOrder(UseClassOfServiceCodeSortOrder);

    Filter[] UseClassOfServiceCodeFilter = DataHelper.mapToFilterArray(UseClassOfServiceCodeMap, Integer.class);
    if (UseClassOfServiceCodeFilter != null) {
      IntegerFilter[] UseClassOfServiceCodeFilters = new IntegerFilter[UseClassOfServiceCodeFilter.length];
      for (int i = 0; i < UseClassOfServiceCodeFilters.length; i++) {
        UseClassOfServiceCodeFilters[i] = (IntegerFilter)UseClassOfServiceCodeFilter[i];
      }
      try {
        out.setUseClassOfServiceCodeFilter(UseClassOfServiceCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseDistanceBandIdMap = (Map)record.get("UseDistanceBandId");
    Boolean UseDistanceBandIdFetch = DataHelper.getFetch(UseDistanceBandIdMap);
    Boolean UseDistanceBandIdSortDir = DataHelper.getSortDirection(UseDistanceBandIdMap);
    Integer UseDistanceBandIdSortOrder = DataHelper.getSortOrder(UseDistanceBandIdMap);
    if (UseDistanceBandIdFetch != null) out.setUseDistanceBandIdFetch(UseDistanceBandIdFetch);
    if (UseDistanceBandIdSortDir != null) out.setUseDistanceBandIdSortDirection(UseDistanceBandIdSortDir);
    if (UseDistanceBandIdSortOrder != null) out.setUseDistanceBandIdSortOrder(UseDistanceBandIdSortOrder);

    Filter[] UseDistanceBandIdFilter = DataHelper.mapToFilterArray(UseDistanceBandIdMap, Integer.class);
    if (UseDistanceBandIdFilter != null) {
      IntegerFilter[] UseDistanceBandIdFilters = new IntegerFilter[UseDistanceBandIdFilter.length];
      for (int i = 0; i < UseDistanceBandIdFilters.length; i++) {
        UseDistanceBandIdFilters[i] = (IntegerFilter)UseDistanceBandIdFilter[i];
      }
      try {
        out.setUseDistanceBandIdFilter(UseDistanceBandIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseDefaultRateTypeMap = (Map)record.get("UseDefaultRateType");
    Boolean UseDefaultRateTypeFetch = DataHelper.getFetch(UseDefaultRateTypeMap);
    Boolean UseDefaultRateTypeSortDir = DataHelper.getSortDirection(UseDefaultRateTypeMap);
    Integer UseDefaultRateTypeSortOrder = DataHelper.getSortOrder(UseDefaultRateTypeMap);
    if (UseDefaultRateTypeFetch != null) out.setUseDefaultRateTypeFetch(UseDefaultRateTypeFetch);
    if (UseDefaultRateTypeSortDir != null) out.setUseDefaultRateTypeSortDirection(UseDefaultRateTypeSortDir);
    if (UseDefaultRateTypeSortOrder != null) out.setUseDefaultRateTypeSortOrder(UseDefaultRateTypeSortOrder);

    Filter[] UseDefaultRateTypeFilter = DataHelper.mapToFilterArray(UseDefaultRateTypeMap, Integer.class);
    if (UseDefaultRateTypeFilter != null) {
      IntegerFilter[] UseDefaultRateTypeFilters = new IntegerFilter[UseDefaultRateTypeFilter.length];
      for (int i = 0; i < UseDefaultRateTypeFilters.length; i++) {
        UseDefaultRateTypeFilters[i] = (IntegerFilter)UseDefaultRateTypeFilter[i];
      }
      try {
        out.setUseDefaultRateTypeFilter(UseDefaultRateTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateCurrencyLocationMap = (Map)record.get("RateCurrencyLocation");
    Boolean RateCurrencyLocationFetch = DataHelper.getFetch(RateCurrencyLocationMap);
    Boolean RateCurrencyLocationSortDir = DataHelper.getSortDirection(RateCurrencyLocationMap);
    Integer RateCurrencyLocationSortOrder = DataHelper.getSortOrder(RateCurrencyLocationMap);
    if (RateCurrencyLocationFetch != null) out.setRateCurrencyLocationFetch(RateCurrencyLocationFetch);
    if (RateCurrencyLocationSortDir != null) out.setRateCurrencyLocationSortDirection(RateCurrencyLocationSortDir);
    if (RateCurrencyLocationSortOrder != null) out.setRateCurrencyLocationSortOrder(RateCurrencyLocationSortOrder);

    Filter[] RateCurrencyLocationFilter = DataHelper.mapToFilterArray(RateCurrencyLocationMap, Integer.class);
    if (RateCurrencyLocationFilter != null) {
      IntegerFilter[] RateCurrencyLocationFilters = new IntegerFilter[RateCurrencyLocationFilter.length];
      for (int i = 0; i < RateCurrencyLocationFilters.length; i++) {
        RateCurrencyLocationFilters[i] = (IntegerFilter)RateCurrencyLocationFilter[i];
      }
      try {
        out.setRateCurrencyLocationFilter(RateCurrencyLocationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatePeriodRoundingMap = (Map)record.get("RatePeriodRounding");
    Boolean RatePeriodRoundingFetch = DataHelper.getFetch(RatePeriodRoundingMap);
    Boolean RatePeriodRoundingSortDir = DataHelper.getSortDirection(RatePeriodRoundingMap);
    Integer RatePeriodRoundingSortOrder = DataHelper.getSortOrder(RatePeriodRoundingMap);
    if (RatePeriodRoundingFetch != null) out.setRatePeriodRoundingFetch(RatePeriodRoundingFetch);
    if (RatePeriodRoundingSortDir != null) out.setRatePeriodRoundingSortDirection(RatePeriodRoundingSortDir);
    if (RatePeriodRoundingSortOrder != null) out.setRatePeriodRoundingSortOrder(RatePeriodRoundingSortOrder);

    Filter[] RatePeriodRoundingFilter = DataHelper.mapToFilterArray(RatePeriodRoundingMap, Integer.class);
    if (RatePeriodRoundingFilter != null) {
      IntegerFilter[] RatePeriodRoundingFilters = new IntegerFilter[RatePeriodRoundingFilter.length];
      for (int i = 0; i < RatePeriodRoundingFilters.length; i++) {
        RatePeriodRoundingFilters[i] = (IntegerFilter)RatePeriodRoundingFilter[i];
      }
      try {
        out.setRatePeriodRoundingFilter(RatePeriodRoundingFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateMinimumDurationMap = (Map)record.get("RateMinimumDuration");
    Boolean RateMinimumDurationFetch = DataHelper.getFetch(RateMinimumDurationMap);
    Boolean RateMinimumDurationSortDir = DataHelper.getSortDirection(RateMinimumDurationMap);
    Integer RateMinimumDurationSortOrder = DataHelper.getSortOrder(RateMinimumDurationMap);
    if (RateMinimumDurationFetch != null) out.setRateMinimumDurationFetch(RateMinimumDurationFetch);
    if (RateMinimumDurationSortDir != null) out.setRateMinimumDurationSortDirection(RateMinimumDurationSortDir);
    if (RateMinimumDurationSortOrder != null) out.setRateMinimumDurationSortOrder(RateMinimumDurationSortOrder);

    Filter[] RateMinimumDurationFilter = DataHelper.mapToFilterArray(RateMinimumDurationMap, Integer.class);
    if (RateMinimumDurationFilter != null) {
      IntegerFilter[] RateMinimumDurationFilters = new IntegerFilter[RateMinimumDurationFilter.length];
      for (int i = 0; i < RateMinimumDurationFilters.length; i++) {
        RateMinimumDurationFilters[i] = (IntegerFilter)RateMinimumDurationFilter[i];
      }
      try {
        out.setRateMinimumDurationFilter(RateMinimumDurationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseComponentIdMap = (Map)record.get("UseComponentId");
    Boolean UseComponentIdFetch = DataHelper.getFetch(UseComponentIdMap);
    Boolean UseComponentIdSortDir = DataHelper.getSortDirection(UseComponentIdMap);
    Integer UseComponentIdSortOrder = DataHelper.getSortOrder(UseComponentIdMap);
    if (UseComponentIdFetch != null) out.setUseComponentIdFetch(UseComponentIdFetch);
    if (UseComponentIdSortDir != null) out.setUseComponentIdSortDirection(UseComponentIdSortDir);
    if (UseComponentIdSortOrder != null) out.setUseComponentIdSortOrder(UseComponentIdSortOrder);

    Filter[] UseComponentIdFilter = DataHelper.mapToFilterArray(UseComponentIdMap, Integer.class);
    if (UseComponentIdFilter != null) {
      IntegerFilter[] UseComponentIdFilters = new IntegerFilter[UseComponentIdFilter.length];
      for (int i = 0; i < UseComponentIdFilters.length; i++) {
        UseComponentIdFilters[i] = (IntegerFilter)UseComponentIdFilter[i];
      }
      try {
        out.setUseComponentIdFilter(UseComponentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinBillingUnitsMap = (Map)record.get("MinBillingUnits");
    Boolean MinBillingUnitsFetch = DataHelper.getFetch(MinBillingUnitsMap);
    Boolean MinBillingUnitsSortDir = DataHelper.getSortDirection(MinBillingUnitsMap);
    Integer MinBillingUnitsSortOrder = DataHelper.getSortOrder(MinBillingUnitsMap);
    if (MinBillingUnitsFetch != null) out.setMinBillingUnitsFetch(MinBillingUnitsFetch);
    if (MinBillingUnitsSortDir != null) out.setMinBillingUnitsSortDirection(MinBillingUnitsSortDir);
    if (MinBillingUnitsSortOrder != null) out.setMinBillingUnitsSortOrder(MinBillingUnitsSortOrder);

    Filter[] MinBillingUnitsFilter = DataHelper.mapToFilterArray(MinBillingUnitsMap, BigInteger.class);
    if (MinBillingUnitsFilter != null) {
      BigIntegerFilter[] MinBillingUnitsFilters = new BigIntegerFilter[MinBillingUnitsFilter.length];
      for (int i = 0; i < MinBillingUnitsFilters.length; i++) {
        MinBillingUnitsFilters[i] = (BigIntegerFilter)MinBillingUnitsFilter[i];
      }
      try {
        out.setMinBillingUnitsFilter(MinBillingUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConsolidateUsageMap = (Map)record.get("ConsolidateUsage");
    Boolean ConsolidateUsageFetch = DataHelper.getFetch(ConsolidateUsageMap);
    Boolean ConsolidateUsageSortDir = DataHelper.getSortDirection(ConsolidateUsageMap);
    Integer ConsolidateUsageSortOrder = DataHelper.getSortOrder(ConsolidateUsageMap);
    if (ConsolidateUsageFetch != null) out.setConsolidateUsageFetch(ConsolidateUsageFetch);
    if (ConsolidateUsageSortDir != null) out.setConsolidateUsageSortDirection(ConsolidateUsageSortDir);
    if (ConsolidateUsageSortOrder != null) out.setConsolidateUsageSortOrder(ConsolidateUsageSortOrder);

    Filter[] ConsolidateUsageFilter = DataHelper.mapToFilterArray(ConsolidateUsageMap, Boolean.class);
    if (ConsolidateUsageFilter != null) {
      BooleanFilter[] ConsolidateUsageFilters = new BooleanFilter[ConsolidateUsageFilter.length];
      for (int i = 0; i < ConsolidateUsageFilters.length; i++) {
        ConsolidateUsageFilters[i] = (BooleanFilter)ConsolidateUsageFilter[i];
      }
      try {
        out.setConsolidateUsageFilter(ConsolidateUsageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NetworkDelayMap = (Map)record.get("NetworkDelay");
    Boolean NetworkDelayFetch = DataHelper.getFetch(NetworkDelayMap);
    Boolean NetworkDelaySortDir = DataHelper.getSortDirection(NetworkDelayMap);
    Integer NetworkDelaySortOrder = DataHelper.getSortOrder(NetworkDelayMap);
    if (NetworkDelayFetch != null) out.setNetworkDelayFetch(NetworkDelayFetch);
    if (NetworkDelaySortDir != null) out.setNetworkDelaySortDirection(NetworkDelaySortDir);
    if (NetworkDelaySortOrder != null) out.setNetworkDelaySortOrder(NetworkDelaySortOrder);

    Filter[] NetworkDelayFilter = DataHelper.mapToFilterArray(NetworkDelayMap, Integer.class);
    if (NetworkDelayFilter != null) {
      IntegerFilter[] NetworkDelayFilters = new IntegerFilter[NetworkDelayFilter.length];
      for (int i = 0; i < NetworkDelayFilters.length; i++) {
        NetworkDelayFilters[i] = (IntegerFilter)NetworkDelayFilter[i];
      }
      try {
        out.setNetworkDelayFilter(NetworkDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatingMethodMap = (Map)record.get("RatingMethod");
    Boolean RatingMethodFetch = DataHelper.getFetch(RatingMethodMap);
    Boolean RatingMethodSortDir = DataHelper.getSortDirection(RatingMethodMap);
    Integer RatingMethodSortOrder = DataHelper.getSortOrder(RatingMethodMap);
    if (RatingMethodFetch != null) out.setRatingMethodFetch(RatingMethodFetch);
    if (RatingMethodSortDir != null) out.setRatingMethodSortDirection(RatingMethodSortDir);
    if (RatingMethodSortOrder != null) out.setRatingMethodSortOrder(RatingMethodSortOrder);

    Filter[] RatingMethodFilter = DataHelper.mapToFilterArray(RatingMethodMap, Integer.class);
    if (RatingMethodFilter != null) {
      IntegerFilter[] RatingMethodFilters = new IntegerFilter[RatingMethodFilter.length];
      for (int i = 0; i < RatingMethodFilters.length; i++) {
        RatingMethodFilters[i] = (IntegerFilter)RatingMethodFilter[i];
      }
      try {
        out.setRatingMethodFilter(RatingMethodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseZoneClassMap = (Map)record.get("UseZoneClass");
    Boolean UseZoneClassFetch = DataHelper.getFetch(UseZoneClassMap);
    Boolean UseZoneClassSortDir = DataHelper.getSortDirection(UseZoneClassMap);
    Integer UseZoneClassSortOrder = DataHelper.getSortOrder(UseZoneClassMap);
    if (UseZoneClassFetch != null) out.setUseZoneClassFetch(UseZoneClassFetch);
    if (UseZoneClassSortDir != null) out.setUseZoneClassSortDirection(UseZoneClassSortDir);
    if (UseZoneClassSortOrder != null) out.setUseZoneClassSortOrder(UseZoneClassSortOrder);

    Filter[] UseZoneClassFilter = DataHelper.mapToFilterArray(UseZoneClassMap, Integer.class);
    if (UseZoneClassFilter != null) {
      IntegerFilter[] UseZoneClassFilters = new IntegerFilter[UseZoneClassFilter.length];
      for (int i = 0; i < UseZoneClassFilters.length; i++) {
        UseZoneClassFilters[i] = (IntegerFilter)UseZoneClassFilter[i];
      }
      try {
        out.setUseZoneClassFilter(UseZoneClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
