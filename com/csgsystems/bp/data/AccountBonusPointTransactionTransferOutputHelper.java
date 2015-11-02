/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionTransferOutputHelper.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
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
public class AccountBonusPointTransactionTransferOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a AccountBonusPointTransactionTransferOutputData object.
   * @param record the map
   * @return AccountBonusPointTransactionTransferOutputData the output object.
   */
  public static AccountBonusPointTransactionTransferOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointTransactionTransferOutputData out = new AccountBonusPointTransactionTransferOutputData ();
    out.Account_BonusPointTransactionTo = AccountBonusPointTransactionObjectHelper.getObj ((Map) record.get ("AccountBonusPointTransactionTo"));
    out.Account_BonusPointTransactionFrom = AccountBonusPointTransactionObjectHelper.getObj ((Map) record.get ("AccountBonusPointTransactionFrom"));

    return out;
  }
  /** convert a AccountBonusPointTransactionTransferOutputData object to a Map.
   * @param in the object AccountBonusPointTransactionTransferOutputData the output object.
   * @return the Map
   */
  public static Map toMap(AccountBonusPointTransactionTransferOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();
AccountBonusPointTransactionObjectData Account_BonusPointTransactionTo = in.getAccountBonusPointTransactionTo();
    if (Account_BonusPointTransactionTo != null) {
      record.put("AccountBonusPointTransactionTo", AccountBonusPointTransactionObjectHelper.toMap(Account_BonusPointTransactionTo, new HashMap(), "AccountBonusPointTransactionTo").get("AccountBonusPointTransactionTo"));
    }
  AccountBonusPointTransactionObjectData Account_BonusPointTransactionFrom = in.getAccountBonusPointTransactionFrom();
    if (Account_BonusPointTransactionFrom != null) {
      record.put("AccountBonusPointTransactionFrom", AccountBonusPointTransactionObjectHelper.toMap(Account_BonusPointTransactionFrom, new HashMap(), "AccountBonusPointTransactionFrom").get("AccountBonusPointTransactionFrom"));
    }
  
    //retVal.put("AccountBonusPointTransactionTransferResponse", record);
    //return retVal;
    return record;
  }
}
