/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeDistribPercentObjectKeyHelper.java
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

/** Helper class for ChargeDistribPercentObject's Key objects. */
public class ChargeDistribPercentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ChargeDistribPercentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeDistribPercentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeDistribPercentObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ChargeDistribPercentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeDistribPercentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeDistribPercentObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ChargeDistribPercentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ChargeDistribPercentObjectKeyData the converted object
   */
  public static ChargeDistribPercentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ChargeDistribPercentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ChargeDistribPercentObject")
   * @return ChargeDistribPercentObjectKeyData the converted object
   */
  public static ChargeDistribPercentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ChargeDistribPercentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ChargeDistribPercentObjectKeyFilter the converted object
   */
  public static ChargeDistribPercentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ChargeDistribPercentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ChargeDistribPercentObject")
   * @return ChargeDistribPercentObjectKeyFilter the converted object
   */
  public static ChargeDistribPercentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ChargeDistribPercentObjectKeyData to a Map (not including the root).
  /** convert ChargeDistribPercentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ChargeDistribPercentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._DistribTypeSet) record.put ("DistribType", in.DistribType);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._ChargeEltTypeSet) record.put ("ChargeEltType", in.ChargeEltType);
  
    if (in._ChargeEltIdSet) record.put ("ChargeEltId", in.ChargeEltId);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    return record;
  }
  /** convert ChargeDistribPercentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ChargeDistribPercentObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.DistribType, in.DistribTypeSort, in.DistribTypeSortAscending, in.DistribTypeFetch);
      if (map != null) record.put ("DistribType", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.ChargeEltType, in.ChargeEltTypeSort, in.ChargeEltTypeSortAscending, in.ChargeEltTypeFetch);
      if (map != null) record.put ("ChargeEltType", map);
      map = DataHelper.filterToMap (in.ChargeEltId, in.ChargeEltIdSort, in.ChargeEltIdSortAscending, in.ChargeEltIdFetch);
      if (map != null) record.put ("ChargeEltId", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
    return record;
  }
  /** convert Map to ChargeDistribPercentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeDistribPercentObjectKeyData the converted object
   */
  public static ChargeDistribPercentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeDistribPercentObjectKeyData out = new ChargeDistribPercentObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("DistribType")) != null)
    {
      out.DistribType = (Integer) obj;
      out._DistribTypeSet = true;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
      out._TaxPkgInstIdSet = true;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
      out._ServiceInternalIdSet = true;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
      out._ServiceInternalIdResetsSet = true;
    }
  
    if ((obj = record.get ("ChargeEltType")) != null)
    {
      out.ChargeEltType = (Integer) obj;
      out._ChargeEltTypeSet = true;
    }
  
    if ((obj = record.get ("ChargeEltId")) != null)
    {
      out.ChargeEltId = (Integer) obj;
      out._ChargeEltIdSet = true;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
      out._ActiveDateSet = true;
    }
  
    return out;
  }
  /** convert Map to ChargeDistribPercentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeDistribPercentObjectKeyFilter the converted object
   */
  public static ChargeDistribPercentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeDistribPercentObjectKeyFilter out = new ChargeDistribPercentObjectKeyFilter ();

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
  
    Map DistribTypeMap = (Map)record.get("DistribType");
    Boolean DistribTypeFetch = DataHelper.getFetch(DistribTypeMap);
    Boolean DistribTypeSortDir = DataHelper.getSortDirection(DistribTypeMap);
    Integer DistribTypeSortOrder = DataHelper.getSortOrder(DistribTypeMap);
    if (DistribTypeFetch != null) out.setDistribTypeFetch(DistribTypeFetch);
    if (DistribTypeSortDir != null) out.setDistribTypeSortDirection(DistribTypeSortDir);
    if (DistribTypeSortOrder != null) out.setDistribTypeSortOrder(DistribTypeSortOrder);

    Filter[] DistribTypeFilter = DataHelper.mapToFilterArray(DistribTypeMap, Integer.class);
    if (DistribTypeFilter != null) {
      IntegerFilter[] DistribTypeFilters = new IntegerFilter[DistribTypeFilter.length];
      for (int i = 0; i < DistribTypeFilters.length; i++) {
        DistribTypeFilters[i] = (IntegerFilter)DistribTypeFilter[i];
      }
      try {
        out.setDistribTypeFilter(DistribTypeFilters);
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
  
    Map ChargeEltTypeMap = (Map)record.get("ChargeEltType");
    Boolean ChargeEltTypeFetch = DataHelper.getFetch(ChargeEltTypeMap);
    Boolean ChargeEltTypeSortDir = DataHelper.getSortDirection(ChargeEltTypeMap);
    Integer ChargeEltTypeSortOrder = DataHelper.getSortOrder(ChargeEltTypeMap);
    if (ChargeEltTypeFetch != null) out.setChargeEltTypeFetch(ChargeEltTypeFetch);
    if (ChargeEltTypeSortDir != null) out.setChargeEltTypeSortDirection(ChargeEltTypeSortDir);
    if (ChargeEltTypeSortOrder != null) out.setChargeEltTypeSortOrder(ChargeEltTypeSortOrder);

    Filter[] ChargeEltTypeFilter = DataHelper.mapToFilterArray(ChargeEltTypeMap, Integer.class);
    if (ChargeEltTypeFilter != null) {
      IntegerFilter[] ChargeEltTypeFilters = new IntegerFilter[ChargeEltTypeFilter.length];
      for (int i = 0; i < ChargeEltTypeFilters.length; i++) {
        ChargeEltTypeFilters[i] = (IntegerFilter)ChargeEltTypeFilter[i];
      }
      try {
        out.setChargeEltTypeFilter(ChargeEltTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeEltIdMap = (Map)record.get("ChargeEltId");
    Boolean ChargeEltIdFetch = DataHelper.getFetch(ChargeEltIdMap);
    Boolean ChargeEltIdSortDir = DataHelper.getSortDirection(ChargeEltIdMap);
    Integer ChargeEltIdSortOrder = DataHelper.getSortOrder(ChargeEltIdMap);
    if (ChargeEltIdFetch != null) out.setChargeEltIdFetch(ChargeEltIdFetch);
    if (ChargeEltIdSortDir != null) out.setChargeEltIdSortDirection(ChargeEltIdSortDir);
    if (ChargeEltIdSortOrder != null) out.setChargeEltIdSortOrder(ChargeEltIdSortOrder);

    Filter[] ChargeEltIdFilter = DataHelper.mapToFilterArray(ChargeEltIdMap, Integer.class);
    if (ChargeEltIdFilter != null) {
      IntegerFilter[] ChargeEltIdFilters = new IntegerFilter[ChargeEltIdFilter.length];
      for (int i = 0; i < ChargeEltIdFilters.length; i++) {
        ChargeEltIdFilters[i] = (IntegerFilter)ChargeEltIdFilter[i];
      }
      try {
        out.setChargeEltIdFilter(ChargeEltIdFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
