/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RtPaymentResponseObjectKeyHelper.java
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

/** Helper class for RtPaymentResponseObject's Key objects. */
public class RtPaymentResponseObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RtPaymentResponseObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RtPaymentResponseObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RtPaymentResponseObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RtPaymentResponseObject")
   * @return Map     the output Map
   */
  public static Map toMap (RtPaymentResponseObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RtPaymentResponseObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RtPaymentResponseObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RtPaymentResponseObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RtPaymentResponseObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RtPaymentResponseObject")
   * @return Map     the output Map
   */
  public static Map toMap (RtPaymentResponseObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RtPaymentResponseObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RtPaymentResponseObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RtPaymentResponseObjectKeyData the converted object
   */
  public static RtPaymentResponseObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RtPaymentResponseObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RtPaymentResponseObject")
   * @return RtPaymentResponseObjectKeyData the converted object
   */
  public static RtPaymentResponseObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RtPaymentResponseObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RtPaymentResponseObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RtPaymentResponseObjectKeyFilter the converted object
   */
  public static RtPaymentResponseObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RtPaymentResponseObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RtPaymentResponseObject")
   * @return RtPaymentResponseObjectKeyFilter the converted object
   */
  public static RtPaymentResponseObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RtPaymentResponseObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RtPaymentResponseObjectKeyData to a Map (not including the root).
  /** convert RtPaymentResponseObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RtPaymentResponseObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._EpgTypeSet) record.put ("EpgType", in.EpgType);
  
    if (in._ReplyFlagSet) record.put ("ReplyFlag", in.ReplyFlag);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert RtPaymentResponseObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RtPaymentResponseObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.EpgType, in.EpgTypeSort, in.EpgTypeSortAscending, in.EpgTypeFetch, in.EpgTypeCaseInsensitive);
      if (map != null) record.put ("EpgType", map);
      map = DataHelper.filterToMap (in.ReplyFlag, in.ReplyFlagSort, in.ReplyFlagSortAscending, in.ReplyFlagFetch, in.ReplyFlagCaseInsensitive);
      if (map != null) record.put ("ReplyFlag", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to RtPaymentResponseObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RtPaymentResponseObjectKeyData the converted object
   */
  public static RtPaymentResponseObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RtPaymentResponseObjectKeyData out = new RtPaymentResponseObjectKeyData ();

    if ((obj = record.get ("EpgType")) != null)
    {
      out.EpgType = (String) obj;
      out._EpgTypeSet = true;
    }
  
    if ((obj = record.get ("ReplyFlag")) != null)
    {
      out.ReplyFlag = (String) obj;
      out._ReplyFlagSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to RtPaymentResponseObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RtPaymentResponseObjectKeyFilter the converted object
   */
  public static RtPaymentResponseObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RtPaymentResponseObjectKeyFilter out = new RtPaymentResponseObjectKeyFilter ();

    Map EpgTypeMap = (Map)record.get("EpgType");
    Boolean EpgTypeFetch = DataHelper.getFetch(EpgTypeMap);
    Boolean EpgTypeSortDir = DataHelper.getSortDirection(EpgTypeMap);
    Integer EpgTypeSortOrder = DataHelper.getSortOrder(EpgTypeMap);
    if (EpgTypeFetch != null) out.setEpgTypeFetch(EpgTypeFetch);
    if (EpgTypeSortDir != null) out.setEpgTypeSortDirection(EpgTypeSortDir);
    if (EpgTypeSortOrder != null) out.setEpgTypeSortOrder(EpgTypeSortOrder);

    Filter[] EpgTypeFilter = DataHelper.mapToFilterArray(EpgTypeMap, String.class);
    if (EpgTypeFilter != null) {
      StringFilter[] EpgTypeFilters = new StringFilter[EpgTypeFilter.length];
      for (int i = 0; i < EpgTypeFilters.length; i++) {
        EpgTypeFilters[i] = (StringFilter)EpgTypeFilter[i];
      }
      try {
        out.setEpgTypeFilter(EpgTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReplyFlagMap = (Map)record.get("ReplyFlag");
    Boolean ReplyFlagFetch = DataHelper.getFetch(ReplyFlagMap);
    Boolean ReplyFlagSortDir = DataHelper.getSortDirection(ReplyFlagMap);
    Integer ReplyFlagSortOrder = DataHelper.getSortOrder(ReplyFlagMap);
    if (ReplyFlagFetch != null) out.setReplyFlagFetch(ReplyFlagFetch);
    if (ReplyFlagSortDir != null) out.setReplyFlagSortDirection(ReplyFlagSortDir);
    if (ReplyFlagSortOrder != null) out.setReplyFlagSortOrder(ReplyFlagSortOrder);

    Filter[] ReplyFlagFilter = DataHelper.mapToFilterArray(ReplyFlagMap, String.class);
    if (ReplyFlagFilter != null) {
      StringFilter[] ReplyFlagFilters = new StringFilter[ReplyFlagFilter.length];
      for (int i = 0; i < ReplyFlagFilters.length; i++) {
        ReplyFlagFilters[i] = (StringFilter)ReplyFlagFilter[i];
      }
      try {
        out.setReplyFlagFilter(ReplyFlagFilters);
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
