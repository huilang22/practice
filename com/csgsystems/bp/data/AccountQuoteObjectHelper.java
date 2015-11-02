/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountQuoteObjectHelper.java
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



/** Helper class to convert AccountQuoteObject JavaBean objects to/from HashMaps.
 */
public class AccountQuoteObjectHelper implements ArubaObjectHelper
{
  /** convert AccountQuoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountQuoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountQuoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountQuoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountQuoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountQuoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountQuoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountQuoteObjectData the converted object
   */
  public static AccountQuoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountQuoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountQuoteObject")
   * @return AccountQuoteObjectData the converted object
   */
  public static AccountQuoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountQuoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountQuoteObjectFilter the converted object
   */
  public static AccountQuoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountQuoteObject")
   * @return AccountQuoteObjectFilter the converted object
   */
  public static AccountQuoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountQuoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountQuoteObjectDataList the converted object
   */
  public static AccountQuoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountQuoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountQuoteObjectList")
   * @return AccountQuoteObjectDataList the converted object
   */
  public static AccountQuoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountQuoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountQuoteObjectData[] array = null;
    if (root != null)
    {
      array = new AccountQuoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountQuoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountQuoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountQuoteObjectDataList (array, index, total);
  }
  /** convert AccountQuoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountQuoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AcAccountNoSet) record.put ("AcAccountNo", in.AcAccountNo);
  
    if (in._AcServiceOrderIdSet) record.put ("AcServiceOrderId", in.AcServiceOrderId);
  
    if (in._AcAmountSet) record.put ("AcAmount", in.AcAmount);
  
    if (in._AcDiscountSet) record.put ("AcDiscount", in.AcDiscount);
  
    if (in._AcFederalTaxSet) record.put ("AcFederalTax", in.AcFederalTax);
  
    if (in._AcStateTaxSet) record.put ("AcStateTax", in.AcStateTax);
  
    if (in._AcCountyTaxSet) record.put ("AcCountyTax", in.AcCountyTax);
  
    if (in._AcCityTaxSet) record.put ("AcCityTax", in.AcCityTax);
  
    if (in._AcOtherTaxSet) record.put ("AcOtherTax", in.AcOtherTax);
  
    if (in.ac_charge_element != null)
    {
    list = new Object[in.ac_charge_element.length];
      for (int i = 0; i < in.ac_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.ac_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("AcChargeElementList", list);
    }
    if (in.ac_service_instance_quote != null)
    {
    list = new Object[in.ac_service_instance_quote.length];
      for (int i = 0; i < in.ac_service_instance_quote.length; i++)
      {
        list[i] = ServiceInstanceQuoteObjectHelper.getMap (in.ac_service_instance_quote[i], (Map) record.get ("ServiceInstanceQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceInstanceQuoteObject");
      }
       record.put ("AcServiceInstanceQuoteList", list);
    }
    if (in.ac_contract_quote != null)
    {
    list = new Object[in.ac_contract_quote.length];
      for (int i = 0; i < in.ac_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.ac_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("AcContractQuoteList", list);
    }
    if (in.ac_package_quote != null)
    {
    list = new Object[in.ac_package_quote.length];
      for (int i = 0; i < in.ac_package_quote.length; i++)
      {
        list[i] = PackageQuoteObjectHelper.getMap (in.ac_package_quote[i], (Map) record.get ("PackageQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "PackageQuoteObject");
      }
       record.put ("AcPackageQuoteList", list);
    }    return record;
  }
  /** convert AccountQuoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountQuoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AcAccountNo, in.AcAccountNoSort, in.AcAccountNoSortAscending, in.AcAccountNoFetch); 
      if (map != null) record.put ("AcAccountNo", map);
      map = DataHelper.filterToMap (in.AcServiceOrderId, in.AcServiceOrderIdSort, in.AcServiceOrderIdSortAscending, in.AcServiceOrderIdFetch); 
      if (map != null) record.put ("AcServiceOrderId", map);
      map = DataHelper.filterToMap (in.AcAmount, in.AcAmountSort, in.AcAmountSortAscending, in.AcAmountFetch); 
      if (map != null) record.put ("AcAmount", map);
      map = DataHelper.filterToMap (in.AcDiscount, in.AcDiscountSort, in.AcDiscountSortAscending, in.AcDiscountFetch); 
      if (map != null) record.put ("AcDiscount", map);
      map = DataHelper.filterToMap (in.AcFederalTax, in.AcFederalTaxSort, in.AcFederalTaxSortAscending, in.AcFederalTaxFetch); 
      if (map != null) record.put ("AcFederalTax", map);
      map = DataHelper.filterToMap (in.AcStateTax, in.AcStateTaxSort, in.AcStateTaxSortAscending, in.AcStateTaxFetch); 
      if (map != null) record.put ("AcStateTax", map);
      map = DataHelper.filterToMap (in.AcCountyTax, in.AcCountyTaxSort, in.AcCountyTaxSortAscending, in.AcCountyTaxFetch); 
      if (map != null) record.put ("AcCountyTax", map);
      map = DataHelper.filterToMap (in.AcCityTax, in.AcCityTaxSort, in.AcCityTaxSortAscending, in.AcCityTaxFetch); 
      if (map != null) record.put ("AcCityTax", map);
      map = DataHelper.filterToMap (in.AcOtherTax, in.AcOtherTaxSort, in.AcOtherTaxSortAscending, in.AcOtherTaxFetch); 
      if (map != null) record.put ("AcOtherTax", map);
    if (in.ac_charge_element != null)
    {
    list = new Object[in.ac_charge_element.length];
      for (int i = 0; i < in.ac_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.ac_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("AcChargeElementList", list);
    }
    if (in.ac_service_instance_quote != null)
    {
    list = new Object[in.ac_service_instance_quote.length];
      for (int i = 0; i < in.ac_service_instance_quote.length; i++)
      {
        list[i] = ServiceInstanceQuoteObjectHelper.getMap (in.ac_service_instance_quote[i], (Map) record.get ("ServiceInstanceQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceInstanceQuoteObject");
      }
       record.put ("AcServiceInstanceQuoteList", list);
    }
    if (in.ac_contract_quote != null)
    {
    list = new Object[in.ac_contract_quote.length];
      for (int i = 0; i < in.ac_contract_quote.length; i++)
      {
        list[i] = ContractQuoteObjectHelper.getMap (in.ac_contract_quote[i], (Map) record.get ("ContractQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ContractQuoteObject");
      }
       record.put ("AcContractQuoteList", list);
    }
    if (in.ac_package_quote != null)
    {
    list = new Object[in.ac_package_quote.length];
      for (int i = 0; i < in.ac_package_quote.length; i++)
      {
        list[i] = PackageQuoteObjectHelper.getMap (in.ac_package_quote[i], (Map) record.get ("PackageQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "PackageQuoteObject");
      }
       record.put ("AcPackageQuoteList", list);
    }
    return record;
  }
  /** convert Map to AccountQuoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountQuoteObjectData the converted object
   */
  public static AccountQuoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountQuoteObjectData out = new AccountQuoteObjectData ();

