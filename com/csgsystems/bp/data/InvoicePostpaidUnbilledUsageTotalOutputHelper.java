/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoicePostpaidUnbilledUsageTotalOutputHelper.java
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
public class InvoicePostpaidUnbilledUsageTotalOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InvoicePostpaidUnbilledUsageTotalOutputData object.
   * @param record the map
   * @return InvoicePostpaidUnbilledUsageTotalOutputData the output object.
   */
  public static InvoicePostpaidUnbilledUsageTotalOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoicePostpaidUnbilledUsageTotalOutputData out = new InvoicePostpaidUnbilledUsageTotalOutputData ();

    if ((obj = record.get ("TotalPostpaidUnbilledUsage")) != null)
    {
      out.TotalPostpaidUnbilledUsage = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SumPostpaidUnbilledUsage")) != null)
    {
      out.SumPostpaidUnbilledUsage = (BigInteger) obj;
    }
  
    return out;
  }
  /** convert a InvoicePostpaidUnbilledUsageTotalOutputData object to a Map.
   * @param in the object InvoicePostpaidUnbilledUsageTotalOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InvoicePostpaidUnbilledUsageTotalOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getTotalPostpaidUnbilledUsage()) != null) {

      record.put("TotalPostpaidUnbilledUsage", obj);
  
    }

    if ((obj = in.getSumPostpaidUnbilledUsage()) != null) {

      record.put("SumPostpaidUnbilledUsage", obj);
  
    }

    //retVal.put("InvoicePostpaidUnbilledUsageTotalResponse", record);
    //return retVal;
    return record;
  }
}
