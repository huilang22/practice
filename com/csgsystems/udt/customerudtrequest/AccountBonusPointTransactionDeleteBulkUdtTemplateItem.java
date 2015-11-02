/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectKeyData CBPDelIn1;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData CBPDelIn1In) {
    super(id, context, "AccountBonusPointTransactionDelete");
    CBPDelIn1 = CBPDelIn1In;
  }

  public void translateToMap() {
    if (CBPDelIn1 != null) {
      CBPDelIn1.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(CBPDelIn1, new HashMap(), "AccountBonusPointTransactionObjectKeyData").get("AccountBonusPointTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param CBPDelIn1In Value of the CBPDelIn1
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectKeyData CBPDelIn1In) {
    CBPDelIn1 = CBPDelIn1In;
  }

  public void translateFromMap() {
    CBPDelIn1 = AccountBonusPointTransactionObjectKeyHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectKeyData getAccountBonusPointTransaction( ) {
    return CBPDelIn1;
  }

}
