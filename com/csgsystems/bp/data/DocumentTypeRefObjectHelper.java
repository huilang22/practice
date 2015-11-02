/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DocumentTypeRefObjectHelper.java
 * Definition File: Admin/DocumentTypeRef.xml
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



/** Helper class to convert DocumentTypeRefObject JavaBean objects to/from HashMaps.
 */
public class DocumentTypeRefObjectHelper implements ArubaObjectHelper
{
  /** convert DocumentTypeRefObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (DocumentTypeRefObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DocumentTypeRefObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DocumentTypeRefObject")
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert DocumentTypeRefObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DocumentTypeRefObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DocumentTypeRefObject")
   * @return Map     the output Map
   */
  public static Map toMap (DocumentTypeRefObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to DocumentTypeRefObjectData.
   * @param record the Map containing the data to convert to the object
   * @return DocumentTypeRefObjectData the converted object
   */
  public static DocumentTypeRefObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to DocumentTypeRefObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "DocumentTypeRefObject")
   * @return DocumentTypeRefObjectData the converted object
   */
  public static DocumentTypeRefObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to DocumentTypeRefObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return DocumentTypeRefObjectFilter the converted object
   */
  public static DocumentTypeRefObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to DocumentTypeRefObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "DocumentTypeRefObject")
   * @return DocumentTypeRefObjectFilter the converted object
   */
  public static DocumentTypeRefObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "DocumentTypeRefObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to DocumentTypeRefObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return DocumentTypeRefObjectDataList the converted object
   */
  public static DocumentTypeRefObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to DocumentTypeRefObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "DocumentTypeRefObjectList")
   * @return DocumentTypeRefObjectDataList the converted object
   */
  public static DocumentTypeRefObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DocumentTypeRefObjectList";
    Object[] root = (Object[]) record.get (rootName);
    DocumentTypeRefObjectData[] array = null;
    if (root != null)
    {
      array = new DocumentTypeRefObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = DocumentTypeRefObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new DocumentTypeRefObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new DocumentTypeRefObjectDataList (array, index, total);
  }
  /** convert DocumentTypeRefObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (DocumentTypeRefObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", DocumentTypeRefObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._RepositoryLocationSet) record.put ("RepositoryLocation", in.RepositoryLocation);
  
    if (in._UseDocumentRepositorySet) record.put ("UseDocumentRepository", in.UseDocumentRepository);
  
    if (in._DispFnFmtSet) record.put ("DispFnFmt", in.DispFnFmt);
  
    if (in._SourceTypeSet) record.put ("SourceType", in.SourceType);
  
    if (in._MaxInstancesSet) record.put ("MaxInstances", in.MaxInstances);
  
    if (in._DocumentCategorySet) record.put ("DocumentCategory", in.DocumentCategory);
  
    if (in._DispatchFlagSet) record.put ("DispatchFlag", in.DispatchFlag);
  
    if (in._MaxAgeSet) record.put ("MaxAge", in.MaxAge);
  
    if (in._MaxAgeUnitsSet) record.put ("MaxAgeUnits", in.MaxAgeUnits);
  
    if (in._ProdnModeSet) record.put ("ProdnMode", in.ProdnMode);
      return record;
  }
  /** convert DocumentTypeRefObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (DocumentTypeRefObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", DocumentTypeRefObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.RepositoryLocation, in.RepositoryLocationSort, in.RepositoryLocationSortAscending, in.RepositoryLocationFetch, in.RepositoryLocationCaseInsensitive);
      if (map != null) record.put ("RepositoryLocation", map);
      map = DataHelper.filterToMap (in.UseDocumentRepository, in.UseDocumentRepositorySort, in.UseDocumentRepositorySortAscending, in.UseDocumentRepositoryFetch);
      if (map != null) record.put ("UseDocumentRepository", map);
      map = DataHelper.filterToMap (in.DispFnFmt, in.DispFnFmtSort, in.DispFnFmtSortAscending, in.DispFnFmtFetch, in.DispFnFmtCaseInsensitive);
      if (map != null) record.put ("DispFnFmt", map);
      map = DataHelper.filterToMap (in.SourceType, in.SourceTypeSort, in.SourceTypeSortAscending, in.SourceTypeFetch);
      if (map != null) record.put ("SourceType", map);
      map = DataHelper.filterToMap (in.MaxInstances, in.MaxInstancesSort, in.MaxInstancesSortAscending, in.MaxInstancesFetch);
      if (map != null) record.put ("MaxInstances", map);
      map = DataHelper.filterToMap (in.DocumentCategory, in.DocumentCategorySort, in.DocumentCategorySortAscending, in.DocumentCategoryFetch);
      if (map != null) record.put ("DocumentCategory", map);
      map = DataHelper.filterToMap (in.DispatchFlag, in.DispatchFlagSort, in.DispatchFlagSortAscending, in.DispatchFlagFetch);
      if (map != null) record.put ("DispatchFlag", map);
      map = DataHelper.filterToMap (in.MaxAge, in.MaxAgeSort, in.MaxAgeSortAscending, in.MaxAgeFetch);
      if (map != null) record.put ("MaxAge", map);
      map = DataHelper.filterToMap (in.MaxAgeUnits, in.MaxAgeUnitsSort, in.MaxAgeUnitsSortAscending, in.MaxAgeUnitsFetch);
      if (map != null) record.put ("MaxAgeUnits", map);
      map = DataHelper.filterToMap (in.ProdnMode, in.ProdnModeSort, in.ProdnModeSortAscending, in.ProdnModeFetch);
      if (map != null) record.put ("ProdnMode", map);
    return record;
  }
  /** convert Map to DocumentTypeRefObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DocumentTypeRefObjectData the converted object
   */
  public static DocumentTypeRefObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DocumentTypeRefObjectData out = new DocumentTypeRefObjectData ();

    out.Key = DocumentTypeRefObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("RepositoryLocation")) != null)
    {
      out.RepositoryLocation = (String) obj;
    }
  
    if ((obj = record.get ("UseDocumentRepository")) != null)
    {
      out.UseDocumentRepository = (Boolean) obj;
    }
  
    if ((obj = record.get ("DispFnFmt")) != null)
    {
      out.DispFnFmt = (String) obj;
    }
  
    if ((obj = record.get ("SourceType")) != null)
    {
      out.SourceType = (Integer) obj;
    }
  
    if ((obj = record.get ("MaxInstances")) != null)
    {
      out.MaxInstances = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentCategory")) != null)
    {
      out.DocumentCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("DispatchFlag")) != null)
    {
      out.DispatchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("MaxAge")) != null)
    {
      out.MaxAge = (Integer) obj;
    }
  
    if ((obj = record.get ("MaxAgeUnits")) != null)
    {
      out.MaxAgeUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("ProdnMode")) != null)
    {
      out.ProdnMode = (Integer) obj;
    }
      return out;
  }
  /** convert Map to DocumentTypeRefObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DocumentTypeRefObjectFilter the converted object
   */
  public static DocumentTypeRefObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DocumentTypeRefObjectFilter out = new DocumentTypeRefObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = DocumentTypeRefObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map RepositoryLocationMap = (Map)record.get("RepositoryLocation");
    Boolean RepositoryLocationFetch = DataHelper.getFetch(RepositoryLocationMap);
    Boolean RepositoryLocationSortDir = DataHelper.getSortDirection(RepositoryLocationMap);
    Integer RepositoryLocationSortOrder = DataHelper.getSortOrder(RepositoryLocationMap);
    if (RepositoryLocationFetch != null) out.setRepositoryLocationFetch(RepositoryLocationFetch);
    if (RepositoryLocationSortDir != null) out.setRepositoryLocationSortDirection(RepositoryLocationSortDir);
    if (RepositoryLocationSortOrder != null) out.setRepositoryLocationSortOrder(RepositoryLocationSortOrder);

    Filter[] RepositoryLocationFilter = DataHelper.mapToFilterArray(RepositoryLocationMap, String.class);
    if (RepositoryLocationFilter != null) {
      StringFilter[] RepositoryLocationFilters = new StringFilter[RepositoryLocationFilter.length];
      for (int i = 0; i < RepositoryLocationFilters.length; i++) {
        RepositoryLocationFilters[i] = (StringFilter)RepositoryLocationFilter[i];
      }
      try {
        out.setRepositoryLocationFilter(RepositoryLocationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseDocumentRepositoryMap = (Map)record.get("UseDocumentRepository");
    Boolean UseDocumentRepositoryFetch = DataHelper.getFetch(UseDocumentRepositoryMap);
    Boolean UseDocumentRepositorySortDir = DataHelper.getSortDirection(UseDocumentRepositoryMap);
    Integer UseDocumentRepositorySortOrder = DataHelper.getSortOrder(UseDocumentRepositoryMap);
    if (UseDocumentRepositoryFetch != null) out.setUseDocumentRepositoryFetch(UseDocumentRepositoryFetch);
    if (UseDocumentRepositorySortDir != null) out.setUseDocumentRepositorySortDirection(UseDocumentRepositorySortDir);
    if (UseDocumentRepositorySortOrder != null) out.setUseDocumentRepositorySortOrder(UseDocumentRepositorySortOrder);

    Filter[] UseDocumentRepositoryFilter = DataHelper.mapToFilterArray(UseDocumentRepositoryMap, Boolean.class);
    if (UseDocumentRepositoryFilter != null) {
      BooleanFilter[] UseDocumentRepositoryFilters = new BooleanFilter[UseDocumentRepositoryFilter.length];
      for (int i = 0; i < UseDocumentRepositoryFilters.length; i++) {
        UseDocumentRepositoryFilters[i] = (BooleanFilter)UseDocumentRepositoryFilter[i];
      }
      try {
        out.setUseDocumentRepositoryFilter(UseDocumentRepositoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DispFnFmtMap = (Map)record.get("DispFnFmt");
    Boolean DispFnFmtFetch = DataHelper.getFetch(DispFnFmtMap);
    Boolean DispFnFmtSortDir = DataHelper.getSortDirection(DispFnFmtMap);
    Integer DispFnFmtSortOrder = DataHelper.getSortOrder(DispFnFmtMap);
    if (DispFnFmtFetch != null) out.setDispFnFmtFetch(DispFnFmtFetch);
    if (DispFnFmtSortDir != null) out.setDispFnFmtSortDirection(DispFnFmtSortDir);
    if (DispFnFmtSortOrder != null) out.setDispFnFmtSortOrder(DispFnFmtSortOrder);

    Filter[] DispFnFmtFilter = DataHelper.mapToFilterArray(DispFnFmtMap, String.class);
    if (DispFnFmtFilter != null) {
      StringFilter[] DispFnFmtFilters = new StringFilter[DispFnFmtFilter.length];
      for (int i = 0; i < DispFnFmtFilters.length; i++) {
        DispFnFmtFilters[i] = (StringFilter)DispFnFmtFilter[i];
      }
      try {
        out.setDispFnFmtFilter(DispFnFmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SourceTypeMap = (Map)record.get("SourceType");
    Boolean SourceTypeFetch = DataHelper.getFetch(SourceTypeMap);
    Boolean SourceTypeSortDir = DataHelper.getSortDirection(SourceTypeMap);
    Integer SourceTypeSortOrder = DataHelper.getSortOrder(SourceTypeMap);
    if (SourceTypeFetch != null) out.setSourceTypeFetch(SourceTypeFetch);
    if (SourceTypeSortDir != null) out.setSourceTypeSortDirection(SourceTypeSortDir);
    if (SourceTypeSortOrder != null) out.setSourceTypeSortOrder(SourceTypeSortOrder);

    Filter[] SourceTypeFilter = DataHelper.mapToFilterArray(SourceTypeMap, Integer.class);
    if (SourceTypeFilter != null) {
      IntegerFilter[] SourceTypeFilters = new IntegerFilter[SourceTypeFilter.length];
      for (int i = 0; i < SourceTypeFilters.length; i++) {
        SourceTypeFilters[i] = (IntegerFilter)SourceTypeFilter[i];
      }
      try {
        out.setSourceTypeFilter(SourceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaxInstancesMap = (Map)record.get("MaxInstances");
    Boolean MaxInstancesFetch = DataHelper.getFetch(MaxInstancesMap);
    Boolean MaxInstancesSortDir = DataHelper.getSortDirection(MaxInstancesMap);
    Integer MaxInstancesSortOrder = DataHelper.getSortOrder(MaxInstancesMap);
    if (MaxInstancesFetch != null) out.setMaxInstancesFetch(MaxInstancesFetch);
    if (MaxInstancesSortDir != null) out.setMaxInstancesSortDirection(MaxInstancesSortDir);
    if (MaxInstancesSortOrder != null) out.setMaxInstancesSortOrder(MaxInstancesSortOrder);

    Filter[] MaxInstancesFilter = DataHelper.mapToFilterArray(MaxInstancesMap, Integer.class);
    if (MaxInstancesFilter != null) {
      IntegerFilter[] MaxInstancesFilters = new IntegerFilter[MaxInstancesFilter.length];
      for (int i = 0; i < MaxInstancesFilters.length; i++) {
        MaxInstancesFilters[i] = (IntegerFilter)MaxInstancesFilter[i];
      }
      try {
        out.setMaxInstancesFilter(MaxInstancesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DocumentCategoryMap = (Map)record.get("DocumentCategory");
    Boolean DocumentCategoryFetch = DataHelper.getFetch(DocumentCategoryMap);
    Boolean DocumentCategorySortDir = DataHelper.getSortDirection(DocumentCategoryMap);
    Integer DocumentCategorySortOrder = DataHelper.getSortOrder(DocumentCategoryMap);
    if (DocumentCategoryFetch != null) out.setDocumentCategoryFetch(DocumentCategoryFetch);
    if (DocumentCategorySortDir != null) out.setDocumentCategorySortDirection(DocumentCategorySortDir);
    if (DocumentCategorySortOrder != null) out.setDocumentCategorySortOrder(DocumentCategorySortOrder);

    Filter[] DocumentCategoryFilter = DataHelper.mapToFilterArray(DocumentCategoryMap, Integer.class);
    if (DocumentCategoryFilter != null) {
      IntegerFilter[] DocumentCategoryFilters = new IntegerFilter[DocumentCategoryFilter.length];
      for (int i = 0; i < DocumentCategoryFilters.length; i++) {
        DocumentCategoryFilters[i] = (IntegerFilter)DocumentCategoryFilter[i];
      }
      try {
        out.setDocumentCategoryFilter(DocumentCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DispatchFlagMap = (Map)record.get("DispatchFlag");
    Boolean DispatchFlagFetch = DataHelper.getFetch(DispatchFlagMap);
    Boolean DispatchFlagSortDir = DataHelper.getSortDirection(DispatchFlagMap);
    Integer DispatchFlagSortOrder = DataHelper.getSortOrder(DispatchFlagMap);
    if (DispatchFlagFetch != null) out.setDispatchFlagFetch(DispatchFlagFetch);
    if (DispatchFlagSortDir != null) out.setDispatchFlagSortDirection(DispatchFlagSortDir);
    if (DispatchFlagSortOrder != null) out.setDispatchFlagSortOrder(DispatchFlagSortOrder);

    Filter[] DispatchFlagFilter = DataHelper.mapToFilterArray(DispatchFlagMap, Boolean.class);
    if (DispatchFlagFilter != null) {
      BooleanFilter[] DispatchFlagFilters = new BooleanFilter[DispatchFlagFilter.length];
      for (int i = 0; i < DispatchFlagFilters.length; i++) {
        DispatchFlagFilters[i] = (BooleanFilter)DispatchFlagFilter[i];
      }
      try {
        out.setDispatchFlagFilter(DispatchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaxAgeMap = (Map)record.get("MaxAge");
    Boolean MaxAgeFetch = DataHelper.getFetch(MaxAgeMap);
    Boolean MaxAgeSortDir = DataHelper.getSortDirection(MaxAgeMap);
    Integer MaxAgeSortOrder = DataHelper.getSortOrder(MaxAgeMap);
    if (MaxAgeFetch != null) out.setMaxAgeFetch(MaxAgeFetch);
    if (MaxAgeSortDir != null) out.setMaxAgeSortDirection(MaxAgeSortDir);
    if (MaxAgeSortOrder != null) out.setMaxAgeSortOrder(MaxAgeSortOrder);

    Filter[] MaxAgeFilter = DataHelper.mapToFilterArray(MaxAgeMap, Integer.class);
    if (MaxAgeFilter != null) {
      IntegerFilter[] MaxAgeFilters = new IntegerFilter[MaxAgeFilter.length];
      for (int i = 0; i < MaxAgeFilters.length; i++) {
        MaxAgeFilters[i] = (IntegerFilter)MaxAgeFilter[i];
      }
      try {
        out.setMaxAgeFilter(MaxAgeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaxAgeUnitsMap = (Map)record.get("MaxAgeUnits");
    Boolean MaxAgeUnitsFetch = DataHelper.getFetch(MaxAgeUnitsMap);
    Boolean MaxAgeUnitsSortDir = DataHelper.getSortDirection(MaxAgeUnitsMap);
    Integer MaxAgeUnitsSortOrder = DataHelper.getSortOrder(MaxAgeUnitsMap);
    if (MaxAgeUnitsFetch != null) out.setMaxAgeUnitsFetch(MaxAgeUnitsFetch);
    if (MaxAgeUnitsSortDir != null) out.setMaxAgeUnitsSortDirection(MaxAgeUnitsSortDir);
    if (MaxAgeUnitsSortOrder != null) out.setMaxAgeUnitsSortOrder(MaxAgeUnitsSortOrder);

    Filter[] MaxAgeUnitsFilter = DataHelper.mapToFilterArray(MaxAgeUnitsMap, Integer.class);
    if (MaxAgeUnitsFilter != null) {
      IntegerFilter[] MaxAgeUnitsFilters = new IntegerFilter[MaxAgeUnitsFilter.length];
      for (int i = 0; i < MaxAgeUnitsFilters.length; i++) {
        MaxAgeUnitsFilters[i] = (IntegerFilter)MaxAgeUnitsFilter[i];
      }
      try {
        out.setMaxAgeUnitsFilter(MaxAgeUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProdnModeMap = (Map)record.get("ProdnMode");
    Boolean ProdnModeFetch = DataHelper.getFetch(ProdnModeMap);
    Boolean ProdnModeSortDir = DataHelper.getSortDirection(ProdnModeMap);
    Integer ProdnModeSortOrder = DataHelper.getSortOrder(ProdnModeMap);
    if (ProdnModeFetch != null) out.setProdnModeFetch(ProdnModeFetch);
    if (ProdnModeSortDir != null) out.setProdnModeSortDirection(ProdnModeSortDir);
    if (ProdnModeSortOrder != null) out.setProdnModeSortOrder(ProdnModeSortOrder);

    Filter[] ProdnModeFilter = DataHelper.mapToFilterArray(ProdnModeMap, Integer.class);
    if (ProdnModeFilter != null) {
      IntegerFilter[] ProdnModeFilters = new IntegerFilter[ProdnModeFilter.length];
      for (int i = 0; i < ProdnModeFilters.length; i++) {
        ProdnModeFilters[i] = (IntegerFilter)ProdnModeFilter[i];
      }
      try {
        out.setProdnModeFilter(ProdnModeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
