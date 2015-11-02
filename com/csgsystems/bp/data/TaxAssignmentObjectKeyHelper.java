/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectKeyHelper.java
 * Definition File: Admin/.xml
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

/** Helper class for TaxAssignmentObject's Key objects. */
public class TaxAssignmentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TaxAssignmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAssignmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAssignmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TaxAssignmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAssignmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAssignmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxAssignmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TaxAssignmentObjectKeyData the converted object
   */
  public static TaxAssignmentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxAssignmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxAssignmentObject")
   * @return TaxAssignmentObjectKeyData the converted object
   */
  public static TaxAssignmentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxAssignmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TaxAssignmentObjectKeyFilter the converted object
   */
  public static TaxAssignmentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxAssignmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxAssignmentObject")
   * @return TaxAssignmentObjectKeyFilter the converted object
   */
  public static TaxAssignmentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TaxAssignmentObjectKeyData to a Map (not including the root).
  /** convert TaxAssignmentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxAssignmentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountCategorySet) record.put ("AccountCategory", in.AccountCategory);
  
    if (in._BrandIdSet) record.put ("BrandId", in.BrandId);
  
    if (in._CountryCodeSet) record.put ("CountryCode", in.CountryCode);
  
    if (in._StateCodeSet) record.put ("StateCode", in.StateCode);
  
    if (in._CountyCodeSet) record.put ("CountyCode", in.CountyCode);
  
    if (in._CityCodeSet) record.put ("CityCode", in.CityCode);
  
    if (in._FranchiseCodeSet) record.put ("FranchiseCode", in.FranchiseCode);
  
    if (in._ChargeEltTypeSet) record.put ("ChargeEltType", in.ChargeEltType);
  
    if (in._ChargeEltIdSet) record.put ("ChargeEltId", in.ChargeEltId);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    return record;
  }
  /** convert TaxAssignmentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxAssignmentObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountCategory, in.AccountCategorySort, in.AccountCategorySortAscending, in.AccountCategoryFetch);
      if (map != null) record.put ("AccountCategory", map);
      map = DataHelper.filterToMap (in.BrandId, in.BrandIdSort, in.BrandIdSortAscending, in.BrandIdFetch);
      if (map != null) record.put ("BrandId", map);
      map = DataHelper.filterToMap (in.CountryCode, in.CountryCodeSort, in.CountryCodeSortAscending, in.CountryCodeFetch);
      if (map != null) record.put ("CountryCode", map);
      map = DataHelper.filterToMap (in.StateCode, in.StateCodeSort, in.StateCodeSortAscending, in.StateCodeFetch);
      if (map != null) record.put ("StateCode", map);
      map = DataHelper.filterToMap (in.CountyCode, in.CountyCodeSort, in.CountyCodeSortAscending, in.CountyCodeFetch);
      if (map != null) record.put ("CountyCode", map);
      map = DataHelper.filterToMap (in.CityCode, in.CityCodeSort, in.CityCodeSortAscending, in.CityCodeFetch);
      if (map != null) record.put ("CityCode", map);
      map = DataHelper.filterToMap (in.FranchiseCode, in.FranchiseCodeSort, in.FranchiseCodeSortAscending, in.FranchiseCodeFetch);
      if (map != null) record.put ("FranchiseCode", map);
      map = DataHelper.filterToMap (in.ChargeEltType, in.ChargeEltTypeSort, in.ChargeEltTypeSortAscending, in.ChargeEltTypeFetch);
      if (map != null) record.put ("ChargeEltType", map);
      map = DataHelper.filterToMap (in.ChargeEltId, in.ChargeEltIdSort, in.ChargeEltIdSortAscending, in.ChargeEltIdFetch);
      if (map != null) record.put ("ChargeEltId", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
    return record;
  }
  /** convert Map to TaxAssignmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAssignmentObjectKeyData the converted object
   */
  public static TaxAssignmentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAssignmentObjectKeyData out = new TaxAssignmentObjectKeyData ();

    if ((obj = record.get ("AccountCategory")) != null)
    {
      out.AccountCategory = (Integer) obj;
      out._AccountCategorySet = true;
    }
  
    if ((obj = record.get ("BrandId")) != null)
    {
      out.BrandId = (Integer) obj;
      out._BrandIdSet = true;
    }
  
    if ((obj = record.get ("CountryCode")) != null)
    {
      out.CountryCode = (Integer) obj;
      out._CountryCodeSet = true;
    }
  
    if ((obj = record.get ("StateCode")) != null)
    {
      out.StateCode = (Integer) obj;
      out._StateCodeSet = true;
    }
  
    if ((obj = record.get ("CountyCode")) != null)
    {
      out.CountyCode = (Integer) obj;
      out._CountyCodeSet = true;
    }
  
    if ((obj = record.get ("CityCode")) != null)
    {
      out.CityCode = (Integer) obj;
      out._CityCodeSet = true;
    }
  
    if ((obj = record.get ("FranchiseCode")) != null)
    {
      out.FranchiseCode = (Integer) obj;
      out._FranchiseCodeSet = true;
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
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
      out._TaxPkgInstIdSet = true;
    }
  
    return out;
  }
  /** convert Map to TaxAssignmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAssignmentObjectKeyFilter the converted object
   */
  public static TaxAssignmentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAssignmentObjectKeyFilter out = new TaxAssignmentObjectKeyFilter ();

    Map AccountCategoryMap = (Map)record.get("AccountCategory");
    Boolean AccountCategoryFetch = DataHelper.getFetch(AccountCategoryMap);
    Boolean AccountCategorySortDir = DataHelper.getSortDirection(AccountCategoryMap);
    Integer AccountCategorySortOrder = DataHelper.getSortOrder(AccountCategoryMap);
    if (AccountCategoryFetch != null) out.setAccountCategoryFetch(AccountCategoryFetch);
    if (AccountCategorySortDir != null) out.setAccountCategorySortDirection(AccountCategorySortDir);
    if (AccountCategorySortOrder != null) out.setAccountCategorySortOrder(AccountCategorySortOrder);

    Filter[] AccountCategoryFilter = DataHelper.mapToFilterArray(AccountCategoryMap, Integer.class);
    if (AccountCategoryFilter != null) {
      IntegerFilter[] AccountCategoryFilters = new IntegerFilter[AccountCategoryFilter.length];
      for (int i = 0; i < AccountCategoryFilters.length; i++) {
        AccountCategoryFilters[i] = (IntegerFilter)AccountCategoryFilter[i];
      }
      try {
        out.setAccountCategoryFilter(AccountCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BrandIdMap = (Map)record.get("BrandId");
    Boolean BrandIdFetch = DataHelper.getFetch(BrandIdMap);
    Boolean BrandIdSortDir = DataHelper.getSortDirection(BrandIdMap);
    Integer BrandIdSortOrder = DataHelper.getSortOrder(BrandIdMap);
    if (BrandIdFetch != null) out.setBrandIdFetch(BrandIdFetch);
    if (BrandIdSortDir != null) out.setBrandIdSortDirection(BrandIdSortDir);
    if (BrandIdSortOrder != null) out.setBrandIdSortOrder(BrandIdSortOrder);

    Filter[] BrandIdFilter = DataHelper.mapToFilterArray(BrandIdMap, Integer.class);
    if (BrandIdFilter != null) {
      IntegerFilter[] BrandIdFilters = new IntegerFilter[BrandIdFilter.length];
      for (int i = 0; i < BrandIdFilters.length; i++) {
        BrandIdFilters[i] = (IntegerFilter)BrandIdFilter[i];
      }
      try {
        out.setBrandIdFilter(BrandIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeMap = (Map)record.get("CountryCode");
    Boolean CountryCodeFetch = DataHelper.getFetch(CountryCodeMap);
    Boolean CountryCodeSortDir = DataHelper.getSortDirection(CountryCodeMap);
    Integer CountryCodeSortOrder = DataHelper.getSortOrder(CountryCodeMap);
    if (CountryCodeFetch != null) out.setCountryCodeFetch(CountryCodeFetch);
    if (CountryCodeSortDir != null) out.setCountryCodeSortDirection(CountryCodeSortDir);
    if (CountryCodeSortOrder != null) out.setCountryCodeSortOrder(CountryCodeSortOrder);

    Filter[] CountryCodeFilter = DataHelper.mapToFilterArray(CountryCodeMap, Integer.class);
    if (CountryCodeFilter != null) {
      IntegerFilter[] CountryCodeFilters = new IntegerFilter[CountryCodeFilter.length];
      for (int i = 0; i < CountryCodeFilters.length; i++) {
        CountryCodeFilters[i] = (IntegerFilter)CountryCodeFilter[i];
      }
      try {
        out.setCountryCodeFilter(CountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StateCodeMap = (Map)record.get("StateCode");
    Boolean StateCodeFetch = DataHelper.getFetch(StateCodeMap);
    Boolean StateCodeSortDir = DataHelper.getSortDirection(StateCodeMap);
    Integer StateCodeSortOrder = DataHelper.getSortOrder(StateCodeMap);
    if (StateCodeFetch != null) out.setStateCodeFetch(StateCodeFetch);
    if (StateCodeSortDir != null) out.setStateCodeSortDirection(StateCodeSortDir);
    if (StateCodeSortOrder != null) out.setStateCodeSortOrder(StateCodeSortOrder);

    Filter[] StateCodeFilter = DataHelper.mapToFilterArray(StateCodeMap, Integer.class);
    if (StateCodeFilter != null) {
      IntegerFilter[] StateCodeFilters = new IntegerFilter[StateCodeFilter.length];
      for (int i = 0; i < StateCodeFilters.length; i++) {
        StateCodeFilters[i] = (IntegerFilter)StateCodeFilter[i];
      }
      try {
        out.setStateCodeFilter(StateCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountyCodeMap = (Map)record.get("CountyCode");
    Boolean CountyCodeFetch = DataHelper.getFetch(CountyCodeMap);
    Boolean CountyCodeSortDir = DataHelper.getSortDirection(CountyCodeMap);
    Integer CountyCodeSortOrder = DataHelper.getSortOrder(CountyCodeMap);
    if (CountyCodeFetch != null) out.setCountyCodeFetch(CountyCodeFetch);
    if (CountyCodeSortDir != null) out.setCountyCodeSortDirection(CountyCodeSortDir);
    if (CountyCodeSortOrder != null) out.setCountyCodeSortOrder(CountyCodeSortOrder);

    Filter[] CountyCodeFilter = DataHelper.mapToFilterArray(CountyCodeMap, Integer.class);
    if (CountyCodeFilter != null) {
      IntegerFilter[] CountyCodeFilters = new IntegerFilter[CountyCodeFilter.length];
      for (int i = 0; i < CountyCodeFilters.length; i++) {
        CountyCodeFilters[i] = (IntegerFilter)CountyCodeFilter[i];
      }
      try {
        out.setCountyCodeFilter(CountyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CityCodeMap = (Map)record.get("CityCode");
    Boolean CityCodeFetch = DataHelper.getFetch(CityCodeMap);
    Boolean CityCodeSortDir = DataHelper.getSortDirection(CityCodeMap);
    Integer CityCodeSortOrder = DataHelper.getSortOrder(CityCodeMap);
    if (CityCodeFetch != null) out.setCityCodeFetch(CityCodeFetch);
    if (CityCodeSortDir != null) out.setCityCodeSortDirection(CityCodeSortDir);
    if (CityCodeSortOrder != null) out.setCityCodeSortOrder(CityCodeSortOrder);

    Filter[] CityCodeFilter = DataHelper.mapToFilterArray(CityCodeMap, Integer.class);
    if (CityCodeFilter != null) {
      IntegerFilter[] CityCodeFilters = new IntegerFilter[CityCodeFilter.length];
      for (int i = 0; i < CityCodeFilters.length; i++) {
        CityCodeFilters[i] = (IntegerFilter)CityCodeFilter[i];
      }
      try {
        out.setCityCodeFilter(CityCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FranchiseCodeMap = (Map)record.get("FranchiseCode");
    Boolean FranchiseCodeFetch = DataHelper.getFetch(FranchiseCodeMap);
    Boolean FranchiseCodeSortDir = DataHelper.getSortDirection(FranchiseCodeMap);
    Integer FranchiseCodeSortOrder = DataHelper.getSortOrder(FranchiseCodeMap);
    if (FranchiseCodeFetch != null) out.setFranchiseCodeFetch(FranchiseCodeFetch);
    if (FranchiseCodeSortDir != null) out.setFranchiseCodeSortDirection(FranchiseCodeSortDir);
    if (FranchiseCodeSortOrder != null) out.setFranchiseCodeSortOrder(FranchiseCodeSortOrder);

    Filter[] FranchiseCodeFilter = DataHelper.mapToFilterArray(FranchiseCodeMap, Integer.class);
    if (FranchiseCodeFilter != null) {
      IntegerFilter[] FranchiseCodeFilters = new IntegerFilter[FranchiseCodeFilter.length];
      for (int i = 0; i < FranchiseCodeFilters.length; i++) {
        FranchiseCodeFilters[i] = (IntegerFilter)FranchiseCodeFilter[i];
      }
      try {
        out.setFranchiseCodeFilter(FranchiseCodeFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
