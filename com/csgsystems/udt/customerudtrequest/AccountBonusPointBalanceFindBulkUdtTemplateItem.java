/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointBalanceFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointBalanceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointBalanceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointBalanceObjectFilter findIn;
/**
 *
 * Constructor to create a  AccountBonusPointBalanceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointBalanceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointBalanceObjectFilter findInIn) {
    super(id, context, "AccountBonusPointBalanceFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(findIn, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }


/**
 *
 * Sets the AccountBonusPointBalance
 * @param findInIn Value of the findIn
 *
 */

  public void setAccountBonusPointBalance(AccountBonusPointBalanceObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = AccountBonusPointBalanceObjectHelper.fromMapFilter(inputMap, "AccountBonusPointBalance");
  }

/**
 *
 * Gets the AccountBonusPointBalance
 * @return Value of the AccountBonusPointBalance
 *
 */

  public AccountBonusPointBalanceObjectFilter getAccountBonusPointBalance( ) {
    return findIn;
  }

}
