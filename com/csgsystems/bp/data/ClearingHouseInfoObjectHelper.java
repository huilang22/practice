/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseInfoObjectHelper.java
 * Definition File: Admin/ClearingHouseInfo.xml
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



/** Helper class to convert ClearingHouseInfoObject JavaBean objects to/from HashMaps.
 */
public class ClearingHouseInfoObjectHelper implements ArubaObjectHelper
{
  /** convert ClearingHouseInfoObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseInfoObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ClearingHouseInfoObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseInfoObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ClearingHouseInfoObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ClearingHouseInfoObjectData the converted object
   */
  public static ClearingHouseInfoObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ClearingHouseInfoObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseInfoObject")
   * @return ClearingHouseInfoObjectData the converted object
   */
  public static ClearingHouseInfoObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ClearingHouseInfoObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ClearingHouseInfoObjectFilter the converted object
   */
  public static ClearingHouseInfoObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ClearingHouseInfoObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ClearingHouseInfoObject")
   * @return ClearingHouseInfoObjectFilter the converted object
   */
  public static ClearingHouseInfoObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ClearingHouseInfoObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ClearingHouseInfoObjectDataList the converted object
   */
  public static ClearingHouseInfoObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ClearingHouseInfoObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseInfoObjectList")
   * @return ClearingHouseInfoObjectDataList the converted object
   */
  public static ClearingHouseInfoObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseInfoObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ClearingHouseInfoObjectData[] array = null;
    if (root != null)
    {
      array = new ClearingHouseInfoObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ClearingHouseInfoObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ClearingHouseInfoObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ClearingHouseInfoObjectDataList (array, index, total);
  }
  /** convert ClearingHouseInfoObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ClearingHouseInfoObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ClearingHouseInfoObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._CkfClientIdSet) record.put ("CkfClientId", in.CkfClientId);
  
    if (in._CkfVarDescriptorSet) record.put ("CkfVarDescriptor", in.CkfVarDescriptor);
  
    if (in._KnnMerchantAcctSet) record.put ("KnnMerchantAcct", in.KnnMerchantAcct);
  
    if (in._KnnMerchantIdSet) record.put ("KnnMerchantId", in.KnnMerchantId);
  
    if (in._FusPresIdSet) record.put ("FusPresId", in.FusPresId);
  
    if (in._FusPresPassSet) record.put ("FusPresPass", in.FusPresPass);
  
    if (in._FusSubIdSet) record.put ("FusSubId", in.FusSubId);
  
    if (in._FusSubPassSet) record.put ("FusSubPass", in.FusSubPass);
  
    if (in._FusAvsTypeSet) record.put ("FusAvsType", in.FusAvsType);
  
    if (in._FrnUniqueDatesSet) record.put ("FrnUniqueDates", in.FrnUniqueDates);
  
    if (in._FrnFastModeSet) record.put ("FrnFastMode", in.FrnFastMode);
  
    if (in._FrnNormOpIdSet) record.put ("FrnNormOpId", in.FrnNormOpId);
  
    if (in._FrnNormPostDelaySet) record.put ("FrnNormPostDelay", in.FrnNormPostDelay);
  
    if (in._FrnFastOpIdSet) record.put ("FrnFastOpId", in.FrnFastOpId);
  
    if (in._FrnFastPostDelaySet) record.put ("FrnFastPostDelay", in.FrnFastPostDelay);
  
    if (in._FrnNationalNumSet) record.put ("FrnNationalNum", in.FrnNationalNum);
  
    if (in._FrnCompanyNameSet) record.put ("FrnCompanyName", in.FrnCompanyName);
  
    if (in._FrnAgencyCodeSet) record.put ("FrnAgencyCode", in.FrnAgencyCode);
  
    if (in._FrnAccountNumSet) record.put ("FrnAccountNum", in.FrnAccountNum);
  
    if (in._FrnBankCodeSet) record.put ("FrnBankCode", in.FrnBankCode);
  
    if (in._FdmMerchantNameSet) record.put ("FdmMerchantName", in.FdmMerchantName);
  
    if (in._FdmMerchantNumberSet) record.put ("FdmMerchantNumber", in.FdmMerchantNumber);
  
    if (in._FdmAvsTypeSet) record.put ("FdmAvsType", in.FdmAvsType);
  
    if (in._DomRconNumberSet) record.put ("DomRconNumber", in.DomRconNumber);
  
    if (in._DomMailboxIdSet) record.put ("DomMailboxId", in.DomMailboxId);
  
    if (in._DomFundOrigSet) record.put ("DomFundOrig", in.DomFundOrig);
  
    if (in._DomFundDestSet) record.put ("DomFundDest", in.DomFundDest);
  
    if (in._DomVisaOrigSet) record.put ("DomVisaOrig", in.DomVisaOrig);
  
    if (in._DomVisaDestSet) record.put ("DomVisaDest", in.DomVisaDest);
  
    if (in._DomMscOrigSet) record.put ("DomMscOrig", in.DomMscOrig);
  
    if (in._DomMscDestSet) record.put ("DomMscDest", in.DomMscDest);
  
    if (in._DomAmexProcessIdSet) record.put ("DomAmexProcessId", in.DomAmexProcessId);
  
    if (in._DomAmexReceiverIdSet) record.put ("DomAmexReceiverId", in.DomAmexReceiverId);
  
    if (in._DomAmexFormatCodeSet) record.put ("DomAmexFormatCode", in.DomAmexFormatCode);
  
    if (in._DomPhoneDestSet) record.put ("DomPhoneDest", in.DomPhoneDest);
  
    if (in._DomCurrencyIndSet) record.put ("DomCurrencyInd", in.DomCurrencyInd);
  
    if (in._DomFundInstIdSet) record.put ("DomFundInstId", in.DomFundInstId);
  
    if (in._DomFundAcctNumSet) record.put ("DomFundAcctNum", in.DomFundAcctNum);
  
    if (in._DomBatchLimitSet) record.put ("DomBatchLimit", in.DomBatchLimit);
  
    if (in._DomVisaMerchantSet) record.put ("DomVisaMerchant", in.DomVisaMerchant);
  
    if (in._DomMscMerchantSet) record.put ("DomMscMerchant", in.DomMscMerchant);
  
    if (in._DomAmexMerchantSet) record.put ("DomAmexMerchant", in.DomAmexMerchant);
      return record;
  }
  /** convert ClearingHouseInfoObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ClearingHouseInfoObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ClearingHouseInfoObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.CkfClientId, in.CkfClientIdSort, in.CkfClientIdSortAscending, in.CkfClientIdFetch, in.CkfClientIdCaseInsensitive);
      if (map != null) record.put ("CkfClientId", map);
      map = DataHelper.filterToMap (in.CkfVarDescriptor, in.CkfVarDescriptorSort, in.CkfVarDescriptorSortAscending, in.CkfVarDescriptorFetch, in.CkfVarDescriptorCaseInsensitive);
      if (map != null) record.put ("CkfVarDescriptor", map);
      map = DataHelper.filterToMap (in.KnnMerchantAcct, in.KnnMerchantAcctSort, in.KnnMerchantAcctSortAscending, in.KnnMerchantAcctFetch, in.KnnMerchantAcctCaseInsensitive);
      if (map != null) record.put ("KnnMerchantAcct", map);
      map = DataHelper.filterToMap (in.KnnMerchantId, in.KnnMerchantIdSort, in.KnnMerchantIdSortAscending, in.KnnMerchantIdFetch, in.KnnMerchantIdCaseInsensitive);
      if (map != null) record.put ("KnnMerchantId", map);
      map = DataHelper.filterToMap (in.FusPresId, in.FusPresIdSort, in.FusPresIdSortAscending, in.FusPresIdFetch, in.FusPresIdCaseInsensitive);
      if (map != null) record.put ("FusPresId", map);
      map = DataHelper.filterToMap (in.FusPresPass, in.FusPresPassSort, in.FusPresPassSortAscending, in.FusPresPassFetch, in.FusPresPassCaseInsensitive);
      if (map != null) record.put ("FusPresPass", map);
      map = DataHelper.filterToMap (in.FusSubId, in.FusSubIdSort, in.FusSubIdSortAscending, in.FusSubIdFetch, in.FusSubIdCaseInsensitive);
      if (map != null) record.put ("FusSubId", map);
      map = DataHelper.filterToMap (in.FusSubPass, in.FusSubPassSort, in.FusSubPassSortAscending, in.FusSubPassFetch, in.FusSubPassCaseInsensitive);
      if (map != null) record.put ("FusSubPass", map);
      map = DataHelper.filterToMap (in.FusAvsType, in.FusAvsTypeSort, in.FusAvsTypeSortAscending, in.FusAvsTypeFetch);
      if (map != null) record.put ("FusAvsType", map);
      map = DataHelper.filterToMap (in.FrnUniqueDates, in.FrnUniqueDatesSort, in.FrnUniqueDatesSortAscending, in.FrnUniqueDatesFetch);
      if (map != null) record.put ("FrnUniqueDates", map);
      map = DataHelper.filterToMap (in.FrnFastMode, in.FrnFastModeSort, in.FrnFastModeSortAscending, in.FrnFastModeFetch);
      if (map != null) record.put ("FrnFastMode", map);
      map = DataHelper.filterToMap (in.FrnNormOpId, in.FrnNormOpIdSort, in.FrnNormOpIdSortAscending, in.FrnNormOpIdFetch, in.FrnNormOpIdCaseInsensitive);
      if (map != null) record.put ("FrnNormOpId", map);
      map = DataHelper.filterToMap (in.FrnNormPostDelay, in.FrnNormPostDelaySort, in.FrnNormPostDelaySortAscending, in.FrnNormPostDelayFetch);
      if (map != null) record.put ("FrnNormPostDelay", map);
      map = DataHelper.filterToMap (in.FrnFastOpId, in.FrnFastOpIdSort, in.FrnFastOpIdSortAscending, in.FrnFastOpIdFetch, in.FrnFastOpIdCaseInsensitive);
      if (map != null) record.put ("FrnFastOpId", map);
      map = DataHelper.filterToMap (in.FrnFastPostDelay, in.FrnFastPostDelaySort, in.FrnFastPostDelaySortAscending, in.FrnFastPostDelayFetch);
      if (map != null) record.put ("FrnFastPostDelay", map);
      map = DataHelper.filterToMap (in.FrnNationalNum, in.FrnNationalNumSort, in.FrnNationalNumSortAscending, in.FrnNationalNumFetch, in.FrnNationalNumCaseInsensitive);
      if (map != null) record.put ("FrnNationalNum", map);
      map = DataHelper.filterToMap (in.FrnCompanyName, in.FrnCompanyNameSort, in.FrnCompanyNameSortAscending, in.FrnCompanyNameFetch, in.FrnCompanyNameCaseInsensitive);
      if (map != null) record.put ("FrnCompanyName", map);
      map = DataHelper.filterToMap (in.FrnAgencyCode, in.FrnAgencyCodeSort, in.FrnAgencyCodeSortAscending, in.FrnAgencyCodeFetch, in.FrnAgencyCodeCaseInsensitive);
      if (map != null) record.put ("FrnAgencyCode", map);
      map = DataHelper.filterToMap (in.FrnAccountNum, in.FrnAccountNumSort, in.FrnAccountNumSortAscending, in.FrnAccountNumFetch, in.FrnAccountNumCaseInsensitive);
      if (map != null) record.put ("FrnAccountNum", map);
      map = DataHelper.filterToMap (in.FrnBankCode, in.FrnBankCodeSort, in.FrnBankCodeSortAscending, in.FrnBankCodeFetch, in.FrnBankCodeCaseInsensitive);
      if (map != null) record.put ("FrnBankCode", map);
      map = DataHelper.filterToMap (in.FdmMerchantName, in.FdmMerchantNameSort, in.FdmMerchantNameSortAscending, in.FdmMerchantNameFetch, in.FdmMerchantNameCaseInsensitive);
      if (map != null) record.put ("FdmMerchantName", map);
      map = DataHelper.filterToMap (in.FdmMerchantNumber, in.FdmMerchantNumberSort, in.FdmMerchantNumberSortAscending, in.FdmMerchantNumberFetch, in.FdmMerchantNumberCaseInsensitive);
      if (map != null) record.put ("FdmMerchantNumber", map);
      map = DataHelper.filterToMap (in.FdmAvsType, in.FdmAvsTypeSort, in.FdmAvsTypeSortAscending, in.FdmAvsTypeFetch);
      if (map != null) record.put ("FdmAvsType", map);
      map = DataHelper.filterToMap (in.DomRconNumber, in.DomRconNumberSort, in.DomRconNumberSortAscending, in.DomRconNumberFetch, in.DomRconNumberCaseInsensitive);
      if (map != null) record.put ("DomRconNumber", map);
      map = DataHelper.filterToMap (in.DomMailboxId, in.DomMailboxIdSort, in.DomMailboxIdSortAscending, in.DomMailboxIdFetch, in.DomMailboxIdCaseInsensitive);
      if (map != null) record.put ("DomMailboxId", map);
      map = DataHelper.filterToMap (in.DomFundOrig, in.DomFundOrigSort, in.DomFundOrigSortAscending, in.DomFundOrigFetch, in.DomFundOrigCaseInsensitive);
      if (map != null) record.put ("DomFundOrig", map);
      map = DataHelper.filterToMap (in.DomFundDest, in.DomFundDestSort, in.DomFundDestSortAscending, in.DomFundDestFetch, in.DomFundDestCaseInsensitive);
      if (map != null) record.put ("DomFundDest", map);
      map = DataHelper.filterToMap (in.DomVisaOrig, in.DomVisaOrigSort, in.DomVisaOrigSortAscending, in.DomVisaOrigFetch, in.DomVisaOrigCaseInsensitive);
      if (map != null) record.put ("DomVisaOrig", map);
      map = DataHelper.filterToMap (in.DomVisaDest, in.DomVisaDestSort, in.DomVisaDestSortAscending, in.DomVisaDestFetch, in.DomVisaDestCaseInsensitive);
      if (map != null) record.put ("DomVisaDest", map);
      map = DataHelper.filterToMap (in.DomMscOrig, in.DomMscOrigSort, in.DomMscOrigSortAscending, in.DomMscOrigFetch, in.DomMscOrigCaseInsensitive);
      if (map != null) record.put ("DomMscOrig", map);
      map = DataHelper.filterToMap (in.DomMscDest, in.DomMscDestSort, in.DomMscDestSortAscending, in.DomMscDestFetch, in.DomMscDestCaseInsensitive);
      if (map != null) record.put ("DomMscDest", map);
      map = DataHelper.filterToMap (in.DomAmexProcessId, in.DomAmexProcessIdSort, in.DomAmexProcessIdSortAscending, in.DomAmexProcessIdFetch, in.DomAmexProcessIdCaseInsensitive);
      if (map != null) record.put ("DomAmexProcessId", map);
      map = DataHelper.filterToMap (in.DomAmexReceiverId, in.DomAmexReceiverIdSort, in.DomAmexReceiverIdSortAscending, in.DomAmexReceiverIdFetch, in.DomAmexReceiverIdCaseInsensitive);
      if (map != null) record.put ("DomAmexReceiverId", map);
      map = DataHelper.filterToMap (in.DomAmexFormatCode, in.DomAmexFormatCodeSort, in.DomAmexFormatCodeSortAscending, in.DomAmexFormatCodeFetch, in.DomAmexFormatCodeCaseInsensitive);
      if (map != null) record.put ("DomAmexFormatCode", map);
      map = DataHelper.filterToMap (in.DomPhoneDest, in.DomPhoneDestSort, in.DomPhoneDestSortAscending, in.DomPhoneDestFetch, in.DomPhoneDestCaseInsensitive);
      if (map != null) record.put ("DomPhoneDest", map);
      map = DataHelper.filterToMap (in.DomCurrencyInd, in.DomCurrencyIndSort, in.DomCurrencyIndSortAscending, in.DomCurrencyIndFetch, in.DomCurrencyIndCaseInsensitive);
      if (map != null) record.put ("DomCurrencyInd", map);
      map = DataHelper.filterToMap (in.DomFundInstId, in.DomFundInstIdSort, in.DomFundInstIdSortAscending, in.DomFundInstIdFetch, in.DomFundInstIdCaseInsensitive);
      if (map != null) record.put ("DomFundInstId", map);
      map = DataHelper.filterToMap (in.DomFundAcctNum, in.DomFundAcctNumSort, in.DomFundAcctNumSortAscending, in.DomFundAcctNumFetch, in.DomFundAcctNumCaseInsensitive);
      if (map != null) record.put ("DomFundAcctNum", map);
      map = DataHelper.filterToMap (in.DomBatchLimit, in.DomBatchLimitSort, in.DomBatchLimitSortAscending, in.DomBatchLimitFetch);
      if (map != null) record.put ("DomBatchLimit", map);
      map = DataHelper.filterToMap (in.DomVisaMerchant, in.DomVisaMerchantSort, in.DomVisaMerchantSortAscending, in.DomVisaMerchantFetch, in.DomVisaMerchantCaseInsensitive);
      if (map != null) record.put ("DomVisaMerchant", map);
      map = DataHelper.filterToMap (in.DomMscMerchant, in.DomMscMerchantSort, in.DomMscMerchantSortAscending, in.DomMscMerchantFetch, in.DomMscMerchantCaseInsensitive);
      if (map != null) record.put ("DomMscMerchant", map);
      map = DataHelper.filterToMap (in.DomAmexMerchant, in.DomAmexMerchantSort, in.DomAmexMerchantSortAscending, in.DomAmexMerchantFetch, in.DomAmexMerchantCaseInsensitive);
      if (map != null) record.put ("DomAmexMerchant", map);
    return record;
  }
  /** convert Map to ClearingHouseInfoObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseInfoObjectData the converted object
   */
  public static ClearingHouseInfoObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseInfoObjectData out = new ClearingHouseInfoObjectData ();

