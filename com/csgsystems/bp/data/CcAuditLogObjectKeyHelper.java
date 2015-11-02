/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CcAuditLogObjectKeyHelper.java
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

/** Helper class for CcAuditLogObject's Key objects. */
public class CcAuditLogObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CcAuditLogObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CcAuditLogObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CcAuditLogObject")
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CcAuditLogObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CcAuditLogObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CcAuditLogObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CcAuditLogObject")
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CcAuditLogObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CcAuditLogObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CcAuditLogObjectKeyData the converted object
   */
  public static CcAuditLogObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CcAuditLogObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CcAuditLogObject")
   * @return CcAuditLogObjectKeyData the converted object
   */
  public static CcAuditLogObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CcAuditLogObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CcAuditLogObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CcAuditLogObjectKeyFilter the converted object
   */
  public static CcAuditLogObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CcAuditLogObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CcAuditLogObject")
   * @return CcAuditLogObjectKeyFilter the converted object
   */
  public static CcAuditLogObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CcAuditLogObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CcAuditLogObjectKeyData to a Map (not including the root).
  /** convert CcAuditLogObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CcAuditLogObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ViewDefIdSet) record.put ("ViewDefId", in.ViewDefId);
  
    if (in._UserIdSet) record.put ("UserId", in.UserId);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    return record;
  }
  /** convert CcAuditLogObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CcAuditLogObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ViewDefId, in.ViewDefIdSort, in.ViewDefIdSortAscending, in.ViewDefIdFetch);
      if (map != null) record.put ("ViewDefId", map);
      map = DataHelper.filterToMap (in.UserId, in.UserIdSort, in.UserIdSortAscending, in.UserIdFetch, in.UserIdCaseInsensitive);
      if (map != null) record.put ("UserId", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
    return record;
  }
  /** convert Map to CcAuditLogObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CcAuditLogObjectKeyData the converted object
   */
  public static CcAuditLogObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CcAuditLogObjectKeyData out = new CcAuditLogObjectKeyData ();

    if ((obj = record.get ("ViewDefId")) != null)
    {
      out.ViewDefId = (Integer) obj;
      out._ViewDefIdSet = true;
    }
  
    if ((obj = record.get ("UserId")) != null)
    {
      out.UserId = (String) obj;
      out._UserIdSet = true;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
      out._TransDateSet = true;
    }
  
    return out;
  }
  /** convert Map to CcAuditLogObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CcAuditLogObjectKeyFilter the converted object
   */
  public static CcAuditLogObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CcAuditLogObjectKeyFilter out = new CcAuditLogObjectKeyFilter ();

    Map ViewDefIdMap = (Map)record.get("ViewDefId");
    Boolean ViewDefIdFetch = DataHelper.getFetch(ViewDefIdMap);
    Boolean ViewDefIdSortDir = DataHelper.getSortDirection(ViewDefIdMap);
    Integer ViewDefIdSortOrder = DataHelper.getSortOrder(ViewDefIdMap);
    if (ViewDefIdFetch != null) out.setViewDefIdFetch(ViewDefIdFetch);
    if (ViewDefIdSortDir != null) out.setViewDefIdSortDirection(ViewDefIdSortDir);
    if (ViewDefIdSortOrder != null) out.setViewDefIdSortOrder(ViewDefIdSortOrder);

    Filter[] ViewDefIdFilter = DataHelper.mapToFilterArray(ViewDefIdMap, Integer.class);
    if (ViewDefIdFilter != null) {
      IntegerFilter[] ViewDefIdFilters = new IntegerFilter[ViewDefIdFilter.length];
      for (int i = 0; i < ViewDefIdFilters.length; i++) {
        ViewDefIdFilters[i] = (IntegerFilter)ViewDefIdFilter[i];
      }
      try {
        out.setViewDefIdFilter(ViewDefIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UserIdMap = (Map)record.get("UserId");
    Boolean UserIdFetch = DataHelper.getFetch(UserIdMap);
    Boolean UserIdSortDir = DataHelper.getSortDirection(UserIdMap);
    Integer UserIdSortOrder = DataHelper.getSortOrder(UserIdMap);
    if (UserIdFetch != null) out.setUserIdFetch(UserIdFetch);
    if (UserIdSortDir != null) out.setUserIdSortDirection(UserIdSortDir);
    if (UserIdSortOrder != null) out.setUserIdSortOrder(UserIdSortOrder);

    Filter[] UserIdFilter = DataHelper.mapToFilterArray(UserIdMap, String.class);
    if (UserIdFilter != null) {
      StringFilter[] UserIdFilters = new StringFilter[UserIdFilter.length];
      for (int i = 0; i < UserIdFilters.length; i++) {
        UserIdFilters[i] = (StringFilter)UserIdFilter[i];
      }
      try {
        out.setUserIdFilter(UserIdFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
