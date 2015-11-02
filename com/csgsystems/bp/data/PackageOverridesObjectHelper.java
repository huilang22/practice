/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectHelper.java
 * Definition File: Customer/CmfPackageOverrides.xml
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



/** Helper class to convert PackageOverridesObject JavaBean objects to/from HashMaps.
 */
public class PackageOverridesObjectHelper implements ArubaObjectHelper
{
  /** convert PackageOverridesObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PackageOverridesObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageOverridesObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageOverridesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PackageOverridesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageOverridesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageOverridesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PackageOverridesObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PackageOverridesObjectData the converted object
   */
  public static PackageOverridesObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PackageOverridesObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PackageOverridesObject")
   * @return PackageOverridesObjectData the converted object
   */
  public static PackageOverridesObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PackageOverridesObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PackageOverridesObjectFilter the converted object
   */
  public static PackageOverridesObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PackageOverridesObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PackageOverridesObject")
   * @return PackageOverridesObjectFilter the converted object
   */
  public static PackageOverridesObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PackageOverridesObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PackageOverridesObjectDataList the converted object
   */
  public static PackageOverridesObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PackageOverridesObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PackageOverridesObjectList")
   * @return PackageOverridesObjectDataList the converted object
   */
  public static PackageOverridesObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageOverridesObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PackageOverridesObjectData[] array = null;
    if (root != null)
    {
      array = new PackageOverridesObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PackageOverridesObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PackageOverridesObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PackageOverridesObjectDataList (array, index, total);
  }
  /** convert PackageOverridesObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PackageOverridesObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PackageOverridesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._MemberIdSet) record.put ("MemberId", in.MemberId);
  
    if (in._OverrideRateLevelSet) record.put ("OverrideRateLevel", in.OverrideRateLevel);
  
    if (in._OverrideRateStatusSet) record.put ("OverrideRateStatus", in.OverrideRateStatus);
  
    if (in._OverrideRateRcSet) record.put ("OverrideRateRc", in.OverrideRateRc);
  
    if (in._OverrideRateNrcSet) record.put ("OverrideRateNrc", in.OverrideRateNrc);
  
    if (in._OverrideUsgChargeAmtSet) record.put ("OverrideUsgChargeAmt", in.OverrideUsgChargeAmt);
  
    if (in._OverrideUsgFixedAmtSet) record.put ("OverrideUsgFixedAmt", in.OverrideUsgFixedAmt);
  
    if (in._OverrideUsgUnitSet) record.put ("OverrideUsgUnit", in.OverrideUsgUnit);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
      return record;
  }
  /** convert PackageOverridesObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PackageOverridesObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PackageOverridesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.MemberId, in.MemberIdSort, in.MemberIdSortAscending, in.MemberIdFetch);
      if (map != null) record.put ("MemberId", map);
      map = DataHelper.filterToMap (in.OverrideRateLevel, in.OverrideRateLevelSort, in.OverrideRateLevelSortAscending, in.OverrideRateLevelFetch);
      if (map != null) record.put ("OverrideRateLevel", map);
      map = DataHelper.filterToMap (in.OverrideRateStatus, in.OverrideRateStatusSort, in.OverrideRateStatusSortAscending, in.OverrideRateStatusFetch);
      if (map != null) record.put ("OverrideRateStatus", map);
      map = DataHelper.filterToMap (in.OverrideRateRc, in.OverrideRateRcSort, in.OverrideRateRcSortAscending, in.OverrideRateRcFetch);
      if (map != null) record.put ("OverrideRateRc", map);
      map = DataHelper.filterToMap (in.OverrideRateNrc, in.OverrideRateNrcSort, in.OverrideRateNrcSortAscending, in.OverrideRateNrcFetch);
      if (map != null) record.put ("OverrideRateNrc", map);
      map = DataHelper.filterToMap (in.OverrideUsgChargeAmt, in.OverrideUsgChargeAmtSort, in.OverrideUsgChargeAmtSortAscending, in.OverrideUsgChargeAmtFetch);
      if (map != null) record.put ("OverrideUsgChargeAmt", map);
      map = DataHelper.filterToMap (in.OverrideUsgFixedAmt, in.OverrideUsgFixedAmtSort, in.OverrideUsgFixedAmtSortAscending, in.OverrideUsgFixedAmtFetch);
      if (map != null) record.put ("OverrideUsgFixedAmt", map);
      map = DataHelper.filterToMap (in.OverrideUsgUnit, in.OverrideUsgUnitSort, in.OverrideUsgUnitSortAscending, in.OverrideUsgUnitFetch);
      if (map != null) record.put ("OverrideUsgUnit", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
    return record;
  }
  /** convert Map to PackageOverridesObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageOverridesObjectData the converted object
   */
  public static PackageOverridesObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageOverridesObjectData out = new PackageOverridesObjectData ();

