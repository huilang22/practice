/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeElementObjectHelper.java
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



/** Helper class to convert ChargeElementObject JavaBean objects to/from HashMaps.
 */
public class ChargeElementObjectHelper implements ArubaObjectHelper
{
  /** convert ChargeElementObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ChargeElementObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeElementObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeElementObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeElementObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeElementObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ChargeElementObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ChargeElementObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeElementObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeElementObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeElementObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeElementObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ChargeElementObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ChargeElementObjectData the converted object
   */
  public static ChargeElementObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ChargeElementObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ChargeElementObject")
   * @return ChargeElementObjectData the converted object
   */
  public static ChargeElementObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeElementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ChargeElementObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ChargeElementObjectFilter the converted object
   */
  public static ChargeElementObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ChargeElementObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ChargeElementObject")
   * @return ChargeElementObjectFilter the converted object
   */
  public static ChargeElementObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeElementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ChargeElementObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ChargeElementObjectDataList the converted object
   */
  public static ChargeElementObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ChargeElementObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ChargeElementObjectList")
   * @return ChargeElementObjectDataList the converted object
   */
  public static ChargeElementObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeElementObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ChargeElementObjectData[] array = null;
    if (root != null)
    {
      array = new ChargeElementObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ChargeElementObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ChargeElementObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ChargeElementObjectDataList (array, index, total);
  }
  /** convert ChargeElementObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ChargeElementObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CeBillRefnoSet) record.put ("CeBillRefno", in.CeBillRefno);
  
    if (in._CeBillRefResetsSet) record.put ("CeBillRefResets", in.CeBillRefResets);
  
    if (in._CeStatementDateSet) record.put ("CeStatementDate", in.CeStatementDate);
  
    if (in._CeFromDateSet) record.put ("CeFromDate", in.CeFromDate);
  
    if (in._CeToDateSet) record.put ("CeToDate", in.CeToDate);
  
    if (in._CeObjectTypeSet) record.put ("CeObjectType", in.CeObjectType);
  
    if (in._CeObjectTypeKeySet) record.put ("CeObjectTypeKey", in.CeObjectTypeKey);
  
    if (in._CeObjectKey1Set) record.put ("CeObjectKey1", in.CeObjectKey1);
  
    if (in._CeObjectKey2Set) record.put ("CeObjectKey2", in.CeObjectKey2);
  
    if (in._CeParentTypeSet) record.put ("CeParentType", in.CeParentType);
  
    if (in._CeParentTypeKeySet) record.put ("CeParentTypeKey", in.CeParentTypeKey);
  
    if (in._CeParentKey1Set) record.put ("CeParentKey1", in.CeParentKey1);
  
    if (in._CeParentKey2Set) record.put ("CeParentKey2", in.CeParentKey2);
  
    if (in._CeAmountSet) record.put ("CeAmount", in.CeAmount);
  
    if (in._CeDiscountSet) record.put ("CeDiscount", in.CeDiscount);
  
    if (in._CeTaxesSet) record.put ("CeTaxes", in.CeTaxes);
  
    if (in._CeFederalTaxSet) record.put ("CeFederalTax", in.CeFederalTax);
  
    if (in._CeStateTaxSet) record.put ("CeStateTax", in.CeStateTax);
  
    if (in._CeCountyTaxSet) record.put ("CeCountyTax", in.CeCountyTax);
  
    if (in._CeCityTaxSet) record.put ("CeCityTax", in.CeCityTax);
  
    if (in._CeOtherTaxSet) record.put ("CeOtherTax", in.CeOtherTax);
  
    if (in._CeDescriptionTextSet) record.put ("CeDescriptionText", in.CeDescriptionText);
  
    if (in._CeDescriptionCodeSet) record.put ("CeDescriptionCode", in.CeDescriptionCode);
      return record;
  }
  /** convert ChargeElementObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ChargeElementObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CeBillRefno, in.CeBillRefnoSort, in.CeBillRefnoSortAscending, in.CeBillRefnoFetch); 
      if (map != null) record.put ("CeBillRefno", map);
      map = DataHelper.filterToMap (in.CeBillRefResets, in.CeBillRefResetsSort, in.CeBillRefResetsSortAscending, in.CeBillRefResetsFetch); 
      if (map != null) record.put ("CeBillRefResets", map);
      map = DataHelper.filterToMap (in.CeStatementDate, in.CeStatementDateSort, in.CeStatementDateSortAscending, in.CeStatementDateFetch); 
      if (map != null) record.put ("CeStatementDate", map);
      map = DataHelper.filterToMap (in.CeFromDate, in.CeFromDateSort, in.CeFromDateSortAscending, in.CeFromDateFetch); 
      if (map != null) record.put ("CeFromDate", map);
      map = DataHelper.filterToMap (in.CeToDate, in.CeToDateSort, in.CeToDateSortAscending, in.CeToDateFetch); 
      if (map != null) record.put ("CeToDate", map);
      map = DataHelper.filterToMap (in.CeObjectType, in.CeObjectTypeSort, in.CeObjectTypeSortAscending, in.CeObjectTypeFetch); 
      if (map != null) record.put ("CeObjectType", map);
      map = DataHelper.filterToMap (in.CeObjectTypeKey, in.CeObjectTypeKeySort, in.CeObjectTypeKeySortAscending, in.CeObjectTypeKeyFetch); 
      if (map != null) record.put ("CeObjectTypeKey", map);
      map = DataHelper.filterToMap (in.CeObjectKey1, in.CeObjectKey1Sort, in.CeObjectKey1SortAscending, in.CeObjectKey1Fetch); 
      if (map != null) record.put ("CeObjectKey1", map);
      map = DataHelper.filterToMap (in.CeObjectKey2, in.CeObjectKey2Sort, in.CeObjectKey2SortAscending, in.CeObjectKey2Fetch); 
      if (map != null) record.put ("CeObjectKey2", map);
      map = DataHelper.filterToMap (in.CeParentType, in.CeParentTypeSort, in.CeParentTypeSortAscending, in.CeParentTypeFetch); 
      if (map != null) record.put ("CeParentType", map);
      map = DataHelper.filterToMap (in.CeParentTypeKey, in.CeParentTypeKeySort, in.CeParentTypeKeySortAscending, in.CeParentTypeKeyFetch); 
      if (map != null) record.put ("CeParentTypeKey", map);
      map = DataHelper.filterToMap (in.CeParentKey1, in.CeParentKey1Sort, in.CeParentKey1SortAscending, in.CeParentKey1Fetch); 
      if (map != null) record.put ("CeParentKey1", map);
      map = DataHelper.filterToMap (in.CeParentKey2, in.CeParentKey2Sort, in.CeParentKey2SortAscending, in.CeParentKey2Fetch); 
      if (map != null) record.put ("CeParentKey2", map);
      map = DataHelper.filterToMap (in.CeAmount, in.CeAmountSort, in.CeAmountSortAscending, in.CeAmountFetch); 
      if (map != null) record.put ("CeAmount", map);
      map = DataHelper.filterToMap (in.CeDiscount, in.CeDiscountSort, in.CeDiscountSortAscending, in.CeDiscountFetch); 
      if (map != null) record.put ("CeDiscount", map);
      map = DataHelper.filterToMap (in.CeTaxes, in.CeTaxesSort, in.CeTaxesSortAscending, in.CeTaxesFetch); 
      if (map != null) record.put ("CeTaxes", map);
      map = DataHelper.filterToMap (in.CeFederalTax, in.CeFederalTaxSort, in.CeFederalTaxSortAscending, in.CeFederalTaxFetch); 
      if (map != null) record.put ("CeFederalTax", map);
      map = DataHelper.filterToMap (in.CeStateTax, in.CeStateTaxSort, in.CeStateTaxSortAscending, in.CeStateTaxFetch); 
      if (map != null) record.put ("CeStateTax", map);
      map = DataHelper.filterToMap (in.CeCountyTax, in.CeCountyTaxSort, in.CeCountyTaxSortAscending, in.CeCountyTaxFetch); 
      if (map != null) record.put ("CeCountyTax", map);
      map = DataHelper.filterToMap (in.CeCityTax, in.CeCityTaxSort, in.CeCityTaxSortAscending, in.CeCityTaxFetch); 
      if (map != null) record.put ("CeCityTax", map);
      map = DataHelper.filterToMap (in.CeOtherTax, in.CeOtherTaxSort, in.CeOtherTaxSortAscending, in.CeOtherTaxFetch); 
      if (map != null) record.put ("CeOtherTax", map);
      map = DataHelper.filterToMap (in.CeDescriptionText, in.CeDescriptionTextSort, in.CeDescriptionTextSortAscending, in.CeDescriptionTextFetch, in.CeDescriptionTextCaseInsensitive); 
      if (map != null) record.put ("CeDescriptionText", map);
      map = DataHelper.filterToMap (in.CeDescriptionCode, in.CeDescriptionCodeSort, in.CeDescriptionCodeSortAscending, in.CeDescriptionCodeFetch); 
      if (map != null) record.put ("CeDescriptionCode", map);
    return record;
  }
  /** convert Map to ChargeElementObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeElementObjectData the converted object
   */
  public static ChargeElementObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeElementObjectData out = new ChargeElementObjectData ();

