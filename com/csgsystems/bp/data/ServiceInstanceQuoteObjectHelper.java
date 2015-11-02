/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceInstanceQuoteObjectHelper.java
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



/** Helper class to convert ServiceInstanceQuoteObject JavaBean objects to/from HashMaps.
 */
public class ServiceInstanceQuoteObjectHelper implements ArubaObjectHelper
{
  /** convert ServiceInstanceQuoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServiceInstanceQuoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceInstanceQuoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceInstanceQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceInstanceQuoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceInstanceQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceInstanceQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceInstanceQuoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceInstanceQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceInstanceQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceInstanceQuoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceInstanceQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceInstanceQuoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServiceInstanceQuoteObjectData the converted object
   */
  public static ServiceInstanceQuoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceInstanceQuoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceInstanceQuoteObject")
   * @return ServiceInstanceQuoteObjectData the converted object
   */
  public static ServiceInstanceQuoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceInstanceQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceInstanceQuoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServiceInstanceQuoteObjectFilter the converted object
   */
  public static ServiceInstanceQuoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceInstanceQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceInstanceQuoteObject")
   * @return ServiceInstanceQuoteObjectFilter the converted object
   */
  public static ServiceInstanceQuoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceInstanceQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServiceInstanceQuoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServiceInstanceQuoteObjectDataList the converted object
   */
  public static ServiceInstanceQuoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServiceInstanceQuoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServiceInstanceQuoteObjectList")
   * @return ServiceInstanceQuoteObjectDataList the converted object
   */
  public static ServiceInstanceQuoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceInstanceQuoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServiceInstanceQuoteObjectData[] array = null;
    if (root != null)
    {
      array = new ServiceInstanceQuoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServiceInstanceQuoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServiceInstanceQuoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServiceInstanceQuoteObjectDataList (array, index, total);
  }
  /** convert ServiceInstanceQuoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceInstanceQuoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SiSubscrNoSet) record.put ("SiSubscrNo", in.SiSubscrNo);
  
    if (in._SiSubscrNoResetsSet) record.put ("SiSubscrNoResets", in.SiSubscrNoResets);
  
    if (in._SiServiceOrderIdSet) record.put ("SiServiceOrderId", in.SiServiceOrderId);
  
    if (in._SiEmfConfigIdSet) record.put ("SiEmfConfigId", in.SiEmfConfigId);
  
    if (in._SiAmountSet) record.put ("SiAmount", in.SiAmount);
  
    if (in._SiDiscountSet) record.put ("SiDiscount", in.SiDiscount);
  
    if (in._SiFederalTaxSet) record.put ("SiFederalTax", in.SiFederalTax);
  
    if (in._SiStateTaxSet) record.put ("SiStateTax", in.SiStateTax);
  
    if (in._SiCountyTaxSet) record.put ("SiCountyTax", in.SiCountyTax);
  
    if (in._SiCityTaxSet) record.put ("SiCityTax", in.SiCityTax);
  
    if (in._SiOtherTaxSet) record.put ("SiOtherTax", in.SiOtherTax);
  
    if (in.si_charge_element != null)
    {
    list = new Object[in.si_charge_element.length];
      for (int i = 0; i < in.si_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.si_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("SiChargeElementList", list);
    }
    if (in.si_contract_quote != null)
    {
    list = new Object[in.si_contract_quote.length];
      for (int i = 0; i < in.si_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.si_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("SiContractQuoteList", list);
    }    return record;
  }
  /** convert ServiceInstanceQuoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceInstanceQuoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.SiSubscrNo, in.SiSubscrNoSort, in.SiSubscrNoSortAscending, in.SiSubscrNoFetch); 
      if (map != null) record.put ("SiSubscrNo", map);
      map = DataHelper.filterToMap (in.SiSubscrNoResets, in.SiSubscrNoResetsSort, in.SiSubscrNoResetsSortAscending, in.SiSubscrNoResetsFetch); 
      if (map != null) record.put ("SiSubscrNoResets", map);
      map = DataHelper.filterToMap (in.SiServiceOrderId, in.SiServiceOrderIdSort, in.SiServiceOrderIdSortAscending, in.SiServiceOrderIdFetch); 
      if (map != null) record.put ("SiServiceOrderId", map);
      map = DataHelper.filterToMap (in.SiEmfConfigId, in.SiEmfConfigIdSort, in.SiEmfConfigIdSortAscending, in.SiEmfConfigIdFetch); 
      if (map != null) record.put ("SiEmfConfigId", map);
      map = DataHelper.filterToMap (in.SiAmount, in.SiAmountSort, in.SiAmountSortAscending, in.SiAmountFetch); 
      if (map != null) record.put ("SiAmount", map);
      map = DataHelper.filterToMap (in.SiDiscount, in.SiDiscountSort, in.SiDiscountSortAscending, in.SiDiscountFetch); 
      if (map != null) record.put ("SiDiscount", map);
      map = DataHelper.filterToMap (in.SiFederalTax, in.SiFederalTaxSort, in.SiFederalTaxSortAscending, in.SiFederalTaxFetch); 
      if (map != null) record.put ("SiFederalTax", map);
      map = DataHelper.filterToMap (in.SiStateTax, in.SiStateTaxSort, in.SiStateTaxSortAscending, in.SiStateTaxFetch); 
      if (map != null) record.put ("SiStateTax", map);
      map = DataHelper.filterToMap (in.SiCountyTax, in.SiCountyTaxSort, in.SiCountyTaxSortAscending, in.SiCountyTaxFetch); 
      if (map != null) record.put ("SiCountyTax", map);
      map = DataHelper.filterToMap (in.SiCityTax, in.SiCityTaxSort, in.SiCityTaxSortAscending, in.SiCityTaxFetch); 
      if (map != null) record.put ("SiCityTax", map);
      map = DataHelper.filterToMap (in.SiOtherTax, in.SiOtherTaxSort, in.SiOtherTaxSortAscending, in.SiOtherTaxFetch); 
      if (map != null) record.put ("SiOtherTax", map);
    if (in.si_charge_element != null)
    {
    list = new Object[in.si_charge_element.length];
      for (int i = 0; i < in.si_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.si_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("SiChargeElementList", list);
    }
    if (in.si_contract_quote != null)
    {
    list = new Object[in.si_contract_quote.length];
      for (int i = 0; i < in.si_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.si_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("SiContractQuoteList", list);
    }
    return record;
  }
  /** convert Map to ServiceInstanceQuoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceInstanceQuoteObjectData the converted object
   */
  public static ServiceInstanceQuoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceInstanceQuoteObjectData out = new ServiceInstanceQuoteObjectData ();

