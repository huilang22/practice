/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteObjectHelper.java
 * Definition File: Customer/Note.xml
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



/** Helper class to convert NoteObject JavaBean objects to/from HashMaps.
 */
public class NoteObjectHelper implements ArubaObjectHelper
{
  /** convert NoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (NoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert NoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return NoteObjectData the converted object
   */
  public static NoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NoteObject")
   * @return NoteObjectData the converted object
   */
  public static NoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return NoteObjectFilter the converted object
   */
  public static NoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NoteObject")
   * @return NoteObjectFilter the converted object
   */
  public static NoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to NoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return NoteObjectDataList the converted object
   */
  public static NoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to NoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "NoteObjectList")
   * @return NoteObjectDataList the converted object
   */
  public static NoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    NoteObjectData[] array = null;
    if (root != null)
    {
      array = new NoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = NoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new NoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new NoteObjectDataList (array, index, total);
  }
  /** convert NoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._EquipExternalIdSet) record.put ("EquipExternalId", in.EquipExternalId);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._PermanentFlagSet) record.put ("PermanentFlag", in.PermanentFlag);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._NoteCodeSet) record.put ("NoteCode", in.NoteCode);
  
    if (in._NoteSourceSet) record.put ("NoteSource", in.NoteSource);
  
    if (in._NoteTextSet) record.put ("NoteText", in.NoteText);
  
    if (in._CommentsSet) record.put ("Comments", in.Comments);
      return record;
  }
  /** convert NoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.EquipExternalId, in.EquipExternalIdSort, in.EquipExternalIdSortAscending, in.EquipExternalIdFetch, in.EquipExternalIdCaseInsensitive);
      if (map != null) record.put ("EquipExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.PermanentFlag, in.PermanentFlagSort, in.PermanentFlagSortAscending, in.PermanentFlagFetch);
      if (map != null) record.put ("PermanentFlag", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.NoteCode, in.NoteCodeSort, in.NoteCodeSortAscending, in.NoteCodeFetch, in.NoteCodeCaseInsensitive);
      if (map != null) record.put ("NoteCode", map);
      map = DataHelper.filterToMap (in.NoteSource, in.NoteSourceSort, in.NoteSourceSortAscending, in.NoteSourceFetch);
      if (map != null) record.put ("NoteSource", map);
      map = DataHelper.filterToMap (in.NoteText, in.NoteTextSort, in.NoteTextSortAscending, in.NoteTextFetch, in.NoteTextCaseInsensitive);
      if (map != null) record.put ("NoteText", map);
      map = DataHelper.filterToMap (in.Comments, in.CommentsSort, in.CommentsSortAscending, in.CommentsFetch, in.CommentsCaseInsensitive);
      if (map != null) record.put ("Comments", map);
    return record;
  }
  /** convert Map to NoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteObjectData the converted object
   */
  public static NoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteObjectData out = new NoteObjectData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("EquipExternalId")) != null)
    {
      out.EquipExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("PermanentFlag")) != null)
    {
      out.PermanentFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
    }
  
    if ((obj = record.get ("NoteCode")) != null)
    {
      out.NoteCode = (String) obj;
    }
  
    if ((obj = record.get ("NoteSource")) != null)
    {
      out.NoteSource = (Integer) obj;
    }
  
    if ((obj = record.get ("NoteText")) != null)
    {
      out.NoteText = (String) obj;
    }
  
    if ((obj = record.get ("Comments")) != null)
    {
      out.Comments = (String) obj;
    }
      return out;
  }
  /** convert Map to NoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteObjectFilter the converted object
   */
  public static NoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteObjectFilter out = new NoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
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
  
    Map EquipExternalIdMap = (Map)record.get("EquipExternalId");
    Boolean EquipExternalIdFetch = DataHelper.getFetch(EquipExternalIdMap);
    Boolean EquipExternalIdSortDir = DataHelper.getSortDirection(EquipExternalIdMap);
    Integer EquipExternalIdSortOrder = DataHelper.getSortOrder(EquipExternalIdMap);
    if (EquipExternalIdFetch != null) out.setEquipExternalIdFetch(EquipExternalIdFetch);
    if (EquipExternalIdSortDir != null) out.setEquipExternalIdSortDirection(EquipExternalIdSortDir);
    if (EquipExternalIdSortOrder != null) out.setEquipExternalIdSortOrder(EquipExternalIdSortOrder);

    Filter[] EquipExternalIdFilter = DataHelper.mapToFilterArray(EquipExternalIdMap, String.class);
    if (EquipExternalIdFilter != null) {
      StringFilter[] EquipExternalIdFilters = new StringFilter[EquipExternalIdFilter.length];
      for (int i = 0; i < EquipExternalIdFilters.length; i++) {
        EquipExternalIdFilters[i] = (StringFilter)EquipExternalIdFilter[i];
      }
      try {
        out.setEquipExternalIdFilter(EquipExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdMap = (Map)record.get("AccountExternalId");
    Boolean AccountExternalIdFetch = DataHelper.getFetch(AccountExternalIdMap);
    Boolean AccountExternalIdSortDir = DataHelper.getSortDirection(AccountExternalIdMap);
    Integer AccountExternalIdSortOrder = DataHelper.getSortOrder(AccountExternalIdMap);
    if (AccountExternalIdFetch != null) out.setAccountExternalIdFetch(AccountExternalIdFetch);
    if (AccountExternalIdSortDir != null) out.setAccountExternalIdSortDirection(AccountExternalIdSortDir);
    if (AccountExternalIdSortOrder != null) out.setAccountExternalIdSortOrder(AccountExternalIdSortOrder);

    Filter[] AccountExternalIdFilter = DataHelper.mapToFilterArray(AccountExternalIdMap, String.class);
    if (AccountExternalIdFilter != null) {
      StringFilter[] AccountExternalIdFilters = new StringFilter[AccountExternalIdFilter.length];
      for (int i = 0; i < AccountExternalIdFilters.length; i++) {
        AccountExternalIdFilters[i] = (StringFilter)AccountExternalIdFilter[i];
      }
      try {
        out.setAccountExternalIdFilter(AccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdTypeMap = (Map)record.get("AccountExternalIdType");
    Boolean AccountExternalIdTypeFetch = DataHelper.getFetch(AccountExternalIdTypeMap);
    Boolean AccountExternalIdTypeSortDir = DataHelper.getSortDirection(AccountExternalIdTypeMap);
    Integer AccountExternalIdTypeSortOrder = DataHelper.getSortOrder(AccountExternalIdTypeMap);
    if (AccountExternalIdTypeFetch != null) out.setAccountExternalIdTypeFetch(AccountExternalIdTypeFetch);
    if (AccountExternalIdTypeSortDir != null) out.setAccountExternalIdTypeSortDirection(AccountExternalIdTypeSortDir);
    if (AccountExternalIdTypeSortOrder != null) out.setAccountExternalIdTypeSortOrder(AccountExternalIdTypeSortOrder);

    Filter[] AccountExternalIdTypeFilter = DataHelper.mapToFilterArray(AccountExternalIdTypeMap, Integer.class);
    if (AccountExternalIdTypeFilter != null) {
      IntegerFilter[] AccountExternalIdTypeFilters = new IntegerFilter[AccountExternalIdTypeFilter.length];
      for (int i = 0; i < AccountExternalIdTypeFilters.length; i++) {
        AccountExternalIdTypeFilters[i] = (IntegerFilter)AccountExternalIdTypeFilter[i];
      }
      try {
        out.setAccountExternalIdTypeFilter(AccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PermanentFlagMap = (Map)record.get("PermanentFlag");
    Boolean PermanentFlagFetch = DataHelper.getFetch(PermanentFlagMap);
    Boolean PermanentFlagSortDir = DataHelper.getSortDirection(PermanentFlagMap);
    Integer PermanentFlagSortOrder = DataHelper.getSortOrder(PermanentFlagMap);
    if (PermanentFlagFetch != null) out.setPermanentFlagFetch(PermanentFlagFetch);
    if (PermanentFlagSortDir != null) out.setPermanentFlagSortDirection(PermanentFlagSortDir);
    if (PermanentFlagSortOrder != null) out.setPermanentFlagSortOrder(PermanentFlagSortOrder);

    Filter[] PermanentFlagFilter = DataHelper.mapToFilterArray(PermanentFlagMap, Boolean.class);
    if (PermanentFlagFilter != null) {
      BooleanFilter[] PermanentFlagFilters = new BooleanFilter[PermanentFlagFilter.length];
      for (int i = 0; i < PermanentFlagFilters.length; i++) {
        PermanentFlagFilters[i] = (BooleanFilter)PermanentFlagFilter[i];
      }
      try {
        out.setPermanentFlagFilter(PermanentFlagFilters);
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
  
    Map NoteCodeMap = (Map)record.get("NoteCode");
    Boolean NoteCodeFetch = DataHelper.getFetch(NoteCodeMap);
    Boolean NoteCodeSortDir = DataHelper.getSortDirection(NoteCodeMap);
    Integer NoteCodeSortOrder = DataHelper.getSortOrder(NoteCodeMap);
    if (NoteCodeFetch != null) out.setNoteCodeFetch(NoteCodeFetch);
    if (NoteCodeSortDir != null) out.setNoteCodeSortDirection(NoteCodeSortDir);
    if (NoteCodeSortOrder != null) out.setNoteCodeSortOrder(NoteCodeSortOrder);

    Filter[] NoteCodeFilter = DataHelper.mapToFilterArray(NoteCodeMap, String.class);
    if (NoteCodeFilter != null) {
      StringFilter[] NoteCodeFilters = new StringFilter[NoteCodeFilter.length];
      for (int i = 0; i < NoteCodeFilters.length; i++) {
        NoteCodeFilters[i] = (StringFilter)NoteCodeFilter[i];
      }
      try {
        out.setNoteCodeFilter(NoteCodeFilters);
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
  
    Map CommentsMap = (Map)record.get("Comments");
    Boolean CommentsFetch = DataHelper.getFetch(CommentsMap);
    Boolean CommentsSortDir = DataHelper.getSortDirection(CommentsMap);
    Integer CommentsSortOrder = DataHelper.getSortOrder(CommentsMap);
    if (CommentsFetch != null) out.setCommentsFetch(CommentsFetch);
    if (CommentsSortDir != null) out.setCommentsSortDirection(CommentsSortDir);
    if (CommentsSortOrder != null) out.setCommentsSortOrder(CommentsSortOrder);

    Filter[] CommentsFilter = DataHelper.mapToFilterArray(CommentsMap, String.class);
    if (CommentsFilter != null) {
      StringFilter[] CommentsFilters = new StringFilter[CommentsFilter.length];
      for (int i = 0; i < CommentsFilters.length; i++) {
        CommentsFilters[i] = (StringFilter)CommentsFilter[i];
      }
      try {
        out.setCommentsFilter(CommentsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
