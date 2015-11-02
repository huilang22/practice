/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CcAuditLogObjectHelper.java
 * Definition File: Customer/CcAuditLog.xml
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



/** Helper class to convert CcAuditLogObject JavaBean objects to/from HashMaps.
 */
public class CcAuditLogObjectHelper implements ArubaObjectHelper
{
  /** convert CcAuditLogObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CcAuditLogObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CcAuditLogObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CcAuditLogObject")
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CcAuditLogObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CcAuditLogObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CcAuditLogObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CcAuditLogObject")
   * @return Map     the output Map
   */
  public static Map toMap (CcAuditLogObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CcAuditLogObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CcAuditLogObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CcAuditLogObjectData the converted object
   */
  public static CcAuditLogObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CcAuditLogObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CcAuditLogObject")
   * @return CcAuditLogObjectData the converted object
   */
  public static CcAuditLogObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CcAuditLogObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CcAuditLogObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CcAuditLogObjectFilter the converted object
   */
  public static CcAuditLogObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CcAuditLogObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CcAuditLogObject")
   * @return CcAuditLogObjectFilter the converted object
   */
  public static CcAuditLogObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CcAuditLogObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CcAuditLogObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CcAuditLogObjectDataList the converted object
   */
  public static CcAuditLogObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CcAuditLogObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CcAuditLogObjectList")
   * @return CcAuditLogObjectDataList the converted object
   */
  public static CcAuditLogObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CcAuditLogObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CcAuditLogObjectData[] array = null;
    if (root != null)
    {
      array = new CcAuditLogObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CcAuditLogObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CcAuditLogObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CcAuditLogObjectDataList (array, index, total);
  }
  /** convert CcAuditLogObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CcAuditLogObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CcAuditLogObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
      return record;
  }
  /** convert CcAuditLogObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CcAuditLogObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CcAuditLogObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
    return record;
  }
  /** convert Map to CcAuditLogObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CcAuditLogObjectData the converted object
   */
  public static CcAuditLogObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CcAuditLogObjectData out = new CcAuditLogObjectData ();

    out.Key = CcAuditLogObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
      return out;
  }
  /** convert Map to CcAuditLogObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CcAuditLogObjectFilter the converted object
   */
  public static CcAuditLogObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CcAuditLogObjectFilter out = new CcAuditLogObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CcAuditLogObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
