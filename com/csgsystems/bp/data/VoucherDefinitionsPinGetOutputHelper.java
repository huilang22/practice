/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsPinGetOutputHelper.java
 * Definition File: Catalog/VoucherDefinitions.xml
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
public class VoucherDefinitionsPinGetOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a VoucherDefinitionsPinGetOutputData object.
   * @param record the map
   * @return VoucherDefinitionsPinGetOutputData the output object.
   */
  public static VoucherDefinitionsPinGetOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherDefinitionsPinGetOutputData out = new VoucherDefinitionsPinGetOutputData ();

    if ((obj = record.get ("PinCode1")) != null)
    {
      out.PinCode1 = (String) obj;
    }
  
    if ((obj = record.get ("PinCode2")) != null)
    {
      out.PinCode2 = (String) obj;
    }
  
    return out;
  }
  /** convert a VoucherDefinitionsPinGetOutputData object to a Map.
   * @param in the object VoucherDefinitionsPinGetOutputData the output object.
   * @return the Map
   */
  public static Map toMap(VoucherDefinitionsPinGetOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getPinCode1()) != null) {

      record.put("PinCode1", obj);
  
    }

    if ((obj = in.getPinCode2()) != null) {

      record.put("PinCode2", obj);
  
    }

    //retVal.put("VoucherDefinitionsPinGetResponse", record);
    //return retVal;
    return record;
  }
}
