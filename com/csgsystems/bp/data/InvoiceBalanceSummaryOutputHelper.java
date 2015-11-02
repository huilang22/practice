/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceBalanceSummaryOutputHelper.java
 * Definition File: Customer/Invoice.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**----------------------------------------------------------------------------
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;


/** OutputHelper class to convert from a Map. */
public class InvoiceBalanceSummaryOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoiceBalanceSummaryOutputData object.
   * @param record the map
   * @return InvoiceBalanceSummaryOutputData the output object.
   */
  public static InvoiceBalanceSummaryOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceBalanceSummaryOutputData out = new InvoiceBalanceSummaryOutputData ();
    out.over_payment = BalanceSummaryObjectHelper.getObj ((Map) record.get ("OverPayment"));

    if ((obj = record.get ("AmountInCollections")) != null)
    {
      out.AmountInCollections = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a InvoiceBalanceSummaryOutputData object to a Map.
   * @param in the object InvoiceBalanceSummaryOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoiceBalanceSummaryOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
BalanceSummaryObjectData over_payment = in.getOverPayment();
    if (over_payment != null) {
      record.put("OverPayment", BalanceSummaryObjectHelper.toMap(over_payment, new HashMap(), "OverPayment").get("OverPayment"));
    }
  
    if ((obj = in.getAmountInCollections()) != null) {

      record.put("AmountInCollections", obj);
  
    }

    //retVal.put("InvoiceBalanceSummaryResponse", record);
    //return retVal;
    return record;
  }
}
