/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceOnlyObjectHelper.java
 * Definition File: Customer/Invoice.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert InvoiceOnlyObject JavaBean objects to/from HashMaps.
 */
public class InvoiceOnlyObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceOnlyObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceOnlyObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceOnlyObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceOnlyObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceOnlyObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceOnlyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceOnlyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceOnlyObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceOnlyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceOnlyObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceOnlyObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceOnlyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceOnlyObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceOnlyObjectData the converted object
   */
  public static InvoiceOnlyObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceOnlyObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceOnlyObject")
   * @return InvoiceOnlyObjectData the converted object
   */
  public static InvoiceOnlyObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceOnlyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceOnlyObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceOnlyObjectFilter the converted object
   */
  public static InvoiceOnlyObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceOnlyObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceOnlyObject")
   * @return InvoiceOnlyObjectFilter the converted object
   */
  public static InvoiceOnlyObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceOnlyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceOnlyObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceOnlyObjectDataList the converted object
   */
  public static InvoiceOnlyObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceOnlyObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceOnlyObjectList")
   * @return InvoiceOnlyObjectDataList the converted object
   */
  public static InvoiceOnlyObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceOnlyObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceOnlyObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceOnlyObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceOnlyObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceOnlyObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceOnlyObjectDataList (array, index, total);
  }
  /** convert InvoiceOnlyObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceOnlyObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", InvoiceOnlyObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._PrepStatusSet) record.put ("PrepStatus", in.PrepStatus);
  
    if (in._OrigBillRefnoSet) record.put ("OrigBillRefno", in.OrigBillRefno);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._ToDateSet) record.put ("ToDate", in.ToDate);
  
    if (in._FromDateSet) record.put ("FromDate", in.FromDate);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
      return record;
  }
  /** convert InvoiceOnlyObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceOnlyObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", InvoiceOnlyObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.PrepStatus, in.PrepStatusSort, in.PrepStatusSortAscending, in.PrepStatusFetch);
      if (map != null) record.put ("PrepStatus", map);
      map = DataHelper.filterToMap (in.OrigBillRefno, in.OrigBillRefnoSort, in.OrigBillRefnoSortAscending, in.OrigBillRefnoFetch);
      if (map != null) record.put ("OrigBillRefno", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.ToDate, in.ToDateSort, in.ToDateSortAscending, in.ToDateFetch);
      if (map != null) record.put ("ToDate", map);
      map = DataHelper.filterToMap (in.FromDate, in.FromDateSort, in.FromDateSortAscending, in.FromDateFetch);
      if (map != null) record.put ("FromDate", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
    return record;
  }
  /** convert Map to InvoiceOnlyObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceOnlyObjectData the converted object
   */
  public static InvoiceOnlyObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceOnlyObjectData out = new InvoiceOnlyObjectData ();

    out.Key = InvoiceOnlyObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("PrepStatus")) != null)
    {
      out.PrepStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefno")) != null)
    {
      out.OrigBillRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefResets")) != null)
    {
      out.OrigBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ToDate")) != null)
    {
      out.ToDate = (Date) obj;
    }
  
    if ((obj = record.get ("FromDate")) != null)
    {
      out.FromDate = (Date) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to InvoiceOnlyObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceOnlyObjectFilter the converted object
   */
  public static InvoiceOnlyObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceOnlyObjectFilter out = new InvoiceOnlyObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = InvoiceOnlyObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map PrepStatusMap = (Map)record.get("PrepStatus");
    Boolean PrepStatusFetch = DataHelper.getFetch(PrepStatusMap);
    Boolean PrepStatusSortDir = DataHelper.getSortDirection(PrepStatusMap);
    Integer PrepStatusSortOrder = DataHelper.getSortOrder(PrepStatusMap);
    if (PrepStatusFetch != null) out.setPrepStatusFetch(PrepStatusFetch);
    if (PrepStatusSortDir != null) out.setPrepStatusSortDirection(PrepStatusSortDir);
    if (PrepStatusSortOrder != null) out.setPrepStatusSortOrder(PrepStatusSortOrder);

    Filter[] PrepStatusFilter = DataHelper.mapToFilterArray(PrepStatusMap, Integer.class);
    if (PrepStatusFilter != null) {
      IntegerFilter[] PrepStatusFilters = new IntegerFilter[PrepStatusFilter.length];
      for (int i = 0; i < PrepStatusFilters.length; i++) {
        PrepStatusFilters[i] = (IntegerFilter)PrepStatusFilter[i];
      }
      try {
        out.setPrepStatusFilter(PrepStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefnoMap = (Map)record.get("OrigBillRefno");
    Boolean OrigBillRefnoFetch = DataHelper.getFetch(OrigBillRefnoMap);
    Boolean OrigBillRefnoSortDir = DataHelper.getSortDirection(OrigBillRefnoMap);
    Integer OrigBillRefnoSortOrder = DataHelper.getSortOrder(OrigBillRefnoMap);
    if (OrigBillRefnoFetch != null) out.setOrigBillRefnoFetch(OrigBillRefnoFetch);
    if (OrigBillRefnoSortDir != null) out.setOrigBillRefnoSortDirection(OrigBillRefnoSortDir);
    if (OrigBillRefnoSortOrder != null) out.setOrigBillRefnoSortOrder(OrigBillRefnoSortOrder);

    Filter[] OrigBillRefnoFilter = DataHelper.mapToFilterArray(OrigBillRefnoMap, Integer.class);
    if (OrigBillRefnoFilter != null) {
      IntegerFilter[] OrigBillRefnoFilters = new IntegerFilter[OrigBillRefnoFilter.length];
      for (int i = 0; i < OrigBillRefnoFilters.length; i++) {
        OrigBillRefnoFilters[i] = (IntegerFilter)OrigBillRefnoFilter[i];
      }
      try {
        out.setOrigBillRefnoFilter(OrigBillRefnoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefResetsMap = (Map)record.get("OrigBillRefResets");
    Boolean OrigBillRefResetsFetch = DataHelper.getFetch(OrigBillRefResetsMap);
    Boolean OrigBillRefResetsSortDir = DataHelper.getSortDirection(OrigBillRefResetsMap);
    Integer OrigBillRefResetsSortOrder = DataHelper.getSortOrder(OrigBillRefResetsMap);
    if (OrigBillRefResetsFetch != null) out.setOrigBillRefResetsFetch(OrigBillRefResetsFetch);
    if (OrigBillRefResetsSortDir != null) out.setOrigBillRefResetsSortDirection(OrigBillRefResetsSortDir);
    if (OrigBillRefResetsSortOrder != null) out.setOrigBillRefResetsSortOrder(OrigBillRefResetsSortOrder);

    Filter[] OrigBillRefResetsFilter = DataHelper.mapToFilterArray(OrigBillRefResetsMap, Integer.class);
    if (OrigBillRefResetsFilter != null) {
      IntegerFilter[] OrigBillRefResetsFilters = new IntegerFilter[OrigBillRefResetsFilter.length];
      for (int i = 0; i < OrigBillRefResetsFilters.length; i++) {
        OrigBillRefResetsFilters[i] = (IntegerFilter)OrigBillRefResetsFilter[i];
      }
      try {
        out.setOrigBillRefResetsFilter(OrigBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ToDateMap = (Map)record.get("ToDate");
    Boolean ToDateFetch = DataHelper.getFetch(ToDateMap);
    Boolean ToDateSortDir = DataHelper.getSortDirection(ToDateMap);
    Integer ToDateSortOrder = DataHelper.getSortOrder(ToDateMap);
    if (ToDateFetch != null) out.setToDateFetch(ToDateFetch);
    if (ToDateSortDir != null) out.setToDateSortDirection(ToDateSortDir);
    if (ToDateSortOrder != null) out.setToDateSortOrder(ToDateSortOrder);

    Filter[] ToDateFilter = DataHelper.mapToFilterArray(ToDateMap, Date.class);
    if (ToDateFilter != null) {
      DateFilter[] ToDateFilters = new DateFilter[ToDateFilter.length];
      for (int i = 0; i < ToDateFilters.length; i++) {
        ToDateFilters[i] = (DateFilter)ToDateFilter[i];
      }
      try {
        out.setToDateFilter(ToDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FromDateMap = (Map)record.get("FromDate");
    Boolean FromDateFetch = DataHelper.getFetch(FromDateMap);
    Boolean FromDateSortDir = DataHelper.getSortDirection(FromDateMap);
    Integer FromDateSortOrder = DataHelper.getSortOrder(FromDateMap);
    if (FromDateFetch != null) out.setFromDateFetch(FromDateFetch);
    if (FromDateSortDir != null) out.setFromDateSortDirection(FromDateSortDir);
    if (FromDateSortOrder != null) out.setFromDateSortOrder(FromDateSortOrder);

    Filter[] FromDateFilter = DataHelper.mapToFilterArray(FromDateMap, Date.class);
    if (FromDateFilter != null) {
      DateFilter[] FromDateFilters = new DateFilter[FromDateFilter.length];
      for (int i = 0; i < FromDateFilters.length; i++) {
        FromDateFilters[i] = (DateFilter)FromDateFilter[i];
      }
      try {
        out.setFromDateFilter(FromDateFilters);
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
  
    return out;
  }
}
