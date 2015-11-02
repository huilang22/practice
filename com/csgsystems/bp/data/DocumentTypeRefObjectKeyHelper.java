/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectKeyHelper.java
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

/** Helper class for DocumentTypeRefObject's Key objects. */
public class DocumentTypeRefObjectKeyHelper implements ArubaObjectHelper
{
  /** convert DocumentTypeRefObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DocumentTypeRefObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DocumentTypeRefObject")
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert DocumentTypeRefObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DocumentTypeRefObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DocumentTypeRefObject")
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to DocumentTypeRefObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return DocumentTypeRefObjectKeyData the converted object
   */
  public static DocumentTypeRefObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to DocumentTypeRefObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "DocumentTypeRefObject")
   * @return DocumentTypeRefObjectKeyData the converted object
   */
  public static DocumentTypeRefObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to DocumentTypeRefObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return DocumentTypeRefObjectKeyFilter the converted object
   */
  public static DocumentTypeRefObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to DocumentTypeRefObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "DocumentTypeRefObject")
   * @return DocumentTypeRefObjectKeyFilter the converted object
   */
  public static DocumentTypeRefObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert DocumentTypeRefObjectKeyData to a Map (not including the root).
  /** convert DocumentTypeRefObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (DocumentTypeRefObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DocumentTypeIdSet) record.put ("DocumentTypeId", in.DocumentTypeId);
  
    return record;
  }
  /** convert DocumentTypeRefObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (DocumentTypeRefObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DocumentTypeId, in.DocumentTypeIdSort, in.DocumentTypeIdSortAscending, in.DocumentTypeIdFetch);
      if (map != null) record.put ("DocumentTypeId", map);
    return record;
  }
  /** convert Map to DocumentTypeRefObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DocumentTypeRefObjectKeyData the converted object
   */
  public static DocumentTypeRefObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DocumentTypeRefObjectKeyData out = new DocumentTypeRefObjectKeyData ();

    if ((obj = record.get ("DocumentTypeId")) != null)
    {
      out.DocumentTypeId = (Integer) obj;
      out._DocumentTypeIdSet = true;
    }
  
    return out;
  }
  /** convert Map to DocumentTypeRefObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DocumentTypeRefObjectKeyFilter the converted object
   */
  public static DocumentTypeRefObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DocumentTypeRefObjectKeyFilter out = new DocumentTypeRefObjectKeyFilter ();

    Map DocumentTypeIdMap = (Map)record.get("DocumentTypeId");
    Boolean DocumentTypeIdFetch = DataHelper.getFetch(DocumentTypeIdMap);
    Boolean DocumentTypeIdSortDir = DataHelper.getSortDirection(DocumentTypeIdMap);
    Integer DocumentTypeIdSortOrder = DataHelper.getSortOrder(DocumentTypeIdMap);
    if (DocumentTypeIdFetch != null) out.setDocumentTypeIdFetch(DocumentTypeIdFetch);
    if (DocumentTypeIdSortDir != null) out.setDocumentTypeIdSortDirection(DocumentTypeIdSortDir);
    if (DocumentTypeIdSortOrder != null) out.setDocumentTypeIdSortOrder(DocumentTypeIdSortOrder);

    Filter[] DocumentTypeIdFilter = DataHelper.mapToFilterArray(DocumentTypeIdMap, Integer.class);
    if (DocumentTypeIdFilter != null) {
      IntegerFilter[] DocumentTypeIdFilters = new IntegerFilter[DocumentTypeIdFilter.length];
      for (int i = 0; i < DocumentTypeIdFilters.length; i++) {
        DocumentTypeIdFilters[i] = (IntegerFilter)DocumentTypeIdFilter[i];
      }
      try {
        out.setDocumentTypeIdFilter(DocumentTypeIdFilters);
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
