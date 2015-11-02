/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectHelper.java
 * Definition File: Catalog/VoucherTypes.xml
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



/** Helper class to convert VoucherTypesObject JavaBean objects to/from HashMaps.
 */
public class VoucherTypesObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherTypesObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherTypesObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherTypesObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherTypesObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherTypesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherTypesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherTypesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherTypesObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherTypesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherTypesObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherTypesObjectData the converted object
   */
  public static VoucherTypesObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherTypesObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherTypesObject")
   * @return VoucherTypesObjectData the converted object
   */
  public static VoucherTypesObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherTypesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherTypesObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherTypesObjectFilter the converted object
   */
  public static VoucherTypesObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherTypesObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherTypesObject")
   * @return VoucherTypesObjectFilter the converted object
   */
  public static VoucherTypesObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherTypesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherTypesObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherTypesObjectDataList the converted object
   */
  public static VoucherTypesObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherTypesObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherTypesObjectList")
   * @return VoucherTypesObjectDataList the converted object
   */
  public static VoucherTypesObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherTypesObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherTypesObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherTypesObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherTypesObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherTypesObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherTypesObjectDataList (array, index, total);
  }
  /** convert VoucherTypesObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherTypesObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherTypesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._LengthOfPinSet) record.put ("LengthOfPin", in.LengthOfPin);
  
    if (in._PinDataTypeSet) record.put ("PinDataType", in.PinDataType);
  
    if (in._VoucherDescriptionsSet) record.put ("VoucherDescriptions", in.VoucherDescriptions);
  
    if (in._CreditConversionTypeSet) record.put ("CreditConversionType", in.CreditConversionType);
  
    if (in._ApiValidationCheckSet) record.put ("ApiValidationCheck", in.ApiValidationCheck);
  
    if (in._GuiValidationCheckSet) record.put ("GuiValidationCheck", in.GuiValidationCheck);
  
    if (in._UnitCreditContractIdSet) record.put ("UnitCreditContractId", in.UnitCreditContractId);
  
    if (in._PaymentTransTypeSet) record.put ("PaymentTransType", in.PaymentTransType);
      return record;
  }
  /** convert VoucherTypesObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherTypesObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherTypesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.LengthOfPin, in.LengthOfPinSort, in.LengthOfPinSortAscending, in.LengthOfPinFetch);
      if (map != null) record.put ("LengthOfPin", map);
      map = DataHelper.filterToMap (in.PinDataType, in.PinDataTypeSort, in.PinDataTypeSortAscending, in.PinDataTypeFetch);
      if (map != null) record.put ("PinDataType", map);
      map = DataHelper.filterToMap (in.VoucherDescriptions, in.VoucherDescriptionsSort, in.VoucherDescriptionsSortAscending, in.VoucherDescriptionsFetch, in.VoucherDescriptionsCaseInsensitive);
      if (map != null) record.put ("VoucherDescriptions", map);
      map = DataHelper.filterToMap (in.CreditConversionType, in.CreditConversionTypeSort, in.CreditConversionTypeSortAscending, in.CreditConversionTypeFetch);
      if (map != null) record.put ("CreditConversionType", map);
      map = DataHelper.filterToMap (in.ApiValidationCheck, in.ApiValidationCheckSort, in.ApiValidationCheckSortAscending, in.ApiValidationCheckFetch);
      if (map != null) record.put ("ApiValidationCheck", map);
      map = DataHelper.filterToMap (in.GuiValidationCheck, in.GuiValidationCheckSort, in.GuiValidationCheckSortAscending, in.GuiValidationCheckFetch);
      if (map != null) record.put ("GuiValidationCheck", map);
      map = DataHelper.filterToMap (in.UnitCreditContractId, in.UnitCreditContractIdSort, in.UnitCreditContractIdSortAscending, in.UnitCreditContractIdFetch);
      if (map != null) record.put ("UnitCreditContractId", map);
      map = DataHelper.filterToMap (in.PaymentTransType, in.PaymentTransTypeSort, in.PaymentTransTypeSortAscending, in.PaymentTransTypeFetch);
      if (map != null) record.put ("PaymentTransType", map);
    return record;
  }
  /** convert Map to VoucherTypesObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherTypesObjectData the converted object
   */
  public static VoucherTypesObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherTypesObjectData out = new VoucherTypesObjectData ();

    out.Key = VoucherTypesObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("LengthOfPin")) != null)
    {
      out.LengthOfPin = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PinDataType")) != null)
    {
      out.PinDataType = (BigInteger) obj;
    }
  
    if ((obj = record.get ("VoucherDescriptions")) != null)
    {
      out.VoucherDescriptions = (String) obj;
    }
  
    if ((obj = record.get ("CreditConversionType")) != null)
    {
      out.CreditConversionType = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ApiValidationCheck")) != null)
    {
      out.ApiValidationCheck = (BigInteger) obj;
    }
  
    if ((obj = record.get ("GuiValidationCheck")) != null)
    {
      out.GuiValidationCheck = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UnitCreditContractId")) != null)
    {
      out.UnitCreditContractId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PaymentTransType")) != null)
    {
      out.PaymentTransType = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to VoucherTypesObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherTypesObjectFilter the converted object
   */
  public static VoucherTypesObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherTypesObjectFilter out = new VoucherTypesObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherTypesObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map LengthOfPinMap = (Map)record.get("LengthOfPin");
    Boolean LengthOfPinFetch = DataHelper.getFetch(LengthOfPinMap);
    Boolean LengthOfPinSortDir = DataHelper.getSortDirection(LengthOfPinMap);
    Integer LengthOfPinSortOrder = DataHelper.getSortOrder(LengthOfPinMap);
    if (LengthOfPinFetch != null) out.setLengthOfPinFetch(LengthOfPinFetch);
    if (LengthOfPinSortDir != null) out.setLengthOfPinSortDirection(LengthOfPinSortDir);
    if (LengthOfPinSortOrder != null) out.setLengthOfPinSortOrder(LengthOfPinSortOrder);

    Filter[] LengthOfPinFilter = DataHelper.mapToFilterArray(LengthOfPinMap, BigInteger.class);
    if (LengthOfPinFilter != null) {
      BigIntegerFilter[] LengthOfPinFilters = new BigIntegerFilter[LengthOfPinFilter.length];
      for (int i = 0; i < LengthOfPinFilters.length; i++) {
        LengthOfPinFilters[i] = (BigIntegerFilter)LengthOfPinFilter[i];
      }
      try {
        out.setLengthOfPinFilter(LengthOfPinFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PinDataTypeMap = (Map)record.get("PinDataType");
    Boolean PinDataTypeFetch = DataHelper.getFetch(PinDataTypeMap);
    Boolean PinDataTypeSortDir = DataHelper.getSortDirection(PinDataTypeMap);
    Integer PinDataTypeSortOrder = DataHelper.getSortOrder(PinDataTypeMap);
    if (PinDataTypeFetch != null) out.setPinDataTypeFetch(PinDataTypeFetch);
    if (PinDataTypeSortDir != null) out.setPinDataTypeSortDirection(PinDataTypeSortDir);
    if (PinDataTypeSortOrder != null) out.setPinDataTypeSortOrder(PinDataTypeSortOrder);

    Filter[] PinDataTypeFilter = DataHelper.mapToFilterArray(PinDataTypeMap, BigInteger.class);
    if (PinDataTypeFilter != null) {
      BigIntegerFilter[] PinDataTypeFilters = new BigIntegerFilter[PinDataTypeFilter.length];
      for (int i = 0; i < PinDataTypeFilters.length; i++) {
        PinDataTypeFilters[i] = (BigIntegerFilter)PinDataTypeFilter[i];
      }
      try {
        out.setPinDataTypeFilter(PinDataTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map VoucherDescriptionsMap = (Map)record.get("VoucherDescriptions");
    Boolean VoucherDescriptionsFetch = DataHelper.getFetch(VoucherDescriptionsMap);
    Boolean VoucherDescriptionsSortDir = DataHelper.getSortDirection(VoucherDescriptionsMap);
    Integer VoucherDescriptionsSortOrder = DataHelper.getSortOrder(VoucherDescriptionsMap);
    if (VoucherDescriptionsFetch != null) out.setVoucherDescriptionsFetch(VoucherDescriptionsFetch);
    if (VoucherDescriptionsSortDir != null) out.setVoucherDescriptionsSortDirection(VoucherDescriptionsSortDir);
    if (VoucherDescriptionsSortOrder != null) out.setVoucherDescriptionsSortOrder(VoucherDescriptionsSortOrder);

    Filter[] VoucherDescriptionsFilter = DataHelper.mapToFilterArray(VoucherDescriptionsMap, String.class);
    if (VoucherDescriptionsFilter != null) {
      StringFilter[] VoucherDescriptionsFilters = new StringFilter[VoucherDescriptionsFilter.length];
      for (int i = 0; i < VoucherDescriptionsFilters.length; i++) {
        VoucherDescriptionsFilters[i] = (StringFilter)VoucherDescriptionsFilter[i];
      }
      try {
        out.setVoucherDescriptionsFilter(VoucherDescriptionsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreditConversionTypeMap = (Map)record.get("CreditConversionType");
    Boolean CreditConversionTypeFetch = DataHelper.getFetch(CreditConversionTypeMap);
    Boolean CreditConversionTypeSortDir = DataHelper.getSortDirection(CreditConversionTypeMap);
    Integer CreditConversionTypeSortOrder = DataHelper.getSortOrder(CreditConversionTypeMap);
    if (CreditConversionTypeFetch != null) out.setCreditConversionTypeFetch(CreditConversionTypeFetch);
    if (CreditConversionTypeSortDir != null) out.setCreditConversionTypeSortDirection(CreditConversionTypeSortDir);
    if (CreditConversionTypeSortOrder != null) out.setCreditConversionTypeSortOrder(CreditConversionTypeSortOrder);

    Filter[] CreditConversionTypeFilter = DataHelper.mapToFilterArray(CreditConversionTypeMap, BigInteger.class);
    if (CreditConversionTypeFilter != null) {
      BigIntegerFilter[] CreditConversionTypeFilters = new BigIntegerFilter[CreditConversionTypeFilter.length];
      for (int i = 0; i < CreditConversionTypeFilters.length; i++) {
        CreditConversionTypeFilters[i] = (BigIntegerFilter)CreditConversionTypeFilter[i];
      }
      try {
        out.setCreditConversionTypeFilter(CreditConversionTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ApiValidationCheckMap = (Map)record.get("ApiValidationCheck");
    Boolean ApiValidationCheckFetch = DataHelper.getFetch(ApiValidationCheckMap);
    Boolean ApiValidationCheckSortDir = DataHelper.getSortDirection(ApiValidationCheckMap);
    Integer ApiValidationCheckSortOrder = DataHelper.getSortOrder(ApiValidationCheckMap);
    if (ApiValidationCheckFetch != null) out.setApiValidationCheckFetch(ApiValidationCheckFetch);
    if (ApiValidationCheckSortDir != null) out.setApiValidationCheckSortDirection(ApiValidationCheckSortDir);
    if (ApiValidationCheckSortOrder != null) out.setApiValidationCheckSortOrder(ApiValidationCheckSortOrder);

    Filter[] ApiValidationCheckFilter = DataHelper.mapToFilterArray(ApiValidationCheckMap, BigInteger.class);
    if (ApiValidationCheckFilter != null) {
      BigIntegerFilter[] ApiValidationCheckFilters = new BigIntegerFilter[ApiValidationCheckFilter.length];
      for (int i = 0; i < ApiValidationCheckFilters.length; i++) {
        ApiValidationCheckFilters[i] = (BigIntegerFilter)ApiValidationCheckFilter[i];
      }
      try {
        out.setApiValidationCheckFilter(ApiValidationCheckFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GuiValidationCheckMap = (Map)record.get("GuiValidationCheck");
    Boolean GuiValidationCheckFetch = DataHelper.getFetch(GuiValidationCheckMap);
    Boolean GuiValidationCheckSortDir = DataHelper.getSortDirection(GuiValidationCheckMap);
    Integer GuiValidationCheckSortOrder = DataHelper.getSortOrder(GuiValidationCheckMap);
    if (GuiValidationCheckFetch != null) out.setGuiValidationCheckFetch(GuiValidationCheckFetch);
    if (GuiValidationCheckSortDir != null) out.setGuiValidationCheckSortDirection(GuiValidationCheckSortDir);
    if (GuiValidationCheckSortOrder != null) out.setGuiValidationCheckSortOrder(GuiValidationCheckSortOrder);

    Filter[] GuiValidationCheckFilter = DataHelper.mapToFilterArray(GuiValidationCheckMap, BigInteger.class);
    if (GuiValidationCheckFilter != null) {
      BigIntegerFilter[] GuiValidationCheckFilters = new BigIntegerFilter[GuiValidationCheckFilter.length];
      for (int i = 0; i < GuiValidationCheckFilters.length; i++) {
        GuiValidationCheckFilters[i] = (BigIntegerFilter)GuiValidationCheckFilter[i];
      }
      try {
        out.setGuiValidationCheckFilter(GuiValidationCheckFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitCreditContractIdMap = (Map)record.get("UnitCreditContractId");
    Boolean UnitCreditContractIdFetch = DataHelper.getFetch(UnitCreditContractIdMap);
    Boolean UnitCreditContractIdSortDir = DataHelper.getSortDirection(UnitCreditContractIdMap);
    Integer UnitCreditContractIdSortOrder = DataHelper.getSortOrder(UnitCreditContractIdMap);
    if (UnitCreditContractIdFetch != null) out.setUnitCreditContractIdFetch(UnitCreditContractIdFetch);
    if (UnitCreditContractIdSortDir != null) out.setUnitCreditContractIdSortDirection(UnitCreditContractIdSortDir);
    if (UnitCreditContractIdSortOrder != null) out.setUnitCreditContractIdSortOrder(UnitCreditContractIdSortOrder);

    Filter[] UnitCreditContractIdFilter = DataHelper.mapToFilterArray(UnitCreditContractIdMap, BigInteger.class);
    if (UnitCreditContractIdFilter != null) {
      BigIntegerFilter[] UnitCreditContractIdFilters = new BigIntegerFilter[UnitCreditContractIdFilter.length];
      for (int i = 0; i < UnitCreditContractIdFilters.length; i++) {
        UnitCreditContractIdFilters[i] = (BigIntegerFilter)UnitCreditContractIdFilter[i];
      }
      try {
        out.setUnitCreditContractIdFilter(UnitCreditContractIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentTransTypeMap = (Map)record.get("PaymentTransType");
    Boolean PaymentTransTypeFetch = DataHelper.getFetch(PaymentTransTypeMap);
    Boolean PaymentTransTypeSortDir = DataHelper.getSortDirection(PaymentTransTypeMap);
    Integer PaymentTransTypeSortOrder = DataHelper.getSortOrder(PaymentTransTypeMap);
    if (PaymentTransTypeFetch != null) out.setPaymentTransTypeFetch(PaymentTransTypeFetch);
    if (PaymentTransTypeSortDir != null) out.setPaymentTransTypeSortDirection(PaymentTransTypeSortDir);
    if (PaymentTransTypeSortOrder != null) out.setPaymentTransTypeSortOrder(PaymentTransTypeSortOrder);

    Filter[] PaymentTransTypeFilter = DataHelper.mapToFilterArray(PaymentTransTypeMap, BigInteger.class);
    if (PaymentTransTypeFilter != null) {
      BigIntegerFilter[] PaymentTransTypeFilters = new BigIntegerFilter[PaymentTransTypeFilter.length];
      for (int i = 0; i < PaymentTransTypeFilters.length; i++) {
        PaymentTransTypeFilters[i] = (BigIntegerFilter)PaymentTransTypeFilter[i];
      }
      try {
        out.setPaymentTransTypeFilter(PaymentTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
