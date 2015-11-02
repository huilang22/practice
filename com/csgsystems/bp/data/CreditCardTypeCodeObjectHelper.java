/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardTypeCodeObjectHelper.java
 * Definition File: Admin/CreditCardTypeCode.xml
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



/** Helper class to convert CreditCardTypeCodeObject JavaBean objects to/from HashMaps.
 */
public class CreditCardTypeCodeObjectHelper implements ArubaObjectHelper
{
  /** convert CreditCardTypeCodeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardTypeCodeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardTypeCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CreditCardTypeCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardTypeCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardTypeCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CreditCardTypeCodeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CreditCardTypeCodeObjectData the converted object
   */
  public static CreditCardTypeCodeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CreditCardTypeCodeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CreditCardTypeCodeObject")
   * @return CreditCardTypeCodeObjectData the converted object
   */
  public static CreditCardTypeCodeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CreditCardTypeCodeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CreditCardTypeCodeObjectFilter the converted object
   */
  public static CreditCardTypeCodeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CreditCardTypeCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CreditCardTypeCodeObject")
   * @return CreditCardTypeCodeObjectFilter the converted object
   */
  public static CreditCardTypeCodeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CreditCardTypeCodeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CreditCardTypeCodeObjectDataList the converted object
   */
  public static CreditCardTypeCodeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CreditCardTypeCodeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CreditCardTypeCodeObjectList")
   * @return CreditCardTypeCodeObjectDataList the converted object
   */
  public static CreditCardTypeCodeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardTypeCodeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CreditCardTypeCodeObjectData[] array = null;
    if (root != null)
    {
      array = new CreditCardTypeCodeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CreditCardTypeCodeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CreditCardTypeCodeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CreditCardTypeCodeObjectDataList (array, index, total);
  }
  /** convert CreditCardTypeCodeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CreditCardTypeCodeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CreditCardTypeCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CcardCarrierSet) record.put ("CcardCarrier", in.CcardCarrier);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._EpgCardTypeSet) record.put ("EpgCardType", in.EpgCardType);
  
    if (in._CheckDigitAlgSet) record.put ("CheckDigitAlg", in.CheckDigitAlg);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert CreditCardTypeCodeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CreditCardTypeCodeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CreditCardTypeCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CcardCarrier, in.CcardCarrierSort, in.CcardCarrierSortAscending, in.CcardCarrierFetch, in.CcardCarrierCaseInsensitive);
      if (map != null) record.put ("CcardCarrier", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.EpgCardType, in.EpgCardTypeSort, in.EpgCardTypeSortAscending, in.EpgCardTypeFetch, in.EpgCardTypeCaseInsensitive);
      if (map != null) record.put ("EpgCardType", map);
      map = DataHelper.filterToMap (in.CheckDigitAlg, in.CheckDigitAlgSort, in.CheckDigitAlgSortAscending, in.CheckDigitAlgFetch);
      if (map != null) record.put ("CheckDigitAlg", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to CreditCardTypeCodeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardTypeCodeObjectData the converted object
   */
  public static CreditCardTypeCodeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardTypeCodeObjectData out = new CreditCardTypeCodeObjectData ();

    out.Key = CreditCardTypeCodeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CcardCarrier")) != null)
    {
      out.CcardCarrier = (String) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("EpgCardType")) != null)
    {
      out.EpgCardType = (String) obj;
    }
  
    if ((obj = record.get ("CheckDigitAlg")) != null)
    {
      out.CheckDigitAlg = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
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
  /** convert Map to CreditCardTypeCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardTypeCodeObjectFilter the converted object
   */
  public static CreditCardTypeCodeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardTypeCodeObjectFilter out = new CreditCardTypeCodeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CreditCardTypeCodeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map EpgCardTypeMap = (Map)record.get("EpgCardType");
    Boolean EpgCardTypeFetch = DataHelper.getFetch(EpgCardTypeMap);
    Boolean EpgCardTypeSortDir = DataHelper.getSortDirection(EpgCardTypeMap);
    Integer EpgCardTypeSortOrder = DataHelper.getSortOrder(EpgCardTypeMap);
    if (EpgCardTypeFetch != null) out.setEpgCardTypeFetch(EpgCardTypeFetch);
    if (EpgCardTypeSortDir != null) out.setEpgCardTypeSortDirection(EpgCardTypeSortDir);
    if (EpgCardTypeSortOrder != null) out.setEpgCardTypeSortOrder(EpgCardTypeSortOrder);

    Filter[] EpgCardTypeFilter = DataHelper.mapToFilterArray(EpgCardTypeMap, String.class);
    if (EpgCardTypeFilter != null) {
      StringFilter[] EpgCardTypeFilters = new StringFilter[EpgCardTypeFilter.length];
      for (int i = 0; i < EpgCardTypeFilters.length; i++) {
        EpgCardTypeFilters[i] = (StringFilter)EpgCardTypeFilter[i];
      }
      try {
        out.setEpgCardTypeFilter(EpgCardTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CheckDigitAlgMap = (Map)record.get("CheckDigitAlg");
    Boolean CheckDigitAlgFetch = DataHelper.getFetch(CheckDigitAlgMap);
    Boolean CheckDigitAlgSortDir = DataHelper.getSortDirection(CheckDigitAlgMap);
    Integer CheckDigitAlgSortOrder = DataHelper.getSortOrder(CheckDigitAlgMap);
    if (CheckDigitAlgFetch != null) out.setCheckDigitAlgFetch(CheckDigitAlgFetch);
    if (CheckDigitAlgSortDir != null) out.setCheckDigitAlgSortDirection(CheckDigitAlgSortDir);
    if (CheckDigitAlgSortOrder != null) out.setCheckDigitAlgSortOrder(CheckDigitAlgSortOrder);

    Filter[] CheckDigitAlgFilter = DataHelper.mapToFilterArray(CheckDigitAlgMap, Integer.class);
    if (CheckDigitAlgFilter != null) {
      IntegerFilter[] CheckDigitAlgFilters = new IntegerFilter[CheckDigitAlgFilter.length];
      for (int i = 0; i < CheckDigitAlgFilters.length; i++) {
        CheckDigitAlgFilters[i] = (IntegerFilter)CheckDigitAlgFilter[i];
      }
      try {
        out.setCheckDigitAlgFilter(CheckDigitAlgFilters);
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
