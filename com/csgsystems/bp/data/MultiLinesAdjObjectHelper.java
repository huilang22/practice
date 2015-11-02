/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjObjectHelper.java
 * Definition File: Customer/MultiLinesAdj.xml
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



/** Helper class to convert MultiLinesAdjObject JavaBean objects to/from HashMaps.
 */
public class MultiLinesAdjObjectHelper implements ArubaObjectHelper
{
  /** convert MultiLinesAdjObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (MultiLinesAdjObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert MultiLinesAdjObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "MultiLinesAdjObject")
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "MultiLinesAdjObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert MultiLinesAdjObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert MultiLinesAdjObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "MultiLinesAdjObject")
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "MultiLinesAdjObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to MultiLinesAdjObjectData.
   * @param record the Map containing the data to convert to the object
   * @return MultiLinesAdjObjectData the converted object
   */
  public static MultiLinesAdjObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to MultiLinesAdjObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "MultiLinesAdjObject")
   * @return MultiLinesAdjObjectData the converted object
   */
  public static MultiLinesAdjObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to MultiLinesAdjObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return MultiLinesAdjObjectFilter the converted object
   */
  public static MultiLinesAdjObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to MultiLinesAdjObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "MultiLinesAdjObject")
   * @return MultiLinesAdjObjectFilter the converted object
   */
  public static MultiLinesAdjObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to MultiLinesAdjObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return MultiLinesAdjObjectDataList the converted object
   */
  public static MultiLinesAdjObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to MultiLinesAdjObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "MultiLinesAdjObjectList")
   * @return MultiLinesAdjObjectDataList the converted object
   */
  public static MultiLinesAdjObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjObjectList";
    Object[] root = (Object[]) record.get (rootName);
    MultiLinesAdjObjectData[] array = null;
    if (root != null)
    {
      array = new MultiLinesAdjObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = MultiLinesAdjObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new MultiLinesAdjObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new MultiLinesAdjObjectDataList (array, index, total);
  }
  /** convert MultiLinesAdjObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (MultiLinesAdjObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._MsgIdSet) record.put ("MsgId", in.MsgId);
  
    if (in._MsgId2Set) record.put ("MsgId2", in.MsgId2);
  
    if (in._MsgIdServSet) record.put ("MsgIdServ", in.MsgIdServ);
  
    if (in._SplitRowNumSet) record.put ("SplitRowNum", in.SplitRowNum);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._AdjTransCodeSet) record.put ("AdjTransCode", in.AdjTransCode);
  
    if (in._AmtEligibleCalcSet) record.put ("AmtEligibleCalc", in.AmtEligibleCalc);
  
    if (in._RowNumberSet) record.put ("RowNumber", in.RowNumber);
      return record;
  }
  /** convert MultiLinesAdjObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (MultiLinesAdjObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.MsgId, in.MsgIdSort, in.MsgIdSortAscending, in.MsgIdFetch);
      if (map != null) record.put ("MsgId", map);
      map = DataHelper.filterToMap (in.MsgId2, in.MsgId2Sort, in.MsgId2SortAscending, in.MsgId2Fetch);
      if (map != null) record.put ("MsgId2", map);
      map = DataHelper.filterToMap (in.MsgIdServ, in.MsgIdServSort, in.MsgIdServSortAscending, in.MsgIdServFetch);
      if (map != null) record.put ("MsgIdServ", map);
      map = DataHelper.filterToMap (in.SplitRowNum, in.SplitRowNumSort, in.SplitRowNumSortAscending, in.SplitRowNumFetch);
      if (map != null) record.put ("SplitRowNum", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.AdjTransCode, in.AdjTransCodeSort, in.AdjTransCodeSortAscending, in.AdjTransCodeFetch);
      if (map != null) record.put ("AdjTransCode", map);
      map = DataHelper.filterToMap (in.AmtEligibleCalc, in.AmtEligibleCalcSort, in.AmtEligibleCalcSortAscending, in.AmtEligibleCalcFetch);
      if (map != null) record.put ("AmtEligibleCalc", map);
      map = DataHelper.filterToMap (in.RowNumber, in.RowNumberSort, in.RowNumberSortAscending, in.RowNumberFetch);
      if (map != null) record.put ("RowNumber", map);
    return record;
  }
  /** convert Map to MultiLinesAdjObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return MultiLinesAdjObjectData the converted object
   */
  public static MultiLinesAdjObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    MultiLinesAdjObjectData out = new MultiLinesAdjObjectData ();

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
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("AdjTransCode")) != null)
    {
      out.AdjTransCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AmtEligibleCalc")) != null)
    {
      out.AmtEligibleCalc = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RowNumber")) != null)
    {
      out.RowNumber = (Integer) obj;
    }
      return out;
  }
  /** convert Map to MultiLinesAdjObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return MultiLinesAdjObjectFilter the converted object
   */
  public static MultiLinesAdjObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    MultiLinesAdjObjectFilter out = new MultiLinesAdjObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

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
  
    Map AdjTransCodeMap = (Map)record.get("AdjTransCode");
    Boolean AdjTransCodeFetch = DataHelper.getFetch(AdjTransCodeMap);
    Boolean AdjTransCodeSortDir = DataHelper.getSortDirection(AdjTransCodeMap);
    Integer AdjTransCodeSortOrder = DataHelper.getSortOrder(AdjTransCodeMap);
    if (AdjTransCodeFetch != null) out.setAdjTransCodeFetch(AdjTransCodeFetch);
    if (AdjTransCodeSortDir != null) out.setAdjTransCodeSortDirection(AdjTransCodeSortDir);
    if (AdjTransCodeSortOrder != null) out.setAdjTransCodeSortOrder(AdjTransCodeSortOrder);

    Filter[] AdjTransCodeFilter = DataHelper.mapToFilterArray(AdjTransCodeMap, Integer.class);
    if (AdjTransCodeFilter != null) {
      IntegerFilter[] AdjTransCodeFilters = new IntegerFilter[AdjTransCodeFilter.length];
      for (int i = 0; i < AdjTransCodeFilters.length; i++) {
        AdjTransCodeFilters[i] = (IntegerFilter)AdjTransCodeFilter[i];
      }
      try {
        out.setAdjTransCodeFilter(AdjTransCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmtEligibleCalcMap = (Map)record.get("AmtEligibleCalc");
    Boolean AmtEligibleCalcFetch = DataHelper.getFetch(AmtEligibleCalcMap);
    Boolean AmtEligibleCalcSortDir = DataHelper.getSortDirection(AmtEligibleCalcMap);
    Integer AmtEligibleCalcSortOrder = DataHelper.getSortOrder(AmtEligibleCalcMap);
    if (AmtEligibleCalcFetch != null) out.setAmtEligibleCalcFetch(AmtEligibleCalcFetch);
    if (AmtEligibleCalcSortDir != null) out.setAmtEligibleCalcSortDirection(AmtEligibleCalcSortDir);
    if (AmtEligibleCalcSortOrder != null) out.setAmtEligibleCalcSortOrder(AmtEligibleCalcSortOrder);

    Filter[] AmtEligibleCalcFilter = DataHelper.mapToFilterArray(AmtEligibleCalcMap, BigInteger.class);
    if (AmtEligibleCalcFilter != null) {
      BigIntegerFilter[] AmtEligibleCalcFilters = new BigIntegerFilter[AmtEligibleCalcFilter.length];
      for (int i = 0; i < AmtEligibleCalcFilters.length; i++) {
        AmtEligibleCalcFilters[i] = (BigIntegerFilter)AmtEligibleCalcFilter[i];
      }
      try {
        out.setAmtEligibleCalcFilter(AmtEligibleCalcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RowNumberMap = (Map)record.get("RowNumber");
    Boolean RowNumberFetch = DataHelper.getFetch(RowNumberMap);
    Boolean RowNumberSortDir = DataHelper.getSortDirection(RowNumberMap);
    Integer RowNumberSortOrder = DataHelper.getSortOrder(RowNumberMap);
    if (RowNumberFetch != null) out.setRowNumberFetch(RowNumberFetch);
    if (RowNumberSortDir != null) out.setRowNumberSortDirection(RowNumberSortDir);
    if (RowNumberSortOrder != null) out.setRowNumberSortOrder(RowNumberSortOrder);

    Filter[] RowNumberFilter = DataHelper.mapToFilterArray(RowNumberMap, Integer.class);
    if (RowNumberFilter != null) {
      IntegerFilter[] RowNumberFilters = new IntegerFilter[RowNumberFilter.length];
      for (int i = 0; i < RowNumberFilters.length; i++) {
        RowNumberFilters[i] = (IntegerFilter)RowNumberFilter[i];
      }
      try {
        out.setRowNumberFilter(RowNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
