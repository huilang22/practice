/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalanceSummaryBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalanceSummaryBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalanceSummaryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData agbsIn;
/**
 *
 * Constructor to create a  AccountBalanceSummaryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalanceSummaryBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData agbsInIn) {
    super(id, context, "AccountBalanceSummary");
    agbsIn = agbsInIn;
  }

  public void translateToMap() {
    if (agbsIn != null) {
      agbsIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(agbsIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }


/**
 *
 * Sets the Account
 * @param agbsInIn Value of the agbsIn
 *
 */

  public void setAccount(AccountObjectKeyData agbsInIn) {
    agbsIn = agbsInIn;
  }

  public void translateFromMap() {
    agbsIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return agbsIn;
  }

}
