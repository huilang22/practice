/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectFilter ABFindIn;
/**
 *
 * Constructor to create a  AccountBalancesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectFilter ABFindInIn) {
    super(id, context, "AccountBalancesFind");
    ABFindIn = ABFindInIn;
  }

  public void translateToMap() {
    if (ABFindIn != null) {
      Integer index =  ABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABFindIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABFindInIn Value of the ABFindIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectFilter ABFindInIn) {
    ABFindIn = ABFindInIn;
  }

  public void translateFromMap() {
    ABFindIn = AccountBalancesObjectHelper.fromMapFilter(inputMap, "AccountBalances");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectFilter getAccountBalances( ) {
    return ABFindIn;
  }

}
