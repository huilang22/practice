/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardObjectHelper.java
 * Definition File: Customer/CreditCard.xml
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


/** Helper class to convert CreditCardObject JavaBean objects to/from HashMaps.
 */
public class CreditCardObjectHelper implements ArubaObjectHelper
{
  /** convert CreditCardObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CreditCardObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CreditCardObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CreditCardObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CreditCardObjectData the converted object
   */
  public static CreditCardObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CreditCardObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CreditCardObject")
   * @return CreditCardObjectData the converted object
   */
  public static CreditCardObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CreditCardObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CreditCardObjectFilter the converted object
   */
  public static CreditCardObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CreditCardObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CreditCardObject")
   * @return CreditCardObjectFilter the converted object
   */
  public static CreditCardObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CreditCardObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CreditCardObjectDataList the converted object
   */
  public static CreditCardObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CreditCardObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CreditCardObjectList")
   * @return CreditCardObjectDataList the converted object
   */
  public static CreditCardObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CreditCardObjectData[] array = null;
    if (root != null)
    {
      array = new CreditCardObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CreditCardObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CreditCardObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CreditCardObjectDataList (array, index, total);
  }
  /** convert CreditCardObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CreditCardObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CreditCardObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CcardAccountSet) record.put ("CcardAccount", in.CcardAccount);
  
    if (in._OwnrLnameSet) record.put ("OwnrLname", in.OwnrLname);
  
    if (in._OwnrFnameSet) record.put ("OwnrFname", in.OwnrFname);
  
    if (in._CcardCarrierSet) record.put ("CcardCarrier", in.CcardCarrier);
  
    if (in._CcardExpireSet) record.put ("CcardExpire", in.CcardExpire);
  
    if (in._AvsAddressIdSet) record.put ("AvsAddressId", in.AvsAddressId);
  
    if (in._CcardClearingHouseIdSet) record.put ("CcardClearingHouseId", in.CcardClearingHouseId);
  
    if (in._AvsResponseCodeSet) record.put ("AvsResponseCode", in.AvsResponseCode);
  
    if (in._TransFlagSet) record.put ("TransFlag", in.TransFlag);
      return record;
  }
  /** convert CreditCardObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CreditCardObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CreditCardObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.CcardAccount, in.CcardAccountSort, in.CcardAccountSortAscending, in.CcardAccountFetch, in.CcardAccountCaseInsensitive);
      if (map != null) record.put ("CcardAccount", map);
      map = DataHelper.filterToMap (in.OwnrLname, in.OwnrLnameSort, in.OwnrLnameSortAscending, in.OwnrLnameFetch, in.OwnrLnameCaseInsensitive);
      if (map != null) record.put ("OwnrLname", map);
      map = DataHelper.filterToMap (in.OwnrFname, in.OwnrFnameSort, in.OwnrFnameSortAscending, in.OwnrFnameFetch, in.OwnrFnameCaseInsensitive);
      if (map != null) record.put ("OwnrFname", map);
      map = DataHelper.filterToMap (in.CcardCarrier, in.CcardCarrierSort, in.CcardCarrierSortAscending, in.CcardCarrierFetch, in.CcardCarrierCaseInsensitive);
      if (map != null) record.put ("CcardCarrier", map);
      map = DataHelper.filterToMap (in.CcardExpire, in.CcardExpireSort, in.CcardExpireSortAscending, in.CcardExpireFetch, in.CcardExpireCaseInsensitive);
      if (map != null) record.put ("CcardExpire", map);
      map = DataHelper.filterToMap (in.AvsAddressId, in.AvsAddressIdSort, in.AvsAddressIdSortAscending, in.AvsAddressIdFetch);
      if (map != null) record.put ("AvsAddressId", map);
      map = DataHelper.filterToMap (in.CcardClearingHouseId, in.CcardClearingHouseIdSort, in.CcardClearingHouseIdSortAscending, in.CcardClearingHouseIdFetch, in.CcardClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("CcardClearingHouseId", map);
      map = DataHelper.filterToMap (in.AvsResponseCode, in.AvsResponseCodeSort, in.AvsResponseCodeSortAscending, in.AvsResponseCodeFetch, in.AvsResponseCodeCaseInsensitive);
      if (map != null) record.put ("AvsResponseCode", map);
      map = DataHelper.filterToMap (in.TransFlag, in.TransFlagSort, in.TransFlagSortAscending, in.TransFlagFetch, in.TransFlagCaseInsensitive);
      if (map != null) record.put ("TransFlag", map);
    return record;
  }
  /** convert Map to CreditCardObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardObjectData the converted object
   */
  public static CreditCardObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardObjectData out = new CreditCardObjectData ();

