/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageServiceObjectHelper.java
 * Definition File: Customer/UnbilledUsage.xml
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


/** Helper class to convert UnbilledUsageServiceObject JavaBean objects to/from HashMaps.
 */
public class UnbilledUsageServiceObjectHelper implements ArubaObjectHelper
{
  /** convert UnbilledUsageServiceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (UnbilledUsageServiceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageServiceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageServiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageServiceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageServiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = UnbilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert UnbilledUsageServiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageServiceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageServiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageServiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageServiceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageServiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = UnbilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnbilledUsageServiceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageServiceObjectData the converted object
   */
  public static UnbilledUsageServiceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnbilledUsageServiceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageServiceObject")
   * @return UnbilledUsageServiceObjectData the converted object
   */
  public static UnbilledUsageServiceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageServiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnbilledUsageServiceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageServiceObjectFilter the converted object
   */
  public static UnbilledUsageServiceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnbilledUsageServiceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnbilledUsageServiceObject")
   * @return UnbilledUsageServiceObjectFilter the converted object
   */
  public static UnbilledUsageServiceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageServiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to UnbilledUsageServiceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return UnbilledUsageServiceObjectDataList the converted object
   */
  public static UnbilledUsageServiceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to UnbilledUsageServiceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageServiceObjectList")
   * @return UnbilledUsageServiceObjectDataList the converted object
   */
  public static UnbilledUsageServiceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageServiceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    UnbilledUsageServiceObjectData[] array = null;
    if (root != null)
    {
      array = new UnbilledUsageServiceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = UnbilledUsageServiceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new UnbilledUsageServiceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new UnbilledUsageServiceObjectDataList (array, index, total);
  }
  /** convert UnbilledUsageServiceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageServiceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServiceParentAccountExternalIdSet) record.put ("ServiceParentAccountExternalId", in.ServiceParentAccountExternalId);
  
    if (in._ServiceParentAccountExternalIdTypeSet) record.put ("ServiceParentAccountExternalIdType", in.ServiceParentAccountExternalIdType);
  
    if (in._BRevRcvCostCtrSet) record.put ("BRevRcvCostCtr", in.BRevRcvCostCtr);
  
    if (in._BServiceFnameSet) record.put ("BServiceFname", in.BServiceFname);
  
    if (in._BServiceMinitSet) record.put ("BServiceMinit", in.BServiceMinit);
  
    if (in._BServiceLnameSet) record.put ("BServiceLname", in.BServiceLname);
  
    if (in._BServiceCompanySet) record.put ("BServiceCompany", in.BServiceCompany);
  
    if (in._BServicePhoneSet) record.put ("BServicePhone", in.BServicePhone);
  
    if (in._BServicePhone2Set) record.put ("BServicePhone2", in.BServicePhone2);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._CodewordSet) record.put ("Codeword", in.Codeword);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._DisplayExternalIdTypeSet) record.put ("DisplayExternalIdType", in.DisplayExternalIdType);
  
    if (in._EligKey1Set) record.put ("EligKey1", in.EligKey1);
  
    if (in._EligKey2Set) record.put ("EligKey2", in.EligKey2);
  
    if (in._EligKey3Set) record.put ("EligKey3", in.EligKey3);
  
    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
  
    if (in._ExrateClassSet) record.put ("ExrateClass", in.ExrateClass);
  
    if (in._IxcProviderIdSet) record.put ("IxcProviderId", in.IxcProviderId);
  
    if (in._LecProviderIdSet) record.put ("LecProviderId", in.LecProviderId);
  
    if (in._NonpubNonlistSet) record.put ("NonpubNonlist", in.NonpubNonlist);
  
    if (in._PicDateActiveSet) record.put ("PicDateActive", in.PicDateActive);
  
    if (in._ParentAccountInternalIdSet) record.put ("ParentAccountInternalId", in.ParentAccountInternalId);
  
    if (in._PopUnitsSet) record.put ("PopUnits", in.PopUnits);
  
    if (in._PrivacyLevelSet) record.put ("PrivacyLevel", in.PrivacyLevel);
  
    if (in._RestrictedPicSet) record.put ("RestrictedPic", in.RestrictedPic);
  
    if (in._ServiceNamePreSet) record.put ("ServiceNamePre", in.ServiceNamePre);
  
    if (in._ServiceFnameSet) record.put ("ServiceFname", in.ServiceFname);
  
    if (in._ServiceMinitSet) record.put ("ServiceMinit", in.ServiceMinit);
  
    if (in._ServiceLnameSet) record.put ("ServiceLname", in.ServiceLname);
  
    if (in._ServiceNameGenerationSet) record.put ("ServiceNameGeneration", in.ServiceNameGeneration);
  
    if (in._ServiceCompanySet) record.put ("ServiceCompany", in.ServiceCompany);
  
    if (in._ServicePhoneSet) record.put ("ServicePhone", in.ServicePhone);
  
    if (in._ServicePhone2Set) record.put ("ServicePhone2", in.ServicePhone2);
  
    if (in._SalesChannelIdSet) record.put ("SalesChannelId", in.SalesChannelId);
  
    if (in._SimSerialNumberSet) record.put ("SimSerialNumber", in.SimSerialNumber);
  
    if (in._SwitchIdSet) record.put ("SwitchId", in.SwitchId);
  
    if (in._IsPrepaidSet) record.put ("IsPrepaid", in.IsPrepaid);
  
    if (in._ServiceActiveDtSet) record.put ("ServiceActiveDt", in.ServiceActiveDt);
  
    if (in._ServiceInactiveDtSet) record.put ("ServiceInactiveDt", in.ServiceInactiveDt);
  
    if (in._ViewIdSet) record.put ("ViewId", in.ViewId);
      return record;
  }
  /** convert UnbilledUsageServiceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageServiceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServiceParentAccountExternalId, in.ServiceParentAccountExternalIdSort, in.ServiceParentAccountExternalIdSortAscending, in.ServiceParentAccountExternalIdFetch, in.ServiceParentAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceParentAccountExternalId", map);
      map = DataHelper.filterToMap (in.ServiceParentAccountExternalIdType, in.ServiceParentAccountExternalIdTypeSort, in.ServiceParentAccountExternalIdTypeSortAscending, in.ServiceParentAccountExternalIdTypeFetch);
      if (map != null) record.put ("ServiceParentAccountExternalIdType", map);
      map = DataHelper.filterToMap (in.BRevRcvCostCtr, in.BRevRcvCostCtrSort, in.BRevRcvCostCtrSortAscending, in.BRevRcvCostCtrFetch);
      if (map != null) record.put ("BRevRcvCostCtr", map);
      map = DataHelper.filterToMap (in.BServiceFname, in.BServiceFnameSort, in.BServiceFnameSortAscending, in.BServiceFnameFetch, in.BServiceFnameCaseInsensitive);
      if (map != null) record.put ("BServiceFname", map);
      map = DataHelper.filterToMap (in.BServiceMinit, in.BServiceMinitSort, in.BServiceMinitSortAscending, in.BServiceMinitFetch, in.BServiceMinitCaseInsensitive);
      if (map != null) record.put ("BServiceMinit", map);
      map = DataHelper.filterToMap (in.BServiceLname, in.BServiceLnameSort, in.BServiceLnameSortAscending, in.BServiceLnameFetch, in.BServiceLnameCaseInsensitive);
      if (map != null) record.put ("BServiceLname", map);
      map = DataHelper.filterToMap (in.BServiceCompany, in.BServiceCompanySort, in.BServiceCompanySortAscending, in.BServiceCompanyFetch, in.BServiceCompanyCaseInsensitive);
      if (map != null) record.put ("BServiceCompany", map);
      map = DataHelper.filterToMap (in.BServicePhone, in.BServicePhoneSort, in.BServicePhoneSortAscending, in.BServicePhoneFetch, in.BServicePhoneCaseInsensitive);
      if (map != null) record.put ("BServicePhone", map);
      map = DataHelper.filterToMap (in.BServicePhone2, in.BServicePhone2Sort, in.BServicePhone2SortAscending, in.BServicePhone2Fetch, in.BServicePhone2CaseInsensitive);
      if (map != null) record.put ("BServicePhone2", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.Codeword, in.CodewordSort, in.CodewordSortAscending, in.CodewordFetch, in.CodewordCaseInsensitive);
      if (map != null) record.put ("Codeword", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.DisplayExternalIdType, in.DisplayExternalIdTypeSort, in.DisplayExternalIdTypeSortAscending, in.DisplayExternalIdTypeFetch);
      if (map != null) record.put ("DisplayExternalIdType", map);
      map = DataHelper.filterToMap (in.EligKey1, in.EligKey1Sort, in.EligKey1SortAscending, in.EligKey1Fetch);
      if (map != null) record.put ("EligKey1", map);
      map = DataHelper.filterToMap (in.EligKey2, in.EligKey2Sort, in.EligKey2SortAscending, in.EligKey2Fetch);
      if (map != null) record.put ("EligKey2", map);
      map = DataHelper.filterToMap (in.EligKey3, in.EligKey3Sort, in.EligKey3SortAscending, in.EligKey3Fetch);
      if (map != null) record.put ("EligKey3", map);
      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
      map = DataHelper.filterToMap (in.ExrateClass, in.ExrateClassSort, in.ExrateClassSortAscending, in.ExrateClassFetch);
      if (map != null) record.put ("ExrateClass", map);
      map = DataHelper.filterToMap (in.IxcProviderId, in.IxcProviderIdSort, in.IxcProviderIdSortAscending, in.IxcProviderIdFetch);
      if (map != null) record.put ("IxcProviderId", map);
      map = DataHelper.filterToMap (in.LecProviderId, in.LecProviderIdSort, in.LecProviderIdSortAscending, in.LecProviderIdFetch);
      if (map != null) record.put ("LecProviderId", map);
      map = DataHelper.filterToMap (in.NonpubNonlist, in.NonpubNonlistSort, in.NonpubNonlistSortAscending, in.NonpubNonlistFetch);
      if (map != null) record.put ("NonpubNonlist", map);
      map = DataHelper.filterToMap (in.PicDateActive, in.PicDateActiveSort, in.PicDateActiveSortAscending, in.PicDateActiveFetch);
      if (map != null) record.put ("PicDateActive", map);
      map = DataHelper.filterToMap (in.ParentAccountInternalId, in.ParentAccountInternalIdSort, in.ParentAccountInternalIdSortAscending, in.ParentAccountInternalIdFetch);
      if (map != null) record.put ("ParentAccountInternalId", map);
      map = DataHelper.filterToMap (in.PopUnits, in.PopUnitsSort, in.PopUnitsSortAscending, in.PopUnitsFetch);
      if (map != null) record.put ("PopUnits", map);
      map = DataHelper.filterToMap (in.PrivacyLevel, in.PrivacyLevelSort, in.PrivacyLevelSortAscending, in.PrivacyLevelFetch);
      if (map != null) record.put ("PrivacyLevel", map);
      map = DataHelper.filterToMap (in.RestrictedPic, in.RestrictedPicSort, in.RestrictedPicSortAscending, in.RestrictedPicFetch);
      if (map != null) record.put ("RestrictedPic", map);
      map = DataHelper.filterToMap (in.ServiceNamePre, in.ServiceNamePreSort, in.ServiceNamePreSortAscending, in.ServiceNamePreFetch, in.ServiceNamePreCaseInsensitive);
      if (map != null) record.put ("ServiceNamePre", map);
      map = DataHelper.filterToMap (in.ServiceFname, in.ServiceFnameSort, in.ServiceFnameSortAscending, in.ServiceFnameFetch, in.ServiceFnameCaseInsensitive);
      if (map != null) record.put ("ServiceFname", map);
      map = DataHelper.filterToMap (in.ServiceMinit, in.ServiceMinitSort, in.ServiceMinitSortAscending, in.ServiceMinitFetch, in.ServiceMinitCaseInsensitive);
      if (map != null) record.put ("ServiceMinit", map);
      map = DataHelper.filterToMap (in.ServiceLname, in.ServiceLnameSort, in.ServiceLnameSortAscending, in.ServiceLnameFetch, in.ServiceLnameCaseInsensitive);
      if (map != null) record.put ("ServiceLname", map);
      map = DataHelper.filterToMap (in.ServiceNameGeneration, in.ServiceNameGenerationSort, in.ServiceNameGenerationSortAscending, in.ServiceNameGenerationFetch, in.ServiceNameGenerationCaseInsensitive);
      if (map != null) record.put ("ServiceNameGeneration", map);
      map = DataHelper.filterToMap (in.ServiceCompany, in.ServiceCompanySort, in.ServiceCompanySortAscending, in.ServiceCompanyFetch, in.ServiceCompanyCaseInsensitive);
      if (map != null) record.put ("ServiceCompany", map);
      map = DataHelper.filterToMap (in.ServicePhone, in.ServicePhoneSort, in.ServicePhoneSortAscending, in.ServicePhoneFetch, in.ServicePhoneCaseInsensitive);
      if (map != null) record.put ("ServicePhone", map);
      map = DataHelper.filterToMap (in.ServicePhone2, in.ServicePhone2Sort, in.ServicePhone2SortAscending, in.ServicePhone2Fetch, in.ServicePhone2CaseInsensitive);
      if (map != null) record.put ("ServicePhone2", map);
      map = DataHelper.filterToMap (in.SalesChannelId, in.SalesChannelIdSort, in.SalesChannelIdSortAscending, in.SalesChannelIdFetch);
      if (map != null) record.put ("SalesChannelId", map);
      map = DataHelper.filterToMap (in.SimSerialNumber, in.SimSerialNumberSort, in.SimSerialNumberSortAscending, in.SimSerialNumberFetch, in.SimSerialNumberCaseInsensitive);
      if (map != null) record.put ("SimSerialNumber", map);
      map = DataHelper.filterToMap (in.SwitchId, in.SwitchIdSort, in.SwitchIdSortAscending, in.SwitchIdFetch, in.SwitchIdCaseInsensitive);
      if (map != null) record.put ("SwitchId", map);
      map = DataHelper.filterToMap (in.IsPrepaid, in.IsPrepaidSort, in.IsPrepaidSortAscending, in.IsPrepaidFetch);
      if (map != null) record.put ("IsPrepaid", map);
      map = DataHelper.filterToMap (in.ServiceActiveDt, in.ServiceActiveDtSort, in.ServiceActiveDtSortAscending, in.ServiceActiveDtFetch);
      if (map != null) record.put ("ServiceActiveDt", map);
      map = DataHelper.filterToMap (in.ServiceInactiveDt, in.ServiceInactiveDtSort, in.ServiceInactiveDtSortAscending, in.ServiceInactiveDtFetch);
      if (map != null) record.put ("ServiceInactiveDt", map);
      map = DataHelper.filterToMap (in.ViewId, in.ViewIdSort, in.ViewIdSortAscending, in.ViewIdFetch);
      if (map != null) record.put ("ViewId", map);
    return record;
  }
  /** convert Map to UnbilledUsageServiceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageServiceObjectData the converted object
   */
  public static UnbilledUsageServiceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageServiceObjectData out = new UnbilledUsageServiceObjectData (UnbilledUsageObjectHelper.getObj (record));