    if ((obj = record.get ("SiSubscrNo")) != null)
    {
      out.SiSubscrNo = (Integer) obj;
    }
  
    if ((obj = record.get ("SiSubscrNoResets")) != null)
    {
      out.SiSubscrNoResets = (Integer) obj;
    }
  
    if ((obj = record.get ("SiServiceOrderId")) != null)
    {
      out.SiServiceOrderId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiEmfConfigId")) != null)
    {
      out.SiEmfConfigId = (Integer) obj;
    }
  
    if ((obj = record.get ("SiAmount")) != null)
    {
      out.SiAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiDiscount")) != null)
    {
      out.SiDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiFederalTax")) != null)
    {
      out.SiFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiStateTax")) != null)
    {
      out.SiStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiCountyTax")) != null)
    {
      out.SiCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiCityTax")) != null)
    {
      out.SiCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SiOtherTax")) != null)
    {
      out.SiOtherTax = (BigInteger) obj;
    }
  
    list = (Object[]) record.get ("SiChargeElementList");
    if (list != null)
    {
      out.si_charge_element = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.si_charge_element[i] = ChargeElementObjectHelper.getObj ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("SiContractQuoteList");
    if (list != null)
    {
      out.si_contract_quote = new ContractQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.si_contract_quote[i] = ContractQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }    return out;
  }
  /** convert Map to ServiceInstanceQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceInstanceQuoteObjectFilter the converted object
   */
  public static ServiceInstanceQuoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceInstanceQuoteObjectFilter out = new ServiceInstanceQuoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("SiChargeElementList");
    if (list != null)
    {
      out.si_charge_element = new ChargeElementObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.si_charge_element[i] = ChargeElementObjectHelper.getFilter ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("SiContractQuoteList");
    if (list != null)
    {
      out.si_contract_quote = new ContractQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.si_contract_quote[i] = ContractQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    return out;
  }
}
