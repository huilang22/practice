/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePostpaidProductChargeTotalOutputHelper.java
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
public class InvoicePostpaidProductChargeTotalOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoicePostpaidProductChargeTotalOutputData object.
   * @param record the map
   * @return InvoicePostpaidProductChargeTotalOutputData the output object.
   */
  public static InvoicePostpaidProductChargeTotalOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoicePostpaidProductChargeTotalOutputData out = new InvoicePostpaidProductChargeTotalOutputData ();

    if ((obj = record.get ("PostpaidTotalProductAmount")) != null)
    {
      out.PostpaidTotalProductAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PostpaidTotalChargeAmount")) != null)
    {
      out.PostpaidTotalChargeAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PostpaidTotalAdjustmentAmount")) != null)
    {
      out.PostpaidTotalAdjustmentAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PostpaidTotalPaymentAmount")) != null)
    {
      out.PostpaidTotalPaymentAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PostpaidTotalNegativePaymentAmount")) != null)
    {
      out.PostpaidTotalNegativePaymentAmount = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a InvoicePostpaidProductChargeTotalOutputData object to a Map.
   * @param in the object InvoicePostpaidProductChargeTotalOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoicePostpaidProductChargeTotalOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getPostpaidTotalProductAmount()) != null) {

      record.put("PostpaidTotalProductAmount", obj);
  
    }

    if ((obj = in.getPostpaidTotalChargeAmount()) != null) {

      record.put("PostpaidTotalChargeAmount", obj);
  
    }

    if ((obj = in.getPostpaidTotalAdjustmentAmount()) != null) {

      record.put("PostpaidTotalAdjustmentAmount", obj);
  
    }

    if ((obj = in.getPostpaidTotalPaymentAmount()) != null) {

      record.put("PostpaidTotalPaymentAmount", obj);
  
    }

    if ((obj = in.getPostpaidTotalNegativePaymentAmount()) != null) {

      record.put("PostpaidTotalNegativePaymentAmount", obj);
  
    }

    //retVal.put("InvoicePostpaidProductChargeTotalResponse", record);
    //return retVal;
    return record;
  }
}
