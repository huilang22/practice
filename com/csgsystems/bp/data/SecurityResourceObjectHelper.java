/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectHelper.java
 * Definition File: Admin/SecurityResource.xml
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



/** Helper class to convert SecurityResourceObject JavaBean objects to/from HashMaps.
 */
public class SecurityResourceObjectHelper implements ArubaObjectHelper
{
  /** convert SecurityResourceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SecurityResourceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityResourceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityResourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityResourceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityResourceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityResourceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityResourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityResourceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityResourceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SecurityResourceObjectData the converted object
   */
  public static SecurityResourceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityResourceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityResourceObject")
   * @return SecurityResourceObjectData the converted object
   */
  public static SecurityResourceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityResourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityResourceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SecurityResourceObjectFilter the converted object
   */
  public static SecurityResourceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityResourceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityResourceObject")
   * @return SecurityResourceObjectFilter the converted object
   */
  public static SecurityResourceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityResourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SecurityResourceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SecurityResourceObjectDataList the converted object
   */
  public static SecurityResourceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SecurityResourceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SecurityResourceObjectList")
   * @return SecurityResourceObjectDataList the converted object
   */
  public static SecurityResourceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityResourceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SecurityResourceObjectData[] array = null;
    if (root != null)
    {
      array = new SecurityResourceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SecurityResourceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SecurityResourceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SecurityResourceObjectDataList (array, index, total);
  }
  /** convert SecurityResourceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityResourceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SecurityResourceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ResNameSet) record.put ("ResName", in.ResName);
  
    if (in._ResSubIdSet) record.put ("ResSubId", in.ResSubId);
  
    if (in._ResRtyIdSet) record.put ("ResRtyId", in.ResRtyId);
  
    if (in._ResMrIdSet) record.put ("ResMrId", in.ResMrId);
  
    if (in._ResUpdateCountSet) record.put ("ResUpdateCount", in.ResUpdateCount);
  
    if (in._ResCreateDateSet) record.put ("ResCreateDate", in.ResCreateDate);
  
    if (in._ResModifyDateSet) record.put ("ResModifyDate", in.ResModifyDate);
  
    if (in._ResModifyUserSet) record.put ("ResModifyUser", in.ResModifyUser);
  
    if (in._MrIdSet) record.put ("MrId", in.MrId);
  
    if (in._MrNameSet) record.put ("MrName", in.MrName);
  
    if (in._MrCanonicalNameSet) record.put ("MrCanonicalName", in.MrCanonicalName);
  
    if (in._MrResourceRealmSet) record.put ("MrResourceRealm", in.MrResourceRealm);
  
    if (in._MrResourceTypeSet) record.put ("MrResourceType", in.MrResourceType);
  
    if (in._MrActionsSet) record.put ("MrActions", in.MrActions);
  
    if (in._SubIdSet) record.put ("SubId", in.SubId);
  
    if (in._SubNameSet) record.put ("SubName", in.SubName);
  
    if (in._SubRarIdSet) record.put ("SubRarId", in.SubRarId);
  
    if (in._SubParentIdSet) record.put ("SubParentId", in.SubParentId);
  
    if (in._SubUpdateCountSet) record.put ("SubUpdateCount", in.SubUpdateCount);
  
    if (in._SubCreateDateSet) record.put ("SubCreateDate", in.SubCreateDate);
  
    if (in._SubModifyDateSet) record.put ("SubModifyDate", in.SubModifyDate);
  
    if (in._SubModifyUserSet) record.put ("SubModifyUser", in.SubModifyUser);
  
    if (in._RtyIdSet) record.put ("RtyId", in.RtyId);
  
    if (in._RtyNameSet) record.put ("RtyName", in.RtyName);
  
    if (in._RtyUpdateCountSet) record.put ("RtyUpdateCount", in.RtyUpdateCount);
  
    if (in._RtyCreateDateSet) record.put ("RtyCreateDate", in.RtyCreateDate);
  
    if (in._RtyModifyDateSet) record.put ("RtyModifyDate", in.RtyModifyDate);
  
    if (in._RtyModifyUserSet) record.put ("RtyModifyUser", in.RtyModifyUser);
  
    if (in._RarIdSet) record.put ("RarId", in.RarId);
  
    if (in._RarNameSet) record.put ("RarName", in.RarName);
  
    if (in._RarUpdateCountSet) record.put ("RarUpdateCount", in.RarUpdateCount);
  
    if (in._RarCreateDateSet) record.put ("RarCreateDate", in.RarCreateDate);
  
    if (in._RarModifyDateSet) record.put ("RarModifyDate", in.RarModifyDate);
  
    if (in._RarModifyUserSet) record.put ("RarModifyUser", in.RarModifyUser);
      return record;
  }
  /** convert SecurityResourceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityResourceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SecurityResourceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ResName, in.ResNameSort, in.ResNameSortAscending, in.ResNameFetch, in.ResNameCaseInsensitive);
      if (map != null) record.put ("ResName", map);
      map = DataHelper.filterToMap (in.ResSubId, in.ResSubIdSort, in.ResSubIdSortAscending, in.ResSubIdFetch);
      if (map != null) record.put ("ResSubId", map);
      map = DataHelper.filterToMap (in.ResRtyId, in.ResRtyIdSort, in.ResRtyIdSortAscending, in.ResRtyIdFetch);
      if (map != null) record.put ("ResRtyId", map);
      map = DataHelper.filterToMap (in.ResMrId, in.ResMrIdSort, in.ResMrIdSortAscending, in.ResMrIdFetch);
      if (map != null) record.put ("ResMrId", map);
      map = DataHelper.filterToMap (in.ResUpdateCount, in.ResUpdateCountSort, in.ResUpdateCountSortAscending, in.ResUpdateCountFetch);
      if (map != null) record.put ("ResUpdateCount", map);
      map = DataHelper.filterToMap (in.ResCreateDate, in.ResCreateDateSort, in.ResCreateDateSortAscending, in.ResCreateDateFetch);
      if (map != null) record.put ("ResCreateDate", map);
      map = DataHelper.filterToMap (in.ResModifyDate, in.ResModifyDateSort, in.ResModifyDateSortAscending, in.ResModifyDateFetch);
      if (map != null) record.put ("ResModifyDate", map);
      map = DataHelper.filterToMap (in.ResModifyUser, in.ResModifyUserSort, in.ResModifyUserSortAscending, in.ResModifyUserFetch, in.ResModifyUserCaseInsensitive);
      if (map != null) record.put ("ResModifyUser", map);
      map = DataHelper.filterToMap (in.MrId, in.MrIdSort, in.MrIdSortAscending, in.MrIdFetch);
      if (map != null) record.put ("MrId", map);
      map = DataHelper.filterToMap (in.MrName, in.MrNameSort, in.MrNameSortAscending, in.MrNameFetch, in.MrNameCaseInsensitive);
      if (map != null) record.put ("MrName", map);
      map = DataHelper.filterToMap (in.MrCanonicalName, in.MrCanonicalNameSort, in.MrCanonicalNameSortAscending, in.MrCanonicalNameFetch, in.MrCanonicalNameCaseInsensitive);
      if (map != null) record.put ("MrCanonicalName", map);
      map = DataHelper.filterToMap (in.MrResourceRealm, in.MrResourceRealmSort, in.MrResourceRealmSortAscending, in.MrResourceRealmFetch, in.MrResourceRealmCaseInsensitive);
      if (map != null) record.put ("MrResourceRealm", map);
      map = DataHelper.filterToMap (in.MrResourceType, in.MrResourceTypeSort, in.MrResourceTypeSortAscending, in.MrResourceTypeFetch, in.MrResourceTypeCaseInsensitive);
      if (map != null) record.put ("MrResourceType", map);
      map = DataHelper.filterToMap (in.MrActions, in.MrActionsSort, in.MrActionsSortAscending, in.MrActionsFetch, in.MrActionsCaseInsensitive);
      if (map != null) record.put ("MrActions", map);
      map = DataHelper.filterToMap (in.SubId, in.SubIdSort, in.SubIdSortAscending, in.SubIdFetch);
      if (map != null) record.put ("SubId", map);
      map = DataHelper.filterToMap (in.SubName, in.SubNameSort, in.SubNameSortAscending, in.SubNameFetch, in.SubNameCaseInsensitive);
      if (map != null) record.put ("SubName", map);
      map = DataHelper.filterToMap (in.SubRarId, in.SubRarIdSort, in.SubRarIdSortAscending, in.SubRarIdFetch);
      if (map != null) record.put ("SubRarId", map);
      map = DataHelper.filterToMap (in.SubParentId, in.SubParentIdSort, in.SubParentIdSortAscending, in.SubParentIdFetch);
      if (map != null) record.put ("SubParentId", map);
      map = DataHelper.filterToMap (in.SubUpdateCount, in.SubUpdateCountSort, in.SubUpdateCountSortAscending, in.SubUpdateCountFetch);
      if (map != null) record.put ("SubUpdateCount", map);
      map = DataHelper.filterToMap (in.SubCreateDate, in.SubCreateDateSort, in.SubCreateDateSortAscending, in.SubCreateDateFetch);
      if (map != null) record.put ("SubCreateDate", map);
      map = DataHelper.filterToMap (in.SubModifyDate, in.SubModifyDateSort, in.SubModifyDateSortAscending, in.SubModifyDateFetch);
      if (map != null) record.put ("SubModifyDate", map);
      map = DataHelper.filterToMap (in.SubModifyUser, in.SubModifyUserSort, in.SubModifyUserSortAscending, in.SubModifyUserFetch, in.SubModifyUserCaseInsensitive);
      if (map != null) record.put ("SubModifyUser", map);
      map = DataHelper.filterToMap (in.RtyId, in.RtyIdSort, in.RtyIdSortAscending, in.RtyIdFetch);
      if (map != null) record.put ("RtyId", map);
      map = DataHelper.filterToMap (in.RtyName, in.RtyNameSort, in.RtyNameSortAscending, in.RtyNameFetch, in.RtyNameCaseInsensitive);
      if (map != null) record.put ("RtyName", map);
      map = DataHelper.filterToMap (in.RtyUpdateCount, in.RtyUpdateCountSort, in.RtyUpdateCountSortAscending, in.RtyUpdateCountFetch);
      if (map != null) record.put ("RtyUpdateCount", map);
      map = DataHelper.filterToMap (in.RtyCreateDate, in.RtyCreateDateSort, in.RtyCreateDateSortAscending, in.RtyCreateDateFetch);
      if (map != null) record.put ("RtyCreateDate", map);
      map = DataHelper.filterToMap (in.RtyModifyDate, in.RtyModifyDateSort, in.RtyModifyDateSortAscending, in.RtyModifyDateFetch);
      if (map != null) record.put ("RtyModifyDate", map);
      map = DataHelper.filterToMap (in.RtyModifyUser, in.RtyModifyUserSort, in.RtyModifyUserSortAscending, in.RtyModifyUserFetch, in.RtyModifyUserCaseInsensitive);
      if (map != null) record.put ("RtyModifyUser", map);
      map = DataHelper.filterToMap (in.RarId, in.RarIdSort, in.RarIdSortAscending, in.RarIdFetch);
      if (map != null) record.put ("RarId", map);
      map = DataHelper.filterToMap (in.RarName, in.RarNameSort, in.RarNameSortAscending, in.RarNameFetch, in.RarNameCaseInsensitive);
      if (map != null) record.put ("RarName", map);
      map = DataHelper.filterToMap (in.RarUpdateCount, in.RarUpdateCountSort, in.RarUpdateCountSortAscending, in.RarUpdateCountFetch);
      if (map != null) record.put ("RarUpdateCount", map);
      map = DataHelper.filterToMap (in.RarCreateDate, in.RarCreateDateSort, in.RarCreateDateSortAscending, in.RarCreateDateFetch);
      if (map != null) record.put ("RarCreateDate", map);
      map = DataHelper.filterToMap (in.RarModifyDate, in.RarModifyDateSort, in.RarModifyDateSortAscending, in.RarModifyDateFetch);
      if (map != null) record.put ("RarModifyDate", map);
      map = DataHelper.filterToMap (in.RarModifyUser, in.RarModifyUserSort, in.RarModifyUserSortAscending, in.RarModifyUserFetch, in.RarModifyUserCaseInsensitive);
      if (map != null) record.put ("RarModifyUser", map);
    return record;
  }
  /** convert Map to SecurityResourceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityResourceObjectData the converted object
   */
  public static SecurityResourceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityResourceObjectData out = new SecurityResourceObjectData ();

