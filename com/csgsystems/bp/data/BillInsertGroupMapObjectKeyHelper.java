/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectKeyHelper.java
 * Definition File: Admin/.xml
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

/** Helper class for BillInsertGroupMapObject's Key objects. */
public class BillInsertGroupMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillInsertGroupMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillInsertGroupMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillInsertGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillInsertGroupMapObjectKeyData the converted object
   */
  public static BillInsertGroupMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillInsertGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillInsertGroupMapObject")
   * @return BillInsertGroupMapObjectKeyData the converted object
   */
  public static BillInsertGroupMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillInsertGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillInsertGroupMapObjectKeyFilter the converted object
   */
  public static BillInsertGroupMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillInsertGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillInsertGroupMapObject")
   * @return BillInsertGroupMapObjectKeyFilter the converted object
   */
  public static BillInsertGroupMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillInsertGroupMapObjectKeyData to a Map (not including the root).
  /** convert BillInsertGroupMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillInsertGroupMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._InsertGrpIdSet) record.put ("InsertGrpId", in.InsertGrpId);
  
    if (in._InsertIdSet) record.put ("InsertId", in.InsertId);
  
    if (in._GeoKeySet) record.put ("GeoKey", in.GeoKey);
  
    if (in._MktCodeSet) record.put ("MktCode", in.MktCode);
  
    return record;
  }
  /** convert BillInsertGroupMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillInsertGroupMapObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.InsertGrpId, in.InsertGrpIdSort, in.InsertGrpIdSortAscending, in.InsertGrpIdFetch);
      if (map != null) record.put ("InsertGrpId", map);
      map = DataHelper.filterToMap (in.InsertId, in.InsertIdSort, in.InsertIdSortAscending, in.InsertIdFetch);
      if (map != null) record.put ("InsertId", map);
      map = DataHelper.filterToMap (in.GeoKey, in.GeoKeySort, in.GeoKeySortAscending, in.GeoKeyFetch, in.GeoKeyCaseInsensitive);
      if (map != null) record.put ("GeoKey", map);
      map = DataHelper.filterToMap (in.MktCode, in.MktCodeSort, in.MktCodeSortAscending, in.MktCodeFetch);
      if (map != null) record.put ("MktCode", map);
    return record;
  }
  /** convert Map to BillInsertGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupMapObjectKeyData the converted object
   */
  public static BillInsertGroupMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupMapObjectKeyData out = new BillInsertGroupMapObjectKeyData ();

    if ((obj = record.get ("InsertGrpId")) != null)
    {
      out.InsertGrpId = (Integer) obj;
      out._InsertGrpIdSet = true;
    }
  
    if ((obj = record.get ("InsertId")) != null)
    {
      out.InsertId = (Integer) obj;
      out._InsertIdSet = true;
    }
  
    if ((obj = record.get ("GeoKey")) != null)
    {
      out.GeoKey = (String) obj;
      out._GeoKeySet = true;
    }
  
    if ((obj = record.get ("MktCode")) != null)
    {
      out.MktCode = (Integer) obj;
      out._MktCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BillInsertGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupMapObjectKeyFilter the converted object
   */
  public static BillInsertGroupMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupMapObjectKeyFilter out = new BillInsertGroupMapObjectKeyFilter ();

    Map InsertGrpIdMap = (Map)record.get("InsertGrpId");
    Boolean InsertGrpIdFetch = DataHelper.getFetch(InsertGrpIdMap);
    Boolean InsertGrpIdSortDir = DataHelper.getSortDirection(InsertGrpIdMap);
    Integer InsertGrpIdSortOrder = DataHelper.getSortOrder(InsertGrpIdMap);
    if (InsertGrpIdFetch != null) out.setInsertGrpIdFetch(InsertGrpIdFetch);
    if (InsertGrpIdSortDir != null) out.setInsertGrpIdSortDirection(InsertGrpIdSortDir);
    if (InsertGrpIdSortOrder != null) out.setInsertGrpIdSortOrder(InsertGrpIdSortOrder);

    Filter[] InsertGrpIdFilter = DataHelper.mapToFilterArray(InsertGrpIdMap, Integer.class);
    if (InsertGrpIdFilter != null) {
      IntegerFilter[] InsertGrpIdFilters = new IntegerFilter[InsertGrpIdFilter.length];
      for (int i = 0; i < InsertGrpIdFilters.length; i++) {
        InsertGrpIdFilters[i] = (IntegerFilter)InsertGrpIdFilter[i];
      }
      try {
        out.setInsertGrpIdFilter(InsertGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InsertIdMap = (Map)record.get("InsertId");
    Boolean InsertIdFetch = DataHelper.getFetch(InsertIdMap);
    Boolean InsertIdSortDir = DataHelper.getSortDirection(InsertIdMap);
    Integer InsertIdSortOrder = DataHelper.getSortOrder(InsertIdMap);
    if (InsertIdFetch != null) out.setInsertIdFetch(InsertIdFetch);
    if (InsertIdSortDir != null) out.setInsertIdSortDirection(InsertIdSortDir);
    if (InsertIdSortOrder != null) out.setInsertIdSortOrder(InsertIdSortOrder);

    Filter[] InsertIdFilter = DataHelper.mapToFilterArray(InsertIdMap, Integer.class);
    if (InsertIdFilter != null) {
      IntegerFilter[] InsertIdFilters = new IntegerFilter[InsertIdFilter.length];
      for (int i = 0; i < InsertIdFilters.length; i++) {
        InsertIdFilters[i] = (IntegerFilter)InsertIdFilter[i];
      }
      try {
        out.setInsertIdFilter(InsertIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GeoKeyMap = (Map)record.get("GeoKey");
    Boolean GeoKeyFetch = DataHelper.getFetch(GeoKeyMap);
    Boolean GeoKeySortDir = DataHelper.getSortDirection(GeoKeyMap);
    Integer GeoKeySortOrder = DataHelper.getSortOrder(GeoKeyMap);
    if (GeoKeyFetch != null) out.setGeoKeyFetch(GeoKeyFetch);
    if (GeoKeySortDir != null) out.setGeoKeySortDirection(GeoKeySortDir);
    if (GeoKeySortOrder != null) out.setGeoKeySortOrder(GeoKeySortOrder);

    Filter[] GeoKeyFilter = DataHelper.mapToFilterArray(GeoKeyMap, String.class);
    if (GeoKeyFilter != null) {
      StringFilter[] GeoKeyFilters = new StringFilter[GeoKeyFilter.length];
      for (int i = 0; i < GeoKeyFilters.length; i++) {
        GeoKeyFilters[i] = (StringFilter)GeoKeyFilter[i];
      }
      try {
        out.setGeoKeyFilter(GeoKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MktCodeMap = (Map)record.get("MktCode");
    Boolean MktCodeFetch = DataHelper.getFetch(MktCodeMap);
    Boolean MktCodeSortDir = DataHelper.getSortDirection(MktCodeMap);
    Integer MktCodeSortOrder = DataHelper.getSortOrder(MktCodeMap);
    if (MktCodeFetch != null) out.setMktCodeFetch(MktCodeFetch);
    if (MktCodeSortDir != null) out.setMktCodeSortDirection(MktCodeSortDir);
    if (MktCodeSortOrder != null) out.setMktCodeSortOrder(MktCodeSortOrder);

    Filter[] MktCodeFilter = DataHelper.mapToFilterArray(MktCodeMap, Integer.class);
    if (MktCodeFilter != null) {
      IntegerFilter[] MktCodeFilters = new IntegerFilter[MktCodeFilter.length];
      for (int i = 0; i < MktCodeFilters.length; i++) {
        MktCodeFilters[i] = (IntegerFilter)MktCodeFilter[i];
      }
      try {
        out.setMktCodeFilter(MktCodeFilters);
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