    out.Key = ClearingHouseInfoObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("CkfClientId")) != null)
    {
      out.CkfClientId = (String) obj;
    }
  
    if ((obj = record.get ("CkfVarDescriptor")) != null)
    {
      out.CkfVarDescriptor = (String) obj;
    }
  
    if ((obj = record.get ("KnnMerchantAcct")) != null)
    {
      out.KnnMerchantAcct = (String) obj;
    }
  
    if ((obj = record.get ("KnnMerchantId")) != null)
    {
      out.KnnMerchantId = (String) obj;
    }
  
    if ((obj = record.get ("FusPresId")) != null)
    {
      out.FusPresId = (String) obj;
    }
  
    if ((obj = record.get ("FusPresPass")) != null)
    {
      out.FusPresPass = (String) obj;
    }
  
    if ((obj = record.get ("FusSubId")) != null)
    {
      out.FusSubId = (String) obj;
    }
  
    if ((obj = record.get ("FusSubPass")) != null)
    {
      out.FusSubPass = (String) obj;
    }
  
    if ((obj = record.get ("FusAvsType")) != null)
    {
      out.FusAvsType = (Integer) obj;
    }
  
    if ((obj = record.get ("FrnUniqueDates")) != null)
    {
      out.FrnUniqueDates = (Boolean) obj;
    }
  
    if ((obj = record.get ("FrnFastMode")) != null)
    {
      out.FrnFastMode = (Boolean) obj;
    }
  
    if ((obj = record.get ("FrnNormOpId")) != null)
    {
      out.FrnNormOpId = (String) obj;
    }
  
    if ((obj = record.get ("FrnNormPostDelay")) != null)
    {
      out.FrnNormPostDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("FrnFastOpId")) != null)
    {
      out.FrnFastOpId = (String) obj;
    }
  
    if ((obj = record.get ("FrnFastPostDelay")) != null)
    {
      out.FrnFastPostDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("FrnNationalNum")) != null)
    {
      out.FrnNationalNum = (String) obj;
    }
  
    if ((obj = record.get ("FrnCompanyName")) != null)
    {
      out.FrnCompanyName = (String) obj;
    }
  
    if ((obj = record.get ("FrnAgencyCode")) != null)
    {
      out.FrnAgencyCode = (String) obj;
    }
  
    if ((obj = record.get ("FrnAccountNum")) != null)
    {
      out.FrnAccountNum = (String) obj;
    }
  
    if ((obj = record.get ("FrnBankCode")) != null)
    {
      out.FrnBankCode = (String) obj;
    }
  
    if ((obj = record.get ("FdmMerchantName")) != null)
    {
      out.FdmMerchantName = (String) obj;
    }
  
    if ((obj = record.get ("FdmMerchantNumber")) != null)
    {
      out.FdmMerchantNumber = (String) obj;
    }
  
    if ((obj = record.get ("FdmAvsType")) != null)
    {
      out.FdmAvsType = (Integer) obj;
    }
  
    if ((obj = record.get ("DomRconNumber")) != null)
    {
      out.DomRconNumber = (String) obj;
    }
  
    if ((obj = record.get ("DomMailboxId")) != null)
    {
      out.DomMailboxId = (String) obj;
    }
  
    if ((obj = record.get ("DomFundOrig")) != null)
    {
      out.DomFundOrig = (String) obj;
    }
  
    if ((obj = record.get ("DomFundDest")) != null)
    {
      out.DomFundDest = (String) obj;
    }
  
    if ((obj = record.get ("DomVisaOrig")) != null)
    {
      out.DomVisaOrig = (String) obj;
    }
  
    if ((obj = record.get ("DomVisaDest")) != null)
    {
      out.DomVisaDest = (String) obj;
    }
  
    if ((obj = record.get ("DomMscOrig")) != null)
    {
      out.DomMscOrig = (String) obj;
    }
  
    if ((obj = record.get ("DomMscDest")) != null)
    {
      out.DomMscDest = (String) obj;
    }
  
    if ((obj = record.get ("DomAmexProcessId")) != null)
    {
      out.DomAmexProcessId = (String) obj;
    }
  
    if ((obj = record.get ("DomAmexReceiverId")) != null)
    {
      out.DomAmexReceiverId = (String) obj;
    }
  
    if ((obj = record.get ("DomAmexFormatCode")) != null)
    {
      out.DomAmexFormatCode = (String) obj;
    }
  
    if ((obj = record.get ("DomPhoneDest")) != null)
    {
      out.DomPhoneDest = (String) obj;
    }
  
    if ((obj = record.get ("DomCurrencyInd")) != null)
    {
      out.DomCurrencyInd = (String) obj;
    }
  
    if ((obj = record.get ("DomFundInstId")) != null)
    {
      out.DomFundInstId = (String) obj;
    }
  
    if ((obj = record.get ("DomFundAcctNum")) != null)
    {
      out.DomFundAcctNum = (String) obj;
    }
  
    if ((obj = record.get ("DomBatchLimit")) != null)
    {
      out.DomBatchLimit = (Integer) obj;
    }
  
    if ((obj = record.get ("DomVisaMerchant")) != null)
    {
      out.DomVisaMerchant = (String) obj;
    }
  
    if ((obj = record.get ("DomMscMerchant")) != null)
    {
      out.DomMscMerchant = (String) obj;
    }
  
    if ((obj = record.get ("DomAmexMerchant")) != null)
    {
      out.DomAmexMerchant = (String) obj;
    }
      return out;
  }
  /** convert Map to ClearingHouseInfoObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseInfoObjectFilter the converted object
   */
  public static ClearingHouseInfoObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseInfoObjectFilter out = new ClearingHouseInfoObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ClearingHouseInfoObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map CkfClientIdMap = (Map)record.get("CkfClientId");
    Boolean CkfClientIdFetch = DataHelper.getFetch(CkfClientIdMap);
    Boolean CkfClientIdSortDir = DataHelper.getSortDirection(CkfClientIdMap);
    Integer CkfClientIdSortOrder = DataHelper.getSortOrder(CkfClientIdMap);
    if (CkfClientIdFetch != null) out.setCkfClientIdFetch(CkfClientIdFetch);
    if (CkfClientIdSortDir != null) out.setCkfClientIdSortDirection(CkfClientIdSortDir);
    if (CkfClientIdSortOrder != null) out.setCkfClientIdSortOrder(CkfClientIdSortOrder);

    Filter[] CkfClientIdFilter = DataHelper.mapToFilterArray(CkfClientIdMap, String.class);
    if (CkfClientIdFilter != null) {
      StringFilter[] CkfClientIdFilters = new StringFilter[CkfClientIdFilter.length];
      for (int i = 0; i < CkfClientIdFilters.length; i++) {
        CkfClientIdFilters[i] = (StringFilter)CkfClientIdFilter[i];
      }
      try {
        out.setCkfClientIdFilter(CkfClientIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CkfVarDescriptorMap = (Map)record.get("CkfVarDescriptor");
    Boolean CkfVarDescriptorFetch = DataHelper.getFetch(CkfVarDescriptorMap);
    Boolean CkfVarDescriptorSortDir = DataHelper.getSortDirection(CkfVarDescriptorMap);
    Integer CkfVarDescriptorSortOrder = DataHelper.getSortOrder(CkfVarDescriptorMap);
    if (CkfVarDescriptorFetch != null) out.setCkfVarDescriptorFetch(CkfVarDescriptorFetch);
    if (CkfVarDescriptorSortDir != null) out.setCkfVarDescriptorSortDirection(CkfVarDescriptorSortDir);
    if (CkfVarDescriptorSortOrder != null) out.setCkfVarDescriptorSortOrder(CkfVarDescriptorSortOrder);

    Filter[] CkfVarDescriptorFilter = DataHelper.mapToFilterArray(CkfVarDescriptorMap, String.class);
    if (CkfVarDescriptorFilter != null) {
      StringFilter[] CkfVarDescriptorFilters = new StringFilter[CkfVarDescriptorFilter.length];
      for (int i = 0; i < CkfVarDescriptorFilters.length; i++) {
        CkfVarDescriptorFilters[i] = (StringFilter)CkfVarDescriptorFilter[i];
      }
      try {
        out.setCkfVarDescriptorFilter(CkfVarDescriptorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map KnnMerchantAcctMap = (Map)record.get("KnnMerchantAcct");
    Boolean KnnMerchantAcctFetch = DataHelper.getFetch(KnnMerchantAcctMap);
    Boolean KnnMerchantAcctSortDir = DataHelper.getSortDirection(KnnMerchantAcctMap);
    Integer KnnMerchantAcctSortOrder = DataHelper.getSortOrder(KnnMerchantAcctMap);
    if (KnnMerchantAcctFetch != null) out.setKnnMerchantAcctFetch(KnnMerchantAcctFetch);
    if (KnnMerchantAcctSortDir != null) out.setKnnMerchantAcctSortDirection(KnnMerchantAcctSortDir);
    if (KnnMerchantAcctSortOrder != null) out.setKnnMerchantAcctSortOrder(KnnMerchantAcctSortOrder);

    Filter[] KnnMerchantAcctFilter = DataHelper.mapToFilterArray(KnnMerchantAcctMap, String.class);
    if (KnnMerchantAcctFilter != null) {
      StringFilter[] KnnMerchantAcctFilters = new StringFilter[KnnMerchantAcctFilter.length];
      for (int i = 0; i < KnnMerchantAcctFilters.length; i++) {
        KnnMerchantAcctFilters[i] = (StringFilter)KnnMerchantAcctFilter[i];
      }
      try {
        out.setKnnMerchantAcctFilter(KnnMerchantAcctFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map KnnMerchantIdMap = (Map)record.get("KnnMerchantId");
    Boolean KnnMerchantIdFetch = DataHelper.getFetch(KnnMerchantIdMap);
    Boolean KnnMerchantIdSortDir = DataHelper.getSortDirection(KnnMerchantIdMap);
    Integer KnnMerchantIdSortOrder = DataHelper.getSortOrder(KnnMerchantIdMap);
    if (KnnMerchantIdFetch != null) out.setKnnMerchantIdFetch(KnnMerchantIdFetch);
    if (KnnMerchantIdSortDir != null) out.setKnnMerchantIdSortDirection(KnnMerchantIdSortDir);
    if (KnnMerchantIdSortOrder != null) out.setKnnMerchantIdSortOrder(KnnMerchantIdSortOrder);

    Filter[] KnnMerchantIdFilter = DataHelper.mapToFilterArray(KnnMerchantIdMap, String.class);
    if (KnnMerchantIdFilter != null) {
      StringFilter[] KnnMerchantIdFilters = new StringFilter[KnnMerchantIdFilter.length];
      for (int i = 0; i < KnnMerchantIdFilters.length; i++) {
        KnnMerchantIdFilters[i] = (StringFilter)KnnMerchantIdFilter[i];
      }
      try {
        out.setKnnMerchantIdFilter(KnnMerchantIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FusPresIdMap = (Map)record.get("FusPresId");
    Boolean FusPresIdFetch = DataHelper.getFetch(FusPresIdMap);
    Boolean FusPresIdSortDir = DataHelper.getSortDirection(FusPresIdMap);
    Integer FusPresIdSortOrder = DataHelper.getSortOrder(FusPresIdMap);
    if (FusPresIdFetch != null) out.setFusPresIdFetch(FusPresIdFetch);
    if (FusPresIdSortDir != null) out.setFusPresIdSortDirection(FusPresIdSortDir);
    if (FusPresIdSortOrder != null) out.setFusPresIdSortOrder(FusPresIdSortOrder);

    Filter[] FusPresIdFilter = DataHelper.mapToFilterArray(FusPresIdMap, String.class);
    if (FusPresIdFilter != null) {
      StringFilter[] FusPresIdFilters = new StringFilter[FusPresIdFilter.length];
      for (int i = 0; i < FusPresIdFilters.length; i++) {
        FusPresIdFilters[i] = (StringFilter)FusPresIdFilter[i];
      }
      try {
        out.setFusPresIdFilter(FusPresIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FusPresPassMap = (Map)record.get("FusPresPass");
    Boolean FusPresPassFetch = DataHelper.getFetch(FusPresPassMap);
    Boolean FusPresPassSortDir = DataHelper.getSortDirection(FusPresPassMap);
    Integer FusPresPassSortOrder = DataHelper.getSortOrder(FusPresPassMap);
    if (FusPresPassFetch != null) out.setFusPresPassFetch(FusPresPassFetch);
    if (FusPresPassSortDir != null) out.setFusPresPassSortDirection(FusPresPassSortDir);
    if (FusPresPassSortOrder != null) out.setFusPresPassSortOrder(FusPresPassSortOrder);

    Filter[] FusPresPassFilter = DataHelper.mapToFilterArray(FusPresPassMap, String.class);
    if (FusPresPassFilter != null) {
      StringFilter[] FusPresPassFilters = new StringFilter[FusPresPassFilter.length];
      for (int i = 0; i < FusPresPassFilters.length; i++) {
        FusPresPassFilters[i] = (StringFilter)FusPresPassFilter[i];
      }
      try {
        out.setFusPresPassFilter(FusPresPassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FusSubIdMap = (Map)record.get("FusSubId");
    Boolean FusSubIdFetch = DataHelper.getFetch(FusSubIdMap);
    Boolean FusSubIdSortDir = DataHelper.getSortDirection(FusSubIdMap);
    Integer FusSubIdSortOrder = DataHelper.getSortOrder(FusSubIdMap);
    if (FusSubIdFetch != null) out.setFusSubIdFetch(FusSubIdFetch);
    if (FusSubIdSortDir != null) out.setFusSubIdSortDirection(FusSubIdSortDir);
    if (FusSubIdSortOrder != null) out.setFusSubIdSortOrder(FusSubIdSortOrder);

    Filter[] FusSubIdFilter = DataHelper.mapToFilterArray(FusSubIdMap, String.class);
    if (FusSubIdFilter != null) {
      StringFilter[] FusSubIdFilters = new StringFilter[FusSubIdFilter.length];
      for (int i = 0; i < FusSubIdFilters.length; i++) {
        FusSubIdFilters[i] = (StringFilter)FusSubIdFilter[i];
      }
      try {
        out.setFusSubIdFilter(FusSubIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FusSubPassMap = (Map)record.get("FusSubPass");
    Boolean FusSubPassFetch = DataHelper.getFetch(FusSubPassMap);
    Boolean FusSubPassSortDir = DataHelper.getSortDirection(FusSubPassMap);
    Integer FusSubPassSortOrder = DataHelper.getSortOrder(FusSubPassMap);
    if (FusSubPassFetch != null) out.setFusSubPassFetch(FusSubPassFetch);
    if (FusSubPassSortDir != null) out.setFusSubPassSortDirection(FusSubPassSortDir);
    if (FusSubPassSortOrder != null) out.setFusSubPassSortOrder(FusSubPassSortOrder);

    Filter[] FusSubPassFilter = DataHelper.mapToFilterArray(FusSubPassMap, String.class);
    if (FusSubPassFilter != null) {
      StringFilter[] FusSubPassFilters = new StringFilter[FusSubPassFilter.length];
      for (int i = 0; i < FusSubPassFilters.length; i++) {
        FusSubPassFilters[i] = (StringFilter)FusSubPassFilter[i];
      }
      try {
        out.setFusSubPassFilter(FusSubPassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FusAvsTypeMap = (Map)record.get("FusAvsType");
    Boolean FusAvsTypeFetch = DataHelper.getFetch(FusAvsTypeMap);
    Boolean FusAvsTypeSortDir = DataHelper.getSortDirection(FusAvsTypeMap);
    Integer FusAvsTypeSortOrder = DataHelper.getSortOrder(FusAvsTypeMap);
    if (FusAvsTypeFetch != null) out.setFusAvsTypeFetch(FusAvsTypeFetch);
    if (FusAvsTypeSortDir != null) out.setFusAvsTypeSortDirection(FusAvsTypeSortDir);
    if (FusAvsTypeSortOrder != null) out.setFusAvsTypeSortOrder(FusAvsTypeSortOrder);

    Filter[] FusAvsTypeFilter = DataHelper.mapToFilterArray(FusAvsTypeMap, Integer.class);
    if (FusAvsTypeFilter != null) {
      IntegerFilter[] FusAvsTypeFilters = new IntegerFilter[FusAvsTypeFilter.length];
      for (int i = 0; i < FusAvsTypeFilters.length; i++) {
        FusAvsTypeFilters[i] = (IntegerFilter)FusAvsTypeFilter[i];
      }
      try {
        out.setFusAvsTypeFilter(FusAvsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnUniqueDatesMap = (Map)record.get("FrnUniqueDates");
    Boolean FrnUniqueDatesFetch = DataHelper.getFetch(FrnUniqueDatesMap);
    Boolean FrnUniqueDatesSortDir = DataHelper.getSortDirection(FrnUniqueDatesMap);
    Integer FrnUniqueDatesSortOrder = DataHelper.getSortOrder(FrnUniqueDatesMap);
    if (FrnUniqueDatesFetch != null) out.setFrnUniqueDatesFetch(FrnUniqueDatesFetch);
    if (FrnUniqueDatesSortDir != null) out.setFrnUniqueDatesSortDirection(FrnUniqueDatesSortDir);
    if (FrnUniqueDatesSortOrder != null) out.setFrnUniqueDatesSortOrder(FrnUniqueDatesSortOrder);

    Filter[] FrnUniqueDatesFilter = DataHelper.mapToFilterArray(FrnUniqueDatesMap, Boolean.class);
    if (FrnUniqueDatesFilter != null) {
      BooleanFilter[] FrnUniqueDatesFilters = new BooleanFilter[FrnUniqueDatesFilter.length];
      for (int i = 0; i < FrnUniqueDatesFilters.length; i++) {
        FrnUniqueDatesFilters[i] = (BooleanFilter)FrnUniqueDatesFilter[i];
      }
      try {
        out.setFrnUniqueDatesFilter(FrnUniqueDatesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnFastModeMap = (Map)record.get("FrnFastMode");
    Boolean FrnFastModeFetch = DataHelper.getFetch(FrnFastModeMap);
    Boolean FrnFastModeSortDir = DataHelper.getSortDirection(FrnFastModeMap);
    Integer FrnFastModeSortOrder = DataHelper.getSortOrder(FrnFastModeMap);
    if (FrnFastModeFetch != null) out.setFrnFastModeFetch(FrnFastModeFetch);
    if (FrnFastModeSortDir != null) out.setFrnFastModeSortDirection(FrnFastModeSortDir);
    if (FrnFastModeSortOrder != null) out.setFrnFastModeSortOrder(FrnFastModeSortOrder);

    Filter[] FrnFastModeFilter = DataHelper.mapToFilterArray(FrnFastModeMap, Boolean.class);
    if (FrnFastModeFilter != null) {
      BooleanFilter[] FrnFastModeFilters = new BooleanFilter[FrnFastModeFilter.length];
      for (int i = 0; i < FrnFastModeFilters.length; i++) {
        FrnFastModeFilters[i] = (BooleanFilter)FrnFastModeFilter[i];
      }
      try {
        out.setFrnFastModeFilter(FrnFastModeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnNormOpIdMap = (Map)record.get("FrnNormOpId");
    Boolean FrnNormOpIdFetch = DataHelper.getFetch(FrnNormOpIdMap);
    Boolean FrnNormOpIdSortDir = DataHelper.getSortDirection(FrnNormOpIdMap);
    Integer FrnNormOpIdSortOrder = DataHelper.getSortOrder(FrnNormOpIdMap);
    if (FrnNormOpIdFetch != null) out.setFrnNormOpIdFetch(FrnNormOpIdFetch);
    if (FrnNormOpIdSortDir != null) out.setFrnNormOpIdSortDirection(FrnNormOpIdSortDir);
    if (FrnNormOpIdSortOrder != null) out.setFrnNormOpIdSortOrder(FrnNormOpIdSortOrder);

    Filter[] FrnNormOpIdFilter = DataHelper.mapToFilterArray(FrnNormOpIdMap, String.class);
    if (FrnNormOpIdFilter != null) {
      StringFilter[] FrnNormOpIdFilters = new StringFilter[FrnNormOpIdFilter.length];
      for (int i = 0; i < FrnNormOpIdFilters.length; i++) {
        FrnNormOpIdFilters[i] = (StringFilter)FrnNormOpIdFilter[i];
      }
      try {
        out.setFrnNormOpIdFilter(FrnNormOpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnNormPostDelayMap = (Map)record.get("FrnNormPostDelay");
    Boolean FrnNormPostDelayFetch = DataHelper.getFetch(FrnNormPostDelayMap);
    Boolean FrnNormPostDelaySortDir = DataHelper.getSortDirection(FrnNormPostDelayMap);
    Integer FrnNormPostDelaySortOrder = DataHelper.getSortOrder(FrnNormPostDelayMap);
    if (FrnNormPostDelayFetch != null) out.setFrnNormPostDelayFetch(FrnNormPostDelayFetch);
    if (FrnNormPostDelaySortDir != null) out.setFrnNormPostDelaySortDirection(FrnNormPostDelaySortDir);
    if (FrnNormPostDelaySortOrder != null) out.setFrnNormPostDelaySortOrder(FrnNormPostDelaySortOrder);

    Filter[] FrnNormPostDelayFilter = DataHelper.mapToFilterArray(FrnNormPostDelayMap, Integer.class);
    if (FrnNormPostDelayFilter != null) {
      IntegerFilter[] FrnNormPostDelayFilters = new IntegerFilter[FrnNormPostDelayFilter.length];
      for (int i = 0; i < FrnNormPostDelayFilters.length; i++) {
        FrnNormPostDelayFilters[i] = (IntegerFilter)FrnNormPostDelayFilter[i];
      }
      try {
        out.setFrnNormPostDelayFilter(FrnNormPostDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnFastOpIdMap = (Map)record.get("FrnFastOpId");
    Boolean FrnFastOpIdFetch = DataHelper.getFetch(FrnFastOpIdMap);
    Boolean FrnFastOpIdSortDir = DataHelper.getSortDirection(FrnFastOpIdMap);
    Integer FrnFastOpIdSortOrder = DataHelper.getSortOrder(FrnFastOpIdMap);
    if (FrnFastOpIdFetch != null) out.setFrnFastOpIdFetch(FrnFastOpIdFetch);
    if (FrnFastOpIdSortDir != null) out.setFrnFastOpIdSortDirection(FrnFastOpIdSortDir);
    if (FrnFastOpIdSortOrder != null) out.setFrnFastOpIdSortOrder(FrnFastOpIdSortOrder);

    Filter[] FrnFastOpIdFilter = DataHelper.mapToFilterArray(FrnFastOpIdMap, String.class);
    if (FrnFastOpIdFilter != null) {
      StringFilter[] FrnFastOpIdFilters = new StringFilter[FrnFastOpIdFilter.length];
      for (int i = 0; i < FrnFastOpIdFilters.length; i++) {
        FrnFastOpIdFilters[i] = (StringFilter)FrnFastOpIdFilter[i];
      }
      try {
        out.setFrnFastOpIdFilter(FrnFastOpIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnFastPostDelayMap = (Map)record.get("FrnFastPostDelay");
    Boolean FrnFastPostDelayFetch = DataHelper.getFetch(FrnFastPostDelayMap);
    Boolean FrnFastPostDelaySortDir = DataHelper.getSortDirection(FrnFastPostDelayMap);
    Integer FrnFastPostDelaySortOrder = DataHelper.getSortOrder(FrnFastPostDelayMap);
    if (FrnFastPostDelayFetch != null) out.setFrnFastPostDelayFetch(FrnFastPostDelayFetch);
    if (FrnFastPostDelaySortDir != null) out.setFrnFastPostDelaySortDirection(FrnFastPostDelaySortDir);
    if (FrnFastPostDelaySortOrder != null) out.setFrnFastPostDelaySortOrder(FrnFastPostDelaySortOrder);

    Filter[] FrnFastPostDelayFilter = DataHelper.mapToFilterArray(FrnFastPostDelayMap, Integer.class);
    if (FrnFastPostDelayFilter != null) {
      IntegerFilter[] FrnFastPostDelayFilters = new IntegerFilter[FrnFastPostDelayFilter.length];
      for (int i = 0; i < FrnFastPostDelayFilters.length; i++) {
        FrnFastPostDelayFilters[i] = (IntegerFilter)FrnFastPostDelayFilter[i];
      }
      try {
        out.setFrnFastPostDelayFilter(FrnFastPostDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnNationalNumMap = (Map)record.get("FrnNationalNum");
    Boolean FrnNationalNumFetch = DataHelper.getFetch(FrnNationalNumMap);
    Boolean FrnNationalNumSortDir = DataHelper.getSortDirection(FrnNationalNumMap);
    Integer FrnNationalNumSortOrder = DataHelper.getSortOrder(FrnNationalNumMap);
    if (FrnNationalNumFetch != null) out.setFrnNationalNumFetch(FrnNationalNumFetch);
    if (FrnNationalNumSortDir != null) out.setFrnNationalNumSortDirection(FrnNationalNumSortDir);
    if (FrnNationalNumSortOrder != null) out.setFrnNationalNumSortOrder(FrnNationalNumSortOrder);

    Filter[] FrnNationalNumFilter = DataHelper.mapToFilterArray(FrnNationalNumMap, String.class);
    if (FrnNationalNumFilter != null) {
      StringFilter[] FrnNationalNumFilters = new StringFilter[FrnNationalNumFilter.length];
      for (int i = 0; i < FrnNationalNumFilters.length; i++) {
        FrnNationalNumFilters[i] = (StringFilter)FrnNationalNumFilter[i];
      }
      try {
        out.setFrnNationalNumFilter(FrnNationalNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnCompanyNameMap = (Map)record.get("FrnCompanyName");
    Boolean FrnCompanyNameFetch = DataHelper.getFetch(FrnCompanyNameMap);
    Boolean FrnCompanyNameSortDir = DataHelper.getSortDirection(FrnCompanyNameMap);
    Integer FrnCompanyNameSortOrder = DataHelper.getSortOrder(FrnCompanyNameMap);
    if (FrnCompanyNameFetch != null) out.setFrnCompanyNameFetch(FrnCompanyNameFetch);
    if (FrnCompanyNameSortDir != null) out.setFrnCompanyNameSortDirection(FrnCompanyNameSortDir);
    if (FrnCompanyNameSortOrder != null) out.setFrnCompanyNameSortOrder(FrnCompanyNameSortOrder);

    Filter[] FrnCompanyNameFilter = DataHelper.mapToFilterArray(FrnCompanyNameMap, String.class);
    if (FrnCompanyNameFilter != null) {
      StringFilter[] FrnCompanyNameFilters = new StringFilter[FrnCompanyNameFilter.length];
      for (int i = 0; i < FrnCompanyNameFilters.length; i++) {
        FrnCompanyNameFilters[i] = (StringFilter)FrnCompanyNameFilter[i];
      }
      try {
        out.setFrnCompanyNameFilter(FrnCompanyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnAgencyCodeMap = (Map)record.get("FrnAgencyCode");
    Boolean FrnAgencyCodeFetch = DataHelper.getFetch(FrnAgencyCodeMap);
    Boolean FrnAgencyCodeSortDir = DataHelper.getSortDirection(FrnAgencyCodeMap);
    Integer FrnAgencyCodeSortOrder = DataHelper.getSortOrder(FrnAgencyCodeMap);
    if (FrnAgencyCodeFetch != null) out.setFrnAgencyCodeFetch(FrnAgencyCodeFetch);
    if (FrnAgencyCodeSortDir != null) out.setFrnAgencyCodeSortDirection(FrnAgencyCodeSortDir);
    if (FrnAgencyCodeSortOrder != null) out.setFrnAgencyCodeSortOrder(FrnAgencyCodeSortOrder);

    Filter[] FrnAgencyCodeFilter = DataHelper.mapToFilterArray(FrnAgencyCodeMap, String.class);
    if (FrnAgencyCodeFilter != null) {
      StringFilter[] FrnAgencyCodeFilters = new StringFilter[FrnAgencyCodeFilter.length];
      for (int i = 0; i < FrnAgencyCodeFilters.length; i++) {
        FrnAgencyCodeFilters[i] = (StringFilter)FrnAgencyCodeFilter[i];
      }
      try {
        out.setFrnAgencyCodeFilter(FrnAgencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnAccountNumMap = (Map)record.get("FrnAccountNum");
    Boolean FrnAccountNumFetch = DataHelper.getFetch(FrnAccountNumMap);
    Boolean FrnAccountNumSortDir = DataHelper.getSortDirection(FrnAccountNumMap);
    Integer FrnAccountNumSortOrder = DataHelper.getSortOrder(FrnAccountNumMap);
    if (FrnAccountNumFetch != null) out.setFrnAccountNumFetch(FrnAccountNumFetch);
    if (FrnAccountNumSortDir != null) out.setFrnAccountNumSortDirection(FrnAccountNumSortDir);
    if (FrnAccountNumSortOrder != null) out.setFrnAccountNumSortOrder(FrnAccountNumSortOrder);

    Filter[] FrnAccountNumFilter = DataHelper.mapToFilterArray(FrnAccountNumMap, String.class);
    if (FrnAccountNumFilter != null) {
      StringFilter[] FrnAccountNumFilters = new StringFilter[FrnAccountNumFilter.length];
      for (int i = 0; i < FrnAccountNumFilters.length; i++) {
        FrnAccountNumFilters[i] = (StringFilter)FrnAccountNumFilter[i];
      }
      try {
        out.setFrnAccountNumFilter(FrnAccountNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrnBankCodeMap = (Map)record.get("FrnBankCode");
    Boolean FrnBankCodeFetch = DataHelper.getFetch(FrnBankCodeMap);
    Boolean FrnBankCodeSortDir = DataHelper.getSortDirection(FrnBankCodeMap);
    Integer FrnBankCodeSortOrder = DataHelper.getSortOrder(FrnBankCodeMap);
    if (FrnBankCodeFetch != null) out.setFrnBankCodeFetch(FrnBankCodeFetch);
    if (FrnBankCodeSortDir != null) out.setFrnBankCodeSortDirection(FrnBankCodeSortDir);
    if (FrnBankCodeSortOrder != null) out.setFrnBankCodeSortOrder(FrnBankCodeSortOrder);

    Filter[] FrnBankCodeFilter = DataHelper.mapToFilterArray(FrnBankCodeMap, String.class);
    if (FrnBankCodeFilter != null) {
      StringFilter[] FrnBankCodeFilters = new StringFilter[FrnBankCodeFilter.length];
      for (int i = 0; i < FrnBankCodeFilters.length; i++) {
        FrnBankCodeFilters[i] = (StringFilter)FrnBankCodeFilter[i];
      }
      try {
        out.setFrnBankCodeFilter(FrnBankCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FdmMerchantNameMap = (Map)record.get("FdmMerchantName");
    Boolean FdmMerchantNameFetch = DataHelper.getFetch(FdmMerchantNameMap);
    Boolean FdmMerchantNameSortDir = DataHelper.getSortDirection(FdmMerchantNameMap);
    Integer FdmMerchantNameSortOrder = DataHelper.getSortOrder(FdmMerchantNameMap);
    if (FdmMerchantNameFetch != null) out.setFdmMerchantNameFetch(FdmMerchantNameFetch);
    if (FdmMerchantNameSortDir != null) out.setFdmMerchantNameSortDirection(FdmMerchantNameSortDir);
    if (FdmMerchantNameSortOrder != null) out.setFdmMerchantNameSortOrder(FdmMerchantNameSortOrder);

    Filter[] FdmMerchantNameFilter = DataHelper.mapToFilterArray(FdmMerchantNameMap, String.class);
    if (FdmMerchantNameFilter != null) {
      StringFilter[] FdmMerchantNameFilters = new StringFilter[FdmMerchantNameFilter.length];
      for (int i = 0; i < FdmMerchantNameFilters.length; i++) {
        FdmMerchantNameFilters[i] = (StringFilter)FdmMerchantNameFilter[i];
      }
      try {
        out.setFdmMerchantNameFilter(FdmMerchantNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FdmMerchantNumberMap = (Map)record.get("FdmMerchantNumber");
    Boolean FdmMerchantNumberFetch = DataHelper.getFetch(FdmMerchantNumberMap);
    Boolean FdmMerchantNumberSortDir = DataHelper.getSortDirection(FdmMerchantNumberMap);
    Integer FdmMerchantNumberSortOrder = DataHelper.getSortOrder(FdmMerchantNumberMap);
    if (FdmMerchantNumberFetch != null) out.setFdmMerchantNumberFetch(FdmMerchantNumberFetch);
    if (FdmMerchantNumberSortDir != null) out.setFdmMerchantNumberSortDirection(FdmMerchantNumberSortDir);
    if (FdmMerchantNumberSortOrder != null) out.setFdmMerchantNumberSortOrder(FdmMerchantNumberSortOrder);

    Filter[] FdmMerchantNumberFilter = DataHelper.mapToFilterArray(FdmMerchantNumberMap, String.class);
    if (FdmMerchantNumberFilter != null) {
      StringFilter[] FdmMerchantNumberFilters = new StringFilter[FdmMerchantNumberFilter.length];
      for (int i = 0; i < FdmMerchantNumberFilters.length; i++) {
        FdmMerchantNumberFilters[i] = (StringFilter)FdmMerchantNumberFilter[i];
      }
      try {
        out.setFdmMerchantNumberFilter(FdmMerchantNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FdmAvsTypeMap = (Map)record.get("FdmAvsType");
    Boolean FdmAvsTypeFetch = DataHelper.getFetch(FdmAvsTypeMap);
    Boolean FdmAvsTypeSortDir = DataHelper.getSortDirection(FdmAvsTypeMap);
    Integer FdmAvsTypeSortOrder = DataHelper.getSortOrder(FdmAvsTypeMap);
    if (FdmAvsTypeFetch != null) out.setFdmAvsTypeFetch(FdmAvsTypeFetch);
    if (FdmAvsTypeSortDir != null) out.setFdmAvsTypeSortDirection(FdmAvsTypeSortDir);
    if (FdmAvsTypeSortOrder != null) out.setFdmAvsTypeSortOrder(FdmAvsTypeSortOrder);

    Filter[] FdmAvsTypeFilter = DataHelper.mapToFilterArray(FdmAvsTypeMap, Integer.class);
    if (FdmAvsTypeFilter != null) {
      IntegerFilter[] FdmAvsTypeFilters = new IntegerFilter[FdmAvsTypeFilter.length];
      for (int i = 0; i < FdmAvsTypeFilters.length; i++) {
        FdmAvsTypeFilters[i] = (IntegerFilter)FdmAvsTypeFilter[i];
      }
      try {
        out.setFdmAvsTypeFilter(FdmAvsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomRconNumberMap = (Map)record.get("DomRconNumber");
    Boolean DomRconNumberFetch = DataHelper.getFetch(DomRconNumberMap);
    Boolean DomRconNumberSortDir = DataHelper.getSortDirection(DomRconNumberMap);
    Integer DomRconNumberSortOrder = DataHelper.getSortOrder(DomRconNumberMap);
    if (DomRconNumberFetch != null) out.setDomRconNumberFetch(DomRconNumberFetch);
    if (DomRconNumberSortDir != null) out.setDomRconNumberSortDirection(DomRconNumberSortDir);
    if (DomRconNumberSortOrder != null) out.setDomRconNumberSortOrder(DomRconNumberSortOrder);

    Filter[] DomRconNumberFilter = DataHelper.mapToFilterArray(DomRconNumberMap, String.class);
    if (DomRconNumberFilter != null) {
      StringFilter[] DomRconNumberFilters = new StringFilter[DomRconNumberFilter.length];
      for (int i = 0; i < DomRconNumberFilters.length; i++) {
        DomRconNumberFilters[i] = (StringFilter)DomRconNumberFilter[i];
      }
      try {
        out.setDomRconNumberFilter(DomRconNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomMailboxIdMap = (Map)record.get("DomMailboxId");
    Boolean DomMailboxIdFetch = DataHelper.getFetch(DomMailboxIdMap);
    Boolean DomMailboxIdSortDir = DataHelper.getSortDirection(DomMailboxIdMap);
    Integer DomMailboxIdSortOrder = DataHelper.getSortOrder(DomMailboxIdMap);
    if (DomMailboxIdFetch != null) out.setDomMailboxIdFetch(DomMailboxIdFetch);
    if (DomMailboxIdSortDir != null) out.setDomMailboxIdSortDirection(DomMailboxIdSortDir);
    if (DomMailboxIdSortOrder != null) out.setDomMailboxIdSortOrder(DomMailboxIdSortOrder);

    Filter[] DomMailboxIdFilter = DataHelper.mapToFilterArray(DomMailboxIdMap, String.class);
    if (DomMailboxIdFilter != null) {
      StringFilter[] DomMailboxIdFilters = new StringFilter[DomMailboxIdFilter.length];
      for (int i = 0; i < DomMailboxIdFilters.length; i++) {
        DomMailboxIdFilters[i] = (StringFilter)DomMailboxIdFilter[i];
      }
      try {
        out.setDomMailboxIdFilter(DomMailboxIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomFundOrigMap = (Map)record.get("DomFundOrig");
    Boolean DomFundOrigFetch = DataHelper.getFetch(DomFundOrigMap);
    Boolean DomFundOrigSortDir = DataHelper.getSortDirection(DomFundOrigMap);
    Integer DomFundOrigSortOrder = DataHelper.getSortOrder(DomFundOrigMap);
    if (DomFundOrigFetch != null) out.setDomFundOrigFetch(DomFundOrigFetch);
    if (DomFundOrigSortDir != null) out.setDomFundOrigSortDirection(DomFundOrigSortDir);
    if (DomFundOrigSortOrder != null) out.setDomFundOrigSortOrder(DomFundOrigSortOrder);

    Filter[] DomFundOrigFilter = DataHelper.mapToFilterArray(DomFundOrigMap, String.class);
    if (DomFundOrigFilter != null) {
      StringFilter[] DomFundOrigFilters = new StringFilter[DomFundOrigFilter.length];
      for (int i = 0; i < DomFundOrigFilters.length; i++) {
        DomFundOrigFilters[i] = (StringFilter)DomFundOrigFilter[i];
      }
      try {
        out.setDomFundOrigFilter(DomFundOrigFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomFundDestMap = (Map)record.get("DomFundDest");
    Boolean DomFundDestFetch = DataHelper.getFetch(DomFundDestMap);
    Boolean DomFundDestSortDir = DataHelper.getSortDirection(DomFundDestMap);
    Integer DomFundDestSortOrder = DataHelper.getSortOrder(DomFundDestMap);
    if (DomFundDestFetch != null) out.setDomFundDestFetch(DomFundDestFetch);
    if (DomFundDestSortDir != null) out.setDomFundDestSortDirection(DomFundDestSortDir);
    if (DomFundDestSortOrder != null) out.setDomFundDestSortOrder(DomFundDestSortOrder);

    Filter[] DomFundDestFilter = DataHelper.mapToFilterArray(DomFundDestMap, String.class);
    if (DomFundDestFilter != null) {
      StringFilter[] DomFundDestFilters = new StringFilter[DomFundDestFilter.length];
      for (int i = 0; i < DomFundDestFilters.length; i++) {
        DomFundDestFilters[i] = (StringFilter)DomFundDestFilter[i];
      }
      try {
        out.setDomFundDestFilter(DomFundDestFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomVisaOrigMap = (Map)record.get("DomVisaOrig");
    Boolean DomVisaOrigFetch = DataHelper.getFetch(DomVisaOrigMap);
    Boolean DomVisaOrigSortDir = DataHelper.getSortDirection(DomVisaOrigMap);
    Integer DomVisaOrigSortOrder = DataHelper.getSortOrder(DomVisaOrigMap);
    if (DomVisaOrigFetch != null) out.setDomVisaOrigFetch(DomVisaOrigFetch);
    if (DomVisaOrigSortDir != null) out.setDomVisaOrigSortDirection(DomVisaOrigSortDir);
    if (DomVisaOrigSortOrder != null) out.setDomVisaOrigSortOrder(DomVisaOrigSortOrder);

    Filter[] DomVisaOrigFilter = DataHelper.mapToFilterArray(DomVisaOrigMap, String.class);
    if (DomVisaOrigFilter != null) {
      StringFilter[] DomVisaOrigFilters = new StringFilter[DomVisaOrigFilter.length];
      for (int i = 0; i < DomVisaOrigFilters.length; i++) {
        DomVisaOrigFilters[i] = (StringFilter)DomVisaOrigFilter[i];
      }
      try {
        out.setDomVisaOrigFilter(DomVisaOrigFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomVisaDestMap = (Map)record.get("DomVisaDest");
    Boolean DomVisaDestFetch = DataHelper.getFetch(DomVisaDestMap);
    Boolean DomVisaDestSortDir = DataHelper.getSortDirection(DomVisaDestMap);
    Integer DomVisaDestSortOrder = DataHelper.getSortOrder(DomVisaDestMap);
    if (DomVisaDestFetch != null) out.setDomVisaDestFetch(DomVisaDestFetch);
    if (DomVisaDestSortDir != null) out.setDomVisaDestSortDirection(DomVisaDestSortDir);
    if (DomVisaDestSortOrder != null) out.setDomVisaDestSortOrder(DomVisaDestSortOrder);

    Filter[] DomVisaDestFilter = DataHelper.mapToFilterArray(DomVisaDestMap, String.class);
    if (DomVisaDestFilter != null) {
      StringFilter[] DomVisaDestFilters = new StringFilter[DomVisaDestFilter.length];
      for (int i = 0; i < DomVisaDestFilters.length; i++) {
        DomVisaDestFilters[i] = (StringFilter)DomVisaDestFilter[i];
      }
      try {
        out.setDomVisaDestFilter(DomVisaDestFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomMscOrigMap = (Map)record.get("DomMscOrig");
    Boolean DomMscOrigFetch = DataHelper.getFetch(DomMscOrigMap);
    Boolean DomMscOrigSortDir = DataHelper.getSortDirection(DomMscOrigMap);
    Integer DomMscOrigSortOrder = DataHelper.getSortOrder(DomMscOrigMap);
    if (DomMscOrigFetch != null) out.setDomMscOrigFetch(DomMscOrigFetch);
    if (DomMscOrigSortDir != null) out.setDomMscOrigSortDirection(DomMscOrigSortDir);
    if (DomMscOrigSortOrder != null) out.setDomMscOrigSortOrder(DomMscOrigSortOrder);

    Filter[] DomMscOrigFilter = DataHelper.mapToFilterArray(DomMscOrigMap, String.class);
    if (DomMscOrigFilter != null) {
      StringFilter[] DomMscOrigFilters = new StringFilter[DomMscOrigFilter.length];
      for (int i = 0; i < DomMscOrigFilters.length; i++) {
        DomMscOrigFilters[i] = (StringFilter)DomMscOrigFilter[i];
      }
      try {
        out.setDomMscOrigFilter(DomMscOrigFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomMscDestMap = (Map)record.get("DomMscDest");
    Boolean DomMscDestFetch = DataHelper.getFetch(DomMscDestMap);
    Boolean DomMscDestSortDir = DataHelper.getSortDirection(DomMscDestMap);
    Integer DomMscDestSortOrder = DataHelper.getSortOrder(DomMscDestMap);
    if (DomMscDestFetch != null) out.setDomMscDestFetch(DomMscDestFetch);
    if (DomMscDestSortDir != null) out.setDomMscDestSortDirection(DomMscDestSortDir);
    if (DomMscDestSortOrder != null) out.setDomMscDestSortOrder(DomMscDestSortOrder);

    Filter[] DomMscDestFilter = DataHelper.mapToFilterArray(DomMscDestMap, String.class);
    if (DomMscDestFilter != null) {
      StringFilter[] DomMscDestFilters = new StringFilter[DomMscDestFilter.length];
      for (int i = 0; i < DomMscDestFilters.length; i++) {
        DomMscDestFilters[i] = (StringFilter)DomMscDestFilter[i];
      }
      try {
        out.setDomMscDestFilter(DomMscDestFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomAmexProcessIdMap = (Map)record.get("DomAmexProcessId");
    Boolean DomAmexProcessIdFetch = DataHelper.getFetch(DomAmexProcessIdMap);
    Boolean DomAmexProcessIdSortDir = DataHelper.getSortDirection(DomAmexProcessIdMap);
    Integer DomAmexProcessIdSortOrder = DataHelper.getSortOrder(DomAmexProcessIdMap);
    if (DomAmexProcessIdFetch != null) out.setDomAmexProcessIdFetch(DomAmexProcessIdFetch);
    if (DomAmexProcessIdSortDir != null) out.setDomAmexProcessIdSortDirection(DomAmexProcessIdSortDir);
    if (DomAmexProcessIdSortOrder != null) out.setDomAmexProcessIdSortOrder(DomAmexProcessIdSortOrder);

    Filter[] DomAmexProcessIdFilter = DataHelper.mapToFilterArray(DomAmexProcessIdMap, String.class);
    if (DomAmexProcessIdFilter != null) {
      StringFilter[] DomAmexProcessIdFilters = new StringFilter[DomAmexProcessIdFilter.length];
      for (int i = 0; i < DomAmexProcessIdFilters.length; i++) {
        DomAmexProcessIdFilters[i] = (StringFilter)DomAmexProcessIdFilter[i];
      }
      try {
        out.setDomAmexProcessIdFilter(DomAmexProcessIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomAmexReceiverIdMap = (Map)record.get("DomAmexReceiverId");
    Boolean DomAmexReceiverIdFetch = DataHelper.getFetch(DomAmexReceiverIdMap);
    Boolean DomAmexReceiverIdSortDir = DataHelper.getSortDirection(DomAmexReceiverIdMap);
    Integer DomAmexReceiverIdSortOrder = DataHelper.getSortOrder(DomAmexReceiverIdMap);
    if (DomAmexReceiverIdFetch != null) out.setDomAmexReceiverIdFetch(DomAmexReceiverIdFetch);
    if (DomAmexReceiverIdSortDir != null) out.setDomAmexReceiverIdSortDirection(DomAmexReceiverIdSortDir);
    if (DomAmexReceiverIdSortOrder != null) out.setDomAmexReceiverIdSortOrder(DomAmexReceiverIdSortOrder);

    Filter[] DomAmexReceiverIdFilter = DataHelper.mapToFilterArray(DomAmexReceiverIdMap, String.class);
    if (DomAmexReceiverIdFilter != null) {
      StringFilter[] DomAmexReceiverIdFilters = new StringFilter[DomAmexReceiverIdFilter.length];
      for (int i = 0; i < DomAmexReceiverIdFilters.length; i++) {
        DomAmexReceiverIdFilters[i] = (StringFilter)DomAmexReceiverIdFilter[i];
      }
      try {
        out.setDomAmexReceiverIdFilter(DomAmexReceiverIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomAmexFormatCodeMap = (Map)record.get("DomAmexFormatCode");
    Boolean DomAmexFormatCodeFetch = DataHelper.getFetch(DomAmexFormatCodeMap);
    Boolean DomAmexFormatCodeSortDir = DataHelper.getSortDirection(DomAmexFormatCodeMap);
    Integer DomAmexFormatCodeSortOrder = DataHelper.getSortOrder(DomAmexFormatCodeMap);
    if (DomAmexFormatCodeFetch != null) out.setDomAmexFormatCodeFetch(DomAmexFormatCodeFetch);
    if (DomAmexFormatCodeSortDir != null) out.setDomAmexFormatCodeSortDirection(DomAmexFormatCodeSortDir);
    if (DomAmexFormatCodeSortOrder != null) out.setDomAmexFormatCodeSortOrder(DomAmexFormatCodeSortOrder);

    Filter[] DomAmexFormatCodeFilter = DataHelper.mapToFilterArray(DomAmexFormatCodeMap, String.class);
    if (DomAmexFormatCodeFilter != null) {
      StringFilter[] DomAmexFormatCodeFilters = new StringFilter[DomAmexFormatCodeFilter.length];
      for (int i = 0; i < DomAmexFormatCodeFilters.length; i++) {
        DomAmexFormatCodeFilters[i] = (StringFilter)DomAmexFormatCodeFilter[i];
      }
      try {
        out.setDomAmexFormatCodeFilter(DomAmexFormatCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomPhoneDestMap = (Map)record.get("DomPhoneDest");
    Boolean DomPhoneDestFetch = DataHelper.getFetch(DomPhoneDestMap);
    Boolean DomPhoneDestSortDir = DataHelper.getSortDirection(DomPhoneDestMap);
    Integer DomPhoneDestSortOrder = DataHelper.getSortOrder(DomPhoneDestMap);
    if (DomPhoneDestFetch != null) out.setDomPhoneDestFetch(DomPhoneDestFetch);
    if (DomPhoneDestSortDir != null) out.setDomPhoneDestSortDirection(DomPhoneDestSortDir);
    if (DomPhoneDestSortOrder != null) out.setDomPhoneDestSortOrder(DomPhoneDestSortOrder);

    Filter[] DomPhoneDestFilter = DataHelper.mapToFilterArray(DomPhoneDestMap, String.class);
    if (DomPhoneDestFilter != null) {
      StringFilter[] DomPhoneDestFilters = new StringFilter[DomPhoneDestFilter.length];
      for (int i = 0; i < DomPhoneDestFilters.length; i++) {
        DomPhoneDestFilters[i] = (StringFilter)DomPhoneDestFilter[i];
      }
      try {
        out.setDomPhoneDestFilter(DomPhoneDestFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomCurrencyIndMap = (Map)record.get("DomCurrencyInd");
    Boolean DomCurrencyIndFetch = DataHelper.getFetch(DomCurrencyIndMap);
    Boolean DomCurrencyIndSortDir = DataHelper.getSortDirection(DomCurrencyIndMap);
    Integer DomCurrencyIndSortOrder = DataHelper.getSortOrder(DomCurrencyIndMap);
    if (DomCurrencyIndFetch != null) out.setDomCurrencyIndFetch(DomCurrencyIndFetch);
    if (DomCurrencyIndSortDir != null) out.setDomCurrencyIndSortDirection(DomCurrencyIndSortDir);
    if (DomCurrencyIndSortOrder != null) out.setDomCurrencyIndSortOrder(DomCurrencyIndSortOrder);

    Filter[] DomCurrencyIndFilter = DataHelper.mapToFilterArray(DomCurrencyIndMap, String.class);
    if (DomCurrencyIndFilter != null) {
      StringFilter[] DomCurrencyIndFilters = new StringFilter[DomCurrencyIndFilter.length];
      for (int i = 0; i < DomCurrencyIndFilters.length; i++) {
        DomCurrencyIndFilters[i] = (StringFilter)DomCurrencyIndFilter[i];
      }
      try {
        out.setDomCurrencyIndFilter(DomCurrencyIndFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomFundInstIdMap = (Map)record.get("DomFundInstId");
    Boolean DomFundInstIdFetch = DataHelper.getFetch(DomFundInstIdMap);
    Boolean DomFundInstIdSortDir = DataHelper.getSortDirection(DomFundInstIdMap);
    Integer DomFundInstIdSortOrder = DataHelper.getSortOrder(DomFundInstIdMap);
    if (DomFundInstIdFetch != null) out.setDomFundInstIdFetch(DomFundInstIdFetch);
    if (DomFundInstIdSortDir != null) out.setDomFundInstIdSortDirection(DomFundInstIdSortDir);
    if (DomFundInstIdSortOrder != null) out.setDomFundInstIdSortOrder(DomFundInstIdSortOrder);

    Filter[] DomFundInstIdFilter = DataHelper.mapToFilterArray(DomFundInstIdMap, String.class);
    if (DomFundInstIdFilter != null) {
      StringFilter[] DomFundInstIdFilters = new StringFilter[DomFundInstIdFilter.length];
      for (int i = 0; i < DomFundInstIdFilters.length; i++) {
        DomFundInstIdFilters[i] = (StringFilter)DomFundInstIdFilter[i];
      }
      try {
        out.setDomFundInstIdFilter(DomFundInstIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomFundAcctNumMap = (Map)record.get("DomFundAcctNum");
    Boolean DomFundAcctNumFetch = DataHelper.getFetch(DomFundAcctNumMap);
    Boolean DomFundAcctNumSortDir = DataHelper.getSortDirection(DomFundAcctNumMap);
    Integer DomFundAcctNumSortOrder = DataHelper.getSortOrder(DomFundAcctNumMap);
    if (DomFundAcctNumFetch != null) out.setDomFundAcctNumFetch(DomFundAcctNumFetch);
    if (DomFundAcctNumSortDir != null) out.setDomFundAcctNumSortDirection(DomFundAcctNumSortDir);
    if (DomFundAcctNumSortOrder != null) out.setDomFundAcctNumSortOrder(DomFundAcctNumSortOrder);

    Filter[] DomFundAcctNumFilter = DataHelper.mapToFilterArray(DomFundAcctNumMap, String.class);
    if (DomFundAcctNumFilter != null) {
      StringFilter[] DomFundAcctNumFilters = new StringFilter[DomFundAcctNumFilter.length];
      for (int i = 0; i < DomFundAcctNumFilters.length; i++) {
        DomFundAcctNumFilters[i] = (StringFilter)DomFundAcctNumFilter[i];
      }
      try {
        out.setDomFundAcctNumFilter(DomFundAcctNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomBatchLimitMap = (Map)record.get("DomBatchLimit");
    Boolean DomBatchLimitFetch = DataHelper.getFetch(DomBatchLimitMap);
    Boolean DomBatchLimitSortDir = DataHelper.getSortDirection(DomBatchLimitMap);
    Integer DomBatchLimitSortOrder = DataHelper.getSortOrder(DomBatchLimitMap);
    if (DomBatchLimitFetch != null) out.setDomBatchLimitFetch(DomBatchLimitFetch);
    if (DomBatchLimitSortDir != null) out.setDomBatchLimitSortDirection(DomBatchLimitSortDir);
    if (DomBatchLimitSortOrder != null) out.setDomBatchLimitSortOrder(DomBatchLimitSortOrder);

    Filter[] DomBatchLimitFilter = DataHelper.mapToFilterArray(DomBatchLimitMap, Integer.class);
    if (DomBatchLimitFilter != null) {
      IntegerFilter[] DomBatchLimitFilters = new IntegerFilter[DomBatchLimitFilter.length];
      for (int i = 0; i < DomBatchLimitFilters.length; i++) {
        DomBatchLimitFilters[i] = (IntegerFilter)DomBatchLimitFilter[i];
      }
      try {
        out.setDomBatchLimitFilter(DomBatchLimitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomVisaMerchantMap = (Map)record.get("DomVisaMerchant");
    Boolean DomVisaMerchantFetch = DataHelper.getFetch(DomVisaMerchantMap);
    Boolean DomVisaMerchantSortDir = DataHelper.getSortDirection(DomVisaMerchantMap);
    Integer DomVisaMerchantSortOrder = DataHelper.getSortOrder(DomVisaMerchantMap);
    if (DomVisaMerchantFetch != null) out.setDomVisaMerchantFetch(DomVisaMerchantFetch);
    if (DomVisaMerchantSortDir != null) out.setDomVisaMerchantSortDirection(DomVisaMerchantSortDir);
    if (DomVisaMerchantSortOrder != null) out.setDomVisaMerchantSortOrder(DomVisaMerchantSortOrder);

    Filter[] DomVisaMerchantFilter = DataHelper.mapToFilterArray(DomVisaMerchantMap, String.class);
    if (DomVisaMerchantFilter != null) {
      StringFilter[] DomVisaMerchantFilters = new StringFilter[DomVisaMerchantFilter.length];
      for (int i = 0; i < DomVisaMerchantFilters.length; i++) {
        DomVisaMerchantFilters[i] = (StringFilter)DomVisaMerchantFilter[i];
      }
      try {
        out.setDomVisaMerchantFilter(DomVisaMerchantFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomMscMerchantMap = (Map)record.get("DomMscMerchant");
    Boolean DomMscMerchantFetch = DataHelper.getFetch(DomMscMerchantMap);
    Boolean DomMscMerchantSortDir = DataHelper.getSortDirection(DomMscMerchantMap);
    Integer DomMscMerchantSortOrder = DataHelper.getSortOrder(DomMscMerchantMap);
    if (DomMscMerchantFetch != null) out.setDomMscMerchantFetch(DomMscMerchantFetch);
    if (DomMscMerchantSortDir != null) out.setDomMscMerchantSortDirection(DomMscMerchantSortDir);
    if (DomMscMerchantSortOrder != null) out.setDomMscMerchantSortOrder(DomMscMerchantSortOrder);

    Filter[] DomMscMerchantFilter = DataHelper.mapToFilterArray(DomMscMerchantMap, String.class);
    if (DomMscMerchantFilter != null) {
      StringFilter[] DomMscMerchantFilters = new StringFilter[DomMscMerchantFilter.length];
      for (int i = 0; i < DomMscMerchantFilters.length; i++) {
        DomMscMerchantFilters[i] = (StringFilter)DomMscMerchantFilter[i];
      }
      try {
        out.setDomMscMerchantFilter(DomMscMerchantFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DomAmexMerchantMap = (Map)record.get("DomAmexMerchant");
    Boolean DomAmexMerchantFetch = DataHelper.getFetch(DomAmexMerchantMap);
    Boolean DomAmexMerchantSortDir = DataHelper.getSortDirection(DomAmexMerchantMap);
    Integer DomAmexMerchantSortOrder = DataHelper.getSortOrder(DomAmexMerchantMap);
    if (DomAmexMerchantFetch != null) out.setDomAmexMerchantFetch(DomAmexMerchantFetch);
    if (DomAmexMerchantSortDir != null) out.setDomAmexMerchantSortDirection(DomAmexMerchantSortDir);
    if (DomAmexMerchantSortOrder != null) out.setDomAmexMerchantSortOrder(DomAmexMerchantSortOrder);

    Filter[] DomAmexMerchantFilter = DataHelper.mapToFilterArray(DomAmexMerchantMap, String.class);
    if (DomAmexMerchantFilter != null) {
      StringFilter[] DomAmexMerchantFilters = new StringFilter[DomAmexMerchantFilter.length];
      for (int i = 0; i < DomAmexMerchantFilters.length; i++) {
        DomAmexMerchantFilters[i] = (StringFilter)DomAmexMerchantFilter[i];
      }
      try {
        out.setDomAmexMerchantFilter(DomAmexMerchantFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
