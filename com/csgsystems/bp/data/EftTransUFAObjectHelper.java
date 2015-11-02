/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftTransUFAObjectHelper.java
 * Definition File: Customer/EftTransaction.xml
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



/** Helper class to convert EftTransUFAObject JavaBean objects to/from HashMaps.
 */
public class EftTransUFAObjectHelper implements ArubaObjectHelper
{
  /** convert EftTransUFAObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EftTransUFAObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftTransUFAObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftTransUFAObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftTransUFAObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftTransUFAObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = EftTransactionObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert EftTransUFAObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EftTransUFAObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftTransUFAObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftTransUFAObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftTransUFAObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftTransUFAObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = EftTransactionObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EftTransUFAObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EftTransUFAObjectData the converted object
   */
  public static EftTransUFAObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EftTransUFAObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EftTransUFAObject")
   * @return EftTransUFAObjectData the converted object
   */
  public static EftTransUFAObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransUFAObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EftTransUFAObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EftTransUFAObjectFilter the converted object
   */
  public static EftTransUFAObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EftTransUFAObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EftTransUFAObject")
   * @return EftTransUFAObjectFilter the converted object
   */
  public static EftTransUFAObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransUFAObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EftTransUFAObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EftTransUFAObjectDataList the converted object
   */
  public static EftTransUFAObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EftTransUFAObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EftTransUFAObjectList")
   * @return EftTransUFAObjectDataList the converted object
   */
  public static EftTransUFAObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransUFAObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EftTransUFAObjectData[] array = null;
    if (root != null)
    {
      array = new EftTransUFAObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EftTransUFAObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EftTransUFAObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EftTransUFAObjectDataList (array, index, total);
  }
  /** convert EftTransUFAObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftTransUFAObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
      return record;
  }
  /** convert EftTransUFAObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftTransUFAObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
    return record;
  }
  /** convert Map to EftTransUFAObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftTransUFAObjectData the converted object
   */
  public static EftTransUFAObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftTransUFAObjectData out = new EftTransUFAObjectData (EftTransactionObjectHelper.getObj (record));

    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to EftTransUFAObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftTransUFAObjectFilter the converted object
   */
  public static EftTransUFAObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftTransUFAObjectFilter out = new EftTransUFAObjectFilter (EftTransactionObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map ProfileIdMap = (Map)record.get("ProfileId");
    Boolean ProfileIdFetch = DataHelper.getFetch(ProfileIdMap);
    Boolean ProfileIdSortDir = DataHelper.getSortDirection(ProfileIdMap);
    Integer ProfileIdSortOrder = DataHelper.getSortOrder(ProfileIdMap);
    if (ProfileIdFetch != null) out.setProfileIdFetch(ProfileIdFetch);
    if (ProfileIdSortDir != null) out.setProfileIdSortDirection(ProfileIdSortDir);
    if (ProfileIdSortOrder != null) out.setProfileIdSortOrder(ProfileIdSortOrder);

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, BigInteger.class);
    if (ProfileIdFilter != null) {
      BigIntegerFilter[] ProfileIdFilters = new BigIntegerFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (BigIntegerFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
