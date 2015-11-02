/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectKeyHelper.java
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

/** Helper class for BillMessageGroupMapObject's Key objects. */
public class BillMessageGroupMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillMessageGroupMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillMessageGroupMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillMessageGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillMessageGroupMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillMessageGroupMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillMessageGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillMessageGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillMessageGroupMapObjectKeyData the converted object
   */
  public static BillMessageGroupMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillMessageGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillMessageGroupMapObject")
   * @return BillMessageGroupMapObjectKeyData the converted object
   */
  public static BillMessageGroupMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillMessageGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillMessageGroupMapObjectKeyFilter the converted object
   */
  public static BillMessageGroupMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillMessageGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillMessageGroupMapObject")
   * @return BillMessageGroupMapObjectKeyFilter the converted object
   */
  public static BillMessageGroupMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillMessageGroupMapObjectKeyData to a Map (not including the root).
  /** convert BillMessageGroupMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillMessageGroupMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._MsgGrpIdSet) record.put ("MsgGrpId", in.MsgGrpId);
  
    if (in._MessageIdSet) record.put ("MessageId", in.MessageId);
  
    if (in._MsgSequenceNumSet) record.put ("MsgSequenceNum", in.MsgSequenceNum);
  
    if (in._GeoKeySet) record.put ("GeoKey", in.GeoKey);
  
    if (in._MktCodeSet) record.put ("MktCode", in.MktCode);
  
    if (in._ServiceCenterIdSet) record.put ("ServiceCenterId", in.ServiceCenterId);
  
    if (in._MsgForeignKeySet) record.put ("MsgForeignKey", in.MsgForeignKey);
  
    return record;
  }
  /** convert BillMessageGroupMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillMessageGroupMapObjectKeyFilter in, Map record)
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
      map = DataHelper.filterToMap (in.MsgSequenceNum, in.MsgSequenceNumSort, in.MsgSequenceNumSortAscending, in.MsgSequenceNumFetch);
      if (map != null) record.put ("MsgSequenceNum", map);
      map = DataHelper.filterToMap (in.GeoKey, in.GeoKeySort, in.GeoKeySortAscending, in.GeoKeyFetch, in.GeoKeyCaseInsensitive);
      if (map != null) record.put ("GeoKey", map);
      map = DataHelper.filterToMap (in.MktCode, in.MktCodeSort, in.MktCodeSortAscending, in.MktCodeFetch);
      if (map != null) record.put ("MktCode", map);
      map = DataHelper.filterToMap (in.ServiceCenterId, in.ServiceCenterIdSort, in.ServiceCenterIdSortAscending, in.ServiceCenterIdFetch);
      if (map != null) record.put ("ServiceCenterId", map);
      map = DataHelper.filterToMap (in.MsgForeignKey, in.MsgForeignKeySort, in.MsgForeignKeySortAscending, in.MsgForeignKeyFetch);
      if (map != null) record.put ("MsgForeignKey", map);
    return record;
  }
  /** convert Map to BillMessageGroupMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillMessageGroupMapObjectKeyData the converted object
   */
  public static BillMessageGroupMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillMessageGroupMapObjectKeyData out = new BillMessageGroupMapObjectKeyData ();

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
  
    if ((obj = record.get ("MsgSequenceNum")) != null)
    {
      out.MsgSequenceNum = (Integer) obj;
      out._MsgSequenceNumSet = true;
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
  
    if ((obj = record.get ("ServiceCenterId")) != null)
    {
      out.ServiceCenterId = (Integer) obj;
      out._ServiceCenterIdSet = true;
    }
  
    if ((obj = record.get ("MsgForeignKey")) != null)
    {
      out.MsgForeignKey = (Integer) obj;
      out._MsgForeignKeySet = true;
    }
  
    return out;
  }
  /** convert Map to BillMessageGroupMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillMessageGroupMapObjectKeyFilter the converted object
   */
  public static BillMessageGroupMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillMessageGroupMapObjectKeyFilter out = new BillMessageGroupMapObjectKeyFilter ();

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
  
    Map ServiceCenterIdMap = (Map)record.get("ServiceCenterId");
    Boolean ServiceCenterIdFetch = DataHelper.getFetch(ServiceCenterIdMap);
    Boolean ServiceCenterIdSortDir = DataHelper.getSortDirection(ServiceCenterIdMap);
    Integer ServiceCenterIdSortOrder = DataHelper.getSortOrder(ServiceCenterIdMap);
    if (ServiceCenterIdFetch != null) out.setServiceCenterIdFetch(ServiceCenterIdFetch);
    if (ServiceCenterIdSortDir != null) out.setServiceCenterIdSortDirection(ServiceCenterIdSortDir);
    if (ServiceCenterIdSortOrder != null) out.setServiceCenterIdSortOrder(ServiceCenterIdSortOrder);

    Filter[] ServiceCenterIdFilter = DataHelper.mapToFilterArray(ServiceCenterIdMap, Integer.class);
    if (ServiceCenterIdFilter != null) {
      IntegerFilter[] ServiceCenterIdFilters = new IntegerFilter[ServiceCenterIdFilter.length];
      for (int i = 0; i < ServiceCenterIdFilters.length; i++) {
        ServiceCenterIdFilters[i] = (IntegerFilter)ServiceCenterIdFilter[i];
      }
      try {
        out.setServiceCenterIdFilter(ServiceCenterIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgForeignKeyMap = (Map)record.get("MsgForeignKey");
    Boolean MsgForeignKeyFetch = DataHelper.getFetch(MsgForeignKeyMap);
    Boolean MsgForeignKeySortDir = DataHelper.getSortDirection(MsgForeignKeyMap);
    Integer MsgForeignKeySortOrder = DataHelper.getSortOrder(MsgForeignKeyMap);
    if (MsgForeignKeyFetch != null) out.setMsgForeignKeyFetch(MsgForeignKeyFetch);
    if (MsgForeignKeySortDir != null) out.setMsgForeignKeySortDirection(MsgForeignKeySortDir);
    if (MsgForeignKeySortOrder != null) out.setMsgForeignKeySortOrder(MsgForeignKeySortOrder);

    Filter[] MsgForeignKeyFilter = DataHelper.mapToFilterArray(MsgForeignKeyMap, Integer.class);
    if (MsgForeignKeyFilter != null) {
      IntegerFilter[] MsgForeignKeyFilters = new IntegerFilter[MsgForeignKeyFilter.length];
      for (int i = 0; i < MsgForeignKeyFilters.length; i++) {
        MsgForeignKeyFilters[i] = (IntegerFilter)MsgForeignKeyFilter[i];
      }
      try {
        out.setMsgForeignKeyFilter(MsgForeignKeyFilters);
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
