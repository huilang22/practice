/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ETCQuoteResponseObjectHelper.java
 * Definition File: Customer/EarlyTerminationCharge.xml
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



/** Helper class to convert ETCQuoteResponseObject JavaBean objects to/from HashMaps.
 */
public class ETCQuoteResponseObjectHelper implements ArubaObjectHelper
{
  /** convert ETCQuoteResponseObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ETCQuoteResponseObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ETCQuoteResponseObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ETCQuoteResponseObject")
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteResponseObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ETCQuoteResponseObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = ETCQuoteRequestObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert ETCQuoteResponseObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteResponseObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ETCQuoteResponseObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ETCQuoteResponseObject")
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteResponseObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ETCQuoteResponseObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = ETCQuoteRequestObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ETCQuoteResponseObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ETCQuoteResponseObjectData the converted object
   */
  public static ETCQuoteResponseObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ETCQuoteResponseObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ETCQuoteResponseObject")
   * @return ETCQuoteResponseObjectData the converted object
   */
  public static ETCQuoteResponseObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteResponseObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ETCQuoteResponseObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ETCQuoteResponseObjectFilter the converted object
   */
  public static ETCQuoteResponseObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ETCQuoteResponseObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ETCQuoteResponseObject")
   * @return ETCQuoteResponseObjectFilter the converted object
   */
  public static ETCQuoteResponseObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteResponseObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ETCQuoteResponseObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ETCQuoteResponseObjectDataList the converted object
   */
  public static ETCQuoteResponseObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ETCQuoteResponseObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ETCQuoteResponseObjectList")
   * @return ETCQuoteResponseObjectDataList the converted object
   */
  public static ETCQuoteResponseObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteResponseObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ETCQuoteResponseObjectData[] array = null;
    if (root != null)
    {
      array = new ETCQuoteResponseObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ETCQuoteResponseObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ETCQuoteResponseObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ETCQuoteResponseObjectDataList (array, index, total);
  }
  /** convert ETCQuoteResponseObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ETCQuoteResponseObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._EtcQuoteAmountSet) record.put ("EtcQuoteAmount", in.EtcQuoteAmount);
  
    if (in._ETCNRCDescSet) record.put ("ETCNRCDesc", in.ETCNRCDesc);
  
    if (in._ETCCtrDescSet) record.put ("ETCCtrDesc", in.ETCCtrDesc);
  
    if (in._ETCRCDescSet) record.put ("ETCRCDesc", in.ETCRCDesc);
  
    if (in._InstallmentAmtQuoteSet) record.put ("InstallmentAmtQuote", in.InstallmentAmtQuote);
  
    if (in._InstallmentNumSet) record.put ("InstallmentNum", in.InstallmentNum);
  
    if (in._ContractLevelSet) record.put ("ContractLevel", in.ContractLevel);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._ContractEndDateSet) record.put ("ContractEndDate", in.ContractEndDate);
      return record;
  }
  /** convert ETCQuoteResponseObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ETCQuoteResponseObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive); 
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch); 
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive); 
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch); 
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.EtcQuoteAmount, in.EtcQuoteAmountSort, in.EtcQuoteAmountSortAscending, in.EtcQuoteAmountFetch); 
      if (map != null) record.put ("EtcQuoteAmount", map);
      map = DataHelper.filterToMap (in.ETCNRCDesc, in.ETCNRCDescSort, in.ETCNRCDescSortAscending, in.ETCNRCDescFetch, in.ETCNRCDescCaseInsensitive); 
      if (map != null) record.put ("ETCNRCDesc", map);
      map = DataHelper.filterToMap (in.ETCCtrDesc, in.ETCCtrDescSort, in.ETCCtrDescSortAscending, in.ETCCtrDescFetch, in.ETCCtrDescCaseInsensitive); 
      if (map != null) record.put ("ETCCtrDesc", map);
      map = DataHelper.filterToMap (in.ETCRCDesc, in.ETCRCDescSort, in.ETCRCDescSortAscending, in.ETCRCDescFetch, in.ETCRCDescCaseInsensitive); 
      if (map != null) record.put ("ETCRCDesc", map);
      map = DataHelper.filterToMap (in.InstallmentAmtQuote, in.InstallmentAmtQuoteSort, in.InstallmentAmtQuoteSortAscending, in.InstallmentAmtQuoteFetch); 
      if (map != null) record.put ("InstallmentAmtQuote", map);
      map = DataHelper.filterToMap (in.InstallmentNum, in.InstallmentNumSort, in.InstallmentNumSortAscending, in.InstallmentNumFetch); 
      if (map != null) record.put ("InstallmentNum", map);
      map = DataHelper.filterToMap (in.ContractLevel, in.ContractLevelSort, in.ContractLevelSortAscending, in.ContractLevelFetch); 
      if (map != null) record.put ("ContractLevel", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch); 
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.ContractEndDate, in.ContractEndDateSort, in.ContractEndDateSortAscending, in.ContractEndDateFetch); 
      if (map != null) record.put ("ContractEndDate", map);
    return record;
  }
  /** convert Map to ETCQuoteResponseObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ETCQuoteResponseObjectData the converted object
   */
  public static ETCQuoteResponseObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ETCQuoteResponseObjectData out = new ETCQuoteResponseObjectData (ETCQuoteRequestObjectHelper.getObj (record));

    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("EtcQuoteAmount")) != null)
    {
      out.EtcQuoteAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ETCNRCDesc")) != null)
    {
      out.ETCNRCDesc = (String) obj;
    }
  
    if ((obj = record.get ("ETCCtrDesc")) != null)
    {
      out.ETCCtrDesc = (String) obj;
    }
  
    if ((obj = record.get ("ETCRCDesc")) != null)
    {
      out.ETCRCDesc = (String) obj;
    }
  
    if ((obj = record.get ("InstallmentAmtQuote")) != null)
    {
      out.InstallmentAmtQuote = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InstallmentNum")) != null)
    {
      out.InstallmentNum = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractLevel")) != null)
    {
      out.ContractLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractEndDate")) != null)
    {
      out.ContractEndDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to ETCQuoteResponseObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ETCQuoteResponseObjectFilter the converted object
   */
  public static ETCQuoteResponseObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ETCQuoteResponseObjectFilter out = new ETCQuoteResponseObjectFilter (ETCQuoteRequestObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
