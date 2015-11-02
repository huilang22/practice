/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData CBPCreateIn1;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn1In) {
    super(id, context, "AccountBonusPointTransactionCreate");
    CBPCreateIn1 = CBPCreateIn1In;
  }

  public void translateToMap() {
    if (CBPCreateIn1 != null) {
      CBPCreateIn1.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(CBPCreateIn1, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param CBPCreateIn1In Value of the CBPCreateIn1
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData CBPCreateIn1In) {
    CBPCreateIn1 = CBPCreateIn1In;
  }

  public void translateFromMap() {
    CBPCreateIn1 = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return CBPCreateIn1;
  }

}
