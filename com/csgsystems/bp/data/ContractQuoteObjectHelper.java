/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractQuoteObjectHelper.java
 * Definition File: Customer/OrderQuote.xml
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



/** Helper class to convert ContractQuoteObject JavaBean objects to/from HashMaps.
 */
public class ContractQuoteObjectHelper implements ArubaObjectHelper
{
  /** convert ContractQuoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ContractQuoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractQuoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractQuoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ContractQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContractQuoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractQuoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ContractQuoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ContractQuoteObjectData the converted object
   */
  public static ContractQuoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ContractQuoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ContractQuoteObject")
   * @return ContractQuoteObjectData the converted object
   */
  public static ContractQuoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ContractQuoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ContractQuoteObjectFilter the converted object
   */
  public static ContractQuoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ContractQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ContractQuoteObject")
   * @return ContractQuoteObjectFilter the converted object
   */
  public static ContractQuoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ContractQuoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ContractQuoteObjectDataList the converted object
   */
  public static ContractQuoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ContractQuoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ContractQuoteObjectList")
   * @return ContractQuoteObjectDataList the converted object
   */
  public static ContractQuoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractQuoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ContractQuoteObjectData[] array = null;
    if (root != null)
    {
      array = new ContractQuoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ContractQuoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ContractQuoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ContractQuoteObjectDataList (array, index, total);
  }
  /** convert ContractQuoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContractQuoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CnTrackingIdSet) record.put ("CnTrackingId", in.CnTrackingId);
  
    if (in._CnTrackingIdServSet) record.put ("CnTrackingIdServ", in.CnTrackingIdServ);
  
    if (in._CnContractIdSet) record.put ("CnContractId", in.CnContractId);
  
    if (in._CnContractTypeSet) record.put ("CnContractType", in.CnContractType);
  
    if (in._CnAmountSet) record.put ("CnAmount", in.CnAmount);
  
    if (in._CnDiscountSet) record.put ("CnDiscount", in.CnDiscount);
  
    if (in._CnFederalTaxSet) record.put ("CnFederalTax", in.CnFederalTax);
  
    if (in._CnStateTaxSet) record.put ("CnStateTax", in.CnStateTax);
  
    if (in._CnCountyTaxSet) record.put ("CnCountyTax", in.CnCountyTax);
  
    if (in._CnCityTaxSet) record.put ("CnCityTax", in.CnCityTax);
  
    if (in._CnOtherTaxSet) record.put ("CnOtherTax", in.CnOtherTax);
  
    if (in.cn_charge_element != null)
    {
    list = new Object[in.cn_charge_element.length];
      for (int i = 0; i < in.cn_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.cn_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("CnChargeElementList", list);
    }    return record;
  }
  /** convert ContractQuoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContractQuoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CnTrackingId, in.CnTrackingIdSort, in.CnTrackingIdSortAscending, in.CnTrackingIdFetch); 
      if (map != null) record.put ("CnTrackingId", map);
      map = DataHelper.filterToMap (in.CnTrackingIdServ, in.CnTrackingIdServSort, in.CnTrackingIdServSortAscending, in.CnTrackingIdServFetch); 
      if (map != null) record.put ("CnTrackingIdServ", map);
      map = DataHelper.filterToMap (in.CnContractId, in.CnContractIdSort, in.CnContractIdSortAscending, in.CnContractIdFetch, in.CnContractIdCaseInsensitive); 
      if (map != null) record.put ("CnContractId", map);
      map = DataHelper.filterToMap (in.CnContractType, in.CnContractTypeSort, in.CnContractTypeSortAscending, in.CnContractTypeFetch); 
      if (map != null) record.put ("CnContractType", map);
      map = DataHelper.filterToMap (in.CnAmount, in.CnAmountSort, in.CnAmountSortAscending, in.CnAmountFetch); 
      if (map != null) record.put ("CnAmount", map);
      map = DataHelper.filterToMap (in.CnDiscount, in.CnDiscountSort, in.CnDiscountSortAscending, in.CnDiscountFetch); 
      if (map != null) record.put ("CnDiscount", map);
      map = DataHelper.filterToMap (in.CnFederalTax, in.CnFederalTaxSort, in.CnFederalTaxSortAscending, in.CnFederalTaxFetch); 
      if (map != null) record.put ("CnFederalTax", map);
      map = DataHelper.filterToMap (in.CnStateTax, in.CnStateTaxSort, in.CnStateTaxSortAscending, in.CnStateTaxFetch); 
      if (map != null) record.put ("CnStateTax", map);
      map = DataHelper.filterToMap (in.CnCountyTax, in.CnCountyTaxSort, in.CnCountyTaxSortAscending, in.CnCountyTaxFetch); 
      if (map != null) record.put ("CnCountyTax", map);
      map = DataHelper.filterToMap (in.CnCityTax, in.CnCityTaxSort, in.CnCityTaxSortAscending, in.CnCityTaxFetch); 
      if (map != null) record.put ("CnCityTax", map);
      map = DataHelper.filterToMap (in.CnOtherTax, in.CnOtherTaxSort, in.CnOtherTaxSortAscending, in.CnOtherTaxFetch); 
      if (map != null) record.put ("CnOtherTax", map);
    if (in.cn_charge_element != null)
    {
    list = new Object[in.cn_charge_element.length];
      for (int i = 0; i < in.cn_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.cn_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("CnChargeElementList", list);
    }
    return record;
  }
  /** convert Map to ContractQuoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractQuoteObjectData the converted object
   */
  public static ContractQuoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractQuoteObjectData out = new ContractQuoteObjectData ();

    if ((obj = record.get ("CnTrackingId")) != null)
    {
      out.CnTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("CnTrackingIdServ")) != null)
    {
      out.CnTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("CnContractId")) != null)
    {
      out.CnContractId = (String) obj;
    }
  
    if ((obj = record.get ("CnContractType")) != null)
    {
      out.CnContractType = (Integer) obj;
    }
  
    if ((obj = record.get ("CnAmount")) != null)
    {
      out.CnAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnDiscount")) != null)
    {
      out.CnDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnFederalTax")) != null)
    {
      out.CnFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnStateTax")) != null)
    {
      out.CnStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnCountyTax")) != null)
    {
      out.CnCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnCityTax")) != null)
    {
      out.CnCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CnOtherTax")) != null)
    {
      out.CnOtherTax = (BigInteger) obj;
    }
  
    list = (Object[]) record.get ("CnChargeElementList");
    if (list != null)
    {
      out.cn_charge_element = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cn_charge_element[i] = ChargeElementObjectHelper.getObj ((Map) list[i]);
      }
    }    return out;
  }
  /** convert Map to ContractQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractQuoteObjectFilter the converted object
   */
  public static ContractQuoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractQuoteObjectFilter out = new ContractQuoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("CnChargeElementList");
    if (list != null)
    {
      out.cn_charge_element = new ChargeElementObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cn_charge_element[i] = ChargeElementObjectHelper.getFilter ((Map) list[i]);
      }
    }
    return out;
  }
}
