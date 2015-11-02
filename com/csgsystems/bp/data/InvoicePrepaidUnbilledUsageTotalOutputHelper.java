/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePrepaidUnbilledUsageTotalOutputHelper.java
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
public class InvoicePrepaidUnbilledUsageTotalOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoicePrepaidUnbilledUsageTotalOutputData object.
   * @param record the map
   * @return InvoicePrepaidUnbilledUsageTotalOutputData the output object.
   */
  public static InvoicePrepaidUnbilledUsageTotalOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoicePrepaidUnbilledUsageTotalOutputData out = new InvoicePrepaidUnbilledUsageTotalOutputData ();

    if ((obj = record.get ("TotalPrepaidUnbilledUsage")) != null)
    {
      out.TotalPrepaidUnbilledUsage = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SumPrepaidUnbilledUsage")) != null)
    {
      out.SumPrepaidUnbilledUsage = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a InvoicePrepaidUnbilledUsageTotalOutputData object to a Map.
   * @param in the object InvoicePrepaidUnbilledUsageTotalOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoicePrepaidUnbilledUsageTotalOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getTotalPrepaidUnbilledUsage()) != null) {

      record.put("TotalPrepaidUnbilledUsage", obj);
  
    }

    if ((obj = in.getSumPrepaidUnbilledUsage()) != null) {

      record.put("SumPrepaidUnbilledUsage", obj);
  
    }

    //retVal.put("InvoicePrepaidUnbilledUsageTotalResponse", record);
    //return retVal;
    return record;
  }
}
