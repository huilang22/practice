/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionUpdatePointsBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionUpdatePointsBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionUpdatePointsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData CBPCreateIn2;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionUpdatePointsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionUpdatePointsBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData CBPCreateIn2In) {
    super(id, context, "AccountBonusPointTransactionUpdatePoints");
    CBPCreateIn2 = CBPCreateIn2In;
  }

  public void translateToMap() {
    if (CBPCreateIn2 != null) {
      CBPCreateIn2.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(CBPCreateIn2, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param CBPCreateIn2In Value of the CBPCreateIn2
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData CBPCreateIn2In) {
    CBPCreateIn2 = CBPCreateIn2In;
  }

  public void translateFromMap() {
    CBPCreateIn2 = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return CBPCreateIn2;
  }

}
