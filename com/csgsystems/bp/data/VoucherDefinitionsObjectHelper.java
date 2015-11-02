/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsObjectHelper.java
 * Definition File: Catalog/VoucherDefinitions.xml
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


/** Helper class to convert VoucherDefinitionsObject JavaBean objects to/from HashMaps.
 */
public class VoucherDefinitionsObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherDefinitionsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherDefinitionsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherDefinitionsObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherDefinitionsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherDefinitionsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherDefinitionsObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherDefinitionsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherDefinitionsObjectData the converted object
   */
  public static VoucherDefinitionsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherDefinitionsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherDefinitionsObject")
   * @return VoucherDefinitionsObjectData the converted object
   */
  public static VoucherDefinitionsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherDefinitionsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherDefinitionsObjectFilter the converted object
   */
  public static VoucherDefinitionsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherDefinitionsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherDefinitionsObject")
   * @return VoucherDefinitionsObjectFilter the converted object
   */
  public static VoucherDefinitionsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherDefinitionsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherDefinitionsObjectDataList the converted object
   */
  public static VoucherDefinitionsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherDefinitionsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherDefinitionsObjectList")
   * @return VoucherDefinitionsObjectDataList the converted object
   */
  public static VoucherDefinitionsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherDefinitionsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherDefinitionsObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherDefinitionsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherDefinitionsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherDefinitionsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherDefinitionsObjectDataList (array, index, total);
  }
  /** convert VoucherDefinitionsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherDefinitionsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherDefinitionsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._VoucherTypeIdSet) record.put ("VoucherTypeId", in.VoucherTypeId);
  
    if (in._UniqueVoucherIdSet) record.put ("UniqueVoucherId", in.UniqueVoucherId);
  
    if (in._PinCode1Set) record.put ("PinCode1", in.PinCode1);
  
    if (in._PinCode2Set) record.put ("PinCode2", in.PinCode2);
  
    if (in._UnitCreditContractIdSet) record.put ("UnitCreditContractId", in.UnitCreditContractId);
  
    if (in._NumberOfUnitsSet) record.put ("NumberOfUnits", in.NumberOfUnits);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._LocationCodeSet) record.put ("LocationCode", in.LocationCode);
  
    if (in._BatchIdSet) record.put ("BatchId", in.BatchId);
  
    if (in._CheckSumSet) record.put ("CheckSum", in.CheckSum);
      return record;
  }
  /** convert VoucherDefinitionsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherDefinitionsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherDefinitionsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.VoucherTypeId, in.VoucherTypeIdSort, in.VoucherTypeIdSortAscending, in.VoucherTypeIdFetch);
      if (map != null) record.put ("VoucherTypeId", map);
      map = DataHelper.filterToMap (in.UniqueVoucherId, in.UniqueVoucherIdSort, in.UniqueVoucherIdSortAscending, in.UniqueVoucherIdFetch);
      if (map != null) record.put ("UniqueVoucherId", map);
      map = DataHelper.filterToMap (in.PinCode1, in.PinCode1Sort, in.PinCode1SortAscending, in.PinCode1Fetch, in.PinCode1CaseInsensitive);
      if (map != null) record.put ("PinCode1", map);
      map = DataHelper.filterToMap (in.PinCode2, in.PinCode2Sort, in.PinCode2SortAscending, in.PinCode2Fetch, in.PinCode2CaseInsensitive);
      if (map != null) record.put ("PinCode2", map);
      map = DataHelper.filterToMap (in.UnitCreditContractId, in.UnitCreditContractIdSort, in.UnitCreditContractIdSortAscending, in.UnitCreditContractIdFetch);
      if (map != null) record.put ("UnitCreditContractId", map);
      map = DataHelper.filterToMap (in.NumberOfUnits, in.NumberOfUnitsSort, in.NumberOfUnitsSortAscending, in.NumberOfUnitsFetch);
      if (map != null) record.put ("NumberOfUnits", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.LocationCode, in.LocationCodeSort, in.LocationCodeSortAscending, in.LocationCodeFetch);
      if (map != null) record.put ("LocationCode", map);
      map = DataHelper.filterToMap (in.BatchId, in.BatchIdSort, in.BatchIdSortAscending, in.BatchIdFetch);
      if (map != null) record.put ("BatchId", map);
      map = DataHelper.filterToMap (in.CheckSum, in.CheckSumSort, in.CheckSumSortAscending, in.CheckSumFetch, in.CheckSumCaseInsensitive);
      if (map != null) record.put ("CheckSum", map);
    return record;
  }
  /** convert Map to VoucherDefinitionsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherDefinitionsObjectData the converted object
   */
  public static VoucherDefinitionsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherDefinitionsObjectData out = new VoucherDefinitionsObjectData ();

    out.Key = VoucherDefinitionsObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("VoucherTypeId")) != null)
    {
      out.VoucherTypeId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UniqueVoucherId")) != null)
    {
      out.UniqueVoucherId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PinCode1")) != null)
    {
      out.PinCode1 = (String) obj;
    }
  
    if ((obj = record.get ("PinCode2")) != null)
    {
      out.PinCode2 = (String) obj;
    }
  
    if ((obj = record.get ("UnitCreditContractId")) != null)
    {
      out.UnitCreditContractId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("NumberOfUnits")) != null)
    {
      out.NumberOfUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LocationCode")) != null)
    {
      out.LocationCode = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BatchId")) != null)
    {
      out.BatchId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CheckSum")) != null)
    {
      out.CheckSum = (String) obj;
    }
      return out;
  }
  /** convert Map to VoucherDefinitionsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherDefinitionsObjectFilter the converted object
   */
  public static VoucherDefinitionsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherDefinitionsObjectFilter out = new VoucherDefinitionsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherDefinitionsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map VoucherTypeIdMap = (Map)record.get("VoucherTypeId");
    Boolean VoucherTypeIdFetch = DataHelper.getFetch(VoucherTypeIdMap);
    Boolean VoucherTypeIdSortDir = DataHelper.getSortDirection(VoucherTypeIdMap);
    Integer VoucherTypeIdSortOrder = DataHelper.getSortOrder(VoucherTypeIdMap);
    if (VoucherTypeIdFetch != null) out.setVoucherTypeIdFetch(VoucherTypeIdFetch);
    if (VoucherTypeIdSortDir != null) out.setVoucherTypeIdSortDirection(VoucherTypeIdSortDir);
    if (VoucherTypeIdSortOrder != null) out.setVoucherTypeIdSortOrder(VoucherTypeIdSortOrder);

    Filter[] VoucherTypeIdFilter = DataHelper.mapToFilterArray(VoucherTypeIdMap, BigInteger.class);
    if (VoucherTypeIdFilter != null) {
      BigIntegerFilter[] VoucherTypeIdFilters = new BigIntegerFilter[VoucherTypeIdFilter.length];
      for (int i = 0; i < VoucherTypeIdFilters.length; i++) {
        VoucherTypeIdFilters[i] = (BigIntegerFilter)VoucherTypeIdFilter[i];
      }
      try {
        out.setVoucherTypeIdFilter(VoucherTypeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UniqueVoucherIdMap = (Map)record.get("UniqueVoucherId");
    Boolean UniqueVoucherIdFetch = DataHelper.getFetch(UniqueVoucherIdMap);
    Boolean UniqueVoucherIdSortDir = DataHelper.getSortDirection(UniqueVoucherIdMap);
    Integer UniqueVoucherIdSortOrder = DataHelper.getSortOrder(UniqueVoucherIdMap);
    if (UniqueVoucherIdFetch != null) out.setUniqueVoucherIdFetch(UniqueVoucherIdFetch);
    if (UniqueVoucherIdSortDir != null) out.setUniqueVoucherIdSortDirection(UniqueVoucherIdSortDir);
    if (UniqueVoucherIdSortOrder != null) out.setUniqueVoucherIdSortOrder(UniqueVoucherIdSortOrder);

    Filter[] UniqueVoucherIdFilter = DataHelper.mapToFilterArray(UniqueVoucherIdMap, BigInteger.class);
    if (UniqueVoucherIdFilter != null) {
      BigIntegerFilter[] UniqueVoucherIdFilters = new BigIntegerFilter[UniqueVoucherIdFilter.length];
      for (int i = 0; i < UniqueVoucherIdFilters.length; i++) {
        UniqueVoucherIdFilters[i] = (BigIntegerFilter)UniqueVoucherIdFilter[i];
      }
      try {
        out.setUniqueVoucherIdFilter(UniqueVoucherIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PinCode1Map = (Map)record.get("PinCode1");
    Boolean PinCode1Fetch = DataHelper.getFetch(PinCode1Map);
    Boolean PinCode1SortDir = DataHelper.getSortDirection(PinCode1Map);
    Integer PinCode1SortOrder = DataHelper.getSortOrder(PinCode1Map);
    if (PinCode1Fetch != null) out.setPinCode1Fetch(PinCode1Fetch);
    if (PinCode1SortDir != null) out.setPinCode1SortDirection(PinCode1SortDir);
    if (PinCode1SortOrder != null) out.setPinCode1SortOrder(PinCode1SortOrder);

    Filter[] PinCode1Filter = DataHelper.mapToFilterArray(PinCode1Map, String.class);
    if (PinCode1Filter != null) {
      StringFilter[] PinCode1Filters = new StringFilter[PinCode1Filter.length];
      for (int i = 0; i < PinCode1Filters.length; i++) {
        PinCode1Filters[i] = (StringFilter)PinCode1Filter[i];
      }
      try {
        out.setPinCode1Filter(PinCode1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PinCode2Map = (Map)record.get("PinCode2");
    Boolean PinCode2Fetch = DataHelper.getFetch(PinCode2Map);
    Boolean PinCode2SortDir = DataHelper.getSortDirection(PinCode2Map);
    Integer PinCode2SortOrder = DataHelper.getSortOrder(PinCode2Map);
    if (PinCode2Fetch != null) out.setPinCode2Fetch(PinCode2Fetch);
    if (PinCode2SortDir != null) out.setPinCode2SortDirection(PinCode2SortDir);
    if (PinCode2SortOrder != null) out.setPinCode2SortOrder(PinCode2SortOrder);

    Filter[] PinCode2Filter = DataHelper.mapToFilterArray(PinCode2Map, String.class);
    if (PinCode2Filter != null) {
      StringFilter[] PinCode2Filters = new StringFilter[PinCode2Filter.length];
      for (int i = 0; i < PinCode2Filters.length; i++) {
        PinCode2Filters[i] = (StringFilter)PinCode2Filter[i];
      }
      try {
        out.setPinCode2Filter(PinCode2Filters);
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
  
    Map NumberOfUnitsMap = (Map)record.get("NumberOfUnits");
    Boolean NumberOfUnitsFetch = DataHelper.getFetch(NumberOfUnitsMap);
    Boolean NumberOfUnitsSortDir = DataHelper.getSortDirection(NumberOfUnitsMap);
    Integer NumberOfUnitsSortOrder = DataHelper.getSortOrder(NumberOfUnitsMap);
    if (NumberOfUnitsFetch != null) out.setNumberOfUnitsFetch(NumberOfUnitsFetch);
    if (NumberOfUnitsSortDir != null) out.setNumberOfUnitsSortDirection(NumberOfUnitsSortDir);
    if (NumberOfUnitsSortOrder != null) out.setNumberOfUnitsSortOrder(NumberOfUnitsSortOrder);

    Filter[] NumberOfUnitsFilter = DataHelper.mapToFilterArray(NumberOfUnitsMap, BigInteger.class);
    if (NumberOfUnitsFilter != null) {
      BigIntegerFilter[] NumberOfUnitsFilters = new BigIntegerFilter[NumberOfUnitsFilter.length];
      for (int i = 0; i < NumberOfUnitsFilters.length; i++) {
        NumberOfUnitsFilters[i] = (BigIntegerFilter)NumberOfUnitsFilter[i];
      }
      try {
        out.setNumberOfUnitsFilter(NumberOfUnitsFilters);
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
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, BigInteger.class);
    if (CurrencyCodeFilter != null) {
      BigIntegerFilter[] CurrencyCodeFilters = new BigIntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (BigIntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LocationCodeMap = (Map)record.get("LocationCode");
    Boolean LocationCodeFetch = DataHelper.getFetch(LocationCodeMap);
    Boolean LocationCodeSortDir = DataHelper.getSortDirection(LocationCodeMap);
    Integer LocationCodeSortOrder = DataHelper.getSortOrder(LocationCodeMap);
    if (LocationCodeFetch != null) out.setLocationCodeFetch(LocationCodeFetch);
    if (LocationCodeSortDir != null) out.setLocationCodeSortDirection(LocationCodeSortDir);
    if (LocationCodeSortOrder != null) out.setLocationCodeSortOrder(LocationCodeSortOrder);

    Filter[] LocationCodeFilter = DataHelper.mapToFilterArray(LocationCodeMap, BigInteger.class);
    if (LocationCodeFilter != null) {
      BigIntegerFilter[] LocationCodeFilters = new BigIntegerFilter[LocationCodeFilter.length];
      for (int i = 0; i < LocationCodeFilters.length; i++) {
        LocationCodeFilters[i] = (BigIntegerFilter)LocationCodeFilter[i];
      }
      try {
        out.setLocationCodeFilter(LocationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BatchIdMap = (Map)record.get("BatchId");
    Boolean BatchIdFetch = DataHelper.getFetch(BatchIdMap);
    Boolean BatchIdSortDir = DataHelper.getSortDirection(BatchIdMap);
    Integer BatchIdSortOrder = DataHelper.getSortOrder(BatchIdMap);
    if (BatchIdFetch != null) out.setBatchIdFetch(BatchIdFetch);
    if (BatchIdSortDir != null) out.setBatchIdSortDirection(BatchIdSortDir);
    if (BatchIdSortOrder != null) out.setBatchIdSortOrder(BatchIdSortOrder);

    Filter[] BatchIdFilter = DataHelper.mapToFilterArray(BatchIdMap, BigInteger.class);
    if (BatchIdFilter != null) {
      BigIntegerFilter[] BatchIdFilters = new BigIntegerFilter[BatchIdFilter.length];
      for (int i = 0; i < BatchIdFilters.length; i++) {
        BatchIdFilters[i] = (BigIntegerFilter)BatchIdFilter[i];
      }
      try {
        out.setBatchIdFilter(BatchIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CheckSumMap = (Map)record.get("CheckSum");
    Boolean CheckSumFetch = DataHelper.getFetch(CheckSumMap);
    Boolean CheckSumSortDir = DataHelper.getSortDirection(CheckSumMap);
    Integer CheckSumSortOrder = DataHelper.getSortOrder(CheckSumMap);
    if (CheckSumFetch != null) out.setCheckSumFetch(CheckSumFetch);
    if (CheckSumSortDir != null) out.setCheckSumSortDirection(CheckSumSortDir);
    if (CheckSumSortOrder != null) out.setCheckSumSortOrder(CheckSumSortOrder);

    Filter[] CheckSumFilter = DataHelper.mapToFilterArray(CheckSumMap, String.class);
    if (CheckSumFilter != null) {
      StringFilter[] CheckSumFilters = new StringFilter[CheckSumFilter.length];
      for (int i = 0; i < CheckSumFilters.length; i++) {
        CheckSumFilters[i] = (StringFilter)CheckSumFilter[i];
      }
      try {
        out.setCheckSumFilter(CheckSumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