    out.Key = PackageOverridesObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("MemberId")) != null)
    {
      out.MemberId = (Integer) obj;
    }
  
    if ((obj = record.get ("OverrideRateLevel")) != null)
    {
      out.OverrideRateLevel = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OverrideRateStatus")) != null)
    {
      out.OverrideRateStatus = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OverrideRateRc")) != null)
    {
      out.OverrideRateRc = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OverrideRateNrc")) != null)
    {
      out.OverrideRateNrc = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OverrideUsgChargeAmt")) != null)
    {
      out.OverrideUsgChargeAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OverrideUsgFixedAmt")) != null)
    {
      out.OverrideUsgFixedAmt = (Integer) obj;
    }
  
    if ((obj = record.get ("OverrideUsgUnit")) != null)
    {
      out.OverrideUsgUnit = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to PackageOverridesObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageOverridesObjectFilter the converted object
   */
  public static PackageOverridesObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageOverridesObjectFilter out = new PackageOverridesObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PackageOverridesObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ComponentIdMap = (Map)record.get("ComponentId");
    Boolean ComponentIdFetch = DataHelper.getFetch(ComponentIdMap);
    Boolean ComponentIdSortDir = DataHelper.getSortDirection(ComponentIdMap);
    Integer ComponentIdSortOrder = DataHelper.getSortOrder(ComponentIdMap);
    if (ComponentIdFetch != null) out.setComponentIdFetch(ComponentIdFetch);
    if (ComponentIdSortDir != null) out.setComponentIdSortDirection(ComponentIdSortDir);
    if (ComponentIdSortOrder != null) out.setComponentIdSortOrder(ComponentIdSortOrder);

    Filter[] ComponentIdFilter = DataHelper.mapToFilterArray(ComponentIdMap, Integer.class);
    if (ComponentIdFilter != null) {
      IntegerFilter[] ComponentIdFilters = new IntegerFilter[ComponentIdFilter.length];
      for (int i = 0; i < ComponentIdFilters.length; i++) {
        ComponentIdFilters[i] = (IntegerFilter)ComponentIdFilter[i];
      }
      try {
        out.setComponentIdFilter(ComponentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MemberIdMap = (Map)record.get("MemberId");
    Boolean MemberIdFetch = DataHelper.getFetch(MemberIdMap);
    Boolean MemberIdSortDir = DataHelper.getSortDirection(MemberIdMap);
    Integer MemberIdSortOrder = DataHelper.getSortOrder(MemberIdMap);
    if (MemberIdFetch != null) out.setMemberIdFetch(MemberIdFetch);
    if (MemberIdSortDir != null) out.setMemberIdSortDirection(MemberIdSortDir);
    if (MemberIdSortOrder != null) out.setMemberIdSortOrder(MemberIdSortOrder);

    Filter[] MemberIdFilter = DataHelper.mapToFilterArray(MemberIdMap, Integer.class);
    if (MemberIdFilter != null) {
      IntegerFilter[] MemberIdFilters = new IntegerFilter[MemberIdFilter.length];
      for (int i = 0; i < MemberIdFilters.length; i++) {
        MemberIdFilters[i] = (IntegerFilter)MemberIdFilter[i];
      }
      try {
        out.setMemberIdFilter(MemberIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideRateLevelMap = (Map)record.get("OverrideRateLevel");
    Boolean OverrideRateLevelFetch = DataHelper.getFetch(OverrideRateLevelMap);
    Boolean OverrideRateLevelSortDir = DataHelper.getSortDirection(OverrideRateLevelMap);
    Integer OverrideRateLevelSortOrder = DataHelper.getSortOrder(OverrideRateLevelMap);
    if (OverrideRateLevelFetch != null) out.setOverrideRateLevelFetch(OverrideRateLevelFetch);
    if (OverrideRateLevelSortDir != null) out.setOverrideRateLevelSortDirection(OverrideRateLevelSortDir);
    if (OverrideRateLevelSortOrder != null) out.setOverrideRateLevelSortOrder(OverrideRateLevelSortOrder);

    Filter[] OverrideRateLevelFilter = DataHelper.mapToFilterArray(OverrideRateLevelMap, BigInteger.class);
    if (OverrideRateLevelFilter != null) {
      BigIntegerFilter[] OverrideRateLevelFilters = new BigIntegerFilter[OverrideRateLevelFilter.length];
      for (int i = 0; i < OverrideRateLevelFilters.length; i++) {
        OverrideRateLevelFilters[i] = (BigIntegerFilter)OverrideRateLevelFilter[i];
      }
      try {
        out.setOverrideRateLevelFilter(OverrideRateLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideRateStatusMap = (Map)record.get("OverrideRateStatus");
    Boolean OverrideRateStatusFetch = DataHelper.getFetch(OverrideRateStatusMap);
    Boolean OverrideRateStatusSortDir = DataHelper.getSortDirection(OverrideRateStatusMap);
    Integer OverrideRateStatusSortOrder = DataHelper.getSortOrder(OverrideRateStatusMap);
    if (OverrideRateStatusFetch != null) out.setOverrideRateStatusFetch(OverrideRateStatusFetch);
    if (OverrideRateStatusSortDir != null) out.setOverrideRateStatusSortDirection(OverrideRateStatusSortDir);
    if (OverrideRateStatusSortOrder != null) out.setOverrideRateStatusSortOrder(OverrideRateStatusSortOrder);

    Filter[] OverrideRateStatusFilter = DataHelper.mapToFilterArray(OverrideRateStatusMap, BigInteger.class);
    if (OverrideRateStatusFilter != null) {
      BigIntegerFilter[] OverrideRateStatusFilters = new BigIntegerFilter[OverrideRateStatusFilter.length];
      for (int i = 0; i < OverrideRateStatusFilters.length; i++) {
        OverrideRateStatusFilters[i] = (BigIntegerFilter)OverrideRateStatusFilter[i];
      }
      try {
        out.setOverrideRateStatusFilter(OverrideRateStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideRateRcMap = (Map)record.get("OverrideRateRc");
    Boolean OverrideRateRcFetch = DataHelper.getFetch(OverrideRateRcMap);
    Boolean OverrideRateRcSortDir = DataHelper.getSortDirection(OverrideRateRcMap);
    Integer OverrideRateRcSortOrder = DataHelper.getSortOrder(OverrideRateRcMap);
    if (OverrideRateRcFetch != null) out.setOverrideRateRcFetch(OverrideRateRcFetch);
    if (OverrideRateRcSortDir != null) out.setOverrideRateRcSortDirection(OverrideRateRcSortDir);
    if (OverrideRateRcSortOrder != null) out.setOverrideRateRcSortOrder(OverrideRateRcSortOrder);

    Filter[] OverrideRateRcFilter = DataHelper.mapToFilterArray(OverrideRateRcMap, BigInteger.class);
    if (OverrideRateRcFilter != null) {
      BigIntegerFilter[] OverrideRateRcFilters = new BigIntegerFilter[OverrideRateRcFilter.length];
      for (int i = 0; i < OverrideRateRcFilters.length; i++) {
        OverrideRateRcFilters[i] = (BigIntegerFilter)OverrideRateRcFilter[i];
      }
      try {
        out.setOverrideRateRcFilter(OverrideRateRcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideRateNrcMap = (Map)record.get("OverrideRateNrc");
    Boolean OverrideRateNrcFetch = DataHelper.getFetch(OverrideRateNrcMap);
    Boolean OverrideRateNrcSortDir = DataHelper.getSortDirection(OverrideRateNrcMap);
    Integer OverrideRateNrcSortOrder = DataHelper.getSortOrder(OverrideRateNrcMap);
    if (OverrideRateNrcFetch != null) out.setOverrideRateNrcFetch(OverrideRateNrcFetch);
    if (OverrideRateNrcSortDir != null) out.setOverrideRateNrcSortDirection(OverrideRateNrcSortDir);
    if (OverrideRateNrcSortOrder != null) out.setOverrideRateNrcSortOrder(OverrideRateNrcSortOrder);

    Filter[] OverrideRateNrcFilter = DataHelper.mapToFilterArray(OverrideRateNrcMap, BigInteger.class);
    if (OverrideRateNrcFilter != null) {
      BigIntegerFilter[] OverrideRateNrcFilters = new BigIntegerFilter[OverrideRateNrcFilter.length];
      for (int i = 0; i < OverrideRateNrcFilters.length; i++) {
        OverrideRateNrcFilters[i] = (BigIntegerFilter)OverrideRateNrcFilter[i];
      }
      try {
        out.setOverrideRateNrcFilter(OverrideRateNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideUsgChargeAmtMap = (Map)record.get("OverrideUsgChargeAmt");
    Boolean OverrideUsgChargeAmtFetch = DataHelper.getFetch(OverrideUsgChargeAmtMap);
    Boolean OverrideUsgChargeAmtSortDir = DataHelper.getSortDirection(OverrideUsgChargeAmtMap);
    Integer OverrideUsgChargeAmtSortOrder = DataHelper.getSortOrder(OverrideUsgChargeAmtMap);
    if (OverrideUsgChargeAmtFetch != null) out.setOverrideUsgChargeAmtFetch(OverrideUsgChargeAmtFetch);
    if (OverrideUsgChargeAmtSortDir != null) out.setOverrideUsgChargeAmtSortDirection(OverrideUsgChargeAmtSortDir);
    if (OverrideUsgChargeAmtSortOrder != null) out.setOverrideUsgChargeAmtSortOrder(OverrideUsgChargeAmtSortOrder);

    Filter[] OverrideUsgChargeAmtFilter = DataHelper.mapToFilterArray(OverrideUsgChargeAmtMap, BigInteger.class);
    if (OverrideUsgChargeAmtFilter != null) {
      BigIntegerFilter[] OverrideUsgChargeAmtFilters = new BigIntegerFilter[OverrideUsgChargeAmtFilter.length];
      for (int i = 0; i < OverrideUsgChargeAmtFilters.length; i++) {
        OverrideUsgChargeAmtFilters[i] = (BigIntegerFilter)OverrideUsgChargeAmtFilter[i];
      }
      try {
        out.setOverrideUsgChargeAmtFilter(OverrideUsgChargeAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideUsgFixedAmtMap = (Map)record.get("OverrideUsgFixedAmt");
    Boolean OverrideUsgFixedAmtFetch = DataHelper.getFetch(OverrideUsgFixedAmtMap);
    Boolean OverrideUsgFixedAmtSortDir = DataHelper.getSortDirection(OverrideUsgFixedAmtMap);
    Integer OverrideUsgFixedAmtSortOrder = DataHelper.getSortOrder(OverrideUsgFixedAmtMap);
    if (OverrideUsgFixedAmtFetch != null) out.setOverrideUsgFixedAmtFetch(OverrideUsgFixedAmtFetch);
    if (OverrideUsgFixedAmtSortDir != null) out.setOverrideUsgFixedAmtSortDirection(OverrideUsgFixedAmtSortDir);
    if (OverrideUsgFixedAmtSortOrder != null) out.setOverrideUsgFixedAmtSortOrder(OverrideUsgFixedAmtSortOrder);

    Filter[] OverrideUsgFixedAmtFilter = DataHelper.mapToFilterArray(OverrideUsgFixedAmtMap, Integer.class);
    if (OverrideUsgFixedAmtFilter != null) {
      IntegerFilter[] OverrideUsgFixedAmtFilters = new IntegerFilter[OverrideUsgFixedAmtFilter.length];
      for (int i = 0; i < OverrideUsgFixedAmtFilters.length; i++) {
        OverrideUsgFixedAmtFilters[i] = (IntegerFilter)OverrideUsgFixedAmtFilter[i];
      }
      try {
        out.setOverrideUsgFixedAmtFilter(OverrideUsgFixedAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideUsgUnitMap = (Map)record.get("OverrideUsgUnit");
    Boolean OverrideUsgUnitFetch = DataHelper.getFetch(OverrideUsgUnitMap);
    Boolean OverrideUsgUnitSortDir = DataHelper.getSortDirection(OverrideUsgUnitMap);
    Integer OverrideUsgUnitSortOrder = DataHelper.getSortOrder(OverrideUsgUnitMap);
    if (OverrideUsgUnitFetch != null) out.setOverrideUsgUnitFetch(OverrideUsgUnitFetch);
    if (OverrideUsgUnitSortDir != null) out.setOverrideUsgUnitSortDirection(OverrideUsgUnitSortDir);
    if (OverrideUsgUnitSortOrder != null) out.setOverrideUsgUnitSortOrder(OverrideUsgUnitSortOrder);

    Filter[] OverrideUsgUnitFilter = DataHelper.mapToFilterArray(OverrideUsgUnitMap, Integer.class);
    if (OverrideUsgUnitFilter != null) {
      IntegerFilter[] OverrideUsgUnitFilters = new IntegerFilter[OverrideUsgUnitFilter.length];
      for (int i = 0; i < OverrideUsgUnitFilters.length; i++) {
        OverrideUsgUnitFilters[i] = (IntegerFilter)OverrideUsgUnitFilter[i];
      }
      try {
        out.setOverrideUsgUnitFilter(OverrideUsgUnitFilters);
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
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
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
  
    return out;
  }
}
