/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InterimBillObjectHelper.java
 * Definition File: Customer/InterimBill.xml
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



/** Helper class to convert InterimBillObject JavaBean objects to/from HashMaps.
 */
public class InterimBillObjectHelper implements ArubaObjectHelper
{
  /** convert InterimBillObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InterimBillObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InterimBillObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InterimBillObject")
   * @return Map     the output Map
   */
  public static Map toMap (InterimBillObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InterimBillObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InterimBillObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InterimBillObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InterimBillObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InterimBillObject")
   * @return Map     the output Map
   */
  public static Map toMap (InterimBillObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InterimBillObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InterimBillObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InterimBillObjectData the converted object
   */
  public static InterimBillObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InterimBillObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InterimBillObject")
   * @return InterimBillObjectData the converted object
   */
  public static InterimBillObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InterimBillObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InterimBillObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InterimBillObjectFilter the converted object
   */
  public static InterimBillObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InterimBillObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InterimBillObject")
   * @return InterimBillObjectFilter the converted object
   */
  public static InterimBillObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InterimBillObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InterimBillObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InterimBillObjectDataList the converted object
   */
  public static InterimBillObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InterimBillObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InterimBillObjectList")
   * @return InterimBillObjectDataList the converted object
   */
  public static InterimBillObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InterimBillObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InterimBillObjectData[] array = null;
    if (root != null)
    {
      array = new InterimBillObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InterimBillObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InterimBillObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InterimBillObjectDataList (array, index, total);
  }
  /** convert InterimBillObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InterimBillObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", InterimBillObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._HotReqStatusQueueSet) record.put ("HotReqStatusQueue", in.HotReqStatusQueue);
  
    if (in._HotReqIdSet) record.put ("HotReqId", in.HotReqId);
  
    if (in._HotReqReturnCustomSet) record.put ("HotReqReturnCustom", in.HotReqReturnCustom);
  
    if (in._HotReqReturnStatusSet) record.put ("HotReqReturnStatus", in.HotReqReturnStatus);
  
    if (in._HotReqBillRefNoSet) record.put ("HotReqBillRefNo", in.HotReqBillRefNo);
  
    if (in._HotReqBillRefResetsSet) record.put ("HotReqBillRefResets", in.HotReqBillRefResets);
  
    if (in._HotReqPollTimeoutSet) record.put ("HotReqPollTimeout", in.HotReqPollTimeout);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._InterimBillDateSet) record.put ("InterimBillDate", in.InterimBillDate);
  
    if (in._IncludeNrcSet) record.put ("IncludeNrc", in.IncludeNrc);
  
    if (in._IncludeRcSet) record.put ("IncludeRc", in.IncludeRc);
  
    if (in._IncludeAdjSet) record.put ("IncludeAdj", in.IncludeAdj);
  
    if (in._IncludeUsageSet) record.put ("IncludeUsage", in.IncludeUsage);
  
    if (in._IncludePaymentSet) record.put ("IncludePayment", in.IncludePayment);
  
    if (in._WarmBillFlagSet) record.put ("WarmBillFlag", in.WarmBillFlag);
  
    if (in._ProformaBillFlagSet) record.put ("ProformaBillFlag", in.ProformaBillFlag);
  
    if (in._FormatStatusSet) record.put ("FormatStatus", in.FormatStatus);
  
    if (in._BillOrderNumberSet) record.put ("BillOrderNumber", in.BillOrderNumber);
  
    if (in._OverrideDatesSet) record.put ("OverrideDates", in.OverrideDates);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
      return record;
  }
  /** convert InterimBillObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InterimBillObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", InterimBillObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.HotReqStatusQueue, in.HotReqStatusQueueSort, in.HotReqStatusQueueSortAscending, in.HotReqStatusQueueFetch, in.HotReqStatusQueueCaseInsensitive); 
      if (map != null) record.put ("HotReqStatusQueue", map);
      map = DataHelper.filterToMap (in.HotReqId, in.HotReqIdSort, in.HotReqIdSortAscending, in.HotReqIdFetch); 
      if (map != null) record.put ("HotReqId", map);
      map = DataHelper.filterToMap (in.HotReqReturnCustom, in.HotReqReturnCustomSort, in.HotReqReturnCustomSortAscending, in.HotReqReturnCustomFetch); 
      if (map != null) record.put ("HotReqReturnCustom", map);
      map = DataHelper.filterToMap (in.HotReqReturnStatus, in.HotReqReturnStatusSort, in.HotReqReturnStatusSortAscending, in.HotReqReturnStatusFetch); 
      if (map != null) record.put ("HotReqReturnStatus", map);
      map = DataHelper.filterToMap (in.HotReqBillRefNo, in.HotReqBillRefNoSort, in.HotReqBillRefNoSortAscending, in.HotReqBillRefNoFetch); 
      if (map != null) record.put ("HotReqBillRefNo", map);
      map = DataHelper.filterToMap (in.HotReqBillRefResets, in.HotReqBillRefResetsSort, in.HotReqBillRefResetsSortAscending, in.HotReqBillRefResetsFetch); 
      if (map != null) record.put ("HotReqBillRefResets", map);
      map = DataHelper.filterToMap (in.HotReqPollTimeout, in.HotReqPollTimeoutSort, in.HotReqPollTimeoutSortAscending, in.HotReqPollTimeoutFetch); 
      if (map != null) record.put ("HotReqPollTimeout", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.InterimBillDate, in.InterimBillDateSort, in.InterimBillDateSortAscending, in.InterimBillDateFetch);
      if (map != null) record.put ("InterimBillDate", map);
      map = DataHelper.filterToMap (in.IncludeNrc, in.IncludeNrcSort, in.IncludeNrcSortAscending, in.IncludeNrcFetch);
      if (map != null) record.put ("IncludeNrc", map);
      map = DataHelper.filterToMap (in.IncludeRc, in.IncludeRcSort, in.IncludeRcSortAscending, in.IncludeRcFetch);
      if (map != null) record.put ("IncludeRc", map);
      map = DataHelper.filterToMap (in.IncludeAdj, in.IncludeAdjSort, in.IncludeAdjSortAscending, in.IncludeAdjFetch);
      if (map != null) record.put ("IncludeAdj", map);
      map = DataHelper.filterToMap (in.IncludeUsage, in.IncludeUsageSort, in.IncludeUsageSortAscending, in.IncludeUsageFetch);
      if (map != null) record.put ("IncludeUsage", map);
      map = DataHelper.filterToMap (in.IncludePayment, in.IncludePaymentSort, in.IncludePaymentSortAscending, in.IncludePaymentFetch);
      if (map != null) record.put ("IncludePayment", map);
      map = DataHelper.filterToMap (in.WarmBillFlag, in.WarmBillFlagSort, in.WarmBillFlagSortAscending, in.WarmBillFlagFetch);
      if (map != null) record.put ("WarmBillFlag", map);
      map = DataHelper.filterToMap (in.ProformaBillFlag, in.ProformaBillFlagSort, in.ProformaBillFlagSortAscending, in.ProformaBillFlagFetch);
      if (map != null) record.put ("ProformaBillFlag", map);
      map = DataHelper.filterToMap (in.FormatStatus, in.FormatStatusSort, in.FormatStatusSortAscending, in.FormatStatusFetch);
      if (map != null) record.put ("FormatStatus", map);
      map = DataHelper.filterToMap (in.BillOrderNumber, in.BillOrderNumberSort, in.BillOrderNumberSortAscending, in.BillOrderNumberFetch, in.BillOrderNumberCaseInsensitive);
      if (map != null) record.put ("BillOrderNumber", map);
      map = DataHelper.filterToMap (in.OverrideDates, in.OverrideDatesSort, in.OverrideDatesSortAscending, in.OverrideDatesFetch);
      if (map != null) record.put ("OverrideDates", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.PaymentDueDate, in.PaymentDueDateSort, in.PaymentDueDateSortAscending, in.PaymentDueDateFetch);
      if (map != null) record.put ("PaymentDueDate", map);
    return record;
  }
  /** convert Map to InterimBillObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InterimBillObjectData the converted object
   */
  public static InterimBillObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InterimBillObjectData out = new InterimBillObjectData ();

    out.Key = InterimBillObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqStatusQueue")) != null)
    {
      out.HotReqStatusQueue = (String) obj;
    }
  
    if ((obj = record.get ("HotReqId")) != null)
    {
      out.HotReqId = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqReturnCustom")) != null)
    {
      out.HotReqReturnCustom = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqReturnStatus")) != null)
    {
      out.HotReqReturnStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqBillRefNo")) != null)
    {
      out.HotReqBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqBillRefResets")) != null)
    {
      out.HotReqBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqPollTimeout")) != null)
    {
      out.HotReqPollTimeout = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("InterimBillDate")) != null)
    {
      out.InterimBillDate = (Date) obj;
    }
  
    if ((obj = record.get ("IncludeNrc")) != null)
    {
      out.IncludeNrc = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeRc")) != null)
    {
      out.IncludeRc = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeAdj")) != null)
    {
      out.IncludeAdj = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeUsage")) != null)
    {
      out.IncludeUsage = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludePayment")) != null)
    {
      out.IncludePayment = (Boolean) obj;
    }
  
    if ((obj = record.get ("WarmBillFlag")) != null)
    {
      out.WarmBillFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProformaBillFlag")) != null)
    {
      out.ProformaBillFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("FormatStatus")) != null)
    {
      out.FormatStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("BillOrderNumber")) != null)
    {
      out.BillOrderNumber = (String) obj;
    }
  
    if ((obj = record.get ("OverrideDates")) != null)
    {
      out.OverrideDates = (Boolean) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("PaymentDueDate")) != null)
    {
      out.PaymentDueDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to InterimBillObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InterimBillObjectFilter the converted object
   */
  public static InterimBillObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InterimBillObjectFilter out = new InterimBillObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = InterimBillObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map InterimBillDateMap = (Map)record.get("InterimBillDate");
    Boolean InterimBillDateFetch = DataHelper.getFetch(InterimBillDateMap);
    Boolean InterimBillDateSortDir = DataHelper.getSortDirection(InterimBillDateMap);
    Integer InterimBillDateSortOrder = DataHelper.getSortOrder(InterimBillDateMap);
    if (InterimBillDateFetch != null) out.setInterimBillDateFetch(InterimBillDateFetch);
    if (InterimBillDateSortDir != null) out.setInterimBillDateSortDirection(InterimBillDateSortDir);
    if (InterimBillDateSortOrder != null) out.setInterimBillDateSortOrder(InterimBillDateSortOrder);

    Filter[] InterimBillDateFilter = DataHelper.mapToFilterArray(InterimBillDateMap, Date.class);
    if (InterimBillDateFilter != null) {
      DateFilter[] InterimBillDateFilters = new DateFilter[InterimBillDateFilter.length];
      for (int i = 0; i < InterimBillDateFilters.length; i++) {
        InterimBillDateFilters[i] = (DateFilter)InterimBillDateFilter[i];
      }
      try {
        out.setInterimBillDateFilter(InterimBillDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeNrcMap = (Map)record.get("IncludeNrc");
    Boolean IncludeNrcFetch = DataHelper.getFetch(IncludeNrcMap);
    Boolean IncludeNrcSortDir = DataHelper.getSortDirection(IncludeNrcMap);
    Integer IncludeNrcSortOrder = DataHelper.getSortOrder(IncludeNrcMap);
    if (IncludeNrcFetch != null) out.setIncludeNrcFetch(IncludeNrcFetch);
    if (IncludeNrcSortDir != null) out.setIncludeNrcSortDirection(IncludeNrcSortDir);
    if (IncludeNrcSortOrder != null) out.setIncludeNrcSortOrder(IncludeNrcSortOrder);

    Filter[] IncludeNrcFilter = DataHelper.mapToFilterArray(IncludeNrcMap, Boolean.class);
    if (IncludeNrcFilter != null) {
      BooleanFilter[] IncludeNrcFilters = new BooleanFilter[IncludeNrcFilter.length];
      for (int i = 0; i < IncludeNrcFilters.length; i++) {
        IncludeNrcFilters[i] = (BooleanFilter)IncludeNrcFilter[i];
      }
      try {
        out.setIncludeNrcFilter(IncludeNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeRcMap = (Map)record.get("IncludeRc");
    Boolean IncludeRcFetch = DataHelper.getFetch(IncludeRcMap);
    Boolean IncludeRcSortDir = DataHelper.getSortDirection(IncludeRcMap);
    Integer IncludeRcSortOrder = DataHelper.getSortOrder(IncludeRcMap);
    if (IncludeRcFetch != null) out.setIncludeRcFetch(IncludeRcFetch);
    if (IncludeRcSortDir != null) out.setIncludeRcSortDirection(IncludeRcSortDir);
    if (IncludeRcSortOrder != null) out.setIncludeRcSortOrder(IncludeRcSortOrder);

    Filter[] IncludeRcFilter = DataHelper.mapToFilterArray(IncludeRcMap, Boolean.class);
    if (IncludeRcFilter != null) {
      BooleanFilter[] IncludeRcFilters = new BooleanFilter[IncludeRcFilter.length];
      for (int i = 0; i < IncludeRcFilters.length; i++) {
        IncludeRcFilters[i] = (BooleanFilter)IncludeRcFilter[i];
      }
      try {
        out.setIncludeRcFilter(IncludeRcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeAdjMap = (Map)record.get("IncludeAdj");
    Boolean IncludeAdjFetch = DataHelper.getFetch(IncludeAdjMap);
    Boolean IncludeAdjSortDir = DataHelper.getSortDirection(IncludeAdjMap);
    Integer IncludeAdjSortOrder = DataHelper.getSortOrder(IncludeAdjMap);
    if (IncludeAdjFetch != null) out.setIncludeAdjFetch(IncludeAdjFetch);
    if (IncludeAdjSortDir != null) out.setIncludeAdjSortDirection(IncludeAdjSortDir);
    if (IncludeAdjSortOrder != null) out.setIncludeAdjSortOrder(IncludeAdjSortOrder);

    Filter[] IncludeAdjFilter = DataHelper.mapToFilterArray(IncludeAdjMap, Boolean.class);
    if (IncludeAdjFilter != null) {
      BooleanFilter[] IncludeAdjFilters = new BooleanFilter[IncludeAdjFilter.length];
      for (int i = 0; i < IncludeAdjFilters.length; i++) {
        IncludeAdjFilters[i] = (BooleanFilter)IncludeAdjFilter[i];
      }
      try {
        out.setIncludeAdjFilter(IncludeAdjFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeUsageMap = (Map)record.get("IncludeUsage");
    Boolean IncludeUsageFetch = DataHelper.getFetch(IncludeUsageMap);
    Boolean IncludeUsageSortDir = DataHelper.getSortDirection(IncludeUsageMap);
    Integer IncludeUsageSortOrder = DataHelper.getSortOrder(IncludeUsageMap);
    if (IncludeUsageFetch != null) out.setIncludeUsageFetch(IncludeUsageFetch);
    if (IncludeUsageSortDir != null) out.setIncludeUsageSortDirection(IncludeUsageSortDir);
    if (IncludeUsageSortOrder != null) out.setIncludeUsageSortOrder(IncludeUsageSortOrder);

    Filter[] IncludeUsageFilter = DataHelper.mapToFilterArray(IncludeUsageMap, Boolean.class);
    if (IncludeUsageFilter != null) {
      BooleanFilter[] IncludeUsageFilters = new BooleanFilter[IncludeUsageFilter.length];
      for (int i = 0; i < IncludeUsageFilters.length; i++) {
        IncludeUsageFilters[i] = (BooleanFilter)IncludeUsageFilter[i];
      }
      try {
        out.setIncludeUsageFilter(IncludeUsageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludePaymentMap = (Map)record.get("IncludePayment");
    Boolean IncludePaymentFetch = DataHelper.getFetch(IncludePaymentMap);
    Boolean IncludePaymentSortDir = DataHelper.getSortDirection(IncludePaymentMap);
    Integer IncludePaymentSortOrder = DataHelper.getSortOrder(IncludePaymentMap);
    if (IncludePaymentFetch != null) out.setIncludePaymentFetch(IncludePaymentFetch);
    if (IncludePaymentSortDir != null) out.setIncludePaymentSortDirection(IncludePaymentSortDir);
    if (IncludePaymentSortOrder != null) out.setIncludePaymentSortOrder(IncludePaymentSortOrder);

    Filter[] IncludePaymentFilter = DataHelper.mapToFilterArray(IncludePaymentMap, Boolean.class);
    if (IncludePaymentFilter != null) {
      BooleanFilter[] IncludePaymentFilters = new BooleanFilter[IncludePaymentFilter.length];
      for (int i = 0; i < IncludePaymentFilters.length; i++) {
        IncludePaymentFilters[i] = (BooleanFilter)IncludePaymentFilter[i];
      }
      try {
        out.setIncludePaymentFilter(IncludePaymentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map WarmBillFlagMap = (Map)record.get("WarmBillFlag");
    Boolean WarmBillFlagFetch = DataHelper.getFetch(WarmBillFlagMap);
    Boolean WarmBillFlagSortDir = DataHelper.getSortDirection(WarmBillFlagMap);
    Integer WarmBillFlagSortOrder = DataHelper.getSortOrder(WarmBillFlagMap);
    if (WarmBillFlagFetch != null) out.setWarmBillFlagFetch(WarmBillFlagFetch);
    if (WarmBillFlagSortDir != null) out.setWarmBillFlagSortDirection(WarmBillFlagSortDir);
    if (WarmBillFlagSortOrder != null) out.setWarmBillFlagSortOrder(WarmBillFlagSortOrder);

    Filter[] WarmBillFlagFilter = DataHelper.mapToFilterArray(WarmBillFlagMap, Boolean.class);
    if (WarmBillFlagFilter != null) {
      BooleanFilter[] WarmBillFlagFilters = new BooleanFilter[WarmBillFlagFilter.length];
      for (int i = 0; i < WarmBillFlagFilters.length; i++) {
        WarmBillFlagFilters[i] = (BooleanFilter)WarmBillFlagFilter[i];
      }
      try {
        out.setWarmBillFlagFilter(WarmBillFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProformaBillFlagMap = (Map)record.get("ProformaBillFlag");
    Boolean ProformaBillFlagFetch = DataHelper.getFetch(ProformaBillFlagMap);
    Boolean ProformaBillFlagSortDir = DataHelper.getSortDirection(ProformaBillFlagMap);
    Integer ProformaBillFlagSortOrder = DataHelper.getSortOrder(ProformaBillFlagMap);
    if (ProformaBillFlagFetch != null) out.setProformaBillFlagFetch(ProformaBillFlagFetch);
    if (ProformaBillFlagSortDir != null) out.setProformaBillFlagSortDirection(ProformaBillFlagSortDir);
    if (ProformaBillFlagSortOrder != null) out.setProformaBillFlagSortOrder(ProformaBillFlagSortOrder);

    Filter[] ProformaBillFlagFilter = DataHelper.mapToFilterArray(ProformaBillFlagMap, Boolean.class);
    if (ProformaBillFlagFilter != null) {
      BooleanFilter[] ProformaBillFlagFilters = new BooleanFilter[ProformaBillFlagFilter.length];
      for (int i = 0; i < ProformaBillFlagFilters.length; i++) {
        ProformaBillFlagFilters[i] = (BooleanFilter)ProformaBillFlagFilter[i];
      }
      try {
        out.setProformaBillFlagFilter(ProformaBillFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FormatStatusMap = (Map)record.get("FormatStatus");
    Boolean FormatStatusFetch = DataHelper.getFetch(FormatStatusMap);
    Boolean FormatStatusSortDir = DataHelper.getSortDirection(FormatStatusMap);
    Integer FormatStatusSortOrder = DataHelper.getSortOrder(FormatStatusMap);
    if (FormatStatusFetch != null) out.setFormatStatusFetch(FormatStatusFetch);
    if (FormatStatusSortDir != null) out.setFormatStatusSortDirection(FormatStatusSortDir);
    if (FormatStatusSortOrder != null) out.setFormatStatusSortOrder(FormatStatusSortOrder);

    Filter[] FormatStatusFilter = DataHelper.mapToFilterArray(FormatStatusMap, Integer.class);
    if (FormatStatusFilter != null) {
      IntegerFilter[] FormatStatusFilters = new IntegerFilter[FormatStatusFilter.length];
      for (int i = 0; i < FormatStatusFilters.length; i++) {
        FormatStatusFilters[i] = (IntegerFilter)FormatStatusFilter[i];
      }
      try {
        out.setFormatStatusFilter(FormatStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillOrderNumberMap = (Map)record.get("BillOrderNumber");
    Boolean BillOrderNumberFetch = DataHelper.getFetch(BillOrderNumberMap);
    Boolean BillOrderNumberSortDir = DataHelper.getSortDirection(BillOrderNumberMap);
    Integer BillOrderNumberSortOrder = DataHelper.getSortOrder(BillOrderNumberMap);
    if (BillOrderNumberFetch != null) out.setBillOrderNumberFetch(BillOrderNumberFetch);
    if (BillOrderNumberSortDir != null) out.setBillOrderNumberSortDirection(BillOrderNumberSortDir);
    if (BillOrderNumberSortOrder != null) out.setBillOrderNumberSortOrder(BillOrderNumberSortOrder);

    Filter[] BillOrderNumberFilter = DataHelper.mapToFilterArray(BillOrderNumberMap, String.class);
    if (BillOrderNumberFilter != null) {
      StringFilter[] BillOrderNumberFilters = new StringFilter[BillOrderNumberFilter.length];
      for (int i = 0; i < BillOrderNumberFilters.length; i++) {
        BillOrderNumberFilters[i] = (StringFilter)BillOrderNumberFilter[i];
      }
      try {
        out.setBillOrderNumberFilter(BillOrderNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideDatesMap = (Map)record.get("OverrideDates");
    Boolean OverrideDatesFetch = DataHelper.getFetch(OverrideDatesMap);
    Boolean OverrideDatesSortDir = DataHelper.getSortDirection(OverrideDatesMap);
    Integer OverrideDatesSortOrder = DataHelper.getSortOrder(OverrideDatesMap);
    if (OverrideDatesFetch != null) out.setOverrideDatesFetch(OverrideDatesFetch);
    if (OverrideDatesSortDir != null) out.setOverrideDatesSortDirection(OverrideDatesSortDir);
    if (OverrideDatesSortOrder != null) out.setOverrideDatesSortOrder(OverrideDatesSortOrder);

    Filter[] OverrideDatesFilter = DataHelper.mapToFilterArray(OverrideDatesMap, Boolean.class);
    if (OverrideDatesFilter != null) {
      BooleanFilter[] OverrideDatesFilters = new BooleanFilter[OverrideDatesFilter.length];
      for (int i = 0; i < OverrideDatesFilters.length; i++) {
        OverrideDatesFilters[i] = (BooleanFilter)OverrideDatesFilter[i];
      }
      try {
        out.setOverrideDatesFilter(OverrideDatesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatementDateMap = (Map)record.get("StatementDate");
    Boolean StatementDateFetch = DataHelper.getFetch(StatementDateMap);
    Boolean StatementDateSortDir = DataHelper.getSortDirection(StatementDateMap);
    Integer StatementDateSortOrder = DataHelper.getSortOrder(StatementDateMap);
    if (StatementDateFetch != null) out.setStatementDateFetch(StatementDateFetch);
    if (StatementDateSortDir != null) out.setStatementDateSortDirection(StatementDateSortDir);
    if (StatementDateSortOrder != null) out.setStatementDateSortOrder(StatementDateSortOrder);

    Filter[] StatementDateFilter = DataHelper.mapToFilterArray(StatementDateMap, Date.class);
    if (StatementDateFilter != null) {
      DateFilter[] StatementDateFilters = new DateFilter[StatementDateFilter.length];
      for (int i = 0; i < StatementDateFilters.length; i++) {
        StatementDateFilters[i] = (DateFilter)StatementDateFilter[i];
      }
      try {
        out.setStatementDateFilter(StatementDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentDueDateMap = (Map)record.get("PaymentDueDate");
    Boolean PaymentDueDateFetch = DataHelper.getFetch(PaymentDueDateMap);
    Boolean PaymentDueDateSortDir = DataHelper.getSortDirection(PaymentDueDateMap);
    Integer PaymentDueDateSortOrder = DataHelper.getSortOrder(PaymentDueDateMap);
    if (PaymentDueDateFetch != null) out.setPaymentDueDateFetch(PaymentDueDateFetch);
    if (PaymentDueDateSortDir != null) out.setPaymentDueDateSortDirection(PaymentDueDateSortDir);
    if (PaymentDueDateSortOrder != null) out.setPaymentDueDateSortOrder(PaymentDueDateSortOrder);

    Filter[] PaymentDueDateFilter = DataHelper.mapToFilterArray(PaymentDueDateMap, Date.class);
    if (PaymentDueDateFilter != null) {
      DateFilter[] PaymentDueDateFilters = new DateFilter[PaymentDueDateFilter.length];
      for (int i = 0; i < PaymentDueDateFilters.length; i++) {
        PaymentDueDateFilters[i] = (DateFilter)PaymentDueDateFilter[i];
      }
      try {
        out.setPaymentDueDateFilter(PaymentDueDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
