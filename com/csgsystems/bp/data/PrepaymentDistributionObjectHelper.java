/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectHelper.java
 * Definition File: Customer/PrepaymentDistribution.xml
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



/** Helper class to convert PrepaymentDistributionObject JavaBean objects to/from HashMaps.
 */
public class PrepaymentDistributionObjectHelper implements ArubaObjectHelper
{
  /** convert PrepaymentDistributionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentDistributionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PrepaymentDistributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentDistributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PrepaymentDistributionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PrepaymentDistributionObjectData the converted object
   */
  public static PrepaymentDistributionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PrepaymentDistributionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PrepaymentDistributionObject")
   * @return PrepaymentDistributionObjectData the converted object
   */
  public static PrepaymentDistributionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PrepaymentDistributionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PrepaymentDistributionObjectFilter the converted object
   */
  public static PrepaymentDistributionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PrepaymentDistributionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PrepaymentDistributionObject")
   * @return PrepaymentDistributionObjectFilter the converted object
   */
  public static PrepaymentDistributionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PrepaymentDistributionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PrepaymentDistributionObjectDataList the converted object
   */
  public static PrepaymentDistributionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PrepaymentDistributionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PrepaymentDistributionObjectList")
   * @return PrepaymentDistributionObjectDataList the converted object
   */
  public static PrepaymentDistributionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentDistributionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PrepaymentDistributionObjectData[] array = null;
    if (root != null)
    {
      array = new PrepaymentDistributionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PrepaymentDistributionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PrepaymentDistributionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PrepaymentDistributionObjectDataList (array, index, total);
  }
  /** convert PrepaymentDistributionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PrepaymentDistributionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PrepaymentDistributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BmfTrackingIdSet) record.put ("BmfTrackingId", in.BmfTrackingId);
  
    if (in._BmfTrackingIdServSet) record.put ("BmfTrackingIdServ", in.BmfTrackingIdServ);
  
    if (in._OrigBmfTrackingIdSet) record.put ("OrigBmfTrackingId", in.OrigBmfTrackingId);
  
    if (in._OrigBmfTrackingIdServSet) record.put ("OrigBmfTrackingIdServ", in.OrigBmfTrackingIdServ);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._IsTaxSet) record.put ("IsTax", in.IsTax);
      return record;
  }
  /** convert PrepaymentDistributionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PrepaymentDistributionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PrepaymentDistributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BmfTrackingId, in.BmfTrackingIdSort, in.BmfTrackingIdSortAscending, in.BmfTrackingIdFetch);
      if (map != null) record.put ("BmfTrackingId", map);
      map = DataHelper.filterToMap (in.BmfTrackingIdServ, in.BmfTrackingIdServSort, in.BmfTrackingIdServSortAscending, in.BmfTrackingIdServFetch);
      if (map != null) record.put ("BmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.OrigBmfTrackingId, in.OrigBmfTrackingIdSort, in.OrigBmfTrackingIdSortAscending, in.OrigBmfTrackingIdFetch);
      if (map != null) record.put ("OrigBmfTrackingId", map);
      map = DataHelper.filterToMap (in.OrigBmfTrackingIdServ, in.OrigBmfTrackingIdServSort, in.OrigBmfTrackingIdServSortAscending, in.OrigBmfTrackingIdServFetch);
      if (map != null) record.put ("OrigBmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.IsTax, in.IsTaxSort, in.IsTaxSortAscending, in.IsTaxFetch);
      if (map != null) record.put ("IsTax", map);
    return record;
  }
  /** convert Map to PrepaymentDistributionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentDistributionObjectData the converted object
   */
  public static PrepaymentDistributionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentDistributionObjectData out = new PrepaymentDistributionObjectData ();

