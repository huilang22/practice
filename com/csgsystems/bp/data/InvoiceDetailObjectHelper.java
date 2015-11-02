/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailObjectHelper.java
 * Definition File: Customer/InvoiceDetail.xml
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


/** Helper class to convert InvoiceDetailObject JavaBean objects to/from HashMaps.
 */
public class InvoiceDetailObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceDetailObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceDetailObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceDetailObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceDetailObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceDetailObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceDetailObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceDetailObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceDetailObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceDetailObjectData the converted object
   */
  public static InvoiceDetailObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceDetailObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceDetailObject")
   * @return InvoiceDetailObjectData the converted object
   */
  public static InvoiceDetailObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceDetailObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceDetailObjectFilter the converted object
   */
  public static InvoiceDetailObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceDetailObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceDetailObject")
   * @return InvoiceDetailObjectFilter the converted object
   */
  public static InvoiceDetailObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceDetailObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceDetailObjectDataList the converted object
   */
  public static InvoiceDetailObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceDetailObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceDetailObjectList")
   * @return InvoiceDetailObjectDataList the converted object
   */
  public static InvoiceDetailObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceDetailObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceDetailObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceDetailObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceDetailObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceDetailObjectDataList (array, index, total);
  }
  /** convert InvoiceDetailObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceDetailObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", InvoiceDetailObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._BillSequenceNumSet) record.put ("BillSequenceNum", in.BillSequenceNum);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._ProcessNumSet) record.put ("ProcessNum", in.ProcessNum);
  
    if (in._PackageIdSet) record.put ("PackageId", in.PackageId);
  
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._TypeCodeSet) record.put ("TypeCode", in.TypeCode);
  
    if (in._SubtypeCodeSet) record.put ("SubtypeCode", in.SubtypeCode);
  
    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._TrackingDateSet) record.put ("TrackingDate", in.TrackingDate);
  
    if (in._PrepSequenceSet) record.put ("PrepSequence", in.PrepSequence);
  
    if (in._ProrateCodeSet) record.put ("ProrateCode", in.ProrateCode);
  
    if (in._BillingLevelSet) record.put ("BillingLevel", in.BillingLevel);
  
    if (in._BillingCategorySet) record.put ("BillingCategory", in.BillingCategory);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._RatedAmountSet) record.put ("RatedAmount", in.RatedAmount);
  
    if (in._SecondaryAmountSet) record.put ("SecondaryAmount", in.SecondaryAmount);
  
    if (in._RateCurrencyCodeSet) record.put ("RateCurrencyCode", in.RateCurrencyCode);
  
    if (in._UnitsSet) record.put ("Units", in.Units);
  
    if (in._TaxSet) record.put ("Tax", in.Tax);
  
    if (in._TaxRateSet) record.put ("TaxRate", in.TaxRate);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._DiscountSet) record.put ("Discount", in.Discount);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._ProviderIdSet) record.put ("ProviderId", in.ProviderId);
  
    if (in._ElementIdSet) record.put ("ElementId", in.ElementId);
  
    if (in._ProductLineIdSet) record.put ("ProductLineId", in.ProductLineId);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._RateTypeSet) record.put ("RateType", in.RateType);
  
    if (in._RatePeriodSet) record.put ("RatePeriod", in.RatePeriod);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._EquipStatusSet) record.put ("EquipStatus", in.EquipStatus);
  
    if (in._FromDateSet) record.put ("FromDate", in.FromDate);
  
    if (in._ToDateSet) record.put ("ToDate", in.ToDate);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
  
    if (in._AuxTaxInfoSet) record.put ("AuxTaxInfo", in.AuxTaxInfo);
  
    if (in._FederalTaxSet) record.put ("FederalTax", in.FederalTax);
  
    if (in._StateTaxSet) record.put ("StateTax", in.StateTax);
  
    if (in._CountyTaxSet) record.put ("CountyTax", in.CountyTax);
  
    if (in._CityTaxSet) record.put ("CityTax", in.CityTax);
  
    if (in._OtherTaxSet) record.put ("OtherTax", in.OtherTax);
  
    if (in._TestFlagSet) record.put ("TestFlag", in.TestFlag);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._RevRcvCostCtrSet) record.put ("RevRcvCostCtr", in.RevRcvCostCtr);
  
    if (in._BRevRcvCostCtrSet) record.put ("BRevRcvCostCtr", in.BRevRcvCostCtr);
  
    if (in._AggrUsageIdSet) record.put ("AggrUsageId", in.AggrUsageId);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._AmountReductionSet) record.put ("AmountReduction", in.AmountReduction);
  
    if (in._AmountReductionIdSet) record.put ("AmountReductionId", in.AmountReductionId);
  
    if (in._ZoneClassSet) record.put ("ZoneClass", in.ZoneClass);
  
    if (in._BillClassSet) record.put ("BillClass", in.BillClass);
  
    if (in._InclusiveTaxSet) record.put ("InclusiveTax", in.InclusiveTax);
  
    if (in._PcmActiveDtSet) record.put ("PcmActiveDt", in.PcmActiveDt);
  
    if (in._MiscNumber1Set) record.put ("MiscNumber1", in.MiscNumber1);
  
    if (in._MiscNumber2Set) record.put ("MiscNumber2", in.MiscNumber2);
  
    if (in._LobIdSet) record.put ("LobId", in.LobId);
  
    if (in._DescriptionGroupSet) record.put ("DescriptionGroup", in.DescriptionGroup);
  
    if (in._DescriptionTextSet) record.put ("DescriptionText", in.DescriptionText);
  
    if (in._ShortDescriptionTextSet) record.put ("ShortDescriptionText", in.ShortDescriptionText);
      return record;
  }
  /** convert InvoiceDetailObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceDetailObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", InvoiceDetailObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.BillSequenceNum, in.BillSequenceNumSort, in.BillSequenceNumSortAscending, in.BillSequenceNumFetch);
      if (map != null) record.put ("BillSequenceNum", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch); 
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.ProcessNum, in.ProcessNumSort, in.ProcessNumSortAscending, in.ProcessNumFetch, in.ProcessNumCaseInsensitive);
      if (map != null) record.put ("ProcessNum", map);
      map = DataHelper.filterToMap (in.PackageId, in.PackageIdSort, in.PackageIdSortAscending, in.PackageIdFetch);
      if (map != null) record.put ("PackageId", map);
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.TypeCode, in.TypeCodeSort, in.TypeCodeSortAscending, in.TypeCodeFetch);
      if (map != null) record.put ("TypeCode", map);
      map = DataHelper.filterToMap (in.SubtypeCode, in.SubtypeCodeSort, in.SubtypeCodeSortAscending, in.SubtypeCodeFetch);
      if (map != null) record.put ("SubtypeCode", map);
      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.TrackingDate, in.TrackingDateSort, in.TrackingDateSortAscending, in.TrackingDateFetch);
      if (map != null) record.put ("TrackingDate", map);
      map = DataHelper.filterToMap (in.PrepSequence, in.PrepSequenceSort, in.PrepSequenceSortAscending, in.PrepSequenceFetch);
      if (map != null) record.put ("PrepSequence", map);
      map = DataHelper.filterToMap (in.ProrateCode, in.ProrateCodeSort, in.ProrateCodeSortAscending, in.ProrateCodeFetch);
      if (map != null) record.put ("ProrateCode", map);
      map = DataHelper.filterToMap (in.BillingLevel, in.BillingLevelSort, in.BillingLevelSortAscending, in.BillingLevelFetch);
      if (map != null) record.put ("BillingLevel", map);
      map = DataHelper.filterToMap (in.BillingCategory, in.BillingCategorySort, in.BillingCategorySortAscending, in.BillingCategoryFetch);
      if (map != null) record.put ("BillingCategory", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.RatedAmount, in.RatedAmountSort, in.RatedAmountSortAscending, in.RatedAmountFetch);
      if (map != null) record.put ("RatedAmount", map);
      map = DataHelper.filterToMap (in.SecondaryAmount, in.SecondaryAmountSort, in.SecondaryAmountSortAscending, in.SecondaryAmountFetch);
      if (map != null) record.put ("SecondaryAmount", map);
      map = DataHelper.filterToMap (in.RateCurrencyCode, in.RateCurrencyCodeSort, in.RateCurrencyCodeSortAscending, in.RateCurrencyCodeFetch);
      if (map != null) record.put ("RateCurrencyCode", map);
      map = DataHelper.filterToMap (in.Units, in.UnitsSort, in.UnitsSortAscending, in.UnitsFetch);
      if (map != null) record.put ("Units", map);
      map = DataHelper.filterToMap (in.Tax, in.TaxSort, in.TaxSortAscending, in.TaxFetch);
      if (map != null) record.put ("Tax", map);
      map = DataHelper.filterToMap (in.TaxRate, in.TaxRateSort, in.TaxRateSortAscending, in.TaxRateFetch);
      if (map != null) record.put ("TaxRate", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.Discount, in.DiscountSort, in.DiscountSortAscending, in.DiscountFetch);
      if (map != null) record.put ("Discount", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.ProviderId, in.ProviderIdSort, in.ProviderIdSortAscending, in.ProviderIdFetch);
      if (map != null) record.put ("ProviderId", map);
      map = DataHelper.filterToMap (in.ElementId, in.ElementIdSort, in.ElementIdSortAscending, in.ElementIdFetch);
      if (map != null) record.put ("ElementId", map);
      map = DataHelper.filterToMap (in.ProductLineId, in.ProductLineIdSort, in.ProductLineIdSortAscending, in.ProductLineIdFetch);
      if (map != null) record.put ("ProductLineId", map);
      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.RateType, in.RateTypeSort, in.RateTypeSortAscending, in.RateTypeFetch);
      if (map != null) record.put ("RateType", map);
      map = DataHelper.filterToMap (in.RatePeriod, in.RatePeriodSort, in.RatePeriodSortAscending, in.RatePeriodFetch, in.RatePeriodCaseInsensitive);
      if (map != null) record.put ("RatePeriod", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.EquipStatus, in.EquipStatusSort, in.EquipStatusSortAscending, in.EquipStatusFetch);
      if (map != null) record.put ("EquipStatus", map);
      map = DataHelper.filterToMap (in.FromDate, in.FromDateSort, in.FromDateSortAscending, in.FromDateFetch);
      if (map != null) record.put ("FromDate", map);
      map = DataHelper.filterToMap (in.ToDate, in.ToDateSort, in.ToDateSortAscending, in.ToDateFetch);
      if (map != null) record.put ("ToDate", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive);
      if (map != null) record.put ("Geocode", map);
      map = DataHelper.filterToMap (in.AuxTaxInfo, in.AuxTaxInfoSort, in.AuxTaxInfoSortAscending, in.AuxTaxInfoFetch, in.AuxTaxInfoCaseInsensitive);
      if (map != null) record.put ("AuxTaxInfo", map);
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
      map = DataHelper.filterToMap (in.TestFlag, in.TestFlagSort, in.TestFlagSortAscending, in.TestFlagFetch);
      if (map != null) record.put ("TestFlag", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.RevRcvCostCtr, in.RevRcvCostCtrSort, in.RevRcvCostCtrSortAscending, in.RevRcvCostCtrFetch);
      if (map != null) record.put ("RevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.BRevRcvCostCtr, in.BRevRcvCostCtrSort, in.BRevRcvCostCtrSortAscending, in.BRevRcvCostCtrFetch);
      if (map != null) record.put ("BRevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.AggrUsageId, in.AggrUsageIdSort, in.AggrUsageIdSortAscending, in.AggrUsageIdFetch);
      if (map != null) record.put ("AggrUsageId", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.AmountReduction, in.AmountReductionSort, in.AmountReductionSortAscending, in.AmountReductionFetch);
      if (map != null) record.put ("AmountReduction", map);
      map = DataHelper.filterToMap (in.AmountReductionId, in.AmountReductionIdSort, in.AmountReductionIdSortAscending, in.AmountReductionIdFetch);
      if (map != null) record.put ("AmountReductionId", map);
      map = DataHelper.filterToMap (in.ZoneClass, in.ZoneClassSort, in.ZoneClassSortAscending, in.ZoneClassFetch);
      if (map != null) record.put ("ZoneClass", map);
      map = DataHelper.filterToMap (in.BillClass, in.BillClassSort, in.BillClassSortAscending, in.BillClassFetch);
      if (map != null) record.put ("BillClass", map);
      map = DataHelper.filterToMap (in.InclusiveTax, in.InclusiveTaxSort, in.InclusiveTaxSortAscending, in.InclusiveTaxFetch);
      if (map != null) record.put ("InclusiveTax", map);
      map = DataHelper.filterToMap (in.PcmActiveDt, in.PcmActiveDtSort, in.PcmActiveDtSortAscending, in.PcmActiveDtFetch);
      if (map != null) record.put ("PcmActiveDt", map);
      map = DataHelper.filterToMap (in.MiscNumber1, in.MiscNumber1Sort, in.MiscNumber1SortAscending, in.MiscNumber1Fetch);
      if (map != null) record.put ("MiscNumber1", map);
      map = DataHelper.filterToMap (in.MiscNumber2, in.MiscNumber2Sort, in.MiscNumber2SortAscending, in.MiscNumber2Fetch);
      if (map != null) record.put ("MiscNumber2", map);
      map = DataHelper.filterToMap (in.LobId, in.LobIdSort, in.LobIdSortAscending, in.LobIdFetch);
      if (map != null) record.put ("LobId", map);
      map = DataHelper.filterToMap (in.DescriptionGroup, in.DescriptionGroupSort, in.DescriptionGroupSortAscending, in.DescriptionGroupFetch);
      if (map != null) record.put ("DescriptionGroup", map);
      map = DataHelper.filterToMap (in.DescriptionText, in.DescriptionTextSort, in.DescriptionTextSortAscending, in.DescriptionTextFetch, in.DescriptionTextCaseInsensitive);
      if (map != null) record.put ("DescriptionText", map);
      map = DataHelper.filterToMap (in.ShortDescriptionText, in.ShortDescriptionTextSort, in.ShortDescriptionTextSortAscending, in.ShortDescriptionTextFetch, in.ShortDescriptionTextCaseInsensitive);
      if (map != null) record.put ("ShortDescriptionText", map);
    return record;
  }
  /** convert Map to InvoiceDetailObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceDetailObjectData the converted object
   */
  public static InvoiceDetailObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceDetailObjectData out = new InvoiceDetailObjectData ();

    out.Key = InvoiceDetailObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillSequenceNum")) != null)
    {
      out.BillSequenceNum = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProcessNum")) != null)
    {
      out.ProcessNum = (String) obj;
    }
  
    if ((obj = record.get ("PackageId")) != null)
    {
      out.PackageId = (Integer) obj;
    }
  
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("TypeCode")) != null)
    {
      out.TypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("SubtypeCode")) != null)
    {
      out.SubtypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingDate")) != null)
    {
      out.TrackingDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrepSequence")) != null)
    {
      out.PrepSequence = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateCode")) != null)
    {
      out.ProrateCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingLevel")) != null)
    {
      out.BillingLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingCategory")) != null)
    {
      out.BillingCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RatedAmount")) != null)
    {
      out.RatedAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SecondaryAmount")) != null)
    {
      out.SecondaryAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RateCurrencyCode")) != null)
    {
      out.RateCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Units")) != null)
    {
      out.Units = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Tax")) != null)
    {
      out.Tax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TaxRate")) != null)
    {
      out.TaxRate = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("Discount")) != null)
    {
      out.Discount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("ProviderId")) != null)
    {
      out.ProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("ElementId")) != null)
    {
      out.ElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProductLineId")) != null)
    {
      out.ProductLineId = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateType")) != null)
    {
      out.RateType = (Integer) obj;
    }
  
    if ((obj = record.get ("RatePeriod")) != null)
    {
      out.RatePeriod = (String) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("EquipStatus")) != null)
    {
      out.EquipStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("FromDate")) != null)
    {
      out.FromDate = (Date) obj;
    }
  
    if ((obj = record.get ("ToDate")) != null)
    {
      out.ToDate = (Date) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
  
    if ((obj = record.get ("AuxTaxInfo")) != null)
    {
      out.AuxTaxInfo = (String) obj;
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
  
    if ((obj = record.get ("TestFlag")) != null)
    {
      out.TestFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("RevRcvCostCtr")) != null)
    {
      out.RevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("BRevRcvCostCtr")) != null)
    {
      out.BRevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("AggrUsageId")) != null)
    {
      out.AggrUsageId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("AmountReduction")) != null)
    {
      out.AmountReduction = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AmountReductionId")) != null)
    {
      out.AmountReductionId = (Integer) obj;
    }
  
    if ((obj = record.get ("ZoneClass")) != null)
    {
      out.ZoneClass = (Integer) obj;
    }
  
    if ((obj = record.get ("BillClass")) != null)
    {
      out.BillClass = (Integer) obj;
    }
  
    if ((obj = record.get ("InclusiveTax")) != null)
    {
      out.InclusiveTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PcmActiveDt")) != null)
    {
      out.PcmActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("MiscNumber1")) != null)
    {
      out.MiscNumber1 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("MiscNumber2")) != null)
    {
      out.MiscNumber2 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LobId")) != null)
    {
      out.LobId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DescriptionGroup")) != null)
    {
      out.DescriptionGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionText")) != null)
    {
      out.DescriptionText = (String) obj;
    }
  
    if ((obj = record.get ("ShortDescriptionText")) != null)
    {
      out.ShortDescriptionText = (String) obj;
    }
      return out;
  }
  /** convert Map to InvoiceDetailObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceDetailObjectFilter the converted object
   */
  public static InvoiceDetailObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceDetailObjectFilter out = new InvoiceDetailObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = InvoiceDetailObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map StatementDateMap = (Map)record.get("StatementDate");
    Boolean StatementDateFetch = DataHelper.getFetch(StatementDateMap);
    Boolean StatementDateSortDir = DataHelper.getSortDirection(StatementDateMap);
    Integer StatementDateSortOrder = DataHelper.getSortOrder(StatementDateMap);
    if (StatementDateFetch != null) out.setStatementDateFetch(StatementDateFetch);
    if (StatementDateSortDir != null) out.setStatementDateSortDirection(StatementDateSortDir);
    if (StatementDateSortOrder != null) out.setStatementDateSortOrder(StatementDateSortOrder);

    Filter[] StatementDateFilter = DataHelper.mapToFilterArray(StatementDateMap, Date.class);
    if (StatementDateFilter != null) {
      DateFilter[] StatementDateFilters = new DateFilter[StatementDateFilter.length];
      for (int i = 0; i < StatementDateFilters.length; i++) {
        StatementDateFilters[i] = (DateFilter)StatementDateFilter[i];
      }
      try {
        out.setStatementDateFilter(StatementDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillSequenceNumMap = (Map)record.get("BillSequenceNum");
    Boolean BillSequenceNumFetch = DataHelper.getFetch(BillSequenceNumMap);
    Boolean BillSequenceNumSortDir = DataHelper.getSortDirection(BillSequenceNumMap);
    Integer BillSequenceNumSortOrder = DataHelper.getSortOrder(BillSequenceNumMap);
    if (BillSequenceNumFetch != null) out.setBillSequenceNumFetch(BillSequenceNumFetch);
    if (BillSequenceNumSortDir != null) out.setBillSequenceNumSortDirection(BillSequenceNumSortDir);
    if (BillSequenceNumSortOrder != null) out.setBillSequenceNumSortOrder(BillSequenceNumSortOrder);

    Filter[] BillSequenceNumFilter = DataHelper.mapToFilterArray(BillSequenceNumMap, Integer.class);
    if (BillSequenceNumFilter != null) {
      IntegerFilter[] BillSequenceNumFilters = new IntegerFilter[BillSequenceNumFilter.length];
      for (int i = 0; i < BillSequenceNumFilters.length; i++) {
        BillSequenceNumFilters[i] = (IntegerFilter)BillSequenceNumFilter[i];
      }
      try {
        out.setBillSequenceNumFilter(BillSequenceNumFilters);
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
  
    Map ProcessNumMap = (Map)record.get("ProcessNum");
    Boolean ProcessNumFetch = DataHelper.getFetch(ProcessNumMap);
    Boolean ProcessNumSortDir = DataHelper.getSortDirection(ProcessNumMap);
    Integer ProcessNumSortOrder = DataHelper.getSortOrder(ProcessNumMap);
    if (ProcessNumFetch != null) out.setProcessNumFetch(ProcessNumFetch);
    if (ProcessNumSortDir != null) out.setProcessNumSortDirection(ProcessNumSortDir);
    if (ProcessNumSortOrder != null) out.setProcessNumSortOrder(ProcessNumSortOrder);

    Filter[] ProcessNumFilter = DataHelper.mapToFilterArray(ProcessNumMap, String.class);
    if (ProcessNumFilter != null) {
      StringFilter[] ProcessNumFilters = new StringFilter[ProcessNumFilter.length];
      for (int i = 0; i < ProcessNumFilters.length; i++) {
        ProcessNumFilters[i] = (StringFilter)ProcessNumFilter[i];
      }
      try {
        out.setProcessNumFilter(ProcessNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PackageIdMap = (Map)record.get("PackageId");
    Boolean PackageIdFetch = DataHelper.getFetch(PackageIdMap);
    Boolean PackageIdSortDir = DataHelper.getSortDirection(PackageIdMap);
    Integer PackageIdSortOrder = DataHelper.getSortOrder(PackageIdMap);
    if (PackageIdFetch != null) out.setPackageIdFetch(PackageIdFetch);
    if (PackageIdSortDir != null) out.setPackageIdSortDirection(PackageIdSortDir);
    if (PackageIdSortOrder != null) out.setPackageIdSortOrder(PackageIdSortOrder);

    Filter[] PackageIdFilter = DataHelper.mapToFilterArray(PackageIdMap, Integer.class);
    if (PackageIdFilter != null) {
      IntegerFilter[] PackageIdFilters = new IntegerFilter[PackageIdFilter.length];
      for (int i = 0; i < PackageIdFilters.length; i++) {
        PackageIdFilters[i] = (IntegerFilter)PackageIdFilter[i];
      }
      try {
        out.setPackageIdFilter(PackageIdFilters);
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
  
    Map TypeCodeMap = (Map)record.get("TypeCode");
    Boolean TypeCodeFetch = DataHelper.getFetch(TypeCodeMap);
    Boolean TypeCodeSortDir = DataHelper.getSortDirection(TypeCodeMap);
    Integer TypeCodeSortOrder = DataHelper.getSortOrder(TypeCodeMap);
    if (TypeCodeFetch != null) out.setTypeCodeFetch(TypeCodeFetch);
    if (TypeCodeSortDir != null) out.setTypeCodeSortDirection(TypeCodeSortDir);
    if (TypeCodeSortOrder != null) out.setTypeCodeSortOrder(TypeCodeSortOrder);

    Filter[] TypeCodeFilter = DataHelper.mapToFilterArray(TypeCodeMap, Integer.class);
    if (TypeCodeFilter != null) {
      IntegerFilter[] TypeCodeFilters = new IntegerFilter[TypeCodeFilter.length];
      for (int i = 0; i < TypeCodeFilters.length; i++) {
        TypeCodeFilters[i] = (IntegerFilter)TypeCodeFilter[i];
      }
      try {
        out.setTypeCodeFilter(TypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubtypeCodeMap = (Map)record.get("SubtypeCode");
    Boolean SubtypeCodeFetch = DataHelper.getFetch(SubtypeCodeMap);
    Boolean SubtypeCodeSortDir = DataHelper.getSortDirection(SubtypeCodeMap);
    Integer SubtypeCodeSortOrder = DataHelper.getSortOrder(SubtypeCodeMap);
    if (SubtypeCodeFetch != null) out.setSubtypeCodeFetch(SubtypeCodeFetch);
    if (SubtypeCodeSortDir != null) out.setSubtypeCodeSortDirection(SubtypeCodeSortDir);
    if (SubtypeCodeSortOrder != null) out.setSubtypeCodeSortOrder(SubtypeCodeSortOrder);

    Filter[] SubtypeCodeFilter = DataHelper.mapToFilterArray(SubtypeCodeMap, Integer.class);
    if (SubtypeCodeFilter != null) {
      IntegerFilter[] SubtypeCodeFilters = new IntegerFilter[SubtypeCodeFilter.length];
      for (int i = 0; i < SubtypeCodeFilters.length; i++) {
        SubtypeCodeFilters[i] = (IntegerFilter)SubtypeCodeFilter[i];
      }
      try {
        out.setSubtypeCodeFilter(SubtypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, Integer.class);
    if (TrackingIdFilter != null) {
      IntegerFilter[] TrackingIdFilters = new IntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (IntegerFilter)TrackingIdFilter[i];
      }
      try {
        out.setTrackingIdFilter(TrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdServMap = (Map)record.get("TrackingIdServ");
    Boolean TrackingIdServFetch = DataHelper.getFetch(TrackingIdServMap);
    Boolean TrackingIdServSortDir = DataHelper.getSortDirection(TrackingIdServMap);
    Integer TrackingIdServSortOrder = DataHelper.getSortOrder(TrackingIdServMap);
    if (TrackingIdServFetch != null) out.setTrackingIdServFetch(TrackingIdServFetch);
    if (TrackingIdServSortDir != null) out.setTrackingIdServSortDirection(TrackingIdServSortDir);
    if (TrackingIdServSortOrder != null) out.setTrackingIdServSortOrder(TrackingIdServSortOrder);

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, Integer.class);
    if (TrackingIdServFilter != null) {
      IntegerFilter[] TrackingIdServFilters = new IntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (IntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingDateMap = (Map)record.get("TrackingDate");
    Boolean TrackingDateFetch = DataHelper.getFetch(TrackingDateMap);
    Boolean TrackingDateSortDir = DataHelper.getSortDirection(TrackingDateMap);
    Integer TrackingDateSortOrder = DataHelper.getSortOrder(TrackingDateMap);
    if (TrackingDateFetch != null) out.setTrackingDateFetch(TrackingDateFetch);
    if (TrackingDateSortDir != null) out.setTrackingDateSortDirection(TrackingDateSortDir);
    if (TrackingDateSortOrder != null) out.setTrackingDateSortOrder(TrackingDateSortOrder);

    Filter[] TrackingDateFilter = DataHelper.mapToFilterArray(TrackingDateMap, Date.class);
    if (TrackingDateFilter != null) {
      DateFilter[] TrackingDateFilters = new DateFilter[TrackingDateFilter.length];
      for (int i = 0; i < TrackingDateFilters.length; i++) {
        TrackingDateFilters[i] = (DateFilter)TrackingDateFilter[i];
      }
      try {
        out.setTrackingDateFilter(TrackingDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepSequenceMap = (Map)record.get("PrepSequence");
    Boolean PrepSequenceFetch = DataHelper.getFetch(PrepSequenceMap);
    Boolean PrepSequenceSortDir = DataHelper.getSortDirection(PrepSequenceMap);
    Integer PrepSequenceSortOrder = DataHelper.getSortOrder(PrepSequenceMap);
    if (PrepSequenceFetch != null) out.setPrepSequenceFetch(PrepSequenceFetch);
    if (PrepSequenceSortDir != null) out.setPrepSequenceSortDirection(PrepSequenceSortDir);
    if (PrepSequenceSortOrder != null) out.setPrepSequenceSortOrder(PrepSequenceSortOrder);

    Filter[] PrepSequenceFilter = DataHelper.mapToFilterArray(PrepSequenceMap, Integer.class);
    if (PrepSequenceFilter != null) {
      IntegerFilter[] PrepSequenceFilters = new IntegerFilter[PrepSequenceFilter.length];
      for (int i = 0; i < PrepSequenceFilters.length; i++) {
        PrepSequenceFilters[i] = (IntegerFilter)PrepSequenceFilter[i];
      }
      try {
        out.setPrepSequenceFilter(PrepSequenceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateCodeMap = (Map)record.get("ProrateCode");
    Boolean ProrateCodeFetch = DataHelper.getFetch(ProrateCodeMap);
    Boolean ProrateCodeSortDir = DataHelper.getSortDirection(ProrateCodeMap);
    Integer ProrateCodeSortOrder = DataHelper.getSortOrder(ProrateCodeMap);
    if (ProrateCodeFetch != null) out.setProrateCodeFetch(ProrateCodeFetch);
    if (ProrateCodeSortDir != null) out.setProrateCodeSortDirection(ProrateCodeSortDir);
    if (ProrateCodeSortOrder != null) out.setProrateCodeSortOrder(ProrateCodeSortOrder);

    Filter[] ProrateCodeFilter = DataHelper.mapToFilterArray(ProrateCodeMap, Integer.class);
    if (ProrateCodeFilter != null) {
      IntegerFilter[] ProrateCodeFilters = new IntegerFilter[ProrateCodeFilter.length];
      for (int i = 0; i < ProrateCodeFilters.length; i++) {
        ProrateCodeFilters[i] = (IntegerFilter)ProrateCodeFilter[i];
      }
      try {
        out.setProrateCodeFilter(ProrateCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingLevelMap = (Map)record.get("BillingLevel");
    Boolean BillingLevelFetch = DataHelper.getFetch(BillingLevelMap);
    Boolean BillingLevelSortDir = DataHelper.getSortDirection(BillingLevelMap);
    Integer BillingLevelSortOrder = DataHelper.getSortOrder(BillingLevelMap);
    if (BillingLevelFetch != null) out.setBillingLevelFetch(BillingLevelFetch);
    if (BillingLevelSortDir != null) out.setBillingLevelSortDirection(BillingLevelSortDir);
    if (BillingLevelSortOrder != null) out.setBillingLevelSortOrder(BillingLevelSortOrder);

    Filter[] BillingLevelFilter = DataHelper.mapToFilterArray(BillingLevelMap, Integer.class);
    if (BillingLevelFilter != null) {
      IntegerFilter[] BillingLevelFilters = new IntegerFilter[BillingLevelFilter.length];
      for (int i = 0; i < BillingLevelFilters.length; i++) {
        BillingLevelFilters[i] = (IntegerFilter)BillingLevelFilter[i];
      }
      try {
        out.setBillingLevelFilter(BillingLevelFilters);
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
  
    Map RatedAmountMap = (Map)record.get("RatedAmount");
    Boolean RatedAmountFetch = DataHelper.getFetch(RatedAmountMap);
    Boolean RatedAmountSortDir = DataHelper.getSortDirection(RatedAmountMap);
    Integer RatedAmountSortOrder = DataHelper.getSortOrder(RatedAmountMap);
    if (RatedAmountFetch != null) out.setRatedAmountFetch(RatedAmountFetch);
    if (RatedAmountSortDir != null) out.setRatedAmountSortDirection(RatedAmountSortDir);
    if (RatedAmountSortOrder != null) out.setRatedAmountSortOrder(RatedAmountSortOrder);

    Filter[] RatedAmountFilter = DataHelper.mapToFilterArray(RatedAmountMap, BigInteger.class);
    if (RatedAmountFilter != null) {
      BigIntegerFilter[] RatedAmountFilters = new BigIntegerFilter[RatedAmountFilter.length];
      for (int i = 0; i < RatedAmountFilters.length; i++) {
        RatedAmountFilters[i] = (BigIntegerFilter)RatedAmountFilter[i];
      }
      try {
        out.setRatedAmountFilter(RatedAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SecondaryAmountMap = (Map)record.get("SecondaryAmount");
    Boolean SecondaryAmountFetch = DataHelper.getFetch(SecondaryAmountMap);
    Boolean SecondaryAmountSortDir = DataHelper.getSortDirection(SecondaryAmountMap);
    Integer SecondaryAmountSortOrder = DataHelper.getSortOrder(SecondaryAmountMap);
    if (SecondaryAmountFetch != null) out.setSecondaryAmountFetch(SecondaryAmountFetch);
    if (SecondaryAmountSortDir != null) out.setSecondaryAmountSortDirection(SecondaryAmountSortDir);
    if (SecondaryAmountSortOrder != null) out.setSecondaryAmountSortOrder(SecondaryAmountSortOrder);

    Filter[] SecondaryAmountFilter = DataHelper.mapToFilterArray(SecondaryAmountMap, BigInteger.class);
    if (SecondaryAmountFilter != null) {
      BigIntegerFilter[] SecondaryAmountFilters = new BigIntegerFilter[SecondaryAmountFilter.length];
      for (int i = 0; i < SecondaryAmountFilters.length; i++) {
        SecondaryAmountFilters[i] = (BigIntegerFilter)SecondaryAmountFilter[i];
      }
      try {
        out.setSecondaryAmountFilter(SecondaryAmountFilters);
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
  
    Map UnitsMap = (Map)record.get("Units");
    Boolean UnitsFetch = DataHelper.getFetch(UnitsMap);
    Boolean UnitsSortDir = DataHelper.getSortDirection(UnitsMap);
    Integer UnitsSortOrder = DataHelper.getSortOrder(UnitsMap);
    if (UnitsFetch != null) out.setUnitsFetch(UnitsFetch);
    if (UnitsSortDir != null) out.setUnitsSortDirection(UnitsSortDir);
    if (UnitsSortOrder != null) out.setUnitsSortOrder(UnitsSortOrder);

    Filter[] UnitsFilter = DataHelper.mapToFilterArray(UnitsMap, BigInteger.class);
    if (UnitsFilter != null) {
      BigIntegerFilter[] UnitsFilters = new BigIntegerFilter[UnitsFilter.length];
      for (int i = 0; i < UnitsFilters.length; i++) {
        UnitsFilters[i] = (BigIntegerFilter)UnitsFilter[i];
      }
      try {
        out.setUnitsFilter(UnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxMap = (Map)record.get("Tax");
    Boolean TaxFetch = DataHelper.getFetch(TaxMap);
    Boolean TaxSortDir = DataHelper.getSortDirection(TaxMap);
    Integer TaxSortOrder = DataHelper.getSortOrder(TaxMap);
    if (TaxFetch != null) out.setTaxFetch(TaxFetch);
    if (TaxSortDir != null) out.setTaxSortDirection(TaxSortDir);
    if (TaxSortOrder != null) out.setTaxSortOrder(TaxSortOrder);

    Filter[] TaxFilter = DataHelper.mapToFilterArray(TaxMap, BigInteger.class);
    if (TaxFilter != null) {
      BigIntegerFilter[] TaxFilters = new BigIntegerFilter[TaxFilter.length];
      for (int i = 0; i < TaxFilters.length; i++) {
        TaxFilters[i] = (BigIntegerFilter)TaxFilter[i];
      }
      try {
        out.setTaxFilter(TaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxRateMap = (Map)record.get("TaxRate");
    Boolean TaxRateFetch = DataHelper.getFetch(TaxRateMap);
    Boolean TaxRateSortDir = DataHelper.getSortDirection(TaxRateMap);
    Integer TaxRateSortOrder = DataHelper.getSortOrder(TaxRateMap);
    if (TaxRateFetch != null) out.setTaxRateFetch(TaxRateFetch);
    if (TaxRateSortDir != null) out.setTaxRateSortDirection(TaxRateSortDir);
    if (TaxRateSortOrder != null) out.setTaxRateSortOrder(TaxRateSortOrder);

    Filter[] TaxRateFilter = DataHelper.mapToFilterArray(TaxRateMap, Integer.class);
    if (TaxRateFilter != null) {
      IntegerFilter[] TaxRateFilters = new IntegerFilter[TaxRateFilter.length];
      for (int i = 0; i < TaxRateFilters.length; i++) {
        TaxRateFilters[i] = (IntegerFilter)TaxRateFilter[i];
      }
      try {
        out.setTaxRateFilter(TaxRateFilters);
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
  
    Map DiscountMap = (Map)record.get("Discount");
    Boolean DiscountFetch = DataHelper.getFetch(DiscountMap);
    Boolean DiscountSortDir = DataHelper.getSortDirection(DiscountMap);
    Integer DiscountSortOrder = DataHelper.getSortOrder(DiscountMap);
    if (DiscountFetch != null) out.setDiscountFetch(DiscountFetch);
    if (DiscountSortDir != null) out.setDiscountSortDirection(DiscountSortDir);
    if (DiscountSortOrder != null) out.setDiscountSortOrder(DiscountSortOrder);

    Filter[] DiscountFilter = DataHelper.mapToFilterArray(DiscountMap, BigInteger.class);
    if (DiscountFilter != null) {
      BigIntegerFilter[] DiscountFilters = new BigIntegerFilter[DiscountFilter.length];
      for (int i = 0; i < DiscountFilters.length; i++) {
        DiscountFilters[i] = (BigIntegerFilter)DiscountFilter[i];
      }
      try {
        out.setDiscountFilter(DiscountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDateMap = (Map)record.get("TransDate");
    Boolean TransDateFetch = DataHelper.getFetch(TransDateMap);
    Boolean TransDateSortDir = DataHelper.getSortDirection(TransDateMap);
    Integer TransDateSortOrder = DataHelper.getSortOrder(TransDateMap);
    if (TransDateFetch != null) out.setTransDateFetch(TransDateFetch);
    if (TransDateSortDir != null) out.setTransDateSortDirection(TransDateSortDir);
    if (TransDateSortOrder != null) out.setTransDateSortOrder(TransDateSortOrder);

    Filter[] TransDateFilter = DataHelper.mapToFilterArray(TransDateMap, Date.class);
    if (TransDateFilter != null) {
      DateFilter[] TransDateFilters = new DateFilter[TransDateFilter.length];
      for (int i = 0; i < TransDateFilters.length; i++) {
        TransDateFilters[i] = (DateFilter)TransDateFilter[i];
      }
      try {
        out.setTransDateFilter(TransDateFilters);
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
  
    Map RateTypeMap = (Map)record.get("RateType");
    Boolean RateTypeFetch = DataHelper.getFetch(RateTypeMap);
    Boolean RateTypeSortDir = DataHelper.getSortDirection(RateTypeMap);
    Integer RateTypeSortOrder = DataHelper.getSortOrder(RateTypeMap);
    if (RateTypeFetch != null) out.setRateTypeFetch(RateTypeFetch);
    if (RateTypeSortDir != null) out.setRateTypeSortDirection(RateTypeSortDir);
    if (RateTypeSortOrder != null) out.setRateTypeSortOrder(RateTypeSortOrder);

    Filter[] RateTypeFilter = DataHelper.mapToFilterArray(RateTypeMap, Integer.class);
    if (RateTypeFilter != null) {
      IntegerFilter[] RateTypeFilters = new IntegerFilter[RateTypeFilter.length];
      for (int i = 0; i < RateTypeFilters.length; i++) {
        RateTypeFilters[i] = (IntegerFilter)RateTypeFilter[i];
      }
      try {
        out.setRateTypeFilter(RateTypeFilters);
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
  
    Map EquipStatusMap = (Map)record.get("EquipStatus");
    Boolean EquipStatusFetch = DataHelper.getFetch(EquipStatusMap);
    Boolean EquipStatusSortDir = DataHelper.getSortDirection(EquipStatusMap);
    Integer EquipStatusSortOrder = DataHelper.getSortOrder(EquipStatusMap);
    if (EquipStatusFetch != null) out.setEquipStatusFetch(EquipStatusFetch);
    if (EquipStatusSortDir != null) out.setEquipStatusSortDirection(EquipStatusSortDir);
    if (EquipStatusSortOrder != null) out.setEquipStatusSortOrder(EquipStatusSortOrder);

    Filter[] EquipStatusFilter = DataHelper.mapToFilterArray(EquipStatusMap, Integer.class);
    if (EquipStatusFilter != null) {
      IntegerFilter[] EquipStatusFilters = new IntegerFilter[EquipStatusFilter.length];
      for (int i = 0; i < EquipStatusFilters.length; i++) {
        EquipStatusFilters[i] = (IntegerFilter)EquipStatusFilter[i];
      }
      try {
        out.setEquipStatusFilter(EquipStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FromDateMap = (Map)record.get("FromDate");
    Boolean FromDateFetch = DataHelper.getFetch(FromDateMap);
    Boolean FromDateSortDir = DataHelper.getSortDirection(FromDateMap);
    Integer FromDateSortOrder = DataHelper.getSortOrder(FromDateMap);
    if (FromDateFetch != null) out.setFromDateFetch(FromDateFetch);
    if (FromDateSortDir != null) out.setFromDateSortDirection(FromDateSortDir);
    if (FromDateSortOrder != null) out.setFromDateSortOrder(FromDateSortOrder);

    Filter[] FromDateFilter = DataHelper.mapToFilterArray(FromDateMap, Date.class);
    if (FromDateFilter != null) {
      DateFilter[] FromDateFilters = new DateFilter[FromDateFilter.length];
      for (int i = 0; i < FromDateFilters.length; i++) {
        FromDateFilters[i] = (DateFilter)FromDateFilter[i];
      }
      try {
        out.setFromDateFilter(FromDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ToDateMap = (Map)record.get("ToDate");
    Boolean ToDateFetch = DataHelper.getFetch(ToDateMap);
    Boolean ToDateSortDir = DataHelper.getSortDirection(ToDateMap);
    Integer ToDateSortOrder = DataHelper.getSortOrder(ToDateMap);
    if (ToDateFetch != null) out.setToDateFetch(ToDateFetch);
    if (ToDateSortDir != null) out.setToDateSortDirection(ToDateSortDir);
    if (ToDateSortOrder != null) out.setToDateSortOrder(ToDateSortOrder);

    Filter[] ToDateFilter = DataHelper.mapToFilterArray(ToDateMap, Date.class);
    if (ToDateFilter != null) {
      DateFilter[] ToDateFilters = new DateFilter[ToDateFilter.length];
      for (int i = 0; i < ToDateFilters.length; i++) {
        ToDateFilters[i] = (DateFilter)ToDateFilter[i];
      }
      try {
        out.setToDateFilter(ToDateFilters);
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
  
    Map TestFlagMap = (Map)record.get("TestFlag");
    Boolean TestFlagFetch = DataHelper.getFetch(TestFlagMap);
    Boolean TestFlagSortDir = DataHelper.getSortDirection(TestFlagMap);
    Integer TestFlagSortOrder = DataHelper.getSortOrder(TestFlagMap);
    if (TestFlagFetch != null) out.setTestFlagFetch(TestFlagFetch);
    if (TestFlagSortDir != null) out.setTestFlagSortDirection(TestFlagSortDir);
    if (TestFlagSortOrder != null) out.setTestFlagSortOrder(TestFlagSortOrder);

    Filter[] TestFlagFilter = DataHelper.mapToFilterArray(TestFlagMap, Boolean.class);
    if (TestFlagFilter != null) {
      BooleanFilter[] TestFlagFilters = new BooleanFilter[TestFlagFilter.length];
      for (int i = 0; i < TestFlagFilters.length; i++) {
        TestFlagFilters[i] = (BooleanFilter)TestFlagFilter[i];
      }
      try {
        out.setTestFlagFilter(TestFlagFilters);
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
  
    Map InclusiveTaxMap = (Map)record.get("InclusiveTax");
    Boolean InclusiveTaxFetch = DataHelper.getFetch(InclusiveTaxMap);
    Boolean InclusiveTaxSortDir = DataHelper.getSortDirection(InclusiveTaxMap);
    Integer InclusiveTaxSortOrder = DataHelper.getSortOrder(InclusiveTaxMap);
    if (InclusiveTaxFetch != null) out.setInclusiveTaxFetch(InclusiveTaxFetch);
    if (InclusiveTaxSortDir != null) out.setInclusiveTaxSortDirection(InclusiveTaxSortDir);
    if (InclusiveTaxSortOrder != null) out.setInclusiveTaxSortOrder(InclusiveTaxSortOrder);

    Filter[] InclusiveTaxFilter = DataHelper.mapToFilterArray(InclusiveTaxMap, BigInteger.class);
    if (InclusiveTaxFilter != null) {
      BigIntegerFilter[] InclusiveTaxFilters = new BigIntegerFilter[InclusiveTaxFilter.length];
      for (int i = 0; i < InclusiveTaxFilters.length; i++) {
        InclusiveTaxFilters[i] = (BigIntegerFilter)InclusiveTaxFilter[i];
      }
      try {
        out.setInclusiveTaxFilter(InclusiveTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PcmActiveDtMap = (Map)record.get("PcmActiveDt");
    Boolean PcmActiveDtFetch = DataHelper.getFetch(PcmActiveDtMap);
    Boolean PcmActiveDtSortDir = DataHelper.getSortDirection(PcmActiveDtMap);
    Integer PcmActiveDtSortOrder = DataHelper.getSortOrder(PcmActiveDtMap);
    if (PcmActiveDtFetch != null) out.setPcmActiveDtFetch(PcmActiveDtFetch);
    if (PcmActiveDtSortDir != null) out.setPcmActiveDtSortDirection(PcmActiveDtSortDir);
    if (PcmActiveDtSortOrder != null) out.setPcmActiveDtSortOrder(PcmActiveDtSortOrder);

    Filter[] PcmActiveDtFilter = DataHelper.mapToFilterArray(PcmActiveDtMap, Date.class);
    if (PcmActiveDtFilter != null) {
      DateFilter[] PcmActiveDtFilters = new DateFilter[PcmActiveDtFilter.length];
      for (int i = 0; i < PcmActiveDtFilters.length; i++) {
        PcmActiveDtFilters[i] = (DateFilter)PcmActiveDtFilter[i];
      }
      try {
        out.setPcmActiveDtFilter(PcmActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MiscNumber1Map = (Map)record.get("MiscNumber1");
    Boolean MiscNumber1Fetch = DataHelper.getFetch(MiscNumber1Map);
    Boolean MiscNumber1SortDir = DataHelper.getSortDirection(MiscNumber1Map);
    Integer MiscNumber1SortOrder = DataHelper.getSortOrder(MiscNumber1Map);
    if (MiscNumber1Fetch != null) out.setMiscNumber1Fetch(MiscNumber1Fetch);
    if (MiscNumber1SortDir != null) out.setMiscNumber1SortDirection(MiscNumber1SortDir);
    if (MiscNumber1SortOrder != null) out.setMiscNumber1SortOrder(MiscNumber1SortOrder);

    Filter[] MiscNumber1Filter = DataHelper.mapToFilterArray(MiscNumber1Map, BigInteger.class);
    if (MiscNumber1Filter != null) {
      BigIntegerFilter[] MiscNumber1Filters = new BigIntegerFilter[MiscNumber1Filter.length];
      for (int i = 0; i < MiscNumber1Filters.length; i++) {
        MiscNumber1Filters[i] = (BigIntegerFilter)MiscNumber1Filter[i];
      }
      try {
        out.setMiscNumber1Filter(MiscNumber1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MiscNumber2Map = (Map)record.get("MiscNumber2");
    Boolean MiscNumber2Fetch = DataHelper.getFetch(MiscNumber2Map);
    Boolean MiscNumber2SortDir = DataHelper.getSortDirection(MiscNumber2Map);
    Integer MiscNumber2SortOrder = DataHelper.getSortOrder(MiscNumber2Map);
    if (MiscNumber2Fetch != null) out.setMiscNumber2Fetch(MiscNumber2Fetch);
    if (MiscNumber2SortDir != null) out.setMiscNumber2SortDirection(MiscNumber2SortDir);
    if (MiscNumber2SortOrder != null) out.setMiscNumber2SortOrder(MiscNumber2SortOrder);

    Filter[] MiscNumber2Filter = DataHelper.mapToFilterArray(MiscNumber2Map, BigInteger.class);
    if (MiscNumber2Filter != null) {
      BigIntegerFilter[] MiscNumber2Filters = new BigIntegerFilter[MiscNumber2Filter.length];
      for (int i = 0; i < MiscNumber2Filters.length; i++) {
        MiscNumber2Filters[i] = (BigIntegerFilter)MiscNumber2Filter[i];
      }
      try {
        out.setMiscNumber2Filter(MiscNumber2Filters);
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
  
    Map DescriptionGroupMap = (Map)record.get("DescriptionGroup");
    Boolean DescriptionGroupFetch = DataHelper.getFetch(DescriptionGroupMap);
    Boolean DescriptionGroupSortDir = DataHelper.getSortDirection(DescriptionGroupMap);
    Integer DescriptionGroupSortOrder = DataHelper.getSortOrder(DescriptionGroupMap);
    if (DescriptionGroupFetch != null) out.setDescriptionGroupFetch(DescriptionGroupFetch);
    if (DescriptionGroupSortDir != null) out.setDescriptionGroupSortDirection(DescriptionGroupSortDir);
    if (DescriptionGroupSortOrder != null) out.setDescriptionGroupSortOrder(DescriptionGroupSortOrder);

    Filter[] DescriptionGroupFilter = DataHelper.mapToFilterArray(DescriptionGroupMap, Integer.class);
    if (DescriptionGroupFilter != null) {
      IntegerFilter[] DescriptionGroupFilters = new IntegerFilter[DescriptionGroupFilter.length];
      for (int i = 0; i < DescriptionGroupFilters.length; i++) {
        DescriptionGroupFilters[i] = (IntegerFilter)DescriptionGroupFilter[i];
      }
      try {
        out.setDescriptionGroupFilter(DescriptionGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionTextMap = (Map)record.get("DescriptionText");
    Boolean DescriptionTextFetch = DataHelper.getFetch(DescriptionTextMap);
    Boolean DescriptionTextSortDir = DataHelper.getSortDirection(DescriptionTextMap);
    Integer DescriptionTextSortOrder = DataHelper.getSortOrder(DescriptionTextMap);
    if (DescriptionTextFetch != null) out.setDescriptionTextFetch(DescriptionTextFetch);
    if (DescriptionTextSortDir != null) out.setDescriptionTextSortDirection(DescriptionTextSortDir);
    if (DescriptionTextSortOrder != null) out.setDescriptionTextSortOrder(DescriptionTextSortOrder);

    Filter[] DescriptionTextFilter = DataHelper.mapToFilterArray(DescriptionTextMap, String.class);
    if (DescriptionTextFilter != null) {
      StringFilter[] DescriptionTextFilters = new StringFilter[DescriptionTextFilter.length];
      for (int i = 0; i < DescriptionTextFilters.length; i++) {
        DescriptionTextFilters[i] = (StringFilter)DescriptionTextFilter[i];
      }
      try {
        out.setDescriptionTextFilter(DescriptionTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ShortDescriptionTextMap = (Map)record.get("ShortDescriptionText");
    Boolean ShortDescriptionTextFetch = DataHelper.getFetch(ShortDescriptionTextMap);
    Boolean ShortDescriptionTextSortDir = DataHelper.getSortDirection(ShortDescriptionTextMap);
    Integer ShortDescriptionTextSortOrder = DataHelper.getSortOrder(ShortDescriptionTextMap);
    if (ShortDescriptionTextFetch != null) out.setShortDescriptionTextFetch(ShortDescriptionTextFetch);
    if (ShortDescriptionTextSortDir != null) out.setShortDescriptionTextSortDirection(ShortDescriptionTextSortDir);
    if (ShortDescriptionTextSortOrder != null) out.setShortDescriptionTextSortOrder(ShortDescriptionTextSortOrder);

    Filter[] ShortDescriptionTextFilter = DataHelper.mapToFilterArray(ShortDescriptionTextMap, String.class);
    if (ShortDescriptionTextFilter != null) {
      StringFilter[] ShortDescriptionTextFilters = new StringFilter[ShortDescriptionTextFilter.length];
      for (int i = 0; i < ShortDescriptionTextFilters.length; i++) {
        ShortDescriptionTextFilters[i] = (StringFilter)ShortDescriptionTextFilter[i];
      }
      try {
        out.setShortDescriptionTextFilter(ShortDescriptionTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
