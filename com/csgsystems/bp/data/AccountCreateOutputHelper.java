/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCreateOutputHelper.java
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
public class AccountCreateOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a AccountCreateOutputData object.
   * @param record the map
   * @return AccountCreateOutputData the output object.
   */
  public static AccountCreateOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCreateOutputData out = new AccountCreateOutputData ();
    out.acOut = AccountXIDObjectHelper.getObj ((Map) record.get ("Account"));

    if ((obj = record.get ("AccountServerId")) != null)
    {
      out.AccountServerId = (Integer) obj;
    }
  
    return out;
  }
  /** convert a AccountCreateOutputData object to a Map.
   * @param in the object AccountCreateOutputData the output object.
   * @return the Map
   */
  public static Map toMap(AccountCreateOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
AccountXIDObjectData acOut = in.getAccount();
    if (acOut != null) {
      record.put("Account", AccountXIDObjectHelper.toMap(acOut, new HashMap(), "Account").get("Account"));
    }
  
    if ((obj = in.getAccountServerId()) != null) {

      record.put("AccountServerId", obj);
  
    }

    //retVal.put("AccountCreateResponse", record);
    //return retVal;
    return record;
  }
}