    out.Key = PrepaymentDistributionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BmfTrackingId")) != null)
    {
      out.BmfTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingIdServ")) != null)
    {
      out.BmfTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBmfTrackingId")) != null)
    {
      out.OrigBmfTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBmfTrackingIdServ")) != null)
    {
      out.OrigBmfTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("IsTax")) != null)
    {
      out.IsTax = (Boolean) obj;
    }
      return out;
  }
  /** convert Map to PrepaymentDistributionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentDistributionObjectFilter the converted object
   */
  public static PrepaymentDistributionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentDistributionObjectFilter out = new PrepaymentDistributionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PrepaymentDistributionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BmfTrackingIdMap = (Map)record.get("BmfTrackingId");
    Boolean BmfTrackingIdFetch = DataHelper.getFetch(BmfTrackingIdMap);
    Boolean BmfTrackingIdSortDir = DataHelper.getSortDirection(BmfTrackingIdMap);
    Integer BmfTrackingIdSortOrder = DataHelper.getSortOrder(BmfTrackingIdMap);
    if (BmfTrackingIdFetch != null) out.setBmfTrackingIdFetch(BmfTrackingIdFetch);
    if (BmfTrackingIdSortDir != null) out.setBmfTrackingIdSortDirection(BmfTrackingIdSortDir);
    if (BmfTrackingIdSortOrder != null) out.setBmfTrackingIdSortOrder(BmfTrackingIdSortOrder);

    Filter[] BmfTrackingIdFilter = DataHelper.mapToFilterArray(BmfTrackingIdMap, Integer.class);
    if (BmfTrackingIdFilter != null) {
      IntegerFilter[] BmfTrackingIdFilters = new IntegerFilter[BmfTrackingIdFilter.length];
      for (int i = 0; i < BmfTrackingIdFilters.length; i++) {
        BmfTrackingIdFilters[i] = (IntegerFilter)BmfTrackingIdFilter[i];
      }
      try {
        out.setBmfTrackingIdFilter(BmfTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfTrackingIdServMap = (Map)record.get("BmfTrackingIdServ");
    Boolean BmfTrackingIdServFetch = DataHelper.getFetch(BmfTrackingIdServMap);
    Boolean BmfTrackingIdServSortDir = DataHelper.getSortDirection(BmfTrackingIdServMap);
    Integer BmfTrackingIdServSortOrder = DataHelper.getSortOrder(BmfTrackingIdServMap);
    if (BmfTrackingIdServFetch != null) out.setBmfTrackingIdServFetch(BmfTrackingIdServFetch);
    if (BmfTrackingIdServSortDir != null) out.setBmfTrackingIdServSortDirection(BmfTrackingIdServSortDir);
    if (BmfTrackingIdServSortOrder != null) out.setBmfTrackingIdServSortOrder(BmfTrackingIdServSortOrder);

    Filter[] BmfTrackingIdServFilter = DataHelper.mapToFilterArray(BmfTrackingIdServMap, Integer.class);
    if (BmfTrackingIdServFilter != null) {
      IntegerFilter[] BmfTrackingIdServFilters = new IntegerFilter[BmfTrackingIdServFilter.length];
      for (int i = 0; i < BmfTrackingIdServFilters.length; i++) {
        BmfTrackingIdServFilters[i] = (IntegerFilter)BmfTrackingIdServFilter[i];
      }
      try {
        out.setBmfTrackingIdServFilter(BmfTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBmfTrackingIdMap = (Map)record.get("OrigBmfTrackingId");
    Boolean OrigBmfTrackingIdFetch = DataHelper.getFetch(OrigBmfTrackingIdMap);
    Boolean OrigBmfTrackingIdSortDir = DataHelper.getSortDirection(OrigBmfTrackingIdMap);
    Integer OrigBmfTrackingIdSortOrder = DataHelper.getSortOrder(OrigBmfTrackingIdMap);
    if (OrigBmfTrackingIdFetch != null) out.setOrigBmfTrackingIdFetch(OrigBmfTrackingIdFetch);
    if (OrigBmfTrackingIdSortDir != null) out.setOrigBmfTrackingIdSortDirection(OrigBmfTrackingIdSortDir);
    if (OrigBmfTrackingIdSortOrder != null) out.setOrigBmfTrackingIdSortOrder(OrigBmfTrackingIdSortOrder);

    Filter[] OrigBmfTrackingIdFilter = DataHelper.mapToFilterArray(OrigBmfTrackingIdMap, Integer.class);
    if (OrigBmfTrackingIdFilter != null) {
      IntegerFilter[] OrigBmfTrackingIdFilters = new IntegerFilter[OrigBmfTrackingIdFilter.length];
      for (int i = 0; i < OrigBmfTrackingIdFilters.length; i++) {
        OrigBmfTrackingIdFilters[i] = (IntegerFilter)OrigBmfTrackingIdFilter[i];
      }
      try {
        out.setOrigBmfTrackingIdFilter(OrigBmfTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBmfTrackingIdServMap = (Map)record.get("OrigBmfTrackingIdServ");
    Boolean OrigBmfTrackingIdServFetch = DataHelper.getFetch(OrigBmfTrackingIdServMap);
    Boolean OrigBmfTrackingIdServSortDir = DataHelper.getSortDirection(OrigBmfTrackingIdServMap);
    Integer OrigBmfTrackingIdServSortOrder = DataHelper.getSortOrder(OrigBmfTrackingIdServMap);
    if (OrigBmfTrackingIdServFetch != null) out.setOrigBmfTrackingIdServFetch(OrigBmfTrackingIdServFetch);
    if (OrigBmfTrackingIdServSortDir != null) out.setOrigBmfTrackingIdServSortDirection(OrigBmfTrackingIdServSortDir);
    if (OrigBmfTrackingIdServSortOrder != null) out.setOrigBmfTrackingIdServSortOrder(OrigBmfTrackingIdServSortOrder);

    Filter[] OrigBmfTrackingIdServFilter = DataHelper.mapToFilterArray(OrigBmfTrackingIdServMap, Integer.class);
    if (OrigBmfTrackingIdServFilter != null) {
      IntegerFilter[] OrigBmfTrackingIdServFilters = new IntegerFilter[OrigBmfTrackingIdServFilter.length];
      for (int i = 0; i < OrigBmfTrackingIdServFilters.length; i++) {
        OrigBmfTrackingIdServFilters[i] = (IntegerFilter)OrigBmfTrackingIdServFilter[i];
      }
      try {
        out.setOrigBmfTrackingIdServFilter(OrigBmfTrackingIdServFilters);
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
  
    Map StatusMap = (Map)record.get("Status");
    Boolean StatusFetch = DataHelper.getFetch(StatusMap);
    Boolean StatusSortDir = DataHelper.getSortDirection(StatusMap);
    Integer StatusSortOrder = DataHelper.getSortOrder(StatusMap);
    if (StatusFetch != null) out.setStatusFetch(StatusFetch);
    if (StatusSortDir != null) out.setStatusSortDirection(StatusSortDir);
    if (StatusSortOrder != null) out.setStatusSortOrder(StatusSortOrder);

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, Integer.class);
    if (StatusFilter != null) {
      IntegerFilter[] StatusFilters = new IntegerFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (IntegerFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
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
  
    Map IsTaxMap = (Map)record.get("IsTax");
    Boolean IsTaxFetch = DataHelper.getFetch(IsTaxMap);
    Boolean IsTaxSortDir = DataHelper.getSortDirection(IsTaxMap);
    Integer IsTaxSortOrder = DataHelper.getSortOrder(IsTaxMap);
    if (IsTaxFetch != null) out.setIsTaxFetch(IsTaxFetch);
    if (IsTaxSortDir != null) out.setIsTaxSortDirection(IsTaxSortDir);
    if (IsTaxSortOrder != null) out.setIsTaxSortOrder(IsTaxSortOrder);

    Filter[] IsTaxFilter = DataHelper.mapToFilterArray(IsTaxMap, Boolean.class);
    if (IsTaxFilter != null) {
      BooleanFilter[] IsTaxFilters = new BooleanFilter[IsTaxFilter.length];
      for (int i = 0; i < IsTaxFilters.length; i++) {
        IsTaxFilters[i] = (BooleanFilter)IsTaxFilter[i];
      }
      try {
        out.setIsTaxFilter(IsTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