    out.Key = SecurityResourceObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ResName")) != null)
    {
      out.ResName = (String) obj;
    }
  
    if ((obj = record.get ("ResSubId")) != null)
    {
      out.ResSubId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResRtyId")) != null)
    {
      out.ResRtyId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResMrId")) != null)
    {
      out.ResMrId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResUpdateCount")) != null)
    {
      out.ResUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResCreateDate")) != null)
    {
      out.ResCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("ResModifyDate")) != null)
    {
      out.ResModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("ResModifyUser")) != null)
    {
      out.ResModifyUser = (String) obj;
    }
  
    if ((obj = record.get ("MrId")) != null)
    {
      out.MrId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("MrName")) != null)
    {
      out.MrName = (String) obj;
    }
  
    if ((obj = record.get ("MrCanonicalName")) != null)
    {
      out.MrCanonicalName = (String) obj;
    }
  
    if ((obj = record.get ("MrResourceRealm")) != null)
    {
      out.MrResourceRealm = (String) obj;
    }
  
    if ((obj = record.get ("MrResourceType")) != null)
    {
      out.MrResourceType = (String) obj;
    }
  
    if ((obj = record.get ("MrActions")) != null)
    {
      out.MrActions = (String) obj;
    }
  
    if ((obj = record.get ("SubId")) != null)
    {
      out.SubId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SubName")) != null)
    {
      out.SubName = (String) obj;
    }
  
    if ((obj = record.get ("SubRarId")) != null)
    {
      out.SubRarId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SubParentId")) != null)
    {
      out.SubParentId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SubUpdateCount")) != null)
    {
      out.SubUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SubCreateDate")) != null)
    {
      out.SubCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("SubModifyDate")) != null)
    {
      out.SubModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("SubModifyUser")) != null)
    {
      out.SubModifyUser = (String) obj;
    }
  
    if ((obj = record.get ("RtyId")) != null)
    {
      out.RtyId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RtyName")) != null)
    {
      out.RtyName = (String) obj;
    }
  
    if ((obj = record.get ("RtyUpdateCount")) != null)
    {
      out.RtyUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RtyCreateDate")) != null)
    {
      out.RtyCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("RtyModifyDate")) != null)
    {
      out.RtyModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("RtyModifyUser")) != null)
    {
      out.RtyModifyUser = (String) obj;
    }
  
    if ((obj = record.get ("RarId")) != null)
    {
      out.RarId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RarName")) != null)
    {
      out.RarName = (String) obj;
    }
  
    if ((obj = record.get ("RarUpdateCount")) != null)
    {
      out.RarUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RarCreateDate")) != null)
    {
      out.RarCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("RarModifyDate")) != null)
    {
      out.RarModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("RarModifyUser")) != null)
    {
      out.RarModifyUser = (String) obj;
    }
      return out;
  }
  /** convert Map to SecurityResourceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityResourceObjectFilter the converted object
   */
  public static SecurityResourceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityResourceObjectFilter out = new SecurityResourceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SecurityResourceObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ResNameMap = (Map)record.get("ResName");
    Boolean ResNameFetch = DataHelper.getFetch(ResNameMap);
    Boolean ResNameSortDir = DataHelper.getSortDirection(ResNameMap);
    Integer ResNameSortOrder = DataHelper.getSortOrder(ResNameMap);
    if (ResNameFetch != null) out.setResNameFetch(ResNameFetch);
    if (ResNameSortDir != null) out.setResNameSortDirection(ResNameSortDir);
    if (ResNameSortOrder != null) out.setResNameSortOrder(ResNameSortOrder);

    Filter[] ResNameFilter = DataHelper.mapToFilterArray(ResNameMap, String.class);
    if (ResNameFilter != null) {
      StringFilter[] ResNameFilters = new StringFilter[ResNameFilter.length];
      for (int i = 0; i < ResNameFilters.length; i++) {
        ResNameFilters[i] = (StringFilter)ResNameFilter[i];
      }
      try {
        out.setResNameFilter(ResNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResSubIdMap = (Map)record.get("ResSubId");
    Boolean ResSubIdFetch = DataHelper.getFetch(ResSubIdMap);
    Boolean ResSubIdSortDir = DataHelper.getSortDirection(ResSubIdMap);
    Integer ResSubIdSortOrder = DataHelper.getSortOrder(ResSubIdMap);
    if (ResSubIdFetch != null) out.setResSubIdFetch(ResSubIdFetch);
    if (ResSubIdSortDir != null) out.setResSubIdSortDirection(ResSubIdSortDir);
    if (ResSubIdSortOrder != null) out.setResSubIdSortOrder(ResSubIdSortOrder);

    Filter[] ResSubIdFilter = DataHelper.mapToFilterArray(ResSubIdMap, BigInteger.class);
    if (ResSubIdFilter != null) {
      BigIntegerFilter[] ResSubIdFilters = new BigIntegerFilter[ResSubIdFilter.length];
      for (int i = 0; i < ResSubIdFilters.length; i++) {
        ResSubIdFilters[i] = (BigIntegerFilter)ResSubIdFilter[i];
      }
      try {
        out.setResSubIdFilter(ResSubIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResRtyIdMap = (Map)record.get("ResRtyId");
    Boolean ResRtyIdFetch = DataHelper.getFetch(ResRtyIdMap);
    Boolean ResRtyIdSortDir = DataHelper.getSortDirection(ResRtyIdMap);
    Integer ResRtyIdSortOrder = DataHelper.getSortOrder(ResRtyIdMap);
    if (ResRtyIdFetch != null) out.setResRtyIdFetch(ResRtyIdFetch);
    if (ResRtyIdSortDir != null) out.setResRtyIdSortDirection(ResRtyIdSortDir);
    if (ResRtyIdSortOrder != null) out.setResRtyIdSortOrder(ResRtyIdSortOrder);

    Filter[] ResRtyIdFilter = DataHelper.mapToFilterArray(ResRtyIdMap, BigInteger.class);
    if (ResRtyIdFilter != null) {
      BigIntegerFilter[] ResRtyIdFilters = new BigIntegerFilter[ResRtyIdFilter.length];
      for (int i = 0; i < ResRtyIdFilters.length; i++) {
        ResRtyIdFilters[i] = (BigIntegerFilter)ResRtyIdFilter[i];
      }
      try {
        out.setResRtyIdFilter(ResRtyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResMrIdMap = (Map)record.get("ResMrId");
    Boolean ResMrIdFetch = DataHelper.getFetch(ResMrIdMap);
    Boolean ResMrIdSortDir = DataHelper.getSortDirection(ResMrIdMap);
    Integer ResMrIdSortOrder = DataHelper.getSortOrder(ResMrIdMap);
    if (ResMrIdFetch != null) out.setResMrIdFetch(ResMrIdFetch);
    if (ResMrIdSortDir != null) out.setResMrIdSortDirection(ResMrIdSortDir);
    if (ResMrIdSortOrder != null) out.setResMrIdSortOrder(ResMrIdSortOrder);

    Filter[] ResMrIdFilter = DataHelper.mapToFilterArray(ResMrIdMap, BigInteger.class);
    if (ResMrIdFilter != null) {
      BigIntegerFilter[] ResMrIdFilters = new BigIntegerFilter[ResMrIdFilter.length];
      for (int i = 0; i < ResMrIdFilters.length; i++) {
        ResMrIdFilters[i] = (BigIntegerFilter)ResMrIdFilter[i];
      }
      try {
        out.setResMrIdFilter(ResMrIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResUpdateCountMap = (Map)record.get("ResUpdateCount");
    Boolean ResUpdateCountFetch = DataHelper.getFetch(ResUpdateCountMap);
    Boolean ResUpdateCountSortDir = DataHelper.getSortDirection(ResUpdateCountMap);
    Integer ResUpdateCountSortOrder = DataHelper.getSortOrder(ResUpdateCountMap);
    if (ResUpdateCountFetch != null) out.setResUpdateCountFetch(ResUpdateCountFetch);
    if (ResUpdateCountSortDir != null) out.setResUpdateCountSortDirection(ResUpdateCountSortDir);
    if (ResUpdateCountSortOrder != null) out.setResUpdateCountSortOrder(ResUpdateCountSortOrder);

    Filter[] ResUpdateCountFilter = DataHelper.mapToFilterArray(ResUpdateCountMap, BigInteger.class);
    if (ResUpdateCountFilter != null) {
      BigIntegerFilter[] ResUpdateCountFilters = new BigIntegerFilter[ResUpdateCountFilter.length];
      for (int i = 0; i < ResUpdateCountFilters.length; i++) {
        ResUpdateCountFilters[i] = (BigIntegerFilter)ResUpdateCountFilter[i];
      }
      try {
        out.setResUpdateCountFilter(ResUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResCreateDateMap = (Map)record.get("ResCreateDate");
    Boolean ResCreateDateFetch = DataHelper.getFetch(ResCreateDateMap);
    Boolean ResCreateDateSortDir = DataHelper.getSortDirection(ResCreateDateMap);
    Integer ResCreateDateSortOrder = DataHelper.getSortOrder(ResCreateDateMap);
    if (ResCreateDateFetch != null) out.setResCreateDateFetch(ResCreateDateFetch);
    if (ResCreateDateSortDir != null) out.setResCreateDateSortDirection(ResCreateDateSortDir);
    if (ResCreateDateSortOrder != null) out.setResCreateDateSortOrder(ResCreateDateSortOrder);

    Filter[] ResCreateDateFilter = DataHelper.mapToFilterArray(ResCreateDateMap, Date.class);
    if (ResCreateDateFilter != null) {
      DateFilter[] ResCreateDateFilters = new DateFilter[ResCreateDateFilter.length];
      for (int i = 0; i < ResCreateDateFilters.length; i++) {
        ResCreateDateFilters[i] = (DateFilter)ResCreateDateFilter[i];
      }
      try {
        out.setResCreateDateFilter(ResCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResModifyDateMap = (Map)record.get("ResModifyDate");
    Boolean ResModifyDateFetch = DataHelper.getFetch(ResModifyDateMap);
    Boolean ResModifyDateSortDir = DataHelper.getSortDirection(ResModifyDateMap);
    Integer ResModifyDateSortOrder = DataHelper.getSortOrder(ResModifyDateMap);
    if (ResModifyDateFetch != null) out.setResModifyDateFetch(ResModifyDateFetch);
    if (ResModifyDateSortDir != null) out.setResModifyDateSortDirection(ResModifyDateSortDir);
    if (ResModifyDateSortOrder != null) out.setResModifyDateSortOrder(ResModifyDateSortOrder);

    Filter[] ResModifyDateFilter = DataHelper.mapToFilterArray(ResModifyDateMap, Date.class);
    if (ResModifyDateFilter != null) {
      DateFilter[] ResModifyDateFilters = new DateFilter[ResModifyDateFilter.length];
      for (int i = 0; i < ResModifyDateFilters.length; i++) {
        ResModifyDateFilters[i] = (DateFilter)ResModifyDateFilter[i];
      }
      try {
        out.setResModifyDateFilter(ResModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResModifyUserMap = (Map)record.get("ResModifyUser");
    Boolean ResModifyUserFetch = DataHelper.getFetch(ResModifyUserMap);
    Boolean ResModifyUserSortDir = DataHelper.getSortDirection(ResModifyUserMap);
    Integer ResModifyUserSortOrder = DataHelper.getSortOrder(ResModifyUserMap);
    if (ResModifyUserFetch != null) out.setResModifyUserFetch(ResModifyUserFetch);
    if (ResModifyUserSortDir != null) out.setResModifyUserSortDirection(ResModifyUserSortDir);
    if (ResModifyUserSortOrder != null) out.setResModifyUserSortOrder(ResModifyUserSortOrder);

    Filter[] ResModifyUserFilter = DataHelper.mapToFilterArray(ResModifyUserMap, String.class);
    if (ResModifyUserFilter != null) {
      StringFilter[] ResModifyUserFilters = new StringFilter[ResModifyUserFilter.length];
      for (int i = 0; i < ResModifyUserFilters.length; i++) {
        ResModifyUserFilters[i] = (StringFilter)ResModifyUserFilter[i];
      }
      try {
        out.setResModifyUserFilter(ResModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrIdMap = (Map)record.get("MrId");
    Boolean MrIdFetch = DataHelper.getFetch(MrIdMap);
    Boolean MrIdSortDir = DataHelper.getSortDirection(MrIdMap);
    Integer MrIdSortOrder = DataHelper.getSortOrder(MrIdMap);
    if (MrIdFetch != null) out.setMrIdFetch(MrIdFetch);
    if (MrIdSortDir != null) out.setMrIdSortDirection(MrIdSortDir);
    if (MrIdSortOrder != null) out.setMrIdSortOrder(MrIdSortOrder);

    Filter[] MrIdFilter = DataHelper.mapToFilterArray(MrIdMap, BigInteger.class);
    if (MrIdFilter != null) {
      BigIntegerFilter[] MrIdFilters = new BigIntegerFilter[MrIdFilter.length];
      for (int i = 0; i < MrIdFilters.length; i++) {
        MrIdFilters[i] = (BigIntegerFilter)MrIdFilter[i];
      }
      try {
        out.setMrIdFilter(MrIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrNameMap = (Map)record.get("MrName");
    Boolean MrNameFetch = DataHelper.getFetch(MrNameMap);
    Boolean MrNameSortDir = DataHelper.getSortDirection(MrNameMap);
    Integer MrNameSortOrder = DataHelper.getSortOrder(MrNameMap);
    if (MrNameFetch != null) out.setMrNameFetch(MrNameFetch);
    if (MrNameSortDir != null) out.setMrNameSortDirection(MrNameSortDir);
    if (MrNameSortOrder != null) out.setMrNameSortOrder(MrNameSortOrder);

    Filter[] MrNameFilter = DataHelper.mapToFilterArray(MrNameMap, String.class);
    if (MrNameFilter != null) {
      StringFilter[] MrNameFilters = new StringFilter[MrNameFilter.length];
      for (int i = 0; i < MrNameFilters.length; i++) {
        MrNameFilters[i] = (StringFilter)MrNameFilter[i];
      }
      try {
        out.setMrNameFilter(MrNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrCanonicalNameMap = (Map)record.get("MrCanonicalName");
    Boolean MrCanonicalNameFetch = DataHelper.getFetch(MrCanonicalNameMap);
    Boolean MrCanonicalNameSortDir = DataHelper.getSortDirection(MrCanonicalNameMap);
    Integer MrCanonicalNameSortOrder = DataHelper.getSortOrder(MrCanonicalNameMap);
    if (MrCanonicalNameFetch != null) out.setMrCanonicalNameFetch(MrCanonicalNameFetch);
    if (MrCanonicalNameSortDir != null) out.setMrCanonicalNameSortDirection(MrCanonicalNameSortDir);
    if (MrCanonicalNameSortOrder != null) out.setMrCanonicalNameSortOrder(MrCanonicalNameSortOrder);

    Filter[] MrCanonicalNameFilter = DataHelper.mapToFilterArray(MrCanonicalNameMap, String.class);
    if (MrCanonicalNameFilter != null) {
      StringFilter[] MrCanonicalNameFilters = new StringFilter[MrCanonicalNameFilter.length];
      for (int i = 0; i < MrCanonicalNameFilters.length; i++) {
        MrCanonicalNameFilters[i] = (StringFilter)MrCanonicalNameFilter[i];
      }
      try {
        out.setMrCanonicalNameFilter(MrCanonicalNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrResourceRealmMap = (Map)record.get("MrResourceRealm");
    Boolean MrResourceRealmFetch = DataHelper.getFetch(MrResourceRealmMap);
    Boolean MrResourceRealmSortDir = DataHelper.getSortDirection(MrResourceRealmMap);
    Integer MrResourceRealmSortOrder = DataHelper.getSortOrder(MrResourceRealmMap);
    if (MrResourceRealmFetch != null) out.setMrResourceRealmFetch(MrResourceRealmFetch);
    if (MrResourceRealmSortDir != null) out.setMrResourceRealmSortDirection(MrResourceRealmSortDir);
    if (MrResourceRealmSortOrder != null) out.setMrResourceRealmSortOrder(MrResourceRealmSortOrder);

    Filter[] MrResourceRealmFilter = DataHelper.mapToFilterArray(MrResourceRealmMap, String.class);
    if (MrResourceRealmFilter != null) {
      StringFilter[] MrResourceRealmFilters = new StringFilter[MrResourceRealmFilter.length];
      for (int i = 0; i < MrResourceRealmFilters.length; i++) {
        MrResourceRealmFilters[i] = (StringFilter)MrResourceRealmFilter[i];
      }
      try {
        out.setMrResourceRealmFilter(MrResourceRealmFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrResourceTypeMap = (Map)record.get("MrResourceType");
    Boolean MrResourceTypeFetch = DataHelper.getFetch(MrResourceTypeMap);
    Boolean MrResourceTypeSortDir = DataHelper.getSortDirection(MrResourceTypeMap);
    Integer MrResourceTypeSortOrder = DataHelper.getSortOrder(MrResourceTypeMap);
    if (MrResourceTypeFetch != null) out.setMrResourceTypeFetch(MrResourceTypeFetch);
    if (MrResourceTypeSortDir != null) out.setMrResourceTypeSortDirection(MrResourceTypeSortDir);
    if (MrResourceTypeSortOrder != null) out.setMrResourceTypeSortOrder(MrResourceTypeSortOrder);

    Filter[] MrResourceTypeFilter = DataHelper.mapToFilterArray(MrResourceTypeMap, String.class);
    if (MrResourceTypeFilter != null) {
      StringFilter[] MrResourceTypeFilters = new StringFilter[MrResourceTypeFilter.length];
      for (int i = 0; i < MrResourceTypeFilters.length; i++) {
        MrResourceTypeFilters[i] = (StringFilter)MrResourceTypeFilter[i];
      }
      try {
        out.setMrResourceTypeFilter(MrResourceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MrActionsMap = (Map)record.get("MrActions");
    Boolean MrActionsFetch = DataHelper.getFetch(MrActionsMap);
    Boolean MrActionsSortDir = DataHelper.getSortDirection(MrActionsMap);
    Integer MrActionsSortOrder = DataHelper.getSortOrder(MrActionsMap);
    if (MrActionsFetch != null) out.setMrActionsFetch(MrActionsFetch);
    if (MrActionsSortDir != null) out.setMrActionsSortDirection(MrActionsSortDir);
    if (MrActionsSortOrder != null) out.setMrActionsSortOrder(MrActionsSortOrder);

    Filter[] MrActionsFilter = DataHelper.mapToFilterArray(MrActionsMap, String.class);
    if (MrActionsFilter != null) {
      StringFilter[] MrActionsFilters = new StringFilter[MrActionsFilter.length];
      for (int i = 0; i < MrActionsFilters.length; i++) {
        MrActionsFilters[i] = (StringFilter)MrActionsFilter[i];
      }
      try {
        out.setMrActionsFilter(MrActionsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubIdMap = (Map)record.get("SubId");
    Boolean SubIdFetch = DataHelper.getFetch(SubIdMap);
    Boolean SubIdSortDir = DataHelper.getSortDirection(SubIdMap);
    Integer SubIdSortOrder = DataHelper.getSortOrder(SubIdMap);
    if (SubIdFetch != null) out.setSubIdFetch(SubIdFetch);
    if (SubIdSortDir != null) out.setSubIdSortDirection(SubIdSortDir);
    if (SubIdSortOrder != null) out.setSubIdSortOrder(SubIdSortOrder);

    Filter[] SubIdFilter = DataHelper.mapToFilterArray(SubIdMap, BigInteger.class);
    if (SubIdFilter != null) {
      BigIntegerFilter[] SubIdFilters = new BigIntegerFilter[SubIdFilter.length];
      for (int i = 0; i < SubIdFilters.length; i++) {
        SubIdFilters[i] = (BigIntegerFilter)SubIdFilter[i];
      }
      try {
        out.setSubIdFilter(SubIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubNameMap = (Map)record.get("SubName");
    Boolean SubNameFetch = DataHelper.getFetch(SubNameMap);
    Boolean SubNameSortDir = DataHelper.getSortDirection(SubNameMap);
    Integer SubNameSortOrder = DataHelper.getSortOrder(SubNameMap);
    if (SubNameFetch != null) out.setSubNameFetch(SubNameFetch);
    if (SubNameSortDir != null) out.setSubNameSortDirection(SubNameSortDir);
    if (SubNameSortOrder != null) out.setSubNameSortOrder(SubNameSortOrder);

    Filter[] SubNameFilter = DataHelper.mapToFilterArray(SubNameMap, String.class);
    if (SubNameFilter != null) {
      StringFilter[] SubNameFilters = new StringFilter[SubNameFilter.length];
      for (int i = 0; i < SubNameFilters.length; i++) {
        SubNameFilters[i] = (StringFilter)SubNameFilter[i];
      }
      try {
        out.setSubNameFilter(SubNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubRarIdMap = (Map)record.get("SubRarId");
    Boolean SubRarIdFetch = DataHelper.getFetch(SubRarIdMap);
    Boolean SubRarIdSortDir = DataHelper.getSortDirection(SubRarIdMap);
    Integer SubRarIdSortOrder = DataHelper.getSortOrder(SubRarIdMap);
    if (SubRarIdFetch != null) out.setSubRarIdFetch(SubRarIdFetch);
    if (SubRarIdSortDir != null) out.setSubRarIdSortDirection(SubRarIdSortDir);
    if (SubRarIdSortOrder != null) out.setSubRarIdSortOrder(SubRarIdSortOrder);

    Filter[] SubRarIdFilter = DataHelper.mapToFilterArray(SubRarIdMap, BigInteger.class);
    if (SubRarIdFilter != null) {
      BigIntegerFilter[] SubRarIdFilters = new BigIntegerFilter[SubRarIdFilter.length];
      for (int i = 0; i < SubRarIdFilters.length; i++) {
        SubRarIdFilters[i] = (BigIntegerFilter)SubRarIdFilter[i];
      }
      try {
        out.setSubRarIdFilter(SubRarIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubParentIdMap = (Map)record.get("SubParentId");
    Boolean SubParentIdFetch = DataHelper.getFetch(SubParentIdMap);
    Boolean SubParentIdSortDir = DataHelper.getSortDirection(SubParentIdMap);
    Integer SubParentIdSortOrder = DataHelper.getSortOrder(SubParentIdMap);
    if (SubParentIdFetch != null) out.setSubParentIdFetch(SubParentIdFetch);
    if (SubParentIdSortDir != null) out.setSubParentIdSortDirection(SubParentIdSortDir);
    if (SubParentIdSortOrder != null) out.setSubParentIdSortOrder(SubParentIdSortOrder);

    Filter[] SubParentIdFilter = DataHelper.mapToFilterArray(SubParentIdMap, BigInteger.class);
    if (SubParentIdFilter != null) {
      BigIntegerFilter[] SubParentIdFilters = new BigIntegerFilter[SubParentIdFilter.length];
      for (int i = 0; i < SubParentIdFilters.length; i++) {
        SubParentIdFilters[i] = (BigIntegerFilter)SubParentIdFilter[i];
      }
      try {
        out.setSubParentIdFilter(SubParentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubUpdateCountMap = (Map)record.get("SubUpdateCount");
    Boolean SubUpdateCountFetch = DataHelper.getFetch(SubUpdateCountMap);
    Boolean SubUpdateCountSortDir = DataHelper.getSortDirection(SubUpdateCountMap);
    Integer SubUpdateCountSortOrder = DataHelper.getSortOrder(SubUpdateCountMap);
    if (SubUpdateCountFetch != null) out.setSubUpdateCountFetch(SubUpdateCountFetch);
    if (SubUpdateCountSortDir != null) out.setSubUpdateCountSortDirection(SubUpdateCountSortDir);
    if (SubUpdateCountSortOrder != null) out.setSubUpdateCountSortOrder(SubUpdateCountSortOrder);

    Filter[] SubUpdateCountFilter = DataHelper.mapToFilterArray(SubUpdateCountMap, BigInteger.class);
    if (SubUpdateCountFilter != null) {
      BigIntegerFilter[] SubUpdateCountFilters = new BigIntegerFilter[SubUpdateCountFilter.length];
      for (int i = 0; i < SubUpdateCountFilters.length; i++) {
        SubUpdateCountFilters[i] = (BigIntegerFilter)SubUpdateCountFilter[i];
      }
      try {
        out.setSubUpdateCountFilter(SubUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubCreateDateMap = (Map)record.get("SubCreateDate");
    Boolean SubCreateDateFetch = DataHelper.getFetch(SubCreateDateMap);
    Boolean SubCreateDateSortDir = DataHelper.getSortDirection(SubCreateDateMap);
    Integer SubCreateDateSortOrder = DataHelper.getSortOrder(SubCreateDateMap);
    if (SubCreateDateFetch != null) out.setSubCreateDateFetch(SubCreateDateFetch);
    if (SubCreateDateSortDir != null) out.setSubCreateDateSortDirection(SubCreateDateSortDir);
    if (SubCreateDateSortOrder != null) out.setSubCreateDateSortOrder(SubCreateDateSortOrder);

    Filter[] SubCreateDateFilter = DataHelper.mapToFilterArray(SubCreateDateMap, Date.class);
    if (SubCreateDateFilter != null) {
      DateFilter[] SubCreateDateFilters = new DateFilter[SubCreateDateFilter.length];
      for (int i = 0; i < SubCreateDateFilters.length; i++) {
        SubCreateDateFilters[i] = (DateFilter)SubCreateDateFilter[i];
      }
      try {
        out.setSubCreateDateFilter(SubCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubModifyDateMap = (Map)record.get("SubModifyDate");
    Boolean SubModifyDateFetch = DataHelper.getFetch(SubModifyDateMap);
    Boolean SubModifyDateSortDir = DataHelper.getSortDirection(SubModifyDateMap);
    Integer SubModifyDateSortOrder = DataHelper.getSortOrder(SubModifyDateMap);
    if (SubModifyDateFetch != null) out.setSubModifyDateFetch(SubModifyDateFetch);
    if (SubModifyDateSortDir != null) out.setSubModifyDateSortDirection(SubModifyDateSortDir);
    if (SubModifyDateSortOrder != null) out.setSubModifyDateSortOrder(SubModifyDateSortOrder);

    Filter[] SubModifyDateFilter = DataHelper.mapToFilterArray(SubModifyDateMap, Date.class);
    if (SubModifyDateFilter != null) {
      DateFilter[] SubModifyDateFilters = new DateFilter[SubModifyDateFilter.length];
      for (int i = 0; i < SubModifyDateFilters.length; i++) {
        SubModifyDateFilters[i] = (DateFilter)SubModifyDateFilter[i];
      }
      try {
        out.setSubModifyDateFilter(SubModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubModifyUserMap = (Map)record.get("SubModifyUser");
    Boolean SubModifyUserFetch = DataHelper.getFetch(SubModifyUserMap);
    Boolean SubModifyUserSortDir = DataHelper.getSortDirection(SubModifyUserMap);
    Integer SubModifyUserSortOrder = DataHelper.getSortOrder(SubModifyUserMap);
    if (SubModifyUserFetch != null) out.setSubModifyUserFetch(SubModifyUserFetch);
    if (SubModifyUserSortDir != null) out.setSubModifyUserSortDirection(SubModifyUserSortDir);
    if (SubModifyUserSortOrder != null) out.setSubModifyUserSortOrder(SubModifyUserSortOrder);

    Filter[] SubModifyUserFilter = DataHelper.mapToFilterArray(SubModifyUserMap, String.class);
    if (SubModifyUserFilter != null) {
      StringFilter[] SubModifyUserFilters = new StringFilter[SubModifyUserFilter.length];
      for (int i = 0; i < SubModifyUserFilters.length; i++) {
        SubModifyUserFilters[i] = (StringFilter)SubModifyUserFilter[i];
      }
      try {
        out.setSubModifyUserFilter(SubModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyIdMap = (Map)record.get("RtyId");
    Boolean RtyIdFetch = DataHelper.getFetch(RtyIdMap);
    Boolean RtyIdSortDir = DataHelper.getSortDirection(RtyIdMap);
    Integer RtyIdSortOrder = DataHelper.getSortOrder(RtyIdMap);
    if (RtyIdFetch != null) out.setRtyIdFetch(RtyIdFetch);
    if (RtyIdSortDir != null) out.setRtyIdSortDirection(RtyIdSortDir);
    if (RtyIdSortOrder != null) out.setRtyIdSortOrder(RtyIdSortOrder);

    Filter[] RtyIdFilter = DataHelper.mapToFilterArray(RtyIdMap, BigInteger.class);
    if (RtyIdFilter != null) {
      BigIntegerFilter[] RtyIdFilters = new BigIntegerFilter[RtyIdFilter.length];
      for (int i = 0; i < RtyIdFilters.length; i++) {
        RtyIdFilters[i] = (BigIntegerFilter)RtyIdFilter[i];
      }
      try {
        out.setRtyIdFilter(RtyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyNameMap = (Map)record.get("RtyName");
    Boolean RtyNameFetch = DataHelper.getFetch(RtyNameMap);
    Boolean RtyNameSortDir = DataHelper.getSortDirection(RtyNameMap);
    Integer RtyNameSortOrder = DataHelper.getSortOrder(RtyNameMap);
    if (RtyNameFetch != null) out.setRtyNameFetch(RtyNameFetch);
    if (RtyNameSortDir != null) out.setRtyNameSortDirection(RtyNameSortDir);
    if (RtyNameSortOrder != null) out.setRtyNameSortOrder(RtyNameSortOrder);

    Filter[] RtyNameFilter = DataHelper.mapToFilterArray(RtyNameMap, String.class);
    if (RtyNameFilter != null) {
      StringFilter[] RtyNameFilters = new StringFilter[RtyNameFilter.length];
      for (int i = 0; i < RtyNameFilters.length; i++) {
        RtyNameFilters[i] = (StringFilter)RtyNameFilter[i];
      }
      try {
        out.setRtyNameFilter(RtyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyUpdateCountMap = (Map)record.get("RtyUpdateCount");
    Boolean RtyUpdateCountFetch = DataHelper.getFetch(RtyUpdateCountMap);
    Boolean RtyUpdateCountSortDir = DataHelper.getSortDirection(RtyUpdateCountMap);
    Integer RtyUpdateCountSortOrder = DataHelper.getSortOrder(RtyUpdateCountMap);
    if (RtyUpdateCountFetch != null) out.setRtyUpdateCountFetch(RtyUpdateCountFetch);
    if (RtyUpdateCountSortDir != null) out.setRtyUpdateCountSortDirection(RtyUpdateCountSortDir);
    if (RtyUpdateCountSortOrder != null) out.setRtyUpdateCountSortOrder(RtyUpdateCountSortOrder);

    Filter[] RtyUpdateCountFilter = DataHelper.mapToFilterArray(RtyUpdateCountMap, BigInteger.class);
    if (RtyUpdateCountFilter != null) {
      BigIntegerFilter[] RtyUpdateCountFilters = new BigIntegerFilter[RtyUpdateCountFilter.length];
      for (int i = 0; i < RtyUpdateCountFilters.length; i++) {
        RtyUpdateCountFilters[i] = (BigIntegerFilter)RtyUpdateCountFilter[i];
      }
      try {
        out.setRtyUpdateCountFilter(RtyUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyCreateDateMap = (Map)record.get("RtyCreateDate");
    Boolean RtyCreateDateFetch = DataHelper.getFetch(RtyCreateDateMap);
    Boolean RtyCreateDateSortDir = DataHelper.getSortDirection(RtyCreateDateMap);
    Integer RtyCreateDateSortOrder = DataHelper.getSortOrder(RtyCreateDateMap);
    if (RtyCreateDateFetch != null) out.setRtyCreateDateFetch(RtyCreateDateFetch);
    if (RtyCreateDateSortDir != null) out.setRtyCreateDateSortDirection(RtyCreateDateSortDir);
    if (RtyCreateDateSortOrder != null) out.setRtyCreateDateSortOrder(RtyCreateDateSortOrder);

    Filter[] RtyCreateDateFilter = DataHelper.mapToFilterArray(RtyCreateDateMap, Date.class);
    if (RtyCreateDateFilter != null) {
      DateFilter[] RtyCreateDateFilters = new DateFilter[RtyCreateDateFilter.length];
      for (int i = 0; i < RtyCreateDateFilters.length; i++) {
        RtyCreateDateFilters[i] = (DateFilter)RtyCreateDateFilter[i];
      }
      try {
        out.setRtyCreateDateFilter(RtyCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyModifyDateMap = (Map)record.get("RtyModifyDate");
    Boolean RtyModifyDateFetch = DataHelper.getFetch(RtyModifyDateMap);
    Boolean RtyModifyDateSortDir = DataHelper.getSortDirection(RtyModifyDateMap);
    Integer RtyModifyDateSortOrder = DataHelper.getSortOrder(RtyModifyDateMap);
    if (RtyModifyDateFetch != null) out.setRtyModifyDateFetch(RtyModifyDateFetch);
    if (RtyModifyDateSortDir != null) out.setRtyModifyDateSortDirection(RtyModifyDateSortDir);
    if (RtyModifyDateSortOrder != null) out.setRtyModifyDateSortOrder(RtyModifyDateSortOrder);

    Filter[] RtyModifyDateFilter = DataHelper.mapToFilterArray(RtyModifyDateMap, Date.class);
    if (RtyModifyDateFilter != null) {
      DateFilter[] RtyModifyDateFilters = new DateFilter[RtyModifyDateFilter.length];
      for (int i = 0; i < RtyModifyDateFilters.length; i++) {
        RtyModifyDateFilters[i] = (DateFilter)RtyModifyDateFilter[i];
      }
      try {
        out.setRtyModifyDateFilter(RtyModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RtyModifyUserMap = (Map)record.get("RtyModifyUser");
    Boolean RtyModifyUserFetch = DataHelper.getFetch(RtyModifyUserMap);
    Boolean RtyModifyUserSortDir = DataHelper.getSortDirection(RtyModifyUserMap);
    Integer RtyModifyUserSortOrder = DataHelper.getSortOrder(RtyModifyUserMap);
    if (RtyModifyUserFetch != null) out.setRtyModifyUserFetch(RtyModifyUserFetch);
    if (RtyModifyUserSortDir != null) out.setRtyModifyUserSortDirection(RtyModifyUserSortDir);
    if (RtyModifyUserSortOrder != null) out.setRtyModifyUserSortOrder(RtyModifyUserSortOrder);

    Filter[] RtyModifyUserFilter = DataHelper.mapToFilterArray(RtyModifyUserMap, String.class);
    if (RtyModifyUserFilter != null) {
      StringFilter[] RtyModifyUserFilters = new StringFilter[RtyModifyUserFilter.length];
      for (int i = 0; i < RtyModifyUserFilters.length; i++) {
        RtyModifyUserFilters[i] = (StringFilter)RtyModifyUserFilter[i];
      }
      try {
        out.setRtyModifyUserFilter(RtyModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarIdMap = (Map)record.get("RarId");
    Boolean RarIdFetch = DataHelper.getFetch(RarIdMap);
    Boolean RarIdSortDir = DataHelper.getSortDirection(RarIdMap);
    Integer RarIdSortOrder = DataHelper.getSortOrder(RarIdMap);
    if (RarIdFetch != null) out.setRarIdFetch(RarIdFetch);
    if (RarIdSortDir != null) out.setRarIdSortDirection(RarIdSortDir);
    if (RarIdSortOrder != null) out.setRarIdSortOrder(RarIdSortOrder);

    Filter[] RarIdFilter = DataHelper.mapToFilterArray(RarIdMap, BigInteger.class);
    if (RarIdFilter != null) {
      BigIntegerFilter[] RarIdFilters = new BigIntegerFilter[RarIdFilter.length];
      for (int i = 0; i < RarIdFilters.length; i++) {
        RarIdFilters[i] = (BigIntegerFilter)RarIdFilter[i];
      }
      try {
        out.setRarIdFilter(RarIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarNameMap = (Map)record.get("RarName");
    Boolean RarNameFetch = DataHelper.getFetch(RarNameMap);
    Boolean RarNameSortDir = DataHelper.getSortDirection(RarNameMap);
    Integer RarNameSortOrder = DataHelper.getSortOrder(RarNameMap);
    if (RarNameFetch != null) out.setRarNameFetch(RarNameFetch);
    if (RarNameSortDir != null) out.setRarNameSortDirection(RarNameSortDir);
    if (RarNameSortOrder != null) out.setRarNameSortOrder(RarNameSortOrder);

    Filter[] RarNameFilter = DataHelper.mapToFilterArray(RarNameMap, String.class);
    if (RarNameFilter != null) {
      StringFilter[] RarNameFilters = new StringFilter[RarNameFilter.length];
      for (int i = 0; i < RarNameFilters.length; i++) {
        RarNameFilters[i] = (StringFilter)RarNameFilter[i];
      }
      try {
        out.setRarNameFilter(RarNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarUpdateCountMap = (Map)record.get("RarUpdateCount");
    Boolean RarUpdateCountFetch = DataHelper.getFetch(RarUpdateCountMap);
    Boolean RarUpdateCountSortDir = DataHelper.getSortDirection(RarUpdateCountMap);
    Integer RarUpdateCountSortOrder = DataHelper.getSortOrder(RarUpdateCountMap);
    if (RarUpdateCountFetch != null) out.setRarUpdateCountFetch(RarUpdateCountFetch);
    if (RarUpdateCountSortDir != null) out.setRarUpdateCountSortDirection(RarUpdateCountSortDir);
    if (RarUpdateCountSortOrder != null) out.setRarUpdateCountSortOrder(RarUpdateCountSortOrder);

    Filter[] RarUpdateCountFilter = DataHelper.mapToFilterArray(RarUpdateCountMap, BigInteger.class);
    if (RarUpdateCountFilter != null) {
      BigIntegerFilter[] RarUpdateCountFilters = new BigIntegerFilter[RarUpdateCountFilter.length];
      for (int i = 0; i < RarUpdateCountFilters.length; i++) {
        RarUpdateCountFilters[i] = (BigIntegerFilter)RarUpdateCountFilter[i];
      }
      try {
        out.setRarUpdateCountFilter(RarUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarCreateDateMap = (Map)record.get("RarCreateDate");
    Boolean RarCreateDateFetch = DataHelper.getFetch(RarCreateDateMap);
    Boolean RarCreateDateSortDir = DataHelper.getSortDirection(RarCreateDateMap);
    Integer RarCreateDateSortOrder = DataHelper.getSortOrder(RarCreateDateMap);
    if (RarCreateDateFetch != null) out.setRarCreateDateFetch(RarCreateDateFetch);
    if (RarCreateDateSortDir != null) out.setRarCreateDateSortDirection(RarCreateDateSortDir);
    if (RarCreateDateSortOrder != null) out.setRarCreateDateSortOrder(RarCreateDateSortOrder);

    Filter[] RarCreateDateFilter = DataHelper.mapToFilterArray(RarCreateDateMap, Date.class);
    if (RarCreateDateFilter != null) {
      DateFilter[] RarCreateDateFilters = new DateFilter[RarCreateDateFilter.length];
      for (int i = 0; i < RarCreateDateFilters.length; i++) {
        RarCreateDateFilters[i] = (DateFilter)RarCreateDateFilter[i];
      }
      try {
        out.setRarCreateDateFilter(RarCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarModifyDateMap = (Map)record.get("RarModifyDate");
    Boolean RarModifyDateFetch = DataHelper.getFetch(RarModifyDateMap);
    Boolean RarModifyDateSortDir = DataHelper.getSortDirection(RarModifyDateMap);
    Integer RarModifyDateSortOrder = DataHelper.getSortOrder(RarModifyDateMap);
    if (RarModifyDateFetch != null) out.setRarModifyDateFetch(RarModifyDateFetch);
    if (RarModifyDateSortDir != null) out.setRarModifyDateSortDirection(RarModifyDateSortDir);
    if (RarModifyDateSortOrder != null) out.setRarModifyDateSortOrder(RarModifyDateSortOrder);

    Filter[] RarModifyDateFilter = DataHelper.mapToFilterArray(RarModifyDateMap, Date.class);
    if (RarModifyDateFilter != null) {
      DateFilter[] RarModifyDateFilters = new DateFilter[RarModifyDateFilter.length];
      for (int i = 0; i < RarModifyDateFilters.length; i++) {
        RarModifyDateFilters[i] = (DateFilter)RarModifyDateFilter[i];
      }
      try {
        out.setRarModifyDateFilter(RarModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RarModifyUserMap = (Map)record.get("RarModifyUser");
    Boolean RarModifyUserFetch = DataHelper.getFetch(RarModifyUserMap);
    Boolean RarModifyUserSortDir = DataHelper.getSortDirection(RarModifyUserMap);
    Integer RarModifyUserSortOrder = DataHelper.getSortOrder(RarModifyUserMap);
    if (RarModifyUserFetch != null) out.setRarModifyUserFetch(RarModifyUserFetch);
    if (RarModifyUserSortDir != null) out.setRarModifyUserSortDirection(RarModifyUserSortDir);
    if (RarModifyUserSortOrder != null) out.setRarModifyUserSortOrder(RarModifyUserSortOrder);

    Filter[] RarModifyUserFilter = DataHelper.mapToFilterArray(RarModifyUserMap, String.class);
    if (RarModifyUserFilter != null) {
      StringFilter[] RarModifyUserFilters = new StringFilter[RarModifyUserFilter.length];
      for (int i = 0; i < RarModifyUserFilters.length; i++) {
        RarModifyUserFilters[i] = (StringFilter)RarModifyUserFilter[i];
      }
      try {
        out.setRarModifyUserFilter(RarModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
