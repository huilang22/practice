/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceExtendedDataLocateXIDObjectHelper.java
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



/** Helper class to convert ServiceExtendedDataLocateXIDObject JavaBean objects to/from HashMaps.
 */
public class ServiceExtendedDataLocateXIDObjectHelper implements ArubaObjectHelper
{
  /** convert ServiceExtendedDataLocateXIDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServiceExtendedDataLocateXIDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceExtendedDataLocateXIDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceExtendedDataLocateXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceExtendedDataLocateXIDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceExtendedDataLocateXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountLocateObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceExtendedDataLocateXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceExtendedDataLocateXIDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceExtendedDataLocateXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceExtendedDataLocateXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceExtendedDataLocateXIDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceExtendedDataLocateXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountLocateObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServiceExtendedDataLocateXIDObjectData the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceExtendedDataLocateXIDObject")
   * @return ServiceExtendedDataLocateXIDObjectData the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceExtendedDataLocateXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServiceExtendedDataLocateXIDObjectFilter the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceExtendedDataLocateXIDObject")
   * @return ServiceExtendedDataLocateXIDObjectFilter the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceExtendedDataLocateXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServiceExtendedDataLocateXIDObjectDataList the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServiceExtendedDataLocateXIDObjectList")
   * @return ServiceExtendedDataLocateXIDObjectDataList the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceExtendedDataLocateXIDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServiceExtendedDataLocateXIDObjectData[] array = null;
    if (root != null)
    {
      array = new ServiceExtendedDataLocateXIDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServiceExtendedDataLocateXIDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServiceExtendedDataLocateXIDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServiceExtendedDataLocateXIDObjectDataList (array, index, total);
  }
  /** convert ServiceExtendedDataLocateXIDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceExtendedDataLocateXIDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ParamIdSet) record.put ("ParamId", in.ParamId);
  
    if (in._ParamValueSet) record.put ("ParamValue", in.ParamValue);
  
    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._ServiceIdActiveDateSet) record.put ("ServiceIdActiveDate", in.ServiceIdActiveDate);
  
    if (in._ServiceIdInactiveDateSet) record.put ("ServiceIdInactiveDate", in.ServiceIdInactiveDate);
      return record;
  }
  /** convert ServiceExtendedDataLocateXIDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceExtendedDataLocateXIDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ParamId, in.ParamIdSort, in.ParamIdSortAscending, in.ParamIdFetch);
      if (map != null) record.put ("ParamId", map);
      map = DataHelper.filterToMap (in.ParamValue, in.ParamValueSort, in.ParamValueSortAscending, in.ParamValueFetch, in.ParamValueCaseInsensitive);
      if (map != null) record.put ("ParamValue", map);
      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceIdActiveDate, in.ServiceIdActiveDateSort, in.ServiceIdActiveDateSortAscending, in.ServiceIdActiveDateFetch);
      if (map != null) record.put ("ServiceIdActiveDate", map);
      map = DataHelper.filterToMap (in.ServiceIdInactiveDate, in.ServiceIdInactiveDateSort, in.ServiceIdInactiveDateSortAscending, in.ServiceIdInactiveDateFetch);
      if (map != null) record.put ("ServiceIdInactiveDate", map);
    return record;
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceExtendedDataLocateXIDObjectData the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceExtendedDataLocateXIDObjectData out = new ServiceExtendedDataLocateXIDObjectData (AccountLocateObjectHelper.getObj (record));

    if ((obj = record.get ("ParamId")) != null)
    {
      out.ParamId = (Integer) obj;
    }
  
    if ((obj = record.get ("ParamValue")) != null)
    {
      out.ParamValue = (String) obj;
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
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceIdActiveDate")) != null)
    {
      out.ServiceIdActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("ServiceIdInactiveDate")) != null)
    {
      out.ServiceIdInactiveDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to ServiceExtendedDataLocateXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceExtendedDataLocateXIDObjectFilter the converted object
   */
  public static ServiceExtendedDataLocateXIDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceExtendedDataLocateXIDObjectFilter out = new ServiceExtendedDataLocateXIDObjectFilter (AccountLocateObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map ParamIdMap = (Map)record.get("ParamId");
    Boolean ParamIdFetch = DataHelper.getFetch(ParamIdMap);
    Boolean ParamIdSortDir = DataHelper.getSortDirection(ParamIdMap);
    Integer ParamIdSortOrder = DataHelper.getSortOrder(ParamIdMap);
    if (ParamIdFetch != null) out.setParamIdFetch(ParamIdFetch);
    if (ParamIdSortDir != null) out.setParamIdSortDirection(ParamIdSortDir);
    if (ParamIdSortOrder != null) out.setParamIdSortOrder(ParamIdSortOrder);

    Filter[] ParamIdFilter = DataHelper.mapToFilterArray(ParamIdMap, Integer.class);
    if (ParamIdFilter != null) {
      IntegerFilter[] ParamIdFilters = new IntegerFilter[ParamIdFilter.length];
      for (int i = 0; i < ParamIdFilters.length; i++) {
        ParamIdFilters[i] = (IntegerFilter)ParamIdFilter[i];
      }
      try {
        out.setParamIdFilter(ParamIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamValueMap = (Map)record.get("ParamValue");
    Boolean ParamValueFetch = DataHelper.getFetch(ParamValueMap);
    Boolean ParamValueSortDir = DataHelper.getSortDirection(ParamValueMap);
    Integer ParamValueSortOrder = DataHelper.getSortOrder(ParamValueMap);
    if (ParamValueFetch != null) out.setParamValueFetch(ParamValueFetch);
    if (ParamValueSortDir != null) out.setParamValueSortDirection(ParamValueSortDir);
    if (ParamValueSortOrder != null) out.setParamValueSortOrder(ParamValueSortOrder);

    Filter[] ParamValueFilter = DataHelper.mapToFilterArray(ParamValueMap, String.class);
    if (ParamValueFilter != null) {
      StringFilter[] ParamValueFilters = new StringFilter[ParamValueFilter.length];
      for (int i = 0; i < ParamValueFilters.length; i++) {
        ParamValueFilters[i] = (StringFilter)ParamValueFilter[i];
      }
      try {
        out.setParamValueFilter(ParamValueFilters);
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
  
    Map ServiceExternalIdMap = (Map)record.get("ServiceExternalId");
    Boolean ServiceExternalIdFetch = DataHelper.getFetch(ServiceExternalIdMap);
    Boolean ServiceExternalIdSortDir = DataHelper.getSortDirection(ServiceExternalIdMap);
    Integer ServiceExternalIdSortOrder = DataHelper.getSortOrder(ServiceExternalIdMap);
    if (ServiceExternalIdFetch != null) out.setServiceExternalIdFetch(ServiceExternalIdFetch);
    if (ServiceExternalIdSortDir != null) out.setServiceExternalIdSortDirection(ServiceExternalIdSortDir);
    if (ServiceExternalIdSortOrder != null) out.setServiceExternalIdSortOrder(ServiceExternalIdSortOrder);

    Filter[] ServiceExternalIdFilter = DataHelper.mapToFilterArray(ServiceExternalIdMap, String.class);
    if (ServiceExternalIdFilter != null) {
      StringFilter[] ServiceExternalIdFilters = new StringFilter[ServiceExternalIdFilter.length];
      for (int i = 0; i < ServiceExternalIdFilters.length; i++) {
        ServiceExternalIdFilters[i] = (StringFilter)ServiceExternalIdFilter[i];
      }
      try {
        out.setServiceExternalIdFilter(ServiceExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceExternalIdTypeMap = (Map)record.get("ServiceExternalIdType");
    Boolean ServiceExternalIdTypeFetch = DataHelper.getFetch(ServiceExternalIdTypeMap);
    Boolean ServiceExternalIdTypeSortDir = DataHelper.getSortDirection(ServiceExternalIdTypeMap);
    Integer ServiceExternalIdTypeSortOrder = DataHelper.getSortOrder(ServiceExternalIdTypeMap);
    if (ServiceExternalIdTypeFetch != null) out.setServiceExternalIdTypeFetch(ServiceExternalIdTypeFetch);
    if (ServiceExternalIdTypeSortDir != null) out.setServiceExternalIdTypeSortDirection(ServiceExternalIdTypeSortDir);
    if (ServiceExternalIdTypeSortOrder != null) out.setServiceExternalIdTypeSortOrder(ServiceExternalIdTypeSortOrder);

    Filter[] ServiceExternalIdTypeFilter = DataHelper.mapToFilterArray(ServiceExternalIdTypeMap, Integer.class);
    if (ServiceExternalIdTypeFilter != null) {
      IntegerFilter[] ServiceExternalIdTypeFilters = new IntegerFilter[ServiceExternalIdTypeFilter.length];
      for (int i = 0; i < ServiceExternalIdTypeFilters.length; i++) {
        ServiceExternalIdTypeFilters[i] = (IntegerFilter)ServiceExternalIdTypeFilter[i];
      }
      try {
        out.setServiceExternalIdTypeFilter(ServiceExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceIdActiveDateMap = (Map)record.get("ServiceIdActiveDate");
    Boolean ServiceIdActiveDateFetch = DataHelper.getFetch(ServiceIdActiveDateMap);
    Boolean ServiceIdActiveDateSortDir = DataHelper.getSortDirection(ServiceIdActiveDateMap);
    Integer ServiceIdActiveDateSortOrder = DataHelper.getSortOrder(ServiceIdActiveDateMap);
    if (ServiceIdActiveDateFetch != null) out.setServiceIdActiveDateFetch(ServiceIdActiveDateFetch);
    if (ServiceIdActiveDateSortDir != null) out.setServiceIdActiveDateSortDirection(ServiceIdActiveDateSortDir);
    if (ServiceIdActiveDateSortOrder != null) out.setServiceIdActiveDateSortOrder(ServiceIdActiveDateSortOrder);

    Filter[] ServiceIdActiveDateFilter = DataHelper.mapToFilterArray(ServiceIdActiveDateMap, Date.class);
    if (ServiceIdActiveDateFilter != null) {
      DateFilter[] ServiceIdActiveDateFilters = new DateFilter[ServiceIdActiveDateFilter.length];
      for (int i = 0; i < ServiceIdActiveDateFilters.length; i++) {
        ServiceIdActiveDateFilters[i] = (DateFilter)ServiceIdActiveDateFilter[i];
      }
      try {
        out.setServiceIdActiveDateFilter(ServiceIdActiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceIdInactiveDateMap = (Map)record.get("ServiceIdInactiveDate");
    Boolean ServiceIdInactiveDateFetch = DataHelper.getFetch(ServiceIdInactiveDateMap);
    Boolean ServiceIdInactiveDateSortDir = DataHelper.getSortDirection(ServiceIdInactiveDateMap);
    Integer ServiceIdInactiveDateSortOrder = DataHelper.getSortOrder(ServiceIdInactiveDateMap);
    if (ServiceIdInactiveDateFetch != null) out.setServiceIdInactiveDateFetch(ServiceIdInactiveDateFetch);
    if (ServiceIdInactiveDateSortDir != null) out.setServiceIdInactiveDateSortDirection(ServiceIdInactiveDateSortDir);
    if (ServiceIdInactiveDateSortOrder != null) out.setServiceIdInactiveDateSortOrder(ServiceIdInactiveDateSortOrder);

    Filter[] ServiceIdInactiveDateFilter = DataHelper.mapToFilterArray(ServiceIdInactiveDateMap, Date.class);
    if (ServiceIdInactiveDateFilter != null) {
      DateFilter[] ServiceIdInactiveDateFilters = new DateFilter[ServiceIdInactiveDateFilter.length];
      for (int i = 0; i < ServiceIdInactiveDateFilters.length; i++) {
        ServiceIdInactiveDateFilters[i] = (DateFilter)ServiceIdInactiveDateFilter[i];
      }
      try {
        out.setServiceIdInactiveDateFilter(ServiceIdInactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