    out.Key = CreditCardObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("CcardAccount")) != null)
    {
      out.CcardAccount = (String) obj;
    }
  
    if ((obj = record.get ("OwnrLname")) != null)
    {
      out.OwnrLname = (String) obj;
    }
  
    if ((obj = record.get ("OwnrFname")) != null)
    {
      out.OwnrFname = (String) obj;
    }
  
    if ((obj = record.get ("CcardCarrier")) != null)
    {
      out.CcardCarrier = (String) obj;
    }
  
    if ((obj = record.get ("CcardExpire")) != null)
    {
      out.CcardExpire = (String) obj;
    }
  
    if ((obj = record.get ("AvsAddressId")) != null)
    {
      out.AvsAddressId = (Integer) obj;
    }
  
    if ((obj = record.get ("CcardClearingHouseId")) != null)
    {
      out.CcardClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("AvsResponseCode")) != null)
    {
      out.AvsResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("TransFlag")) != null)
    {
      out.TransFlag = (String) obj;
    }
      return out;
  }
  /** convert Map to CreditCardObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardObjectFilter the converted object
   */
  public static CreditCardObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardObjectFilter out = new CreditCardObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CreditCardObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map CcardAccountMap = (Map)record.get("CcardAccount");
    Boolean CcardAccountFetch = DataHelper.getFetch(CcardAccountMap);
    Boolean CcardAccountSortDir = DataHelper.getSortDirection(CcardAccountMap);
    Integer CcardAccountSortOrder = DataHelper.getSortOrder(CcardAccountMap);
    if (CcardAccountFetch != null) out.setCcardAccountFetch(CcardAccountFetch);
    if (CcardAccountSortDir != null) out.setCcardAccountSortDirection(CcardAccountSortDir);
    if (CcardAccountSortOrder != null) out.setCcardAccountSortOrder(CcardAccountSortOrder);

    Filter[] CcardAccountFilter = DataHelper.mapToFilterArray(CcardAccountMap, String.class);
    if (CcardAccountFilter != null) {
      StringFilter[] CcardAccountFilters = new StringFilter[CcardAccountFilter.length];
      for (int i = 0; i < CcardAccountFilters.length; i++) {
        CcardAccountFilters[i] = (StringFilter)CcardAccountFilter[i];
      }
      try {
        out.setCcardAccountFilter(CcardAccountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrLnameMap = (Map)record.get("OwnrLname");
    Boolean OwnrLnameFetch = DataHelper.getFetch(OwnrLnameMap);
    Boolean OwnrLnameSortDir = DataHelper.getSortDirection(OwnrLnameMap);
    Integer OwnrLnameSortOrder = DataHelper.getSortOrder(OwnrLnameMap);
    if (OwnrLnameFetch != null) out.setOwnrLnameFetch(OwnrLnameFetch);
    if (OwnrLnameSortDir != null) out.setOwnrLnameSortDirection(OwnrLnameSortDir);
    if (OwnrLnameSortOrder != null) out.setOwnrLnameSortOrder(OwnrLnameSortOrder);

    Filter[] OwnrLnameFilter = DataHelper.mapToFilterArray(OwnrLnameMap, String.class);
    if (OwnrLnameFilter != null) {
      StringFilter[] OwnrLnameFilters = new StringFilter[OwnrLnameFilter.length];
      for (int i = 0; i < OwnrLnameFilters.length; i++) {
        OwnrLnameFilters[i] = (StringFilter)OwnrLnameFilter[i];
      }
      try {
        out.setOwnrLnameFilter(OwnrLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrFnameMap = (Map)record.get("OwnrFname");
    Boolean OwnrFnameFetch = DataHelper.getFetch(OwnrFnameMap);
    Boolean OwnrFnameSortDir = DataHelper.getSortDirection(OwnrFnameMap);
    Integer OwnrFnameSortOrder = DataHelper.getSortOrder(OwnrFnameMap);
    if (OwnrFnameFetch != null) out.setOwnrFnameFetch(OwnrFnameFetch);
    if (OwnrFnameSortDir != null) out.setOwnrFnameSortDirection(OwnrFnameSortDir);
    if (OwnrFnameSortOrder != null) out.setOwnrFnameSortOrder(OwnrFnameSortOrder);

    Filter[] OwnrFnameFilter = DataHelper.mapToFilterArray(OwnrFnameMap, String.class);
    if (OwnrFnameFilter != null) {
      StringFilter[] OwnrFnameFilters = new StringFilter[OwnrFnameFilter.length];
      for (int i = 0; i < OwnrFnameFilters.length; i++) {
        OwnrFnameFilters[i] = (StringFilter)OwnrFnameFilter[i];
      }
      try {
        out.setOwnrFnameFilter(OwnrFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CcardCarrierMap = (Map)record.get("CcardCarrier");
    Boolean CcardCarrierFetch = DataHelper.getFetch(CcardCarrierMap);
    Boolean CcardCarrierSortDir = DataHelper.getSortDirection(CcardCarrierMap);
    Integer CcardCarrierSortOrder = DataHelper.getSortOrder(CcardCarrierMap);
    if (CcardCarrierFetch != null) out.setCcardCarrierFetch(CcardCarrierFetch);
    if (CcardCarrierSortDir != null) out.setCcardCarrierSortDirection(CcardCarrierSortDir);
    if (CcardCarrierSortOrder != null) out.setCcardCarrierSortOrder(CcardCarrierSortOrder);

    Filter[] CcardCarrierFilter = DataHelper.mapToFilterArray(CcardCarrierMap, String.class);
    if (CcardCarrierFilter != null) {
      StringFilter[] CcardCarrierFilters = new StringFilter[CcardCarrierFilter.length];
      for (int i = 0; i < CcardCarrierFilters.length; i++) {
        CcardCarrierFilters[i] = (StringFilter)CcardCarrierFilter[i];
      }
      try {
        out.setCcardCarrierFilter(CcardCarrierFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CcardExpireMap = (Map)record.get("CcardExpire");
    Boolean CcardExpireFetch = DataHelper.getFetch(CcardExpireMap);
    Boolean CcardExpireSortDir = DataHelper.getSortDirection(CcardExpireMap);
    Integer CcardExpireSortOrder = DataHelper.getSortOrder(CcardExpireMap);
    if (CcardExpireFetch != null) out.setCcardExpireFetch(CcardExpireFetch);
    if (CcardExpireSortDir != null) out.setCcardExpireSortDirection(CcardExpireSortDir);
    if (CcardExpireSortOrder != null) out.setCcardExpireSortOrder(CcardExpireSortOrder);

    Filter[] CcardExpireFilter = DataHelper.mapToFilterArray(CcardExpireMap, String.class);
    if (CcardExpireFilter != null) {
      StringFilter[] CcardExpireFilters = new StringFilter[CcardExpireFilter.length];
      for (int i = 0; i < CcardExpireFilters.length; i++) {
        CcardExpireFilters[i] = (StringFilter)CcardExpireFilter[i];
      }
      try {
        out.setCcardExpireFilter(CcardExpireFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvsAddressIdMap = (Map)record.get("AvsAddressId");
    Boolean AvsAddressIdFetch = DataHelper.getFetch(AvsAddressIdMap);
    Boolean AvsAddressIdSortDir = DataHelper.getSortDirection(AvsAddressIdMap);
    Integer AvsAddressIdSortOrder = DataHelper.getSortOrder(AvsAddressIdMap);
    if (AvsAddressIdFetch != null) out.setAvsAddressIdFetch(AvsAddressIdFetch);
    if (AvsAddressIdSortDir != null) out.setAvsAddressIdSortDirection(AvsAddressIdSortDir);
    if (AvsAddressIdSortOrder != null) out.setAvsAddressIdSortOrder(AvsAddressIdSortOrder);

    Filter[] AvsAddressIdFilter = DataHelper.mapToFilterArray(AvsAddressIdMap, Integer.class);
    if (AvsAddressIdFilter != null) {
      IntegerFilter[] AvsAddressIdFilters = new IntegerFilter[AvsAddressIdFilter.length];
      for (int i = 0; i < AvsAddressIdFilters.length; i++) {
        AvsAddressIdFilters[i] = (IntegerFilter)AvsAddressIdFilter[i];
      }
      try {
        out.setAvsAddressIdFilter(AvsAddressIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CcardClearingHouseIdMap = (Map)record.get("CcardClearingHouseId");
    Boolean CcardClearingHouseIdFetch = DataHelper.getFetch(CcardClearingHouseIdMap);
    Boolean CcardClearingHouseIdSortDir = DataHelper.getSortDirection(CcardClearingHouseIdMap);
    Integer CcardClearingHouseIdSortOrder = DataHelper.getSortOrder(CcardClearingHouseIdMap);
    if (CcardClearingHouseIdFetch != null) out.setCcardClearingHouseIdFetch(CcardClearingHouseIdFetch);
    if (CcardClearingHouseIdSortDir != null) out.setCcardClearingHouseIdSortDirection(CcardClearingHouseIdSortDir);
    if (CcardClearingHouseIdSortOrder != null) out.setCcardClearingHouseIdSortOrder(CcardClearingHouseIdSortOrder);

    Filter[] CcardClearingHouseIdFilter = DataHelper.mapToFilterArray(CcardClearingHouseIdMap, String.class);
    if (CcardClearingHouseIdFilter != null) {
      StringFilter[] CcardClearingHouseIdFilters = new StringFilter[CcardClearingHouseIdFilter.length];
      for (int i = 0; i < CcardClearingHouseIdFilters.length; i++) {
        CcardClearingHouseIdFilters[i] = (StringFilter)CcardClearingHouseIdFilter[i];
      }
      try {
        out.setCcardClearingHouseIdFilter(CcardClearingHouseIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvsResponseCodeMap = (Map)record.get("AvsResponseCode");
    Boolean AvsResponseCodeFetch = DataHelper.getFetch(AvsResponseCodeMap);
    Boolean AvsResponseCodeSortDir = DataHelper.getSortDirection(AvsResponseCodeMap);
    Integer AvsResponseCodeSortOrder = DataHelper.getSortOrder(AvsResponseCodeMap);
    if (AvsResponseCodeFetch != null) out.setAvsResponseCodeFetch(AvsResponseCodeFetch);
    if (AvsResponseCodeSortDir != null) out.setAvsResponseCodeSortDirection(AvsResponseCodeSortDir);
    if (AvsResponseCodeSortOrder != null) out.setAvsResponseCodeSortOrder(AvsResponseCodeSortOrder);

    Filter[] AvsResponseCodeFilter = DataHelper.mapToFilterArray(AvsResponseCodeMap, String.class);
    if (AvsResponseCodeFilter != null) {
      StringFilter[] AvsResponseCodeFilters = new StringFilter[AvsResponseCodeFilter.length];
      for (int i = 0; i < AvsResponseCodeFilters.length; i++) {
        AvsResponseCodeFilters[i] = (StringFilter)AvsResponseCodeFilter[i];
      }
      try {
        out.setAvsResponseCodeFilter(AvsResponseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransFlagMap = (Map)record.get("TransFlag");
    Boolean TransFlagFetch = DataHelper.getFetch(TransFlagMap);
    Boolean TransFlagSortDir = DataHelper.getSortDirection(TransFlagMap);
    Integer TransFlagSortOrder = DataHelper.getSortOrder(TransFlagMap);
    if (TransFlagFetch != null) out.setTransFlagFetch(TransFlagFetch);
    if (TransFlagSortDir != null) out.setTransFlagSortDirection(TransFlagSortDir);
    if (TransFlagSortOrder != null) out.setTransFlagSortOrder(TransFlagSortOrder);

    Filter[] TransFlagFilter = DataHelper.mapToFilterArray(TransFlagMap, String.class);
    if (TransFlagFilter != null) {
      StringFilter[] TransFlagFilters = new StringFilter[TransFlagFilter.length];
      for (int i = 0; i < TransFlagFilters.length; i++) {
        TransFlagFilters[i] = (StringFilter)TransFlagFilter[i];
      }
      try {
        out.setTransFlagFilter(TransFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
