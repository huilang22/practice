/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InterimBillPollHotOutputHelper.java
 * Definition File: Customer/InterimBill.xml
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
public class InterimBillPollHotOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a InterimBillPollHotOutputData object.
   * @param record the map
   * @return InterimBillPollHotOutputData the output object.
   */
  public static InterimBillPollHotOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InterimBillPollHotOutputData out = new InterimBillPollHotOutputData ();
    out.PollHotInvoice = InterimBillObjectHelper.getObj ((Map) record.get ("InterimBill"));

    if ((obj = record.get ("RequestStatus")) != null)
    {
      out.RequestStatus = (Integer) obj;
    }
  
    return out;
  }
  /** convert a InterimBillPollHotOutputData object to a Map.
   * @param in the object InterimBillPollHotOutputData the output object.
   * @return the Map
   */
  public static Map toMap(InterimBillPollHotOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
InterimBillObjectData PollHotInvoice = in.getInterimBill();
    if (PollHotInvoice != null) {
      record.put("InterimBill", InterimBillObjectHelper.toMap(PollHotInvoice, new HashMap(), "InterimBill").get("InterimBill"));
    }
  
    if ((obj = in.getRequestStatus()) != null) {

      record.put("RequestStatus", obj);
  
    }

    //retVal.put("InterimBillPollHotResponse", record);
    //return retVal;
    return record;
  }
}
