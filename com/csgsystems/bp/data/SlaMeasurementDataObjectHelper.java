/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectHelper.java
 * Definition File: Customer/SlaMeasurementData.xml
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



/** Helper class to convert SlaMeasurementDataObject JavaBean objects to/from HashMaps.
 */
public class SlaMeasurementDataObjectHelper implements ArubaObjectHelper
{
  /** convert SlaMeasurementDataObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SlaMeasurementDataObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SlaMeasurementDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SlaMeasurementDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SlaMeasurementDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SlaMeasurementDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SlaMeasurementDataObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SlaMeasurementDataObjectData the converted object
   */
  public static SlaMeasurementDataObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SlaMeasurementDataObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SlaMeasurementDataObject")
   * @return SlaMeasurementDataObjectData the converted object
   */
  public static SlaMeasurementDataObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SlaMeasurementDataObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SlaMeasurementDataObjectFilter the converted object
   */
  public static SlaMeasurementDataObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SlaMeasurementDataObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SlaMeasurementDataObject")
   * @return SlaMeasurementDataObjectFilter the converted object
   */
  public static SlaMeasurementDataObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SlaMeasurementDataObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SlaMeasurementDataObjectDataList the converted object
   */
  public static SlaMeasurementDataObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SlaMeasurementDataObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SlaMeasurementDataObjectList")
   * @return SlaMeasurementDataObjectDataList the converted object
   */
  public static SlaMeasurementDataObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SlaMeasurementDataObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SlaMeasurementDataObjectData[] array = null;
    if (root != null)
    {
      array = new SlaMeasurementDataObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SlaMeasurementDataObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SlaMeasurementDataObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SlaMeasurementDataObjectDataList (array, index, total);
  }
  /** convert SlaMeasurementDataObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SlaMeasurementDataObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SlaMeasurementDataObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._SlaMeasurementTypeIdSet) record.put ("SlaMeasurementTypeId", in.SlaMeasurementTypeId);
  
    if (in._MeasurementValueSet) record.put ("MeasurementValue", in.MeasurementValue);
  
    if (in._SlaExtIdSet) record.put ("SlaExtId", in.SlaExtId);
  
    if (in._TransDtSet) record.put ("TransDt", in.TransDt);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._EntryDateSet) record.put ("EntryDate", in.EntryDate);
  
    if (in._ErrorCodeSet) record.put ("ErrorCode", in.ErrorCode);
  
    if (in._SlaDataPartitionKeySet) record.put ("SlaDataPartitionKey", in.SlaDataPartitionKey);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
      return record;
  }
  /** convert SlaMeasurementDataObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SlaMeasurementDataObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SlaMeasurementDataObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.SlaMeasurementTypeId, in.SlaMeasurementTypeIdSort, in.SlaMeasurementTypeIdSortAscending, in.SlaMeasurementTypeIdFetch);
      if (map != null) record.put ("SlaMeasurementTypeId", map);
      map = DataHelper.filterToMap (in.MeasurementValue, in.MeasurementValueSort, in.MeasurementValueSortAscending, in.MeasurementValueFetch);
      if (map != null) record.put ("MeasurementValue", map);
      map = DataHelper.filterToMap (in.SlaExtId, in.SlaExtIdSort, in.SlaExtIdSortAscending, in.SlaExtIdFetch);
      if (map != null) record.put ("SlaExtId", map);
      map = DataHelper.filterToMap (in.TransDt, in.TransDtSort, in.TransDtSortAscending, in.TransDtFetch);
      if (map != null) record.put ("TransDt", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.EntryDate, in.EntryDateSort, in.EntryDateSortAscending, in.EntryDateFetch);
      if (map != null) record.put ("EntryDate", map);
      map = DataHelper.filterToMap (in.ErrorCode, in.ErrorCodeSort, in.ErrorCodeSortAscending, in.ErrorCodeFetch);
      if (map != null) record.put ("ErrorCode", map);
      map = DataHelper.filterToMap (in.SlaDataPartitionKey, in.SlaDataPartitionKeySort, in.SlaDataPartitionKeySortAscending, in.SlaDataPartitionKeyFetch);
      if (map != null) record.put ("SlaDataPartitionKey", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
    return record;
  }
  /** convert Map to SlaMeasurementDataObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SlaMeasurementDataObjectData the converted object
   */
  public static SlaMeasurementDataObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SlaMeasurementDataObjectData out = new SlaMeasurementDataObjectData ();

