/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImageObjectKeyHelper.java
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

/** Helper class for BillImageObject's Key objects. */
public class BillImageObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillImageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImageObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillImageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImageObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillImageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillImageObjectKeyData the converted object
   */
  public static BillImageObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillImageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillImageObject")
   * @return BillImageObjectKeyData the converted object
   */
  public static BillImageObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillImageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillImageObjectKeyFilter the converted object
   */
  public static BillImageObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillImageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillImageObject")
   * @return BillImageObjectKeyFilter the converted object
   */
  public static BillImageObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillImageObjectKeyData to a Map (not including the root).
  /** convert BillImageObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillImageObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._ImageTypeSet) record.put ("ImageType", in.ImageType);
  
    if (in._PageNoSet) record.put ("PageNo", in.PageNo);
  
    return record;
  }
  /** convert BillImageObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillImageObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.ImageType, in.ImageTypeSort, in.ImageTypeSortAscending, in.ImageTypeFetch);
      if (map != null) record.put ("ImageType", map);
      map = DataHelper.filterToMap (in.PageNo, in.PageNoSort, in.PageNoSortAscending, in.PageNoFetch);
      if (map != null) record.put ("PageNo", map);
    return record;
  }
  /** convert Map to BillImageObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImageObjectKeyData the converted object
   */
  public static BillImageObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImageObjectKeyData out = new BillImageObjectKeyData ();

    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
      out._BillRefNoSet = true;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
      out._BillRefResetsSet = true;
    }
  
    if ((obj = record.get ("ImageType")) != null)
    {
      out.ImageType = (Integer) obj;
      out._ImageTypeSet = true;
    }
  
    if ((obj = record.get ("PageNo")) != null)
    {
      out.PageNo = (Integer) obj;
      out._PageNoSet = true;
    }
  
    return out;
  }
  /** convert Map to BillImageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImageObjectKeyFilter the converted object
   */
  public static BillImageObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImageObjectKeyFilter out = new BillImageObjectKeyFilter ();

    Map BillRefNoMap = (Map)record.get("BillRefNo");
    Boolean BillRefNoFetch = DataHelper.getFetch(BillRefNoMap);
    Boolean BillRefNoSortDir = DataHelper.getSortDirection(BillRefNoMap);
    Integer BillRefNoSortOrder = DataHelper.getSortOrder(BillRefNoMap);
    if (BillRefNoFetch != null) out.setBillRefNoFetch(BillRefNoFetch);
    if (BillRefNoSortDir != null) out.setBillRefNoSortDirection(BillRefNoSortDir);
    if (BillRefNoSortOrder != null) out.setBillRefNoSortOrder(BillRefNoSortOrder);

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, Integer.class);
    if (BillRefNoFilter != null) {
      IntegerFilter[] BillRefNoFilters = new IntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (IntegerFilter)BillRefNoFilter[i];
      }
      try {
        out.setBillRefNoFilter(BillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResetsMap = (Map)record.get("BillRefResets");
    Boolean BillRefResetsFetch = DataHelper.getFetch(BillRefResetsMap);
    Boolean BillRefResetsSortDir = DataHelper.getSortDirection(BillRefResetsMap);
    Integer BillRefResetsSortOrder = DataHelper.getSortOrder(BillRefResetsMap);
    if (BillRefResetsFetch != null) out.setBillRefResetsFetch(BillRefResetsFetch);
    if (BillRefResetsSortDir != null) out.setBillRefResetsSortDirection(BillRefResetsSortDir);
    if (BillRefResetsSortOrder != null) out.setBillRefResetsSortOrder(BillRefResetsSortOrder);

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, Integer.class);
    if (BillRefResetsFilter != null) {
      IntegerFilter[] BillRefResetsFilters = new IntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (IntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImageTypeMap = (Map)record.get("ImageType");
    Boolean ImageTypeFetch = DataHelper.getFetch(ImageTypeMap);
    Boolean ImageTypeSortDir = DataHelper.getSortDirection(ImageTypeMap);
    Integer ImageTypeSortOrder = DataHelper.getSortOrder(ImageTypeMap);
    if (ImageTypeFetch != null) out.setImageTypeFetch(ImageTypeFetch);
    if (ImageTypeSortDir != null) out.setImageTypeSortDirection(ImageTypeSortDir);
    if (ImageTypeSortOrder != null) out.setImageTypeSortOrder(ImageTypeSortOrder);

    Filter[] ImageTypeFilter = DataHelper.mapToFilterArray(ImageTypeMap, Integer.class);
    if (ImageTypeFilter != null) {
      IntegerFilter[] ImageTypeFilters = new IntegerFilter[ImageTypeFilter.length];
      for (int i = 0; i < ImageTypeFilters.length; i++) {
        ImageTypeFilters[i] = (IntegerFilter)ImageTypeFilter[i];
      }
      try {
        out.setImageTypeFilter(ImageTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PageNoMap = (Map)record.get("PageNo");
    Boolean PageNoFetch = DataHelper.getFetch(PageNoMap);
    Boolean PageNoSortDir = DataHelper.getSortDirection(PageNoMap);
    Integer PageNoSortOrder = DataHelper.getSortOrder(PageNoMap);
    if (PageNoFetch != null) out.setPageNoFetch(PageNoFetch);
    if (PageNoSortDir != null) out.setPageNoSortDirection(PageNoSortDir);
    if (PageNoSortOrder != null) out.setPageNoSortOrder(PageNoSortOrder);

    Filter[] PageNoFilter = DataHelper.mapToFilterArray(PageNoMap, Integer.class);
    if (PageNoFilter != null) {
      IntegerFilter[] PageNoFilters = new IntegerFilter[PageNoFilter.length];
      for (int i = 0; i < PageNoFilters.length; i++) {
        PageNoFilters[i] = (IntegerFilter)PageNoFilter[i];
      }
      try {
        out.setPageNoFilter(PageNoFilters);
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
