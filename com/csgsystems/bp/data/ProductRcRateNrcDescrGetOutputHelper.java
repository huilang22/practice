/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateNrcDescrGetOutputHelper.java
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
public class ProductRcRateNrcDescrGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ProductRcRateNrcDescrGetOutputData object.
   * @param record the map
   * @return ProductRcRateNrcDescrGetOutputData the output object.
   */
  public static ProductRcRateNrcDescrGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRcRateNrcDescrGetOutputData out = new ProductRcRateNrcDescrGetOutputData ();

    if ((obj = record.get ("InNRCComponentId")) != null)
    {
      out.InNRCComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("InNRCElementId")) != null)
    {
      out.InNRCElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("InNRCCurrencyCode")) != null)
    {
      out.InNRCCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InNRCRateCurrencyLocation")) != null)
    {
      out.InNRCRateCurrencyLocation = (Integer) obj;
    }
  
    return out;
  }
  /** convert a ProductRcRateNrcDescrGetOutputData object to a Map.
   * @param in the object ProductRcRateNrcDescrGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ProductRcRateNrcDescrGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getInNRCComponentId()) != null) {

      record.put("InNRCComponentId", obj);
  
    }

    if ((obj = in.getInNRCElementId()) != null) {

      record.put("InNRCElementId", obj);
  
    }

    if ((obj = in.getInNRCCurrencyCode()) != null) {

      record.put("InNRCCurrencyCode", obj);
  
    }

    if ((obj = in.getInNRCRateCurrencyLocation()) != null) {

      record.put("InNRCRateCurrencyLocation", obj);
  
    }

    //retVal.put("ProductRcRateNrcDescrGetResponse", record);
    //return retVal;
    return record;
  }
}
