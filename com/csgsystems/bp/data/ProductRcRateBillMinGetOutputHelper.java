/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateBillMinGetOutputHelper.java
 * Definition File: Customer/ProductRcRate.xml
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
public class ProductRcRateBillMinGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ProductRcRateBillMinGetOutputData object.
   * @param record the map
   * @return ProductRcRateBillMinGetOutputData the output object.
   */
  public static ProductRcRateBillMinGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRcRateBillMinGetOutputData out = new ProductRcRateBillMinGetOutputData ();

    if ((obj = record.get ("OutPRRMDMinCutOffDate")) != null)
    {
      out.OutPRRMDMinCutOffDate = (Date) obj;
    }
  
    if ((obj = record.get ("OutPRRMDDateCount")) != null)
    {
      out.OutPRRMDDateCount = (Integer) obj;
    }
  
    return out;
  }
  /** convert a ProductRcRateBillMinGetOutputData object to a Map.
   * @param in the object ProductRcRateBillMinGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ProductRcRateBillMinGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getOutPRRMDMinCutOffDate()) != null) {

      record.put("OutPRRMDMinCutOffDate", obj);
  
    }

    if ((obj = in.getOutPRRMDDateCount()) != null) {

      record.put("OutPRRMDDateCount", obj);
  
    }

    //retVal.put("ProductRcRateBillMinGetResponse", record);
    //return retVal;
    return record;
  }
}
