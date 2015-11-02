/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfRewardBalanceDetailObjectHelper.java
 * Definition File: Customer/CmfRewardBalanceDetail.xml
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



/** Helper class to convert CmfRewardBalanceDetailObject JavaBean objects to/from HashMaps.
 */
public class CmfRewardBalanceDetailObjectHelper implements ArubaObjectHelper
{
  /** convert CmfRewardBalanceDetailObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfRewardBalanceDetailObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfRewardBalanceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CmfRewardBalanceDetailObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfRewardBalanceDetailObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfRewardBalanceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CmfRewardBalanceDetailObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CmfRewardBalanceDetailObjectData the converted object
   */
  public static CmfRewardBalanceDetailObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CmfRewardBalanceDetailObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CmfRewardBalanceDetailObject")
   * @return CmfRewardBalanceDetailObjectData the converted object
   */
  public static CmfRewardBalanceDetailObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CmfRewardBalanceDetailObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CmfRewardBalanceDetailObjectFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CmfRewardBalanceDetailObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CmfRewardBalanceDetailObject")
   * @return CmfRewardBalanceDetailObjectFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CmfRewardBalanceDetailObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CmfRewardBalanceDetailObjectDataList the converted object
   */
  public static CmfRewardBalanceDetailObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CmfRewardBalanceDetailObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CmfRewardBalanceDetailObjectList")
   * @return CmfRewardBalanceDetailObjectDataList the converted object
   */
  public static CmfRewardBalanceDetailObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfRewardBalanceDetailObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CmfRewardBalanceDetailObjectData[] array = null;
    if (root != null)
    {
      array = new CmfRewardBalanceDetailObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CmfRewardBalanceDetailObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CmfRewardBalanceDetailObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CmfRewardBalanceDetailObjectDataList (array, index, total);
  }
  /** convert CmfRewardBalanceDetailObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CmfRewardBalanceDetailObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CmfRewardBalanceDetailObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._ExpirationDateSet) record.put ("ExpirationDate", in.ExpirationDate);
  
    if (in._CloseDateSet) record.put ("CloseDate", in.CloseDate);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._NewRewardSet) record.put ("NewReward", in.NewReward);
  
    if (in._TotalRewardSet) record.put ("TotalReward", in.TotalReward);
  
    if (in._TotalAvailableRewardSet) record.put ("TotalAvailableReward", in.TotalAvailableReward);
  
    if (in._BalanceRewardSet) record.put ("BalanceReward", in.BalanceReward);
  
    if (in._TotalAdjSet) record.put ("TotalAdj", in.TotalAdj);
  
    if (in._TotalSpendSet) record.put ("TotalSpend", in.TotalSpend);
      return record;
  }
  /** convert CmfRewardBalanceDetailObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CmfRewardBalanceDetailObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CmfRewardBalanceDetailObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.ExpirationDate, in.ExpirationDateSort, in.ExpirationDateSortAscending, in.ExpirationDateFetch);
      if (map != null) record.put ("ExpirationDate", map);
      map = DataHelper.filterToMap (in.CloseDate, in.CloseDateSort, in.CloseDateSortAscending, in.CloseDateFetch);
      if (map != null) record.put ("CloseDate", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.NewReward, in.NewRewardSort, in.NewRewardSortAscending, in.NewRewardFetch);
      if (map != null) record.put ("NewReward", map);
      map = DataHelper.filterToMap (in.TotalReward, in.TotalRewardSort, in.TotalRewardSortAscending, in.TotalRewardFetch);
      if (map != null) record.put ("TotalReward", map);
      map = DataHelper.filterToMap (in.TotalAvailableReward, in.TotalAvailableRewardSort, in.TotalAvailableRewardSortAscending, in.TotalAvailableRewardFetch);
      if (map != null) record.put ("TotalAvailableReward", map);
      map = DataHelper.filterToMap (in.BalanceReward, in.BalanceRewardSort, in.BalanceRewardSortAscending, in.BalanceRewardFetch);
      if (map != null) record.put ("BalanceReward", map);
      map = DataHelper.filterToMap (in.TotalAdj, in.TotalAdjSort, in.TotalAdjSortAscending, in.TotalAdjFetch);
      if (map != null) record.put ("TotalAdj", map);
      map = DataHelper.filterToMap (in.TotalSpend, in.TotalSpendSort, in.TotalSpendSortAscending, in.TotalSpendFetch);
      if (map != null) record.put ("TotalSpend", map);
    return record;
  }
  /** convert Map to CmfRewardBalanceDetailObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfRewardBalanceDetailObjectData the converted object
   */
  public static CmfRewardBalanceDetailObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfRewardBalanceDetailObjectData out = new CmfRewardBalanceDetailObjectData ();

    out.Key = CmfRewardBalanceDetailObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ExpirationDate")) != null)
    {
      out.ExpirationDate = (Date) obj;
    }
  
