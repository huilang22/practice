/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OpenItemIdMapObjectHelper.java
 * Definition File: Customer/OpenItemIdMap.xml
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



/** Helper class to convert OpenItemIdMapObject JavaBean objects to/from HashMaps.
 */
public class OpenItemIdMapObjectHelper implements ArubaObjectHelper
{
  /** convert OpenItemIdMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (OpenItemIdMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OpenItemIdMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OpenItemIdMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (OpenItemIdMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OpenItemIdMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert OpenItemIdMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (OpenItemIdMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OpenItemIdMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OpenItemIdMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (OpenItemIdMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OpenItemIdMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to OpenItemIdMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return OpenItemIdMapObjectData the converted object
   */
  public static OpenItemIdMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to OpenItemIdMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "OpenItemIdMapObject")
   * @return OpenItemIdMapObjectData the converted object
   */
  public static OpenItemIdMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "OpenItemIdMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to OpenItemIdMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return OpenItemIdMapObjectFilter the converted object
   */
  public static OpenItemIdMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to OpenItemIdMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "OpenItemIdMapObject")
   * @return OpenItemIdMapObjectFilter the converted object
   */
  public static OpenItemIdMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "OpenItemIdMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to OpenItemIdMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return OpenItemIdMapObjectDataList the converted object
   */
  public static OpenItemIdMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to OpenItemIdMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "OpenItemIdMapObjectList")
   * @return OpenItemIdMapObjectDataList the converted object
   */
  public static OpenItemIdMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "OpenItemIdMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    OpenItemIdMapObjectData[] array = null;
    if (root != null)
    {
      array = new OpenItemIdMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = OpenItemIdMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new OpenItemIdMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new OpenItemIdMapObjectDataList (array, index, total);
  }
  /** convert OpenItemIdMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (OpenItemIdMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", OpenItemIdMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BalanceAccountExternalIdSet) record.put ("BalanceAccountExternalId", in.BalanceAccountExternalId);
  
    if (in._BalanceAccountExternalIdTypeSet) record.put ("BalanceAccountExternalIdType", in.BalanceAccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._ChargeElementTypeSet) record.put ("ChargeElementType", in.ChargeElementType);
  
    if (in._ChargeElementValueSet) record.put ("ChargeElementValue", in.ChargeElementValue);
  
    if (in._BalanceAccountInternalIdSet) record.put ("BalanceAccountInternalId", in.BalanceAccountInternalId);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._RatePeriodSet) record.put ("RatePeriod", in.RatePeriod);
  
    if (in._OrderLevelSet) record.put ("OrderLevel", in.OrderLevel);
  
    if (in._IneligibleSet) record.put ("Ineligible", in.Ineligible);
      return record;
  }
  /** convert OpenItemIdMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (OpenItemIdMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", OpenItemIdMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BalanceAccountExternalId, in.BalanceAccountExternalIdSort, in.BalanceAccountExternalIdSortAscending, in.BalanceAccountExternalIdFetch, in.BalanceAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("BalanceAccountExternalId", map);
      map = DataHelper.filterToMap (in.BalanceAccountExternalIdType, in.BalanceAccountExternalIdTypeSort, in.BalanceAccountExternalIdTypeSortAscending, in.BalanceAccountExternalIdTypeFetch);
      if (map != null) record.put ("BalanceAccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.ChargeElementType, in.ChargeElementTypeSort, in.ChargeElementTypeSortAscending, in.ChargeElementTypeFetch);
      if (map != null) record.put ("ChargeElementType", map);
      map = DataHelper.filterToMap (in.ChargeElementValue, in.ChargeElementValueSort, in.ChargeElementValueSortAscending, in.ChargeElementValueFetch);
      if (map != null) record.put ("ChargeElementValue", map);
      map = DataHelper.filterToMap (in.BalanceAccountInternalId, in.BalanceAccountInternalIdSort, in.BalanceAccountInternalIdSortAscending, in.BalanceAccountInternalIdFetch);
      if (map != null) record.put ("BalanceAccountInternalId", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.RatePeriod, in.RatePeriodSort, in.RatePeriodSortAscending, in.RatePeriodFetch, in.RatePeriodCaseInsensitive);
      if (map != null) record.put ("RatePeriod", map);
      map = DataHelper.filterToMap (in.OrderLevel, in.OrderLevelSort, in.OrderLevelSortAscending, in.OrderLevelFetch);
      if (map != null) record.put ("OrderLevel", map);
      map = DataHelper.filterToMap (in.Ineligible, in.IneligibleSort, in.IneligibleSortAscending, in.IneligibleFetch);
      if (map != null) record.put ("Ineligible", map);
    return record;
  }
  /** convert Map to OpenItemIdMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OpenItemIdMapObjectData the converted object
   */
  public static OpenItemIdMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OpenItemIdMapObjectData out = new OpenItemIdMapObjectData ();

    out.Key = OpenItemIdMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BalanceAccountExternalId")) != null)
    {
      out.BalanceAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("BalanceAccountExternalIdType")) != null)
    {
      out.BalanceAccountExternalIdType = (Integer) obj;
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
  
    if ((obj = record.get ("ChargeElementType")) != null)
    {
      out.ChargeElementType = (Integer) obj;
    }
  
    if ((obj = record.get ("ChargeElementValue")) != null)
    {
      out.ChargeElementValue = (Integer) obj;
    }
  
    if ((obj = record.get ("BalanceAccountInternalId")) != null)
    {
      out.BalanceAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("RatePeriod")) != null)
    {
      out.RatePeriod = (String) obj;
    }
  
    if ((obj = record.get ("OrderLevel")) != null)
    {
      out.OrderLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("Ineligible")) != null)
    {
      out.Ineligible = (Boolean) obj;
    }
      return out;
  }
  /** convert Map to OpenItemIdMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OpenItemIdMapObjectFilter the converted object
   */
  public static OpenItemIdMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OpenItemIdMapObjectFilter out = new OpenItemIdMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = OpenItemIdMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BalanceAccountExternalIdMap = (Map)record.get("BalanceAccountExternalId");
    Boolean BalanceAccountExternalIdFetch = DataHelper.getFetch(BalanceAccountExternalIdMap);
    Boolean BalanceAccountExternalIdSortDir = DataHelper.getSortDirection(BalanceAccountExternalIdMap);
    Integer BalanceAccountExternalIdSortOrder = DataHelper.getSortOrder(BalanceAccountExternalIdMap);
    if (BalanceAccountExternalIdFetch != null) out.setBalanceAccountExternalIdFetch(BalanceAccountExternalIdFetch);
    if (BalanceAccountExternalIdSortDir != null) out.setBalanceAccountExternalIdSortDirection(BalanceAccountExternalIdSortDir);
    if (BalanceAccountExternalIdSortOrder != null) out.setBalanceAccountExternalIdSortOrder(BalanceAccountExternalIdSortOrder);

    Filter[] BalanceAccountExternalIdFilter = DataHelper.mapToFilterArray(BalanceAccountExternalIdMap, String.class);
    if (BalanceAccountExternalIdFilter != null) {
      StringFilter[] BalanceAccountExternalIdFilters = new StringFilter[BalanceAccountExternalIdFilter.length];
      for (int i = 0; i < BalanceAccountExternalIdFilters.length; i++) {
        BalanceAccountExternalIdFilters[i] = (StringFilter)BalanceAccountExternalIdFilter[i];
      }
      try {
        out.setBalanceAccountExternalIdFilter(BalanceAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceAccountExternalIdTypeMap = (Map)record.get("BalanceAccountExternalIdType");
    Boolean BalanceAccountExternalIdTypeFetch = DataHelper.getFetch(BalanceAccountExternalIdTypeMap);
    Boolean BalanceAccountExternalIdTypeSortDir = DataHelper.getSortDirection(BalanceAccountExternalIdTypeMap);
    Integer BalanceAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(BalanceAccountExternalIdTypeMap);
    if (BalanceAccountExternalIdTypeFetch != null) out.setBalanceAccountExternalIdTypeFetch(BalanceAccountExternalIdTypeFetch);
    if (BalanceAccountExternalIdTypeSortDir != null) out.setBalanceAccountExternalIdTypeSortDirection(BalanceAccountExternalIdTypeSortDir);
    if (BalanceAccountExternalIdTypeSortOrder != null) out.setBalanceAccountExternalIdTypeSortOrder(BalanceAccountExternalIdTypeSortOrder);

    Filter[] BalanceAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(BalanceAccountExternalIdTypeMap, Integer.class);
    if (BalanceAccountExternalIdTypeFilter != null) {
      IntegerFilter[] BalanceAccountExternalIdTypeFilters = new IntegerFilter[BalanceAccountExternalIdTypeFilter.length];
      for (int i = 0; i < BalanceAccountExternalIdTypeFilters.length; i++) {
        BalanceAccountExternalIdTypeFilters[i] = (IntegerFilter)BalanceAccountExternalIdTypeFilter[i];
      }
      try {
        out.setBalanceAccountExternalIdTypeFilter(BalanceAccountExternalIdTypeFilters);
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
  
    Map ChargeElementTypeMap = (Map)record.get("ChargeElementType");
    Boolean ChargeElementTypeFetch = DataHelper.getFetch(ChargeElementTypeMap);
    Boolean ChargeElementTypeSortDir = DataHelper.getSortDirection(ChargeElementTypeMap);
    Integer ChargeElementTypeSortOrder = DataHelper.getSortOrder(ChargeElementTypeMap);
    if (ChargeElementTypeFetch != null) out.setChargeElementTypeFetch(ChargeElementTypeFetch);
    if (ChargeElementTypeSortDir != null) out.setChargeElementTypeSortDirection(ChargeElementTypeSortDir);
    if (ChargeElementTypeSortOrder != null) out.setChargeElementTypeSortOrder(ChargeElementTypeSortOrder);

    Filter[] ChargeElementTypeFilter = DataHelper.mapToFilterArray(ChargeElementTypeMap, Integer.class);
    if (ChargeElementTypeFilter != null) {
      IntegerFilter[] ChargeElementTypeFilters = new IntegerFilter[ChargeElementTypeFilter.length];
      for (int i = 0; i < ChargeElementTypeFilters.length; i++) {
        ChargeElementTypeFilters[i] = (IntegerFilter)ChargeElementTypeFilter[i];
      }
      try {
        out.setChargeElementTypeFilter(ChargeElementTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeElementValueMap = (Map)record.get("ChargeElementValue");
    Boolean ChargeElementValueFetch = DataHelper.getFetch(ChargeElementValueMap);
    Boolean ChargeElementValueSortDir = DataHelper.getSortDirection(ChargeElementValueMap);
    Integer ChargeElementValueSortOrder = DataHelper.getSortOrder(ChargeElementValueMap);
    if (ChargeElementValueFetch != null) out.setChargeElementValueFetch(ChargeElementValueFetch);
    if (ChargeElementValueSortDir != null) out.setChargeElementValueSortDirection(ChargeElementValueSortDir);
    if (ChargeElementValueSortOrder != null) out.setChargeElementValueSortOrder(ChargeElementValueSortOrder);

    Filter[] ChargeElementValueFilter = DataHelper.mapToFilterArray(ChargeElementValueMap, Integer.class);
    if (ChargeElementValueFilter != null) {
      IntegerFilter[] ChargeElementValueFilters = new IntegerFilter[ChargeElementValueFilter.length];
      for (int i = 0; i < ChargeElementValueFilters.length; i++) {
        ChargeElementValueFilters[i] = (IntegerFilter)ChargeElementValueFilter[i];
      }
      try {
        out.setChargeElementValueFilter(ChargeElementValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceAccountInternalIdMap = (Map)record.get("BalanceAccountInternalId");
    Boolean BalanceAccountInternalIdFetch = DataHelper.getFetch(BalanceAccountInternalIdMap);
    Boolean BalanceAccountInternalIdSortDir = DataHelper.getSortDirection(BalanceAccountInternalIdMap);
    Integer BalanceAccountInternalIdSortOrder = DataHelper.getSortOrder(BalanceAccountInternalIdMap);
    if (BalanceAccountInternalIdFetch != null) out.setBalanceAccountInternalIdFetch(BalanceAccountInternalIdFetch);
    if (BalanceAccountInternalIdSortDir != null) out.setBalanceAccountInternalIdSortDirection(BalanceAccountInternalIdSortDir);
    if (BalanceAccountInternalIdSortOrder != null) out.setBalanceAccountInternalIdSortOrder(BalanceAccountInternalIdSortOrder);

    Filter[] BalanceAccountInternalIdFilter = DataHelper.mapToFilterArray(BalanceAccountInternalIdMap, Integer.class);
    if (BalanceAccountInternalIdFilter != null) {
      IntegerFilter[] BalanceAccountInternalIdFilters = new IntegerFilter[BalanceAccountInternalIdFilter.length];
      for (int i = 0; i < BalanceAccountInternalIdFilters.length; i++) {
        BalanceAccountInternalIdFilters[i] = (IntegerFilter)BalanceAccountInternalIdFilter[i];
      }
      try {
        out.setBalanceAccountInternalIdFilter(BalanceAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
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
  
    Map RatePeriodMap = (Map)record.get("RatePeriod");
    Boolean RatePeriodFetch = DataHelper.getFetch(RatePeriodMap);
    Boolean RatePeriodSortDir = DataHelper.getSortDirection(RatePeriodMap);
    Integer RatePeriodSortOrder = DataHelper.getSortOrder(RatePeriodMap);
    if (RatePeriodFetch != null) out.setRatePeriodFetch(RatePeriodFetch);
    if (RatePeriodSortDir != null) out.setRatePeriodSortDirection(RatePeriodSortDir);
    if (RatePeriodSortOrder != null) out.setRatePeriodSortOrder(RatePeriodSortOrder);

    Filter[] RatePeriodFilter = DataHelper.mapToFilterArray(RatePeriodMap, String.class);
    if (RatePeriodFilter != null) {
      StringFilter[] RatePeriodFilters = new StringFilter[RatePeriodFilter.length];
      for (int i = 0; i < RatePeriodFilters.length; i++) {
        RatePeriodFilters[i] = (StringFilter)RatePeriodFilter[i];
      }
      try {
        out.setRatePeriodFilter(RatePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrderLevelMap = (Map)record.get("OrderLevel");
    Boolean OrderLevelFetch = DataHelper.getFetch(OrderLevelMap);
    Boolean OrderLevelSortDir = DataHelper.getSortDirection(OrderLevelMap);
    Integer OrderLevelSortOrder = DataHelper.getSortOrder(OrderLevelMap);
    if (OrderLevelFetch != null) out.setOrderLevelFetch(OrderLevelFetch);
    if (OrderLevelSortDir != null) out.setOrderLevelSortDirection(OrderLevelSortDir);
    if (OrderLevelSortOrder != null) out.setOrderLevelSortOrder(OrderLevelSortOrder);

    Filter[] OrderLevelFilter = DataHelper.mapToFilterArray(OrderLevelMap, Integer.class);
    if (OrderLevelFilter != null) {
      IntegerFilter[] OrderLevelFilters = new IntegerFilter[OrderLevelFilter.length];
      for (int i = 0; i < OrderLevelFilters.length; i++) {
        OrderLevelFilters[i] = (IntegerFilter)OrderLevelFilter[i];
      }
      try {
        out.setOrderLevelFilter(OrderLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IneligibleMap = (Map)record.get("Ineligible");
    Boolean IneligibleFetch = DataHelper.getFetch(IneligibleMap);
    Boolean IneligibleSortDir = DataHelper.getSortDirection(IneligibleMap);
    Integer IneligibleSortOrder = DataHelper.getSortOrder(IneligibleMap);
    if (IneligibleFetch != null) out.setIneligibleFetch(IneligibleFetch);
    if (IneligibleSortDir != null) out.setIneligibleSortDirection(IneligibleSortDir);
    if (IneligibleSortOrder != null) out.setIneligibleSortOrder(IneligibleSortOrder);

    Filter[] IneligibleFilter = DataHelper.mapToFilterArray(IneligibleMap, Boolean.class);
    if (IneligibleFilter != null) {
      BooleanFilter[] IneligibleFilters = new BooleanFilter[IneligibleFilter.length];
      for (int i = 0; i < IneligibleFilters.length; i++) {
        IneligibleFilters[i] = (BooleanFilter)IneligibleFilter[i];
      }
      try {
        out.setIneligibleFilter(IneligibleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