    if ((obj = record.get ("AcAccountNo")) != null)
    {
      out.AcAccountNo = (Integer) obj;
    }
  
    if ((obj = record.get ("AcServiceOrderId")) != null)
    {
      out.AcServiceOrderId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcAmount")) != null)
    {
      out.AcAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcDiscount")) != null)
    {
      out.AcDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcFederalTax")) != null)
    {
      out.AcFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcStateTax")) != null)
    {
      out.AcStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcCountyTax")) != null)
    {
      out.AcCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcCityTax")) != null)
    {
      out.AcCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AcOtherTax")) != null)
    {
      out.AcOtherTax = (BigInteger) obj;
    }
  
    list = (Object[]) record.get ("AcChargeElementList");
    if (list != null)
    {
      out.ac_charge_element = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_charge_element[i] = ChargeElementObjectHelper.getObj ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcServiceInstanceQuoteList");
    if (list != null)
    {
      out.ac_service_instance_quote = new ServiceInstanceQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_service_instance_quote[i] = ServiceInstanceQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcContractQuoteList");
    if (list != null)
    {
      out.ac_contract_quote = new ContractQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_contract_quote[i] = ContractQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcPackageQuoteList");
    if (list != null)
    {
      out.ac_package_quote = new PackageQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_package_quote[i] = PackageQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }    return out;
  }
  /** convert Map to AccountQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountQuoteObjectFilter the converted object
   */
  public static AccountQuoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountQuoteObjectFilter out = new AccountQuoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("AcChargeElementList");
    if (list != null)
    {
      out.ac_charge_element = new ChargeElementObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_charge_element[i] = ChargeElementObjectHelper.getFilter ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcServiceInstanceQuoteList");
    if (list != null)
    {
      out.ac_service_instance_quote = new ServiceInstanceQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_service_instance_quote[i] = ServiceInstanceQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcContractQuoteList");
    if (list != null)
    {
      out.ac_contract_quote = new ContractQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_contract_quote[i] = ContractQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    list = (Object[]) record.get ("AcPackageQuoteList");
    if (list != null)
    {
      out.ac_package_quote = new PackageQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.ac_package_quote[i] = PackageQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    return out;
  }
}
