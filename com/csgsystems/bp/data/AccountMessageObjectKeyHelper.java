/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountMessageObjectKeyHelper.java
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

/** Helper class for AccountMessageObject's Key objects. */
public class AccountMessageObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountMessageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountMessageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountMessageObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountMessageObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountMessageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountMessageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountMessageObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountMessageObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountMessageObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountMessageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountMessageObjectKeyData the converted object
   */
  public static AccountMessageObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountMessageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountMessageObject")
   * @return AccountMessageObjectKeyData the converted object
   */
  public static AccountMessageObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountMessageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountMessageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountMessageObjectKeyFilter the converted object
   */
  public static AccountMessageObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountMessageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountMessageObject")
   * @return AccountMessageObjectKeyFilter the converted object
   */
  public static AccountMessageObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountMessageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountMessageObjectKeyData to a Map (not including the root).
  /** convert AccountMessageObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountMessageObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._MsgGrpIdSet) record.put ("MsgGrpId", in.MsgGrpId);
  
    if (in._MessageIdSet) record.put ("MessageId", in.MessageId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    return record;
  }
  /** convert AccountMessageObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountMessageObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.MsgGrpId, in.MsgGrpIdSort, in.MsgGrpIdSortAscending, in.MsgGrpIdFetch);
      if (map != null) record.put ("MsgGrpId", map);
      map = DataHelper.filterToMap (in.MessageId, in.MessageIdSort, in.MessageIdSortAscending, in.MessageIdFetch);
      if (map != null) record.put ("MessageId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
    return record;
  }
  /** convert Map to AccountMessageObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountMessageObjectKeyData the converted object
   */
  public static AccountMessageObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountMessageObjectKeyData out = new AccountMessageObjectKeyData ();

    if ((obj = record.get ("MsgGrpId")) != null)
    {
      out.MsgGrpId = (Integer) obj;
      out._MsgGrpIdSet = true;
    }
  
    if ((obj = record.get ("MessageId")) != null)
    {
      out.MessageId = (Integer) obj;
      out._MessageIdSet = true;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
      out._ActiveDtSet = true;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountMessageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountMessageObjectKeyFilter the converted object
   */
  public static AccountMessageObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountMessageObjectKeyFilter out = new AccountMessageObjectKeyFilter ();

    Map MsgGrpIdMap = (Map)record.get("MsgGrpId");
    Boolean MsgGrpIdFetch = DataHelper.getFetch(MsgGrpIdMap);
    Boolean MsgGrpIdSortDir = DataHelper.getSortDirection(MsgGrpIdMap);
    Integer MsgGrpIdSortOrder = DataHelper.getSortOrder(MsgGrpIdMap);
    if (MsgGrpIdFetch != null) out.setMsgGrpIdFetch(MsgGrpIdFetch);
    if (MsgGrpIdSortDir != null) out.setMsgGrpIdSortDirection(MsgGrpIdSortDir);
    if (MsgGrpIdSortOrder != null) out.setMsgGrpIdSortOrder(MsgGrpIdSortOrder);

    Filter[] MsgGrpIdFilter = DataHelper.mapToFilterArray(MsgGrpIdMap, Integer.class);
    if (MsgGrpIdFilter != null) {
      IntegerFilter[] MsgGrpIdFilters = new IntegerFilter[MsgGrpIdFilter.length];
      for (int i = 0; i < MsgGrpIdFilters.length; i++) {
        MsgGrpIdFilters[i] = (IntegerFilter)MsgGrpIdFilter[i];
      }
      try {
        out.setMsgGrpIdFilter(MsgGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MessageIdMap = (Map)record.get("MessageId");
    Boolean MessageIdFetch = DataHelper.getFetch(MessageIdMap);
    Boolean MessageIdSortDir = DataHelper.getSortDirection(MessageIdMap);
    Integer MessageIdSortOrder = DataHelper.getSortOrder(MessageIdMap);
    if (MessageIdFetch != null) out.setMessageIdFetch(MessageIdFetch);
    if (MessageIdSortDir != null) out.setMessageIdSortDirection(MessageIdSortDir);
    if (MessageIdSortOrder != null) out.setMessageIdSortOrder(MessageIdSortOrder);

    Filter[] MessageIdFilter = DataHelper.mapToFilterArray(MessageIdMap, Integer.class);
    if (MessageIdFilter != null) {
      IntegerFilter[] MessageIdFilters = new IntegerFilter[MessageIdFilter.length];
      for (int i = 0; i < MessageIdFilters.length; i++) {
        MessageIdFilters[i] = (IntegerFilter)MessageIdFilter[i];
      }
      try {
        out.setMessageIdFilter(MessageIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
