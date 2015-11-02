/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePrepaidProductChargeTotalOutputHelper.java
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
public class InvoicePrepaidProductChargeTotalOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoicePrepaidProductChargeTotalOutputData object.
   * @param record the map
   * @return InvoicePrepaidProductChargeTotalOutputData the output object.
   */
  public static InvoicePrepaidProductChargeTotalOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoicePrepaidProductChargeTotalOutputData out = new InvoicePrepaidProductChargeTotalOutputData ();

    if ((obj = record.get ("PrepaidTotalProductAmount")) != null)
    {
      out.PrepaidTotalProductAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PrepaidTotalChargeAmount")) != null)
    {
      out.PrepaidTotalChargeAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PrepaidTotalAdjustmentAmount")) != null)
    {
      out.PrepaidTotalAdjustmentAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PrepaidTotalPaymentAmount")) != null)
    {
      out.PrepaidTotalPaymentAmount = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a InvoicePrepaidProductChargeTotalOutputData object to a Map.
   * @param in the object InvoicePrepaidProductChargeTotalOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoicePrepaidProductChargeTotalOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getPrepaidTotalProductAmount()) != null) {

      record.put("PrepaidTotalProductAmount", obj);
  
    }

    if ((obj = in.getPrepaidTotalChargeAmount()) != null) {

      record.put("PrepaidTotalChargeAmount", obj);
  
    }

    if ((obj = in.getPrepaidTotalAdjustmentAmount()) != null) {

      record.put("PrepaidTotalAdjustmentAmount", obj);
  
    }

    if ((obj = in.getPrepaidTotalPaymentAmount()) != null) {

      record.put("PrepaidTotalPaymentAmount", obj);
  
    }

    //retVal.put("InvoicePrepaidProductChargeTotalResponse", record);
    //return retVal;
    return record;
  }
}
