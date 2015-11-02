/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdObjectHelper.java
 * Definition File: Admin/PaymentMerchantId.xml
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



/** Helper class to convert PaymentMerchantIdObject JavaBean objects to/from HashMaps.
 */
public class PaymentMerchantIdObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentMerchantIdObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentMerchantIdObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentMerchantIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentMerchantIdObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentMerchantIdObjectData the converted object
   */
  public static PaymentMerchantIdObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentMerchantIdObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentMerchantIdObject")
   * @return PaymentMerchantIdObjectData the converted object
   */
  public static PaymentMerchantIdObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentMerchantIdObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentMerchantIdObjectFilter the converted object
   */
  public static PaymentMerchantIdObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentMerchantIdObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentMerchantIdObject")
   * @return PaymentMerchantIdObjectFilter the converted object
   */
  public static PaymentMerchantIdObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentMerchantIdObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentMerchantIdObjectDataList the converted object
   */
  public static PaymentMerchantIdObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentMerchantIdObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentMerchantIdObjectList")
   * @return PaymentMerchantIdObjectDataList the converted object
   */
  public static PaymentMerchantIdObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentMerchantIdObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentMerchantIdObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentMerchantIdObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentMerchantIdObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentMerchantIdObjectDataList (array, index, total);
  }
  /** convert PaymentMerchantIdObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentMerchantIdObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentMerchantIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._EpgMerchantIdSet) record.put ("EpgMerchantId", in.EpgMerchantId);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._AccessKeySet) record.put ("AccessKey", in.AccessKey);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._SecretKeySet) record.put ("SecretKey", in.SecretKey);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert PaymentMerchantIdObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentMerchantIdObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentMerchantIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.EpgMerchantId, in.EpgMerchantIdSort, in.EpgMerchantIdSortAscending, in.EpgMerchantIdFetch, in.EpgMerchantIdCaseInsensitive);
      if (map != null) record.put ("EpgMerchantId", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.AccessKey, in.AccessKeySort, in.AccessKeySortAscending, in.AccessKeyFetch, in.AccessKeyCaseInsensitive);
      if (map != null) record.put ("AccessKey", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch, in.ProfileIdCaseInsensitive);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.SecretKey, in.SecretKeySort, in.SecretKeySortAscending, in.SecretKeyFetch, in.SecretKeyCaseInsensitive);
      if (map != null) record.put ("SecretKey", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to PaymentMerchantIdObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdObjectData the converted object
   */
  public static PaymentMerchantIdObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdObjectData out = new PaymentMerchantIdObjectData ();

    out.Key = PaymentMerchantIdObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("EpgMerchantId")) != null)
    {
      out.EpgMerchantId = (String) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("AccessKey")) != null)
    {
      out.AccessKey = (String) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (String) obj;
    }
  
    if ((obj = record.get ("SecretKey")) != null)
    {
      out.SecretKey = (String) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
      return out;
  }
  /** convert Map to PaymentMerchantIdObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdObjectFilter the converted object
   */
  public static PaymentMerchantIdObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdObjectFilter out = new PaymentMerchantIdObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentMerchantIdObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map EpgMerchantIdMap = (Map)record.get("EpgMerchantId");
    Boolean EpgMerchantIdFetch = DataHelper.getFetch(EpgMerchantIdMap);
    Boolean EpgMerchantIdSortDir = DataHelper.getSortDirection(EpgMerchantIdMap);
    Integer EpgMerchantIdSortOrder = DataHelper.getSortOrder(EpgMerchantIdMap);
    if (EpgMerchantIdFetch != null) out.setEpgMerchantIdFetch(EpgMerchantIdFetch);
    if (EpgMerchantIdSortDir != null) out.setEpgMerchantIdSortDirection(EpgMerchantIdSortDir);
    if (EpgMerchantIdSortOrder != null) out.setEpgMerchantIdSortOrder(EpgMerchantIdSortOrder);

    Filter[] EpgMerchantIdFilter = DataHelper.mapToFilterArray(EpgMerchantIdMap, String.class);
    if (EpgMerchantIdFilter != null) {
      StringFilter[] EpgMerchantIdFilters = new StringFilter[EpgMerchantIdFilter.length];
      for (int i = 0; i < EpgMerchantIdFilters.length; i++) {
        EpgMerchantIdFilters[i] = (StringFilter)EpgMerchantIdFilter[i];
      }
      try {
        out.setEpgMerchantIdFilter(EpgMerchantIdFilters);
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

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, Boolean.class);
    if (StatusFilter != null) {
      BooleanFilter[] StatusFilters = new BooleanFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (BooleanFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDefaultMap = (Map)record.get("IsDefault");
    Boolean IsDefaultFetch = DataHelper.getFetch(IsDefaultMap);
    Boolean IsDefaultSortDir = DataHelper.getSortDirection(IsDefaultMap);
    Integer IsDefaultSortOrder = DataHelper.getSortOrder(IsDefaultMap);
    if (IsDefaultFetch != null) out.setIsDefaultFetch(IsDefaultFetch);
    if (IsDefaultSortDir != null) out.setIsDefaultSortDirection(IsDefaultSortDir);
    if (IsDefaultSortOrder != null) out.setIsDefaultSortOrder(IsDefaultSortOrder);

    Filter[] IsDefaultFilter = DataHelper.mapToFilterArray(IsDefaultMap, Boolean.class);
    if (IsDefaultFilter != null) {
      BooleanFilter[] IsDefaultFilters = new BooleanFilter[IsDefaultFilter.length];
      for (int i = 0; i < IsDefaultFilters.length; i++) {
        IsDefaultFilters[i] = (BooleanFilter)IsDefaultFilter[i];
      }
      try {
        out.setIsDefaultFilter(IsDefaultFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsInternalMap = (Map)record.get("IsInternal");
    Boolean IsInternalFetch = DataHelper.getFetch(IsInternalMap);
    Boolean IsInternalSortDir = DataHelper.getSortDirection(IsInternalMap);
    Integer IsInternalSortOrder = DataHelper.getSortOrder(IsInternalMap);
    if (IsInternalFetch != null) out.setIsInternalFetch(IsInternalFetch);
    if (IsInternalSortDir != null) out.setIsInternalSortDirection(IsInternalSortDir);
    if (IsInternalSortOrder != null) out.setIsInternalSortOrder(IsInternalSortOrder);

    Filter[] IsInternalFilter = DataHelper.mapToFilterArray(IsInternalMap, Boolean.class);
    if (IsInternalFilter != null) {
      BooleanFilter[] IsInternalFilters = new BooleanFilter[IsInternalFilter.length];
      for (int i = 0; i < IsInternalFilters.length; i++) {
        IsInternalFilters[i] = (BooleanFilter)IsInternalFilter[i];
      }
      try {
        out.setIsInternalFilter(IsInternalFilters);
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
  
    Map AccessKeyMap = (Map)record.get("AccessKey");
    Boolean AccessKeyFetch = DataHelper.getFetch(AccessKeyMap);
    Boolean AccessKeySortDir = DataHelper.getSortDirection(AccessKeyMap);
    Integer AccessKeySortOrder = DataHelper.getSortOrder(AccessKeyMap);
    if (AccessKeyFetch != null) out.setAccessKeyFetch(AccessKeyFetch);
    if (AccessKeySortDir != null) out.setAccessKeySortDirection(AccessKeySortDir);
    if (AccessKeySortOrder != null) out.setAccessKeySortOrder(AccessKeySortOrder);

    Filter[] AccessKeyFilter = DataHelper.mapToFilterArray(AccessKeyMap, String.class);
    if (AccessKeyFilter != null) {
      StringFilter[] AccessKeyFilters = new StringFilter[AccessKeyFilter.length];
      for (int i = 0; i < AccessKeyFilters.length; i++) {
        AccessKeyFilters[i] = (StringFilter)AccessKeyFilter[i];
      }
      try {
        out.setAccessKeyFilter(AccessKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProfileIdMap = (Map)record.get("ProfileId");
    Boolean ProfileIdFetch = DataHelper.getFetch(ProfileIdMap);
    Boolean ProfileIdSortDir = DataHelper.getSortDirection(ProfileIdMap);
    Integer ProfileIdSortOrder = DataHelper.getSortOrder(ProfileIdMap);
    if (ProfileIdFetch != null) out.setProfileIdFetch(ProfileIdFetch);
    if (ProfileIdSortDir != null) out.setProfileIdSortDirection(ProfileIdSortDir);
    if (ProfileIdSortOrder != null) out.setProfileIdSortOrder(ProfileIdSortOrder);

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, String.class);
    if (ProfileIdFilter != null) {
      StringFilter[] ProfileIdFilters = new StringFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (StringFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SecretKeyMap = (Map)record.get("SecretKey");
    Boolean SecretKeyFetch = DataHelper.getFetch(SecretKeyMap);
    Boolean SecretKeySortDir = DataHelper.getSortDirection(SecretKeyMap);
    Integer SecretKeySortOrder = DataHelper.getSortOrder(SecretKeyMap);
    if (SecretKeyFetch != null) out.setSecretKeyFetch(SecretKeyFetch);
    if (SecretKeySortDir != null) out.setSecretKeySortDirection(SecretKeySortDir);
    if (SecretKeySortOrder != null) out.setSecretKeySortOrder(SecretKeySortOrder);

    Filter[] SecretKeyFilter = DataHelper.mapToFilterArray(SecretKeyMap, String.class);
    if (SecretKeyFilter != null) {
      StringFilter[] SecretKeyFilters = new StringFilter[SecretKeyFilter.length];
      for (int i = 0; i < SecretKeyFilters.length; i++) {
        SecretKeyFilters[i] = (StringFilter)SecretKeyFilter[i];
      }
      try {
        out.setSecretKeyFilter(SecretKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ShortDisplayMap = (Map)record.get("ShortDisplay");
    Boolean ShortDisplayFetch = DataHelper.getFetch(ShortDisplayMap);
    Boolean ShortDisplaySortDir = DataHelper.getSortDirection(ShortDisplayMap);
    Integer ShortDisplaySortOrder = DataHelper.getSortOrder(ShortDisplayMap);
    if (ShortDisplayFetch != null) out.setShortDisplayFetch(ShortDisplayFetch);
    if (ShortDisplaySortDir != null) out.setShortDisplaySortDirection(ShortDisplaySortDir);
    if (ShortDisplaySortOrder != null) out.setShortDisplaySortOrder(ShortDisplaySortOrder);

    Filter[] ShortDisplayFilter = DataHelper.mapToFilterArray(ShortDisplayMap, String.class);
    if (ShortDisplayFilter != null) {
      StringFilter[] ShortDisplayFilters = new StringFilter[ShortDisplayFilter.length];
      for (int i = 0; i < ShortDisplayFilters.length; i++) {
        ShortDisplayFilters[i] = (StringFilter)ShortDisplayFilter[i];
      }
      try {
        out.setShortDisplayFilter(ShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayValueMap = (Map)record.get("DisplayValue");
    Boolean DisplayValueFetch = DataHelper.getFetch(DisplayValueMap);
    Boolean DisplayValueSortDir = DataHelper.getSortDirection(DisplayValueMap);
    Integer DisplayValueSortOrder = DataHelper.getSortOrder(DisplayValueMap);
    if (DisplayValueFetch != null) out.setDisplayValueFetch(DisplayValueFetch);
    if (DisplayValueSortDir != null) out.setDisplayValueSortDirection(DisplayValueSortDir);
    if (DisplayValueSortOrder != null) out.setDisplayValueSortOrder(DisplayValueSortOrder);

    Filter[] DisplayValueFilter = DataHelper.mapToFilterArray(DisplayValueMap, String.class);
    if (DisplayValueFilter != null) {
      StringFilter[] DisplayValueFilters = new StringFilter[DisplayValueFilter.length];
      for (int i = 0; i < DisplayValueFilters.length; i++) {
        DisplayValueFilters[i] = (StringFilter)DisplayValueFilter[i];
      }
      try {
        out.setDisplayValueFilter(DisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
