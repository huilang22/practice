/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRContractDataObjectHelper.java
 * Definition File: Customer/ProductRcRate.xml
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



/** Helper class to convert PRRContractDataObject JavaBean objects to/from HashMaps.
 */
public class PRRContractDataObjectHelper implements ArubaObjectHelper
{
  /** convert PRRContractDataObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PRRContractDataObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRContractDataObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRContractDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRContractDataObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRContractDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PRRContractDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PRRContractDataObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRContractDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRContractDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRContractDataObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRContractDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PRRContractDataObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PRRContractDataObjectData the converted object
   */
  public static PRRContractDataObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PRRContractDataObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PRRContractDataObject")
   * @return PRRContractDataObjectData the converted object
   */
  public static PRRContractDataObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRContractDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PRRContractDataObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PRRContractDataObjectFilter the converted object
   */
  public static PRRContractDataObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PRRContractDataObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PRRContractDataObject")
   * @return PRRContractDataObjectFilter the converted object
   */
  public static PRRContractDataObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRContractDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PRRContractDataObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PRRContractDataObjectDataList the converted object
   */
  public static PRRContractDataObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PRRContractDataObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PRRContractDataObjectList")
   * @return PRRContractDataObjectDataList the converted object
   */
  public static PRRContractDataObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRContractDataObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PRRContractDataObjectData[] array = null;
    if (root != null)
    {
      array = new PRRContractDataObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PRRContractDataObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PRRContractDataObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PRRContractDataObjectDataList (array, index, total);
  }
  /** convert PRRContractDataObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRContractDataObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._ViewStatusSet) record.put ("ViewStatus", in.ViewStatus);
  
    if (in._ParentServiceInternalIdSet) record.put ("ParentServiceInternalId", in.ParentServiceInternalId);
  
    if (in._ParentServiceInternalIdResetsSet) record.put ("ParentServiceInternalIdResets", in.ParentServiceInternalIdResets);
  
    if (in._ParentAccountInternalIdSet) record.put ("ParentAccountInternalId", in.ParentAccountInternalId);
  
    if (in._CommitmentReferenceSet) record.put ("CommitmentReference", in.CommitmentReference);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._StartDtSet) record.put ("StartDt", in.StartDt);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
  
    if (in._ContractLevelSet) record.put ("ContractLevel", in.ContractLevel);
  
    if (in._ContractTypeSet) record.put ("ContractType", in.ContractType);
  
    if (in._TerminationTypeIdNrcSet) record.put ("TerminationTypeIdNrc", in.TerminationTypeIdNrc);
  
    if (in._CommitmentTypeIdNrcSet) record.put ("CommitmentTypeIdNrc", in.CommitmentTypeIdNrc);
  
    if (in._ContractCategorySet) record.put ("ContractCategory", in.ContractCategory);
      return record;
  }
  /** convert PRRContractDataObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRContractDataObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.ViewStatus, in.ViewStatusSort, in.ViewStatusSortAscending, in.ViewStatusFetch);
      if (map != null) record.put ("ViewStatus", map);
      map = DataHelper.filterToMap (in.ParentServiceInternalId, in.ParentServiceInternalIdSort, in.ParentServiceInternalIdSortAscending, in.ParentServiceInternalIdFetch);
      if (map != null) record.put ("ParentServiceInternalId", map);
      map = DataHelper.filterToMap (in.ParentServiceInternalIdResets, in.ParentServiceInternalIdResetsSort, in.ParentServiceInternalIdResetsSortAscending, in.ParentServiceInternalIdResetsFetch);
      if (map != null) record.put ("ParentServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.ParentAccountInternalId, in.ParentAccountInternalIdSort, in.ParentAccountInternalIdSortAscending, in.ParentAccountInternalIdFetch);
      if (map != null) record.put ("ParentAccountInternalId", map);
      map = DataHelper.filterToMap (in.CommitmentReference, in.CommitmentReferenceSort, in.CommitmentReferenceSortAscending, in.CommitmentReferenceFetch);
      if (map != null) record.put ("CommitmentReference", map);
      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.StartDt, in.StartDtSort, in.StartDtSortAscending, in.StartDtFetch);
      if (map != null) record.put ("StartDt", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
      map = DataHelper.filterToMap (in.ContractLevel, in.ContractLevelSort, in.ContractLevelSortAscending, in.ContractLevelFetch);
      if (map != null) record.put ("ContractLevel", map);
      map = DataHelper.filterToMap (in.ContractType, in.ContractTypeSort, in.ContractTypeSortAscending, in.ContractTypeFetch);
      if (map != null) record.put ("ContractType", map);
      map = DataHelper.filterToMap (in.TerminationTypeIdNrc, in.TerminationTypeIdNrcSort, in.TerminationTypeIdNrcSortAscending, in.TerminationTypeIdNrcFetch);
      if (map != null) record.put ("TerminationTypeIdNrc", map);
      map = DataHelper.filterToMap (in.CommitmentTypeIdNrc, in.CommitmentTypeIdNrcSort, in.CommitmentTypeIdNrcSortAscending, in.CommitmentTypeIdNrcFetch);
      if (map != null) record.put ("CommitmentTypeIdNrc", map);
      map = DataHelper.filterToMap (in.ContractCategory, in.ContractCategorySort, in.ContractCategorySortAscending, in.ContractCategoryFetch);
      if (map != null) record.put ("ContractCategory", map);
    return record;
  }
  /** convert Map to PRRContractDataObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRContractDataObjectData the converted object
   */
  public static PRRContractDataObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRContractDataObjectData out = new PRRContractDataObjectData ();

    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("ViewStatus")) != null)
    {
      out.ViewStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentServiceInternalId")) != null)
    {
      out.ParentServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentServiceInternalIdResets")) != null)
    {
      out.ParentServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentAccountInternalId")) != null)
    {
      out.ParentAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("CommitmentReference")) != null)
    {
      out.CommitmentReference = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("StartDt")) != null)
    {
      out.StartDt = (Date) obj;
    }
  
    if ((obj = record.get ("EndDt")) != null)
    {
      out.EndDt = (Date) obj;
    }
  
    if ((obj = record.get ("ContractLevel")) != null)
    {
      out.ContractLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractType")) != null)
    {
      out.ContractType = (Integer) obj;
    }
  
    if ((obj = record.get ("TerminationTypeIdNrc")) != null)
    {
      out.TerminationTypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("CommitmentTypeIdNrc")) != null)
    {
      out.CommitmentTypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractCategory")) != null)
    {
      out.ContractCategory = (Integer) obj;
    }
      return out;
  }
  /** convert Map to PRRContractDataObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRContractDataObjectFilter the converted object
   */
  public static PRRContractDataObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRContractDataObjectFilter out = new PRRContractDataObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, Integer.class);
    if (TrackingIdFilter != null) {
      IntegerFilter[] TrackingIdFilters = new IntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (IntegerFilter)TrackingIdFilter[i];
      }
      try {
        out.setTrackingIdFilter(TrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdServMap = (Map)record.get("TrackingIdServ");
    Boolean TrackingIdServFetch = DataHelper.getFetch(TrackingIdServMap);
    Boolean TrackingIdServSortDir = DataHelper.getSortDirection(TrackingIdServMap);
    Integer TrackingIdServSortOrder = DataHelper.getSortOrder(TrackingIdServMap);
    if (TrackingIdServFetch != null) out.setTrackingIdServFetch(TrackingIdServFetch);
    if (TrackingIdServSortDir != null) out.setTrackingIdServSortDirection(TrackingIdServSortDir);
    if (TrackingIdServSortOrder != null) out.setTrackingIdServSortOrder(TrackingIdServSortOrder);

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, Integer.class);
    if (TrackingIdServFilter != null) {
      IntegerFilter[] TrackingIdServFilters = new IntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (IntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ViewStatusMap = (Map)record.get("ViewStatus");
    Boolean ViewStatusFetch = DataHelper.getFetch(ViewStatusMap);
    Boolean ViewStatusSortDir = DataHelper.getSortDirection(ViewStatusMap);
    Integer ViewStatusSortOrder = DataHelper.getSortOrder(ViewStatusMap);
    if (ViewStatusFetch != null) out.setViewStatusFetch(ViewStatusFetch);
    if (ViewStatusSortDir != null) out.setViewStatusSortDirection(ViewStatusSortDir);
    if (ViewStatusSortOrder != null) out.setViewStatusSortOrder(ViewStatusSortOrder);

    Filter[] ViewStatusFilter = DataHelper.mapToFilterArray(ViewStatusMap, Integer.class);
    if (ViewStatusFilter != null) {
      IntegerFilter[] ViewStatusFilters = new IntegerFilter[ViewStatusFilter.length];
      for (int i = 0; i < ViewStatusFilters.length; i++) {
        ViewStatusFilters[i] = (IntegerFilter)ViewStatusFilter[i];
      }
      try {
        out.setViewStatusFilter(ViewStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentServiceInternalIdMap = (Map)record.get("ParentServiceInternalId");
    Boolean ParentServiceInternalIdFetch = DataHelper.getFetch(ParentServiceInternalIdMap);
    Boolean ParentServiceInternalIdSortDir = DataHelper.getSortDirection(ParentServiceInternalIdMap);
    Integer ParentServiceInternalIdSortOrder = DataHelper.getSortOrder(ParentServiceInternalIdMap);
    if (ParentServiceInternalIdFetch != null) out.setParentServiceInternalIdFetch(ParentServiceInternalIdFetch);
    if (ParentServiceInternalIdSortDir != null) out.setParentServiceInternalIdSortDirection(ParentServiceInternalIdSortDir);
    if (ParentServiceInternalIdSortOrder != null) out.setParentServiceInternalIdSortOrder(ParentServiceInternalIdSortOrder);

    Filter[] ParentServiceInternalIdFilter = DataHelper.mapToFilterArray(ParentServiceInternalIdMap, Integer.class);
    if (ParentServiceInternalIdFilter != null) {
      IntegerFilter[] ParentServiceInternalIdFilters = new IntegerFilter[ParentServiceInternalIdFilter.length];
      for (int i = 0; i < ParentServiceInternalIdFilters.length; i++) {
        ParentServiceInternalIdFilters[i] = (IntegerFilter)ParentServiceInternalIdFilter[i];
      }
      try {
        out.setParentServiceInternalIdFilter(ParentServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentServiceInternalIdResetsMap = (Map)record.get("ParentServiceInternalIdResets");
    Boolean ParentServiceInternalIdResetsFetch = DataHelper.getFetch(ParentServiceInternalIdResetsMap);
    Boolean ParentServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ParentServiceInternalIdResetsMap);
    Integer ParentServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ParentServiceInternalIdResetsMap);
    if (ParentServiceInternalIdResetsFetch != null) out.setParentServiceInternalIdResetsFetch(ParentServiceInternalIdResetsFetch);
    if (ParentServiceInternalIdResetsSortDir != null) out.setParentServiceInternalIdResetsSortDirection(ParentServiceInternalIdResetsSortDir);
    if (ParentServiceInternalIdResetsSortOrder != null) out.setParentServiceInternalIdResetsSortOrder(ParentServiceInternalIdResetsSortOrder);

    Filter[] ParentServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ParentServiceInternalIdResetsMap, Integer.class);
    if (ParentServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ParentServiceInternalIdResetsFilters = new IntegerFilter[ParentServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ParentServiceInternalIdResetsFilters.length; i++) {
        ParentServiceInternalIdResetsFilters[i] = (IntegerFilter)ParentServiceInternalIdResetsFilter[i];
      }
      try {
        out.setParentServiceInternalIdResetsFilter(ParentServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAccountInternalIdMap = (Map)record.get("ParentAccountInternalId");
    Boolean ParentAccountInternalIdFetch = DataHelper.getFetch(ParentAccountInternalIdMap);
    Boolean ParentAccountInternalIdSortDir = DataHelper.getSortDirection(ParentAccountInternalIdMap);
    Integer ParentAccountInternalIdSortOrder = DataHelper.getSortOrder(ParentAccountInternalIdMap);
    if (ParentAccountInternalIdFetch != null) out.setParentAccountInternalIdFetch(ParentAccountInternalIdFetch);
    if (ParentAccountInternalIdSortDir != null) out.setParentAccountInternalIdSortDirection(ParentAccountInternalIdSortDir);
    if (ParentAccountInternalIdSortOrder != null) out.setParentAccountInternalIdSortOrder(ParentAccountInternalIdSortOrder);

    Filter[] ParentAccountInternalIdFilter = DataHelper.mapToFilterArray(ParentAccountInternalIdMap, Integer.class);
    if (ParentAccountInternalIdFilter != null) {
      IntegerFilter[] ParentAccountInternalIdFilters = new IntegerFilter[ParentAccountInternalIdFilter.length];
      for (int i = 0; i < ParentAccountInternalIdFilters.length; i++) {
        ParentAccountInternalIdFilters[i] = (IntegerFilter)ParentAccountInternalIdFilter[i];
      }
      try {
        out.setParentAccountInternalIdFilter(ParentAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentReferenceMap = (Map)record.get("CommitmentReference");
    Boolean CommitmentReferenceFetch = DataHelper.getFetch(CommitmentReferenceMap);
    Boolean CommitmentReferenceSortDir = DataHelper.getSortDirection(CommitmentReferenceMap);
    Integer CommitmentReferenceSortOrder = DataHelper.getSortOrder(CommitmentReferenceMap);
    if (CommitmentReferenceFetch != null) out.setCommitmentReferenceFetch(CommitmentReferenceFetch);
    if (CommitmentReferenceSortDir != null) out.setCommitmentReferenceSortDirection(CommitmentReferenceSortDir);
    if (CommitmentReferenceSortOrder != null) out.setCommitmentReferenceSortOrder(CommitmentReferenceSortOrder);

    Filter[] CommitmentReferenceFilter = DataHelper.mapToFilterArray(CommitmentReferenceMap, Integer.class);
    if (CommitmentReferenceFilter != null) {
      IntegerFilter[] CommitmentReferenceFilters = new IntegerFilter[CommitmentReferenceFilter.length];
      for (int i = 0; i < CommitmentReferenceFilters.length; i++) {
        CommitmentReferenceFilters[i] = (IntegerFilter)CommitmentReferenceFilter[i];
      }
      try {
        out.setCommitmentReferenceFilter(CommitmentReferenceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionCodeMap = (Map)record.get("DescriptionCode");
    Boolean DescriptionCodeFetch = DataHelper.getFetch(DescriptionCodeMap);
    Boolean DescriptionCodeSortDir = DataHelper.getSortDirection(DescriptionCodeMap);
    Integer DescriptionCodeSortOrder = DataHelper.getSortOrder(DescriptionCodeMap);
    if (DescriptionCodeFetch != null) out.setDescriptionCodeFetch(DescriptionCodeFetch);
    if (DescriptionCodeSortDir != null) out.setDescriptionCodeSortDirection(DescriptionCodeSortDir);
    if (DescriptionCodeSortOrder != null) out.setDescriptionCodeSortOrder(DescriptionCodeSortOrder);

    Filter[] DescriptionCodeFilter = DataHelper.mapToFilterArray(DescriptionCodeMap, Integer.class);
    if (DescriptionCodeFilter != null) {
      IntegerFilter[] DescriptionCodeFilters = new IntegerFilter[DescriptionCodeFilter.length];
      for (int i = 0; i < DescriptionCodeFilters.length; i++) {
        DescriptionCodeFilters[i] = (IntegerFilter)DescriptionCodeFilter[i];
      }
      try {
        out.setDescriptionCodeFilter(DescriptionCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartDtMap = (Map)record.get("StartDt");
    Boolean StartDtFetch = DataHelper.getFetch(StartDtMap);
    Boolean StartDtSortDir = DataHelper.getSortDirection(StartDtMap);
    Integer StartDtSortOrder = DataHelper.getSortOrder(StartDtMap);
    if (StartDtFetch != null) out.setStartDtFetch(StartDtFetch);
    if (StartDtSortDir != null) out.setStartDtSortDirection(StartDtSortDir);
    if (StartDtSortOrder != null) out.setStartDtSortOrder(StartDtSortOrder);

    Filter[] StartDtFilter = DataHelper.mapToFilterArray(StartDtMap, Date.class);
    if (StartDtFilter != null) {
      DateFilter[] StartDtFilters = new DateFilter[StartDtFilter.length];
      for (int i = 0; i < StartDtFilters.length; i++) {
        StartDtFilters[i] = (DateFilter)StartDtFilter[i];
      }
      try {
        out.setStartDtFilter(StartDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EndDtMap = (Map)record.get("EndDt");
    Boolean EndDtFetch = DataHelper.getFetch(EndDtMap);
    Boolean EndDtSortDir = DataHelper.getSortDirection(EndDtMap);
    Integer EndDtSortOrder = DataHelper.getSortOrder(EndDtMap);
    if (EndDtFetch != null) out.setEndDtFetch(EndDtFetch);
    if (EndDtSortDir != null) out.setEndDtSortDirection(EndDtSortDir);
    if (EndDtSortOrder != null) out.setEndDtSortOrder(EndDtSortOrder);

    Filter[] EndDtFilter = DataHelper.mapToFilterArray(EndDtMap, Date.class);
    if (EndDtFilter != null) {
      DateFilter[] EndDtFilters = new DateFilter[EndDtFilter.length];
      for (int i = 0; i < EndDtFilters.length; i++) {
        EndDtFilters[i] = (DateFilter)EndDtFilter[i];
      }
      try {
        out.setEndDtFilter(EndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractLevelMap = (Map)record.get("ContractLevel");
    Boolean ContractLevelFetch = DataHelper.getFetch(ContractLevelMap);
    Boolean ContractLevelSortDir = DataHelper.getSortDirection(ContractLevelMap);
    Integer ContractLevelSortOrder = DataHelper.getSortOrder(ContractLevelMap);
    if (ContractLevelFetch != null) out.setContractLevelFetch(ContractLevelFetch);
    if (ContractLevelSortDir != null) out.setContractLevelSortDirection(ContractLevelSortDir);
    if (ContractLevelSortOrder != null) out.setContractLevelSortOrder(ContractLevelSortOrder);

    Filter[] ContractLevelFilter = DataHelper.mapToFilterArray(ContractLevelMap, Integer.class);
    if (ContractLevelFilter != null) {
      IntegerFilter[] ContractLevelFilters = new IntegerFilter[ContractLevelFilter.length];
      for (int i = 0; i < ContractLevelFilters.length; i++) {
        ContractLevelFilters[i] = (IntegerFilter)ContractLevelFilter[i];
      }
      try {
        out.setContractLevelFilter(ContractLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTypeMap = (Map)record.get("ContractType");
    Boolean ContractTypeFetch = DataHelper.getFetch(ContractTypeMap);
    Boolean ContractTypeSortDir = DataHelper.getSortDirection(ContractTypeMap);
    Integer ContractTypeSortOrder = DataHelper.getSortOrder(ContractTypeMap);
    if (ContractTypeFetch != null) out.setContractTypeFetch(ContractTypeFetch);
    if (ContractTypeSortDir != null) out.setContractTypeSortDirection(ContractTypeSortDir);
    if (ContractTypeSortOrder != null) out.setContractTypeSortOrder(ContractTypeSortOrder);

    Filter[] ContractTypeFilter = DataHelper.mapToFilterArray(ContractTypeMap, Integer.class);
    if (ContractTypeFilter != null) {
      IntegerFilter[] ContractTypeFilters = new IntegerFilter[ContractTypeFilter.length];
      for (int i = 0; i < ContractTypeFilters.length; i++) {
        ContractTypeFilters[i] = (IntegerFilter)ContractTypeFilter[i];
      }
      try {
        out.setContractTypeFilter(ContractTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TerminationTypeIdNrcMap = (Map)record.get("TerminationTypeIdNrc");
    Boolean TerminationTypeIdNrcFetch = DataHelper.getFetch(TerminationTypeIdNrcMap);
    Boolean TerminationTypeIdNrcSortDir = DataHelper.getSortDirection(TerminationTypeIdNrcMap);
    Integer TerminationTypeIdNrcSortOrder = DataHelper.getSortOrder(TerminationTypeIdNrcMap);
    if (TerminationTypeIdNrcFetch != null) out.setTerminationTypeIdNrcFetch(TerminationTypeIdNrcFetch);
    if (TerminationTypeIdNrcSortDir != null) out.setTerminationTypeIdNrcSortDirection(TerminationTypeIdNrcSortDir);
    if (TerminationTypeIdNrcSortOrder != null) out.setTerminationTypeIdNrcSortOrder(TerminationTypeIdNrcSortOrder);

    Filter[] TerminationTypeIdNrcFilter = DataHelper.mapToFilterArray(TerminationTypeIdNrcMap, Integer.class);
    if (TerminationTypeIdNrcFilter != null) {
      IntegerFilter[] TerminationTypeIdNrcFilters = new IntegerFilter[TerminationTypeIdNrcFilter.length];
      for (int i = 0; i < TerminationTypeIdNrcFilters.length; i++) {
        TerminationTypeIdNrcFilters[i] = (IntegerFilter)TerminationTypeIdNrcFilter[i];
      }
      try {
        out.setTerminationTypeIdNrcFilter(TerminationTypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentTypeIdNrcMap = (Map)record.get("CommitmentTypeIdNrc");
    Boolean CommitmentTypeIdNrcFetch = DataHelper.getFetch(CommitmentTypeIdNrcMap);
    Boolean CommitmentTypeIdNrcSortDir = DataHelper.getSortDirection(CommitmentTypeIdNrcMap);
    Integer CommitmentTypeIdNrcSortOrder = DataHelper.getSortOrder(CommitmentTypeIdNrcMap);
    if (CommitmentTypeIdNrcFetch != null) out.setCommitmentTypeIdNrcFetch(CommitmentTypeIdNrcFetch);
    if (CommitmentTypeIdNrcSortDir != null) out.setCommitmentTypeIdNrcSortDirection(CommitmentTypeIdNrcSortDir);
    if (CommitmentTypeIdNrcSortOrder != null) out.setCommitmentTypeIdNrcSortOrder(CommitmentTypeIdNrcSortOrder);

    Filter[] CommitmentTypeIdNrcFilter = DataHelper.mapToFilterArray(CommitmentTypeIdNrcMap, Integer.class);
    if (CommitmentTypeIdNrcFilter != null) {
      IntegerFilter[] CommitmentTypeIdNrcFilters = new IntegerFilter[CommitmentTypeIdNrcFilter.length];
      for (int i = 0; i < CommitmentTypeIdNrcFilters.length; i++) {
        CommitmentTypeIdNrcFilters[i] = (IntegerFilter)CommitmentTypeIdNrcFilter[i];
      }
      try {
        out.setCommitmentTypeIdNrcFilter(CommitmentTypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractCategoryMap = (Map)record.get("ContractCategory");
    Boolean ContractCategoryFetch = DataHelper.getFetch(ContractCategoryMap);
    Boolean ContractCategorySortDir = DataHelper.getSortDirection(ContractCategoryMap);
    Integer ContractCategorySortOrder = DataHelper.getSortOrder(ContractCategoryMap);
    if (ContractCategoryFetch != null) out.setContractCategoryFetch(ContractCategoryFetch);
    if (ContractCategorySortDir != null) out.setContractCategorySortDirection(ContractCategorySortDir);
    if (ContractCategorySortOrder != null) out.setContractCategorySortOrder(ContractCategorySortOrder);

    Filter[] ContractCategoryFilter = DataHelper.mapToFilterArray(ContractCategoryMap, Integer.class);
    if (ContractCategoryFilter != null) {
      IntegerFilter[] ContractCategoryFilters = new IntegerFilter[ContractCategoryFilter.length];
      for (int i = 0; i < ContractCategoryFilters.length; i++) {
        ContractCategoryFilters[i] = (IntegerFilter)ContractCategoryFilter[i];
      }
      try {
        out.setContractCategoryFilter(ContractCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