    out.Key = SlaMeasurementDataObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("SlaMeasurementTypeId")) != null)
    {
      out.SlaMeasurementTypeId = (Integer) obj;
    }
  
    if ((obj = record.get ("MeasurementValue")) != null)
    {
      out.MeasurementValue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SlaExtId")) != null)
    {
      out.SlaExtId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TransDt")) != null)
    {
      out.TransDt = (Date) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("EntryDate")) != null)
    {
      out.EntryDate = (Date) obj;
    }
  
    if ((obj = record.get ("ErrorCode")) != null)
    {
      out.ErrorCode = (Integer) obj;
    }
  
    if ((obj = record.get ("SlaDataPartitionKey")) != null)
    {
      out.SlaDataPartitionKey = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
      return out;
  }
  /** convert Map to SlaMeasurementDataObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SlaMeasurementDataObjectFilter the converted object
   */
  public static SlaMeasurementDataObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SlaMeasurementDataObjectFilter out = new SlaMeasurementDataObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SlaMeasurementDataObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map SlaMeasurementTypeIdMap = (Map)record.get("SlaMeasurementTypeId");
    Boolean SlaMeasurementTypeIdFetch = DataHelper.getFetch(SlaMeasurementTypeIdMap);
    Boolean SlaMeasurementTypeIdSortDir = DataHelper.getSortDirection(SlaMeasurementTypeIdMap);
    Integer SlaMeasurementTypeIdSortOrder = DataHelper.getSortOrder(SlaMeasurementTypeIdMap);
    if (SlaMeasurementTypeIdFetch != null) out.setSlaMeasurementTypeIdFetch(SlaMeasurementTypeIdFetch);
    if (SlaMeasurementTypeIdSortDir != null) out.setSlaMeasurementTypeIdSortDirection(SlaMeasurementTypeIdSortDir);
    if (SlaMeasurementTypeIdSortOrder != null) out.setSlaMeasurementTypeIdSortOrder(SlaMeasurementTypeIdSortOrder);

    Filter[] SlaMeasurementTypeIdFilter = DataHelper.mapToFilterArray(SlaMeasurementTypeIdMap, Integer.class);
    if (SlaMeasurementTypeIdFilter != null) {
      IntegerFilter[] SlaMeasurementTypeIdFilters = new IntegerFilter[SlaMeasurementTypeIdFilter.length];
      for (int i = 0; i < SlaMeasurementTypeIdFilters.length; i++) {
        SlaMeasurementTypeIdFilters[i] = (IntegerFilter)SlaMeasurementTypeIdFilter[i];
      }
      try {
        out.setSlaMeasurementTypeIdFilter(SlaMeasurementTypeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MeasurementValueMap = (Map)record.get("MeasurementValue");
    Boolean MeasurementValueFetch = DataHelper.getFetch(MeasurementValueMap);
    Boolean MeasurementValueSortDir = DataHelper.getSortDirection(MeasurementValueMap);
    Integer MeasurementValueSortOrder = DataHelper.getSortOrder(MeasurementValueMap);
    if (MeasurementValueFetch != null) out.setMeasurementValueFetch(MeasurementValueFetch);
    if (MeasurementValueSortDir != null) out.setMeasurementValueSortDirection(MeasurementValueSortDir);
    if (MeasurementValueSortOrder != null) out.setMeasurementValueSortOrder(MeasurementValueSortOrder);

    Filter[] MeasurementValueFilter = DataHelper.mapToFilterArray(MeasurementValueMap, BigInteger.class);
    if (MeasurementValueFilter != null) {
      BigIntegerFilter[] MeasurementValueFilters = new BigIntegerFilter[MeasurementValueFilter.length];
      for (int i = 0; i < MeasurementValueFilters.length; i++) {
        MeasurementValueFilters[i] = (BigIntegerFilter)MeasurementValueFilter[i];
      }
      try {
        out.setMeasurementValueFilter(MeasurementValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SlaExtIdMap = (Map)record.get("SlaExtId");
    Boolean SlaExtIdFetch = DataHelper.getFetch(SlaExtIdMap);
    Boolean SlaExtIdSortDir = DataHelper.getSortDirection(SlaExtIdMap);
    Integer SlaExtIdSortOrder = DataHelper.getSortOrder(SlaExtIdMap);
    if (SlaExtIdFetch != null) out.setSlaExtIdFetch(SlaExtIdFetch);
    if (SlaExtIdSortDir != null) out.setSlaExtIdSortDirection(SlaExtIdSortDir);
    if (SlaExtIdSortOrder != null) out.setSlaExtIdSortOrder(SlaExtIdSortOrder);

    Filter[] SlaExtIdFilter = DataHelper.mapToFilterArray(SlaExtIdMap, BigInteger.class);
    if (SlaExtIdFilter != null) {
      BigIntegerFilter[] SlaExtIdFilters = new BigIntegerFilter[SlaExtIdFilter.length];
      for (int i = 0; i < SlaExtIdFilters.length; i++) {
        SlaExtIdFilters[i] = (BigIntegerFilter)SlaExtIdFilter[i];
      }
      try {
        out.setSlaExtIdFilter(SlaExtIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDtMap = (Map)record.get("TransDt");
    Boolean TransDtFetch = DataHelper.getFetch(TransDtMap);
    Boolean TransDtSortDir = DataHelper.getSortDirection(TransDtMap);
    Integer TransDtSortOrder = DataHelper.getSortOrder(TransDtMap);
    if (TransDtFetch != null) out.setTransDtFetch(TransDtFetch);
    if (TransDtSortDir != null) out.setTransDtSortDirection(TransDtSortDir);
    if (TransDtSortOrder != null) out.setTransDtSortOrder(TransDtSortOrder);

    Filter[] TransDtFilter = DataHelper.mapToFilterArray(TransDtMap, Date.class);
    if (TransDtFilter != null) {
      DateFilter[] TransDtFilters = new DateFilter[TransDtFilter.length];
      for (int i = 0; i < TransDtFilters.length; i++) {
        TransDtFilters[i] = (DateFilter)TransDtFilter[i];
      }
      try {
        out.setTransDtFilter(TransDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusMap = (Map)record.get("Status");
    Boolean StatusFetch = DataHelper.getFetch(StatusMap);
    Boolean StatusSortDir = DataHelper.getSortDirection(StatusMap);
    Integer StatusSortOrder = DataHelper.getSortOrder(StatusMap);
    if (StatusFetch != null) out.setStatusFetch(StatusFetch);
    if (StatusSortDir != null) out.setStatusSortDirection(StatusSortDir);
    if (StatusSortOrder != null) out.setStatusSortOrder(StatusSortOrder);

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, Integer.class);
    if (StatusFilter != null) {
      IntegerFilter[] StatusFilters = new IntegerFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (IntegerFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntryDateMap = (Map)record.get("EntryDate");
    Boolean EntryDateFetch = DataHelper.getFetch(EntryDateMap);
    Boolean EntryDateSortDir = DataHelper.getSortDirection(EntryDateMap);
    Integer EntryDateSortOrder = DataHelper.getSortOrder(EntryDateMap);
    if (EntryDateFetch != null) out.setEntryDateFetch(EntryDateFetch);
    if (EntryDateSortDir != null) out.setEntryDateSortDirection(EntryDateSortDir);
    if (EntryDateSortOrder != null) out.setEntryDateSortOrder(EntryDateSortOrder);

    Filter[] EntryDateFilter = DataHelper.mapToFilterArray(EntryDateMap, Date.class);
    if (EntryDateFilter != null) {
      DateFilter[] EntryDateFilters = new DateFilter[EntryDateFilter.length];
      for (int i = 0; i < EntryDateFilters.length; i++) {
        EntryDateFilters[i] = (DateFilter)EntryDateFilter[i];
      }
      try {
        out.setEntryDateFilter(EntryDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ErrorCodeMap = (Map)record.get("ErrorCode");
    Boolean ErrorCodeFetch = DataHelper.getFetch(ErrorCodeMap);
    Boolean ErrorCodeSortDir = DataHelper.getSortDirection(ErrorCodeMap);
    Integer ErrorCodeSortOrder = DataHelper.getSortOrder(ErrorCodeMap);
    if (ErrorCodeFetch != null) out.setErrorCodeFetch(ErrorCodeFetch);
    if (ErrorCodeSortDir != null) out.setErrorCodeSortDirection(ErrorCodeSortDir);
    if (ErrorCodeSortOrder != null) out.setErrorCodeSortOrder(ErrorCodeSortOrder);

    Filter[] ErrorCodeFilter = DataHelper.mapToFilterArray(ErrorCodeMap, Integer.class);
    if (ErrorCodeFilter != null) {
      IntegerFilter[] ErrorCodeFilters = new IntegerFilter[ErrorCodeFilter.length];
      for (int i = 0; i < ErrorCodeFilters.length; i++) {
        ErrorCodeFilters[i] = (IntegerFilter)ErrorCodeFilter[i];
      }
      try {
        out.setErrorCodeFilter(ErrorCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SlaDataPartitionKeyMap = (Map)record.get("SlaDataPartitionKey");
    Boolean SlaDataPartitionKeyFetch = DataHelper.getFetch(SlaDataPartitionKeyMap);
    Boolean SlaDataPartitionKeySortDir = DataHelper.getSortDirection(SlaDataPartitionKeyMap);
    Integer SlaDataPartitionKeySortOrder = DataHelper.getSortOrder(SlaDataPartitionKeyMap);
    if (SlaDataPartitionKeyFetch != null) out.setSlaDataPartitionKeyFetch(SlaDataPartitionKeyFetch);
    if (SlaDataPartitionKeySortDir != null) out.setSlaDataPartitionKeySortDirection(SlaDataPartitionKeySortDir);
    if (SlaDataPartitionKeySortOrder != null) out.setSlaDataPartitionKeySortOrder(SlaDataPartitionKeySortOrder);

    Filter[] SlaDataPartitionKeyFilter = DataHelper.mapToFilterArray(SlaDataPartitionKeyMap, Date.class);
    if (SlaDataPartitionKeyFilter != null) {
      DateFilter[] SlaDataPartitionKeyFilters = new DateFilter[SlaDataPartitionKeyFilter.length];
      for (int i = 0; i < SlaDataPartitionKeyFilters.length; i++) {
        SlaDataPartitionKeyFilters[i] = (DateFilter)SlaDataPartitionKeyFilter[i];
      }
      try {
        out.setSlaDataPartitionKeyFilter(SlaDataPartitionKeyFilters);
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
  
    return out;
  }
}
