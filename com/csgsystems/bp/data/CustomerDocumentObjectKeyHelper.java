/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectKeyHelper.java
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

/** Helper class for CustomerDocumentObject's Key objects. */
public class CustomerDocumentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CustomerDocumentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDocumentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDocumentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDocumentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDocumentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDocumentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDocumentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CustomerDocumentObjectKeyData the converted object
   */
  public static CustomerDocumentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDocumentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDocumentObject")
   * @return CustomerDocumentObjectKeyData the converted object
   */
  public static CustomerDocumentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDocumentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CustomerDocumentObjectKeyFilter the converted object
   */
  public static CustomerDocumentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDocumentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDocumentObject")
   * @return CustomerDocumentObjectKeyFilter the converted object
   */
  public static CustomerDocumentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CustomerDocumentObjectKeyData to a Map (not including the root).
  /** convert CustomerDocumentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CustomerDocumentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DocumentIdSet) record.put ("DocumentId", in.DocumentId);
  
    return record;
  }
  /** convert CustomerDocumentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CustomerDocumentObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DocumentId, in.DocumentIdSort, in.DocumentIdSortAscending, in.DocumentIdFetch);
      if (map != null) record.put ("DocumentId", map);
    return record;
  }
  /** convert Map to CustomerDocumentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDocumentObjectKeyData the converted object
   */
  public static CustomerDocumentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDocumentObjectKeyData out = new CustomerDocumentObjectKeyData ();

    if ((obj = record.get ("DocumentId")) != null)
    {
      out.DocumentId = (Integer) obj;
      out._DocumentIdSet = true;
    }
  
    return out;
  }
  /** convert Map to CustomerDocumentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDocumentObjectKeyFilter the converted object
   */
  public static CustomerDocumentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDocumentObjectKeyFilter out = new CustomerDocumentObjectKeyFilter ();

    Map DocumentIdMap = (Map)record.get("DocumentId");
    Boolean DocumentIdFetch = DataHelper.getFetch(DocumentIdMap);
    Boolean DocumentIdSortDir = DataHelper.getSortDirection(DocumentIdMap);
    Integer DocumentIdSortOrder = DataHelper.getSortOrder(DocumentIdMap);
    if (DocumentIdFetch != null) out.setDocumentIdFetch(DocumentIdFetch);
    if (DocumentIdSortDir != null) out.setDocumentIdSortDirection(DocumentIdSortDir);
    if (DocumentIdSortOrder != null) out.setDocumentIdSortOrder(DocumentIdSortOrder);

    Filter[] DocumentIdFilter = DataHelper.mapToFilterArray(DocumentIdMap, Integer.class);
    if (DocumentIdFilter != null) {
      IntegerFilter[] DocumentIdFilters = new IntegerFilter[DocumentIdFilter.length];
      for (int i = 0; i < DocumentIdFilters.length; i++) {
        DocumentIdFilters[i] = (IntegerFilter)DocumentIdFilter[i];
      }
      try {
        out.setDocumentIdFilter(DocumentIdFilters);
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
