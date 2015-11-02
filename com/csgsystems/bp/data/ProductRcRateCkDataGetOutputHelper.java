/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRcRateCkDataGetOutputHelper.java
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
public class ProductRcRateCkDataGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a ProductRcRateCkDataGetOutputData object.
   * @param record the map
   * @return ProductRcRateCkDataGetOutputData the output object.
   */
  public static ProductRcRateCkDataGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRcRateCkDataGetOutputData out = new ProductRcRateCkDataGetOutputData ();

    if ((obj = record.get ("InCCKCommitmentAmount")) != null)
    {
      out.InCCKCommitmentAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InCCKCommitmentCurrentcyCode")) != null)
    {
      out.InCCKCommitmentCurrentcyCode = (Integer) obj;
    }
  
    return out;
  }
  /** convert a ProductRcRateCkDataGetOutputData object to a Map.
   * @param in the object ProductRcRateCkDataGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(ProductRcRateCkDataGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getInCCKCommitmentAmount()) != null) {

      record.put("InCCKCommitmentAmount", obj);
  
    }

    if ((obj = in.getInCCKCommitmentCurrentcyCode()) != null) {

      record.put("InCCKCommitmentCurrentcyCode", obj);
  
    }

    //retVal.put("ProductRcRateCkDataGetResponse", record);
    //return retVal;
    return record;
  }
}
