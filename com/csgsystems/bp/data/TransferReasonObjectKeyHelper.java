/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TransferReasonObjectKeyHelper.java
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

/** Helper class for TransferReasonObject's Key objects. */
public class TransferReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TransferReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TransferReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransferReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransferReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransferReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransferReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TransferReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TransferReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransferReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransferReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransferReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransferReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TransferReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TransferReasonObjectKeyData the converted object
   */
  public static TransferReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TransferReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TransferReasonObject")
   * @return TransferReasonObjectKeyData the converted object
   */
  public static TransferReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TransferReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TransferReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TransferReasonObjectKeyFilter the converted object
   */
  public static TransferReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TransferReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TransferReasonObject")
   * @return TransferReasonObjectKeyFilter the converted object
   */
  public static TransferReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TransferReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TransferReasonObjectKeyData to a Map (not including the root).
  /** convert TransferReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TransferReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._XferReasonSet) record.put ("XferReason", in.XferReason);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert TransferReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TransferReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.XferReason, in.XferReasonSort, in.XferReasonSortAscending, in.XferReasonFetch);
      if (map != null) record.put ("XferReason", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to TransferReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransferReasonObjectKeyData the converted object
   */
  public static TransferReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransferReasonObjectKeyData out = new TransferReasonObjectKeyData ();

    if ((obj = record.get ("XferReason")) != null)
    {
      out.XferReason = (Integer) obj;
      out._XferReasonSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to TransferReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransferReasonObjectKeyFilter the converted object
   */
  public static TransferReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransferReasonObjectKeyFilter out = new TransferReasonObjectKeyFilter ();

    Map XferReasonMap = (Map)record.get("XferReason");
    Boolean XferReasonFetch = DataHelper.getFetch(XferReasonMap);
    Boolean XferReasonSortDir = DataHelper.getSortDirection(XferReasonMap);
    Integer XferReasonSortOrder = DataHelper.getSortOrder(XferReasonMap);
    if (XferReasonFetch != null) out.setXferReasonFetch(XferReasonFetch);
    if (XferReasonSortDir != null) out.setXferReasonSortDirection(XferReasonSortDir);
    if (XferReasonSortOrder != null) out.setXferReasonSortOrder(XferReasonSortOrder);

    Filter[] XferReasonFilter = DataHelper.mapToFilterArray(XferReasonMap, Integer.class);
    if (XferReasonFilter != null) {
      IntegerFilter[] XferReasonFilters = new IntegerFilter[XferReasonFilter.length];
      for (int i = 0; i < XferReasonFilters.length; i++) {
        XferReasonFilters[i] = (IntegerFilter)XferReasonFilter[i];
      }
      try {
        out.setXferReasonFilter(XferReasonFilters);
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
