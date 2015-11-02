/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageObjectKeyHelper.java
 * Definition File: Customer/.xml
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

/** Helper class for BilledUsageObject's Key objects. */
public class BilledUsageObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BilledUsageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BilledUsageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BilledUsageObjectKeyData the converted object
   */
  public static BilledUsageObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BilledUsageObject")
   * @return BilledUsageObjectKeyData the converted object
   */
  public static BilledUsageObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BilledUsageObjectKeyFilter the converted object
   */
  public static BilledUsageObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BilledUsageObject")
   * @return BilledUsageObjectKeyFilter the converted object
   */
  public static BilledUsageObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BilledUsageObjectKeyData to a Map (not including the root).
  /** convert BilledUsageObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BilledUsageObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._CdrDataPartitionKeySet) record.put ("CdrDataPartitionKey", in.CdrDataPartitionKey);
  
    if (in._MsgIdSet) record.put ("MsgId", in.MsgId);
  
    if (in._MsgId2Set) record.put ("MsgId2", in.MsgId2);
  
    if (in._MsgIdServSet) record.put ("MsgIdServ", in.MsgIdServ);
  
    if (in._SplitRowNumSet) record.put ("SplitRowNum", in.SplitRowNum);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    return record;
  }
  /** convert BilledUsageObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BilledUsageObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
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
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
    return record;
  }
  /** convert Map to BilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageObjectKeyData the converted object
   */
  public static BilledUsageObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageObjectKeyData out = new BilledUsageObjectKeyData ();

    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
      out._BillRefNoSet = true;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
      out._BillRefResetsSet = true;
    }
  
    if ((obj = record.get ("CdrDataPartitionKey")) != null)
    {
      out.CdrDataPartitionKey = (Date) obj;
      out._CdrDataPartitionKeySet = true;
    }
  
    if ((obj = record.get ("MsgId")) != null)
    {
      out.MsgId = (Integer) obj;
      out._MsgIdSet = true;
    }
  
    if ((obj = record.get ("MsgId2")) != null)
    {
      out.MsgId2 = (Integer) obj;
      out._MsgId2Set = true;
    }
  
    if ((obj = record.get ("MsgIdServ")) != null)
    {
      out.MsgIdServ = (Integer) obj;
      out._MsgIdServSet = true;
    }
  
    if ((obj = record.get ("SplitRowNum")) != null)
    {
      out.SplitRowNum = (Integer) obj;
      out._SplitRowNumSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
      out._ServiceExternalIdSet = true;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
      out._ServiceExternalIdTypeSet = true;
    }
  
    return out;
  }
  /** convert Map to BilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageObjectKeyFilter the converted object
   */
  public static BilledUsageObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageObjectKeyFilter out = new BilledUsageObjectKeyFilter ();

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
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
