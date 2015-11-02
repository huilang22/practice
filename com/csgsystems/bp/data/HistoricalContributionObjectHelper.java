/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionObjectHelper.java
 * Definition File: Customer/HistoricalContribution.xml
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



/** Helper class to convert HistoricalContributionObject JavaBean objects to/from HashMaps.
 */
public class HistoricalContributionObjectHelper implements ArubaObjectHelper
{
  /** convert HistoricalContributionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HistoricalContributionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalContributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalContributionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalContributionObjectData the converted object
   */
  public static HistoricalContributionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalContributionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionObject")
   * @return HistoricalContributionObjectData the converted object
   */
  public static HistoricalContributionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalContributionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalContributionObjectFilter the converted object
   */
  public static HistoricalContributionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalContributionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalContributionObject")
   * @return HistoricalContributionObjectFilter the converted object
   */
  public static HistoricalContributionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HistoricalContributionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HistoricalContributionObjectDataList the converted object
   */
  public static HistoricalContributionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HistoricalContributionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionObjectList")
   * @return HistoricalContributionObjectDataList the converted object
   */
  public static HistoricalContributionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HistoricalContributionObjectData[] array = null;
    if (root != null)
    {
      array = new HistoricalContributionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HistoricalContributionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HistoricalContributionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HistoricalContributionObjectDataList (array, index, total);
  }
  /** convert HistoricalContributionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalContributionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HistoricalContributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._DiscountQuantumSet) record.put ("DiscountQuantum", in.DiscountQuantum);
  
    if (in._QuantaSet) record.put ("Quanta", in.Quanta);
  
    if (in._TargetAmountSet) record.put ("TargetAmount", in.TargetAmount);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._EffectiveDateSet) record.put ("EffectiveDate", in.EffectiveDate);
  
    if (in._ProcessNameSet) record.put ("ProcessName", in.ProcessName);
  
    if (in._EvaluatedSet) record.put ("Evaluated", in.Evaluated);
  
    if (in._EvaluatedDateSet) record.put ("EvaluatedDate", in.EvaluatedDate);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
      return record;
  }
  /** convert HistoricalContributionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalContributionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HistoricalContributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.DiscountQuantum, in.DiscountQuantumSort, in.DiscountQuantumSortAscending, in.DiscountQuantumFetch);
      if (map != null) record.put ("DiscountQuantum", map);
      map = DataHelper.filterToMap (in.Quanta, in.QuantaSort, in.QuantaSortAscending, in.QuantaFetch);
      if (map != null) record.put ("Quanta", map);
      map = DataHelper.filterToMap (in.TargetAmount, in.TargetAmountSort, in.TargetAmountSortAscending, in.TargetAmountFetch);
      if (map != null) record.put ("TargetAmount", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.EffectiveDate, in.EffectiveDateSort, in.EffectiveDateSortAscending, in.EffectiveDateFetch);
      if (map != null) record.put ("EffectiveDate", map);
      map = DataHelper.filterToMap (in.ProcessName, in.ProcessNameSort, in.ProcessNameSortAscending, in.ProcessNameFetch, in.ProcessNameCaseInsensitive);
      if (map != null) record.put ("ProcessName", map);
      map = DataHelper.filterToMap (in.Evaluated, in.EvaluatedSort, in.EvaluatedSortAscending, in.EvaluatedFetch);
      if (map != null) record.put ("Evaluated", map);
      map = DataHelper.filterToMap (in.EvaluatedDate, in.EvaluatedDateSort, in.EvaluatedDateSortAscending, in.EvaluatedDateFetch);
      if (map != null) record.put ("EvaluatedDate", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
    return record;
  }
  /** convert Map to HistoricalContributionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionObjectData the converted object
   */
  public static HistoricalContributionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionObjectData out = new HistoricalContributionObjectData ();

