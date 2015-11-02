/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointBalanceGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointBalanceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointBalanceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointBalanceObjectKeyData getIn;
/**
 *
 * Constructor to create a  AccountBonusPointBalanceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointBalanceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointBalanceObjectKeyData getInIn) {
    super(id, context, "AccountBonusPointBalanceGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectKeyHelper.toMap(getIn, new HashMap(), "AccountBonusPointBalanceObjectKeyData").get("AccountBonusPointBalanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountBonusPointBalance
 * @param getInIn Value of the getIn
 *
 */

  public void setAccountBonusPointBalance(AccountBonusPointBalanceObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = AccountBonusPointBalanceObjectKeyHelper.fromMap(inputMap, "AccountBonusPointBalance");
  }

/**
 *
 * Gets the AccountBonusPointBalance
 * @return Value of the AccountBonusPointBalance
 *
 */

  public AccountBonusPointBalanceObjectKeyData getAccountBonusPointBalance( ) {
    return getIn;
  }

}
