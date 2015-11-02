/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CdrDataDucObjectHelper.java
 * Definition File: Customer/CdrDataDuc.xml
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



/** Helper class to convert CdrDataDucObject JavaBean objects to/from HashMaps.
 */
public class CdrDataDucObjectHelper implements ArubaObjectHelper
{
  /** convert CdrDataDucObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CdrDataDucObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CdrDataDucObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CdrDataDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (CdrDataDucObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CdrDataDucObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CdrDataDucObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CdrDataDucObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CdrDataDucObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CdrDataDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (CdrDataDucObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CdrDataDucObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CdrDataDucObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CdrDataDucObjectData the converted object
   */
  public static CdrDataDucObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CdrDataDucObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CdrDataDucObject")
   * @return CdrDataDucObjectData the converted object
   */
  public static CdrDataDucObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CdrDataDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CdrDataDucObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CdrDataDucObjectFilter the converted object
   */
  public static CdrDataDucObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CdrDataDucObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CdrDataDucObject")
   * @return CdrDataDucObjectFilter the converted object
   */
  public static CdrDataDucObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CdrDataDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CdrDataDucObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CdrDataDucObjectDataList the converted object
   */
  public static CdrDataDucObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CdrDataDucObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CdrDataDucObjectList")
   * @return CdrDataDucObjectDataList the converted object
   */
  public static CdrDataDucObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CdrDataDucObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CdrDataDucObjectData[] array = null;
    if (root != null)
    {
      array = new CdrDataDucObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CdrDataDucObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CdrDataDucObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CdrDataDucObjectDataList (array, index, total);
  }
  /** convert CdrDataDucObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CdrDataDucObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CdrDataPartitionKeySet) record.put ("CdrDataPartitionKey", in.CdrDataPartitionKey);
  
    if (in._MsgIdSet) record.put ("MsgId", in.MsgId);
  
    if (in._MsgId2Set) record.put ("MsgId2", in.MsgId2);
  
    if (in._MsgIdServSet) record.put ("MsgIdServ", in.MsgIdServ);
  
    if (in._SplitRowNumSet) record.put ("SplitRowNum", in.SplitRowNum);
  
    if (in._DucTypeSet) record.put ("DucType", in.DucType);
  
    if (in._DucSubtypeSet) record.put ("DucSubtype", in.DucSubtype);
  
    if (in._DucPlanIdSet) record.put ("DucPlanId", in.DucPlanId);
  
    if (in._DucIdSet) record.put ("DucId", in.DucId);
  
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._AwardedQuantumTypeSet) record.put ("AwardedQuantumType", in.AwardedQuantumType);
  
    if (in._UnitsValueSet) record.put ("UnitsValue", in.UnitsValue);
  
    if (in._UnitsTypeSet) record.put ("UnitsType", in.UnitsType);
  
    if (in._MoneyValueSet) record.put ("MoneyValue", in.MoneyValue);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._RebateProrationRatioSet) record.put ("RebateProrationRatio", in.RebateProrationRatio);
  
    if (in._ThresholdProrationRatioSet) record.put ("ThresholdProrationRatio", in.ThresholdProrationRatio);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._ProfileIdServSet) record.put ("ProfileIdServ", in.ProfileIdServ);
  
    if (in._InstanceNumSet) record.put ("InstanceNum", in.InstanceNum);
  
    if (in._QuantumPreChargeSet) record.put ("QuantumPreCharge", in.QuantumPreCharge);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._InstanceStartDtSet) record.put ("InstanceStartDt", in.InstanceStartDt);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
      return record;
  }
  /** convert CdrDataDucObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CdrDataDucObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CdrDataPartitionKey, in.CdrDataPartitionKeySort, in.CdrDataPartitionKeySortAscending, in.CdrDataPartitionKeyFetch);
      if (map != null) record.put ("CdrDataPartitionKey", map);
      map = DataHelper.filterToMap (in.MsgId, in.MsgIdSort, in.MsgIdSortAscending, in.MsgIdFetch);
      if (map != null) record.put ("MsgId", map);
      map = DataHelper.filterToMap (in.MsgId2, in.MsgId2Sort, in.MsgId2SortAscending, in.MsgId2Fetch);
      if (map != null) record.put ("MsgId2", map);
      map = DataHelper.filterToMap (in.MsgIdServ, in.MsgIdServSort, in.MsgIdServSortAscending, in.MsgIdServFetch);
      if (map != null) record.put ("MsgIdServ", map);
      map = DataHelper.filterToMap (in.SplitRowNum, in.SplitRowNumSort, in.SplitRowNumSortAscending, in.SplitRowNumFetch);
      if (map != null) record.put ("SplitRowNum", map);
      map = DataHelper.filterToMap (in.DucType, in.DucTypeSort, in.DucTypeSortAscending, in.DucTypeFetch);
      if (map != null) record.put ("DucType", map);
      map = DataHelper.filterToMap (in.DucSubtype, in.DucSubtypeSort, in.DucSubtypeSortAscending, in.DucSubtypeFetch);
      if (map != null) record.put ("DucSubtype", map);
      map = DataHelper.filterToMap (in.DucPlanId, in.DucPlanIdSort, in.DucPlanIdSortAscending, in.DucPlanIdFetch);
      if (map != null) record.put ("DucPlanId", map);
      map = DataHelper.filterToMap (in.DucId, in.DucIdSort, in.DucIdSortAscending, in.DucIdFetch);
      if (map != null) record.put ("DucId", map);
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.AwardedQuantumType, in.AwardedQuantumTypeSort, in.AwardedQuantumTypeSortAscending, in.AwardedQuantumTypeFetch);
      if (map != null) record.put ("AwardedQuantumType", map);
      map = DataHelper.filterToMap (in.UnitsValue, in.UnitsValueSort, in.UnitsValueSortAscending, in.UnitsValueFetch);
      if (map != null) record.put ("UnitsValue", map);
      map = DataHelper.filterToMap (in.UnitsType, in.UnitsTypeSort, in.UnitsTypeSortAscending, in.UnitsTypeFetch);
      if (map != null) record.put ("UnitsType", map);
      map = DataHelper.filterToMap (in.MoneyValue, in.MoneyValueSort, in.MoneyValueSortAscending, in.MoneyValueFetch);
      if (map != null) record.put ("MoneyValue", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.RebateProrationRatio, in.RebateProrationRatioSort, in.RebateProrationRatioSortAscending, in.RebateProrationRatioFetch);
      if (map != null) record.put ("RebateProrationRatio", map);
      map = DataHelper.filterToMap (in.ThresholdProrationRatio, in.ThresholdProrationRatioSort, in.ThresholdProrationRatioSortAscending, in.ThresholdProrationRatioFetch);
      if (map != null) record.put ("ThresholdProrationRatio", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.ProfileIdServ, in.ProfileIdServSort, in.ProfileIdServSortAscending, in.ProfileIdServFetch);
      if (map != null) record.put ("ProfileIdServ", map);
      map = DataHelper.filterToMap (in.InstanceNum, in.InstanceNumSort, in.InstanceNumSortAscending, in.InstanceNumFetch);
      if (map != null) record.put ("InstanceNum", map);
      map = DataHelper.filterToMap (in.QuantumPreCharge, in.QuantumPreChargeSort, in.QuantumPreChargeSortAscending, in.QuantumPreChargeFetch);
      if (map != null) record.put ("QuantumPreCharge", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.InstanceStartDt, in.InstanceStartDtSort, in.InstanceStartDtSortAscending, in.InstanceStartDtFetch);
      if (map != null) record.put ("InstanceStartDt", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
    return record;
  }
  /** convert Map to CdrDataDucObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CdrDataDucObjectData the converted object
   */
  public static CdrDataDucObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CdrDataDucObjectData out = new CdrDataDucObjectData ();

