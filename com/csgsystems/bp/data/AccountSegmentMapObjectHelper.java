/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentMapObjectHelper.java
 * Definition File: Admin/AccountSegmentMap.xml
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



/** Helper class to convert AccountSegmentMapObject JavaBean objects to/from HashMaps.
 */
public class AccountSegmentMapObjectHelper implements ArubaObjectHelper
{
  /** convert AccountSegmentMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountSegmentMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountSegmentMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountSegmentMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountSegmentMapObjectData the converted object
   */
  public static AccountSegmentMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountSegmentMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountSegmentMapObject")
   * @return AccountSegmentMapObjectData the converted object
   */
  public static AccountSegmentMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountSegmentMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountSegmentMapObjectFilter the converted object
   */
  public static AccountSegmentMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountSegmentMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountSegmentMapObject")
   * @return AccountSegmentMapObjectFilter the converted object
   */
  public static AccountSegmentMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountSegmentMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountSegmentMapObjectDataList the converted object
   */
  public static AccountSegmentMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountSegmentMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountSegmentMapObjectList")
   * @return AccountSegmentMapObjectDataList the converted object
   */
  public static AccountSegmentMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountSegmentMapObjectData[] array = null;
    if (root != null)
    {
      array = new AccountSegmentMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountSegmentMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountSegmentMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountSegmentMapObjectDataList (array, index, total);
  }
  /** convert AccountSegmentMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountSegmentMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountSegmentMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._MktCodeSet) record.put ("MktCode", in.MktCode);
  
    if (in._FranchiseCodeSet) record.put ("FranchiseCode", in.FranchiseCode);
  
    if (in._RevRcvCostCtrSet) record.put ("RevRcvCostCtr", in.RevRcvCostCtr);
  
    if (in._RemitServiceCenterSet) record.put ("RemitServiceCenter", in.RemitServiceCenter);
  
    if (in._BillingServiceCenterSet) record.put ("BillingServiceCenter", in.BillingServiceCenter);
  
    if (in._ServiceInquiryCenterSet) record.put ("ServiceInquiryCenter", in.ServiceInquiryCenter);
  
    if (in._CollectionsCenterSet) record.put ("CollectionsCenter", in.CollectionsCenter);
  
    if (in._MsgGrpIdSet) record.put ("MsgGrpId", in.MsgGrpId);
  
    if (in._InsertGrpIdSet) record.put ("InsertGrpId", in.InsertGrpId);
  
    if (in._VipCodeSet) record.put ("VipCode", in.VipCode);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert AccountSegmentMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountSegmentMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountSegmentMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.MktCode, in.MktCodeSort, in.MktCodeSortAscending, in.MktCodeFetch);
      if (map != null) record.put ("MktCode", map);
      map = DataHelper.filterToMap (in.FranchiseCode, in.FranchiseCodeSort, in.FranchiseCodeSortAscending, in.FranchiseCodeFetch);
      if (map != null) record.put ("FranchiseCode", map);
      map = DataHelper.filterToMap (in.RevRcvCostCtr, in.RevRcvCostCtrSort, in.RevRcvCostCtrSortAscending, in.RevRcvCostCtrFetch);
      if (map != null) record.put ("RevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.RemitServiceCenter, in.RemitServiceCenterSort, in.RemitServiceCenterSortAscending, in.RemitServiceCenterFetch);
      if (map != null) record.put ("RemitServiceCenter", map);
      map = DataHelper.filterToMap (in.BillingServiceCenter, in.BillingServiceCenterSort, in.BillingServiceCenterSortAscending, in.BillingServiceCenterFetch);
      if (map != null) record.put ("BillingServiceCenter", map);
      map = DataHelper.filterToMap (in.ServiceInquiryCenter, in.ServiceInquiryCenterSort, in.ServiceInquiryCenterSortAscending, in.ServiceInquiryCenterFetch);
      if (map != null) record.put ("ServiceInquiryCenter", map);
      map = DataHelper.filterToMap (in.CollectionsCenter, in.CollectionsCenterSort, in.CollectionsCenterSortAscending, in.CollectionsCenterFetch);
      if (map != null) record.put ("CollectionsCenter", map);
      map = DataHelper.filterToMap (in.MsgGrpId, in.MsgGrpIdSort, in.MsgGrpIdSortAscending, in.MsgGrpIdFetch);
      if (map != null) record.put ("MsgGrpId", map);
      map = DataHelper.filterToMap (in.InsertGrpId, in.InsertGrpIdSort, in.InsertGrpIdSortAscending, in.InsertGrpIdFetch);
      if (map != null) record.put ("InsertGrpId", map);
      map = DataHelper.filterToMap (in.VipCode, in.VipCodeSort, in.VipCodeSortAscending, in.VipCodeFetch);
      if (map != null) record.put ("VipCode", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to AccountSegmentMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentMapObjectData the converted object
   */
  public static AccountSegmentMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentMapObjectData out = new AccountSegmentMapObjectData ();

