/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateRateCrDataOutputHelper.java
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
public class ProductRcRateRateCrDataOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ProductRcRateRateCrDataOutputData object.
   * @param record the map
   * @return ProductRcRateRateCrDataOutputData the output object.
   */
  public static ProductRcRateRateCrDataOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRcRateRateCrDataOutputData out = new ProductRcRateRateCrDataOutputData ();

    if ((obj = record.get ("InRATEImpliedDecimal")) != null)
    {
      out.InRATEImpliedDecimal = (Integer) obj;
    }
  
    if ((obj = record.get ("InRATERoundingMethod")) != null)
    {
      out.InRATERoundingMethod = (Integer) obj;
    }
  
    return out;
  }
  /** convert a ProductRcRateRateCrDataOutputData object to a Map.
   * @param in the object ProductRcRateRateCrDataOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ProductRcRateRateCrDataOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getInRATEImpliedDecimal()) != null) {

      record.put("InRATEImpliedDecimal", obj);
  
    }

    if ((obj = in.getInRATERoundingMethod()) != null) {

      record.put("InRATERoundingMethod", obj);
  
    }

    //retVal.put("ProductRcRateRateCrDataResponse", record);
    //return retVal;
    return record;
  }
}
