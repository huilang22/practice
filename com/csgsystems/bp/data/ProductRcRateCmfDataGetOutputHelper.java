/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateCmfDataGetOutputHelper.java
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
public class ProductRcRateCmfDataGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ProductRcRateCmfDataGetOutputData object.
   * @param record the map
   * @return ProductRcRateCmfDataGetOutputData the output object.
   */
  public static ProductRcRateCmfDataGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRcRateCmfDataGetOutputData out = new ProductRcRateCmfDataGetOutputData ();

    if ((obj = record.get ("InCMFExternalId")) != null)
    {
      out.InCMFExternalId = (String) obj;
    }
  
    if ((obj = record.get ("InCMFExternalIdType")) != null)
    {
      out.InCMFExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("InCMFRateClassDefault")) != null)
    {
      out.InCMFRateClassDefault = (Integer) obj;
    }
  
    if ((obj = record.get ("InCMFRateClassSpecial")) != null)
    {
      out.InCMFRateClassSpecial = (Integer) obj;
    }
  
    if ((obj = record.get ("InCMFCurrencyCode")) != null)
    {
      out.InCMFCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InCMFBillingFrequency")) != null)
    {
      out.InCMFBillingFrequency = (Integer) obj;
    }
  
    if ((obj = record.get ("InCMFBillPeriod")) != null)
    {
      out.InCMFBillPeriod = (String) obj;
    }
  
    return out;
  }
  /** convert a ProductRcRateCmfDataGetOutputData object to a Map.
   * @param in the object ProductRcRateCmfDataGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ProductRcRateCmfDataGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getInCMFExternalId()) != null) {

      record.put("InCMFExternalId", obj);
  
    }

    if ((obj = in.getInCMFExternalIdType()) != null) {

      record.put("InCMFExternalIdType", obj);
  
    }

    if ((obj = in.getInCMFRateClassDefault()) != null) {

      record.put("InCMFRateClassDefault", obj);
  
    }

    if ((obj = in.getInCMFRateClassSpecial()) != null) {

      record.put("InCMFRateClassSpecial", obj);
  
    }

    if ((obj = in.getInCMFCurrencyCode()) != null) {

      record.put("InCMFCurrencyCode", obj);
  
    }

    if ((obj = in.getInCMFBillingFrequency()) != null) {

      record.put("InCMFBillingFrequency", obj);
  
    }

    if ((obj = in.getInCMFBillPeriod()) != null) {

      record.put("InCMFBillPeriod", obj);
  
    }

    //retVal.put("ProductRcRateCmfDataGetResponse", record);
    //return retVal;
    return record;
  }
}
