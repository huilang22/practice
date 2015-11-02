/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionTransferOutputData.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**---------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.data;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

/** class to support methods which have more than one output field. */
@XmlRootElement(namespace ="http://.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountBonusPointTransactionTransferOutputData implements ArubaObjectData, Serializable
{
  /** Account_BonusPointTransactionTo object */
  public AccountBonusPointTransactionObjectData Account_BonusPointTransactionTo = null;

  /** Account_BonusPointTransactionFrom object */
  public AccountBonusPointTransactionObjectData Account_BonusPointTransactionFrom = null;

  private String _objName = "AccountBonusPointTransactionTransferOutputData";
  /** default constructor */
  public AccountBonusPointTransactionTransferOutputData ()
  {
  }
  /** copy constructor
   * @param other the object to copy.
   */
  public AccountBonusPointTransactionTransferOutputData (AccountBonusPointTransactionTransferOutputData other)
  {
    if (other == null) return;
    if (other.Account_BonusPointTransactionTo != null)
    {
      this.Account_BonusPointTransactionTo = new AccountBonusPointTransactionObjectData (other.Account_BonusPointTransactionTo);
    }

    if (other.Account_BonusPointTransactionFrom != null)
    {
      this.Account_BonusPointTransactionFrom = new AccountBonusPointTransactionObjectData (other.Account_BonusPointTransactionFrom);
    }

  }
  /** get the object for AccountBonusPointTransactionObject
   * @return AccountBonusPointTransactionToData the object
   */
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionTo ()
  {
    return this.Account_BonusPointTransactionTo;
  }
  /** set the object for AccountBonusPointTransactionTo
   * @param value the new object
   */
  public void setAccountBonusPointTransactionTo (AccountBonusPointTransactionObjectData value)
  {
    this.Account_BonusPointTransactionTo = value;
  }
  /** get the object for AccountBonusPointTransactionObject
   * @return AccountBonusPointTransactionFromData the object
   */
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionFrom ()
  {
    return this.Account_BonusPointTransactionFrom;
  }
  /** set the object for AccountBonusPointTransactionFrom
   * @param value the new object
   */
  public void setAccountBonusPointTransactionFrom (AccountBonusPointTransactionObjectData value)
  {
    this.Account_BonusPointTransactionFrom = value;
  }
  /*
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** Account_BonusPointTransactionTo object */
  
      if (Account_BonusPointTransactionTo != null) Account_BonusPointTransactionTo.resetFlags(flag, nonNullOnly);
    
  /** Account_BonusPointTransactionFrom object */
  
      if (Account_BonusPointTransactionFrom != null) Account_BonusPointTransactionFrom.resetFlags(flag, nonNullOnly);
    
  }
}
