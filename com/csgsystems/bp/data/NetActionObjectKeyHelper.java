/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectKeyHelper.java
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

/** Helper class for NetActionObject's Key objects. */
public class NetActionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert NetActionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NetActionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NetActionObject")
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NetActionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert NetActionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NetActionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NetActionObject")
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NetActionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NetActionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return NetActionObjectKeyData the converted object
   */
  public static NetActionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NetActionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NetActionObject")
   * @return NetActionObjectKeyData the converted object
   */
  public static NetActionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NetActionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NetActionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return NetActionObjectKeyFilter the converted object
   */
  public static NetActionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NetActionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NetActionObject")
   * @return NetActionObjectKeyFilter the converted object
   */
  public static NetActionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NetActionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert NetActionObjectKeyData to a Map (not including the root).
  /** convert NetActionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NetActionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._MktCodeSet) record.put ("MktCode", in.MktCode);
  
    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
  
    if (in._NetActionNameSet) record.put ("NetActionName", in.NetActionName);
  
    return record;
  }
  /** convert NetActionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NetActionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.MktCode, in.MktCodeSort, in.MktCodeSortAscending, in.MktCodeFetch);
      if (map != null) record.put ("MktCode", map);
      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
      map = DataHelper.filterToMap (in.NetActionName, in.NetActionNameSort, in.NetActionNameSortAscending, in.NetActionNameFetch, in.NetActionNameCaseInsensitive);
      if (map != null) record.put ("NetActionName", map);
    return record;
  }
  /** convert Map to NetActionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NetActionObjectKeyData the converted object
   */
  public static NetActionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NetActionObjectKeyData out = new NetActionObjectKeyData ();

    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
      out._RateClassSet = true;
    }
  
    if ((obj = record.get ("MktCode")) != null)
    {
      out.MktCode = (Integer) obj;
      out._MktCodeSet = true;
    }
  
    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
      out._EmfConfigIdSet = true;
    }
  
    if ((obj = record.get ("NetActionName")) != null)
    {
      out.NetActionName = (String) obj;
      out._NetActionNameSet = true;
    }
  
    return out;
  }
  /** convert Map to NetActionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NetActionObjectKeyFilter the converted object
   */
  public static NetActionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NetActionObjectKeyFilter out = new NetActionObjectKeyFilter ();

    Map RateClassMap = (Map)record.get("RateClass");
    Boolean RateClassFetch = DataHelper.getFetch(RateClassMap);
    Boolean RateClassSortDir = DataHelper.getSortDirection(RateClassMap);
    Integer RateClassSortOrder = DataHelper.getSortOrder(RateClassMap);
    if (RateClassFetch != null) out.setRateClassFetch(RateClassFetch);
    if (RateClassSortDir != null) out.setRateClassSortDirection(RateClassSortDir);
    if (RateClassSortOrder != null) out.setRateClassSortOrder(RateClassSortOrder);

    Filter[] RateClassFilter = DataHelper.mapToFilterArray(RateClassMap, Integer.class);
    if (RateClassFilter != null) {
      IntegerFilter[] RateClassFilters = new IntegerFilter[RateClassFilter.length];
      for (int i = 0; i < RateClassFilters.length; i++) {
        RateClassFilters[i] = (IntegerFilter)RateClassFilter[i];
      }
      try {
        out.setRateClassFilter(RateClassFilters);
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
  
    Map EmfConfigIdMap = (Map)record.get("EmfConfigId");
    Boolean EmfConfigIdFetch = DataHelper.getFetch(EmfConfigIdMap);
    Boolean EmfConfigIdSortDir = DataHelper.getSortDirection(EmfConfigIdMap);
    Integer EmfConfigIdSortOrder = DataHelper.getSortOrder(EmfConfigIdMap);
    if (EmfConfigIdFetch != null) out.setEmfConfigIdFetch(EmfConfigIdFetch);
    if (EmfConfigIdSortDir != null) out.setEmfConfigIdSortDirection(EmfConfigIdSortDir);
    if (EmfConfigIdSortOrder != null) out.setEmfConfigIdSortOrder(EmfConfigIdSortOrder);

    Filter[] EmfConfigIdFilter = DataHelper.mapToFilterArray(EmfConfigIdMap, Integer.class);
    if (EmfConfigIdFilter != null) {
      IntegerFilter[] EmfConfigIdFilters = new IntegerFilter[EmfConfigIdFilter.length];
      for (int i = 0; i < EmfConfigIdFilters.length; i++) {
        EmfConfigIdFilters[i] = (IntegerFilter)EmfConfigIdFilter[i];
      }
      try {
        out.setEmfConfigIdFilter(EmfConfigIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NetActionNameMap = (Map)record.get("NetActionName");
    Boolean NetActionNameFetch = DataHelper.getFetch(NetActionNameMap);
    Boolean NetActionNameSortDir = DataHelper.getSortDirection(NetActionNameMap);
    Integer NetActionNameSortOrder = DataHelper.getSortOrder(NetActionNameMap);
    if (NetActionNameFetch != null) out.setNetActionNameFetch(NetActionNameFetch);
    if (NetActionNameSortDir != null) out.setNetActionNameSortDirection(NetActionNameSortDir);
    if (NetActionNameSortOrder != null) out.setNetActionNameSortOrder(NetActionNameSortOrder);

    Filter[] NetActionNameFilter = DataHelper.mapToFilterArray(NetActionNameMap, String.class);
    if (NetActionNameFilter != null) {
      StringFilter[] NetActionNameFilters = new StringFilter[NetActionNameFilter.length];
      for (int i = 0; i < NetActionNameFilters.length; i++) {
        NetActionNameFilters[i] = (StringFilter)NetActionNameFilter[i];
      }
      try {
        out.setNetActionNameFilter(NetActionNameFilters);
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
