/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalanceSummaryOutputHelper.java
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
public class AccountBalanceSummaryOutputHelper implements ArubaObjectHelper
{
  /** convert a Map to a AccountBalanceSummaryOutputData object.
   * @param record the map
   * @return AccountBalanceSummaryOutputData the output object.
   */
  public static AccountBalanceSummaryOutputData fromMap (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBalanceSummaryOutputData out = new AccountBalanceSummaryOutputData ();

    if ((obj = record.get ("SumBalance")) != null)
    {
      out.SumBalance = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PastDueDays1To30")) != null)
    {
      out.PastDueDays1To30 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PastDueDays31To60")) != null)
    {
      out.PastDueDays31To60 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PastDueDays61To90")) != null)
    {
      out.PastDueDays61To90 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PastDueDays91To120")) != null)
    {
      out.PastDueDays91To120 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PastDueDaysGt120")) != null)
    {
      out.PastDueDaysGt120 = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    return out;
  }
  /** convert a AccountBalanceSummaryOutputData object to a Map.
   * @param in the object AccountBalanceSummaryOutputData the output object.
   * @return the Map
   */
  public static Map toMap(AccountBalanceSummaryOutputData in)
  {
    Object[] list = null;
    Object obj = null;
    if (in == null) return null;
    //Map retVal = new HashMap();
    Map record = new HashMap();

    if ((obj = in.getSumBalance()) != null) {

      record.put("SumBalance", obj);
  
    }

    if ((obj = in.getPastDueDays1To30()) != null) {

      record.put("PastDueDays1To30", obj);
  
    }

    if ((obj = in.getPastDueDays31To60()) != null) {

      record.put("PastDueDays31To60", obj);
  
    }

    if ((obj = in.getPastDueDays61To90()) != null) {

      record.put("PastDueDays61To90", obj);
  
    }

    if ((obj = in.getPastDueDays91To120()) != null) {

      record.put("PastDueDays91To120", obj);
  
    }

    if ((obj = in.getPastDueDaysGt120()) != null) {

      record.put("PastDueDaysGt120", obj);
  
    }

    if ((obj = in.getCurrencyCode()) != null) {

      record.put("CurrencyCode", obj);
  
    }

    //retVal.put("AccountBalanceSummaryResponse", record);
    //return retVal;
    return record;
  }
}
