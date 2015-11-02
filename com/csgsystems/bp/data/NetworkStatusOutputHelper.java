/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetworkStatusOutputHelper.java
 * Definition File: Customer/Account.xml
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
public class NetworkStatusOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a NetworkStatusOutputData object.
   * @param record the map
   * @return NetworkStatusOutputData the output object.
   */
  public static NetworkStatusOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NetworkStatusOutputData out = new NetworkStatusOutputData ();

    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("ReasonCode")) != null)
    {
      out.ReasonCode = (Integer) obj;
    }
  
    return out;
  }
  /** convert a NetworkStatusOutputData object to a Map.
   * @param in the object NetworkStatusOutputData the output object.
   * @return the Map
   */
  public static Map toMap(NetworkStatusOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getStatus()) != null) {

      record.put("Status", obj);
  
    }

    if ((obj = in.getReasonCode()) != null) {

      record.put("ReasonCode", obj);
  
    }

    //retVal.put("NetworkStatusResponse", record);
    //return retVal;
    return record;
  }
}
