/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectHelper.java
 * Definition File: Customer/EnhancedNote.xml
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



/** Helper class to convert EnhancedNoteObject JavaBean objects to/from HashMaps.
 */
public class EnhancedNoteObjectHelper implements ArubaObjectHelper
{
  /** convert EnhancedNoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EnhancedNoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EnhancedNoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EnhancedNoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EnhancedNoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EnhancedNoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EnhancedNoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EnhancedNoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EnhancedNoteObjectData the converted object
   */
  public static EnhancedNoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EnhancedNoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EnhancedNoteObject")
   * @return EnhancedNoteObjectData the converted object
   */
  public static EnhancedNoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EnhancedNoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EnhancedNoteObjectFilter the converted object
   */
  public static EnhancedNoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EnhancedNoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EnhancedNoteObject")
   * @return EnhancedNoteObjectFilter the converted object
   */
  public static EnhancedNoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EnhancedNoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EnhancedNoteObjectDataList the converted object
   */
  public static EnhancedNoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EnhancedNoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EnhancedNoteObjectList")
   * @return EnhancedNoteObjectDataList the converted object
   */
  public static EnhancedNoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EnhancedNoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EnhancedNoteObjectData[] array = null;
    if (root != null)
    {
      array = new EnhancedNoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EnhancedNoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EnhancedNoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EnhancedNoteObjectDataList (array, index, total);
  }
  /** convert EnhancedNoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EnhancedNoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EnhancedNoteObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ParentCodeSet) record.put ("ParentCode", in.ParentCode);
  
    if (in._ParentId1Set) record.put ("ParentId1", in.ParentId1);
  
    if (in._ParentId2Set) record.put ("ParentId2", in.ParentId2);
  
    if (in._LegacyNoteCodeSet) record.put ("LegacyNoteCode", in.LegacyNoteCode);
  
    if (in._NoteSourceSet) record.put ("NoteSource", in.NoteSource);
  
    if (in._IsPermanentSet) record.put ("IsPermanent", in.IsPermanent);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._NoteTextSet) record.put ("NoteText", in.NoteText);
  
    if (in._NoteTemplateIdSet) record.put ("NoteTemplateId", in.NoteTemplateId);
  
    if (in._NoteTypeIdSet) record.put ("NoteTypeId", in.NoteTypeId);
  
    if (in._NoteReasonIdSet) record.put ("NoteReasonId", in.NoteReasonId);
      return record;
  }
  /** convert EnhancedNoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EnhancedNoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EnhancedNoteObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ParentCode, in.ParentCodeSort, in.ParentCodeSortAscending, in.ParentCodeFetch);
      if (map != null) record.put ("ParentCode", map);
      map = DataHelper.filterToMap (in.ParentId1, in.ParentId1Sort, in.ParentId1SortAscending, in.ParentId1Fetch);
      if (map != null) record.put ("ParentId1", map);
      map = DataHelper.filterToMap (in.ParentId2, in.ParentId2Sort, in.ParentId2SortAscending, in.ParentId2Fetch);
      if (map != null) record.put ("ParentId2", map);
      map = DataHelper.filterToMap (in.LegacyNoteCode, in.LegacyNoteCodeSort, in.LegacyNoteCodeSortAscending, in.LegacyNoteCodeFetch, in.LegacyNoteCodeCaseInsensitive);
      if (map != null) record.put ("LegacyNoteCode", map);
      map = DataHelper.filterToMap (in.NoteSource, in.NoteSourceSort, in.NoteSourceSortAscending, in.NoteSourceFetch);
      if (map != null) record.put ("NoteSource", map);
      map = DataHelper.filterToMap (in.IsPermanent, in.IsPermanentSort, in.IsPermanentSortAscending, in.IsPermanentFetch);
      if (map != null) record.put ("IsPermanent", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.NoteText, in.NoteTextSort, in.NoteTextSortAscending, in.NoteTextFetch, in.NoteTextCaseInsensitive);
      if (map != null) record.put ("NoteText", map);
      map = DataHelper.filterToMap (in.NoteTemplateId, in.NoteTemplateIdSort, in.NoteTemplateIdSortAscending, in.NoteTemplateIdFetch);
      if (map != null) record.put ("NoteTemplateId", map);
      map = DataHelper.filterToMap (in.NoteTypeId, in.NoteTypeIdSort, in.NoteTypeIdSortAscending, in.NoteTypeIdFetch);
      if (map != null) record.put ("NoteTypeId", map);
      map = DataHelper.filterToMap (in.NoteReasonId, in.NoteReasonIdSort, in.NoteReasonIdSortAscending, in.NoteReasonIdFetch);
      if (map != null) record.put ("NoteReasonId", map);
    return record;
  }
  /** convert Map to EnhancedNoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EnhancedNoteObjectData the converted object
   */
  public static EnhancedNoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EnhancedNoteObjectData out = new EnhancedNoteObjectData ();

