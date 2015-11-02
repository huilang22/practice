/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectKeyHelper.java
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

/** Helper class for ContactObject's Key objects. */
public class ContactObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ContactObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContactObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContactObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContactObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ContactObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContactObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContactObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContactObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ContactObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ContactObjectKeyData the converted object
   */
  public static ContactObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ContactObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ContactObject")
   * @return ContactObjectKeyData the converted object
   */
  public static ContactObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContactObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ContactObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ContactObjectKeyFilter the converted object
   */
  public static ContactObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ContactObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ContactObject")
   * @return ContactObjectKeyFilter the converted object
   */
  public static ContactObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ContactObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ContactObjectKeyData to a Map (not including the root).
  /** convert ContactObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ContactObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ContactIdSet) record.put ("ContactId", in.ContactId);
  
    return record;
  }
  /** convert ContactObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ContactObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ContactId, in.ContactIdSort, in.ContactIdSortAscending, in.ContactIdFetch);
      if (map != null) record.put ("ContactId", map);
    return record;
  }
  /** convert Map to ContactObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContactObjectKeyData the converted object
   */
  public static ContactObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContactObjectKeyData out = new ContactObjectKeyData ();

    if ((obj = record.get ("ContactId")) != null)
    {
      out.ContactId = (Integer) obj;
      out._ContactIdSet = true;
    }
  
    return out;
  }
  /** convert Map to ContactObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContactObjectKeyFilter the converted object
   */
  public static ContactObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContactObjectKeyFilter out = new ContactObjectKeyFilter ();

    Map ContactIdMap = (Map)record.get("ContactId");
    Boolean ContactIdFetch = DataHelper.getFetch(ContactIdMap);
    Boolean ContactIdSortDir = DataHelper.getSortDirection(ContactIdMap);
    Integer ContactIdSortOrder = DataHelper.getSortOrder(ContactIdMap);
    if (ContactIdFetch != null) out.setContactIdFetch(ContactIdFetch);
    if (ContactIdSortDir != null) out.setContactIdSortDirection(ContactIdSortDir);
    if (ContactIdSortOrder != null) out.setContactIdSortOrder(ContactIdSortOrder);

    Filter[] ContactIdFilter = DataHelper.mapToFilterArray(ContactIdMap, Integer.class);
    if (ContactIdFilter != null) {
      IntegerFilter[] ContactIdFilters = new IntegerFilter[ContactIdFilter.length];
      for (int i = 0; i < ContactIdFilters.length; i++) {
        ContactIdFilters[i] = (IntegerFilter)ContactIdFilter[i];
      }
      try {
        out.setContactIdFilter(ContactIdFilters);
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