    if ((obj = record.get ("CloseDate")) != null)
    {
      out.CloseDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("NewReward")) != null)
    {
      out.NewReward = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalReward")) != null)
    {
      out.TotalReward = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalAvailableReward")) != null)
    {
      out.TotalAvailableReward = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BalanceReward")) != null)
    {
      out.BalanceReward = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalAdj")) != null)
    {
      out.TotalAdj = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalSpend")) != null)
    {
      out.TotalSpend = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to CmfRewardBalanceDetailObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfRewardBalanceDetailObjectFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfRewardBalanceDetailObjectFilter out = new CmfRewardBalanceDetailObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CmfRewardBalanceDetailObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ExpirationDateMap = (Map)record.get("ExpirationDate");
    Boolean ExpirationDateFetch = DataHelper.getFetch(ExpirationDateMap);
    Boolean ExpirationDateSortDir = DataHelper.getSortDirection(ExpirationDateMap);
    Integer ExpirationDateSortOrder = DataHelper.getSortOrder(ExpirationDateMap);
    if (ExpirationDateFetch != null) out.setExpirationDateFetch(ExpirationDateFetch);
    if (ExpirationDateSortDir != null) out.setExpirationDateSortDirection(ExpirationDateSortDir);
    if (ExpirationDateSortOrder != null) out.setExpirationDateSortOrder(ExpirationDateSortOrder);

    Filter[] ExpirationDateFilter = DataHelper.mapToFilterArray(ExpirationDateMap, Date.class);
    if (ExpirationDateFilter != null) {
      DateFilter[] ExpirationDateFilters = new DateFilter[ExpirationDateFilter.length];
      for (int i = 0; i < ExpirationDateFilters.length; i++) {
        ExpirationDateFilters[i] = (DateFilter)ExpirationDateFilter[i];
      }
      try {
        out.setExpirationDateFilter(ExpirationDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CloseDateMap = (Map)record.get("CloseDate");
    Boolean CloseDateFetch = DataHelper.getFetch(CloseDateMap);
    Boolean CloseDateSortDir = DataHelper.getSortDirection(CloseDateMap);
    Integer CloseDateSortOrder = DataHelper.getSortOrder(CloseDateMap);
    if (CloseDateFetch != null) out.setCloseDateFetch(CloseDateFetch);
    if (CloseDateSortDir != null) out.setCloseDateSortDirection(CloseDateSortDir);
    if (CloseDateSortOrder != null) out.setCloseDateSortOrder(CloseDateSortOrder);

    Filter[] CloseDateFilter = DataHelper.mapToFilterArray(CloseDateMap, Date.class);
    if (CloseDateFilter != null) {
      DateFilter[] CloseDateFilters = new DateFilter[CloseDateFilter.length];
      for (int i = 0; i < CloseDateFilters.length; i++) {
        CloseDateFilters[i] = (DateFilter)CloseDateFilter[i];
      }
      try {
        out.setCloseDateFilter(CloseDateFilters);
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
  
    Map NewRewardMap = (Map)record.get("NewReward");
    Boolean NewRewardFetch = DataHelper.getFetch(NewRewardMap);
    Boolean NewRewardSortDir = DataHelper.getSortDirection(NewRewardMap);
    Integer NewRewardSortOrder = DataHelper.getSortOrder(NewRewardMap);
    if (NewRewardFetch != null) out.setNewRewardFetch(NewRewardFetch);
    if (NewRewardSortDir != null) out.setNewRewardSortDirection(NewRewardSortDir);
    if (NewRewardSortOrder != null) out.setNewRewardSortOrder(NewRewardSortOrder);

    Filter[] NewRewardFilter = DataHelper.mapToFilterArray(NewRewardMap, BigInteger.class);
    if (NewRewardFilter != null) {
      BigIntegerFilter[] NewRewardFilters = new BigIntegerFilter[NewRewardFilter.length];
      for (int i = 0; i < NewRewardFilters.length; i++) {
        NewRewardFilters[i] = (BigIntegerFilter)NewRewardFilter[i];
      }
      try {
        out.setNewRewardFilter(NewRewardFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalRewardMap = (Map)record.get("TotalReward");
    Boolean TotalRewardFetch = DataHelper.getFetch(TotalRewardMap);
    Boolean TotalRewardSortDir = DataHelper.getSortDirection(TotalRewardMap);
    Integer TotalRewardSortOrder = DataHelper.getSortOrder(TotalRewardMap);
    if (TotalRewardFetch != null) out.setTotalRewardFetch(TotalRewardFetch);
    if (TotalRewardSortDir != null) out.setTotalRewardSortDirection(TotalRewardSortDir);
    if (TotalRewardSortOrder != null) out.setTotalRewardSortOrder(TotalRewardSortOrder);

    Filter[] TotalRewardFilter = DataHelper.mapToFilterArray(TotalRewardMap, BigInteger.class);
    if (TotalRewardFilter != null) {
      BigIntegerFilter[] TotalRewardFilters = new BigIntegerFilter[TotalRewardFilter.length];
      for (int i = 0; i < TotalRewardFilters.length; i++) {
        TotalRewardFilters[i] = (BigIntegerFilter)TotalRewardFilter[i];
      }
      try {
        out.setTotalRewardFilter(TotalRewardFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAvailableRewardMap = (Map)record.get("TotalAvailableReward");
    Boolean TotalAvailableRewardFetch = DataHelper.getFetch(TotalAvailableRewardMap);
    Boolean TotalAvailableRewardSortDir = DataHelper.getSortDirection(TotalAvailableRewardMap);
    Integer TotalAvailableRewardSortOrder = DataHelper.getSortOrder(TotalAvailableRewardMap);
    if (TotalAvailableRewardFetch != null) out.setTotalAvailableRewardFetch(TotalAvailableRewardFetch);
    if (TotalAvailableRewardSortDir != null) out.setTotalAvailableRewardSortDirection(TotalAvailableRewardSortDir);
    if (TotalAvailableRewardSortOrder != null) out.setTotalAvailableRewardSortOrder(TotalAvailableRewardSortOrder);

    Filter[] TotalAvailableRewardFilter = DataHelper.mapToFilterArray(TotalAvailableRewardMap, BigInteger.class);
    if (TotalAvailableRewardFilter != null) {
      BigIntegerFilter[] TotalAvailableRewardFilters = new BigIntegerFilter[TotalAvailableRewardFilter.length];
      for (int i = 0; i < TotalAvailableRewardFilters.length; i++) {
        TotalAvailableRewardFilters[i] = (BigIntegerFilter)TotalAvailableRewardFilter[i];
      }
      try {
        out.setTotalAvailableRewardFilter(TotalAvailableRewardFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceRewardMap = (Map)record.get("BalanceReward");
    Boolean BalanceRewardFetch = DataHelper.getFetch(BalanceRewardMap);
    Boolean BalanceRewardSortDir = DataHelper.getSortDirection(BalanceRewardMap);
    Integer BalanceRewardSortOrder = DataHelper.getSortOrder(BalanceRewardMap);
    if (BalanceRewardFetch != null) out.setBalanceRewardFetch(BalanceRewardFetch);
    if (BalanceRewardSortDir != null) out.setBalanceRewardSortDirection(BalanceRewardSortDir);
    if (BalanceRewardSortOrder != null) out.setBalanceRewardSortOrder(BalanceRewardSortOrder);

    Filter[] BalanceRewardFilter = DataHelper.mapToFilterArray(BalanceRewardMap, BigInteger.class);
    if (BalanceRewardFilter != null) {
      BigIntegerFilter[] BalanceRewardFilters = new BigIntegerFilter[BalanceRewardFilter.length];
      for (int i = 0; i < BalanceRewardFilters.length; i++) {
        BalanceRewardFilters[i] = (BigIntegerFilter)BalanceRewardFilter[i];
      }
      try {
        out.setBalanceRewardFilter(BalanceRewardFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAdjMap = (Map)record.get("TotalAdj");
    Boolean TotalAdjFetch = DataHelper.getFetch(TotalAdjMap);
    Boolean TotalAdjSortDir = DataHelper.getSortDirection(TotalAdjMap);
    Integer TotalAdjSortOrder = DataHelper.getSortOrder(TotalAdjMap);
    if (TotalAdjFetch != null) out.setTotalAdjFetch(TotalAdjFetch);
    if (TotalAdjSortDir != null) out.setTotalAdjSortDirection(TotalAdjSortDir);
    if (TotalAdjSortOrder != null) out.setTotalAdjSortOrder(TotalAdjSortOrder);

    Filter[] TotalAdjFilter = DataHelper.mapToFilterArray(TotalAdjMap, BigInteger.class);
    if (TotalAdjFilter != null) {
      BigIntegerFilter[] TotalAdjFilters = new BigIntegerFilter[TotalAdjFilter.length];
      for (int i = 0; i < TotalAdjFilters.length; i++) {
        TotalAdjFilters[i] = (BigIntegerFilter)TotalAdjFilter[i];
      }
      try {
        out.setTotalAdjFilter(TotalAdjFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalSpendMap = (Map)record.get("TotalSpend");
    Boolean TotalSpendFetch = DataHelper.getFetch(TotalSpendMap);
    Boolean TotalSpendSortDir = DataHelper.getSortDirection(TotalSpendMap);
    Integer TotalSpendSortOrder = DataHelper.getSortOrder(TotalSpendMap);
    if (TotalSpendFetch != null) out.setTotalSpendFetch(TotalSpendFetch);
    if (TotalSpendSortDir != null) out.setTotalSpendSortDirection(TotalSpendSortDir);
    if (TotalSpendSortOrder != null) out.setTotalSpendSortOrder(TotalSpendSortOrder);

    Filter[] TotalSpendFilter = DataHelper.mapToFilterArray(TotalSpendMap, BigInteger.class);
    if (TotalSpendFilter != null) {
      BigIntegerFilter[] TotalSpendFilters = new BigIntegerFilter[TotalSpendFilter.length];
      for (int i = 0; i < TotalSpendFilters.length; i++) {
        TotalSpendFilters[i] = (BigIntegerFilter)TotalSpendFilter[i];
      }
      try {
        out.setTotalSpendFilter(TotalSpendFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
