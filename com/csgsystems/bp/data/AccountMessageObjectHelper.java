/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountMessageObjectHelper.java
 * Definition File: Customer/AccountMessage.xml
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



/** Helper class to convert AccountMessageObject JavaBean objects to/from HashMaps.
 */
public class AccountMessageObjectHelper implements ArubaObjectHelper
{
  /** convert AccountMessageObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountMessageObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountMessageObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountMessageObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountMessageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountMessageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountMessageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountMessageObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountMessageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountMessageObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountMessageObjectData the converted object
   */
  public static AccountMessageObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountMessageObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountMessageObject")
   * @return AccountMessageObjectData the converted object
   */
  public static AccountMessageObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountMessageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountMessageObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountMessageObjectFilter the converted object
   */
  public static AccountMessageObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountMessageObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountMessageObject")
   * @return AccountMessageObjectFilter the converted object
   */
  public static AccountMessageObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountMessageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountMessageObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountMessageObjectDataList the converted object
   */
  public static AccountMessageObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountMessageObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountMessageObjectList")
   * @return AccountMessageObjectDataList the converted object
   */
  public static AccountMessageObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountMessageObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountMessageObjectData[] array = null;
    if (root != null)
    {
      array = new AccountMessageObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountMessageObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountMessageObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountMessageObjectDataList (array, index, total);
  }
  /** convert AccountMessageObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountMessageObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountMessageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._MsgTriggerIdSet) record.put ("MsgTriggerId", in.MsgTriggerId);
  
    if (in._MsgSequenceNumSet) record.put ("MsgSequenceNum", in.MsgSequenceNum);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
      return record;
  }
  /** convert AccountMessageObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountMessageObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountMessageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.MsgTriggerId, in.MsgTriggerIdSort, in.MsgTriggerIdSortAscending, in.MsgTriggerIdFetch);
      if (map != null) record.put ("MsgTriggerId", map);
      map = DataHelper.filterToMap (in.MsgSequenceNum, in.MsgSequenceNumSort, in.MsgSequenceNumSortAscending, in.MsgSequenceNumFetch);
      if (map != null) record.put ("MsgSequenceNum", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
    return record;
  }
  /** convert Map to AccountMessageObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountMessageObjectData the converted object
   */
  public static AccountMessageObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountMessageObjectData out = new AccountMessageObjectData ();

    out.Key = AccountMessageObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgTriggerId")) != null)
    {
      out.MsgTriggerId = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgSequenceNum")) != null)
    {
      out.MsgSequenceNum = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to AccountMessageObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountMessageObjectFilter the converted object
   */
  public static AccountMessageObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountMessageObjectFilter out = new AccountMessageObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountMessageObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map MsgTriggerIdMap = (Map)record.get("MsgTriggerId");
    Boolean MsgTriggerIdFetch = DataHelper.getFetch(MsgTriggerIdMap);
    Boolean MsgTriggerIdSortDir = DataHelper.getSortDirection(MsgTriggerIdMap);
    Integer MsgTriggerIdSortOrder = DataHelper.getSortOrder(MsgTriggerIdMap);
    if (MsgTriggerIdFetch != null) out.setMsgTriggerIdFetch(MsgTriggerIdFetch);
    if (MsgTriggerIdSortDir != null) out.setMsgTriggerIdSortDirection(MsgTriggerIdSortDir);
    if (MsgTriggerIdSortOrder != null) out.setMsgTriggerIdSortOrder(MsgTriggerIdSortOrder);

    Filter[] MsgTriggerIdFilter = DataHelper.mapToFilterArray(MsgTriggerIdMap, Integer.class);
    if (MsgTriggerIdFilter != null) {
      IntegerFilter[] MsgTriggerIdFilters = new IntegerFilter[MsgTriggerIdFilter.length];
      for (int i = 0; i < MsgTriggerIdFilters.length; i++) {
        MsgTriggerIdFilters[i] = (IntegerFilter)MsgTriggerIdFilter[i];
      }
      try {
        out.setMsgTriggerIdFilter(MsgTriggerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgSequenceNumMap = (Map)record.get("MsgSequenceNum");
    Boolean MsgSequenceNumFetch = DataHelper.getFetch(MsgSequenceNumMap);
    Boolean MsgSequenceNumSortDir = DataHelper.getSortDirection(MsgSequenceNumMap);
    Integer MsgSequenceNumSortOrder = DataHelper.getSortOrder(MsgSequenceNumMap);
    if (MsgSequenceNumFetch != null) out.setMsgSequenceNumFetch(MsgSequenceNumFetch);
    if (MsgSequenceNumSortDir != null) out.setMsgSequenceNumSortDirection(MsgSequenceNumSortDir);
    if (MsgSequenceNumSortOrder != null) out.setMsgSequenceNumSortOrder(MsgSequenceNumSortOrder);

    Filter[] MsgSequenceNumFilter = DataHelper.mapToFilterArray(MsgSequenceNumMap, Integer.class);
    if (MsgSequenceNumFilter != null) {
      IntegerFilter[] MsgSequenceNumFilters = new IntegerFilter[MsgSequenceNumFilter.length];
      for (int i = 0; i < MsgSequenceNumFilters.length; i++) {
        MsgSequenceNumFilters[i] = (IntegerFilter)MsgSequenceNumFilter[i];
      }
      try {
        out.setMsgSequenceNumFilter(MsgSequenceNumFilters);
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
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
