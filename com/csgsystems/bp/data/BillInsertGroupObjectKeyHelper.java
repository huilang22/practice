/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupObjectKeyHelper.java
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

/** Helper class for BillInsertGroupObject's Key objects. */
public class BillInsertGroupObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillInsertGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillInsertGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillInsertGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillInsertGroupObjectKeyData the converted object
   */
  public static BillInsertGroupObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillInsertGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillInsertGroupObject")
   * @return BillInsertGroupObjectKeyData the converted object
   */
  public static BillInsertGroupObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillInsertGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillInsertGroupObjectKeyFilter the converted object
   */
  public static BillInsertGroupObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillInsertGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillInsertGroupObject")
   * @return BillInsertGroupObjectKeyFilter the converted object
   */
  public static BillInsertGroupObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillInsertGroupObjectKeyData to a Map (not including the root).
  /** convert BillInsertGroupObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillInsertGroupObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._InsertGrpIdSet) record.put ("InsertGrpId", in.InsertGrpId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert BillInsertGroupObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillInsertGroupObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.InsertGrpId, in.InsertGrpIdSort, in.InsertGrpIdSortAscending, in.InsertGrpIdFetch);
      if (map != null) record.put ("InsertGrpId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to BillInsertGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupObjectKeyData the converted object
   */
  public static BillInsertGroupObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupObjectKeyData out = new BillInsertGroupObjectKeyData ();

    if ((obj = record.get ("InsertGrpId")) != null)
    {
      out.InsertGrpId = (Integer) obj;
      out._InsertGrpIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BillInsertGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupObjectKeyFilter the converted object
   */
  public static BillInsertGroupObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupObjectKeyFilter out = new BillInsertGroupObjectKeyFilter ();

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
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