    if ((obj = record.get ("ServiceParentAccountExternalId")) != null)
    {
      out.ServiceParentAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceParentAccountExternalIdType")) != null)
    {
      out.ServiceParentAccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("BRevRcvCostCtr")) != null)
    {
      out.BRevRcvCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("BServiceFname")) != null)
    {
      out.BServiceFname = (String) obj;
    }
  
    if ((obj = record.get ("BServiceMinit")) != null)
    {
      out.BServiceMinit = (String) obj;
    }
  
    if ((obj = record.get ("BServiceLname")) != null)
    {
      out.BServiceLname = (String) obj;
    }
  
    if ((obj = record.get ("BServiceCompany")) != null)
    {
      out.BServiceCompany = (String) obj;
    }
  
    if ((obj = record.get ("BServicePhone")) != null)
    {
      out.BServicePhone = (String) obj;
    }
  
    if ((obj = record.get ("BServicePhone2")) != null)
    {
      out.BServicePhone2 = (String) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("Codeword")) != null)
    {
      out.Codeword = (String) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("DisplayExternalIdType")) != null)
    {
      out.DisplayExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("EligKey1")) != null)
    {
      out.EligKey1 = (Integer) obj;
    }
  
    if ((obj = record.get ("EligKey2")) != null)
    {
      out.EligKey2 = (Integer) obj;
    }
  
    if ((obj = record.get ("EligKey3")) != null)
    {
      out.EligKey3 = (Integer) obj;
    }
  
    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
    }
  
    if ((obj = record.get ("ExrateClass")) != null)
    {
      out.ExrateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("IxcProviderId")) != null)
    {
      out.IxcProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("LecProviderId")) != null)
    {
      out.LecProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("NonpubNonlist")) != null)
    {
      out.NonpubNonlist = (Integer) obj;
    }
  
    if ((obj = record.get ("PicDateActive")) != null)
    {
      out.PicDateActive = (Date) obj;
    }
  
    if ((obj = record.get ("ParentAccountInternalId")) != null)
    {
      out.ParentAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("PopUnits")) != null)
    {
      out.PopUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("PrivacyLevel")) != null)
    {
      out.PrivacyLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("RestrictedPic")) != null)
    {
      out.RestrictedPic = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceNamePre")) != null)
    {
      out.ServiceNamePre = (String) obj;
    }
  
    if ((obj = record.get ("ServiceFname")) != null)
    {
      out.ServiceFname = (String) obj;
    }
  
    if ((obj = record.get ("ServiceMinit")) != null)
    {
      out.ServiceMinit = (String) obj;
    }
  
    if ((obj = record.get ("ServiceLname")) != null)
    {
      out.ServiceLname = (String) obj;
    }
  
    if ((obj = record.get ("ServiceNameGeneration")) != null)
    {
      out.ServiceNameGeneration = (String) obj;
    }
  
    if ((obj = record.get ("ServiceCompany")) != null)
    {
      out.ServiceCompany = (String) obj;
    }
  
    if ((obj = record.get ("ServicePhone")) != null)
    {
      out.ServicePhone = (String) obj;
    }
  
    if ((obj = record.get ("ServicePhone2")) != null)
    {
      out.ServicePhone2 = (String) obj;
    }
  
    if ((obj = record.get ("SalesChannelId")) != null)
    {
      out.SalesChannelId = (Integer) obj;
    }
  
    if ((obj = record.get ("SimSerialNumber")) != null)
    {
      out.SimSerialNumber = (String) obj;
    }
  
    if ((obj = record.get ("SwitchId")) != null)
    {
      out.SwitchId = (String) obj;
    }
  
    if ((obj = record.get ("IsPrepaid")) != null)
    {
      out.IsPrepaid = (Boolean) obj;
    }
  
    if ((obj = record.get ("ServiceActiveDt")) != null)
    {
      out.ServiceActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ServiceInactiveDt")) != null)
    {
      out.ServiceInactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ViewId")) != null)
    {
      out.ViewId = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to UnbilledUsageServiceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageServiceObjectFilter the converted object
   */
  public static UnbilledUsageServiceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageServiceObjectFilter out = new UnbilledUsageServiceObjectFilter (UnbilledUsageObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map ServiceParentAccountExternalIdMap = (Map)record.get("ServiceParentAccountExternalId");
    Boolean ServiceParentAccountExternalIdFetch = DataHelper.getFetch(ServiceParentAccountExternalIdMap);
    Boolean ServiceParentAccountExternalIdSortDir = DataHelper.getSortDirection(ServiceParentAccountExternalIdMap);
    Integer ServiceParentAccountExternalIdSortOrder = DataHelper.getSortOrder(ServiceParentAccountExternalIdMap);
    if (ServiceParentAccountExternalIdFetch != null) out.setServiceParentAccountExternalIdFetch(ServiceParentAccountExternalIdFetch);
    if (ServiceParentAccountExternalIdSortDir != null) out.setServiceParentAccountExternalIdSortDirection(ServiceParentAccountExternalIdSortDir);
    if (ServiceParentAccountExternalIdSortOrder != null) out.setServiceParentAccountExternalIdSortOrder(ServiceParentAccountExternalIdSortOrder);

    Filter[] ServiceParentAccountExternalIdFilter = DataHelper.mapToFilterArray(ServiceParentAccountExternalIdMap, String.class);
    if (ServiceParentAccountExternalIdFilter != null) {
      StringFilter[] ServiceParentAccountExternalIdFilters = new StringFilter[ServiceParentAccountExternalIdFilter.length];
      for (int i = 0; i < ServiceParentAccountExternalIdFilters.length; i++) {
        ServiceParentAccountExternalIdFilters[i] = (StringFilter)ServiceParentAccountExternalIdFilter[i];
      }
      try {
        out.setServiceParentAccountExternalIdFilter(ServiceParentAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceParentAccountExternalIdTypeMap = (Map)record.get("ServiceParentAccountExternalIdType");
    Boolean ServiceParentAccountExternalIdTypeFetch = DataHelper.getFetch(ServiceParentAccountExternalIdTypeMap);
    Boolean ServiceParentAccountExternalIdTypeSortDir = DataHelper.getSortDirection(ServiceParentAccountExternalIdTypeMap);
    Integer ServiceParentAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(ServiceParentAccountExternalIdTypeMap);
    if (ServiceParentAccountExternalIdTypeFetch != null) out.setServiceParentAccountExternalIdTypeFetch(ServiceParentAccountExternalIdTypeFetch);
    if (ServiceParentAccountExternalIdTypeSortDir != null) out.setServiceParentAccountExternalIdTypeSortDirection(ServiceParentAccountExternalIdTypeSortDir);
    if (ServiceParentAccountExternalIdTypeSortOrder != null) out.setServiceParentAccountExternalIdTypeSortOrder(ServiceParentAccountExternalIdTypeSortOrder);

    Filter[] ServiceParentAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(ServiceParentAccountExternalIdTypeMap, Integer.class);
    if (ServiceParentAccountExternalIdTypeFilter != null) {
      IntegerFilter[] ServiceParentAccountExternalIdTypeFilters = new IntegerFilter[ServiceParentAccountExternalIdTypeFilter.length];
      for (int i = 0; i < ServiceParentAccountExternalIdTypeFilters.length; i++) {
        ServiceParentAccountExternalIdTypeFilters[i] = (IntegerFilter)ServiceParentAccountExternalIdTypeFilter[i];
      }
      try {
        out.setServiceParentAccountExternalIdTypeFilter(ServiceParentAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BRevRcvCostCtrMap = (Map)record.get("BRevRcvCostCtr");
    Boolean BRevRcvCostCtrFetch = DataHelper.getFetch(BRevRcvCostCtrMap);
    Boolean BRevRcvCostCtrSortDir = DataHelper.getSortDirection(BRevRcvCostCtrMap);
    Integer BRevRcvCostCtrSortOrder = DataHelper.getSortOrder(BRevRcvCostCtrMap);
    if (BRevRcvCostCtrFetch != null) out.setBRevRcvCostCtrFetch(BRevRcvCostCtrFetch);
    if (BRevRcvCostCtrSortDir != null) out.setBRevRcvCostCtrSortDirection(BRevRcvCostCtrSortDir);
    if (BRevRcvCostCtrSortOrder != null) out.setBRevRcvCostCtrSortOrder(BRevRcvCostCtrSortOrder);

    Filter[] BRevRcvCostCtrFilter = DataHelper.mapToFilterArray(BRevRcvCostCtrMap, Integer.class);
    if (BRevRcvCostCtrFilter != null) {
      IntegerFilter[] BRevRcvCostCtrFilters = new IntegerFilter[BRevRcvCostCtrFilter.length];
      for (int i = 0; i < BRevRcvCostCtrFilters.length; i++) {
        BRevRcvCostCtrFilters[i] = (IntegerFilter)BRevRcvCostCtrFilter[i];
      }
      try {
        out.setBRevRcvCostCtrFilter(BRevRcvCostCtrFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServiceFnameMap = (Map)record.get("BServiceFname");
    Boolean BServiceFnameFetch = DataHelper.getFetch(BServiceFnameMap);
    Boolean BServiceFnameSortDir = DataHelper.getSortDirection(BServiceFnameMap);
    Integer BServiceFnameSortOrder = DataHelper.getSortOrder(BServiceFnameMap);
    if (BServiceFnameFetch != null) out.setBServiceFnameFetch(BServiceFnameFetch);
    if (BServiceFnameSortDir != null) out.setBServiceFnameSortDirection(BServiceFnameSortDir);
    if (BServiceFnameSortOrder != null) out.setBServiceFnameSortOrder(BServiceFnameSortOrder);

    Filter[] BServiceFnameFilter = DataHelper.mapToFilterArray(BServiceFnameMap, String.class);
    if (BServiceFnameFilter != null) {
      StringFilter[] BServiceFnameFilters = new StringFilter[BServiceFnameFilter.length];
      for (int i = 0; i < BServiceFnameFilters.length; i++) {
        BServiceFnameFilters[i] = (StringFilter)BServiceFnameFilter[i];
      }
      try {
        out.setBServiceFnameFilter(BServiceFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServiceMinitMap = (Map)record.get("BServiceMinit");
    Boolean BServiceMinitFetch = DataHelper.getFetch(BServiceMinitMap);
    Boolean BServiceMinitSortDir = DataHelper.getSortDirection(BServiceMinitMap);
    Integer BServiceMinitSortOrder = DataHelper.getSortOrder(BServiceMinitMap);
    if (BServiceMinitFetch != null) out.setBServiceMinitFetch(BServiceMinitFetch);
    if (BServiceMinitSortDir != null) out.setBServiceMinitSortDirection(BServiceMinitSortDir);
    if (BServiceMinitSortOrder != null) out.setBServiceMinitSortOrder(BServiceMinitSortOrder);

    Filter[] BServiceMinitFilter = DataHelper.mapToFilterArray(BServiceMinitMap, String.class);
    if (BServiceMinitFilter != null) {
      StringFilter[] BServiceMinitFilters = new StringFilter[BServiceMinitFilter.length];
      for (int i = 0; i < BServiceMinitFilters.length; i++) {
        BServiceMinitFilters[i] = (StringFilter)BServiceMinitFilter[i];
      }
      try {
        out.setBServiceMinitFilter(BServiceMinitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServiceLnameMap = (Map)record.get("BServiceLname");
    Boolean BServiceLnameFetch = DataHelper.getFetch(BServiceLnameMap);
    Boolean BServiceLnameSortDir = DataHelper.getSortDirection(BServiceLnameMap);
    Integer BServiceLnameSortOrder = DataHelper.getSortOrder(BServiceLnameMap);
    if (BServiceLnameFetch != null) out.setBServiceLnameFetch(BServiceLnameFetch);
    if (BServiceLnameSortDir != null) out.setBServiceLnameSortDirection(BServiceLnameSortDir);
    if (BServiceLnameSortOrder != null) out.setBServiceLnameSortOrder(BServiceLnameSortOrder);

    Filter[] BServiceLnameFilter = DataHelper.mapToFilterArray(BServiceLnameMap, String.class);
    if (BServiceLnameFilter != null) {
      StringFilter[] BServiceLnameFilters = new StringFilter[BServiceLnameFilter.length];
      for (int i = 0; i < BServiceLnameFilters.length; i++) {
        BServiceLnameFilters[i] = (StringFilter)BServiceLnameFilter[i];
      }
      try {
        out.setBServiceLnameFilter(BServiceLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServiceCompanyMap = (Map)record.get("BServiceCompany");
    Boolean BServiceCompanyFetch = DataHelper.getFetch(BServiceCompanyMap);
    Boolean BServiceCompanySortDir = DataHelper.getSortDirection(BServiceCompanyMap);
    Integer BServiceCompanySortOrder = DataHelper.getSortOrder(BServiceCompanyMap);
    if (BServiceCompanyFetch != null) out.setBServiceCompanyFetch(BServiceCompanyFetch);
    if (BServiceCompanySortDir != null) out.setBServiceCompanySortDirection(BServiceCompanySortDir);
    if (BServiceCompanySortOrder != null) out.setBServiceCompanySortOrder(BServiceCompanySortOrder);

    Filter[] BServiceCompanyFilter = DataHelper.mapToFilterArray(BServiceCompanyMap, String.class);
    if (BServiceCompanyFilter != null) {
      StringFilter[] BServiceCompanyFilters = new StringFilter[BServiceCompanyFilter.length];
      for (int i = 0; i < BServiceCompanyFilters.length; i++) {
        BServiceCompanyFilters[i] = (StringFilter)BServiceCompanyFilter[i];
      }
      try {
        out.setBServiceCompanyFilter(BServiceCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServicePhoneMap = (Map)record.get("BServicePhone");
    Boolean BServicePhoneFetch = DataHelper.getFetch(BServicePhoneMap);
    Boolean BServicePhoneSortDir = DataHelper.getSortDirection(BServicePhoneMap);
    Integer BServicePhoneSortOrder = DataHelper.getSortOrder(BServicePhoneMap);
    if (BServicePhoneFetch != null) out.setBServicePhoneFetch(BServicePhoneFetch);
    if (BServicePhoneSortDir != null) out.setBServicePhoneSortDirection(BServicePhoneSortDir);
    if (BServicePhoneSortOrder != null) out.setBServicePhoneSortOrder(BServicePhoneSortOrder);

    Filter[] BServicePhoneFilter = DataHelper.mapToFilterArray(BServicePhoneMap, String.class);
    if (BServicePhoneFilter != null) {
      StringFilter[] BServicePhoneFilters = new StringFilter[BServicePhoneFilter.length];
      for (int i = 0; i < BServicePhoneFilters.length; i++) {
        BServicePhoneFilters[i] = (StringFilter)BServicePhoneFilter[i];
      }
      try {
        out.setBServicePhoneFilter(BServicePhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BServicePhone2Map = (Map)record.get("BServicePhone2");
    Boolean BServicePhone2Fetch = DataHelper.getFetch(BServicePhone2Map);
    Boolean BServicePhone2SortDir = DataHelper.getSortDirection(BServicePhone2Map);
    Integer BServicePhone2SortOrder = DataHelper.getSortOrder(BServicePhone2Map);
    if (BServicePhone2Fetch != null) out.setBServicePhone2Fetch(BServicePhone2Fetch);
    if (BServicePhone2SortDir != null) out.setBServicePhone2SortDirection(BServicePhone2SortDir);
    if (BServicePhone2SortOrder != null) out.setBServicePhone2SortOrder(BServicePhone2SortOrder);

    Filter[] BServicePhone2Filter = DataHelper.mapToFilterArray(BServicePhone2Map, String.class);
    if (BServicePhone2Filter != null) {
      StringFilter[] BServicePhone2Filters = new StringFilter[BServicePhone2Filter.length];
      for (int i = 0; i < BServicePhone2Filters.length; i++) {
        BServicePhone2Filters[i] = (StringFilter)BServicePhone2Filter[i];
      }
      try {
        out.setBServicePhone2Filter(BServicePhone2Filters);
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
  
    Map CodewordMap = (Map)record.get("Codeword");
    Boolean CodewordFetch = DataHelper.getFetch(CodewordMap);
    Boolean CodewordSortDir = DataHelper.getSortDirection(CodewordMap);
    Integer CodewordSortOrder = DataHelper.getSortOrder(CodewordMap);
    if (CodewordFetch != null) out.setCodewordFetch(CodewordFetch);
    if (CodewordSortDir != null) out.setCodewordSortDirection(CodewordSortDir);
    if (CodewordSortOrder != null) out.setCodewordSortOrder(CodewordSortOrder);

    Filter[] CodewordFilter = DataHelper.mapToFilterArray(CodewordMap, String.class);
    if (CodewordFilter != null) {
      StringFilter[] CodewordFilters = new StringFilter[CodewordFilter.length];
      for (int i = 0; i < CodewordFilters.length; i++) {
        CodewordFilters[i] = (StringFilter)CodewordFilter[i];
      }
      try {
        out.setCodewordFilter(CodewordFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayExternalIdTypeMap = (Map)record.get("DisplayExternalIdType");
    Boolean DisplayExternalIdTypeFetch = DataHelper.getFetch(DisplayExternalIdTypeMap);
    Boolean DisplayExternalIdTypeSortDir = DataHelper.getSortDirection(DisplayExternalIdTypeMap);
    Integer DisplayExternalIdTypeSortOrder = DataHelper.getSortOrder(DisplayExternalIdTypeMap);
    if (DisplayExternalIdTypeFetch != null) out.setDisplayExternalIdTypeFetch(DisplayExternalIdTypeFetch);
    if (DisplayExternalIdTypeSortDir != null) out.setDisplayExternalIdTypeSortDirection(DisplayExternalIdTypeSortDir);
    if (DisplayExternalIdTypeSortOrder != null) out.setDisplayExternalIdTypeSortOrder(DisplayExternalIdTypeSortOrder);

    Filter[] DisplayExternalIdTypeFilter = DataHelper.mapToFilterArray(DisplayExternalIdTypeMap, Integer.class);
    if (DisplayExternalIdTypeFilter != null) {
      IntegerFilter[] DisplayExternalIdTypeFilters = new IntegerFilter[DisplayExternalIdTypeFilter.length];
      for (int i = 0; i < DisplayExternalIdTypeFilters.length; i++) {
        DisplayExternalIdTypeFilters[i] = (IntegerFilter)DisplayExternalIdTypeFilter[i];
      }
      try {
        out.setDisplayExternalIdTypeFilter(DisplayExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EligKey1Map = (Map)record.get("EligKey1");
    Boolean EligKey1Fetch = DataHelper.getFetch(EligKey1Map);
    Boolean EligKey1SortDir = DataHelper.getSortDirection(EligKey1Map);
    Integer EligKey1SortOrder = DataHelper.getSortOrder(EligKey1Map);
    if (EligKey1Fetch != null) out.setEligKey1Fetch(EligKey1Fetch);
    if (EligKey1SortDir != null) out.setEligKey1SortDirection(EligKey1SortDir);
    if (EligKey1SortOrder != null) out.setEligKey1SortOrder(EligKey1SortOrder);

    Filter[] EligKey1Filter = DataHelper.mapToFilterArray(EligKey1Map, Integer.class);
    if (EligKey1Filter != null) {
      IntegerFilter[] EligKey1Filters = new IntegerFilter[EligKey1Filter.length];
      for (int i = 0; i < EligKey1Filters.length; i++) {
        EligKey1Filters[i] = (IntegerFilter)EligKey1Filter[i];
      }
      try {
        out.setEligKey1Filter(EligKey1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EligKey2Map = (Map)record.get("EligKey2");
    Boolean EligKey2Fetch = DataHelper.getFetch(EligKey2Map);
    Boolean EligKey2SortDir = DataHelper.getSortDirection(EligKey2Map);
    Integer EligKey2SortOrder = DataHelper.getSortOrder(EligKey2Map);
    if (EligKey2Fetch != null) out.setEligKey2Fetch(EligKey2Fetch);
    if (EligKey2SortDir != null) out.setEligKey2SortDirection(EligKey2SortDir);
    if (EligKey2SortOrder != null) out.setEligKey2SortOrder(EligKey2SortOrder);

    Filter[] EligKey2Filter = DataHelper.mapToFilterArray(EligKey2Map, Integer.class);
    if (EligKey2Filter != null) {
      IntegerFilter[] EligKey2Filters = new IntegerFilter[EligKey2Filter.length];
      for (int i = 0; i < EligKey2Filters.length; i++) {
        EligKey2Filters[i] = (IntegerFilter)EligKey2Filter[i];
      }
      try {
        out.setEligKey2Filter(EligKey2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EligKey3Map = (Map)record.get("EligKey3");
    Boolean EligKey3Fetch = DataHelper.getFetch(EligKey3Map);
    Boolean EligKey3SortDir = DataHelper.getSortDirection(EligKey3Map);
    Integer EligKey3SortOrder = DataHelper.getSortOrder(EligKey3Map);
    if (EligKey3Fetch != null) out.setEligKey3Fetch(EligKey3Fetch);
    if (EligKey3SortDir != null) out.setEligKey3SortDirection(EligKey3SortDir);
    if (EligKey3SortOrder != null) out.setEligKey3SortOrder(EligKey3SortOrder);

    Filter[] EligKey3Filter = DataHelper.mapToFilterArray(EligKey3Map, Integer.class);
    if (EligKey3Filter != null) {
      IntegerFilter[] EligKey3Filters = new IntegerFilter[EligKey3Filter.length];
      for (int i = 0; i < EligKey3Filters.length; i++) {
        EligKey3Filters[i] = (IntegerFilter)EligKey3Filter[i];
      }
      try {
        out.setEligKey3Filter(EligKey3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EmfConfigIdMap = (Map)record.get("EmfConfigId");
    Boolean EmfConfigIdFetch = DataHelper.getFetch(EmfConfigIdMap);
    Boolean EmfConfigIdSortDir = DataHelper.getSortDirection(EmfConfigIdMap);
    Integer EmfConfigIdSortOrder = DataHelper.getSortOrder(EmfConfigIdMap);
    if (EmfConfigIdFetch != null) out.setEmfConfigIdFetch(EmfConfigIdFetch);
    if (EmfConfigIdSortDir != null) out.setEmfConfigIdSortDirection(EmfConfigIdSortDir);
    if (EmfConfigIdSortOrder != null) out.setEmfConfigIdSortOrder(EmfConfigIdSortOrder);

    Filter[] EmfConfigIdFilter = DataHelper.mapToFilterArray(EmfConfigIdMap, Integer.class);
    if (EmfConfigIdFilter != null) {
      IntegerFilter[] EmfConfigIdFilters = new IntegerFilter[EmfConfigIdFilter.length];
      for (int i = 0; i < EmfConfigIdFilters.length; i++) {
        EmfConfigIdFilters[i] = (IntegerFilter)EmfConfigIdFilter[i];
      }
      try {
        out.setEmfConfigIdFilter(EmfConfigIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExrateClassMap = (Map)record.get("ExrateClass");
    Boolean ExrateClassFetch = DataHelper.getFetch(ExrateClassMap);
    Boolean ExrateClassSortDir = DataHelper.getSortDirection(ExrateClassMap);
    Integer ExrateClassSortOrder = DataHelper.getSortOrder(ExrateClassMap);
    if (ExrateClassFetch != null) out.setExrateClassFetch(ExrateClassFetch);
    if (ExrateClassSortDir != null) out.setExrateClassSortDirection(ExrateClassSortDir);
    if (ExrateClassSortOrder != null) out.setExrateClassSortOrder(ExrateClassSortOrder);

    Filter[] ExrateClassFilter = DataHelper.mapToFilterArray(ExrateClassMap, Integer.class);
    if (ExrateClassFilter != null) {
      IntegerFilter[] ExrateClassFilters = new IntegerFilter[ExrateClassFilter.length];
      for (int i = 0; i < ExrateClassFilters.length; i++) {
        ExrateClassFilters[i] = (IntegerFilter)ExrateClassFilter[i];
      }
      try {
        out.setExrateClassFilter(ExrateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IxcProviderIdMap = (Map)record.get("IxcProviderId");
    Boolean IxcProviderIdFetch = DataHelper.getFetch(IxcProviderIdMap);
    Boolean IxcProviderIdSortDir = DataHelper.getSortDirection(IxcProviderIdMap);
    Integer IxcProviderIdSortOrder = DataHelper.getSortOrder(IxcProviderIdMap);
    if (IxcProviderIdFetch != null) out.setIxcProviderIdFetch(IxcProviderIdFetch);
    if (IxcProviderIdSortDir != null) out.setIxcProviderIdSortDirection(IxcProviderIdSortDir);
    if (IxcProviderIdSortOrder != null) out.setIxcProviderIdSortOrder(IxcProviderIdSortOrder);

    Filter[] IxcProviderIdFilter = DataHelper.mapToFilterArray(IxcProviderIdMap, Integer.class);
    if (IxcProviderIdFilter != null) {
      IntegerFilter[] IxcProviderIdFilters = new IntegerFilter[IxcProviderIdFilter.length];
      for (int i = 0; i < IxcProviderIdFilters.length; i++) {
        IxcProviderIdFilters[i] = (IntegerFilter)IxcProviderIdFilter[i];
      }
      try {
        out.setIxcProviderIdFilter(IxcProviderIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LecProviderIdMap = (Map)record.get("LecProviderId");
    Boolean LecProviderIdFetch = DataHelper.getFetch(LecProviderIdMap);
    Boolean LecProviderIdSortDir = DataHelper.getSortDirection(LecProviderIdMap);
    Integer LecProviderIdSortOrder = DataHelper.getSortOrder(LecProviderIdMap);
    if (LecProviderIdFetch != null) out.setLecProviderIdFetch(LecProviderIdFetch);
    if (LecProviderIdSortDir != null) out.setLecProviderIdSortDirection(LecProviderIdSortDir);
    if (LecProviderIdSortOrder != null) out.setLecProviderIdSortOrder(LecProviderIdSortOrder);

    Filter[] LecProviderIdFilter = DataHelper.mapToFilterArray(LecProviderIdMap, Integer.class);
    if (LecProviderIdFilter != null) {
      IntegerFilter[] LecProviderIdFilters = new IntegerFilter[LecProviderIdFilter.length];
      for (int i = 0; i < LecProviderIdFilters.length; i++) {
        LecProviderIdFilters[i] = (IntegerFilter)LecProviderIdFilter[i];
      }
      try {
        out.setLecProviderIdFilter(LecProviderIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NonpubNonlistMap = (Map)record.get("NonpubNonlist");
    Boolean NonpubNonlistFetch = DataHelper.getFetch(NonpubNonlistMap);
    Boolean NonpubNonlistSortDir = DataHelper.getSortDirection(NonpubNonlistMap);
    Integer NonpubNonlistSortOrder = DataHelper.getSortOrder(NonpubNonlistMap);
    if (NonpubNonlistFetch != null) out.setNonpubNonlistFetch(NonpubNonlistFetch);
    if (NonpubNonlistSortDir != null) out.setNonpubNonlistSortDirection(NonpubNonlistSortDir);
    if (NonpubNonlistSortOrder != null) out.setNonpubNonlistSortOrder(NonpubNonlistSortOrder);

    Filter[] NonpubNonlistFilter = DataHelper.mapToFilterArray(NonpubNonlistMap, Integer.class);
    if (NonpubNonlistFilter != null) {
      IntegerFilter[] NonpubNonlistFilters = new IntegerFilter[NonpubNonlistFilter.length];
      for (int i = 0; i < NonpubNonlistFilters.length; i++) {
        NonpubNonlistFilters[i] = (IntegerFilter)NonpubNonlistFilter[i];
      }
      try {
        out.setNonpubNonlistFilter(NonpubNonlistFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PicDateActiveMap = (Map)record.get("PicDateActive");
    Boolean PicDateActiveFetch = DataHelper.getFetch(PicDateActiveMap);
    Boolean PicDateActiveSortDir = DataHelper.getSortDirection(PicDateActiveMap);
    Integer PicDateActiveSortOrder = DataHelper.getSortOrder(PicDateActiveMap);
    if (PicDateActiveFetch != null) out.setPicDateActiveFetch(PicDateActiveFetch);
    if (PicDateActiveSortDir != null) out.setPicDateActiveSortDirection(PicDateActiveSortDir);
    if (PicDateActiveSortOrder != null) out.setPicDateActiveSortOrder(PicDateActiveSortOrder);

    Filter[] PicDateActiveFilter = DataHelper.mapToFilterArray(PicDateActiveMap, Date.class);
    if (PicDateActiveFilter != null) {
      DateFilter[] PicDateActiveFilters = new DateFilter[PicDateActiveFilter.length];
      for (int i = 0; i < PicDateActiveFilters.length; i++) {
        PicDateActiveFilters[i] = (DateFilter)PicDateActiveFilter[i];
      }
      try {
        out.setPicDateActiveFilter(PicDateActiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAccountInternalIdMap = (Map)record.get("ParentAccountInternalId");
    Boolean ParentAccountInternalIdFetch = DataHelper.getFetch(ParentAccountInternalIdMap);
    Boolean ParentAccountInternalIdSortDir = DataHelper.getSortDirection(ParentAccountInternalIdMap);
    Integer ParentAccountInternalIdSortOrder = DataHelper.getSortOrder(ParentAccountInternalIdMap);
    if (ParentAccountInternalIdFetch != null) out.setParentAccountInternalIdFetch(ParentAccountInternalIdFetch);
    if (ParentAccountInternalIdSortDir != null) out.setParentAccountInternalIdSortDirection(ParentAccountInternalIdSortDir);
    if (ParentAccountInternalIdSortOrder != null) out.setParentAccountInternalIdSortOrder(ParentAccountInternalIdSortOrder);

    Filter[] ParentAccountInternalIdFilter = DataHelper.mapToFilterArray(ParentAccountInternalIdMap, Integer.class);
    if (ParentAccountInternalIdFilter != null) {
      IntegerFilter[] ParentAccountInternalIdFilters = new IntegerFilter[ParentAccountInternalIdFilter.length];
      for (int i = 0; i < ParentAccountInternalIdFilters.length; i++) {
        ParentAccountInternalIdFilters[i] = (IntegerFilter)ParentAccountInternalIdFilter[i];
      }
      try {
        out.setParentAccountInternalIdFilter(ParentAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PopUnitsMap = (Map)record.get("PopUnits");
    Boolean PopUnitsFetch = DataHelper.getFetch(PopUnitsMap);
    Boolean PopUnitsSortDir = DataHelper.getSortDirection(PopUnitsMap);
    Integer PopUnitsSortOrder = DataHelper.getSortOrder(PopUnitsMap);
    if (PopUnitsFetch != null) out.setPopUnitsFetch(PopUnitsFetch);
    if (PopUnitsSortDir != null) out.setPopUnitsSortDirection(PopUnitsSortDir);
    if (PopUnitsSortOrder != null) out.setPopUnitsSortOrder(PopUnitsSortOrder);

    Filter[] PopUnitsFilter = DataHelper.mapToFilterArray(PopUnitsMap, Integer.class);
    if (PopUnitsFilter != null) {
      IntegerFilter[] PopUnitsFilters = new IntegerFilter[PopUnitsFilter.length];
      for (int i = 0; i < PopUnitsFilters.length; i++) {
        PopUnitsFilters[i] = (IntegerFilter)PopUnitsFilter[i];
      }
      try {
        out.setPopUnitsFilter(PopUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrivacyLevelMap = (Map)record.get("PrivacyLevel");
    Boolean PrivacyLevelFetch = DataHelper.getFetch(PrivacyLevelMap);
    Boolean PrivacyLevelSortDir = DataHelper.getSortDirection(PrivacyLevelMap);
    Integer PrivacyLevelSortOrder = DataHelper.getSortOrder(PrivacyLevelMap);
    if (PrivacyLevelFetch != null) out.setPrivacyLevelFetch(PrivacyLevelFetch);
    if (PrivacyLevelSortDir != null) out.setPrivacyLevelSortDirection(PrivacyLevelSortDir);
    if (PrivacyLevelSortOrder != null) out.setPrivacyLevelSortOrder(PrivacyLevelSortOrder);

    Filter[] PrivacyLevelFilter = DataHelper.mapToFilterArray(PrivacyLevelMap, Integer.class);
    if (PrivacyLevelFilter != null) {
      IntegerFilter[] PrivacyLevelFilters = new IntegerFilter[PrivacyLevelFilter.length];
      for (int i = 0; i < PrivacyLevelFilters.length; i++) {
        PrivacyLevelFilters[i] = (IntegerFilter)PrivacyLevelFilter[i];
      }
      try {
        out.setPrivacyLevelFilter(PrivacyLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RestrictedPicMap = (Map)record.get("RestrictedPic");
    Boolean RestrictedPicFetch = DataHelper.getFetch(RestrictedPicMap);
    Boolean RestrictedPicSortDir = DataHelper.getSortDirection(RestrictedPicMap);
    Integer RestrictedPicSortOrder = DataHelper.getSortOrder(RestrictedPicMap);
    if (RestrictedPicFetch != null) out.setRestrictedPicFetch(RestrictedPicFetch);
    if (RestrictedPicSortDir != null) out.setRestrictedPicSortDirection(RestrictedPicSortDir);
    if (RestrictedPicSortOrder != null) out.setRestrictedPicSortOrder(RestrictedPicSortOrder);

    Filter[] RestrictedPicFilter = DataHelper.mapToFilterArray(RestrictedPicMap, Integer.class);
    if (RestrictedPicFilter != null) {
      IntegerFilter[] RestrictedPicFilters = new IntegerFilter[RestrictedPicFilter.length];
      for (int i = 0; i < RestrictedPicFilters.length; i++) {
        RestrictedPicFilters[i] = (IntegerFilter)RestrictedPicFilter[i];
      }
      try {
        out.setRestrictedPicFilter(RestrictedPicFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceNamePreMap = (Map)record.get("ServiceNamePre");
    Boolean ServiceNamePreFetch = DataHelper.getFetch(ServiceNamePreMap);
    Boolean ServiceNamePreSortDir = DataHelper.getSortDirection(ServiceNamePreMap);
    Integer ServiceNamePreSortOrder = DataHelper.getSortOrder(ServiceNamePreMap);
    if (ServiceNamePreFetch != null) out.setServiceNamePreFetch(ServiceNamePreFetch);
    if (ServiceNamePreSortDir != null) out.setServiceNamePreSortDirection(ServiceNamePreSortDir);
    if (ServiceNamePreSortOrder != null) out.setServiceNamePreSortOrder(ServiceNamePreSortOrder);

    Filter[] ServiceNamePreFilter = DataHelper.mapToFilterArray(ServiceNamePreMap, String.class);
    if (ServiceNamePreFilter != null) {
      StringFilter[] ServiceNamePreFilters = new StringFilter[ServiceNamePreFilter.length];
      for (int i = 0; i < ServiceNamePreFilters.length; i++) {
        ServiceNamePreFilters[i] = (StringFilter)ServiceNamePreFilter[i];
      }
      try {
        out.setServiceNamePreFilter(ServiceNamePreFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceFnameMap = (Map)record.get("ServiceFname");
    Boolean ServiceFnameFetch = DataHelper.getFetch(ServiceFnameMap);
    Boolean ServiceFnameSortDir = DataHelper.getSortDirection(ServiceFnameMap);
    Integer ServiceFnameSortOrder = DataHelper.getSortOrder(ServiceFnameMap);
    if (ServiceFnameFetch != null) out.setServiceFnameFetch(ServiceFnameFetch);
    if (ServiceFnameSortDir != null) out.setServiceFnameSortDirection(ServiceFnameSortDir);
    if (ServiceFnameSortOrder != null) out.setServiceFnameSortOrder(ServiceFnameSortOrder);

    Filter[] ServiceFnameFilter = DataHelper.mapToFilterArray(ServiceFnameMap, String.class);
    if (ServiceFnameFilter != null) {
      StringFilter[] ServiceFnameFilters = new StringFilter[ServiceFnameFilter.length];
      for (int i = 0; i < ServiceFnameFilters.length; i++) {
        ServiceFnameFilters[i] = (StringFilter)ServiceFnameFilter[i];
      }
      try {
        out.setServiceFnameFilter(ServiceFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceMinitMap = (Map)record.get("ServiceMinit");
    Boolean ServiceMinitFetch = DataHelper.getFetch(ServiceMinitMap);
    Boolean ServiceMinitSortDir = DataHelper.getSortDirection(ServiceMinitMap);
    Integer ServiceMinitSortOrder = DataHelper.getSortOrder(ServiceMinitMap);
    if (ServiceMinitFetch != null) out.setServiceMinitFetch(ServiceMinitFetch);
    if (ServiceMinitSortDir != null) out.setServiceMinitSortDirection(ServiceMinitSortDir);
    if (ServiceMinitSortOrder != null) out.setServiceMinitSortOrder(ServiceMinitSortOrder);

    Filter[] ServiceMinitFilter = DataHelper.mapToFilterArray(ServiceMinitMap, String.class);
    if (ServiceMinitFilter != null) {
      StringFilter[] ServiceMinitFilters = new StringFilter[ServiceMinitFilter.length];
      for (int i = 0; i < ServiceMinitFilters.length; i++) {
        ServiceMinitFilters[i] = (StringFilter)ServiceMinitFilter[i];
      }
      try {
        out.setServiceMinitFilter(ServiceMinitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceLnameMap = (Map)record.get("ServiceLname");
    Boolean ServiceLnameFetch = DataHelper.getFetch(ServiceLnameMap);
    Boolean ServiceLnameSortDir = DataHelper.getSortDirection(ServiceLnameMap);
    Integer ServiceLnameSortOrder = DataHelper.getSortOrder(ServiceLnameMap);
    if (ServiceLnameFetch != null) out.setServiceLnameFetch(ServiceLnameFetch);
    if (ServiceLnameSortDir != null) out.setServiceLnameSortDirection(ServiceLnameSortDir);
    if (ServiceLnameSortOrder != null) out.setServiceLnameSortOrder(ServiceLnameSortOrder);

    Filter[] ServiceLnameFilter = DataHelper.mapToFilterArray(ServiceLnameMap, String.class);
    if (ServiceLnameFilter != null) {
      StringFilter[] ServiceLnameFilters = new StringFilter[ServiceLnameFilter.length];
      for (int i = 0; i < ServiceLnameFilters.length; i++) {
        ServiceLnameFilters[i] = (StringFilter)ServiceLnameFilter[i];
      }
      try {
        out.setServiceLnameFilter(ServiceLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceNameGenerationMap = (Map)record.get("ServiceNameGeneration");
    Boolean ServiceNameGenerationFetch = DataHelper.getFetch(ServiceNameGenerationMap);
    Boolean ServiceNameGenerationSortDir = DataHelper.getSortDirection(ServiceNameGenerationMap);
    Integer ServiceNameGenerationSortOrder = DataHelper.getSortOrder(ServiceNameGenerationMap);
    if (ServiceNameGenerationFetch != null) out.setServiceNameGenerationFetch(ServiceNameGenerationFetch);
    if (ServiceNameGenerationSortDir != null) out.setServiceNameGenerationSortDirection(ServiceNameGenerationSortDir);
    if (ServiceNameGenerationSortOrder != null) out.setServiceNameGenerationSortOrder(ServiceNameGenerationSortOrder);

    Filter[] ServiceNameGenerationFilter = DataHelper.mapToFilterArray(ServiceNameGenerationMap, String.class);
    if (ServiceNameGenerationFilter != null) {
      StringFilter[] ServiceNameGenerationFilters = new StringFilter[ServiceNameGenerationFilter.length];
      for (int i = 0; i < ServiceNameGenerationFilters.length; i++) {
        ServiceNameGenerationFilters[i] = (StringFilter)ServiceNameGenerationFilter[i];
      }
      try {
        out.setServiceNameGenerationFilter(ServiceNameGenerationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceCompanyMap = (Map)record.get("ServiceCompany");
    Boolean ServiceCompanyFetch = DataHelper.getFetch(ServiceCompanyMap);
    Boolean ServiceCompanySortDir = DataHelper.getSortDirection(ServiceCompanyMap);
    Integer ServiceCompanySortOrder = DataHelper.getSortOrder(ServiceCompanyMap);
    if (ServiceCompanyFetch != null) out.setServiceCompanyFetch(ServiceCompanyFetch);
    if (ServiceCompanySortDir != null) out.setServiceCompanySortDirection(ServiceCompanySortDir);
    if (ServiceCompanySortOrder != null) out.setServiceCompanySortOrder(ServiceCompanySortOrder);

    Filter[] ServiceCompanyFilter = DataHelper.mapToFilterArray(ServiceCompanyMap, String.class);
    if (ServiceCompanyFilter != null) {
      StringFilter[] ServiceCompanyFilters = new StringFilter[ServiceCompanyFilter.length];
      for (int i = 0; i < ServiceCompanyFilters.length; i++) {
        ServiceCompanyFilters[i] = (StringFilter)ServiceCompanyFilter[i];
      }
      try {
        out.setServiceCompanyFilter(ServiceCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServicePhoneMap = (Map)record.get("ServicePhone");
    Boolean ServicePhoneFetch = DataHelper.getFetch(ServicePhoneMap);
    Boolean ServicePhoneSortDir = DataHelper.getSortDirection(ServicePhoneMap);
    Integer ServicePhoneSortOrder = DataHelper.getSortOrder(ServicePhoneMap);
    if (ServicePhoneFetch != null) out.setServicePhoneFetch(ServicePhoneFetch);
    if (ServicePhoneSortDir != null) out.setServicePhoneSortDirection(ServicePhoneSortDir);
    if (ServicePhoneSortOrder != null) out.setServicePhoneSortOrder(ServicePhoneSortOrder);

    Filter[] ServicePhoneFilter = DataHelper.mapToFilterArray(ServicePhoneMap, String.class);
    if (ServicePhoneFilter != null) {
      StringFilter[] ServicePhoneFilters = new StringFilter[ServicePhoneFilter.length];
      for (int i = 0; i < ServicePhoneFilters.length; i++) {
        ServicePhoneFilters[i] = (StringFilter)ServicePhoneFilter[i];
      }
      try {
        out.setServicePhoneFilter(ServicePhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServicePhone2Map = (Map)record.get("ServicePhone2");
    Boolean ServicePhone2Fetch = DataHelper.getFetch(ServicePhone2Map);
    Boolean ServicePhone2SortDir = DataHelper.getSortDirection(ServicePhone2Map);
    Integer ServicePhone2SortOrder = DataHelper.getSortOrder(ServicePhone2Map);
    if (ServicePhone2Fetch != null) out.setServicePhone2Fetch(ServicePhone2Fetch);
    if (ServicePhone2SortDir != null) out.setServicePhone2SortDirection(ServicePhone2SortDir);
    if (ServicePhone2SortOrder != null) out.setServicePhone2SortOrder(ServicePhone2SortOrder);

    Filter[] ServicePhone2Filter = DataHelper.mapToFilterArray(ServicePhone2Map, String.class);
    if (ServicePhone2Filter != null) {
      StringFilter[] ServicePhone2Filters = new StringFilter[ServicePhone2Filter.length];
      for (int i = 0; i < ServicePhone2Filters.length; i++) {
        ServicePhone2Filters[i] = (StringFilter)ServicePhone2Filter[i];
      }
      try {
        out.setServicePhone2Filter(ServicePhone2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SalesChannelIdMap = (Map)record.get("SalesChannelId");
    Boolean SalesChannelIdFetch = DataHelper.getFetch(SalesChannelIdMap);
    Boolean SalesChannelIdSortDir = DataHelper.getSortDirection(SalesChannelIdMap);
    Integer SalesChannelIdSortOrder = DataHelper.getSortOrder(SalesChannelIdMap);
    if (SalesChannelIdFetch != null) out.setSalesChannelIdFetch(SalesChannelIdFetch);
    if (SalesChannelIdSortDir != null) out.setSalesChannelIdSortDirection(SalesChannelIdSortDir);
    if (SalesChannelIdSortOrder != null) out.setSalesChannelIdSortOrder(SalesChannelIdSortOrder);

    Filter[] SalesChannelIdFilter = DataHelper.mapToFilterArray(SalesChannelIdMap, Integer.class);
    if (SalesChannelIdFilter != null) {
      IntegerFilter[] SalesChannelIdFilters = new IntegerFilter[SalesChannelIdFilter.length];
      for (int i = 0; i < SalesChannelIdFilters.length; i++) {
        SalesChannelIdFilters[i] = (IntegerFilter)SalesChannelIdFilter[i];
      }
      try {
        out.setSalesChannelIdFilter(SalesChannelIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SimSerialNumberMap = (Map)record.get("SimSerialNumber");
    Boolean SimSerialNumberFetch = DataHelper.getFetch(SimSerialNumberMap);
    Boolean SimSerialNumberSortDir = DataHelper.getSortDirection(SimSerialNumberMap);
    Integer SimSerialNumberSortOrder = DataHelper.getSortOrder(SimSerialNumberMap);
    if (SimSerialNumberFetch != null) out.setSimSerialNumberFetch(SimSerialNumberFetch);
    if (SimSerialNumberSortDir != null) out.setSimSerialNumberSortDirection(SimSerialNumberSortDir);
    if (SimSerialNumberSortOrder != null) out.setSimSerialNumberSortOrder(SimSerialNumberSortOrder);

    Filter[] SimSerialNumberFilter = DataHelper.mapToFilterArray(SimSerialNumberMap, String.class);
    if (SimSerialNumberFilter != null) {
      StringFilter[] SimSerialNumberFilters = new StringFilter[SimSerialNumberFilter.length];
      for (int i = 0; i < SimSerialNumberFilters.length; i++) {
        SimSerialNumberFilters[i] = (StringFilter)SimSerialNumberFilter[i];
      }
      try {
        out.setSimSerialNumberFilter(SimSerialNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SwitchIdMap = (Map)record.get("SwitchId");
    Boolean SwitchIdFetch = DataHelper.getFetch(SwitchIdMap);
    Boolean SwitchIdSortDir = DataHelper.getSortDirection(SwitchIdMap);
    Integer SwitchIdSortOrder = DataHelper.getSortOrder(SwitchIdMap);
    if (SwitchIdFetch != null) out.setSwitchIdFetch(SwitchIdFetch);
    if (SwitchIdSortDir != null) out.setSwitchIdSortDirection(SwitchIdSortDir);
    if (SwitchIdSortOrder != null) out.setSwitchIdSortOrder(SwitchIdSortOrder);

    Filter[] SwitchIdFilter = DataHelper.mapToFilterArray(SwitchIdMap, String.class);
    if (SwitchIdFilter != null) {
      StringFilter[] SwitchIdFilters = new StringFilter[SwitchIdFilter.length];
      for (int i = 0; i < SwitchIdFilters.length; i++) {
        SwitchIdFilters[i] = (StringFilter)SwitchIdFilter[i];
      }
      try {
        out.setSwitchIdFilter(SwitchIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPrepaidMap = (Map)record.get("IsPrepaid");
    Boolean IsPrepaidFetch = DataHelper.getFetch(IsPrepaidMap);
    Boolean IsPrepaidSortDir = DataHelper.getSortDirection(IsPrepaidMap);
    Integer IsPrepaidSortOrder = DataHelper.getSortOrder(IsPrepaidMap);
    if (IsPrepaidFetch != null) out.setIsPrepaidFetch(IsPrepaidFetch);
    if (IsPrepaidSortDir != null) out.setIsPrepaidSortDirection(IsPrepaidSortDir);
    if (IsPrepaidSortOrder != null) out.setIsPrepaidSortOrder(IsPrepaidSortOrder);

    Filter[] IsPrepaidFilter = DataHelper.mapToFilterArray(IsPrepaidMap, Boolean.class);
    if (IsPrepaidFilter != null) {
      BooleanFilter[] IsPrepaidFilters = new BooleanFilter[IsPrepaidFilter.length];
      for (int i = 0; i < IsPrepaidFilters.length; i++) {
        IsPrepaidFilters[i] = (BooleanFilter)IsPrepaidFilter[i];
      }
      try {
        out.setIsPrepaidFilter(IsPrepaidFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceActiveDtMap = (Map)record.get("ServiceActiveDt");
    Boolean ServiceActiveDtFetch = DataHelper.getFetch(ServiceActiveDtMap);
    Boolean ServiceActiveDtSortDir = DataHelper.getSortDirection(ServiceActiveDtMap);
    Integer ServiceActiveDtSortOrder = DataHelper.getSortOrder(ServiceActiveDtMap);
    if (ServiceActiveDtFetch != null) out.setServiceActiveDtFetch(ServiceActiveDtFetch);
    if (ServiceActiveDtSortDir != null) out.setServiceActiveDtSortDirection(ServiceActiveDtSortDir);
    if (ServiceActiveDtSortOrder != null) out.setServiceActiveDtSortOrder(ServiceActiveDtSortOrder);

    Filter[] ServiceActiveDtFilter = DataHelper.mapToFilterArray(ServiceActiveDtMap, Date.class);
    if (ServiceActiveDtFilter != null) {
      DateFilter[] ServiceActiveDtFilters = new DateFilter[ServiceActiveDtFilter.length];
      for (int i = 0; i < ServiceActiveDtFilters.length; i++) {
        ServiceActiveDtFilters[i] = (DateFilter)ServiceActiveDtFilter[i];
      }
      try {
        out.setServiceActiveDtFilter(ServiceActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInactiveDtMap = (Map)record.get("ServiceInactiveDt");
    Boolean ServiceInactiveDtFetch = DataHelper.getFetch(ServiceInactiveDtMap);
    Boolean ServiceInactiveDtSortDir = DataHelper.getSortDirection(ServiceInactiveDtMap);
    Integer ServiceInactiveDtSortOrder = DataHelper.getSortOrder(ServiceInactiveDtMap);
    if (ServiceInactiveDtFetch != null) out.setServiceInactiveDtFetch(ServiceInactiveDtFetch);
    if (ServiceInactiveDtSortDir != null) out.setServiceInactiveDtSortDirection(ServiceInactiveDtSortDir);
    if (ServiceInactiveDtSortOrder != null) out.setServiceInactiveDtSortOrder(ServiceInactiveDtSortOrder);

    Filter[] ServiceInactiveDtFilter = DataHelper.mapToFilterArray(ServiceInactiveDtMap, Date.class);
    if (ServiceInactiveDtFilter != null) {
      DateFilter[] ServiceInactiveDtFilters = new DateFilter[ServiceInactiveDtFilter.length];
      for (int i = 0; i < ServiceInactiveDtFilters.length; i++) {
        ServiceInactiveDtFilters[i] = (DateFilter)ServiceInactiveDtFilter[i];
      }
      try {
        out.setServiceInactiveDtFilter(ServiceInactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ViewIdMap = (Map)record.get("ViewId");
    Boolean ViewIdFetch = DataHelper.getFetch(ViewIdMap);
    Boolean ViewIdSortDir = DataHelper.getSortDirection(ViewIdMap);
    Integer ViewIdSortOrder = DataHelper.getSortOrder(ViewIdMap);
    if (ViewIdFetch != null) out.setViewIdFetch(ViewIdFetch);
    if (ViewIdSortDir != null) out.setViewIdSortDirection(ViewIdSortDir);
    if (ViewIdSortOrder != null) out.setViewIdSortOrder(ViewIdSortOrder);

    Filter[] ViewIdFilter = DataHelper.mapToFilterArray(ViewIdMap, BigInteger.class);
    if (ViewIdFilter != null) {
      BigIntegerFilter[] ViewIdFilters = new BigIntegerFilter[ViewIdFilter.length];
      for (int i = 0; i < ViewIdFilters.length; i++) {
        ViewIdFilters[i] = (BigIntegerFilter)ViewIdFilter[i];
      }
      try {
        out.setViewIdFilter(ViewIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
