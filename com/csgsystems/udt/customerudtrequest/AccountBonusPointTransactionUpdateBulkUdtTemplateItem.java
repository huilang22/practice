/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData CBPUpdateIn1;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPUpdateIn1In) {
    super(id, context, "AccountBonusPointTransactionUpdate");
    CBPUpdateIn1 = CBPUpdateIn1In;
  }

  public void translateToMap() {
    if (CBPUpdateIn1 != null) {
      CBPUpdateIn1.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(CBPUpdateIn1, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param CBPUpdateIn1In Value of the CBPUpdateIn1
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData CBPUpdateIn1In) {
    CBPUpdateIn1 = CBPUpdateIn1In;
  }

  public void translateFromMap() {
    CBPUpdateIn1 = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return CBPUpdateIn1;
  }

}
