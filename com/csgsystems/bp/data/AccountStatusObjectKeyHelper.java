/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountStatusObjectKeyHelper.java
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

/** Helper class for AccountStatusObject's Key objects. */
public class AccountStatusObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountStatusObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountStatusObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountStatusObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountStatusObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountStatusObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountStatusObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountStatusObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountStatusObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountStatusObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountStatusObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountStatusObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountStatusObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountStatusObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountStatusObjectKeyData the converted object
   */
  public static AccountStatusObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountStatusObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountStatusObject")
   * @return AccountStatusObjectKeyData the converted object
   */
  public static AccountStatusObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountStatusObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountStatusObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountStatusObjectKeyFilter the converted object
   */
  public static AccountStatusObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountStatusObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountStatusObject")
   * @return AccountStatusObjectKeyFilter the converted object
   */
  public static AccountStatusObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountStatusObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountStatusObjectKeyData to a Map (not including the root).
  /** convert AccountStatusObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountStatusObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CmfStatusTypeSet) record.put ("CmfStatusType", in.CmfStatusType);
  
    if (in._CmfStatusSet) record.put ("CmfStatus", in.CmfStatus);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    return record;
  }
  /** convert AccountStatusObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountStatusObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.CmfStatusType, in.CmfStatusTypeSort, in.CmfStatusTypeSortAscending, in.CmfStatusTypeFetch);
      if (map != null) record.put ("CmfStatusType", map);
      map = DataHelper.filterToMap (in.CmfStatus, in.CmfStatusSort, in.CmfStatusSortAscending, in.CmfStatusFetch);
      if (map != null) record.put ("CmfStatus", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
    return record;
  }
  /** convert Map to AccountStatusObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountStatusObjectKeyData the converted object
   */
  public static AccountStatusObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountStatusObjectKeyData out = new AccountStatusObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("CmfStatusType")) != null)
    {
      out.CmfStatusType = (Integer) obj;
      out._CmfStatusTypeSet = true;
    }
  
    if ((obj = record.get ("CmfStatus")) != null)
    {
      out.CmfStatus = (Integer) obj;
      out._CmfStatusSet = true;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
      out._ChgDtSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountStatusObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountStatusObjectKeyFilter the converted object
   */
  public static AccountStatusObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountStatusObjectKeyFilter out = new AccountStatusObjectKeyFilter ();

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
  
    Map CmfStatusTypeMap = (Map)record.get("CmfStatusType");
    Boolean CmfStatusTypeFetch = DataHelper.getFetch(CmfStatusTypeMap);
    Boolean CmfStatusTypeSortDir = DataHelper.getSortDirection(CmfStatusTypeMap);
    Integer CmfStatusTypeSortOrder = DataHelper.getSortOrder(CmfStatusTypeMap);
    if (CmfStatusTypeFetch != null) out.setCmfStatusTypeFetch(CmfStatusTypeFetch);
    if (CmfStatusTypeSortDir != null) out.setCmfStatusTypeSortDirection(CmfStatusTypeSortDir);
    if (CmfStatusTypeSortOrder != null) out.setCmfStatusTypeSortOrder(CmfStatusTypeSortOrder);

    Filter[] CmfStatusTypeFilter = DataHelper.mapToFilterArray(CmfStatusTypeMap, Integer.class);
    if (CmfStatusTypeFilter != null) {
      IntegerFilter[] CmfStatusTypeFilters = new IntegerFilter[CmfStatusTypeFilter.length];
      for (int i = 0; i < CmfStatusTypeFilters.length; i++) {
        CmfStatusTypeFilters[i] = (IntegerFilter)CmfStatusTypeFilter[i];
      }
      try {
        out.setCmfStatusTypeFilter(CmfStatusTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CmfStatusMap = (Map)record.get("CmfStatus");
    Boolean CmfStatusFetch = DataHelper.getFetch(CmfStatusMap);
    Boolean CmfStatusSortDir = DataHelper.getSortDirection(CmfStatusMap);
    Integer CmfStatusSortOrder = DataHelper.getSortOrder(CmfStatusMap);
    if (CmfStatusFetch != null) out.setCmfStatusFetch(CmfStatusFetch);
    if (CmfStatusSortDir != null) out.setCmfStatusSortDirection(CmfStatusSortDir);
    if (CmfStatusSortOrder != null) out.setCmfStatusSortOrder(CmfStatusSortOrder);

    Filter[] CmfStatusFilter = DataHelper.mapToFilterArray(CmfStatusMap, Integer.class);
    if (CmfStatusFilter != null) {
      IntegerFilter[] CmfStatusFilters = new IntegerFilter[CmfStatusFilter.length];
      for (int i = 0; i < CmfStatusFilters.length; i++) {
        CmfStatusFilters[i] = (IntegerFilter)CmfStatusFilter[i];
      }
      try {
        out.setCmfStatusFilter(CmfStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
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
