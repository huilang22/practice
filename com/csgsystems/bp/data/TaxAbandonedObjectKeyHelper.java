/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAbandonedObjectKeyHelper.java
 * Definition File: Customer/.xml
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

/** Helper class for TaxAbandonedObject's Key objects. */
public class TaxAbandonedObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TaxAbandonedObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAbandonedObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAbandonedObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TaxAbandonedObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAbandonedObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAbandonedObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxAbandonedObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TaxAbandonedObjectKeyData the converted object
   */
  public static TaxAbandonedObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxAbandonedObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxAbandonedObject")
   * @return TaxAbandonedObjectKeyData the converted object
   */
  public static TaxAbandonedObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxAbandonedObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TaxAbandonedObjectKeyFilter the converted object
   */
  public static TaxAbandonedObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxAbandonedObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxAbandonedObject")
   * @return TaxAbandonedObjectKeyFilter the converted object
   */
  public static TaxAbandonedObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TaxAbandonedObjectKeyData to a Map (not including the root).
  /** convert TaxAbandonedObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxAbandonedObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._BillInvoiceRowSet) record.put ("BillInvoiceRow", in.BillInvoiceRow);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._AbandonReasonSet) record.put ("AbandonReason", in.AbandonReason);
  
    return record;
  }
  /** convert TaxAbandonedObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxAbandonedObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.BillInvoiceRow, in.BillInvoiceRowSort, in.BillInvoiceRowSortAscending, in.BillInvoiceRowFetch);
      if (map != null) record.put ("BillInvoiceRow", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.AbandonReason, in.AbandonReasonSort, in.AbandonReasonSortAscending, in.AbandonReasonFetch);
      if (map != null) record.put ("AbandonReason", map);
    return record;
  }
  /** convert Map to TaxAbandonedObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAbandonedObjectKeyData the converted object
   */
  public static TaxAbandonedObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAbandonedObjectKeyData out = new TaxAbandonedObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
      out._BillRefNoSet = true;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
      out._BillRefResetsSet = true;
    }
  
    if ((obj = record.get ("BillInvoiceRow")) != null)
    {
      out.BillInvoiceRow = (Integer) obj;
      out._BillInvoiceRowSet = true;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
      out._TaxPkgInstIdSet = true;
    }
  
    if ((obj = record.get ("AbandonReason")) != null)
    {
      out.AbandonReason = (Integer) obj;
      out._AbandonReasonSet = true;
    }
  
    return out;
  }
  /** convert Map to TaxAbandonedObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAbandonedObjectKeyFilter the converted object
   */
  public static TaxAbandonedObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAbandonedObjectKeyFilter out = new TaxAbandonedObjectKeyFilter ();

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
  
    Map BillInvoiceRowMap = (Map)record.get("BillInvoiceRow");
    Boolean BillInvoiceRowFetch = DataHelper.getFetch(BillInvoiceRowMap);
    Boolean BillInvoiceRowSortDir = DataHelper.getSortDirection(BillInvoiceRowMap);
    Integer BillInvoiceRowSortOrder = DataHelper.getSortOrder(BillInvoiceRowMap);
    if (BillInvoiceRowFetch != null) out.setBillInvoiceRowFetch(BillInvoiceRowFetch);
    if (BillInvoiceRowSortDir != null) out.setBillInvoiceRowSortDirection(BillInvoiceRowSortDir);
    if (BillInvoiceRowSortOrder != null) out.setBillInvoiceRowSortOrder(BillInvoiceRowSortOrder);

    Filter[] BillInvoiceRowFilter = DataHelper.mapToFilterArray(BillInvoiceRowMap, Integer.class);
    if (BillInvoiceRowFilter != null) {
      IntegerFilter[] BillInvoiceRowFilters = new IntegerFilter[BillInvoiceRowFilter.length];
      for (int i = 0; i < BillInvoiceRowFilters.length; i++) {
        BillInvoiceRowFilters[i] = (IntegerFilter)BillInvoiceRowFilter[i];
      }
      try {
        out.setBillInvoiceRowFilter(BillInvoiceRowFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxPkgInstIdMap = (Map)record.get("TaxPkgInstId");
    Boolean TaxPkgInstIdFetch = DataHelper.getFetch(TaxPkgInstIdMap);
    Boolean TaxPkgInstIdSortDir = DataHelper.getSortDirection(TaxPkgInstIdMap);
    Integer TaxPkgInstIdSortOrder = DataHelper.getSortOrder(TaxPkgInstIdMap);
    if (TaxPkgInstIdFetch != null) out.setTaxPkgInstIdFetch(TaxPkgInstIdFetch);
    if (TaxPkgInstIdSortDir != null) out.setTaxPkgInstIdSortDirection(TaxPkgInstIdSortDir);
    if (TaxPkgInstIdSortOrder != null) out.setTaxPkgInstIdSortOrder(TaxPkgInstIdSortOrder);

    Filter[] TaxPkgInstIdFilter = DataHelper.mapToFilterArray(TaxPkgInstIdMap, Integer.class);
    if (TaxPkgInstIdFilter != null) {
      IntegerFilter[] TaxPkgInstIdFilters = new IntegerFilter[TaxPkgInstIdFilter.length];
      for (int i = 0; i < TaxPkgInstIdFilters.length; i++) {
        TaxPkgInstIdFilters[i] = (IntegerFilter)TaxPkgInstIdFilter[i];
      }
      try {
        out.setTaxPkgInstIdFilter(TaxPkgInstIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AbandonReasonMap = (Map)record.get("AbandonReason");
    Boolean AbandonReasonFetch = DataHelper.getFetch(AbandonReasonMap);
    Boolean AbandonReasonSortDir = DataHelper.getSortDirection(AbandonReasonMap);
    Integer AbandonReasonSortOrder = DataHelper.getSortOrder(AbandonReasonMap);
    if (AbandonReasonFetch != null) out.setAbandonReasonFetch(AbandonReasonFetch);
    if (AbandonReasonSortDir != null) out.setAbandonReasonSortDirection(AbandonReasonSortDir);
    if (AbandonReasonSortOrder != null) out.setAbandonReasonSortOrder(AbandonReasonSortOrder);

    Filter[] AbandonReasonFilter = DataHelper.mapToFilterArray(AbandonReasonMap, Integer.class);
    if (AbandonReasonFilter != null) {
      IntegerFilter[] AbandonReasonFilters = new IntegerFilter[AbandonReasonFilter.length];
      for (int i = 0; i < AbandonReasonFilters.length; i++) {
        AbandonReasonFilters[i] = (IntegerFilter)AbandonReasonFilter[i];
      }
      try {
        out.setAbandonReasonFilter(AbandonReasonFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
