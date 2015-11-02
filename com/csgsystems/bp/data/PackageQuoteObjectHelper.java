/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageQuoteObjectHelper.java
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



/** Helper class to convert PackageQuoteObject JavaBean objects to/from HashMaps.
 */
public class PackageQuoteObjectHelper implements ArubaObjectHelper
{
  /** convert PackageQuoteObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PackageQuoteObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageQuoteObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageQuoteObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PackageQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PackageQuoteObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageQuoteObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageQuoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageQuoteObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageQuoteObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PackageQuoteObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PackageQuoteObjectData the converted object
   */
  public static PackageQuoteObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PackageQuoteObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PackageQuoteObject")
   * @return PackageQuoteObjectData the converted object
   */
  public static PackageQuoteObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PackageQuoteObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PackageQuoteObjectFilter the converted object
   */
  public static PackageQuoteObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PackageQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PackageQuoteObject")
   * @return PackageQuoteObjectFilter the converted object
   */
  public static PackageQuoteObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageQuoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PackageQuoteObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PackageQuoteObjectDataList the converted object
   */
  public static PackageQuoteObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PackageQuoteObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PackageQuoteObjectList")
   * @return PackageQuoteObjectDataList the converted object
   */
  public static PackageQuoteObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageQuoteObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PackageQuoteObjectData[] array = null;
    if (root != null)
    {
      array = new PackageQuoteObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PackageQuoteObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PackageQuoteObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PackageQuoteObjectDataList (array, index, total);
  }
  /** convert PackageQuoteObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PackageQuoteObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PkPackageInstIdSet) record.put ("PkPackageInstId", in.PkPackageInstId);
  
    if (in._PkPackageInstIdServSet) record.put ("PkPackageInstIdServ", in.PkPackageInstIdServ);
  
    if (in._PkPackageIdSet) record.put ("PkPackageId", in.PkPackageId);
  
    if (in._PkAmountSet) record.put ("PkAmount", in.PkAmount);
  
    if (in._PkDiscountSet) record.put ("PkDiscount", in.PkDiscount);
  
    if (in._PkFederalTaxSet) record.put ("PkFederalTax", in.PkFederalTax);
  
    if (in._PkStateTaxSet) record.put ("PkStateTax", in.PkStateTax);
  
    if (in._PkCountyTaxSet) record.put ("PkCountyTax", in.PkCountyTax);
  
    if (in._PkCityTaxSet) record.put ("PkCityTax", in.PkCityTax);
  
    if (in._PkOtherTaxSet) record.put ("PkOtherTax", in.PkOtherTax);
  
    if (in.pk_component_quote != null)
    {
    list = new Object[in.pk_component_quote.length];
      for (int i = 0; i < in.pk_component_quote.length; i++)
      {
        list[i] = ComponentQuoteObjectHelper.getMap (in.pk_component_quote[i], (Map) record.get ("ComponentQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ComponentQuoteObject");
      }
       record.put ("PkComponentQuoteList", list);
    }    return record;
  }
  /** convert PackageQuoteObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PackageQuoteObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PkPackageInstId, in.PkPackageInstIdSort, in.PkPackageInstIdSortAscending, in.PkPackageInstIdFetch); 
      if (map != null) record.put ("PkPackageInstId", map);
      map = DataHelper.filterToMap (in.PkPackageInstIdServ, in.PkPackageInstIdServSort, in.PkPackageInstIdServSortAscending, in.PkPackageInstIdServFetch); 
      if (map != null) record.put ("PkPackageInstIdServ", map);
      map = DataHelper.filterToMap (in.PkPackageId, in.PkPackageIdSort, in.PkPackageIdSortAscending, in.PkPackageIdFetch); 
      if (map != null) record.put ("PkPackageId", map);
      map = DataHelper.filterToMap (in.PkAmount, in.PkAmountSort, in.PkAmountSortAscending, in.PkAmountFetch); 
      if (map != null) record.put ("PkAmount", map);
      map = DataHelper.filterToMap (in.PkDiscount, in.PkDiscountSort, in.PkDiscountSortAscending, in.PkDiscountFetch); 
      if (map != null) record.put ("PkDiscount", map);
      map = DataHelper.filterToMap (in.PkFederalTax, in.PkFederalTaxSort, in.PkFederalTaxSortAscending, in.PkFederalTaxFetch); 
      if (map != null) record.put ("PkFederalTax", map);
      map = DataHelper.filterToMap (in.PkStateTax, in.PkStateTaxSort, in.PkStateTaxSortAscending, in.PkStateTaxFetch); 
      if (map != null) record.put ("PkStateTax", map);
      map = DataHelper.filterToMap (in.PkCountyTax, in.PkCountyTaxSort, in.PkCountyTaxSortAscending, in.PkCountyTaxFetch); 
      if (map != null) record.put ("PkCountyTax", map);
      map = DataHelper.filterToMap (in.PkCityTax, in.PkCityTaxSort, in.PkCityTaxSortAscending, in.PkCityTaxFetch); 
      if (map != null) record.put ("PkCityTax", map);
      map = DataHelper.filterToMap (in.PkOtherTax, in.PkOtherTaxSort, in.PkOtherTaxSortAscending, in.PkOtherTaxFetch); 
      if (map != null) record.put ("PkOtherTax", map);
    if (in.pk_component_quote != null)
    {
    list = new Object[in.pk_component_quote.length];
      for (int i = 0; i < in.pk_component_quote.length; i++)
      {
        list[i] = ComponentQuoteObjectHelper.getMap (in.pk_component_quote[i], (Map) record.get ("ComponentQuoteObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ComponentQuoteObject");
      }
       record.put ("PkComponentQuoteList", list);
    }
    return record;
  }
  /** convert Map to PackageQuoteObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageQuoteObjectData the converted object
   */
  public static PackageQuoteObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageQuoteObjectData out = new PackageQuoteObjectData ();

    if ((obj = record.get ("PkPackageInstId")) != null)
    {
      out.PkPackageInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("PkPackageInstIdServ")) != null)
    {
      out.PkPackageInstIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("PkPackageId")) != null)
    {
      out.PkPackageId = (Integer) obj;
    }
  
    if ((obj = record.get ("PkAmount")) != null)
    {
      out.PkAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkDiscount")) != null)
    {
      out.PkDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkFederalTax")) != null)
    {
      out.PkFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkStateTax")) != null)
    {
      out.PkStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkCountyTax")) != null)
    {
      out.PkCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkCityTax")) != null)
    {
      out.PkCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PkOtherTax")) != null)
    {
      out.PkOtherTax = (BigInteger) obj;
    }
  
    list = (Object[]) record.get ("PkComponentQuoteList");
    if (list != null)
    {
      out.pk_component_quote = new ComponentQuoteObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.pk_component_quote[i] = ComponentQuoteObjectHelper.getObj ((Map) list[i]);
      }
    }    return out;
  }
  /** convert Map to PackageQuoteObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageQuoteObjectFilter the converted object
   */
  public static PackageQuoteObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageQuoteObjectFilter out = new PackageQuoteObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("PkComponentQuoteList");
    if (list != null)
    {
      out.pk_component_quote = new ComponentQuoteObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.pk_component_quote[i] = ComponentQuoteObjectHelper.getFilter ((Map) list[i]);
      }
    }
    return out;
  }
}
