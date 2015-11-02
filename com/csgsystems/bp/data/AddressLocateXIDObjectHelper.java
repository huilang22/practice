/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AddressLocateXIDObjectHelper.java
 * Definition File: Catalog/AccountLocate.xml
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
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert AddressLocateXIDObject JavaBean objects to/from HashMaps.
 */
public class AddressLocateXIDObjectHelper implements ArubaObjectHelper
{
  /** convert AddressLocateXIDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AddressLocateXIDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AddressLocateXIDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AddressLocateXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AddressLocateXIDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AddressLocateXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountLocateObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert AddressLocateXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AddressLocateXIDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AddressLocateXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AddressLocateXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AddressLocateXIDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AddressLocateXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountLocateObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AddressLocateXIDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AddressLocateXIDObjectData the converted object
   */
  public static AddressLocateXIDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AddressLocateXIDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AddressLocateXIDObject")
   * @return AddressLocateXIDObjectData the converted object
   */
  public static AddressLocateXIDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AddressLocateXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AddressLocateXIDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AddressLocateXIDObjectFilter the converted object
   */
  public static AddressLocateXIDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AddressLocateXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AddressLocateXIDObject")
   * @return AddressLocateXIDObjectFilter the converted object
   */
  public static AddressLocateXIDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AddressLocateXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AddressLocateXIDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AddressLocateXIDObjectDataList the converted object
   */
  public static AddressLocateXIDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AddressLocateXIDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AddressLocateXIDObjectList")
   * @return AddressLocateXIDObjectDataList the converted object
   */
  public static AddressLocateXIDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AddressLocateXIDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AddressLocateXIDObjectData[] array = null;
    if (root != null)
    {
      array = new AddressLocateXIDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AddressLocateXIDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AddressLocateXIDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AddressLocateXIDObjectDataList (array, index, total);
  }
  /** convert AddressLocateXIDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AddressLocateXIDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AddressIdSet) record.put ("AddressId", in.AddressId);
  
    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
  
    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._AddressAssocActiveDtSet) record.put ("AddressAssocActiveDt", in.AddressAssocActiveDt);
  
    if (in._AddressAssocInactiveDtSet) record.put ("AddressAssocInactiveDt", in.AddressAssocInactiveDt);
      return record;
  }
  /** convert AddressLocateXIDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AddressLocateXIDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AddressId, in.AddressIdSort, in.AddressIdSortAscending, in.AddressIdFetch);
      if (map != null) record.put ("AddressId", map);
      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.AddressAssocActiveDt, in.AddressAssocActiveDtSort, in.AddressAssocActiveDtSortAscending, in.AddressAssocActiveDtFetch);
      if (map != null) record.put ("AddressAssocActiveDt", map);
      map = DataHelper.filterToMap (in.AddressAssocInactiveDt, in.AddressAssocInactiveDtSort, in.AddressAssocInactiveDtSortAscending, in.AddressAssocInactiveDtFetch);
      if (map != null) record.put ("AddressAssocInactiveDt", map);
    return record;
  }
  /** convert Map to AddressLocateXIDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AddressLocateXIDObjectData the converted object
   */
  public static AddressLocateXIDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AddressLocateXIDObjectData out = new AddressLocateXIDObjectData (AccountLocateObjectHelper.getObj (record));

    if ((obj = record.get ("AddressId")) != null)
    {
      out.AddressId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
    }
  