    out.Key = AccountSegmentMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("MktCode")) != null)
    {
      out.MktCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FranchiseCode")) != null)
    {
      out.FranchiseCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RevRcvCostCtr")) != null)
    {
      out.RevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("RemitServiceCenter")) != null)
    {
      out.RemitServiceCenter = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingServiceCenter")) != null)
    {
      out.BillingServiceCenter = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInquiryCenter")) != null)
    {
      out.ServiceInquiryCenter = (Integer) obj;
    }
  
    if ((obj = record.get ("CollectionsCenter")) != null)
    {
      out.CollectionsCenter = (Integer) obj;
    }
  
    if ((obj = record.get ("MsgGrpId")) != null)
    {
      out.MsgGrpId = (Integer) obj;
    }
  
    if ((obj = record.get ("InsertGrpId")) != null)
    {
      out.InsertGrpId = (Integer) obj;
    }
  
    if ((obj = record.get ("VipCode")) != null)
    {
      out.VipCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to AccountSegmentMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentMapObjectFilter the converted object
   */
  public static AccountSegmentMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentMapObjectFilter out = new AccountSegmentMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountSegmentMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map MktCodeMap = (Map)record.get("MktCode");
    Boolean MktCodeFetch = DataHelper.getFetch(MktCodeMap);
    Boolean MktCodeSortDir = DataHelper.getSortDirection(MktCodeMap);
    Integer MktCodeSortOrder = DataHelper.getSortOrder(MktCodeMap);
    if (MktCodeFetch != null) out.setMktCodeFetch(MktCodeFetch);
    if (MktCodeSortDir != null) out.setMktCodeSortDirection(MktCodeSortDir);
    if (MktCodeSortOrder != null) out.setMktCodeSortOrder(MktCodeSortOrder);

    Filter[] MktCodeFilter = DataHelper.mapToFilterArray(MktCodeMap, Integer.class);
    if (MktCodeFilter != null) {
      IntegerFilter[] MktCodeFilters = new IntegerFilter[MktCodeFilter.length];
      for (int i = 0; i < MktCodeFilters.length; i++) {
        MktCodeFilters[i] = (IntegerFilter)MktCodeFilter[i];
      }
      try {
        out.setMktCodeFilter(MktCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FranchiseCodeMap = (Map)record.get("FranchiseCode");
    Boolean FranchiseCodeFetch = DataHelper.getFetch(FranchiseCodeMap);
    Boolean FranchiseCodeSortDir = DataHelper.getSortDirection(FranchiseCodeMap);
    Integer FranchiseCodeSortOrder = DataHelper.getSortOrder(FranchiseCodeMap);
    if (FranchiseCodeFetch != null) out.setFranchiseCodeFetch(FranchiseCodeFetch);
    if (FranchiseCodeSortDir != null) out.setFranchiseCodeSortDirection(FranchiseCodeSortDir);
    if (FranchiseCodeSortOrder != null) out.setFranchiseCodeSortOrder(FranchiseCodeSortOrder);

    Filter[] FranchiseCodeFilter = DataHelper.mapToFilterArray(FranchiseCodeMap, Integer.class);
    if (FranchiseCodeFilter != null) {
      IntegerFilter[] FranchiseCodeFilters = new IntegerFilter[FranchiseCodeFilter.length];
      for (int i = 0; i < FranchiseCodeFilters.length; i++) {
        FranchiseCodeFilters[i] = (IntegerFilter)FranchiseCodeFilter[i];
      }
      try {
        out.setFranchiseCodeFilter(FranchiseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RevRcvCostCtrMap = (Map)record.get("RevRcvCostCtr");
    Boolean RevRcvCostCtrFetch = DataHelper.getFetch(RevRcvCostCtrMap);
    Boolean RevRcvCostCtrSortDir = DataHelper.getSortDirection(RevRcvCostCtrMap);
    Integer RevRcvCostCtrSortOrder = DataHelper.getSortOrder(RevRcvCostCtrMap);
    if (RevRcvCostCtrFetch != null) out.setRevRcvCostCtrFetch(RevRcvCostCtrFetch);
    if (RevRcvCostCtrSortDir != null) out.setRevRcvCostCtrSortDirection(RevRcvCostCtrSortDir);
    if (RevRcvCostCtrSortOrder != null) out.setRevRcvCostCtrSortOrder(RevRcvCostCtrSortOrder);

    Filter[] RevRcvCostCtrFilter = DataHelper.mapToFilterArray(RevRcvCostCtrMap, Integer.class);
    if (RevRcvCostCtrFilter != null) {
      IntegerFilter[] RevRcvCostCtrFilters = new IntegerFilter[RevRcvCostCtrFilter.length];
      for (int i = 0; i < RevRcvCostCtrFilters.length; i++) {
        RevRcvCostCtrFilters[i] = (IntegerFilter)RevRcvCostCtrFilter[i];
      }
      try {
        out.setRevRcvCostCtrFilter(RevRcvCostCtrFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RemitServiceCenterMap = (Map)record.get("RemitServiceCenter");
    Boolean RemitServiceCenterFetch = DataHelper.getFetch(RemitServiceCenterMap);
    Boolean RemitServiceCenterSortDir = DataHelper.getSortDirection(RemitServiceCenterMap);
    Integer RemitServiceCenterSortOrder = DataHelper.getSortOrder(RemitServiceCenterMap);
    if (RemitServiceCenterFetch != null) out.setRemitServiceCenterFetch(RemitServiceCenterFetch);
    if (RemitServiceCenterSortDir != null) out.setRemitServiceCenterSortDirection(RemitServiceCenterSortDir);
    if (RemitServiceCenterSortOrder != null) out.setRemitServiceCenterSortOrder(RemitServiceCenterSortOrder);

    Filter[] RemitServiceCenterFilter = DataHelper.mapToFilterArray(RemitServiceCenterMap, Integer.class);
    if (RemitServiceCenterFilter != null) {
      IntegerFilter[] RemitServiceCenterFilters = new IntegerFilter[RemitServiceCenterFilter.length];
      for (int i = 0; i < RemitServiceCenterFilters.length; i++) {
        RemitServiceCenterFilters[i] = (IntegerFilter)RemitServiceCenterFilter[i];
      }
      try {
        out.setRemitServiceCenterFilter(RemitServiceCenterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingServiceCenterMap = (Map)record.get("BillingServiceCenter");
    Boolean BillingServiceCenterFetch = DataHelper.getFetch(BillingServiceCenterMap);
    Boolean BillingServiceCenterSortDir = DataHelper.getSortDirection(BillingServiceCenterMap);
    Integer BillingServiceCenterSortOrder = DataHelper.getSortOrder(BillingServiceCenterMap);
    if (BillingServiceCenterFetch != null) out.setBillingServiceCenterFetch(BillingServiceCenterFetch);
    if (BillingServiceCenterSortDir != null) out.setBillingServiceCenterSortDirection(BillingServiceCenterSortDir);
    if (BillingServiceCenterSortOrder != null) out.setBillingServiceCenterSortOrder(BillingServiceCenterSortOrder);

    Filter[] BillingServiceCenterFilter = DataHelper.mapToFilterArray(BillingServiceCenterMap, Integer.class);
    if (BillingServiceCenterFilter != null) {
      IntegerFilter[] BillingServiceCenterFilters = new IntegerFilter[BillingServiceCenterFilter.length];
      for (int i = 0; i < BillingServiceCenterFilters.length; i++) {
        BillingServiceCenterFilters[i] = (IntegerFilter)BillingServiceCenterFilter[i];
      }
      try {
        out.setBillingServiceCenterFilter(BillingServiceCenterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInquiryCenterMap = (Map)record.get("ServiceInquiryCenter");
    Boolean ServiceInquiryCenterFetch = DataHelper.getFetch(ServiceInquiryCenterMap);
    Boolean ServiceInquiryCenterSortDir = DataHelper.getSortDirection(ServiceInquiryCenterMap);
    Integer ServiceInquiryCenterSortOrder = DataHelper.getSortOrder(ServiceInquiryCenterMap);
    if (ServiceInquiryCenterFetch != null) out.setServiceInquiryCenterFetch(ServiceInquiryCenterFetch);
    if (ServiceInquiryCenterSortDir != null) out.setServiceInquiryCenterSortDirection(ServiceInquiryCenterSortDir);
    if (ServiceInquiryCenterSortOrder != null) out.setServiceInquiryCenterSortOrder(ServiceInquiryCenterSortOrder);

    Filter[] ServiceInquiryCenterFilter = DataHelper.mapToFilterArray(ServiceInquiryCenterMap, Integer.class);
    if (ServiceInquiryCenterFilter != null) {
      IntegerFilter[] ServiceInquiryCenterFilters = new IntegerFilter[ServiceInquiryCenterFilter.length];
      for (int i = 0; i < ServiceInquiryCenterFilters.length; i++) {
        ServiceInquiryCenterFilters[i] = (IntegerFilter)ServiceInquiryCenterFilter[i];
      }
      try {
        out.setServiceInquiryCenterFilter(ServiceInquiryCenterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CollectionsCenterMap = (Map)record.get("CollectionsCenter");
    Boolean CollectionsCenterFetch = DataHelper.getFetch(CollectionsCenterMap);
    Boolean CollectionsCenterSortDir = DataHelper.getSortDirection(CollectionsCenterMap);
    Integer CollectionsCenterSortOrder = DataHelper.getSortOrder(CollectionsCenterMap);
    if (CollectionsCenterFetch != null) out.setCollectionsCenterFetch(CollectionsCenterFetch);
    if (CollectionsCenterSortDir != null) out.setCollectionsCenterSortDirection(CollectionsCenterSortDir);
    if (CollectionsCenterSortOrder != null) out.setCollectionsCenterSortOrder(CollectionsCenterSortOrder);

    Filter[] CollectionsCenterFilter = DataHelper.mapToFilterArray(CollectionsCenterMap, Integer.class);
    if (CollectionsCenterFilter != null) {
      IntegerFilter[] CollectionsCenterFilters = new IntegerFilter[CollectionsCenterFilter.length];
      for (int i = 0; i < CollectionsCenterFilters.length; i++) {
        CollectionsCenterFilters[i] = (IntegerFilter)CollectionsCenterFilter[i];
      }
      try {
        out.setCollectionsCenterFilter(CollectionsCenterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgGrpIdMap = (Map)record.get("MsgGrpId");
    Boolean MsgGrpIdFetch = DataHelper.getFetch(MsgGrpIdMap);
    Boolean MsgGrpIdSortDir = DataHelper.getSortDirection(MsgGrpIdMap);
    Integer MsgGrpIdSortOrder = DataHelper.getSortOrder(MsgGrpIdMap);
    if (MsgGrpIdFetch != null) out.setMsgGrpIdFetch(MsgGrpIdFetch);
    if (MsgGrpIdSortDir != null) out.setMsgGrpIdSortDirection(MsgGrpIdSortDir);
    if (MsgGrpIdSortOrder != null) out.setMsgGrpIdSortOrder(MsgGrpIdSortOrder);

    Filter[] MsgGrpIdFilter = DataHelper.mapToFilterArray(MsgGrpIdMap, Integer.class);
    if (MsgGrpIdFilter != null) {
      IntegerFilter[] MsgGrpIdFilters = new IntegerFilter[MsgGrpIdFilter.length];
      for (int i = 0; i < MsgGrpIdFilters.length; i++) {
        MsgGrpIdFilters[i] = (IntegerFilter)MsgGrpIdFilter[i];
      }
      try {
        out.setMsgGrpIdFilter(MsgGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InsertGrpIdMap = (Map)record.get("InsertGrpId");
    Boolean InsertGrpIdFetch = DataHelper.getFetch(InsertGrpIdMap);
    Boolean InsertGrpIdSortDir = DataHelper.getSortDirection(InsertGrpIdMap);
    Integer InsertGrpIdSortOrder = DataHelper.getSortOrder(InsertGrpIdMap);
    if (InsertGrpIdFetch != null) out.setInsertGrpIdFetch(InsertGrpIdFetch);
    if (InsertGrpIdSortDir != null) out.setInsertGrpIdSortDirection(InsertGrpIdSortDir);
    if (InsertGrpIdSortOrder != null) out.setInsertGrpIdSortOrder(InsertGrpIdSortOrder);

    Filter[] InsertGrpIdFilter = DataHelper.mapToFilterArray(InsertGrpIdMap, Integer.class);
    if (InsertGrpIdFilter != null) {
      IntegerFilter[] InsertGrpIdFilters = new IntegerFilter[InsertGrpIdFilter.length];
      for (int i = 0; i < InsertGrpIdFilters.length; i++) {
        InsertGrpIdFilters[i] = (IntegerFilter)InsertGrpIdFilter[i];
      }
      try {
        out.setInsertGrpIdFilter(InsertGrpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map VipCodeMap = (Map)record.get("VipCode");
    Boolean VipCodeFetch = DataHelper.getFetch(VipCodeMap);
    Boolean VipCodeSortDir = DataHelper.getSortDirection(VipCodeMap);
    Integer VipCodeSortOrder = DataHelper.getSortOrder(VipCodeMap);
    if (VipCodeFetch != null) out.setVipCodeFetch(VipCodeFetch);
    if (VipCodeSortDir != null) out.setVipCodeSortDirection(VipCodeSortDir);
    if (VipCodeSortOrder != null) out.setVipCodeSortOrder(VipCodeSortOrder);

    Filter[] VipCodeFilter = DataHelper.mapToFilterArray(VipCodeMap, Integer.class);
    if (VipCodeFilter != null) {
      IntegerFilter[] VipCodeFilters = new IntegerFilter[VipCodeFilter.length];
      for (int i = 0; i < VipCodeFilters.length; i++) {
        VipCodeFilters[i] = (IntegerFilter)VipCodeFilter[i];
      }
      try {
        out.setVipCodeFilter(VipCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassMap = (Map)record.get("RateClass");
    Boolean RateClassFetch = DataHelper.getFetch(RateClassMap);
    Boolean RateClassSortDir = DataHelper.getSortDirection(RateClassMap);
    Integer RateClassSortOrder = DataHelper.getSortOrder(RateClassMap);
    if (RateClassFetch != null) out.setRateClassFetch(RateClassFetch);
    if (RateClassSortDir != null) out.setRateClassSortDirection(RateClassSortDir);
    if (RateClassSortOrder != null) out.setRateClassSortOrder(RateClassSortOrder);

    Filter[] RateClassFilter = DataHelper.mapToFilterArray(RateClassMap, Integer.class);
    if (RateClassFilter != null) {
      IntegerFilter[] RateClassFilters = new IntegerFilter[RateClassFilter.length];
      for (int i = 0; i < RateClassFilters.length; i++) {
        RateClassFilters[i] = (IntegerFilter)RateClassFilter[i];
      }
      try {
        out.setRateClassFilter(RateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
