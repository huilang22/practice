/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupOutputHelper.java
 * Definition File: Admin/Csr.xml
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
public class CsrGroupOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a CsrGroupOutputData object.
   * @param record the map
   * @return CsrGroupOutputData the output object.
   */
  public static CsrGroupOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupOutputData out = new CsrGroupOutputData ();

    if ((obj = record.get ("UserGroupList")) != null)
    {
      Object[] olist = (Object[]) obj;
      out.UserGroup = new String[olist.length];
      for (int i = 0; i < olist.length; i++) out.UserGroup[i] = (String) olist[i];
    }
  
    if ((obj = record.get ("UserName")) != null)
    {
      out.UserName = (String) obj;
    }
  
    return out;
  }
  /** convert a CsrGroupOutputData object to a Map.
   * @param in the object CsrGroupOutputData the output object.
   * @return the Map
   */
  public static Map toMap(CsrGroupOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getUserGroup()) != null) {
      
        list = (Object[]) obj;
        record.put("UserGroupList", list);
  
    }

    if ((obj = in.getUserName()) != null) {

      record.put("UserName", obj);
  
    }

    //retVal.put("CsrGroupResponse", record);
    //return retVal;
    return record;
  }
}