    if ((obj = record.get ("ExternalId")) != null)
    {
      out.ExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("AddressAssocActiveDt")) != null)
    {
      out.AddressAssocActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("AddressAssocInactiveDt")) != null)
    {
      out.AddressAssocInactiveDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to AddressLocateXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AddressLocateXIDObjectFilter the converted object
   */
  public static AddressLocateXIDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AddressLocateXIDObjectFilter out = new AddressLocateXIDObjectFilter (AccountLocateObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map AddressIdMap = (Map)record.get("AddressId");
    Boolean AddressIdFetch = DataHelper.getFetch(AddressIdMap);
    Boolean AddressIdSortDir = DataHelper.getSortDirection(AddressIdMap);
    Integer AddressIdSortOrder = DataHelper.getSortOrder(AddressIdMap);
    if (AddressIdFetch != null) out.setAddressIdFetch(AddressIdFetch);
    if (AddressIdSortDir != null) out.setAddressIdSortDirection(AddressIdSortDir);
    if (AddressIdSortOrder != null) out.setAddressIdSortOrder(AddressIdSortOrder);

    Filter[] AddressIdFilter = DataHelper.mapToFilterArray(AddressIdMap, BigInteger.class);
    if (AddressIdFilter != null) {
      BigIntegerFilter[] AddressIdFilters = new BigIntegerFilter[AddressIdFilter.length];
      for (int i = 0; i < AddressIdFilters.length; i++) {
        AddressIdFilters[i] = (BigIntegerFilter)AddressIdFilter[i];
      }
      try {
        out.setAddressIdFilter(AddressIdFilters);
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
  
    Map ExternalIdMap = (Map)record.get("ExternalId");
    Boolean ExternalIdFetch = DataHelper.getFetch(ExternalIdMap);
    Boolean ExternalIdSortDir = DataHelper.getSortDirection(ExternalIdMap);
    Integer ExternalIdSortOrder = DataHelper.getSortOrder(ExternalIdMap);
    if (ExternalIdFetch != null) out.setExternalIdFetch(ExternalIdFetch);
    if (ExternalIdSortDir != null) out.setExternalIdSortDirection(ExternalIdSortDir);
    if (ExternalIdSortOrder != null) out.setExternalIdSortOrder(ExternalIdSortOrder);

    Filter[] ExternalIdFilter = DataHelper.mapToFilterArray(ExternalIdMap, String.class);
    if (ExternalIdFilter != null) {
      StringFilter[] ExternalIdFilters = new StringFilter[ExternalIdFilter.length];
      for (int i = 0; i < ExternalIdFilters.length; i++) {
        ExternalIdFilters[i] = (StringFilter)ExternalIdFilter[i];
      }
      try {
        out.setExternalIdFilter(ExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalIdTypeMap = (Map)record.get("ExternalIdType");
    Boolean ExternalIdTypeFetch = DataHelper.getFetch(ExternalIdTypeMap);
    Boolean ExternalIdTypeSortDir = DataHelper.getSortDirection(ExternalIdTypeMap);
    Integer ExternalIdTypeSortOrder = DataHelper.getSortOrder(ExternalIdTypeMap);
    if (ExternalIdTypeFetch != null) out.setExternalIdTypeFetch(ExternalIdTypeFetch);
    if (ExternalIdTypeSortDir != null) out.setExternalIdTypeSortDirection(ExternalIdTypeSortDir);
    if (ExternalIdTypeSortOrder != null) out.setExternalIdTypeSortOrder(ExternalIdTypeSortOrder);

    Filter[] ExternalIdTypeFilter = DataHelper.mapToFilterArray(ExternalIdTypeMap, Integer.class);
    if (ExternalIdTypeFilter != null) {
      IntegerFilter[] ExternalIdTypeFilters = new IntegerFilter[ExternalIdTypeFilter.length];
      for (int i = 0; i < ExternalIdTypeFilters.length; i++) {
        ExternalIdTypeFilters[i] = (IntegerFilter)ExternalIdTypeFilter[i];
      }
      try {
        out.setExternalIdTypeFilter(ExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressAssocActiveDtMap = (Map)record.get("AddressAssocActiveDt");
    Boolean AddressAssocActiveDtFetch = DataHelper.getFetch(AddressAssocActiveDtMap);
    Boolean AddressAssocActiveDtSortDir = DataHelper.getSortDirection(AddressAssocActiveDtMap);
    Integer AddressAssocActiveDtSortOrder = DataHelper.getSortOrder(AddressAssocActiveDtMap);
    if (AddressAssocActiveDtFetch != null) out.setAddressAssocActiveDtFetch(AddressAssocActiveDtFetch);
    if (AddressAssocActiveDtSortDir != null) out.setAddressAssocActiveDtSortDirection(AddressAssocActiveDtSortDir);
    if (AddressAssocActiveDtSortOrder != null) out.setAddressAssocActiveDtSortOrder(AddressAssocActiveDtSortOrder);

    Filter[] AddressAssocActiveDtFilter = DataHelper.mapToFilterArray(AddressAssocActiveDtMap, Date.class);
    if (AddressAssocActiveDtFilter != null) {
      DateFilter[] AddressAssocActiveDtFilters = new DateFilter[AddressAssocActiveDtFilter.length];
      for (int i = 0; i < AddressAssocActiveDtFilters.length; i++) {
        AddressAssocActiveDtFilters[i] = (DateFilter)AddressAssocActiveDtFilter[i];
      }
      try {
        out.setAddressAssocActiveDtFilter(AddressAssocActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressAssocInactiveDtMap = (Map)record.get("AddressAssocInactiveDt");
    Boolean AddressAssocInactiveDtFetch = DataHelper.getFetch(AddressAssocInactiveDtMap);
    Boolean AddressAssocInactiveDtSortDir = DataHelper.getSortDirection(AddressAssocInactiveDtMap);
    Integer AddressAssocInactiveDtSortOrder = DataHelper.getSortOrder(AddressAssocInactiveDtMap);
    if (AddressAssocInactiveDtFetch != null) out.setAddressAssocInactiveDtFetch(AddressAssocInactiveDtFetch);
    if (AddressAssocInactiveDtSortDir != null) out.setAddressAssocInactiveDtSortDirection(AddressAssocInactiveDtSortDir);
    if (AddressAssocInactiveDtSortOrder != null) out.setAddressAssocInactiveDtSortOrder(AddressAssocInactiveDtSortOrder);

    Filter[] AddressAssocInactiveDtFilter = DataHelper.mapToFilterArray(AddressAssocInactiveDtMap, Date.class);
    if (AddressAssocInactiveDtFilter != null) {
      DateFilter[] AddressAssocInactiveDtFilters = new DateFilter[AddressAssocInactiveDtFilter.length];
      for (int i = 0; i < AddressAssocInactiveDtFilters.length; i++) {
        AddressAssocInactiveDtFilters[i] = (DateFilter)AddressAssocInactiveDtFilter[i];
      }
      try {
        out.setAddressAssocInactiveDtFilter(AddressAssocInactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