    if ((obj = record.get ("CeBillRefno")) != null)
    {
      out.CeBillRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("CeBillRefResets")) != null)
    {
      out.CeBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("CeStatementDate")) != null)
    {
      out.CeStatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("CeFromDate")) != null)
    {
      out.CeFromDate = (Date) obj;
    }
  
    if ((obj = record.get ("CeToDate")) != null)
    {
      out.CeToDate = (Date) obj;
    }
  
    if ((obj = record.get ("CeObjectType")) != null)
    {
      out.CeObjectType = (Integer) obj;
    }
  
    if ((obj = record.get ("CeObjectTypeKey")) != null)
    {
      out.CeObjectTypeKey = (Integer) obj;
    }
  
    if ((obj = record.get ("CeObjectKey1")) != null)
    {
      out.CeObjectKey1 = (Integer) obj;
    }
  
    if ((obj = record.get ("CeObjectKey2")) != null)
    {
      out.CeObjectKey2 = (Integer) obj;
    }
  
    if ((obj = record.get ("CeParentType")) != null)
    {
      out.CeParentType = (Integer) obj;
    }
  
    if ((obj = record.get ("CeParentTypeKey")) != null)
    {
      out.CeParentTypeKey = (Integer) obj;
    }
  
    if ((obj = record.get ("CeParentKey1")) != null)
    {
      out.CeParentKey1 = (Integer) obj;
    }
  
    if ((obj = record.get ("CeParentKey2")) != null)
    {
      out.CeParentKey2 = (Integer) obj;
    }
  
    if ((obj = record.get ("CeAmount")) != null)
    {
      out.CeAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeDiscount")) != null)
    {
      out.CeDiscount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeTaxes")) != null)
    {
      out.CeTaxes = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeFederalTax")) != null)
    {
      out.CeFederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeStateTax")) != null)
    {
      out.CeStateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeCountyTax")) != null)
    {
      out.CeCountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeCityTax")) != null)
    {
      out.CeCityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeOtherTax")) != null)
    {
      out.CeOtherTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CeDescriptionText")) != null)
    {
      out.CeDescriptionText = (String) obj;
    }
  
    if ((obj = record.get ("CeDescriptionCode")) != null)
    {
      out.CeDescriptionCode = (Integer) obj;
    }
      return out;
  }
  /** convert Map to ChargeElementObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeElementObjectFilter the converted object
   */
  public static ChargeElementObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeElementObjectFilter out = new ChargeElementObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
