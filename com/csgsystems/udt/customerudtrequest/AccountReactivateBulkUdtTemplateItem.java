/*
 * Generated code DO NOT EDIT
 * Generated file: AccountReactivateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AccountReactivateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountReactivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData araIn;
  protected Integer ractReason;
  protected Date ractDate;
/**
 *
 * Constructor to create a  AccountReactivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountReactivateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData araInIn, Integer ractReasonIn, Date ractDateIn) {
    super(id, context, "AccountReactivate");
    araIn = araInIn;
    ractReason = ractReasonIn;
    ractDate = ractDateIn;
  }

  public void translateToMap() {
    if (araIn != null) {
      araIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(araIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (ractReason != null) {
      addInput("RactReason", ractReason);
    }
    if (ractDate != null) {
      addInput("RactDate", ractDate);
    }
  }


/**
 *
 * Sets the Account
 * @param araInIn Value of the araIn
 *
 */

  public void setAccount(AccountObjectKeyData araInIn) {
    araIn = araInIn;
  }

/**
 *
 * Sets the RactReason
 * @param ractReasonIn Value of the ractReason
 *
 */

  public void setRactReason(Integer ractReasonIn) {
    ractReason = ractReasonIn;
  }

/**
 *
 * Sets the RactDate
 * @param ractDateIn Value of the ractDate
 *
 */

  public void setRactDate(Date ractDateIn) {
    ractDate = ractDateIn;
  }

  public void translateFromMap() {
    araIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
    ractReason = (Integer)inputMap.get("RactReason");
    ractDate = (Date)inputMap.get("RactDate");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return araIn;
  }

/**
 *
 * Gets the RactReason
 * @return Value of the RactReason
 *
 */

  public Integer getRactReason( ) {
    return ractReason;
  }

/**
 *
 * Gets the RactDate
 * @return Value of the RactDate
 *
 */

  public Date getRactDate( ) {
    return ractDate;
  }

}