    out.Key = HistoricalContributionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingId")) != null)
    {
      out.ContractTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingIdServ")) != null)
    {
      out.ContractTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountQuantum")) != null)
    {
      out.DiscountQuantum = (Integer) obj;
    }
  
    if ((obj = record.get ("Quanta")) != null)
    {
      out.Quanta = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TargetAmount")) != null)
    {
      out.TargetAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("EffectiveDate")) != null)
    {
      out.EffectiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("ProcessName")) != null)
    {
      out.ProcessName = (String) obj;
    }
  
    if ((obj = record.get ("Evaluated")) != null)
    {
      out.Evaluated = (Boolean) obj;
    }
  
    if ((obj = record.get ("EvaluatedDate")) != null)
    {
      out.EvaluatedDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
      return out;
  }
  /** convert Map to HistoricalContributionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionObjectFilter the converted object
   */
  public static HistoricalContributionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionObjectFilter out = new HistoricalContributionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HistoricalContributionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ContractTrackingIdMap = (Map)record.get("ContractTrackingId");
    Boolean ContractTrackingIdFetch = DataHelper.getFetch(ContractTrackingIdMap);
    Boolean ContractTrackingIdSortDir = DataHelper.getSortDirection(ContractTrackingIdMap);
    Integer ContractTrackingIdSortOrder = DataHelper.getSortOrder(ContractTrackingIdMap);
    if (ContractTrackingIdFetch != null) out.setContractTrackingIdFetch(ContractTrackingIdFetch);
    if (ContractTrackingIdSortDir != null) out.setContractTrackingIdSortDirection(ContractTrackingIdSortDir);
    if (ContractTrackingIdSortOrder != null) out.setContractTrackingIdSortOrder(ContractTrackingIdSortOrder);

    Filter[] ContractTrackingIdFilter = DataHelper.mapToFilterArray(ContractTrackingIdMap, Integer.class);
    if (ContractTrackingIdFilter != null) {
      IntegerFilter[] ContractTrackingIdFilters = new IntegerFilter[ContractTrackingIdFilter.length];
      for (int i = 0; i < ContractTrackingIdFilters.length; i++) {
        ContractTrackingIdFilters[i] = (IntegerFilter)ContractTrackingIdFilter[i];
      }
      try {
        out.setContractTrackingIdFilter(ContractTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdServMap = (Map)record.get("ContractTrackingIdServ");
    Boolean ContractTrackingIdServFetch = DataHelper.getFetch(ContractTrackingIdServMap);
    Boolean ContractTrackingIdServSortDir = DataHelper.getSortDirection(ContractTrackingIdServMap);
    Integer ContractTrackingIdServSortOrder = DataHelper.getSortOrder(ContractTrackingIdServMap);
    if (ContractTrackingIdServFetch != null) out.setContractTrackingIdServFetch(ContractTrackingIdServFetch);
    if (ContractTrackingIdServSortDir != null) out.setContractTrackingIdServSortDirection(ContractTrackingIdServSortDir);
    if (ContractTrackingIdServSortOrder != null) out.setContractTrackingIdServSortOrder(ContractTrackingIdServSortOrder);

    Filter[] ContractTrackingIdServFilter = DataHelper.mapToFilterArray(ContractTrackingIdServMap, Integer.class);
    if (ContractTrackingIdServFilter != null) {
      IntegerFilter[] ContractTrackingIdServFilters = new IntegerFilter[ContractTrackingIdServFilter.length];
      for (int i = 0; i < ContractTrackingIdServFilters.length; i++) {
        ContractTrackingIdServFilters[i] = (IntegerFilter)ContractTrackingIdServFilter[i];
      }
      try {
        out.setContractTrackingIdServFilter(ContractTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefNoMap = (Map)record.get("BillRefNo");
    Boolean BillRefNoFetch = DataHelper.getFetch(BillRefNoMap);
    Boolean BillRefNoSortDir = DataHelper.getSortDirection(BillRefNoMap);
    Integer BillRefNoSortOrder = DataHelper.getSortOrder(BillRefNoMap);
    if (BillRefNoFetch != null) out.setBillRefNoFetch(BillRefNoFetch);
    if (BillRefNoSortDir != null) out.setBillRefNoSortDirection(BillRefNoSortDir);
    if (BillRefNoSortOrder != null) out.setBillRefNoSortOrder(BillRefNoSortOrder);

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, Integer.class);
    if (BillRefNoFilter != null) {
      IntegerFilter[] BillRefNoFilters = new IntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (IntegerFilter)BillRefNoFilter[i];
      }
      try {
        out.setBillRefNoFilter(BillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResetsMap = (Map)record.get("BillRefResets");
    Boolean BillRefResetsFetch = DataHelper.getFetch(BillRefResetsMap);
    Boolean BillRefResetsSortDir = DataHelper.getSortDirection(BillRefResetsMap);
    Integer BillRefResetsSortOrder = DataHelper.getSortOrder(BillRefResetsMap);
    if (BillRefResetsFetch != null) out.setBillRefResetsFetch(BillRefResetsFetch);
    if (BillRefResetsSortDir != null) out.setBillRefResetsSortDirection(BillRefResetsSortDir);
    if (BillRefResetsSortOrder != null) out.setBillRefResetsSortOrder(BillRefResetsSortOrder);

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, Integer.class);
    if (BillRefResetsFilter != null) {
      IntegerFilter[] BillRefResetsFilters = new IntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (IntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountQuantumMap = (Map)record.get("DiscountQuantum");
    Boolean DiscountQuantumFetch = DataHelper.getFetch(DiscountQuantumMap);
    Boolean DiscountQuantumSortDir = DataHelper.getSortDirection(DiscountQuantumMap);
    Integer DiscountQuantumSortOrder = DataHelper.getSortOrder(DiscountQuantumMap);
    if (DiscountQuantumFetch != null) out.setDiscountQuantumFetch(DiscountQuantumFetch);
    if (DiscountQuantumSortDir != null) out.setDiscountQuantumSortDirection(DiscountQuantumSortDir);
    if (DiscountQuantumSortOrder != null) out.setDiscountQuantumSortOrder(DiscountQuantumSortOrder);

    Filter[] DiscountQuantumFilter = DataHelper.mapToFilterArray(DiscountQuantumMap, Integer.class);
    if (DiscountQuantumFilter != null) {
      IntegerFilter[] DiscountQuantumFilters = new IntegerFilter[DiscountQuantumFilter.length];
      for (int i = 0; i < DiscountQuantumFilters.length; i++) {
        DiscountQuantumFilters[i] = (IntegerFilter)DiscountQuantumFilter[i];
      }
      try {
        out.setDiscountQuantumFilter(DiscountQuantumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map QuantaMap = (Map)record.get("Quanta");
    Boolean QuantaFetch = DataHelper.getFetch(QuantaMap);
    Boolean QuantaSortDir = DataHelper.getSortDirection(QuantaMap);
    Integer QuantaSortOrder = DataHelper.getSortOrder(QuantaMap);
    if (QuantaFetch != null) out.setQuantaFetch(QuantaFetch);
    if (QuantaSortDir != null) out.setQuantaSortDirection(QuantaSortDir);
    if (QuantaSortOrder != null) out.setQuantaSortOrder(QuantaSortOrder);

    Filter[] QuantaFilter = DataHelper.mapToFilterArray(QuantaMap, BigInteger.class);
    if (QuantaFilter != null) {
      BigIntegerFilter[] QuantaFilters = new BigIntegerFilter[QuantaFilter.length];
      for (int i = 0; i < QuantaFilters.length; i++) {
        QuantaFilters[i] = (BigIntegerFilter)QuantaFilter[i];
      }
      try {
        out.setQuantaFilter(QuantaFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TargetAmountMap = (Map)record.get("TargetAmount");
    Boolean TargetAmountFetch = DataHelper.getFetch(TargetAmountMap);
    Boolean TargetAmountSortDir = DataHelper.getSortDirection(TargetAmountMap);
    Integer TargetAmountSortOrder = DataHelper.getSortOrder(TargetAmountMap);
    if (TargetAmountFetch != null) out.setTargetAmountFetch(TargetAmountFetch);
    if (TargetAmountSortDir != null) out.setTargetAmountSortDirection(TargetAmountSortDir);
    if (TargetAmountSortOrder != null) out.setTargetAmountSortOrder(TargetAmountSortOrder);

    Filter[] TargetAmountFilter = DataHelper.mapToFilterArray(TargetAmountMap, BigInteger.class);
    if (TargetAmountFilter != null) {
      BigIntegerFilter[] TargetAmountFilters = new BigIntegerFilter[TargetAmountFilter.length];
      for (int i = 0; i < TargetAmountFilters.length; i++) {
        TargetAmountFilters[i] = (BigIntegerFilter)TargetAmountFilter[i];
      }
      try {
        out.setTargetAmountFilter(TargetAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EffectiveDateMap = (Map)record.get("EffectiveDate");
    Boolean EffectiveDateFetch = DataHelper.getFetch(EffectiveDateMap);
    Boolean EffectiveDateSortDir = DataHelper.getSortDirection(EffectiveDateMap);
    Integer EffectiveDateSortOrder = DataHelper.getSortOrder(EffectiveDateMap);
    if (EffectiveDateFetch != null) out.setEffectiveDateFetch(EffectiveDateFetch);
    if (EffectiveDateSortDir != null) out.setEffectiveDateSortDirection(EffectiveDateSortDir);
    if (EffectiveDateSortOrder != null) out.setEffectiveDateSortOrder(EffectiveDateSortOrder);

    Filter[] EffectiveDateFilter = DataHelper.mapToFilterArray(EffectiveDateMap, Date.class);
    if (EffectiveDateFilter != null) {
      DateFilter[] EffectiveDateFilters = new DateFilter[EffectiveDateFilter.length];
      for (int i = 0; i < EffectiveDateFilters.length; i++) {
        EffectiveDateFilters[i] = (DateFilter)EffectiveDateFilter[i];
      }
      try {
        out.setEffectiveDateFilter(EffectiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProcessNameMap = (Map)record.get("ProcessName");
    Boolean ProcessNameFetch = DataHelper.getFetch(ProcessNameMap);
    Boolean ProcessNameSortDir = DataHelper.getSortDirection(ProcessNameMap);
    Integer ProcessNameSortOrder = DataHelper.getSortOrder(ProcessNameMap);
    if (ProcessNameFetch != null) out.setProcessNameFetch(ProcessNameFetch);
    if (ProcessNameSortDir != null) out.setProcessNameSortDirection(ProcessNameSortDir);
    if (ProcessNameSortOrder != null) out.setProcessNameSortOrder(ProcessNameSortOrder);

    Filter[] ProcessNameFilter = DataHelper.mapToFilterArray(ProcessNameMap, String.class);
    if (ProcessNameFilter != null) {
      StringFilter[] ProcessNameFilters = new StringFilter[ProcessNameFilter.length];
      for (int i = 0; i < ProcessNameFilters.length; i++) {
        ProcessNameFilters[i] = (StringFilter)ProcessNameFilter[i];
      }
      try {
        out.setProcessNameFilter(ProcessNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EvaluatedMap = (Map)record.get("Evaluated");
    Boolean EvaluatedFetch = DataHelper.getFetch(EvaluatedMap);
    Boolean EvaluatedSortDir = DataHelper.getSortDirection(EvaluatedMap);
    Integer EvaluatedSortOrder = DataHelper.getSortOrder(EvaluatedMap);
    if (EvaluatedFetch != null) out.setEvaluatedFetch(EvaluatedFetch);
    if (EvaluatedSortDir != null) out.setEvaluatedSortDirection(EvaluatedSortDir);
    if (EvaluatedSortOrder != null) out.setEvaluatedSortOrder(EvaluatedSortOrder);

    Filter[] EvaluatedFilter = DataHelper.mapToFilterArray(EvaluatedMap, Boolean.class);
    if (EvaluatedFilter != null) {
      BooleanFilter[] EvaluatedFilters = new BooleanFilter[EvaluatedFilter.length];
      for (int i = 0; i < EvaluatedFilters.length; i++) {
        EvaluatedFilters[i] = (BooleanFilter)EvaluatedFilter[i];
      }
      try {
        out.setEvaluatedFilter(EvaluatedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EvaluatedDateMap = (Map)record.get("EvaluatedDate");
    Boolean EvaluatedDateFetch = DataHelper.getFetch(EvaluatedDateMap);
    Boolean EvaluatedDateSortDir = DataHelper.getSortDirection(EvaluatedDateMap);
    Integer EvaluatedDateSortOrder = DataHelper.getSortOrder(EvaluatedDateMap);
    if (EvaluatedDateFetch != null) out.setEvaluatedDateFetch(EvaluatedDateFetch);
    if (EvaluatedDateSortDir != null) out.setEvaluatedDateSortDirection(EvaluatedDateSortDir);
    if (EvaluatedDateSortOrder != null) out.setEvaluatedDateSortOrder(EvaluatedDateSortOrder);

    Filter[] EvaluatedDateFilter = DataHelper.mapToFilterArray(EvaluatedDateMap, Date.class);
    if (EvaluatedDateFilter != null) {
      DateFilter[] EvaluatedDateFilters = new DateFilter[EvaluatedDateFilter.length];
      for (int i = 0; i < EvaluatedDateFilters.length; i++) {
        EvaluatedDateFilters[i] = (DateFilter)EvaluatedDateFilter[i];
      }
      try {
        out.setEvaluatedDateFilter(EvaluatedDateFilters);
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
  
    return out;
  }
}
