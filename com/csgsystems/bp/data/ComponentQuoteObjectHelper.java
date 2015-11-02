/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ComponentQuoteObjectHelper.java
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



/** Helper class to convert ComponentQuoteObject JavaBean objects to/from HashMaps.
 */
public class ComponentQuoteObjectHelper implements ArubaObjectHelper
{
  /** convert ComponentQuoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ComponentQuoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ComponentQuoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ComponentQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ComponentQuoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ComponentQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ComponentQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ComponentQuoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ComponentQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ComponentQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (ComponentQuoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ComponentQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ComponentQuoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ComponentQuoteObjectData the converted object
   */
  public static ComponentQuoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ComponentQuoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ComponentQuoteObject")
   * @return ComponentQuoteObjectData the converted object
   */
  public static ComponentQuoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ComponentQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ComponentQuoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ComponentQuoteObjectFilter the converted object
   */
  public static ComponentQuoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ComponentQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ComponentQuoteObject")
   * @return ComponentQuoteObjectFilter the converted object
   */
  public static ComponentQuoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ComponentQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ComponentQuoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ComponentQuoteObjectDataList the converted object
   */
  public static ComponentQuoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ComponentQuoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ComponentQuoteObjectList")
   * @return ComponentQuoteObjectDataList the converted object
   */
  public static ComponentQuoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ComponentQuoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ComponentQuoteObjectData[] array = null;
    if (root != null)
    {
      array = new ComponentQuoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ComponentQuoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ComponentQuoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ComponentQuoteObjectDataList (array, index, total);
  }
  /** convert ComponentQuoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ComponentQuoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CmComponentInstIdSet) record.put ("CmComponentInstId", in.CmComponentInstId);
  
    if (in._CmComponentInstIdServSet) record.put ("CmComponentInstIdServ", in.CmComponentInstIdServ);
  
    if (in._CmComponentIdSet) record.put ("CmComponentId", in.CmComponentId);
  
    if (in._CmAmountSet) record.put ("CmAmount", in.CmAmount);
  
    if (in._CmDiscountSet) record.put ("CmDiscount", in.CmDiscount);
  
    if (in._CmFederalTaxSet) record.put ("CmFederalTax", in.CmFederalTax);
  
    if (in._CmStateTaxSet) record.put ("CmStateTax", in.CmStateTax);
  
    if (in._CmCountyTaxSet) record.put ("CmCountyTax", in.CmCountyTax);
  
    if (in._CmCityTaxSet) record.put ("CmCityTax", in.CmCityTax);
  
    if (in._CmOtherTaxSet) record.put ("CmOtherTax", in.CmOtherTax);
  
    if (in.cm_charge_element != null)
    {
    list = new Object[in.cm_charge_element.length];
      for (int i = 0; i < in.cm_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.cm_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("CmChargeElementList", list);
    }
    if (in.cm_contract_quote != null)
    {
    list = new Object[in.cm_contract_quote.length];
      for (int i = 0; i < in.cm_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.cm_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("CmContractQuoteList", list);
    }    return record;
  }
  /** convert ComponentQuoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ComponentQuoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CmComponentInstId, in.CmComponentInstIdSort, in.CmComponentInstIdSortAscending, in.CmComponentInstIdFetch); 
      if (map != null) record.put ("CmComponentInstId", map);
      map = DataHelper.filterToMap (in.CmComponentInstIdServ, in.CmComponentInstIdServSort, in.CmComponentInstIdServSortAscending, in.CmComponentInstIdServFetch); 
      if (map != null) record.put ("CmComponentInstIdServ", map);
      map = DataHelper.filterToMap (in.CmComponentId, in.CmComponentIdSort, in.CmComponentIdSortAscending, in.CmComponentIdFetch); 
      if (map != null) record.put ("CmComponentId", map);
      map = DataHelper.filterToMap (in.CmAmount, in.CmAmountSort, in.CmAmountSortAscending, in.CmAmountFetch); 
      if (map != null) record.put ("CmAmount", map);
      map = DataHelper.filterToMap (in.CmDiscount, in.CmDiscountSort, in.CmDiscountSortAscending, in.CmDiscountFetch); 
      if (map != null) record.put ("CmDiscount", map);
      map = DataHelper.filterToMap (in.CmFederalTax, in.CmFederalTaxSort, in.CmFederalTaxSortAscending, in.CmFederalTaxFetch); 
      if (map != null) record.put ("CmFederalTax", map);
      map = DataHelper.filterToMap (in.CmStateTax, in.CmStateTaxSort, in.CmStateTaxSortAscending, in.CmStateTaxFetch); 
      if (map != null) record.put ("CmStateTax", map);
      map = DataHelper.filterToMap (in.CmCountyTax, in.CmCountyTaxSort, in.CmCountyTaxSortAscending, in.CmCountyTaxFetch); 
      if (map != null) record.put ("CmCountyTax", map);
      map = DataHelper.filterToMap (in.CmCityTax, in.CmCityTaxSort, in.CmCityTaxSortAscending, in.CmCityTaxFetch); 
      if (map != null) record.put ("CmCityTax", map);
      map = DataHelper.filterToMap (in.CmOtherTax, in.CmOtherTaxSort, in.CmOtherTaxSortAscending, in.CmOtherTaxFetch); 
      if (map != null) record.put ("CmOtherTax", map);
    if (in.cm_charge_element != null)
    {
    list = new Object[in.cm_charge_element.length];
      for (int i = 0; i < in.cm_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.cm_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("CmChargeElementList", list);
    }
    if (in.cm_contract_quote != null)
    {
    list = new Object[in.cm_contract_quote.length];
      for (int i = 0; i < in.cm_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.cm_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("CmContractQuoteList", list);
    }
    return record;
  }
  /** convert Map to ComponentQuoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ComponentQuoteObjectData the converted object
   */
  public static ComponentQuoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ComponentQuoteObjectData out = new ComponentQuoteObjectData ();

    if ((obj = record.get ("CmComponentInstId")) != null)
    {
      out.CmComponentInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("CmComponentInstIdServ")) != null)
    {
      out.CmComponentInstIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("CmComponentId")) != null)
    {
      out.CmComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("CmAmount")) != null)
    {
      out.CmAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmDiscount")) != null)
    {
      out.CmDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmFederalTax")) != null)
    {
      out.CmFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmStateTax")) != null)
    {
      out.CmStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmCountyTax")) != null)
    {
      out.CmCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmCityTax")) != null)
    {
      out.CmCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CmOtherTax")) != null)
    {
      out.CmOtherTax = (BigInteger) obj;
    }
  
    list = (Object[]) record.get ("CmChargeElementList");
    if (list != null)
    {
      out.cm_charge_element = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cm_charge_element[i] = ChargeElementObjectHelper.getObj ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("CmContractQuoteList");
    if (list != null)
    {
      out.cm_contract_quote = new ContractQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cm_contract_quote[i] = ContractQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }    return out;
  }
  /** convert Map to ComponentQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ComponentQuoteObjectFilter the converted object
   */
  public static ComponentQuoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ComponentQuoteObjectFilter out = new ComponentQuoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("CmChargeElementList");
    if (list != null)
    {
      out.cm_charge_element = new ChargeElementObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cm_charge_element[i] = ChargeElementObjectHelper.getFilter ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("CmContractQuoteList");
    if (list != null)
    {
      out.cm_contract_quote = new ContractQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.cm_contract_quote[i] = ContractQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    return out;
  }
}