    if ((obj = record.get ("CdrDataPartitionKey")) != null)
    {
      out.CdrDataPartitionKey = (Date) obj;
    }
  
    if ((obj = record.get ("MsgId")) != null)
    {
      out.MsgId = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgId2")) != null)
    {
      out.MsgId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgIdServ")) != null)
    {
      out.MsgIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("SplitRowNum")) != null)
    {
      out.SplitRowNum = (Integer) obj;
    }
  
    if ((obj = record.get ("DucType")) != null)
    {
      out.DucType = (Integer) obj;
    }
  
    if ((obj = record.get ("DucSubtype")) != null)
    {
      out.DucSubtype = (Integer) obj;
    }
  
    if ((obj = record.get ("DucPlanId")) != null)
    {
      out.DucPlanId = (Integer) obj;
    }
  
    if ((obj = record.get ("DucId")) != null)
    {
      out.DucId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingId")) != null)
    {
      out.ContractTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingIdServ")) != null)
    {
      out.ContractTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("AwardedQuantumType")) != null)
    {
      out.AwardedQuantumType = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitsValue")) != null)
    {
      out.UnitsValue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UnitsType")) != null)
    {
      out.UnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("MoneyValue")) != null)
    {
      out.MoneyValue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RebateProrationRatio")) != null)
    {
      out.RebateProrationRatio = (Integer) obj;
    }
  
    if ((obj = record.get ("ThresholdProrationRatio")) != null)
    {
      out.ThresholdProrationRatio = (Integer) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProfileIdServ")) != null)
    {
      out.ProfileIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("InstanceNum")) != null)
    {
      out.InstanceNum = (Integer) obj;
    }
  
    if ((obj = record.get ("QuantumPreCharge")) != null)
    {
      out.QuantumPreCharge = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("InstanceStartDt")) != null)
    {
      out.InstanceStartDt = (Date) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
      return out;
  }
  /** convert Map to CdrDataDucObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CdrDataDucObjectFilter the converted object
   */
  public static CdrDataDucObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CdrDataDucObjectFilter out = new CdrDataDucObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

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
  
    Map MsgIdMap = (Map)record.get("MsgId");
    Boolean MsgIdFetch = DataHelper.getFetch(MsgIdMap);
    Boolean MsgIdSortDir = DataHelper.getSortDirection(MsgIdMap);
    Integer MsgIdSortOrder = DataHelper.getSortOrder(MsgIdMap);
    if (MsgIdFetch != null) out.setMsgIdFetch(MsgIdFetch);
    if (MsgIdSortDir != null) out.setMsgIdSortDirection(MsgIdSortDir);
    if (MsgIdSortOrder != null) out.setMsgIdSortOrder(MsgIdSortOrder);

    Filter[] MsgIdFilter = DataHelper.mapToFilterArray(MsgIdMap, Integer.class);
    if (MsgIdFilter != null) {
      IntegerFilter[] MsgIdFilters = new IntegerFilter[MsgIdFilter.length];
      for (int i = 0; i < MsgIdFilters.length; i++) {
        MsgIdFilters[i] = (IntegerFilter)MsgIdFilter[i];
      }
      try {
        out.setMsgIdFilter(MsgIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgId2Map = (Map)record.get("MsgId2");
    Boolean MsgId2Fetch = DataHelper.getFetch(MsgId2Map);
    Boolean MsgId2SortDir = DataHelper.getSortDirection(MsgId2Map);
    Integer MsgId2SortOrder = DataHelper.getSortOrder(MsgId2Map);
    if (MsgId2Fetch != null) out.setMsgId2Fetch(MsgId2Fetch);
    if (MsgId2SortDir != null) out.setMsgId2SortDirection(MsgId2SortDir);
    if (MsgId2SortOrder != null) out.setMsgId2SortOrder(MsgId2SortOrder);

    Filter[] MsgId2Filter = DataHelper.mapToFilterArray(MsgId2Map, Integer.class);
    if (MsgId2Filter != null) {
      IntegerFilter[] MsgId2Filters = new IntegerFilter[MsgId2Filter.length];
      for (int i = 0; i < MsgId2Filters.length; i++) {
        MsgId2Filters[i] = (IntegerFilter)MsgId2Filter[i];
      }
      try {
        out.setMsgId2Filter(MsgId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgIdServMap = (Map)record.get("MsgIdServ");
    Boolean MsgIdServFetch = DataHelper.getFetch(MsgIdServMap);
    Boolean MsgIdServSortDir = DataHelper.getSortDirection(MsgIdServMap);
    Integer MsgIdServSortOrder = DataHelper.getSortOrder(MsgIdServMap);
    if (MsgIdServFetch != null) out.setMsgIdServFetch(MsgIdServFetch);
    if (MsgIdServSortDir != null) out.setMsgIdServSortDirection(MsgIdServSortDir);
    if (MsgIdServSortOrder != null) out.setMsgIdServSortOrder(MsgIdServSortOrder);

    Filter[] MsgIdServFilter = DataHelper.mapToFilterArray(MsgIdServMap, Integer.class);
    if (MsgIdServFilter != null) {
      IntegerFilter[] MsgIdServFilters = new IntegerFilter[MsgIdServFilter.length];
      for (int i = 0; i < MsgIdServFilters.length; i++) {
        MsgIdServFilters[i] = (IntegerFilter)MsgIdServFilter[i];
      }
      try {
        out.setMsgIdServFilter(MsgIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SplitRowNumMap = (Map)record.get("SplitRowNum");
    Boolean SplitRowNumFetch = DataHelper.getFetch(SplitRowNumMap);
    Boolean SplitRowNumSortDir = DataHelper.getSortDirection(SplitRowNumMap);
    Integer SplitRowNumSortOrder = DataHelper.getSortOrder(SplitRowNumMap);
    if (SplitRowNumFetch != null) out.setSplitRowNumFetch(SplitRowNumFetch);
    if (SplitRowNumSortDir != null) out.setSplitRowNumSortDirection(SplitRowNumSortDir);
    if (SplitRowNumSortOrder != null) out.setSplitRowNumSortOrder(SplitRowNumSortOrder);

    Filter[] SplitRowNumFilter = DataHelper.mapToFilterArray(SplitRowNumMap, Integer.class);
    if (SplitRowNumFilter != null) {
      IntegerFilter[] SplitRowNumFilters = new IntegerFilter[SplitRowNumFilter.length];
      for (int i = 0; i < SplitRowNumFilters.length; i++) {
        SplitRowNumFilters[i] = (IntegerFilter)SplitRowNumFilter[i];
      }
      try {
        out.setSplitRowNumFilter(SplitRowNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucTypeMap = (Map)record.get("DucType");
    Boolean DucTypeFetch = DataHelper.getFetch(DucTypeMap);
    Boolean DucTypeSortDir = DataHelper.getSortDirection(DucTypeMap);
    Integer DucTypeSortOrder = DataHelper.getSortOrder(DucTypeMap);
    if (DucTypeFetch != null) out.setDucTypeFetch(DucTypeFetch);
    if (DucTypeSortDir != null) out.setDucTypeSortDirection(DucTypeSortDir);
    if (DucTypeSortOrder != null) out.setDucTypeSortOrder(DucTypeSortOrder);

    Filter[] DucTypeFilter = DataHelper.mapToFilterArray(DucTypeMap, Integer.class);
    if (DucTypeFilter != null) {
      IntegerFilter[] DucTypeFilters = new IntegerFilter[DucTypeFilter.length];
      for (int i = 0; i < DucTypeFilters.length; i++) {
        DucTypeFilters[i] = (IntegerFilter)DucTypeFilter[i];
      }
      try {
        out.setDucTypeFilter(DucTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucSubtypeMap = (Map)record.get("DucSubtype");
    Boolean DucSubtypeFetch = DataHelper.getFetch(DucSubtypeMap);
    Boolean DucSubtypeSortDir = DataHelper.getSortDirection(DucSubtypeMap);
    Integer DucSubtypeSortOrder = DataHelper.getSortOrder(DucSubtypeMap);
    if (DucSubtypeFetch != null) out.setDucSubtypeFetch(DucSubtypeFetch);
    if (DucSubtypeSortDir != null) out.setDucSubtypeSortDirection(DucSubtypeSortDir);
    if (DucSubtypeSortOrder != null) out.setDucSubtypeSortOrder(DucSubtypeSortOrder);

    Filter[] DucSubtypeFilter = DataHelper.mapToFilterArray(DucSubtypeMap, Integer.class);
    if (DucSubtypeFilter != null) {
      IntegerFilter[] DucSubtypeFilters = new IntegerFilter[DucSubtypeFilter.length];
      for (int i = 0; i < DucSubtypeFilters.length; i++) {
        DucSubtypeFilters[i] = (IntegerFilter)DucSubtypeFilter[i];
      }
      try {
        out.setDucSubtypeFilter(DucSubtypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucPlanIdMap = (Map)record.get("DucPlanId");
    Boolean DucPlanIdFetch = DataHelper.getFetch(DucPlanIdMap);
    Boolean DucPlanIdSortDir = DataHelper.getSortDirection(DucPlanIdMap);
    Integer DucPlanIdSortOrder = DataHelper.getSortOrder(DucPlanIdMap);
    if (DucPlanIdFetch != null) out.setDucPlanIdFetch(DucPlanIdFetch);
    if (DucPlanIdSortDir != null) out.setDucPlanIdSortDirection(DucPlanIdSortDir);
    if (DucPlanIdSortOrder != null) out.setDucPlanIdSortOrder(DucPlanIdSortOrder);

    Filter[] DucPlanIdFilter = DataHelper.mapToFilterArray(DucPlanIdMap, Integer.class);
    if (DucPlanIdFilter != null) {
      IntegerFilter[] DucPlanIdFilters = new IntegerFilter[DucPlanIdFilter.length];
      for (int i = 0; i < DucPlanIdFilters.length; i++) {
        DucPlanIdFilters[i] = (IntegerFilter)DucPlanIdFilter[i];
      }
      try {
        out.setDucPlanIdFilter(DucPlanIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucIdMap = (Map)record.get("DucId");
    Boolean DucIdFetch = DataHelper.getFetch(DucIdMap);
    Boolean DucIdSortDir = DataHelper.getSortDirection(DucIdMap);
    Integer DucIdSortOrder = DataHelper.getSortOrder(DucIdMap);
    if (DucIdFetch != null) out.setDucIdFetch(DucIdFetch);
    if (DucIdSortDir != null) out.setDucIdSortDirection(DucIdSortDir);
    if (DucIdSortOrder != null) out.setDucIdSortOrder(DucIdSortOrder);

    Filter[] DucIdFilter = DataHelper.mapToFilterArray(DucIdMap, Integer.class);
    if (DucIdFilter != null) {
      IntegerFilter[] DucIdFilters = new IntegerFilter[DucIdFilter.length];
      for (int i = 0; i < DucIdFilters.length; i++) {
        DucIdFilters[i] = (IntegerFilter)DucIdFilter[i];
      }
      try {
        out.setDucIdFilter(DucIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdMap = (Map)record.get("ContractTrackingId");
    Boolean ContractTrackingIdFetch = DataHelper.getFetch(ContractTrackingIdMap);
    Boolean ContractTrackingIdSortDir = DataHelper.getSortDirection(ContractTrackingIdMap);
    Integer ContractTrackingIdSortOrder = DataHelper.getSortOrder(ContractTrackingIdMap);
    if (ContractTrackingIdFetch != null) out.setContractTrackingIdFetch(ContractTrackingIdFetch);
    if (ContractTrackingIdSortDir != null) out.setContractTrackingIdSortDirection(ContractTrackingIdSortDir);
    if (ContractTrackingIdSortOrder != null) out.setContractTrackingIdSortOrder(ContractTrackingIdSortOrder);

    Filter[] ContractTrackingIdFilter = DataHelper.mapToFilterArray(ContractTrackingIdMap, Integer.class);
    if (ContractTrackingIdFilter != null) {
      IntegerFilter[] ContractTrackingIdFilters = new IntegerFilter[ContractTrackingIdFilter.length];
      for (int i = 0; i < ContractTrackingIdFilters.length; i++) {
        ContractTrackingIdFilters[i] = (IntegerFilter)ContractTrackingIdFilter[i];
      }
      try {
        out.setContractTrackingIdFilter(ContractTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdServMap = (Map)record.get("ContractTrackingIdServ");
    Boolean ContractTrackingIdServFetch = DataHelper.getFetch(ContractTrackingIdServMap);
    Boolean ContractTrackingIdServSortDir = DataHelper.getSortDirection(ContractTrackingIdServMap);
    Integer ContractTrackingIdServSortOrder = DataHelper.getSortOrder(ContractTrackingIdServMap);
    if (ContractTrackingIdServFetch != null) out.setContractTrackingIdServFetch(ContractTrackingIdServFetch);
    if (ContractTrackingIdServSortDir != null) out.setContractTrackingIdServSortDirection(ContractTrackingIdServSortDir);
    if (ContractTrackingIdServSortOrder != null) out.setContractTrackingIdServSortOrder(ContractTrackingIdServSortOrder);

    Filter[] ContractTrackingIdServFilter = DataHelper.mapToFilterArray(ContractTrackingIdServMap, Integer.class);
    if (ContractTrackingIdServFilter != null) {
      IntegerFilter[] ContractTrackingIdServFilters = new IntegerFilter[ContractTrackingIdServFilter.length];
      for (int i = 0; i < ContractTrackingIdServFilters.length; i++) {
        ContractTrackingIdServFilters[i] = (IntegerFilter)ContractTrackingIdServFilter[i];
      }
      try {
        out.setContractTrackingIdServFilter(ContractTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AwardedQuantumTypeMap = (Map)record.get("AwardedQuantumType");
    Boolean AwardedQuantumTypeFetch = DataHelper.getFetch(AwardedQuantumTypeMap);
    Boolean AwardedQuantumTypeSortDir = DataHelper.getSortDirection(AwardedQuantumTypeMap);
    Integer AwardedQuantumTypeSortOrder = DataHelper.getSortOrder(AwardedQuantumTypeMap);
    if (AwardedQuantumTypeFetch != null) out.setAwardedQuantumTypeFetch(AwardedQuantumTypeFetch);
    if (AwardedQuantumTypeSortDir != null) out.setAwardedQuantumTypeSortDirection(AwardedQuantumTypeSortDir);
    if (AwardedQuantumTypeSortOrder != null) out.setAwardedQuantumTypeSortOrder(AwardedQuantumTypeSortOrder);

    Filter[] AwardedQuantumTypeFilter = DataHelper.mapToFilterArray(AwardedQuantumTypeMap, Integer.class);
    if (AwardedQuantumTypeFilter != null) {
      IntegerFilter[] AwardedQuantumTypeFilters = new IntegerFilter[AwardedQuantumTypeFilter.length];
      for (int i = 0; i < AwardedQuantumTypeFilters.length; i++) {
        AwardedQuantumTypeFilters[i] = (IntegerFilter)AwardedQuantumTypeFilter[i];
      }
      try {
        out.setAwardedQuantumTypeFilter(AwardedQuantumTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsValueMap = (Map)record.get("UnitsValue");
    Boolean UnitsValueFetch = DataHelper.getFetch(UnitsValueMap);
    Boolean UnitsValueSortDir = DataHelper.getSortDirection(UnitsValueMap);
    Integer UnitsValueSortOrder = DataHelper.getSortOrder(UnitsValueMap);
    if (UnitsValueFetch != null) out.setUnitsValueFetch(UnitsValueFetch);
    if (UnitsValueSortDir != null) out.setUnitsValueSortDirection(UnitsValueSortDir);
    if (UnitsValueSortOrder != null) out.setUnitsValueSortOrder(UnitsValueSortOrder);

    Filter[] UnitsValueFilter = DataHelper.mapToFilterArray(UnitsValueMap, BigInteger.class);
    if (UnitsValueFilter != null) {
      BigIntegerFilter[] UnitsValueFilters = new BigIntegerFilter[UnitsValueFilter.length];
      for (int i = 0; i < UnitsValueFilters.length; i++) {
        UnitsValueFilters[i] = (BigIntegerFilter)UnitsValueFilter[i];
      }
      try {
        out.setUnitsValueFilter(UnitsValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsTypeMap = (Map)record.get("UnitsType");
    Boolean UnitsTypeFetch = DataHelper.getFetch(UnitsTypeMap);
    Boolean UnitsTypeSortDir = DataHelper.getSortDirection(UnitsTypeMap);
    Integer UnitsTypeSortOrder = DataHelper.getSortOrder(UnitsTypeMap);
    if (UnitsTypeFetch != null) out.setUnitsTypeFetch(UnitsTypeFetch);
    if (UnitsTypeSortDir != null) out.setUnitsTypeSortDirection(UnitsTypeSortDir);
    if (UnitsTypeSortOrder != null) out.setUnitsTypeSortOrder(UnitsTypeSortOrder);

    Filter[] UnitsTypeFilter = DataHelper.mapToFilterArray(UnitsTypeMap, Integer.class);
    if (UnitsTypeFilter != null) {
      IntegerFilter[] UnitsTypeFilters = new IntegerFilter[UnitsTypeFilter.length];
      for (int i = 0; i < UnitsTypeFilters.length; i++) {
        UnitsTypeFilters[i] = (IntegerFilter)UnitsTypeFilter[i];
      }
      try {
        out.setUnitsTypeFilter(UnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MoneyValueMap = (Map)record.get("MoneyValue");
    Boolean MoneyValueFetch = DataHelper.getFetch(MoneyValueMap);
    Boolean MoneyValueSortDir = DataHelper.getSortDirection(MoneyValueMap);
    Integer MoneyValueSortOrder = DataHelper.getSortOrder(MoneyValueMap);
    if (MoneyValueFetch != null) out.setMoneyValueFetch(MoneyValueFetch);
    if (MoneyValueSortDir != null) out.setMoneyValueSortDirection(MoneyValueSortDir);
    if (MoneyValueSortOrder != null) out.setMoneyValueSortOrder(MoneyValueSortOrder);

    Filter[] MoneyValueFilter = DataHelper.mapToFilterArray(MoneyValueMap, BigInteger.class);
    if (MoneyValueFilter != null) {
      BigIntegerFilter[] MoneyValueFilters = new BigIntegerFilter[MoneyValueFilter.length];
      for (int i = 0; i < MoneyValueFilters.length; i++) {
        MoneyValueFilters[i] = (BigIntegerFilter)MoneyValueFilter[i];
      }
      try {
        out.setMoneyValueFilter(MoneyValueFilters);
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
  
    Map RebateProrationRatioMap = (Map)record.get("RebateProrationRatio");
    Boolean RebateProrationRatioFetch = DataHelper.getFetch(RebateProrationRatioMap);
    Boolean RebateProrationRatioSortDir = DataHelper.getSortDirection(RebateProrationRatioMap);
    Integer RebateProrationRatioSortOrder = DataHelper.getSortOrder(RebateProrationRatioMap);
    if (RebateProrationRatioFetch != null) out.setRebateProrationRatioFetch(RebateProrationRatioFetch);
    if (RebateProrationRatioSortDir != null) out.setRebateProrationRatioSortDirection(RebateProrationRatioSortDir);
    if (RebateProrationRatioSortOrder != null) out.setRebateProrationRatioSortOrder(RebateProrationRatioSortOrder);

    Filter[] RebateProrationRatioFilter = DataHelper.mapToFilterArray(RebateProrationRatioMap, Integer.class);
    if (RebateProrationRatioFilter != null) {
      IntegerFilter[] RebateProrationRatioFilters = new IntegerFilter[RebateProrationRatioFilter.length];
      for (int i = 0; i < RebateProrationRatioFilters.length; i++) {
        RebateProrationRatioFilters[i] = (IntegerFilter)RebateProrationRatioFilter[i];
      }
      try {
        out.setRebateProrationRatioFilter(RebateProrationRatioFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ThresholdProrationRatioMap = (Map)record.get("ThresholdProrationRatio");
    Boolean ThresholdProrationRatioFetch = DataHelper.getFetch(ThresholdProrationRatioMap);
    Boolean ThresholdProrationRatioSortDir = DataHelper.getSortDirection(ThresholdProrationRatioMap);
    Integer ThresholdProrationRatioSortOrder = DataHelper.getSortOrder(ThresholdProrationRatioMap);
    if (ThresholdProrationRatioFetch != null) out.setThresholdProrationRatioFetch(ThresholdProrationRatioFetch);
    if (ThresholdProrationRatioSortDir != null) out.setThresholdProrationRatioSortDirection(ThresholdProrationRatioSortDir);
    if (ThresholdProrationRatioSortOrder != null) out.setThresholdProrationRatioSortOrder(ThresholdProrationRatioSortOrder);

    Filter[] ThresholdProrationRatioFilter = DataHelper.mapToFilterArray(ThresholdProrationRatioMap, Integer.class);
    if (ThresholdProrationRatioFilter != null) {
      IntegerFilter[] ThresholdProrationRatioFilters = new IntegerFilter[ThresholdProrationRatioFilter.length];
      for (int i = 0; i < ThresholdProrationRatioFilters.length; i++) {
        ThresholdProrationRatioFilters[i] = (IntegerFilter)ThresholdProrationRatioFilter[i];
      }
      try {
        out.setThresholdProrationRatioFilter(ThresholdProrationRatioFilters);
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

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, Integer.class);
    if (ProfileIdFilter != null) {
      IntegerFilter[] ProfileIdFilters = new IntegerFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (IntegerFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProfileIdServMap = (Map)record.get("ProfileIdServ");
    Boolean ProfileIdServFetch = DataHelper.getFetch(ProfileIdServMap);
    Boolean ProfileIdServSortDir = DataHelper.getSortDirection(ProfileIdServMap);
    Integer ProfileIdServSortOrder = DataHelper.getSortOrder(ProfileIdServMap);
    if (ProfileIdServFetch != null) out.setProfileIdServFetch(ProfileIdServFetch);
    if (ProfileIdServSortDir != null) out.setProfileIdServSortDirection(ProfileIdServSortDir);
    if (ProfileIdServSortOrder != null) out.setProfileIdServSortOrder(ProfileIdServSortOrder);

    Filter[] ProfileIdServFilter = DataHelper.mapToFilterArray(ProfileIdServMap, Integer.class);
    if (ProfileIdServFilter != null) {
      IntegerFilter[] ProfileIdServFilters = new IntegerFilter[ProfileIdServFilter.length];
      for (int i = 0; i < ProfileIdServFilters.length; i++) {
        ProfileIdServFilters[i] = (IntegerFilter)ProfileIdServFilter[i];
      }
      try {
        out.setProfileIdServFilter(ProfileIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InstanceNumMap = (Map)record.get("InstanceNum");
    Boolean InstanceNumFetch = DataHelper.getFetch(InstanceNumMap);
    Boolean InstanceNumSortDir = DataHelper.getSortDirection(InstanceNumMap);
    Integer InstanceNumSortOrder = DataHelper.getSortOrder(InstanceNumMap);
    if (InstanceNumFetch != null) out.setInstanceNumFetch(InstanceNumFetch);
    if (InstanceNumSortDir != null) out.setInstanceNumSortDirection(InstanceNumSortDir);
    if (InstanceNumSortOrder != null) out.setInstanceNumSortOrder(InstanceNumSortOrder);

    Filter[] InstanceNumFilter = DataHelper.mapToFilterArray(InstanceNumMap, Integer.class);
    if (InstanceNumFilter != null) {
      IntegerFilter[] InstanceNumFilters = new IntegerFilter[InstanceNumFilter.length];
      for (int i = 0; i < InstanceNumFilters.length; i++) {
        InstanceNumFilters[i] = (IntegerFilter)InstanceNumFilter[i];
      }
      try {
        out.setInstanceNumFilter(InstanceNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map QuantumPreChargeMap = (Map)record.get("QuantumPreCharge");
    Boolean QuantumPreChargeFetch = DataHelper.getFetch(QuantumPreChargeMap);
    Boolean QuantumPreChargeSortDir = DataHelper.getSortDirection(QuantumPreChargeMap);
    Integer QuantumPreChargeSortOrder = DataHelper.getSortOrder(QuantumPreChargeMap);
    if (QuantumPreChargeFetch != null) out.setQuantumPreChargeFetch(QuantumPreChargeFetch);
    if (QuantumPreChargeSortDir != null) out.setQuantumPreChargeSortDirection(QuantumPreChargeSortDir);
    if (QuantumPreChargeSortOrder != null) out.setQuantumPreChargeSortOrder(QuantumPreChargeSortOrder);

    Filter[] QuantumPreChargeFilter = DataHelper.mapToFilterArray(QuantumPreChargeMap, BigInteger.class);
    if (QuantumPreChargeFilter != null) {
      BigIntegerFilter[] QuantumPreChargeFilters = new BigIntegerFilter[QuantumPreChargeFilter.length];
      for (int i = 0; i < QuantumPreChargeFilters.length; i++) {
        QuantumPreChargeFilters[i] = (BigIntegerFilter)QuantumPreChargeFilter[i];
      }
      try {
        out.setQuantumPreChargeFilter(QuantumPreChargeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InstanceStartDtMap = (Map)record.get("InstanceStartDt");
    Boolean InstanceStartDtFetch = DataHelper.getFetch(InstanceStartDtMap);
    Boolean InstanceStartDtSortDir = DataHelper.getSortDirection(InstanceStartDtMap);
    Integer InstanceStartDtSortOrder = DataHelper.getSortOrder(InstanceStartDtMap);
    if (InstanceStartDtFetch != null) out.setInstanceStartDtFetch(InstanceStartDtFetch);
    if (InstanceStartDtSortDir != null) out.setInstanceStartDtSortDirection(InstanceStartDtSortDir);
    if (InstanceStartDtSortOrder != null) out.setInstanceStartDtSortOrder(InstanceStartDtSortOrder);

    Filter[] InstanceStartDtFilter = DataHelper.mapToFilterArray(InstanceStartDtMap, Date.class);
    if (InstanceStartDtFilter != null) {
      DateFilter[] InstanceStartDtFilters = new DateFilter[InstanceStartDtFilter.length];
      for (int i = 0; i < InstanceStartDtFilters.length; i++) {
        InstanceStartDtFilters[i] = (DateFilter)InstanceStartDtFilter[i];
      }
      try {
        out.setInstanceStartDtFilter(InstanceStartDtFilters);
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
  
    return out;
  }
}
