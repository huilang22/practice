/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceObjectHelper.java
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



/** Helper class to convert BillInvoiceObject JavaBean objects to/from HashMaps.
 */
public class BillInvoiceObjectHelper implements ArubaObjectHelper
{
  /** convert BillInvoiceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillInvoiceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInvoiceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillInvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillInvoiceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillInvoiceObjectData the converted object
   */
  public static BillInvoiceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillInvoiceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillInvoiceObject")
   * @return BillInvoiceObjectData the converted object
   */
  public static BillInvoiceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillInvoiceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillInvoiceObjectFilter the converted object
   */
  public static BillInvoiceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillInvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillInvoiceObject")
   * @return BillInvoiceObjectFilter the converted object
   */
  public static BillInvoiceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillInvoiceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillInvoiceObjectDataList the converted object
   */
  public static BillInvoiceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillInvoiceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillInvoiceObjectList")
   * @return BillInvoiceObjectDataList the converted object
   */
  public static BillInvoiceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillInvoiceObjectData[] array = null;
    if (root != null)
    {
      array = new BillInvoiceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillInvoiceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillInvoiceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillInvoiceObjectDataList (array, index, total);
  }
  /** convert BillInvoiceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInvoiceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.bi_charge_element != null)
    {
    list = new Object[in.bi_charge_element.length];
      for (int i = 0; i < in.bi_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.bi_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("BiChargeElementList", list);
    }
    if (in.account_quote != null)
    {
      record.put ("AccountQuoteObject", AccountQuoteObjectHelper.getMap (in.account_quote, (Map) record.get ("AccountQuoteObject")));
    }
    if (in._BiBillRefnoSet) record.put ("BiBillRefno", in.BiBillRefno);
  
    if (in._BiBillRefResetsSet) record.put ("BiBillRefResets", in.BiBillRefResets);
  
    if (in._BiStatementDateSet) record.put ("BiStatementDate", in.BiStatementDate);
  
    if (in._BiFromDateSet) record.put ("BiFromDate", in.BiFromDate);
  
    if (in._BiToDateSet) record.put ("BiToDate", in.BiToDate);
      return record;
  }
  /** convert BillInvoiceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInvoiceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.bi_charge_element != null)
    {
    list = new Object[in.bi_charge_element.length];
      for (int i = 0; i < in.bi_charge_element.length; i++)
      {
        list[i] = ChargeElementObjectHelper.getMap (in.bi_charge_element[i], (Map) record.get ("ChargeElementObject"));
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElementObject");
      }
       record.put ("BiChargeElementList", list);
    }
    if (in.account_quote != null)
    {
      record.put ("AccountQuoteObject", AccountQuoteObjectHelper.getMap (in.account_quote, (Map) record.get ("AccountQuoteObject")));
    }
      map = DataHelper.filterToMap (in.BiBillRefno, in.BiBillRefnoSort, in.BiBillRefnoSortAscending, in.BiBillRefnoFetch); 
      if (map != null) record.put ("BiBillRefno", map);
      map = DataHelper.filterToMap (in.BiBillRefResets, in.BiBillRefResetsSort, in.BiBillRefResetsSortAscending, in.BiBillRefResetsFetch); 
      if (map != null) record.put ("BiBillRefResets", map);
      map = DataHelper.filterToMap (in.BiStatementDate, in.BiStatementDateSort, in.BiStatementDateSortAscending, in.BiStatementDateFetch); 
      if (map != null) record.put ("BiStatementDate", map);
      map = DataHelper.filterToMap (in.BiFromDate, in.BiFromDateSort, in.BiFromDateSortAscending, in.BiFromDateFetch); 
      if (map != null) record.put ("BiFromDate", map);
      map = DataHelper.filterToMap (in.BiToDate, in.BiToDateSort, in.BiToDateSortAscending, in.BiToDateFetch); 
      if (map != null) record.put ("BiToDate", map);
    return record;
  }
  /** convert Map to BillInvoiceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInvoiceObjectData the converted object
   */
  public static BillInvoiceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInvoiceObjectData out = new BillInvoiceObjectData ();

    list = (Object[]) record.get ("BiChargeElementList");
    if (list != null)
    {
      out.bi_charge_element = new ChargeElementObjectData[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.bi_charge_element[i] = ChargeElementObjectHelper.getObj ((Map) list[i]);
      }
    }    out.account_quote = AccountQuoteObjectHelper.getObj ((Map) record.get ("AccountQuoteObject"));

    if ((obj = record.get ("BiBillRefno")) != null)
    {
      out.BiBillRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("BiBillRefResets")) != null)
    {
      out.BiBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("BiStatementDate")) != null)
    {
      out.BiStatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("BiFromDate")) != null)
    {
      out.BiFromDate = (Date) obj;
    }
  
    if ((obj = record.get ("BiToDate")) != null)
    {
      out.BiToDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to BillInvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInvoiceObjectFilter the converted object
   */
  public static BillInvoiceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInvoiceObjectFilter out = new BillInvoiceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    list = (Object[]) record.get ("BiChargeElementList");
    if (list != null)
    {
      out.bi_charge_element = new ChargeElementObjectFilter[list.length];
      for (int i = 0; i < list.length; i++)
      {
        out.bi_charge_element[i] = ChargeElementObjectHelper.getFilter ((Map) list[i]);
      }
    }    out.account_quote = AccountQuoteObjectHelper.getFilter ((Map) record.get ("AccountQuoteObject"));

    return out;
  }
}