    out.Key = EnhancedNoteObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ParentCode")) != null)
    {
      out.ParentCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentId1")) != null)
    {
      out.ParentId1 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ParentId2")) != null)
    {
      out.ParentId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("LegacyNoteCode")) != null)
    {
      out.LegacyNoteCode = (String) obj;
    }
  
    if ((obj = record.get ("NoteSource")) != null)
    {
      out.NoteSource = (Integer) obj;
    }
  
    if ((obj = record.get ("IsPermanent")) != null)
    {
      out.IsPermanent = (Boolean) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("NoteText")) != null)
    {
      out.NoteText = (String) obj;
    }
  
    if ((obj = record.get ("NoteTemplateId")) != null)
    {
      out.NoteTemplateId = (Integer) obj;
    }
  
    if ((obj = record.get ("NoteTypeId")) != null)
    {
      out.NoteTypeId = (Integer) obj;
    }
  
    if ((obj = record.get ("NoteReasonId")) != null)
    {
      out.NoteReasonId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to EnhancedNoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EnhancedNoteObjectFilter the converted object
   */
  public static EnhancedNoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EnhancedNoteObjectFilter out = new EnhancedNoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EnhancedNoteObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ParentCodeMap = (Map)record.get("ParentCode");
    Boolean ParentCodeFetch = DataHelper.getFetch(ParentCodeMap);
    Boolean ParentCodeSortDir = DataHelper.getSortDirection(ParentCodeMap);
    Integer ParentCodeSortOrder = DataHelper.getSortOrder(ParentCodeMap);
    if (ParentCodeFetch != null) out.setParentCodeFetch(ParentCodeFetch);
    if (ParentCodeSortDir != null) out.setParentCodeSortDirection(ParentCodeSortDir);
    if (ParentCodeSortOrder != null) out.setParentCodeSortOrder(ParentCodeSortOrder);

    Filter[] ParentCodeFilter = DataHelper.mapToFilterArray(ParentCodeMap, Integer.class);
    if (ParentCodeFilter != null) {
      IntegerFilter[] ParentCodeFilters = new IntegerFilter[ParentCodeFilter.length];
      for (int i = 0; i < ParentCodeFilters.length; i++) {
        ParentCodeFilters[i] = (IntegerFilter)ParentCodeFilter[i];
      }
      try {
        out.setParentCodeFilter(ParentCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentId1Map = (Map)record.get("ParentId1");
    Boolean ParentId1Fetch = DataHelper.getFetch(ParentId1Map);
    Boolean ParentId1SortDir = DataHelper.getSortDirection(ParentId1Map);
    Integer ParentId1SortOrder = DataHelper.getSortOrder(ParentId1Map);
    if (ParentId1Fetch != null) out.setParentId1Fetch(ParentId1Fetch);
    if (ParentId1SortDir != null) out.setParentId1SortDirection(ParentId1SortDir);
    if (ParentId1SortOrder != null) out.setParentId1SortOrder(ParentId1SortOrder);

    Filter[] ParentId1Filter = DataHelper.mapToFilterArray(ParentId1Map, BigInteger.class);
    if (ParentId1Filter != null) {
      BigIntegerFilter[] ParentId1Filters = new BigIntegerFilter[ParentId1Filter.length];
      for (int i = 0; i < ParentId1Filters.length; i++) {
        ParentId1Filters[i] = (BigIntegerFilter)ParentId1Filter[i];
      }
      try {
        out.setParentId1Filter(ParentId1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentId2Map = (Map)record.get("ParentId2");
    Boolean ParentId2Fetch = DataHelper.getFetch(ParentId2Map);
    Boolean ParentId2SortDir = DataHelper.getSortDirection(ParentId2Map);
    Integer ParentId2SortOrder = DataHelper.getSortOrder(ParentId2Map);
    if (ParentId2Fetch != null) out.setParentId2Fetch(ParentId2Fetch);
    if (ParentId2SortDir != null) out.setParentId2SortDirection(ParentId2SortDir);
    if (ParentId2SortOrder != null) out.setParentId2SortOrder(ParentId2SortOrder);

    Filter[] ParentId2Filter = DataHelper.mapToFilterArray(ParentId2Map, Integer.class);
    if (ParentId2Filter != null) {
      IntegerFilter[] ParentId2Filters = new IntegerFilter[ParentId2Filter.length];
      for (int i = 0; i < ParentId2Filters.length; i++) {
        ParentId2Filters[i] = (IntegerFilter)ParentId2Filter[i];
      }
      try {
        out.setParentId2Filter(ParentId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LegacyNoteCodeMap = (Map)record.get("LegacyNoteCode");
    Boolean LegacyNoteCodeFetch = DataHelper.getFetch(LegacyNoteCodeMap);
    Boolean LegacyNoteCodeSortDir = DataHelper.getSortDirection(LegacyNoteCodeMap);
    Integer LegacyNoteCodeSortOrder = DataHelper.getSortOrder(LegacyNoteCodeMap);
    if (LegacyNoteCodeFetch != null) out.setLegacyNoteCodeFetch(LegacyNoteCodeFetch);
    if (LegacyNoteCodeSortDir != null) out.setLegacyNoteCodeSortDirection(LegacyNoteCodeSortDir);
    if (LegacyNoteCodeSortOrder != null) out.setLegacyNoteCodeSortOrder(LegacyNoteCodeSortOrder);

    Filter[] LegacyNoteCodeFilter = DataHelper.mapToFilterArray(LegacyNoteCodeMap, String.class);
    if (LegacyNoteCodeFilter != null) {
      StringFilter[] LegacyNoteCodeFilters = new StringFilter[LegacyNoteCodeFilter.length];
      for (int i = 0; i < LegacyNoteCodeFilters.length; i++) {
        LegacyNoteCodeFilters[i] = (StringFilter)LegacyNoteCodeFilter[i];
      }
      try {
        out.setLegacyNoteCodeFilter(LegacyNoteCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoteSourceMap = (Map)record.get("NoteSource");
    Boolean NoteSourceFetch = DataHelper.getFetch(NoteSourceMap);
    Boolean NoteSourceSortDir = DataHelper.getSortDirection(NoteSourceMap);
    Integer NoteSourceSortOrder = DataHelper.getSortOrder(NoteSourceMap);
    if (NoteSourceFetch != null) out.setNoteSourceFetch(NoteSourceFetch);
    if (NoteSourceSortDir != null) out.setNoteSourceSortDirection(NoteSourceSortDir);
    if (NoteSourceSortOrder != null) out.setNoteSourceSortOrder(NoteSourceSortOrder);

    Filter[] NoteSourceFilter = DataHelper.mapToFilterArray(NoteSourceMap, Integer.class);
    if (NoteSourceFilter != null) {
      IntegerFilter[] NoteSourceFilters = new IntegerFilter[NoteSourceFilter.length];
      for (int i = 0; i < NoteSourceFilters.length; i++) {
        NoteSourceFilters[i] = (IntegerFilter)NoteSourceFilter[i];
      }
      try {
        out.setNoteSourceFilter(NoteSourceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPermanentMap = (Map)record.get("IsPermanent");
    Boolean IsPermanentFetch = DataHelper.getFetch(IsPermanentMap);
    Boolean IsPermanentSortDir = DataHelper.getSortDirection(IsPermanentMap);
    Integer IsPermanentSortOrder = DataHelper.getSortOrder(IsPermanentMap);
    if (IsPermanentFetch != null) out.setIsPermanentFetch(IsPermanentFetch);
    if (IsPermanentSortDir != null) out.setIsPermanentSortDirection(IsPermanentSortDir);
    if (IsPermanentSortOrder != null) out.setIsPermanentSortOrder(IsPermanentSortOrder);

    Filter[] IsPermanentFilter = DataHelper.mapToFilterArray(IsPermanentMap, Boolean.class);
    if (IsPermanentFilter != null) {
      BooleanFilter[] IsPermanentFilters = new BooleanFilter[IsPermanentFilter.length];
      for (int i = 0; i < IsPermanentFilters.length; i++) {
        IsPermanentFilters[i] = (BooleanFilter)IsPermanentFilter[i];
      }
      try {
        out.setIsPermanentFilter(IsPermanentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoteTextMap = (Map)record.get("NoteText");
    Boolean NoteTextFetch = DataHelper.getFetch(NoteTextMap);
    Boolean NoteTextSortDir = DataHelper.getSortDirection(NoteTextMap);
    Integer NoteTextSortOrder = DataHelper.getSortOrder(NoteTextMap);
    if (NoteTextFetch != null) out.setNoteTextFetch(NoteTextFetch);
    if (NoteTextSortDir != null) out.setNoteTextSortDirection(NoteTextSortDir);
    if (NoteTextSortOrder != null) out.setNoteTextSortOrder(NoteTextSortOrder);

    Filter[] NoteTextFilter = DataHelper.mapToFilterArray(NoteTextMap, String.class);
    if (NoteTextFilter != null) {
      StringFilter[] NoteTextFilters = new StringFilter[NoteTextFilter.length];
      for (int i = 0; i < NoteTextFilters.length; i++) {
        NoteTextFilters[i] = (StringFilter)NoteTextFilter[i];
      }
      try {
        out.setNoteTextFilter(NoteTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoteTemplateIdMap = (Map)record.get("NoteTemplateId");
    Boolean NoteTemplateIdFetch = DataHelper.getFetch(NoteTemplateIdMap);
    Boolean NoteTemplateIdSortDir = DataHelper.getSortDirection(NoteTemplateIdMap);
    Integer NoteTemplateIdSortOrder = DataHelper.getSortOrder(NoteTemplateIdMap);
    if (NoteTemplateIdFetch != null) out.setNoteTemplateIdFetch(NoteTemplateIdFetch);
    if (NoteTemplateIdSortDir != null) out.setNoteTemplateIdSortDirection(NoteTemplateIdSortDir);
    if (NoteTemplateIdSortOrder != null) out.setNoteTemplateIdSortOrder(NoteTemplateIdSortOrder);

    Filter[] NoteTemplateIdFilter = DataHelper.mapToFilterArray(NoteTemplateIdMap, Integer.class);
    if (NoteTemplateIdFilter != null) {
      IntegerFilter[] NoteTemplateIdFilters = new IntegerFilter[NoteTemplateIdFilter.length];
      for (int i = 0; i < NoteTemplateIdFilters.length; i++) {
        NoteTemplateIdFilters[i] = (IntegerFilter)NoteTemplateIdFilter[i];
      }
      try {
        out.setNoteTemplateIdFilter(NoteTemplateIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoteTypeIdMap = (Map)record.get("NoteTypeId");
    Boolean NoteTypeIdFetch = DataHelper.getFetch(NoteTypeIdMap);
    Boolean NoteTypeIdSortDir = DataHelper.getSortDirection(NoteTypeIdMap);
    Integer NoteTypeIdSortOrder = DataHelper.getSortOrder(NoteTypeIdMap);
    if (NoteTypeIdFetch != null) out.setNoteTypeIdFetch(NoteTypeIdFetch);
    if (NoteTypeIdSortDir != null) out.setNoteTypeIdSortDirection(NoteTypeIdSortDir);
    if (NoteTypeIdSortOrder != null) out.setNoteTypeIdSortOrder(NoteTypeIdSortOrder);

    Filter[] NoteTypeIdFilter = DataHelper.mapToFilterArray(NoteTypeIdMap, Integer.class);
    if (NoteTypeIdFilter != null) {
      IntegerFilter[] NoteTypeIdFilters = new IntegerFilter[NoteTypeIdFilter.length];
      for (int i = 0; i < NoteTypeIdFilters.length; i++) {
        NoteTypeIdFilters[i] = (IntegerFilter)NoteTypeIdFilter[i];
      }
      try {
        out.setNoteTypeIdFilter(NoteTypeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoteReasonIdMap = (Map)record.get("NoteReasonId");
    Boolean NoteReasonIdFetch = DataHelper.getFetch(NoteReasonIdMap);
    Boolean NoteReasonIdSortDir = DataHelper.getSortDirection(NoteReasonIdMap);
    Integer NoteReasonIdSortOrder = DataHelper.getSortOrder(NoteReasonIdMap);
    if (NoteReasonIdFetch != null) out.setNoteReasonIdFetch(NoteReasonIdFetch);
    if (NoteReasonIdSortDir != null) out.setNoteReasonIdSortDirection(NoteReasonIdSortDir);
    if (NoteReasonIdSortOrder != null) out.setNoteReasonIdSortOrder(NoteReasonIdSortOrder);

    Filter[] NoteReasonIdFilter = DataHelper.mapToFilterArray(NoteReasonIdMap, Integer.class);
    if (NoteReasonIdFilter != null) {
      IntegerFilter[] NoteReasonIdFilters = new IntegerFilter[NoteReasonIdFilter.length];
      for (int i = 0; i < NoteReasonIdFilters.length; i++) {
        NoteReasonIdFilters[i] = (IntegerFilter)NoteReasonIdFilter[i];
      }
      try {
        out.setNoteReasonIdFilter(NoteReasonIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
